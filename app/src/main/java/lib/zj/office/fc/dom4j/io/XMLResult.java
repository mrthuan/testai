package lib.zj.office.fc.dom4j.io;

import java.io.OutputStream;
import java.io.Writer;
import javax.xml.transform.sax.SAXResult;
import org.xml.sax.ContentHandler;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes3.dex */
public class XMLResult extends SAXResult {
    private XMLWriter xmlWriter;

    public XMLResult() {
        this(new XMLWriter());
    }

    @Override // javax.xml.transform.sax.SAXResult
    public ContentHandler getHandler() {
        return this.xmlWriter;
    }

    @Override // javax.xml.transform.sax.SAXResult
    public LexicalHandler getLexicalHandler() {
        return this.xmlWriter;
    }

    public XMLWriter getXMLWriter() {
        return this.xmlWriter;
    }

    public void setXMLWriter(XMLWriter xMLWriter) {
        this.xmlWriter = xMLWriter;
        setHandler(xMLWriter);
        setLexicalHandler(this.xmlWriter);
    }

    public XMLResult(Writer writer) {
        this(new XMLWriter(writer));
    }

    public XMLResult(Writer writer, OutputFormat outputFormat) {
        this(new XMLWriter(writer, outputFormat));
    }

    public XMLResult(OutputStream outputStream) {
        this(new XMLWriter(outputStream));
    }

    public XMLResult(OutputStream outputStream, OutputFormat outputFormat) {
        this(new XMLWriter(outputStream, outputFormat));
    }

    public XMLResult(XMLWriter xMLWriter) {
        super(xMLWriter);
        this.xmlWriter = xMLWriter;
        setLexicalHandler(xMLWriter);
    }
}
