package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzsu {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzsu(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzsu.class) {
            zzsu zzsuVar = (zzsu) obj;
            if (TextUtils.equals(this.zza, zzsuVar.zza) && this.zzb == zzsuVar.zzb && this.zzc == zzsuVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.zza.hashCode() + 31;
        int i11 = 1237;
        if (true != this.zzb) {
            i10 = 1237;
        } else {
            i10 = 1231;
        }
        int i12 = ((hashCode * 31) + i10) * 31;
        if (true == this.zzc) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
