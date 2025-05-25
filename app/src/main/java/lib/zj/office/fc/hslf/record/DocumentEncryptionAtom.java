package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class DocumentEncryptionAtom extends RecordAtom {
    private static long _type = 12052;
    private byte[] _header;
    private byte[] data;
    private String encryptionProviderName;

    public DocumentEncryptionAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        int i12 = i11 - 8;
        byte[] bArr3 = new byte[i12];
        this.data = bArr3;
        int i13 = i10 + 8;
        System.arraycopy(bArr, i13, bArr3, 0, i12);
        int i14 = i13 + 44;
        int i15 = -1;
        for (int i16 = i14; i16 < i10 + i11 && i15 < 0; i16 += 2) {
            if (bArr[i16] == 0 && bArr[i16 + 1] == 0) {
                i15 = i16;
            }
        }
        this.encryptionProviderName = StringUtil.getFromUnicodeLE(bArr, i14, (i15 - i14) / 2);
    }

    public String getEncryptionProviderName() {
        return this.encryptionProviderName;
    }

    public int getKeyLength() {
        return this.data[28];
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }
}
