package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzj {
    final Map zza = new HashMap();

    public final void zza(String str, Callable callable) {
        this.zza.put(str, callable);
    }
}
