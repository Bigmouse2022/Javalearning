package xml_learn.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import javax.print.Doc;
import java.util.List;

public class XPathTestor {
    public void xpath(String xpathExp) {
        String file = "src/main/java/xml_learn/hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            List<Node> nodes = document.selectNodes(xpathExp);
            for (Node node : nodes) {
                Element emp = (Element) node;
                System.out.println(emp.elementText("name"));
                System.out.println(emp.elementText("age"));
                System.out.println(emp.elementText("salary"));
                System.out.println("--------------------");
            }
        } catch (DocumentException e) {
            e.printStackTrace();

        }
        System.out.println("-----finish---------------");
    }

    public static void main(String[] args) {
        XPathTestor testor = new XPathTestor();
        testor.xpath("/hr/employee");
        testor.xpath("//employee");
        testor.xpath("//employee[salary<3500]");
        testor.xpath("//employee[name='李铁柱']");
        testor.xpath("//employee[@no=3309]");
        testor.xpath("//employee[1]");
        testor.xpath("//employee[last()]");
        testor.xpath("//employee[position()<6]");
    }
}
