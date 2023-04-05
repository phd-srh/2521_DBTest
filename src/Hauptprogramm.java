import java.util.Scanner;

public class Hauptprogramm {
    private static Scanner eingabe = new Scanner(System.in);
    private static DAO db = new TempDAO();


    private static int erfrageID() {
        System.out.print("Bitte ID eingeben: ");
        return eingabe.nextInt();
    }

    private static String erfrageText() {
        System.out.print("Bitte Text eingeben: ");
        return eingabe.next() + eingabe.nextLine();
    }


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
            int id;
            String text;
            switch (auswahl) {
                case 1:
                    id = erfrageID();
                    text = erfrageText();
                    if (db.insertText(id, text))
                        System.out.println("Datensatz erfolgreich gespeichert");
                    else
                        System.out.println("Fehler beim Speichern");
                    break;
                case 2:
                    id = erfrageID();
                    text = db.getText(id);
                    if (text != null)
                        System.out.println("Datensatz: " + text);
                    else
                        System.out.println("Datensatz nicht gefunden");
                    break;
                case 3:
                    for (String item : db.getAll()) {
                        System.out.println("Datensatz: " + item);
                    }
                    break;
                case 4:
                    id = erfrageID();
                    if (db.getText(id) != null) {
                        text = erfrageText();
                        if ( db.updateText(id, text) )
                            System.out.println("Datensatz wurde geändert");
                        else
                            System.out.println("Fehler beim Ändern");
                    }
                    else
                        System.out.println("Datensatz existiert nicht");
                    break;
                case 5:
                    id = erfrageID();
                    if (db.getText(id) != null) {
                        System.out.print("Wirklich löschen (J/N): ");
                        if ( eingabe.next().toUpperCase().charAt(0) == 'J')
                            db.deleteText(id);
                    }
                    break;
                case 6:
                    System.out.println("Vielen Dank und auf Wiedersehen!");
                    break Hauptschleife;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
            System.out.println();
        }
    }
}
