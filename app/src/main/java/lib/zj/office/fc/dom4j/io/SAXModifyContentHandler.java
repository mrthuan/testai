package lib.zj.office.fc.dom4j.io;

import java.io.IOException;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.ElementHandler;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

/* loaded from: classes3.dex */
class SAXModifyContentHandler extends SAXContentHandler {
    private XMLWriter xmlWriter;

    public SAXModifyContentHandler() {
    }

    private boolean activeHandlers() {
        if (getElementStack().getDispatchHandler().getActiveHandlerCount() > 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i10, int i11) {
        XMLWriter xMLWriter;
        super.characters(cArr, i10, i11);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.characters(cArr, i10, i11);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void comment(char[] cArr, int i10, int i11) {
        XMLWriter xMLWriter;
        super.comment(cArr, i10, i11);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.comment(cArr, i10, i11);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void endCDATA() {
        XMLWriter xMLWriter;
        super.endCDATA();
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.endCDATA();
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void endDTD() {
        super.endDTD();
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.endDTD();
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endDocument() {
        super.endDocument();
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.endDocument();
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        XMLWriter xMLWriter;
        ElementHandler handler = getElementStack().getDispatchHandler().getHandler(getElementStack().getPath());
        super.endElement(str, str2, str3);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            if (handler == null) {
                xMLWriter.endElement(str, str2, str3);
            } else if (handler instanceof SAXModifyElementHandler) {
                try {
                    this.xmlWriter.write(((SAXModifyElementHandler) handler).getModifiedElement());
                } catch (IOException e10) {
                    throw new SAXModifyException(e10);
                }
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void endEntity(String str) {
        super.endEntity(str);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.endEntity(str);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        super.endPrefixMapping(str);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.endPrefixMapping(str);
        }
    }

    public XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i10, int i11) {
        XMLWriter xMLWriter;
        super.ignorableWhitespace(cArr, i10, i11);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.ignorableWhitespace(cArr, i10, i11);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void notationDecl(String str, String str2, String str3) {
        super.notationDecl(str, str2, str3);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.notationDecl(str, str2, str3);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        XMLWriter xMLWriter;
        super.processingInstruction(str, str2);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.processingInstruction(str, str2);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        super.setDocumentLocator(locator);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.setDocumentLocator(locator);
        }
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void skippedEntity(String str) {
        XMLWriter xMLWriter;
        super.skippedEntity(str);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.skippedEntity(str);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void startCDATA() {
        XMLWriter xMLWriter;
        super.startCDATA();
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.startCDATA();
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void startDTD(String str, String str2, String str3) {
        super.startDTD(str, str2, str3);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.startDTD(str, str2, str3);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startDocument() {
        super.startDocument();
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.startDocument();
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        XMLWriter xMLWriter;
        super.startElement(str, str2, str3, attributes);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.startElement(str, str2, str3, attributes);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.ext.LexicalHandler
    public void startEntity(String str) {
        super.startEntity(str);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.startEntity(str);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        super.startPrefixMapping(str, str2);
        XMLWriter xMLWriter = this.xmlWriter;
        if (xMLWriter != null) {
            xMLWriter.startPrefixMapping(str, str2);
        }
    }

    @Override // lib.zj.office.fc.dom4j.io.SAXContentHandler, org.xml.sax.helpers.DefaultHandler, org.xml.sax.DTDHandler
    public void unparsedEntityDecl(String str, String str2, String str3, String str4) {
        XMLWriter xMLWriter;
        super.unparsedEntityDecl(str, str2, str3, str4);
        if (!activeHandlers() && (xMLWriter = this.xmlWriter) != null) {
            xMLWriter.unparsedEntityDecl(str, str2, str3, str4);
        }
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory) {
        super(documentFactory);
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler) {
        super(documentFactory, elementHandler);
    }

    public SAXModifyContentHandler(DocumentFactory documentFactory, ElementHandler elementHandler, ElementStack elementStack) {
        super(documentFactory, elementHandler, elementStack);
    }
}
