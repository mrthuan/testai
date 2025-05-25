package com.bytedance.adsdk.ugeno.cJ;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public class Qhi {

    /* compiled from: ColorUtils.java */
    /* renamed from: com.bytedance.adsdk.ugeno.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0073Qhi {
        public GradientDrawable.Orientation Qhi;

        /* renamed from: ac  reason: collision with root package name */
        public float[] f7871ac;
        public int[] cJ;
    }

    public static GradientDrawable.Orientation CJ(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (parseInt == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (parseInt == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (parseInt == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            if (parseInt == 45) {
                return GradientDrawable.Orientation.BL_TR;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int Qhi(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals("transparent")) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 4) {
            StringBuilder sb2 = new StringBuilder("#");
            char[] charArray = str.toCharArray();
            for (int i10 = 1; i10 < charArray.length; i10++) {
                sb2.append(charArray[i10]);
                sb2.append(charArray[i10]);
            }
            return Color.parseColor(sb2.toString());
        } else if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        } else {
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null && split.length == 4) {
                return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
            }
            return -16777216;
        }
    }

    public static boolean ac(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("linear-gradient")) {
            return false;
        }
        return true;
    }

    public static C0073Qhi cJ(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String substring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        int Qhi = Qhi(substring, '%');
        int indexOf2 = substring.indexOf(",");
        String substring2 = substring.substring(0, indexOf2);
        C0073Qhi c0073Qhi = new C0073Qhi();
        c0073Qhi.Qhi = CJ(substring2);
        String substring3 = substring.substring(indexOf2 + 1);
        int[] iArr = new int[Qhi];
        float[] fArr = new float[Qhi];
        for (int i10 = 0; i10 < Qhi; i10++) {
            int indexOf3 = substring3.indexOf("%");
            String trim = substring3.substring(0, indexOf3 + 1).trim();
            if (trim.contains("rgba")) {
                indexOf = trim.indexOf(")");
            } else {
                indexOf = trim.indexOf(" ");
            }
            int i11 = indexOf + 1;
            iArr[i10] = Qhi(trim.substring(0, i11).trim());
            fArr[i10] = ac.Qhi(trim.substring(i11, trim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i12 = indexOf3 + 2;
            if (substring3.length() <= i12) {
                break;
            }
            substring3 = substring3.substring(i12);
        }
        c0073Qhi.cJ = iArr;
        c0073Qhi.f7871ac = fArr;
        return c0073Qhi;
    }

    public static int Qhi(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c) {
                i10++;
            }
        }
        return i10;
    }
}
