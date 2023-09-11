package de.telran.lesson16.innerclass;

public class Bicycle {
    private int countWheel = 2;
    public String color;

    void run() {
        System.out.println(color + " велосипед поехал на "+countWheel+" колесах");
        Seat seat = new Seat();
        System.out.println(seat.high);
    }
    public class Seat {
        private int high = 1;
        public String color = "Белое";

        void up() {
            System.out.println(color+ " седло поднимаем на высоту "+high);
            System.out.println("наш велосипед имеет колес -> "+countWheel);
        }
    }
}
