package com.keyin.main;



import java.io.File;

public class Member {
    File file = new File("src/main/java/data/member.txt");
    private String name, address, email, phoneNum, membershipType, currTourn, pastTourn;
    private double memCost;
    public Member(String name, String address, String email, String phoneNum, String membershipType, String currTourn, String pastTourn){
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNum = phoneNum;
        this.membershipType = membershipType;

        switch (membershipType){
            case "normal":
                this.memCost = 49.99;
                break;
            case "trial":
                this.memCost = 14.99;
                break;
            case "special offer":
                this.memCost = 39.99;
                break;
            case "family":
                this.memCost = 29.99;
                break;
            default:
                this.memCost = 29.99;
                break;
        }
        this.currTourn = currTourn;
        this.pastTourn = pastTourn;
    }

    public String toString() {
        return (this.name + "\n" + this.address + "\n" + this.email + "\n" + this.phoneNum + "\n" + this.membershipType
                + "\n" + "$" + this.memCost + "\n" + this.currTourn + "\n" + this.pastTourn + "\n" + "\n");
    }

    public void saveMember(){
        WriteFile.writeFileMember(file, this);
    }
}
