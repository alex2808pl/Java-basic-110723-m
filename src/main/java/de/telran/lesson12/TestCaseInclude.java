package de.telran.lesson12;

public class TestCaseInclude {
    public static void main(String[] args) {
        int age = 40;
        String meal = "vegan";

        switch (age) {
            case 10 :
                System.out.println("Нужно больше есть, мы растем!");
                break;
            case 20:
                System.out.println("Все еще не следим за питанием!");
                break;
            case 40:
                System.out.println("Нужно следить за питанием");
                switch (meal) {
                    case "vegan" : // if(age == 40 && meal.equal("vegan"))
                        System.out.println("Ешь побольше овощей");
                        break;
                    case "vegetarian" :
                        System.out.println("Ешь овощи, рыбу и молочные продукты");
                        break;
                    default:
                        System.out.println("Не ешьте много жирной пищи!");
                }
                break; //switch (age)
            default:
                System.out.println("Данный возраст не поддается анализу");
        }
    }
}
