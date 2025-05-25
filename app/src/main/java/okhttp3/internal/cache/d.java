package okhttp3.internal.cache;

import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import okhttp3.d;
import okhttp3.t;
import okhttp3.x;

/* compiled from: CacheStrategy.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final t f23258a;

    /* renamed from: b  reason: collision with root package name */
    public final x f23259b;

    /* compiled from: CacheStrategy.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static boolean a(t request, x response) {
            kotlin.jvm.internal.g.e(response, "response");
            kotlin.jvm.internal.g.e(request, "request");
            int i10 = response.f23444d;
            if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
                if (i10 != 307) {
                    if (i10 != 308 && i10 != 404 && i10 != 405) {
                        switch (i10) {
                            case OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT /* 300 */:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (x.b(response, "Expires") == null && response.a().c == -1 && !response.a().f23162f && !response.a().f23161e) {
                    return false;
                }
            }
            if (response.a().f23159b) {
                return false;
            }
            okhttp3.d dVar = request.f23432f;
            if (dVar == null) {
                okhttp3.d dVar2 = okhttp3.d.f23157n;
                dVar = d.b.b(request.c);
                request.f23432f = dVar;
            }
            if (dVar.f23159b) {
                return false;
            }
            return true;
        }
    }

    public d(t tVar, x xVar) {
        this.f23258a = tVar;
        this.f23259b = xVar;
    }
}
