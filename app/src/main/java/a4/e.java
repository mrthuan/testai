package a4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import z3.o;
import z3.p;
import z3.s;

/* compiled from: QMediaStoreUriLoader.java */
/* loaded from: classes.dex */
public final class e<DataT> implements o<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f42a;

    /* renamed from: b  reason: collision with root package name */
    public final o<File, DataT> f43b;
    public final o<Uri, DataT> c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f44d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f45a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f46b;

        public a(Context context, Class<DataT> cls) {
            this.f45a = context;
            this.f46b = cls;
        }

        @Override // z3.p
        public final o<Uri, DataT> b(s sVar) {
            Class<DataT> cls = this.f46b;
            return new e(this.f45a, sVar.c(File.class, cls), sVar.c(Uri.class, cls), cls);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes.dex */
    public static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k  reason: collision with root package name */
        public static final String[] f47k = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final Context f48a;

        /* renamed from: b  reason: collision with root package name */
        public final o<File, DataT> f49b;
        public final o<Uri, DataT> c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f50d;

        /* renamed from: e  reason: collision with root package name */
        public final int f51e;

        /* renamed from: f  reason: collision with root package name */
        public final int f52f;

        /* renamed from: g  reason: collision with root package name */
        public final t3.e f53g;

        /* renamed from: h  reason: collision with root package name */
        public final Class<DataT> f54h;

        /* renamed from: i  reason: collision with root package name */
        public volatile boolean f55i;

        /* renamed from: j  reason: collision with root package name */
        public volatile com.bumptech.glide.load.data.d<DataT> f56j;

        public d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, t3.e eVar, Class<DataT> cls) {
            this.f48a = context.getApplicationContext();
            this.f49b = oVar;
            this.c = oVar2;
            this.f50d = uri;
            this.f51e = i10;
            this.f52f = i11;
            this.f53g = eVar;
            this.f54h = cls;
        }

        @Override // com.bumptech.glide.load.data.d
        public final Class<DataT> a() {
            return this.f54h;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f56j;
            if (dVar != null) {
                dVar.b();
            }
        }

        public final com.bumptech.glide.load.data.d<DataT> c() {
            boolean isExternalStorageLegacy;
            boolean z10;
            o.a<DataT> b10;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            t3.e eVar = this.f53g;
            int i10 = this.f52f;
            int i11 = this.f51e;
            Context context = this.f48a;
            if (isExternalStorageLegacy) {
                Uri uri = this.f50d;
                try {
                    Cursor query = context.getContentResolver().query(uri, f47k, null, null, null);
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    query.close();
                                    b10 = this.f49b.b(file, i11, i10, eVar);
                                } else {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Uri uri2 = this.f50d;
                if (z10) {
                    uri2 = MediaStore.setRequireOriginal(uri2);
                }
                b10 = this.c.b(uri2, i11, i10, eVar);
            }
            if (b10 == null) {
                return null;
            }
            return b10.c;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void cancel() {
            this.f55i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f56j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public final DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public final void e(Priority priority, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> c = c();
                if (c == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f50d));
                    return;
                }
                this.f56j = c;
                if (this.f55i) {
                    cancel();
                } else {
                    c.e(priority, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    public e(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f42a = context.getApplicationContext();
        this.f43b = oVar;
        this.c = oVar2;
        this.f44d = cls;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (Build.VERSION.SDK_INT >= 29 && ea.a.v(uri2)) {
            return true;
        }
        return false;
    }

    @Override // z3.o
    public final o.a b(Uri uri, int i10, int i11, t3.e eVar) {
        Uri uri2 = uri;
        return new o.a(new o4.d(uri2), new d(this.f42a, this.f43b, this.c, uri2, i10, i11, eVar, this.f44d));
    }
}
