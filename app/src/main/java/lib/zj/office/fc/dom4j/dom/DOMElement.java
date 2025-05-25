package lib.zj.office.fc.dom4j.dom;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.DefaultElement;
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
public class DOMElement extends DefaultElement implements Element {
    private static final DocumentFactory DOCUMENT_FACTORY = DOMDocumentFactory.getInstance();

    public DOMElement(String str) {
        super(str);
    }

    private void checkNewChildNode(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1 && nodeType != 3 && nodeType != 8 && nodeType != 7 && nodeType != 4 && nodeType != 5) {
            throw new DOMException((short) 3, "Given node cannot be a child of element");
        }
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    public Attribute attribute(Attr attr) {
        return attribute(DOCUMENT_FACTORY.createQName(attr.getLocalName(), attr.getPrefix(), attr.getNamespaceURI()));
    }

    @Override // org.w3c.dom.Node
    public Node cloneNode(boolean z10) {
        return DOMNodeHelper.cloneNode(this, z10);
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) {
        return (short) 0;
    }

    public Attribute createAttribute(Attr attr) {
        QName createQName;
        String localName = attr.getLocalName();
        if (localName != null) {
            createQName = getDocumentFactory().createQName(localName, attr.getPrefix(), attr.getNamespaceURI());
        } else {
            createQName = getDocumentFactory().createQName(attr.getName());
        }
        return new DOMAttribute(createQName, attr.getValue());
    }

    @Override // org.w3c.dom.Element
    public String getAttribute(String str) {
        String attributeValue = attributeValue(str);
        if (attributeValue == null) {
            return "";
        }
        return attributeValue;
    }

    @Override // org.w3c.dom.Element
    public String getAttributeNS(String str, String str2) {
        String value;
        Attribute attribute = attribute(str, str2);
        if (attribute != null && (value = attribute.getValue()) != null) {
            return value;
        }
        return "";
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNode(String str) {
        return DOMNodeHelper.asDOMAttr(attribute(str));
    }

    @Override // org.w3c.dom.Element
    public Attr getAttributeNodeNS(String str, String str2) {
        Attribute attribute = attribute(str, str2);
        if (attribute != null) {
            DOMNodeHelper.asDOMAttr(attribute);
            return null;
        }
        return null;
    }

    @Override // org.w3c.dom.Node
    public NamedNodeMap getAttributes() {
        return new DOMAttributeNodeMap(this);
    }

    @Override // org.w3c.dom.Node
    public String getBaseURI() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public NodeList getChildNodes() {
        return DOMNodeHelper.createNodeList(content());
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.tree.AbstractNode
    public DocumentFactory getDocumentFactory() {
        DocumentFactory documentFactory = getQName().getDocumentFactory();
        if (documentFactory == null) {
            return DOCUMENT_FACTORY;
        }
        return documentFactory;
    }

    @Override // org.w3c.dom.Element
    public NodeList getElementsByTagName(String str) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagName(arrayList, this, str);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override // org.w3c.dom.Element
    public NodeList getElementsByTagNameNS(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        DOMNodeHelper.appendElementsByTagNameNS(arrayList, this, str, str2);
        return DOMNodeHelper.createNodeList(arrayList);
    }

    @Override // org.w3c.dom.Node
    public Object getFeature(String str, String str2) {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Node getFirstChild() {
        return DOMNodeHelper.asDOMNode(node(0));
    }

    @Override // org.w3c.dom.Node
    public Node getLastChild() {
        return DOMNodeHelper.asDOMNode(node(nodeCount() - 1));
    }

    @Override // org.w3c.dom.Node
    public String getLocalName() {
        return getQName().getName();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element, org.w3c.dom.Node
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
        return null;
    }

    @Override // org.w3c.dom.Node
    public Document getOwnerDocument() {
        return DOMNodeHelper.getOwnerDocument(this);
    }

    @Override // org.w3c.dom.Node
    public Node getParentNode() {
        return DOMNodeHelper.getParentNode(this);
    }

    @Override // org.w3c.dom.Node
    public String getPrefix() {
        return getQName().getNamespacePrefix();
    }

    @Override // org.w3c.dom.Node
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    public QName getQName(String str, String str2) {
        String str3;
        int indexOf = str2.indexOf(58);
        if (indexOf >= 0) {
            str3 = str2.substring(0, indexOf);
            str2 = str2.substring(indexOf + 1);
        } else {
            str3 = "";
        }
        return getDocumentFactory().createQName(str2, str3, str);
    }

    @Override // org.w3c.dom.Element
    public TypeInfo getSchemaTypeInfo() {
        return null;
    }

    @Override // org.w3c.dom.Element
    public String getTagName() {
        return getName();
    }

    @Override // org.w3c.dom.Node
    public String getTextContent() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
        return null;
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttribute(String str) {
        if (attribute(str) != null) {
            return true;
        }
        return false;
    }

    @Override // org.w3c.dom.Element
    public boolean hasAttributeNS(String str, String str2) {
        if (attribute(str, str2) != null) {
            return true;
        }
        return false;
    }

    @Override // org.w3c.dom.Node
    public boolean hasAttributes() {
        return DOMNodeHelper.hasAttributes(this);
    }

    @Override // org.w3c.dom.Node
    public boolean hasChildNodes() {
        if (nodeCount() > 0) {
            return true;
        }
        return false;
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

    @Override // org.w3c.dom.Element
    public void removeAttribute(String str) {
        Attribute attribute = attribute(str);
        if (attribute != null) {
            remove(attribute);
        }
    }

    @Override // org.w3c.dom.Element
    public void removeAttributeNS(String str, String str2) {
        Attribute attribute = attribute(str, str2);
        if (attribute != null) {
            remove(attribute);
        }
    }

    @Override // org.w3c.dom.Element
    public Attr removeAttributeNode(Attr attr) {
        Attribute attribute = attribute(attr);
        if (attribute != null) {
            attribute.detach();
            return DOMNodeHelper.asDOMAttr(attribute);
        }
        throw new DOMException((short) 8, "No such attribute");
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

    @Override // org.w3c.dom.Element
    public void setAttribute(String str, String str2) {
        addAttribute(str, str2);
    }

    @Override // org.w3c.dom.Element
    public void setAttributeNS(String str, String str2, String str3) {
        Attribute attribute = attribute(str, str2);
        if (attribute != null) {
            attribute.setValue(str3);
        } else {
            addAttribute(getQName(str, str2), str3);
        }
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNode(Attr attr) {
        if (!isReadOnly()) {
            Attribute attribute = attribute(attr);
            if (attribute != attr) {
                if (attr.getOwnerElement() == null) {
                    Attribute createAttribute = createAttribute(attr);
                    if (attribute != null) {
                        attribute.detach();
                    }
                    add(createAttribute);
                } else {
                    throw new DOMException((short) 10, "Attribute is already in use");
                }
            }
            return DOMNodeHelper.asDOMAttr(attribute);
        }
        throw new DOMException((short) 7, "No modification allowed");
    }

    @Override // org.w3c.dom.Element
    public Attr setAttributeNodeNS(Attr attr) {
        Attribute attribute = attribute(attr.getNamespaceURI(), attr.getLocalName());
        if (attribute != null) {
            attribute.setValue(attr.getValue());
        } else {
            attribute = createAttribute(attr);
            add(attribute);
        }
        return DOMNodeHelper.asDOMAttr(attribute);
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

    public DOMElement(QName qName) {
        super(qName);
    }

    public DOMElement(QName qName, int i10) {
        super(qName, i10);
    }

    public DOMElement(String str, Namespace namespace) {
        super(str, namespace);
    }

    public Attribute attribute(String str, String str2) {
        List attributeList = attributeList();
        int size = attributeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Attribute attribute = (Attribute) attributeList.get(i10);
            if (str2.equals(attribute.getName()) && (((str == null || str.length() == 0) && (attribute.getNamespaceURI() == null || attribute.getNamespaceURI().length() == 0)) || (str != null && str.equals(attribute.getNamespaceURI())))) {
                return attribute;
            }
        }
        return null;
    }

    @Override // org.w3c.dom.Node
    public void setNodeValue(String str) {
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttribute(String str, boolean z10) {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNode(Attr attr, boolean z10) {
    }

    @Override // org.w3c.dom.Element
    public void setIdAttributeNS(String str, String str2, boolean z10) {
    }
}
