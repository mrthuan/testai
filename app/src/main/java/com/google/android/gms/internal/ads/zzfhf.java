package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfhf implements zzfhe {
    private final Object[] zza;

    public zzfhf(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, int i10, String str2, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i10));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.f10201b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(zza(zzlVar.c));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzlVar.c.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzlVar.f10202d));
        }
        if (hashSet.contains("keywords")) {
            List list = zzlVar.f10203e;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzlVar.f10204f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzlVar.f10205g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzlVar.f10206h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzlVar.f10207i);
        }
        if (hashSet.contains("location")) {
            Location location = zzlVar.f10209k;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzlVar.f10210l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(zza(zzlVar.f10211m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(zza(zzlVar.f10212n));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzlVar.f10213o;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzlVar.f10214p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzlVar.f10215q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzlVar.f10216r));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzlVar.f10218t));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzlVar.f10219u);
        }
        if (hashSet.contains("orientation")) {
            if (zzwVar != null) {
                arrayList.add(Integer.valueOf(zzwVar.f10262a));
            } else {
                arrayList.add(null);
            }
        }
        this.zza = arrayList.toArray();
    }

    private static String zza(Bundle bundle) {
        String obj;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj2 = bundle.get((String) it.next());
            if (obj2 == null) {
                obj = "null";
            } else if (obj2 instanceof Bundle) {
                obj = zza((Bundle) obj2);
            } else {
                obj = obj2.toString();
            }
            sb2.append(obj);
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfhe
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfhf)) {
            return false;
        }
        return Arrays.equals(this.zza, ((zzfhf) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhe
    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        Object[] objArr = this.zza;
        int hashCode = Arrays.hashCode(objArr);
        String arrays = Arrays.toString(objArr);
        return "[PoolKey#" + hashCode + " " + arrays + "]";
    }
}
