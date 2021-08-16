package adaptor;

import singleton.BankAccountService;

public class BankServiceAdaptor {
    BankAccountService service;

    public void saveData(String data) {
        service.createData(data);
    }
}
