package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public abstract class zzaw {
    final List zza = new ArrayList();

    public abstract zzap zza(String str, zzg zzgVar, List list);

    public final zzap zzb(String str) {
        if (this.zza.contains(zzh.zze(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
