package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdd {
    private static final String zza = Integer.toString(0, 36);
    private static final String zzb = Integer.toString(1, 36);
    private static final String zzc = Integer.toString(2, 36);
    private static final String zzd = Integer.toString(3, 36);
    private static final String zze = Integer.toString(4, 36);

    public static ArrayList zza(Spanned spanned) {
        zzdf[] zzdfVarArr;
        zzdh[] zzdhVarArr;
        ArrayList arrayList = new ArrayList();
        for (zzdf zzdfVar : (zzdf[]) spanned.getSpans(0, spanned.length(), zzdf.class)) {
            arrayList.add(zzb(spanned, zzdfVar, 1, zzdfVar.zza()));
        }
        for (zzdh zzdhVar : (zzdh[]) spanned.getSpans(0, spanned.length(), zzdh.class)) {
            arrayList.add(zzb(spanned, zzdhVar, 2, zzdhVar.zza()));
        }
        for (zzde zzdeVar : (zzde[]) spanned.getSpans(0, spanned.length(), zzde.class)) {
            arrayList.add(zzb(spanned, zzdeVar, 3, null));
        }
        return arrayList;
    }

    private static Bundle zzb(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zza, spanned.getSpanStart(obj));
        bundle2.putInt(zzb, spanned.getSpanEnd(obj));
        bundle2.putInt(zzc, spanned.getSpanFlags(obj));
        bundle2.putInt(zzd, i10);
        if (bundle != null) {
            bundle2.putBundle(zze, bundle);
        }
        return bundle2;
    }
}
