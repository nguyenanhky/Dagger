package DependencyInterface;

public class ClassB  implements IClassB{
    IClassC c_dependency;

    public ClassB(IClassC c_dependency) {
        this.c_dependency = c_dependency;
    }

    @Override
    public void ActionB() {
        System.out.println("Action in classB");
        c_dependency.ActionC();
    }
}
