package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;
import lib.zj.office.fc.dom4j.tree.DefaultElement;

/* loaded from: classes3.dex */
public class UserDataElement extends DefaultElement {
    private Object data;

    public UserDataElement(String str) {
        super(str);
    }

    @Override // lib.zj.office.fc.dom4j.tree.DefaultElement, lib.zj.office.fc.dom4j.tree.AbstractNode, lib.zj.office.fc.dom4j.Node
    public Object clone() {
        UserDataElement userDataElement = (UserDataElement) super.clone();
        if (userDataElement != this) {
            userDataElement.data = getCopyOfUserData();
        }
        return userDataElement;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement
    public Element createElement(String str) {
        Element createElement = getDocumentFactory().createElement(str);
        createElement.setData(getCopyOfUserData());
        return createElement;
    }

    public Object getCopyOfUserData() {
        return this.data;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public Object getData() {
        return this.data;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement, lib.zj.office.fc.dom4j.Element
    public void setData(Object obj) {
        this.data = obj;
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement
    public String toString() {
        return super.toString() + " userData: " + this.data;
    }

    public UserDataElement(QName qName) {
        super(qName);
    }

    @Override // lib.zj.office.fc.dom4j.tree.AbstractElement
    public Element createElement(QName qName) {
        Element createElement = getDocumentFactory().createElement(qName);
        createElement.setData(getCopyOfUserData());
        return createElement;
    }
}
