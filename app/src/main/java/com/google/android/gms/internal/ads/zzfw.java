package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfw {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public /* synthetic */ zzfw(zzfy zzfyVar, zzfv zzfvVar) {
        this.zza = zzfyVar.zza;
        this.zzb = zzfyVar.zzd;
        this.zzc = zzfyVar.zze;
        this.zzd = zzfyVar.zzf;
        this.zze = zzfyVar.zzg;
    }

    public final zzfw zza(int i10) {
        this.zze = 6;
        return this;
    }

    public final zzfw zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzfw zzc(long j10) {
        this.zzc = j10;
        return this;
    }

    public final zzfw zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzfy zze() {
        if (this.zza != null) {
            return new zzfy(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public zzfw() {
        this.zzb = Collections.emptyMap();
        this.zzd = -1L;
    }
}
