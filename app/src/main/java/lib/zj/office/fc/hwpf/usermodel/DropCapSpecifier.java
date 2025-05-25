package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DropCapSpecifier implements Cloneable {
    private static BitField _lines = BitFieldFactory.getInstance(248);
    private static BitField _type = BitFieldFactory.getInstance(7);
    private short _fdct;

    public DropCapSpecifier() {
        this._fdct = (short) 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DropCapSpecifier.class == obj.getClass() && this._fdct == ((DropCapSpecifier) obj)._fdct) {
            return true;
        }
        return false;
    }

    public byte getCountOfLinesToDrop() {
        return (byte) _lines.getValue(this._fdct);
    }

    public byte getDropCapType() {
        return (byte) _type.getValue(this._fdct);
    }

    public int hashCode() {
        return this._fdct;
    }

    public boolean isEmpty() {
        if (this._fdct == 0) {
            return true;
        }
        return false;
    }

    public void setCountOfLinesToDrop(byte b10) {
        this._fdct = (short) _lines.setValue(this._fdct, b10);
    }

    public void setDropCapType(byte b10) {
        this._fdct = (short) _type.setValue(this._fdct, b10);
    }

    public short toShort() {
        return this._fdct;
    }

    public String toString() {
        if (isEmpty()) {
            return "[DCS] EMPTY";
        }
        return "[DCS] (type: " + ((int) getDropCapType()) + "; count: " + ((int) getCountOfLinesToDrop()) + ")";
    }

    public DropCapSpecifier clone() {
        return new DropCapSpecifier(this._fdct);
    }

    public DropCapSpecifier(byte[] bArr, int i10) {
        this(LittleEndian.getShort(bArr, i10));
    }

    public DropCapSpecifier(short s4) {
        this._fdct = s4;
    }
}
