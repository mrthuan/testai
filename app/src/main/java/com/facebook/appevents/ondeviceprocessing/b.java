package com.facebook.appevents.ondeviceprocessing;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f;
import com.facebook.internal.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import org.json.JSONArray;

/* compiled from: RemoteServiceParametersHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f9653a = new b();

    public static final Bundle a(RemoteServiceWrapper.EventType eventType, String str, List<AppEvent> appEvents) {
        if (k6.a.b(b.class)) {
            return null;
        }
        try {
            g.e(eventType, "eventType");
            g.e(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b10 = f9653a.b(str, appEvents);
                if (b10.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b10.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            k6.a.a(b.class, th2);
            return null;
        }
    }

    public final JSONArray b(String str, List list) {
        f k10;
        if (k6.a.b(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            ArrayList F0 = m.F0(list);
            x5.a.b(F0);
            boolean z10 = false;
            if (!k6.a.b(this) && (k10 = FetchedAppSettingsManager.k(str, false)) != null) {
                z10 = k10.f9766a;
            }
            Iterator it = F0.iterator();
            while (it.hasNext()) {
                AppEvent appEvent = (AppEvent) it.next();
                if (appEvent.isChecksumValid()) {
                    if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && z10)) {
                        jSONArray.put(appEvent.getJsonObject());
                    }
                } else {
                    appEvent.toString();
                    p pVar = p.f9815a;
                    d dVar = d.f9685a;
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return null;
        }
    }
}
