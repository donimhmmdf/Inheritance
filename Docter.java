public class Docter extends Person {
    String specialist;

    public Docter(){

    }
    public Docter(String name, String address, String specialist){
        super(name, address);
        this.specialist = specialist;
    }

    void surgery(){
        System.out.println("I can surgery operation patients ");
    }
    void greeting(){
        System.out.println("Hello my name is " + name +".");
        System.out.println("I, come from " + address + ".");
        System.out.println("My occupation is a " + specialist + " doctor.");
    }
}
