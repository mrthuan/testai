package lib.zj.office.fc.dom4j.tree;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.Visitor;
import lib.zj.office.fc.dom4j.io.OutputFormat;
import lib.zj.office.fc.dom4j.io.XMLWriter;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public abstract class AbstractDocument extends AbstractBranch implements Document {
    protected String encoding;

    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
        DocumentType docType = getDocType();
        if (docType != null) {
            visitor.visit(docType);
        }
        List content = content();
        if (content != null) {
            for (Object obj : content) {
                if (obj instanceof String) {
                    visitor.visit(getDocumentFactory().createText((String) obj));
                } else {
                    ((Node) obj).accept(visitor);
                }
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public void add(Element element) {
        checkAddElementAllowed(element);
        super.add(element);
        rootElementAdded(element);
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public Document addComment(String str) {
        add(getDocumentFactory().createComment(str));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Element addElement(String str) {
        Element createElement = getDocumentFactory().createElement(str);
        add(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public Document addProcessingInstruction(String str, String str2) {
        add(getDocumentFactory().createProcessingInstruction(str, str2));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setEncoding(this.encoding);
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter, outputFormat);
            xMLWriter.write((Document) this);
            xMLWriter.flush();
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException("IOException while generating textual representation: " + e10.getMessage());
        }
    }

    public void checkAddElementAllowed(Element element) {
        Element rootElement = getRootElement();
        if (rootElement == null) {
            return;
        }
        throw new IllegalAddException(this, element, "Cannot add another element to this Document as it already has a root element of: " + rootElement.getQualifiedName());
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void childAdded(Node node) {
        if (node != null) {
            node.setDocument(this);
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void childRemoved(Node node) {
        if (node != null) {
            node.setDocument(null);
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 9;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        return PackagingURIHelper.FORWARD_SLASH_STRING;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getStringValue() {
        Element rootElement = getRootElement();
        if (rootElement != null) {
            return rootElement.getStringValue();
        }
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        return PackagingURIHelper.FORWARD_SLASH_STRING;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public String getXMLEncoding() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void normalize() {
        Element rootElement = getRootElement();
        if (rootElement != null) {
            rootElement.normalize();
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public boolean remove(Element element) {
        boolean remove = super.remove(element);
        if (getRootElement() != null && remove) {
            setRootElement(null);
        }
        element.setDocument(null);
        return remove;
    }

    public abstract void rootElementAdded(Element element);

    @Override // lib.zj.office.fc.dom4j.Document
    public void setRootElement(Element element) {
        clearContent();
        if (element != null) {
            super.add(element);
            rootElementAdded(element);
        }
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public void setXMLEncoding(String str) {
        this.encoding = str;
    }

    public String toString() {
        return super.toString() + " [Document: name " + getName() + "]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        OutputFormat outputFormat = new OutputFormat();
        outputFormat.setEncoding(this.encoding);
        new XMLWriter(writer, outputFormat).write((Document) this);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Element addElement(String str, String str2) {
        Element createElement = getDocumentFactory().createElement(str, str2);
        add(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public Document addProcessingInstruction(String str, Map map) {
        add(getDocumentFactory().createProcessingInstruction(str, map));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Element addElement(QName qName) {
        Element createElement = getDocumentFactory().createElement(qName);
        add(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Document getDocument() {
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Node asXPathResult(Element element) {
        return this;
    }
}
