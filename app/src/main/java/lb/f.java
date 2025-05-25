package lb;

import android.content.Context;
import ga.b;
import ga.k;
import ga.r;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes2.dex */
public final class f {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        String h(Context context);
    }

    public static ga.b<?> a(String str, String str2) {
        lb.a aVar = new lb.a(str, str2);
        b.a a10 = ga.b.a(d.class);
        a10.f17712e = 1;
        a10.f17713f = new d9.g(aVar, 0);
        return a10.b();
    }

    public static ga.b<?> b(final String str, final a<Context> aVar) {
        b.a a10 = ga.b.a(d.class);
        a10.f17712e = 1;
        a10.a(k.a(Context.class));
        a10.f17713f = new ga.e() { // from class: lb.e
            @Override // ga.e
            public final Object a(r rVar) {
                return new a(str, aVar.h((Context) rVar.a(Context.class)));
            }
        };
        return a10.b();
    }
}
