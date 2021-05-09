package by.epam.unit02.main;


public class Task06 {

    public static void main(String[] args) {
//        Задача 6
//        Даны натуральные числа М и N. Вывести старшую цифру дробной части и
//        младшую цифру целой части числа M/N.

        int M,N;
        double result, LowestDigit, MostDigit;

        M = (int) (Math.random()*(50000+1)) ;
        N = (int) (Math.random()*(100+1)) ;

        result = (double)M/N;

        LowestDigit = (int)(result % 10);
        MostDigit = (int)((result*10)%10);


        System.out.println("M/N= "+ result);
        System.out.println("Младшая цифра целой части: " + LowestDigit);
        System.out.println("Старшая цифра дробной части: "+ MostDigit);


    }

}
