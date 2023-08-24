package programmer.handal.app;

import programmer.handal.data.Customer;
import programmer.handal.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("fori");
        customer.setLevel(Level.STANDARD);
        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        // System.out.println(customer.getLevel().toString()); ?otomatis ada toString sesuai dengan nama opsi enumnya, tetapi bisa juga di customisasikan. panggil dengan menambahkan method baru (lebih tepatnya getter dari Level)
        System.out.println(customer.getLevel().getDescription());

        //? conversi enum menjadi string, dengan menambahkan method name() bawaan dari java.ENUM
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //? String menjadi enum=> menggunakan function valueOf()
        Level level = Level.valueOf("VIP"); //name harus sesuai dengan enum option
        System.out.println(level);

        //? mendapatkan available semua enum options=> menggunakan method values();
        System.out.println("====Print level====");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
