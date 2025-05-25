package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbif implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        zzcej zzcejVar = (zzcej) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.h("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzftj zzl = zzftk.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzh(zzcejVar.getWidth());
        zzl.zzg(zzcejVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzu.B.f10567q.b(zzcejVar, zzl.zzi());
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e10, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.h("Missing parameters for LMD Overlay show request");
        }
    }
}
