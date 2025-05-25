package sb;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import okhttp3.p;
import okhttp3.q;
import okhttp3.r;
import okhttp3.t;
import okhttp3.w;
import okhttp3.x;
import okhttp3.y;
import okhttp3.z;

/* compiled from: DetailedLoggingInterceptor.kt */
/* loaded from: classes2.dex */
public final class a implements q {
    @Override // okhttp3.q
    public final x a(ck.f fVar) {
        String str;
        System.nanoTime();
        t tVar = fVar.f5700e;
        p pVar = tVar.f23428a;
        Objects.toString(fVar.a());
        Objects.toString(tVar.c);
        AtomicReference<okhttp3.e> atomicReference = d.f29778a;
        w wVar = tVar.f23430d;
        if (wVar != null) {
            kk.f fVar2 = new kk.f();
            wVar.c(fVar2);
            fVar2.k();
        }
        x c = fVar.c(tVar);
        System.nanoTime();
        p pVar2 = c.f23442a.f23428a;
        Objects.toString(c.f23446f);
        y yVar = null;
        z zVar = c.f23447g;
        if (zVar != null) {
            str = zVar.h();
        } else {
            str = null;
        }
        x.a aVar = new x.a(c);
        if (str != null) {
            r d10 = zVar.d();
            Charset charset = kotlin.text.a.f19966b;
            if (d10 != null) {
                Pattern pattern = r.c;
                Charset a10 = d10.a(null);
                if (a10 == null) {
                    d10 = r.a.b(d10 + "; charset=utf-8");
                } else {
                    charset = a10;
                }
            }
            kk.f fVar3 = new kk.f();
            kotlin.jvm.internal.g.e(charset, "charset");
            fVar3.v(str, 0, str.length(), charset);
            yVar = new y(fVar3.f19826b, d10, fVar3);
        }
        aVar.f23460g = yVar;
        return aVar.a();
    }
}
