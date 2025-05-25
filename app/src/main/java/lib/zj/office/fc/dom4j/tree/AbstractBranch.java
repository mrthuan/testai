package lib.zj.office.fc.dom4j.tree;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.Comment;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.IllegalAddException;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.Node;
import lib.zj.office.fc.dom4j.ProcessingInstruction;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public abstract class AbstractBranch extends AbstractNode implements Branch {
    protected static final int DEFAULT_CONTENT_LIST_SIZE = 5;

    @Override // lib.zj.office.fc.dom4j.Branch
    public void add(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType == 1) {
            add((Element) node);
        } else if (nodeType == 7) {
            add((ProcessingInstruction) node);
        } else if (nodeType != 8) {
            invalidNodeTypeAddException(node);
        } else {
            add((Comment) node);
        }
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Element addElement(String str) {
        Element createElement = getDocumentFactory().createElement(str);
        add(createElement);
        return createElement;
    }

    public abstract void addNode(int i10, Node node);

    public abstract void addNode(Node node);

    @Override // lib.zj.office.fc.dom4j.Branch
    public void appendContent(Branch branch) {
        int nodeCount = branch.nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            add((Node) branch.node(i10).clone());
        }
    }

    public abstract void childAdded(Node node);

    public abstract void childRemoved(Node node);

    @Override // lib.zj.office.fc.dom4j.Branch
    public List content() {
        return new ContentListFacade(this, contentList());
    }

    public abstract List contentList();

    public void contentRemoved() {
        List contentList = contentList();
        int size = contentList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = contentList.get(i10);
            if (obj instanceof Node) {
                childRemoved((Node) obj);
            }
        }
    }

    public List createContentList() {
        return new ArrayList(5);
    }

    public List createEmptyList() {
        return new BackedList(this, contentList(), 0);
    }

    public BackedList createResultList() {
        return new BackedList(this, contentList());
    }

    public List createSingleResultList(Object obj) {
        BackedList backedList = new BackedList(this, contentList(), 1);
        backedList.addLocal(obj);
        return backedList;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Element elementByID(String str) {
        int nodeCount = nodeCount();
        for (int i10 = 0; i10 < nodeCount; i10++) {
            Node node = node(i10);
            if (node instanceof Element) {
                Element element = (Element) node;
                String elementID = elementID(element);
                if (elementID != null && elementID.equals(str)) {
                    return element;
                }
                Element elementByID = element.elementByID(str);
                if (elementByID != null) {
                    return elementByID;
                }
            }
        }
        return null;
    }

    public String elementID(Element element) {
        return element.attributeValue(OperatorName.BEGIN_INLINE_IMAGE_DATA);
    }

    public String getContentAsStringValue(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            short nodeType = node.getNodeType();
            if (nodeType == 1 || nodeType == 3 || nodeType == 4 || nodeType == 5) {
                return node.getStringValue();
            }
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            return "";
        }
    }

    public String getContentAsText(Object obj) {
        if (obj instanceof Node) {
            Node node = (Node) obj;
            short nodeType = node.getNodeType();
            if (nodeType == 3 || nodeType == 4 || nodeType == 5) {
                return node.getText();
            }
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            return "";
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        List contentList = contentList();
        if (contentList != null) {
            int size = contentList.size();
            if (size >= 1) {
                String contentAsText = getContentAsText(contentList.get(0));
                if (size == 1) {
                    return contentAsText;
                }
                StringBuffer stringBuffer = new StringBuffer(contentAsText);
                for (int i10 = 1; i10 < size; i10++) {
                    stringBuffer.append(getContentAsText(contentList.get(i10)));
                }
                return stringBuffer.toString();
            }
            return "";
        }
        return "";
    }

    public String getTextTrim() {
        String text = getText();
        StringBuffer stringBuffer = new StringBuffer();
        StringTokenizer stringTokenizer = new StringTokenizer(text);
        while (stringTokenizer.hasMoreTokens()) {
            stringBuffer.append(stringTokenizer.nextToken());
            if (stringTokenizer.hasMoreTokens()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean hasContent() {
        if (nodeCount() > 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public int indexOf(Node node) {
        return contentList().indexOf(node);
    }

    public void invalidNodeTypeAddException(Node node) {
        throw new IllegalAddException("Invalid node type. Cannot add node: " + node + " to this branch: " + this);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean isReadOnly() {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Node node(int i10) {
        Object obj = contentList().get(i10);
        if (obj instanceof Node) {
            return (Node) obj;
        }
        if (obj instanceof String) {
            return getDocumentFactory().createText(obj.toString());
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public int nodeCount() {
        return contentList().size();
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Iterator nodeIterator() {
        return contentList().iterator();
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public boolean remove(Node node) {
        short nodeType = node.getNodeType();
        if (nodeType != 1) {
            if (nodeType != 7) {
                if (nodeType != 8) {
                    invalidNodeTypeAddException(node);
                    return false;
                }
                return remove((Comment) node);
            }
            return remove((ProcessingInstruction) node);
        }
        return remove((Element) node);
    }

    public abstract boolean removeNode(Node node);

    @Override // lib.zj.office.fc.dom4j.Branch
    public void setProcessingInstructions(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            addNode((ProcessingInstruction) it.next());
        }
    }

    public List createContentList(int i10) {
        return new ArrayList(i10);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Element addElement(String str, String str2) {
        Element createElement = getDocumentFactory().createElement(str, str2);
        add(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public Element addElement(QName qName) {
        Element createElement = getDocumentFactory().createElement(qName);
        add(createElement);
        return createElement;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void add(Comment comment) {
        addNode(comment);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public boolean remove(Comment comment) {
        return removeNode(comment);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void add(Element element) {
        addNode(element);
    }

    public Element addElement(String str, String str2, String str3) {
        return addElement(getDocumentFactory().createQName(str, Namespace.get(str2, str3)));
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public boolean remove(Element element) {
        return removeNode(element);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void add(ProcessingInstruction processingInstruction) {
        addNode(processingInstruction);
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public boolean remove(ProcessingInstruction processingInstruction) {
        return removeNode(processingInstruction);
    }
}
