package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class DefaultAttribute extends FlyweightAttribute {
    private Element parent;

    public DefaultAttribute(QName qName) {
        super(qName);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Element getParent() {
        return this.parent;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean isReadOnly() {
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractAttribute, lib.zj.office.fc.dom4j.Attribute
    public void setValue(String str) {
        this.value = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return true;
    }

    public DefaultAttribute(QName qName, String str) {
        super(qName, str);
    }

    public DefaultAttribute(Element element, QName qName, String str) {
        super(qName, str);
        this.parent = element;
    }

    public DefaultAttribute(String str, String str2) {
        super(str, str2);
    }

    public DefaultAttribute(String str, String str2, Namespace namespace) {
        super(str, str2, namespace);
    }

    public DefaultAttribute(Element element, String str, String str2, Namespace namespace) {
        super(str, str2, namespace);
        this.parent = element;
    }
}
