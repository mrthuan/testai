package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class Environment extends PositionDependentRecordContainer {
    private static long _type = 1010;
    private byte[] _header;
    private FontCollection fontCollection;
    private TxMasterStyleAtom txmaster;

    public Environment(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        int i12 = 0;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        while (true) {
            Record[] recordArr = this._children;
            if (i12 >= recordArr.length) {
                break;
            }
            Record record = recordArr[i12];
            if (record instanceof FontCollection) {
                this.fontCollection = (FontCollection) record;
            } else if (record instanceof TxMasterStyleAtom) {
                this.txmaster = (TxMasterStyleAtom) record;
            }
            i12++;
        }
        if (this.fontCollection != null) {
            return;
        }
        throw new IllegalStateException("Environment didn't contain a FontCollection record!");
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        FontCollection fontCollection = this.fontCollection;
        if (fontCollection != null) {
            fontCollection.dispose();
        }
        TxMasterStyleAtom txMasterStyleAtom = this.txmaster;
        if (txMasterStyleAtom != null) {
            txMasterStyleAtom.dispose();
        }
    }

    public FontCollection getFontCollection() {
        return this.fontCollection;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public TxMasterStyleAtom getTxMasterStyleAtom() {
        return this.txmaster;
    }
}
