package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.FeatureManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionEventsState.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final com.facebook.internal.a f9660a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9661b;
    public ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9662d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f9663e;

    public s(com.facebook.internal.a aVar, String str) {
        this.f9660a = aVar;
        this.f9661b = str;
    }

    public final synchronized void a(AppEvent event) {
        if (k6.a.b(this)) {
            return;
        }
        kotlin.jvm.internal.g.e(event, "event");
        if (this.c.size() + this.f9662d.size() >= 1000) {
            this.f9663e++;
        } else {
            this.c.add(event);
        }
    }

    public final synchronized void b(boolean z10) {
        if (k6.a.b(this)) {
            return;
        }
        if (z10) {
            this.c.addAll(this.f9662d);
        }
        this.f9662d.clear();
        this.f9663e = 0;
    }

    public final synchronized int c() {
        if (k6.a.b(this)) {
            return 0;
        }
        return this.c.size();
    }

    public final synchronized List<AppEvent> d() {
        if (k6.a.b(this)) {
            return null;
        }
        ArrayList arrayList = this.c;
        this.c = new ArrayList();
        return arrayList;
    }

    public final int e(com.facebook.e eVar, Context context, boolean z10, boolean z11) {
        if (k6.a.b(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                int i10 = this.f9663e;
                x5.a.b(this.c);
                this.f9662d.addAll(this.c);
                this.c.clear();
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = this.f9662d.iterator();
                while (it.hasNext()) {
                    AppEvent appEvent = (AppEvent) it.next();
                    if (appEvent.isChecksumValid()) {
                        if (z10 || !appEvent.isImplicit()) {
                            jSONArray.put(appEvent.getJsonObject());
                            jSONArray2.put(appEvent.getOperationalJsonObject());
                        }
                    } else {
                        appEvent.toString();
                        com.facebook.internal.p pVar = com.facebook.internal.p.f9815a;
                        com.facebook.d dVar = com.facebook.d.f9685a;
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                tf.d dVar2 = tf.d.f30009a;
                f(eVar, context, i10, jSONArray, jSONArray2, z11);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return 0;
        }
    }

    public final void f(com.facebook.e eVar, Context context, int i10, JSONArray jSONArray, JSONArray jSONArray2, boolean z10) {
        JSONObject jSONObject;
        try {
            if (k6.a.b(this)) {
                return;
            }
            try {
                jSONObject = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.f9660a, this.f9661b, z10, context);
                if (this.f9663e > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            eVar.c = jSONObject;
            Bundle bundle = eVar.f9706d;
            String jSONArray3 = jSONArray.toString();
            kotlin.jvm.internal.g.d(jSONArray3, "events.toString()");
            bundle.putString("custom_events", jSONArray3);
            if (FeatureManager.c(FeatureManager.Feature.IapLoggingLib5To7)) {
                bundle.putString("operational_parameters", jSONArray2.toString());
            }
            eVar.f9707e = jSONArray3;
            eVar.f9706d = bundle;
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
