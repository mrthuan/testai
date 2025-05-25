package lib.zj.office.fc.dom4j.jaxb;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.io.OutputFormat;
import lib.zj.office.fc.dom4j.io.XMLWriter;

/* loaded from: classes3.dex */
public class JAXBWriter extends JAXBSupport {
    private OutputFormat outputFormat;
    private XMLWriter xmlWriter;

    public JAXBWriter(String str) {
        super(str);
        this.outputFormat = new OutputFormat();
    }

    private XMLWriter getWriter() {
        if (this.xmlWriter == null) {
            if (this.outputFormat != null) {
                this.xmlWriter = new XMLWriter(this.outputFormat);
            } else {
                this.xmlWriter = new XMLWriter();
            }
        }
        return this.xmlWriter;
    }

    public void endDocument() {
        getWriter().endDocument();
    }

    public OutputFormat getOutputFormat() {
        return this.outputFormat;
    }

    public void setOutput(File file) {
        getWriter().setOutputStream(new FileOutputStream(file));
    }

    public void startDocument() {
        getWriter().startDocument();
    }

    public void writeCloseElement(Element element) {
        getWriter().writeClose(element);
    }

    public void writeElement(Element element) {
        getWriter().write(element);
    }

    public void writeOpenElement(Element element) {
        getWriter().writeOpen(element);
    }

    public void setOutput(OutputStream outputStream) {
        getWriter().setOutputStream(outputStream);
    }

    public JAXBWriter(String str, OutputFormat outputFormat) {
        super(str);
        this.outputFormat = outputFormat;
    }

    public void setOutput(Writer writer) {
        getWriter().setWriter(writer);
    }

    public JAXBWriter(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public JAXBWriter(String str, ClassLoader classLoader, OutputFormat outputFormat) {
        super(str, classLoader);
        this.outputFormat = outputFormat;
    }
}
