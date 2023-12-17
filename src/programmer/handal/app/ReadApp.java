package programmer.handal.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
//        ? Manual reader.close()
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(
//                    new FileReader("READMEf.md")
//            );
//            while (true){
//                String text = reader.readLine();
//                if(text == null){
//                    break;
//                }
//                System.out.println(text);
//            }
//        }catch (Throwable throwable){
//            System.out.println("Error membaca file " + throwable.getMessage());
//        }finally {
//            if(reader != null){
//                try {
//                    reader.close();
//                    System.out.println("Sukses menutup");
//                }catch (IOException exception){
//                    System.out.println("Error menutup resources " + exception.getMessage());
//                }
//            }
//        }
//        ? Otomatis reader.close()
//        langsung didefinisikan valiable turunan auto closeable
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while(true){
                String text = reader.readLine();
                if(text == null){
                    break;
                }
                System.out.println(text);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

/*
! 37. Try with Resource
* Di Java 7, terdapat fitur baru yang bernama try with resource
* Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource( yang wajib di close) dalam block try
* jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable

? 38 ada di Fancy



* */