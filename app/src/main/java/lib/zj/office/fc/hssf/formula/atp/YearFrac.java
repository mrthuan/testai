package lib.zj.office.fc.hssf.formula.atp;

import a6.h;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import lib.zj.office.fc.hssf.formula.OperationEvaluationContext;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.ss.util.DateUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class YearFrac implements FreeRefFunction {
    public static final FreeRefFunction instance = new YearFrac();

    private YearFrac() {
    }

    private static double evaluateDateArg(ValueEval valueEval, int i10, int i11) {
        ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, (short) i11);
        if (singleValue instanceof StringEval) {
            String stringValue = ((StringEval) singleValue).getStringValue();
            Double parseDouble = OperandResolver.parseDouble(stringValue);
            if (parseDouble != null) {
                return parseDouble.doubleValue();
            }
            return DateUtil.getExcelDate(parseDate(stringValue), false);
        }
        return OperandResolver.coerceValueToDouble(singleValue);
    }

    private static int evaluateIntArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEval, i10, (short) i11));
    }

    private static Calendar makeDate(int i10, int i11, int i12) {
        if (i11 >= 1 && i11 <= 12) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(i10, i11 - 1, 1, 0, 0, 0);
            gregorianCalendar.set(14, 0);
            if (i12 >= 1 && i12 <= gregorianCalendar.getActualMaximum(5)) {
                gregorianCalendar.set(5, i12);
                return gregorianCalendar;
            }
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    private static Calendar parseDate(String str) {
        String[] split = Pattern.compile(PackagingURIHelper.FORWARD_SLASH_STRING).split(str);
        if (split.length == 3) {
            String str2 = split[2];
            int indexOf = str2.indexOf(32);
            if (indexOf > 0) {
                str2 = str2.substring(0, indexOf);
            }
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                int parseInt3 = Integer.parseInt(str2);
                if (parseInt >= 0 && parseInt2 >= 0 && parseInt3 >= 0 && (parseInt <= 12 || parseInt2 <= 12 || parseInt3 <= 12)) {
                    if (parseInt >= 1900 && parseInt < 9999) {
                        return makeDate(parseInt, parseInt2, parseInt3);
                    }
                    throw new RuntimeException(h.d("Unable to determine date format for text '", str, OperatorName.SHOW_TEXT_LINE));
                }
                throw new EvaluationException(ErrorEval.VALUE_INVALID);
            } catch (NumberFormatException unused) {
                throw new EvaluationException(ErrorEval.VALUE_INVALID);
            }
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
    public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        int i10;
        int rowIndex = operationEvaluationContext.getRowIndex();
        int columnIndex = operationEvaluationContext.getColumnIndex();
        try {
            int length = valueEvalArr.length;
            if (length != 2) {
                if (length != 3) {
                    return ErrorEval.VALUE_INVALID;
                }
                i10 = evaluateIntArg(valueEvalArr[2], rowIndex, columnIndex);
            } else {
                i10 = 0;
            }
            return new NumberEval(YearFracCalculator.calculate(evaluateDateArg(valueEvalArr[0], rowIndex, columnIndex), evaluateDateArg(valueEvalArr[1], rowIndex, columnIndex), i10));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
