package com.infinite.PracticeWork;

public class Main {
    public static void main(String[] args) {
        Storage<Student> storage = new Storage<>();
        doInit("resources/1.txt", storage);

        storage.show();

    }

    public static void doInit(String path, Storage st){
        ReaderStudent reader = new ReaderStudent(path);
        reader.read(st);
    }
}
