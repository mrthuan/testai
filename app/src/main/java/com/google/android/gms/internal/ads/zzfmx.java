package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfmx implements zzfmv {
    private final zzfmv zza;

    public zzfmx(zzfmv zzfmvVar) {
        this.zza = zzfmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final JSONObject zza(View view) {
        boolean z10 = false;
        JSONObject zza = zzfnf.zza(0, 0, 0, 0);
        int zzb = zzfni.zzb();
        int i10 = zzb - 1;
        if (zzb != 0) {
            if (i10 == 0) {
                z10 = true;
            }
            try {
                zza.put("noOutputDevice", z10);
            } catch (JSONException e10) {
                zzfng.zza("Error with setting output device status", e10);
            }
            return zza;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfmv
    public final void zzb(View view, JSONObject jSONObject, zzfmu zzfmuVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfml zza = zzfml.zza();
        if (zza != null) {
            Collection<zzflu> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzflu zzfluVar : zzb) {
                View zzf = zzfluVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                } else {
                                    view2 = null;
                                }
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    }
                                    size2 = i10;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfmuVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
