package lib.zj.office.fc.hssf.record.common;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FtrHeader {
    private short grbitFrt;
    private short recordType;
    private byte[] reserved;

    public FtrHeader() {
        this.reserved = new byte[8];
    }

    public static int getDataSize() {
        return 12;
    }

    public short getGrbitFrt() {
        return this.grbitFrt;
    }

    public short getRecordType() {
        return this.recordType;
    }

    public byte[] getReserved() {
        return this.reserved;
    }

    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.recordType);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.write(this.reserved);
    }

    public void setGrbitFrt(short s4) {
        this.grbitFrt = s4;
    }

    public void setRecordType(short s4) {
        this.recordType = s4;
    }

    public void setReserved(byte[] bArr) {
        this.reserved = bArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(" [FUTURE HEADER]\n");
        stringBuffer.append("   Type " + ((int) this.recordType));
        stringBuffer.append("   Flags " + ((int) this.grbitFrt));
        stringBuffer.append(" [/FUTURE HEADER]\n");
        return stringBuffer.toString();
    }

    public FtrHeader(RecordInputStream recordInputStream) {
        this.recordType = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        byte[] bArr = new byte[8];
        this.reserved = bArr;
        recordInputStream.read(bArr, 0, 8);
    }
}
