package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes2.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InstallException(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2[r3] = r4
            java.util.HashMap r3 = s9.a.f29753a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L3a
            java.util.HashMap r5 = s9.a.f29754b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L25
            goto L3a
        L25:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            java.lang.String r6 = ")"
            java.lang.String r3 = a0.a.j(r3, r5, r4, r6)
            goto L3c
        L3a:
            java.lang.String r3 = ""
        L3c:
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r2 = 0
            r0.<init>(r8, r1, r2, r2)
            r7.<init>(r0)
            if (r8 == 0) goto L4f
            return
        L4f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.install.InstallException.<init>(int):void");
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
