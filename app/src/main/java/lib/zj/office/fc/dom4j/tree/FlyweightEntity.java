package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class FlyweightEntity extends AbstractEntity {
    protected String name;
    protected String text;

    public FlyweightEntity() {
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultEntity(element, getName(), getText());
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getName() {
        return this.name;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return this.text;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public void setText(String str) {
        if (this.text != null) {
            this.text = str;
            return;
        }
        throw new UnsupportedOperationException("This Entity is read-only. It cannot be modified");
    }

    public FlyweightEntity(String str) {
        this.name = str;
    }

    public FlyweightEntity(String str, String str2) {
        this.name = str;
        this.text = str2;
    }
}
