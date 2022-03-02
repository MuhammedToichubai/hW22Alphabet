package com.additionalExampleAlphabet;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Additional.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        String str ="ABCDEFJHIJKLMNOPQRSTUVWXYZ";
        String str2 = str.toLowerCase(Locale.ROOT);
        String str3 = "0123456789";
        for (int i = 0; i < str.length(); i++) {
            writer.write(str.charAt(i)+" "+str2.charAt(i)+"\n");
        }
        for (int i = 0; i < str3.length(); i++) {
            writer.write(str3.charAt(i)+"\n");

        }
        writer.close();

        try(FileReader reader = new  FileReader(file)) {
            Scanner scanner = new Scanner(reader);
            int i = 0;
            while (scanner.hasNextLine()){
                i++;
                if (i < 10) {
                    System.out.println(i + ":   " + scanner.nextLine());
                }else {
                    System.out.println(i + ":  " + scanner.nextLine());
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}

