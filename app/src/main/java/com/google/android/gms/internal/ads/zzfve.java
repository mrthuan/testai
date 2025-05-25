package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfve implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfvh zzb;

    public zzfve(zzfvh zzfvhVar, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzfvhVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator zzf;
        zzf = this.zzb.zzf(this.zza);
        return zzf;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzfum.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
