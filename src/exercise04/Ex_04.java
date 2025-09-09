package exercise04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cho sinh viên nhập số lượng phẩn tử trong mảng
        System.out.println("Mời bạn nhập số lượng phần tử có trong mảng>>> ");
        int arrSize = Integer.parseInt(sc.nextLine());
        if (arrSize == 0) {
            System.out.println("Kích thước rỗng - mời bạn nhập lại>>>");
        }
        int[] arrNumber = new int[arrSize];
        //Cho sinh viên nhập một số nguyên bất kì
        System.out.println("Mời bạn nhập số nguyên cần sắp xếp>>> ");
        for (int i = 0; i < arrSize; i++) {
            arrNumber[i] = sc.nextInt();
        }
        //Mảng trước khi được hoán đổi
        System.out.println("Mảng trước khi được hoán đổi>>>");
        for (int num : arrNumber) {
            System.out.print(num + " ");
        }
        System.out.print("\n");
        //Gọi phương thức tiến hành hoán đổi mảng
        ArrayReverse.arrRev(arrNumber);
        //Mảng sau khi được hoán đổi
        System.out.println("Mảng sau khi đã được hoán đổi>>>");
        for (int num : arrNumber) {
            System.out.print(num + " ");
        }
    }
}