package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzege implements zzeez {
    private final Context zza;
    private final zzcql zzb;
    private View zzc;
    private zzbov zzd;

    public zzege(Context context, zzcql zzcqlVar) {
        this.zza = context;
        this.zzb = zzcqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final Object zza(zzfex zzfexVar, final zzfel zzfelVar, final zzeew zzeewVar) {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
            try {
                view = (View) ObjectWrapper.L0(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view != null) {
                    if (zzf) {
                        try {
                            view = (View) zzgcj.zzn(zzgcj.zzh(null), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzegb
                                @Override // com.google.android.gms.internal.ads.zzgbq
                                public final y9.a zza(Object obj) {
                                    return zzege.this.zzc(view, zzfelVar, obj);
                                }
                            }, zzbzo.zze).get();
                        } catch (InterruptedException | ExecutionException e10) {
                            throw new zzffn(e10);
                        }
                    }
                } else {
                    throw new zzffn(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
            } catch (RemoteException e11) {
                throw new zzffn(e11);
            }
        } else {
            view = this.zzc;
        }
        zzcpl zza = this.zzb.zza(new zzcsk(zzfexVar, zzfelVar, zzeewVar.zza), new zzcpr(view, null, new zzcrs() { // from class: com.google.android.gms.internal.ads.zzega
            @Override // com.google.android.gms.internal.ads.zzcrs
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                try {
                    return ((zzbql) zzeew.this.zzb).zze();
                } catch (RemoteException e12) {
                    throw new zzffn(e12);
                }
            }
        }, (zzfem) zzfelVar.zzu.get(0)));
        zza.zzg().zza(view);
        ((zzegp) zzeewVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeez
    public final void zzb(zzfex zzfexVar, zzfel zzfelVar, zzeew zzeewVar) {
        try {
            ((zzbql) zzeewVar.zzb).zzq(zzfelVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzgZ)).booleanValue() && zzfelVar.zzag) {
                ((zzbql) zzeewVar.zzb).zzk(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzegd(this, zzeewVar, null), (zzbos) zzeewVar.zzc, zzfexVar.zza.zza.zze);
            } else {
                ((zzbql) zzeewVar.zzb).zzj(zzfelVar.zzU, zzfelVar.zzv.toString(), zzfexVar.zza.zza.zzd, new ObjectWrapper(this.zza), new zzegd(this, zzeewVar, null), (zzbos) zzeewVar.zzc, zzfexVar.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzffn(e10);
        }
    }

    public final /* synthetic */ y9.a zzc(View view, zzfel zzfelVar, Object obj) {
        return zzgcj.zzh(zzcrg.zza(this.zza, view, zzfelVar));
    }
}
