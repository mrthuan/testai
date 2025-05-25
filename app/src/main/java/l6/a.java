package l6;

import java.io.File;
import kotlin.jvm.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportData.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f20517a;

    /* renamed from: b  reason: collision with root package name */
    public final String f20518b;
    public final Long c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        this.c = valueOf;
        this.f20518b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        g.c(valueOf, "null cannot be cast to non-null type kotlin.Long");
        stringBuffer.append(valueOf.longValue());
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        g.d(stringBuffer2, "StringBuffer()\n         …)\n            .toString()");
        this.f20517a = stringBuffer2;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.c;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.f20518b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        g.d(jSONObject2, "params.toString()");
        return jSONObject2;
    }

    public a(File file) {
        g.e(file, "file");
        String name = file.getName();
        g.d(name, "file.name");
        this.f20517a = name;
        JSONObject e10 = h6.d.e(name);
        if (e10 != null) {
            this.c = Long.valueOf(e10.optLong("timestamp", 0L));
            this.f20518b = e10.optString("error_message", null);
        }
    }
}
