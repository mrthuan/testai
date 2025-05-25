package com.facebook.appevents.internal;

import android.content.Context;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.b;
import com.facebook.internal.j;
import com.facebook.internal.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* compiled from: AppEventsLoggerUtility.kt */
/* loaded from: classes.dex */
public final class AppEventsLoggerUtility {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f9608a = q.z0(new Pair(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new Pair(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* compiled from: AppEventsLoggerUtility.kt */
    /* loaded from: classes.dex */
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static final JSONObject a(GraphAPIActivityType activityType, com.facebook.internal.a aVar, String str, boolean z10, Context context) {
        g.e(activityType, "activityType");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f9608a.get(activityType));
        if (!b.f9472d) {
            b.f9470a.getClass();
            b.a();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b.f9471b;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str2 = b.c;
            reentrantReadWriteLock.readLock().unlock();
            if (str2 != null) {
                jSONObject.put("app_user_id", str2);
            }
            p.A(jSONObject, aVar, str, z10, context);
            try {
                p.B(context, jSONObject);
            } catch (Exception e10) {
                j.a aVar2 = j.f9803d;
                j.a.b(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
            }
            JSONObject m10 = p.m();
            if (m10 != null) {
                Iterator<String> keys = m10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, m10.get(next));
                }
            }
            jSONObject.put("application_package_name", context.getPackageName());
            return jSONObject;
        } catch (Throwable th2) {
            b.f9471b.readLock().unlock();
            throw th2;
        }
    }
}
