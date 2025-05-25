package ck;

import kotlin.text.j;
import okhttp3.x;
import okio.ByteString;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes3.dex */
public final class e {
    static {
        ByteString.Companion.getClass();
        ByteString.a.c("\"\\");
        ByteString.a.c("\t ,=");
    }

    public static final boolean a(x xVar) {
        if (kotlin.jvm.internal.g.a(xVar.f23442a.f23429b, "HEAD")) {
            return false;
        }
        int i10 = xVar.f23444d;
        if (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && ak.b.j(xVar) == -1 && !j.G("chunked", x.b(xVar, "Transfer-Encoding"), true)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bf, code lost:
        if (r5 == false) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0218 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(okhttp3.j r34, okhttp3.p r35, okhttp3.o r36) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ck.e.b(okhttp3.j, okhttp3.p, okhttp3.o):void");
    }
}
