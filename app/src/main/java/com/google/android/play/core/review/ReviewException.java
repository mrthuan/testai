package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes2.dex */
public class ReviewException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReviewException(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2[r3] = r4
            java.util.HashMap r3 = w9.a.f31067a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 != 0) goto L1f
            java.lang.String r3 = ""
            goto L35
        L1f:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.util.HashMap r5 = w9.a.f31068b
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#"
            java.lang.String r6 = ")"
            java.lang.String r3 = a0.a.j(r3, r5, r4, r6)
        L35:
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Review Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r2 = 0
            r0.<init>(r8, r1, r2, r2)
            r7.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.review.ReviewException.<init>(int):void");
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
