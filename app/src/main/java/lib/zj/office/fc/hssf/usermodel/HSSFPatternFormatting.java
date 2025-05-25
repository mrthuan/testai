package lib.zj.office.fc.hssf.usermodel;

import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.ss.usermodel.PatternFormatting;

/* loaded from: classes3.dex */
public class HSSFPatternFormatting implements PatternFormatting {
    private final CFRuleRecord cfRuleRecord;
    private final lib.zj.office.fc.hssf.record.cf.PatternFormatting patternFormatting;

    public HSSFPatternFormatting(CFRuleRecord cFRuleRecord) {
        this.cfRuleRecord = cFRuleRecord;
        this.patternFormatting = cFRuleRecord.getPatternFormatting();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public short getFillBackgroundColor() {
        return (short) this.patternFormatting.getFillBackgroundColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public short getFillForegroundColor() {
        return (short) this.patternFormatting.getFillForegroundColor();
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public short getFillPattern() {
        return (short) this.patternFormatting.getFillPattern();
    }

    public lib.zj.office.fc.hssf.record.cf.PatternFormatting getPatternFormattingBlock() {
        return this.patternFormatting;
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public void setFillBackgroundColor(short s4) {
        this.patternFormatting.setFillBackgroundColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setPatternBackgroundColorModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public void setFillForegroundColor(short s4) {
        this.patternFormatting.setFillForegroundColor(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setPatternColorModified(true);
        }
    }

    @Override // lib.zj.office.fc.ss.usermodel.PatternFormatting
    public void setFillPattern(short s4) {
        this.patternFormatting.setFillPattern(s4);
        if (s4 != 0) {
            this.cfRuleRecord.setPatternStyleModified(true);
        }
    }
}
