package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmy implements zzfmv {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfnf.zza(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.zza;
        return zzfnf.zza(iArr2[0], iArr2[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzb(View view, JSONObject jSONObject, zzfmu zzfmuVar, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z10) {
                HashMap hashMap = new HashMap();
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get((Float) arrayList2.get(i12));
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (true) {
                        i10 = i12 + 1;
                        if (i13 < size2) {
                            zzfmuVar.zza((View) arrayList3.get(i13), this, jSONObject, z11);
                            i13++;
                        }
                    }
                    i12 = i10;
                }
                return;
            }
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                zzfmuVar.zza(viewGroup.getChildAt(i14), this, jSONObject, z11);
            }
        }
    }
}
