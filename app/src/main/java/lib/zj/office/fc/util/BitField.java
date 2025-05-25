package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public class BitField {
    private final int _mask;
    private final int _shift_count;

    public BitField(int i10) {
        this._mask = i10;
        int i11 = 0;
        if (i10 != 0) {
            while ((i10 & 1) == 0) {
                i11++;
                i10 >>= 1;
            }
        }
        this._shift_count = i11;
    }

    public int clear(int i10) {
        return i10 & (~this._mask);
    }

    public byte clearByte(byte b10) {
        return (byte) clear(b10);
    }

    public short clearShort(short s4) {
        return (short) clear(s4);
    }

    public int getRawValue(int i10) {
        return i10 & this._mask;
    }

    public short getShortRawValue(short s4) {
        return (short) getRawValue(s4);
    }

    public short getShortValue(short s4) {
        return (short) getValue(s4);
    }

    public int getValue(int i10) {
        return getRawValue(i10) >>> this._shift_count;
    }

    public boolean isAllSet(int i10) {
        int i11 = this._mask;
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    public boolean isSet(int i10) {
        if ((i10 & this._mask) != 0) {
            return true;
        }
        return false;
    }

    public int set(int i10) {
        return i10 | this._mask;
    }

    public int setBoolean(int i10, boolean z10) {
        if (z10) {
            return set(i10);
        }
        return clear(i10);
    }

    public byte setByte(byte b10) {
        return (byte) set(b10);
    }

    public byte setByteBoolean(byte b10, boolean z10) {
        if (z10) {
            return setByte(b10);
        }
        return clearByte(b10);
    }

    public short setShort(short s4) {
        return (short) set(s4);
    }

    public short setShortBoolean(short s4, boolean z10) {
        if (z10) {
            return setShort(s4);
        }
        return clearShort(s4);
    }

    public short setShortValue(short s4, short s10) {
        return (short) setValue(s4, s10);
    }

    public int setValue(int i10, int i11) {
        int i12 = this._mask;
        return (i10 & (~i12)) | ((i11 << this._shift_count) & i12);
    }
}
