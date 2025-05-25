package z3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import z3.o;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes.dex */
public final class k implements o<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f32249a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f32250a;

        public a(Context context) {
            this.f32250a = context;
        }

        @Override // z3.p
        public final o<Uri, File> b(s sVar) {
            return new k(this.f32250a);
        }
    }

    public k(Context context) {
        this.f32249a = context;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        return ea.a.v(uri);
    }

    @Override // z3.o
    public final o.a<File> b(Uri uri, int i10, int i11, t3.e eVar) {
        Uri uri2 = uri;
        return new o.a<>(new o4.d(uri2), new b(this.f32249a, uri2));
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {
        public static final String[] c = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f32251a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f32252b;

        public b(Context context, Uri uri) {
            this.f32251a = context;
            this.f32252b = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super File> aVar) {
            Cursor query = this.f32251a.getContentResolver().query(this.f32252b, c, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f32252b));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
        }
    }
}
