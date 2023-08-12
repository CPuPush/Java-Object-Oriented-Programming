package programmer.handal.random_program;

public class ArrSum {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,5,6,7,8,9};
        System.out.println(arrMethod.sumArr(myArr));
        System.out.println(arrMethod.timesArr(myArr));
        System.out.println(arrMethod.diviidedArr(myArr));
        System.out.println(arrMethod.minusArr(myArr));
    }
}

class arrMethod{
    static int sumArr(int[] array){
        int container = array[0];
        for (int i = 1; i < array.length; i++) {
            container += array[i];
        }
        return container;
    }

    static int timesArr(int[] arr){
        int container=arr[0];
        for (int i = 1; i < arr.length; i++) {
            container *= arr[i];
        }
        return container;
    }
    static int minusArr(int[] arr){
        int container=arr[0];
        for (int i = 1; i < arr.length; i++) {
            container -= arr[i];
        }
        return container;
    }
    static float diviidedArr(int[] arr){
        float container = arr[0];
        for (int i = 1; i < arr.length; i++) {
            container /= arr[i];
        }
        return container;
    }
}
