package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.DateAndTime;
import lib.zj.office.fc.hwpf.usermodel.DropCapSpecifier;
import lib.zj.office.fc.hwpf.usermodel.LineSpacingDescriptor;
import lib.zj.office.fc.hwpf.usermodel.ShadingDescriptor;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class PAPAbstractType {
    public static final byte BRCL_DOUBLE = 2;
    public static final byte BRCL_SHADOW = 3;
    public static final byte BRCL_SINGLE = 0;
    public static final byte BRCL_THICK = 1;
    public static final byte BRCP_BAR_TO_LEFT_OF_PARAGRAPH = 16;
    public static final byte BRCP_BORDER_ABOVE = 1;
    public static final byte BRCP_BORDER_BELOW = 2;
    public static final byte BRCP_BOX_AROUND = 15;
    public static final byte BRCP_NONE = 0;
    public static final boolean FMINHEIGHT_AT_LEAST = true;
    public static final boolean FMINHEIGHT_EXACT = false;
    public static final byte WALIGNFONT_AUTO = 4;
    public static final byte WALIGNFONT_CENTERED = 1;
    public static final byte WALIGNFONT_HANGING = 0;
    public static final byte WALIGNFONT_ROMAN = 2;
    public static final byte WALIGNFONT_VARIABLE = 3;
    protected boolean field_10_fNoLnn;
    protected LineSpacingDescriptor field_11_lspd;
    protected int field_12_dyaBefore;
    protected int field_13_dyaAfter;
    protected boolean field_14_fInTable;
    protected boolean field_15_finTableW97;
    protected boolean field_16_fTtp;
    protected int field_17_dxaAbs;
    protected int field_18_dyaAbs;
    protected int field_19_dxaWidth;
    protected int field_1_istd;
    protected boolean field_20_fBrLnAbove;
    protected boolean field_21_fBrLnBelow;
    protected byte field_22_pcVert;
    protected byte field_23_pcHorz;
    protected byte field_24_wr;
    protected boolean field_25_fNoAutoHyph;
    protected int field_26_dyaHeight;
    protected boolean field_27_fMinHeight;
    protected int field_29_dyaFromText;
    protected boolean field_2_fSideBySide;
    protected int field_30_dxaFromText;
    protected boolean field_31_fLocked;
    protected boolean field_33_fKinsoku;
    protected boolean field_34_fWordWrap;
    protected boolean field_35_fOverflowPunct;
    protected boolean field_36_fTopLinePunct;
    protected boolean field_37_fAutoSpaceDE;
    protected boolean field_38_fAutoSpaceDN;
    protected int field_39_wAlignFont;
    protected boolean field_3_fKeep;
    protected short field_40_fontAlign;
    protected boolean field_42_fBiDi;
    protected boolean field_43_fNumRMIns;
    protected boolean field_44_fCrLf;
    protected boolean field_45_fUsePgsuSettings;
    protected boolean field_46_fAdjustRight;
    protected int field_47_itap;
    protected boolean field_48_fInnerTableCell;
    protected boolean field_49_fOpenTch;
    protected boolean field_4_fKeepFollow;
    protected boolean field_50_fTtpEmbedded;
    protected short field_51_dxcRight;
    protected short field_52_dxcLeft;
    protected short field_53_dxcLeft1;
    protected boolean field_54_fDyaBeforeAuto;
    protected boolean field_55_fDyaAfterAuto;
    protected int field_56_dxaRight;
    protected int field_57_dxaLeft;
    protected int field_58_dxaLeft1;
    protected byte field_59_jc;
    protected boolean field_5_fPageBreakBefore;
    protected boolean field_60_fNoAllowOverlap;
    protected byte field_6_brcl;
    protected boolean field_70_fPropRMark;
    protected int field_71_ibstPropRMark;
    protected int field_73_itbdMac;
    protected byte field_7_brcp;
    protected byte field_8_ilvl;
    protected int field_9_ilfo;
    private static BitField fVertical = new BitField(1);
    private static BitField fBackward = new BitField(2);
    private static BitField fRotateFont = new BitField(4);
    protected DropCapSpecifier field_28_dcs = new DropCapSpecifier();
    protected boolean field_32_fWidowControl = true;
    protected byte field_41_lvl = 9;
    protected BorderCode field_61_brcTop = new BorderCode();
    protected BorderCode field_62_brcLeft = new BorderCode();
    protected BorderCode field_63_brcBottom = new BorderCode();
    protected BorderCode field_64_brcRight = new BorderCode();
    protected BorderCode field_65_brcBetween = new BorderCode();
    protected BorderCode field_66_brcBar = new BorderCode();
    protected ShadingDescriptor field_67_shd = new ShadingDescriptor();
    protected byte[] field_68_anld = new byte[0];
    protected byte[] field_69_phe = new byte[0];
    protected DateAndTime field_72_dttmPropRMark = new DateAndTime();
    protected int[] field_74_rgdxaTab = new int[0];
    protected byte[] field_75_rgtbd = new byte[0];
    protected byte[] field_76_numrm = new byte[0];
    protected byte[] field_77_ptap = new byte[0];

    public PAPAbstractType() {
        this.field_11_lspd = new LineSpacingDescriptor();
        this.field_11_lspd = new LineSpacingDescriptor();
    }

    public byte[] getAnld() {
        return this.field_68_anld;
    }

    public BorderCode getBrcBar() {
        return this.field_66_brcBar;
    }

    public BorderCode getBrcBetween() {
        return this.field_65_brcBetween;
    }

    public BorderCode getBrcBottom() {
        return this.field_63_brcBottom;
    }

    public BorderCode getBrcLeft() {
        return this.field_62_brcLeft;
    }

    public BorderCode getBrcRight() {
        return this.field_64_brcRight;
    }

    public BorderCode getBrcTop() {
        return this.field_61_brcTop;
    }

    public byte getBrcl() {
        return this.field_6_brcl;
    }

    public byte getBrcp() {
        return this.field_7_brcp;
    }

    public DropCapSpecifier getDcs() {
        return this.field_28_dcs;
    }

    public DateAndTime getDttmPropRMark() {
        return this.field_72_dttmPropRMark;
    }

    public int getDxaAbs() {
        return this.field_17_dxaAbs;
    }

    public int getDxaFromText() {
        return this.field_30_dxaFromText;
    }

    public int getDxaLeft() {
        return this.field_57_dxaLeft;
    }

    public int getDxaLeft1() {
        return this.field_58_dxaLeft1;
    }

    public int getDxaRight() {
        return this.field_56_dxaRight;
    }

    public int getDxaWidth() {
        return this.field_19_dxaWidth;
    }

    public short getDxcLeft() {
        return this.field_52_dxcLeft;
    }

    public short getDxcLeft1() {
        return this.field_53_dxcLeft1;
    }

    public short getDxcRight() {
        return this.field_51_dxcRight;
    }

    public int getDyaAbs() {
        return this.field_18_dyaAbs;
    }

    public int getDyaAfter() {
        return this.field_13_dyaAfter;
    }

    public int getDyaBefore() {
        return this.field_12_dyaBefore;
    }

    public int getDyaFromText() {
        return this.field_29_dyaFromText;
    }

    public int getDyaHeight() {
        return this.field_26_dyaHeight;
    }

    public boolean getFAdjustRight() {
        return this.field_46_fAdjustRight;
    }

    public boolean getFAutoSpaceDE() {
        return this.field_37_fAutoSpaceDE;
    }

    public boolean getFAutoSpaceDN() {
        return this.field_38_fAutoSpaceDN;
    }

    public boolean getFBiDi() {
        return this.field_42_fBiDi;
    }

    public boolean getFBrLnAbove() {
        return this.field_20_fBrLnAbove;
    }

    public boolean getFBrLnBelow() {
        return this.field_21_fBrLnBelow;
    }

    public boolean getFCrLf() {
        return this.field_44_fCrLf;
    }

    public boolean getFDyaAfterAuto() {
        return this.field_55_fDyaAfterAuto;
    }

    public boolean getFDyaBeforeAuto() {
        return this.field_54_fDyaBeforeAuto;
    }

    public boolean getFInTable() {
        return this.field_14_fInTable;
    }

    public boolean getFInnerTableCell() {
        return this.field_48_fInnerTableCell;
    }

    public boolean getFKeep() {
        return this.field_3_fKeep;
    }

    public boolean getFKeepFollow() {
        return this.field_4_fKeepFollow;
    }

    public boolean getFKinsoku() {
        return this.field_33_fKinsoku;
    }

    public boolean getFLocked() {
        return this.field_31_fLocked;
    }

    public boolean getFMinHeight() {
        return this.field_27_fMinHeight;
    }

    public boolean getFNoAllowOverlap() {
        return this.field_60_fNoAllowOverlap;
    }

    public boolean getFNoAutoHyph() {
        return this.field_25_fNoAutoHyph;
    }

    public boolean getFNoLnn() {
        return this.field_10_fNoLnn;
    }

    public boolean getFNumRMIns() {
        return this.field_43_fNumRMIns;
    }

    public boolean getFOpenTch() {
        return this.field_49_fOpenTch;
    }

    public boolean getFOverflowPunct() {
        return this.field_35_fOverflowPunct;
    }

    public boolean getFPageBreakBefore() {
        return this.field_5_fPageBreakBefore;
    }

    public boolean getFPropRMark() {
        return this.field_70_fPropRMark;
    }

    public boolean getFSideBySide() {
        return this.field_2_fSideBySide;
    }

    public boolean getFTopLinePunct() {
        return this.field_36_fTopLinePunct;
    }

    public boolean getFTtp() {
        return this.field_16_fTtp;
    }

    public boolean getFTtpEmbedded() {
        return this.field_50_fTtpEmbedded;
    }

    public boolean getFUsePgsuSettings() {
        return this.field_45_fUsePgsuSettings;
    }

    public boolean getFWidowControl() {
        return this.field_32_fWidowControl;
    }

    public boolean getFWordWrap() {
        return this.field_34_fWordWrap;
    }

    public boolean getFinTableW97() {
        return this.field_15_finTableW97;
    }

    public short getFontAlign() {
        return this.field_40_fontAlign;
    }

    public int getIbstPropRMark() {
        return this.field_71_ibstPropRMark;
    }

    public int getIlfo() {
        return this.field_9_ilfo;
    }

    public byte getIlvl() {
        return this.field_8_ilvl;
    }

    public int getIstd() {
        return this.field_1_istd;
    }

    public int getItap() {
        return this.field_47_itap;
    }

    public int getItbdMac() {
        return this.field_73_itbdMac;
    }

    public byte getJc() {
        return this.field_59_jc;
    }

    public LineSpacingDescriptor getLspd() {
        return this.field_11_lspd;
    }

    public byte getLvl() {
        return this.field_41_lvl;
    }

    public byte[] getNumrm() {
        return this.field_76_numrm;
    }

    public byte getPcHorz() {
        return this.field_23_pcHorz;
    }

    public byte getPcVert() {
        return this.field_22_pcVert;
    }

    public byte[] getPhe() {
        return this.field_69_phe;
    }

    public byte[] getPtap() {
        return this.field_77_ptap;
    }

    public int[] getRgdxaTab() {
        return this.field_74_rgdxaTab;
    }

    public byte[] getRgtbd() {
        return this.field_75_rgtbd;
    }

    public ShadingDescriptor getShd() {
        return this.field_67_shd;
    }

    public int getWAlignFont() {
        return this.field_39_wAlignFont;
    }

    public byte getWr() {
        return this.field_24_wr;
    }

    public boolean isFBackward() {
        return fBackward.isSet(this.field_40_fontAlign);
    }

    public boolean isFRotateFont() {
        return fRotateFont.isSet(this.field_40_fontAlign);
    }

    public boolean isFVertical() {
        return fVertical.isSet(this.field_40_fontAlign);
    }

    public void setAnld(byte[] bArr) {
        this.field_68_anld = bArr;
    }

    public void setBrcBar(BorderCode borderCode) {
        this.field_66_brcBar = borderCode;
    }

    public void setBrcBetween(BorderCode borderCode) {
        this.field_65_brcBetween = borderCode;
    }

    public void setBrcBottom(BorderCode borderCode) {
        this.field_63_brcBottom = borderCode;
    }

    public void setBrcLeft(BorderCode borderCode) {
        this.field_62_brcLeft = borderCode;
    }

    public void setBrcRight(BorderCode borderCode) {
        this.field_64_brcRight = borderCode;
    }

    public void setBrcTop(BorderCode borderCode) {
        this.field_61_brcTop = borderCode;
    }

    public void setBrcl(byte b10) {
        this.field_6_brcl = b10;
    }

    public void setBrcp(byte b10) {
        this.field_7_brcp = b10;
    }

    public void setDcs(DropCapSpecifier dropCapSpecifier) {
        this.field_28_dcs = dropCapSpecifier;
    }

    public void setDttmPropRMark(DateAndTime dateAndTime) {
        this.field_72_dttmPropRMark = dateAndTime;
    }

    public void setDxaAbs(int i10) {
        this.field_17_dxaAbs = i10;
    }

    public void setDxaFromText(int i10) {
        this.field_30_dxaFromText = i10;
    }

    public void setDxaLeft(int i10) {
        this.field_57_dxaLeft = i10;
    }

    public void setDxaLeft1(int i10) {
        this.field_58_dxaLeft1 = i10;
    }

    public void setDxaRight(int i10) {
        this.field_56_dxaRight = i10;
    }

    public void setDxaWidth(int i10) {
        this.field_19_dxaWidth = i10;
    }

    public void setDxcLeft(short s4) {
        this.field_52_dxcLeft = s4;
    }

    public void setDxcLeft1(short s4) {
        this.field_53_dxcLeft1 = s4;
    }

    public void setDxcRight(short s4) {
        this.field_51_dxcRight = s4;
    }

    public void setDyaAbs(int i10) {
        this.field_18_dyaAbs = i10;
    }

    public void setDyaAfter(int i10) {
        this.field_13_dyaAfter = i10;
    }

    public void setDyaBefore(int i10) {
        this.field_12_dyaBefore = i10;
    }

    public void setDyaFromText(int i10) {
        this.field_29_dyaFromText = i10;
    }

    public void setDyaHeight(int i10) {
        this.field_26_dyaHeight = i10;
    }

    public void setFAdjustRight(boolean z10) {
        this.field_46_fAdjustRight = z10;
    }

    public void setFAutoSpaceDE(boolean z10) {
        this.field_37_fAutoSpaceDE = z10;
    }

    public void setFAutoSpaceDN(boolean z10) {
        this.field_38_fAutoSpaceDN = z10;
    }

    public void setFBackward(boolean z10) {
        this.field_40_fontAlign = (short) fBackward.setBoolean(this.field_40_fontAlign, z10);
    }

    public void setFBiDi(boolean z10) {
        this.field_42_fBiDi = z10;
    }

    public void setFBrLnAbove(boolean z10) {
        this.field_20_fBrLnAbove = z10;
    }

    public void setFBrLnBelow(boolean z10) {
        this.field_21_fBrLnBelow = z10;
    }

    public void setFCrLf(boolean z10) {
        this.field_44_fCrLf = z10;
    }

    public void setFDyaAfterAuto(boolean z10) {
        this.field_55_fDyaAfterAuto = z10;
    }

    public void setFDyaBeforeAuto(boolean z10) {
        this.field_54_fDyaBeforeAuto = z10;
    }

    public void setFInTable(boolean z10) {
        this.field_14_fInTable = z10;
    }

    public void setFInnerTableCell(boolean z10) {
        this.field_48_fInnerTableCell = z10;
    }

    public void setFKeep(boolean z10) {
        this.field_3_fKeep = z10;
    }

    public void setFKeepFollow(boolean z10) {
        this.field_4_fKeepFollow = z10;
    }

    public void setFKinsoku(boolean z10) {
        this.field_33_fKinsoku = z10;
    }

    public void setFLocked(boolean z10) {
        this.field_31_fLocked = z10;
    }

    public void setFMinHeight(boolean z10) {
        this.field_27_fMinHeight = z10;
    }

    public void setFNoAllowOverlap(boolean z10) {
        this.field_60_fNoAllowOverlap = z10;
    }

    public void setFNoAutoHyph(boolean z10) {
        this.field_25_fNoAutoHyph = z10;
    }

    public void setFNoLnn(boolean z10) {
        this.field_10_fNoLnn = z10;
    }

    public void setFNumRMIns(boolean z10) {
        this.field_43_fNumRMIns = z10;
    }

    public void setFOpenTch(boolean z10) {
        this.field_49_fOpenTch = z10;
    }

    public void setFOverflowPunct(boolean z10) {
        this.field_35_fOverflowPunct = z10;
    }

    public void setFPageBreakBefore(boolean z10) {
        this.field_5_fPageBreakBefore = z10;
    }

    public void setFPropRMark(boolean z10) {
        this.field_70_fPropRMark = z10;
    }

    public void setFRotateFont(boolean z10) {
        this.field_40_fontAlign = (short) fRotateFont.setBoolean(this.field_40_fontAlign, z10);
    }

    public void setFSideBySide(boolean z10) {
        this.field_2_fSideBySide = z10;
    }

    public void setFTopLinePunct(boolean z10) {
        this.field_36_fTopLinePunct = z10;
    }

    public void setFTtp(boolean z10) {
        this.field_16_fTtp = z10;
    }

    public void setFTtpEmbedded(boolean z10) {
        this.field_50_fTtpEmbedded = z10;
    }

    public void setFUsePgsuSettings(boolean z10) {
        this.field_45_fUsePgsuSettings = z10;
    }

    public void setFVertical(boolean z10) {
        this.field_40_fontAlign = (short) fVertical.setBoolean(this.field_40_fontAlign, z10);
    }

    public void setFWidowControl(boolean z10) {
        this.field_32_fWidowControl = z10;
    }

    public void setFWordWrap(boolean z10) {
        this.field_34_fWordWrap = z10;
    }

    public void setFinTableW97(boolean z10) {
        this.field_15_finTableW97 = z10;
    }

    public void setFontAlign(short s4) {
        this.field_40_fontAlign = s4;
    }

    public void setIbstPropRMark(int i10) {
        this.field_71_ibstPropRMark = i10;
    }

    public void setIlfo(int i10) {
        this.field_9_ilfo = i10;
    }

    public void setIlvl(byte b10) {
        this.field_8_ilvl = b10;
    }

    public void setIstd(int i10) {
        this.field_1_istd = i10;
    }

    public void setItap(int i10) {
        this.field_47_itap = i10;
    }

    public void setItbdMac(int i10) {
        this.field_73_itbdMac = i10;
    }

    public void setJc(byte b10) {
        this.field_59_jc = b10;
    }

    public void setLspd(LineSpacingDescriptor lineSpacingDescriptor) {
        this.field_11_lspd = lineSpacingDescriptor;
    }

    public void setLvl(byte b10) {
        this.field_41_lvl = b10;
    }

    public void setNumrm(byte[] bArr) {
        this.field_76_numrm = bArr;
    }

    public void setPcHorz(byte b10) {
        this.field_23_pcHorz = b10;
    }

    public void setPcVert(byte b10) {
        this.field_22_pcVert = b10;
    }

    public void setPhe(byte[] bArr) {
        this.field_69_phe = bArr;
    }

    public void setPtap(byte[] bArr) {
        this.field_77_ptap = bArr;
    }

    public void setRgdxaTab(int[] iArr) {
        this.field_74_rgdxaTab = iArr;
    }

    public void setRgtbd(byte[] bArr) {
        this.field_75_rgtbd = bArr;
    }

    public void setShd(ShadingDescriptor shadingDescriptor) {
        this.field_67_shd = shadingDescriptor;
    }

    public void setWAlignFont(int i10) {
        this.field_39_wAlignFont = i10;
    }

    public void setWr(byte b10) {
        this.field_24_wr = b10;
    }

    public String toString() {
        return "[PAP]\n    .istd                 =  (" + getIstd() + " )\n    .fSideBySide          =  (" + getFSideBySide() + " )\n    .fKeep                =  (" + getFKeep() + " )\n    .fKeepFollow          =  (" + getFKeepFollow() + " )\n    .fPageBreakBefore     =  (" + getFPageBreakBefore() + " )\n    .brcl                 =  (" + ((int) getBrcl()) + " )\n    .brcp                 =  (" + ((int) getBrcp()) + " )\n    .ilvl                 =  (" + ((int) getIlvl()) + " )\n    .ilfo                 =  (" + getIlfo() + " )\n    .fNoLnn               =  (" + getFNoLnn() + " )\n    .lspd                 =  (" + getLspd() + " )\n    .dyaBefore            =  (" + getDyaBefore() + " )\n    .dyaAfter             =  (" + getDyaAfter() + " )\n    .fInTable             =  (" + getFInTable() + " )\n    .finTableW97          =  (" + getFinTableW97() + " )\n    .fTtp                 =  (" + getFTtp() + " )\n    .dxaAbs               =  (" + getDxaAbs() + " )\n    .dyaAbs               =  (" + getDyaAbs() + " )\n    .dxaWidth             =  (" + getDxaWidth() + " )\n    .fBrLnAbove           =  (" + getFBrLnAbove() + " )\n    .fBrLnBelow           =  (" + getFBrLnBelow() + " )\n    .pcVert               =  (" + ((int) getPcVert()) + " )\n    .pcHorz               =  (" + ((int) getPcHorz()) + " )\n    .wr                   =  (" + ((int) getWr()) + " )\n    .fNoAutoHyph          =  (" + getFNoAutoHyph() + " )\n    .dyaHeight            =  (" + getDyaHeight() + " )\n    .fMinHeight           =  (" + getFMinHeight() + " )\n    .dcs                  =  (" + getDcs() + " )\n    .dyaFromText          =  (" + getDyaFromText() + " )\n    .dxaFromText          =  (" + getDxaFromText() + " )\n    .fLocked              =  (" + getFLocked() + " )\n    .fWidowControl        =  (" + getFWidowControl() + " )\n    .fKinsoku             =  (" + getFKinsoku() + " )\n    .fWordWrap            =  (" + getFWordWrap() + " )\n    .fOverflowPunct       =  (" + getFOverflowPunct() + " )\n    .fTopLinePunct        =  (" + getFTopLinePunct() + " )\n    .fAutoSpaceDE         =  (" + getFAutoSpaceDE() + " )\n    .fAutoSpaceDN         =  (" + getFAutoSpaceDN() + " )\n    .wAlignFont           =  (" + getWAlignFont() + " )\n    .fontAlign            =  (" + ((int) getFontAlign()) + " )\n         .fVertical                = " + isFVertical() + "\n         .fBackward                = " + isFBackward() + "\n         .fRotateFont              = " + isFRotateFont() + "\n    .lvl                  =  (" + ((int) getLvl()) + " )\n    .fBiDi                =  (" + getFBiDi() + " )\n    .fNumRMIns            =  (" + getFNumRMIns() + " )\n    .fCrLf                =  (" + getFCrLf() + " )\n    .fUsePgsuSettings     =  (" + getFUsePgsuSettings() + " )\n    .fAdjustRight         =  (" + getFAdjustRight() + " )\n    .itap                 =  (" + getItap() + " )\n    .fInnerTableCell      =  (" + getFInnerTableCell() + " )\n    .fOpenTch             =  (" + getFOpenTch() + " )\n    .fTtpEmbedded         =  (" + getFTtpEmbedded() + " )\n    .dxcRight             =  (" + ((int) getDxcRight()) + " )\n    .dxcLeft              =  (" + ((int) getDxcLeft()) + " )\n    .dxcLeft1             =  (" + ((int) getDxcLeft1()) + " )\n    .fDyaBeforeAuto       =  (" + getFDyaBeforeAuto() + " )\n    .fDyaAfterAuto        =  (" + getFDyaAfterAuto() + " )\n    .dxaRight             =  (" + getDxaRight() + " )\n    .dxaLeft              =  (" + getDxaLeft() + " )\n    .dxaLeft1             =  (" + getDxaLeft1() + " )\n    .jc                   =  (" + ((int) getJc()) + " )\n    .fNoAllowOverlap      =  (" + getFNoAllowOverlap() + " )\n    .brcTop               =  (" + getBrcTop() + " )\n    .brcLeft              =  (" + getBrcLeft() + " )\n    .brcBottom            =  (" + getBrcBottom() + " )\n    .brcRight             =  (" + getBrcRight() + " )\n    .brcBetween           =  (" + getBrcBetween() + " )\n    .brcBar               =  (" + getBrcBar() + " )\n    .shd                  =  (" + getShd() + " )\n    .anld                 =  (" + getAnld() + " )\n    .phe                  =  (" + getPhe() + " )\n    .fPropRMark           =  (" + getFPropRMark() + " )\n    .ibstPropRMark        =  (" + getIbstPropRMark() + " )\n    .dttmPropRMark        =  (" + getDttmPropRMark() + " )\n    .itbdMac              =  (" + getItbdMac() + " )\n    .rgdxaTab             =  (" + getRgdxaTab() + " )\n    .rgtbd                =  (" + getRgtbd() + " )\n    .numrm                =  (" + getNumrm() + " )\n    .ptap                 =  (" + getPtap() + " )\n[/PAP]\n";
    }
}
