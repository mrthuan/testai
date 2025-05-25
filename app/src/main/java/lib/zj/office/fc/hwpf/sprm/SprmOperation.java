package lib.zj.office.fc.hwpf.sprm;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class SprmOperation {
    private static final BitField BITFIELD_OP = BitFieldFactory.getInstance(511);
    private static final BitField BITFIELD_SIZECODE = BitFieldFactory.getInstance(57344);
    private static final BitField BITFIELD_SPECIAL = BitFieldFactory.getInstance(512);
    private static final BitField BITFIELD_TYPE = BitFieldFactory.getInstance(7168);
    @Deprecated
    public static final int PAP_TYPE = 1;
    private static final short SPRM_LONG_PARAGRAPH = -14827;
    private static final short SPRM_LONG_TABLE = -10744;
    @Deprecated
    public static final int TAP_TYPE = 5;
    public static final int TYPE_CHP = 2;
    public static final int TYPE_PAP = 1;
    public static final int TYPE_PIC = 3;
    public static final int TYPE_SEP = 4;
    public static final int TYPE_TAP = 5;
    private int _gOffset;
    private byte[] _grpprl;
    private int _offset;
    private int _size;
    private short _value;

    public SprmOperation(byte[] bArr, int i10) {
        this._grpprl = bArr;
        short s4 = LittleEndian.getShort(bArr, i10);
        this._value = s4;
        this._offset = i10;
        this._gOffset = i10 + 2;
        this._size = initSize(s4);
    }

    public static int getOperationFromOpcode(short s4) {
        return BITFIELD_OP.getValue(s4);
    }

    public static int getTypeFromOpcode(short s4) {
        return BITFIELD_TYPE.getValue(s4);
    }

    private int initSize(short s4) {
        switch (getSizeCode()) {
            case 0:
            case 1:
                return 3;
            case 2:
            case 4:
            case 5:
                return 4;
            case 3:
                return 6;
            case 6:
                int i10 = this._gOffset;
                if (s4 != -10744 && s4 != -14827) {
                    byte[] bArr = this._grpprl;
                    this._gOffset = i10 + 1;
                    return (bArr[i10] & 255) + 3;
                }
                int i11 = (LittleEndian.getShort(this._grpprl, i10) & 65535) + 3;
                this._gOffset += 2;
                return i11;
            case 7:
                return 5;
            default:
                throw new IllegalArgumentException("SPRM contains an invalid size code");
        }
    }

    public byte[] getGrpprl() {
        return this._grpprl;
    }

    public int getGrpprlOffset() {
        return this._gOffset;
    }

    public int getOperand() {
        switch (getSizeCode()) {
            case 0:
            case 1:
                return this._grpprl[this._gOffset];
            case 2:
            case 4:
            case 5:
                return LittleEndian.getShort(this._grpprl, this._gOffset);
            case 3:
                return LittleEndian.getInt(this._grpprl, this._gOffset);
            case 6:
                byte b10 = this._grpprl[this._gOffset + 1];
                byte[] bArr = new byte[4];
                for (int i10 = 0; i10 < b10; i10++) {
                    int i11 = this._gOffset;
                    int i12 = i11 + i10;
                    byte[] bArr2 = this._grpprl;
                    if (i12 < bArr2.length) {
                        bArr[i10] = bArr2[i11 + 1 + i10];
                    }
                }
                return LittleEndian.getInt(bArr, 0);
            case 7:
                byte[] bArr3 = this._grpprl;
                int i13 = this._gOffset;
                return LittleEndian.getInt(new byte[]{bArr3[i13], bArr3[i13 + 1], bArr3[i13 + 2], 0}, 0);
            default:
                throw new IllegalArgumentException("SPRM contains an invalid size code");
        }
    }

    public int getOperation() {
        return BITFIELD_OP.getValue(this._value);
    }

    public int getSizeCode() {
        return BITFIELD_SIZECODE.getValue(this._value);
    }

    public int getType() {
        return BITFIELD_TYPE.getValue(this._value);
    }

    public int size() {
        return this._size;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        System.arraycopy(this._grpprl, this._offset, bArr, 0, size());
        return bArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[SPRM] (0x");
        sb2.append(Integer.toHexString(this._value & 65535));
        sb2.append("): ");
        try {
            sb2.append(getOperand());
        } catch (Exception unused) {
            sb2.append("(error)");
        }
        return sb2.toString();
    }
}
