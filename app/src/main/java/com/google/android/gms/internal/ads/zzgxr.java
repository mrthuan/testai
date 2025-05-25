package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgxr implements zzgzh {
    private static final zzgxr zza = new zzgxr();

    private zzgxr() {
    }

    public static zzgxr zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final zzgzg zzb(Class cls) {
        if (zzgxy.class.isAssignableFrom(cls)) {
            try {
                return (zzgzg) zzgxy.zzbh(cls.asSubclass(zzgxy.class)).zzbO();
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    public final boolean zzc(Class cls) {
        return zzgxy.class.isAssignableFrom(cls);
    }
}
