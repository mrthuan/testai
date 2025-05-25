package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzix extends zziu {
    public zzix() {
        super(4);
    }

    public final zzix zza(Object... objArr) {
        zzjd.zzb(objArr, 15);
        int i10 = this.zzb + 15;
        Object[] objArr2 = this.zza;
        int length = objArr2.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            this.zza = Arrays.copyOf(objArr2, i11);
            this.zzc = false;
        } else if (this.zzc) {
            this.zza = (Object[]) objArr2.clone();
            this.zzc = false;
        }
        System.arraycopy(objArr, 0, this.zza, this.zzb, 15);
        this.zzb += 15;
        return this;
    }

    public final zzja zzb() {
        this.zzc = true;
        return zzja.zzg(this.zza, this.zzb);
    }
}
