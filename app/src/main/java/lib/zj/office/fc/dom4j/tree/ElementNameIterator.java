package lib.zj.office.fc.dom4j.tree;

import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public class ElementNameIterator extends FilterIterator {
    private String name;

    public ElementNameIterator(Iterator it, String str) {
        super(it);
        this.name = str;
    }

    @Override // lib.zj.office.fc.dom4j.tree.FilterIterator
    public boolean matches(Object obj) {
        if (obj instanceof Element) {
            return this.name.equals(((Element) obj).getName());
        }
        return false;
    }
}
