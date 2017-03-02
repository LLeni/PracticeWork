package com.infinite.PracticeWork;

import java.util.HashSet;

public class Storage<T> {
    private HashSet<T> storage;

    public Storage(){
        storage = new HashSet<>();
    }

    void insert(T ob){
        storage.add(ob);
    }

    void remove(T ob){
        storage.remove(ob);
    }

    void show(){
        storage.forEach((s) -> {
            System.out.println(s.toString());
        });
    }
}
