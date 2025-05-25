package lib.zj.office.fc.hssf.record;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ddf.DefaultEscherRecordFactory;
import lib.zj.office.fc.ddf.EscherContainerRecord;
import lib.zj.office.fc.ddf.EscherRecord;
import lib.zj.office.fc.ddf.EscherRecordFactory;
import lib.zj.office.fc.ddf.NullEscherSerializationListener;
import lib.zj.office.fc.hssf.util.LazilyConcatenatedByteArray;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public abstract class AbstractEscherHolderRecord extends Record {
    private static boolean DESERIALISE;
    private LazilyConcatenatedByteArray rawDataContainer = new LazilyConcatenatedByteArray();
    private List<EscherRecord> escherRecords = new ArrayList();

    static {
        boolean z10;
        try {
            if (System.getProperty("poi.deserialize.escher") != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            DESERIALISE = z10;
        } catch (SecurityException unused) {
            DESERIALISE = false;
        }
    }

    public AbstractEscherHolderRecord() {
    }

    private void convertToEscherRecords(int i10, int i11, byte[] bArr) {
        this.escherRecords.clear();
        EscherRecordFactory defaultEscherRecordFactory = new DefaultEscherRecordFactory();
        int i12 = i10;
        while (i12 < i10 + i11) {
            EscherRecord createRecord = defaultEscherRecordFactory.createRecord(bArr, i12);
            int fillFields = createRecord.fillFields(bArr, i12, defaultEscherRecordFactory);
            this.escherRecords.add(createRecord);
            i12 += fillFields;
        }
    }

    public void addEscherRecord(int i10, EscherRecord escherRecord) {
        this.escherRecords.add(i10, escherRecord);
    }

    public void clearEscherRecords() {
        this.escherRecords.clear();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    public void convertRawBytesToEscherRecords() {
        byte[] rawData = getRawData();
        convertToEscherRecords(0, rawData.length, rawData);
    }

    public void decode() {
        byte[] rawData = getRawData();
        convertToEscherRecords(0, rawData.length, rawData);
    }

    public EscherRecord findFirstWithId(short s4) {
        return findFirstWithId(s4, getEscherRecords());
    }

    public EscherContainerRecord getEscherContainer() {
        for (EscherRecord escherRecord : this.escherRecords) {
            if (escherRecord instanceof EscherContainerRecord) {
                return (EscherContainerRecord) escherRecord;
            }
        }
        return null;
    }

    public EscherRecord getEscherRecord(int i10) {
        return this.escherRecords.get(i10);
    }

    public List<EscherRecord> getEscherRecords() {
        return this.escherRecords;
    }

    public byte[] getRawData() {
        return this.rawDataContainer.toArray();
    }

    public abstract String getRecordName();

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        byte[] rawData = getRawData();
        if (this.escherRecords.size() == 0 && rawData != null) {
            return rawData.length;
        }
        int i10 = 0;
        for (EscherRecord escherRecord : this.escherRecords) {
            i10 += escherRecord.getRecordSize();
        }
        return i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public abstract short getSid();

    public List<EscherContainerRecord> getgetEscherContainers() {
        ArrayList arrayList = new ArrayList();
        for (EscherRecord escherRecord : this.escherRecords) {
            if (escherRecord instanceof EscherContainerRecord) {
                arrayList.add((EscherContainerRecord) escherRecord);
            }
        }
        return arrayList;
    }

    public void join(AbstractEscherHolderRecord abstractEscherHolderRecord) {
        this.rawDataContainer.concatenate(abstractEscherHolderRecord.getRawData());
    }

    public void processContinueRecord(byte[] bArr) {
        this.rawDataContainer.concatenate(bArr);
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        int i11 = i10 + 0;
        LittleEndian.putShort(bArr, i11, getSid());
        int i12 = i10 + 2;
        LittleEndian.putShort(bArr, i12, (short) (getRecordSize() - 4));
        byte[] rawData = getRawData();
        if (this.escherRecords.size() == 0 && rawData != null) {
            LittleEndian.putShort(bArr, i11, getSid());
            LittleEndian.putShort(bArr, i12, (short) (getRecordSize() - 4));
            System.arraycopy(rawData, 0, bArr, i10 + 4, rawData.length);
            return rawData.length + 4;
        }
        LittleEndian.putShort(bArr, i11, getSid());
        LittleEndian.putShort(bArr, i12, (short) (getRecordSize() - 4));
        int i13 = i10 + 4;
        for (EscherRecord escherRecord : this.escherRecords) {
            i13 += escherRecord.serialize(i13, bArr, new NullEscherSerializationListener());
        }
        return getRecordSize();
    }

    public void setRawData(byte[] bArr) {
        this.rawDataContainer.clear();
        this.rawDataContainer.concatenate(bArr);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String property = System.getProperty("line.separator");
        stringBuffer.append("[" + getRecordName() + ']' + property);
        if (this.escherRecords.size() == 0) {
            stringBuffer.append("No Escher Records Decoded" + property);
        }
        for (EscherRecord escherRecord : this.escherRecords) {
            stringBuffer.append(escherRecord.toString());
        }
        stringBuffer.append("[/" + getRecordName() + ']' + property);
        return stringBuffer.toString();
    }

    private EscherRecord findFirstWithId(short s4, List<EscherRecord> list) {
        EscherRecord findFirstWithId;
        for (EscherRecord escherRecord : list) {
            if (escherRecord.getRecordId() == s4) {
                return escherRecord;
            }
        }
        for (EscherRecord escherRecord2 : list) {
            if (escherRecord2.isContainerRecord() && (findFirstWithId = findFirstWithId(s4, escherRecord2.getChildRecords())) != null) {
                return findFirstWithId;
            }
        }
        return null;
    }

    public boolean addEscherRecord(EscherRecord escherRecord) {
        return this.escherRecords.add(escherRecord);
    }

    public AbstractEscherHolderRecord(RecordInputStream recordInputStream) {
        if (!DESERIALISE) {
            this.rawDataContainer.concatenate(recordInputStream.readRemainder());
            return;
        }
        byte[] readAllContinuedRemainder = recordInputStream.readAllContinuedRemainder();
        convertToEscherRecords(0, readAllContinuedRemainder.length, readAllContinuedRemainder);
    }
}
