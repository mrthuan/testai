package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.model.Colorref;
import lib.zj.office.fc.hwpf.model.types.CHPAbstractType;

/* loaded from: classes3.dex */
public final class CharacterProperties extends CHPAbstractType implements Cloneable {
    public static final short SPRM_BRC = 26725;
    public static final short SPRM_CCV = 26736;
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

    public CharacterProperties() {
        setFUsePgsuSettings(true);
        setXstDispFldRMark(new byte[36]);
    }

    public Object clone() {
        CharacterProperties characterProperties = (CharacterProperties) super.clone();
        characterProperties.setCv(getCv().clone());
        characterProperties.setDttmRMark((DateAndTime) getDttmRMark().clone());
        characterProperties.setDttmRMarkDel((DateAndTime) getDttmRMarkDel().clone());
        characterProperties.setDttmPropRMark((DateAndTime) getDttmPropRMark().clone());
        characterProperties.setDttmDispFldRMark((DateAndTime) getDttmDispFldRMark().clone());
        characterProperties.setXstDispFldRMark((byte[]) getXstDispFldRMark().clone());
        characterProperties.setShd((ShadingDescriptor) getShd().clone());
        characterProperties.setBrc((BorderCode) getBrc().clone());
        return characterProperties;
    }

    public int getCharacterSpacing() {
        return getDxaSpace();
    }

    public int getColor() {
        return super.getIco();
    }

    public int getFontSize() {
        return getHps();
    }

    public int getIco24() {
        if (!getCv().isEmpty()) {
            return getCv().getValue();
        }
        switch (getIco()) {
            case 1:
                return 0;
            case 2:
                return 16711680;
            case 3:
                return 16776960;
            case 4:
                return 65280;
            case 5:
                return 16711935;
            case 6:
                return FunctionEval.FunctionID.EXTERNAL_FUNC;
            case 7:
                return Variant.VT_ILLEGAL;
            case 8:
                return 16777215;
            case 9:
                return 8388608;
            case 10:
                return 8421376;
            case 11:
                return Variant.VT_RESERVED;
            case 12:
                return 8388736;
            case 13:
                return 128;
            case 14:
                return 32896;
            case 15:
                return 8421504;
            case 16:
                return 12632256;
            default:
                return -1;
        }
    }

    public int getKerning() {
        return super.getHpsKern();
    }

    public short getSubSuperScriptIndex() {
        return getIss();
    }

    public int getUnderlineCode() {
        return super.getKul();
    }

    public int getVerticalOffset() {
        return super.getHpsPos();
    }

    public boolean isBold() {
        return isFBold();
    }

    public boolean isCapitalized() {
        return isFCaps();
    }

    public boolean isDoubleStrikeThrough() {
        return isFDStrike();
    }

    public boolean isEmbossed() {
        return isFEmboss();
    }

    public boolean isFldVanished() {
        return isFFldVanish();
    }

    public boolean isHighlighted() {
        return super.isFHighlight();
    }

    public boolean isImprinted() {
        return isFImprint();
    }

    public boolean isItalic() {
        return isFItalic();
    }

    public boolean isMarkedDeleted() {
        return isFRMarkDel();
    }

    public boolean isMarkedInserted() {
        return isFRMark();
    }

    public boolean isOutlined() {
        return isFOutline();
    }

    public boolean isShadowed() {
        return isFShadow();
    }

    public boolean isSmallCaps() {
        return isFSmallCaps();
    }

    public boolean isStrikeThrough() {
        return isFStrike();
    }

    public boolean isVanished() {
        return isFVanish();
    }

    public void markDeleted(boolean z10) {
        super.setFRMarkDel(z10);
    }

    public void markInserted(boolean z10) {
        super.setFRMark(z10);
    }

    public void setBold(boolean z10) {
        super.setFBold(z10);
    }

    public void setCapitalized(boolean z10) {
        super.setFCaps(z10);
    }

    public void setCharacterSpacing(int i10) {
        super.setDxaSpace(i10);
    }

    public void setColor(int i10) {
        super.setIco((byte) i10);
    }

    public void setDoubleStrikeThrough(boolean z10) {
        super.setFDStrike(z10);
    }

    public void setEmbossed(boolean z10) {
        super.setFEmboss(z10);
    }

    public void setFldVanish(boolean z10) {
        super.setFFldVanish(z10);
    }

    public void setFontSize(int i10) {
        super.setHps(i10);
    }

    public void setHighlighted(byte b10) {
        super.setIcoHighlight(b10);
    }

    public void setIco24(int i10) {
        setCv(new Colorref(i10 & 16777215));
    }

    public void setImprinted(boolean z10) {
        super.setFImprint(z10);
    }

    public void setItalic(boolean z10) {
        super.setFItalic(z10);
    }

    public void setKerning(int i10) {
        super.setHpsKern(i10);
    }

    public void setOutline(boolean z10) {
        super.setFOutline(z10);
    }

    public void setShadow(boolean z10) {
        super.setFShadow(z10);
    }

    public void setSmallCaps(boolean z10) {
        super.setFSmallCaps(z10);
    }

    public void setSubSuperScriptIndex(short s4) {
        super.setDxaSpace(s4);
    }

    public void setUnderlineCode(int i10) {
        super.setKul((byte) i10);
    }

    public void setVanished(boolean z10) {
        super.setFVanish(z10);
    }

    public void setVerticalOffset(int i10) {
        super.setHpsPos((short) i10);
    }

    public void strikeThrough(boolean z10) {
        super.setFStrike(z10);
    }
}
