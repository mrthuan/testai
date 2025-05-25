package com.bytedance.sdk.openadsdk.core.settings;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: SdkSwitch.java */
/* loaded from: classes.dex */
public class ABk {
    private static final AtomicInteger Qhi = new AtomicInteger(1);

    public static boolean Qhi() {
        return Qhi.get() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi(int r4) {
        /*
            r0 = 1
            if (r4 == r0) goto L7
            r1 = 2
            if (r4 == r1) goto L7
            return
        L7:
            r1 = 0
            java.util.concurrent.atomic.AtomicInteger r2 = com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi     // Catch: java.lang.Throwable -> L18
            int r3 = r2.get()     // Catch: java.lang.Throwable -> L18
            if (r3 == r4) goto L16
            r2.set(r4)     // Catch: java.lang.Throwable -> L14
            goto L23
        L14:
            r4 = move-exception
            goto L1a
        L16:
            r0 = r1
            goto L23
        L18:
            r4 = move-exception
            r0 = r1
        L1a:
            java.lang.String r1 = "SdkSwitch"
            java.lang.String r4 = r4.getMessage()
            com.bytedance.sdk.component.utils.ABk.Qhi(r1, r4)
        L23:
            if (r0 == 0) goto L35
            Qhi()
            boolean r4 = Qhi()
            if (r4 == 0) goto L32
            com.bytedance.sdk.openadsdk.cJ.Qhi.fl.cJ()
            return
        L32:
            com.bytedance.sdk.openadsdk.cJ.Qhi.fl.ac()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.ABk.Qhi(int):void");
    }
}
