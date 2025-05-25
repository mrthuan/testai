package lib.zj.office.fc.dom4j.io;

import javax.xml.transform.sax.SAXSource;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Node;
import org.xml.sax.InputSource;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
public class DocumentSource extends SAXSource {
    public static final String DOM4J_FEATURE = "http://org.dom4j.io.DoucmentSource/feature";
    private XMLReader xmlReader = new SAXWriter();

    public DocumentSource(Node node) {
        setDocument(node.getDocument());
    }

    public Document getDocument() {
        return ((DocumentInputSource) getInputSource()).getDocument();
    }

    @Override // javax.xml.transform.sax.SAXSource
    public XMLReader getXMLReader() {
        return this.xmlReader;
    }

    public void setDocument(Document document) {
        super.setInputSource(new DocumentInputSource(document));
    }

    @Override // javax.xml.transform.sax.SAXSource
    public void setInputSource(InputSource inputSource) {
        if (inputSource instanceof DocumentInputSource) {
            super.setInputSource((DocumentInputSource) inputSource);
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // javax.xml.transform.sax.SAXSource
    public void setXMLReader(XMLReader xMLReader) {
        if (xMLReader instanceof SAXWriter) {
            this.xmlReader = (SAXWriter) xMLReader;
        } else if (!(xMLReader instanceof XMLFilter)) {
            throw new UnsupportedOperationException();
        } else {
            while (true) {
                XMLFilter xMLFilter = (XMLFilter) xMLReader;
                XMLReader parent = xMLFilter.getParent();
                if (parent instanceof XMLFilter) {
                    xMLReader = parent;
                } else {
                    xMLFilter.setParent(this.xmlReader);
                    this.xmlReader = xMLFilter;
                    return;
                }
            }
        }
    }

    public DocumentSource(Document document) {
        setDocument(document);
    }
}
