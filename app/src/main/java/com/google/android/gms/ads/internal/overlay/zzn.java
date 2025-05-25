package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzdeq;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzn {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        zzy zzyVar;
        if (adOverlayInfoParcel.f10278k == 4 && adOverlayInfoParcel.c == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.f10270b;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            zzdeq zzdeqVar = adOverlayInfoParcel.f10288u;
            if (zzdeqVar != null) {
                zzdeqVar.zzdG();
            }
            Activity zzi = adOverlayInfoParcel.f10271d.zzi();
            zzc zzcVar = adOverlayInfoParcel.f10269a;
            if (zzcVar != null && zzcVar.f10299j && zzi != null) {
                context = zzi;
            }
            zza zzaVar2 = com.google.android.gms.ads.internal.zzu.B.f10552a;
            if (zzcVar != null) {
                zzyVar = zzcVar.f10298i;
            } else {
                zzyVar = null;
            }
            zza.b(context, zzcVar, adOverlayInfoParcel.f10276i, zzyVar);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f10280m.f10347d);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
        com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
    }
}
