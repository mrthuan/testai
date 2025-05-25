package f6;

import android.content.SharedPreferences;
import android.view.View;
import com.facebook.internal.p;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PredictionHistoryManager.kt */
/* loaded from: classes.dex */
public final class b {
    public static SharedPreferences c;

    /* renamed from: a  reason: collision with root package name */
    public static final b f17124a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkedHashMap f17125b = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f17126d = new AtomicBoolean(false);

    public static final void a(String str, String predictedEvent) {
        if (k6.a.b(b.class)) {
            return;
        }
        try {
            g.e(predictedEvent, "predictedEvent");
            if (!f17126d.get()) {
                f17124a.c();
            }
            LinkedHashMap linkedHashMap = f17125b;
            linkedHashMap.put(str, predictedEvent);
            SharedPreferences sharedPreferences = c;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString("SUGGESTED_EVENTS_HISTORY", p.y(q.D0(linkedHashMap))).apply();
            } else {
                g.i("shardPreferences");
                throw null;
            }
        } catch (Throwable th2) {
            k6.a.a(b.class, th2);
        }
    }

    public static final String b(View view, String text) {
        if (k6.a.b(b.class)) {
            return null;
        }
        try {
            g.e(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = w5.c.i(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            return p.C(jSONObject.toString());
        } catch (Throwable th2) {
            k6.a.a(b.class, th2);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (k6.a.b(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = f17126d;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = com.facebook.d.a().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            g.d(sharedPreferences, "getApplicationContext()\n…RE, Context.MODE_PRIVATE)");
            c = sharedPreferences;
            LinkedHashMap linkedHashMap = f17125b;
            String string = sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            linkedHashMap.putAll(p.x(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
