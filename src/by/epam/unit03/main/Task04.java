package by.epam.unit03.main;

public class Task04 {

    public static void main(String[] args) {

        double y;

        System.out.println("-------------------------");
        System.out.printf("|\t%4s\t|\t%4s\t|\n","x","y");
        System.out.println("-------------------------");

        for(double x = -5; x <= 5; x = x + 0.5) {
            y = 5 - (Math.pow(x, 2) / 2);

            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n",x,y);

        }

        System.out.println("-------------------------");
    }
}
