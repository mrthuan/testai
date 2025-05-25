package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzesq implements zzevo {
    private final zzgcu zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzesq(zzgcu zzgcuVar, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzgcuVar;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzesq.this.zzc();
            }
        });
    }

    public final zzesr zzc() {
        zzbbn zzbbnVar = zzbbw.zzfl;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f10115d;
        if (((Boolean) zzbaVar.c.zza(zzbbnVar)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzesr(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        boolean booleanValue = ((Boolean) zzbaVar.c.zza(zzbbw.zzfm)).booleanValue();
        Boolean bool = null;
        if (booleanValue && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window != null && (window.getAttributes().flags & 16777216) != 0) {
                    bool = Boolean.TRUE;
                } else {
                    try {
                        boolean z10 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z10 = true;
                        }
                        bool = Boolean.valueOf(z10);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                return new zzesr(bool);
            }
        }
        return new zzesr(null);
    }
}
