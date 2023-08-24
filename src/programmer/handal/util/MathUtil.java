package programmer.handal.util;

public class MathUtil {
    //? Static dalam Method
    public static int sum(int... values){
        int total = 0;
        for (var value :
                values) {
            total += value;
        }
        return total;
    }
}
/*
* artinya ketika ingin mengakses method sum tidak perlu membuat object sum dari MathUtil. jadi bisa langusung direct ke sum tersebut.
* jadi java ini semua merupakan class dan object. jadi ketika kita membuat method tanpa ada static maka kita harus inisialisasikan object dari class tersebut.
* */