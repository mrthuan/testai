package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class HeadersFootersAtom extends RecordAtom {
    public static final int fHasDate = 1;
    public static final int fHasFooter = 32;
    public static final int fHasHeader = 16;
    public static final int fHasSlideNumber = 8;
    public static final int fHasTodayDate = 2;
    public static final int fHasUserDate = 4;
    private byte[] _header;
    private byte[] _recdata;

    public HeadersFootersAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._recdata = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    public boolean getFlag(int i10) {
        if ((i10 & getMask()) != 0) {
            return true;
        }
        return false;
    }

    public int getFormatId() {
        return LittleEndian.getShort(this._recdata, 0);
    }

    public int getMask() {
        return LittleEndian.getShort(this._recdata, 2);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.HeadersFootersAtom.typeID;
    }

    public void setFlag(int i10, boolean z10) {
        int i11;
        int mask = getMask();
        if (z10) {
            i11 = i10 | mask;
        } else {
            i11 = (~i10) & mask;
        }
        setMask(i11);
    }

    public void setFormatId(int i10) {
        LittleEndian.putUShort(this._recdata, 0, i10);
    }

    public void setMask(int i10) {
        LittleEndian.putUShort(this._recdata, 2, i10);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HeadersFootersAtom\n");
        stringBuffer.append("\tFormatId: " + getFormatId() + "\n");
        stringBuffer.append("\tMask    : " + getMask() + "\n");
        stringBuffer.append("\t  fHasDate        : " + getFlag(1) + "\n");
        stringBuffer.append("\t  fHasTodayDate   : " + getFlag(2) + "\n");
        stringBuffer.append("\t  fHasUserDate    : " + getFlag(4) + "\n");
        stringBuffer.append("\t  fHasSlideNumber : " + getFlag(8) + "\n");
        stringBuffer.append("\t  fHasHeader      : " + getFlag(16) + "\n");
        stringBuffer.append("\t  fHasFooter      : " + getFlag(32) + "\n");
        return stringBuffer.toString();
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._recdata);
    }

    public HeadersFootersAtom() {
        this._recdata = new byte[4];
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._recdata.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
