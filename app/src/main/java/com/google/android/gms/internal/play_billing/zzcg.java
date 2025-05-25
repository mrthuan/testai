package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzcg {
    private static final zzce zza = new zzcf();
    private static final zzce zzb;

    static {
        zzce zzceVar;
        try {
            zzceVar = (zzce) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzceVar = null;
        }
        zzb = zzceVar;
    }

    public static zzce zza() {
        zzce zzceVar = zzb;
        if (zzceVar != null) {
            return zzceVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzce zzb() {
        return zza;
    }
}
