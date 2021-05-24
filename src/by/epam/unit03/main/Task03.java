package by.epam.unit03.main;

public class Task03 {

    public static void main(String[] args) {
        //Задача 3
        //Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

        int x;
        int sum;
        long creation;

        x = 1;
        sum = 1;
        creation = 1;

        for(int i = 1; i <= 9; i++) {
            x++;
            sum += + x;
            creation *= sum;
        }

        System.out.println("Ответ = " + creation);


    }
}