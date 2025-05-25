package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzffm {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfem zzfemVar = (zzfem) it.next();
            if (zzfemVar.zzc) {
                arrayList.add(AdSize.f10021p);
            } else {
                arrayList.add(new AdSize(zzfemVar.zza, zzfemVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfem zzb(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.f10245i) {
            return new zzfem(-3, 0, true);
        }
        return new zzfem(zzqVar.f10241e, zzqVar.f10239b, false);
    }
}
