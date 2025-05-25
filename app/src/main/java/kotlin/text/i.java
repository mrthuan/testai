package kotlin.text;

import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: StringNumberConversions.kt */
/* loaded from: classes.dex */
public class i extends h {
    public static final Integer E(String str) {
        boolean z10;
        int i10;
        int i11;
        kotlin.jvm.internal.g.e(str, "<this>");
        t0.w(10);
        int length = str.length();
        if (length != 0) {
            int i12 = 0;
            char charAt = str.charAt(0);
            int i13 = -2147483647;
            if (kotlin.jvm.internal.g.f(charAt, 48) < 0) {
                i10 = 1;
                if (length != 1) {
                    if (charAt == '-') {
                        i13 = SlideAtom.USES_MASTER_SLIDE_ID;
                        z10 = true;
                    } else if (charAt == '+') {
                        z10 = false;
                    }
                }
            } else {
                z10 = false;
                i10 = 0;
            }
            int i14 = -59652323;
            while (i10 < length) {
                int digit = Character.digit((int) str.charAt(i10), 10);
                if (digit >= 0 && ((i12 >= i14 || (i14 == -59652323 && i12 >= (i14 = i13 / 10))) && (i11 = i12 * 10) >= i13 + digit)) {
                    i12 = i11 - digit;
                    i10++;
                }
            }
            if (z10) {
                return Integer.valueOf(i12);
            }
            return Integer.valueOf(-i12);
        }
        return null;
    }
}
