package com.google.android.gms.internal.play_billing;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public final class zzdu implements zzep {
    private static final zzea zza = new zzds();
    private final zzea zzb;

    public zzdu() {
        zzea zzeaVar;
        zzea[] zzeaVarArr = new zzea[2];
        zzeaVarArr[0] = zzcm.zza();
        try {
            zzeaVar = (zzea) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzeaVar = zza;
        }
        zzeaVarArr[1] = zzeaVar;
        zzdt zzdtVar = new zzdt(zzeaVarArr);
        byte[] bArr = zzda.zzd;
        this.zzb = zzdtVar;
    }

    private static boolean zzb(zzdz zzdzVar) {
        if (zzdzVar.zzc() - 1 != 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzep
    public final zzeo zza(Class cls) {
        zzeq.zzr(cls);
        zzdz zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zzcs.class.isAssignableFrom(cls)) {
                return zzeg.zzc(zzeq.zzn(), zzcg.zzb(), zzb.zza());
            }
            return zzeg.zzc(zzeq.zzm(), zzcg.zza(), zzb.zza());
        } else if (zzcs.class.isAssignableFrom(cls)) {
            if (zzb(zzb)) {
                return zzef.zzl(cls, zzb, zzej.zzb(), zzdq.zzd(), zzeq.zzn(), zzcg.zzb(), zzdy.zzb());
            }
            return zzef.zzl(cls, zzb, zzej.zzb(), zzdq.zzd(), zzeq.zzn(), null, zzdy.zzb());
        } else if (zzb(zzb)) {
            return zzef.zzl(cls, zzb, zzej.zza(), zzdq.zzc(), zzeq.zzm(), zzcg.zza(), zzdy.zza());
        } else {
            return zzef.zzl(cls, zzb, zzej.zza(), zzdq.zzc(), zzeq.zzm(), null, zzdy.zza());
        }
    }
}
