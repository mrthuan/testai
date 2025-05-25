package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdkd implements GestureDetector.OnGestureListener {
    private final zzdiw zza;
    private final zzdjx zzb;

    public zzdkd(zzdiw zzdiwVar, zzdjx zzdjxVar) {
        this.zza = zzdiwVar;
        this.zzb = zzdjxVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0008, B:10:0x001c, B:21:0x0062, B:23:0x006a, B:13:0x002e, B:16:0x0040, B:19:0x0053), top: B:31:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzdiw r0 = r5.zza     // Catch: java.lang.Throwable -> L79
            r1 = 0
            if (r0 != 0) goto L8
            goto L77
        L8:
            float r0 = java.lang.Math.abs(r8)     // Catch: java.lang.Throwable -> L79
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L79
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r2 = -1
            r3 = 1148846080(0x447a0000, float:1000.0)
            r4 = 0
            if (r0 <= 0) goto L3c
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L2a
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L79
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L79
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L79
            r2 = 1
            goto L62
        L2a:
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 >= 0) goto L61
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L79
            float r6 = r6.getX()     // Catch: java.lang.Throwable -> L79
            float r7 = r7 - r6
            float r7 = r7 / r8
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L79
            r2 = 2
            goto L62
        L3c:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 <= 0) goto L4f
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L79
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L79
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L79
            r2 = 8
            goto L62
        L4f:
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 >= 0) goto L61
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L79
            float r6 = r6.getY()     // Catch: java.lang.Throwable -> L79
            float r7 = r7 - r6
            float r7 = r7 / r9
            float r7 = r7 * r3
            int r6 = (int) r7     // Catch: java.lang.Throwable -> L79
            r2 = 4
            goto L62
        L61:
            r6 = r1
        L62:
            com.google.android.gms.internal.ads.zzdiw r7 = r5.zza     // Catch: java.lang.Throwable -> L79
            int r7 = r7.zza()     // Catch: java.lang.Throwable -> L79
            if (r2 != r7) goto L77
            com.google.android.gms.internal.ads.zzdiw r7 = r5.zza     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.internal.ads.zzdjx r8 = r5.zzb     // Catch: java.lang.Throwable -> L79
            android.widget.FrameLayout r8 = r8.zzr()     // Catch: java.lang.Throwable -> L79
            r7.zzE(r8, r6)     // Catch: java.lang.Throwable -> L79
            monitor-exit(r5)
            return r1
        L77:
            monitor-exit(r5)
            return r1
        L79:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkd.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
