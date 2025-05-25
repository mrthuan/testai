package lib.zj.office.fc.dom4j.io;

import javax.xml.transform.sax.SAXResult;
import lib.zj.office.fc.dom4j.Document;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes3.dex */
public class DocumentResult extends SAXResult {
    private SAXContentHandler contentHandler;

    public DocumentResult() {
        this(new SAXContentHandler());
    }

    public Document getDocument() {
        return this.contentHandler.getDocument();
    }

    @Override // javax.xml.transform.sax.SAXResult
    public void setHandler(ContentHandler contentHandler) {
        if (contentHandler instanceof SAXContentHandler) {
            SAXContentHandler sAXContentHandler = (SAXContentHandler) contentHandler;
            this.contentHandler = sAXContentHandler;
            super.setHandler(sAXContentHandler);
        }
    }

    @Override // javax.xml.transform.sax.SAXResult
    public void setLexicalHandler(LexicalHandler lexicalHandler) {
        if (lexicalHandler instanceof SAXContentHandler) {
            SAXContentHandler sAXContentHandler = (SAXContentHandler) lexicalHandler;
            this.contentHandler = sAXContentHandler;
            super.setLexicalHandler(sAXContentHandler);
        }
    }

    public DocumentResult(SAXContentHandler sAXContentHandler) {
        this.contentHandler = sAXContentHandler;
        super.setHandler(sAXContentHandler);
        super.setLexicalHandler(this.contentHandler);
    }
}
