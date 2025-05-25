package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PrintSetupRecord extends StandardRecord {
    public static final short sid = 161;
    private double field_10_footermargin;
    private short field_11_copies;
    private short field_1_paper_size;
    private short field_2_scale;
    private short field_3_page_start;
    private short field_4_fit_width;
    private short field_5_fit_height;
    private short field_6_options;
    private short field_7_hresolution;
    private short field_8_vresolution;
    private double field_9_headermargin;
    private static final BitField lefttoright = BitFieldFactory.getInstance(1);
    private static final BitField landscape = BitFieldFactory.getInstance(2);
    private static final BitField validsettings = BitFieldFactory.getInstance(4);
    private static final BitField nocolor = BitFieldFactory.getInstance(8);
    private static final BitField draft = BitFieldFactory.getInstance(16);
    private static final BitField notes = BitFieldFactory.getInstance(32);
    private static final BitField noOrientation = BitFieldFactory.getInstance(64);
    private static final BitField usepage = BitFieldFactory.getInstance(128);

    public PrintSetupRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        PrintSetupRecord printSetupRecord = new PrintSetupRecord();
        printSetupRecord.field_1_paper_size = this.field_1_paper_size;
        printSetupRecord.field_2_scale = this.field_2_scale;
        printSetupRecord.field_3_page_start = this.field_3_page_start;
        printSetupRecord.field_4_fit_width = this.field_4_fit_width;
        printSetupRecord.field_5_fit_height = this.field_5_fit_height;
        printSetupRecord.field_6_options = this.field_6_options;
        printSetupRecord.field_7_hresolution = this.field_7_hresolution;
        printSetupRecord.field_8_vresolution = this.field_8_vresolution;
        printSetupRecord.field_9_headermargin = this.field_9_headermargin;
        printSetupRecord.field_10_footermargin = this.field_10_footermargin;
        printSetupRecord.field_11_copies = this.field_11_copies;
        return printSetupRecord;
    }

    public short getCopies() {
        return this.field_11_copies;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 34;
    }

    public boolean getDraft() {
        return draft.isSet(this.field_6_options);
    }

    public short getFitHeight() {
        return this.field_5_fit_height;
    }

    public short getFitWidth() {
        return this.field_4_fit_width;
    }

    public double getFooterMargin() {
        return this.field_10_footermargin;
    }

    public short getHResolution() {
        return this.field_7_hresolution;
    }

    public double getHeaderMargin() {
        return this.field_9_headermargin;
    }

    public boolean getLandscape() {
        return landscape.isSet(this.field_6_options);
    }

    public boolean getLeftToRight() {
        return lefttoright.isSet(this.field_6_options);
    }

    public boolean getNoColor() {
        return nocolor.isSet(this.field_6_options);
    }

    public boolean getNoOrientation() {
        return noOrientation.isSet(this.field_6_options);
    }

    public boolean getNotes() {
        return notes.isSet(this.field_6_options);
    }

    public short getOptions() {
        return this.field_6_options;
    }

    public short getPageStart() {
        return this.field_3_page_start;
    }

    public short getPaperSize() {
        return this.field_1_paper_size;
    }

    public short getScale() {
        return this.field_2_scale;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean getUsePage() {
        return usepage.isSet(this.field_6_options);
    }

    public short getVResolution() {
        return this.field_8_vresolution;
    }

    public boolean getValidSettings() {
        return validsettings.isSet(this.field_6_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getPaperSize());
        littleEndianOutput.writeShort(getScale());
        littleEndianOutput.writeShort(getPageStart());
        littleEndianOutput.writeShort(getFitWidth());
        littleEndianOutput.writeShort(getFitHeight());
        littleEndianOutput.writeShort(getOptions());
        littleEndianOutput.writeShort(getHResolution());
        littleEndianOutput.writeShort(getVResolution());
        littleEndianOutput.writeDouble(getHeaderMargin());
        littleEndianOutput.writeDouble(getFooterMargin());
        littleEndianOutput.writeShort(getCopies());
    }

    public void setCopies(short s4) {
        this.field_11_copies = s4;
    }

    public void setDraft(boolean z10) {
        this.field_6_options = draft.setShortBoolean(this.field_6_options, z10);
    }

    public void setFitHeight(short s4) {
        this.field_5_fit_height = s4;
    }

    public void setFitWidth(short s4) {
        this.field_4_fit_width = s4;
    }

    public void setFooterMargin(double d10) {
        this.field_10_footermargin = d10;
    }

    public void setHResolution(short s4) {
        this.field_7_hresolution = s4;
    }

    public void setHeaderMargin(double d10) {
        this.field_9_headermargin = d10;
    }

    public void setLandscape(boolean z10) {
        this.field_6_options = landscape.setShortBoolean(this.field_6_options, z10);
    }

    public void setLeftToRight(boolean z10) {
        this.field_6_options = lefttoright.setShortBoolean(this.field_6_options, z10);
    }

    public void setNoColor(boolean z10) {
        this.field_6_options = nocolor.setShortBoolean(this.field_6_options, z10);
    }

    public void setNoOrientation(boolean z10) {
        this.field_6_options = noOrientation.setShortBoolean(this.field_6_options, z10);
    }

    public void setNotes(boolean z10) {
        this.field_6_options = notes.setShortBoolean(this.field_6_options, z10);
    }

    public void setOptions(short s4) {
        this.field_6_options = s4;
    }

    public void setPageStart(short s4) {
        this.field_3_page_start = s4;
    }

    public void setPaperSize(short s4) {
        this.field_1_paper_size = s4;
    }

    public void setScale(short s4) {
        this.field_2_scale = s4;
    }

    public void setUsePage(boolean z10) {
        this.field_6_options = usepage.setShortBoolean(this.field_6_options, z10);
    }

    public void setVResolution(short s4) {
        this.field_8_vresolution = s4;
    }

    public void setValidSettings(boolean z10) {
        this.field_6_options = validsettings.setShortBoolean(this.field_6_options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PRINTSETUP]\n    .papersize      = ");
        stringBuffer.append((int) getPaperSize());
        stringBuffer.append("\n    .scale          = ");
        stringBuffer.append((int) getScale());
        stringBuffer.append("\n    .pagestart      = ");
        stringBuffer.append((int) getPageStart());
        stringBuffer.append("\n    .fitwidth       = ");
        stringBuffer.append((int) getFitWidth());
        stringBuffer.append("\n    .fitheight      = ");
        stringBuffer.append((int) getFitHeight());
        stringBuffer.append("\n    .options        = ");
        stringBuffer.append((int) getOptions());
        stringBuffer.append("\n        .ltor       = ");
        stringBuffer.append(getLeftToRight());
        stringBuffer.append("\n        .landscape  = ");
        stringBuffer.append(getLandscape());
        stringBuffer.append("\n        .valid      = ");
        stringBuffer.append(getValidSettings());
        stringBuffer.append("\n        .mono       = ");
        stringBuffer.append(getNoColor());
        stringBuffer.append("\n        .draft      = ");
        stringBuffer.append(getDraft());
        stringBuffer.append("\n        .notes      = ");
        stringBuffer.append(getNotes());
        stringBuffer.append("\n        .noOrientat = ");
        stringBuffer.append(getNoOrientation());
        stringBuffer.append("\n        .usepage    = ");
        stringBuffer.append(getUsePage());
        stringBuffer.append("\n    .hresolution    = ");
        stringBuffer.append((int) getHResolution());
        stringBuffer.append("\n    .vresolution    = ");
        stringBuffer.append((int) getVResolution());
        stringBuffer.append("\n    .headermargin   = ");
        stringBuffer.append(getHeaderMargin());
        stringBuffer.append("\n    .footermargin   = ");
        stringBuffer.append(getFooterMargin());
        stringBuffer.append("\n    .copies         = ");
        stringBuffer.append((int) getCopies());
        stringBuffer.append("\n[/PRINTSETUP]\n");
        return stringBuffer.toString();
    }

    public PrintSetupRecord(RecordInputStream recordInputStream) {
        this.field_1_paper_size = recordInputStream.readShort();
        this.field_2_scale = recordInputStream.readShort();
        this.field_3_page_start = recordInputStream.readShort();
        this.field_4_fit_width = recordInputStream.readShort();
        this.field_5_fit_height = recordInputStream.readShort();
        this.field_6_options = recordInputStream.readShort();
        this.field_7_hresolution = recordInputStream.readShort();
        this.field_8_vresolution = recordInputStream.readShort();
        this.field_9_headermargin = recordInputStream.readDouble();
        this.field_10_footermargin = recordInputStream.readDouble();
        this.field_11_copies = recordInputStream.readShort();
    }
}
