package lib.zj.office.fc.hssf.record.pivottable;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class DataItemRecord extends StandardRecord {
    public static final short sid = 197;

    /* renamed from: df  reason: collision with root package name */
    private int f20668df;
    private int ifmt;
    private int iiftab;
    private int isxvd;
    private int isxvdData;
    private int isxvi;
    private String name;

    public DataItemRecord(RecordInputStream recordInputStream) {
        this.isxvdData = recordInputStream.readUShort();
        this.iiftab = recordInputStream.readUShort();
        this.f20668df = recordInputStream.readUShort();
        this.isxvd = recordInputStream.readUShort();
        this.isxvi = recordInputStream.readUShort();
        this.ifmt = recordInputStream.readUShort();
        this.name = recordInputStream.readString();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return StringUtil.getEncodedSize(this.name) + 12;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 197;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.isxvdData);
        littleEndianOutput.writeShort(this.iiftab);
        littleEndianOutput.writeShort(this.f20668df);
        littleEndianOutput.writeShort(this.isxvd);
        littleEndianOutput.writeShort(this.isxvi);
        littleEndianOutput.writeShort(this.ifmt);
        StringUtil.writeUnicodeString(littleEndianOutput, this.name);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SXDI]\n  .isxvdData = ");
        r.j(this.isxvdData, stringBuffer, "\n  .iiftab = ");
        r.j(this.iiftab, stringBuffer, "\n  .df = ");
        r.j(this.f20668df, stringBuffer, "\n  .isxvd = ");
        r.j(this.isxvd, stringBuffer, "\n  .isxvi = ");
        r.j(this.isxvi, stringBuffer, "\n  .ifmt = ");
        stringBuffer.append(HexDump.shortToHex(this.ifmt));
        stringBuffer.append("\n[/SXDI]\n");
        return stringBuffer.toString();
    }
}
