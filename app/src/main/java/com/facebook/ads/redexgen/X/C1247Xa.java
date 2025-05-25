package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Xa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1247Xa implements FG {
    public static String[] A03 = {"7b9fG", "b9JIza1iq", "K3VyjjUa81gB6cgwVU2jHXka9iZh", "EoGoOIpCr4mqUndNE", "5ZgFW0YOcFC7K3cyyILWpbh9L", "dXF9qRoKmMpqtq30wkkPlo0zhDUieZVy", "IPOptFHjiBpY8aBdK", "n7dlWK9OIMHRWWLbwG0IyBG9Jd4f"};
    public boolean A00;
    public final FG A01;
    public final /* synthetic */ E5 A02;

    public C1247Xa(E5 e52, FG fg2) {
        this.A02 = e52;
        this.A01 = fg2;
    }

    public final void A00() {
        this.A00 = false;
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final boolean A9b() {
        return !this.A02.A03() && this.A01.A9b();
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final void AAm() throws IOException {
        this.A01.AAm();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r0 < 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r0 == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r14.A07();
        r14.A02(4);
        r12.A00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
        return -4;
     */
    @Override // com.facebook.ads.redexgen.X.FG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AEn(com.facebook.ads.redexgen.X.C06709u r13, com.facebook.ads.redexgen.X.C1292Yw r14, boolean r15) {
        /*
            r12 = this;
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            boolean r0 = r0.A03()
            r9 = -3
            if (r0 == 0) goto La
            return r9
        La:
            boolean r0 = r12.A00
            r7 = 4
            r6 = -4
            if (r0 == 0) goto L14
            r14.A02(r7)
            return r6
        L14:
            com.facebook.ads.redexgen.X.FG r0 = r12.A01
            int r8 = r0.AEn(r13, r14, r15)
            r5 = -5
            r10 = -9223372036854775808
            if (r8 != r5) goto L83
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r6 = r13.A00
            int r0 = r6.A06
            if (r0 != 0) goto L29
            int r0 = r6.A07
            if (r0 == 0) goto L82
        L29:
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            long r3 = r0.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1247Xa.A03
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto L6a
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1247Xa.A03
            java.lang.String r1 = "RuISqhHF0zDEDt2bjOodlrYJm"
            r0 = 4
            r2[r0] = r1
            r1 = 0
            r7 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            r3 = 0
        L49:
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            long r0 = r0.A00
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L64
        L51:
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C1247Xa.A03
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L70
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L64:
            int r7 = r6.A07
            goto L51
        L67:
            int r3 = r6.A06
            goto L49
        L6a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L70:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C1247Xa.A03
            java.lang.String r1 = "xUEww"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "zgsWRTHUk"
            r0 = 1
            r2[r0] = r1
            com.facebook.ads.internal.exoplayer2.thirdparty.Format r0 = r6.A0G(r3, r7)
            r13.A00 = r0
        L82:
            return r5
        L83:
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            long r0 = r0.A00
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto Lad
            if (r8 != r6) goto L97
            long r3 = r14.A00
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            long r1 = r0.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto La3
        L97:
            if (r8 != r9) goto Lad
            com.facebook.ads.redexgen.X.E5 r0 = r12.A02
            long r1 = r0.A6b()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto Lad
        La3:
            r14.A07()
            r14.A02(r7)
            r0 = 1
            r12.A00 = r0
            return r6
        Lad:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1247Xa.AEn(com.facebook.ads.redexgen.X.9u, com.facebook.ads.redexgen.X.Yw, boolean):int");
    }

    @Override // com.facebook.ads.redexgen.X.FG
    public final int AGp(long j10) {
        if (this.A02.A03()) {
            return -3;
        }
        return this.A01.AGp(j10);
    }
}
