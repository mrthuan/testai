package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcck implements zzbix {
    @Override // com.google.android.gms.internal.ads.zzbix
    public final void zza(Object obj, Map map) {
        float parseFloat;
        zzcbk zzcbkVar = (zzcbk) obj;
        zzcfl zzq = zzcbkVar.zzq();
        if (zzq == null) {
            try {
                zzcfl zzcflVar = new zzcfl(zzcbkVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcbkVar.zzC(zzcflVar);
                zzq = zzcflVar;
            } catch (NullPointerException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzm.g(6);
                com.google.android.gms.ads.internal.zzu.B.f10557g.zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get(InMobiNetworkValues.ASPECT_RATIO);
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (com.google.android.gms.ads.internal.util.client.zzm.g(3)) {
            com.google.android.gms.ads.internal.util.client.zzm.b("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat3, parseFloat2, parseInt, equals, parseFloat);
    }
}
