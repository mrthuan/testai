package lib.zj.office.fc.hslf.record;

/* loaded from: classes3.dex */
public final class ExControl extends ExEmbed {
    public ExControl(byte[] bArr, int i10, int i11) {
        super(bArr, i10, i11);
    }

    public ExControlAtom getExControlAtom() {
        return (ExControlAtom) this._children[0];
    }

    @Override // lib.zj.office.fc.hslf.record.ExEmbed, lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExControl.typeID;
    }

    public ExControl() {
        Record[] recordArr = this._children;
        ExControlAtom exControlAtom = new ExControlAtom();
        this.embedAtom = exControlAtom;
        recordArr[0] = exControlAtom;
    }
}
