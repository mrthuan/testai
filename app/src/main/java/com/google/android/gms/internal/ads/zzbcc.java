package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbcc {
    public static final void zza(zzbcb zzbcbVar, zzbbz zzbbzVar) {
        if (zzbbzVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbbzVar.zzb())) {
                zzbcbVar.zzd(zzbbzVar.zza(), zzbbzVar.zzb(), zzbbzVar.zzc(), zzbbzVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
