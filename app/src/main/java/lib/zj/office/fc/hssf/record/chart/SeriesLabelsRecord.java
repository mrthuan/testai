package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SeriesLabelsRecord extends StandardRecord {
    public static final short sid = 4108;
    private short field_1_formatFlags;
    private static final BitField showActual = BitFieldFactory.getInstance(1);
    private static final BitField showPercent = BitFieldFactory.getInstance(2);
    private static final BitField labelAsPercentage = BitFieldFactory.getInstance(4);
    private static final BitField smoothedLine = BitFieldFactory.getInstance(8);
    private static final BitField showLabel = BitFieldFactory.getInstance(16);
    private static final BitField showBubbleSizes = BitFieldFactory.getInstance(32);

    public SeriesLabelsRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SeriesLabelsRecord seriesLabelsRecord = new SeriesLabelsRecord();
        seriesLabelsRecord.field_1_formatFlags = this.field_1_formatFlags;
        return seriesLabelsRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getFormatFlags() {
        return this.field_1_formatFlags;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isLabelAsPercentage() {
        return labelAsPercentage.isSet(this.field_1_formatFlags);
    }

    public boolean isShowActual() {
        return showActual.isSet(this.field_1_formatFlags);
    }

    public boolean isShowBubbleSizes() {
        return showBubbleSizes.isSet(this.field_1_formatFlags);
    }

    public boolean isShowLabel() {
        return showLabel.isSet(this.field_1_formatFlags);
    }

    public boolean isShowPercent() {
        return showPercent.isSet(this.field_1_formatFlags);
    }

    public boolean isSmoothedLine() {
        return smoothedLine.isSet(this.field_1_formatFlags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_formatFlags);
    }

    public void setFormatFlags(short s4) {
        this.field_1_formatFlags = s4;
    }

    public void setLabelAsPercentage(boolean z10) {
        this.field_1_formatFlags = labelAsPercentage.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setShowActual(boolean z10) {
        this.field_1_formatFlags = showActual.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setShowBubbleSizes(boolean z10) {
        this.field_1_formatFlags = showBubbleSizes.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setShowLabel(boolean z10) {
        this.field_1_formatFlags = showLabel.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setShowPercent(boolean z10) {
        this.field_1_formatFlags = showPercent.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setSmoothedLine(boolean z10) {
        this.field_1_formatFlags = smoothedLine.setShortBoolean(this.field_1_formatFlags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ATTACHEDLABEL]\n    .formatFlags          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatFlags()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatFlags());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .showActual               = ");
        stringBuffer.append(isShowActual());
        stringBuffer.append("\n         .showPercent              = ");
        stringBuffer.append(isShowPercent());
        stringBuffer.append("\n         .labelAsPercentage        = ");
        stringBuffer.append(isLabelAsPercentage());
        stringBuffer.append("\n         .smoothedLine             = ");
        stringBuffer.append(isSmoothedLine());
        stringBuffer.append("\n         .showLabel                = ");
        stringBuffer.append(isShowLabel());
        stringBuffer.append("\n         .showBubbleSizes          = ");
        stringBuffer.append(isShowBubbleSizes());
        stringBuffer.append("\n[/ATTACHEDLABEL]\n");
        return stringBuffer.toString();
    }

    public SeriesLabelsRecord(RecordInputStream recordInputStream) {
        this.field_1_formatFlags = recordInputStream.readShort();
    }
}
