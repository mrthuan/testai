package lib.zj.office.fc.dom4j.io;

import java.util.ArrayList;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.tree.NamespaceStack;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes3.dex */
public class DOMReader {
    private DocumentFactory factory;
    private NamespaceStack namespaceStack;

    public DOMReader() {
        DocumentFactory documentFactory = DocumentFactory.getInstance();
        this.factory = documentFactory;
        this.namespaceStack = new NamespaceStack(documentFactory);
    }

    private String getPrefix(String str) {
        int indexOf = str.indexOf(58, 5);
        if (indexOf != -1) {
            return str.substring(indexOf + 1);
        }
        return "";
    }

    public void clearNamespaceStack() {
        this.namespaceStack.clear();
        NamespaceStack namespaceStack = this.namespaceStack;
        Namespace namespace = Namespace.XML_NAMESPACE;
        if (!namespaceStack.contains(namespace)) {
            this.namespaceStack.push(namespace);
        }
    }

    public Document createDocument() {
        return getDocumentFactory().createDocument();
    }

    public DocumentFactory getDocumentFactory() {
        return this.factory;
    }

    public Namespace getNamespace(String str, String str2) {
        return getDocumentFactory().createNamespace(str, str2);
    }

    public Document read(org.w3c.dom.Document document) {
        if (document instanceof Document) {
            return (Document) document;
        }
        Document createDocument = createDocument();
        clearNamespaceStack();
        NodeList childNodes = document.getChildNodes();
        int length = childNodes.getLength();
        for (int i10 = 0; i10 < length; i10++) {
            readTree(childNodes.item(i10), createDocument);
        }
        return createDocument;
    }

    public void readElement(Node node, Branch branch) {
        Node namedItem;
        int size = this.namespaceStack.size();
        String namespaceURI = node.getNamespaceURI();
        node.getPrefix();
        NamedNodeMap attributes = node.getAttributes();
        if (attributes != null && namespaceURI == null && (namedItem = attributes.getNamedItem("xmlns")) != null) {
            namespaceURI = namedItem.getNodeValue();
        }
        Element addElement = branch.addElement(this.namespaceStack.getQName(namespaceURI, node.getLocalName(), node.getNodeName()));
        if (attributes != null) {
            int length = attributes.getLength();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                Node item = attributes.item(i10);
                String nodeName = item.getNodeName();
                if (nodeName.startsWith("xmlns")) {
                    addElement.add(this.namespaceStack.addNamespace(getPrefix(nodeName), item.getNodeValue()));
                } else {
                    arrayList.add(item);
                }
            }
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Node node2 = (Node) arrayList.get(i11);
                addElement.addAttribute(this.namespaceStack.getQName(node2.getNamespaceURI(), node2.getLocalName(), node2.getNodeName()), node2.getNodeValue());
            }
        }
        NodeList childNodes = node.getChildNodes();
        int length2 = childNodes.getLength();
        for (int i12 = 0; i12 < length2; i12++) {
            readTree(childNodes.item(i12), addElement);
        }
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.pop();
        }
    }

    public void readTree(Node node, Branch branch) {
        Document document;
        boolean z10 = branch instanceof Element;
        Element element = null;
        if (z10) {
            document = null;
            element = (Element) branch;
        } else {
            document = (Document) branch;
        }
        switch (node.getNodeType()) {
            case 1:
                readElement(node, branch);
                return;
            case 2:
            case 9:
            default:
                return;
            case 3:
                element.addText(node.getNodeValue());
                return;
            case 4:
                element.addCDATA(node.getNodeValue());
                return;
            case 5:
                Node firstChild = node.getFirstChild();
                if (firstChild != null) {
                    element.addEntity(node.getNodeName(), firstChild.getNodeValue());
                    return;
                } else {
                    element.addEntity(node.getNodeName(), "");
                    return;
                }
            case 6:
                element.addEntity(node.getNodeName(), node.getNodeValue());
                return;
            case 7:
                if (z10) {
                    ((Element) branch).addProcessingInstruction(node.getNodeName(), node.getNodeValue());
                    return;
                } else {
                    ((Document) branch).addProcessingInstruction(node.getNodeName(), node.getNodeValue());
                    return;
                }
            case 8:
                if (z10) {
                    ((Element) branch).addComment(node.getNodeValue());
                    return;
                } else {
                    ((Document) branch).addComment(node.getNodeValue());
                    return;
                }
            case 10:
                DocumentType documentType = (DocumentType) node;
                document.addDocType(documentType.getName(), documentType.getPublicId(), documentType.getSystemId());
                return;
        }
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.factory = documentFactory;
        this.namespaceStack.setDocumentFactory(documentFactory);
    }

    public DOMReader(DocumentFactory documentFactory) {
        this.factory = documentFactory;
        this.namespaceStack = new NamespaceStack(documentFactory);
    }
}
