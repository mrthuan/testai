package il;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: TaiChiData.java */
/* loaded from: classes3.dex */
public final class a {
    public static final String c = ea.a.p("O2FYYxFpaG47bWU=", "LwE2KggU");

    /* renamed from: d  reason: collision with root package name */
    public static final String f18546d = ea.a.p("R2EiYxtpPWsXeQ==", "SXHegsTV");

    /* renamed from: e  reason: collision with root package name */
    public static a f18547e = null;

    /* renamed from: a  reason: collision with root package name */
    public long f18548a;

    /* renamed from: b  reason: collision with root package name */
    public double f18549b;

    public a(Context context) {
        this.f18548a = 0L;
        this.f18549b = 0.0d;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c, 0);
        String string = sharedPreferences != null ? sharedPreferences.getString(f18546d, "") : "";
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f18548a = jSONObject.optLong(ea.a.p("I2FCdClhXmQOaSdl", "RzDNCsOg"), 0L);
                this.f18549b = jSONObject.optDouble(ea.a.p("R28_YR9WA2wHZXlpCnI5cw==", "NToStUK5"), 0.0d);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
