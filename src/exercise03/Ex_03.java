package exercise03;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cho người dùng nhập số lượng phần tử của mảng
        System.out.print("Nhập số  phần tử của mảng>>> ");
        int arrSize = sc.nextInt();
        int[] arrNumber = new int[arrSize];
        //Cho người dùng nhập phần tử của mảng
        System.out.println("Mời bạn nhập phần tử cho mảng>>> ");
        for (int i = 0; i < arrSize; i++) {
            arrNumber[i] = sc.nextInt();
        }
        System.out.println("Mảng trước khi được sắp xếp>>>");
        for (int num : arrNumber) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        //Gọi BubbleSort
        BubbleSort numSort = new BubbleSort();
        numSort.bubbleSort(arrNumber);
        //Xuất ra kết quả mảng đã sắp xếp
        System.out.println("Mảng sau khi đã sắp xếp>>>");
        for (int num : arrNumber) {
            System.out.print(num + " ");
        }

    }
}
