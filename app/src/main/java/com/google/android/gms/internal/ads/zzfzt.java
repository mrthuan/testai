package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfzt {
    public static int zza(Set set) {
        int i10;
        int i11 = 0;
        for (Object obj : set) {
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i11 += i10;
        }
        return i11;
    }

    public static zzfzs zzb(Set set, Set set2) {
        zzfuu.zzc(set, "set1");
        zzfuu.zzc(set2, "set2");
        return new zzfzn(set, set2);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzc(Set set, zzfuv zzfuvVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzfzo) {
                zzfzo zzfzoVar = (zzfzo) sortedSet;
                return new zzfzp((SortedSet) zzfzoVar.zza, zzfuy.zza(zzfzoVar.zzb, zzfuvVar));
            }
            sortedSet.getClass();
            return new zzfzp(sortedSet, zzfuvVar);
        } else if (set instanceof zzfzo) {
            zzfzo zzfzoVar2 = (zzfzo) set;
            return new zzfzo(zzfzoVar2.zza, zzfuy.zza(zzfzoVar2.zzb, zzfuvVar));
        } else {
            set.getClass();
            return new zzfzo(set, zzfuvVar);
        }
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzfyz) {
            collection = ((zzfyz) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        return zzf(set, collection.iterator());
    }

    public static boolean zzf(Set set, Iterator it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
