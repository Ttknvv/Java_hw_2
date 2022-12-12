import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Arrays;
import java.util.logging.*;

public class hw2_2 {
    public static void main(String[] args) throws IOException {
        Integer mass[] = {3,2,2,3,3,1,3,3,2};
        Integer temp = 0;
        Boolean usl = false;

        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(hw2_2.class.getName());
        FileHandler getMass = new FileHandler("log.txt");
        logger.addHandler(getMass);


        while (!usl) {
            usl = true;
            for (int j = 0; j < mass.length - 1; j++) {
                if (mass[j] < mass[j + 1]) {
                    usl = false;

                    temp = mass[j + 1];
                    mass[j + 1] = mass[j];
                    mass[j] = temp;
                }
                logger.info(Arrays.toString(mass));
            }
        }


    }
}
