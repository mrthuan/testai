package lib.zj.office.fc.hssf.record;

import java.util.List;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.NullEscherSerializationListener;
import lib.zj.office.fc.util.ArrayUtil;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class DrawingGroupRecord extends AbstractEscherHolderRecord {
    private static final int MAX_DATA_SIZE = 8224;
    static final int MAX_RECORD_SIZE = 8228;
    public static final short sid = 235;

    public DrawingGroupRecord() {
    }

    private int getRawDataSize() {
        List<EscherRecord> escherRecords = getEscherRecords();
        byte[] rawData = getRawData();
        if (escherRecords.size() == 0 && rawData != null) {
            return rawData.length;
        }
        int i10 = 0;
        for (EscherRecord escherRecord : escherRecords) {
            i10 += escherRecord.getRecordSize();
        }
        return i10;
    }

    public static int grossSizeFromDataSize(int i10) {
        return ((((i10 - 1) / MAX_DATA_SIZE) + 1) * 4) + i10;
    }

    private void writeContinueHeader(byte[] bArr, int i10, int i11) {
        LittleEndian.putShort(bArr, i10 + 0, (short) 60);
        LittleEndian.putShort(bArr, i10 + 2, (short) i11);
    }

    private int writeData(int i10, byte[] bArr, byte[] bArr2) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr2.length) {
            int min = Math.min(bArr2.length - i11, (int) MAX_DATA_SIZE);
            if (i11 / MAX_DATA_SIZE >= 2) {
                writeContinueHeader(bArr, i10, min);
            } else {
                writeHeader(bArr, i10, min);
            }
            int i13 = i10 + 4;
            ArrayUtil.arraycopy(bArr2, i11, bArr, i13, min);
            i10 = i13 + min;
            i11 += min;
            i12 = i12 + 4 + min;
        }
        return i12;
    }

    private void writeHeader(byte[] bArr, int i10, int i11) {
        LittleEndian.putShort(bArr, i10 + 0, getSid());
        LittleEndian.putShort(bArr, i10 + 2, (short) i11);
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord
    public String getRecordName() {
        return "MSODRAWINGGROUP";
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        return grossSizeFromDataSize(getRawDataSize());
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public void processChildRecords() {
        convertRawBytesToEscherRecords();
    }

    @Override // lib.zj.office.fc.hssf.record.AbstractEscherHolderRecord, lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        byte[] rawData = getRawData();
        if (getEscherRecords().size() == 0 && rawData != null) {
            return writeData(i10, bArr, rawData);
        }
        byte[] bArr2 = new byte[getRawDataSize()];
        int i11 = 0;
        for (EscherRecord escherRecord : getEscherRecords()) {
            i11 += escherRecord.serialize(i11, bArr2, new NullEscherSerializationListener());
        }
        return writeData(i10, bArr, bArr2);
    }

    public DrawingGroupRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
