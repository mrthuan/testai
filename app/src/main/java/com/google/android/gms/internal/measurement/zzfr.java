package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfr extends zzlb implements zzmj {
    private static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zza = zzfrVar;
        zzlb.zzbO(zzfr.class, zzfrVar);
    }

    private zzfr() {
    }

    public static zzfq zzc() {
        return (zzfq) zza.zzbA();
    }

    public static /* synthetic */ void zze(zzfr zzfrVar, int i10) {
        zzfrVar.zzd |= 1;
        zzfrVar.zze = i10;
    }

    public static /* synthetic */ void zzf(zzfr zzfrVar, long j10) {
        zzfrVar.zzd |= 2;
        zzfrVar.zzf = j10;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzg() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzh() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object zzl(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfq(null);
                }
                return new zzfr();
            }
            return zzlb.zzbL(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
