package com.example.a1;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person p) {
        if (this.age < p.getAge()) {
            return 1;
        } else if (this.age > p.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
