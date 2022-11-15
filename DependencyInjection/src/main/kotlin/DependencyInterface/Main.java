package DependencyInterface;

public class Main {
    public static void main(String[] args) {
        IClassC iClassC = new ClassC();
        IClassB iClassB = new ClassB(iClassC);
        ClassA  classA = new ClassA(iClassB);
        classA.ActionA();
    }
}
