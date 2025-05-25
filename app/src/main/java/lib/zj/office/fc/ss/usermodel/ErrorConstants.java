package lib.zj.office.fc.ss.usermodel;

import a0.a;

/* loaded from: classes3.dex */
public class ErrorConstants {
    public static final int ERROR_DIV_0 = 7;
    public static final int ERROR_NA = 42;
    public static final int ERROR_NAME = 29;
    public static final int ERROR_NULL = 0;
    public static final int ERROR_NUM = 36;
    public static final int ERROR_REF = 23;
    public static final int ERROR_VALUE = 15;

    public static final String getText(int i10) {
        if (i10 != 0) {
            if (i10 != 7) {
                if (i10 != 15) {
                    if (i10 != 23) {
                        if (i10 != 29) {
                            if (i10 != 36) {
                                if (i10 == 42) {
                                    return "#N/A";
                                }
                                throw new IllegalArgumentException(a.g("Bad error code (", i10, ")"));
                            }
                            return "#NUM!";
                        }
                        return "#NAME?";
                    }
                    return "#REF!";
                }
                return "#VALUE!";
            }
            return "#DIV/0!";
        }
        return "#NULL!";
    }

    public static final boolean isValidCode(int i10) {
        if (i10 != 0 && i10 != 7 && i10 != 15 && i10 != 23 && i10 != 29 && i10 != 36 && i10 != 42) {
            return false;
        }
        return true;
    }
}
