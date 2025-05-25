package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.hssf.record.aggregates.CFRecordsAggregate;
import lib.zj.office.fc.hssf.record.aggregates.ConditionalFormattingTable;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.usermodel.ConditionalFormatting;
import lib.zj.office.fc.ss.usermodel.ConditionalFormattingRule;
import lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;
import lib.zj.office.fc.ss.util.Region;

/* loaded from: classes3.dex */
public final class HSSFSheetConditionalFormatting implements SheetConditionalFormatting {
    private final ConditionalFormattingTable _conditionalFormattingTable;
    private final HSSFSheet _sheet;

    public HSSFSheetConditionalFormatting(HSSFSheet hSSFSheet) {
        this._sheet = hSSFSheet;
        this._conditionalFormattingTable = hSSFSheet.getSheet().getConditionalFormattingTable();
    }

    public int addConditionalFormatting(HSSFConditionalFormatting hSSFConditionalFormatting) {
        return this._conditionalFormattingTable.add(hSSFConditionalFormatting.getCFRecordsAggregate().cloneCFAggregate());
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public HSSFConditionalFormattingRule createConditionalFormattingRule(byte b10, String str) {
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public int getNumConditionalFormattings() {
        return this._conditionalFormattingTable.size();
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public void removeConditionalFormatting(int i10) {
        this._conditionalFormattingTable.remove(i10);
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public HSSFConditionalFormattingRule createConditionalFormattingRule(byte b10, String str, String str2) {
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public HSSFConditionalFormatting getConditionalFormattingAt(int i10) {
        CFRecordsAggregate cFRecordsAggregate = this._conditionalFormattingTable.get(i10);
        if (cFRecordsAggregate == null) {
            return null;
        }
        return new HSSFConditionalFormatting(this._sheet.getWorkbook(), cFRecordsAggregate);
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public int addConditionalFormatting(ConditionalFormatting conditionalFormatting) {
        return addConditionalFormatting((HSSFConditionalFormatting) conditionalFormatting);
    }

    public int addConditionalFormatting(Region[] regionArr, HSSFConditionalFormattingRule[] hSSFConditionalFormattingRuleArr) {
        return addConditionalFormatting(Region.convertRegionsToCellRanges(regionArr), hSSFConditionalFormattingRuleArr);
    }

    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, HSSFConditionalFormattingRule[] hSSFConditionalFormattingRuleArr) {
        if (hSSFCellRangeAddressArr != null) {
            for (HSSFCellRangeAddress hSSFCellRangeAddress : hSSFCellRangeAddressArr) {
                hSSFCellRangeAddress.validate(SpreadsheetVersion.EXCEL97);
            }
            if (hSSFConditionalFormattingRuleArr != null) {
                if (hSSFConditionalFormattingRuleArr.length != 0) {
                    if (hSSFConditionalFormattingRuleArr.length <= 3) {
                        CFRuleRecord[] cFRuleRecordArr = new CFRuleRecord[hSSFConditionalFormattingRuleArr.length];
                        for (int i10 = 0; i10 != hSSFConditionalFormattingRuleArr.length; i10++) {
                            cFRuleRecordArr[i10] = hSSFConditionalFormattingRuleArr[i10].getCfRuleRecord();
                        }
                        return this._conditionalFormattingTable.add(new CFRecordsAggregate(hSSFCellRangeAddressArr, cFRuleRecordArr));
                    }
                    throw new IllegalArgumentException("Number of rules must not exceed 3");
                }
                throw new IllegalArgumentException("cfRules must not be empty");
            }
            throw new IllegalArgumentException("cfRules must not be null");
        }
        throw new IllegalArgumentException("regions must not be null");
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public HSSFConditionalFormattingRule createConditionalFormattingRule(String str) {
        this._sheet.getWorkbook();
        return null;
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule[] conditionalFormattingRuleArr) {
        HSSFConditionalFormattingRule[] hSSFConditionalFormattingRuleArr;
        if (conditionalFormattingRuleArr instanceof HSSFConditionalFormattingRule[]) {
            hSSFConditionalFormattingRuleArr = (HSSFConditionalFormattingRule[]) conditionalFormattingRuleArr;
        } else {
            int length = conditionalFormattingRuleArr.length;
            HSSFConditionalFormattingRule[] hSSFConditionalFormattingRuleArr2 = new HSSFConditionalFormattingRule[length];
            System.arraycopy(conditionalFormattingRuleArr, 0, hSSFConditionalFormattingRuleArr2, 0, length);
            hSSFConditionalFormattingRuleArr = hSSFConditionalFormattingRuleArr2;
        }
        return addConditionalFormatting(hSSFCellRangeAddressArr, hSSFConditionalFormattingRuleArr);
    }

    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, HSSFConditionalFormattingRule hSSFConditionalFormattingRule) {
        return addConditionalFormatting(hSSFCellRangeAddressArr, hSSFConditionalFormattingRule == null ? null : new HSSFConditionalFormattingRule[]{hSSFConditionalFormattingRule});
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule conditionalFormattingRule) {
        return addConditionalFormatting(hSSFCellRangeAddressArr, (HSSFConditionalFormattingRule) conditionalFormattingRule);
    }

    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, HSSFConditionalFormattingRule hSSFConditionalFormattingRule, HSSFConditionalFormattingRule hSSFConditionalFormattingRule2) {
        return addConditionalFormatting(hSSFCellRangeAddressArr, new HSSFConditionalFormattingRule[]{hSSFConditionalFormattingRule, hSSFConditionalFormattingRule2});
    }

    @Override // lib.zj.office.fc.ss.usermodel.SheetConditionalFormatting
    public int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule conditionalFormattingRule, ConditionalFormattingRule conditionalFormattingRule2) {
        return addConditionalFormatting(hSSFCellRangeAddressArr, (HSSFConditionalFormattingRule) conditionalFormattingRule, (HSSFConditionalFormattingRule) conditionalFormattingRule2);
    }
}
