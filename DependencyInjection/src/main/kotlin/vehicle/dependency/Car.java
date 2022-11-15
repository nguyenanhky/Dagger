package vehicle.dependency;

public class Car {
    // horn là một Dependecy của Car
    Horn horn;

    public Car(Horn horn) {
        this.horn = horn;
    }

    public void Beep () {
        // Sử dụng Dependecy đã được Inject
        horn.Beep ();
    }
}
