package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzzn implements zzbx {
    private final zzcm zza;

    public zzzn(zzcm zzcmVar) {
        this.zza = zzcmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbx
    public final zzby zza(Context context, zzo zzoVar, zzr zzrVar, zzco zzcoVar, Executor executor, List list, long j10) {
        Constructor<?> constructor;
        Object[] objArr;
        try {
            constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzcm.class);
            objArr = new Object[1];
        } catch (Exception e10) {
            e = e10;
        }
        try {
            objArr[0] = this.zza;
            return ((zzbx) constructor.newInstance(objArr)).zza(context, zzoVar, zzrVar, zzcoVar, executor, list, 0L);
        } catch (Exception e11) {
            e = e11;
            if (e instanceof zzcl) {
                throw ((zzcl) e);
            }
            throw new zzcl(e, -9223372036854775807L);
        }
    }
}
