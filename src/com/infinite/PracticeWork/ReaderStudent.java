package com.infinite.PracticeWork;

import java.io.*;
import java.util.StringTokenizer;

class ReaderStudent {
    private String path;

    ReaderStudent(String path){
        this.path = path;
    }

    void read(Storage<Student> storage) {
        String line;
        try (BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream(path), "UTF-8"))) {
            while ((line = br.readLine()) != null) {
                storage.insert(fabricStudent(line));
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Student fabricStudent(String infoStudent){
        StringTokenizer token = new StringTokenizer(infoStudent," ");
        Student student  = new Student();
        student.setGroup(token.nextToken());
        student.setFirstName(token.nextToken());
        student.setLastName(token.nextToken());
        student.setDate(token.nextToken());
        return student;
    }
}
