package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhak implements Iterator {
    final /* synthetic */ zzhao zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhak(zzhao zzhaoVar, zzhaj zzhajVar) {
        this.zza = zzhaoVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzhao.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb + 1 < zzhao.zzf(this.zza).size()) {
            return true;
        }
        if (!zzhao.zzh(this.zza).isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        if (i10 < zzhao.zzf(this.zza).size()) {
            return (Map.Entry) zzhao.zzf(this.zza).get(this.zzb);
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzhao.zzi(this.zza);
            if (this.zzb < zzhao.zzf(this.zza).size()) {
                zzhao zzhaoVar = this.zza;
                int i10 = this.zzb;
                this.zzb = i10 - 1;
                zzhao.zzd(zzhaoVar, i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
