package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzccg {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzaqx zzaqxVar;
        zzaqw zzaqwVar;
        long j10 = this.zza;
        if (j10 > 0) {
            return j10;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzaqs(new zzccf(duplicate), zzcci.zzb).zzd().iterator();
            while (true) {
                zzaqxVar = null;
                if (it.hasNext()) {
                    zzaqu zzaquVar = (zzaqu) it.next();
                    if (zzaquVar instanceof zzaqw) {
                        zzaqwVar = (zzaqw) zzaquVar;
                        break;
                    }
                } else {
                    zzaqwVar = null;
                    break;
                }
            }
            Iterator it2 = zzaqwVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzaqu zzaquVar2 = (zzaqu) it2.next();
                if (zzaquVar2 instanceof zzaqx) {
                    zzaqxVar = (zzaqx) zzaquVar2;
                    break;
                }
            }
            long zzc = (zzaqxVar.zzc() * 1000) / zzaqxVar.zzd();
            this.zza = zzc;
            return zzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
