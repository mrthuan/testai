package lib.zj.office.fc.hwpf.model;

import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public class Colorref implements Cloneable {
    private int value;

    public Colorref() {
        this.value = -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.value == ((Colorref) obj).value) {
            return true;
        }
        return false;
    }

    public int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public boolean isEmpty() {
        if (this.value == -1) {
            return true;
        }
        return false;
    }

    public void setValue(int i10) {
        this.value = i10;
    }

    public byte[] toByteArray() {
        if (!isEmpty()) {
            byte[] bArr = new byte[4];
            LittleEndian.putInt(bArr, 0, this.value);
            return bArr;
        }
        throw new IllegalStateException("Structure state (EMPTY) is not good for serialization");
    }

    public String toString() {
        if (isEmpty()) {
            return "[COLORREF] EMPTY";
        }
        return "[COLORREF] 0x" + Integer.toHexString(this.value);
    }

    public Colorref clone() {
        return new Colorref(this.value);
    }

    public Colorref(byte[] bArr, int i10) {
        this.value = LittleEndian.getInt(bArr, i10);
    }

    public Colorref(int i10) {
        this.value = i10;
    }
}
