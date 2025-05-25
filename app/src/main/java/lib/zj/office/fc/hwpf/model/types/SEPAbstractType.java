package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.DateAndTime;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class SEPAbstractType {
    public static final byte BKC_EVEN_PAGE = 3;
    public static final byte BKC_NEW_COLUMN = 1;
    public static final byte BKC_NEW_PAGE = 2;
    public static final byte BKC_NO_BREAK = 0;
    public static final byte BKC_ODD_PAGE = 4;
    public static final boolean DMORIENTPAGE_LANDSCAPE = false;
    public static final boolean DMORIENTPAGE_PORTRAIT = true;
    public static final byte NFCPGN_ARABIC = 0;
    public static final byte NFCPGN_LETTER_LOWER_CASE = 4;
    public static final byte NFCPGN_LETTER_UPPER_CASE = 3;
    public static final byte NFCPGN_ROMAN_LOWER_CASE = 2;
    public static final byte NFCPGN_ROMAN_UPPER_CASE = 1;
    protected byte field_10_grpfIhdt;
    protected int field_11_nLnnMod;
    protected int field_12_dxaLnn;
    protected boolean field_15_fLBetween;
    protected byte field_16_vjc;
    protected int field_17_dmBinFirst;
    protected int field_18_dmBinOther;
    protected int field_19_dmPaperReq;
    protected BorderCode field_20_brcTop;
    protected BorderCode field_21_brcLeft;
    protected BorderCode field_22_brcBottom;
    protected BorderCode field_23_brcRight;
    protected boolean field_24_fPropMark;
    protected int field_25_ibstPropRMark;
    protected DateAndTime field_26_dttmPropRMark;
    protected int field_27_dxtCharSpace;
    protected int field_28_dyaLinePitch;
    protected int field_29_clm;
    protected boolean field_2_fTitlePage;
    protected int field_30_unused2;
    protected byte field_32_iHeadingPgn;
    protected int field_34_lnnMin;
    protected int field_35_wTextFlow;
    protected short field_36_unused3;
    protected int field_37_pgbProp;
    protected short field_38_unused4;
    protected boolean field_3_fAutoPgn;
    protected int field_47_dzaGutter;
    protected byte field_4_nfcPgn;
    protected int field_50_ccolM1;
    protected byte field_52_unused5;
    protected int[] field_54_rgdxaColumn;
    protected int field_55_dxaColumnWidth;
    protected byte field_56_dmOrientFirst;
    protected byte field_57_fLayout;
    protected short field_58_unused6;
    protected byte[] field_59_olstAnm;
    protected boolean field_5_fUnlocked;
    protected byte field_6_cnsPgn;
    protected boolean field_7_fPgnRestart;
    protected byte field_9_lnc;
    protected byte field_1_bkc = 2;
    protected boolean field_8_fEndNote = true;
    protected int field_13_dxaPgn = 720;
    protected int field_14_dyaPgn = 720;
    protected boolean field_31_dmOrientPage = true;
    protected int field_33_pgnStart = 1;
    protected int field_39_xaPage = 12240;
    protected int field_40_yaPage = 15840;
    protected int field_41_xaPageNUp = 12240;
    protected int field_42_yaPageNUp = 15840;
    protected int field_43_dxaLeft = 1800;
    protected int field_44_dxaRight = 1800;
    protected int field_45_dyaTop = 1440;
    protected int field_46_dyaBottom = 1440;
    protected int field_48_dyaHdrTop = 720;
    protected int field_49_dyaHdrBottom = 720;
    protected boolean field_51_fEvenlySpaced = true;
    protected int field_53_dxaColumns = 720;

    public byte getBkc() {
        return this.field_1_bkc;
    }

    public BorderCode getBrcBottom() {
        return this.field_22_brcBottom;
    }

    public BorderCode getBrcLeft() {
        return this.field_21_brcLeft;
    }

    public BorderCode getBrcRight() {
        return this.field_23_brcRight;
    }

    public BorderCode getBrcTop() {
        return this.field_20_brcTop;
    }

    public int getCcolM1() {
        return this.field_50_ccolM1;
    }

    public int getClm() {
        return this.field_29_clm;
    }

    public byte getCnsPgn() {
        return this.field_6_cnsPgn;
    }

    public int getDmBinFirst() {
        return this.field_17_dmBinFirst;
    }

    public int getDmBinOther() {
        return this.field_18_dmBinOther;
    }

    public byte getDmOrientFirst() {
        return this.field_56_dmOrientFirst;
    }

    public boolean getDmOrientPage() {
        return this.field_31_dmOrientPage;
    }

    public int getDmPaperReq() {
        return this.field_19_dmPaperReq;
    }

    public DateAndTime getDttmPropRMark() {
        return this.field_26_dttmPropRMark;
    }

    public int getDxaColumnWidth() {
        return this.field_55_dxaColumnWidth;
    }

    public int getDxaColumns() {
        return this.field_53_dxaColumns;
    }

    public int getDxaLeft() {
        return this.field_43_dxaLeft;
    }

    public int getDxaLnn() {
        return this.field_12_dxaLnn;
    }

    public int getDxaPgn() {
        return this.field_13_dxaPgn;
    }

    public int getDxaRight() {
        return this.field_44_dxaRight;
    }

    public int getDxtCharSpace() {
        return this.field_27_dxtCharSpace;
    }

    public int getDyaBottom() {
        return this.field_46_dyaBottom;
    }

    public int getDyaHdrBottom() {
        return this.field_49_dyaHdrBottom;
    }

    public int getDyaHdrTop() {
        return this.field_48_dyaHdrTop;
    }

    public int getDyaLinePitch() {
        return this.field_28_dyaLinePitch;
    }

    public int getDyaPgn() {
        return this.field_14_dyaPgn;
    }

    public int getDyaTop() {
        return this.field_45_dyaTop;
    }

    public int getDzaGutter() {
        return this.field_47_dzaGutter;
    }

    public boolean getFAutoPgn() {
        return this.field_3_fAutoPgn;
    }

    public boolean getFEndNote() {
        return this.field_8_fEndNote;
    }

    public boolean getFEvenlySpaced() {
        return this.field_51_fEvenlySpaced;
    }

    public boolean getFLBetween() {
        return this.field_15_fLBetween;
    }

    public byte getFLayout() {
        return this.field_57_fLayout;
    }

    public boolean getFPgnRestart() {
        return this.field_7_fPgnRestart;
    }

    public boolean getFPropMark() {
        return this.field_24_fPropMark;
    }

    public boolean getFTitlePage() {
        return this.field_2_fTitlePage;
    }

    public boolean getFUnlocked() {
        return this.field_5_fUnlocked;
    }

    public byte getGrpfIhdt() {
        return this.field_10_grpfIhdt;
    }

    public byte getIHeadingPgn() {
        return this.field_32_iHeadingPgn;
    }

    public int getIbstPropRMark() {
        return this.field_25_ibstPropRMark;
    }

    public byte getLnc() {
        return this.field_9_lnc;
    }

    public int getLnnMin() {
        return this.field_34_lnnMin;
    }

    public int getNLnnMod() {
        return this.field_11_nLnnMod;
    }

    public byte getNfcPgn() {
        return this.field_4_nfcPgn;
    }

    public byte[] getOlstAnm() {
        return this.field_59_olstAnm;
    }

    public int getPgbProp() {
        return this.field_37_pgbProp;
    }

    public int getPgnStart() {
        return this.field_33_pgnStart;
    }

    public int[] getRgdxaColumn() {
        return this.field_54_rgdxaColumn;
    }

    public int getUnused2() {
        return this.field_30_unused2;
    }

    public short getUnused3() {
        return this.field_36_unused3;
    }

    public short getUnused4() {
        return this.field_38_unused4;
    }

    public byte getUnused5() {
        return this.field_52_unused5;
    }

    public short getUnused6() {
        return this.field_58_unused6;
    }

    public byte getVjc() {
        return this.field_16_vjc;
    }

    public int getWTextFlow() {
        return this.field_35_wTextFlow;
    }

    public int getXaPage() {
        return this.field_39_xaPage;
    }

    public int getXaPageNUp() {
        return this.field_41_xaPageNUp;
    }

    public int getYaPage() {
        return this.field_40_yaPage;
    }

    public int getYaPageNUp() {
        return this.field_42_yaPageNUp;
    }

    public void setBkc(byte b10) {
        this.field_1_bkc = b10;
    }

    public void setBrcBottom(BorderCode borderCode) {
        this.field_22_brcBottom = borderCode;
    }

    public void setBrcLeft(BorderCode borderCode) {
        this.field_21_brcLeft = borderCode;
    }

    public void setBrcRight(BorderCode borderCode) {
        this.field_23_brcRight = borderCode;
    }

    public void setBrcTop(BorderCode borderCode) {
        this.field_20_brcTop = borderCode;
    }

    public void setCcolM1(int i10) {
        this.field_50_ccolM1 = i10;
    }

    public void setClm(int i10) {
        this.field_29_clm = i10;
    }

    public void setCnsPgn(byte b10) {
        this.field_6_cnsPgn = b10;
    }

    public void setDmBinFirst(int i10) {
        this.field_17_dmBinFirst = i10;
    }

    public void setDmBinOther(int i10) {
        this.field_18_dmBinOther = i10;
    }

    public void setDmOrientFirst(byte b10) {
        this.field_56_dmOrientFirst = b10;
    }

    public void setDmOrientPage(boolean z10) {
        this.field_31_dmOrientPage = z10;
    }

    public void setDmPaperReq(int i10) {
        this.field_19_dmPaperReq = i10;
    }

    public void setDttmPropRMark(DateAndTime dateAndTime) {
        this.field_26_dttmPropRMark = dateAndTime;
    }

    public void setDxaColumnWidth(int i10) {
        this.field_55_dxaColumnWidth = i10;
    }

    public void setDxaColumns(int i10) {
        this.field_53_dxaColumns = i10;
    }

    public void setDxaLeft(int i10) {
        this.field_43_dxaLeft = i10;
    }

    public void setDxaLnn(int i10) {
        this.field_12_dxaLnn = i10;
    }

    public void setDxaPgn(int i10) {
        this.field_13_dxaPgn = i10;
    }

    public void setDxaRight(int i10) {
        this.field_44_dxaRight = i10;
    }

    public void setDxtCharSpace(int i10) {
        this.field_27_dxtCharSpace = i10;
    }

    public void setDyaBottom(int i10) {
        this.field_46_dyaBottom = i10;
    }

    public void setDyaHdrBottom(int i10) {
        this.field_49_dyaHdrBottom = i10;
    }

    public void setDyaHdrTop(int i10) {
        this.field_48_dyaHdrTop = i10;
    }

    public void setDyaLinePitch(int i10) {
        this.field_28_dyaLinePitch = i10;
    }

    public void setDyaPgn(int i10) {
        this.field_14_dyaPgn = i10;
    }

    public void setDyaTop(int i10) {
        this.field_45_dyaTop = i10;
    }

    public void setDzaGutter(int i10) {
        this.field_47_dzaGutter = i10;
    }

    public void setFAutoPgn(boolean z10) {
        this.field_3_fAutoPgn = z10;
    }

    public void setFEndNote(boolean z10) {
        this.field_8_fEndNote = z10;
    }

    public void setFEvenlySpaced(boolean z10) {
        this.field_51_fEvenlySpaced = z10;
    }

    public void setFLBetween(boolean z10) {
        this.field_15_fLBetween = z10;
    }

    public void setFLayout(byte b10) {
        this.field_57_fLayout = b10;
    }

    public void setFPgnRestart(boolean z10) {
        this.field_7_fPgnRestart = z10;
    }

    public void setFPropMark(boolean z10) {
        this.field_24_fPropMark = z10;
    }

    public void setFTitlePage(boolean z10) {
        this.field_2_fTitlePage = z10;
    }

    public void setFUnlocked(boolean z10) {
        this.field_5_fUnlocked = z10;
    }

    public void setGrpfIhdt(byte b10) {
        this.field_10_grpfIhdt = b10;
    }

    public void setIHeadingPgn(byte b10) {
        this.field_32_iHeadingPgn = b10;
    }

    public void setIbstPropRMark(int i10) {
        this.field_25_ibstPropRMark = i10;
    }

    public void setLnc(byte b10) {
        this.field_9_lnc = b10;
    }

    public void setLnnMin(int i10) {
        this.field_34_lnnMin = i10;
    }

    public void setNLnnMod(int i10) {
        this.field_11_nLnnMod = i10;
    }

    public void setNfcPgn(byte b10) {
        this.field_4_nfcPgn = b10;
    }

    public void setOlstAnm(byte[] bArr) {
        this.field_59_olstAnm = bArr;
    }

    public void setPgbProp(int i10) {
        this.field_37_pgbProp = i10;
    }

    public void setPgnStart(int i10) {
        this.field_33_pgnStart = i10;
    }

    public void setRgdxaColumn(int[] iArr) {
        this.field_54_rgdxaColumn = iArr;
    }

    public void setUnused2(int i10) {
        this.field_30_unused2 = i10;
    }

    public void setUnused3(short s4) {
        this.field_36_unused3 = s4;
    }

    public void setUnused4(short s4) {
        this.field_38_unused4 = s4;
    }

    public void setUnused5(byte b10) {
        this.field_52_unused5 = b10;
    }

    public void setUnused6(short s4) {
        this.field_58_unused6 = s4;
    }

    public void setVjc(byte b10) {
        this.field_16_vjc = b10;
    }

    public void setWTextFlow(int i10) {
        this.field_35_wTextFlow = i10;
    }

    public void setXaPage(int i10) {
        this.field_39_xaPage = i10;
    }

    public void setXaPageNUp(int i10) {
        this.field_41_xaPageNUp = i10;
    }

    public void setYaPage(int i10) {
        this.field_40_yaPage = i10;
    }

    public void setYaPageNUp(int i10) {
        this.field_42_yaPageNUp = i10;
    }

    public String toString() {
        return "[SEP]\n    .bkc                  =  (" + ((int) getBkc()) + " )\n    .fTitlePage           =  (" + getFTitlePage() + " )\n    .fAutoPgn             =  (" + getFAutoPgn() + " )\n    .nfcPgn               =  (" + ((int) getNfcPgn()) + " )\n    .fUnlocked            =  (" + getFUnlocked() + " )\n    .cnsPgn               =  (" + ((int) getCnsPgn()) + " )\n    .fPgnRestart          =  (" + getFPgnRestart() + " )\n    .fEndNote             =  (" + getFEndNote() + " )\n    .lnc                  =  (" + ((int) getLnc()) + " )\n    .grpfIhdt             =  (" + ((int) getGrpfIhdt()) + " )\n    .nLnnMod              =  (" + getNLnnMod() + " )\n    .dxaLnn               =  (" + getDxaLnn() + " )\n    .dxaPgn               =  (" + getDxaPgn() + " )\n    .dyaPgn               =  (" + getDyaPgn() + " )\n    .fLBetween            =  (" + getFLBetween() + " )\n    .vjc                  =  (" + ((int) getVjc()) + " )\n    .dmBinFirst           =  (" + getDmBinFirst() + " )\n    .dmBinOther           =  (" + getDmBinOther() + " )\n    .dmPaperReq           =  (" + getDmPaperReq() + " )\n    .brcTop               =  (" + getBrcTop() + " )\n    .brcLeft              =  (" + getBrcLeft() + " )\n    .brcBottom            =  (" + getBrcBottom() + " )\n    .brcRight             =  (" + getBrcRight() + " )\n    .fPropMark            =  (" + getFPropMark() + " )\n    .ibstPropRMark        =  (" + getIbstPropRMark() + " )\n    .dttmPropRMark        =  (" + getDttmPropRMark() + " )\n    .dxtCharSpace         =  (" + getDxtCharSpace() + " )\n    .dyaLinePitch         =  (" + getDyaLinePitch() + " )\n    .clm                  =  (" + getClm() + " )\n    .unused2              =  (" + getUnused2() + " )\n    .dmOrientPage         =  (" + getDmOrientPage() + " )\n    .iHeadingPgn          =  (" + ((int) getIHeadingPgn()) + " )\n    .pgnStart             =  (" + getPgnStart() + " )\n    .lnnMin               =  (" + getLnnMin() + " )\n    .wTextFlow            =  (" + getWTextFlow() + " )\n    .unused3              =  (" + ((int) getUnused3()) + " )\n    .pgbProp              =  (" + getPgbProp() + " )\n    .unused4              =  (" + ((int) getUnused4()) + " )\n    .xaPage               =  (" + getXaPage() + " )\n    .yaPage               =  (" + getYaPage() + " )\n    .xaPageNUp            =  (" + getXaPageNUp() + " )\n    .yaPageNUp            =  (" + getYaPageNUp() + " )\n    .dxaLeft              =  (" + getDxaLeft() + " )\n    .dxaRight             =  (" + getDxaRight() + " )\n    .dyaTop               =  (" + getDyaTop() + " )\n    .dyaBottom            =  (" + getDyaBottom() + " )\n    .dzaGutter            =  (" + getDzaGutter() + " )\n    .dyaHdrTop            =  (" + getDyaHdrTop() + " )\n    .dyaHdrBottom         =  (" + getDyaHdrBottom() + " )\n    .ccolM1               =  (" + getCcolM1() + " )\n    .fEvenlySpaced        =  (" + getFEvenlySpaced() + " )\n    .unused5              =  (" + ((int) getUnused5()) + " )\n    .dxaColumns           =  (" + getDxaColumns() + " )\n    .rgdxaColumn          =  (" + getRgdxaColumn() + " )\n    .dxaColumnWidth       =  (" + getDxaColumnWidth() + " )\n    .dmOrientFirst        =  (" + ((int) getDmOrientFirst()) + " )\n    .fLayout              =  (" + ((int) getFLayout()) + " )\n    .unused6              =  (" + ((int) getUnused6()) + " )\n    .olstAnm              =  (" + getOlstAnm() + " )\n[/SEP]\n";
    }
}
