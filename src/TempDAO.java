import java.util.ArrayList;

public class TempDAO implements DAO {
    // interner Speicher
    private ArrayList<Table> tableList;

    public TempDAO() {
        tableList = new ArrayList<>();
    }

    @Override
    public boolean insertText(int id, String text) {
        return false;
    }

    @Override
    public String getText(int id) {
        return null;
    }

    @Override
    public boolean updateText(int id, String text) {
        return false;
    }

    @Override
    public void deleteText(int id) {

    }

    @Override
    public int getLastID() {
        return 0;
    }
}
