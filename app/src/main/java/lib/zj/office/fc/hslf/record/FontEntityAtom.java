package lib.zj.office.fc.hslf.record;

import java.io.UnsupportedEncodingException;
import lib.zj.office.fc.codec.CharEncoding;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class FontEntityAtom extends RecordAtom {
    private byte[] _header;
    private byte[] _recdata;

    public FontEntityAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._recdata = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    public int getCharSet() {
        return this._recdata[64];
    }

    public int getFontFlags() {
        return this._recdata[65];
    }

    public int getFontIndex() {
        return LittleEndian.getShort(this._header, 0) >> 4;
    }

    public String getFontName() {
        for (int i10 = 0; i10 < 64; i10 += 2) {
            try {
                byte[] bArr = this._recdata;
                if (bArr[i10] == 0 && bArr[i10 + 1] == 0) {
                    return new String(bArr, 0, i10, CharEncoding.UTF_16LE);
                }
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        return null;
    }

    public int getFontType() {
        return this._recdata[66];
    }

    public int getPitchAndFamily() {
        return this._recdata[67];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.FontEntityAtom.typeID;
    }

    public void setCharSet(int i10) {
        this._recdata[64] = (byte) i10;
    }

    public void setFontFlags(int i10) {
        this._recdata[65] = (byte) i10;
    }

    public void setFontIndex(int i10) {
        LittleEndian.putShort(this._header, 0, (short) i10);
    }

    public void setFontName(String str) {
        if (!str.endsWith("\u0000")) {
            str = str.concat("\u0000");
        }
        if (str.length() <= 32) {
            try {
                byte[] bytes = str.getBytes(CharEncoding.UTF_16LE);
                System.arraycopy(bytes, 0, this._recdata, 0, bytes.length);
                return;
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException(e10.getMessage(), e10);
            }
        }
        throw new RuntimeException("The length of the font name, including null termination, must not exceed 32 characters");
    }

    public void setFontType(int i10) {
        this._recdata[66] = (byte) i10;
    }

    public void setPitchAndFamily(int i10) {
        this._recdata[67] = (byte) i10;
    }

    public FontEntityAtom() {
        this._recdata = new byte[68];
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._recdata.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
