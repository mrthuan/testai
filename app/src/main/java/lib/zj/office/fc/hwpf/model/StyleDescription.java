package lib.zj.office.fc.hwpf.model;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.usermodel.CharacterProperties;
import lib.zj.office.fc.hwpf.usermodel.ParagraphProperties;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.Internal;
import lib.zj.office.fc.util.LittleEndian;

@Internal
/* loaded from: classes3.dex */
public final class StyleDescription implements HDFType {
    private static final int CHARACTER_STYLE = 2;
    private static final int PARAGRAPH_STYLE = 1;
    private int _baseLength;
    private short _bchUpe;
    CharacterProperties _chp;
    private short _infoShort;
    private short _infoShort2;
    private short _infoShort3;
    private short _infoShort4;
    private int _istd;
    String _name;
    ParagraphProperties _pap;
    UPX[] _upxs;
    private static BitField _sti = BitFieldFactory.getInstance(4095);
    private static BitField _fScratch = BitFieldFactory.getInstance(4096);
    private static BitField _fInvalHeight = BitFieldFactory.getInstance(8192);
    private static BitField _fHasUpe = BitFieldFactory.getInstance(16384);
    private static BitField _fMassCopy = BitFieldFactory.getInstance(Variant.VT_RESERVED);
    private static BitField _styleTypeCode = BitFieldFactory.getInstance(15);
    private static BitField _baseStyle = BitFieldFactory.getInstance(65520);
    private static BitField _numUPX = BitFieldFactory.getInstance(15);
    private static BitField _nextStyle = BitFieldFactory.getInstance(65520);
    private static BitField _fAutoRedef = BitFieldFactory.getInstance(1);
    private static BitField _fHidden = BitFieldFactory.getInstance(2);

    public StyleDescription() {
    }

    public boolean equals(Object obj) {
        StyleDescription styleDescription = (StyleDescription) obj;
        if (styleDescription._infoShort != this._infoShort || styleDescription._infoShort2 != this._infoShort2 || styleDescription._infoShort3 != this._infoShort3 || styleDescription._bchUpe != this._bchUpe || styleDescription._infoShort4 != this._infoShort4 || !this._name.equals(styleDescription._name) || !Arrays.equals(this._upxs, styleDescription._upxs)) {
            return false;
        }
        return true;
    }

    public int getBaseStyle() {
        return _baseStyle.getValue(this._infoShort2);
    }

    public CharacterProperties getCHP() {
        return this._chp;
    }

    public byte[] getCHPX() {
        int value = _styleTypeCode.getValue(this._infoShort2);
        if (value != 1) {
            if (value != 2) {
                return null;
            }
            return this._upxs[0].getUPX();
        }
        UPX[] upxArr = this._upxs;
        if (upxArr.length <= 1) {
            return null;
        }
        return upxArr[1].getUPX();
    }

    public String getName() {
        return this._name;
    }

    public ParagraphProperties getPAP() {
        return this._pap;
    }

    public byte[] getPAPX() {
        if (_styleTypeCode.getValue(this._infoShort2) != 1) {
            return null;
        }
        return this._upxs[0].getUPX();
    }

    public void setCHP(CharacterProperties characterProperties) {
        this._chp = characterProperties;
    }

    public void setPAP(ParagraphProperties paragraphProperties) {
        this._pap = paragraphProperties;
    }

    public byte[] toByteArray() {
        int i10 = 1;
        int size = this._upxs[0].size() + 2 + ((this._name.length() + 1) * 2) + this._baseLength + 2;
        while (true) {
            UPX[] upxArr = this._upxs;
            if (i10 >= upxArr.length) {
                break;
            }
            size = this._upxs[i10].size() + 2 + (upxArr[i10 - 1].size() % 2) + size;
            i10++;
        }
        byte[] bArr = new byte[size];
        LittleEndian.putShort(bArr, 0, this._infoShort);
        LittleEndian.putShort(bArr, 2, this._infoShort2);
        LittleEndian.putShort(bArr, 4, this._infoShort3);
        LittleEndian.putShort(bArr, 6, this._bchUpe);
        LittleEndian.putShort(bArr, 8, this._infoShort4);
        int i11 = this._baseLength;
        char[] charArray = this._name.toCharArray();
        LittleEndian.putShort(bArr, this._baseLength, (short) charArray.length);
        int i12 = i11 + 2;
        for (char c : charArray) {
            LittleEndian.putShort(bArr, i12, (short) c);
            i12 += 2;
        }
        int i13 = i12 + 2;
        int i14 = 0;
        while (true) {
            UPX[] upxArr2 = this._upxs;
            if (i14 < upxArr2.length) {
                short size2 = (short) upxArr2[i14].size();
                LittleEndian.putShort(bArr, i13, size2);
                int i15 = i13 + 2;
                System.arraycopy(this._upxs[i14].getUPX(), 0, bArr, i15, size2);
                i13 = i15 + (size2 % 2) + size2;
                i14++;
            } else {
                return bArr;
            }
        }
    }

    public StyleDescription(byte[] bArr, int i10, int i11, boolean z10) {
        short s4;
        short s10;
        this._baseLength = i10;
        int i12 = i10 + i11;
        this._infoShort = LittleEndian.getShort(bArr, i11);
        int i13 = i11 + 2;
        this._infoShort2 = LittleEndian.getShort(bArr, i13);
        int i14 = i13 + 2;
        this._infoShort3 = LittleEndian.getShort(bArr, i14);
        int i15 = i14 + 2;
        this._bchUpe = LittleEndian.getShort(bArr, i15);
        this._infoShort4 = LittleEndian.getShort(bArr, i15 + 2);
        if (z10) {
            s4 = LittleEndian.getShort(bArr, i12);
            i12 += 2;
            s10 = 2;
        } else {
            s4 = bArr[i12];
            s10 = 1;
        }
        try {
            this._name = new String(bArr, i12, s4 * s10, CharEncoding.UTF_16LE);
        } catch (UnsupportedEncodingException unused) {
        }
        int i16 = ((s4 + 1) * s10) + i12;
        int value = _numUPX.getValue(this._infoShort3);
        this._upxs = new UPX[value];
        for (int i17 = 0; i17 < value; i17++) {
            int i18 = LittleEndian.getShort(bArr, i16);
            int i19 = i16 + 2;
            byte[] bArr2 = new byte[i18];
            System.arraycopy(bArr, i19, bArr2, 0, i18);
            this._upxs[i17] = new UPX(bArr2);
            i16 = i19 + i18;
            if (i18 % 2 == 1) {
                i16++;
            }
        }
    }
}
