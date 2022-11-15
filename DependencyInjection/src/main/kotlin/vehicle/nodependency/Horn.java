package vehicle.nodependency;

public class Horn {
    int level;// độ lơn của còi xe

    public Horn(int level) {
        this.level = level;
    }

    public Horn() {
    }

    public void Beep(){
        System.out.println("Beep - beep - beep ...");
    }
}
