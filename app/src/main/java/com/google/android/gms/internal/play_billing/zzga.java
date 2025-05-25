package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzga extends zzcs implements zzed {
    private static final zzga zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzgk zzh;

    static {
        zzga zzgaVar = new zzga();
        zzb = zzgaVar;
        zzcs.zzt(zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static zzga zzA(byte[] bArr, zzcd zzcdVar) {
        return (zzga) zzcs.zzm(zzb, bArr, zzcdVar);
    }

    public static /* synthetic */ void zzB(zzga zzgaVar, zzgk zzgkVar) {
        zzgkVar.getClass();
        zzgaVar.zzh = zzgkVar;
        zzgaVar.zzd |= 2;
    }

    public static /* synthetic */ void zzC(zzga zzgaVar, zzhb zzhbVar) {
        zzhbVar.getClass();
        zzgaVar.zzf = zzhbVar;
        zzgaVar.zze = 4;
    }

    public static /* synthetic */ void zzD(zzga zzgaVar, int i10) {
        zzgaVar.zzg = i10 - 1;
        zzgaVar.zzd |= 1;
    }

    public static zzfz zzy() {
        return (zzfz) zzb.zzg();
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
                    return new zzfz(null);
                }
                return new zzga();
            }
            return zzcs.zzq(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzgb.zza, "zzh", zzhb.class});
        }
        return (byte) 1;
    }
}
