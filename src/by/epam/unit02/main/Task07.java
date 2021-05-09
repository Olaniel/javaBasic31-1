package by.epam.unit02.main;

public class Task07 {

    public static void main(String[] args) {

        double x, y, z ,xPow, yPow, zPow;
        //Диапозон (-5, 5)
        x = (int) (Math.random()*(10+1)) - 5 ;
        y = (int) (Math.random()*(10+1)) - 5 ;
        z = (int) (Math.random()*(10+1)) - 5 ;

        if (x >= 0) {
            xPow = Math.pow(x, 2);
        } else {
            xPow = Math.pow(x, 4);
        }

        if (y >= 0) {
            yPow = Math.pow(y, 2);
        } else {
            yPow = Math.pow(y, 4);
        }

        if (z >= 0) {
            zPow = Math.pow(z, 2);
        } else {
            zPow = Math.pow(z, 4);
        }
        System.out.println("X=" + x + "; X в степени =" + xPow + "\n" +
                "Y=" + y + "; Y в степени =" + yPow + "\n" +
                "Z=" + z + "; Z в степени =" + zPow);

    }

}
