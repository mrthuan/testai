package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class InteractiveInfo extends RecordContainer {
    private static long _type = 4082;
    private byte[] _header;
    private InteractiveInfoAtom infoAtom;

    public InteractiveInfo(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof InteractiveInfoAtom) {
            this.infoAtom = (InteractiveInfoAtom) record;
            return;
        }
        throw new IllegalStateException("First child record wasn't a InteractiveInfoAtom, was of type " + this._children[0].getRecordType());
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        InteractiveInfoAtom interactiveInfoAtom = this.infoAtom;
        if (interactiveInfoAtom != null) {
            interactiveInfoAtom.dispose();
        }
    }

    public InteractiveInfoAtom getInteractiveInfoAtom() {
        return this.infoAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public InteractiveInfo() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        this._children = new Record[1];
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) _type);
        InteractiveInfoAtom interactiveInfoAtom = new InteractiveInfoAtom();
        this.infoAtom = interactiveInfoAtom;
        this._children[0] = interactiveInfoAtom;
    }
}
