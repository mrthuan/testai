package lib.zj.office.fc.dom4j;

import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import lib.zj.office.fc.dom4j.io.SAXReader;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xml.sax.InputSource;

/* loaded from: classes3.dex */
public final class DocumentHelper {
    private DocumentHelper() {
    }

    public static Attribute createAttribute(Element element, QName qName, String str) {
        return getDocumentFactory().createAttribute(element, qName, str);
    }

    public static CDATA createCDATA(String str) {
        return DocumentFactory.getInstance().createCDATA(str);
    }

    public static Comment createComment(String str) {
        return DocumentFactory.getInstance().createComment(str);
    }

    public static Document createDocument() {
        return getDocumentFactory().createDocument();
    }

    public static Element createElement(QName qName) {
        return getDocumentFactory().createElement(qName);
    }

    public static Entity createEntity(String str, String str2) {
        return DocumentFactory.getInstance().createEntity(str, str2);
    }

    public static Namespace createNamespace(String str, String str2) {
        return DocumentFactory.getInstance().createNamespace(str, str2);
    }

    public static ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return getDocumentFactory().createProcessingInstruction(str, str2);
    }

    public static QName createQName(String str, Namespace namespace) {
        return getDocumentFactory().createQName(str, namespace);
    }

    public static Text createText(String str) {
        return DocumentFactory.getInstance().createText(str);
    }

    public static XPath createXPath(String str) {
        return getDocumentFactory().createXPath(str);
    }

    public static NodeFilter createXPathFilter(String str) {
        return getDocumentFactory().createXPathFilter(str);
    }

    private static DocumentFactory getDocumentFactory() {
        return DocumentFactory.getInstance();
    }

    private static String getEncoding(String str) {
        String trim = str.trim();
        if (trim.startsWith("<?xml")) {
            StringTokenizer stringTokenizer = new StringTokenizer(trim.substring(0, trim.indexOf("?>")), " =\"'");
            while (true) {
                if (!stringTokenizer.hasMoreTokens()) {
                    break;
                } else if ("encoding".equals(stringTokenizer.nextToken())) {
                    if (stringTokenizer.hasMoreTokens()) {
                        return stringTokenizer.nextToken();
                    }
                }
            }
        }
        return null;
    }

    public static Element makeElement(Branch branch, String str) {
        Element element;
        Element element2;
        StringTokenizer stringTokenizer = new StringTokenizer(str, PackagingURIHelper.FORWARD_SLASH_STRING);
        if (branch instanceof Document) {
            Document document = (Document) branch;
            element = document.getRootElement();
            String nextToken = stringTokenizer.nextToken();
            if (element == null) {
                element = document.addElement(nextToken);
            }
        } else {
            element = (Element) branch;
        }
        Element element3 = null;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken2 = stringTokenizer.nextToken();
            if (nextToken2.indexOf(58) > 0) {
                element2 = element.element(element.getQName(nextToken2));
            } else {
                element2 = element.element(nextToken2);
            }
            if (element2 == null) {
                element = element.addElement(nextToken2);
            } else {
                element = element2;
            }
            element3 = element;
        }
        return element3;
    }

    public static Document parseText(String str) {
        SAXReader sAXReader = new SAXReader();
        String encoding = getEncoding(str);
        InputSource inputSource = new InputSource(new StringReader(str));
        inputSource.setEncoding(encoding);
        Document read = sAXReader.read(inputSource);
        if (read.getXMLEncoding() == null) {
            read.setXMLEncoding(encoding);
        }
        return read;
    }

    public static List selectNodes(String str, List list) {
        return createXPath(str).selectNodes(list);
    }

    public static void sort(List list, String str) {
        createXPath(str).sort(list);
    }

    public static Attribute createAttribute(Element element, String str, String str2) {
        return getDocumentFactory().createAttribute(element, str, str2);
    }

    public static Document createDocument(Element element) {
        return getDocumentFactory().createDocument(element);
    }

    public static Element createElement(String str) {
        return getDocumentFactory().createElement(str);
    }

    public static ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return getDocumentFactory().createProcessingInstruction(str, map);
    }

    public static QName createQName(String str) {
        return getDocumentFactory().createQName(str);
    }

    public static List selectNodes(String str, Node node) {
        return createXPath(str).selectNodes(node);
    }

    public static void sort(List list, String str, boolean z10) {
        createXPath(str).sort(list, z10);
    }
}
