package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnb extends zzblj implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbep {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdiw zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdnb(zzdiw zzdiwVar, zzdjb zzdjbVar) {
        this.zza = zzdjbVar.zzf();
        this.zzb = zzdjbVar.zzj();
        this.zzc = zzdiwVar;
        if (zzdjbVar.zzs() != null) {
            zzdjbVar.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdiw zzdiwVar = this.zzc;
        if (zzdiwVar != null && (view = this.zza) != null) {
            zzdiwVar.zzB(view, Collections.emptyMap(), Collections.emptyMap(), zzdiw.zzX(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbln zzblnVar, int i10) {
        try {
            zzblnVar.zze(i10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final com.google.android.gms.ads.internal.client.zzdq zzb() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final zzbfa zzc() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdiw zzdiwVar = this.zzc;
        if (zzdiwVar == null || zzdiwVar.zzc() == null) {
            return null;
        }
        return zzdiwVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zzd() {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzh();
        zzdiw zzdiwVar = this.zzc;
        if (zzdiwVar != null) {
            zzdiwVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zze(IObjectWrapper iObjectWrapper) {
        Preconditions.e("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdna(this));
    }

    @Override // com.google.android.gms.internal.ads.zzblk
    public final void zzf(IObjectWrapper iObjectWrapper, zzbln zzblnVar) {
        String str;
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            com.google.android.gms.ads.internal.util.client.zzm.c("Instream ad can not be shown after destroy().");
            zzi(zzblnVar, 2);
            return;
        }
        View view = this.zza;
        if (view != null && this.zzb != null) {
            if (this.zze) {
                com.google.android.gms.ads.internal.util.client.zzm.c("Instream ad should not be used again.");
                zzi(zzblnVar, 1);
                return;
            }
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.L0(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzcab zzcabVar = com.google.android.gms.ads.internal.zzu.B.A;
            zzcab.zza(this.zza, this);
            zzcab.zzb(this.zza, this);
            zzg();
            try {
                zzblnVar.zzf();
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.f("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        com.google.android.gms.ads.internal.util.client.zzm.c("Instream internal error: ".concat(str));
        zzi(zzblnVar, 0);
    }
}
