package com.company;

public class myThread2 extends Thread{
    private StorageForValue storage;
    public myThread2(StorageForValue storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; ++i) {
            this.storage.value -= 1;
        }
    }
}
