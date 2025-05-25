package hk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import kotlin.collections.q;
import okhttp3.s;

/* compiled from: AndroidLog.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArraySet<Logger> f18355a = new CopyOnWriteArraySet<>();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, String> f18356b;

    static {
        String name;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = s.class.getPackage();
        if (r22 == null) {
            name = null;
        } else {
            name = r22.getName();
        }
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(s.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(ek.c.class.getName(), "okhttp.Http2");
        linkedHashMap.put(bk.d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f18356b = q.D0(linkedHashMap);
    }
}
