package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.record.common.FtrHeader;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FeatHdrRecord extends StandardRecord {
    public static final int SHAREDFEATURES_ISFFACTOID = 4;
    public static final int SHAREDFEATURES_ISFFEC2 = 3;
    public static final int SHAREDFEATURES_ISFLIST = 5;
    public static final int SHAREDFEATURES_ISFPROTECTION = 2;
    public static final short sid = 2151;
    private long cbHdrData;
    private FtrHeader futureHeader;
    private int isf_sharedFeatureType;
    private byte reserved;
    private byte[] rgbHdrData;

    public FeatHdrRecord() {
        FtrHeader ftrHeader = new FtrHeader();
        this.futureHeader = ftrHeader;
        ftrHeader.setRecordType(sid);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.rgbHdrData.length + 19;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        this.futureHeader.serialize(littleEndianOutput);
        littleEndianOutput.writeShort(this.isf_sharedFeatureType);
        littleEndianOutput.writeByte(this.reserved);
        littleEndianOutput.writeInt((int) this.cbHdrData);
        littleEndianOutput.write(this.rgbHdrData);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[FEATURE HEADER]\n[/FEATURE HEADER]\n";
    }

    public FeatHdrRecord(RecordInputStream recordInputStream) {
        this.futureHeader = new FtrHeader(recordInputStream);
        this.isf_sharedFeatureType = recordInputStream.readShort();
        this.reserved = recordInputStream.readByte();
        this.cbHdrData = recordInputStream.readInt();
        this.rgbHdrData = recordInputStream.readRemainder();
    }
}
