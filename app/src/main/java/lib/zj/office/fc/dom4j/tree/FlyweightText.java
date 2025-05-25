package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.Node;

/* loaded from: classes3.dex */
public class FlyweightText extends AbstractText {
    protected String text;

    public FlyweightText(String str) {
        this.text = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode
    public Node createXPathResult(Element element) {
        return new DefaultText(element, getText());
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public String getText() {
        return this.text;
    }
}
