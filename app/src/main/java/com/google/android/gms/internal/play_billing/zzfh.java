package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzfh extends zzff {
    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ int zza(Object obj) {
        return ((zzfg) obj).zza();
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzfg) obj).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar == zzfg.zzc()) {
            zzfg zzf = zzfg.zzf();
            zzcsVar.zzc = zzf;
            return zzf;
        }
        return zzfgVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzcs) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (!zzfg.zzc().equals(obj2)) {
            if (zzfg.zzc().equals(obj)) {
                return zzfg.zze((zzfg) obj, (zzfg) obj2);
            }
            ((zzfg) obj).zzd((zzfg) obj2);
            return obj;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i10, long j10) {
        ((zzfg) obj).zzj(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final void zzg(Object obj) {
        ((zzcs) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzcs) obj).zzc = (zzfg) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ void zzi(Object obj, zzfx zzfxVar) {
        ((zzfg) obj).zzk(zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzff
    public final /* synthetic */ void zzj(Object obj, zzfx zzfxVar) {
        ((zzfg) obj).zzl(zzfxVar);
    }
}
