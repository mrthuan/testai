package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzafd {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaez zza(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafd.zza(java.lang.String):com.google.android.gms.internal.ads.zzaez");
    }

    private static zzfxr zzb(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        zzfxo zzfxoVar = new zzfxo();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzeu.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzeu.zza(xmlPullParser, concat2);
                String zza3 = zzeu.zza(xmlPullParser, concat3);
                String zza4 = zzeu.zza(xmlPullParser, concat4);
                String zza5 = zzeu.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    if (zza4 != null) {
                        j10 = Long.parseLong(zza4);
                    } else {
                        j10 = 0;
                    }
                    if (zza5 != null) {
                        j11 = Long.parseLong(zza5);
                    } else {
                        j11 = 0;
                    }
                    zzfxoVar.zzf(new zzaey(zza2, zza3, j10, j11));
                } else {
                    return zzfxr.zzm();
                }
            }
        } while (!zzeu.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfxoVar.zzi();
    }
}
