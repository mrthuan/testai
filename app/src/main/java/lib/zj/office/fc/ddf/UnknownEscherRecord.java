package lib.zj.office.fc.ddf;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public final class UnknownEscherRecord extends EscherRecord {
    private static final byte[] NO_BYTES = new byte[0];
    private byte[] thedata = NO_BYTES;
    private List<EscherRecord> _childRecords = new ArrayList();

    public void addChildRecord(EscherRecord escherRecord) {
        getChildRecords().add(escherRecord);
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public Object clone() {
        return super.clone();
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
        List<EscherRecord> list = this._childRecords;
        if (list != null) {
            for (EscherRecord escherRecord : list) {
                escherRecord.dispose();
            }
            this._childRecords.clear();
        }
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        int readHeader = readHeader(bArr, i10);
        int i11 = 8;
        int i12 = i10 + 8;
        int length = bArr.length - i12;
        if (readHeader > length) {
            readHeader = length;
        }
        if (isContainerRecord()) {
            this.thedata = new byte[0];
            while (readHeader > 0) {
                EscherRecord createRecord = escherRecordFactory.createRecord(bArr, i12);
                int fillFields = createRecord.fillFields(bArr, i12, escherRecordFactory);
                i11 += fillFields;
                i12 += fillFields;
                readHeader -= fillFields;
                getChildRecords().add(createRecord);
            }
            return i11;
        }
        byte[] bArr2 = new byte[readHeader];
        this.thedata = bArr2;
        System.arraycopy(bArr, i12, bArr2, 0, readHeader);
        return readHeader + 8;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public List<EscherRecord> getChildRecords() {
        return this._childRecords;
    }

    public byte[] getData() {
        return this.thedata;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Unknown 0x" + HexDump.toHex(getRecordId());
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return this.thedata.length + 8;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        int length = this.thedata.length;
        for (EscherRecord escherRecord : this._childRecords) {
            length += escherRecord.getRecordSize();
        }
        LittleEndian.putInt(bArr, i10 + 4, length);
        byte[] bArr2 = this.thedata;
        int i11 = i10 + 8;
        System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
        int length2 = i11 + this.thedata.length;
        for (EscherRecord escherRecord2 : this._childRecords) {
            length2 += escherRecord2.serialize(length2, bArr, escherSerializationListener);
        }
        int i12 = length2 - i10;
        escherSerializationListener.afterRecordSerialize(length2, getRecordId(), i12, this);
        return i12;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void setChildRecords(List<EscherRecord> list) {
        this._childRecords = list;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (getChildRecords().size() > 0) {
            stringBuffer.append("  children: \n");
            for (EscherRecord escherRecord : this._childRecords) {
                stringBuffer.append(escherRecord.toString());
                stringBuffer.append('\n');
            }
        }
        String hex = HexDump.toHex(this.thedata, 32);
        return UnknownEscherRecord.class.getName() + ":\n  isContainer: " + isContainerRecord() + "\n  options: 0x" + HexDump.toHex(getOptions()) + "\n  recordId: 0x" + HexDump.toHex(getRecordId()) + "\n  numchildren: " + getChildRecords().size() + '\n' + hex + stringBuffer.toString();
    }
}
