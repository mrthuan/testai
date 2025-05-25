package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgbr extends zzgbt {
    public zzgbr(zzfxm zzfxmVar, boolean z10) {
        super(zzfxmVar, z10);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbt
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzfyh.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgbs zzgbsVar = (zzgbs) it.next();
            if (zzgbsVar != null) {
                obj = zzgbsVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
