package lib.zj.office.fc.dom4j.tree;

import java.util.Iterator;
import lib.zj.office.fc.dom4j.Element;

/* loaded from: classes3.dex */
public class ElementIterator extends FilterIterator {
    public ElementIterator(Iterator it) {
        super(it);
    }

    @Override // lib.zj.office.fc.dom4j.tree.FilterIterator
    public boolean matches(Object obj) {
        return obj instanceof Element;
    }
}
