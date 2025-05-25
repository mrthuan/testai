package lib.zj.office.fc.dom4j.dom;

import b.a;
import java.util.List;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.CharacterData;
import lib.zj.office.fc.dom4j.Element;
import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

/* loaded from: classes3.dex */
public class DOMNodeHelper {
    public static final NodeList EMPTY_NODE_LIST = new EmptyNodeList();

    /* loaded from: classes3.dex */
    public static class EmptyNodeList implements NodeList {
        @Override // org.w3c.dom.NodeList
        public int getLength() {
            return 0;
        }

        @Override // org.w3c.dom.NodeList
        public Node item(int i10) {
            return null;
        }
    }

    public static Node appendChild(lib.zj.office.fc.dom4j.Node node, Node node2) {
        if (node instanceof Branch) {
            Branch branch = (Branch) node;
            Node parentNode = node2.getParentNode();
            if (parentNode != null) {
                parentNode.removeChild(node2);
            }
            branch.add((lib.zj.office.fc.dom4j.Node) node2);
            return node2;
        }
        throw new DOMException((short) 3, "Children not allowed for this node: " + node);
    }

    public static void appendData(CharacterData characterData, String str) {
        if (!characterData.isReadOnly()) {
            String text = characterData.getText();
            if (text == null) {
                characterData.setText(text);
                return;
            }
            characterData.setText(text + str);
            return;
        }
        throw new DOMException((short) 7, "CharacterData node is read only: " + characterData);
    }

    public static void appendElementsByTagName(List list, Branch branch, String str) {
        boolean equals = "*".equals(str);
        int nodeCount = branch.nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            lib.zj.office.fc.dom4j.Node node = branch.node(i10);
            if (node instanceof Element) {
                Element element = (Element) node;
                if (equals || str.equals(element.getName())) {
                    list.add(element);
                }
                appendElementsByTagName(list, element, str);
            }
        }
    }

    public static void appendElementsByTagNameNS(List list, Branch branch, String str, String str2) {
        boolean equals = "*".equals(str);
        boolean equals2 = "*".equals(str2);
        int nodeCount = branch.nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            lib.zj.office.fc.dom4j.Node node = branch.node(i10);
            if (node instanceof Element) {
                Element element = (Element) node;
                if ((equals || (((str == null || str.length() == 0) && (element.getNamespaceURI() == null || element.getNamespaceURI().length() == 0)) || (str != null && str.equals(element.getNamespaceURI())))) && (equals2 || str2.equals(element.getName()))) {
                    list.add(element);
                }
                appendElementsByTagNameNS(list, element, str, str2);
            }
        }
    }

    public static Attr asDOMAttr(lib.zj.office.fc.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof Attr) {
            return (Attr) node;
        }
        notSupported();
        return null;
    }

    public static Document asDOMDocument(lib.zj.office.fc.dom4j.Document document) {
        if (document == null) {
            return null;
        }
        if (document instanceof Document) {
            return (Document) document;
        }
        notSupported();
        return null;
    }

    public static DocumentType asDOMDocumentType(lib.zj.office.fc.dom4j.DocumentType documentType) {
        if (documentType == null) {
            return null;
        }
        if (documentType instanceof DocumentType) {
            return (DocumentType) documentType;
        }
        notSupported();
        return null;
    }

    public static org.w3c.dom.Element asDOMElement(lib.zj.office.fc.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof org.w3c.dom.Element) {
            return (org.w3c.dom.Element) node;
        }
        notSupported();
        return null;
    }

    public static Node asDOMNode(lib.zj.office.fc.dom4j.Node node) {
        if (node == null) {
            return null;
        }
        if (node instanceof Node) {
            return (Node) node;
        }
        notSupported();
        return null;
    }

    public static Text asDOMText(CharacterData characterData) {
        if (characterData == null) {
            return null;
        }
        if (characterData instanceof Text) {
            return (Text) characterData;
        }
        notSupported();
        return null;
    }

    public static Node cloneNode(lib.zj.office.fc.dom4j.Node node, boolean z10) {
        return asDOMNode((lib.zj.office.fc.dom4j.Node) node.clone());
    }

    public static NodeList createNodeList(final List list) {
        return new NodeList() { // from class: lib.zj.office.fc.dom4j.dom.DOMNodeHelper.1
            @Override // org.w3c.dom.NodeList
            public int getLength() {
                return list.size();
            }

            @Override // org.w3c.dom.NodeList
            public Node item(int i10) {
                if (i10 >= getLength()) {
                    return null;
                }
                return DOMNodeHelper.asDOMNode((lib.zj.office.fc.dom4j.Node) list.get(i10));
            }
        };
    }

    public static void deleteData(CharacterData characterData, int i10, int i11) {
        if (!characterData.isReadOnly()) {
            if (i11 >= 0) {
                String text = characterData.getText();
                if (text != null) {
                    int length = text.length();
                    if (i10 >= 0 && i10 < length) {
                        StringBuffer stringBuffer = new StringBuffer(text);
                        stringBuffer.delete(i10, i11 + i10);
                        characterData.setText(stringBuffer.toString());
                        return;
                    }
                    throw new DOMException((short) 1, a.c("No text at offset: ", i10));
                }
                return;
            }
            throw new DOMException((short) 1, a.c("Illegal value for count: ", i11));
        }
        throw new DOMException((short) 7, "CharacterData node is read only: " + characterData);
    }

    public static NamedNodeMap getAttributes(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static NodeList getChildNodes(lib.zj.office.fc.dom4j.Node node) {
        return EMPTY_NODE_LIST;
    }

    public static String getData(CharacterData characterData) {
        return characterData.getText();
    }

    public static Node getFirstChild(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static Node getLastChild(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static int getLength(CharacterData characterData) {
        String text = characterData.getText();
        if (text != null) {
            return text.length();
        }
        return 0;
    }

    public static String getLocalName(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static String getNamespaceURI(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static Node getNextSibling(lib.zj.office.fc.dom4j.Node node) {
        int indexOf;
        int i10;
        Element parent = node.getParent();
        if (parent != null && (indexOf = parent.indexOf(node)) >= 0 && (i10 = indexOf + 1) < parent.nodeCount()) {
            return asDOMNode(parent.node(i10));
        }
        return null;
    }

    public static String getNodeValue(lib.zj.office.fc.dom4j.Node node) {
        return node.getText();
    }

    public static Document getOwnerDocument(lib.zj.office.fc.dom4j.Node node) {
        return asDOMDocument(node.getDocument());
    }

    public static Node getParentNode(lib.zj.office.fc.dom4j.Node node) {
        return asDOMNode(node.getParent());
    }

    public static String getPrefix(lib.zj.office.fc.dom4j.Node node) {
        return null;
    }

    public static Node getPreviousSibling(lib.zj.office.fc.dom4j.Node node) {
        int indexOf;
        Element parent = node.getParent();
        if (parent != null && (indexOf = parent.indexOf(node)) > 0) {
            return asDOMNode(parent.node(indexOf - 1));
        }
        return null;
    }

    public static boolean hasAttributes(lib.zj.office.fc.dom4j.Node node) {
        if (node == null || !(node instanceof Element) || ((Element) node).attributeCount() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean hasChildNodes(lib.zj.office.fc.dom4j.Node node) {
        return false;
    }

    public static Node insertBefore(lib.zj.office.fc.dom4j.Node node, Node node2, Node node3) {
        if (node instanceof Branch) {
            Branch branch = (Branch) node;
            List content = branch.content();
            int indexOf = content.indexOf(node3);
            if (indexOf < 0) {
                branch.add((lib.zj.office.fc.dom4j.Node) node2);
            } else {
                content.add(indexOf, node2);
            }
            return node2;
        }
        throw new DOMException((short) 3, "Children not allowed for this node: " + node);
    }

    public static void insertData(CharacterData characterData, int i10, String str) {
        if (!characterData.isReadOnly()) {
            String text = characterData.getText();
            if (text == null) {
                characterData.setText(str);
                return;
            }
            int length = text.length();
            if (i10 >= 0 && i10 <= length) {
                StringBuffer stringBuffer = new StringBuffer(text);
                stringBuffer.insert(i10, str);
                characterData.setText(stringBuffer.toString());
                return;
            }
            throw new DOMException((short) 1, a.c("No text at offset: ", i10));
        }
        throw new DOMException((short) 7, "CharacterData node is read only: " + characterData);
    }

    public static boolean isSupported(lib.zj.office.fc.dom4j.Node node, String str, String str2) {
        return false;
    }

    public static void normalize(lib.zj.office.fc.dom4j.Node node) {
        notSupported();
    }

    public static void notSupported() {
        throw new DOMException((short) 9, "Not supported yet");
    }

    public static Node removeChild(lib.zj.office.fc.dom4j.Node node, Node node2) {
        if (node instanceof Branch) {
            ((Branch) node).remove((lib.zj.office.fc.dom4j.Node) node2);
            return node2;
        }
        throw new DOMException((short) 3, "Children not allowed for this node: " + node);
    }

    public static Node replaceChild(lib.zj.office.fc.dom4j.Node node, Node node2, Node node3) {
        if (node instanceof Branch) {
            List content = ((Branch) node).content();
            int indexOf = content.indexOf(node3);
            if (indexOf >= 0) {
                content.set(indexOf, node2);
                return node3;
            }
            throw new DOMException((short) 8, "Tried to replace a non existing child for node: " + node);
        }
        throw new DOMException((short) 3, "Children not allowed for this node: " + node);
    }

    public static void replaceData(CharacterData characterData, int i10, int i11, String str) {
        if (!characterData.isReadOnly()) {
            if (i11 >= 0) {
                String text = characterData.getText();
                if (text != null) {
                    int length = text.length();
                    if (i10 >= 0 && i10 < length) {
                        StringBuffer stringBuffer = new StringBuffer(text);
                        stringBuffer.replace(i10, i11 + i10, str);
                        characterData.setText(stringBuffer.toString());
                        return;
                    }
                    throw new DOMException((short) 1, a.c("No text at offset: ", i10));
                }
                return;
            }
            throw new DOMException((short) 1, a.c("Illegal value for count: ", i11));
        }
        throw new DOMException((short) 7, "CharacterData node is read only: " + characterData);
    }

    public static void setData(CharacterData characterData, String str) {
        characterData.setText(str);
    }

    public static void setNodeValue(lib.zj.office.fc.dom4j.Node node, String str) {
        node.setText(str);
    }

    public static void setPrefix(lib.zj.office.fc.dom4j.Node node, String str) {
        notSupported();
    }

    public static String substringData(CharacterData characterData, int i10, int i11) {
        int i12;
        if (i11 >= 0) {
            String text = characterData.getText();
            if (text != null) {
                i12 = text.length();
            } else {
                i12 = 0;
            }
            if (i10 >= 0 && i10 < i12) {
                int i13 = i11 + i10;
                if (i13 > i12) {
                    return text.substring(i10);
                }
                return text.substring(i10, i13);
            }
            throw new DOMException((short) 1, a.c("No text at offset: ", i10));
        }
        throw new DOMException((short) 1, a.c("Illegal value for count: ", i11));
    }

    public static boolean supports(lib.zj.office.fc.dom4j.Node node, String str, String str2) {
        return false;
    }
}
