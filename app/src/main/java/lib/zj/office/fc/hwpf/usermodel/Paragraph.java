package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.PAPX;
import lib.zj.office.fc.hwpf.sprm.SprmBuffer;
import lib.zj.office.fc.hwpf.sprm.TableSprmCompressor;

/* loaded from: classes3.dex */
public class Paragraph extends Range implements Cloneable {
    public static final short SPRM_ANLD = -14786;
    public static final short SPRM_AUTOSPACEDE = 9271;
    public static final short SPRM_AUTOSPACEDN = 9272;
    public static final short SPRM_BRCBAR = 26153;
    public static final short SPRM_BRCBOTTOM = 25638;
    public static final short SPRM_BRCL = 9224;
    public static final short SPRM_BRCLEFT = 25637;
    public static final short SPRM_BRCP = 9225;
    public static final short SPRM_BRCRIGHT = 25639;
    public static final short SPRM_BRCTOP = 25636;
    public static final short SPRM_CHGTABS = -14827;
    public static final short SPRM_CHGTABSPAPX = -14835;
    public static final short SPRM_CRLF = 9284;
    public static final short SPRM_DCS = 17452;
    public static final short SPRM_DXAABS = -31720;
    public static final short SPRM_DXAFROMTEXT = -31697;
    public static final short SPRM_DXALEFT = -31729;
    public static final short SPRM_DXALEFT1 = -31727;
    public static final short SPRM_DXARIGHT = -31730;
    public static final short SPRM_DXAWIDTH = -31718;
    public static final short SPRM_DYAABS = -31719;
    public static final short SPRM_DYAAFTER = -23532;
    public static final short SPRM_DYABEFORE = -23533;
    public static final short SPRM_DYAFROMTEXT = -31698;
    public static final short SPRM_DYALINE = 25618;
    public static final short SPRM_FADJUSTRIGHT = 9288;
    public static final short SPRM_FBIDI = 9281;
    public static final short SPRM_FINTABLE = 9238;
    public static final short SPRM_FKEEP = 9221;
    public static final short SPRM_FKEEPFOLLOW = 9222;
    public static final short SPRM_FKINSOKU = 9267;
    public static final short SPRM_FLOCKED = 9264;
    public static final short SPRM_FNOAUTOHYPH = 9258;
    public static final short SPRM_FNOLINENUMB = 9228;
    public static final short SPRM_FNUMRMLNS = 9283;
    public static final short SPRM_FOVERFLOWPUNCT = 9269;
    public static final short SPRM_FPAGEBREAKBEFORE = 9223;
    public static final short SPRM_FRAMETEXTFLOW = 17466;
    public static final short SPRM_FSIDEBYSIDE = 9220;
    public static final short SPRM_FTOPLINEPUNCT = 9270;
    public static final short SPRM_FTTP = 9239;
    public static final short SPRM_FWIDOWCONTROL = 9265;
    public static final short SPRM_FWORDWRAP = 9268;
    public static final short SPRM_ILFO = 17931;
    public static final short SPRM_ILVL = 9738;
    public static final short SPRM_JC = 9219;
    public static final short SPRM_NUMRM = -14779;
    public static final short SPRM_OUTLVL = 9792;
    public static final short SPRM_PC = 9755;
    public static final short SPRM_PROPRMARK = -14785;
    public static final short SPRM_RULER = -14798;
    public static final short SPRM_SHD = 17453;
    public static final short SPRM_USEPGSUSETTINGS = 9287;
    public static final short SPRM_WALIGNFONT = 17465;
    public static final short SPRM_WHEIGHTABS = 17451;
    public static final short SPRM_WR = 9251;
    protected short _istd;
    protected SprmBuffer _papx;
    protected ParagraphProperties _props;

    public Paragraph(int i10, int i11, Table table) {
        super(i10, i11, table);
        initAll();
        PAPX papx = this._paragraphs.get(this._parEnd - 1);
        this._props = papx.getParagraphProperties(this._doc.getStyleSheet());
        this._papx = papx.getSprmBuf();
        this._istd = papx.getIstd();
    }

    private short getFrameTextFlow() {
        short s4;
        if (this._props.isFVertical()) {
            s4 = (short) 1;
        } else {
            s4 = 0;
        }
        if (this._props.isFBackward()) {
            s4 = (short) (s4 | 2);
        }
        if (this._props.isFRotateFont()) {
            return (short) (s4 | 4);
        }
        return s4;
    }

    public Object clone() {
        Paragraph paragraph = (Paragraph) super.clone();
        paragraph._props = (ParagraphProperties) this._props.clone();
        paragraph._papx = new SprmBuffer(0);
        return paragraph;
    }

    public ParagraphProperties cloneProperties() {
        try {
            return (ParagraphProperties) this._props.clone();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public BorderCode getBarBorder() {
        return this._props.getBrcBar();
    }

    public BorderCode getBottomBorder() {
        return this._props.getBrcBottom();
    }

    public DropCapSpecifier getDropCap() {
        return this._props.getDcs();
    }

    public int getFirstLineIndent() {
        return this._props.getDxaLeft1();
    }

    public int getFontAlignment() {
        return this._props.getWAlignFont();
    }

    public int getIlfo() {
        return this._props.getIlfo();
    }

    public int getIlvl() {
        return this._props.getIlvl();
    }

    public int getIndentFromLeft() {
        return this._props.getDxaLeft();
    }

    public int getIndentFromRight() {
        return this._props.getDxaRight();
    }

    public int getJustification() {
        return this._props.getJc();
    }

    public BorderCode getLeftBorder() {
        return this._props.getBrcLeft();
    }

    public LineSpacingDescriptor getLineSpacing() {
        return this._props.getLspd();
    }

    public int getLvl() {
        return this._props.getLvl();
    }

    public BorderCode getRightBorder() {
        return this._props.getBrcRight();
    }

    public ShadingDescriptor getShading() {
        return this._props.getShd();
    }

    public int getSpacingAfter() {
        return this._props.getDyaAfter();
    }

    public int getSpacingBefore() {
        return this._props.getDyaBefore();
    }

    public short getStyleIndex() {
        return this._istd;
    }

    public short getTabClearPosition() {
        return this._props.getTabClearPosition();
    }

    public int getTableLevel() {
        return this._props.getItap();
    }

    public BorderCode getTopBorder() {
        return this._props.getBrcTop();
    }

    public boolean isAutoHyphenated() {
        return !this._props.getFNoAutoHyph();
    }

    public boolean isBackward() {
        return this._props.isFBackward();
    }

    public boolean isEmbeddedCellMark() {
        return this._props.getFInnerTableCell();
    }

    public boolean isInTable() {
        return this._props.getFInTable();
    }

    public boolean isKinsoku() {
        return this._props.getFKinsoku();
    }

    public boolean isLineNotNumbered() {
        return this._props.getFNoLnn();
    }

    public boolean isSideBySide() {
        return this._props.getFSideBySide();
    }

    public boolean isTableRowEnd() {
        if (!this._props.getFTtp() && !this._props.getFTtpEmbedded()) {
            return false;
        }
        return true;
    }

    public boolean isVertical() {
        return this._props.isFVertical();
    }

    public boolean isWidowControlled() {
        return this._props.getFWidowControl();
    }

    public boolean isWordWrapped() {
        return this._props.getFWordWrap();
    }

    public boolean keepOnPage() {
        return this._props.getFKeep();
    }

    public boolean keepWithNext() {
        return this._props.getFKeepFollow();
    }

    public boolean pageBreakBefore() {
        return this._props.getFPageBreakBefore();
    }

    public void setAutoHyphenated(boolean z10) {
        this._props.setFNoAutoHyph(!z10);
        this._papx.updateSprm(SPRM_FNOAUTOHYPH, !z10);
    }

    public void setBackward(boolean z10) {
        this._props.setFBackward(z10);
        this._papx.updateSprm(SPRM_FRAMETEXTFLOW, getFrameTextFlow());
    }

    public void setBarBorder(BorderCode borderCode) {
        this._props.setBrcBar(borderCode);
        this._papx.updateSprm(SPRM_BRCBAR, borderCode.toInt());
    }

    public void setBottomBorder(BorderCode borderCode) {
        this._props.setBrcBottom(borderCode);
        this._papx.updateSprm(SPRM_BRCBOTTOM, borderCode.toInt());
    }

    public void setDropCap(DropCapSpecifier dropCapSpecifier) {
        this._props.setDcs(dropCapSpecifier);
        this._papx.updateSprm(SPRM_DCS, dropCapSpecifier.toShort());
    }

    public void setFirstLineIndent(int i10) {
        this._props.setDxaLeft1(i10);
        this._papx.updateSprm(SPRM_DXALEFT1, (short) i10);
    }

    public void setFontAlignment(int i10) {
        this._props.setWAlignFont(i10);
        this._papx.updateSprm(SPRM_WALIGNFONT, (short) i10);
    }

    public void setIndentFromLeft(int i10) {
        this._props.setDxaLeft(i10);
        this._papx.updateSprm(SPRM_DXALEFT, (short) i10);
    }

    public void setIndentFromRight(int i10) {
        this._props.setDxaRight(i10);
        this._papx.updateSprm(SPRM_DXARIGHT, (short) i10);
    }

    public void setJustification(byte b10) {
        this._props.setJc(b10);
        this._papx.updateSprm(SPRM_JC, b10);
    }

    public void setKeepOnPage(boolean z10) {
        this._props.setFKeep(z10);
        this._papx.updateSprm(SPRM_FKEEP, z10);
    }

    public void setKeepWithNext(boolean z10) {
        this._props.setFKeepFollow(z10);
        this._papx.updateSprm(SPRM_FKEEPFOLLOW, z10);
    }

    public void setKinsoku(boolean z10) {
        this._props.setFKinsoku(z10);
        this._papx.updateSprm(SPRM_FKINSOKU, z10);
    }

    public void setLeftBorder(BorderCode borderCode) {
        this._props.setBrcLeft(borderCode);
        this._papx.updateSprm(SPRM_BRCLEFT, borderCode.toInt());
    }

    public void setLineNotNumbered(boolean z10) {
        this._props.setFNoLnn(z10);
        this._papx.updateSprm(SPRM_FNOLINENUMB, z10);
    }

    public void setLineSpacing(LineSpacingDescriptor lineSpacingDescriptor) {
        this._props.setLspd(lineSpacingDescriptor);
        this._papx.updateSprm(SPRM_DYALINE, lineSpacingDescriptor.toInt());
    }

    public void setPageBreakBefore(boolean z10) {
        this._props.setFPageBreakBefore(z10);
        this._papx.updateSprm(SPRM_FPAGEBREAKBEFORE, z10);
    }

    public void setRightBorder(BorderCode borderCode) {
        this._props.setBrcRight(borderCode);
        this._papx.updateSprm(SPRM_BRCRIGHT, borderCode.toInt());
    }

    public void setShading(ShadingDescriptor shadingDescriptor) {
        this._props.setShd(shadingDescriptor);
        this._papx.updateSprm(SPRM_SHD, shadingDescriptor.toShort());
    }

    public void setSideBySide(boolean z10) {
        this._props.setFSideBySide(z10);
        this._papx.updateSprm(SPRM_FSIDEBYSIDE, z10);
    }

    public void setSpacingAfter(int i10) {
        this._props.setDyaAfter(i10);
        this._papx.updateSprm(SPRM_DYAAFTER, (short) i10);
    }

    public void setSpacingBefore(int i10) {
        this._props.setDyaBefore(i10);
        this._papx.updateSprm(SPRM_DYABEFORE, (short) i10);
    }

    public void setTableRowEnd(TableProperties tableProperties) {
        setTableRowEnd(true);
        this._papx.append(TableSprmCompressor.compressTableProperty(tableProperties));
    }

    public void setTopBorder(BorderCode borderCode) {
        this._props.setBrcTop(borderCode);
        this._papx.updateSprm(SPRM_BRCTOP, borderCode.toInt());
    }

    public void setVertical(boolean z10) {
        this._props.setFVertical(z10);
        this._papx.updateSprm(SPRM_FRAMETEXTFLOW, getFrameTextFlow());
    }

    public void setWidowControl(boolean z10) {
        this._props.setFWidowControl(z10);
        this._papx.updateSprm(SPRM_FWIDOWCONTROL, z10);
    }

    public void setWordWrapped(boolean z10) {
        this._props.setFWordWrap(z10);
        this._papx.updateSprm(SPRM_FWORDWRAP, z10);
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public String toString() {
        return "Paragraph [" + getStartOffset() + "; " + getEndOffset() + ")";
    }

    @Override // lib.zj.office.fc.hwpf.usermodel.Range
    public int type() {
        return 0;
    }

    private void setTableRowEnd(boolean z10) {
        this._props.setFTtp(z10);
        this._papx.updateSprm(SPRM_FTTP, z10);
    }

    public Paragraph(PAPX papx, Range range) {
        super(Math.max(range._start, papx.getStart()), Math.min(range._end, papx.getEnd()), range);
        this._props = papx.getParagraphProperties(this._doc.getStyleSheet());
        this._papx = papx.getSprmBuf();
        this._istd = papx.getIstd();
    }

    public Paragraph(PAPX papx, Range range, int i10) {
        super(Math.max(range._start, i10), Math.min(range._end, papx.getEnd()), range);
        this._props = papx.getParagraphProperties(this._doc.getStyleSheet());
        this._papx = papx.getSprmBuf();
        this._istd = papx.getIstd();
    }
}
