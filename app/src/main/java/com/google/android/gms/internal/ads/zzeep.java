package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import java.util.Objects;
import t1.f;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeep {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzeep(Context context) {
        this.zzb = context;
    }

    public final y9.a zza() {
        int i10;
        f.a aVar;
        try {
            Context context = this.zzb;
            kotlin.jvm.internal.g.e(context, "context");
            int i11 = Build.VERSION.SDK_INT;
            s1.a aVar2 = s1.a.f29699a;
            if (i11 >= 30) {
                aVar2.a();
            }
            if (i11 >= 30) {
                i10 = aVar2.a();
            } else {
                i10 = 0;
            }
            MeasurementManagerFutures.Api33Ext5JavaImpl api33Ext5JavaImpl = null;
            if (i10 >= 5) {
                aVar = new f.a(context);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                api33Ext5JavaImpl = new MeasurementManagerFutures.Api33Ext5JavaImpl(aVar);
            }
            this.zza = api33Ext5JavaImpl;
            if (api33Ext5JavaImpl == null) {
                return zzgcj.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
            }
            return api33Ext5JavaImpl.c();
        } catch (Exception e10) {
            return zzgcj.zzg(e10);
        }
    }

    public final y9.a zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.a(uri, inputEvent);
        } catch (Exception e10) {
            return zzgcj.zzg(e10);
        }
    }
}
