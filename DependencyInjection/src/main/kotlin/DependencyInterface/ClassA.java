package DependencyInterface;

public class ClassA {
    IClassB b_dependency;

    public ClassA(IClassB b_dependency) {
        this.b_dependency = b_dependency;
    }
    public void ActionA(){
        System.out.println("Action in classA");
        b_dependency.ActionB();
    }
}
