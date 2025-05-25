package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.DocumentHelper;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

/* loaded from: classes3.dex */
public class XMLErrorHandler implements ErrorHandler {
    protected static final QName ERROR_QNAME = QName.get("error");
    protected static final QName FATALERROR_QNAME = QName.get("fatalError");
    protected static final QName WARNING_QNAME = QName.get("warning");
    private QName errorQName;
    private Element errors;
    private QName fatalErrorQName;
    private QName warningQName;

    public XMLErrorHandler() {
        this.errorQName = ERROR_QNAME;
        this.fatalErrorQName = FATALERROR_QNAME;
        this.warningQName = WARNING_QNAME;
        this.errors = DocumentHelper.createElement("errors");
    }

    public void addException(Element element, SAXParseException sAXParseException) {
        element.addAttribute("column", Integer.toString(sAXParseException.getColumnNumber()));
        element.addAttribute("line", Integer.toString(sAXParseException.getLineNumber()));
        String publicId = sAXParseException.getPublicId();
        if (publicId != null && publicId.length() > 0) {
            element.addAttribute("publicID", publicId);
        }
        String systemId = sAXParseException.getSystemId();
        if (systemId != null && systemId.length() > 0) {
            element.addAttribute("systemID", systemId);
        }
        element.addText(sAXParseException.getMessage());
    }

    @Override // org.xml.sax.ErrorHandler
    public void error(SAXParseException sAXParseException) {
        addException(this.errors.addElement(this.errorQName), sAXParseException);
    }

    @Override // org.xml.sax.ErrorHandler
    public void fatalError(SAXParseException sAXParseException) {
        addException(this.errors.addElement(this.fatalErrorQName), sAXParseException);
    }

    public QName getErrorQName() {
        return this.errorQName;
    }

    public Element getErrors() {
        return this.errors;
    }

    public QName getFatalErrorQName() {
        return this.fatalErrorQName;
    }

    public QName getWarningQName() {
        return this.warningQName;
    }

    public void setErrorQName(QName qName) {
        this.errorQName = qName;
    }

    public void setErrors(Element element) {
        this.errors = element;
    }

    public void setFatalErrorQName(QName qName) {
        this.fatalErrorQName = qName;
    }

    public void setWarningQName(QName qName) {
        this.warningQName = qName;
    }

    @Override // org.xml.sax.ErrorHandler
    public void warning(SAXParseException sAXParseException) {
        addException(this.errors.addElement(this.warningQName), sAXParseException);
    }

    public XMLErrorHandler(Element element) {
        this.errorQName = ERROR_QNAME;
        this.fatalErrorQName = FATALERROR_QNAME;
        this.warningQName = WARNING_QNAME;
        this.errors = element;
    }
}
