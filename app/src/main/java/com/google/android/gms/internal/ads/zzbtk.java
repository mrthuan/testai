package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.query.UpdateClickUrlCallback;
import com.google.android.gms.ads.query.UpdateImpressionUrlsCallback;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbtk {
    private final View zza;
    private final Map zzb;
    private final zzbym zzc;

    public zzbtk(zzbtj zzbtjVar) {
        View view;
        Map map;
        View view2;
        view = zzbtjVar.zza;
        this.zza = view;
        map = zzbtjVar.zzb;
        this.zzb = map;
        view2 = zzbtjVar.zza;
        zzbym zza = zzbte.zza(view2.getContext());
        this.zzc = zza;
        if (zza != null && !map.isEmpty()) {
            try {
                zza.zzg(new zzbtl(new ObjectWrapper(view).asBinder(), new ObjectWrapper(map).asBinder()));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.c("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list != null && !list.isEmpty()) {
            if (this.zzc == null) {
                com.google.android.gms.ads.internal.util.client.zzm.e("Failed to get internal reporting info generator in recordClick.");
            }
            try {
                this.zzc.zzh(list, new ObjectWrapper(this.zza), new zzbti(this, list));
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.c("RemoteException recording click: ".concat(e10.toString()));
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("No click urls were passed to recordClick");
    }

    public final void zzb(List list) {
        if (list != null && !list.isEmpty()) {
            zzbym zzbymVar = this.zzc;
            if (zzbymVar != null) {
                try {
                    zzbymVar.zzi(list, new ObjectWrapper(this.zza), new zzbth(this, list));
                    return;
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzm.c("RemoteException recording impression urls: ".concat(e10.toString()));
                    return;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzm.e("Failed to get internal reporting info generator from recordImpression.");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.e("No impression urls were passed to recordImpression");
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbym zzbymVar = this.zzc;
        if (zzbymVar != null) {
            try {
                zzbymVar.zzk(new ObjectWrapper(motionEvent));
                return;
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.c("Failed to call remote method.");
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.b("Failed to get internal reporting info generator.");
    }

    public final void zzd(Uri uri, UpdateClickUrlCallback updateClickUrlCallback) {
        if (this.zzc == null) {
            updateClickUrlCallback.getClass();
        }
        try {
            this.zzc.zzl(new ArrayList(Arrays.asList(uri)), new ObjectWrapper(this.zza), new zzbtg(this, updateClickUrlCallback));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            updateClickUrlCallback.getClass();
        }
    }

    public final void zze(List list, UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        if (this.zzc == null) {
            updateImpressionUrlsCallback.getClass();
        }
        try {
            this.zzc.zzm(list, new ObjectWrapper(this.zza), new zzbtf(this, updateImpressionUrlsCallback));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            updateImpressionUrlsCallback.getClass();
        }
    }
}
