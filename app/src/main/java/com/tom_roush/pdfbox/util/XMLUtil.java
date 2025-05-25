package com.tom_roush.pdfbox.util;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public final class XMLUtil {
    private XMLUtil() {
    }

    public static String getNodeValue(Element element) {
        StringBuilder sb2 = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            Node item = childNodes.item(i10);
            if (item instanceof Text) {
                sb2.append(item.getNodeValue());
            }
        }
        return sb2.toString();
    }

    public static Document parse(InputStream inputStream) {
        return parse(inputStream, false);
    }

    public static Document parse(InputStream inputStream, boolean z10) {
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
            newInstance.setNamespaceAware(z10);
            return newInstance.newDocumentBuilder().parse(inputStream);
        } catch (FactoryConfigurationError e10) {
            throw new IOException(e10.getMessage(), e10);
        } catch (ParserConfigurationException e11) {
            throw new IOException(e11.getMessage(), e11);
        } catch (SAXException e12) {
            throw new IOException(e12.getMessage(), e12);
        }
    }
}
