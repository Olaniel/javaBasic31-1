package by.epam.unit02.main;

public class Task04 {

    public static void main(String[] args) {
//        Задача 4
//        Вычислить расстояние между двумя точками с данными координатами
//        (х1, у1) и (x2, у2).

        // точка А(х=6,у=4)
        double x1 = 6;
        double y1 = 4;
        // точка B(х=4,у=2)
        double x2 = 4;
        double y2 = 2;

        double AB;

        // AB = √((x1 - x2)2 + (y1 - y2)2)

        AB = Math.sqrt( Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        System.out.println("Расстояние между двумя точками = " + AB);

    }

}
