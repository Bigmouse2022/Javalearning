package xml_learn.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.*;
import java.util.List;

public class HrWriter {
    public  void writeXml() {
        String file = "src/main/java/xml_learn/hr.xml";
        //SAXReader类是读取XML文件的核心类，用于将XML解析后以“树”的形式保存在内存中
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            //获取XML文档的根节点，即hr标签
            Element root = document.getRootElement();
            Element employee =root.addElement("employee");
            employee.addAttribute("no","3311");
            Element name=employee.addElement("name");
            name.setText("李铁柱");
            employee.addElement("age").setText("22");
            employee.addElement("salary").setText("2200");
            Element department = employee.addElement("department");
            department.addElement("dname").setText("人事部");
            department.addElement("address").setText("xx大夏-B111");

            Writer writer =new OutputStreamWriter(new FileOutputStream(file),"UTF-8");
            document.write(writer);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        HrWriter hrWriter=new HrWriter();
        hrWriter.writeXml();
    }
}
