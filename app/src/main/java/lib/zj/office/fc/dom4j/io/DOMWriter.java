package lib.zj.office.fc.dom4j.io;

import a0.a;
import java.util.List;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.DocumentException;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.tree.NamespaceStack;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public class DOMWriter {
    private static final String[] DEFAULT_DOM_DOCUMENT_CLASSES = {"org.apache.xerces.dom.DocumentImpl", "gnu.xml.dom.DomDocument", "org.apache.crimson.tree.XmlDocument", "com.sun.xml.tree.XmlDocument", "oracle.xml.parser.v2.XMLDocument", "oracle.xml.parser.XMLDocument", "org.dom4j.dom.DOMDocument"};
    private static boolean loggedWarning = false;
    private Class domDocumentClass;
    private NamespaceStack namespaceStack = new NamespaceStack();

    public DOMWriter() {
    }

    public void appendDOMTree(Document document, Node node, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof Element) {
                appendDOMTree(document, node, (Element) obj);
            } else if (obj instanceof String) {
                appendDOMTree(document, node, (String) obj);
            } else if (obj instanceof Text) {
                appendDOMTree(document, node, ((Text) obj).getText());
            } else if (obj instanceof CDATA) {
                appendDOMTree(document, node, (CDATA) obj);
            } else if (obj instanceof Comment) {
                appendDOMTree(document, node, (Comment) obj);
            } else if (obj instanceof Entity) {
                appendDOMTree(document, node, (Entity) obj);
            } else if (obj instanceof ProcessingInstruction) {
                appendDOMTree(document, node, (ProcessingInstruction) obj);
            }
        }
    }

    public String attributeNameForNamespace(Namespace namespace) {
        String prefix = namespace.getPrefix();
        if (prefix.length() > 0) {
            return "xmlns:".concat(prefix);
        }
        return "xmlns";
    }

    public Document createDomDocument(lib.zj.office.fc.dom4j.Document document) {
        Class cls = this.domDocumentClass;
        if (cls != null) {
            try {
                return (Document) cls.newInstance();
            } catch (Exception e10) {
                throw new DocumentException("Could not instantiate an instance of DOM Document with class: ".concat(this.domDocumentClass.getName()), e10);
            }
        }
        Document createDomDocumentViaJAXP = createDomDocumentViaJAXP();
        if (createDomDocumentViaJAXP == null) {
            Class domDocumentClass = getDomDocumentClass();
            try {
                return (Document) domDocumentClass.newInstance();
            } catch (Exception e11) {
                throw new DocumentException("Could not instantiate an instance of DOM Document with class: ".concat(domDocumentClass.getName()), e11);
            }
        }
        return createDomDocumentViaJAXP;
    }

    public Document createDomDocumentViaJAXP() {
        try {
            return JAXPHelper.createDocument(false, true);
        } catch (Throwable th2) {
            if (!loggedWarning) {
                loggedWarning = true;
                if (SAXHelper.isVerboseErrorReporting()) {
                    th2.printStackTrace();
                    return null;
                }
                return null;
            }
            return null;
        }
    }

    public Class getDomDocumentClass() {
        Class<?> cls = this.domDocumentClass;
        if (cls == null) {
            int length = DEFAULT_DOM_DOCUMENT_CLASSES.length;
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    cls = Class.forName(DEFAULT_DOM_DOCUMENT_CLASSES[i10], true, DOMWriter.class.getClassLoader());
                } catch (Exception unused) {
                }
                if (cls != null) {
                    break;
                }
            }
        }
        return cls;
    }

    public boolean isNamespaceDeclaration(Namespace namespace) {
        String uri;
        if (namespace != null && namespace != Namespace.NO_NAMESPACE && namespace != Namespace.XML_NAMESPACE && (uri = namespace.getURI()) != null && uri.length() > 0 && !this.namespaceStack.contains(namespace)) {
            return true;
        }
        return false;
    }

    public void resetNamespaceStack() {
        this.namespaceStack.clear();
        this.namespaceStack.push(Namespace.XML_NAMESPACE);
    }

    public void setDomDocumentClass(Class cls) {
        this.domDocumentClass = cls;
    }

    public void setDomDocumentClassName(String str) {
        try {
            this.domDocumentClass = Class.forName(str, true, DOMWriter.class.getClassLoader());
        } catch (Exception e10) {
            throw new DocumentException(a.h("Could not load the DOM Document class: ", str), e10);
        }
    }

    public Document write(lib.zj.office.fc.dom4j.Document document) {
        if (document instanceof Document) {
            return (Document) document;
        }
        resetNamespaceStack();
        Document createDomDocument = createDomDocument(document);
        appendDOMTree(createDomDocument, createDomDocument, document.content());
        this.namespaceStack.clear();
        return createDomDocument;
    }

    public void writeNamespace(org.w3c.dom.Element element, Namespace namespace) {
        element.setAttribute(attributeNameForNamespace(namespace), namespace.getURI());
    }

    public DOMWriter(Class cls) {
        this.domDocumentClass = cls;
    }

    public Document write(lib.zj.office.fc.dom4j.Document document, DOMImplementation dOMImplementation) {
        if (document instanceof Document) {
            return (Document) document;
        }
        resetNamespaceStack();
        Document createDomDocument = createDomDocument(document, dOMImplementation);
        appendDOMTree(createDomDocument, createDomDocument, document.content());
        this.namespaceStack.clear();
        return createDomDocument;
    }

    public Document createDomDocument(lib.zj.office.fc.dom4j.Document document, DOMImplementation dOMImplementation) {
        return dOMImplementation.createDocument(null, null, null);
    }

    public void appendDOMTree(Document document, Node node, Element element) {
        org.w3c.dom.Element createElementNS = document.createElementNS(element.getNamespaceURI(), element.getQualifiedName());
        int size = this.namespaceStack.size();
        Namespace namespace = element.getNamespace();
        if (isNamespaceDeclaration(namespace)) {
            this.namespaceStack.push(namespace);
            writeNamespace(createElementNS, namespace);
        }
        List declaredNamespaces = element.declaredNamespaces();
        int size2 = declaredNamespaces.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Namespace namespace2 = (Namespace) declaredNamespaces.get(i10);
            if (isNamespaceDeclaration(namespace2)) {
                this.namespaceStack.push(namespace2);
                writeNamespace(createElementNS, namespace2);
            }
        }
        int attributeCount = element.attributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            Attribute attribute = element.attribute(i11);
            createElementNS.setAttributeNS(attribute.getNamespaceURI(), attribute.getQualifiedName(), attribute.getValue());
        }
        appendDOMTree(document, createElementNS, element.content());
        node.appendChild(createElementNS);
        while (this.namespaceStack.size() > size) {
            this.namespaceStack.pop();
        }
    }

    public void appendDOMTree(Document document, Node node, CDATA cdata) {
        node.appendChild(document.createCDATASection(cdata.getText()));
    }

    public void appendDOMTree(Document document, Node node, Comment comment) {
        node.appendChild(document.createComment(comment.getText()));
    }

    public void appendDOMTree(Document document, Node node, String str) {
        node.appendChild(document.createTextNode(str));
    }

    public void appendDOMTree(Document document, Node node, Entity entity) {
        node.appendChild(document.createEntityReference(entity.getName()));
    }

    public void appendDOMTree(Document document, Node node, ProcessingInstruction processingInstruction) {
        node.appendChild(document.createProcessingInstruction(processingInstruction.getTarget(), processingInstruction.getText()));
    }
}
