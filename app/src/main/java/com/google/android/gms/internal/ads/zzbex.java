package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbex extends NativeAd.AdChoicesInfo {
    private final zzbew zza;
    private final List zzb = new ArrayList();
    private String zzc;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        r4.zzb.add(new com.google.android.gms.internal.ads.zzbfe(r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzbex(com.google.android.gms.internal.ads.zzbew r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.zzb = r0
            r4.zza = r5
            r0 = 6
            java.lang.String r1 = r5.zzg()     // Catch: android.os.RemoteException -> L14
            r4.zzc = r1     // Catch: android.os.RemoteException -> L14
            goto L1b
        L14:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
            java.lang.String r1 = ""
            r4.zzc = r1
        L1b:
            java.util.List r5 = r5.zzh()     // Catch: android.os.RemoteException -> L58
            java.util.Iterator r5 = r5.iterator()     // Catch: android.os.RemoteException -> L58
        L23:
            boolean r1 = r5.hasNext()     // Catch: android.os.RemoteException -> L58
            if (r1 == 0) goto L57
            java.lang.Object r1 = r5.next()     // Catch: android.os.RemoteException -> L58
            boolean r2 = r1 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L58
            r3 = 0
            if (r2 == 0) goto L4a
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch: android.os.RemoteException -> L58
            if (r1 != 0) goto L37
            goto L4a
        L37:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch: android.os.RemoteException -> L58
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbfd     // Catch: android.os.RemoteException -> L58
            if (r3 == 0) goto L45
            r3 = r2
            com.google.android.gms.internal.ads.zzbfd r3 = (com.google.android.gms.internal.ads.zzbfd) r3     // Catch: android.os.RemoteException -> L58
            goto L4a
        L45:
            com.google.android.gms.internal.ads.zzbfb r3 = new com.google.android.gms.internal.ads.zzbfb     // Catch: android.os.RemoteException -> L58
            r3.<init>(r1)     // Catch: android.os.RemoteException -> L58
        L4a:
            if (r3 == 0) goto L23
            java.util.List r1 = r4.zzb     // Catch: android.os.RemoteException -> L58
            com.google.android.gms.internal.ads.zzbfe r2 = new com.google.android.gms.internal.ads.zzbfe     // Catch: android.os.RemoteException -> L58
            r2.<init>(r3)     // Catch: android.os.RemoteException -> L58
            r1.add(r2)     // Catch: android.os.RemoteException -> L58
            goto L23
        L57:
            return
        L58:
            com.google.android.gms.ads.internal.util.client.zzm.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbex.<init>(com.google.android.gms.internal.ads.zzbew):void");
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
