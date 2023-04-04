import java.util.Scanner;

public class Hauptprogramm {
    private static Scanner eingabe = new Scanner(System.in);

    public static void main(String[] args) {
        Hauptschleife:
        while (true) {
            System.out.println("Hauptmenu");
            System.out.println("---------");
            System.out.println("1 - Neuen Datensatz einfügen");
            System.out.println("2 - Datensatz anzeigen");
            System.out.println("3 - Alle Datensätze anzeigen");
            System.out.println("4 - Datensatz ändern");
            System.out.println("5 - Datensatz löschen");
            System.out.println("6 - Programm beenden");

            System.out.print("Ihre Auswahl: ");
            int auswahl = eingabe.nextInt();
            switch (auswahl) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Sorry, noch nicht implementiert!");
                    break;
                case 6:
                    break Hauptschleife;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }
    }
}
