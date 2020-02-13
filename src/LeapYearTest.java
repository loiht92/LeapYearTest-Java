import java.util.Scanner;

public class LeapYearTest {
    public static void main(String[] args) {
        System.out.println("Nhập vào năm cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + ": là năm nhuận ");
                } else {
                    System.out.println(year + ": không phải là năm nhuận");
                }
            } else {
                System.out.println(year + ":là năm nhuận");
            }
        } else {
            System.out.println(year + ": không phải là năm nhuận");
        }
    }
}
