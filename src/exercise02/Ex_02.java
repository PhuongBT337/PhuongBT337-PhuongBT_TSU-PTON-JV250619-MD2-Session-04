package exercise02;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cho người dùng nhập số lượng phần tử trong mảng
        System.out.print("Mời bạn nhập số lượng của mảng>>> ");
        int arrSize = sc.nextInt();
        int[] arrNumber = new int[arrSize];
        //Cho người dùng nhập phần tử của mảng
        System.out.println("Mời bạn nhập phần tử cho mảng>>> ");
        int sum = 0;    //khai báo biến tổng
        //Duyệt qua các phần tử trong mảng
        for (int i = 0; i < arrSize; i++) {
            arrNumber[i] = sc.nextInt();
            sum += arrNumber[i];
        }
        //Xuất ra kết quả tổng của các phần tử có trong mảng
        System.out.printf("Tổng các phần tử trong mảng là: %s", sum);
    }
}
