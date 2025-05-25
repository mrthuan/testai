package lib.zj.office.fc.hslf.record;

import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.POILogger;

/* loaded from: classes3.dex */
public class ExMCIMovie extends RecordContainer {
    private byte[] _header;
    private ExVideoContainer exVideo;

    public ExMCIMovie(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this._children = Record.findChildRecords(bArr, i10 + 8, i11 - 8);
        findInterestingChildren();
    }

    private void findInterestingChildren() {
        Record record = this._children[0];
        if (record instanceof ExVideoContainer) {
            this.exVideo = (ExVideoContainer) record;
            return;
        }
        POILogger pOILogger = this.logger;
        int i10 = POILogger.ERROR;
        pOILogger.log(i10, "First child record wasn't a ExVideoContainer, was of type " + this._children[0].getRecordType());
    }

    @Override // lib.zj.office.fc.hslf.record.RecordContainer, lib.zj.office.fc.hslf.record.Record
    public void dispose() {
        super.dispose();
        ExVideoContainer exVideoContainer = this.exVideo;
        if (exVideoContainer != null) {
            exVideoContainer.dispose();
        }
    }

    public ExVideoContainer getExVideo() {
        return this.exVideo;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return RecordTypes.ExMCIMovie.typeID;
    }

    public ExMCIMovie() {
        byte[] bArr = new byte[8];
        this._header = bArr;
        bArr[0] = 15;
        LittleEndian.putShort(bArr, 2, (short) getRecordType());
        ExVideoContainer exVideoContainer = new ExVideoContainer();
        this.exVideo = exVideoContainer;
        this._children = new Record[]{exVideoContainer};
    }
}
