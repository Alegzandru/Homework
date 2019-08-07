package md.tekwill.exercises.inputoutput;

public abstract class Parent {
    public void message(){
    }
}
class Subclass1 extends Parent {
    public void message() {
        System.out.println("This is first subclass");
        Subclass1 a = new Subclass1();
        super.message();
        }
    }

    class Subclass2 extends Parent {
        public void message() {
            System.out.println("This is second subclass");
            Subclass2 b= new Subclass2();
        }

    }