// Auto-fixed: added missing class declaration
public class FormulaError {
package lib.zj.office.fc.ss.usermodel;

import b.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum FormulaError {
    NULL(0, "#NULL!"),
    DIV0(7, "#DIV/0!"),
    VALUE(15, "#VALUE!"),
    REF(23, "#REF!"),
    NAME(29, "#NAME?"),
    NUM(36, "#NUM!"),
    NA(42, "#N/A");
    
    private String repr;
    private byte type;
    private static Map<String, FormulaError> smap = new HashMap();
    private static Map<Byte, FormulaError> imap = new HashMap();

    static {
        FormulaError[] values;
        for (FormulaError formulaError : values()) {
            imap.put(Byte.valueOf(formulaError.getCode()), formulaError);
            smap.put(formulaError.getString(), formulaError);
        }
    }

    FormulaError(int i10, String str) {
        this.type = (byte) i10;
        this.repr = str;
    }

    public static FormulaError forInt(byte b10) {
        FormulaError formulaError = imap.get(Byte.valueOf(b10));
        if (formulaError != null) {
            return formulaError;
        }
        throw new IllegalArgumentException(a.c("Unknown error type: ", b10));
    }

    public static FormulaError forString(String str) {
        FormulaError formulaError = smap.get(str);
        if (formulaError != null) {
            return formulaError;
        }
        throw new IllegalArgumentException(a0.a.h("Unknown error code: ", str));
    }

    public byte getCode() {
        return this.type;
    }

    public String getString() {
        return this.repr;
    }
}

}
