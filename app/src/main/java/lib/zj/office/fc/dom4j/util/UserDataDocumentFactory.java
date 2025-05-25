package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.Attribute;
import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class UserDataDocumentFactory extends DocumentFactory {
    protected static transient UserDataDocumentFactory singleton = new UserDataDocumentFactory();

    public static DocumentFactory getInstance() {
        return singleton;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Attribute createAttribute(Element element, QName qName, String str) {
        return new UserDataAttribute(qName, str);
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Element createElement(QName qName) {
        return new UserDataElement(qName);
    }
}
