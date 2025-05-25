package lib.zj.office.fc.hssf.record.aggregates;

import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;

/* loaded from: classes3.dex */
public abstract class RecordAggregate extends RecordBase {

    /* loaded from: classes3.dex */
    public static final class PositionTrackingVisitor implements RecordVisitor {
        private int _position;
        private final RecordVisitor _rv;

        public PositionTrackingVisitor(RecordVisitor recordVisitor, int i10) {
            this._rv = recordVisitor;
            this._position = i10;
        }

        public int getPosition() {
            return this._position;
        }

        public void setPosition(int i10) {
            this._position = i10;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
        public void visitRecord(Record record) {
            this._position = record.getRecordSize() + this._position;
            this._rv.visitRecord(record);
        }
    }

    /* loaded from: classes3.dex */
    public static final class RecordSizingVisitor implements RecordVisitor {
        private int _totalSize = 0;

        public int getTotalSize() {
            return this._totalSize;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
        public void visitRecord(Record record) {
            this._totalSize = record.getRecordSize() + this._totalSize;
        }
    }

    /* loaded from: classes3.dex */
    public interface RecordVisitor {
        void visitRecord(Record record);
    }

    /* loaded from: classes3.dex */
    public static final class SerializingRecordVisitor implements RecordVisitor {
        private int _countBytesWritten = 0;
        private final byte[] _data;
        private final int _startOffset;

        public SerializingRecordVisitor(byte[] bArr, int i10) {
            this._data = bArr;
            this._startOffset = i10;
        }

        public int countBytesWritten() {
            return this._countBytesWritten;
        }

        @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate.RecordVisitor
        public void visitRecord(Record record) {
            int i10 = this._startOffset;
            int i11 = this._countBytesWritten;
            this._countBytesWritten = record.serialize(i10 + i11, this._data) + i11;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        RecordSizingVisitor recordSizingVisitor = new RecordSizingVisitor();
        visitContainedRecords(recordSizingVisitor);
        return recordSizingVisitor.getTotalSize();
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int serialize(int i10, byte[] bArr) {
        SerializingRecordVisitor serializingRecordVisitor = new SerializingRecordVisitor(bArr, i10);
        visitContainedRecords(serializingRecordVisitor);
        return serializingRecordVisitor.countBytesWritten();
    }

    public abstract void visitContainedRecords(RecordVisitor recordVisitor);
}
