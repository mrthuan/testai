package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcfg implements zzbix {
    final /* synthetic */ zzcfi zza;

    public zzcfg(zzcfi zzcfiVar) {
        this.zza = zzcfiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        int i10;
        zzcej zzcejVar = (zzcej) obj;
        if (map != null) {
            String str = (String) map.get(InMobiNetworkValues.HEIGHT);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.zza) {
                        zzcfi zzcfiVar = this.zza;
                        i10 = zzcfiVar.zzI;
                        if (i10 != parseInt) {
                            zzcfiVar.zzI = parseInt;
                            this.zza.requestLayout();
                        }
                    }
                } catch (Exception unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.g(5);
                }
            }
        }
    }
}
