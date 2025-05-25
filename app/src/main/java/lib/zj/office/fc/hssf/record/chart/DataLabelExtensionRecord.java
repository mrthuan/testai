package lib.zj.office.fc.hssf.record.chart;

import androidx.activity.r;
import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;
import lib.zj.office.fc.util.StringUtil;

/* loaded from: classes3.dex */
public final class DataLabelExtensionRecord extends StandardRecord {
    public static final short sid = 2155;
    private short cchSep;
    private short grbit;
    private int grbitFrt;
    private String rgchSep;
    private int rt;
    private byte[] unused = new byte[8];
    private static final BitField showSeriesName = BitFieldFactory.getInstance(1);
    private static final BitField showCategoryName = BitFieldFactory.getInstance(2);
    private static final BitField showValue = BitFieldFactory.getInstance(4);
    private static final BitField showPercent = BitFieldFactory.getInstance(8);
    private static final BitField showBubbleSizes = BitFieldFactory.getInstance(16);

    public DataLabelExtensionRecord(RecordInputStream recordInputStream) {
        this.rt = recordInputStream.readShort();
        this.grbitFrt = recordInputStream.readShort();
        recordInputStream.readFully(this.unused);
        this.grbit = recordInputStream.readShort();
        this.cchSep = recordInputStream.readShort();
        byte[] bArr = new byte[recordInputStream.available()];
        recordInputStream.readFully(bArr);
        this.rgchSep = StringUtil.getFromUnicodeLE(bArr);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
    }

    public String getSeparator() {
        return this.rgchSep;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isShowBubbleSizes() {
        return showBubbleSizes.isSet(this.grbit);
    }

    public boolean isShowCategoryName() {
        return showCategoryName.isSet(this.grbit);
    }

    public boolean isShowPercent() {
        return showPercent.isSet(this.grbit);
    }

    public boolean isShowSeriesName() {
        return showSeriesName.isSet(this.grbit);
    }

    public boolean isShowValue() {
        return showValue.isSet(this.grbit);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.rt);
        littleEndianOutput.writeShort(this.grbitFrt);
        littleEndianOutput.write(this.unused);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DATALABEXT]\n    .rt      =");
        r.j(this.rt, stringBuffer, "\n    .grbitFrt=");
        r.j(this.grbitFrt, stringBuffer, "\n    .unused  =");
        stringBuffer.append(HexDump.toHex(this.unused));
        stringBuffer.append("\n[/DATALABEXT]\n");
        return stringBuffer.toString();
    }
}
