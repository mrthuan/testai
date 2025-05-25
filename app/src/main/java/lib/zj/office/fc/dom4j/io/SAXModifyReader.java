package lib.zj.office.fc.dom4j.io;

import lib.zj.office.fc.dom4j.DocumentFactory;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
class SAXModifyReader extends SAXReader {
    private boolean pruneElements;
    private XMLWriter xmlWriter;

    public SAXModifyReader() {
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXReader
    public SAXContentHandler createContentHandler(XMLReader xMLReader) {
        SAXModifyContentHandler sAXModifyContentHandler = new SAXModifyContentHandler(getDocumentFactory(), getDispatchHandler());
        sAXModifyContentHandler.setXMLWriter(this.xmlWriter);
        return sAXModifyContentHandler;
    }

    public XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    public boolean isPruneElements() {
        return this.pruneElements;
    }

    public void setPruneElements(boolean z10) {
        this.pruneElements = z10;
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
    }

    public SAXModifyReader(boolean z10) {
        super(z10);
    }

    public SAXModifyReader(DocumentFactory documentFactory) {
        super(documentFactory);
    }

    public SAXModifyReader(DocumentFactory documentFactory, boolean z10) {
        super(documentFactory, z10);
    }

    public SAXModifyReader(XMLReader xMLReader) {
        super(xMLReader);
    }

    public SAXModifyReader(XMLReader xMLReader, boolean z10) {
        super(xMLReader, z10);
    }

    public SAXModifyReader(String str) {
        super(str);
    }

    public SAXModifyReader(String str, boolean z10) {
        super(str, z10);
    }
}
