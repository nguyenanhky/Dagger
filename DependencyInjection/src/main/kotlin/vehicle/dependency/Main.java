package vehicle.dependency;

public class Main {
    public static void main(String[] args) {
        Horn horn = new Horn(25);
        Car car = new Car(horn);
        car.Beep();
    }
}
