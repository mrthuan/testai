package lib.zj.office.fc.dom4j.tree;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.DocumentType;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import org.xml.sax.EntityResolver;

/* loaded from: classes3.dex */
public class DefaultDocument extends AbstractDocument {
    protected static final Iterator EMPTY_ITERATOR;
    protected static final List EMPTY_LIST;
    private List content;
    private DocumentType docType;
    private DocumentFactory documentFactory = DocumentFactory.getInstance();
    private transient EntityResolver entityResolver;
    private String name;
    private Element rootElement;

    static {
        List list = Collections.EMPTY_LIST;
        EMPTY_LIST = list;
        EMPTY_ITERATOR = list.iterator();
    }

    public DefaultDocument() {
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public Document addDocType(String str, String str2, String str3) {
        setDocType(getDocumentFactory().createDocType(str, str2, str3));
        return this;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void addNode(Node node) {
        if (node != null) {
            Document document = node.getDocument();
            if (document != null && document != this) {
                throw new IllegalAddException(this, node, "The Node already has an existing document: " + document);
            }
            contentList().add(node);
            childAdded(node);
        }
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void clearContent() {
        contentRemoved();
        this.content = null;
        this.rootElement = null;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Object clone() {
        DefaultDocument defaultDocument = (DefaultDocument) super.clone();
        defaultDocument.rootElement = null;
        defaultDocument.content = null;
        defaultDocument.appendContent(this);
        return defaultDocument;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public List contentList() {
        if (this.content == null) {
            List createContentList = createContentList();
            this.content = createContentList;
            Element element = this.rootElement;
            if (element != null) {
                createContentList.add(element);
            }
        }
        return this.content;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public DocumentType getDocType() {
        return this.docType;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public DocumentFactory getDocumentFactory() {
        return this.documentFactory;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public EntityResolver getEntityResolver() {
        return this.entityResolver;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return this.name;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public Element getRootElement() {
        return this.rootElement;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractDocument, lib.zj.office.fc.dom4j.Document
    public String getXMLEncoding() {
        return this.encoding;
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
                createResultList.add(obj);
            }
        }
        return createResultList;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public boolean removeNode(Node node) {
        if (node == this.rootElement) {
            this.rootElement = null;
        }
        if (contentList().remove(node)) {
            childRemoved(node);
            return true;
        }
        return false;
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

    @Override // lib.zj.office.fc.dom4j.tree.AbstractDocument
    public void rootElementAdded(Element element) {
        this.rootElement = element;
        element.setDocument(this);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void setContent(List list) {
        this.rootElement = null;
        contentRemoved();
        if (list instanceof ContentListFacade) {
            list = ((ContentListFacade) list).getBackingList();
        }
        if (list == null) {
            this.content = null;
            return;
        }
        int size = list.size();
        List createContentList = createContentList(size);
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof Node) {
                Node node = (Node) obj;
                Document document = node.getDocument();
                if (document != null && document != this) {
                    node = (Node) node.clone();
                }
                if (node instanceof Element) {
                    if (this.rootElement == null) {
                        this.rootElement = (Element) node;
                    } else {
                        throw new IllegalAddException("A document may only contain one root element: " + list);
                    }
                }
                createContentList.add(node);
                childAdded(node);
            }
        }
        this.content = createContentList;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public void setDocType(DocumentType documentType) {
        this.docType = documentType;
    }

    public void setDocumentFactory(DocumentFactory documentFactory) {
        this.documentFactory = documentFactory;
    }

    @Override // lib.zj.office.fc.dom4j.Document
    public void setEntityResolver(EntityResolver entityResolver) {
        this.entityResolver = entityResolver;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setName(String str) {
        this.name = str;
    }

    public DefaultDocument(String str) {
        this.name = str;
    }

    public DefaultDocument(Element element) {
        this.rootElement = element;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public void addNode(int i10, Node node) {
        if (node != null) {
            Document document = node.getDocument();
            if (document != null && document != this) {
                throw new IllegalAddException(this, node, "The Node already has an existing document: " + document);
            }
            contentList().add(i10, node);
            childAdded(node);
        }
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
                    createResultList.add(processingInstruction);
                }
            }
        }
        return createResultList;
    }

    public DefaultDocument(DocumentType documentType) {
        this.docType = documentType;
    }

    public DefaultDocument(Element element, DocumentType documentType) {
        this.rootElement = element;
        this.docType = documentType;
    }

    public DefaultDocument(String str, Element element, DocumentType documentType) {
        this.name = str;
        this.rootElement = element;
        this.docType = documentType;
    }
}
