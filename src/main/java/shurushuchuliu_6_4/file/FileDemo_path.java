package shurushuchuliu_6_4.file;
import java.io.File;
import java.io.IOException;
public class FileDemo_path {
    public static void main(String[] args) {
//		File f=new File("c:\\imooc\\java\\thread\\thread.txt");
//		System.out.println(f.exists());
        File f=new File("FileDemoTest\\FileDemoTest2");
        try {
            f.createNewFile();
            //是否是绝对路径
            System.out.println(f.isAbsolute());
            //获取相对路径
            System.out.println(f.getPath());
            //获取绝对路径
            System.out.println(f.getAbsolutePath());
            //获取文件名
            System.out.println(f.getName());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
