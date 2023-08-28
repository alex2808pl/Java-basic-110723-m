package de.telran.lesson6;

public class Auto {
    int maxSpeed;
    String name;
    int yearIssue;

    public Auto() {
    }

    public Auto(String nameArg) {
        name = nameArg;
    }

    public Auto(String nameArg, int maxSpeedArg) {
        name = nameArg;
        maxSpeed = maxSpeedArg;
    }

    public Auto(String nameArg, int maxSpeedArg, int yearIssueArg ) {
        name = nameArg;
        maxSpeed = maxSpeedArg;
        yearIssue = yearIssueArg;
    }


    void run() {
        System.out.println("Машина едет "+name+" c max скоростью "+maxSpeed
                +". Год выпуска - "+yearIssue);
    }
}
