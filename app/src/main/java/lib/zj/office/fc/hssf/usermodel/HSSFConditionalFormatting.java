package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.aggregates.CFRecordsAggregate;
import lib.zj.office.fc.ss.usermodel.ConditionalFormatting;
import lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.ss.util.Region;

/* loaded from: classes3.dex */
public final class HSSFConditionalFormatting implements ConditionalFormatting {
    private final HSSFWorkbook _workbook;
    private final CFRecordsAggregate cfAggregate;

    public HSSFConditionalFormatting(HSSFWorkbook hSSFWorkbook, CFRecordsAggregate cFRecordsAggregate) {
        if (hSSFWorkbook != null) {
            if (cFRecordsAggregate != null) {
                this._workbook = hSSFWorkbook;
                this.cfAggregate = cFRecordsAggregate;
                return;
            }
            throw new IllegalArgumentException("cfAggregate must not be null");
        }
        throw new IllegalArgumentException("workbook must not be null");
    }

    public void addRule(HSSFConditionalFormattingRule hSSFConditionalFormattingRule) {
        this.cfAggregate.addRule(hSSFConditionalFormattingRule.getCfRuleRecord());
    }

    public CFRecordsAggregate getCFRecordsAggregate() {
        return this.cfAggregate;
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormatting
    public HSSFCellRangeAddress[] getFormattingRanges() {
        return this.cfAggregate.getHeader().getCellRanges();
    }

    public Region[] getFormattingRegions() {
        return Region.convertCellRangesToRegions(getFormattingRanges());
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormatting
    public int getNumberOfRules() {
        return this.cfAggregate.getNumberOfRules();
    }

    public void setRule(int i10, HSSFConditionalFormattingRule hSSFConditionalFormattingRule) {
        this.cfAggregate.setRule(i10, hSSFConditionalFormattingRule.getCfRuleRecord());
    }

    public String toString() {
        return this.cfAggregate.toString();
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormatting
    public void addRule(ConditionalFormattingRule conditionalFormattingRule) {
        addRule((HSSFConditionalFormattingRule) conditionalFormattingRule);
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormatting
    public HSSFConditionalFormattingRule getRule(int i10) {
        return new HSSFConditionalFormattingRule(this._workbook, this.cfAggregate.getRule(i10));
    }

    @Override // lib.zj.office.fc.ss.usermodel.ConditionalFormatting
    public void setRule(int i10, ConditionalFormattingRule conditionalFormattingRule) {
        setRule(i10, (HSSFConditionalFormattingRule) conditionalFormattingRule);
    }
}
