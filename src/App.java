public class App {

    abstract static class Car{
        protected String brand;
        protected String model;
        protected int year;
        protected float clock = 12.00f;
        protected int day = 2;
        protected int month = 9;
        protected int yearNow = 2026;
        Car(String brand, String model, int year){
            this.brand = brand;
            this.model = model;
            this.year = year;
        }
        void startCar(String brand, String model){
            System.out.println("car is starting: "+ brand + " " + model);
        }
        void stopCar(String brand, String model){
            System.out.println("car is Stoping: "+ brand + " " + model);
        }
        abstract void displayCarInforamtion();
    }
    static class SportsCar extends Car{
        private int maxSpeed;
        SportsCar(String brand, String model, int year, int maxSpeed){
            super(brand, model, year);
            this.maxSpeed = maxSpeed;
        }
        void showMaxSpeed(){
            System.out.println(maxSpeed);
        }
        @Override
        void displayCarInforamtion(){
            System.out.print("-car: " + brand + " " + model + " " + year);
            System.out.println(" Max Speed: " + maxSpeed);
            System.out.print(" \nClock: " + clock);
            System.out.print(" - Day: " + day + " - " + month + " - " + yearNow);
        }
    }

    static class Truck extends Car{
        private int loadCapacity;
        Truck(String brand, String model, short year, int loadCapacity){
            super(brand, model, year);
            this.loadCapacity = loadCapacity;
        }
        void showLoadCapacity(){
            System.out.println(loadCapacity);
        }
        @Override
        void displayCarInforamtion(){
            System.out.print("-car: " + brand + " " + model + " " + year);
            System.out.println(" load capacity: " + loadCapacity);
            System.out.print(" - Clock: " + clock);
            System.out.print(" - Day: " + day + " - " + month + " - " + yearNow);
        }
    }
    public static void main(String[] args) throws Exception {
        Car sc1 = new SportsCar("Alfa Romeo", " Gulia", 2020, 260);
        sc1.displayCarInforamtion();
    }
}
