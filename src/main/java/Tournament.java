package main.java;

import java.util.Date;

public class Tournament {
  private String name, location, partMembers, finalStanding;
  private Date startDate, endDate;
  private Double entreeFee, prizeAmt;

  public Tournament(String name, String location, String partMembers, String finalStanding, Date startDate,
      Date endDate, Double entreeFee, double prizeAmt) {
    this.name = name;
    this.location = location;
    this.partMembers = partMembers;
    this.finalStanding = finalStanding;
    this.startDate = startDate;
    this.endDate = endDate;
    this.entreeFee = entreeFee;
    this.prizeAmt = prizeAmt;
  }

  public String toString() {
    return (this.name + "\n" + this.location + "\n" + this.partMembers + "\n" + this.finalStanding + "\n"
        + this.startDate + "\n" + this.endDate + "\n" + this.entreeFee + "\n" + this.prizeAmt);
  }

}