package lib.zj.office.fc.hssf.record;

import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
public final class DrawingRecordForBiffViewer extends AbstractEscherHolderRecord {
    public static final short sid = 236;

    public DrawingRecordForBiffViewer() {
    }

    private static RecordInputStream convertToInputStream(DrawingRecord drawingRecord) {
        RecordInputStream recordInputStream = new RecordInputStream(new ByteArrayInputStream(drawingRecord.serialize()));
        recordInputStream.nextRecord();
        return recordInputStream;
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord
    public String getRecordName() {
        return "MSODRAWING";
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 236;
    }

    public DrawingRecordForBiffViewer(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }

    public DrawingRecordForBiffViewer(DrawingRecord drawingRecord) {
        super(convertToInputStream(drawingRecord));
        convertRawBytesToEscherRecords();
    }
}
