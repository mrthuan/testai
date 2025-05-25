package lib.zj.office.fc.hslf.record;

import java.io.OutputStream;

/* loaded from: classes3.dex */
public final class List extends PositionDependentRecordContainer {
    private ExtendedPresRuleContainer _extendedPresRuleContainer;
    private byte[] _header;

    public List(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        Record[] findChildRecords = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        this._children = findChildRecords;
        findExtendedPreRuleRecord(findChildRecords);
    }

    private void findExtendedPreRuleRecord(Record[] recordArr) {
        for (int i10 = 0; i10 < recordArr.length; i10++) {
            Record record = recordArr[i10];
            if (record instanceof ExtendedPresRuleContainer) {
                this._extendedPresRuleContainer = (ExtendedPresRuleContainer) record;
            } else if (!record.isAnAtom()) {
                findExtendedPreRuleRecord(recordArr[i10].getChildRecords());
            }
        }
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        ExtendedPresRuleContainer extendedPresRuleContainer = this._extendedPresRuleContainer;
        if (extendedPresRuleContainer != null) {
            extendedPresRuleContainer.dispose();
        }
    }

    public ExtendedPresRuleContainer getExtendedPresRuleContainer() {
        return this._extendedPresRuleContainer;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.List.typeID;
    }

    public void writeOut(OutputStream outputStream) {
    }
}
