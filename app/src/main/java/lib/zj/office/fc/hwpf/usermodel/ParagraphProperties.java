package lib.zj.office.fc.hwpf.usermodel;

import lib.zj.office.fc.hwpf.model.types.PAPAbstractType;

/* loaded from: classes3.dex */
public final class ParagraphProperties extends PAPAbstractType implements Cloneable {
    private boolean jcLogical = false;
    private short tabClearPosition;

    public ParagraphProperties() {
        setAnld(new byte[84]);
        setPhe(new byte[12]);
    }

    public Object clone() {
        ParagraphProperties paragraphProperties = (ParagraphProperties) super.clone();
        paragraphProperties.setAnld((byte[]) getAnld().clone());
        paragraphProperties.setBrcTop((BorderCode) getBrcTop().clone());
        paragraphProperties.setBrcLeft((BorderCode) getBrcLeft().clone());
        paragraphProperties.setBrcBottom((BorderCode) getBrcBottom().clone());
        paragraphProperties.setBrcRight((BorderCode) getBrcRight().clone());
        paragraphProperties.setBrcBetween((BorderCode) getBrcBetween().clone());
        paragraphProperties.setBrcBar((BorderCode) getBrcBar().clone());
        paragraphProperties.setDcs(getDcs().clone());
        paragraphProperties.setLspd((LineSpacingDescriptor) getLspd().clone());
        paragraphProperties.setShd((ShadingDescriptor) getShd().clone());
        paragraphProperties.setPhe((byte[]) getPhe().clone());
        return paragraphProperties;
    }

    public BorderCode getBarBorder() {
        return super.getBrcBar();
    }

    public BorderCode getBottomBorder() {
        return super.getBrcBottom();
    }

    public DropCapSpecifier getDropCap() {
        return super.getDcs();
    }

    public int getFirstLineIndent() {
        return super.getDxaLeft1();
    }

    public int getFontAlignment() {
        return super.getWAlignFont();
    }

    public int getIndentFromLeft() {
        return super.getDxaLeft();
    }

    public int getIndentFromRight() {
        return super.getDxaRight();
    }

    public int getJustification() {
        if (this.jcLogical) {
            if (!getFBiDi()) {
                return getJc();
            }
            byte jc2 = getJc();
            if (jc2 == 0) {
                return 2;
            }
            if (jc2 != 2) {
                return getJc();
            }
            return 0;
        }
        return getJc();
    }

    public BorderCode getLeftBorder() {
        return super.getBrcLeft();
    }

    public LineSpacingDescriptor getLineSpacing() {
        return super.getLspd();
    }

    public BorderCode getRightBorder() {
        return super.getBrcRight();
    }

    public ShadingDescriptor getShading() {
        return super.getShd();
    }

    public int getSpacingAfter() {
        return super.getDyaAfter();
    }

    public int getSpacingBefore() {
        return super.getDyaBefore();
    }

    public short getTabClearPosition() {
        return this.tabClearPosition;
    }

    public BorderCode getTopBorder() {
        return super.getBrcTop();
    }

    public boolean isAutoHyphenated() {
        return !super.getFNoAutoHyph();
    }

    public boolean isBackward() {
        return super.isFBackward();
    }

    public boolean isKinsoku() {
        return super.getFKinsoku();
    }

    public boolean isLineNotNumbered() {
        return super.getFNoLnn();
    }

    public boolean isSideBySide() {
        return super.getFSideBySide();
    }

    public boolean isVertical() {
        return super.isFVertical();
    }

    public boolean isWidowControlled() {
        return super.getFWidowControl();
    }

    public boolean isWordWrapped() {
        return super.getFWordWrap();
    }

    public boolean keepOnPage() {
        return super.getFKeep();
    }

    public boolean keepWithNext() {
        return super.getFKeepFollow();
    }

    public boolean pageBreakBefore() {
        return super.getFPageBreakBefore();
    }

    public void setAutoHyphenated(boolean z10) {
        super.setFNoAutoHyph(!z10);
    }

    public void setBackward(boolean z10) {
        super.setFBackward(z10);
    }

    public void setBarBorder(BorderCode borderCode) {
        super.setBrcBar(borderCode);
    }

    public void setBottomBorder(BorderCode borderCode) {
        super.setBrcBottom(borderCode);
    }

    public void setDropCap(DropCapSpecifier dropCapSpecifier) {
        super.setDcs(dropCapSpecifier);
    }

    public void setFirstLineIndent(int i10) {
        super.setDxaLeft1(i10);
    }

    public void setFontAlignment(int i10) {
        super.setWAlignFont(i10);
    }

    public void setIndentFromLeft(int i10) {
        super.setDxaLeft(i10);
    }

    public void setIndentFromRight(int i10) {
        super.setDxaRight(i10);
    }

    public void setJustification(byte b10) {
        super.setJc(b10);
        this.jcLogical = false;
    }

    public void setJustificationLogical(byte b10) {
        super.setJc(b10);
        this.jcLogical = true;
    }

    public void setKeepOnPage(boolean z10) {
        super.setFKeep(z10);
    }

    public void setKeepWithNext(boolean z10) {
        super.setFKeepFollow(z10);
    }

    public void setKinsoku(boolean z10) {
        super.setFKinsoku(z10);
    }

    public void setLeftBorder(BorderCode borderCode) {
        super.setBrcLeft(borderCode);
    }

    public void setLineNotNumbered(boolean z10) {
        super.setFNoLnn(z10);
    }

    public void setLineSpacing(LineSpacingDescriptor lineSpacingDescriptor) {
        super.setLspd(lineSpacingDescriptor);
    }

    public void setPageBreakBefore(boolean z10) {
        super.setFPageBreakBefore(z10);
    }

    public void setRightBorder(BorderCode borderCode) {
        super.setBrcRight(borderCode);
    }

    public void setShading(ShadingDescriptor shadingDescriptor) {
        super.setShd(shadingDescriptor);
    }

    public void setSideBySide(boolean z10) {
        super.setFSideBySide(z10);
    }

    public void setSpacingAfter(int i10) {
        super.setDyaAfter(i10);
    }

    public void setSpacingBefore(int i10) {
        super.setDyaBefore(i10);
    }

    public void setTabClearPosition(short s4) {
        this.tabClearPosition = s4;
    }

    public void setTopBorder(BorderCode borderCode) {
        super.setBrcTop(borderCode);
    }

    public void setVertical(boolean z10) {
        super.setFVertical(z10);
    }

    public void setWidowControl(boolean z10) {
        super.setFWidowControl(z10);
    }

    public void setWordWrapped(boolean z10) {
        super.setFWordWrap(z10);
    }
}
