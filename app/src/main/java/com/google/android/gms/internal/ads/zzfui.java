package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzfui implements zzfuv {
    public static zzfui zzc(char c) {
        return new zzfuh(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfuv
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
