package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class TableStylesRecord extends StandardRecord {
    public static final short sid = 2190;
    private int cts;
    private int grbitFrt;
    private String rgchDefListStyle;
    private String rgchDefPivotStyle;
    private int rt;
    private byte[] unused = new byte[8];

    public TableStylesRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readUShort();
        this.grbitFrt = recordInputStream.readUShort();
        recordInputStream.readFully(this.unused);
        this.cts = recordInputStream.readInt();
        int readUShort = recordInputStream.readUShort();
        int readUShort2 = recordInputStream.readUShort();
        this.rgchDefListStyle = recordInputStream.readUnicodeLEString(readUShort);
        this.rgchDefPivotStyle = recordInputStream.readUnicodeLEString(readUShort2);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this.rgchDefPivotStyle.length() * 2) + (this.rgchDefListStyle.length() * 2) + 20;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.write(this.unused);
        littleEndianOutput.writeInt(this.cts);
        littleEndianOutput.writeShort(this.rgchDefListStyle.length());
        littleEndianOutput.writeShort(this.rgchDefPivotStyle.length());
        StringUtil.putUnicodeLE(this.rgchDefListStyle, littleEndianOutput);
        StringUtil.putUnicodeLE(this.rgchDefPivotStyle, littleEndianOutput);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TABLESTYLES]\n    .rt      =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt=");
        r.j(this.grbitFrt, stringBuffer, "\n    .unused  =");
        stringBuffer.append(HexDump.toHex(this.unused));
        stringBuffer.append("\n    .cts=");
        stringBuffer.append(HexDump.intToHex(this.cts));
        stringBuffer.append("\n    .rgchDefListStyle=");
        stringBuffer.append(this.rgchDefListStyle);
        stringBuffer.append("\n    .rgchDefPivotStyle=");
        stringBuffer.append(this.rgchDefPivotStyle);
        stringBuffer.append("\n[/TABLESTYLES]\n");
        return stringBuffer.toString();
    }
}
