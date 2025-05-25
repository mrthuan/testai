package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfxv extends zzfxk {
    Object[] zzd;
    private int zze;

    public zzfxv() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxk, com.google.android.gms.internal.ads.zzfxl
    public final /* bridge */ /* synthetic */ zzfxl zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfxv zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfxw.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfxj.zza(hashCode);
                while (true) {
                    int i10 = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i10];
                    if (obj2 == null) {
                        objArr2[i10] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i10 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfxv zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i10 = 0; i10 < 2; i10++) {
                zzf(objArr[i10]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzfxv zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zzf(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfxw zzi() {
        zzfxw zzv;
        boolean zzw;
        int i10 = this.zzb;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.zzd == null || zzfxw.zzh(i10) != this.zzd.length) {
                    zzv = zzfxw.zzv(this.zzb, this.zza);
                    this.zzb = zzv.size();
                } else {
                    int i11 = this.zzb;
                    Object[] objArr = this.zza;
                    zzw = zzfxw.zzw(i11, objArr.length);
                    if (zzw) {
                        objArr = Arrays.copyOf(objArr, i11);
                    }
                    int i12 = this.zze;
                    Object[] objArr2 = this.zzd;
                    zzv = new zzfzj(objArr, i12, objArr2, objArr2.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzv;
            }
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzfzu(obj);
        }
        return zzfzj.zza;
    }

    public zzfxv(int i10) {
        super(i10);
        this.zzd = new Object[zzfxw.zzh(i10)];
    }
}
