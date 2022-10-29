package com.keyin.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.keyin.main.Member;
import com.keyin.main.Tournaments;

public class Main {

  public static void main(String[] args) {
//    Make certain things bold in prints
    final String SET_PLAIN_TEXT = "\033[0;0m";
    final String SET_BOLD_TEXT = "\033[0;1m";
    
    Scanner input = new Scanner(System.in);
//  CLI prints
    System.out.println();
    System.out.println(SET_BOLD_TEXT + "Country Club, The Golf Club" + SET_PLAIN_TEXT);
    System.out.println();
    System.out.println(SET_BOLD_TEXT + "VERSION" + SET_PLAIN_TEXT);
    System.out.println("  1.7");
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
    System.out.println("  5     Create New Tournament");

    String systemInput = "";
//    while loop so cli is continuous until exit command is used
    while (systemInput != "exit") {
      System.out.println();
      System.out.println(SET_BOLD_TEXT + "Input" + SET_PLAIN_TEXT);
      systemInput = input.nextLine();

//      Switch for cli inputs
      switch (systemInput) {
        case "1":
//          Reading member file
          ReadFile.readFile("src/main/java/data/member.txt");
          break;
        case "2":
//          Reading tourn file
          ReadFile.readFile("src/main/java/data/tournament.txt");
          break;
        case "3":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "Enter Name" + SET_PLAIN_TEXT);
          String search = input.nextLine();
//          searching member file by name
          ReadFile.searchFile("src/main/java/data/member.txt", search);
          break;
        case "4":
          Boolean created = false;
//          While new member is NOT created keep doing loop
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
//            If confirm is yes create/save the new member and leave loop
            switch (input8.toLowerCase()){
              case "y":
                mCreate.saveMember();
                created = true;
                break;
              default:
                created = false;
            }
          }

        case "5":
          created = false;
//        While new tourn is NOT created keep running loop
          while (created == false) {
            System.out.println(SET_BOLD_TEXT + "Creating New Tournament..." + SET_PLAIN_TEXT);
            System.out.println("Enter Tournaments Name");
            String input1, input2, input3, input4, input5, input6, input7, input8, input9;
            input1 = input.nextLine();
            System.out.println("Enter Tournaments Location");
            input2 = input.nextLine();
            System.out.println("Enter Participating Members");
            input3 = input.nextLine();
            System.out.println("Enter Final Standing");
            input4 = input.nextLine();
            System.out.println("Enter Start Date");
            input5 = input.nextLine();
            System.out.println("Enter End Date");
            input6 = input.nextLine();
            System.out.println("Enter Entree Fee");
            input7 = input.nextLine();
            System.out.println("Enter Prize Pool");
            input8 = input.nextLine();

            double dInput7 = Double.parseDouble(input7);
            double dInput8 = Double.parseDouble(input8);
            Tournaments tCreate = new Tournaments(input1, input2, input3, input4, input5, input6, dInput7, dInput8);


            System.out.println(SET_BOLD_TEXT + "Confirm..." + SET_PLAIN_TEXT);
            System.out.println("Y/N");
            System.out.println();
            System.out.println(tCreate.toString());
            input9 = input.nextLine();
//            If confirmation is yes save/create new tourn
            switch (input9.toLowerCase()){
              case "y":
                tCreate.saveTourn();
                created = true;
                break;
              default:
                created = false;

            }
          }

//        Displays help
        case "help":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "COMMANDS:" + SET_PLAIN_TEXT);
          System.out.println(" help   Display help for cli");
          System.out.println(" exit   Exit CLI");
          System.out.println(" 1      Retrieve All Member Info");
          System.out.println(" 2      Retrieve All Tournament Info");
          System.out.println(" 3      Search Member Info");
          System.out.println(" 4      Create New Member");
          System.out.println(" 5      Create New Tournament");
          break;

//          Exits prgram
        case "exit":
          System.exit(0);
//          Default to unkown command
        default:
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "Unknown Command" + SET_PLAIN_TEXT);
          System.out.println("Use command 'help' for list of commands");
          break;
      }
    }

  }
}
