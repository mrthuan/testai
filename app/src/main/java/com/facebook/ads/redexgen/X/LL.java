package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: assets/audience_network.dex */
public final class LL {
    public static byte[] A05;
    public static String[] A06 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1456cD A02;
    public final C1314Zs A03;
    public final LJ A04;

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{Field.ADVANCE, Field.HTMLCONTROL, Field.GREETINGLINE, Field.ADVANCE, Field.BIDIOUTLINE, 104, Field.INCLUDETEXT, Field.HYPERLINK, Field.SECTIONPAGES, Field.FILESIZE, Field.ADVANCE, 82};
    }

    static {
        A03();
    }

    public LL(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, LJ lj2) {
        this.A03 = c1314Zs;
        this.A04 = lj2;
        this.A02 = abstractC1456cD;
    }

    public static LL A01(C1314Zs c1314Zs, AbstractC1456cD abstractC1456cD, LJ lj2) {
        Object creativeAsCtaLoggingHelper = c1314Zs.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new LL(c1314Zs, abstractC1456cD, lj2);
            c1314Zs.A0O(creativeAsCtaLoggingHelper);
        }
        return (LL) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C1T c1t, String str2) {
        Map<String, String> A052 = new O8().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 53), str);
        this.A03.A09().AA9(str2, A052);
        if (c1t != null) {
            C1T.A06(c1t, this.A03);
        }
        if (C0877Im.A2J(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1491cm.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1491cm.A05, Boolean.TRUE.toString());
            this.A03.A09().AAI(str2, hashMap);
        }
        this.A04.ACa();
    }

    private void A06(String str, C1T c1t, String str2, long j10) {
        this.A00 = true;
        this.A01.postDelayed(new LI(this, str, c1t, str2), j10);
    }

    public static boolean A07(C1314Zs c1314Zs) {
        return C0877Im.A1W(c1314Zs) && L2.A0H(c1314Zs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.LK A0A(com.facebook.ads.redexgen.X.AbstractC1456cD r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = com.facebook.ads.redexgen.X.C0877Im.A1c(r0)
            r4 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r7.A17()
            if (r0 == 0) goto L1d
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = A07(r0)
            if (r0 == 0) goto L1d
        L17:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r4, r4)
            return r0
        L1d:
            r4 = 0
            goto L17
        L1f:
            boolean r3 = r7.A17()
            if (r3 == 0) goto L51
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r5 = A07(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LL.A06
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L53
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.LL.A06
            java.lang.String r1 = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA"
            r0 = 4
            r2[r0] = r1
            if (r5 == 0) goto L51
        L4b:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r3, r4)
            return r0
        L51:
            r4 = 0
            goto L4b
        L53:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.LL.A0A(com.facebook.ads.redexgen.X.cD):com.facebook.ads.redexgen.X.LK");
    }

    public final void A0B() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0C(String str, C1T c1t, String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0T() : 2000L);
    }

    public final void A0D(String str, C1T c1t, String str2) {
        A0B();
        A06(str, c1t, str2, this.A02 != null ? this.A02.A0U() : 2000L);
    }
}
