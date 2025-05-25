package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhfb implements zzhfl, zzhew {
    private static final Object zza = new Object();
    private volatile zzhfl zzb;
    private volatile Object zzc = zza;

    private zzhfb(zzhfl zzhflVar) {
        this.zzb = zzhflVar;
    }

    public static zzhew zza(zzhfl zzhflVar) {
        if (zzhflVar instanceof zzhew) {
            return (zzhew) zzhflVar;
        }
        return new zzhfb(zzhflVar);
    }

    public static zzhfl zzc(zzhfl zzhflVar) {
        if (zzhflVar instanceof zzhfb) {
            return zzhflVar;
        }
        return new zzhfb(zzhflVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
