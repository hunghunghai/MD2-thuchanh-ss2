package thuchanhss2ep3;

import java.util.Scanner;

public class TimUocSoChungLonNhat {
    public static void main(String[] args) {
        // write your code here
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a); //Sử dụng hàm abs() để trả về giá trị tuyệt đối (phần dương) của a, b
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println("Ước chung lớn nhất : " + a);
    }}
