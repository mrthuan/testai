package lib.zj.office.fc.ss.util;

import a0.a;
import a6.h;
import androidx.activity.r;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public class WorkbookUtil {
    public static final String createSafeSheetName(String str) {
        if (str == null) {
            return "null";
        }
        if (str.length() < 1) {
            return "empty";
        }
        int min = Math.min(31, str.length());
        StringBuilder sb2 = new StringBuilder(str.substring(0, min));
        for (int i10 = 0; i10 < min; i10++) {
            char charAt = sb2.charAt(i10);
            if (charAt != '\'') {
                if (charAt != '*' && charAt != '/' && charAt != '?') {
                    switch (charAt) {
                    }
                }
                sb2.setCharAt(i10, ' ');
            } else if (i10 == 0 || i10 == min - 1) {
                sb2.setCharAt(i10, ' ');
            }
        }
        return sb2.toString();
    }

    public static void validateSheetName(String str) {
        if (str != null) {
            int length = str.length();
            if (length >= 1 && length <= 31) {
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (charAt != '*' && charAt != '/' && charAt != ':' && charAt != '?') {
                        switch (charAt) {
                            case '[':
                            case '\\':
                            case ']':
                                break;
                            default:
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Invalid char (");
                    sb2.append(charAt);
                    sb2.append(") found at index (");
                    sb2.append(i10);
                    sb2.append(") in sheet name '");
                    throw new IllegalArgumentException(r.g(sb2, str, OperatorName.SHOW_TEXT_LINE));
                }
                if (str.charAt(0) != '\'' && str.charAt(length - 1) != '\'') {
                    return;
                }
                throw new IllegalArgumentException(h.d("Invalid sheet name '", str, "'. Sheet names must not begin or end with (')."));
            }
            throw new IllegalArgumentException(h.d("sheetName '", str, "' is invalid - character count MUST be greater than or equal to 1 and less than or equal to 31"));
        }
        throw new IllegalArgumentException("sheetName must not be null");
    }

    public static void validateSheetState(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(a.g("Ivalid sheet state : ", i10, "\nSheet state must beone of the Workbook.SHEET_STATE_* constants"));
        }
    }
}
