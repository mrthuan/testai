package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.ss.usermodel.FontFormatting;

/* loaded from: classes3.dex */
public final class HSSFFontFormatting implements FontFormatting {
    public static final byte U_DOUBLE = 2;
    public static final byte U_DOUBLE_ACCOUNTING = 34;
    public static final byte U_NONE = 0;
    public static final byte U_SINGLE = 1;
    public static final byte U_SINGLE_ACCOUNTING = 33;
    private final lib.zj.office.fc.hssf.record.cf.FontFormatting fontFormatting;

    public HSSFFontFormatting(CFRuleRecord cFRuleRecord) {
        this.fontFormatting = cFRuleRecord.getFontFormatting();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public short getEscapementType() {
        return this.fontFormatting.getEscapementType();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public short getFontColorIndex() {
        return this.fontFormatting.getFontColorIndex();
    }

    public lib.zj.office.fc.hssf.record.cf.FontFormatting getFontFormattingBlock() {
        return this.fontFormatting;
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public int getFontHeight() {
        return this.fontFormatting.getFontHeight();
    }

    public short getFontWeight() {
        return this.fontFormatting.getFontWeight();
    }

    public byte[] getRawRecord() {
        return this.fontFormatting.getRawRecord();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public short getUnderlineType() {
        return this.fontFormatting.getUnderlineType();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public boolean isBold() {
        if (this.fontFormatting.isFontWeightModified() && this.fontFormatting.isBold()) {
            return true;
        }
        return false;
    }

    public boolean isEscapementTypeModified() {
        return this.fontFormatting.isEscapementTypeModified();
    }

    public boolean isFontCancellationModified() {
        return this.fontFormatting.isFontCancellationModified();
    }

    public boolean isFontOutlineModified() {
        return this.fontFormatting.isFontOutlineModified();
    }

    public boolean isFontShadowModified() {
        return this.fontFormatting.isFontShadowModified();
    }

    public boolean isFontStyleModified() {
        return this.fontFormatting.isFontStyleModified();
    }

    public boolean isFontWeightModified() {
        return this.fontFormatting.isFontWeightModified();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public boolean isItalic() {
        if (this.fontFormatting.isFontStyleModified() && this.fontFormatting.isItalic()) {
            return true;
        }
        return false;
    }

    public boolean isOutlineOn() {
        if (this.fontFormatting.isFontOutlineModified() && this.fontFormatting.isOutlineOn()) {
            return true;
        }
        return false;
    }

    public boolean isShadowOn() {
        if (this.fontFormatting.isFontOutlineModified() && this.fontFormatting.isShadowOn()) {
            return true;
        }
        return false;
    }

    public boolean isStruckout() {
        if (this.fontFormatting.isFontCancellationModified() && this.fontFormatting.isStruckout()) {
            return true;
        }
        return false;
    }

    public boolean isUnderlineTypeModified() {
        return this.fontFormatting.isUnderlineTypeModified();
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void resetFontStyle() {
        setFontStyle(false, false);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void setEscapementType(short s4) {
        if (s4 != 0) {
            if (s4 == 1 || s4 == 2) {
                this.fontFormatting.setEscapementType(s4);
                this.fontFormatting.setEscapementTypeModified(true);
                return;
            }
            return;
        }
        this.fontFormatting.setEscapementType(s4);
        this.fontFormatting.setEscapementTypeModified(false);
    }

    public void setEscapementTypeModified(boolean z10) {
        this.fontFormatting.setEscapementTypeModified(z10);
    }

    public void setFontCancellationModified(boolean z10) {
        this.fontFormatting.setFontCancellationModified(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void setFontColorIndex(short s4) {
        this.fontFormatting.setFontColorIndex(s4);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void setFontHeight(int i10) {
        this.fontFormatting.setFontHeight(i10);
    }

    public void setFontOutlineModified(boolean z10) {
        this.fontFormatting.setFontOutlineModified(z10);
    }

    public void setFontShadowModified(boolean z10) {
        this.fontFormatting.setFontShadowModified(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void setFontStyle(boolean z10, boolean z11) {
        boolean z12;
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.fontFormatting.setItalic(z10);
        this.fontFormatting.setBold(z11);
        this.fontFormatting.setFontStyleModified(z12);
        this.fontFormatting.setFontWieghtModified(z12);
    }

    public void setFontStyleModified(boolean z10) {
        this.fontFormatting.setFontStyleModified(z10);
    }

    public void setOutline(boolean z10) {
        this.fontFormatting.setOutline(z10);
        this.fontFormatting.setFontOutlineModified(z10);
    }

    public void setShadow(boolean z10) {
        this.fontFormatting.setShadow(z10);
        this.fontFormatting.setFontShadowModified(z10);
    }

    public void setStrikeout(boolean z10) {
        this.fontFormatting.setStrikeout(z10);
        this.fontFormatting.setFontCancellationModified(z10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.FontFormatting
    public void setUnderlineType(short s4) {
        if (s4 != 0) {
            if (s4 == 1 || s4 == 2 || s4 == 33 || s4 == 34) {
                this.fontFormatting.setUnderlineType(s4);
                setUnderlineTypeModified(true);
                return;
            }
            return;
        }
        this.fontFormatting.setUnderlineType(s4);
        setUnderlineTypeModified(false);
    }

    public void setUnderlineTypeModified(boolean z10) {
        this.fontFormatting.setUnderlineTypeModified(z10);
    }
}
