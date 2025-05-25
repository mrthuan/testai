package lib.zj.office.fc.hslf.record;

import java.util.Hashtable;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class SlideTimeAtom extends PositionDependentRecordAtom {
    private static long _type = 12011;
    private byte[] _header;
    private long fileTime;

    public SlideTimeAtom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[8];
        this._header = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, 8);
        this.fileTime = LittleEndian.getLong(bArr, i10 + 8);
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public long getRecordType() {
        return _type;
    }

    public long getSlideCreateTime() {
        return this.fileTime;
    }

    @Override // lib.zj.office.fc.hslf.record.Record
    public void dispose() {
    }

    @Override // lib.zj.office.fc.hslf.record.PositionDependentRecordAtom, lib.zj.office.fc.hslf.record.PositionDependentRecord
    public void updateOtherRecordReferences(Hashtable<Integer, Integer> hashtable) {
    }
}
