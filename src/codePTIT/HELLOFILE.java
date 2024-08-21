package codePTIT;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }
}
