package main.java;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

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

    String systemInput = "";

    while (systemInput != "exit") {
      System.out.println();
      System.out.println(SET_BOLD_TEXT + "Input" + SET_PLAIN_TEXT);
      systemInput = input.nextLine();

      switch (systemInput) {
        case "1":
          ReadFile.readFile("Sem4Sprint1/src/main/data/member.txt");
          break;
        case "2":
          ReadFile.readFile("Sem4Sprint1/src/main/data/tournament.txt");
          break;
        case "3":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "Enter Name" + SET_PLAIN_TEXT);
          String search = input.nextLine();
          ReadFile.searchFile("Sem4Sprint1/src/main/data/member.txt", search);
          break;
        case "help":
          System.out.println();
          System.out.println(SET_BOLD_TEXT + "COMMANDS:" + SET_PLAIN_TEXT);
          System.out.println(" help   Display help for cli");
          System.out.println(" exit   Exit CLI");
          System.out.println(" 1      Retrieve Member Info");
          System.out.println(" 2      Retrieve Tournament Info");
          System.out.println(" 3      Search Member Info");
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
