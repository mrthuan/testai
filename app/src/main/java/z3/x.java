package z3;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z3.o;

/* compiled from: UrlUriLoader.java */
/* loaded from: classes.dex */
public final class x<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f32293b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* renamed from: a  reason: collision with root package name */
    public final o<g, Data> f32294a;

    /* compiled from: UrlUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {
        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new x(sVar.c(g.class, InputStream.class));
        }
    }

    public x(o<g, Data> oVar) {
        this.f32294a = oVar;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        return f32293b.contains(uri.getScheme());
    }

    @Override // z3.o
    public final o.a b(Uri uri, int i10, int i11, t3.e eVar) {
        return this.f32294a.b(new g(uri.toString()), i10, i11, eVar);
    }
}
