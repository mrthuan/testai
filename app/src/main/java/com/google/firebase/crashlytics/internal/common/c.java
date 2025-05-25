package com.google.firebase.crashlytics.internal.common;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import ta.f;

/* compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* loaded from: classes2.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final a f13533a;

    /* renamed from: b  reason: collision with root package name */
    public final f f13534b;
    public final Thread.UncaughtExceptionHandler c;

    /* renamed from: d  reason: collision with root package name */
    public final ja.a f13535d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f13536e = new AtomicBoolean(false);

    /* compiled from: CrashlyticsUncaughtExceptionHandler.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public c(com.google.firebase.crashlytics.internal.common.a aVar, com.google.firebase.crashlytics.internal.settings.a aVar2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ja.a aVar3) {
        this.f13533a = aVar;
        this.f13534b = aVar2;
        this.c = uncaughtExceptionHandler;
        this.f13535d = aVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x001f, Exception -> 0x003d, TryCatch #2 {Exception -> 0x003d, all -> 0x001f, blocks: (B:13:0x0023, B:14:0x002d, B:7:0x0013, B:9:0x001b), top: B:21:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: all -> 0x001f, Exception -> 0x003d, TRY_LEAVE, TryCatch #2 {Exception -> 0x003d, all -> 0x001f, blocks: (B:13:0x0023, B:14:0x002d, B:7:0x0013, B:9:0x001b), top: B:21:0x0013 }] */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.f13536e
            r1 = 1
            r0.set(r1)
            java.lang.Thread$UncaughtExceptionHandler r2 = r7.c
            r3 = 3
            java.lang.String r4 = "FirebaseCrashlytics"
            r5 = 0
            if (r8 != 0) goto L10
        Le:
            r1 = r5
            goto L21
        L10:
            if (r9 != 0) goto L13
            goto Le
        L13:
            ja.a r6 = r7.f13535d     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            boolean r6 = r6.b()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            if (r6 == 0) goto L21
            android.util.Log.isLoggable(r4, r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            goto Le
        L1f:
            r1 = move-exception
            goto L32
        L21:
            if (r1 == 0) goto L2d
            com.google.firebase.crashlytics.internal.common.c$a r1 = r7.f13533a     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            ta.f r6 = r7.f13534b     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            com.google.firebase.crashlytics.internal.common.a r1 = (com.google.firebase.crashlytics.internal.common.a) r1     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            r1.a(r6, r8, r9)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            goto L3d
        L2d:
            boolean r1 = android.util.Log.isLoggable(r4, r3)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L3d
            goto L3d
        L32:
            boolean r3 = android.util.Log.isLoggable(r4, r3)
            r2.uncaughtException(r8, r9)
            r0.set(r5)
            throw r1
        L3d:
            boolean r1 = android.util.Log.isLoggable(r4, r3)
            r2.uncaughtException(r8, r9)
            r0.set(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.c.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
