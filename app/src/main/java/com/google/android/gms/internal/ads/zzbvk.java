package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbvk extends zzbvm {
    private final String zza;
    private final int zzb;

    public zzbvk(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzbvk)) {
            zzbvk zzbvkVar = (zzbvk) obj;
            if (Objects.a(this.zza, zzbvkVar.zza)) {
                if (Objects.a(Integer.valueOf(this.zzb), Integer.valueOf(zzbvkVar.zzb))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvn
    public final String zzc() {
        return this.zza;
    }
}
