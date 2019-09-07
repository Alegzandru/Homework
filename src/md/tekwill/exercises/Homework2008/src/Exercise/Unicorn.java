package Exercise;

public class Unicorn {
    public final static String typeOfAnimal = "Mythical";
    private String color;
    private String name;
    private int ageInYears;


    //getter 0 method parameters 1 return
    //access modifier \ non-access modifier; return type ; method name ; method parameters
    public String getName(){
        //return statement
        return name;
    }


    //setter 1 method parameters 0 returns
    public void setName (String name){
        this.name=name; //this allows you to refer to current instance
        if(name.equals("lalala"))
            return;// it is allowed to insert a return statement to void
        this.name+="aleoha";
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public int getAgeInYears(){
        return ageInYears;
    }
    public void setAgeInYears(int ageInYears){
        this.ageInYears=ageInYears;
    }
    public void fly(){
        System.out.println(name+"is flying...");
    }
    public void run(){
        System.out.println(name+"is running...");
    }
    public void executeSuperpower (String superpower){
        System.out.println(name+"is executing "+"<"+superpower+">");
    }
    public void executeSuperpower (String superpower, int numberOfTimes){
        for (int i=0; i<numberOfTimes; i++){
            executeSuperpower(superpower);
        }
    }
    {
        System.out.println("An unicorn is being born ");//initializer block are executed first, in the order that they're written
    }





}
