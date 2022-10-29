package com.keyin.main;

import java.io.File;

public class Tournaments {

//    File location for storage
    File file = new File("src/main/java/data/tournament.txt");
    private String name, location, partMembers, finalStanding;
    private String startDate, endDate;
    private Double entreeFee, prizeAmt;

    public Tournaments(String name, String location, String partMembers, String finalStanding, String startDate, String endDate, Double entreeFee, Double prizeAmt){
        this.name = name;
        this.location = location;
        this.partMembers = partMembers;
        this.finalStanding = finalStanding;
        this.startDate = startDate;
        this.endDate = endDate;
        this.entreeFee = entreeFee;
        this.prizeAmt = prizeAmt;
    }

    public String toString(){
        return (this.name + "\n" + this.location + "\n" + this.partMembers + "\n" + this.finalStanding + "\n" + this.startDate + "\n" + this.endDate + "\n" + this.entreeFee + "\n" + this.prizeAmt + "\n" + "\n");
    }

    public void saveTourn(){
        WriteFile.writeFileTourn(file, this);
    }

}
