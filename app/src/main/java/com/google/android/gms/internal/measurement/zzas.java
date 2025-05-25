package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
final class zzas implements Iterator {
    final /* synthetic */ zzat zza;
    private int zzb = 0;

    public zzas(zzat zzatVar) {
        this.zza = zzatVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i10 = this.zzb;
        str = this.zza.zza;
        if (i10 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String str;
        String str2;
        int i10 = this.zzb;
        zzat zzatVar = this.zza;
        str = zzatVar.zza;
        if (i10 < str.length()) {
            str2 = zzatVar.zza;
            this.zzb = i10 + 1;
            return new zzat(String.valueOf(str2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
