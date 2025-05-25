package com.facebook.ads.redexgen.X;

import android.view.View;
import com.google.android.gms.common.api.Api;

/* loaded from: assets/audience_network.dex */
public final class FM extends AbstractC1361ad {
    public static String[] A02 = {"ZvwGPtqIyq", "yiAZi4T0ry", "MW2e2TOPDP9pjEe4rTD", "HlrRgmhjIEURNOsi3rdB558cP", "dU7euze3hj2U1ev62XjIRTQ2vrQriAnf", "8gl08jl5gi3EpiFcU", "SXjkVQ4wGxN0zpwvt09Xfw5qzXSeRw0d", "Y5nQdyuIxyo1Orqk0oN6DnQ8XCev4LBn"};
    public C4Y A00;
    public C4Y A01;

    private int A00(AbstractC05484o abstractC05484o, View view, C4Y c4y) {
        int containerCenter;
        int A0F = c4y.A0F(view) + (c4y.A0D(view) / 2);
        if (abstractC05484o.A1T()) {
            int A0A = c4y.A0A();
            int childCenter = c4y.A0B();
            containerCenter = A0A + (childCenter / 2);
        } else {
            int childCenter2 = c4y.A06();
            containerCenter = childCenter2 / 2;
        }
        return A0F - containerCenter;
    }

    private View A01(AbstractC05484o abstractC05484o, C4Y c4y) {
        int i10;
        int A0W = abstractC05484o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        if (abstractC05484o.A1T()) {
            int A0A = c4y.A0A();
            int childCount = c4y.A0B();
            i10 = A0A + (childCount / 2);
        } else {
            int childCount2 = c4y.A06();
            i10 = childCount2 / 2;
        }
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i12 = 0; i12 < A0W; i12++) {
            View A0t = abstractC05484o.A0t(i12);
            int A0F = c4y.A0F(A0t);
            int childCount3 = c4y.A0D(A0t);
            int childCount4 = Math.abs((A0F + (childCount3 / 2)) - i10);
            if (childCount4 < i11) {
                i11 = childCount4;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[1];
                int length = str.length();
                int childCount5 = str2.length();
                if (length != childCount5) {
                    throw new RuntimeException();
                }
                A02[5] = "j4bRVUHHACnikA";
                view = A0t;
            }
        }
        return view;
    }

    private View A02(AbstractC05484o abstractC05484o, C4Y c4y) {
        int A0W = abstractC05484o.A0W();
        if (A0W == 0) {
            return null;
        }
        View view = null;
        int i10 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (A02[7].charAt(21) != '9') {
            A02[7] = "DwjJFjjR1ioErHTPj2QZ0AbXqU5bWHnc";
            for (int childCount = 0; childCount < A0W; childCount++) {
                View A0t = abstractC05484o.A0t(childCount);
                int A0F = c4y.A0F(A0t);
                if (A0F < i10) {
                    i10 = A0F;
                    view = A0t;
                }
            }
            return view;
        }
        throw new RuntimeException();
    }

    private C4Y A03(AbstractC05484o abstractC05484o) {
        if (this.A00 == null || this.A00.A02 != abstractC05484o) {
            this.A00 = C4Y.A00(abstractC05484o);
        }
        return this.A00;
    }

    private C4Y A04(AbstractC05484o abstractC05484o) {
        if (this.A01 == null || this.A01.A02 != abstractC05484o) {
            this.A01 = C4Y.A01(abstractC05484o);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        if (r0 < 0) goto L26;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC1361ad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0C(com.facebook.ads.redexgen.X.AbstractC05484o r8, int r9, int r10) {
        /*
            r7 = this;
            int r6 = r8.A0Z()
            r2 = -1
            if (r6 != 0) goto L8
            return r2
        L8:
            r1 = 0
            boolean r0 = r8.A21()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.4Y r0 = r7.A04(r8)
            android.view.View r1 = r7.A02(r8, r0)
        L17:
            if (r1 != 0) goto L29
            return r2
        L1a:
            boolean r0 = r8.A20()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.4Y r0 = r7.A03(r8)
            android.view.View r1 = r7.A02(r8, r0)
            goto L17
        L29:
            int r5 = r8.A0p(r1)
            if (r5 != r2) goto L30
            return r2
        L30:
            boolean r0 = r8.A20()
            r4 = 0
            if (r0 == 0) goto L66
            if (r9 <= 0) goto L64
            r3 = 1
        L3a:
            r1 = 0
            boolean r0 = r8 instanceof com.facebook.ads.redexgen.X.AnonymousClass50
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.50 r8 = (com.facebook.ads.redexgen.X.AnonymousClass50) r8
            int r0 = r6 + (-1)
            android.graphics.PointF r2 = r8.A4k(r0)
            if (r2 == 0) goto L58
            float r0 = r2.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L56
            float r0 = r2.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
        L56:
            r4 = 1
        L57:
            r1 = r4
        L58:
            if (r1 == 0) goto L5f
            if (r3 == 0) goto L5e
            int r5 = r5 + (-1)
        L5e:
            return r5
        L5f:
            if (r3 == 0) goto L5e
            int r5 = r5 + 1
            goto L5e
        L64:
            r3 = 0
            goto L3a
        L66:
            if (r10 <= 0) goto L6a
            r3 = 1
            goto L3a
        L6a:
            r3 = 0
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.FM.A0C(com.facebook.ads.redexgen.X.4o, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1361ad
    public final View A0D(AbstractC05484o abstractC05484o) {
        if (abstractC05484o.A21()) {
            return A01(abstractC05484o, A04(abstractC05484o));
        }
        if (abstractC05484o.A20()) {
            View A01 = A01(abstractC05484o, A03(abstractC05484o));
            if (A02[4].charAt(24) != 'v') {
                throw new RuntimeException();
            }
            A02[5] = "ku3zp";
            return A01;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1361ad
    public final C1375as A0E(AbstractC05484o abstractC05484o) {
        if (!(abstractC05484o instanceof AnonymousClass50)) {
            return null;
        }
        return new FN(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1361ad
    public final int[] A0H(AbstractC05484o abstractC05484o, View view) {
        int[] iArr = new int[2];
        if (abstractC05484o.A20()) {
            iArr[0] = A00(abstractC05484o, view, A03(abstractC05484o));
        } else {
            iArr[0] = 0;
        }
        if (abstractC05484o.A21()) {
            iArr[1] = A00(abstractC05484o, view, A04(abstractC05484o));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
