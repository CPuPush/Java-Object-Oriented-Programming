package programmer.handal.data;

public class Avanza implements Car{
    public void drive() {
        System.out.println("Avanza drive");
    }
    public int getTire() {
        return 4;
    }

    // interface inheritance
    public String getBrand(){
        return "this is interface inheritance";
    }

    //multiple interface intheritance
    public void isMaintenance(){
        System.out.println("YES this car is maintaining");
    }
}
/*
* ketika mengimplementasikan interface ke dalam class, maka secara otomatis SEMUA METHOD DI DALAM INTERFACE WAJIB DI OVERRIDE(deklarasikan ulang di class turunan)
* */