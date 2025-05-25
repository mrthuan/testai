package lib.zj.office.fc.hssf.record.aggregates;

import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.formula.ptg.AreaErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.CFHeaderRecord;
import lib.zj.office.fc.hssf.record.CFRuleRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public final class CFRecordsAggregate extends RecordAggregate {
    private static final int MAX_CONDTIONAL_FORMAT_RULES = 3;
    private final CFHeaderRecord header;
    private final List rules;

    private CFRecordsAggregate(CFHeaderRecord cFHeaderRecord, CFRuleRecord[] cFRuleRecordArr) {
        if (cFHeaderRecord == null) {
            throw new IllegalArgumentException("header must not be null");
        }
        if (cFRuleRecordArr != null) {
            if (cFRuleRecordArr.length <= 3) {
                if (cFRuleRecordArr.length == cFHeaderRecord.getNumberOfConditionalFormats()) {
                    this.header = cFHeaderRecord;
                    this.rules = new ArrayList(3);
                    for (CFRuleRecord cFRuleRecord : cFRuleRecordArr) {
                        this.rules.add(cFRuleRecord);
                    }
                    return;
                }
                throw new RuntimeException("Mismatch number of rules");
            }
            throw new IllegalArgumentException("No more than 3 rules may be specified");
        }
        throw new IllegalArgumentException("rules must not be null");
    }

    private void checkRuleIndex(int i10) {
        if (i10 >= 0 && i10 < this.rules.size()) {
            return;
        }
        StringBuilder e10 = d.e("Bad rule record index (", i10, ") nRules=");
        e10.append(this.rules.size());
        throw new IllegalArgumentException(e10.toString());
    }

    public static CFRecordsAggregate createCFAggregate(RecordStream recordStream) {
        Record next = recordStream.getNext();
        if (next.getSid() == 432) {
            CFHeaderRecord cFHeaderRecord = (CFHeaderRecord) next;
            int numberOfConditionalFormats = cFHeaderRecord.getNumberOfConditionalFormats();
            CFRuleRecord[] cFRuleRecordArr = new CFRuleRecord[numberOfConditionalFormats];
            for (int i10 = 0; i10 < numberOfConditionalFormats; i10++) {
                cFRuleRecordArr[i10] = (CFRuleRecord) recordStream.getNext();
            }
            return new CFRecordsAggregate(cFHeaderRecord, cFRuleRecordArr);
        }
        throw new IllegalStateException("next record sid was " + ((int) next.getSid()) + " instead of 432 as expected");
    }

    private static HSSFCellRangeAddress shiftRange(FormulaShifter formulaShifter, HSSFCellRangeAddress hSSFCellRangeAddress, int i10) {
        Ptg[] ptgArr = {new AreaPtg(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastColumn(), false, false, false, false)};
        if (!formulaShifter.adjustFormula(ptgArr, i10)) {
            return hSSFCellRangeAddress;
        }
        Ptg ptg = ptgArr[0];
        if (ptg instanceof AreaPtg) {
            AreaPtg areaPtg = (AreaPtg) ptg;
            return new HSSFCellRangeAddress(areaPtg.getFirstRow(), areaPtg.getLastRow(), areaPtg.getFirstColumn(), areaPtg.getLastColumn());
        } else if (ptg instanceof AreaErrPtg) {
            return null;
        } else {
            throw new IllegalStateException("Unexpected shifted ptg class (" + ptg.getClass().getName() + ")");
        }
    }

    public void addRule(CFRuleRecord cFRuleRecord) {
        if (cFRuleRecord != null) {
            if (this.rules.size() < 3) {
                this.rules.add(cFRuleRecord);
                this.header.setNumberOfConditionalFormats(this.rules.size());
                return;
            }
            throw new IllegalStateException("Cannot have more than 3 conditional format rules");
        }
        throw new IllegalArgumentException("r must not be null");
    }

    public CFRecordsAggregate cloneCFAggregate() {
        int size = this.rules.size();
        CFRuleRecord[] cFRuleRecordArr = new CFRuleRecord[size];
        for (int i10 = 0; i10 < size; i10++) {
            cFRuleRecordArr[i10] = (CFRuleRecord) getRule(i10).clone();
        }
        return new CFRecordsAggregate((CFHeaderRecord) this.header.clone(), cFRuleRecordArr);
    }

    public CFHeaderRecord getHeader() {
        return this.header;
    }

    public int getNumberOfRules() {
        return this.rules.size();
    }

    public CFRuleRecord getRule(int i10) {
        checkRuleIndex(i10);
        return (CFRuleRecord) this.rules.get(i10);
    }

    public void setRule(int i10, CFRuleRecord cFRuleRecord) {
        if (cFRuleRecord != null) {
            checkRuleIndex(i10);
            this.rules.set(i10, cFRuleRecord);
            return;
        }
        throw new IllegalArgumentException("r must not be null");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CF]\n");
        CFHeaderRecord cFHeaderRecord = this.header;
        if (cFHeaderRecord != null) {
            stringBuffer.append(cFHeaderRecord.toString());
        }
        for (int i10 = 0; i10 < this.rules.size(); i10++) {
            stringBuffer.append(((CFRuleRecord) this.rules.get(i10)).toString());
        }
        stringBuffer.append("[/CF]\n");
        return stringBuffer.toString();
    }

    public boolean updateFormulasAfterCellShift(FormulaShifter formulaShifter, int i10) {
        HSSFCellRangeAddress[] cellRanges = this.header.getCellRanges();
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (HSSFCellRangeAddress hSSFCellRangeAddress : cellRanges) {
            HSSFCellRangeAddress shiftRange = shiftRange(formulaShifter, hSSFCellRangeAddress, i10);
            if (shiftRange != null) {
                arrayList.add(shiftRange);
                if (shiftRange == hSSFCellRangeAddress) {
                }
            }
            z10 = true;
        }
        if (z10) {
            int size = arrayList.size();
            if (size == 0) {
                return false;
            }
            HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[size];
            arrayList.toArray(hSSFCellRangeAddressArr);
            this.header.setCellRanges(hSSFCellRangeAddressArr);
        }
        for (int i11 = 0; i11 < this.rules.size(); i11++) {
            CFRuleRecord cFRuleRecord = (CFRuleRecord) this.rules.get(i11);
            Ptg[] parsedExpression1 = cFRuleRecord.getParsedExpression1();
            if (parsedExpression1 != null && formulaShifter.adjustFormula(parsedExpression1, i10)) {
                cFRuleRecord.setParsedExpression1(parsedExpression1);
            }
            Ptg[] parsedExpression2 = cFRuleRecord.getParsedExpression2();
            if (parsedExpression2 != null && formulaShifter.adjustFormula(parsedExpression2, i10)) {
                cFRuleRecord.setParsedExpression2(parsedExpression2);
            }
        }
        return true;
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        recordVisitor.visitRecord(this.header);
        for (int i10 = 0; i10 < this.rules.size(); i10++) {
            recordVisitor.visitRecord((CFRuleRecord) this.rules.get(i10));
        }
    }

    public CFRecordsAggregate(HSSFCellRangeAddress[] hSSFCellRangeAddressArr, CFRuleRecord[] cFRuleRecordArr) {
        this(new CFHeaderRecord(hSSFCellRangeAddressArr, cFRuleRecordArr.length), cFRuleRecordArr);
    }
}
