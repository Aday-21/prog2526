
package Ejercicio11;
import java.io.*;


public class Ejercicio11 {

    public static void main(String[] args) throws IOException {
        try {
            File file = new File("record.txt");
            try(RandomAccessFile record = new RandomAccessFile("record.txt", "rw");){
                  record.writeBytes("Nivel:001");
                  record.seek(6);
                  record.writeBytes("005");
                  record.writeBytes("666");
            }
            System.out.println(file.getAbsolutePath());
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
} 
            