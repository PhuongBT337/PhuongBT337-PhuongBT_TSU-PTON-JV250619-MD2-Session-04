package exercise01;

import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khoi tao kich thuoc mang
        final int arrSize = 6;
        //Khoi tao mang
        int[] arrNumber = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.printf("Array[%d] = ", i + 1);
            arrNumber[i] = sc.nextInt();
        }
        selectionSort(arrNumber);
        //Xuat ra mang sau khi da sap xep theo thu tu giam dan
        System.out.print("Mang sau khi sap xep= {");
        for (int num : arrNumber) {
//            System.out.print("{");
            System.out.print(num + " ");
//            System.out.print("}");
        }
        System.out.print("}");
        //Phan tu lon nhat
        System.out.println("\n>>>>>Max Value= " + arrNumber[0]);
    }

    public static void selectionSort(int[] arrNumber) {
        for (int i = 0; i < arrNumber.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arrNumber.length; j++) {
                if (arrNumber[j] > arrNumber[maxIndex]) {
                    maxIndex = j;
                }
            }
            //hoan doi phan tu
            int maxValue = arrNumber[maxIndex];
            arrNumber[maxIndex] = arrNumber[i];
            arrNumber[i] = maxValue;
        }
    }
}
