package lib.zj.office.fc.dom4j.util;

import lib.zj.office.fc.dom4j.DocumentFactory;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class IndexedDocumentFactory extends DocumentFactory {
    protected static transient IndexedDocumentFactory singleton = new IndexedDocumentFactory();

    public static DocumentFactory getInstance() {
        return singleton;
    }

    @Override // lib.zj.office.fc.dom4j.DocumentFactory
    public Element createElement(QName qName) {
        return new IndexedElement(qName);
    }

    public Element createElement(QName qName, int i10) {
        return new IndexedElement(qName, i10);
    }
}
