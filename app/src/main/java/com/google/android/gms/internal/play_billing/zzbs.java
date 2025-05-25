package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzbs extends zzbu {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzbs(byte[] bArr, int i10, int i11, boolean z10, zzbr zzbrVar) {
        super(null);
        this.zze = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i10) {
        int i11 = this.zze;
        this.zze = 0;
        int i12 = this.zzc + this.zzd;
        this.zzc = i12;
        if (i12 > 0) {
            this.zzd = i12;
            this.zzc = i12 - i12;
        } else {
            this.zzd = 0;
        }
        return i11;
    }
}
