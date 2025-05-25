package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbjq implements zzbix {
    private final Context zza;

    public zzbjq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        if (map.containsKey("text") && !TextUtils.isEmpty((CharSequence) map.get("text"))) {
            com.google.android.gms.ads.internal.util.zze.h("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
            if (map.containsKey(InMobiNetworkValues.TITLE)) {
                intent.putExtra("android.intent.extra.TITLE", (String) map.get(InMobiNetworkValues.TITLE));
            }
            try {
                com.google.android.gms.ads.internal.util.zzt zztVar = com.google.android.gms.ads.internal.zzu.B.c;
                com.google.android.gms.ads.internal.util.zzt.zzT(this.zza, intent);
            } catch (RuntimeException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.g(5);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "ShareSheetGmsgHandler.onGmsg");
            }
        }
    }
}
