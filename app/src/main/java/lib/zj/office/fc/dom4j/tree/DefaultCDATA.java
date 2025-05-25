package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public class DefaultCDATA extends FlyweightCDATA {
    private Element parent;

    public DefaultCDATA(String str) {
        super(str);
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

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        this.text = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return true;
    }

    public DefaultCDATA(Element element, String str) {
        super(str);
        this.parent = element;
    }
}
