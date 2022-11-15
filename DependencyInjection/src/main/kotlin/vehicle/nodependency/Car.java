package vehicle.nodependency;

public class Car {
    public void Beep(){
        // chức năng Beep xây dựng cố định với Horn
        // Tự tạo đối tượng horn (new) và dùng nó
        //Horn horn = new Horn();
        Horn horn = new Horn(10);
        horn.Beep();
    }
}
