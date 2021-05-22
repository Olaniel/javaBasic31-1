package by.epam.unit03.main;

public class Task01 {

    public static void main(String[] args) {
        //Задача 1
        //Необходимо вывести на экран таблицу умножения на 3.
        int x;
        int creation;

        x = 0;

        System.out.println("-----------------");
        for (int i = x; i < 11; i++){
            creation = 3 * i;
            System.out.println("|\t" + "3 " + "* " + x + " = " + creation + "\t|");
            x++;
        }
        System.out.println("-----------------");
    }
}
