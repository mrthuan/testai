package lib.zj.office.fc.hssf.record.aggregates;

import lib.zj.office.fc.hssf.formula.Formula;
import lib.zj.office.fc.hssf.formula.ptg.ExpPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.record.ArrayRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.RecordFormatException;
import lib.zj.office.fc.hssf.record.SharedFormulaRecord;
import lib.zj.office.fc.hssf.record.SharedValueRecordBase;
import lib.zj.office.fc.hssf.record.StringRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public final class FormulaRecordAggregate extends RecordAggregate implements CellValueRecordInterface {
    private final FormulaRecord _formulaRecord;
    private SharedFormulaRecord _sharedFormulaRecord;
    private SharedValueManager _sharedValueManager;
    private StringRecord _stringRecord;

    public FormulaRecordAggregate(FormulaRecord formulaRecord, StringRecord stringRecord, SharedValueManager sharedValueManager) {
        if (sharedValueManager != null) {
            if (formulaRecord.hasCachedResultString()) {
                if (stringRecord != null) {
                    this._stringRecord = stringRecord;
                } else {
                    throw new RecordFormatException("Formula record flag is set but String record was not found");
                }
            } else {
                this._stringRecord = null;
            }
            this._formulaRecord = formulaRecord;
            this._sharedValueManager = sharedValueManager;
            if (formulaRecord.isSharedFormula()) {
                CellReference expReference = formulaRecord.getFormula().getExpReference();
                if (expReference == null) {
                    handleMissingSharedFormulaRecord(formulaRecord);
                    return;
                } else {
                    this._sharedFormulaRecord = sharedValueManager.linkSharedFormulaRecord(expReference, this);
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("sfm must not be null");
    }

    private static void handleMissingSharedFormulaRecord(FormulaRecord formulaRecord) {
        if (!(formulaRecord.getParsedExpression()[0] instanceof ExpPtg)) {
            formulaRecord.setSharedFormula(false);
            return;
        }
        throw new RecordFormatException("SharedFormulaRecord not found for FormulaRecord with (isSharedFormula=true)");
    }

    public HSSFCellRangeAddress getArrayFormulaRange() {
        if (this._sharedFormulaRecord == null) {
            CellReference expReference = this._formulaRecord.getFormula().getExpReference();
            if (expReference != null) {
                ArrayRecord arrayRecord = this._sharedValueManager.getArrayRecord(expReference.getRow(), expReference.getCol());
                if (arrayRecord != null) {
                    CellRangeAddress8Bit range = arrayRecord.getRange();
                    return new HSSFCellRangeAddress(range.getFirstRow(), range.getLastRow(), range.getFirstColumn(), range.getLastColumn());
                }
                throw new IllegalStateException("ArrayRecord was not found for the locator " + expReference.formatAsString());
            }
            throw new IllegalStateException("not an array formula cell.");
        }
        throw new IllegalStateException("not an array formula cell.");
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getColumn() {
        return this._formulaRecord.getColumn();
    }

    public FormulaRecord getFormulaRecord() {
        return this._formulaRecord;
    }

    public Ptg[] getFormulaTokens() {
        SharedFormulaRecord sharedFormulaRecord = this._sharedFormulaRecord;
        if (sharedFormulaRecord != null) {
            return sharedFormulaRecord.getFormulaTokens(this._formulaRecord);
        }
        CellReference expReference = this._formulaRecord.getFormula().getExpReference();
        if (expReference != null) {
            return this._sharedValueManager.getArrayRecord(expReference.getRow(), expReference.getCol()).getFormulaTokens();
        }
        return this._formulaRecord.getParsedExpression();
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public int getRow() {
        return this._formulaRecord.getRow();
    }

    public StringRecord getStringRecord() {
        return this._stringRecord;
    }

    public String getStringValue() {
        StringRecord stringRecord = this._stringRecord;
        if (stringRecord == null) {
            return null;
        }
        return stringRecord.getString();
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getXFIndex() {
        return this._formulaRecord.getXFIndex();
    }

    public boolean isPartOfArrayFormula() {
        ArrayRecord arrayRecord;
        if (this._sharedFormulaRecord != null) {
            return false;
        }
        CellReference expReference = this._formulaRecord.getFormula().getExpReference();
        if (expReference == null) {
            arrayRecord = null;
        } else {
            arrayRecord = this._sharedValueManager.getArrayRecord(expReference.getRow(), expReference.getCol());
        }
        if (arrayRecord == null) {
            return false;
        }
        return true;
    }

    public void notifyFormulaChanging() {
        SharedFormulaRecord sharedFormulaRecord = this._sharedFormulaRecord;
        if (sharedFormulaRecord != null) {
            this._sharedValueManager.unlink(sharedFormulaRecord);
        }
    }

    public HSSFCellRangeAddress removeArrayFormula(int i10, int i11) {
        CellRangeAddress8Bit removeArrayFormula = this._sharedValueManager.removeArrayFormula(i10, i11);
        this._formulaRecord.setParsedExpression(null);
        return new HSSFCellRangeAddress(removeArrayFormula.getFirstRow(), removeArrayFormula.getLastRow(), removeArrayFormula.getFirstColumn(), removeArrayFormula.getLastColumn());
    }

    public void setArrayFormula(HSSFCellRangeAddress hSSFCellRangeAddress, Ptg[] ptgArr) {
        this._sharedValueManager.addArrayRecord(new ArrayRecord(Formula.create(ptgArr), new CellRangeAddress8Bit(hSSFCellRangeAddress.getFirstRow(), hSSFCellRangeAddress.getLastRow(), hSSFCellRangeAddress.getFirstColumn(), hSSFCellRangeAddress.getLastColumn())));
    }

    public void setCachedBooleanResult(boolean z10) {
        this._stringRecord = null;
        this._formulaRecord.setCachedResultBoolean(z10);
    }

    public void setCachedDoubleResult(double d10) {
        this._stringRecord = null;
        this._formulaRecord.setValue(d10);
    }

    public void setCachedErrorResult(int i10) {
        this._stringRecord = null;
        this._formulaRecord.setCachedResultErrorCode(i10);
    }

    public void setCachedStringResult(String str) {
        if (this._stringRecord == null) {
            this._stringRecord = new StringRecord();
        }
        this._stringRecord.setString(str);
        if (str.length() < 1) {
            this._formulaRecord.setCachedResultTypeEmptyString();
        } else {
            this._formulaRecord.setCachedResultTypeString();
        }
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setColumn(short s4) {
        this._formulaRecord.setColumn(s4);
    }

    public void setParsedExpression(Ptg[] ptgArr) {
        notifyFormulaChanging();
        this._formulaRecord.setParsedExpression(ptgArr);
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setRow(int i10) {
        this._formulaRecord.setRow(i10);
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setXFIndex(short s4) {
        this._formulaRecord.setXFIndex(s4);
    }

    public String toString() {
        return this._formulaRecord.toString();
    }

    public void unlinkSharedFormula() {
        SharedFormulaRecord sharedFormulaRecord = this._sharedFormulaRecord;
        if (sharedFormulaRecord != null) {
            this._formulaRecord.setParsedExpression(sharedFormulaRecord.getFormulaTokens(this._formulaRecord));
            this._formulaRecord.setSharedFormula(false);
            this._sharedFormulaRecord = null;
            return;
        }
        throw new IllegalStateException("Formula not linked to shared formula");
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        StringRecord stringRecord;
        recordVisitor.visitRecord(this._formulaRecord);
        SharedValueRecordBase recordForFirstCell = this._sharedValueManager.getRecordForFirstCell(this);
        if (recordForFirstCell != null) {
            recordVisitor.visitRecord(recordForFirstCell);
        }
        if (this._formulaRecord.hasCachedResultString() && (stringRecord = this._stringRecord) != null) {
            recordVisitor.visitRecord(stringRecord);
        }
    }
}
