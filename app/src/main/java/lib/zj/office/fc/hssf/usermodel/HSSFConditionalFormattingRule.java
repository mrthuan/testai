package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.hssf.record.cf.BorderFormatting;
import lib.zj.office.fc.hssf.record.cf.FontFormatting;
import lib.zj.office.fc.hssf.record.cf.PatternFormatting;
import lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule;

/* loaded from: classes3.dex */
public final class HSSFConditionalFormattingRule implements ConditionalFormattingRule {
    private static final byte CELL_COMPARISON = 1;
    private final CFRuleRecord cfRuleRecord;
    private final HSSFWorkbook workbook;

    public HSSFConditionalFormattingRule(HSSFWorkbook hSSFWorkbook, CFRuleRecord cFRuleRecord) {
        if (hSSFWorkbook != null) {
            if (cFRuleRecord != null) {
                this.workbook = hSSFWorkbook;
                this.cfRuleRecord = cFRuleRecord;
                return;
            }
            throw new IllegalArgumentException("pRuleRecord must not be null");
        }
        throw new IllegalArgumentException("pWorkbook must not be null");
    }

    private String toFormulaString(Ptg[] ptgArr) {
        return null;
    }

    public CFRuleRecord getCfRuleRecord() {
        return this.cfRuleRecord;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public byte getComparisonOperation() {
        return this.cfRuleRecord.getComparisonOperation();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public byte getConditionType() {
        return this.cfRuleRecord.getConditionType();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public String getFormula1() {
        return toFormulaString(this.cfRuleRecord.getParsedExpression1());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public String getFormula2() {
        if (this.cfRuleRecord.getConditionType() == 1) {
            byte comparisonOperation = this.cfRuleRecord.getComparisonOperation();
            if (comparisonOperation == 1 || comparisonOperation == 2) {
                return toFormulaString(this.cfRuleRecord.getParsedExpression2());
            }
            return null;
        }
        return null;
    }

    private HSSFBorderFormatting getBorderFormatting(boolean z10) {
        BorderFormatting borderFormatting = this.cfRuleRecord.getBorderFormatting();
        if (borderFormatting != null) {
            this.cfRuleRecord.setBorderFormatting(borderFormatting);
            return new HSSFBorderFormatting(this.cfRuleRecord);
        } else if (z10) {
            this.cfRuleRecord.setBorderFormatting(new BorderFormatting());
            return new HSSFBorderFormatting(this.cfRuleRecord);
        } else {
            return null;
        }
    }

    private HSSFFontFormatting getFontFormatting(boolean z10) {
        FontFormatting fontFormatting = this.cfRuleRecord.getFontFormatting();
        if (fontFormatting != null) {
            this.cfRuleRecord.setFontFormatting(fontFormatting);
            return new HSSFFontFormatting(this.cfRuleRecord);
        } else if (z10) {
            this.cfRuleRecord.setFontFormatting(new FontFormatting());
            return new HSSFFontFormatting(this.cfRuleRecord);
        } else {
            return null;
        }
    }

    private HSSFPatternFormatting getPatternFormatting(boolean z10) {
        PatternFormatting patternFormatting = this.cfRuleRecord.getPatternFormatting();
        if (patternFormatting != null) {
            this.cfRuleRecord.setPatternFormatting(patternFormatting);
            return new HSSFPatternFormatting(this.cfRuleRecord);
        } else if (z10) {
            this.cfRuleRecord.setPatternFormatting(new PatternFormatting());
            return new HSSFPatternFormatting(this.cfRuleRecord);
        } else {
            return null;
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFBorderFormatting createBorderFormatting() {
        return getBorderFormatting(true);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFFontFormatting createFontFormatting() {
        return getFontFormatting(true);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFPatternFormatting createPatternFormatting() {
        return getPatternFormatting(true);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFBorderFormatting getBorderFormatting() {
        return getBorderFormatting(false);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFFontFormatting getFontFormatting() {
        return getFontFormatting(false);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule
    public HSSFPatternFormatting getPatternFormatting() {
        return getPatternFormatting(false);
    }
}
