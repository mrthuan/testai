package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzfp extends zzlb implements zzmj {
    private static final zzfp zza;
    private int zzd;
    private int zze;
    private zzgi zzf;
    private zzgi zzg;
    private boolean zzh;

    static {
        zzfp zzfpVar = new zzfp();
        zza = zzfpVar;
        zzlb.zzbO(zzfp.class, zzfpVar);
    }

    private zzfp() {
    }

    public static zzfo zzb() {
        return (zzfo) zza.zzbA();
    }

    public static /* synthetic */ zzfp zzc() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzfp zzfpVar, int i10) {
        zzfpVar.zzd |= 1;
        zzfpVar.zze = i10;
    }

    public static /* synthetic */ void zzg(zzfp zzfpVar, zzgi zzgiVar) {
        zzgiVar.getClass();
        zzfpVar.zzf = zzgiVar;
        zzfpVar.zzd |= 2;
    }

    public static /* synthetic */ void zzh(zzfp zzfpVar, zzgi zzgiVar) {
        zzfpVar.zzg = zzgiVar;
        zzfpVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzfp zzfpVar, boolean z10) {
        zzfpVar.zzd |= 8;
        zzfpVar.zzh = z10;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgi zzd() {
        zzgi zzgiVar = this.zzf;
        if (zzgiVar == null) {
            return zzgi.zzg();
        }
        return zzgiVar;
    }

    public final zzgi zze() {
        zzgi zzgiVar = this.zzg;
        if (zzgiVar == null) {
            return zzgi.zzg();
        }
        return zzgiVar;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
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
                    return new zzfo(null);
                }
                return new zzfp();
            }
            return zzlb.zzbL(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        if ((this.zzd & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzn() {
        if ((this.zzd & 4) != 0) {
            return true;
        }
        return false;
    }
}
