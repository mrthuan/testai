package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;
import u.e;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzegi implements zzeet {
    private final Context zza;
    private final zzdgp zzb;
    private final Executor zzc;
    private final zzfek zzd;

    public zzegi(Context context, Executor executor, zzdgp zzdgpVar, zzfek zzfekVar) {
        this.zza = context;
        this.zzb = zzdgpVar;
        this.zzc = executor;
        this.zzd = zzfekVar;
    }

    private static String zzd(zzfel zzfelVar) {
        try {
            return zzfelVar.zzv.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final y9.a zza(final zzfex zzfexVar, final zzfel zzfelVar) {
        final Uri uri;
        String zzd = zzd(zzfelVar);
        if (zzd != null) {
            uri = Uri.parse(zzd);
        } else {
            uri = null;
        }
        return zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzegg
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzegi.this.zzc(uri, zzfexVar, zzfelVar, obj);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeet
    public final boolean zzb(zzfex zzfexVar, zzfel zzfelVar) {
        Context context = this.zza;
        if ((context instanceof Activity) && zzbct.zzg(context) && !TextUtils.isEmpty(zzd(zzfelVar))) {
            return true;
        }
        return false;
    }

    public final y9.a zzc(Uri uri, zzfex zzfexVar, zzfel zzfelVar, Object obj) {
        try {
            Intent intent = new e.b().a().f30089a;
            intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc(intent, null);
            final zzbzt zzbztVar = new zzbzt();
            zzdfp zze = this.zzb.zze(new zzcsk(zzfexVar, zzfelVar, null), new zzdfs(new zzdgx() { // from class: com.google.android.gms.internal.ads.zzegh
                @Override // com.google.android.gms.internal.ads.zzdgx
                public final void zza(boolean z10, Context context, zzcxd zzcxdVar) {
                    zzbzt zzbztVar2 = zzbzt.this;
                    try {
                        com.google.android.gms.ads.internal.overlay.zzn zznVar = com.google.android.gms.ads.internal.zzu.B.f10553b;
                        com.google.android.gms.ads.internal.overlay.zzn.a(context, (AdOverlayInfoParcel) zzbztVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }, null));
            zzbztVar.zzc(new AdOverlayInfoParcel(zzcVar, null, zze.zza(), null, new VersionInfoParcel(0, 0, false), null, null));
            this.zzd.zza();
            return zzgcj.zzh(zze.zzg());
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
            throw th2;
        }
    }
}
