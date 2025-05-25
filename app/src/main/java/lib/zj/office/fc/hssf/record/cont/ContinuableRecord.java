package lib.zj.office.fc.hssf.record.cont;

import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;

/* loaded from: classes3.dex */
public abstract class ContinuableRecord extends Record {
    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int getRecordSize() {
        ContinuableRecordOutput createForCountingOnly = ContinuableRecordOutput.createForCountingOnly();
        serialize(createForCountingOnly);
        createForCountingOnly.terminate();
        return createForCountingOnly.getTotalSize();
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int serialize(int i10, byte[] bArr) {
        ContinuableRecordOutput continuableRecordOutput = new ContinuableRecordOutput(new LittleEndianByteArrayOutputStream(bArr, i10), getSid());
        serialize(continuableRecordOutput);
        continuableRecordOutput.terminate();
        return continuableRecordOutput.getTotalSize();
    }

    public abstract void serialize(ContinuableRecordOutput continuableRecordOutput);
}
