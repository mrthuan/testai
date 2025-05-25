package lib.zj.office.fc.dom4j.tree;

import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;
import lib.zj.office.fc.dom4j.QName;

/* loaded from: classes3.dex */
public class ElementQNameIterator extends FilterIterator {
    private QName qName;

    public ElementQNameIterator(Iterator it, QName qName) {
        super(it);
        this.qName = qName;
    }

    @Override // lib.zj.office.fc.dom4j.tree.FilterIterator
    public boolean matches(Object obj) {
        if (obj instanceof Element) {
            return this.qName.equals(((Element) obj).getQName());
        }
        return false;
    }
}
