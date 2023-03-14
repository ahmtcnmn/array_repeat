import java.util.Arrays;


public class Main {

    static void search(int[] arr, int value) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                a++;
            }
        }
        System.out.println(value + " sayısı " + (a) + "kere tekrar edildi.");
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 30, 30, 30, 30, 30,4,6,8};
        int[] duplicate = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < (array.length); i++) {
            for (int k = 0; k < array.length; k++) {
                if ((i != k) && (array[i] != array[k])) {
                    if (!isFind(duplicate, array[i]))       // her sayiyi tek seferlik yeni duplicate ye aktariyor.
                        duplicate[startIndex++] = array[i];
                }
            }
        }

        int c=0;
        for (int i=0;i<duplicate.length;i++){
            if (duplicate[i]!=0){       //duplicate de ki fazla bos elemanlari belirleyip yeni dizi icin boyut belirleniyor.
                c++;
            }
        }

        int[] duplicate2=new int[c];
        for (int i=0;i<c;i++){          // yeni diziye teker teker aktariliyor.
            duplicate2[i]=duplicate[i];
        }

        System.out.println("Dizi : "+Arrays.toString(array));
        for (int i=0;i<duplicate2.length;i++){
            search(array,duplicate2[i]);
        }


    }
}
