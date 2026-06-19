public class App {

    static class Car{
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
        void displayCarInforamtion(String brand, String model, short year, float cloack, byte day, byte month, short yearNow){
            System.out.println("car: "+ brand + " " + model + " "+ year + "\n time now: "+ cloack + " / day: "+ day + "-" + month + "-" + yearNow);
        }
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
