package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8T  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8T extends AbstractC1105Rn {
    public static byte[] A01;
    public final /* synthetic */ C8S A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -43, -60, -55, -49};
    }

    public C8T(C8S c8s) {
        this.A00 = c8s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.get() == null) goto L8;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC06488x
    /* renamed from: A02 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A03(com.facebook.ads.redexgen.X.SZ r5) {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.8S r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C8S.A03(r0)
            if (r0 == 0) goto L14
            com.facebook.ads.redexgen.X.8S r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C8S.A03(r0)
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L23
        L14:
            com.facebook.ads.redexgen.X.8S r2 = r4.A00
            com.facebook.ads.redexgen.X.R2 r1 = new com.facebook.ads.redexgen.X.R2
            r1.<init>(r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            com.facebook.ads.redexgen.X.C8S.A04(r2, r0)
        L23:
            com.facebook.ads.redexgen.X.8S r0 = r4.A00
            android.content.Context r0 = r0.getContext()
            android.content.Context r3 = r0.getApplicationContext()
            r2 = 0
            r1 = 5
            r0 = 71
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.Object r3 = r3.getSystemService(r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            com.facebook.ads.redexgen.X.8S r0 = r4.A00
            java.lang.ref.WeakReference r0 = com.facebook.ads.redexgen.X.C8S.A03(r0)
            java.lang.Object r2 = r0.get()
            android.media.AudioManager$OnAudioFocusChangeListener r2 = (android.media.AudioManager.OnAudioFocusChangeListener) r2
            r1 = 3
            r0 = 1
            r3.requestAudioFocus(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C8T.A03(com.facebook.ads.redexgen.X.SZ):void");
    }
}
