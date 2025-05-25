package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import java.lang.reflect.Method;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
@TargetApi(24)
/* loaded from: classes2.dex */
public final class zzbt {
    private static final Method zza;
    private static final Method zzb;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 6
            java.lang.String r4 = "JobSchedulerCompat"
            r5 = 0
            r6 = 24
            if (r1 < r6) goto L2b
            java.lang.Class<android.app.job.JobScheduler> r1 = android.app.job.JobScheduler.class
            java.lang.String r7 = "scheduleAsPackage"
            r8 = 4
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class<android.app.job.JobInfo> r9 = android.app.job.JobInfo.class
            r8[r2] = r9     // Catch: java.lang.NoSuchMethodException -> L28
            r9 = 1
            r8[r9] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28
            r10 = 2
            r8[r10] = r9     // Catch: java.lang.NoSuchMethodException -> L28
            r9 = 3
            r8[r9] = r0     // Catch: java.lang.NoSuchMethodException -> L28
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r7, r8)     // Catch: java.lang.NoSuchMethodException -> L28
            goto L2c
        L28:
            android.util.Log.isLoggable(r4, r3)
        L2b:
            r0 = r5
        L2c:
            com.google.android.gms.internal.measurement.zzbt.zza = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r6) goto L40
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.String r1 = "myUserId"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L3d
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L3d
            goto L40
        L3d:
            android.util.Log.isLoggable(r4, r3)
        L40:
            com.google.android.gms.internal.measurement.zzbt.zzb = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.<clinit>():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zza(android.content.Context r5, android.app.job.JobInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r5.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r8 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r8 == 0) goto L61
            java.lang.String r8 = "android.permission.UPDATE_DEVICE_STATS"
            int r5 = r5.checkSelfPermission(r8)
            if (r5 == 0) goto L18
            goto L61
        L18:
            java.lang.reflect.Method r5 = com.google.android.gms.internal.measurement.zzbt.zzb
            r8 = 0
            if (r5 == 0) goto L34
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L34
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L2e
            goto L35
        L2e:
            java.lang.String r5 = "JobSchedulerCompat"
            r0 = 6
            android.util.Log.isLoggable(r5, r0)
        L34:
            r5 = r8
        L35:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.zzbt.zza
            if (r2 == 0) goto L5c
            r3 = 4
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5c
            r3[r8] = r6     // Catch: java.lang.Throwable -> L5c
            r4 = 1
            r3[r4] = r1     // Catch: java.lang.Throwable -> L5c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            r1 = 2
            r3[r1] = r5     // Catch: java.lang.Throwable -> L5c
            r5 = 3
            r3[r5] = r0     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r5 = r2.invoke(r7, r3)     // Catch: java.lang.Throwable -> L5c
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L60
            int r8 = r5.intValue()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            int r8 = r7.schedule(r6)
        L60:
            return r8
        L61:
            int r5 = r7.schedule(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzbt.zza(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
