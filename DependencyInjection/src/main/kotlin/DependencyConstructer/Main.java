package DependencyConstructer;

public class Main {
    public static void main(String[] args) {
        ClassC classC =new ClassC();
        ClassB classB = new ClassB(classC);
        ClassA classA = new ClassA(classB);
        classA.ActionA();
    }
}
