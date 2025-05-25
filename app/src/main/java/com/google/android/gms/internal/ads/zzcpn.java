package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcpn extends zzcpk {
    private final Context zzc;
    private final View zzd;
    private final zzcej zze;
    private final zzfem zzf;
    private final zzcrs zzg;
    private final zzdjm zzh;
    private final zzdes zzi;
    private final zzhew zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzq zzl;

    public zzcpn(zzcrt zzcrtVar, Context context, zzfem zzfemVar, View view, zzcej zzcejVar, zzcrs zzcrsVar, zzdjm zzdjmVar, zzdes zzdesVar, zzhew zzhewVar, Executor executor) {
        super(zzcrtVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcejVar;
        this.zzf = zzfemVar;
        this.zzg = zzcrsVar;
        this.zzh = zzdjmVar;
        this.zzi = zzdesVar;
        this.zzj = zzhewVar;
        this.zzk = executor;
    }

    public static void zzj(zzcpn zzcpnVar) {
        zzdjm zzdjmVar = zzcpnVar.zzh;
        if (zzdjmVar.zze() == null) {
            return;
        }
        try {
            zzdjmVar.zze().zze((com.google.android.gms.ads.internal.client.zzbu) zzcpnVar.zzj.zzb(), new ObjectWrapper(zzcpnVar.zzc));
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.g(6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final int zzc() {
        zzbbn zzbbnVar = zzbbw.zzgZ;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) zzbaVar.c.zza(zzbbw.zzha)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final com.google.android.gms.ads.internal.client.zzdq zze() {
        try {
            return this.zzg.zza();
        } catch (zzffn unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final zzfem zzf() {
        com.google.android.gms.ads.internal.client.zzq zzqVar = this.zzl;
        if (zzqVar != null) {
            return zzffm.zzb(zzqVar);
        }
        zzfel zzfelVar = this.zzb;
        if (zzfelVar.zzac) {
            for (String str : zzfelVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfem(view.getWidth(), view.getHeight(), false);
        }
        return (zzfem) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final zzfem zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcpk
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
        zzcej zzcejVar;
        if (viewGroup != null && (zzcejVar = this.zze) != null) {
            zzcejVar.zzaj(zzcgd.zzc(zzqVar));
            viewGroup.setMinimumHeight(zzqVar.c);
            viewGroup.setMinimumWidth(zzqVar.f10242f);
            this.zzl = zzqVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcru
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpm
            @Override // java.lang.Runnable
            public final void run() {
                zzcpn.zzj(zzcpn.this);
            }
        });
        super.zzk();
    }
}
