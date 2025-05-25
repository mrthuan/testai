package lib.zj.office.fc.hwpf.usermodel;

import a6.h;
import lib.zj.office.fc.ddf.EscherProperties;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class LineSpacingDescriptor implements Cloneable {
    short _dyaLine;
    short _fMultiLinespace;

    public LineSpacingDescriptor() {
        this._dyaLine = EscherProperties.GEOTEXT__REVERSEROWORDER;
        this._fMultiLinespace = (short) 1;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        LineSpacingDescriptor lineSpacingDescriptor = (LineSpacingDescriptor) obj;
        if (this._dyaLine == lineSpacingDescriptor._dyaLine && this._fMultiLinespace == lineSpacingDescriptor._fMultiLinespace) {
            return true;
        }
        return false;
    }

    public short getDyaLine() {
        return this._dyaLine;
    }

    public short getMultiLinespace() {
        return this._fMultiLinespace;
    }

    public boolean isEmpty() {
        if (this._dyaLine == 0 && this._fMultiLinespace == 0) {
            return true;
        }
        return false;
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, this._dyaLine);
        LittleEndian.putShort(bArr, i10 + 2, this._fMultiLinespace);
    }

    public void setDyaLine(short s4) {
        this._dyaLine = s4;
    }

    public void setMultiLinespace(short s4) {
        this._fMultiLinespace = s4;
    }

    public int toInt() {
        byte[] bArr = new byte[4];
        serialize(bArr, 0);
        return LittleEndian.getInt(bArr);
    }

    public String toString() {
        if (isEmpty()) {
            return "[LSPD] EMPTY";
        }
        StringBuilder sb2 = new StringBuilder("[LSPD] (dyaLine: ");
        sb2.append((int) this._dyaLine);
        sb2.append("; fMultLinespace: ");
        return h.g(sb2, this._fMultiLinespace, ")");
    }

    public LineSpacingDescriptor(byte[] bArr, int i10) {
        this._dyaLine = LittleEndian.getShort(bArr, i10);
        this._fMultiLinespace = LittleEndian.getShort(bArr, i10 + 2);
    }
}
