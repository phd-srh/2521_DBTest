public class Main {
    public static void main(String[] args) {
        DAO db = new TempDAO();
        showDB(db);

        db.deleteText(3);
        db.insertText(99, "Roman");
        showDB(db);

        System.out.println( db.getText(99) );

        db.updateText(99, "Computermagazin");
        showDB(db);
    }

    private static void showDB(DAO db) {
        for (String text : db.getAll()) {
            System.out.println(text);
        }
        System.out.println("--------------------");
    }
}
