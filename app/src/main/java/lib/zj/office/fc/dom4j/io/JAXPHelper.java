package lib.zj.office.fc.dom4j.io;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
class JAXPHelper {
    public static Document createDocument(boolean z10, boolean z11) {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(z10);
        newInstance.setNamespaceAware(z11);
        return newInstance.newDocumentBuilder().newDocument();
    }

    public static XMLReader createXMLReader(boolean z10, boolean z11) {
        SAXParserFactory newInstance = SAXParserFactory.newInstance();
        newInstance.setValidating(z10);
        newInstance.setNamespaceAware(z11);
        return newInstance.newSAXParser().getXMLReader();
    }
}
