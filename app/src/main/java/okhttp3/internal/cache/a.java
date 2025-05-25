package okhttp3.internal.cache;

import kotlin.text.j;
import okhttp3.q;
import okhttp3.x;
import okhttp3.z;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.c f23254a;

    /* compiled from: CacheInterceptor.kt */
    /* renamed from: okhttp3.internal.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0321a {
        public static final x a(x xVar) {
            z zVar;
            if (xVar == null) {
                zVar = null;
            } else {
                zVar = xVar.f23447g;
            }
            if (zVar != null) {
                xVar.getClass();
                x.a aVar = new x.a(xVar);
                aVar.f23460g = null;
                return aVar.a();
            }
            return xVar;
        }

        public static boolean b(String str) {
            if (!j.G("Connection", str, true) && !j.G("Keep-Alive", str, true) && !j.G("Proxy-Authenticate", str, true) && !j.G("Proxy-Authorization", str, true) && !j.G("TE", str, true) && !j.G("Trailers", str, true) && !j.G("Transfer-Encoding", str, true) && !j.G("Upgrade", str, true)) {
                return true;
            }
            return false;
        }
    }

    static {
        new C0321a();
    }

    public a(okhttp3.c cVar) {
        this.f23254a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x024a, code lost:
        if (r4 > 0) goto L281;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    @Override // okhttp3.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.x a(ck.f r27) {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.a.a(ck.f):okhttp3.x");
    }
}
