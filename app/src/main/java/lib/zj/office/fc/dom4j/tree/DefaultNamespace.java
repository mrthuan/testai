package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Namespace;

/* loaded from: classes3.dex */
public class DefaultNamespace extends Namespace {
    private Element parent;

    public DefaultNamespace(String str, String str2) {
        super(str, str2);
    }

    @Override // lib.zj.office.fc.dom4j.Namespace
    public int createHashCode() {
        int createHashCode = super.createHashCode();
        Element element = this.parent;
        if (element != null) {
            return createHashCode ^ element.hashCode();
        }
        return createHashCode;
    }

    @Override // lib.zj.office.fc.dom4j.Namespace
    public boolean equals(Object obj) {
        if ((obj instanceof DefaultNamespace) && ((DefaultNamespace) obj).parent == this.parent) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Element getParent() {
        return this.parent;
    }

    @Override // lib.zj.office.fc.dom4j.Namespace
    public int hashCode() {
        return super.hashCode();
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
    public boolean supportsParent() {
        return true;
    }

    public DefaultNamespace(Element element, String str, String str2) {
        super(str, str2);
        this.parent = element;
    }
}
