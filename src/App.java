public class App {

    abstract static class Car{
        protected String brand;
        protected String model;
        protected short year;
        protected float clock = 12.00f;
        protected byte day = 2;
        protected byte month = 9;
        protected short yearNow = 2026;
        Car(String brand, String model, short year){
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
        abstract void displayCarInforamtion(String brand, String model, short year, float cloack, byte day, byte month,short yearNow);
    }
    static class SportsCar extends Car{
        private short maxSpeed;
        SportsCar(String brand, String model, short year, short maxSpeed){
            super(brand, model, year);
            this.maxSpeed = maxSpeed;
        }
        void showMaxSpeed(){
            System.out.println(maxSpeed);
        }
        @Override
        void displayCarInforamtion(String brand, String model, short year, float cloack, byte day, byte month,short yearNow){
            System.out.print("Brand: " + brand);
            System.out.print(" Model: " + model);
            System.out.print(" Year: " + year);
            System.out.println("Max Speed: " + maxSpeed);
            System.out.print("Clock: " + cloack);
            System.out.print(" - Day: " + day);
            System.out.print(" - Month: " + month);
            System.out.println(" - YearNow: " + yearNow);
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
        void displayCarInforamtion(String brand, String model, short year, float cloack, byte day, byte month,short yearNow){
            System.out.print("Brand: " + brand);
            System.out.print(" Model: " + model);
            System.out.print(" Year: " + year);
            System.out.println("load capacity: " + loadCapacity);
            System.out.print("Clock: " + cloack);
            System.out.print(" - Day: " + day);
            System.out.print(" - Month: " + month);
            System.out.println(" - YearNow: " + yearNow);
        }
    }
    public static void main(String[] args) throws Exception {
        
    }
}
