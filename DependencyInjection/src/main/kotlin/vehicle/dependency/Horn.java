package vehicle.dependency;

public class Horn   {
    int level; // them do lon cua coi xe

    public Horn(int level) {
        this.level = level;
    }

    public void Beep (){
        System.out.println("Beep - beep - beep ...");
    }
}
