package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfml {
    private static final zzfml zza = new zzfml();
    private final ArrayList zzb = new ArrayList();
    private final ArrayList zzc = new ArrayList();

    private zzfml() {
    }

    public static zzfml zza() {
        return zza;
    }

    public final Collection zzb() {
        return Collections.unmodifiableCollection(this.zzc);
    }

    public final Collection zzc() {
        return Collections.unmodifiableCollection(this.zzb);
    }

    public final void zzd(zzflu zzfluVar) {
        this.zzb.add(zzfluVar);
    }

    public final void zze(zzflu zzfluVar) {
        ArrayList arrayList = this.zzb;
        boolean zzg = zzg();
        arrayList.remove(zzfluVar);
        this.zzc.remove(zzfluVar);
        if (zzg && !zzg()) {
            zzfmt.zzb().zzg();
        }
    }

    public final void zzf(zzflu zzfluVar) {
        ArrayList arrayList = this.zzc;
        boolean zzg = zzg();
        arrayList.add(zzfluVar);
        if (!zzg) {
            zzfmt.zzb().zzf();
        }
    }

    public final boolean zzg() {
        if (this.zzc.size() > 0) {
            return true;
        }
        return false;
    }
}
