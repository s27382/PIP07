import java.util.Scanner;

public class SecretStudent {
    private String name1 = "Jan";
    private String surname = "Kowalski";
    private int numerStudenta = 12345;

    public String getName1() {
        return name1;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumerStudenta() {
        return numerStudenta;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumerStudenta(int numerStudenta) {
        this.numerStudenta = numerStudenta;
    }

    public static void readFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String name2 = scanner.nextLine();
        System.out.println("Podaj naziwsko:");
        String surname1 = scanner.nextLine();
        System.out.println("Podaj numer studenta: ");
        int numerStudenta1 = scanner.nextInt();

        print(name2, surname1, numerStudenta1);

    }

    public static void print(String name2, String surname1, int numerStudenta1){
        System.out.println("Dane studenta: " + name2 + " " + surname1 + " " + numerStudenta1 );
    }
}
