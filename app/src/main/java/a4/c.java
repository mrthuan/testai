package a4;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import u3.a;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: classes.dex */
public final class c implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f38a;

    /* compiled from: MediaStoreImageThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f39a;

        public a(Context context) {
            this.f39a = context;
        }

        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new c(this.f39a);
        }
    }

    public c(Context context) {
        this.f38a = context.getApplicationContext();
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (ea.a.v(uri2) && !uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // z3.o
    public final o.a<InputStream> b(Uri uri, int i10, int i11, t3.e eVar) {
        boolean z10;
        Uri uri2 = uri;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            o4.d dVar = new o4.d(uri2);
            Context context = this.f38a;
            return new o.a<>(dVar, u3.a.c(context, uri2, new a.C0381a(context.getContentResolver())));
        }
        return null;
    }
}
