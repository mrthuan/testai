package lib.zj.office.fc.ss.usermodel;

import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public interface ConditionalFormatting {
    void addRule(ConditionalFormattingRule conditionalFormattingRule);

    HSSFCellRangeAddress[] getFormattingRanges();

    int getNumberOfRules();

    ConditionalFormattingRule getRule(int i10);

    void setRule(int i10, ConditionalFormattingRule conditionalFormattingRule);
}
