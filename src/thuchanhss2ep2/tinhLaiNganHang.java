package thuchanhss2ep2;

import java.util.Scanner;

public class tinhLaiNganHang {
    public static void main(String[] args) {
        // write your code here
        double money = 1.0;          //tiền gửi
        int month = 1;              //tháng gửi
        double interestRate = 1.0; //tỉ lệ lãi suất
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        money = input.nextDouble();
        System.out.println("Nập số tháng muốn gửi: ");
        month = input.nextInt();
        System.out.println("Nhập lãi xuất năm: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lãi: " + totalInterest);
    }
}
