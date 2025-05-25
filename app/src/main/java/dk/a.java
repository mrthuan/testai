package dk;

import kk.h;
import okhttp3.o;

/* compiled from: HeadersReader.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final h f16242a;

    /* renamed from: b  reason: collision with root package name */
    public long f16243b = 262144;

    public a(h hVar) {
        this.f16242a = hVar;
    }

    public final o a() {
        boolean z10;
        o.a aVar = new o.a();
        while (true) {
            String J = this.f16242a.J(this.f16243b);
            this.f16243b -= J.length();
            if (J.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return aVar.d();
            }
            aVar.b(J);
        }
    }
}
