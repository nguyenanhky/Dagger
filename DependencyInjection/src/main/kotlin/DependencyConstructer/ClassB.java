package DependencyConstructer;

public class ClassB {
    ClassC c_dependency;

    public ClassB(ClassC c_dependency) {
        this.c_dependency = c_dependency;
    }
    public void ActionB(){
        System.out.println("Action in ClassB");
        c_dependency.ActionC();
    }

}
