import java.util.HashMap;
import java.util.Map;

public class hw2_1 {
    public static void main(String[] args) {
        String sqlReqString = "select * from students where ";
        StringBuilder allReq = new StringBuilder(sqlReqString);
        String jsoString =  "\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"";
        
        String[] words = jsoString.trim().split(",");
        Map <String, String> json = new HashMap<String, String>();

        for (int i = 0; i < words.length; i++) {
            String tr =words[i].replaceAll("\"", "");
            String[] kd = tr.split(":");
            json.put(kd[0], kd[1]);
        }

        StringBuilder req = new StringBuilder();

        for (Map.Entry<String, String> entry : json.entrySet()) {
            if (entry.getValue().equals("null")) {
                break;
            }
            else{
                req.append(entry.getKey() + " = " + entry.getValue() + " AND");
            }
        }

        allReq.append(req);
        allReq.delete(allReq.length()-4, allReq.length());
        System.err.println(allReq.toString());
    }
}