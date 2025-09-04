package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwException {
    public static void main(String[] args) {
        testAge();
    }

    public static void testAge() {
        try {
            Scanner input = new Scanner(System.in);

            int age = input.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("18岁以下，80岁以上禁止");
            } else {
                System.out.println("欢迎入驻");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出错");
        }
    }

    public static void testAge2() throws Exception {

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        if (age < 18 || age > 80) {
            throw new Exception("18岁以下，80岁以上禁止");
        } else {
            System.out.println("欢迎入驻");
        }

    }
    public static void testAge3() throws HotelException {

        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        if (age < 18 || age > 80) {
            throw new HotelException();
        } else {
            System.out.println("欢迎入驻");
        }

    }
}
