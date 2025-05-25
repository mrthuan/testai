package nb;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ConfigContainer.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: g  reason: collision with root package name */
    public static final Date f22414g = new Date(0);

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f22415a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f22416b;
    public final Date c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONArray f22417d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f22418e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22419f;

    public e(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j10) {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j10);
        this.f22416b = jSONObject;
        this.c = date;
        this.f22417d = jSONArray;
        this.f22418e = jSONObject2;
        this.f22419f = j10;
        this.f22415a = jSONObject3;
    }

    public static e a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return new e(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), optJSONObject, jSONObject.optLong("template_version_number_key"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f22415a.toString().equals(((e) obj).toString());
    }

    public final int hashCode() {
        return this.f22415a.hashCode();
    }

    public final String toString() {
        return this.f22415a.toString();
    }
}
