package adaptor;

public class BankAccountStat {
    private BankServiceAdaptor service;

    public void processData() {
        String data = "some data";

        service.saveData(data);

    }
}
