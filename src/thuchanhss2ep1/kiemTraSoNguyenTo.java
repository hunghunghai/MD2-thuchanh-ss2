package thuchanhss2ep1;

import java.util.Scanner;

public class kiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số:");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " Không phải là số nguyên");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " Là một số nguyên");
            else
                System.out.println(number + " Không phải là số nguyên");
        }
    }
}
