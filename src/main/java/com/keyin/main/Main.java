package com.keyin.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.keyin.main.Member;
import com.keyin.main.Tournaments;

public class Main {

  public static void main(String[] args) {
    Member m1 = new Member("Ned Stark", "Winterfell", "nedS@ex.com", "ravenport12", "normal", "Null", "Roberts Rebellion");
    Member m2 = new Member("Robert Baratheon", "Kings Landing", "robB@ex.com", "ravenport13", "family (Cersei Lannister)", "Null", "Roberts Rebellion");
    Member m3 = new Member("Cersei Lannister", "Kings Landing", "cerL@ex.com", "ravenport13", "family (Robert Baratheon)", "War for Westeros", "Roberts Rebellion");
    Member m4 = new Member("John Snow", "Winterfell", "JS@ex.com", "ravenport08", "trial", "War for Westeros", "Null");
    Member m5 = new Member("Daenerys Targaryen", "DragonStone", "DT@ex.com", "ravenport72", "special offer", "War for Westeros", "Roberts Rebbelion");
    Tournaments t1 = new Tournaments("Roberts Rebellion", "Kings Landing", "Ned Stark, Robert Baratheon, Cersei Lannister, Daenerys Targaryen", "1st: Robert Baratheon 2nd: Cersei Lannister 3rd: Ned Stark", "282 AD", "283 AD", 15000.00, 10000000.00);
    Tournaments t2 = new Tournaments("War for Westeros", "Kings Landing", "Cersei Lannister, Daenerys Targaryen, John Snow", "1st: John Snow 2nd: Daenerys Targaryen 3rd: Cersei Lannister", "304 AC", "305 AC", 1500000.00, 10000000000.00);
    List<Member> memberList = new ArrayList<Member>();
    List<Tournaments> tournList = new ArrayList<Tournaments>();
    memberList.add(m1);
    memberList.add(m2);
    memberList.add(m3);
    memberList.add(m4);
    memberList.add(m5);
    tournList.add(t1);
    tournList.add(t2);


    final String SET_PLAIN_TEXT = "\033[0;0m";
    final String SET_BOLD_TEXT = "\033[0;1m";

    Scanner input = new Scanner(System.in);

    System.out.println();
    System.out.println(SET_BOLD_TEXT + "Country Club, The Golf Club" + SET_PLAIN_TEXT);
    System.out.println();
    System.out.println(SET_BOLD_TEXT + "VERSION" + SET_PLAIN_TEXT);
    System.out.println("  1.3");
    System.out.println();
    System.out.println(SET_BOLD_TEXT + "USAGE" + SET_PLAIN_TEXT);
    System.out.println("  Country Club Staff Only");
    System.out.println();
    System.out.println(SET_BOLD_TEXT + "COMMANDS:" + SET_PLAIN_TEXT);
    System.out.println("  help  Display help for cli");
    System.out.println("  exit  Exit CLI");
    System.out.println("  1     Retrieve All Member Info");
    System.out.println("  2     Retrieve All Tournament Info");
    System.out.println("  3     Search Member Info");
    System.out.println("  4     Create New Member");

    String systemInput = "";

    while (systemInput != "exit") {
      System.out.println();
      System.out.println(SET_BOLD_TEXT + "Input" + SET_PLAIN_TEXT);
      systemInput = input.nextLine();

      switch (systemInput) {
        case "1":
          ReadFile.readFile("src/main/java/data/member.txt");
          break;
        case "2":
          ReadFile.readFile("src/main/java/data/tournament.txt");
          break;
        case "3":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "Enter Name" + SET_PLAIN_TEXT);
          String search = input.nextLine();
          ReadFile.searchFile("src/main/java/data/member.txt", search);
          break;
        case "4":
          Boolean created = false;

          while (created == false) {
            System.out.println(SET_BOLD_TEXT + "Creating New Member..." + SET_PLAIN_TEXT);
            System.out.println("Enter Name");
            String input1, input2, input3, input4, input5, input6, input7, input8;
            input1 = input.nextLine();
            System.out.println("Enter Address");
            input2 = input.nextLine();
            System.out.println("Enter Email");
            input3 = input.nextLine();
            System.out.println("Enter Phone Number");
            input4 = input.nextLine();
            System.out.println("Enter Membership Type");
            input5 = input.nextLine();
            System.out.println("Enter Tournaments Currently Participating In");
            input6 = input.nextLine();
            System.out.println("Enter Past Tournaments Participated In");
            input7 = input.nextLine();

            Member mCreate = new Member(input1, input2, input3, input4, input5, input6, input7);

            System.out.println(SET_BOLD_TEXT + "Confirm..." + SET_PLAIN_TEXT);
            System.out.println("Y/N");
            System.out.println();
            System.out.println(mCreate.toString());
            input8 = input.nextLine();
            switch (input8.toLowerCase()){
              case "y":
                mCreate.saveMember();
                created = true;
                break;
              default:
                created = false;
            }
          }

        case "help":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "COMMANDS:" + SET_PLAIN_TEXT);
          System.out.println(" help   Display help for cli");
          System.out.println(" exit   Exit CLI");
          System.out.println(" 1      Retrieve All Member Info");
          System.out.println(" 2      Retrieve All Tournament Info");
          System.out.println(" 3      Search Member Info");
          System.out.println(" 4      Create New Member");
          break;
        case "exit":
          System.exit(0);
        default:
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "Unknown Command" + SET_PLAIN_TEXT);
          System.out.println("Use command 'help' for list of commands");
          break;
      }
    }

  }
}
