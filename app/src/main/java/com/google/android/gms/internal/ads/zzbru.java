package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbru extends NativeAd.Image {
    private final zzbfd zza;
    private final Drawable zzb;
    private final Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|2|3|(15:5|6|7|8|9|10|11|12|13|14|15|16|17|18|19)|30|6|7|8|9|10|11|12|13|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
        com.google.android.gms.ads.internal.util.client.zzm.g(6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbru(com.google.android.gms.internal.ads.zzbfd r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.zza = r5
            r0 = 0
            r1 = 6
            com.google.android.gms.dynamic.IObjectWrapper r5 = r5.zzf()     // Catch: android.os.RemoteException -> L14
            if (r5 == 0) goto L17
            java.lang.Object r5 = com.google.android.gms.dynamic.ObjectWrapper.L0(r5)     // Catch: android.os.RemoteException -> L14
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5     // Catch: android.os.RemoteException -> L14
            goto L18
        L14:
            com.google.android.gms.ads.internal.util.client.zzm.g(r1)
        L17:
            r5 = r0
        L18:
            r4.zzb = r5
            com.google.android.gms.internal.ads.zzbfd r5 = r4.zza     // Catch: android.os.RemoteException -> L21
            android.net.Uri r0 = r5.zze()     // Catch: android.os.RemoteException -> L21
            goto L24
        L21:
            com.google.android.gms.ads.internal.util.client.zzm.g(r1)
        L24:
            r4.zzc = r0
            com.google.android.gms.internal.ads.zzbfd r5 = r4.zza     // Catch: android.os.RemoteException -> L2d
            double r2 = r5.zzb()     // Catch: android.os.RemoteException -> L2d
            goto L32
        L2d:
            com.google.android.gms.ads.internal.util.client.zzm.g(r1)
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L32:
            r4.zzd = r2
            r5 = -1
            com.google.android.gms.internal.ads.zzbfd r0 = r4.zza     // Catch: android.os.RemoteException -> L3c
            int r0 = r0.zzd()     // Catch: android.os.RemoteException -> L3c
            goto L40
        L3c:
            com.google.android.gms.ads.internal.util.client.zzm.g(r1)
            r0 = r5
        L40:
            r4.zze = r0
            com.google.android.gms.internal.ads.zzbfd r0 = r4.zza     // Catch: android.os.RemoteException -> L49
            int r5 = r0.zzc()     // Catch: android.os.RemoteException -> L49
            goto L4c
        L49:
            com.google.android.gms.ads.internal.util.client.zzm.g(r1)
        L4c:
            r4.zzf = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbru.<init>(com.google.android.gms.internal.ads.zzbfd):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zze;
    }
}
