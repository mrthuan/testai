package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfvh {
    private final zzfvg zza;

    private zzfvh(zzfvg zzfvgVar) {
        this.zza = zzfvgVar;
    }

    public static zzfvh zza(int i10) {
        return new zzfvh(new zzfvd(4000));
    }

    public static zzfvh zzb(zzfui zzfuiVar) {
        return new zzfvh(new zzfvb(zzfuiVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzf(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzc(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfve(this, charSequence);
    }

    public final List zze(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzf.hasNext()) {
            arrayList.add((String) zzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
