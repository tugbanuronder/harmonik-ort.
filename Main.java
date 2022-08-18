import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı dizi oluşturmak istiyorsunuz : ");
        int value=input.nextInt();

        int[] arr = new int[value];
        double series = 0.0;

        for(int i=0 ; i < arr.length ; i++){

            arr[i]= (int) (Math.random() * 100);

            series += 1.0/arr[i];

        }

        double avarage = arr.length / series;
        System.out.print("Elemanların harmonik ortalaması : " + avarage);
    }
}