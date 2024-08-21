package codePTIT;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class J07005 {
    public static void main(String[] args) throws IOException {
        DataInputStream sc = new DataInputStream(new FileInputStream("D:\\codeJavaPTIT\\src\\codePTIT\\DATA.in"));
        int s = sc.readInt();
        System.out.println(s);
    }
}
