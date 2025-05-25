package pg;

import aj.b;
import com.google.android.play.core.assetpacks.c;

/* compiled from: FireAnalyticsBridge.java */
/* loaded from: classes.dex */
public final class a {
    public static a c;

    /* renamed from: a  reason: collision with root package name */
    public c f28935a;

    /* renamed from: b  reason: collision with root package name */
    public b f28936b;

    public static synchronized a c() {
        a aVar;
        synchronized (a.class) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            }
            return aVar;
        }
        return aVar;
    }

    public final b a() {
        b bVar;
        if (c != null && (bVar = this.f28936b) != null) {
            return bVar;
        }
        throw new IllegalStateException("Please call initCrashlyticsHelper(CrashlyticsHelper) in your App class");
    }

    public final c b() {
        c cVar;
        if (c != null && (cVar = this.f28935a) != null) {
            return cVar;
        }
        throw new IllegalStateException("Please call initFireAnalyticsHelper(FireAnalyticsHelper) in your App class");
    }
}
