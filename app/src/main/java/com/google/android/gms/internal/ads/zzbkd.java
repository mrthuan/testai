package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbkd {
    private final Context zza;
    private final OnH5AdsEventListener zzb;
    private zzbjz zzc;

    public zzbkd(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.j(context);
        Preconditions.j(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        zzbbw.zza(context);
    }

    public static final boolean zzc(String str) {
        zzbbn zzbbnVar = zzbbw.zzja;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (!((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue()) {
            return false;
        }
        Preconditions.j(str);
        if (str.length() > ((Integer) zzbaVar.c.zza(zzbbw.zzjc)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzm.b("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        Context context = this.zza;
        com.google.android.gms.ads.internal.client.zzaw zzawVar = com.google.android.gms.ads.internal.client.zzay.f10107f.f10109b;
        zzboi zzboiVar = new zzboi();
        OnH5AdsEventListener onH5AdsEventListener = this.zzb;
        zzawVar.getClass();
        this.zzc = (zzbjz) new k7.e(context, zzboiVar, onH5AdsEventListener).d(context, false);
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzja)).booleanValue()) {
            zzd();
            zzbjz zzbjzVar = this.zzc;
            if (zzbjzVar != null) {
                try {
                    zzbjzVar.zze();
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                }
            }
        }
    }

    public final boolean zzb(String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        zzbjz zzbjzVar = this.zzc;
        if (zzbjzVar == null) {
            return false;
        }
        try {
            zzbjzVar.zzf(str);
            return true;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
            return true;
        }
    }
}
