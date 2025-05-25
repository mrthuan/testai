package lib.zj.office.fc.dom4j.dom;

import b.a;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.tree.DefaultCDATA;
import org.w3c.dom.CDATASection;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

/* loaded from: classes3.dex */
public class DOMCDATA extends DefaultCDATA implements CDATASection {
    public DOMCDATA(String str) {
        super(str);
    }

    private void checkNewChildNode(Node node) {
        throw new DOMException((short) 3, "CDATASection nodes cannot have children");
    }

    @Override // org.w3c.dom.Node
    public Node appendChild(Node node) {
        checkNewChildNode(node);
        return DOMNodeHelper.appendChild(this, node);
    }

    @Override // org.w3c.dom.CharacterData
    public void appendData(String str) {
        DOMNodeHelper.appendData(this, str);
    }

    @Override // org.w3c.dom.Node
    public Node cloneNode(boolean z10) {
        return DOMNodeHelper.cloneNode(this, z10);
    }

    @Override // org.w3c.dom.Node
    public short compareDocumentPosition(Node node) {
        return (short) 0;
    }

    public CDATA createCDATA(String str) {
        return new DOMCDATA(str);
    }

    @Override // org.w3c.dom.CharacterData
    public void deleteData(int i10, int i11) {
        DOMNodeHelper.deleteData(this, i10, i11);
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

    @Override // org.w3c.dom.CharacterData
    public String getData() {
        return DOMNodeHelper.getData(this);
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

    @Override // org.w3c.dom.CharacterData
    public int getLength() {
        return DOMNodeHelper.getLength(this);
    }

    @Override // org.w3c.dom.Node
    public String getLocalName() {
        return DOMNodeHelper.getLocalName(this);
    }

    @Override // org.w3c.dom.Node
    public String getNamespaceURI() {
        return DOMNodeHelper.getNamespaceURI(this);
    }

    @Override // org.w3c.dom.Node
    public Node getNextSibling() {
        return DOMNodeHelper.getNextSibling(this);
    }

    @Override // org.w3c.dom.Node
    public String getNodeName() {
        return "#cdata-section";
    }

    @Override // org.w3c.dom.Node
    public String getNodeValue() {
        return DOMNodeHelper.getNodeValue(this);
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
        return DOMNodeHelper.getPrefix(this);
    }

    @Override // org.w3c.dom.Node
    public Node getPreviousSibling() {
        return DOMNodeHelper.getPreviousSibling(this);
    }

    @Override // org.w3c.dom.Node
    public String getTextContent() {
        return null;
    }

    @Override // org.w3c.dom.Node
    public Object getUserData(String str) {
        return null;
    }

    @Override // org.w3c.dom.Text
    public String getWholeText() {
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

    @Override // org.w3c.dom.CharacterData
    public void insertData(int i10, String str) {
        DOMNodeHelper.insertData(this, i10, str);
    }

    @Override // org.w3c.dom.Node
    public boolean isDefaultNamespace(String str) {
        return false;
    }

    @Override // org.w3c.dom.Text
    public boolean isElementContentWhitespace() {
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

    @Override // org.w3c.dom.CharacterData
    public void replaceData(int i10, int i11, String str) {
        DOMNodeHelper.replaceData(this, i10, i11, str);
    }

    @Override // org.w3c.dom.Text
    public Text replaceWholeText(String str) {
        return null;
    }

    @Override // org.w3c.dom.CharacterData
    public void setData(String str) {
        DOMNodeHelper.setData(this, str);
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

    @Override // org.w3c.dom.Text
    public Text splitText(int i10) {
        int i11;
        if (!isReadOnly()) {
            String text = getText();
            if (text != null) {
                i11 = text.length();
            } else {
                i11 = 0;
            }
            if (i10 >= 0 && i10 < i11) {
                String substring = text.substring(0, i10);
                String substring2 = text.substring(i10);
                setText(substring);
                Element parent = getParent();
                CDATA createCDATA = createCDATA(substring2);
                if (parent != null) {
                    parent.add(createCDATA);
                }
                return DOMNodeHelper.asDOMText(createCDATA);
            }
            throw new DOMException((short) 1, a.c("No text at offset: ", i10));
        }
        throw new DOMException((short) 7, "CharacterData node is read only: " + this);
    }

    @Override // org.w3c.dom.CharacterData
    public String substringData(int i10, int i11) {
        return DOMNodeHelper.substringData(this, i10, i11);
    }

    public boolean supports(String str, String str2) {
        return DOMNodeHelper.supports(this, str, str2);
    }

    public DOMCDATA(Element element, String str) {
        super(element, str);
    }

    @Override // org.w3c.dom.Node
    public void setTextContent(String str) {
    }
}
