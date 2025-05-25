package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcn;
import com.google.android.gms.internal.play_billing.zzcs;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public class zzcn<MessageType extends zzcs<MessageType, BuilderType>, BuilderType extends zzcn<MessageType, BuilderType>> extends zzax<MessageType, BuilderType> {
    protected zzcs zza;
    private final zzcs zzb;

    public zzcn(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzw()) {
            this.zza = messagetype.zzl();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zzl(Object obj, Object obj2) {
        zzel.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzax
    /* renamed from: zzb */
    public final zzcn zza() {
        zzcn zzcnVar = (zzcn) this.zzb.zzx(5, null, null);
        zzcnVar.zza = zzg();
        return zzcnVar;
    }

    public final zzcn zzc(zzcs zzcsVar) {
        if (!this.zzb.equals(zzcsVar)) {
            if (!this.zza.zzw()) {
                zzj();
            }
            zzl(this.zza, zzcsVar);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeb
    /* renamed from: zzd */
    public final MessageType zzf() {
        MessageType zzg = zzg();
        if (zzg.zzk()) {
            return zzg;
        }
        throw new zzfe(zzg);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeb
    /* renamed from: zze */
    public MessageType zzg() {
        if (!this.zza.zzw()) {
            return (MessageType) this.zza;
        }
        this.zza.zzr();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final /* bridge */ /* synthetic */ zzec zzh() {
        throw null;
    }

    public final void zzi() {
        if (!this.zza.zzw()) {
            zzj();
        }
    }

    public void zzj() {
        zzcs zzl = this.zzb.zzl();
        zzl(zzl, this.zza);
        this.zza = zzl;
    }

    @Override // com.google.android.gms.internal.play_billing.zzed
    public final boolean zzk() {
        return zzcs.zzv(this.zza, false);
    }
}
