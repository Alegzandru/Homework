package md.tekwill.exercises.inputoutput;

public abstract class Parent {
    public static void main(String[] args) {
        Subclass1 ok = new Subclass1();

        ok.message();
        System.out.println("\n");
        Subclass2 ok2 = new Subclass2();
        ok2.message();
    }
    public void   message(){
        System.out.println("This is first parent");

    }
}
class Subclass1 extends Parent {
    public void message() {
        System.out.println("This is first subclass");
        }
    }

    class Subclass2 extends Parent {
//        public void message() {
//            System.out.println("This is second subclass");
//            Subclass2 b= new Subclass2();
//        }

    }