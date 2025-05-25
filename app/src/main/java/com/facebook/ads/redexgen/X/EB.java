package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;

/* loaded from: assets/audience_network.dex */
public class EB implements Runnable {
    public final /* synthetic */ EC A00;
    public final /* synthetic */ DownloadAction[] A01;

    public EB(EC ec2, DownloadAction[] downloadActionArr) {
        this.A00 = ec2;
        this.A01 = downloadActionArr;
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0091 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = com.facebook.ads.redexgen.X.KQ.A02(r7)
            if (r0 == 0) goto L7
            return
        L7:
            r3 = r7
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            boolean r0 = com.facebook.ads.redexgen.X.EL.A0M(r0)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto L13
            return
        L13:
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r1 = com.facebook.ads.redexgen.X.EL.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb2
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r1 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r1 = com.facebook.ads.redexgen.X.EL.A06(r1)     // Catch: java.lang.Throwable -> Lb2
            r1.clear()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction[] r6 = r3.A01     // Catch: java.lang.Throwable -> Lb2
            int r5 = r6.length     // Catch: java.lang.Throwable -> Lb2
            r4 = 0
        L2f:
            if (r4 >= r5) goto L3d
            r2 = r6[r4]     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r1 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL.A03(r1, r2)     // Catch: java.lang.Throwable -> Lb2
            int r4 = r4 + 1
            goto L2f
        L3d:
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r2 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            r1 = 1
            com.facebook.ads.redexgen.X.EL.A0N(r2, r1)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r1 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.concurrent.CopyOnWriteArraySet r1 = com.facebook.ads.redexgen.X.EL.A07(r1)     // Catch: java.lang.Throwable -> Lb2
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> Lb2
        L51:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r1 == 0) goto L65
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EE r2 = (com.facebook.ads.redexgen.X.EE) r2     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r1 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            r2.ACB(r1)     // Catch: java.lang.Throwable -> Lb2
            goto L51
        L65:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto L7d
            com.facebook.ads.redexgen.X.EC r1 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r1 = r1.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r1 = com.facebook.ads.redexgen.X.EL.A06(r1)     // Catch: java.lang.Throwable -> Lb2
            r1.addAll(r0)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL.A0G(r0)     // Catch: java.lang.Throwable -> Lb2
        L7d:
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL.A0H(r0)     // Catch: java.lang.Throwable -> Lb2
            r2 = 0
        L85:
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.EL.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lb2
            if (r2 >= r0) goto Lb1
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            java.util.ArrayList r0 = com.facebook.ads.redexgen.X.EL.A06(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EI r1 = (com.facebook.ads.redexgen.X.EI) r1     // Catch: java.lang.Throwable -> Lb2
            int r0 = com.facebook.ads.redexgen.X.EI.A03(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != 0) goto Lae
            com.facebook.ads.redexgen.X.EC r0 = r3.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL r0 = r0.A00     // Catch: java.lang.Throwable -> Lb2
            com.facebook.ads.redexgen.X.EL.A0I(r0, r1)     // Catch: java.lang.Throwable -> Lb2
        Lae:
            int r2 = r2 + 1
            goto L85
        Lb1:
            return
        Lb2:
            r0 = move-exception
            com.facebook.ads.redexgen.X.KQ.A00(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.EB.run():void");
    }
}
