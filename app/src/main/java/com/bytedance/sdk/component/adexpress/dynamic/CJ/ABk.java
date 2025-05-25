package com.bytedance.sdk.component.adexpress.dynamic.CJ;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ac;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: LayoutUnitSizeUtils.java */
/* loaded from: classes.dex */
public class ABk {
    private static final Set<String> Qhi = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String cJ;

    /* JADX WARN: Can't wrap try/catch for region: R(9:(3:178|(1:181)|182)(2:207|(5:209|184|(5:194|195|196|(3:198|(1:204)(1:201)|202)|205)|192|193))|183|184|(3:186|188|190)|194|195|196|(0)|205) */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0476 A[Catch: Exception -> 0x0487, TryCatch #3 {Exception -> 0x0487, blocks: (B:219:0x046c, B:221:0x0476, B:226:0x0480), top: B:276:0x046c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.CJ.ac.C0086ac Qhi(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, int r23, com.bytedance.sdk.component.adexpress.dynamic.ac.hm r24, double r25, int r27, double r28, java.lang.String r30, com.bytedance.sdk.component.adexpress.cJ.iMK r31) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk.Qhi(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.ac.hm, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.cJ.iMK):com.bytedance.sdk.component.adexpress.dynamic.CJ.ac$ac");
    }

    public static double cJ(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static int[] cJ(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.fl.Qhi());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean cJ() {
        return !TextUtils.isEmpty(cJ);
    }

    public static String Qhi(String str) {
        String[] split;
        return (TextUtils.isEmpty(str) || (split = str.split("adx:")) == null || split.length < 2) ? "" : split[1];
    }

    private static ac.C0086ac Qhi(ac.C0086ac c0086ac, String str, String str2, String str3) {
        if (str.contains("union")) {
            c0086ac.Qhi = 0.0f;
            c0086ac.cJ = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = Qhi(str);
            }
            if (TextUtils.isEmpty(str3)) {
                c0086ac.Qhi = 0.0f;
                c0086ac.cJ = 0.0f;
            } else {
                return Qhi(str3, str2);
            }
        }
        return c0086ac;
    }

    public static ac.C0086ac Qhi(String str, String str2) {
        return Qhi(str, str2, false);
    }

    public static ac.C0086ac Qhi(String str, String str2, boolean z10) {
        ac.C0086ac c0086ac = new ac.C0086ac();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] Qhi2 = Qhi(str, (float) cJ(str2), z10);
            c0086ac.Qhi = Qhi2[0];
            c0086ac.cJ = Qhi2[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                c0086ac.cJ = 0.0f;
            }
        } catch (Exception unused) {
        }
        return c0086ac;
    }

    public static int[] Qhi(String str, float f10, boolean z10) {
        int[] cJ2 = cJ(str, f10, z10);
        return new int[]{CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), cJ2[0]), CQU.cJ(com.bytedance.sdk.component.adexpress.fl.Qhi(), cJ2[1])};
    }

    public static String Qhi() {
        return cJ;
    }
}
