package com.java.assignments;

class Person {
    String name;
    int age;
    String add;
    long phone_no;

    public Person(String name, int age, String add, long phone_no) {
        this.name = name;
        this.age = age;
        this.add = add;
        this.phone_no = phone_no;
    }
}

class Politician extends Person {
    String party;
    int ward_no;

    public Politician(String name, int age, String add, long phone_no, String party, int ward_no) {
        super(name, age, add, phone_no);
        this.party = party;
        this.ward_no = ward_no;
    }

    @Override
    public String toString() {
        return "\nPolitician " +
                "\nName='" + name +
                "\nAge=" + age +
                "\nAddress='" + add +
                "\nPhone Number=" + phone_no +
                "\nParty=" + party +
                "\nWard Number='" + ward_no;
    }
}

class SportsMan extends Person {
    String game_name;
    int world_rank;

    public SportsMan(String name, int age, String add, long phone_no, String game_name, int world_rank) {
        super(name, age, add, phone_no);
        this.game_name = game_name;
        this.world_rank = world_rank;
    }

    @Override
    public String toString() {
        return "\nSportsMan " +
                "\nName='" + name +
                "\nAge=" + age +
                "\nAddress='" + add +
                "\nPhone Number=" + phone_no+
                "\nGame Name=" + game_name +
                "\nWorld Rank=" + world_rank;
    }
}

public class Driver {
    public static void main(String[] args) {

        Person ob = new Politician("Narendra Modi" , 55 , "Gujarat" , 123456789 , "BJP" , 2);
        Person ob1 = new SportsMan("Mahendra Singh Dhoni" , 45 , "Jharkhand" , 987654321 , "Cricket" , 1);

        System.out.println("Politician Details: "+ob);
        System.out.println("\nSports person Detail: "+ob1);
    }
}
