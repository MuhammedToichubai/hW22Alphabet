package com.additionalExampleAlphabet;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("Additional.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("ABCDEFJHIJKLMNOPQRSTUVWXYZ0123456789");
        writer.write("abcdefjhijklmnopqrstuvwxyz");
        writer.flush();
        writer.close();

        FileReader fr = new FileReader(file);
        char [] a = new char[36];
        fr.read(a);   
        char [] b = new char[36];
        fr.read(b);

//        }}
        for (int i = 1,c = 0,j = 0; i <= a.length && c < a.length && j < b.length; i++, c++,j++) {
            if (i < 10 ) {
                System.out.println(i + "   " + a[c] + " " + b[j]);
            }else if(i < 27) {
                System.out.println(i+"  "+a[c]+" "+b[j]);
            }else {
                System.out.println(i+"  "+a[c]);
            }
            fr.close();

        }
    }
}

