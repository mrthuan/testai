package lib.zj.office.fc.dom4j.tree;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public abstract class FilterIterator implements Iterator {
    private boolean first = true;
    private Object next;
    protected Iterator proxy;

    public FilterIterator(Iterator it) {
        this.proxy = it;
    }

    public Object findNext() {
        if (this.proxy != null) {
            while (this.proxy.hasNext()) {
                Object next = this.proxy.next();
                if (next != null && matches(next)) {
                    return next;
                }
            }
            this.proxy = null;
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.first) {
            this.next = findNext();
            this.first = false;
        }
        if (this.next == null) {
            return false;
        }
        return true;
    }

    public abstract boolean matches(Object obj);

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object obj = this.next;
            this.next = findNext();
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
