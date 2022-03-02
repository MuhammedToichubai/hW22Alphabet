package alphabetHomeWork22;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Англиcче алфавитти жана сандарды файлга жазыныз.
//        Кайра эле ошол файлдан анын ичиндеги маалыматты окуп консольго чыгарышыныз керек

        try( FileWriter writer = new FileWriter("Alphabet.txt")) {
            writer.write("A a\n");
            writer.write("B b\n");
            writer.write("C c\n");
            writer.write("D d\n");
            writer.write("E e\n");
            writer.write("F f\n");
            writer.write("G g\n");
            writer.write("H h\n");
            writer.write("I i\n");
            writer.write("J j\n");
            writer.write("K k\n");
            writer.write("L l\n");
            writer.write("M m\n");
            writer.write("N n\n");
            writer.write("O o\n");
            writer.write("P p\n");
            writer.write("Q q\n");
            writer.write("R r\n");
            writer.write("S s\n");
            writer.write("T t\n");
            writer.write("U u\n");
            writer.write("V v\n");
            writer.write("W w\n");
            writer.write("X x\n");
            writer.write("Y y\n");
            writer.write("Z z\n");
            writer.write("0\n");
            writer.write("1\n");
            writer.write("2\n");
            writer.write("3\n");
            writer.write("4\n");
            writer.write("5\n");
            writer.write("6\n");
            writer.write("7\n");
            writer.write("8\n");
            writer.write("9\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileReader reader = new  FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(reader);
            int i = 0;
            while (scanner.hasNextLine()){
                i++;
                if (i < 10) {
                    System.out.println(i + "   " + scanner.nextLine());
                }else {
                    System.out.println(i + "  " + scanner.nextLine());
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
