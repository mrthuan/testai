package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class NonLazyDocumentFactory extends DocumentFactory {
    protected static transient NonLazyDocumentFactory singleton = new NonLazyDocumentFactory();

    public static DocumentFactory getInstance() {
        return singleton;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Element createElement(QName qName) {
        return new NonLazyElement(qName);
    }
}
