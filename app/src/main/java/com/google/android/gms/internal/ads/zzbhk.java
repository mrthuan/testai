package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbhk extends zzbgn {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbhk(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgo
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) {
        AdListener adListener;
        if (zzbuVar != null && iObjectWrapper != null) {
            AdManagerAdView adManagerAdView = new AdManagerAdView((Context) ObjectWrapper.L0(iObjectWrapper));
            AppEventListener appEventListener = null;
            try {
                if (zzbuVar.zzi() instanceof com.google.android.gms.ads.internal.client.zzg) {
                    com.google.android.gms.ads.internal.client.zzg zzgVar = (com.google.android.gms.ads.internal.client.zzg) zzbuVar.zzi();
                    if (zzgVar != null) {
                        adListener = zzgVar.f10196a;
                    } else {
                        adListener = null;
                    }
                    adManagerAdView.setAdListener(adListener);
                }
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            try {
                if (zzbuVar.zzj() instanceof zzayk) {
                    zzayk zzaykVar = (zzayk) zzbuVar.zzj();
                    if (zzaykVar != null) {
                        appEventListener = zzaykVar.zzb();
                    }
                    adManagerAdView.setAppEventListener(appEventListener);
                }
            } catch (RemoteException unused2) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
            com.google.android.gms.ads.internal.util.client.zzf.f10351b.post(new zzbhj(this, adManagerAdView, zzbuVar));
        }
    }
}
