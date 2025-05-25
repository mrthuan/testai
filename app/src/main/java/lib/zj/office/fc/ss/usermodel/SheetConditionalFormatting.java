package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public interface SheetConditionalFormatting {
    int addConditionalFormatting(ConditionalFormatting conditionalFormatting);

    int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule conditionalFormattingRule);

    int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule conditionalFormattingRule, ConditionalFormattingRule conditionalFormattingRule2);

    int addConditionalFormatting(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, ConditionalFormattingRule[] conditionalFormattingRuleArr);

    ConditionalFormattingRule createConditionalFormattingRule(byte b10, String str);

    ConditionalFormattingRule createConditionalFormattingRule(byte b10, String str, String str2);

    ConditionalFormattingRule createConditionalFormattingRule(String str);

    ConditionalFormatting getConditionalFormattingAt(int i10);

    int getNumConditionalFormattings();

    void removeConditionalFormatting(int i10);
}
