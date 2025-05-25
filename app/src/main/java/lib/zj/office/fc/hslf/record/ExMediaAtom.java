package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class ExMediaAtom extends RecordAtom {
    public static final int fLoop = 1;
    public static final int fNarration = 4;
    public static final int fRewind = 2;
    private byte[] _header;
    private byte[] _recdata;

    public ExMediaAtom() {
        this._recdata = new byte[8];
        byte[] bArr = new byte[8];
        this._header = bArr;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._recdata.length);
    }

    public boolean getFlag(int i10) {
        if ((i10 & getMask()) != 0) {
            return true;
        }
        return false;
    }

    public int getMask() {
        return LittleEndian.getInt(this._recdata, 4);
    }

    public int getObjectId() {
        return LittleEndian.getInt(this._recdata, 0);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExMediaAtom.typeID;
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

    public void setMask(int i10) {
        LittleEndian.putInt(this._recdata, 4, i10);
    }

    public void setObjectId(int i10) {
        LittleEndian.putInt(this._recdata, 0, i10);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ExMediaAtom\n");
        stringBuffer.append("\tObjectId: " + getObjectId() + "\n");
        stringBuffer.append("\tMask    : " + getMask() + "\n");
        stringBuffer.append("\t  fLoop        : " + getFlag(1) + "\n");
        stringBuffer.append("\t  fRewind   : " + getFlag(2) + "\n");
        stringBuffer.append("\t  fNarration    : " + getFlag(4) + "\n");
        return stringBuffer.toString();
    }

    public void writeOut(OutputStream outputStream) {
        outputStream.write(this._header);
        outputStream.write(this._recdata);
    }

    public ExMediaAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._recdata = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
