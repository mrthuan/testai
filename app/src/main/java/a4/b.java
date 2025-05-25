package a4;

import android.net.Uri;
import com.adjust.sdk.Constants;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: HttpUriLoader.java */
/* loaded from: classes.dex */
public final class b implements o<Uri, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f36b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Constants.SCHEME)));

    /* renamed from: a  reason: collision with root package name */
    public final o<z3.g, InputStream> f37a;

    /* compiled from: HttpUriLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {
        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new b(sVar.c(z3.g.class, InputStream.class));
        }
    }

    public b(o<z3.g, InputStream> oVar) {
        this.f37a = oVar;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        return f36b.contains(uri.getScheme());
    }

    @Override // z3.o
    public final o.a<InputStream> b(Uri uri, int i10, int i11, t3.e eVar) {
        return this.f37a.b(new z3.g(uri.toString()), i10, i11, eVar);
    }
}
