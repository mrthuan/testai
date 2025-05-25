package lib.zj.office.fc.hssf.record;

import java.util.Arrays;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class HeaderFooterRecord extends StandardRecord {
    private static final byte[] BLANK_GUID = new byte[16];
    public static final short sid = 2204;
    private byte[] _rawData;

    public HeaderFooterRecord(byte[] bArr) {
        this._rawData = bArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._rawData.length;
    }

    public byte[] getGuid() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = this._rawData;
        System.arraycopy(bArr2, 12, bArr, 0, Math.min(16, bArr2.length - 12));
        return bArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isCurrentSheet() {
        return Arrays.equals(getGuid(), BLANK_GUID);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this._rawData);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[HEADERFOOTER] (0x");
        stringBuffer.append(Integer.toHexString(UnknownRecord.HEADER_FOOTER_089C).toUpperCase() + ")\n");
        stringBuffer.append("  rawData=");
        stringBuffer.append(HexDump.toHex(this._rawData));
        stringBuffer.append("\n[/HEADERFOOTER]\n");
        return stringBuffer.toString();
    }

    public HeaderFooterRecord(RecordInputStream recordInputStream) {
        this._rawData = recordInputStream.readRemainder();
    }
}
