package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        try {
//            int one =input.nextInt();
//            int two = input.nextInt();
//            System.out.println("两数商为"+(one/two));
//        }catch (Exception e){
//            e.printStackTrace();//打印错误信息
//            System.out.println("程序出错了");
//        }finally {
//            System.out.println("运算结束");
//        }
        try {
            int one = input.nextInt();
            int two = input.nextInt();
            System.out.println("两数商为" + (one / two));
        } catch (ArithmeticException e) {
            System.exit(1);//终止程序
            e.printStackTrace();//打印错误信息
            System.out.println("除数不为0");
        } catch (InputMismatchException e) {
            e.printStackTrace();//打印错误信息
            System.out.println("请输入整数");
        } catch (Exception e) {
            e.printStackTrace();//打印错误信息
            System.out.println("出错了");
        } finally {
            System.out.println("运算结束");
        }


    }
}
