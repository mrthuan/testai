package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcoa {
    private final String zza;
    private final zzbnx zzb;
    private final Executor zzc;
    private zzcof zzd;
    private final zzbix zze = new zzcnx(this);
    private final zzbix zzf = new zzcnz(this);

    public zzcoa(String str, zzbnx zzbnxVar, Executor executor) {
        this.zza = str;
        this.zzb = zzbnxVar;
        this.zzc = executor;
    }

    public static /* bridge */ /* synthetic */ boolean zzg(zzcoa zzcoaVar, Map map) {
        if (map != null) {
            String str = (String) map.get("hashCode");
            if (!TextUtils.isEmpty(str) && str.equals(zzcoaVar.zza)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void zzc(zzcof zzcofVar) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcofVar;
    }

    public final void zzd(zzcej zzcejVar) {
        zzcejVar.zzag("/updateActiveView", this.zze);
        zzcejVar.zzag("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcej zzcejVar) {
        zzcejVar.zzaz("/updateActiveView", this.zze);
        zzcejVar.zzaz("/untrackActiveViewUnit", this.zzf);
    }
}
