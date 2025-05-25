package kotlin.text;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.p;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: StringsJVM.kt */
/* loaded from: classes.dex */
public class j extends i {
    public static final boolean F(String str, String suffix, boolean z10) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(suffix, "suffix");
        if (!z10) {
            return str.endsWith(suffix);
        }
        return I(str.length() - suffix.length(), 0, suffix.length(), str, suffix, true);
    }

    public static final boolean G(String str, String str2, boolean z10) {
        if (str == null) {
            if (str2 == null) {
                return true;
            }
            return false;
        } else if (!z10) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    public static final boolean H(CharSequence charSequence) {
        boolean z10;
        kotlin.jvm.internal.g.e(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        hg.c cVar = new hg.c(0, charSequence.length() - 1);
        if (!(cVar instanceof Collection) || !((Collection) cVar).isEmpty()) {
            Iterator<Integer> it = cVar.iterator();
            while (it.hasNext()) {
                if (!t0.c0(charSequence.charAt(((p) it).a()))) {
                    z10 = false;
                    break;
                }
            }
        }
        z10 = true;
        if (z10) {
            return true;
        }
        return false;
    }

    public static final boolean I(int i10, int i11, int i12, String str, String other, boolean z10) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(other, "other");
        if (!z10) {
            return str.regionMatches(i10, other, i11, i12);
        }
        return str.regionMatches(z10, i10, other, i11, i12);
    }

    public static String J(String str, char c) {
        kotlin.jvm.internal.g.e(str, "<this>");
        String replace = str.replace(' ', c);
        kotlin.jvm.internal.g.d(replace, "this as java.lang.String…replace(oldChar, newChar)");
        return replace;
    }

    public static String K(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(oldValue, "oldValue");
        kotlin.jvm.internal.g.e(newValue, "newValue");
        int S = k.S(0, str, oldValue, false);
        if (S >= 0) {
            int length = oldValue.length();
            int i10 = 1;
            if (length >= 1) {
                i10 = length;
            }
            int length2 = newValue.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb2 = new StringBuilder(length2);
                int i11 = 0;
                do {
                    sb2.append((CharSequence) str, i11, S);
                    sb2.append(newValue);
                    i11 = S + length;
                    if (S >= str.length()) {
                        break;
                    }
                    S = k.S(S + i10, str, oldValue, false);
                } while (S > 0);
                sb2.append((CharSequence) str, i11, str.length());
                String sb3 = sb2.toString();
                kotlin.jvm.internal.g.d(sb3, "stringBuilder.append(this, i, length).toString()");
                return sb3;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static final boolean L(String str, int i10, String str2, boolean z10) {
        kotlin.jvm.internal.g.e(str, "<this>");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return I(i10, 0, str2.length(), str, str2, z10);
    }

    public static final boolean M(String str, String prefix, boolean z10) {
        kotlin.jvm.internal.g.e(str, "<this>");
        kotlin.jvm.internal.g.e(prefix, "prefix");
        if (!z10) {
            return str.startsWith(prefix);
        }
        return I(0, 0, prefix.length(), str, prefix, z10);
    }
}
