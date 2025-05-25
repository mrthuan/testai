package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmk extends zzfmn {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfmk zzb = new zzfmk();

    private zzfmk() {
    }

    public static zzfmk zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final void zzb(boolean z10) {
        for (zzflu zzfluVar : zzfml.zza().zzc()) {
            zzfluVar.zzg().zzk(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final boolean zzc() {
        for (zzflu zzfluVar : zzfml.zza().zzb()) {
            View zzf = zzfluVar.zzf();
            if (zzf != null && zzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
