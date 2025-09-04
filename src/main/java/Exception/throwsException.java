package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwsException {
    public static void main(String[]args){
        try {
            int result = test();
            System.out.println("两数之商为"+result);
        }catch (ArithmeticException e) {
            e.printStackTrace();//打印错误信息
            System.out.println("除数不为0");
        } catch (InputMismatchException e) {
            e.printStackTrace();//打印错误信息
            System.out.println("请输入整数");
        } catch (Exception e) {
            e.printStackTrace();//打印错误信息
            System.out.println("出错了");
        }


    }
//通过throws抛出异常时，针对可能出现的多种异常情况，解决方案:
// 1、throws后面接多个异常类型，中间用逗号分隔
// 2、throws后面接Exception
    /**
     *
     * @return
     * @throws Exception
     */
    public static int test()throws Exception {
        Scanner input = new Scanner(System.in);

        int one = input.nextInt();
        int two = input.nextInt();
        System.out.println("两数商为" + (one / two));
        return one / two;
    }
}
