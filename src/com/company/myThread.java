package com.company;

public class myThread extends Thread {
    private final StorageForValue storage;
    public myThread(StorageForValue storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {

                this.storage.value += 1;
                System.out.println("[myThread] value = " + storage.value);

        }
    }
}
