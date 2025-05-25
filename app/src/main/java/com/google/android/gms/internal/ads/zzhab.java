package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzhab implements Iterator {
    private final ArrayDeque zza;
    private zzgwj zzb;

    public /* synthetic */ zzhab(zzgwm zzgwmVar, zzhaa zzhaaVar) {
        zzgwm zzgwmVar2;
        if (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar = (zzhad) zzgwmVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhadVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhadVar);
            zzgwmVar2 = zzhadVar.zzd;
            this.zzb = zzb(zzgwmVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgwj) zzgwmVar;
    }

    private final zzgwj zzb(zzgwm zzgwmVar) {
        while (zzgwmVar instanceof zzhad) {
            zzhad zzhadVar = (zzhad) zzgwmVar;
            this.zza.push(zzhadVar);
            zzgwmVar = zzhadVar.zzd;
        }
        return (zzgwj) zzgwmVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zzb != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgwj next() {
        zzgwj zzgwjVar;
        zzgwm zzgwmVar;
        zzgwj zzgwjVar2 = this.zzb;
        if (zzgwjVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgwjVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgwmVar = ((zzhad) this.zza.pop()).zze;
                zzgwjVar = zzb(zzgwmVar);
            } while (zzgwjVar.zzd() == 0);
            this.zzb = zzgwjVar;
            return zzgwjVar2;
        }
        throw new NoSuchElementException();
    }
}
