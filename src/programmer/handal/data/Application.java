package programmer.handal.data;

public class Application {
    //? Static dalam block
    public static final int PROCESSOR;

    static {
        System.out.println("Mengakses class Application");
        // how to get jumlah processor
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
/*
 * Saat membuat sebuah class, dapat menambahkan static block. Static block akan dieksekusi sekali sebelum class Application diload
 * static harus mengakses yang static
*/
