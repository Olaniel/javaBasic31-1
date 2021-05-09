package by.epam.unit02.main;

public class Task05 {

    public static void main(String[] args) {

        double x = 60;
        double y = 30;
        double sixty, thirty, answer;

        sixty = Math.toRadians(x);
        thirty = Math.toRadians(y);


        answer = (Math.sin(sixty) + Math.cos(thirty)) / (Math.cos(sixty) - Math.sin(thirty)) *
                Math.tan(sixty * thirty);

        System.out.println("Ответ = " + answer);

    }

}

