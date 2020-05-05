package com.company;

public class myThread extends Thread {
    private StorageForValue storage;
    public myThread(StorageForValue storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; ++i) {
            this.storage.value += 1;
        }
    }
}
