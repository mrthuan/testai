package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BOFRecord extends StandardRecord {
    public static final int BUILD = 4307;
    public static final int BUILD_YEAR = 1996;
    public static final int HISTORY_MASK = 65;
    public static final int TYPE_CHART = 32;
    public static final int TYPE_EXCEL_4_MACRO = 64;
    public static final int TYPE_VB_MODULE = 6;
    public static final int TYPE_WORKBOOK = 5;
    public static final int TYPE_WORKSHEET = 16;
    public static final int TYPE_WORKSPACE_FILE = 256;
    public static final int VERSION = 1536;
    public static final short sid = 2057;
    private int field_1_version;
    private int field_2_type;
    private int field_3_build;
    private int field_4_year;
    private int field_5_history;
    private int field_6_rversion;

    public BOFRecord() {
    }

    public static BOFRecord createSheetBOF() {
        return new BOFRecord(16);
    }

    private String getTypeName() {
        int i10 = this.field_2_type;
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 16) {
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 256) {
                                return "#error unknown type#";
                            }
                            return "workspace file";
                        }
                        return "excel 4 macro";
                    }
                    return "chart";
                }
                return "worksheet";
            }
            return "vb module";
        }
        return "workbook";
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        BOFRecord bOFRecord = new BOFRecord();
        bOFRecord.field_1_version = this.field_1_version;
        bOFRecord.field_2_type = this.field_2_type;
        bOFRecord.field_3_build = this.field_3_build;
        bOFRecord.field_4_year = this.field_4_year;
        bOFRecord.field_5_history = this.field_5_history;
        bOFRecord.field_6_rversion = this.field_6_rversion;
        return bOFRecord;
    }

    public int getBuild() {
        return this.field_3_build;
    }

    public int getBuildYear() {
        return this.field_4_year;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 16;
    }

    public int getHistoryBitMask() {
        return this.field_5_history;
    }

    public int getRequiredVersion() {
        return this.field_6_rversion;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getType() {
        return this.field_2_type;
    }

    public int getVersion() {
        return this.field_1_version;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getVersion());
        littleEndianOutput.writeShort(getType());
        littleEndianOutput.writeShort(getBuild());
        littleEndianOutput.writeShort(getBuildYear());
        littleEndianOutput.writeInt(getHistoryBitMask());
        littleEndianOutput.writeInt(getRequiredVersion());
    }

    public void setBuild(int i10) {
        this.field_3_build = i10;
    }

    public void setBuildYear(int i10) {
        this.field_4_year = i10;
    }

    public void setHistoryBitMask(int i10) {
        this.field_5_history = i10;
    }

    public void setRequiredVersion(int i10) {
        this.field_6_rversion = i10;
    }

    public void setType(int i10) {
        this.field_2_type = i10;
    }

    public void setVersion(int i10) {
        this.field_1_version = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BOF RECORD]\n    .version  = ");
        stringBuffer.append(HexDump.shortToHex(getVersion()));
        stringBuffer.append("\n    .type     = ");
        stringBuffer.append(HexDump.shortToHex(getType()));
        stringBuffer.append(" (");
        stringBuffer.append(getTypeName());
        stringBuffer.append(")\n    .build    = ");
        stringBuffer.append(HexDump.shortToHex(getBuild()));
        stringBuffer.append("\n    .buildyear= ");
        stringBuffer.append(getBuildYear());
        stringBuffer.append("\n    .history  = ");
        stringBuffer.append(HexDump.intToHex(getHistoryBitMask()));
        stringBuffer.append("\n    .reqver   = ");
        stringBuffer.append(HexDump.intToHex(getRequiredVersion()));
        stringBuffer.append("\n[/BOF RECORD]\n");
        return stringBuffer.toString();
    }

    private BOFRecord(int i10) {
        this.field_1_version = VERSION;
        this.field_2_type = i10;
        this.field_3_build = BUILD;
        this.field_4_year = BUILD_YEAR;
        this.field_5_history = 1;
        this.field_6_rversion = VERSION;
    }

    public BOFRecord(RecordInputStream recordInputStream) {
        this.field_1_version = recordInputStream.readShort();
        this.field_2_type = recordInputStream.readShort();
        if (recordInputStream.remaining() >= 2) {
            this.field_3_build = recordInputStream.readShort();
        }
        if (recordInputStream.remaining() >= 2) {
            this.field_4_year = recordInputStream.readShort();
        }
        if (recordInputStream.remaining() >= 4) {
            this.field_5_history = recordInputStream.readInt();
        }
        if (recordInputStream.remaining() >= 4) {
            this.field_6_rversion = recordInputStream.readInt();
        }
    }
}
