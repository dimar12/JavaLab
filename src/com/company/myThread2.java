package com.company;

public class myThread2 extends Thread{
    private final StorageForValue storage;
    public myThread2(StorageForValue storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; ++i) {
            synchronized (storage) {
                this.storage.value -= 1;
                System.out.println("[myThread2] value = " + storage.value);
            }
        }
    }
}
