package lib.zj.office.fc.dom4j.tree;

import lib.zj.office.fc.dom4j.Namespace;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class FlyweightAttribute extends AbstractAttribute {
    private QName qname;
    protected String value;

    public FlyweightAttribute(QName qName) {
        this.qname = qName;
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public QName getQName() {
        return this.qname;
    }

    @Override // lib.zj.office.fc.dom4j.Attribute
    public String getValue() {
        return this.value;
    }

    public FlyweightAttribute(QName qName, String str) {
        this.qname = qName;
        this.value = str;
    }

    public FlyweightAttribute(String str, String str2) {
        this.qname = getDocumentFactory().createQName(str);
        this.value = str2;
    }

    public FlyweightAttribute(String str, String str2, Namespace namespace) {
        this.qname = getDocumentFactory().createQName(str, namespace);
        this.value = str2;
    }
}
