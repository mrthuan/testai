package lib.zj.office.fc.dom4j.util;

import java.util.Map;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.NodeFilter;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.XPath;
import lib.zj.office.fc.dom4j.rule.Pattern;

/* loaded from: classes3.dex */
public abstract class ProxyDocumentFactory {
    private DocumentFactory proxy;

    public ProxyDocumentFactory() {
        this.proxy = DocumentFactory.getInstance();
    }

    public Attribute createAttribute(Element element, QName qName, String str) {
        return this.proxy.createAttribute(element, qName, str);
    }

    public CDATA createCDATA(String str) {
        return this.proxy.createCDATA(str);
    }

    public Comment createComment(String str) {
        return this.proxy.createComment(str);
    }

    public DocumentType createDocType(String str, String str2, String str3) {
        return this.proxy.createDocType(str, str2, str3);
    }

    public Document createDocument() {
        return this.proxy.createDocument();
    }

    public Element createElement(QName qName) {
        return this.proxy.createElement(qName);
    }

    public Entity createEntity(String str, String str2) {
        return this.proxy.createEntity(str, str2);
    }

    public Namespace createNamespace(String str, String str2) {
        return this.proxy.createNamespace(str, str2);
    }

    public Pattern createPattern(String str) {
        return this.proxy.createPattern(str);
    }

    public ProcessingInstruction createProcessingInstruction(String str, String str2) {
        return this.proxy.createProcessingInstruction(str, str2);
    }

    public QName createQName(String str, Namespace namespace) {
        return this.proxy.createQName(str, namespace);
    }

    public Text createText(String str) {
        return this.proxy.createText(str);
    }

    public XPath createXPath(String str) {
        return this.proxy.createXPath(str);
    }

    public NodeFilter createXPathFilter(String str) {
        return this.proxy.createXPathFilter(str);
    }

    public DocumentFactory getProxy() {
        return this.proxy;
    }

    public void setProxy(DocumentFactory documentFactory) {
        if (documentFactory == null) {
            documentFactory = DocumentFactory.getInstance();
        }
        this.proxy = documentFactory;
    }

    public Attribute createAttribute(Element element, String str, String str2) {
        return this.proxy.createAttribute(element, str, str2);
    }

    public Document createDocument(Element element) {
        return this.proxy.createDocument(element);
    }

    public Element createElement(String str) {
        return this.proxy.createElement(str);
    }

    public ProcessingInstruction createProcessingInstruction(String str, Map map) {
        return this.proxy.createProcessingInstruction(str, map);
    }

    public QName createQName(String str) {
        return this.proxy.createQName(str);
    }

    public ProxyDocumentFactory(DocumentFactory documentFactory) {
        this.proxy = documentFactory;
    }

    public QName createQName(String str, String str2, String str3) {
        return this.proxy.createQName(str, str2, str3);
    }

    public QName createQName(String str, String str2) {
        return this.proxy.createQName(str, str2);
    }
}
