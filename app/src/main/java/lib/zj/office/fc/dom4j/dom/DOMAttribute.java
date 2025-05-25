package lib.zj.office.fc.dom4j.dom;

import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.DefaultAttribute;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;

/* loaded from: classes3.dex */
public class DOMAttribute extends DefaultAttribute implements Attr {
    public DOMAttribute(QName qName) {
        super(qName);
    }

    private void checkNewChildNode(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 3 && nodeType != 5) {
            throw new DOMException((short) 3, "The node cannot be a child of attribute");
        }
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    @Override // org.w3c.dom.Node
    public Node cloneNode(boolean z10) {
        return DOMNodeHelper.cloneNode(this, z10);
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) {
        return (short) 0;
    }

    @Override // org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String getBaseURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public NodeList getChildNodes() {
        return DOMNodeHelper.getChildNodes(this);
    }

    @Override // org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node getFirstChild() {
        return DOMNodeHelper.getFirstChild(this);
    }

    @Override // org.w3c.dom.Node
    public Node getLastChild() {
        return DOMNodeHelper.getLastChild(this);
    }

    @Override // org.w3c.dom.Node
    public String getLocalName() {
        return getQName().getName();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractAttribute, lib.zj.office.fc.dom4j.Attribute, org.w3c.dom.Node
    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    @Override // org.w3c.dom.Node
    public Node getNextSibling() {
        return DOMNodeHelper.getNextSibling(this);
    }

    @Override // org.w3c.dom.Node
    public String getNodeName() {
        return getName();
    }

    @Override // org.w3c.dom.Node
    public String getNodeValue() {
        return DOMNodeHelper.getNodeValue(this);
    }

    @Override // org.w3c.dom.Node
    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    @Override // org.w3c.dom.Attr
    public Element getOwnerElement() {
        return DOMNodeHelper.asDOMElement(getParent());
    }

    @Override // org.w3c.dom.Node
    public Node getParentNode() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String getPrefix() {
        return getQName().getNamespacePrefix();
    }

    @Override // org.w3c.dom.Node
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    @Override // org.w3c.dom.Attr
    public TypeInfo getSchemaTypeInfo() {
        return null;
    }

    @Override // org.w3c.dom.Attr
    public boolean getSpecified() {
        return true;
    }

    @Override // org.w3c.dom.Node
    public String getTextContent() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    @Override // org.w3c.dom.Node
    public boolean hasChildNodes() {
        return DOMNodeHelper.hasChildNodes(this);
    }

    @Override // org.w3c.dom.Node
    public Node insertBefore(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.insertBefore(this, node, node2);
    }

    @Override // org.w3c.dom.Node
    public boolean isDefaultNamespace(String str) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isEqualNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Attr
    public boolean isId() {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isSameNode(Node node) {
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean isSupported(String str, String str2) {
        return DOMNodeHelper.isSupported(this, str, str2);
    }

    @Override // org.w3c.dom.Node
    public String lookupNamespaceURI(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public String lookupPrefix(String str) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public void normalize() {
        DOMNodeHelper.normalize(this);
    }

    @Override // org.w3c.dom.Node
    public Node removeChild(Node node) {
        return DOMNodeHelper.removeChild(this, node);
    }

    @Override // org.w3c.dom.Node
    public Node replaceChild(Node node, Node node2) {
        checkNewChildNode(node);
        return DOMNodeHelper.replaceChild(this, node, node2);
    }

    @Override // org.w3c.dom.Node
    public void setNodeValue(String str) {
        DOMNodeHelper.setNodeValue(this, str);
    }

    @Override // org.w3c.dom.Node
    public void setPrefix(String str) {
        DOMNodeHelper.setPrefix(this, str);
    }

    @Override // org.w3c.dom.Node
    public Object setUserData(String str, Object obj, UserDataHandler userDataHandler) {
        return null;
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }

    public DOMAttribute(QName qName, String str) {
        super(qName, str);
    }

    public DOMAttribute(lib.zj.office.fc.dom4j.Element element, QName qName, String str) {
        super(element, qName, str);
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) {
    }
}
