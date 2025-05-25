package w5;

import android.widget.TextView;
import kotlin.text.Regex;

/* compiled from: SensitiveUserDataUtils.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30976a = new b();

    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.b.b(android.view.View):boolean");
    }

    public final boolean a(TextView textView) {
        if (k6.a.b(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(c.j(textView), "");
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = length - 1; -1 < i11; i11--) {
                    char charAt = replace.charAt(i11);
                    if (!Character.isDigit(charAt)) {
                        return false;
                    }
                    int digit = Character.digit((int) charAt, 10);
                    if (digit >= 0) {
                        if (z10 && (digit = digit * 2) > 9) {
                            digit = (digit % 10) + 1;
                        }
                        i10 += digit;
                        z10 = !z10;
                    } else {
                        throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                    }
                }
                if (i10 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return false;
        }
    }
}
