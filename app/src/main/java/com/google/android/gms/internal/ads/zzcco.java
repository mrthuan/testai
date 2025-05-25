package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcco implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzccn zza(zzcbk zzcbkVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccn zzccnVar = (zzccn) it.next();
            if (zzccnVar.zza == zzcbkVar) {
                return zzccnVar;
            }
        }
        return null;
    }

    public final void zzb(zzccn zzccnVar) {
        this.zza.add(zzccnVar);
    }

    public final void zzc(zzccn zzccnVar) {
        this.zza.remove(zzccnVar);
    }

    public final boolean zzd(zzcbk zzcbkVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzccn zzccnVar = (zzccn) it.next();
            if (zzccnVar.zza == zzcbkVar) {
                arrayList.add(zzccnVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzccn) it2.next()).zzb.zzf();
        }
        return true;
    }
}
