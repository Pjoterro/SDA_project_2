import core.DataStorage;
import inbound.QueryThread;

public class Main {

    public static void main(String[] args) {
        System.out.println("Test");

        DataStorage dataStorage = new DataStorage();
        QueryThread queryThread = new QueryThread(dataStorage);
        queryThread.setDaemon(true);
        queryThread.start();
    }
}
