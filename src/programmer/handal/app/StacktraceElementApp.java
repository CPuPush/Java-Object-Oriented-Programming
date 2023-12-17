package programmer.handal.app;

public class StacktraceElementApp {
    public static void main(String[] args) {
        try {
            sampleError();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

    }

    static void sampleError(){
        try {
            String[] name = {
                    "fori", "okto", "pakpahan"
            };
            System.out.println(name[100]);
        }catch (Throwable throwable){
            throw new RuntimeException(throwable);
        }
    }
}



/*
! 36 StackTraceElementClass
* Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan array dari StackTraceElement object
* StackTraceElement berisikan informasi tentang class, file bahkan baris lokasi terjadinya error
* Class StackTraceElement ini sangat penting untuk menelusuri lokasi kejadian error yang terjadi
* Cara yang paling mudah kita bisa memanggil mehtod printStackTrace() class Throwable untuk memprint ke console detail error StackTraceElementnya

        try {
            String[] name = {
                    "fori", "okto", "pakpahan"
            };
            System.out.println(name[100]);
        }catch (Throwable throwable){
            //StactTraceElement[] stackTraces = throwable.getStackTrace();
            throwable.printStackTrace();
        }
* RuntimeException bisa kita extends dan juga bisa langsung digunakan karena sudah ada classnya

? 37 ada di ReadApp

* */
