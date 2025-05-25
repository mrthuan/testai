package lib.zj.office.fc.hssf.formula.eval;

import a0.a;
import a0.d;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;

/* loaded from: classes3.dex */
public final class ErrorEval implements ValueEval {
    private static final ErrorConstants EC = null;
    private static final int FUNCTION_NOT_IMPLEMENTED_CODE = -30;
    private int _errorCode;
    public static final ErrorEval NULL_INTERSECTION = new ErrorEval(0);
    public static final ErrorEval DIV_ZERO = new ErrorEval(7);
    public static final ErrorEval VALUE_INVALID = new ErrorEval(15);
    public static final ErrorEval REF_INVALID = new ErrorEval(23);
    public static final ErrorEval NAME_INVALID = new ErrorEval(29);
    public static final ErrorEval NUM_ERROR = new ErrorEval(36);
    public static final ErrorEval NA = new ErrorEval(42);
    private static final int CIRCULAR_REF_ERROR_CODE = -60;
    public static final ErrorEval CIRCULAR_REF_ERROR = new ErrorEval(CIRCULAR_REF_ERROR_CODE);

    private ErrorEval(int i10) {
        this._errorCode = i10;
    }

    public static String getText(int i10) {
        if (ErrorConstants.isValidCode(i10)) {
            return ErrorConstants.getText(i10);
        }
        if (i10 != CIRCULAR_REF_ERROR_CODE) {
            if (i10 != FUNCTION_NOT_IMPLEMENTED_CODE) {
                return a.g("~non~std~err(", i10, ")~");
            }
            return "~FUNCTION~NOT~IMPLEMENTED~";
        }
        return "~CIRCULAR~REF~";
    }

    public static ErrorEval valueOf(int i10) {
        if (i10 != CIRCULAR_REF_ERROR_CODE) {
            if (i10 != 0) {
                if (i10 != 7) {
                    if (i10 != 15) {
                        if (i10 != 23) {
                            if (i10 != 29) {
                                if (i10 != 36) {
                                    if (i10 == 42) {
                                        return NA;
                                    }
                                    throw new RuntimeException(a.g("Unexpected error code (", i10, ")"));
                                }
                                return NUM_ERROR;
                            }
                            return NAME_INVALID;
                        }
                        return REF_INVALID;
                    }
                    return VALUE_INVALID;
                }
                return DIV_ZERO;
            }
            return NULL_INTERSECTION;
        }
        return CIRCULAR_REF_ERROR;
    }

    public int getErrorCode() {
        return this._errorCode;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(ErrorEval.class, stringBuffer, " [");
        stringBuffer.append(getText(this._errorCode));
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
