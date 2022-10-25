package com.keyin.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {

    public static void writeFileMember(File fileLocation, Member member){
        try {
            FileWriter fw = new FileWriter(fileLocation.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            String strMem = member.toString();
            bw.write(strMem);
            bw.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void writeFileTourn(File fileLocation, Tournaments tournaments){
        try {
            FileWriter fw = new FileWriter(fileLocation.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            String strTourn = tournaments.toString();
            bw.write(strTourn);
            bw.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
