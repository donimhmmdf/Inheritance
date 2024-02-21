
/*
 * 
 * Name : Doni Muhammad
 */
public class MainApp {
    public static void main(String[] args) {
        // Person person1 = new Person();
        // person1.name = "Hendra";
        // person1.address = "Garut";

        // Teacher teacher1 = new Teacher();
        // teacher1.name = "Budi";
        // teacher1.address = "Bandung";
        // teacher1.subject = "Matematika";

        Docter docter1 = new Docter();
        docter1.name = "Elis";
        docter1.address = "Jakarta";
        docter1.specialist = "Dentis";

        Docter docter2 = new Docter("Sandi", "Bandung", "Cardiologist");

        docter1.greeting();
        System.out.println();
        docter2.greeting();

        // Programmer programmer1 = new Programmer();
        // programmer1.name = "Rizki";
        // programmer1.address = "Surabaya";
        // programmer1.technology = "Javascript";

        // person1.greeting();
        // System.out.println();
        // teacher1.greeting();
        // System.out.println();
        // docter1.greeting();
        // System.out.println();
        // programmer1.greeting();
    }
}