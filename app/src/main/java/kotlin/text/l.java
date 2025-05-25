package kotlin.text;

import java.util.NoSuchElementException;

/* compiled from: _Strings.kt */
/* loaded from: classes.dex */
public class l extends k {
    public static final char o0(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return charSequence.charAt(k.R(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static final String p0(int i10, String str) {
        boolean z10;
        kotlin.jvm.internal.g.e(str, "<this>");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = str.length();
            if (i10 > length) {
                i10 = length;
            }
            String substring = str.substring(0, i10);
            kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        throw new IllegalArgumentException(a0.a.g("Requested character count ", i10, " is less than zero.").toString());
    }
}
