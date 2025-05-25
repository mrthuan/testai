package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public class zzft extends IOException {
    public final int zza;

    public zzft(int i10) {
        this.zza = i10;
    }

    public zzft(String str, int i10) {
        super(str);
        this.zza = i10;
    }

    public zzft(String str, Throwable th2, int i10) {
        super(str, th2);
        this.zza = i10;
    }

    public zzft(Throwable th2, int i10) {
        super(th2);
        this.zza = i10;
    }
}
