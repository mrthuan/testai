package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzff extends zzlb implements zzmj {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private String zzf = "";
    private zzli zzh = zzlb.zzbH();
    private zzli zzi = zzlb.zzbH();
    private zzli zzj = zzlb.zzbH();
    private String zzk = "";
    private zzli zzm = zzlb.zzbH();
    private zzli zzn = zzlb.zzbH();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        zzff zzffVar = new zzff();
        zza = zzffVar;
        zzlb.zzbO(zzff.class, zzffVar);
    }

    private zzff() {
    }

    public static zzfe zze() {
        return (zzfe) zza.zzbA();
    }

    public static zzff zzg() {
        return zza;
    }

    public static /* synthetic */ void zzq(zzff zzffVar, int i10, zzfd zzfdVar) {
        zzfdVar.getClass();
        zzli zzliVar = zzffVar.zzi;
        if (!zzliVar.zzc()) {
            zzffVar.zzi = zzlb.zzbI(zzliVar);
        }
        zzffVar.zzi.set(i10, zzfdVar);
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int i10) {
        return (zzfd) this.zzi.get(i10);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzq;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzo;
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
                    return new zzfe(null);
                }
                return new zzff();
            }
            return zzlb.zzbL(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final List zzm() {
        return this.zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final boolean zzs() {
        return this.zzl;
    }

    public final boolean zzt() {
        if ((this.zzd & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzu() {
        if ((this.zzd & 1) != 0) {
            return true;
        }
        return false;
    }
}
