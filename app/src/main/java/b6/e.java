package b6;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.p;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RedactedEventsManager.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5336b;

    /* renamed from: a  reason: collision with root package name */
    public static final e f5335a = new e();
    public static HashMap c = new HashMap();

    public final void a() {
        HashSet<String> e10;
        if (k6.a.b(this)) {
            return;
        }
        try {
            com.facebook.internal.f k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false);
            if (k10 == null) {
                return;
            }
            try {
                c = new HashMap();
                JSONArray jSONArray = k10.f9779o;
                if (jSONArray != null && jSONArray.length() != 0) {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        boolean has = jSONObject.has("key");
                        boolean has2 = jSONObject.has("value");
                        if (has && has2) {
                            String string = jSONObject.getString("key");
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            if (string != null && (e10 = p.e(jSONArray2)) != null) {
                                c.put(string, e10);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
