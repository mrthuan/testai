package lib.zj.office.fc.ddf;

import androidx.activity.f;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;

/* loaded from: classes3.dex */
public class EscherDgRecord extends EscherRecord {
    public static final String RECORD_DESCRIPTION = "MsofbtDg";
    public static final short RECORD_ID = -4088;
    private int field_1_numShapes;
    private int field_2_lastMSOSPID;

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int fillFields(byte[] bArr, int i10, EscherRecordFactory escherRecordFactory) {
        readHeader(bArr, i10);
        int i11 = i10 + 8;
        this.field_1_numShapes = LittleEndian.getInt(bArr, i11 + 0);
        this.field_2_lastMSOSPID = LittleEndian.getInt(bArr, i11 + 4);
        return getRecordSize();
    }

    public short getDrawingGroupId() {
        return (short) (getOptions() >> 4);
    }

    public int getLastMSOSPID() {
        return this.field_2_lastMSOSPID;
    }

    public int getNumShapes() {
        return this.field_1_numShapes;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public short getRecordId() {
        return RECORD_ID;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public String getRecordName() {
        return "Dg";
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int getRecordSize() {
        return 16;
    }

    public void incrementShapeCount() {
        this.field_1_numShapes++;
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public int serialize(int i10, byte[] bArr, EscherSerializationListener escherSerializationListener) {
        escherSerializationListener.beforeRecordSerialize(i10, getRecordId(), this);
        LittleEndian.putShort(bArr, i10, getOptions());
        LittleEndian.putShort(bArr, i10 + 2, getRecordId());
        LittleEndian.putInt(bArr, i10 + 4, 8);
        LittleEndian.putInt(bArr, i10 + 8, this.field_1_numShapes);
        LittleEndian.putInt(bArr, i10 + 12, this.field_2_lastMSOSPID);
        escherSerializationListener.afterRecordSerialize(i10 + 16, getRecordId(), getRecordSize(), this);
        return getRecordSize();
    }

    public void setLastMSOSPID(int i10) {
        this.field_2_lastMSOSPID = i10;
    }

    public void setNumShapes(int i10) {
        this.field_1_numShapes = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getName());
        sb2.append(":\n  RecordId: 0x");
        sb2.append(HexDump.toHex((short) RECORD_ID));
        sb2.append("\n  Options: 0x");
        sb2.append(HexDump.toHex(getOptions()));
        sb2.append("\n  NumShapes: ");
        sb2.append(this.field_1_numShapes);
        sb2.append("\n  LastMSOSPID: ");
        return f.n(sb2, this.field_2_lastMSOSPID, '\n');
    }

    @Override // lib.zj.office.fc.ddf.EscherRecord
    public void dispose() {
    }
}
