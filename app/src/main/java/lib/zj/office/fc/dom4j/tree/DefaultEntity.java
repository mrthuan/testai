package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public class DefaultEntity extends FlyweightEntity {
    private Element parent;

    public DefaultEntity(String str) {
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
    public void setName(String str) {
        this.name = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setParent(Element element) {
        this.parent = element;
    }

    @Override // lib.zj.office.fc.dom4j.tree.FlyweightEntity, lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        this.text = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public boolean supportsParent() {
        return true;
    }

    public DefaultEntity(String str, String str2) {
        super(str, str2);
    }

    public DefaultEntity(Element element, String str, String str2) {
        super(str, str2);
        this.parent = element;
    }
}
