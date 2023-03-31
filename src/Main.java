public class Main {
    public static void main(String[] args) {
        DAO db = new TempDAO();

        for (String text : db.getAll()) {
            System.out.println(text);
        }

    }
}
