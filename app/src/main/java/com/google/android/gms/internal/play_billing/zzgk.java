package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzgk extends zzcs implements zzed {
    private static final zzgk zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzgk zzgkVar = new zzgk();
        zzb = zzgkVar;
        zzcs.zzt(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public static /* synthetic */ void zzA(zzgk zzgkVar, int i10) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i10;
    }

    public static /* synthetic */ void zzB(zzgk zzgkVar, String str) {
        str.getClass();
        zzgkVar.zzd |= 2;
        zzgkVar.zzf = str;
    }

    public static /* synthetic */ void zzC(zzgk zzgkVar, String str) {
        zzgkVar.zzd |= 8;
        zzgkVar.zzh = str;
    }

    public static /* synthetic */ void zzD(zzgk zzgkVar, int i10) {
        zzgkVar.zzg = i10 - 1;
        zzgkVar.zzd |= 4;
    }

    public static zzgg zzy() {
        return (zzgg) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    public final Object zzx(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 != 0) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgg(null);
                }
                return new zzgk();
            }
            return zzcs.zzq(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", zzgi.zza, "zzh"});
        }
        return (byte) 1;
    }
}
