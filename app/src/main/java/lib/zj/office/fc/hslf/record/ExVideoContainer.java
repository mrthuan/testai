package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public final class ExVideoContainer extends RecordContainer {
    private byte[] _header;
    private ExMediaAtom mediaAtom;
    private CString pathAtom;

    public ExVideoContainer(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof ExMediaAtom) {
            this.mediaAtom = (ExMediaAtom) record;
        } else {
            POILogger pOILogger = this.logger;
            int i10 = POILogger.ERROR;
            pOILogger.log(i10, "First child record wasn't a ExMediaAtom, was of type " + this._children[0].getRecordType());
        }
        Record record2 = this._children[1];
        if (record2 instanceof CString) {
            this.pathAtom = (CString) record2;
            return;
        }
        POILogger pOILogger2 = this.logger;
        int i11 = POILogger.ERROR;
        pOILogger2.log(i11, "Second child record wasn't a CString, was of type " + this._children[1].getRecordType());
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        CString cString = this.pathAtom;
        if (cString != null) {
            cString.dispose();
        }
        ExMediaAtom exMediaAtom = this.mediaAtom;
        if (exMediaAtom != null) {
            exMediaAtom.dispose();
        }
    }

    public ExMediaAtom getExMediaAtom() {
        return this.mediaAtom;
    }

    public CString getPathAtom() {
        return this.pathAtom;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExVideoContainer.typeID;
    }

    public ExVideoContainer() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        Record[] recordArr = new Record[2];
        this._children = recordArr;
        ExMediaAtom exMediaAtom = new ExMediaAtom();
        this.mediaAtom = exMediaAtom;
        recordArr[0] = exMediaAtom;
        Record[] recordArr2 = this._children;
        CString cString = new CString();
        this.pathAtom = cString;
        recordArr2[1] = cString;
    }
}
