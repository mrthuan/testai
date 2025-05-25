package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbhj implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbu zzb;
    final /* synthetic */ zzbhk zzc;

    public zzbhj(zzbhk zzbhkVar, AdManagerAdView adManagerAdView, com.google.android.gms.ads.internal.client.zzbu zzbuVar) {
        this.zza = adManagerAdView;
        this.zzb = zzbuVar;
        this.zzc = zzbhkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r4 = this;
            com.google.android.gms.ads.admanager.AdManagerAdView r0 = r4.zza
            com.google.android.gms.ads.internal.client.zzbu r1 = r4.zzb
            com.google.android.gms.ads.internal.client.zzea r0 = r0.f10035a
            r0.getClass()
            com.google.android.gms.dynamic.IObjectWrapper r2 = r1.zzn()     // Catch: android.os.RemoteException -> L2b
            if (r2 != 0) goto L10
            goto L31
        L10:
            java.lang.Object r3 = com.google.android.gms.dynamic.ObjectWrapper.L0(r2)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r3 = r3.getParent()
            if (r3 != 0) goto L31
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.L0(r2)
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup r3 = r0.f10160l
            r3.addView(r2)
            r0.f10157i = r1
            r0 = 1
            goto L32
        L2b:
            r0 = move-exception
            java.lang.String r1 = "#007 Could not call remote method."
            com.google.android.gms.ads.internal.util.client.zzm.f(r1, r0)
        L31:
            r0 = 0
        L32:
            if (r0 == 0) goto L3e
            com.google.android.gms.internal.ads.zzbhk r0 = r4.zzc
            com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener r0 = com.google.android.gms.internal.ads.zzbhk.zzc(r0)
            r0.a()
            return
        L3e:
            java.lang.String r0 = "Could not bind."
            com.google.android.gms.ads.internal.util.client.zzm.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbhj.run():void");
    }
}
