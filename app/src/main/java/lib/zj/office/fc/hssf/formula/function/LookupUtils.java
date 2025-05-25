package lib.zj.office.fc.hssf.formula.function;

import androidx.activity.f;
import androidx.appcompat.view.menu.d;
import b.a;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.WorkbookEvaluator;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.NumericValueEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
final class LookupUtils {

    /* loaded from: classes3.dex */
    public static final class BinarySearchIndexes {
        private int _highIx;
        private int _lowIx = -1;

        public BinarySearchIndexes(int i10) {
            this._highIx = i10;
        }

        public int getHighIx() {
            return this._highIx;
        }

        public int getLowIx() {
            return this._lowIx;
        }

        public int getMidIx() {
            int i10 = this._highIx;
            int i11 = this._lowIx;
            int i12 = i10 - i11;
            if (i12 < 2) {
                return -1;
            }
            return (i12 / 2) + i11;
        }

        public void narrowSearch(int i10, boolean z10) {
            if (z10) {
                this._highIx = i10;
            } else {
                this._lowIx = i10;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class BooleanLookupComparer extends LookupValueComparerBase {
        private boolean _value;

        public BooleanLookupComparer(BoolEval boolEval) {
            super(boolEval);
            this._value = boolEval.getBooleanValue();
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public CompareResult compareSameType(ValueEval valueEval) {
            boolean booleanValue = ((BoolEval) valueEval).getBooleanValue();
            boolean z10 = this._value;
            if (z10 == booleanValue) {
                return CompareResult.EQUAL;
            }
            if (z10) {
                return CompareResult.GREATER_THAN;
            }
            return CompareResult.LESS_THAN;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public String getValueAsString() {
            return String.valueOf(this._value);
        }
    }

    /* loaded from: classes3.dex */
    public static final class ColumnVector implements ValueVector {
        private final int _columnIndex;
        private final int _size;
        private final TwoDEval _tableArray;

        public ColumnVector(TwoDEval twoDEval, int i10) {
            this._columnIndex = i10;
            int width = twoDEval.getWidth() - 1;
            if (i10 >= 0 && i10 <= width) {
                this._tableArray = twoDEval;
                this._size = twoDEval.getHeight();
                return;
            }
            throw new IllegalArgumentException(f.k("Specified column index (", i10, ") is outside the allowed range (0..", width, ")"));
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public ValueEval getItem(int i10) {
            if (i10 <= this._size) {
                return this._tableArray.getValue(i10, this._columnIndex);
            }
            StringBuilder e10 = d.e("Specified index (", i10, ") is outside the allowed range (0..");
            e10.append(this._size - 1);
            e10.append(")");
            throw new ArrayIndexOutOfBoundsException(e10.toString());
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public int getSize() {
            return this._size;
        }
    }

    /* loaded from: classes3.dex */
    public static final class CompareResult {
        private final boolean _isEqual;
        private final boolean _isGreaterThan;
        private final boolean _isLessThan;
        private final boolean _isTypeMismatch;
        public static final CompareResult TYPE_MISMATCH = new CompareResult(true, 0);
        public static final CompareResult LESS_THAN = new CompareResult(false, -1);
        public static final CompareResult EQUAL = new CompareResult(false, 0);
        public static final CompareResult GREATER_THAN = new CompareResult(false, 1);

        private CompareResult(boolean z10, int i10) {
            boolean z11;
            boolean z12;
            if (z10) {
                this._isTypeMismatch = true;
                this._isLessThan = false;
                this._isEqual = false;
                this._isGreaterThan = false;
                return;
            }
            this._isTypeMismatch = false;
            if (i10 < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this._isLessThan = z11;
            if (i10 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            this._isEqual = z12;
            this._isGreaterThan = i10 > 0;
        }

        private String formatAsString() {
            if (this._isTypeMismatch) {
                return "TYPE_MISMATCH";
            }
            if (this._isLessThan) {
                return "LESS_THAN";
            }
            if (this._isEqual) {
                return "EQUAL";
            }
            if (this._isGreaterThan) {
                return "GREATER_THAN";
            }
            return "??error??";
        }

        public static final CompareResult valueOf(int i10) {
            if (i10 < 0) {
                return LESS_THAN;
            }
            if (i10 > 0) {
                return GREATER_THAN;
            }
            return EQUAL;
        }

        public boolean isEqual() {
            return this._isEqual;
        }

        public boolean isGreaterThan() {
            return this._isGreaterThan;
        }

        public boolean isLessThan() {
            return this._isLessThan;
        }

        public boolean isTypeMismatch() {
            return this._isTypeMismatch;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            a0.d.h(CompareResult.class, stringBuffer, " [");
            stringBuffer.append(formatAsString());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes3.dex */
    public interface LookupValueComparer {
        CompareResult compareTo(ValueEval valueEval);
    }

    /* loaded from: classes3.dex */
    public static abstract class LookupValueComparerBase implements LookupValueComparer {
        private final Class<? extends ValueEval> _targetClass;

        public LookupValueComparerBase(ValueEval valueEval) {
            if (valueEval != null) {
                this._targetClass = valueEval.getClass();
                return;
            }
            throw new RuntimeException("targetValue cannot be null");
        }

        public abstract CompareResult compareSameType(ValueEval valueEval);

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparer
        public final CompareResult compareTo(ValueEval valueEval) {
            if (valueEval != null) {
                if (this._targetClass != valueEval.getClass()) {
                    return CompareResult.TYPE_MISMATCH;
                }
                return compareSameType(valueEval);
            }
            throw new RuntimeException("compare to value cannot be null");
        }

        public abstract String getValueAsString();

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(getClass().getName());
            stringBuffer.append(" [");
            stringBuffer.append(getValueAsString());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class NumberLookupComparer extends LookupValueComparerBase {
        private double _value;

        public NumberLookupComparer(NumberEval numberEval) {
            super(numberEval);
            this._value = numberEval.getNumberValue();
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public CompareResult compareSameType(ValueEval valueEval) {
            return CompareResult.valueOf(Double.compare(this._value, ((NumberEval) valueEval).getNumberValue()));
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public String getValueAsString() {
            return String.valueOf(this._value);
        }
    }

    /* loaded from: classes3.dex */
    public static final class RowVector implements ValueVector {
        private final int _rowIndex;
        private final int _size;
        private final TwoDEval _tableArray;

        public RowVector(TwoDEval twoDEval, int i10) {
            this._rowIndex = i10;
            int height = twoDEval.getHeight() - 1;
            if (i10 >= 0 && i10 <= height) {
                this._tableArray = twoDEval;
                this._size = twoDEval.getWidth();
                return;
            }
            throw new IllegalArgumentException(f.k("Specified row index (", i10, ") is outside the allowed range (0..", height, ")"));
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public ValueEval getItem(int i10) {
            if (i10 <= this._size) {
                ValueEval value = this._tableArray.getValue(this._rowIndex, i10);
                while (value instanceof RefEval) {
                    try {
                        value = OperandResolver.getSingleValue(value, 0, 0);
                    } catch (EvaluationException e10) {
                        return e10.getErrorEval();
                    }
                }
                return value;
            }
            StringBuilder e11 = d.e("Specified index (", i10, ") is outside the allowed range (0..");
            e11.append(this._size - 1);
            e11.append(")");
            throw new ArrayIndexOutOfBoundsException(e11.toString());
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public int getSize() {
            return this._size;
        }
    }

    /* loaded from: classes3.dex */
    public static final class StringLookupComparer extends LookupValueComparerBase {
        private String _value;

        public StringLookupComparer(StringEval stringEval) {
            super(stringEval);
            this._value = stringEval.getStringValue();
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public CompareResult compareSameType(ValueEval valueEval) {
            return CompareResult.valueOf(this._value.compareToIgnoreCase(((StringEval) valueEval).getStringValue()));
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.LookupValueComparerBase
        public String getValueAsString() {
            return this._value;
        }
    }

    /* loaded from: classes3.dex */
    public interface ValueVector {
        ValueEval getItem(int i10);

        int getSize();
    }

    public static ValueVector createColumnVector(TwoDEval twoDEval, int i10) {
        return new ColumnVector(twoDEval, i10);
    }

    public static LookupValueComparer createLookupComparer(ValueEval valueEval) {
        if (valueEval == BlankEval.instance) {
            return new NumberLookupComparer(NumberEval.ZERO);
        }
        if (valueEval instanceof StringEval) {
            return new StringLookupComparer((StringEval) valueEval);
        }
        if (valueEval instanceof NumberEval) {
            return new NumberLookupComparer((NumberEval) valueEval);
        }
        if (valueEval instanceof BoolEval) {
            return new BooleanLookupComparer((BoolEval) valueEval);
        }
        throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("Bad lookup value type ("), ")"));
    }

    public static ValueVector createRowVector(TwoDEval twoDEval, int i10) {
        return new RowVector(twoDEval, i10);
    }

    public static ValueVector createVector(TwoDEval twoDEval) {
        if (twoDEval.isColumn()) {
            return createColumnVector(twoDEval, 0);
        }
        if (twoDEval.isRow()) {
            return createRowVector(twoDEval, 0);
        }
        return null;
    }

    private static int findLastIndexInRunOfEqualValues(LookupValueComparer lookupValueComparer, ValueVector valueVector, int i10, int i11) {
        do {
            i10++;
            if (i10 >= i11) {
                return i11 - 1;
            }
        } while (lookupValueComparer.compareTo(valueVector.getItem(i10)).isEqual());
        return i10 - 1;
    }

    private static int handleMidValueTypeMismatch(LookupValueComparer lookupValueComparer, ValueVector valueVector, BinarySearchIndexes binarySearchIndexes, int i10) {
        CompareResult compareTo;
        int highIx = binarySearchIndexes.getHighIx();
        int i11 = i10;
        do {
            i11++;
            if (i11 == highIx) {
                binarySearchIndexes.narrowSearch(i10, true);
                return -1;
            }
            compareTo = lookupValueComparer.compareTo(valueVector.getItem(i11));
            if (compareTo.isLessThan() && i11 == highIx - 1) {
                binarySearchIndexes.narrowSearch(i10, true);
                return -1;
            }
        } while (compareTo.isTypeMismatch());
        if (compareTo.isEqual()) {
            return i11;
        }
        binarySearchIndexes.narrowSearch(i11, compareTo.isLessThan());
        return -1;
    }

    private static int lookupIndexOfExactValue(LookupValueComparer lookupValueComparer, ValueVector valueVector) {
        int size = valueVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            if (lookupValueComparer.compareTo(valueVector.getItem(i10)).isEqual()) {
                return i10;
            }
        }
        return -1;
    }

    public static int lookupIndexOfValue(ValueEval valueEval, ValueVector valueVector, boolean z10) {
        int lookupIndexOfExactValue;
        LookupValueComparer createLookupComparer = createLookupComparer(valueEval);
        if (z10) {
            lookupIndexOfExactValue = performBinarySearch(valueVector, createLookupComparer);
        } else {
            lookupIndexOfExactValue = lookupIndexOfExactValue(createLookupComparer, valueVector);
        }
        if (lookupIndexOfExactValue >= 0) {
            return lookupIndexOfExactValue;
        }
        throw new EvaluationException(ErrorEval.NA);
    }

    private static int performBinarySearch(ValueVector valueVector, LookupValueComparer lookupValueComparer) {
        BinarySearchIndexes binarySearchIndexes = new BinarySearchIndexes(valueVector.getSize());
        while (true) {
            int midIx = binarySearchIndexes.getMidIx();
            if (midIx < 0) {
                return binarySearchIndexes.getLowIx();
            }
            CompareResult compareTo = lookupValueComparer.compareTo(valueVector.getItem(midIx));
            if (compareTo.isTypeMismatch()) {
                midIx = handleMidValueTypeMismatch(lookupValueComparer, valueVector, binarySearchIndexes, midIx);
                if (midIx < 0) {
                    continue;
                } else {
                    compareTo = lookupValueComparer.compareTo(valueVector.getItem(midIx));
                }
            }
            if (compareTo.isEqual()) {
                return findLastIndexInRunOfEqualValues(lookupValueComparer, valueVector, midIx, binarySearchIndexes.getHighIx());
            }
            binarySearchIndexes.narrowSearch(midIx, compareTo.isLessThan());
        }
    }

    public static boolean resolveRangeLookupArg(ValueEval valueEval, int i10, int i11) {
        ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
        if (singleValue instanceof BlankEval) {
            return false;
        }
        if (singleValue instanceof BoolEval) {
            return ((BoolEval) singleValue).getBooleanValue();
        }
        if (singleValue instanceof StringEval) {
            String stringValue = ((StringEval) singleValue).getStringValue();
            if (stringValue.length() >= 1) {
                Boolean parseBoolean = Countif.parseBoolean(stringValue);
                if (parseBoolean != null) {
                    return parseBoolean.booleanValue();
                }
                throw EvaluationException.invalidValue();
            }
            throw EvaluationException.invalidValue();
        } else if (singleValue instanceof NumericValueEval) {
            if (0.0d == ((NumericValueEval) singleValue).getNumberValue()) {
                return false;
            }
            return true;
        } else {
            throw new RuntimeException(a.e(singleValue, new StringBuilder("Unexpected eval type ("), ")"));
        }
    }

    public static int resolveRowOrColIndexArg(ValueEval valueEval, int i10, int i11) {
        if (valueEval != null) {
            try {
                ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, (short) i11);
                if ((singleValue instanceof StringEval) && OperandResolver.parseDouble(((StringEval) singleValue).getStringValue()) == null) {
                    throw EvaluationException.invalidRef();
                }
                int coerceValueToInt = OperandResolver.coerceValueToInt(singleValue);
                if (coerceValueToInt >= 1) {
                    return coerceValueToInt - 1;
                }
                throw EvaluationException.invalidValue();
            } catch (EvaluationException unused) {
                throw EvaluationException.invalidRef();
            }
        }
        throw new IllegalArgumentException("argument must not be null");
    }

    public static TwoDEval resolveTableArrayArg(ValueEval valueEval) {
        if (valueEval instanceof TwoDEval) {
            return (TwoDEval) valueEval;
        }
        if (valueEval instanceof RefEval) {
            return ((RefEval) valueEval).offset(0, 0, 0, 0);
        }
        throw EvaluationException.invalidValue();
    }

    public static int lookupIndexOfValue(int i10, int i11, ValueEval valueEval, ValueVector valueVector, boolean z10) {
        int lookupIndexOfExactValue;
        LookupValueComparer createLookupComparer = createLookupComparer(i10, i11, valueEval);
        if (z10) {
            lookupIndexOfExactValue = performBinarySearch(valueVector, createLookupComparer);
        } else {
            lookupIndexOfExactValue = lookupIndexOfExactValue(createLookupComparer, valueVector);
        }
        if (lookupIndexOfExactValue >= 0) {
            return lookupIndexOfExactValue;
        }
        throw new EvaluationException(ErrorEval.NA);
    }

    public static LookupValueComparer createLookupComparer(int i10, int i11, ValueEval valueEval) {
        if (valueEval instanceof AreaEval) {
            return createLookupComparer(i10, i11, WorkbookEvaluator.dereferenceResult(valueEval, i10, i11));
        }
        return createLookupComparer(valueEval);
    }
}
