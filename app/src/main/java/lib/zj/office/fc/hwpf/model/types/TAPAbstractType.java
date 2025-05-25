package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hwpf.model.HDFType;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.ShadingDescriptor;
import lib.zj.office.fc.hwpf.usermodel.TableAutoformatLookSpecifier;
import lib.zj.office.fc.hwpf.usermodel.TableCellDescriptor;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class TAPAbstractType implements HDFType {
    protected short field_10_wWidthIndent;
    protected short field_11_wWidthBefore;
    protected short field_12_wWidthAfter;
    protected int field_13_widthAndFitsFlags;
    protected int field_14_dxaAbs;
    protected int field_15_dyaAbs;
    protected int field_16_dxaFromText;
    protected int field_17_dyaFromText;
    protected int field_18_dxaFromTextRight;
    protected int field_19_dyaFromTextBottom;
    protected short field_1_istd;
    protected byte field_20_fBiDi;
    protected byte field_21_fRTL;
    protected byte field_22_fNoAllowOverlap;
    protected byte field_23_fSpare;
    protected int field_24_grpfTap;
    protected int field_25_internalFlags;
    protected short field_26_itcMac;
    protected int field_27_dxaAdjust;
    protected int field_28_dxaWebView;
    protected int field_29_dxaRTEWrapWidth;
    protected short field_2_jc;
    protected int field_30_dxaColWidthWwd;
    protected short field_31_pctWwd;
    protected int field_32_viewFlags;
    protected short[] field_33_rgdxaCenter;
    protected short[] field_34_rgdxaCenterPrint;
    protected ShadingDescriptor field_35_shdTable;
    protected BorderCode field_36_brcBottom;
    protected BorderCode field_37_brcTop;
    protected BorderCode field_38_brcLeft;
    protected BorderCode field_39_brcRight;
    protected int field_3_dxaGapHalf;
    protected BorderCode field_40_brcVertical;
    protected BorderCode field_41_brcHorizontal;
    protected short field_42_wCellPaddingDefaultTop;
    protected short field_43_wCellPaddingDefaultLeft;
    protected short field_44_wCellPaddingDefaultBottom;
    protected short field_45_wCellPaddingDefaultRight;
    protected byte field_46_ftsCellPaddingDefaultTop;
    protected byte field_47_ftsCellPaddingDefaultLeft;
    protected byte field_48_ftsCellPaddingDefaultBottom;
    protected byte field_49_ftsCellPaddingDefaultRight;
    protected int field_4_dyaRowHeight;
    protected short field_50_wCellSpacingDefaultTop;
    protected short field_51_wCellSpacingDefaultLeft;
    protected short field_52_wCellSpacingDefaultBottom;
    protected short field_53_wCellSpacingDefaultRight;
    protected byte field_54_ftsCellSpacingDefaultTop;
    protected byte field_55_ftsCellSpacingDefaultLeft;
    protected byte field_56_ftsCellSpacingDefaultBottom;
    protected byte field_57_ftsCellSpacingDefaultRight;
    protected short field_58_wCellPaddingOuterTop;
    protected short field_59_wCellPaddingOuterLeft;
    protected boolean field_5_fCantSplit;
    protected short field_60_wCellPaddingOuterBottom;
    protected short field_61_wCellPaddingOuterRight;
    protected byte field_62_ftsCellPaddingOuterTop;
    protected byte field_63_ftsCellPaddingOuterLeft;
    protected byte field_64_ftsCellPaddingOuterBottom;
    protected byte field_65_ftsCellPaddingOuterRight;
    protected short field_66_wCellSpacingOuterTop;
    protected short field_67_wCellSpacingOuterLeft;
    protected short field_68_wCellSpacingOuterBottom;
    protected short field_69_wCellSpacingOuterRight;
    protected boolean field_6_fCantSplit90;
    protected byte field_70_ftsCellSpacingOuterTop;
    protected byte field_71_ftsCellSpacingOuterLeft;
    protected byte field_72_ftsCellSpacingOuterBottom;
    protected byte field_73_ftsCellSpacingOuterRight;
    protected TableCellDescriptor[] field_74_rgtc;
    protected ShadingDescriptor[] field_75_rgshd;
    protected byte field_76_fPropRMark;
    protected byte field_77_fHasOldProps;
    protected short field_78_cHorzBands;
    protected short field_79_cVertBands;
    protected boolean field_7_fTableHeader;
    protected BorderCode field_80_rgbrcInsideDefault_0;
    protected BorderCode field_81_rgbrcInsideDefault_1;
    protected short field_82_tableIndent;
    protected short field_83_tCellSpacingDefault;
    protected TableAutoformatLookSpecifier field_8_tlp;
    protected short field_9_wWidth;
    private static BitField fAutofit = new BitField(1);
    private static BitField fKeepFollow = new BitField(2);
    private static BitField ftsWidth = new BitField(28);
    private static BitField ftsWidthIndent = new BitField(224);
    private static BitField ftsWidthBefore = new BitField(1792);
    private static BitField ftsWidthAfter = new BitField(14336);
    private static BitField fNeverBeenAutofit = new BitField(16384);
    private static BitField fInvalAutofit = new BitField(Variant.VT_RESERVED);
    private static BitField widthAndFitsFlags_empty1 = new BitField(458752);
    private static BitField fVert = new BitField(524288);
    private static BitField pcVert = new BitField(3145728);
    private static BitField pcHorz = new BitField(12582912);
    private static BitField widthAndFitsFlags_empty2 = new BitField(-16777216);
    private static BitField fFirstRow = new BitField(1);
    private static BitField fLastRow = new BitField(2);
    private static BitField fOutline = new BitField(4);
    private static BitField fOrigWordTableRules = new BitField(8);
    private static BitField fCellSpacing = new BitField(16);
    private static BitField grpfTap_unused = new BitField(65504);
    private static BitField fWrapToWwd = new BitField(1);
    private static BitField fNotPageView = new BitField(2);
    private static BitField viewFlags_unused1 = new BitField(4);
    private static BitField fWebView = new BitField(8);
    private static BitField fAdjusted = new BitField(16);
    private static BitField viewFlags_unused2 = new BitField(65504);

    public BorderCode getBrcBottom() {
        return this.field_36_brcBottom;
    }

    public BorderCode getBrcHorizontal() {
        return this.field_41_brcHorizontal;
    }

    public BorderCode getBrcLeft() {
        return this.field_38_brcLeft;
    }

    public BorderCode getBrcRight() {
        return this.field_39_brcRight;
    }

    public BorderCode getBrcTop() {
        return this.field_37_brcTop;
    }

    public BorderCode getBrcVertical() {
        return this.field_40_brcVertical;
    }

    public short getCHorzBands() {
        return this.field_78_cHorzBands;
    }

    public short getCVertBands() {
        return this.field_79_cVertBands;
    }

    public int getDxaAbs() {
        return this.field_14_dxaAbs;
    }

    public int getDxaAdjust() {
        return this.field_27_dxaAdjust;
    }

    public int getDxaColWidthWwd() {
        return this.field_30_dxaColWidthWwd;
    }

    public int getDxaFromText() {
        return this.field_16_dxaFromText;
    }

    public int getDxaFromTextRight() {
        return this.field_18_dxaFromTextRight;
    }

    public int getDxaGapHalf() {
        return this.field_3_dxaGapHalf;
    }

    public int getDxaRTEWrapWidth() {
        return this.field_29_dxaRTEWrapWidth;
    }

    public int getDxaWebView() {
        return this.field_28_dxaWebView;
    }

    public int getDyaAbs() {
        return this.field_15_dyaAbs;
    }

    public int getDyaFromText() {
        return this.field_17_dyaFromText;
    }

    public int getDyaFromTextBottom() {
        return this.field_19_dyaFromTextBottom;
    }

    public int getDyaRowHeight() {
        return this.field_4_dyaRowHeight;
    }

    public byte getFBiDi() {
        return this.field_20_fBiDi;
    }

    public boolean getFCantSplit() {
        return this.field_5_fCantSplit;
    }

    public boolean getFCantSplit90() {
        return this.field_6_fCantSplit90;
    }

    public byte getFHasOldProps() {
        return this.field_77_fHasOldProps;
    }

    public byte getFNoAllowOverlap() {
        return this.field_22_fNoAllowOverlap;
    }

    public byte getFPropRMark() {
        return this.field_76_fPropRMark;
    }

    public byte getFRTL() {
        return this.field_21_fRTL;
    }

    public byte getFSpare() {
        return this.field_23_fSpare;
    }

    public boolean getFTableHeader() {
        return this.field_7_fTableHeader;
    }

    public byte getFtsCellPaddingDefaultBottom() {
        return this.field_48_ftsCellPaddingDefaultBottom;
    }

    public byte getFtsCellPaddingDefaultLeft() {
        return this.field_47_ftsCellPaddingDefaultLeft;
    }

    public byte getFtsCellPaddingDefaultRight() {
        return this.field_49_ftsCellPaddingDefaultRight;
    }

    public byte getFtsCellPaddingDefaultTop() {
        return this.field_46_ftsCellPaddingDefaultTop;
    }

    public byte getFtsCellPaddingOuterBottom() {
        return this.field_64_ftsCellPaddingOuterBottom;
    }

    public byte getFtsCellPaddingOuterLeft() {
        return this.field_63_ftsCellPaddingOuterLeft;
    }

    public byte getFtsCellPaddingOuterRight() {
        return this.field_65_ftsCellPaddingOuterRight;
    }

    public byte getFtsCellPaddingOuterTop() {
        return this.field_62_ftsCellPaddingOuterTop;
    }

    public byte getFtsCellSpacingDefaultBottom() {
        return this.field_56_ftsCellSpacingDefaultBottom;
    }

    public byte getFtsCellSpacingDefaultLeft() {
        return this.field_55_ftsCellSpacingDefaultLeft;
    }

    public byte getFtsCellSpacingDefaultRight() {
        return this.field_57_ftsCellSpacingDefaultRight;
    }

    public byte getFtsCellSpacingDefaultTop() {
        return this.field_54_ftsCellSpacingDefaultTop;
    }

    public byte getFtsCellSpacingOuterBottom() {
        return this.field_72_ftsCellSpacingOuterBottom;
    }

    public byte getFtsCellSpacingOuterLeft() {
        return this.field_71_ftsCellSpacingOuterLeft;
    }

    public byte getFtsCellSpacingOuterRight() {
        return this.field_73_ftsCellSpacingOuterRight;
    }

    public byte getFtsCellSpacingOuterTop() {
        return this.field_70_ftsCellSpacingOuterTop;
    }

    public byte getFtsWidth() {
        return (byte) ftsWidth.getValue(this.field_13_widthAndFitsFlags);
    }

    public byte getFtsWidthAfter() {
        return (byte) ftsWidthAfter.getValue(this.field_13_widthAndFitsFlags);
    }

    public byte getFtsWidthBefore() {
        return (byte) ftsWidthBefore.getValue(this.field_13_widthAndFitsFlags);
    }

    public byte getFtsWidthIndent() {
        return (byte) ftsWidthIndent.getValue(this.field_13_widthAndFitsFlags);
    }

    public int getGrpfTap() {
        return this.field_24_grpfTap;
    }

    public short getGrpfTap_unused() {
        return (short) grpfTap_unused.getValue(this.field_25_internalFlags);
    }

    public int getInternalFlags() {
        return this.field_25_internalFlags;
    }

    public short getIstd() {
        return this.field_1_istd;
    }

    public short getItcMac() {
        return this.field_26_itcMac;
    }

    public short getJc() {
        return this.field_2_jc;
    }

    public byte getPcHorz() {
        return (byte) pcHorz.getValue(this.field_13_widthAndFitsFlags);
    }

    public byte getPcVert() {
        return (byte) pcVert.getValue(this.field_13_widthAndFitsFlags);
    }

    public short getPctWwd() {
        return this.field_31_pctWwd;
    }

    public BorderCode getRgbrcInsideDefault_0() {
        return this.field_80_rgbrcInsideDefault_0;
    }

    public BorderCode getRgbrcInsideDefault_1() {
        return this.field_81_rgbrcInsideDefault_1;
    }

    public short[] getRgdxaCenter() {
        return this.field_33_rgdxaCenter;
    }

    public short[] getRgdxaCenterPrint() {
        return this.field_34_rgdxaCenterPrint;
    }

    public ShadingDescriptor[] getRgshd() {
        return this.field_75_rgshd;
    }

    public TableCellDescriptor[] getRgtc() {
        return this.field_74_rgtc;
    }

    public ShadingDescriptor getShdTable() {
        return this.field_35_shdTable;
    }

    public int getSize() {
        return 448;
    }

    public short getTCellSpacingDefault() {
        return this.field_83_tCellSpacingDefault;
    }

    public short getTableInIndent() {
        return this.field_82_tableIndent;
    }

    public TableAutoformatLookSpecifier getTlp() {
        return this.field_8_tlp;
    }

    public int getViewFlags() {
        return this.field_32_viewFlags;
    }

    public short getViewFlags_unused2() {
        return (short) viewFlags_unused2.getValue(this.field_32_viewFlags);
    }

    public short getWCellPaddingDefaultBottom() {
        return this.field_44_wCellPaddingDefaultBottom;
    }

    public short getWCellPaddingDefaultLeft() {
        return this.field_43_wCellPaddingDefaultLeft;
    }

    public short getWCellPaddingDefaultRight() {
        return this.field_45_wCellPaddingDefaultRight;
    }

    public short getWCellPaddingDefaultTop() {
        return this.field_42_wCellPaddingDefaultTop;
    }

    public short getWCellPaddingOuterBottom() {
        return this.field_60_wCellPaddingOuterBottom;
    }

    public short getWCellPaddingOuterLeft() {
        return this.field_59_wCellPaddingOuterLeft;
    }

    public short getWCellPaddingOuterRight() {
        return this.field_61_wCellPaddingOuterRight;
    }

    public short getWCellPaddingOuterTop() {
        return this.field_58_wCellPaddingOuterTop;
    }

    public short getWCellSpacingDefaultBottom() {
        return this.field_52_wCellSpacingDefaultBottom;
    }

    public short getWCellSpacingDefaultLeft() {
        return this.field_51_wCellSpacingDefaultLeft;
    }

    public short getWCellSpacingDefaultRight() {
        return this.field_53_wCellSpacingDefaultRight;
    }

    public short getWCellSpacingDefaultTop() {
        return this.field_50_wCellSpacingDefaultTop;
    }

    public short getWCellSpacingOuterBottom() {
        return this.field_68_wCellSpacingOuterBottom;
    }

    public short getWCellSpacingOuterLeft() {
        return this.field_67_wCellSpacingOuterLeft;
    }

    public short getWCellSpacingOuterRight() {
        return this.field_69_wCellSpacingOuterRight;
    }

    public short getWCellSpacingOuterTop() {
        return this.field_66_wCellSpacingOuterTop;
    }

    public short getWWidth() {
        return this.field_9_wWidth;
    }

    public short getWWidthAfter() {
        return this.field_12_wWidthAfter;
    }

    public short getWWidthBefore() {
        return this.field_11_wWidthBefore;
    }

    public short getWWidthIndent() {
        return this.field_10_wWidthIndent;
    }

    public int getWidthAndFitsFlags() {
        return this.field_13_widthAndFitsFlags;
    }

    public byte getWidthAndFitsFlags_empty1() {
        return (byte) widthAndFitsFlags_empty1.getValue(this.field_13_widthAndFitsFlags);
    }

    public short getWidthAndFitsFlags_empty2() {
        return (short) widthAndFitsFlags_empty2.getValue(this.field_13_widthAndFitsFlags);
    }

    public boolean isFAdjusted() {
        return fAdjusted.isSet(this.field_32_viewFlags);
    }

    public boolean isFAutofit() {
        return fAutofit.isSet(this.field_13_widthAndFitsFlags);
    }

    public boolean isFCellSpacing() {
        return fCellSpacing.isSet(this.field_25_internalFlags);
    }

    public boolean isFFirstRow() {
        return fFirstRow.isSet(this.field_25_internalFlags);
    }

    public boolean isFInvalAutofit() {
        return fInvalAutofit.isSet(this.field_13_widthAndFitsFlags);
    }

    public boolean isFKeepFollow() {
        return fKeepFollow.isSet(this.field_13_widthAndFitsFlags);
    }

    public boolean isFLastRow() {
        return fLastRow.isSet(this.field_25_internalFlags);
    }

    public boolean isFNeverBeenAutofit() {
        return fNeverBeenAutofit.isSet(this.field_13_widthAndFitsFlags);
    }

    public boolean isFNotPageView() {
        return fNotPageView.isSet(this.field_32_viewFlags);
    }

    public boolean isFOrigWordTableRules() {
        return fOrigWordTableRules.isSet(this.field_25_internalFlags);
    }

    public boolean isFOutline() {
        return fOutline.isSet(this.field_25_internalFlags);
    }

    public boolean isFVert() {
        return fVert.isSet(this.field_13_widthAndFitsFlags);
    }

    public boolean isFWebView() {
        return fWebView.isSet(this.field_32_viewFlags);
    }

    public boolean isFWrapToWwd() {
        return fWrapToWwd.isSet(this.field_32_viewFlags);
    }

    public boolean isViewFlags_unused1() {
        return viewFlags_unused1.isSet(this.field_32_viewFlags);
    }

    public void setBrcBottom(BorderCode borderCode) {
        this.field_36_brcBottom = borderCode;
    }

    public void setBrcHorizontal(BorderCode borderCode) {
        this.field_41_brcHorizontal = borderCode;
    }

    public void setBrcLeft(BorderCode borderCode) {
        this.field_38_brcLeft = borderCode;
    }

    public void setBrcRight(BorderCode borderCode) {
        this.field_39_brcRight = borderCode;
    }

    public void setBrcTop(BorderCode borderCode) {
        this.field_37_brcTop = borderCode;
    }

    public void setBrcVertical(BorderCode borderCode) {
        this.field_40_brcVertical = borderCode;
    }

    public void setCHorzBands(short s4) {
        this.field_78_cHorzBands = s4;
    }

    public void setCVertBands(short s4) {
        this.field_79_cVertBands = s4;
    }

    public void setDxaAbs(int i10) {
        this.field_14_dxaAbs = i10;
    }

    public void setDxaAdjust(int i10) {
        this.field_27_dxaAdjust = i10;
    }

    public void setDxaColWidthWwd(int i10) {
        this.field_30_dxaColWidthWwd = i10;
    }

    public void setDxaFromText(int i10) {
        this.field_16_dxaFromText = i10;
    }

    public void setDxaFromTextRight(int i10) {
        this.field_18_dxaFromTextRight = i10;
    }

    public void setDxaGapHalf(int i10) {
        this.field_3_dxaGapHalf = i10;
    }

    public void setDxaRTEWrapWidth(int i10) {
        this.field_29_dxaRTEWrapWidth = i10;
    }

    public void setDxaWebView(int i10) {
        this.field_28_dxaWebView = i10;
    }

    public void setDyaAbs(int i10) {
        this.field_15_dyaAbs = i10;
    }

    public void setDyaFromText(int i10) {
        this.field_17_dyaFromText = i10;
    }

    public void setDyaFromTextBottom(int i10) {
        this.field_19_dyaFromTextBottom = i10;
    }

    public void setDyaRowHeight(int i10) {
        this.field_4_dyaRowHeight = i10;
    }

    public void setFAdjusted(boolean z10) {
        this.field_32_viewFlags = fAdjusted.setBoolean(this.field_32_viewFlags, z10);
    }

    public void setFAutofit(boolean z10) {
        this.field_13_widthAndFitsFlags = fAutofit.setBoolean(this.field_13_widthAndFitsFlags, z10);
    }

    public void setFBiDi(byte b10) {
        this.field_20_fBiDi = b10;
    }

    public void setFCantSplit(boolean z10) {
        this.field_5_fCantSplit = z10;
    }

    public void setFCantSplit90(boolean z10) {
        this.field_6_fCantSplit90 = z10;
    }

    public void setFCellSpacing(boolean z10) {
        this.field_25_internalFlags = fCellSpacing.setBoolean(this.field_25_internalFlags, z10);
    }

    public void setFFirstRow(boolean z10) {
        this.field_25_internalFlags = fFirstRow.setBoolean(this.field_25_internalFlags, z10);
    }

    public void setFHasOldProps(byte b10) {
        this.field_77_fHasOldProps = b10;
    }

    public void setFInvalAutofit(boolean z10) {
        this.field_13_widthAndFitsFlags = fInvalAutofit.setBoolean(this.field_13_widthAndFitsFlags, z10);
    }

    public void setFKeepFollow(boolean z10) {
        this.field_13_widthAndFitsFlags = fKeepFollow.setBoolean(this.field_13_widthAndFitsFlags, z10);
    }

    public void setFLastRow(boolean z10) {
        this.field_25_internalFlags = fLastRow.setBoolean(this.field_25_internalFlags, z10);
    }

    public void setFNeverBeenAutofit(boolean z10) {
        this.field_13_widthAndFitsFlags = fNeverBeenAutofit.setBoolean(this.field_13_widthAndFitsFlags, z10);
    }

    public void setFNoAllowOverlap(byte b10) {
        this.field_22_fNoAllowOverlap = b10;
    }

    public void setFNotPageView(boolean z10) {
        this.field_32_viewFlags = fNotPageView.setBoolean(this.field_32_viewFlags, z10);
    }

    public void setFOrigWordTableRules(boolean z10) {
        this.field_25_internalFlags = fOrigWordTableRules.setBoolean(this.field_25_internalFlags, z10);
    }

    public void setFOutline(boolean z10) {
        this.field_25_internalFlags = fOutline.setBoolean(this.field_25_internalFlags, z10);
    }

    public void setFPropRMark(byte b10) {
        this.field_76_fPropRMark = b10;
    }

    public void setFRTL(byte b10) {
        this.field_21_fRTL = b10;
    }

    public void setFSpare(byte b10) {
        this.field_23_fSpare = b10;
    }

    public void setFTableHeader(boolean z10) {
        this.field_7_fTableHeader = z10;
    }

    public void setFVert(boolean z10) {
        this.field_13_widthAndFitsFlags = fVert.setBoolean(this.field_13_widthAndFitsFlags, z10);
    }

    public void setFWebView(boolean z10) {
        this.field_32_viewFlags = fWebView.setBoolean(this.field_32_viewFlags, z10);
    }

    public void setFWrapToWwd(boolean z10) {
        this.field_32_viewFlags = fWrapToWwd.setBoolean(this.field_32_viewFlags, z10);
    }

    public void setFtsCellPaddingDefaultBottom(byte b10) {
        this.field_48_ftsCellPaddingDefaultBottom = b10;
    }

    public void setFtsCellPaddingDefaultLeft(byte b10) {
        this.field_47_ftsCellPaddingDefaultLeft = b10;
    }

    public void setFtsCellPaddingDefaultRight(byte b10) {
        this.field_49_ftsCellPaddingDefaultRight = b10;
    }

    public void setFtsCellPaddingDefaultTop(byte b10) {
        this.field_46_ftsCellPaddingDefaultTop = b10;
    }

    public void setFtsCellPaddingOuterBottom(byte b10) {
        this.field_64_ftsCellPaddingOuterBottom = b10;
    }

    public void setFtsCellPaddingOuterLeft(byte b10) {
        this.field_63_ftsCellPaddingOuterLeft = b10;
    }

    public void setFtsCellPaddingOuterRight(byte b10) {
        this.field_65_ftsCellPaddingOuterRight = b10;
    }

    public void setFtsCellPaddingOuterTop(byte b10) {
        this.field_62_ftsCellPaddingOuterTop = b10;
    }

    public void setFtsCellSpacingDefaultBottom(byte b10) {
        this.field_56_ftsCellSpacingDefaultBottom = b10;
    }

    public void setFtsCellSpacingDefaultLeft(byte b10) {
        this.field_55_ftsCellSpacingDefaultLeft = b10;
    }

    public void setFtsCellSpacingDefaultRight(byte b10) {
        this.field_57_ftsCellSpacingDefaultRight = b10;
    }

    public void setFtsCellSpacingDefaultTop(byte b10) {
        this.field_54_ftsCellSpacingDefaultTop = b10;
    }

    public void setFtsCellSpacingOuterBottom(byte b10) {
        this.field_72_ftsCellSpacingOuterBottom = b10;
    }

    public void setFtsCellSpacingOuterLeft(byte b10) {
        this.field_71_ftsCellSpacingOuterLeft = b10;
    }

    public void setFtsCellSpacingOuterRight(byte b10) {
        this.field_73_ftsCellSpacingOuterRight = b10;
    }

    public void setFtsCellSpacingOuterTop(byte b10) {
        this.field_70_ftsCellSpacingOuterTop = b10;
    }

    public void setFtsWidth(byte b10) {
        this.field_13_widthAndFitsFlags = ftsWidth.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setFtsWidthAfter(byte b10) {
        this.field_13_widthAndFitsFlags = ftsWidthAfter.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setFtsWidthBefore(byte b10) {
        this.field_13_widthAndFitsFlags = ftsWidthBefore.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setFtsWidthIndent(byte b10) {
        this.field_13_widthAndFitsFlags = ftsWidthIndent.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setGrpfTap(int i10) {
        this.field_24_grpfTap = i10;
    }

    public void setGrpfTap_unused(short s4) {
        this.field_25_internalFlags = grpfTap_unused.setValue(this.field_25_internalFlags, s4);
    }

    public void setInternalFlags(int i10) {
        this.field_25_internalFlags = i10;
    }

    public void setIstd(short s4) {
        this.field_1_istd = s4;
    }

    public void setItcMac(short s4) {
        this.field_26_itcMac = s4;
    }

    public void setJc(short s4) {
        this.field_2_jc = s4;
    }

    public void setPcHorz(byte b10) {
        this.field_13_widthAndFitsFlags = pcHorz.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setPcVert(byte b10) {
        this.field_13_widthAndFitsFlags = pcVert.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setPctWwd(short s4) {
        this.field_31_pctWwd = s4;
    }

    public void setRgbrcInsideDefault_0(BorderCode borderCode) {
        this.field_80_rgbrcInsideDefault_0 = borderCode;
    }

    public void setRgbrcInsideDefault_1(BorderCode borderCode) {
        this.field_81_rgbrcInsideDefault_1 = borderCode;
    }

    public void setRgdxaCenter(short[] sArr) {
        this.field_33_rgdxaCenter = sArr;
    }

    public void setRgdxaCenterPrint(short[] sArr) {
        this.field_34_rgdxaCenterPrint = sArr;
    }

    public void setRgshd(ShadingDescriptor[] shadingDescriptorArr) {
        this.field_75_rgshd = shadingDescriptorArr;
    }

    public void setRgtc(TableCellDescriptor[] tableCellDescriptorArr) {
        this.field_74_rgtc = tableCellDescriptorArr;
    }

    public void setShdTable(ShadingDescriptor shadingDescriptor) {
        this.field_35_shdTable = shadingDescriptor;
    }

    public void setTCellSpacingDefault(short s4) {
        this.field_83_tCellSpacingDefault = s4;
    }

    public void setTableIndent(short s4) {
        this.field_82_tableIndent = s4;
    }

    public void setTlp(TableAutoformatLookSpecifier tableAutoformatLookSpecifier) {
        this.field_8_tlp = tableAutoformatLookSpecifier;
    }

    public void setViewFlags(int i10) {
        this.field_32_viewFlags = i10;
    }

    public void setViewFlags_unused1(boolean z10) {
        this.field_32_viewFlags = viewFlags_unused1.setBoolean(this.field_32_viewFlags, z10);
    }

    public void setViewFlags_unused2(short s4) {
        this.field_32_viewFlags = viewFlags_unused2.setValue(this.field_32_viewFlags, s4);
    }

    public void setWCellPaddingDefaultBottom(short s4) {
        this.field_44_wCellPaddingDefaultBottom = s4;
    }

    public void setWCellPaddingDefaultLeft(short s4) {
        this.field_43_wCellPaddingDefaultLeft = s4;
    }

    public void setWCellPaddingDefaultRight(short s4) {
        this.field_45_wCellPaddingDefaultRight = s4;
    }

    public void setWCellPaddingDefaultTop(short s4) {
        this.field_42_wCellPaddingDefaultTop = s4;
    }

    public void setWCellPaddingOuterBottom(short s4) {
        this.field_60_wCellPaddingOuterBottom = s4;
    }

    public void setWCellPaddingOuterLeft(short s4) {
        this.field_59_wCellPaddingOuterLeft = s4;
    }

    public void setWCellPaddingOuterRight(short s4) {
        this.field_61_wCellPaddingOuterRight = s4;
    }

    public void setWCellPaddingOuterTop(short s4) {
        this.field_58_wCellPaddingOuterTop = s4;
    }

    public void setWCellSpacingDefaultBottom(short s4) {
        this.field_52_wCellSpacingDefaultBottom = s4;
    }

    public void setWCellSpacingDefaultLeft(short s4) {
        this.field_51_wCellSpacingDefaultLeft = s4;
    }

    public void setWCellSpacingDefaultRight(short s4) {
        this.field_53_wCellSpacingDefaultRight = s4;
    }

    public void setWCellSpacingDefaultTop(short s4) {
        this.field_50_wCellSpacingDefaultTop = s4;
    }

    public void setWCellSpacingOuterBottom(short s4) {
        this.field_68_wCellSpacingOuterBottom = s4;
    }

    public void setWCellSpacingOuterLeft(short s4) {
        this.field_67_wCellSpacingOuterLeft = s4;
    }

    public void setWCellSpacingOuterRight(short s4) {
        this.field_69_wCellSpacingOuterRight = s4;
    }

    public void setWCellSpacingOuterTop(short s4) {
        this.field_66_wCellSpacingOuterTop = s4;
    }

    public void setWWidth(short s4) {
        this.field_9_wWidth = s4;
    }

    public void setWWidthAfter(short s4) {
        this.field_12_wWidthAfter = s4;
    }

    public void setWWidthBefore(short s4) {
        this.field_11_wWidthBefore = s4;
    }

    public void setWWidthIndent(short s4) {
        this.field_10_wWidthIndent = s4;
    }

    public void setWidthAndFitsFlags(int i10) {
        this.field_13_widthAndFitsFlags = i10;
    }

    public void setWidthAndFitsFlags_empty1(byte b10) {
        this.field_13_widthAndFitsFlags = widthAndFitsFlags_empty1.setValue(this.field_13_widthAndFitsFlags, b10);
    }

    public void setWidthAndFitsFlags_empty2(short s4) {
        this.field_13_widthAndFitsFlags = widthAndFitsFlags_empty2.setValue(this.field_13_widthAndFitsFlags, s4);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TAP]\n    .istd                 =  (");
        stringBuffer.append((int) getIstd());
        stringBuffer.append(" )\n    .jc                   =  (");
        stringBuffer.append((int) getJc());
        stringBuffer.append(" )\n    .dxaGapHalf           =  (");
        stringBuffer.append(getDxaGapHalf());
        stringBuffer.append(" )\n    .dyaRowHeight         =  (");
        stringBuffer.append(getDyaRowHeight());
        stringBuffer.append(" )\n    .fCantSplit           =  (");
        stringBuffer.append(getFCantSplit());
        stringBuffer.append(" )\n    .fCantSplit90         =  (");
        stringBuffer.append(getFCantSplit90());
        stringBuffer.append(" )\n    .fTableHeader         =  (");
        stringBuffer.append(getFTableHeader());
        stringBuffer.append(" )\n    .tlp                  =  (");
        stringBuffer.append(getTlp());
        stringBuffer.append(" )\n    .wWidth               =  (");
        stringBuffer.append((int) getWWidth());
        stringBuffer.append(" )\n    .wWidthIndent         =  (");
        stringBuffer.append((int) getWWidthIndent());
        stringBuffer.append(" )\n    .wWidthBefore         =  (");
        stringBuffer.append((int) getWWidthBefore());
        stringBuffer.append(" )\n    .wWidthAfter          =  (");
        stringBuffer.append((int) getWWidthAfter());
        stringBuffer.append(" )\n    .widthAndFitsFlags    =  (");
        stringBuffer.append(getWidthAndFitsFlags());
        stringBuffer.append(" )\n         .fAutofit                 = ");
        stringBuffer.append(isFAutofit());
        stringBuffer.append("\n         .fKeepFollow              = ");
        stringBuffer.append(isFKeepFollow());
        stringBuffer.append("\n         .ftsWidth                 = ");
        stringBuffer.append((int) getFtsWidth());
        stringBuffer.append("\n         .ftsWidthIndent           = ");
        stringBuffer.append((int) getFtsWidthIndent());
        stringBuffer.append("\n         .ftsWidthBefore           = ");
        stringBuffer.append((int) getFtsWidthBefore());
        stringBuffer.append("\n         .ftsWidthAfter            = ");
        stringBuffer.append((int) getFtsWidthAfter());
        stringBuffer.append("\n         .fNeverBeenAutofit        = ");
        stringBuffer.append(isFNeverBeenAutofit());
        stringBuffer.append("\n         .fInvalAutofit            = ");
        stringBuffer.append(isFInvalAutofit());
        stringBuffer.append("\n         .widthAndFitsFlags_empty1     = ");
        stringBuffer.append((int) getWidthAndFitsFlags_empty1());
        stringBuffer.append("\n         .fVert                    = ");
        stringBuffer.append(isFVert());
        stringBuffer.append("\n         .pcVert                   = ");
        stringBuffer.append((int) getPcVert());
        stringBuffer.append("\n         .pcHorz                   = ");
        stringBuffer.append((int) getPcHorz());
        stringBuffer.append("\n         .widthAndFitsFlags_empty2     = ");
        stringBuffer.append((int) getWidthAndFitsFlags_empty2());
        stringBuffer.append("\n    .dxaAbs               =  (");
        stringBuffer.append(getDxaAbs());
        stringBuffer.append(" )\n    .dyaAbs               =  (");
        stringBuffer.append(getDyaAbs());
        stringBuffer.append(" )\n    .dxaFromText          =  (");
        stringBuffer.append(getDxaFromText());
        stringBuffer.append(" )\n    .dyaFromText          =  (");
        stringBuffer.append(getDyaFromText());
        stringBuffer.append(" )\n    .dxaFromTextRight     =  (");
        stringBuffer.append(getDxaFromTextRight());
        stringBuffer.append(" )\n    .dyaFromTextBottom    =  (");
        stringBuffer.append(getDyaFromTextBottom());
        stringBuffer.append(" )\n    .fBiDi                =  (");
        stringBuffer.append((int) getFBiDi());
        stringBuffer.append(" )\n    .fRTL                 =  (");
        stringBuffer.append((int) getFRTL());
        stringBuffer.append(" )\n    .fNoAllowOverlap      =  (");
        stringBuffer.append((int) getFNoAllowOverlap());
        stringBuffer.append(" )\n    .fSpare               =  (");
        stringBuffer.append((int) getFSpare());
        stringBuffer.append(" )\n    .grpfTap              =  (");
        stringBuffer.append(getGrpfTap());
        stringBuffer.append(" )\n    .internalFlags        =  (");
        stringBuffer.append(getInternalFlags());
        stringBuffer.append(" )\n         .fFirstRow                = ");
        stringBuffer.append(isFFirstRow());
        stringBuffer.append("\n         .fLastRow                 = ");
        stringBuffer.append(isFLastRow());
        stringBuffer.append("\n         .fOutline                 = ");
        stringBuffer.append(isFOutline());
        stringBuffer.append("\n         .fOrigWordTableRules      = ");
        stringBuffer.append(isFOrigWordTableRules());
        stringBuffer.append("\n         .fCellSpacing             = ");
        stringBuffer.append(isFCellSpacing());
        stringBuffer.append("\n         .grpfTap_unused           = ");
        stringBuffer.append((int) getGrpfTap_unused());
        stringBuffer.append("\n    .itcMac               =  (");
        stringBuffer.append((int) getItcMac());
        stringBuffer.append(" )\n    .dxaAdjust            =  (");
        stringBuffer.append(getDxaAdjust());
        stringBuffer.append(" )\n    .dxaWebView           =  (");
        stringBuffer.append(getDxaWebView());
        stringBuffer.append(" )\n    .dxaRTEWrapWidth      =  (");
        stringBuffer.append(getDxaRTEWrapWidth());
        stringBuffer.append(" )\n    .dxaColWidthWwd       =  (");
        stringBuffer.append(getDxaColWidthWwd());
        stringBuffer.append(" )\n    .pctWwd               =  (");
        stringBuffer.append((int) getPctWwd());
        stringBuffer.append(" )\n    .viewFlags            =  (");
        stringBuffer.append(getViewFlags());
        stringBuffer.append(" )\n         .fWrapToWwd               = ");
        stringBuffer.append(isFWrapToWwd());
        stringBuffer.append("\n         .fNotPageView             = ");
        stringBuffer.append(isFNotPageView());
        stringBuffer.append("\n         .viewFlags_unused1        = ");
        stringBuffer.append(isViewFlags_unused1());
        stringBuffer.append("\n         .fWebView                 = ");
        stringBuffer.append(isFWebView());
        stringBuffer.append("\n         .fAdjusted                = ");
        stringBuffer.append(isFAdjusted());
        stringBuffer.append("\n         .viewFlags_unused2        = ");
        stringBuffer.append((int) getViewFlags_unused2());
        stringBuffer.append("\n    .rgdxaCenter          =  (");
        stringBuffer.append(getRgdxaCenter());
        stringBuffer.append(" )\n    .rgdxaCenterPrint     =  (");
        stringBuffer.append(getRgdxaCenterPrint());
        stringBuffer.append(" )\n    .shdTable             =  (");
        stringBuffer.append(getShdTable());
        stringBuffer.append(" )\n    .brcBottom            =  (");
        stringBuffer.append(getBrcBottom());
        stringBuffer.append(" )\n    .brcTop               =  (");
        stringBuffer.append(getBrcTop());
        stringBuffer.append(" )\n    .brcLeft              =  (");
        stringBuffer.append(getBrcLeft());
        stringBuffer.append(" )\n    .brcRight             =  (");
        stringBuffer.append(getBrcRight());
        stringBuffer.append(" )\n    .brcVertical          =  (");
        stringBuffer.append(getBrcVertical());
        stringBuffer.append(" )\n    .brcHorizontal        =  (");
        stringBuffer.append(getBrcHorizontal());
        stringBuffer.append(" )\n    .wCellPaddingDefaultTop =  (");
        stringBuffer.append((int) getWCellPaddingDefaultTop());
        stringBuffer.append(" )\n    .wCellPaddingDefaultLeft =  (");
        stringBuffer.append((int) getWCellPaddingDefaultLeft());
        stringBuffer.append(" )\n    .wCellPaddingDefaultBottom =  (");
        stringBuffer.append((int) getWCellPaddingDefaultBottom());
        stringBuffer.append(" )\n    .wCellPaddingDefaultRight =  (");
        stringBuffer.append((int) getWCellPaddingDefaultRight());
        stringBuffer.append(" )\n    .ftsCellPaddingDefaultTop =  (");
        stringBuffer.append((int) getFtsCellPaddingDefaultTop());
        stringBuffer.append(" )\n    .ftsCellPaddingDefaultLeft =  (");
        stringBuffer.append((int) getFtsCellPaddingDefaultLeft());
        stringBuffer.append(" )\n    .ftsCellPaddingDefaultBottom =  (");
        stringBuffer.append((int) getFtsCellPaddingDefaultBottom());
        stringBuffer.append(" )\n    .ftsCellPaddingDefaultRight =  (");
        stringBuffer.append((int) getFtsCellPaddingDefaultRight());
        stringBuffer.append(" )\n    .wCellSpacingDefaultTop =  (");
        stringBuffer.append((int) getWCellSpacingDefaultTop());
        stringBuffer.append(" )\n    .wCellSpacingDefaultLeft =  (");
        stringBuffer.append((int) getWCellSpacingDefaultLeft());
        stringBuffer.append(" )\n    .wCellSpacingDefaultBottom =  (");
        stringBuffer.append((int) getWCellSpacingDefaultBottom());
        stringBuffer.append(" )\n    .wCellSpacingDefaultRight =  (");
        stringBuffer.append((int) getWCellSpacingDefaultRight());
        stringBuffer.append(" )\n    .ftsCellSpacingDefaultTop =  (");
        stringBuffer.append((int) getFtsCellSpacingDefaultTop());
        stringBuffer.append(" )\n    .ftsCellSpacingDefaultLeft =  (");
        stringBuffer.append((int) getFtsCellSpacingDefaultLeft());
        stringBuffer.append(" )\n    .ftsCellSpacingDefaultBottom =  (");
        stringBuffer.append((int) getFtsCellSpacingDefaultBottom());
        stringBuffer.append(" )\n    .ftsCellSpacingDefaultRight =  (");
        stringBuffer.append((int) getFtsCellSpacingDefaultRight());
        stringBuffer.append(" )\n    .wCellPaddingOuterTop =  (");
        stringBuffer.append((int) getWCellPaddingOuterTop());
        stringBuffer.append(" )\n    .wCellPaddingOuterLeft =  (");
        stringBuffer.append((int) getWCellPaddingOuterLeft());
        stringBuffer.append(" )\n    .wCellPaddingOuterBottom =  (");
        stringBuffer.append((int) getWCellPaddingOuterBottom());
        stringBuffer.append(" )\n    .wCellPaddingOuterRight =  (");
        stringBuffer.append((int) getWCellPaddingOuterRight());
        stringBuffer.append(" )\n    .ftsCellPaddingOuterTop =  (");
        stringBuffer.append((int) getFtsCellPaddingOuterTop());
        stringBuffer.append(" )\n    .ftsCellPaddingOuterLeft =  (");
        stringBuffer.append((int) getFtsCellPaddingOuterLeft());
        stringBuffer.append(" )\n    .ftsCellPaddingOuterBottom =  (");
        stringBuffer.append((int) getFtsCellPaddingOuterBottom());
        stringBuffer.append(" )\n    .ftsCellPaddingOuterRight =  (");
        stringBuffer.append((int) getFtsCellPaddingOuterRight());
        stringBuffer.append(" )\n    .wCellSpacingOuterTop =  (");
        stringBuffer.append((int) getWCellSpacingOuterTop());
        stringBuffer.append(" )\n    .wCellSpacingOuterLeft =  (");
        stringBuffer.append((int) getWCellSpacingOuterLeft());
        stringBuffer.append(" )\n    .wCellSpacingOuterBottom =  (");
        stringBuffer.append((int) getWCellSpacingOuterBottom());
        stringBuffer.append(" )\n    .wCellSpacingOuterRight =  (");
        stringBuffer.append((int) getWCellSpacingOuterRight());
        stringBuffer.append(" )\n    .ftsCellSpacingOuterTop =  (");
        stringBuffer.append((int) getFtsCellSpacingOuterTop());
        stringBuffer.append(" )\n    .ftsCellSpacingOuterLeft =  (");
        stringBuffer.append((int) getFtsCellSpacingOuterLeft());
        stringBuffer.append(" )\n    .ftsCellSpacingOuterBottom =  (");
        stringBuffer.append((int) getFtsCellSpacingOuterBottom());
        stringBuffer.append(" )\n    .ftsCellSpacingOuterRight =  (");
        stringBuffer.append((int) getFtsCellSpacingOuterRight());
        stringBuffer.append(" )\n    .rgtc                 =  (");
        stringBuffer.append(getRgtc());
        stringBuffer.append(" )\n    .rgshd                =  (");
        stringBuffer.append(getRgshd());
        stringBuffer.append(" )\n    .fPropRMark           =  (");
        stringBuffer.append((int) getFPropRMark());
        stringBuffer.append(" )\n    .fHasOldProps         =  (");
        stringBuffer.append((int) getFHasOldProps());
        stringBuffer.append(" )\n    .cHorzBands           =  (");
        stringBuffer.append((int) getCHorzBands());
        stringBuffer.append(" )\n    .cVertBands           =  (");
        stringBuffer.append((int) getCVertBands());
        stringBuffer.append(" )\n    .rgbrcInsideDefault_0 =  (");
        stringBuffer.append(getRgbrcInsideDefault_0());
        stringBuffer.append(" )\n    .rgbrcInsideDefault_1 =  (");
        stringBuffer.append(getRgbrcInsideDefault_1());
        stringBuffer.append(" )\n[/TAP]\n");
        return stringBuffer.toString();
    }
}
