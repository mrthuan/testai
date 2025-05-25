package lib.zj.office.fc.openxml4j.util;

/* loaded from: classes3.dex */
public final class Nullable<E> {
    private E value;

    public Nullable() {
    }

    public E getValue() {
        return this.value;
    }

    public boolean hasValue() {
        if (this.value != null) {
            return true;
        }
        return false;
    }

    public void nullify() {
        this.value = null;
    }

    public Nullable(E e10) {
        this.value = e10;
    }
}
