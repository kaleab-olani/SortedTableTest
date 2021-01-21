package com.app.kol.sorttabletest;

import java.util.ArrayList;
import java.util.List;

public class SampleClass {
    private String name;
    private int id;
    private boolean alive;
    private char gender;

    public SampleClass(String name, int id, boolean isAlive, char gender) {
        this.name = name;
        this.id = id;
        this.alive = isAlive;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static List<SampleClass> getData(int count) {
        ArrayList<SampleClass> sampleClasses = new ArrayList<>();
        for (int i = 0; i < count; i++) sampleClasses.add(new SampleClass("Item looooooooooooooooooooooooooooooooooooooooooooooong  " + i, i, i % 3 == 0, i % 2 == 0 ? 'M' : 'F'));
        return sampleClasses;
    }
    static class SampleClassIDComparator implements java.util.Comparator<SampleClass> {
        @Override
        public int compare(SampleClass sampleClass, SampleClass t1) {
            return Integer.compare(sampleClass.getId(), t1.getId());
        }
    }
    static class SampleClassNameComparator implements java.util.Comparator<SampleClass> {
        @Override
        public int compare(SampleClass sampleClass, SampleClass t1) {
            return sampleClass.getName().compareTo(t1.getName());
        }
    }
    static class SampleClassGenderComparator implements java.util.Comparator<SampleClass> {
        @Override
        public int compare(SampleClass sampleClass, SampleClass t1) {
            return Character.compare(sampleClass.getGender(),t1.getGender());
        }
    }
    static class SampleClassAliveComparator implements java.util.Comparator<SampleClass> {
        @Override
        public int compare(SampleClass sampleClass, SampleClass t1) {
            return Boolean.compare(sampleClass.isAlive(),t1.isAlive());
        }
    }
}
