package main.java;

import java.util.Date;

public class Member {
  private String name, address, email, phoneNum, membershipType, currTourn, pastTourn;
  private Date joinDate, durMembership;

  public Member(String name, String address, String email, String phoneNum, String membershipType, String currTourn,
      String pastTourn, Date joinDate) {
    this.name = name;
    this.address = address;
    this.email = email;
    this.phoneNum = phoneNum;
    this.membershipType = membershipType;
    this.currTourn = currTourn;
    this.pastTourn = pastTourn;
    this.joinDate = joinDate;
  }
}
