package lib.zj.office.fc.hssf.record;

import java.io.PrintStream;
import lib.zj.office.fc.hssf.record.common.FeatFormulaErr2;
import lib.zj.office.fc.hssf.record.common.FeatProtection;
import lib.zj.office.fc.hssf.record.common.FeatSmartTag;
import lib.zj.office.fc.hssf.record.common.FtrHeader;
import lib.zj.office.fc.hssf.record.common.SharedFeature;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FeatRecord extends StandardRecord {
    public static final short sid = 2152;
    private long cbFeatData;
    private HSSFCellRangeAddress[] cellRefs;
    private FtrHeader futureHeader;
    private int isf_sharedFeatureType;
    private byte reserved1;
    private long reserved2;
    private int reserved3;
    private SharedFeature sharedFeature;

    public FeatRecord() {
        FtrHeader ftrHeader = new FtrHeader();
        this.futureHeader = ftrHeader;
        ftrHeader.setRecordType(sid);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    public long getCbFeatData() {
        return this.cbFeatData;
    }

    public HSSFCellRangeAddress[] getCellRefs() {
        return this.cellRefs;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this.sharedFeature.getDataSize() + (this.cellRefs.length * 8) + 27;
    }

    public int getIsf_sharedFeatureType() {
        return this.isf_sharedFeatureType;
    }

    public SharedFeature getSharedFeature() {
        return this.sharedFeature;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        this.futureHeader.serialize(littleEndianOutput);
        littleEndianOutput.writeShort(this.isf_sharedFeatureType);
        littleEndianOutput.writeByte(this.reserved1);
        littleEndianOutput.writeInt((int) this.reserved2);
        littleEndianOutput.writeShort(this.cellRefs.length);
        littleEndianOutput.writeInt((int) this.cbFeatData);
        littleEndianOutput.writeShort(this.reserved3);
        int i10 = 0;
        while (true) {
            HSSFCellRangeAddress[] hSSFCellRangeAddressArr = this.cellRefs;
            if (i10 < hSSFCellRangeAddressArr.length) {
                hSSFCellRangeAddressArr[i10].serialize(littleEndianOutput);
                i10++;
            } else {
                this.sharedFeature.serialize(littleEndianOutput);
                return;
            }
        }
    }

    public void setCbFeatData(long j10) {
        this.cbFeatData = j10;
    }

    public void setCellRefs(HSSFCellRangeAddress[] hSSFCellRangeAddressArr) {
        this.cellRefs = hSSFCellRangeAddressArr;
    }

    public void setSharedFeature(SharedFeature sharedFeature) {
        this.sharedFeature = sharedFeature;
        if (sharedFeature instanceof FeatProtection) {
            this.isf_sharedFeatureType = 2;
        }
        if (sharedFeature instanceof FeatFormulaErr2) {
            this.isf_sharedFeatureType = 3;
        }
        if (sharedFeature instanceof FeatSmartTag) {
            this.isf_sharedFeatureType = 4;
        }
        if (this.isf_sharedFeatureType == 3) {
            this.cbFeatData = sharedFeature.getDataSize();
        } else {
            this.cbFeatData = 0L;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[SHARED FEATURE]\n[/SHARED FEATURE]\n";
    }

    public FeatRecord(RecordInputStream recordInputStream) {
        this.futureHeader = new FtrHeader(recordInputStream);
        this.isf_sharedFeatureType = recordInputStream.readShort();
        this.reserved1 = recordInputStream.readByte();
        this.reserved2 = recordInputStream.readInt();
        int readUShort = recordInputStream.readUShort();
        this.cbFeatData = recordInputStream.readInt();
        this.reserved3 = recordInputStream.readShort();
        this.cellRefs = new HSSFCellRangeAddress[readUShort];
        int i10 = 0;
        while (true) {
            HSSFCellRangeAddress[] hSSFCellRangeAddressArr = this.cellRefs;
            if (i10 >= hSSFCellRangeAddressArr.length) {
                break;
            }
            hSSFCellRangeAddressArr[i10] = new HSSFCellRangeAddress(recordInputStream);
            i10++;
        }
        int i11 = this.isf_sharedFeatureType;
        if (i11 == 2) {
            this.sharedFeature = new FeatProtection(recordInputStream);
        } else if (i11 == 3) {
            this.sharedFeature = new FeatFormulaErr2(recordInputStream);
        } else if (i11 != 4) {
            PrintStream printStream = System.err;
            printStream.println("Unknown Shared Feature " + this.isf_sharedFeatureType + " found!");
        } else {
            this.sharedFeature = new FeatSmartTag(recordInputStream);
        }
    }
}
