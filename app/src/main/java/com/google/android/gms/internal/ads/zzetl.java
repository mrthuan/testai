package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzetl implements zzevo {
    private final zzgcu zza;
    private final zzffg zzb;
    private final PackageInfo zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;

    public zzetl(zzgcu zzgcuVar, zzffg zzffgVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgcuVar;
        this.zzb = zzffgVar;
        this.zzc = packageInfo;
        this.zzd = zzgVar;
    }

    public static /* synthetic */ zzetm zzc(final zzetl zzetlVar) {
        final ArrayList arrayList = zzetlVar.zzb.zzg;
        if (arrayList == null) {
            return new zzetm() { // from class: com.google.android.gms.internal.ads.zzeti
                @Override // com.google.android.gms.internal.ads.zzevn
                public final void zzj(Object obj) {
                    Bundle bundle = (Bundle) obj;
                }
            };
        }
        if (arrayList.isEmpty()) {
            return new zzetm() { // from class: com.google.android.gms.internal.ads.zzetj
                @Override // com.google.android.gms.internal.ads.zzevn
                public final void zzj(Object obj) {
                    ((Bundle) obj).putInt("native_version", 0);
                }
            };
        }
        return new zzetm() { // from class: com.google.android.gms.internal.ads.zzetk
            @Override // com.google.android.gms.internal.ads.zzevn
            public final void zzj(Object obj) {
                zzetl.this.zzd(arrayList, (Bundle) obj);
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.zzevo
    public final y9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzetl.zzc(zzetl.this);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fc, code lost:
        if (r9 == 3) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.util.ArrayList r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzetl.zzd(java.util.ArrayList, android.os.Bundle):void");
    }
}
