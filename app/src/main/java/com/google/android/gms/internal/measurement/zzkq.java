package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zzkq {
    private static final zzko zza = new zzkp();
    private static final zzko zzb;

    static {
        zzko zzkoVar;
        try {
            zzkoVar = (zzko) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzkoVar = null;
        }
        zzb = zzkoVar;
    }

    public static zzko zza() {
        zzko zzkoVar = zzb;
        if (zzkoVar != null) {
            return zzkoVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzko zzb() {
        return zza;
    }
}
