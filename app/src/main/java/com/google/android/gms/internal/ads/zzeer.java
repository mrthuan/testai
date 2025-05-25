package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;
import androidx.privacysandbox.ads.adservices.topics.a;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeer {
    private final Context zza;

    public zzeer(Context context) {
        this.zza = context;
    }

    public final y9.a zza(boolean z10) {
        int i10;
        TopicsManagerImplCommon topicsManagerImplCommon;
        try {
            new a.C0020a();
            androidx.privacysandbox.ads.adservices.topics.a aVar = new androidx.privacysandbox.ads.adservices.topics.a("com.google.android.gms.ads", z10);
            Context context = this.zza;
            kotlin.jvm.internal.g.e(context, "context");
            int i11 = Build.VERSION.SDK_INT;
            s1.a aVar2 = s1.a.f29699a;
            int i12 = 0;
            if (i11 >= 30) {
                i10 = aVar2.a();
            } else {
                i10 = 0;
            }
            TopicsManagerFutures.Api33Ext4JavaImpl api33Ext4JavaImpl = null;
            if (i10 >= 5) {
                topicsManagerImplCommon = new androidx.privacysandbox.ads.adservices.topics.l(context);
            } else {
                if (i11 >= 30) {
                    i12 = aVar2.a();
                }
                if (i12 == 4) {
                    topicsManagerImplCommon = new androidx.privacysandbox.ads.adservices.topics.g(context);
                } else {
                    topicsManagerImplCommon = null;
                }
            }
            if (topicsManagerImplCommon != null) {
                api33Ext4JavaImpl = new TopicsManagerFutures.Api33Ext4JavaImpl(topicsManagerImplCommon);
            }
            if (api33Ext4JavaImpl != null) {
                return api33Ext4JavaImpl.a(aVar);
            }
            return zzgcj.zzg(new IllegalStateException());
        } catch (Exception e10) {
            return zzgcj.zzg(e10);
        }
    }
}
