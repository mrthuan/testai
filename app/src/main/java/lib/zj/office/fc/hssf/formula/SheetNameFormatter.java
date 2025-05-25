package lib.zj.office.fc.hssf.formula;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lib.zj.office.fc.ss.SpreadsheetVersion;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
public final class SheetNameFormatter {
    private static final Pattern CELL_REF_PATTERN = Pattern.compile("([A-Za-z]+)([0-9]+)");
    private static final char DELIMITER = '\'';

    private SheetNameFormatter() {
    }

    private static void appendAndEscape(StringBuffer stringBuffer, String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '\'') {
                stringBuffer.append(DELIMITER);
            }
            stringBuffer.append(charAt);
        }
    }

    public static void appendFormat(StringBuffer stringBuffer, String str) {
        if (needsDelimiting(str)) {
            stringBuffer.append(DELIMITER);
            appendAndEscape(stringBuffer, str);
            stringBuffer.append(DELIMITER);
            return;
        }
        stringBuffer.append(str);
    }

    public static boolean cellReferenceIsWithinRange(String str, String str2) {
        return CellReference.cellReferenceIsWithinRange(str, str2, SpreadsheetVersion.EXCEL97);
    }

    public static String format(String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() + 2);
        appendFormat(stringBuffer, str);
        return stringBuffer.toString();
    }

    public static boolean isSpecialChar(char c) {
        if (Character.isLetterOrDigit(c)) {
            return false;
        }
        if (c != '\t' && c != '\n' && c != '\r') {
            if (c == '.' || c == '_') {
                return false;
            }
            return true;
        }
        throw new RuntimeException("Illegal character (0x" + Integer.toHexString(c) + ") found in sheet name");
    }

    private static boolean nameLooksLikeBooleanLiteral(String str) {
        char charAt = str.charAt(0);
        if (charAt != 'F') {
            if (charAt != 'T') {
                if (charAt != 'f') {
                    if (charAt != 't') {
                        return false;
                    }
                }
            }
            return "TRUE".equalsIgnoreCase(str);
        }
        return "FALSE".equalsIgnoreCase(str);
    }

    public static boolean nameLooksLikePlainCellReference(String str) {
        Matcher matcher = CELL_REF_PATTERN.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        return cellReferenceIsWithinRange(matcher.group(1), matcher.group(2));
    }

    private static boolean needsDelimiting(String str) {
        int length = str.length();
        if (length >= 1) {
            if (Character.isDigit(str.charAt(0))) {
                return true;
            }
            for (int i10 = 0; i10 < length; i10++) {
                if (isSpecialChar(str.charAt(i10))) {
                    return true;
                }
            }
            if ((Character.isLetter(str.charAt(0)) && Character.isDigit(str.charAt(length - 1)) && nameLooksLikePlainCellReference(str)) || nameLooksLikeBooleanLiteral(str)) {
                return true;
            }
            return false;
        }
        throw new RuntimeException("Zero length string is an invalid sheet name");
    }

    public static void appendFormat(StringBuffer stringBuffer, String str, String str2) {
        if (needsDelimiting(str) || needsDelimiting(str2)) {
            stringBuffer.append(DELIMITER);
            stringBuffer.append('[');
            appendAndEscape(stringBuffer, str.replace('[', '(').replace(']', ')'));
            stringBuffer.append(']');
            appendAndEscape(stringBuffer, str2);
            stringBuffer.append(DELIMITER);
            return;
        }
        stringBuffer.append('[');
        stringBuffer.append(str);
        stringBuffer.append(']');
        stringBuffer.append(str2);
    }
}
