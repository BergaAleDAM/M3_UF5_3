package m3_uf5_act3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

public class M3_UF5_Act3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        Excepciones1 ex1 = new Excepciones1();

        File f = new File("C:\\Users\\ALUMNEDAM\\Documents\\NetBeansProjects\\M3_UF5_Act3\\src\\m3_uf5_act3\\registro.txt");

        RandomAccessFile raf = new RandomAccessFile(f, "rw");

        try {
            //raf.seek(raf.length());
            //raf.writeBoolean(ex1.entreNumeros("cosa", 1, 20));
            
//        String[] ip;
//        try {
//            ip = ex1.recibirIp("192.168.10.1");
//            for (String string : ip) {
//                raf.writeUTF(string);
//            }
//
//        } catch (ExcepcionIP ex) {
//            System.out.println(ex);
//        }
//
//        
//        try {
//            ip = ex1.recibirIp("120.120.120.120.120");
//        } catch (ExcepcionIP ex) {
//            System.out.println(ex);
//        }

System.out.println(ex1.comprovarIp("8000.1.1.1"));
        } catch (ExcepcionIP ex) {
            System.out.println(ex);
        }

    }

}
