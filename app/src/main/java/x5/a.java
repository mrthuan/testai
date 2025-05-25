package x5;

import com.facebook.appevents.AppEvent;
import com.facebook.d;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f;
import com.facebook.internal.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: EventDeactivationManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f31619b;

    /* renamed from: a  reason: collision with root package name */
    public static final a f31618a = new a();
    public static final ArrayList c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public static final HashSet f31620d = new HashSet();

    /* compiled from: EventDeactivationManager.kt */
    /* renamed from: x5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0406a {

        /* renamed from: a  reason: collision with root package name */
        public final String f31621a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f31622b;

        public C0406a(String str, ArrayList arrayList) {
            this.f31621a = str;
            this.f31622b = arrayList;
        }
    }

    public static final void b(ArrayList events) {
        if (k6.a.b(a.class)) {
            return;
        }
        try {
            g.e(events, "events");
            if (!f31619b) {
                return;
            }
            Iterator it = events.iterator();
            while (it.hasNext()) {
                if (f31620d.contains(((AppEvent) it.next()).getName())) {
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            k6.a.a(a.class, th2);
        }
    }

    public final synchronized void a() {
        boolean z10;
        f k10;
        if (k6.a.b(this)) {
            return;
        }
        try {
            z10 = false;
            k10 = FetchedAppSettingsManager.k(d.b(), false);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            k6.a.a(this, th2);
            return;
        }
        if (k10 == null) {
            return;
        }
        String str = k10.f9775k;
        if (str != null) {
            if (str.length() > 0) {
                z10 = true;
            }
            if (z10) {
                JSONObject jSONObject = new JSONObject(str);
                c.clear();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        if (jSONObject2.optBoolean("is_deprecated_event")) {
                            HashSet hashSet = f31620d;
                            g.d(key, "key");
                            hashSet.add(key);
                        } else {
                            JSONArray optJSONArray = jSONObject2.optJSONArray("deprecated_param");
                            g.d(key, "key");
                            C0406a c0406a = new C0406a(key, new ArrayList());
                            if (optJSONArray != null) {
                                c0406a.f31622b = p.f(optJSONArray);
                            }
                            c.add(c0406a);
                        }
                    }
                }
            }
        }
    }
}
