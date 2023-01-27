public class PIP07 {
    public static void main(String[] args) {

        // Zadanie 1
        System.out.println("Zadanie 1");

        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Kinga Grunberg";

        System.out.println("Imie student1: " + student1.name + "\nImie student2: " + student2.name);

        student1.numerStudenta = 27382;

        System.out.println("Numer student1: " + student1.numerStudenta + "\nNumer studenta2: " + student2.numerStudenta);

        // Zadanie 2
        System.out.println("Zadanie 2");

        SecretStudent name1 = new SecretStudent();
        name1.getName1();

        System.out.println("Dane sekretnego studenta: " + name1.getName1() + " " + name1.getSurname() + " " + name1.getNumerStudenta());

        // Zadanie 3
        System.out.println("Zadanie 3");

        SecretStudent student3 = new SecretStudent();
        student3.setName1("Mateusz");
        student3.setSurname("Morawiecki");
        student3.setNumerStudenta(32812);

        System.out.println("Dane sekretnego studenta: " + student3.getName1() + " " + student3.getSurname() + " " + student3.getNumerStudenta());

        // Zadanie 4
        System.out.println("Zadanie 4");

        SecretStudent student4 = new SecretStudent();
        student4.readFromScanner();








    }

}
