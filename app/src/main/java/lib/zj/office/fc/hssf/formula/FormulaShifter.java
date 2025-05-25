package lib.zj.office.fc.hssf.formula;

import a0.d;
import a6.h;
import lib.zj.office.fc.hssf.formula.ptg.Area2DPtgBase;
import lib.zj.office.fc.hssf.formula.ptg.Area3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaErrPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtg;
import lib.zj.office.fc.hssf.formula.ptg.AreaPtgBase;
import lib.zj.office.fc.hssf.formula.ptg.DeletedArea3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.DeletedRef3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.Ref3DPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefErrorPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtg;
import lib.zj.office.fc.hssf.formula.ptg.RefPtgBase;

/* loaded from: classes3.dex */
public final class FormulaShifter {
    private final int _amountToMove;
    private final int _dstSheetIndex;
    private final int _externSheetIndex;
    private final int _firstMovedIndex;
    private final int _lastMovedIndex;
    private final ShiftMode _mode;
    private final int _srcSheetIndex;

    /* renamed from: lib.zj.office.fc.hssf.formula.FormulaShifter$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$lib$zj$office$fc$hssf$formula$FormulaShifter$ShiftMode;

        static {
            int[] iArr = new int[ShiftMode.values().length];
            $SwitchMap$lib$zj$office$fc$hssf$formula$FormulaShifter$ShiftMode = iArr;
            try {
                iArr[ShiftMode.Row.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$lib$zj$office$fc$hssf$formula$FormulaShifter$ShiftMode[ShiftMode.Sheet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum ShiftMode {
        Row,
        Sheet
    }

    private FormulaShifter(int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            throw new IllegalArgumentException("amountToMove must not be zero");
        }
        if (i11 <= i12) {
            this._externSheetIndex = i10;
            this._firstMovedIndex = i11;
            this._lastMovedIndex = i12;
            this._amountToMove = i13;
            this._mode = ShiftMode.Row;
            this._dstSheetIndex = -1;
            this._srcSheetIndex = -1;
            return;
        }
        throw new IllegalArgumentException("firstMovedIndex, lastMovedIndex out of order");
    }

    private Ptg adjustPtg(Ptg ptg, int i10) {
        int i11 = AnonymousClass1.$SwitchMap$lib$zj$office$fc$hssf$formula$FormulaShifter$ShiftMode[this._mode.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return adjustPtgDueToShiftMove(ptg);
            }
            throw new IllegalStateException("Unsupported shift mode: " + this._mode);
        }
        return adjustPtgDueToRowMove(ptg, i10);
    }

    private Ptg adjustPtgDueToRowMove(Ptg ptg, int i10) {
        if (ptg instanceof RefPtg) {
            if (i10 != this._externSheetIndex) {
                return null;
            }
            return rowMoveRefPtg((RefPtg) ptg);
        } else if (ptg instanceof Ref3DPtg) {
            Ref3DPtg ref3DPtg = (Ref3DPtg) ptg;
            if (this._externSheetIndex != ref3DPtg.getExternSheetIndex()) {
                return null;
            }
            return rowMoveRefPtg(ref3DPtg);
        } else if (ptg instanceof Area2DPtgBase) {
            if (i10 != this._externSheetIndex) {
                return ptg;
            }
            return rowMoveAreaPtg((Area2DPtgBase) ptg);
        } else if (!(ptg instanceof Area3DPtg)) {
            return null;
        } else {
            Area3DPtg area3DPtg = (Area3DPtg) ptg;
            if (this._externSheetIndex != area3DPtg.getExternSheetIndex()) {
                return null;
            }
            return rowMoveAreaPtg(area3DPtg);
        }
    }

    private Ptg adjustPtgDueToShiftMove(Ptg ptg) {
        if (ptg instanceof Ref3DPtg) {
            Ref3DPtg ref3DPtg = (Ref3DPtg) ptg;
            if (ref3DPtg.getExternSheetIndex() == this._srcSheetIndex) {
                ref3DPtg.setExternSheetIndex(this._dstSheetIndex);
                return ref3DPtg;
            } else if (ref3DPtg.getExternSheetIndex() == this._dstSheetIndex) {
                ref3DPtg.setExternSheetIndex(this._srcSheetIndex);
                return ref3DPtg;
            }
        }
        return null;
    }

    private static Ptg createDeletedRef(Ptg ptg) {
        if (ptg instanceof RefPtg) {
            return new RefErrorPtg();
        }
        if (ptg instanceof Ref3DPtg) {
            return new DeletedRef3DPtg(((Ref3DPtg) ptg).getExternSheetIndex());
        }
        if (ptg instanceof AreaPtg) {
            return new AreaErrPtg();
        }
        if (ptg instanceof Area3DPtg) {
            return new DeletedArea3DPtg(((Area3DPtg) ptg).getExternSheetIndex());
        }
        throw new IllegalArgumentException("Unexpected ref ptg class (" + ptg.getClass().getName() + ")");
    }

    public static FormulaShifter createForRowShift(int i10, int i11, int i12, int i13) {
        return new FormulaShifter(i10, i11, i12, i13);
    }

    public static FormulaShifter createForSheetShift(int i10, int i11) {
        return new FormulaShifter(i10, i11);
    }

    private Ptg rowMoveAreaPtg(AreaPtgBase areaPtgBase) {
        int firstRow = areaPtgBase.getFirstRow();
        int lastRow = areaPtgBase.getLastRow();
        int i10 = this._firstMovedIndex;
        if (i10 <= firstRow && lastRow <= this._lastMovedIndex) {
            areaPtgBase.setFirstRow(firstRow + this._amountToMove);
            areaPtgBase.setLastRow(lastRow + this._amountToMove);
            return areaPtgBase;
        }
        int i11 = this._amountToMove;
        int i12 = i10 + i11;
        int i13 = this._lastMovedIndex;
        int i14 = i13 + i11;
        if (firstRow < i10 && i13 < lastRow) {
            if (i12 < firstRow && firstRow <= i14) {
                areaPtgBase.setFirstRow(i14 + 1);
                return areaPtgBase;
            } else if (i12 > lastRow || lastRow >= i14) {
                return null;
            } else {
                areaPtgBase.setLastRow(i12 - 1);
                return areaPtgBase;
            }
        } else if (i10 <= firstRow && firstRow <= i13) {
            if (i11 < 0) {
                areaPtgBase.setFirstRow(firstRow + i11);
                return areaPtgBase;
            } else if (i12 > lastRow) {
                return null;
            } else {
                int i15 = firstRow + i11;
                if (i14 < lastRow) {
                    areaPtgBase.setFirstRow(i15);
                    return areaPtgBase;
                }
                int i16 = i13 + 1;
                if (i12 > i16) {
                    i15 = i16;
                }
                areaPtgBase.setFirstRow(i15);
                areaPtgBase.setLastRow(Math.max(lastRow, i14));
                return areaPtgBase;
            }
        } else if (i10 <= lastRow && lastRow <= i13) {
            if (i11 > 0) {
                areaPtgBase.setLastRow(lastRow + i11);
                return areaPtgBase;
            } else if (i14 < firstRow) {
                return null;
            } else {
                int i17 = lastRow + i11;
                if (i12 > firstRow) {
                    areaPtgBase.setLastRow(i17);
                    return areaPtgBase;
                }
                int i18 = i10 - 1;
                if (i14 < i18) {
                    i17 = i18;
                }
                areaPtgBase.setFirstRow(Math.min(firstRow, i12));
                areaPtgBase.setLastRow(i17);
                return areaPtgBase;
            }
        } else if (i14 < firstRow || lastRow < i12) {
            return null;
        } else {
            if (i12 <= firstRow && lastRow <= i14) {
                return createDeletedRef(areaPtgBase);
            }
            if (firstRow <= i12 && i14 <= lastRow) {
                return null;
            }
            if (i12 < firstRow && firstRow <= i14) {
                areaPtgBase.setFirstRow(i14 + 1);
                return areaPtgBase;
            } else if (i12 < lastRow && lastRow <= i14) {
                areaPtgBase.setLastRow(i12 - 1);
                return areaPtgBase;
            } else {
                StringBuilder sb2 = new StringBuilder("Situation not covered: (");
                sb2.append(this._firstMovedIndex);
                sb2.append(", ");
                sb2.append(this._lastMovedIndex);
                sb2.append(", ");
                sb2.append(this._amountToMove);
                sb2.append(", ");
                sb2.append(firstRow);
                sb2.append(", ");
                throw new IllegalStateException(h.g(sb2, lastRow, ")"));
            }
        }
    }

    private Ptg rowMoveRefPtg(RefPtgBase refPtgBase) {
        int row = refPtgBase.getRow();
        int i10 = this._firstMovedIndex;
        if (i10 <= row && row <= this._lastMovedIndex) {
            refPtgBase.setRow(row + this._amountToMove);
            return refPtgBase;
        }
        int i11 = this._amountToMove;
        int i12 = i10 + i11;
        int i13 = this._lastMovedIndex + i11;
        if (i13 >= row && row >= i12) {
            if (i12 <= row && row <= i13) {
                return createDeletedRef(refPtgBase);
            }
            StringBuilder sb2 = new StringBuilder("Situation not covered: (");
            sb2.append(this._firstMovedIndex);
            sb2.append(", ");
            sb2.append(this._lastMovedIndex);
            sb2.append(", ");
            sb2.append(this._amountToMove);
            sb2.append(", ");
            sb2.append(row);
            sb2.append(", ");
            throw new IllegalStateException(h.g(sb2, row, ")"));
        }
        return null;
    }

    public boolean adjustFormula(Ptg[] ptgArr, int i10) {
        boolean z10 = false;
        for (int i11 = 0; i11 < ptgArr.length; i11++) {
            Ptg adjustPtg = adjustPtg(ptgArr[i11], i10);
            if (adjustPtg != null) {
                ptgArr[i11] = adjustPtg;
                z10 = true;
            }
        }
        return z10;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        d.h(FormulaShifter.class, stringBuffer, " [");
        stringBuffer.append(this._firstMovedIndex);
        stringBuffer.append(this._lastMovedIndex);
        stringBuffer.append(this._amountToMove);
        return stringBuffer.toString();
    }

    private FormulaShifter(int i10, int i11) {
        this._amountToMove = -1;
        this._lastMovedIndex = -1;
        this._firstMovedIndex = -1;
        this._externSheetIndex = -1;
        this._srcSheetIndex = i10;
        this._dstSheetIndex = i11;
        this._mode = ShiftMode.Sheet;
    }
}
