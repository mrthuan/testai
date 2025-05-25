package lib.zj.office.fc.ss.usermodel;

import a0.a;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class BuiltinFormats {
    public static final int FIRST_USER_DEFINED_FORMAT_INDEX = 164;
    private static final String[] _formats;

    static {
        ArrayList arrayList = new ArrayList();
        putFormat(arrayList, 0, "General");
        putFormat(arrayList, 1, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        putFormat(arrayList, 2, "0.00");
        putFormat(arrayList, 3, "#,##0");
        putFormat(arrayList, 4, "#,##0.00");
        putFormat(arrayList, 5, "\"$\"#,##0_);(\"$\"#,##0)");
        putFormat(arrayList, 6, "\"$\"#,##0_);[Red](\"$\"#,##0)");
        putFormat(arrayList, 7, "\"$\"#,##0.00_);(\"$\"#,##0.00)");
        putFormat(arrayList, 8, "\"$\"#,##0.00_);[Red](\"$\"#,##0.00)");
        putFormat(arrayList, 9, "0%");
        putFormat(arrayList, 10, "0.00%");
        putFormat(arrayList, 11, "0.00E+00");
        putFormat(arrayList, 12, "# ?/?");
        putFormat(arrayList, 13, "# ??/??");
        putFormat(arrayList, 14, "m/d/yy");
        putFormat(arrayList, 15, "d-mmm-yy");
        putFormat(arrayList, 16, "d-mmm");
        putFormat(arrayList, 17, "mmm-yy");
        putFormat(arrayList, 18, "h:mm AM/PM");
        putFormat(arrayList, 19, "h:mm:ss AM/PM");
        putFormat(arrayList, 20, "h:mm");
        putFormat(arrayList, 21, "h:mm:ss");
        putFormat(arrayList, 22, "m/d/yy h:mm");
        for (int i10 = 23; i10 <= 36; i10++) {
            putFormat(arrayList, i10, "reserved-0x" + Integer.toHexString(i10));
        }
        putFormat(arrayList, 37, "#,##0_);(#,##0)");
        putFormat(arrayList, 38, "#,##0_);[Red](#,##0)");
        putFormat(arrayList, 39, "#,##0.00_);(#,##0.00)");
        putFormat(arrayList, 40, "#,##0.00_);[Red](#,##0.00)");
        putFormat(arrayList, 41, "_(\"$\"* #,##0_);_(\"$\"* (#,##0);_(\"$\"* \"-\"_);_(@_)");
        putFormat(arrayList, 42, "_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)");
        putFormat(arrayList, 43, "_(\"$\"* #,##0.00_);_(\"$\"* (#,##0.00);_(\"$\"* \"-\"??_);_(@_)");
        putFormat(arrayList, 44, "_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)");
        putFormat(arrayList, 45, "mm:ss");
        putFormat(arrayList, 46, "[h]:mm:ss");
        putFormat(arrayList, 47, "mm:ss.0");
        putFormat(arrayList, 48, "##0.0E+0");
        putFormat(arrayList, 49, "@");
        for (int i11 = 50; i11 <= 56; i11++) {
            putFormat(arrayList, i11, "General" + Integer.toHexString(i11));
        }
        putFormat(arrayList, 57, "yyyy\"年\"m\"月\"");
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        _formats = strArr;
    }

    public static String[] getAll() {
        return (String[]) _formats.clone();
    }

    public static String getBuiltinFormat(int i10) {
        if (i10 >= 0) {
            String[] strArr = _formats;
            if (i10 >= strArr.length) {
                return null;
            }
            return strArr[i10];
        }
        return null;
    }

    public static Map<Integer, String> getBuiltinFormats() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        while (true) {
            String[] strArr = _formats;
            if (i10 < strArr.length) {
                linkedHashMap.put(Integer.valueOf(i10), strArr[i10]);
                i10++;
            } else {
                return linkedHashMap;
            }
        }
    }

    private static void putFormat(List<String> list, int i10, String str) {
        if (list.size() == i10) {
            list.add(str);
            return;
        }
        throw new IllegalStateException(a.g("index ", i10, " is wrong"));
    }

    public static int getBuiltinFormat(String str) {
        if (str.equalsIgnoreCase("TEXT")) {
            str = "@";
        }
        int i10 = 0;
        while (true) {
            String[] strArr = _formats;
            if (i10 >= strArr.length) {
                return -1;
            }
            if (str.equals(strArr[i10])) {
                return i10;
            }
            i10++;
        }
    }
}
