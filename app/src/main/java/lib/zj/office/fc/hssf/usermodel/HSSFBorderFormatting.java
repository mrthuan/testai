package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.ss.usermodel.BorderFormatting;

/* loaded from: classes3.dex */
public final class HSSFBorderFormatting implements BorderFormatting {
    private final lib.zj.office.fc.hssf.record.cf.BorderFormatting borderFormatting;
    private final CFRuleRecord cfRuleRecord;

    public HSSFBorderFormatting(CFRuleRecord cFRuleRecord) {
        this.cfRuleRecord = cFRuleRecord;
        this.borderFormatting = cFRuleRecord.getBorderFormatting();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBorderBottom() {
        return (short) this.borderFormatting.getBorderBottom();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBorderDiagonal() {
        return (short) this.borderFormatting.getBorderDiagonal();
    }

    public lib.zj.office.fc.hssf.record.cf.BorderFormatting getBorderFormattingBlock() {
        return this.borderFormatting;
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBorderLeft() {
        return (short) this.borderFormatting.getBorderLeft();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBorderRight() {
        return (short) this.borderFormatting.getBorderRight();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBorderTop() {
        return (short) this.borderFormatting.getBorderTop();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getBottomBorderColor() {
        return (short) this.borderFormatting.getBottomBorderColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getDiagonalBorderColor() {
        return (short) this.borderFormatting.getDiagonalBorderColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getLeftBorderColor() {
        return (short) this.borderFormatting.getLeftBorderColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getRightBorderColor() {
        return (short) this.borderFormatting.getRightBorderColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public short getTopBorderColor() {
        return (short) this.borderFormatting.getTopBorderColor();
    }

    public boolean isBackwardDiagonalOn() {
        return this.borderFormatting.isBackwardDiagonalOn();
    }

    public boolean isForwardDiagonalOn() {
        return this.borderFormatting.isForwardDiagonalOn();
    }

    public void setBackwardDiagonalOn(boolean z10) {
        this.borderFormatting.setBackwardDiagonalOn(z10);
        if (z10) {
            this.cfRuleRecord.setTopLeftBottomRightBorderModified(z10);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBorderBottom(short s4) {
        this.borderFormatting.setBorderBottom(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setBottomBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBorderDiagonal(short s4) {
        this.borderFormatting.setBorderDiagonal(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setBottomLeftTopRightBorderModified(true);
            this.cfRuleRecord.setTopLeftBottomRightBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBorderLeft(short s4) {
        this.borderFormatting.setBorderLeft(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setLeftBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBorderRight(short s4) {
        this.borderFormatting.setBorderRight(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setRightBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBorderTop(short s4) {
        this.borderFormatting.setBorderTop(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setTopBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setBottomBorderColor(short s4) {
        this.borderFormatting.setBottomBorderColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setBottomBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setDiagonalBorderColor(short s4) {
        this.borderFormatting.setDiagonalBorderColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setBottomLeftTopRightBorderModified(true);
            this.cfRuleRecord.setTopLeftBottomRightBorderModified(true);
        }
    }

    public void setForwardDiagonalOn(boolean z10) {
        this.borderFormatting.setForwardDiagonalOn(z10);
        if (z10) {
            this.cfRuleRecord.setBottomLeftTopRightBorderModified(z10);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setLeftBorderColor(short s4) {
        this.borderFormatting.setLeftBorderColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setLeftBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setRightBorderColor(short s4) {
        this.borderFormatting.setRightBorderColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setRightBorderModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.BorderFormatting
    public void setTopBorderColor(short s4) {
        this.borderFormatting.setTopBorderColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setTopBorderModified(true);
        }
    }
}
