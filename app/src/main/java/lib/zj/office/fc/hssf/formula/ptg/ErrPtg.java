package lib.zj.office.fc.hssf.formula.ptg;

import a0.a;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ErrorConstants;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ErrPtg extends ScalarConstantPtg {
    private static final ErrorConstants EC = null;
    private static final int SIZE = 2;
    public static final short sid = 28;
    private final int field_1_error_code;
    public static final ErrPtg NULL_INTERSECTION = new ErrPtg(0);
    public static final ErrPtg DIV_ZERO = new ErrPtg(7);
    public static final ErrPtg VALUE_INVALID = new ErrPtg(15);
    public static final ErrPtg REF_INVALID = new ErrPtg(23);
    public static final ErrPtg NAME_INVALID = new ErrPtg(29);
    public static final ErrPtg NUM_ERROR = new ErrPtg(36);
    public static final ErrPtg N_A = new ErrPtg(42);

    private ErrPtg(int i10) {
        if (ErrorConstants.isValidCode(i10)) {
            this.field_1_error_code = i10;
            return;
        }
        throw new IllegalArgumentException(a.g("Invalid error code (", i10, ")"));
    }

    public static ErrPtg read(LittleEndianInput littleEndianInput) {
        return valueOf(littleEndianInput.readByte());
    }

    public static ErrPtg valueOf(int i10) {
        if (i10 != 0) {
            if (i10 != 7) {
                if (i10 != 15) {
                    if (i10 != 23) {
                        if (i10 != 29) {
                            if (i10 != 36) {
                                if (i10 == 42) {
                                    return N_A;
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

    public int getErrorCode() {
        return this.field_1_error_code;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return ErrorConstants.getText(this.field_1_error_code);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + Field.NUMCHARS);
        littleEndianOutput.writeByte(this.field_1_error_code);
    }
}
