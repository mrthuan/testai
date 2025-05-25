package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfxx {
    public static Object zza(Iterable iterable, Object obj) {
        zzfzm zzfzmVar = new zzfzm((zzfzn) iterable);
        if (zzfzmVar.hasNext()) {
            return zzfzmVar.next();
        }
        return obj;
    }

    public static boolean zzb(Iterable iterable, zzfuv zzfuvVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzfuvVar.getClass();
            return zzd((List) iterable, zzfuvVar);
        }
        Iterator it = iterable.iterator();
        zzfuvVar.getClass();
        boolean z10 = false;
        while (it.hasNext()) {
            if (zzfuvVar.zza(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    private static void zzc(List list, zzfuv zzfuvVar, int i10, int i11) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i11) {
                break;
            } else if (zzfuvVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i11--;
            if (i11 >= i10) {
                list.remove(i11);
            } else {
                return;
            }
        }
    }

    private static boolean zzd(List list, zzfuv zzfuvVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!zzfuvVar.zza(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        zzc(list, zzfuvVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzc(list, zzfuvVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        if (i10 == i11) {
            return false;
        }
        return true;
    }
}
