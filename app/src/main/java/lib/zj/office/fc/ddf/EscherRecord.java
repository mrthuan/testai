package lib.zj.office.fc.ddf;

import a6.h;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public abstract class EscherRecord {
    private short _options;
    private short _recordId;

    /* loaded from: classes3.dex */
    public static class EscherRecordHeader {
        private short options;
        private short recordId;
        private int remainingBytes;

        private EscherRecordHeader() {
        }

        public static EscherRecordHeader readHeader(byte[] bArr, int i10) {
            EscherRecordHeader escherRecordHeader = new EscherRecordHeader();
            escherRecordHeader.options = LittleEndian.getShort(bArr, i10);
            escherRecordHeader.recordId = LittleEndian.getShort(bArr, i10 + 2);
            escherRecordHeader.remainingBytes = LittleEndian.getInt(bArr, i10 + 4);
            return escherRecordHeader;
        }

        public short getOptions() {
            return this.options;
        }

        public short getRecordId() {
            return this.recordId;
        }

        public int getRemainingBytes() {
            return this.remainingBytes;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("EscherRecordHeader{options=");
            sb2.append((int) this.options);
            sb2.append(", recordId=");
            sb2.append((int) this.recordId);
            sb2.append(", remainingBytes=");
            return h.g(sb2, this.remainingBytes, "}");
        }
    }

    public Object clone() {
        throw new RuntimeException("The class " + getClass().getName() + " needs to define a clone method");
    }

    public void display(PrintWriter printWriter, int i10) {
        for (int i11 = 0; i11 < i10 * 4; i11++) {
            printWriter.print(' ');
        }
        printWriter.println(getRecordName());
    }

    public abstract void dispose();

    public abstract int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory);

    public int fillFields(byte[] bArr, EscherRecordFactory escherRecordFactory) {
        return fillFields(bArr, 0, escherRecordFactory);
    }

    public EscherRecord getChild(int i10) {
        return getChildRecords().get(i10);
    }

    public List<EscherRecord> getChildRecords() {
        return Collections.emptyList();
    }

    public short getInstance() {
        return (short) (this._options >> 4);
    }

    public short getOptions() {
        return this._options;
    }

    public short getRecordId() {
        return this._recordId;
    }

    public abstract String getRecordName();

    public abstract int getRecordSize();

    public boolean isContainerRecord() {
        if ((this._options & 15) == 15) {
            return true;
        }
        return false;
    }

    public int readHeader(byte[] bArr, int i10) {
        EscherRecordHeader readHeader = EscherRecordHeader.readHeader(bArr, i10);
        this._options = readHeader.getOptions();
        this._recordId = readHeader.getRecordId();
        return readHeader.getRemainingBytes();
    }

    public abstract int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener);

    public byte[] serialize() {
        byte[] bArr = new byte[getRecordSize()];
        serialize(0, bArr);
        return bArr;
    }

    public void setChildRecords(List<EscherRecord> list) {
        throw new UnsupportedOperationException("This record does not support child records.");
    }

    public void setOptions(short s4) {
        this._options = s4;
    }

    public void setRecordId(short s4) {
        this._recordId = s4;
    }

    public int serialize(int i10, byte[] bArr) {
        return serialize(i10, bArr, new NullEscherSerializationListener());
    }
}
