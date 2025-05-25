package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.y0;
import com.adjust.sdk.Constants;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.l;
import com.facebook.e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: AppEventQueue.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9526a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9527b;
    public static volatile c c;

    /* renamed from: d  reason: collision with root package name */
    public static final ScheduledExecutorService f9528d;

    /* renamed from: e  reason: collision with root package name */
    public static ScheduledFuture<?> f9529e;

    /* renamed from: f  reason: collision with root package name */
    public static final e f9530f;

    static {
        new i();
        f9526a = i.class.getName();
        f9527b = 100;
        c = new c();
        f9528d = Executors.newSingleThreadScheduledExecutor();
        f9530f = new e(0);
    }

    public static final com.facebook.e a(final AccessTokenAppIdPair accessTokenAppIdPair, final s sVar, boolean z10, final p pVar) {
        if (k6.a.b(i.class)) {
            return null;
        }
        try {
            String applicationId = accessTokenAppIdPair.getApplicationId();
            boolean z11 = false;
            com.facebook.internal.f k10 = FetchedAppSettingsManager.k(applicationId, false);
            String str = com.facebook.e.f9701j;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
            kotlin.jvm.internal.g.d(format, "format(format, *args)");
            final com.facebook.e h10 = e.c.h(null, format, null, null);
            h10.f9711i = true;
            Bundle bundle = h10.f9706d;
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("access_token", accessTokenAppIdPair.getAccessTokenString());
            synchronized (l.c()) {
                k6.a.b(l.class);
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = l.c;
            String d10 = l.a.d();
            if (d10 != null) {
                bundle.putString(Constants.INSTALL_REFERRER, d10);
            }
            h10.f9706d = bundle;
            if (k10 != null) {
                z11 = k10.f9766a;
            }
            int e10 = sVar.e(h10, com.facebook.d.a(), z11, z10);
            if (e10 == 0) {
                return null;
            }
            pVar.f9654a += e10;
            h10.j(new e.b() { // from class: com.facebook.appevents.f
                @Override // com.facebook.e.b
                public final void b(com.facebook.i iVar) {
                    AccessTokenAppIdPair accessTokenAppId = AccessTokenAppIdPair.this;
                    com.facebook.e postRequest = h10;
                    s appEvents = sVar;
                    p flushState = pVar;
                    if (!k6.a.b(i.class)) {
                        try {
                            kotlin.jvm.internal.g.e(accessTokenAppId, "$accessTokenAppId");
                            kotlin.jvm.internal.g.e(postRequest, "$postRequest");
                            kotlin.jvm.internal.g.e(appEvents, "$appEvents");
                            kotlin.jvm.internal.g.e(flushState, "$flushState");
                            i.e(postRequest, iVar, accessTokenAppId, flushState, appEvents);
                        } catch (Throwable th2) {
                            k6.a.a(i.class, th2);
                        }
                    }
                }
            });
            return h10;
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
            return null;
        }
    }

    public static final ArrayList b(c appEventCollection, p pVar) {
        if (k6.a.b(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(appEventCollection, "appEventCollection");
            boolean e10 = com.facebook.d.e(com.facebook.d.a());
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.e()) {
                s b10 = appEventCollection.b(accessTokenAppIdPair);
                if (b10 != null) {
                    com.facebook.e a10 = a(accessTokenAppIdPair, b10, e10, pVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                        com.facebook.appevents.cloudbridge.b.f9493a.getClass();
                        if (com.facebook.appevents.cloudbridge.b.c) {
                            HashSet<Integer> hashSet = com.facebook.appevents.cloudbridge.c.f9495a;
                            y0 y0Var = new y0(a10, 3);
                            com.facebook.internal.p pVar2 = com.facebook.internal.p.f9815a;
                            try {
                                com.facebook.d.c().execute(y0Var);
                            } catch (Exception unused) {
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
            return null;
        }
    }

    public static final void c(FlushReason reason) {
        if (k6.a.b(i.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(reason, "reason");
            f9528d.execute(new b1.e(reason, 2));
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
        }
    }

    public static final void d(FlushReason reason) {
        if (k6.a.b(i.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(reason, "reason");
            c.a(d.a());
            try {
                p f10 = f(reason, c);
                if (f10 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", f10.f9654a);
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (FlushResult) f10.f9655b);
                    p1.a.a(com.facebook.d.a()).c(intent);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
        }
    }

    public static final void e(com.facebook.e eVar, com.facebook.i iVar, AccessTokenAppIdPair accessTokenAppIdPair, p pVar, s sVar) {
        FlushResult flushResult;
        if (k6.a.b(i.class)) {
            return;
        }
        try {
            FacebookRequestError facebookRequestError = iVar.c;
            FlushResult flushResult2 = FlushResult.SUCCESS;
            boolean z10 = true;
            if (facebookRequestError != null) {
                if (facebookRequestError.f9410b == -1) {
                    flushResult = FlushResult.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.g.d(String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{iVar.toString(), facebookRequestError.toString()}, 2)), "format(format, *args)");
                    flushResult = FlushResult.SERVER_ERROR;
                }
            } else {
                flushResult = flushResult2;
            }
            com.facebook.d.h(LoggingBehavior.APP_EVENTS);
            if (facebookRequestError == null) {
                z10 = false;
            }
            sVar.b(z10);
            FlushResult flushResult3 = FlushResult.NO_CONNECTIVITY;
            if (flushResult == flushResult3) {
                com.facebook.d.c().execute(new g(0, accessTokenAppIdPair, sVar));
            }
            if (flushResult != flushResult2 && ((FlushResult) pVar.f9655b) != flushResult3) {
                kotlin.jvm.internal.g.e(flushResult, "<set-?>");
                pVar.f9655b = flushResult;
            }
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
        }
    }

    public static final p f(FlushReason reason, c appEventCollection) {
        if (k6.a.b(i.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.g.e(reason, "reason");
            kotlin.jvm.internal.g.e(appEventCollection, "appEventCollection");
            p pVar = new p();
            ArrayList b10 = b(appEventCollection, pVar);
            if (!(!b10.isEmpty())) {
                return null;
            }
            j.a aVar = com.facebook.internal.j.f9803d;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String TAG = f9526a;
            kotlin.jvm.internal.g.d(TAG, "TAG");
            j.a.b(loggingBehavior, TAG, "Flushing %d events due to %s.", Integer.valueOf(pVar.f9654a), reason.toString());
            Iterator it = b10.iterator();
            while (it.hasNext()) {
                ((com.facebook.e) it.next()).c();
            }
            return pVar;
        } catch (Throwable th2) {
            k6.a.a(i.class, th2);
            return null;
        }
    }
}
