package lib.zj.office.fc.hssf.formula.function;

import a6.h;
import b.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class FunctionMetadataReader {
    private static final String[] DIGIT_ENDING_FUNCTION_NAMES;
    private static final Set DIGIT_ENDING_FUNCTION_NAMES_SET;
    private static final String ELLIPSIS = "...";
    private static final String METADATA_FILE_NAME = "functionMetadata.txt";
    private static final Pattern TAB_DELIM_PATTERN = Pattern.compile("\t");
    private static final Pattern SPACE_DELIM_PATTERN = Pattern.compile(" ");
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    static {
        String[] strArr = {"LOG10", "ATAN2", "DAYS360", "SUMXMY2", "SUMX2MY2", "SUMX2PY2"};
        DIGIT_ENDING_FUNCTION_NAMES = strArr;
        DIGIT_ENDING_FUNCTION_NAMES_SET = new HashSet(Arrays.asList(strArr));
    }

    public static FunctionMetadataRegistry createRegistry() {
        InputStream resourceAsStream = FunctionMetadataReader.class.getResourceAsStream(METADATA_FILE_NAME);
        if (resourceAsStream != null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                FunctionDataBuilder functionDataBuilder = new FunctionDataBuilder(400);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            return functionDataBuilder.build();
                        } else if (readLine.length() >= 1 && readLine.charAt(0) != '#' && readLine.trim().length() >= 1) {
                            processLine(functionDataBuilder, readLine);
                        }
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
            } catch (UnsupportedEncodingException e11) {
                throw new RuntimeException(e11);
            }
        } else {
            throw new RuntimeException("resource 'functionMetadata.txt' not found");
        }
    }

    private static boolean isDash(String str) {
        if (str.length() != 1 || str.charAt(0) != '-') {
            return false;
        }
        return true;
    }

    private static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new RuntimeException(h.d("Value '", str, "' could not be parsed as an integer"));
        }
    }

    private static byte parseOperandTypeCode(String str) {
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (charAt != 'A') {
                if (charAt == 'R') {
                    return (byte) 0;
                }
                if (charAt == 'V') {
                    return (byte) 32;
                }
                StringBuilder g10 = a.g("Unexpected operand type code '", str, "' (");
                g10.append((int) str.charAt(0));
                g10.append(")");
                throw new IllegalArgumentException(g10.toString());
            }
            return (byte) 64;
        }
        throw new RuntimeException(h.d("Bad operand type code format '", str, "' expected single char"));
    }

    private static byte[] parseOperandTypeCodes(String str) {
        if (str.length() < 1) {
            return EMPTY_BYTE_ARRAY;
        }
        if (isDash(str)) {
            return EMPTY_BYTE_ARRAY;
        }
        String[] split = SPACE_DELIM_PATTERN.split(str);
        int length = split.length;
        if (ELLIPSIS.equals(split[length - 1])) {
            length--;
        }
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = parseOperandTypeCode(split[i10]);
        }
        return bArr;
    }

    private static byte parseReturnTypeCode(String str) {
        if (str.length() == 0) {
            return (byte) 0;
        }
        return parseOperandTypeCode(str);
    }

    private static void processLine(FunctionDataBuilder functionDataBuilder, String str) {
        boolean z10;
        String[] split = TAB_DELIM_PATTERN.split(str, -2);
        if (split.length == 8) {
            int parseInt = parseInt(split[0]);
            String str2 = split[1];
            int parseInt2 = parseInt(split[2]);
            int parseInt3 = parseInt(split[3]);
            byte parseReturnTypeCode = parseReturnTypeCode(split[4]);
            byte[] parseOperandTypeCodes = parseOperandTypeCodes(split[5]);
            if (split[7].length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            validateFunctionName(str2);
            functionDataBuilder.add(parseInt, str2, parseInt2, parseInt3, parseReturnTypeCode, parseOperandTypeCodes, z10);
            return;
        }
        throw new RuntimeException(h.d("Bad line format '", str, "' - expected 8 data fields"));
    }

    private static void validateFunctionName(String str) {
        int length = str.length() - 1;
        if (!Character.isDigit(str.charAt(length))) {
            return;
        }
        while (length >= 0 && Character.isDigit(str.charAt(length))) {
            length--;
        }
        if (DIGIT_ENDING_FUNCTION_NAMES_SET.contains(str)) {
            return;
        }
        throw new RuntimeException(h.d("Invalid function name '", str, "' (is footnote number incorrectly appended)"));
    }
}
