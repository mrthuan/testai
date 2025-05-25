package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzsg {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
        r6 = ((com.google.android.gms.internal.ads.zzsf) r4.get(r5)).zzd.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        androidx.appcompat.widget.z.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
        if (zzb(r6, a4.g.c()) != 1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = androidx.appcompat.widget.u.f(r2)
            r0 = 0
            if (r2 == 0) goto L9d
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto L9d
        Lf:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = a4.f.e(r3, r4, r5)
            int r2 = zzb(r2, r3)
            r3 = 1
            if (r2 != r3) goto L9c
            java.lang.Boolean r4 = com.google.android.gms.internal.ads.zzsh.zzb()
            if (r4 != 0) goto L9c
            int r4 = com.google.android.gms.internal.ads.zzet.zza
            r5 = 35
            if (r4 < r5) goto L28
            goto L85
        L28:
            com.google.android.gms.internal.ads.zzad r4 = new com.google.android.gms.internal.ads.zzad     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            r4.<init>()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            java.lang.String r5 = "video/avc"
            r4.zzX(r5)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            com.google.android.gms.internal.ads.zzaf r4 = r4.zzad()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            java.lang.String r5 = r4.zzm     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r5 == 0) goto L8a
            com.google.android.gms.internal.ads.zzsq r5 = com.google.android.gms.internal.ads.zzsq.zza     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            java.util.List r4 = com.google.android.gms.internal.ads.zztc.zzf(r5, r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            r5 = r0
        L41:
            int r6 = r4.size()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r5 >= r6) goto L8a
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            com.google.android.gms.internal.ads.zzsf r6 = (com.google.android.gms.internal.ads.zzsf) r6     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r6 == 0) goto L87
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            com.google.android.gms.internal.ads.zzsf r6 = (com.google.android.gms.internal.ads.zzsf) r6     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r6 == 0) goto L87
            java.lang.Object r6 = r4.get(r5)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            com.google.android.gms.internal.ads.zzsf r6 = (com.google.android.gms.internal.ads.zzsf) r6     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.zzd     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            java.util.List r6 = androidx.appcompat.widget.u.f(r6)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r6 == 0) goto L87
            boolean r1 = r6.isEmpty()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r1 != 0) goto L87
            androidx.appcompat.widget.z.c()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = a4.g.c()     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            int r4 = zzb(r6, r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> L8a
            if (r4 != r3) goto L85
            goto L8a
        L85:
            r3 = r0
            goto L8a
        L87:
            int r5 = r5 + 1
            goto L41
        L8a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            com.google.android.gms.internal.ads.zzsh.zzc(r3)
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.zzsh.zzb()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L9c
            return r0
        L9c:
            return r2
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsg.zza(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }

    private static int zzb(List list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
        boolean covers;
        for (int i10 = 0; i10 < list.size(); i10++) {
            covers = androidx.appcompat.widget.v.b(list.get(i10)).covers(performancePoint);
            if (covers) {
                return 2;
            }
        }
        return 1;
    }
}
