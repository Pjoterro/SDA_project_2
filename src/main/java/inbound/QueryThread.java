package inbound;

import DTO.ISSData;
import core.DataStorage;

import java.time.LocalTime;
import java.util.Optional;

public class QueryThread extends Thread {

    private DataStorage dataStorage;

    public QueryThread(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    @Override
    public synchronized void start() {
        System.out.println(getName() + " has started at " + LocalTime.now());
    }

    @Override
    public void run() {
        while (true) {
            Optional<ISSData> issData = DataProvider.getISSData();
            issData.ifPresentOrElse(data -> dataStorage.update(data), () -> System.out.println("No ISS data retrieved"));
            try {
                Thread.sleep(30_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
