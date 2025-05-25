package lib.zj.office.fc.hwpf.model.types;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.model.Colorref;
import lib.zj.office.fc.hwpf.model.Hyphenation;
import lib.zj.office.fc.hwpf.usermodel.BorderCode;
import lib.zj.office.fc.hwpf.usermodel.DateAndTime;
import lib.zj.office.fc.hwpf.usermodel.ShadingDescriptor;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public abstract class CHPAbstractType {
    protected static final byte ISS_NONE = 0;
    protected static final byte ISS_SUBSCRIPTED = 2;
    protected static final byte ISS_SUPERSCRIPTED = 1;
    protected static final byte KCD_CIRCLE = 3;
    protected static final byte KCD_COMMA = 2;
    protected static final byte KCD_DOT = 1;
    protected static final byte KCD_NON = 0;
    protected static final byte KCD_UNDER_DOT = 4;
    protected static final byte KUL_BY_WORD = 2;
    protected static final byte KUL_DASH = 7;
    protected static final byte KUL_DASHED_HEAVY = 23;
    protected static final byte KUL_DASH_LONG = 39;
    protected static final byte KUL_DASH_LONG_HEAVY = 55;
    protected static final byte KUL_DOT = 8;
    protected static final byte KUL_DOTTED = 4;
    protected static final byte KUL_DOTTED_HEAVY = 20;
    protected static final byte KUL_DOT_DASH = 9;
    protected static final byte KUL_DOT_DASH_HEAVY = 25;
    protected static final byte KUL_DOT_DOT_DASH = 10;
    protected static final byte KUL_DOT_DOT_DASH_HEAVY = 26;
    protected static final byte KUL_DOUBLE = 3;
    protected static final byte KUL_HIDDEN = 5;
    protected static final byte KUL_NONE = 0;
    protected static final byte KUL_SINGLE = 1;
    protected static final byte KUL_THICK = 6;
    protected static final byte KUL_WAVE = 11;
    protected static final byte KUL_WAVE_DOUBLE = 43;
    protected static final byte KUL_WAVE_HEAVY = 27;
    protected static final byte LBRCRJ_BOTH = 3;
    protected static final byte LBRCRJ_LEFT = 1;
    protected static final byte LBRCRJ_NONE = 0;
    protected static final byte LBRCRJ_RIGHT = 2;
    protected static final byte SFXTTEXT_BACKGROUND_BLINK = 2;
    protected static final byte SFXTTEXT_LAS_VEGAS_LIGHTS = 1;
    protected static final byte SFXTTEXT_MARCHING_ANTS = 4;
    protected static final byte SFXTTEXT_MARCHING_RED_ANTS = 5;
    protected static final byte SFXTTEXT_NO = 0;
    protected static final byte SFXTTEXT_SHIMMER = 6;
    protected static final byte SFXTTEXT_SPARKLE_TEXT = 3;
    protected int field_10_pctCharWidth;
    protected byte field_13_kcd;
    protected boolean field_14_fUndetermine;
    protected byte field_15_iss;
    protected boolean field_16_fSpecSymbol;
    protected byte field_17_idct;
    protected byte field_18_idctHint;
    protected byte field_19_kul;
    protected int field_1_grpfChp;
    protected int field_21_hpsKern;
    protected short field_22_hpsPos;
    protected int field_25_ibstRMark;
    protected byte field_26_sfxtText;
    protected boolean field_27_fDblBdr;
    protected boolean field_28_fBorderWS;
    protected short field_29_ufel;
    protected byte field_30_copt;
    protected int field_31_hpsAsci;
    protected int field_32_hpsFE;
    protected int field_33_hpsBi;
    protected int field_34_ftcSym;
    protected int field_35_xchSym;
    protected int field_37_fcObj;
    protected int field_38_lTagObj;
    protected int field_39_fcData;
    protected int field_3_ftcAscii;
    protected int field_41_ibstRMarkDel;
    protected int field_45_idslRMReason;
    protected int field_46_idslReasonDel;
    protected int field_47_cpg;
    protected short field_48_Highlight;
    protected short field_49_CharsetFlags;
    protected int field_4_ftcFE;
    protected short field_50_chse;
    protected boolean field_51_fPropRMark;
    protected int field_52_ibstPropRMark;
    protected boolean field_54_fConflictOrig;
    protected boolean field_55_fConflictOtherDel;
    protected int field_56_wConflict;
    protected int field_57_IbstConflict;
    protected boolean field_59_fDispFldRMark;
    protected int field_5_ftcOther;
    protected int field_60_ibstDispFldRMark;
    protected int field_63_fcObjp;
    protected byte field_64_lbrCRJ;
    protected boolean field_65_fSpecVanish;
    protected boolean field_66_fHasOldProps;
    protected boolean field_67_fSdtVanish;
    protected Colorref field_69_underlineColor;
    protected int field_6_ftcBi;
    protected int field_7_dxaSpace;
    protected byte field_9_ico;
    private static BitField fBold = new BitField(1);
    private static BitField fItalic = new BitField(2);
    private static BitField fRMarkDel = new BitField(4);
    private static BitField fOutline = new BitField(8);
    private static BitField fFldVanish = new BitField(16);
    private static BitField fSmallCaps = new BitField(32);
    private static BitField fCaps = new BitField(64);
    private static BitField fVanish = new BitField(128);
    private static BitField fRMark = new BitField(256);
    private static BitField fSpec = new BitField(512);
    private static BitField fStrike = new BitField(1024);
    private static BitField fObj = new BitField(2048);
    private static BitField fShadow = new BitField(4096);
    private static BitField fLowerCase = new BitField(8192);
    private static BitField fData = new BitField(16384);
    private static BitField fOle2 = new BitField(Variant.VT_RESERVED);
    private static BitField fEmboss = new BitField(65536);
    private static BitField fImprint = new BitField(131072);
    private static BitField fDStrike = new BitField(262144);
    private static BitField fUsePgsuSettings = new BitField(524288);
    private static BitField fBoldBi = new BitField(1048576);
    private static BitField fComplexScripts = new BitField(2097152);
    private static BitField fItalicBi = new BitField(4194304);
    private static BitField fBiDi = new BitField(8388608);
    private static BitField itypFELayout = new BitField(FunctionEval.FunctionID.EXTERNAL_FUNC);
    private static BitField fTNY = new BitField(256);
    private static BitField fWarichu = new BitField(512);
    private static BitField fKumimoji = new BitField(1024);
    private static BitField fRuby = new BitField(2048);
    private static BitField fLSFitText = new BitField(4096);
    private static BitField spare = new BitField(57344);
    private static BitField iWarichuBracket = new BitField(7);
    private static BitField fWarichuNoOpenBracket = new BitField(8);
    private static BitField fTNYCompress = new BitField(16);
    private static BitField fTNYFetchTxm = new BitField(32);
    private static BitField fCellFitText = new BitField(64);
    private static BitField unused = new BitField(128);
    private static BitField icoHighlight = new BitField(31);
    private static BitField fHighlight = new BitField(32);
    private static BitField fChsDiff = new BitField(1);
    private static BitField fMacChs = new BitField(32);
    protected int field_2_hps = 20;
    protected Colorref field_8_cv = new Colorref();
    protected int field_11_lidDefault = 1024;
    protected int field_12_lidFE = 1024;
    protected Hyphenation field_20_hresi = new Hyphenation();
    protected ShadingDescriptor field_23_shd = new ShadingDescriptor();
    protected BorderCode field_24_brc = new BorderCode();
    protected int field_36_fcPic = -1;
    protected Hyphenation field_40_hresiOld = new Hyphenation();
    protected DateAndTime field_42_dttmRMark = new DateAndTime();
    protected DateAndTime field_43_dttmRMarkDel = new DateAndTime();
    protected int field_44_istd = 10;
    protected DateAndTime field_53_dttmPropRMark = new DateAndTime();
    protected DateAndTime field_58_dttmConflict = new DateAndTime();
    protected DateAndTime field_61_dttmDispFldRMark = new DateAndTime();
    protected byte[] field_62_xstDispFldRMark = new byte[0];
    protected int field_68_wCharScale = 100;

    @Internal
    public BorderCode getBrc() {
        return this.field_24_brc;
    }

    @Internal
    public short getCharsetFlags() {
        return this.field_49_CharsetFlags;
    }

    @Internal
    public short getChse() {
        return this.field_50_chse;
    }

    @Internal
    public byte getCopt() {
        return this.field_30_copt;
    }

    @Internal
    public int getCpg() {
        return this.field_47_cpg;
    }

    @Internal
    public Colorref getCv() {
        return this.field_8_cv;
    }

    @Internal
    public DateAndTime getDttmConflict() {
        return this.field_58_dttmConflict;
    }

    @Internal
    public DateAndTime getDttmDispFldRMark() {
        return this.field_61_dttmDispFldRMark;
    }

    @Internal
    public DateAndTime getDttmPropRMark() {
        return this.field_53_dttmPropRMark;
    }

    @Internal
    public DateAndTime getDttmRMark() {
        return this.field_42_dttmRMark;
    }

    @Internal
    public DateAndTime getDttmRMarkDel() {
        return this.field_43_dttmRMarkDel;
    }

    @Internal
    public int getDxaSpace() {
        return this.field_7_dxaSpace;
    }

    @Internal
    public boolean getFBorderWS() {
        return this.field_28_fBorderWS;
    }

    @Internal
    public boolean getFConflictOrig() {
        return this.field_54_fConflictOrig;
    }

    @Internal
    public boolean getFConflictOtherDel() {
        return this.field_55_fConflictOtherDel;
    }

    @Internal
    public boolean getFDblBdr() {
        return this.field_27_fDblBdr;
    }

    @Internal
    public boolean getFDispFldRMark() {
        return this.field_59_fDispFldRMark;
    }

    @Internal
    public boolean getFHasOldProps() {
        return this.field_66_fHasOldProps;
    }

    @Internal
    public boolean getFPropRMark() {
        return this.field_51_fPropRMark;
    }

    @Internal
    public boolean getFSdtVanish() {
        return this.field_67_fSdtVanish;
    }

    @Internal
    public boolean getFSpecSymbol() {
        return this.field_16_fSpecSymbol;
    }

    @Internal
    public boolean getFSpecVanish() {
        return this.field_65_fSpecVanish;
    }

    @Internal
    public boolean getFUndetermine() {
        return this.field_14_fUndetermine;
    }

    @Internal
    public int getFcData() {
        return this.field_39_fcData;
    }

    @Internal
    public int getFcObj() {
        return this.field_37_fcObj;
    }

    @Internal
    public int getFcObjp() {
        return this.field_63_fcObjp;
    }

    @Internal
    public int getFcPic() {
        return this.field_36_fcPic;
    }

    @Internal
    public int getFtcAscii() {
        return this.field_3_ftcAscii;
    }

    @Internal
    public int getFtcBi() {
        return this.field_6_ftcBi;
    }

    @Internal
    public int getFtcFE() {
        return this.field_4_ftcFE;
    }

    @Internal
    public int getFtcOther() {
        return this.field_5_ftcOther;
    }

    @Internal
    public int getFtcSym() {
        return this.field_34_ftcSym;
    }

    @Internal
    public int getGrpfChp() {
        return this.field_1_grpfChp;
    }

    @Internal
    public short getHighlight() {
        return this.field_48_Highlight;
    }

    @Internal
    public int getHps() {
        return this.field_2_hps;
    }

    @Internal
    public int getHpsAsci() {
        return this.field_31_hpsAsci;
    }

    @Internal
    public int getHpsBi() {
        return this.field_33_hpsBi;
    }

    @Internal
    public int getHpsFE() {
        return this.field_32_hpsFE;
    }

    @Internal
    public int getHpsKern() {
        return this.field_21_hpsKern;
    }

    @Internal
    public short getHpsPos() {
        return this.field_22_hpsPos;
    }

    @Internal
    public Hyphenation getHresi() {
        return this.field_20_hresi;
    }

    @Internal
    public Hyphenation getHresiOld() {
        return this.field_40_hresiOld;
    }

    @Internal
    public byte getIWarichuBracket() {
        return (byte) iWarichuBracket.getValue(this.field_30_copt);
    }

    @Internal
    public int getIbstConflict() {
        return this.field_57_IbstConflict;
    }

    @Internal
    public int getIbstDispFldRMark() {
        return this.field_60_ibstDispFldRMark;
    }

    @Internal
    public int getIbstPropRMark() {
        return this.field_52_ibstPropRMark;
    }

    @Internal
    public int getIbstRMark() {
        return this.field_25_ibstRMark;
    }

    @Internal
    public int getIbstRMarkDel() {
        return this.field_41_ibstRMarkDel;
    }

    @Internal
    public byte getIco() {
        return this.field_9_ico;
    }

    @Internal
    public byte getIcoHighlight() {
        return (byte) icoHighlight.getValue(this.field_48_Highlight);
    }

    @Internal
    public byte getIdct() {
        return this.field_17_idct;
    }

    @Internal
    public byte getIdctHint() {
        return this.field_18_idctHint;
    }

    @Internal
    public int getIdslRMReason() {
        return this.field_45_idslRMReason;
    }

    @Internal
    public int getIdslReasonDel() {
        return this.field_46_idslReasonDel;
    }

    @Internal
    public byte getIss() {
        return this.field_15_iss;
    }

    @Internal
    public int getIstd() {
        return this.field_44_istd;
    }

    @Internal
    public short getItypFELayout() {
        return (short) itypFELayout.getValue(this.field_29_ufel);
    }

    @Internal
    public byte getKcd() {
        return this.field_13_kcd;
    }

    @Internal
    public byte getKul() {
        return this.field_19_kul;
    }

    @Internal
    public int getLTagObj() {
        return this.field_38_lTagObj;
    }

    @Internal
    public byte getLbrCRJ() {
        return this.field_64_lbrCRJ;
    }

    @Internal
    public int getLidDefault() {
        return this.field_11_lidDefault;
    }

    @Internal
    public int getLidFE() {
        return this.field_12_lidFE;
    }

    @Internal
    public int getPctCharWidth() {
        return this.field_10_pctCharWidth;
    }

    @Internal
    public byte getSfxtText() {
        return this.field_26_sfxtText;
    }

    @Internal
    public ShadingDescriptor getShd() {
        return this.field_23_shd;
    }

    @Internal
    public byte getSpare() {
        return (byte) spare.getValue(this.field_29_ufel);
    }

    @Internal
    public short getUfel() {
        return this.field_29_ufel;
    }

    @Internal
    public int getUnderlineColor() {
        Colorref colorref = this.field_69_underlineColor;
        if (colorref != null) {
            return colorref.getValue();
        }
        return -1;
    }

    @Internal
    public int getWCharScale() {
        return this.field_68_wCharScale;
    }

    @Internal
    public int getWConflict() {
        return this.field_56_wConflict;
    }

    @Internal
    public int getXchSym() {
        return this.field_35_xchSym;
    }

    @Internal
    public byte[] getXstDispFldRMark() {
        return this.field_62_xstDispFldRMark;
    }

    @Internal
    public boolean isFBiDi() {
        return fBiDi.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFBold() {
        return fBold.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFBoldBi() {
        return fBoldBi.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFCaps() {
        return fCaps.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFCellFitText() {
        return fCellFitText.isSet(this.field_30_copt);
    }

    @Internal
    public boolean isFChsDiff() {
        return fChsDiff.isSet(this.field_49_CharsetFlags);
    }

    @Internal
    public boolean isFComplexScripts() {
        return fComplexScripts.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFDStrike() {
        return fDStrike.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFData() {
        return fData.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFEmboss() {
        return fEmboss.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFFldVanish() {
        return fFldVanish.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFHighlight() {
        return fHighlight.isSet(this.field_48_Highlight);
    }

    @Internal
    public boolean isFImprint() {
        return fImprint.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFItalic() {
        return fItalic.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFItalicBi() {
        return fItalicBi.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFKumimoji() {
        return fKumimoji.isSet(this.field_29_ufel);
    }

    @Internal
    public boolean isFLSFitText() {
        return fLSFitText.isSet(this.field_29_ufel);
    }

    @Internal
    public boolean isFLowerCase() {
        return fLowerCase.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFMacChs() {
        return fMacChs.isSet(this.field_49_CharsetFlags);
    }

    @Internal
    public boolean isFObj() {
        return fObj.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFOle2() {
        return fOle2.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFOutline() {
        return fOutline.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFRMark() {
        return fRMark.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFRMarkDel() {
        return fRMarkDel.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFRuby() {
        return fRuby.isSet(this.field_29_ufel);
    }

    @Internal
    public boolean isFShadow() {
        return fShadow.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFSmallCaps() {
        return fSmallCaps.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFSpec() {
        return fSpec.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFStrike() {
        return fStrike.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFTNY() {
        return fTNY.isSet(this.field_29_ufel);
    }

    @Internal
    public boolean isFTNYCompress() {
        return fTNYCompress.isSet(this.field_30_copt);
    }

    @Internal
    public boolean isFTNYFetchTxm() {
        return fTNYFetchTxm.isSet(this.field_30_copt);
    }

    @Internal
    public boolean isFUsePgsuSettings() {
        return fUsePgsuSettings.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFVanish() {
        return fVanish.isSet(this.field_1_grpfChp);
    }

    @Internal
    public boolean isFWarichu() {
        return fWarichu.isSet(this.field_29_ufel);
    }

    @Internal
    public boolean isFWarichuNoOpenBracket() {
        return fWarichuNoOpenBracket.isSet(this.field_30_copt);
    }

    @Internal
    public boolean isUnused() {
        return unused.isSet(this.field_30_copt);
    }

    @Internal
    public void setBrc(BorderCode borderCode) {
        this.field_24_brc = borderCode;
    }

    @Internal
    public void setCharsetFlags(short s4) {
        this.field_49_CharsetFlags = s4;
    }

    @Internal
    public void setChse(short s4) {
        this.field_50_chse = s4;
    }

    @Internal
    public void setCopt(byte b10) {
        this.field_30_copt = b10;
    }

    @Internal
    public void setCpg(int i10) {
        this.field_47_cpg = i10;
    }

    @Internal
    public void setCv(Colorref colorref) {
        this.field_8_cv = colorref;
    }

    @Internal
    public void setDttmConflict(DateAndTime dateAndTime) {
        this.field_58_dttmConflict = dateAndTime;
    }

    @Internal
    public void setDttmDispFldRMark(DateAndTime dateAndTime) {
        this.field_61_dttmDispFldRMark = dateAndTime;
    }

    @Internal
    public void setDttmPropRMark(DateAndTime dateAndTime) {
        this.field_53_dttmPropRMark = dateAndTime;
    }

    @Internal
    public void setDttmRMark(DateAndTime dateAndTime) {
        this.field_42_dttmRMark = dateAndTime;
    }

    @Internal
    public void setDttmRMarkDel(DateAndTime dateAndTime) {
        this.field_43_dttmRMarkDel = dateAndTime;
    }

    @Internal
    public void setDxaSpace(int i10) {
        this.field_7_dxaSpace = i10;
    }

    @Internal
    public void setFBiDi(boolean z10) {
        this.field_1_grpfChp = fBiDi.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFBold(boolean z10) {
        this.field_1_grpfChp = fBold.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFBoldBi(boolean z10) {
        this.field_1_grpfChp = fBoldBi.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFBorderWS(boolean z10) {
        this.field_28_fBorderWS = z10;
    }

    @Internal
    public void setFCaps(boolean z10) {
        this.field_1_grpfChp = fCaps.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFCellFitText(boolean z10) {
        this.field_30_copt = (byte) fCellFitText.setBoolean(this.field_30_copt, z10);
    }

    @Internal
    public void setFChsDiff(boolean z10) {
        this.field_49_CharsetFlags = (short) fChsDiff.setBoolean(this.field_49_CharsetFlags, z10);
    }

    @Internal
    public void setFComplexScripts(boolean z10) {
        this.field_1_grpfChp = fComplexScripts.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFConflictOrig(boolean z10) {
        this.field_54_fConflictOrig = z10;
    }

    @Internal
    public void setFConflictOtherDel(boolean z10) {
        this.field_55_fConflictOtherDel = z10;
    }

    @Internal
    public void setFDStrike(boolean z10) {
        this.field_1_grpfChp = fDStrike.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFData(boolean z10) {
        this.field_1_grpfChp = fData.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFDblBdr(boolean z10) {
        this.field_27_fDblBdr = z10;
    }

    @Internal
    public void setFDispFldRMark(boolean z10) {
        this.field_59_fDispFldRMark = z10;
    }

    @Internal
    public void setFEmboss(boolean z10) {
        this.field_1_grpfChp = fEmboss.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFFldVanish(boolean z10) {
        this.field_1_grpfChp = fFldVanish.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFHasOldProps(boolean z10) {
        this.field_66_fHasOldProps = z10;
    }

    @Internal
    public void setFHighlight(boolean z10) {
        this.field_48_Highlight = (short) fHighlight.setBoolean(this.field_48_Highlight, z10);
    }

    @Internal
    public void setFImprint(boolean z10) {
        this.field_1_grpfChp = fImprint.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFItalic(boolean z10) {
        this.field_1_grpfChp = fItalic.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFItalicBi(boolean z10) {
        this.field_1_grpfChp = fItalicBi.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFKumimoji(boolean z10) {
        this.field_29_ufel = (short) fKumimoji.setBoolean(this.field_29_ufel, z10);
    }

    @Internal
    public void setFLSFitText(boolean z10) {
        this.field_29_ufel = (short) fLSFitText.setBoolean(this.field_29_ufel, z10);
    }

    @Internal
    public void setFLowerCase(boolean z10) {
        this.field_1_grpfChp = fLowerCase.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFMacChs(boolean z10) {
        this.field_49_CharsetFlags = (short) fMacChs.setBoolean(this.field_49_CharsetFlags, z10);
    }

    @Internal
    public void setFObj(boolean z10) {
        this.field_1_grpfChp = fObj.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFOle2(boolean z10) {
        this.field_1_grpfChp = fOle2.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFOutline(boolean z10) {
        this.field_1_grpfChp = fOutline.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFPropRMark(boolean z10) {
        this.field_51_fPropRMark = z10;
    }

    @Internal
    public void setFRMark(boolean z10) {
        this.field_1_grpfChp = fRMark.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFRMarkDel(boolean z10) {
        this.field_1_grpfChp = fRMarkDel.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFRuby(boolean z10) {
        this.field_29_ufel = (short) fRuby.setBoolean(this.field_29_ufel, z10);
    }

    @Internal
    public void setFSdtVanish(boolean z10) {
        this.field_67_fSdtVanish = z10;
    }

    @Internal
    public void setFShadow(boolean z10) {
        this.field_1_grpfChp = fShadow.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFSmallCaps(boolean z10) {
        this.field_1_grpfChp = fSmallCaps.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFSpec(boolean z10) {
        this.field_1_grpfChp = fSpec.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFSpecSymbol(boolean z10) {
        this.field_16_fSpecSymbol = z10;
    }

    @Internal
    public void setFSpecVanish(boolean z10) {
        this.field_65_fSpecVanish = z10;
    }

    @Internal
    public void setFStrike(boolean z10) {
        this.field_1_grpfChp = fStrike.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFTNY(boolean z10) {
        this.field_29_ufel = (short) fTNY.setBoolean(this.field_29_ufel, z10);
    }

    @Internal
    public void setFTNYCompress(boolean z10) {
        this.field_30_copt = (byte) fTNYCompress.setBoolean(this.field_30_copt, z10);
    }

    @Internal
    public void setFTNYFetchTxm(boolean z10) {
        this.field_30_copt = (byte) fTNYFetchTxm.setBoolean(this.field_30_copt, z10);
    }

    @Internal
    public void setFUndetermine(boolean z10) {
        this.field_14_fUndetermine = z10;
    }

    @Internal
    public void setFUsePgsuSettings(boolean z10) {
        this.field_1_grpfChp = fUsePgsuSettings.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFVanish(boolean z10) {
        this.field_1_grpfChp = fVanish.setBoolean(this.field_1_grpfChp, z10);
    }

    @Internal
    public void setFWarichu(boolean z10) {
        this.field_29_ufel = (short) fWarichu.setBoolean(this.field_29_ufel, z10);
    }

    @Internal
    public void setFWarichuNoOpenBracket(boolean z10) {
        this.field_30_copt = (byte) fWarichuNoOpenBracket.setBoolean(this.field_30_copt, z10);
    }

    @Internal
    public void setFcData(int i10) {
        this.field_39_fcData = i10;
    }

    @Internal
    public void setFcObj(int i10) {
        this.field_37_fcObj = i10;
    }

    @Internal
    public void setFcObjp(int i10) {
        this.field_63_fcObjp = i10;
    }

    @Internal
    public void setFcPic(int i10) {
        this.field_36_fcPic = i10;
    }

    @Internal
    public void setFtcAscii(int i10) {
        this.field_3_ftcAscii = i10;
    }

    @Internal
    public void setFtcBi(int i10) {
        this.field_6_ftcBi = i10;
    }

    @Internal
    public void setFtcFE(int i10) {
        this.field_4_ftcFE = i10;
    }

    @Internal
    public void setFtcOther(int i10) {
        this.field_5_ftcOther = i10;
    }

    @Internal
    public void setFtcSym(int i10) {
        this.field_34_ftcSym = i10;
    }

    @Internal
    public void setGrpfChp(int i10) {
        this.field_1_grpfChp = i10;
    }

    @Internal
    public void setHighlight(short s4) {
        this.field_48_Highlight = s4;
    }

    @Internal
    public void setHps(int i10) {
        this.field_2_hps = i10;
    }

    @Internal
    public void setHpsAsci(int i10) {
        this.field_31_hpsAsci = i10;
    }

    @Internal
    public void setHpsBi(int i10) {
        this.field_33_hpsBi = i10;
    }

    @Internal
    public void setHpsFE(int i10) {
        this.field_32_hpsFE = i10;
    }

    @Internal
    public void setHpsKern(int i10) {
        this.field_21_hpsKern = i10;
    }

    @Internal
    public void setHpsPos(short s4) {
        this.field_22_hpsPos = s4;
    }

    @Internal
    public void setHresi(Hyphenation hyphenation) {
        this.field_20_hresi = hyphenation;
    }

    @Internal
    public void setHresiOld(Hyphenation hyphenation) {
        this.field_40_hresiOld = hyphenation;
    }

    @Internal
    public void setIWarichuBracket(byte b10) {
        this.field_30_copt = (byte) iWarichuBracket.setValue(this.field_30_copt, b10);
    }

    @Internal
    public void setIbstConflict(int i10) {
        this.field_57_IbstConflict = i10;
    }

    @Internal
    public void setIbstDispFldRMark(int i10) {
        this.field_60_ibstDispFldRMark = i10;
    }

    @Internal
    public void setIbstPropRMark(int i10) {
        this.field_52_ibstPropRMark = i10;
    }

    @Internal
    public void setIbstRMark(int i10) {
        this.field_25_ibstRMark = i10;
    }

    @Internal
    public void setIbstRMarkDel(int i10) {
        this.field_41_ibstRMarkDel = i10;
    }

    @Internal
    public void setIco(byte b10) {
        this.field_9_ico = b10;
    }

    @Internal
    public void setIcoHighlight(byte b10) {
        this.field_48_Highlight = (short) icoHighlight.setValue(this.field_48_Highlight, b10);
    }

    @Internal
    public void setIdct(byte b10) {
        this.field_17_idct = b10;
    }

    @Internal
    public void setIdctHint(byte b10) {
        this.field_18_idctHint = b10;
    }

    @Internal
    public void setIdslRMReason(int i10) {
        this.field_45_idslRMReason = i10;
    }

    @Internal
    public void setIdslReasonDel(int i10) {
        this.field_46_idslReasonDel = i10;
    }

    @Internal
    public void setIss(byte b10) {
        this.field_15_iss = b10;
    }

    @Internal
    public void setIstd(int i10) {
        this.field_44_istd = i10;
    }

    @Internal
    public void setItypFELayout(short s4) {
        this.field_29_ufel = (short) itypFELayout.setValue(this.field_29_ufel, s4);
    }

    @Internal
    public void setKcd(byte b10) {
        this.field_13_kcd = b10;
    }

    @Internal
    public void setKul(byte b10) {
        this.field_19_kul = b10;
    }

    @Internal
    public void setLTagObj(int i10) {
        this.field_38_lTagObj = i10;
    }

    @Internal
    public void setLbrCRJ(byte b10) {
        this.field_64_lbrCRJ = b10;
    }

    @Internal
    public void setLidDefault(int i10) {
        this.field_11_lidDefault = i10;
    }

    @Internal
    public void setLidFE(int i10) {
        this.field_12_lidFE = i10;
    }

    @Internal
    public void setPctCharWidth(int i10) {
        this.field_10_pctCharWidth = i10;
    }

    @Internal
    public void setSfxtText(byte b10) {
        this.field_26_sfxtText = b10;
    }

    @Internal
    public void setShd(ShadingDescriptor shadingDescriptor) {
        this.field_23_shd = shadingDescriptor;
    }

    @Internal
    public void setSpare(byte b10) {
        this.field_29_ufel = (short) spare.setValue(this.field_29_ufel, b10);
    }

    @Internal
    public void setUfel(short s4) {
        this.field_29_ufel = s4;
    }

    @Internal
    public void setUnderlineColor(Colorref colorref) {
        this.field_69_underlineColor = colorref;
    }

    @Internal
    public void setUnused(boolean z10) {
        this.field_30_copt = (byte) unused.setBoolean(this.field_30_copt, z10);
    }

    @Internal
    public void setWCharScale(int i10) {
        this.field_68_wCharScale = i10;
    }

    @Internal
    public void setWConflict(int i10) {
        this.field_56_wConflict = i10;
    }

    @Internal
    public void setXchSym(int i10) {
        this.field_35_xchSym = i10;
    }

    @Internal
    public void setXstDispFldRMark(byte[] bArr) {
        this.field_62_xstDispFldRMark = bArr;
    }

    public String toString() {
        return "[CHP]\n    .grpfChp              =  (" + getGrpfChp() + " )\n         .fBold                    = " + isFBold() + "\n         .fItalic                  = " + isFItalic() + "\n         .fRMarkDel                = " + isFRMarkDel() + "\n         .fOutline                 = " + isFOutline() + "\n         .fFldVanish               = " + isFFldVanish() + "\n         .fSmallCaps               = " + isFSmallCaps() + "\n         .fCaps                    = " + isFCaps() + "\n         .fVanish                  = " + isFVanish() + "\n         .fRMark                   = " + isFRMark() + "\n         .fSpec                    = " + isFSpec() + "\n         .fStrike                  = " + isFStrike() + "\n         .fObj                     = " + isFObj() + "\n         .fShadow                  = " + isFShadow() + "\n         .fLowerCase               = " + isFLowerCase() + "\n         .fData                    = " + isFData() + "\n         .fOle2                    = " + isFOle2() + "\n         .fEmboss                  = " + isFEmboss() + "\n         .fImprint                 = " + isFImprint() + "\n         .fDStrike                 = " + isFDStrike() + "\n         .fUsePgsuSettings         = " + isFUsePgsuSettings() + "\n         .fBoldBi                  = " + isFBoldBi() + "\n         .fComplexScripts          = " + isFComplexScripts() + "\n         .fItalicBi                = " + isFItalicBi() + "\n         .fBiDi                    = " + isFBiDi() + "\n    .hps                  =  (" + getHps() + " )\n    .ftcAscii             =  (" + getFtcAscii() + " )\n    .ftcFE                =  (" + getFtcFE() + " )\n    .ftcOther             =  (" + getFtcOther() + " )\n    .ftcBi                =  (" + getFtcBi() + " )\n    .dxaSpace             =  (" + getDxaSpace() + " )\n    .cv                   =  (" + getCv() + " )\n    .ico                  =  (" + ((int) getIco()) + " )\n    .pctCharWidth         =  (" + getPctCharWidth() + " )\n    .lidDefault           =  (" + getLidDefault() + " )\n    .lidFE                =  (" + getLidFE() + " )\n    .kcd                  =  (" + ((int) getKcd()) + " )\n    .fUndetermine         =  (" + getFUndetermine() + " )\n    .iss                  =  (" + ((int) getIss()) + " )\n    .fSpecSymbol          =  (" + getFSpecSymbol() + " )\n    .idct                 =  (" + ((int) getIdct()) + " )\n    .idctHint             =  (" + ((int) getIdctHint()) + " )\n    .kul                  =  (" + ((int) getKul()) + " )\n    .hresi                =  (" + getHresi() + " )\n    .hpsKern              =  (" + getHpsKern() + " )\n    .hpsPos               =  (" + ((int) getHpsPos()) + " )\n    .shd                  =  (" + getShd() + " )\n    .brc                  =  (" + getBrc() + " )\n    .ibstRMark            =  (" + getIbstRMark() + " )\n    .sfxtText             =  (" + ((int) getSfxtText()) + " )\n    .fDblBdr              =  (" + getFDblBdr() + " )\n    .fBorderWS            =  (" + getFBorderWS() + " )\n    .ufel                 =  (" + ((int) getUfel()) + " )\n         .itypFELayout             = " + ((int) getItypFELayout()) + "\n         .fTNY                     = " + isFTNY() + "\n         .fWarichu                 = " + isFWarichu() + "\n         .fKumimoji                = " + isFKumimoji() + "\n         .fRuby                    = " + isFRuby() + "\n         .fLSFitText               = " + isFLSFitText() + "\n         .spare                    = " + ((int) getSpare()) + "\n    .copt                 =  (" + ((int) getCopt()) + " )\n         .iWarichuBracket          = " + ((int) getIWarichuBracket()) + "\n         .fWarichuNoOpenBracket     = " + isFWarichuNoOpenBracket() + "\n         .fTNYCompress             = " + isFTNYCompress() + "\n         .fTNYFetchTxm             = " + isFTNYFetchTxm() + "\n         .fCellFitText             = " + isFCellFitText() + "\n         .unused                   = " + isUnused() + "\n    .hpsAsci              =  (" + getHpsAsci() + " )\n    .hpsFE                =  (" + getHpsFE() + " )\n    .hpsBi                =  (" + getHpsBi() + " )\n    .ftcSym               =  (" + getFtcSym() + " )\n    .xchSym               =  (" + getXchSym() + " )\n    .fcPic                =  (" + getFcPic() + " )\n    .fcObj                =  (" + getFcObj() + " )\n    .lTagObj              =  (" + getLTagObj() + " )\n    .fcData               =  (" + getFcData() + " )\n    .hresiOld             =  (" + getHresiOld() + " )\n    .ibstRMarkDel         =  (" + getIbstRMarkDel() + " )\n    .dttmRMark            =  (" + getDttmRMark() + " )\n    .dttmRMarkDel         =  (" + getDttmRMarkDel() + " )\n    .istd                 =  (" + getIstd() + " )\n    .idslRMReason         =  (" + getIdslRMReason() + " )\n    .idslReasonDel        =  (" + getIdslReasonDel() + " )\n    .cpg                  =  (" + getCpg() + " )\n    .Highlight            =  (" + ((int) getHighlight()) + " )\n         .icoHighlight             = " + ((int) getIcoHighlight()) + "\n         .fHighlight               = " + isFHighlight() + "\n    .CharsetFlags         =  (" + ((int) getCharsetFlags()) + " )\n         .fChsDiff                 = " + isFChsDiff() + "\n         .fMacChs                  = " + isFMacChs() + "\n    .chse                 =  (" + ((int) getChse()) + " )\n    .fPropRMark           =  (" + getFPropRMark() + " )\n    .ibstPropRMark        =  (" + getIbstPropRMark() + " )\n    .dttmPropRMark        =  (" + getDttmPropRMark() + " )\n    .fConflictOrig        =  (" + getFConflictOrig() + " )\n    .fConflictOtherDel    =  (" + getFConflictOtherDel() + " )\n    .wConflict            =  (" + getWConflict() + " )\n    .IbstConflict         =  (" + getIbstConflict() + " )\n    .dttmConflict         =  (" + getDttmConflict() + " )\n    .fDispFldRMark        =  (" + getFDispFldRMark() + " )\n    .ibstDispFldRMark     =  (" + getIbstDispFldRMark() + " )\n    .dttmDispFldRMark     =  (" + getDttmDispFldRMark() + " )\n    .xstDispFldRMark      =  (" + getXstDispFldRMark() + " )\n    .fcObjp               =  (" + getFcObjp() + " )\n    .lbrCRJ               =  (" + ((int) getLbrCRJ()) + " )\n    .fSpecVanish          =  (" + getFSpecVanish() + " )\n    .fHasOldProps         =  (" + getFHasOldProps() + " )\n    .fSdtVanish           =  (" + getFSdtVanish() + " )\n    .wCharScale           =  (" + getWCharScale() + " )\n[/CHP]\n";
    }
}
