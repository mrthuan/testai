package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class ExEmbedAtom extends RecordAtom {
    public static final int DOES_NOT_FOLLOW_COLOR_SCHEME = 0;
    public static final int FOLLOWS_ENTIRE_COLOR_SCHEME = 1;
    public static final int FOLLOWS_TEXT_AND_BACKGROUND_SCHEME = 2;
    private byte[] _data;
    private byte[] _header;

    public ExEmbedAtom() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._data = new byte[7];
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        LittleEndian.putInt(this._header, 4, this._data.length);
    }

    public boolean getCantLockServerB() {
        if (this._data[4] != 0) {
            return true;
        }
        return false;
    }

    public int getFollowColorScheme() {
        return LittleEndian.getInt(this._data, 0);
    }

    public boolean getIsTable() {
        if (this._data[6] != 0) {
            return true;
        }
        return false;
    }

    public boolean getNoSizeToServerB() {
        if (this._data[5] != 0) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExEmbedAtom.typeID;
    }

    public ExEmbedAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this._data = bArr3;
        System.arraycopy(bArr, i10 + 8, bArr3, 0, i12);
        if (this._data.length >= 7) {
            return;
        }
        throw new IllegalArgumentException("The length of the data for a ExEmbedAtom must be at least 4 bytes, but was only " + this._data.length);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
