package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import java.io.Serializable;
import java.io.Writer;
import java.util.List;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.NodeFilter;
import lib.zj.office.fc.dom4j.XPath;
import lib.zj.office.fc.dom4j.rule.Pattern;

/* loaded from: classes3.dex */
public abstract class AbstractNode implements Node, Cloneable, Serializable {
    protected static final String[] NODE_TYPE_NAMES = {"Node", "Element", "Attribute", "Text", "CDATA", "Entity", "Entity", "ProcessingInstruction", "Comment", StandardStructureTypes.DOCUMENT, "DocumentType", "DocumentFragment", "Notation", "Namespace", OpenTypeScript.UNKNOWN};
    private static final DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();

    @Override // lib.zj.office.fc.dom4j.Node
    public Node asXPathResult(Element element) {
        if (supportsParent()) {
            return this;
        }
        return createXPathResult(element);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Object clone() {
        if (isReadOnly()) {
            return this;
        }
        try {
            Node node = (Node) super.clone();
            node.setParent(null);
            node.setDocument(null);
            return node;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException("This should never happen. Caught: " + e10);
        }
    }

    public Pattern createPattern(String str) {
        return getDocumentFactory().createPattern(str);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public XPath createXPath(String str) {
        return getDocumentFactory().createXPath(str);
    }

    public NodeFilter createXPathFilter(String str) {
        return getDocumentFactory().createXPathFilter(str);
    }

    public Node createXPathResult(Element element) {
        throw new RuntimeException("asXPathResult() not yet implemented fully for: " + this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Node detach() {
        Element parent = getParent();
        if (parent != null) {
            parent.remove(this);
        } else {
            Document document = getDocument();
            if (document != null) {
                document.remove(this);
            }
        }
        setParent(null);
        setDocument(null);
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Document getDocument() {
        Element parent = getParent();
        if (parent != null) {
            return parent.getDocument();
        }
        return null;
    }

    public DocumentFactory getDocumentFactory() {
        return DOCUMENT_FACTORY;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getName() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 14;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getNodeTypeName() {
        short nodeType = getNodeType();
        if (nodeType >= 0) {
            String[] strArr = NODE_TYPE_NAMES;
            if (nodeType < strArr.length) {
                return strArr[nodeType];
            }
            return OpenTypeScript.UNKNOWN;
        }
        return OpenTypeScript.UNKNOWN;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Element getParent() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath() {
        return getPath(null);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getStringValue() {
        return getText();
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getText() {
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath() {
        return getUniquePath(null);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public boolean hasContent() {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public boolean isReadOnly() {
        return true;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public boolean matches(String str) {
        return createXPathFilter(str).matches(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Number numberValueOf(String str) {
        return createXPath(str).numberValueOf(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public List selectNodes(String str) {
        return createXPath(str).selectNodes(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Object selectObject(String str) {
        return createXPath(str).evaluate(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public Node selectSingleNode(String str) {
        return createXPath(str).selectSingleNode(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void setName(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        throw new UnsupportedOperationException("This node cannot be modified");
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String valueOf(String str) {
        return createXPath(str).valueOf(this);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        writer.write(asXML());
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public List selectNodes(String str, String str2) {
        return selectNodes(str, str2, false);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public List selectNodes(String str, String str2, boolean z10) {
        return createXPath(str).selectNodes(this, createXPath(str2), z10);
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void setDocument(Document document) {
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void setParent(Element element) {
    }
}
