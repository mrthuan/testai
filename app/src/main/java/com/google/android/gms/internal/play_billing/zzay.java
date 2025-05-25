package com.google.android.gms.internal.play_billing;

import a6.h;
import com.google.android.gms.internal.play_billing.zzax;
import com.google.android.gms.internal.play_billing.zzay;
import java.io.IOException;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
public abstract class zzay<MessageType extends zzay<MessageType, BuilderType>, BuilderType extends zzax<MessageType, BuilderType>> implements zzec {
    protected int zza = 0;

    public int zza(zzeo zzeoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzec
    public final zzbq zzb() {
        try {
            int zzf = zzf();
            zzbq zzbqVar = zzbq.zzb;
            byte[] bArr = new byte[zzf];
            zzby zzy = zzby.zzy(bArr, 0, zzf);
            zze(zzy);
            zzy.zzz();
            return new zzbn(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(h.d("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final byte[] zzc() {
        try {
            int zzf = zzf();
            byte[] bArr = new byte[zzf];
            zzby zzy = zzby.zzy(bArr, 0, zzf);
            zze(zzy);
            zzy.zzz();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(h.d("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
