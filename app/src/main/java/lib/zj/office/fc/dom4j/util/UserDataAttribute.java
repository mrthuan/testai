package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.DefaultAttribute;

/* loaded from: classes3.dex */
public class UserDataAttribute extends DefaultAttribute {
    private Object data;

    public UserDataAttribute(QName qName) {
        super(qName);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractAttribute, lib.zj.office.fc.dom4j.Attribute
    public Object getData() {
        return this.data;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractAttribute, lib.zj.office.fc.dom4j.Attribute
    public void setData(Object obj) {
        this.data = obj;
    }

    public UserDataAttribute(QName qName, String str) {
        super(qName, str);
    }
}
