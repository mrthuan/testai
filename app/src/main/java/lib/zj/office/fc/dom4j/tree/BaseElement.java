package lib.zj.office.fc.dom4j.tree;

import java.util.List;
import lib.zj.office.fc.dom4j.Branch;
import lib.zj.office.fc.dom4j.Document;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class BaseElement extends AbstractElement {
    protected List attributes;
    protected List content;
    private Branch parentBranch;
    private QName qname;

    public BaseElement(String str) {
        this.qname = getDocumentFactory().createQName(str);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement
    public List attributeList() {
        if (this.attributes == null) {
            this.attributes = createAttributeList();
        }
        return this.attributes;
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void clearContent() {
        contentList().clear();
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractBranch
    public List contentList() {
        if (this.content == null) {
            this.content = createContentList();
        }
        return this.content;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Document getDocument() {
        Branch branch = this.parentBranch;
        if (branch instanceof Document) {
            return (Document) branch;
        }
        if (branch instanceof Element) {
            return ((Element) branch).getDocument();
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Element getParent() {
        Branch branch = this.parentBranch;
        if (branch instanceof Element) {
            return (Element) branch;
        }
        return null;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public QName getQName() {
        return this.qname;
    }

    public void setAttributeList(List list) {
        this.attributes = list;
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void setAttributes(List list) {
        this.attributes = list;
        if (list instanceof ContentListFacade) {
            this.attributes = ((ContentListFacade) list).getBackingList();
        }
    }

    @Override // lib.zj.office.fc.dom4j.Branch
    public void setContent(List list) {
        this.content = list;
        if (list instanceof ContentListFacade) {
            this.content = ((ContentListFacade) list).getBackingList();
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setDocument(Document document) {
        if ((this.parentBranch instanceof Document) || document != null) {
            this.parentBranch = document;
        }
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setParent(Element element) {
        if ((this.parentBranch instanceof Element) || element != null) {
            this.parentBranch = element;
        }
    }

    @Override // lib.zj.office.fc.dom4j.Element
    public void setQName(QName qName) {
        this.qname = qName;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return true;
    }

    public BaseElement(QName qName) {
        this.qname = qName;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement
    public List attributeList(int i10) {
        if (this.attributes == null) {
            this.attributes = createAttributeList(i10);
        }
        return this.attributes;
    }

    public BaseElement(String str, Namespace namespace) {
        this.qname = getDocumentFactory().createQName(str, namespace);
    }
}
