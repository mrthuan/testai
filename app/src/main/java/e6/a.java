package e6;

import com.facebook.d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f;
import com.facebook.internal.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* compiled from: RestrictiveDataManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f16467b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f16466a = new a();
    public static final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final CopyOnWriteArraySet f16468d = new CopyOnWriteArraySet();

    /* compiled from: RestrictiveDataManager.kt */
    /* renamed from: e6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0209a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16469a;

        /* renamed from: b  reason: collision with root package name */
        public Map<String, String> f16470b;

        public C0209a(String str, HashMap hashMap) {
            this.f16469a = str;
            this.f16470b = hashMap;
        }
    }

    public final String a(String str, String str2) {
        if (k6.a.b(this)) {
            return null;
        }
        try {
            Iterator it = new ArrayList(c).iterator();
            while (it.hasNext()) {
                C0209a c0209a = (C0209a) it.next();
                if (c0209a != null && g.a(str, c0209a.f16469a)) {
                    for (String str3 : c0209a.f16470b.keySet()) {
                        if (g.a(str2, str3)) {
                            return c0209a.f16470b.get(str3);
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
        return null;
    }

    public final void b() {
        String str;
        if (k6.a.b(this)) {
            return;
        }
        try {
            boolean z10 = false;
            f k10 = FetchedAppSettingsManager.k(d.b(), false);
            if (k10 != null && (str = k10.f9775k) != null) {
                if (str.length() == 0) {
                    z10 = true;
                }
                if (!z10) {
                    JSONObject jSONObject = new JSONObject(str);
                    ArrayList arrayList = c;
                    arrayList.clear();
                    CopyOnWriteArraySet copyOnWriteArraySet = f16468d;
                    copyOnWriteArraySet.clear();
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String key = keys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            JSONObject optJSONObject = jSONObject2.optJSONObject("restrictive_param");
                            g.d(key, "key");
                            C0209a c0209a = new C0209a(key, new HashMap());
                            if (optJSONObject != null) {
                                c0209a.f16470b = p.h(optJSONObject);
                                arrayList.add(c0209a);
                            }
                            if (jSONObject2.has("process_event_name")) {
                                copyOnWriteArraySet.add(key);
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
