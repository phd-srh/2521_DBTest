import java.util.List;

public class SQLDAO implements DAO {

    private static final String SQL_DRIVER   = "org.mariadb.jdbc.Driver";
    private static final String SQL_SERVER   = "127.0.0.1";
    private static final String SQL_PORT     = "3306";
    private static final String SQL_DATABASE = "dbtest";
    private static final String SQL_USER     = "dbtestadm";
    private static final String SQL_PASSWORD = "geheim123";


    public SQLDAO() {
        try {
            Class.forName(SQL_DRIVER);
        }
        catch (ClassNotFoundException e) {
            System.out.println("MariaDB SQL Connector ist nicht installiert.");
            System.out.println( e.getMessage() );
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Yeah, es hat wohl geklappt");
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
    public List<String> getAll() {
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
