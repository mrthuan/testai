package a4;

import android.content.Context;
import android.net.Uri;
import c4.y;
import java.io.InputStream;
import u3.a;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: classes.dex */
public final class d implements o<Uri, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f40a;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    /* loaded from: classes.dex */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f41a;

        public a(Context context) {
            this.f41a = context;
        }

        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new d(this.f41a);
        }
    }

    public d(Context context) {
        this.f40a = context.getApplicationContext();
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (ea.a.v(uri2) && uri2.getPathSegments().contains("video")) {
            return true;
        }
        return false;
    }

    @Override // z3.o
    public final o.a<InputStream> b(Uri uri, int i10, int i11, t3.e eVar) {
        boolean z10;
        Uri uri2 = uri;
        boolean z11 = true;
        if (i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Long l10 = (Long) eVar.c(y.f5554d);
            if (l10 == null || l10.longValue() != -1) {
                z11 = false;
            }
            if (z11) {
                o4.d dVar = new o4.d(uri2);
                Context context = this.f40a;
                return new o.a<>(dVar, u3.a.c(context, uri2, new a.b(context.getContentResolver())));
            }
        }
        return null;
    }
}
