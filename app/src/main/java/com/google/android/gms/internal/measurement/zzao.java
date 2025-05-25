package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzao extends zzai {
    protected final List zza;
    protected final List zzb;
    protected zzg zzc;

    private zzao(zzao zzaoVar) {
        super(zzaoVar.zzd);
        ArrayList arrayList = new ArrayList(zzaoVar.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzaoVar.zza);
        ArrayList arrayList2 = new ArrayList(zzaoVar.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzaoVar.zzb);
        this.zzc = zzaoVar.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzg zza = this.zzc.zza();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (i10 < list.size()) {
                zza.zze((String) this.zza.get(i10), zzgVar.zzb((zzap) list.get(i10)));
            } else {
                zza.zze((String) this.zza.get(i10), zzap.zzf);
            }
        }
        for (zzap zzapVar : this.zzb) {
            zzap zzb = zza.zzb(zzapVar);
            if (zzb instanceof zzaq) {
                zzb = zza.zzb(zzapVar);
            }
            if (zzb instanceof zzag) {
                return ((zzag) zzb).zzb();
            }
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzai, com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzgVar) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzgVar;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zza.add(((zzap) it.next()).zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
