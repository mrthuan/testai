package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzdka implements zzber {
    final /* synthetic */ zzdkx zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdka(zzdkx zzdkxVar, ViewGroup viewGroup) {
        this.zza = zzdkxVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final JSONObject zza() {
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzc() {
        zzfxr zzfxrVar = zzdjx.zza;
        Map zzm = this.zza.zzm();
        if (zzm != null) {
            int size = zzfxrVar.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = zzm.get((String) zzfxrVar.get(i10));
                i10++;
                if (obj != null) {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzber
    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }
}
