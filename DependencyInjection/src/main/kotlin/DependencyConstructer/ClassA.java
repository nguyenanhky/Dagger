package DependencyConstructer;

public class ClassA {
    ClassB b_dependency;

    public ClassA(ClassB b_dependency) {
        this.b_dependency = b_dependency;
    }

    public void ActionA(){
        System.out.println("Action in ClassA");
        b_dependency.ActionB();
    }
}
