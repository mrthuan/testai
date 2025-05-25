package lib.zj.office.fc.hssf.record.common;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FeatFormulaErr2 implements SharedFeature {
    private int errorCheck;
    static BitField checkCalculationErrors = BitFieldFactory.getInstance(1);
    static BitField checkEmptyCellRef = BitFieldFactory.getInstance(2);
    static BitField checkNumbersAsText = BitFieldFactory.getInstance(4);
    static BitField checkInconsistentRanges = BitFieldFactory.getInstance(8);
    static BitField checkInconsistentFormulas = BitFieldFactory.getInstance(16);
    static BitField checkDateTimeFormats = BitFieldFactory.getInstance(32);
    static BitField checkUnprotectedFormulas = BitFieldFactory.getInstance(64);
    static BitField performDataValidation = BitFieldFactory.getInstance(128);

    public FeatFormulaErr2() {
    }

    public FeatFormulaErr2(RecordInputStream recordInputStream) {
        this.errorCheck = recordInputStream.readInt();
    }

    public int _getRawErrorCheckValue() {
        return this.errorCheck;
    }

    public boolean getCheckCalculationErrors() {
        return checkCalculationErrors.isSet(this.errorCheck);
    }

    public boolean getCheckDateTimeFormats() {
        return checkDateTimeFormats.isSet(this.errorCheck);
    }

    public boolean getCheckEmptyCellRef() {
        return checkEmptyCellRef.isSet(this.errorCheck);
    }

    public boolean getCheckInconsistentFormulas() {
        return checkInconsistentFormulas.isSet(this.errorCheck);
    }

    public boolean getCheckInconsistentRanges() {
        return checkInconsistentRanges.isSet(this.errorCheck);
    }

    public boolean getCheckNumbersAsText() {
        return checkNumbersAsText.isSet(this.errorCheck);
    }

    public boolean getCheckUnprotectedFormulas() {
        return checkUnprotectedFormulas.isSet(this.errorCheck);
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public int getDataSize() {
        return 4;
    }

    public boolean getPerformDataValidation() {
        return performDataValidation.isSet(this.errorCheck);
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.errorCheck);
    }

    public void setCheckCalculationErrors(boolean z10) {
        checkCalculationErrors.setBoolean(this.errorCheck, z10);
    }

    public void setCheckDateTimeFormats(boolean z10) {
        checkDateTimeFormats.setBoolean(this.errorCheck, z10);
    }

    public void setCheckEmptyCellRef(boolean z10) {
        checkEmptyCellRef.setBoolean(this.errorCheck, z10);
    }

    public void setCheckInconsistentFormulas(boolean z10) {
        checkInconsistentFormulas.setBoolean(this.errorCheck, z10);
    }

    public void setCheckInconsistentRanges(boolean z10) {
        checkInconsistentRanges.setBoolean(this.errorCheck, z10);
    }

    public void setCheckNumbersAsText(boolean z10) {
        checkNumbersAsText.setBoolean(this.errorCheck, z10);
    }

    public void setCheckUnprotectedFormulas(boolean z10) {
        checkUnprotectedFormulas.setBoolean(this.errorCheck, z10);
    }

    public void setPerformDataValidation(boolean z10) {
        performDataValidation.setBoolean(this.errorCheck, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.common.SharedFeature
    public String toString() {
        return " [FEATURE FORMULA ERRORS]\n  checkCalculationErrors    =   checkEmptyCellRef         =   checkNumbersAsText        =   checkInconsistentRanges   =   checkInconsistentFormulas =   checkDateTimeFormats      =   checkUnprotectedFormulas  =   performDataValidation     =  [/FEATURE FORMULA ERRORS]\n";
    }
}
