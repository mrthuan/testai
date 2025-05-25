package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfva extends zzfvf {
    final /* synthetic */ zzfvb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfva(zzfvb zzfvbVar, zzfvh zzfvhVar, CharSequence charSequence) {
        super(zzfvhVar, charSequence);
        this.zza = zzfvbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzc(int i10) {
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final int zzd(int i10) {
        CharSequence charSequence = ((zzfvf) this).zzb;
        int length = charSequence.length();
        zzfuu.zzb(i10, length, "index");
        while (i10 < length) {
            zzfvb zzfvbVar = this.zza;
            if (!zzfvbVar.zza.zzb(charSequence.charAt(i10))) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }
}
