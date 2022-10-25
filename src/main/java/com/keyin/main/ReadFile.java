package com.keyin.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

  public static Boolean readFile(String fileLocation) {
    try {
      System.out.println();
      FileReader reader = new FileReader(fileLocation);
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;

      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);

      }
      reader.close();
      return true;
    } catch (IOException e) {
      System.out.println("Cannot Find File Location");
      e.printStackTrace();
      return false;
    }
  }

  public static void searchFile(String fileLocation, String search) {
    Boolean found = false;
    try {
      System.out.println();
      FileReader reader = new FileReader(fileLocation);
      BufferedReader bufferedReader = new BufferedReader(reader);

      String line;

      while ((line = bufferedReader.readLine()) != null) {
        if (line.toLowerCase().equals(search.toLowerCase())) {
          for (int i = 0; i < 9; i++) {
            System.out.println(line = bufferedReader.readLine());
          }
          found = true;
        }

      }
      if (found == false) {
        System.out.println("Cannot Find Name");
      }
      reader.close();

    } catch (IOException e) {
      System.out.println("Cannot Find File Location");
      e.printStackTrace();

    }
  }
}
