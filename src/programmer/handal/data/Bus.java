package programmer.handal.data;

public class Bus implements Car{

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTire() {
        return 6;
    }
    // ? default interface
    public boolean isBig() {
        return true;
    }

    public String getBrand() {
        return "TOYOTA";
    }

    public void isMaintenance() {
        System.out.println("Maintaining process");
    }

}
/*
* pada default interface bisa kita override untuk value yang beda, tetapi jika sama, naka tidak perlu lagi override ulang
* */