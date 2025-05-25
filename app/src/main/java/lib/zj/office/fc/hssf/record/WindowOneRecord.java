package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class WindowOneRecord extends StandardRecord {
    public static final short sid = 61;
    private short field_1_h_hold;
    private short field_2_v_hold;
    private short field_3_width;
    private short field_4_height;
    private short field_5_options;
    private int field_6_active_sheet;
    private int field_7_first_visible_tab;
    private short field_8_num_selected_tabs;
    private short field_9_tab_width_ratio;
    private static final BitField hidden = BitFieldFactory.getInstance(1);
    private static final BitField iconic = BitFieldFactory.getInstance(2);
    private static final BitField reserved = BitFieldFactory.getInstance(4);
    private static final BitField hscroll = BitFieldFactory.getInstance(8);
    private static final BitField vscroll = BitFieldFactory.getInstance(16);
    private static final BitField tabs = BitFieldFactory.getInstance(32);

    public WindowOneRecord() {
    }

    public int getActiveSheetIndex() {
        return this.field_6_active_sheet;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public boolean getDisplayHorizontalScrollbar() {
        return hscroll.isSet(this.field_5_options);
    }

    public boolean getDisplayTabs() {
        return tabs.isSet(this.field_5_options);
    }

    public boolean getDisplayVerticalScrollbar() {
        return vscroll.isSet(this.field_5_options);
    }

    public short getDisplayedTab() {
        return (short) getFirstVisibleTab();
    }

    public int getFirstVisibleTab() {
        return this.field_7_first_visible_tab;
    }

    public short getHeight() {
        return this.field_4_height;
    }

    public boolean getHidden() {
        return hidden.isSet(this.field_5_options);
    }

    public short getHorizontalHold() {
        return this.field_1_h_hold;
    }

    public boolean getIconic() {
        return iconic.isSet(this.field_5_options);
    }

    public short getNumSelectedTabs() {
        return this.field_8_num_selected_tabs;
    }

    public short getOptions() {
        return this.field_5_options;
    }

    public short getSelectedTab() {
        return (short) getActiveSheetIndex();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 61;
    }

    public short getTabWidthRatio() {
        return this.field_9_tab_width_ratio;
    }

    public short getVerticalHold() {
        return this.field_2_v_hold;
    }

    public short getWidth() {
        return this.field_3_width;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getHorizontalHold());
        littleEndianOutput.writeShort(getVerticalHold());
        littleEndianOutput.writeShort(getWidth());
        littleEndianOutput.writeShort(getHeight());
        littleEndianOutput.writeShort(getOptions());
        littleEndianOutput.writeShort(getActiveSheetIndex());
        littleEndianOutput.writeShort(getFirstVisibleTab());
        littleEndianOutput.writeShort(getNumSelectedTabs());
        littleEndianOutput.writeShort(getTabWidthRatio());
    }

    public void setActiveSheetIndex(int i10) {
        this.field_6_active_sheet = i10;
    }

    public void setDisplayHorizonalScrollbar(boolean z10) {
        this.field_5_options = hscroll.setShortBoolean(this.field_5_options, z10);
    }

    public void setDisplayTabs(boolean z10) {
        this.field_5_options = tabs.setShortBoolean(this.field_5_options, z10);
    }

    public void setDisplayVerticalScrollbar(boolean z10) {
        this.field_5_options = vscroll.setShortBoolean(this.field_5_options, z10);
    }

    public void setDisplayedTab(short s4) {
        setFirstVisibleTab(s4);
    }

    public void setFirstVisibleTab(int i10) {
        this.field_7_first_visible_tab = i10;
    }

    public void setHeight(short s4) {
        this.field_4_height = s4;
    }

    public void setHidden(boolean z10) {
        this.field_5_options = hidden.setShortBoolean(this.field_5_options, z10);
    }

    public void setHorizontalHold(short s4) {
        this.field_1_h_hold = s4;
    }

    public void setIconic(boolean z10) {
        this.field_5_options = iconic.setShortBoolean(this.field_5_options, z10);
    }

    public void setNumSelectedTabs(short s4) {
        this.field_8_num_selected_tabs = s4;
    }

    public void setOptions(short s4) {
        this.field_5_options = s4;
    }

    public void setSelectedTab(short s4) {
        setActiveSheetIndex(s4);
    }

    public void setTabWidthRatio(short s4) {
        this.field_9_tab_width_ratio = s4;
    }

    public void setVerticalHold(short s4) {
        this.field_2_v_hold = s4;
    }

    public void setWidth(short s4) {
        this.field_3_width = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[WINDOW1]\n    .h_hold          = ");
        stringBuffer.append(Integer.toHexString(getHorizontalHold()));
        stringBuffer.append("\n    .v_hold          = ");
        stringBuffer.append(Integer.toHexString(getVerticalHold()));
        stringBuffer.append("\n    .width           = ");
        stringBuffer.append(Integer.toHexString(getWidth()));
        stringBuffer.append("\n    .height          = ");
        stringBuffer.append(Integer.toHexString(getHeight()));
        stringBuffer.append("\n    .options         = ");
        stringBuffer.append(Integer.toHexString(getOptions()));
        stringBuffer.append("\n        .hidden      = ");
        stringBuffer.append(getHidden());
        stringBuffer.append("\n        .iconic      = ");
        stringBuffer.append(getIconic());
        stringBuffer.append("\n        .hscroll     = ");
        stringBuffer.append(getDisplayHorizontalScrollbar());
        stringBuffer.append("\n        .vscroll     = ");
        stringBuffer.append(getDisplayVerticalScrollbar());
        stringBuffer.append("\n        .tabs        = ");
        stringBuffer.append(getDisplayTabs());
        stringBuffer.append("\n    .activeSheet     = ");
        stringBuffer.append(Integer.toHexString(getActiveSheetIndex()));
        stringBuffer.append("\n    .firstVisibleTab    = ");
        stringBuffer.append(Integer.toHexString(getFirstVisibleTab()));
        stringBuffer.append("\n    .numselectedtabs = ");
        stringBuffer.append(Integer.toHexString(getNumSelectedTabs()));
        stringBuffer.append("\n    .tabwidthratio   = ");
        stringBuffer.append(Integer.toHexString(getTabWidthRatio()));
        stringBuffer.append("\n[/WINDOW1]\n");
        return stringBuffer.toString();
    }

    public WindowOneRecord(RecordInputStream recordInputStream) {
        this.field_1_h_hold = recordInputStream.readShort();
        this.field_2_v_hold = recordInputStream.readShort();
        this.field_3_width = recordInputStream.readShort();
        this.field_4_height = recordInputStream.readShort();
        this.field_5_options = recordInputStream.readShort();
        this.field_6_active_sheet = recordInputStream.readShort();
        this.field_7_first_visible_tab = recordInputStream.readShort();
        this.field_8_num_selected_tabs = recordInputStream.readShort();
        this.field_9_tab_width_ratio = recordInputStream.readShort();
    }
}
