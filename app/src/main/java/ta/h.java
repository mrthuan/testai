package ta;

import kotlinx.coroutines.y;
import org.json.JSONObject;
import ta.c;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes2.dex */
public final class h implements e {
    @Override // ta.e
    public final c a(y yVar, JSONObject jSONObject) {
        c.b bVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            bVar = new c.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8));
        } else {
            bVar = new c.b(new JSONObject().optInt("max_custom_exception_events", 8));
        }
        c.b bVar2 = bVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        c.a aVar = new c.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            yVar.getClass();
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new c(currentTimeMillis, bVar2, aVar, optDouble, optDouble2, optInt2);
    }
}
