package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzdm extends zzdq {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzdm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzfp.zzf(obj, j10);
        if (list instanceof zzdk) {
            unmodifiableList = ((zzdk) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if ((list instanceof zzek) && (list instanceof zzcz)) {
                zzcz zzczVar = (zzcz) list;
                if (zzczVar.zzc()) {
                    zzczVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        zzfp.zzs(obj, j10, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzdq
    public final void zzb(Object obj, Object obj2, long j10) {
        zzdj zzdjVar;
        List list = (List) zzfp.zzf(obj2, j10);
        int size = list.size();
        List list2 = (List) zzfp.zzf(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof zzdk) {
                list2 = new zzdj(size);
            } else if ((list2 instanceof zzek) && (list2 instanceof zzcz)) {
                list2 = ((zzcz) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzfp.zzs(obj, j10, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzfp.zzs(obj, j10, arrayList);
                zzdjVar = arrayList;
            } else if (list2 instanceof zzfk) {
                zzdj zzdjVar2 = new zzdj(list2.size() + size);
                zzdjVar2.addAll(zzdjVar2.size(), (zzfk) list2);
                zzfp.zzs(obj, j10, zzdjVar2);
                zzdjVar = zzdjVar2;
            } else if ((list2 instanceof zzek) && (list2 instanceof zzcz)) {
                zzcz zzczVar = (zzcz) list2;
                if (!zzczVar.zzc()) {
                    list2 = zzczVar.zzd(list2.size() + size);
                    zzfp.zzs(obj, j10, list2);
                }
            }
            list2 = zzdjVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzfp.zzs(obj, j10, list);
    }

    public /* synthetic */ zzdm(zzdl zzdlVar) {
        super(null);
    }
}
