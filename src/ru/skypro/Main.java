package ru.skypro;

public class Main {

    public static void main(String[] args) {

        short requiredWeight = 7000;

        int firstPlan = requiredWeight / 250;
        int secondPlan = requiredWeight / 500;
        int averageDay = (firstPlan + secondPlan)/2;

        System.out.println(firstPlan+ " дней уйдет на похудение если тратить по 250 грамм");
        System.out.println(secondPlan+ " дней уйдет на похудение если тратить по 500 грамм");
        System.out.println(averageDay+ " день уйдет на похудение в среднем");


    }
}
