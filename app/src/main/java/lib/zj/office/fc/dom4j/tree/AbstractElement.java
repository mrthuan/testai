package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.CDATA;
import lib.zj.office.fc.dom4j.CharacterData;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Entity;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.Text;
import lib.zj.office.fc.dom4j.Visitor;
import lib.zj.office.fc.dom4j.io.OutputFormat;
import lib.zj.office.fc.dom4j.io.XMLWriter;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import org.xml.sax.Attributes;

/* loaded from: classes3.dex */
public abstract class AbstractElement extends AbstractBranch implements Element {
    private static final DocumentFactory DOCUMENT_FACTORY = DocumentFactory.getInstance();
    protected static final Iterator EMPTY_ITERATOR;
    protected static final List EMPTY_LIST;
    protected static final boolean USE_STRINGVALUE_SEPARATOR = false;
    protected static final boolean VERBOSE_TOSTRING = false;

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY_LIST = list;
        EMPTY_ITERATOR = list.iterator();
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public void accept(Visitor visitor) {
        visitor.visit(this);
        int attributeCount = attributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            visitor.visit(attribute(i10));
        }
        int nodeCount = nodeCount();
        for (int i11 = 0; i11 < nodeCount; i11++) {
            node(i11).accept(visitor);
        }
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void add(Attribute attribute) {
        if (attribute.getParent() == null) {
            if (attribute.getValue() == null) {
                Attribute attribute2 = attribute(attribute.getQName());
                if (attribute2 != null) {
                    remove(attribute2);
                    return;
                }
                return;
            }
            attributeList().add(attribute);
            childAdded(attribute);
            return;
        }
        throw new IllegalAddException((Element) this, (Node) attribute, "The Attribute already has an existing parent \"" + attribute.getParent().getQualifiedName() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addAttribute(String str, String str2) {
        Attribute attribute = attribute(str);
        if (str2 != null) {
            if (attribute == null) {
                add(getDocumentFactory().createAttribute(this, str, str2));
            } else if (attribute.isReadOnly()) {
                remove(attribute);
                add(getDocumentFactory().createAttribute(this, str, str2));
            } else {
                attribute.setValue(str2);
            }
        } else if (attribute != null) {
            remove(attribute);
        }
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addCDATA(String str) {
        addNewNode(getDocumentFactory().createCDATA(str));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addComment(String str) {
        addNewNode(getDocumentFactory().createComment(str));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Element addElement(String str) {
        Namespace namespaceForPrefix;
        String str2;
        Element createElement;
        DocumentFactory documentFactory = getDocumentFactory();
        int indexOf = str.indexOf(":");
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            str2 = str.substring(indexOf + 1);
            namespaceForPrefix = getNamespaceForPrefix(substring);
            if (namespaceForPrefix == null) {
                throw new IllegalAddException("No such namespace prefix: " + substring + " is in scope on: " + this + " so cannot add element: " + str);
            }
        } else {
            namespaceForPrefix = getNamespaceForPrefix("");
            str2 = str;
        }
        if (namespaceForPrefix != null) {
            createElement = documentFactory.createElement(documentFactory.createQName(str2, namespaceForPrefix));
        } else {
            createElement = documentFactory.createElement(str);
        }
        addNewNode(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addEntity(String str, String str2) {
        addNewNode(getDocumentFactory().createEntity(str, str2));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addNamespace(String str, String str2) {
        addNewNode(getDocumentFactory().createNamespace(str, str2));
        return this;
    }

    public void addNewNode(Node node) {
        contentList().add(node);
        childAdded(node);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void addNode(Node node) {
        if (node.getParent() == null) {
            addNewNode(node);
            return;
        }
        throw new IllegalAddException((Element) this, node, "The Node already has an existing parent of \"" + node.getParent().getQualifiedName() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addProcessingInstruction(String str, String str2) {
        addNewNode(getDocumentFactory().createProcessingInstruction(str, str2));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addText(String str) {
        addNewNode(getDocumentFactory().createText(str));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List additionalNamespaces() {
        List contentList = contentList();
        int size = contentList.size();
        BackedList createResultList = createResultList();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (!namespace.equals(getNamespace())) {
                    createResultList.addLocal(namespace);
                }
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void appendAttributes(Element element) {
        int attributeCount = element.attributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            Attribute attribute = element.attribute(i10);
            if (attribute.supportsParent()) {
                addAttribute(attribute.getQName(), attribute.getValue());
            } else {
                add(attribute);
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String asXML() {
        try {
            StringWriter stringWriter = new StringWriter();
            XMLWriter xMLWriter = new XMLWriter(stringWriter, new OutputFormat());
            xMLWriter.write((Element) this);
            xMLWriter.flush();
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new RuntimeException("IOException while generating textual representation: " + e10.getMessage());
        }
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Attribute attribute(int i10) {
        return (Attribute) attributeList().get(i10);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public int attributeCount() {
        return attributeList().size();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Iterator attributeIterator() {
        return attributeList().iterator();
    }

    public abstract List attributeList();

    public abstract List attributeList(int i10);

    @Override // lib.zj.office.fc.dom4j.Element
    public String attributeValue(String str) {
        Attribute attribute = attribute(str);
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List attributes() {
        return new ContentListFacade(this, attributeList());
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void childAdded(Node node) {
        if (node != null) {
            node.setParent(this);
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void childRemoved(Node node) {
        if (node != null) {
            node.setParent(null);
            node.setDocument(null);
        }
    }

    public List createAttributeList() {
        return createAttributeList(5);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element createCopy() {
        Element createElement = createElement(getQName());
        createElement.appendAttributes(this);
        createElement.appendContent(this);
        return createElement;
    }

    public Element createElement(String str) {
        return getDocumentFactory().createElement(str);
    }

    public Iterator createSingleIterator(Object obj) {
        return new SingleIterator(obj);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List declaredNamespaces() {
        BackedList createResultList = createResultList();
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Namespace) {
                createResultList.addLocal(obj);
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element element(String str) {
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (str.equals(element.getName())) {
                    return element;
                }
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Iterator elementIterator() {
        return elements().iterator();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String elementText(String str) {
        Element element = element(str);
        if (element != null) {
            return element.getText();
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String elementTextTrim(String str) {
        Element element = element(str);
        if (element != null) {
            return element.getTextTrim();
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List elements() {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Element) {
                createResultList.addLocal(obj);
            }
        }
        return createResultList;
    }

    public void ensureAttributesCapacity(int i10) {
        if (i10 > 1) {
            List attributeList = attributeList();
            if (attributeList instanceof ArrayList) {
                ((ArrayList) attributeList).ensureCapacity(i10);
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Object getData() {
        return getText();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public DocumentFactory getDocumentFactory() {
        DocumentFactory documentFactory;
        QName qName = getQName();
        if (qName != null && (documentFactory = qName.getDocumentFactory()) != null) {
            return documentFactory;
        }
        return DOCUMENT_FACTORY;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return getQName().getName();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Namespace getNamespace() {
        return getQName().getNamespace();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Namespace getNamespaceForPrefix(String str) {
        Namespace namespaceForPrefix;
        if (str == null) {
            str = "";
        }
        if (str.equals(getNamespacePrefix())) {
            return getNamespace();
        }
        if (str.equals(ContentTypes.EXTENSION_XML)) {
            return Namespace.XML_NAMESPACE;
        }
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (str.equals(namespace.getPrefix())) {
                    return namespace;
                }
            }
        }
        Element parent = getParent();
        if (parent != null && (namespaceForPrefix = parent.getNamespaceForPrefix(str)) != null) {
            return namespaceForPrefix;
        }
        if (str.length() <= 0) {
            return Namespace.NO_NAMESPACE;
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Namespace getNamespaceForURI(String str) {
        if (str != null && str.length() > 0) {
            if (str.equals(getNamespaceURI())) {
                return getNamespace();
            }
            List contentList = contentList();
            int size = contentList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = contentList.get(i10);
                if (obj instanceof Namespace) {
                    Namespace namespace = (Namespace) obj;
                    if (str.equals(namespace.getURI())) {
                        return namespace;
                    }
                }
            }
            return null;
        }
        return Namespace.NO_NAMESPACE;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String getNamespacePrefix() {
        return getQName().getNamespacePrefix();
    }

    public String getNamespaceURI() {
        return getQName().getNamespaceURI();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List getNamespacesForURI(String str) {
        BackedList createResultList = createResultList();
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if ((obj instanceof Namespace) && ((Namespace) obj).getURI().equals(str)) {
                createResultList.addLocal(obj);
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public short getNodeType() {
        return (short) 1;
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getPath(Element element) {
        if (this == element) {
            return ".";
        }
        Element parent = getParent();
        if (parent == null) {
            return PackagingURIHelper.FORWARD_SLASH_STRING + getXPathNameStep();
        } else if (parent == element) {
            return getXPathNameStep();
        } else {
            return parent.getPath(element) + PackagingURIHelper.FORWARD_SLASH_STRING + getXPathNameStep();
        }
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public QName getQName(String str) {
        String str2;
        int indexOf = str.indexOf(":");
        if (indexOf > 0) {
            str2 = str.substring(0, indexOf);
            str = str.substring(indexOf + 1);
        } else {
            str2 = "";
        }
        Namespace namespaceForPrefix = getNamespaceForPrefix(str2);
        if (namespaceForPrefix != null) {
            return getDocumentFactory().createQName(str, namespaceForPrefix);
        }
        return getDocumentFactory().createQName(str);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String getQualifiedName() {
        return getQName().getQualifiedName();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getStringValue() {
        List contentList = contentList();
        int size = contentList.size();
        if (size > 0) {
            if (size == 1) {
                return getContentAsStringValue(contentList.get(0));
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < size; i10++) {
                String contentAsStringValue = getContentAsStringValue(contentList.get(i10));
                if (contentAsStringValue.length() > 0) {
                    stringBuffer.append(contentAsStringValue);
                }
            }
            return stringBuffer.toString();
        }
        return "";
    }

    @Override // lib.zj.office.fc.dom4j.Node
    public String getUniquePath(Element element) {
        int indexOf;
        Element parent = getParent();
        if (parent == null) {
            return PackagingURIHelper.FORWARD_SLASH_STRING + getXPathNameStep();
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (parent != element) {
            stringBuffer.append(parent.getUniquePath(element));
            stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        }
        stringBuffer.append(getXPathNameStep());
        List elements = parent.elements(getQName());
        if (elements.size() > 1 && (indexOf = elements.indexOf(this)) >= 0) {
            stringBuffer.append("[");
            stringBuffer.append(Integer.toString(indexOf + 1));
            stringBuffer.append("]");
        }
        return stringBuffer.toString();
    }

    public String getXPathNameStep() {
        String namespaceURI = getNamespaceURI();
        if (namespaceURI != null && namespaceURI.length() != 0) {
            String namespacePrefix = getNamespacePrefix();
            if (namespacePrefix != null && namespacePrefix.length() != 0) {
                return getQualifiedName();
            }
            return "*[name()='" + getName() + "']";
        }
        return getName();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Node getXPathResult(int i10) {
        Node node = node(i10);
        if (node != null && !node.supportsParent()) {
            return node.asXPathResult(this);
        }
        return node;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean hasMixedContent() {
        List<Object> contentList = contentList();
        if (contentList != null && !contentList.isEmpty() && contentList.size() >= 2) {
            Class<?> cls = null;
            for (Object obj : contentList) {
                Class<?> cls2 = obj.getClass();
                if (cls2 != cls) {
                    if (cls != null) {
                        return true;
                    }
                    cls = cls2;
                }
            }
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public int indexOf(Node node) {
        return contentList().indexOf(node);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean isRootElement() {
        Document document = getDocument();
        if (document != null && document.getRootElement() == this) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean isTextOnly() {
        List contentList = contentList();
        if (contentList != null && !contentList.isEmpty()) {
            for (Object obj : contentList) {
                if (!(obj instanceof CharacterData) && !(obj instanceof String)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Node node(int i10) {
        Object obj;
        if (i10 >= 0) {
            List contentList = contentList();
            if (i10 < contentList.size() && (obj = contentList.get(i10)) != null) {
                if (obj instanceof Node) {
                    return (Node) obj;
                }
                return getDocumentFactory().createText(obj.toString());
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public int nodeCount() {
        return contentList().size();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public Iterator nodeIterator() {
        return contentList().iterator();
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void normalize() {
        List contentList = contentList();
        int i10 = 0;
        while (true) {
            Text text = null;
            while (i10 < contentList.size()) {
                Node node = (Node) contentList.get(i10);
                if (node instanceof Text) {
                    Text text2 = (Text) node;
                    if (text != null) {
                        text.appendText(text2.getText());
                        remove(text2);
                    } else {
                        String text3 = text2.getText();
                        if (text3 != null && text3.length() > 0) {
                            i10++;
                            text = text2;
                        } else {
                            remove(text2);
                        }
                    }
                } else {
                    if (node instanceof Element) {
                        ((Element) node).normalize();
                    }
                    i10++;
                }
            }
            return;
        }
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public ProcessingInstruction processingInstruction(String str) {
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) obj;
                if (str.equals(processingInstruction.getName())) {
                    return processingInstruction;
                }
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public List processingInstructions() {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof ProcessingInstruction) {
                createResultList.addLocal(obj);
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean remove(Attribute attribute) {
        List attributeList = attributeList();
        boolean remove = attributeList.remove(attribute);
        if (remove) {
            childRemoved(attribute);
            return remove;
        }
        Attribute attribute2 = attribute(attribute.getQName());
        if (attribute2 != null) {
            attributeList.remove(attribute2);
            return true;
        }
        return remove;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public boolean removeNode(Node node) {
        boolean remove = contentList().remove(node);
        if (remove) {
            childRemoved(node);
        }
        return remove;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public boolean removeProcessingInstruction(String str) {
        Iterator it = contentList().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next instanceof ProcessingInstruction) && str.equals(((ProcessingInstruction) next).getName())) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void setAttributeValue(String str, String str2) {
        addAttribute(str, str2);
    }

    public void setAttributes(Attributes attributes, NamespaceStack namespaceStack, boolean z10) {
        int length = attributes.getLength();
        if (length > 0) {
            DocumentFactory documentFactory = getDocumentFactory();
            if (length == 1) {
                String qName = attributes.getQName(0);
                if (z10 || !qName.startsWith("xmlns")) {
                    String uri = attributes.getURI(0);
                    String localName = attributes.getLocalName(0);
                    add(documentFactory.createAttribute(this, namespaceStack.getAttributeQName(uri, localName, qName), attributes.getValue(0)));
                    return;
                }
                return;
            }
            List attributeList = attributeList(length);
            attributeList.clear();
            for (int i10 = 0; i10 < length; i10++) {
                String qName2 = attributes.getQName(i10);
                if (z10 || !qName2.startsWith("xmlns")) {
                    String uri2 = attributes.getURI(i10);
                    String localName2 = attributes.getLocalName(i10);
                    Attribute createAttribute = documentFactory.createAttribute(this, namespaceStack.getAttributeQName(uri2, localName2, qName2), attributes.getValue(i10));
                    attributeList.add(createAttribute);
                    childAdded(createAttribute);
                }
            }
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setName(String str) {
        setQName(getDocumentFactory().createQName(str));
    }

    public void setNamespace(Namespace namespace) {
        setQName(getDocumentFactory().createQName(getName(), namespace));
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        List contentList = contentList();
        if (contentList != null) {
            Iterator it = contentList.iterator();
            while (it.hasNext()) {
                short nodeType = ((Node) it.next()).getNodeType();
                if (nodeType == 3 || nodeType == 4 || nodeType == 5) {
                    it.remove();
                }
            }
        }
        addText(str);
    }

    public String toString() {
        String namespaceURI = getNamespaceURI();
        if (namespaceURI != null && namespaceURI.length() > 0) {
            return super.toString() + " [Element: <" + getQualifiedName() + " uri: " + namespaceURI + " attributes: " + attributeList() + "/>]";
        }
        return super.toString() + " [Element: <" + getQualifiedName() + " attributes: " + attributeList() + "/>]";
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void write(Writer writer) {
        new XMLWriter(writer, new OutputFormat()).write((Element) this);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Attribute attribute(String str) {
        List attributeList = attributeList();
        int size = attributeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Attribute attribute = (Attribute) attributeList.get(i10);
            if (str.equals(attribute.getName())) {
                return attribute;
            }
        }
        return null;
    }

    public List createAttributeList(int i10) {
        return new ArrayList(i10);
    }

    public Element createElement(QName qName) {
        return getDocumentFactory().createElement(qName);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void setAttributeValue(QName qName, String str) {
        addAttribute(qName, str);
    }

    public void addNewNode(int i10, Node node) {
        contentList().add(i10, node);
        childAdded(node);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addProcessingInstruction(String str, Map map) {
        addNewNode(getDocumentFactory().createProcessingInstruction(str, map));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String attributeValue(QName qName) {
        Attribute attribute = attribute(qName);
        if (attribute == null) {
            return null;
        }
        return attribute.getValue();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Iterator elementIterator(String str) {
        return elements(str).iterator();
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String elementText(QName qName) {
        Element element = element(qName);
        if (element != null) {
            return element.getText();
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String elementTextTrim(QName qName) {
        Element element = element(qName);
        if (element != null) {
            return element.getTextTrim();
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element createCopy(String str) {
        Element createElement = createElement(str);
        createElement.appendAttributes(this);
        createElement.appendContent(this);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String attributeValue(String str, String str2) {
        String attributeValue = attributeValue(str);
        return attributeValue != null ? attributeValue : str2;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Iterator elementIterator(QName qName) {
        return elements(qName).iterator();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void addNode(int i10, Node node) {
        if (node.getParent() == null) {
            addNewNode(i10, node);
            return;
        }
        throw new IllegalAddException((Element) this, node, "The Node already has an existing parent of \"" + node.getParent().getQualifiedName() + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Attribute attribute(QName qName) {
        List attributeList = attributeList();
        int size = attributeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Attribute attribute = (Attribute) attributeList.get(i10);
            if (qName.equals(attribute.getQName())) {
                return attribute;
            }
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public String attributeValue(QName qName, String str) {
        String attributeValue = attributeValue(qName);
        return attributeValue != null ? attributeValue : str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public boolean remove(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            if (nodeType != 2) {
                if (nodeType != 3) {
                    if (nodeType != 4) {
                        if (nodeType != 5) {
                            if (nodeType != 7) {
                                if (nodeType != 8) {
                                    if (nodeType != 13) {
                                        return false;
                                    }
                                    return remove((Namespace) node);
                                }
                                return remove((Comment) node);
                            }
                            return remove((ProcessingInstruction) node);
                        }
                        return remove((Entity) node);
                    }
                    return remove((CDATA) node);
                }
                return remove((Text) node);
            }
            return remove((Attribute) node);
        }
        return remove((Element) node);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element createCopy(QName qName) {
        Element createElement = createElement(qName);
        createElement.appendAttributes(this);
        createElement.appendContent(this);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element element(QName qName) {
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (qName.equals(element.getQName())) {
                    return element;
                }
            }
        }
        return null;
    }

    public Iterator elementIterator(String str, Namespace namespace) {
        return elementIterator(getDocumentFactory().createQName(str, namespace));
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List elements(String str) {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (str.equals(element.getName())) {
                    createResultList.addLocal(element);
                }
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public List processingInstructions(String str) {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof ProcessingInstruction) {
                ProcessingInstruction processingInstruction = (ProcessingInstruction) obj;
                if (str.equals(processingInstruction.getName())) {
                    createResultList.addLocal(processingInstruction);
                }
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public Element addAttribute(QName qName, String str) {
        Attribute attribute = attribute(qName);
        if (str != null) {
            if (attribute == null) {
                add(getDocumentFactory().createAttribute(this, qName, str));
            } else if (attribute.isReadOnly()) {
                remove(attribute);
                add(getDocumentFactory().createAttribute(this, qName, str));
            } else {
                attribute.setValue(str);
            }
        } else if (attribute != null) {
            remove(attribute);
        }
        return this;
    }

    public List additionalNamespaces(String str) {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Namespace) {
                Namespace namespace = (Namespace) obj;
                if (!str.equals(namespace.getURI())) {
                    createResultList.addLocal(namespace);
                }
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public void add(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType == 1) {
            add((Element) node);
        } else if (nodeType == 2) {
            add((Attribute) node);
        } else if (nodeType == 3) {
            add((Text) node);
        } else if (nodeType == 4) {
            add((CDATA) node);
        } else if (nodeType == 5) {
            add((Entity) node);
        } else if (nodeType == 7) {
            add((ProcessingInstruction) node);
        } else if (nodeType == 8) {
            add((Comment) node);
        } else if (nodeType != 13) {
            invalidNodeTypeAddException(node);
        } else {
            add((Namespace) node);
        }
    }

    public Attribute attribute(String str, Namespace namespace) {
        return attribute(getDocumentFactory().createQName(str, namespace));
    }

    public Element element(String str, Namespace namespace) {
        return element(getDocumentFactory().createQName(str, namespace));
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public List elements(QName qName) {
        List contentList = contentList();
        BackedList createResultList = createResultList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Element) {
                Element element = (Element) obj;
                if (qName.equals(element.getQName())) {
                    createResultList.addLocal(element);
                }
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean remove(CDATA cdata) {
        return removeNode(cdata);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public boolean remove(Comment comment) {
        return removeNode(comment);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public boolean remove(Element element) {
        return removeNode(element);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean remove(Entity entity) {
        return removeNode(entity);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean remove(Namespace namespace) {
        return removeNode(namespace);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void add(CDATA cdata) {
        addNode(cdata);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public boolean remove(ProcessingInstruction processingInstruction) {
        return removeNode(processingInstruction);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public void add(Comment comment) {
        addNode(comment);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public boolean remove(Text text) {
        return removeNode(text);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public void add(Element element) {
        addNode(element);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void add(Entity entity) {
        addNode(entity);
    }

    public List elements(String str, Namespace namespace) {
        return elements(getDocumentFactory().createQName(str, namespace));
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void add(Namespace namespace) {
        addNode(namespace);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch, lib.zj.office.fc.dom4j.Branch
    public void add(ProcessingInstruction processingInstruction) {
        addNode(processingInstruction);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void add(Text text) {
        addNode(text);
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void setData(Object obj) {
    }
}
