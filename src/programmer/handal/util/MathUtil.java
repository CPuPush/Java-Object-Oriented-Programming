package programmer.handal.data;

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
