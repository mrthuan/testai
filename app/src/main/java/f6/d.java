package f6;

import android.app.Activity;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import f6.e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SuggestedEventsManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17129a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f17130b = new AtomicBoolean(false);
    public static final LinkedHashSet c = new LinkedHashSet();

    /* renamed from: d  reason: collision with root package name */
    public static final LinkedHashSet f17131d = new LinkedHashSet();

    public static final synchronized void a() {
        synchronized (d.class) {
            if (k6.a.b(d.class)) {
                return;
            }
            com.facebook.d.c().execute(new a6.c(2));
        }
    }

    public static final void d(Activity activity) {
        boolean z10;
        if (k6.a.b(d.class)) {
            return;
        }
        try {
            g.e(activity, "activity");
            try {
                if (f17130b.get()) {
                    a aVar = a.f17119a;
                    if (!k6.a.b(a.class)) {
                        try {
                            z10 = a.f17123f;
                        } catch (Throwable th2) {
                            k6.a.a(a.class, th2);
                        }
                        if (z10 && (!c.isEmpty() || !f17131d.isEmpty())) {
                            HashMap hashMap = e.f17132d;
                            e.a.a(activity);
                            return;
                        }
                    }
                    z10 = false;
                    if (z10) {
                        HashMap hashMap2 = e.f17132d;
                        e.a.a(activity);
                        return;
                    }
                }
                HashMap hashMap3 = e.f17132d;
                e.a.b(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th3) {
            k6.a.a(d.class, th3);
        }
    }

    public final void b() {
        String str;
        File d10;
        Activity activity;
        if (k6.a.b(this)) {
            return;
        }
        try {
            com.facebook.internal.f k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false);
            if (k10 == null || (str = k10.f9774j) == null) {
                return;
            }
            c(str);
            if ((!(!c.isEmpty()) && !(!f17131d.isEmpty())) || (d10 = ModelManager.d(ModelManager.Task.MTML_APP_EVENT_PREDICTION)) == null) {
                return;
            }
            a.d(d10);
            WeakReference<Activity> weakReference = c6.e.f5605m;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (activity != null) {
                d(activity);
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }

    public final void c(String str) {
        if (k6.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("production_events")) {
                JSONArray jSONArray = jSONObject.getJSONArray("production_events");
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    LinkedHashSet linkedHashSet = c;
                    String string = jSONArray.getString(i10);
                    g.d(string, "jsonArray.getString(i)");
                    linkedHashSet.add(string);
                }
            }
            if (jSONObject.has("eligible_for_prediction_events")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("eligible_for_prediction_events");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    LinkedHashSet linkedHashSet2 = f17131d;
                    String string2 = jSONArray2.getString(i11);
                    g.d(string2, "jsonArray.getString(i)");
                    linkedHashSet2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
