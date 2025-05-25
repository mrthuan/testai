package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaza {
    private final int zza;
    private final zzayx zzb = new zzazc();

    public zzaza(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzayz zzayzVar = new zzayz();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzayy(this));
        for (String str : split) {
            String[] zzb = zzazb.zzb(str, false);
            if (zzb.length != 0) {
                zzazf.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzayzVar.zzb.write(this.zzb.zzb(((zzaze) it.next()).zzb));
            } catch (IOException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
            }
        }
        return zzayzVar.toString();
    }
}
