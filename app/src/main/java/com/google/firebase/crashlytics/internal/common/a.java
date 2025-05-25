package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.c;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import ma.j0;
import ma.l;
import ta.f;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class a implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f13515a;

    public a(b bVar) {
        this.f13515a = bVar;
    }

    public final void a(f fVar, Thread thread, Throwable th2) {
        b bVar = this.f13515a;
        synchronized (bVar) {
            Objects.toString(th2);
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                j0.a(bVar.f13520e.b(new l(bVar, System.currentTimeMillis(), th2, thread, fVar)));
            } catch (TimeoutException | Exception unused) {
            }
        }
    }
}
