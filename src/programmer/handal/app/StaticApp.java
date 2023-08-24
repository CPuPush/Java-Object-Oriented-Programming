package programmer.handal.app;

//import static
import programmer.handal.data.Application;
import static programmer.handal.data.Constant.*;
import programmer.handal.data.Country;
import static programmer.handal.util.MathUtil.sum;

public class StaticApp {
    public static void main(String[] args) {
        //? static field
//        Constant constant = new Constant(); todo Hal ini bisa dilakuukan, tapi karena pake field jadi tidak usah di instantiate
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.version);
        System.out.println(APPLICATION);
        System.out.println(version);

        //? static method
        System.out.println(sum(2,3,4,5,3,2,3,1,3,4,5));

        //? static class
        Country.City city = new Country.City();
        city.setName("Dino");
        System.out.println(city.getName());
        // sebelumnya ketika tidak ada static maka harus menginstantiate method outer classnya sebelum inner classnya

        //? static block
        System.out.println(Application.PROCESSOR);
    }
}
/*
* intinya adalah tidak perlu membuat object dulu sebelum mengakses method dari class yang dibuat
? Static Import
* jadi kita tidak perlu memanggil secara langsung class static dalam block main. cukup merefeer ke nama staticnya.
? 31 ada di LoginRequest
* */