package lib.zj.office.fc.dom4j.io;

import java.io.IOException;
import lib.zj.office.fc.dom4j.Document;
import org.xml.sax.ErrorHandler;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
public class SAXValidator {
    private ErrorHandler errorHandler;
    private XMLReader xmlReader;

    public SAXValidator() {
    }

    public void configureReader() {
        if (this.xmlReader.getContentHandler() == null) {
            this.xmlReader.setContentHandler(new DefaultHandler());
        }
        this.xmlReader.setFeature("http://xml.org/sax/features/validation", true);
        this.xmlReader.setFeature("http://xml.org/sax/features/namespaces", true);
        this.xmlReader.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
    }

    public XMLReader createXMLReader() {
        return SAXHelper.createXMLReader(true);
    }

    public ErrorHandler getErrorHandler() {
        return this.errorHandler;
    }

    public XMLReader getXMLReader() {
        if (this.xmlReader == null) {
            this.xmlReader = createXMLReader();
            configureReader();
        }
        return this.xmlReader;
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public void setXMLReader(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
        configureReader();
    }

    public void validate(Document document) {
        if (document != null) {
            XMLReader xMLReader = getXMLReader();
            ErrorHandler errorHandler = this.errorHandler;
            if (errorHandler != null) {
                xMLReader.setErrorHandler(errorHandler);
            }
            try {
                xMLReader.parse(new DocumentInputSource(document));
            } catch (IOException e10) {
                throw new RuntimeException("Caught and exception that should never happen: " + e10);
            }
        }
    }

    public SAXValidator(XMLReader xMLReader) {
        this.xmlReader = xMLReader;
    }
}
