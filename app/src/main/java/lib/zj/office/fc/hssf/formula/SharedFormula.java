package lib.zj.office.fc.hssf.formula;

import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtgBase;
import lib.zj.office.fc.hssf.formula.ptg.OperandPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtgBase;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public class SharedFormula {
    private final int _columnWrappingMask;
    private final int _rowWrappingMask;

    public SharedFormula(SpreadsheetVersion spreadsheetVersion) {
        this._columnWrappingMask = spreadsheetVersion.getLastColumnIndex();
        this._rowWrappingMask = spreadsheetVersion.getLastRowIndex();
    }

    private int fixupRelativeColumn(int i10, int i11, boolean z10) {
        if (z10) {
            return this._columnWrappingMask & (i11 + i10);
        }
        return i11;
    }

    private int fixupRelativeRow(int i10, int i11, boolean z10) {
        if (z10) {
            return this._rowWrappingMask & (i11 + i10);
        }
        return i11;
    }

    public Ptg[] convertSharedFormulas(Ptg[] ptgArr, int i10, int i11) {
        byte b10;
        SharedFormula sharedFormula = this;
        Ptg[] ptgArr2 = new Ptg[ptgArr.length];
        int i12 = 0;
        while (i12 < ptgArr.length) {
            OperandPtg operandPtg = ptgArr[i12];
            if (!operandPtg.isBaseToken()) {
                b10 = operandPtg.getPtgClass();
            } else {
                b10 = -1;
            }
            if (operandPtg instanceof RefPtgBase) {
                RefPtgBase refPtgBase = (RefPtgBase) operandPtg;
                RefPtg refPtg = new RefPtg(sharedFormula.fixupRelativeRow(i10, refPtgBase.getRow(), refPtgBase.isRowRelative()), sharedFormula.fixupRelativeColumn(i11, refPtgBase.getColumn(), refPtgBase.isColRelative()), refPtgBase.isRowRelative(), refPtgBase.isColRelative());
                refPtg.setClass(b10);
                operandPtg = refPtg;
            } else if (operandPtg instanceof AreaPtgBase) {
                AreaPtgBase areaPtgBase = (AreaPtgBase) operandPtg;
                AreaPtg areaPtg = new AreaPtg(sharedFormula.fixupRelativeRow(i10, areaPtgBase.getFirstRow(), areaPtgBase.isFirstRowRelative()), sharedFormula.fixupRelativeRow(i10, areaPtgBase.getLastRow(), areaPtgBase.isLastRowRelative()), sharedFormula.fixupRelativeColumn(i11, areaPtgBase.getFirstColumn(), areaPtgBase.isFirstColRelative()), sharedFormula.fixupRelativeColumn(i11, areaPtgBase.getLastColumn(), areaPtgBase.isLastColRelative()), areaPtgBase.isFirstRowRelative(), areaPtgBase.isLastRowRelative(), areaPtgBase.isFirstColRelative(), areaPtgBase.isLastColRelative());
                areaPtg.setClass(b10);
                operandPtg = areaPtg;
            } else if (operandPtg instanceof OperandPtg) {
                operandPtg = ((OperandPtg) operandPtg).copy();
            }
            ptgArr2[i12] = operandPtg;
            i12++;
            sharedFormula = this;
        }
        return ptgArr2;
    }
}
