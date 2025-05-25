package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.hwpf.sprm.SprmIterator;
import lib.zj.office.fc.hwpf.sprm.SprmOperation;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class POIListLevel {
    private static final int RGBXCH_NUMS_SIZE = 9;
    private static BitField _fLegal;
    private static BitField _fNoRestart;
    private static BitField _fPrev;
    private static BitField _fPrevSpace;
    private static BitField _fWord6;
    private static BitField _jc = BitFieldFactory.getInstance(1);
    private int _cbGrpprlChpx;
    private int _cbGrpprlPapx;
    private int _dxaIndent;
    private int _dxaSpace;
    private byte[] _grpprlChpx;
    private byte[] _grpprlPapx;
    private int _iStartAt;
    private byte _info;
    private byte _ixchFollow;
    private byte _nfc;
    private char[] _numberText;
    private short _reserved;
    private byte[] _rgbxchNums;
    private int _speecialIndent;

    public POIListLevel(byte[] bArr, int i10) {
        this._numberText = null;
        this._iStartAt = LittleEndian.getInt(bArr, i10);
        int i11 = i10 + 4;
        int i12 = i11 + 1;
        this._nfc = bArr[i11];
        int i13 = i12 + 1;
        this._info = bArr[i12];
        byte[] bArr2 = new byte[9];
        this._rgbxchNums = bArr2;
        System.arraycopy(bArr, i13, bArr2, 0, 9);
        int i14 = i13 + 9;
        int i15 = i14 + 1;
        this._ixchFollow = bArr[i14];
        this._dxaSpace = LittleEndian.getInt(bArr, i15);
        int i16 = i15 + 4;
        this._dxaIndent = LittleEndian.getInt(bArr, i16);
        int i17 = i16 + 4;
        int i18 = i17 + 1;
        this._cbGrpprlChpx = LittleEndian.getUnsignedByte(bArr, i17);
        int i19 = i18 + 1;
        this._cbGrpprlPapx = LittleEndian.getUnsignedByte(bArr, i18);
        this._reserved = LittleEndian.getShort(bArr, i19);
        int i20 = i19 + 2;
        int i21 = this._cbGrpprlPapx;
        byte[] bArr3 = new byte[i21];
        this._grpprlPapx = bArr3;
        this._grpprlChpx = new byte[this._cbGrpprlChpx];
        System.arraycopy(bArr, i20, bArr3, 0, i21);
        int i22 = i20 + this._cbGrpprlPapx;
        System.arraycopy(bArr, i22, this._grpprlChpx, 0, this._cbGrpprlChpx);
        int i23 = i22 + this._cbGrpprlChpx;
        int i24 = LittleEndian.getShort(bArr, i23);
        if (i24 > 0) {
            this._numberText = new char[i24];
            int i25 = i23 + 2;
            for (int i26 = 0; i26 < i24 && i25 < bArr.length; i26++) {
                this._numberText[i26] = (char) LittleEndian.getShort(bArr, i25);
                i25 += 2;
            }
        }
        SprmIterator sprmIterator = new SprmIterator(this._grpprlPapx, 0);
        while (sprmIterator.hasNext()) {
            SprmOperation next = sprmIterator.next();
            if (next.getType() == 1) {
                int operation = next.getOperation();
                if (operation == 15) {
                    this._dxaIndent = next.getOperand();
                } else if (operation == 17) {
                    this._speecialIndent = next.getOperand();
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        POIListLevel pOIListLevel = (POIListLevel) obj;
        if (this._cbGrpprlChpx != pOIListLevel._cbGrpprlChpx || pOIListLevel._cbGrpprlPapx != this._cbGrpprlPapx || pOIListLevel._dxaIndent != this._dxaIndent || pOIListLevel._dxaSpace != this._dxaSpace || !Arrays.equals(pOIListLevel._grpprlChpx, this._grpprlChpx) || !Arrays.equals(pOIListLevel._grpprlPapx, this._grpprlPapx) || pOIListLevel._info != this._info || pOIListLevel._iStartAt != this._iStartAt || pOIListLevel._ixchFollow != this._ixchFollow || pOIListLevel._nfc != this._nfc || !Arrays.equals(pOIListLevel._numberText, this._numberText) || !Arrays.equals(pOIListLevel._rgbxchNums, this._rgbxchNums) || pOIListLevel._reserved != this._reserved) {
            return false;
        }
        return true;
    }

    public int getAlignment() {
        return _jc.getValue(this._info);
    }

    public byte[] getLevelProperties() {
        return this._grpprlPapx;
    }

    public char[] getNumberChar() {
        return this._numberText;
    }

    public int getNumberFormat() {
        return this._nfc;
    }

    public String getNumberText() {
        char[] cArr = this._numberText;
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    public int getSizeInBytes() {
        int i10 = this._cbGrpprlChpx + 28 + this._cbGrpprlPapx + 2;
        char[] cArr = this._numberText;
        if (cArr != null) {
            return i10 + (cArr.length * 2);
        }
        return i10;
    }

    public int getSpecialIndnet() {
        return this._speecialIndent;
    }

    public int getStartAt() {
        return this._iStartAt;
    }

    public int getTextIndent() {
        return this._dxaIndent;
    }

    public byte getTypeOfCharFollowingTheNumber() {
        return this._ixchFollow;
    }

    public void setAlignment(int i10) {
        _jc.setValue(this._info, i10);
    }

    public void setLevelProperties(byte[] bArr) {
        this._grpprlPapx = bArr;
    }

    public void setNumberFormat(int i10) {
        this._nfc = (byte) i10;
    }

    public void setNumberProperties(byte[] bArr) {
        this._grpprlChpx = bArr;
    }

    public void setStartAt(int i10) {
        this._iStartAt = i10;
    }

    public void setTypeOfCharFollowingTheNumber(byte b10) {
        this._ixchFollow = b10;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSizeInBytes()];
        int i10 = 0;
        LittleEndian.putInt(bArr, 0, this._iStartAt);
        bArr[4] = this._nfc;
        bArr[5] = this._info;
        System.arraycopy(this._rgbxchNums, 0, bArr, 6, 9);
        bArr[15] = this._ixchFollow;
        LittleEndian.putInt(bArr, 16, this._dxaSpace);
        LittleEndian.putInt(bArr, 20, this._dxaIndent);
        bArr[24] = (byte) this._cbGrpprlChpx;
        bArr[25] = (byte) this._cbGrpprlPapx;
        LittleEndian.putShort(bArr, 26, this._reserved);
        System.arraycopy(this._grpprlPapx, 0, bArr, 28, this._cbGrpprlPapx);
        int i11 = 28 + this._cbGrpprlPapx;
        System.arraycopy(this._grpprlChpx, 0, bArr, i11, this._cbGrpprlChpx);
        int i12 = i11 + this._cbGrpprlChpx;
        char[] cArr = this._numberText;
        if (cArr == null) {
            LittleEndian.putUShort(bArr, i12, 0);
        } else {
            LittleEndian.putUShort(bArr, i12, cArr.length);
            int i13 = i12 + 2;
            while (true) {
                char[] cArr2 = this._numberText;
                if (i10 >= cArr2.length) {
                    break;
                }
                LittleEndian.putUShort(bArr, i13, cArr2[i10]);
                i13 += 2;
                i10++;
            }
        }
        return bArr;
    }

    public POIListLevel(int i10, boolean z10) {
        this._iStartAt = 1;
        this._grpprlPapx = new byte[0];
        this._grpprlChpx = new byte[0];
        this._numberText = new char[0];
        byte[] bArr = new byte[9];
        this._rgbxchNums = bArr;
        if (z10) {
            bArr[0] = 1;
            this._numberText = new char[]{(char) i10, '.'};
            return;
        }
        this._numberText = new char[]{8226};
    }

    public POIListLevel(int i10, int i11, int i12, byte[] bArr, byte[] bArr2, String str) {
        this._numberText = null;
        this._iStartAt = i10;
        this._nfc = (byte) i11;
        _jc.setValue(this._info, i12);
        this._grpprlChpx = bArr;
        this._grpprlPapx = bArr2;
        this._numberText = str.toCharArray();
    }
}
