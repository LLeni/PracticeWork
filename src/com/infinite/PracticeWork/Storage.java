package com.infinite.PracticeWork;

import java.util.HashSet;

public class Storage<T> {
    private HashSet<T> storage;

    public Storage(){
        storage = new HashSet<>();
    }

    public void insert(T ob){
        storage.add(ob);
    }

    public void remove(T ob){
        storage.remove(ob);
    }

    public void show(){
        storage.forEach((s) -> System.out.println(s.toString()));
    }
}
