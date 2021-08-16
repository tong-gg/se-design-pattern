package singleton;

import java.net.HttpURLConnection;
import java.sql.Connection;

public class BankAccountService {

    private static BankAccountService instance;

    private HttpURLConnection httpConnection;
    private Connection dbConnection;

    private BankAccountService() {
//    httpConnection = new HttpURLConnection();
//    dbConnection = new Connection();
    }

    public static final BankAccountService getInstance() {
        if (instance == null){
            instance = new BankAccountService();
        }
        return instance;
    }
    public void createData(String data) {
        // insert into database
    }
}
