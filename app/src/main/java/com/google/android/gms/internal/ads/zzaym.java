package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaym {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final zzayl zza(boolean z10) {
        int i10;
        synchronized (this.zzb) {
            zzayl zzaylVar = null;
            if (this.zzc.isEmpty()) {
                com.google.android.gms.ads.internal.util.client.zzm.b("Queue empty");
                return null;
            }
            int i11 = 0;
            if (this.zzc.size() >= 2) {
                int i12 = SlideAtom.USES_MASTER_SLIDE_ID;
                int i13 = 0;
                for (zzayl zzaylVar2 : this.zzc) {
                    int zzb = zzaylVar2.zzb();
                    if (zzb > i12) {
                        i11 = i13;
                    }
                    if (zzb > i12) {
                        i10 = zzb;
                    } else {
                        i10 = i12;
                    }
                    if (zzb > i12) {
                        zzaylVar = zzaylVar2;
                    }
                    i13++;
                    i12 = i10;
                }
                this.zzc.remove(i11);
                return zzaylVar;
            }
            zzayl zzaylVar3 = (zzayl) this.zzc.get(0);
            if (z10) {
                this.zzc.remove(0);
            } else {
                zzaylVar3.zzi();
            }
            return zzaylVar3;
        }
    }

    public final void zzb(zzayl zzaylVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                com.google.android.gms.ads.internal.util.client.zzm.b("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i10 = this.zza;
            this.zza = i10 + 1;
            zzaylVar.zzj(i10);
            zzaylVar.zzn();
            this.zzc.add(zzaylVar);
        }
    }

    public final boolean zzc(zzayl zzaylVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzayl zzaylVar2 = (zzayl) it.next();
                    com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
                    if (!zzuVar.f10557g.zzi().zzP()) {
                        if (!zzaylVar.equals(zzaylVar2) && zzaylVar2.zzd().equals(zzaylVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzuVar.f10557g.zzi().zzQ() && !zzaylVar.equals(zzaylVar2) && zzaylVar2.zzf().equals(zzaylVar.zzf())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzd(zzayl zzaylVar) {
        synchronized (this.zzb) {
            if (this.zzc.contains(zzaylVar)) {
                return true;
            }
            return false;
        }
    }
}
