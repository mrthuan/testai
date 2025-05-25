package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzab {
    private final SparseBooleanArray zza;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzab)) {
            return false;
        }
        zzab zzabVar = (zzab) obj;
        if (zzet.zza < 24) {
            if (this.zza.size() != zzabVar.zza.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                if (zza(i10) != zzabVar.zza(i10)) {
                    return false;
                }
            }
            return true;
        }
        return this.zza.equals(zzabVar.zza);
    }

    public final int hashCode() {
        if (zzet.zza < 24) {
            int size = this.zza.size();
            for (int i10 = 0; i10 < this.zza.size(); i10++) {
                size = (size * 31) + zza(i10);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i10) {
        zzdi.zza(i10, 0, this.zza.size());
        return this.zza.keyAt(i10);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i10) {
        return this.zza.get(i10);
    }
}
