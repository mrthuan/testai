package ii;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.ArrayList;

/* compiled from: BuiltinFormats.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18498a;

    static {
        ArrayList arrayList = new ArrayList();
        a(arrayList, 0, "General");
        a(arrayList, 1, PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        a(arrayList, 2, "0.00");
        a(arrayList, 3, "#,##0");
        a(arrayList, 4, "#,##0.00");
        a(arrayList, 5, "\"$\"#,##0_);(\"$\"#,##0)");
        a(arrayList, 6, "\"$\"#,##0_);[Red](\"$\"#,##0)");
        a(arrayList, 7, "\"$\"#,##0.00_);(\"$\"#,##0.00)");
        a(arrayList, 8, "\"$\"#,##0.00_);[Red](\"$\"#,##0.00)");
        a(arrayList, 9, "0%");
        a(arrayList, 10, "0.00%");
        a(arrayList, 11, "0.00E+00");
        a(arrayList, 12, "# ?/?");
        a(arrayList, 13, "# ??/??");
        a(arrayList, 14, "m/d/yy");
        a(arrayList, 15, "d-mmm-yy");
        a(arrayList, 16, "d-mmm");
        a(arrayList, 17, "mmm-yy");
        a(arrayList, 18, "h:mm AM/PM");
        a(arrayList, 19, "h:mm:ss AM/PM");
        a(arrayList, 20, "h:mm");
        a(arrayList, 21, "h:mm:ss");
        a(arrayList, 22, "m/d/yy h:mm");
        for (int i10 = 23; i10 <= 36; i10++) {
            a(arrayList, i10, "reserved-0x" + Integer.toHexString(i10));
        }
        a(arrayList, 37, "#,##0_);(#,##0)");
        a(arrayList, 38, "#,##0_);[Red](#,##0)");
        a(arrayList, 39, "#,##0.00_);(#,##0.00)");
        a(arrayList, 40, "#,##0.00_);[Red](#,##0.00)");
        a(arrayList, 41, "_(\"$\"* #,##0_);_(\"$\"* (#,##0);_(\"$\"* \"-\"_);_(@_)");
        a(arrayList, 42, "_(* #,##0_);_(* (#,##0);_(* \"-\"_);_(@_)");
        a(arrayList, 43, "_(\"$\"* #,##0.00_);_(\"$\"* (#,##0.00);_(\"$\"* \"-\"??_);_(@_)");
        a(arrayList, 44, "_(* #,##0.00_);_(* (#,##0.00);_(* \"-\"??_);_(@_)");
        a(arrayList, 45, "mm:ss");
        a(arrayList, 46, "[h]:mm:ss");
        a(arrayList, 47, "mm:ss.0");
        a(arrayList, 48, "##0.0E+0");
        a(arrayList, 49, "@");
        for (int i11 = 50; i11 <= 56; i11++) {
            a(arrayList, i11, "General" + Integer.toHexString(i11));
        }
        a(arrayList, 57, "yyyy\"年\"m\"月\"");
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        f18498a = strArr;
    }

    public static void a(ArrayList arrayList, int i10, String str) {
        if (arrayList.size() == i10) {
            arrayList.add(str);
            return;
        }
        throw new IllegalStateException(a0.a.g("index ", i10, " is wrong"));
    }
}
