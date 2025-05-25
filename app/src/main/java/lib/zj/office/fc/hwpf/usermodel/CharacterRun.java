package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.CHPX;
import lib.zj.office.fc.hwpf.model.Ffn;
import lib.zj.office.fc.hwpf.model.StyleSheet;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;

/* loaded from: classes3.dex */
public final class CharacterRun extends Range implements Cloneable {
    public static final short SPRM_BRC = 26725;
    public static final short SPRM_CHARSCALE = 18514;
    public static final short SPRM_CPG = 18539;
    public static final short SPRM_DISPFLDRMARK = -13726;
    public static final short SPRM_DTTMRMARK = 26629;
    public static final short SPRM_DTTMRMARKDEL = 26724;
    public static final short SPRM_DXASPACE = -30656;
    public static final short SPRM_FBOLD = 2101;
    public static final short SPRM_FCAPS = 2107;
    public static final short SPRM_FDATA = 2054;
    public static final short SPRM_FDSTRIKE = 10835;
    public static final short SPRM_FELID = 18542;
    public static final short SPRM_FEMBOSS = 2136;
    public static final short SPRM_FFLDVANISH = 2050;
    public static final short SPRM_FIMPRINT = 2132;
    public static final short SPRM_FITALIC = 2102;
    public static final short SPRM_FOBJ = 2134;
    public static final short SPRM_FOLE2 = 2058;
    public static final short SPRM_FOUTLINE = 2104;
    public static final short SPRM_FRMARK = 2049;
    public static final short SPRM_FRMARKDEL = 2048;
    public static final short SPRM_FSHADOW = 2105;
    public static final short SPRM_FSMALLCAPS = 2106;
    public static final short SPRM_FSPEC = 2133;
    public static final short SPRM_FSTRIKE = 2103;
    public static final short SPRM_FVANISH = 2108;
    public static final short SPRM_HIGHLIGHT = 10764;
    public static final short SPRM_HPS = 19011;
    public static final short SPRM_HPSKERN = 18507;
    public static final short SPRM_HPSPOS = 18501;
    public static final short SPRM_IBSTRMARK = 18436;
    public static final short SPRM_IBSTRMARKDEL = 18531;
    public static final short SPRM_ICO = 10818;
    public static final short SPRM_IDCTHINT = 10351;
    public static final short SPRM_IDSIRMARKDEL = 18535;
    public static final short SPRM_ISS = 10824;
    public static final short SPRM_ISTD = 18992;
    public static final short SPRM_KUL = 10814;
    public static final short SPRM_LID = 19009;
    public static final short SPRM_NONFELID = 18541;
    public static final short SPRM_OBJLOCATION = 26638;
    public static final short SPRM_PICLOCATION = 27139;
    public static final short SPRM_PROPRMARK = -13737;
    public static final short SPRM_RGFTCASCII = 19023;
    public static final short SPRM_RGFTCFAREAST = 19024;
    public static final short SPRM_RGFTCNOTFAREAST = 19025;
    public static final short SPRM_SFXTEXT = 10329;
    public static final short SPRM_SHD = 18534;
    public static final short SPRM_SYMBOL = 27145;
    public static final short SPRM_YSRI = 18510;
    SprmBuffer _chpx;
    CharacterProperties _props;
    private String text;

    public CharacterRun(CHPX chpx, StyleSheet styleSheet, short s4, Range range) {
        super(Math.max(range._start, chpx.getStart()), Math.min(range._end, chpx.getEnd()), range);
        this._props = chpx.getCharacterProperties(styleSheet, s4);
        this._chpx = chpx.getSprmBuf();
    }

    public Object clone() {
        CharacterRun characterRun = (CharacterRun) super.clone();
        characterRun._props.setDttmRMark((DateAndTime) this._props.getDttmRMark().clone());
        characterRun._props.setDttmRMarkDel((DateAndTime) this._props.getDttmRMarkDel().clone());
        characterRun._props.setDttmPropRMark((DateAndTime) this._props.getDttmPropRMark().clone());
        characterRun._props.setDttmDispFldRMark((DateAndTime) this._props.getDttmDispFldRMark().clone());
        characterRun._props.setXstDispFldRMark((byte[]) this._props.getXstDispFldRMark().clone());
        characterRun._props.setShd((ShadingDescriptor) this._props.getShd().clone());
        return characterRun;
    }

    @Deprecated
    public CharacterProperties cloneProperties() {
        try {
            return (CharacterProperties) this._props.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public BorderCode getBorder() {
        return this._props.getBrc();
    }

    public int getCharacterSpacing() {
        return this._props.getDxaSpace();
    }

    public int getColor() {
        return this._props.getIco();
    }

    public String getFontName() {
        if (this._doc.getFontTable() == null) {
            return null;
        }
        return this._doc.getFontTable().getMainFont(this._props.getFtcAscii());
    }

    public int getFontSize() {
        return this._props.getHps();
    }

    public byte getHighlightedColor() {
        return this._props.getIcoHighlight();
    }

    public int getIco24() {
        return this._props.getIco24();
    }

    public int getKerning() {
        return this._props.getHpsKern();
    }

    public int getLanguageCode() {
        return this._props.getLidDefault();
    }

    public int getObjOffset() {
        return this._props.getFcObj();
    }

    public int getPicOffset() {
        return this._props.getFcPic();
    }

    public short getSubSuperScriptIndex() {
        return this._props.getIss();
    }

    public char getSymbolCharacter() {
        if (isSymbol()) {
            return (char) this._props.getXchSym();
        }
        throw new IllegalStateException("Not a symbol CharacterRun");
    }

    public Ffn getSymbolFont() {
        if (isSymbol()) {
            Ffn[] fontNames = this._doc.getFontTable().getFontNames();
            if (fontNames.length <= this._props.getFtcSym()) {
                return null;
            }
            return fontNames[this._props.getFtcSym()];
        }
        throw new IllegalStateException("Not a symbol CharacterRun");
    }

    public int getUnderlineCode() {
        return this._props.getKul();
    }

    public int getUnderlineColor() {
        return this._props.getUnderlineColor();
    }

    public int getVerticalOffset() {
        return this._props.getHpsPos();
    }

    public boolean isBold() {
        return this._props.isFBold();
    }

    public boolean isCapitalized() {
        return this._props.isFCaps();
    }

    public boolean isData() {
        return this._props.isFData();
    }

    public boolean isDoubleStrikeThrough() {
        return this._props.isFDStrike();
    }

    public boolean isEmbossed() {
        return this._props.isFEmboss();
    }

    public boolean isFldVanished() {
        return this._props.isFFldVanish();
    }

    public boolean isHighlighted() {
        return this._props.isFHighlight();
    }

    public boolean isImprinted() {
        return this._props.isFImprint();
    }

    public boolean isItalic() {
        return this._props.isFItalic();
    }

    public boolean isMarkedDeleted() {
        return this._props.isFRMarkDel();
    }

    public boolean isMarkedInserted() {
        return this._props.isFRMark();
    }

    public boolean isObj() {
        return this._props.isFObj();
    }

    public boolean isOle2() {
        return this._props.isFOle2();
    }

    public boolean isOutlined() {
        return this._props.isFOutline();
    }

    public boolean isShadowed() {
        return this._props.isFShadow();
    }

    public boolean isSmallCaps() {
        return this._props.isFSmallCaps();
    }

    public boolean isSpecialCharacter() {
        return this._props.isFSpec();
    }

    public boolean isStrikeThrough() {
        return this._props.isFStrike();
    }

    public boolean isSymbol() {
        if (isSpecialCharacter() && text().equals("(")) {
            return true;
        }
        return false;
    }

    public boolean isVanished() {
        return this._props.isFVanish();
    }

    public void markDeleted(boolean z10) {
        this._props.setFRMarkDel(z10);
        this._chpx.updateSprm((short) 2048, z10 ? (byte) 1 : (byte) 0);
    }

    public void markInserted(boolean z10) {
        this._props.setFRMark(z10);
        this._chpx.updateSprm((short) 2049, z10 ? (byte) 1 : (byte) 0);
    }

    public void setBold(boolean z10) {
        this._props.setFBold(z10);
        this._chpx.updateSprm((short) 2101, z10 ? (byte) 1 : (byte) 0);
    }

    public void setCapitalized(boolean z10) {
        this._props.setFCaps(z10);
        this._chpx.updateSprm((short) 2107, z10 ? (byte) 1 : (byte) 0);
    }

    public void setCharacterSpacing(int i10) {
        this._props.setDxaSpace(i10);
        this._chpx.updateSprm((short) -30656, i10);
    }

    public void setColor(int i10) {
        byte b10 = (byte) i10;
        this._props.setIco(b10);
        this._chpx.updateSprm((short) 10818, b10);
    }

    public void setData(boolean z10) {
        this._props.setFData(z10);
        this._chpx.updateSprm((short) 2134, z10 ? (byte) 1 : (byte) 0);
    }

    public void setDoubleStrikethrough(boolean z10) {
        this._props.setFDStrike(z10);
        this._chpx.updateSprm((short) 10835, z10 ? (byte) 1 : (byte) 0);
    }

    public void setEmbossed(boolean z10) {
        this._props.setFEmboss(z10);
        this._chpx.updateSprm((short) 2136, z10 ? (byte) 1 : (byte) 0);
    }

    public void setFldVanish(boolean z10) {
        this._props.setFFldVanish(z10);
        this._chpx.updateSprm((short) 2050, z10 ? (byte) 1 : (byte) 0);
    }

    public void setFontSize(int i10) {
        this._props.setHps(i10);
        this._chpx.updateSprm((short) 19011, (short) i10);
    }

    public void setFtcAscii(int i10) {
        this._props.setFtcAscii(i10);
        this._chpx.updateSprm((short) 19023, (short) i10);
    }

    public void setFtcFE(int i10) {
        this._props.setFtcFE(i10);
        this._chpx.updateSprm((short) 19024, (short) i10);
    }

    public void setFtcOther(int i10) {
        this._props.setFtcOther(i10);
        this._chpx.updateSprm((short) 19025, (short) i10);
    }

    public void setHighlighted(byte b10) {
        this._props.setFHighlight(true);
        this._props.setIcoHighlight(b10);
        this._chpx.updateSprm((short) 10764, b10);
    }

    public void setIco24(int i10) {
        this._props.setIco24(i10);
    }

    public void setImprinted(boolean z10) {
        this._props.setFImprint(z10);
        this._chpx.updateSprm((short) 2132, z10 ? (byte) 1 : (byte) 0);
    }

    public void setItalic(boolean z10) {
        this._props.setFItalic(z10);
        this._chpx.updateSprm((short) 2102, z10 ? (byte) 1 : (byte) 0);
    }

    public void setKerning(int i10) {
        this._props.setHpsKern(i10);
        this._chpx.updateSprm((short) 18507, (short) i10);
    }

    public void setObj(boolean z10) {
        this._props.setFObj(z10);
        this._chpx.updateSprm((short) 2134, z10 ? (byte) 1 : (byte) 0);
    }

    public void setObjOffset(int i10) {
        this._props.setFcObj(i10);
        this._chpx.updateSprm((short) 26638, i10);
    }

    public void setOle2(boolean z10) {
        this._props.setFOle2(z10);
        this._chpx.updateSprm((short) 2134, z10 ? (byte) 1 : (byte) 0);
    }

    public void setOutline(boolean z10) {
        this._props.setFOutline(z10);
        this._chpx.updateSprm((short) 2104, z10 ? (byte) 1 : (byte) 0);
    }

    public void setPicOffset(int i10) {
        this._props.setFcPic(i10);
        this._chpx.updateSprm((short) 27139, i10);
    }

    public void setShadow(boolean z10) {
        this._props.setFShadow(z10);
        this._chpx.updateSprm((short) 2105, z10 ? (byte) 1 : (byte) 0);
    }

    public void setSmallCaps(boolean z10) {
        this._props.setFSmallCaps(z10);
        this._chpx.updateSprm((short) 2106, z10 ? (byte) 1 : (byte) 0);
    }

    public void setSpecialCharacter(boolean z10) {
        this._props.setFSpec(z10);
        this._chpx.updateSprm((short) 2133, z10 ? (byte) 1 : (byte) 0);
    }

    public void setSubSuperScriptIndex(short s4) {
        this._props.setDxaSpace(s4);
        this._chpx.updateSprm((short) -30656, s4);
    }

    public void setUnderlineCode(int i10) {
        byte b10 = (byte) i10;
        this._props.setKul(b10);
        this._chpx.updateSprm((short) 10814, b10);
    }

    public void setVanished(boolean z10) {
        this._props.setFVanish(z10);
        this._chpx.updateSprm((short) 2108, z10 ? (byte) 1 : (byte) 0);
    }

    public void setVerticalOffset(int i10) {
        this._props.setHpsPos((short) i10);
        this._chpx.updateSprm((short) 18501, (byte) i10);
    }

    public void strikeThrough(boolean z10) {
        this._props.setFStrike(z10);
        this._chpx.updateSprm((short) 2103, z10 ? (byte) 1 : (byte) 0);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public String text() {
        if (this.text == null) {
            this.text = super.text();
        }
        return this.text;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public String toString() {
        String text = text();
        return "CharacterRun of " + text.length() + " characters - " + text;
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public int type() {
        return 1;
    }
}
