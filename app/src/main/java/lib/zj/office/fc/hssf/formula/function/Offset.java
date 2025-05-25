package lib.zj.office.fc.hssf.formula.function;

import a0.d;
import androidx.activity.f;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Offset implements Function {
    private static final int LAST_VALID_COLUMN_INDEX = 255;
    private static final int LAST_VALID_ROW_INDEX = 65535;

    /* loaded from: classes3.dex */
    public static final class LinearOffsetRange {
        private final int _length;
        private final int _offset;

        public LinearOffsetRange(int i10, int i11) {
            if (i11 != 0) {
                this._offset = i10;
                this._length = i11;
                return;
            }
            throw new RuntimeException("length may not be zero");
        }

        public short getFirstIndex() {
            return (short) this._offset;
        }

        public short getLastIndex() {
            return (short) ((this._offset + this._length) - 1);
        }

        public boolean isOutOfBounds(int i10, int i11) {
            if (this._offset < i10 || getLastIndex() > i11) {
                return true;
            }
            return false;
        }

        public LinearOffsetRange normaliseAndTranslate(int i10) {
            int i11 = this._length;
            if (i11 > 0) {
                if (i10 == 0) {
                    return this;
                }
                return new LinearOffsetRange(i10 + this._offset, i11);
            }
            return new LinearOffsetRange(f.g(i10, this._offset, i11, 1), -i11);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(LinearOffsetRange.class, stringBuffer, " [");
            stringBuffer.append(this._offset);
            stringBuffer.append("...");
            stringBuffer.append((int) getLastIndex());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    private static AreaEval createOffset(BaseRef baseRef, LinearOffsetRange linearOffsetRange, LinearOffsetRange linearOffsetRange2) {
        LinearOffsetRange normaliseAndTranslate = linearOffsetRange.normaliseAndTranslate(baseRef.getFirstRowIndex());
        LinearOffsetRange normaliseAndTranslate2 = linearOffsetRange2.normaliseAndTranslate(baseRef.getFirstColumnIndex());
        if (!normaliseAndTranslate.isOutOfBounds(0, 65535)) {
            if (!normaliseAndTranslate2.isOutOfBounds(0, 255)) {
                return baseRef.offset(linearOffsetRange.getFirstIndex(), linearOffsetRange.getLastIndex(), linearOffsetRange2.getFirstIndex(), linearOffsetRange2.getLastIndex());
            }
            throw new EvaluationException(ErrorEval.REF_INVALID);
        }
        throw new EvaluationException(ErrorEval.REF_INVALID);
    }

    private static BaseRef evaluateBaseRef(ValueEval valueEval) {
        if (valueEval instanceof RefEval) {
            return new BaseRef((RefEval) valueEval);
        }
        if (valueEval instanceof AreaEval) {
            return new BaseRef((AreaEval) valueEval);
        }
        if (valueEval instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval) valueEval);
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    public static int evaluateIntArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        if (valueEvalArr.length >= 3 && valueEvalArr.length <= 5) {
            try {
                BaseRef evaluateBaseRef = evaluateBaseRef(valueEvalArr[0]);
                int evaluateIntArg = evaluateIntArg(valueEvalArr[1], i10, i11);
                int evaluateIntArg2 = evaluateIntArg(valueEvalArr[2], i10, i11);
                int height = evaluateBaseRef.getHeight();
                int width = evaluateBaseRef.getWidth();
                int length = valueEvalArr.length;
                if (length != 4) {
                    if (length == 5) {
                        width = evaluateIntArg(valueEvalArr[4], i10, i11);
                    } else {
                        if (height != 0 && width != 0) {
                            return createOffset(evaluateBaseRef, new LinearOffsetRange(evaluateIntArg, height), new LinearOffsetRange(evaluateIntArg2, width));
                        }
                        return ErrorEval.REF_INVALID;
                    }
                }
                height = evaluateIntArg(valueEvalArr[3], i10, i11);
                if (height != 0) {
                    return createOffset(evaluateBaseRef, new LinearOffsetRange(evaluateIntArg, height), new LinearOffsetRange(evaluateIntArg2, width));
                }
                return ErrorEval.REF_INVALID;
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
        return ErrorEval.VALUE_INVALID;
    }

    /* loaded from: classes3.dex */
    public static final class BaseRef {
        private final AreaEval _areaEval;
        private final int _firstColumnIndex;
        private final int _firstRowIndex;
        private final int _height;
        private final RefEval _refEval;
        private final int _width;

        public BaseRef(RefEval refEval) {
            this._refEval = refEval;
            this._areaEval = null;
            this._firstRowIndex = refEval.getRow();
            this._firstColumnIndex = refEval.getColumn();
            this._height = 1;
            this._width = 1;
        }

        public int getFirstColumnIndex() {
            return this._firstColumnIndex;
        }

        public int getFirstRowIndex() {
            return this._firstRowIndex;
        }

        public int getHeight() {
            return this._height;
        }

        public int getWidth() {
            return this._width;
        }

        public AreaEval offset(int i10, int i11, int i12, int i13) {
            RefEval refEval = this._refEval;
            if (refEval == null) {
                return this._areaEval.offset(i10, i11, i12, i13);
            }
            return refEval.offset(i10, i11, i12, i13);
        }

        public BaseRef(AreaEval areaEval) {
            this._refEval = null;
            this._areaEval = areaEval;
            this._firstRowIndex = areaEval.getFirstRow();
            this._firstColumnIndex = areaEval.getFirstColumn();
            this._height = (areaEval.getLastRow() - areaEval.getFirstRow()) + 1;
            this._width = (areaEval.getLastColumn() - areaEval.getFirstColumn()) + 1;
        }
    }
}
