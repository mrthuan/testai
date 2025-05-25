package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Nc  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0990Nc extends ViewGroup {
    public static String[] A01 = {"NZkFYUXBqTyLE0uJAv5x9NXUc2VI7sJS", "uR57PzkU", "rJSYxMTue9BrtOECqhcg2GfuYah", "YyZf9NPrzEzMWmx1W7C7iqaeo0zUpAtl", "DTiQjOeLHS2Pt5vxV6oLe4amAnidYBVC", "lHnCa3run773rLwZ2hjgCXNXpXLX76yu", "KbQZcAmLw4PS1PAelm", "IRe5OrXcLx0wSVTSjdWVVTt7WICaTRCE"};
    public static final int A02 = (int) (LP.A02 * 8.0f);
    public int A00;

    public C0990Nc(C1314Zs c1314Zs) {
        super(c1314Zs);
        setMotionEventSplittingEnabled(false);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r14 = r14 - r12
            int r5 = r10.getPaddingLeft()
            int r4 = r10.getPaddingTop()
            r3 = 0
        La:
            int r0 = r10.getChildCount()
            if (r3 >= r0) goto L51
            android.view.View r6 = r10.getChildAt(r3)
            int r9 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            int r7 = r5 + r9
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C0990Nc.A01
            r0 = 4
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 66
            if (r1 == r0) goto L33
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L33:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0990Nc.A01
            java.lang.String r1 = "OfxBdDbwWwaKkhkWo9ENaAyC2bgPxB1w"
            r0 = 4
            r2[r0] = r1
            if (r7 <= r14) goto L43
            int r5 = r10.getPaddingLeft()
            int r0 = r10.A00
            int r4 = r4 + r0
        L43:
            int r1 = r5 + r9
            int r0 = r4 + r8
            r6.layout(r5, r4, r1, r0)
            int r0 = com.facebook.ads.redexgen.X.C0990Nc.A02
            int r0 = r0 + r9
            int r5 = r5 + r0
            int r3 = r3 + 1
            goto La
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0990Nc.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0033 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r5 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = r11.getPaddingLeft()
            int r5 = r5 - r0
            int r0 = r11.getPaddingRight()
            int r5 = r5 - r0
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = r11.getPaddingTop()
            int r1 = r1 - r0
            int r0 = r11.getPaddingBottom()
            int r1 = r1 - r0
            int r10 = r11.getPaddingLeft()
            r7 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r0 = r11.getChildCount()
            if (r0 <= 0) goto L86
            r9 = 1
        L2e:
            r3 = 0
        L2f:
            int r0 = r11.getChildCount()
            if (r3 >= r0) goto L88
            android.view.View r1 = r11.getChildAt(r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r1.measure(r0, r4)
            int r2 = r1.getMeasuredWidth()
            int r1 = r1.getMeasuredHeight()
            int r0 = com.facebook.ads.redexgen.X.C0990Nc.A02
            int r1 = r1 + r0
            int r7 = java.lang.Math.max(r7, r1)
            int r0 = r10 + r2
            if (r0 <= r5) goto L59
            int r9 = r9 + 1
            int r10 = r11.getPaddingLeft()
        L59:
            int r8 = com.facebook.ads.redexgen.X.C0990Nc.A02
            int r8 = r8 + r2
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0990Nc.A01
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L76
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L76:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0990Nc.A01
            java.lang.String r1 = "n9Mm7W7nMoMcqU3dmLdt8wDmLs9m7g2q"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "514SZhPsQ7DKXYFFbCEhDr5q0ZnH7KeP"
            r0 = 0
            r2[r0] = r1
            int r10 = r10 + r8
            int r3 = r3 + 1
            goto L2f
        L86:
            r9 = 0
            goto L2e
        L88:
            r11.A00 = r7
            int r1 = r11.A00
            int r1 = r1 * r9
            int r0 = com.facebook.ads.redexgen.X.C0990Nc.A02
            int r1 = r1 + r0
            r11.setMeasuredDimension(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0990Nc.onMeasure(int, int):void");
    }
}
