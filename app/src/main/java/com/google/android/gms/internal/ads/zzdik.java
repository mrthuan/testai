package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdik extends zzbez {
    private final zzdjb zza;
    private IObjectWrapper zzb;

    public zzdik(zzdjb zzdjbVar) {
        this.zza = zzdjbVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper != null && (drawable = (Drawable) ObjectWrapper.L0(iObjectWrapper)) != null && drawable.getIntrinsicWidth() != -1 && drawable.getIntrinsicHeight() != -1) {
            return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final float zze() {
        float f10;
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbfd zzm = this.zza.zzm();
        if (zzm == null) {
            return 0.0f;
        }
        if (zzm.zzd() != -1 && zzm.zzc() != -1) {
            f10 = zzm.zzd() / zzm.zzc();
        } else {
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return zzb(zzm.zzf());
        }
        return f10;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final float zzf() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final float zzg() {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final com.google.android.gms.ads.internal.client.zzdq zzh() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final IObjectWrapper zzi() {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfd zzm = this.zza.zzm();
        if (zzm == null) {
            return null;
        }
        return zzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final boolean zzk() {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final boolean zzl() {
        if (this.zza.zzj() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzm(zzbgl zzbglVar) {
        if (this.zza.zzj() instanceof zzcfl) {
            ((zzcfl) this.zza.zzj()).zzv(zzbglVar);
        }
    }
}
