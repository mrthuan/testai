package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.BaseElement;

/* loaded from: classes3.dex */
public class NonLazyElement extends BaseElement {
    public NonLazyElement(String str) {
        super(str);
        this.attributes = createAttributeList();
        this.content = createContentList();
    }

    public NonLazyElement(QName qName) {
        super(qName);
        this.attributes = createAttributeList();
        this.content = createContentList();
    }

    public NonLazyElement(String str, Namespace namespace) {
        super(str, namespace);
        this.attributes = createAttributeList();
        this.content = createContentList();
    }

    public NonLazyElement(QName qName, int i10) {
        super(qName);
        this.attributes = createAttributeList(i10);
        this.content = createContentList();
    }
}
