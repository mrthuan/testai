package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcaz {
    private final Context zza;
    private final zzcbk zzb;
    private final ViewGroup zzc;
    private zzcay zzd;

    public zzcaz(Context context, ViewGroup viewGroup, zzcej zzcejVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcejVar;
        this.zzd = null;
    }

    public final zzcay zza() {
        return this.zzd;
    }

    public final Integer zzb() {
        zzcay zzcayVar = this.zzd;
        if (zzcayVar != null) {
            return zzcayVar.zzl();
        }
        return null;
    }

    public final void zzc(int i10, int i11, int i12, int i13) {
        Preconditions.e("The underlay may only be modified from the UI thread.");
        zzcay zzcayVar = this.zzd;
        if (zzcayVar != null) {
            zzcayVar.zzF(i10, i11, i12, i13);
        }
    }

    public final void zzd(int i10, int i11, int i12, int i13, int i14, boolean z10, zzcbj zzcbjVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcd.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcbk zzcbkVar = this.zzb;
        zzcay zzcayVar = new zzcay(context, zzcbkVar, i14, z10, zzcbkVar.zzm().zza(), zzcbjVar);
        this.zzd = zzcayVar;
        this.zzc.addView(zzcayVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i10, i11, i12, i13);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.e("onDestroy must be called from the UI thread.");
        zzcay zzcayVar = this.zzd;
        if (zzcayVar != null) {
            zzcayVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.e("onPause must be called from the UI thread.");
        zzcay zzcayVar = this.zzd;
        if (zzcayVar != null) {
            zzcayVar.zzu();
        }
    }

    public final void zzg(int i10) {
        zzcay zzcayVar = this.zzd;
        if (zzcayVar != null) {
            zzcayVar.zzC(i10);
        }
    }
}
