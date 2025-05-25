package com.facebook.ads.redexgen.X;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Arrays;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public abstract class GI {
    public static byte[] A00;
    public static String[] A01 = {"FufaAEcqYi1G7tiijYXUMT1veLHgs7nM", "iBdN4E7Slakzgwn7FAnIqO8NtqRonFIN", "cJ", "z4EdrUWrkzDfAPCtqZZYbP8SuccPnYZi", "8CSpdghdkgfGizDgmfFGVsRmRhkb", "CNVa6zzE1fySGY8Zp9tznCkCxd92", "W5FsCsCjtAZQtW2uBDEVk9oMyFLBYPtt", "48tj3wwOhdWyPbi2sJTO0tcPxvbWxPx7"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{Field.DOCPROPERTY, 20, 19, Field.AUTONUMOUT, 96, 106, 74, 96, 106, 86, Field.DDE, 4, Field.ADDIN, 117, 61, Field.AUTOTEXT, 1, 0, 80, Field.ASK};
    }

    static {
        A03();
    }

    public static GM A00(GM gm2, String[] strArr, Map<String, GM> map) {
        if (gm2 == null && strArr == null) {
            return null;
        }
        int i10 = 0;
        if (gm2 == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (gm2 == null && strArr.length > 1) {
            GM gm3 = new GM();
            int length = strArr.length;
            while (i10 < length) {
                gm3.A0E(map.get(strArr[i10]));
                i10++;
            }
            return gm3;
        } else if (gm2 != null && strArr != null && strArr.length == 1) {
            return gm2.A0E(map.get(strArr[0]));
        } else {
            if (gm2 != null && strArr != null) {
                int length2 = strArr.length;
                String[] strArr2 = A01;
                if (strArr2[1].charAt(22) != strArr2[3].charAt(22)) {
                    throw new RuntimeException();
                }
                A01[6] = "ngOgRnx5U34GWisnu9p9YQLiRsQ4UNda";
                if (length2 > 1) {
                    int length3 = strArr.length;
                    while (i10 < length3) {
                        gm2.A0E(map.get(strArr[i10]));
                        i10++;
                    }
                    return gm2;
                }
            }
            return gm2;
        }
    }

    public static String A02(String str) {
        String A012 = A01(1, 2, 58);
        String A013 = A01(0, 1, 124);
        String replaceAll = str.replaceAll(A012, A013);
        String out = A01(4, 5, 99);
        String replaceAll2 = replaceAll.replaceAll(out, A013);
        String A014 = A01(3, 1, 55);
        String replaceAll3 = replaceAll2.replaceAll(A013, A014);
        String out2 = A01(9, 11, 46);
        return replaceAll3.replaceAll(out2, A014);
    }

    public static void A04(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0) {
            char charAt = spannableStringBuilder.charAt(length);
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[5];
            int length2 = str.length();
            int position = str2.length();
            if (length2 == position) {
                A01[2] = "jH";
                if (charAt != ' ') {
                    break;
                }
                length--;
            } else {
                throw new RuntimeException();
            }
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != '\n') {
            spannableStringBuilder.append('\n');
        }
    }

    public static void A05(SpannableStringBuilder spannableStringBuilder, int i10, int i11, GM gm2) {
        if (gm2.A07() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(gm2.A07()), i10, i11, 33);
        }
        boolean A0P = gm2.A0P();
        String[] strArr = A01;
        if (strArr[7].charAt(14) != strArr[0].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "GiKke0o7duIHnZiFD13wbUhxGmBWK7Wf";
        strArr2[0] = "qc1VlaTFR3Amkvik8bEsaJqvap8peqhx";
        if (A0P) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gm2.A0Q()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gm2.A0O()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(gm2.A05()), i10, i11, 33);
        }
        if (gm2.A0N()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(gm2.A04()), i10, i11, 33);
        }
        if (gm2.A0L() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(gm2.A0L()), i10, i11, 33);
        }
        if (gm2.A08() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(gm2.A08()), i10, i11, 33);
        }
        switch (gm2.A06()) {
            case 1:
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) gm2.A03(), true), i10, i11, 33);
                return;
            case 2:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gm2.A03()), i10, i11, 33);
                return;
            case 3:
                spannableStringBuilder.setSpan(new RelativeSizeSpan(gm2.A03() / 100.0f), i10, i11, 33);
                return;
            default:
                return;
        }
    }
}
