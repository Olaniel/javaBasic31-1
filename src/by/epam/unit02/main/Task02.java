package by.epam.unit02.main;

public class Task02 {

    public static void main(String[] args) {
//        Задача 2
//        Перераспределить значения переменных х и у так, чтобы в х оказалось
//        большее из этих значений, а в y - меньшее

        int x, y;
        //Диапозон (-200, 0)
        x = (int) (Math.random()*(200+1)) - 200;
        //Диапозон (0, 200)
        y = (int) (Math.random()*(200+1)) ;
        System.out.println("x= " + x + " < " + "y= " + y);

        System.out.println("x= " + Math.max(x, y) + " > " + "y= " + Math.min(x, y));
    }
}
