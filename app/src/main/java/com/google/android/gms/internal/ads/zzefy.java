package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzefy implements zzeez {
    private final Context zza;
    private final zzcql zzb;
    private final Executor zzc;

    public zzefy(Context context, zzcql zzcqlVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcqlVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final Object zza(zzfex zzfexVar, final zzfel zzfelVar, zzeew zzeewVar) {
        final View zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
            zzbov zzc = ((zzfge) zzeewVar.zzb).zzc();
            if (zzc != null) {
                try {
                    zza = (View) ObjectWrapper.L0(zzc.zze());
                    boolean zzf = zzc.zzf();
                    if (zza != null) {
                        if (zzf) {
                            try {
                                zza = (View) zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzefw
                                    @Override // com.google.android.gms.internal.ads.zzgbq
                                    public final y9.a zza(Object obj) {
                                        return zzefy.this.zzc(zza, zzfelVar, obj);
                                    }
                                }, zzbzo.zze).get();
                            } catch (InterruptedException | ExecutionException e10) {
                                throw new zzffn(e10);
                            }
                        }
                    } else {
                        throw new zzffn(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                } catch (RemoteException e11) {
                    throw new zzffn(e11);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.c("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzffn(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
        } else {
            zza = ((zzfge) zzeewVar.zzb).zza();
        }
        zzcql zzcqlVar = this.zzb;
        zzcsk zzcskVar = new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza);
        final zzfge zzfgeVar = (zzfge) zzeewVar.zzb;
        Objects.requireNonNull(zzfgeVar);
        zzcpl zza2 = zzcqlVar.zza(zzcskVar, new zzcpr(zza, null, new zzcrs() { // from class: com.google.android.gms.internal.ads.zzefx
            @Override // com.google.android.gms.internal.ads.zzcrs
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return zzfge.this.zzb();
            }
        }, (zzfem) zzfelVar.zzu.get(0)));
        zza2.zzg().zza(zza);
        zza2.zzd().zzo(new zzcmy((zzfge) zzeewVar.zzb), this.zzc);
        ((zzegp) zzeewVar.zzc).zzc(zza2.zzk());
        return zza2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        com.google.android.gms.ads.internal.client.zzq zza;
        com.google.android.gms.ads.internal.client.zzq zzqVar = zzfexVar.zza.zza.zze;
        boolean z10 = zzqVar.f10250n;
        int i10 = zzqVar.f10239b;
        int i11 = zzqVar.f10241e;
        if (z10) {
            Context context = this.zza;
            AdSize adSize = new AdSize(i11, i10);
            adSize.f10027e = true;
            adSize.f10028f = i10;
            zza = new com.google.android.gms.ads.internal.client.zzq(context, adSize);
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
                Context context2 = this.zza;
                AdSize adSize2 = new AdSize(i11, i10);
                adSize2.f10029g = true;
                adSize2.f10030h = i10;
                zza = new com.google.android.gms.ads.internal.client.zzq(context2, adSize2);
            } else {
                zza = zzffm.zza(this.zza, zzfelVar.zzu);
            }
        }
        com.google.android.gms.ads.internal.client.zzq zzqVar2 = zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
            Object obj = zzeewVar.zzb;
            Context context3 = this.zza;
            zzffg zzffgVar = zzfexVar.zza.zza;
            ((zzfge) obj).zzn(context3, zzqVar2, zzffgVar.zzd, zzfelVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.j(zzfelVar.zzs), (zzbos) zzeewVar.zzc);
            return;
        }
        Object obj2 = zzeewVar.zzb;
        Context context4 = this.zza;
        zzffg zzffgVar2 = zzfexVar.zza.zza;
        ((zzfge) obj2).zzm(context4, zzqVar2, zzffgVar2.zzd, zzfelVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.j(zzfelVar.zzs), (zzbos) zzeewVar.zzc);
    }

    public final /* synthetic */ y9.a zzc(View view, zzfel zzfelVar, Object obj) {
        return zzgcj.zzh(zzcrg.zza(this.zza, view, zzfelVar));
    }
}
