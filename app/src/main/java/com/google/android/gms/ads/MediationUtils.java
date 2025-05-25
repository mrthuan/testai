package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a5 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.AdSize a(android.content.Context r9, com.google.android.gms.ads.AdSize r10, java.util.List<com.google.android.gms.ads.AdSize> r11) {
        /*
            r0 = 0
            if (r11 == 0) goto La7
            if (r10 != 0) goto L7
            goto La7
        L7:
            boolean r1 = r10.f10027e
            if (r1 != 0) goto L32
            boolean r1 = r10.f10029g
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r10.d(r9)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            int r9 = r10.b(r9)
            float r9 = (float) r9
            float r9 = r9 / r1
            int r9 = java.lang.Math.round(r9)
            com.google.android.gms.ads.AdSize r10 = new com.google.android.gms.ads.AdSize
            r10.<init>(r2, r9)
        L32:
            java.util.Iterator r9 = r11.iterator()
        L36:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto La7
            java.lang.Object r11 = r9.next()
            com.google.android.gms.ads.AdSize r11 = (com.google.android.gms.ads.AdSize) r11
            if (r11 == 0) goto L36
            int r1 = r10.f10024a
            double r2 = (double) r1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r2 = r2 * r4
            int r4 = r11.f10024a
            double r5 = (double) r4
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 > 0) goto L36
            if (r1 < r4) goto L36
            boolean r1 = r10.f10029g
            int r2 = r11.f10025b
            if (r1 == 0) goto L80
            int r1 = r10.f10030h
            com.google.android.gms.internal.ads.zzbbn r3 = com.google.android.gms.internal.ads.zzbbw.zzhb
            com.google.android.gms.ads.internal.client.zzba r5 = com.google.android.gms.ads.internal.client.zzba.f10115d
            com.google.android.gms.internal.ads.zzbbu r6 = r5.c
            java.lang.Object r3 = r6.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > r4) goto L36
            com.google.android.gms.internal.ads.zzbbn r3 = com.google.android.gms.internal.ads.zzbbw.zzhc
            com.google.android.gms.internal.ads.zzbbu r5 = r5.c
            java.lang.Object r3 = r5.zza(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > r2) goto L36
            if (r1 < r2) goto L36
            goto L9a
        L80:
            boolean r1 = r10.f10027e
            if (r1 == 0) goto L89
            int r1 = r10.f10028f
            if (r1 < r2) goto L36
            goto L9a
        L89:
            int r1 = r10.f10025b
            double r5 = (double) r1
            r7 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r5 = r5 * r7
            double r7 = (double) r2
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L36
            if (r1 >= r2) goto L9a
            goto L36
        L9a:
            if (r0 != 0) goto L9d
            goto La5
        L9d:
            int r1 = r0.f10024a
            int r3 = r0.f10025b
            int r1 = r1 * r3
            int r4 = r4 * r2
            if (r1 > r4) goto L36
        La5:
            r0 = r11
            goto L36
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MediationUtils.a(android.content.Context, com.google.android.gms.ads.AdSize, java.util.List):com.google.android.gms.ads.AdSize");
    }
}
