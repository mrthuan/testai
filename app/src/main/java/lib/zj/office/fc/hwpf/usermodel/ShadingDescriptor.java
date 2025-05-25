package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ShadingDescriptor implements Cloneable {
    public static final int SIZE = 2;
    private short _info;
    private static final BitField _icoFore = BitFieldFactory.getInstance(31);
    private static final BitField _icoBack = BitFieldFactory.getInstance(992);
    private static final BitField _ipat = BitFieldFactory.getInstance(64512);

    public ShadingDescriptor() {
    }

    public Object clone() {
        return super.clone();
    }

    public boolean isEmpty() {
        if (this._info == 0) {
            return true;
        }
        return false;
    }

    public void serialize(byte[] bArr, int i10) {
        LittleEndian.putShort(bArr, i10, this._info);
    }

    public short toShort() {
        return this._info;
    }

    public String toString() {
        if (isEmpty()) {
            return "[SHD] EMPTY";
        }
        return "[SHD] (cvFore: " + ((int) _icoFore.getShortValue(this._info)) + "; cvBack: " + ((int) _icoBack.getShortValue(this._info)) + "; iPat: " + ((int) _ipat.getShortValue(this._info)) + ")";
    }

    public ShadingDescriptor(byte[] bArr, int i10) {
        this(LittleEndian.getShort(bArr, i10));
    }

    public ShadingDescriptor(short s4) {
        this._info = s4;
    }
}
