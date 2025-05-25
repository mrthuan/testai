package lib.zj.office.fc.hwpf.model;

import java.util.Arrays;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class Ffn {
    private int _cbFfnM1;
    private byte _chs;
    private byte _info;
    private byte _ixchSzAlt;
    private short _wWeight;
    private char[] _xszFfn;
    private int _xszFfnLength;
    private static BitField _prq = BitFieldFactory.getInstance(3);
    private static BitField _fTrueType = BitFieldFactory.getInstance(4);
    private static BitField _ff = BitFieldFactory.getInstance(112);
    private byte[] _panose = new byte[10];
    private byte[] _fontSig = new byte[24];

    public Ffn(byte[] bArr, int i10) {
        this._cbFfnM1 = LittleEndian.getUnsignedByte(bArr, i10);
        int i11 = i10 + 1;
        this._info = bArr[i11];
        int i12 = i11 + 1;
        this._wWeight = LittleEndian.getShort(bArr, i12);
        int i13 = i12 + 2;
        this._chs = bArr[i13];
        int i14 = i13 + 1;
        this._ixchSzAlt = bArr[i14];
        int i15 = i14 + 1;
        byte[] bArr2 = this._panose;
        System.arraycopy(bArr, i15, bArr2, 0, bArr2.length);
        int length = i15 + this._panose.length;
        byte[] bArr3 = this._fontSig;
        System.arraycopy(bArr, length, bArr3, 0, bArr3.length);
        int length2 = length + this._fontSig.length;
        int size = (getSize() - (length2 - i10)) / 2;
        this._xszFfnLength = size;
        this._xszFfn = new char[size];
        for (int i16 = 0; i16 < this._xszFfnLength; i16++) {
            this._xszFfn[i16] = (char) LittleEndian.getShort(bArr, length2);
            length2 += 2;
        }
    }

    public boolean equals(Object obj) {
        Ffn ffn = (Ffn) obj;
        if (ffn.get_cbFfnM1() != this._cbFfnM1 || ffn._info != this._info || ffn._wWeight != this._wWeight || ffn._chs != this._chs || ffn._ixchSzAlt != this._ixchSzAlt || !Arrays.equals(ffn._panose, this._panose) || !Arrays.equals(ffn._fontSig, this._fontSig) || !Arrays.equals(ffn._xszFfn, this._xszFfn)) {
            return false;
        }
        return true;
    }

    public String getAltFontName() {
        int i10 = this._ixchSzAlt;
        while (i10 < this._xszFfnLength && this._xszFfn[i10] != 0) {
            i10++;
        }
        return new String(this._xszFfn, (int) this._ixchSzAlt, i10);
    }

    public byte getChs() {
        return this._chs;
    }

    public byte[] getFontSig() {
        return this._fontSig;
    }

    public String getMainFontName() {
        int i10 = 0;
        while (i10 < this._xszFfnLength && this._xszFfn[i10] != 0) {
            i10++;
        }
        return new String(this._xszFfn, 0, i10);
    }

    public byte[] getPanose() {
        return this._panose;
    }

    public int getSize() {
        return this._cbFfnM1 + 1;
    }

    public short getWeight() {
        return this._wWeight;
    }

    public int get_cbFfnM1() {
        return this._cbFfnM1;
    }

    public void set_cbFfnM1(int i10) {
        this._cbFfnM1 = i10;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[getSize()];
        int i10 = 0;
        bArr[0] = (byte) this._cbFfnM1;
        bArr[1] = this._info;
        LittleEndian.putShort(bArr, 2, this._wWeight);
        bArr[4] = this._chs;
        bArr[5] = this._ixchSzAlt;
        byte[] bArr2 = this._panose;
        System.arraycopy(bArr2, 0, bArr, 6, bArr2.length);
        int length = 6 + this._panose.length;
        byte[] bArr3 = this._fontSig;
        System.arraycopy(bArr3, 0, bArr, length, bArr3.length);
        int length2 = length + this._fontSig.length;
        while (true) {
            char[] cArr = this._xszFfn;
            if (i10 < cArr.length) {
                LittleEndian.putShort(bArr, length2, (short) cArr[i10]);
                length2 += 2;
                i10++;
            } else {
                return bArr;
            }
        }
    }
}
