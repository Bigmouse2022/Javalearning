package shurushuchuliu_6_4.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		//创建File对象
		//File file1=new File("c:\\imooc\\io\\score.txt");
		//File file1=new File("c:\\imooc","io\\score.txt");
		File file=new File("FileDemoTest");
		File file1=new File(file,"FileDemoTest2.txt");
		//判断是文件还是目录
		System.out.println("是否是目录："+file1.isDirectory());
		System.out.println("是否是文件："+file1.isFile());
		//创建目录
		File file2=new File("FileDemoTest\\HashSet");
		if(!file2.exists()) {
			file2.mkdirs();
		}
		//创建文件
		if(!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}