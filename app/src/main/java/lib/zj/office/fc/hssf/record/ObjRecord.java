package lib.zj.office.fc.hssf.record;

import androidx.appcompat.view.menu.d;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianInputStream;

/* loaded from: classes3.dex */
public final class ObjRecord extends Record {
    private static int MAX_PAD_ALIGNMENT = 4;
    private static final int NORMAL_PAD_ALIGNMENT = 2;
    public static final short sid = 93;
    private boolean _isPaddedToQuadByteMultiple;
    private final byte[] _uninterpretedData;
    private List<SubRecord> subrecords;

    public ObjRecord() {
        this.subrecords = new ArrayList(2);
        this._uninterpretedData = null;
    }

    private static boolean canPaddingBeDiscarded(byte[] bArr, int i10) {
        for (int length = bArr.length - i10; length < bArr.length; length++) {
            if (bArr[length] != 0) {
                return false;
            }
        }
        return true;
    }

    public void addSubRecord(int i10, SubRecord subRecord) {
        this.subrecords.add(i10, subRecord);
    }

    public void clearSubRecords() {
        this.subrecords.clear();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ObjRecord objRecord = new ObjRecord();
        for (int i10 = 0; i10 < this.subrecords.size(); i10++) {
            objRecord.addSubRecord((SubRecord) this.subrecords.get(i10).clone());
        }
        return objRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        byte[] bArr = this._uninterpretedData;
        if (bArr != null) {
            return bArr.length + 4;
        }
        int i10 = 0;
        for (int size = this.subrecords.size() - 1; size >= 0; size--) {
            i10 += this.subrecords.get(size).getDataSize() + 4;
        }
        if (this._isPaddedToQuadByteMultiple) {
            while (i10 % MAX_PAD_ALIGNMENT != 0) {
                i10++;
            }
        } else {
            while (i10 % 2 != 0) {
                i10++;
            }
        }
        return i10 + 4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 93;
    }

    public List<SubRecord> getSubRecords() {
        return this.subrecords;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        int recordSize = getRecordSize();
        int i11 = recordSize - 4;
        LittleEndianByteArrayOutputStream littleEndianByteArrayOutputStream = new LittleEndianByteArrayOutputStream(bArr, i10, recordSize);
        littleEndianByteArrayOutputStream.writeShort(93);
        littleEndianByteArrayOutputStream.writeShort(i11);
        byte[] bArr2 = this._uninterpretedData;
        if (bArr2 == null) {
            for (int i12 = 0; i12 < this.subrecords.size(); i12++) {
                this.subrecords.get(i12).serialize(littleEndianByteArrayOutputStream);
            }
            int i13 = i10 + i11;
            while (littleEndianByteArrayOutputStream.getWriteIndex() < i13) {
                littleEndianByteArrayOutputStream.writeByte(0);
            }
        } else {
            littleEndianByteArrayOutputStream.write(bArr2);
        }
        return recordSize;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[OBJ]\n");
        for (int i10 = 0; i10 < this.subrecords.size(); i10++) {
            stringBuffer.append("SUBRECORD: ");
            stringBuffer.append(this.subrecords.get(i10).toString());
        }
        stringBuffer.append("[/OBJ]\n");
        return stringBuffer.toString();
    }

    public boolean addSubRecord(SubRecord subRecord) {
        return this.subrecords.add(subRecord);
    }

    public ObjRecord(RecordInputStream recordInputStream) {
        SubRecord createSubRecord;
        byte[] readRemainder = recordInputStream.readRemainder();
        if (LittleEndian.getUShort(readRemainder, 0) != 21) {
            this._uninterpretedData = readRemainder;
            this.subrecords = null;
            return;
        }
        this.subrecords = new ArrayList();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readRemainder);
        LittleEndianInputStream littleEndianInputStream = new LittleEndianInputStream(byteArrayInputStream);
        CommonObjectDataSubRecord commonObjectDataSubRecord = (CommonObjectDataSubRecord) SubRecord.createSubRecord(littleEndianInputStream, 0);
        this.subrecords.add(commonObjectDataSubRecord);
        do {
            createSubRecord = SubRecord.createSubRecord(littleEndianInputStream, commonObjectDataSubRecord.getObjectType());
            this.subrecords.add(createSubRecord);
        } while (!createSubRecord.isTerminating());
        int available = byteArrayInputStream.available();
        if (available > 0) {
            int length = readRemainder.length;
            int i10 = MAX_PAD_ALIGNMENT;
            boolean z10 = length % i10 == 0;
            this._isPaddedToQuadByteMultiple = z10;
            if (available >= (z10 ? i10 : 2)) {
                if (canPaddingBeDiscarded(readRemainder, available)) {
                    this._isPaddedToQuadByteMultiple = false;
                } else {
                    StringBuilder e10 = d.e("Leftover ", available, " bytes in subrecord data ");
                    e10.append(HexDump.toHex(readRemainder));
                    throw new RecordFormatException(e10.toString());
                }
            }
        } else {
            this._isPaddedToQuadByteMultiple = false;
        }
        this._uninterpretedData = null;
    }
}
