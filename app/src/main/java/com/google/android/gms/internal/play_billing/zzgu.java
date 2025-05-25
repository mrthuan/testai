package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzgu extends zzcs implements zzed {
    private static final zzgu zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzcs.zzt(zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    public static /* synthetic */ void zzA(zzgu zzguVar, String str) {
        str.getClass();
        zzguVar.zzd |= 1;
        zzguVar.zze = str;
    }

    public static /* synthetic */ void zzB(zzgu zzguVar, String str) {
        str.getClass();
        zzguVar.zzd |= 2;
        zzguVar.zzf = str;
    }

    public static /* synthetic */ void zzC(zzgu zzguVar, int i10) {
        zzguVar.zzd |= 4;
        zzguVar.zzg = i10;
    }

    public static zzgt zzy() {
        return (zzgt) zzb.zzg();
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
                    return new zzgt(null);
                }
                return new zzgu();
            }
            return zzcs.zzq(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
