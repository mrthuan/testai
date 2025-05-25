package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzdwl extends Exception {
    private final int zza;

    public zzdwl(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwl(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdwl(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = 1;
    }
}
