package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class TextCharsAtom extends RecordAtom {
    private static long _type = 4000;
    private byte[] _header;
    private byte[] _text;

    public TextCharsAtom(byte[] bArr, int i10, int i11) {
        i11 = i11 < 8 ? 8 : i11;
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._text = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public String getText() {
        return StringUtil.getFromUnicodeLE(this._text);
    }

    public void setText(String str) {
        byte[] bArr = new byte[str.length() * 2];
        this._text = bArr;
        StringUtil.putUnicodeLE(str, bArr, 0);
        LittleEndian.putInt(this._header, 4, this._text.length);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("TextCharsAtom:\n");
        stringBuffer.append(HexDump.dump(this._text, 0L, 0));
        return stringBuffer.toString();
    }

    public TextCharsAtom() {
        this._header = new byte[]{0, 0, -96, 15, 0, 0, 0, 0};
        this._text = new byte[0];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
