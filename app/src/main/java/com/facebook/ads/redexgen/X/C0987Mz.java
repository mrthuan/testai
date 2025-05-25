package com.facebook.ads.redexgen.X;

import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.Mz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0987Mz extends ImageView {
    public static String[] A01 = {"zJ2", "QjUwZCbDUlfOcmdTeXyvd13", "pmgXUgQY3G9embGve5GBnFw0VEVT9oeH", "awdDomzwyqRyeOiEyYHeXSv00pR55TnX", "BJj1MoNnpM6JKdO5Mh8uM61yAFI5TCy", "1E", "dRD1sNctYpeCeu2V1pPS6WM", "8C9irfg3VZNd6lZFm"};
    public ImageView.ScaleType A00;

    public C0987Mz(C1314Zs c1314Zs) {
        super(c1314Zs);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r6 = android.view.View.MeasureSpec.getSize(r9)
            int r5 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r0 != r4) goto L27
            int r0 = android.view.View.MeasureSpec.getMode(r9)
            if (r0 != r4) goto L27
            int r0 = java.lang.Math.min(r5, r6)
            r7.setMeasuredDimension(r0, r0)
        L1d:
            android.widget.ImageView$ScaleType r0 = r7.A00
            if (r0 == 0) goto L26
            android.widget.ImageView$ScaleType r0 = r7.A00
            super.setScaleType(r0)
        L26:
            return
        L27:
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r4) goto L37
            if (r6 <= 0) goto L33
            int r5 = java.lang.Math.min(r5, r6)
        L33:
            r7.setMeasuredDimension(r5, r5)
            goto L1d
        L37:
            int r3 = android.view.View.MeasureSpec.getMode(r9)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0987Mz.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0987Mz.A01
            java.lang.String r1 = "z6sTWRHNr9jgarJvj"
            r0 = 7
            r2[r0] = r1
            if (r3 != r4) goto L5b
            if (r5 <= 0) goto L57
            int r6 = java.lang.Math.min(r5, r6)
        L57:
            r7.setMeasuredDimension(r6, r6)
            goto L1d
        L5b:
            super.onMeasure(r8, r9)
            goto L1d
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0987Mz.onMeasure(int, int):void");
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A00 = scaleType;
    }
}
