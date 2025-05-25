package com.facebook;

import com.facebook.internal.FeatureManager;
import java.util.Random;

/* compiled from: FacebookException.kt */
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {
    public static final a Companion = new a();
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookException.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !d.g() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.a(new androidx.appcompat.libconvert.helper.b(str, 2), FeatureManager.Feature.ErrorReport);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FacebookException(java.lang.String r3, java.lang.Object... r4) {
        /*
            r2 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.g.e(r4, r0)
            if (r3 == 0) goto L14
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            int r0 = r4.length
            java.lang.String r1 = "format(this, *args)"
            java.lang.String r3 = b.a.f(r4, r0, r3, r1)
            goto L15
        L14:
            r3 = 0
        L15:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookException.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public FacebookException(String str, Throwable th2) {
        super(str, th2);
    }

    public FacebookException(Throwable th2) {
        super(th2);
    }
}
