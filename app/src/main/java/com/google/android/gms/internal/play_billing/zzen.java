package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzen implements zzdz {
    private final zzec zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzen(zzec zzecVar, String str, Object[] objArr) {
        this.zza = zzecVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 55296) {
                i10 |= (charAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            } else {
                this.zzd = i10 | (charAt2 << i12);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final zzec zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final boolean zzb() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdz
    public final int zzc() {
        int i10 = this.zzd;
        if ((i10 & 1) != 0) {
            return 1;
        }
        if ((i10 & 4) == 4) {
            return 3;
        }
        return 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
