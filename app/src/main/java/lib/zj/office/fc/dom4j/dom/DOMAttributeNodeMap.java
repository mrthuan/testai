package lib.zj.office.fc.dom4j.dom;

import a0.a;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public class DOMAttributeNodeMap implements NamedNodeMap {
    private DOMElement element;

    public DOMAttributeNodeMap(DOMElement dOMElement) {
        this.element = dOMElement;
    }

    public void foo() {
        DOMNodeHelper.notSupported();
    }

    @Override // org.w3c.dom.NamedNodeMap
    public int getLength() {
        return this.element.attributeCount();
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node getNamedItem(String str) {
        return this.element.getAttributeNode(str);
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node getNamedItemNS(String str, String str2) {
        return this.element.getAttributeNodeNS(str, str2);
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node item(int i10) {
        return DOMNodeHelper.asDOMAttr(this.element.attribute(i10));
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node removeNamedItem(String str) {
        Attr attributeNode = this.element.getAttributeNode(str);
        if (attributeNode != null) {
            return this.element.removeAttributeNode(attributeNode);
        }
        throw new DOMException((short) 8, a.h("No attribute named ", str));
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node removeNamedItemNS(String str, String str2) {
        Attr attributeNodeNS = this.element.getAttributeNodeNS(str, str2);
        if (attributeNodeNS != null) {
            return this.element.removeAttributeNode(attributeNodeNS);
        }
        return attributeNodeNS;
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node setNamedItem(Node node) {
        if (node instanceof Attr) {
            return this.element.setAttributeNode((Attr) node);
        }
        throw new DOMException((short) 9, "Node is not an Attr: " + node);
    }

    @Override // org.w3c.dom.NamedNodeMap
    public Node setNamedItemNS(Node node) {
        if (node instanceof Attr) {
            return this.element.setAttributeNodeNS((Attr) node);
        }
        throw new DOMException((short) 9, "Node is not an Attr: " + node);
    }
}
