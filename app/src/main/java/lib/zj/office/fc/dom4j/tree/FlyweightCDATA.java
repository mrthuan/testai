package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class FlyweightCDATA extends AbstractCDATA {
    protected String text;

    public FlyweightCDATA(String str) {
        this.text = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultCDATA(element, getText());
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return this.text;
    }
}
