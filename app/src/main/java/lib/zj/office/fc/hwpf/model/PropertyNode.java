package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import java.util.Comparator;
import lib.zj.office.fc.hwpf.model.PropertyNode;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.POILogFactory;
import lib.zj.office.fc.util.POILogger;

@Internal
/* loaded from: classes3.dex */
public abstract class PropertyNode<T extends PropertyNode<T>> implements Comparable<T>, Cloneable {
    private static final POILogger _logger = POILogFactory.getLogger(PropertyNode.class);
    protected Object _buf;
    private int _cpEnd;
    private int _cpStart;

    /* loaded from: classes3.dex */
    public static final class EndComparator implements Comparator<PropertyNode<?>> {
        public static EndComparator instance = new EndComparator();

        @Override // java.util.Comparator
        public int compare(PropertyNode<?> propertyNode, PropertyNode<?> propertyNode2) {
            int end = propertyNode.getEnd();
            int end2 = propertyNode2.getEnd();
            if (end < end2) {
                return -1;
            }
            return end == end2 ? 0 : 1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class StartComparator implements Comparator<PropertyNode<?>> {
        public static StartComparator instance = new StartComparator();

        @Override // java.util.Comparator
        public int compare(PropertyNode<?> propertyNode, PropertyNode<?> propertyNode2) {
            int start = propertyNode.getStart();
            int start2 = propertyNode2.getStart();
            if (start < start2) {
                return -1;
            }
            return start == start2 ? 0 : 1;
        }
    }

    public PropertyNode(int i10, int i11, Object obj) {
        this._cpStart = i10;
        this._cpEnd = i11;
        this._buf = obj;
        if (i10 < 0) {
            POILogger pOILogger = _logger;
            int i12 = POILogger.WARN;
            pOILogger.log(i12, "A property claimed to start before zero, at " + this._cpStart + "! Resetting it to zero, and hoping for the best");
            this._cpStart = 0;
        }
        if (this._cpEnd < this._cpStart) {
            POILogger pOILogger2 = _logger;
            int i13 = POILogger.WARN;
            pOILogger2.log(i13, "A property claimed to end (" + this._cpEnd + ") before start! Resetting end to start, and hoping for the best");
            this._cpEnd = this._cpStart;
        }
    }

    public void adjustForDelete(int i10, int i11) {
        int i12;
        int i13 = i10 + i11;
        int i14 = this._cpEnd;
        if (i14 > i10) {
            int i15 = this._cpStart;
            if (i15 < i13) {
                if (i13 >= i14) {
                    i12 = i10;
                } else {
                    i12 = i14 - i11;
                }
                this._cpEnd = i12;
                this._cpStart = Math.min(i10, i15);
                return;
            }
            this._cpEnd = i14 - i11;
            this._cpStart = i15 - i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((PropertyNode<T>) obj);
    }

    public boolean equals(Object obj) {
        if (limitsAreEqual(obj)) {
            Object obj2 = ((PropertyNode) obj)._buf;
            if (obj2 instanceof byte[]) {
                Object obj3 = this._buf;
                if (obj3 instanceof byte[]) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj3);
                }
            }
            return this._buf.equals(obj2);
        }
        return false;
    }

    public int getEnd() {
        return this._cpEnd;
    }

    public int getStart() {
        return this._cpStart;
    }

    public int hashCode() {
        return this._buf.hashCode() + (this._cpStart * 31);
    }

    public boolean limitsAreEqual(Object obj) {
        PropertyNode propertyNode = (PropertyNode) obj;
        if (propertyNode.getStart() == this._cpStart && propertyNode.getEnd() == this._cpEnd) {
            return true;
        }
        return false;
    }

    public void setEnd(int i10) {
        this._cpEnd = i10;
    }

    public void setStart(int i10) {
        this._cpStart = i10;
    }

    public T clone() {
        return (T) super.clone();
    }

    public int compareTo(T t4) {
        int end = t4.getEnd();
        int i10 = this._cpEnd;
        if (i10 == end) {
            return 0;
        }
        return i10 < end ? -1 : 1;
    }
}
