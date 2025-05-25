package bl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.w;
import org.json.JSONObject;

/* compiled from: SpAdConfigHelper.java */
/* loaded from: classes3.dex */
public final class a extends w {

    /* renamed from: j  reason: collision with root package name */
    public static final String f5462j = ea.a.p("UnA7XxJkPWMdblJpZw==", "W1Jlt2L0");

    /* renamed from: k  reason: collision with root package name */
    public static final String f5463k = ea.a.p("UnA7XxJkPWMdblJpDl89ZXk=", "mfhTN0FN");

    /* renamed from: l  reason: collision with root package name */
    public static a f5464l = null;

    /* renamed from: d  reason: collision with root package name */
    public long f5465d;

    /* renamed from: e  reason: collision with root package name */
    public long f5466e;

    /* renamed from: f  reason: collision with root package name */
    public long f5467f;

    /* renamed from: g  reason: collision with root package name */
    public long f5468g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5469h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5470i;

    public a(Context context) {
        this.f5465d = 0L;
        this.f5466e = 0L;
        this.f5467f = 0L;
        this.f5468g = 0L;
        this.f5469h = false;
        this.f5470i = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f5462j, 0);
        String string = sharedPreferences != null ? sharedPreferences.getString(f5463k, "") : "";
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f5465d = jSONObject.optLong(ea.a.p("QGgkdyBwDmEBaHJ1BWwCaSll", "SgGscNCl"), 0L);
                this.f5467f = jSONObject.optLong(ea.a.p("PGhedypwW2EpaAx1GWwrb0BudA==", "B6YmYGz2"), 0L);
                this.f5466e = jSONObject.optLong(ea.a.p("PGhedypwW2EpaAVwEG48aVhl", "VUKFVxDo"), 0L);
                this.f5468g = jSONObject.optLong(ea.a.p("QGgkdyBwDmEBaHtwDG4VbzFudA==", "kghfys0A"), 0L);
                this.f5469h = jSONObject.optBoolean(ea.a.p("O2NSbjFmOHI7dA==", "JNH3nQxz"), false);
                this.f5470i = jSONObject.optBoolean(ea.a.p("LGxYYxJfXnQ_bRVhE3QNcmpzDWFu", "Albl8A3o"), false);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static a J(Context context) {
        if (f5464l == null) {
            f5464l = new a(context.getApplicationContext());
        }
        return f5464l;
    }

    public final void K(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ea.a.p("QGgkdyBwDmEBaHJ1BWwCaSll", "qG5g1uM5"), this.f5465d);
            jSONObject.put(ea.a.p("QGgkdyBwDmEBaHJ1BWwVbzFudA==", "1ZU75GTi"), this.f5467f);
            jSONObject.put(ea.a.p("QGgkdyBwDmEBaHtwDG4CaSll", "DoFlQ4m5"), this.f5466e);
            jSONObject.put(ea.a.p("QGgkdyBwDmEBaHtwDG4VbzFudA==", "W5wfdlrs"), this.f5468g);
            jSONObject.put(ea.a.p("QGMqbixmC3IBdA==", "zDrmKL5p"), this.f5469h);
            jSONObject.put(ea.a.p("AWwBYz1fOHQtbTlhUnQycmdzMWFu", "9ybhVQke"), this.f5470i);
            String jSONObject2 = jSONObject.toString();
            String str = f5462j;
            String str2 = f5463k;
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str2, jSONObject2).commit();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
