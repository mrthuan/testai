package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class WindowTwoRecord extends StandardRecord {
    public static final short sid = 574;
    private short field_1_options;
    private short field_2_top_row;
    private short field_3_left_col;
    private int field_4_header_color;
    private short field_5_page_break_zoom;
    private short field_6_normal_zoom;
    private int field_7_reserved;
    private static final BitField displayFormulas = BitFieldFactory.getInstance(1);
    private static final BitField displayGridlines = BitFieldFactory.getInstance(2);
    private static final BitField displayRowColHeadings = BitFieldFactory.getInstance(4);
    private static final BitField freezePanes = BitFieldFactory.getInstance(8);
    private static final BitField displayZeros = BitFieldFactory.getInstance(16);
    private static final BitField defaultHeader = BitFieldFactory.getInstance(32);
    private static final BitField arabic = BitFieldFactory.getInstance(64);
    private static final BitField displayGuts = BitFieldFactory.getInstance(128);
    private static final BitField freezePanesNoSplit = BitFieldFactory.getInstance(256);
    private static final BitField selected = BitFieldFactory.getInstance(512);
    private static final BitField active = BitFieldFactory.getInstance(1024);
    private static final BitField savedInPageBreakPreview = BitFieldFactory.getInstance(2048);

    public WindowTwoRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        WindowTwoRecord windowTwoRecord = new WindowTwoRecord();
        windowTwoRecord.field_1_options = this.field_1_options;
        windowTwoRecord.field_2_top_row = this.field_2_top_row;
        windowTwoRecord.field_3_left_col = this.field_3_left_col;
        windowTwoRecord.field_4_header_color = this.field_4_header_color;
        windowTwoRecord.field_5_page_break_zoom = this.field_5_page_break_zoom;
        windowTwoRecord.field_6_normal_zoom = this.field_6_normal_zoom;
        windowTwoRecord.field_7_reserved = this.field_7_reserved;
        return windowTwoRecord;
    }

    public boolean getArabic() {
        return arabic.isSet(this.field_1_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public boolean getDefaultHeader() {
        return defaultHeader.isSet(this.field_1_options);
    }

    public boolean getDisplayFormulas() {
        return displayFormulas.isSet(this.field_1_options);
    }

    public boolean getDisplayGridlines() {
        return displayGridlines.isSet(this.field_1_options);
    }

    public boolean getDisplayGuts() {
        return displayGuts.isSet(this.field_1_options);
    }

    public boolean getDisplayRowColHeadings() {
        return displayRowColHeadings.isSet(this.field_1_options);
    }

    public boolean getDisplayZeros() {
        return displayZeros.isSet(this.field_1_options);
    }

    public boolean getFreezePanes() {
        return freezePanes.isSet(this.field_1_options);
    }

    public boolean getFreezePanesNoSplit() {
        return freezePanesNoSplit.isSet(this.field_1_options);
    }

    public int getHeaderColor() {
        return this.field_4_header_color;
    }

    public short getLeftCol() {
        return this.field_3_left_col;
    }

    public short getNormalZoom() {
        return this.field_6_normal_zoom;
    }

    public short getOptions() {
        return this.field_1_options;
    }

    public short getPageBreakZoom() {
        return this.field_5_page_break_zoom;
    }

    public boolean getPaged() {
        return isActive();
    }

    public int getReserved() {
        return this.field_7_reserved;
    }

    public boolean getSavedInPageBreakPreview() {
        return savedInPageBreakPreview.isSet(this.field_1_options);
    }

    public boolean getSelected() {
        return selected.isSet(this.field_1_options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 574;
    }

    public short getTopRow() {
        return this.field_2_top_row;
    }

    public boolean isActive() {
        return active.isSet(this.field_1_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getOptions());
        littleEndianOutput.writeShort(getTopRow());
        littleEndianOutput.writeShort(getLeftCol());
        littleEndianOutput.writeInt(getHeaderColor());
        littleEndianOutput.writeShort(getPageBreakZoom());
        littleEndianOutput.writeShort(getNormalZoom());
        littleEndianOutput.writeInt(getReserved());
    }

    public void setActive(boolean z10) {
        this.field_1_options = active.setShortBoolean(this.field_1_options, z10);
    }

    public void setArabic(boolean z10) {
        this.field_1_options = arabic.setShortBoolean(this.field_1_options, z10);
    }

    public void setDefaultHeader(boolean z10) {
        this.field_1_options = defaultHeader.setShortBoolean(this.field_1_options, z10);
    }

    public void setDisplayFormulas(boolean z10) {
        this.field_1_options = displayFormulas.setShortBoolean(this.field_1_options, z10);
    }

    public void setDisplayGridlines(boolean z10) {
        this.field_1_options = displayGridlines.setShortBoolean(this.field_1_options, z10);
    }

    public void setDisplayGuts(boolean z10) {
        this.field_1_options = displayGuts.setShortBoolean(this.field_1_options, z10);
    }

    public void setDisplayRowColHeadings(boolean z10) {
        this.field_1_options = displayRowColHeadings.setShortBoolean(this.field_1_options, z10);
    }

    public void setDisplayZeros(boolean z10) {
        this.field_1_options = displayZeros.setShortBoolean(this.field_1_options, z10);
    }

    public void setFreezePanes(boolean z10) {
        this.field_1_options = freezePanes.setShortBoolean(this.field_1_options, z10);
    }

    public void setFreezePanesNoSplit(boolean z10) {
        this.field_1_options = freezePanesNoSplit.setShortBoolean(this.field_1_options, z10);
    }

    public void setHeaderColor(int i10) {
        this.field_4_header_color = i10;
    }

    public void setLeftCol(short s4) {
        this.field_3_left_col = s4;
    }

    public void setNormalZoom(short s4) {
        this.field_6_normal_zoom = s4;
    }

    public void setOptions(short s4) {
        this.field_1_options = s4;
    }

    public void setPageBreakZoom(short s4) {
        this.field_5_page_break_zoom = s4;
    }

    public void setPaged(boolean z10) {
        setActive(z10);
    }

    public void setReserved(int i10) {
        this.field_7_reserved = i10;
    }

    public void setSavedInPageBreakPreview(boolean z10) {
        this.field_1_options = savedInPageBreakPreview.setShortBoolean(this.field_1_options, z10);
    }

    public void setSelected(boolean z10) {
        this.field_1_options = selected.setShortBoolean(this.field_1_options, z10);
    }

    public void setTopRow(short s4) {
        this.field_2_top_row = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[WINDOW2]\n    .options        = ");
        stringBuffer.append(Integer.toHexString(getOptions()));
        stringBuffer.append("\n       .dispformulas= ");
        stringBuffer.append(getDisplayFormulas());
        stringBuffer.append("\n       .dispgridlins= ");
        stringBuffer.append(getDisplayGridlines());
        stringBuffer.append("\n       .disprcheadin= ");
        stringBuffer.append(getDisplayRowColHeadings());
        stringBuffer.append("\n       .freezepanes = ");
        stringBuffer.append(getFreezePanes());
        stringBuffer.append("\n       .displayzeros= ");
        stringBuffer.append(getDisplayZeros());
        stringBuffer.append("\n       .defaultheadr= ");
        stringBuffer.append(getDefaultHeader());
        stringBuffer.append("\n       .arabic      = ");
        stringBuffer.append(getArabic());
        stringBuffer.append("\n       .displayguts = ");
        stringBuffer.append(getDisplayGuts());
        stringBuffer.append("\n       .frzpnsnosplt= ");
        stringBuffer.append(getFreezePanesNoSplit());
        stringBuffer.append("\n       .selected    = ");
        stringBuffer.append(getSelected());
        stringBuffer.append("\n       .active       = ");
        stringBuffer.append(isActive());
        stringBuffer.append("\n       .svdinpgbrkpv= ");
        stringBuffer.append(getSavedInPageBreakPreview());
        stringBuffer.append("\n    .toprow         = ");
        stringBuffer.append(Integer.toHexString(getTopRow()));
        stringBuffer.append("\n    .leftcol        = ");
        stringBuffer.append(Integer.toHexString(getLeftCol()));
        stringBuffer.append("\n    .headercolor    = ");
        stringBuffer.append(Integer.toHexString(getHeaderColor()));
        stringBuffer.append("\n    .pagebreakzoom  = ");
        stringBuffer.append(Integer.toHexString(getPageBreakZoom()));
        stringBuffer.append("\n    .normalzoom     = ");
        stringBuffer.append(Integer.toHexString(getNormalZoom()));
        stringBuffer.append("\n    .reserved       = ");
        stringBuffer.append(Integer.toHexString(getReserved()));
        stringBuffer.append("\n[/WINDOW2]\n");
        return stringBuffer.toString();
    }

    public WindowTwoRecord(RecordInputStream recordInputStream) {
        int remaining = recordInputStream.remaining();
        this.field_1_options = recordInputStream.readShort();
        this.field_2_top_row = recordInputStream.readShort();
        this.field_3_left_col = recordInputStream.readShort();
        this.field_4_header_color = recordInputStream.readInt();
        if (remaining > 10) {
            this.field_5_page_break_zoom = recordInputStream.readShort();
            this.field_6_normal_zoom = recordInputStream.readShort();
        }
        if (remaining > 14) {
            this.field_7_reserved = recordInputStream.readInt();
        }
    }
}
