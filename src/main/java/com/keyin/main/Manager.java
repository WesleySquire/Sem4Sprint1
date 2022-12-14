package com.keyin.main;

import data.Database;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private Database database;

    public List<Member> getAllMembers(){
        List<Member> members = database.getAllMember();
        List<Member> memberToReturn = new ArrayList<Member>();
        for (Member m : members){
            memberToReturn.add(m);
        }
        return memberToReturn;
    }

    public List<Tournaments> getAllTourn(){
        List<Tournaments> tournaments = database.getAllTourn();
        List<Tournaments> tournToReturn = new ArrayList<Tournaments>();
        for (Tournaments t : tournaments){
            tournToReturn.add(t);
        }
        return tournToReturn;
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }
}
