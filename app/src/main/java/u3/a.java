package u3;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes.dex */
public final class a implements d<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f30144a;

    /* renamed from: b  reason: collision with root package name */
    public final c f30145b;
    public InputStream c;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: u3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0381a implements u3.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f30146b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f30147a;

        public C0381a(ContentResolver contentResolver) {
            this.f30147a = contentResolver;
        }

        @Override // u3.b
        public final Cursor a(Uri uri) {
            return this.f30147a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f30146b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes.dex */
    public static class b implements u3.b {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f30148b = {"_data"};

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f30149a;

        public b(ContentResolver contentResolver) {
            this.f30149a = contentResolver;
        }

        @Override // u3.b
        public final Cursor a(Uri uri) {
            return this.f30149a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f30148b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public a(Uri uri, c cVar) {
        this.f30144a = uri;
        this.f30145b = cVar;
    }

    public static a c(Context context, Uri uri, u3.b bVar) {
        return new a(uri, new c(com.bumptech.glide.b.b(context).f6835d.f(), bVar, com.bumptech.glide.b.b(context).f6836e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final DataSource d() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public final void e(Priority priority, d.a<? super InputStream> aVar) {
        try {
            InputStream f10 = f();
            this.c = f10;
            aVar.f(f10);
        } catch (FileNotFoundException e10) {
            Log.isLoggable("MediaStoreThumbFetcher", 3);
            aVar.c(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r6 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        r7 = null;
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0023: MOVE  (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:10:0x0023 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream f() {
        /*
            r11 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            android.net.Uri r1 = r11.f30144a
            u3.c r2 = r11.f30145b
            r2.getClass()
            r3 = 3
            r4 = 0
            r5 = 0
            u3.b r6 = r2.f30150a     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L2c
            android.database.Cursor r6 = r6.a(r1)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L2c
            if (r6 == 0) goto L26
            boolean r7 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L2d
            if (r7 == 0) goto L26
            java.lang.String r7 = r6.getString(r5)     // Catch: java.lang.Throwable -> L22 java.lang.SecurityException -> L2d
            r6.close()
            goto L3c
        L22:
            r0 = move-exception
            r4 = r6
            goto Lc5
        L26:
            if (r6 == 0) goto L3b
            goto L38
        L29:
            r0 = move-exception
            goto Lc5
        L2c:
            r6 = r4
        L2d:
            boolean r7 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L22
            if (r7 == 0) goto L36
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L22
        L36:
            if (r6 == 0) goto L3b
        L38:
            r6.close()
        L3b:
            r7 = r4
        L3c:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L44
        L42:
            r5 = r4
            goto L67
        L44:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L5a
            long r7 = r6.length()
            r9 = 0
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            r5 = 1
        L5a:
            if (r5 != 0) goto L5d
            goto L42
        L5d:
            android.net.Uri r5 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r6 = r2.c     // Catch: java.lang.NullPointerException -> La2
            java.io.InputStream r5 = r6.openInputStream(r5)     // Catch: java.lang.NullPointerException -> La2
        L67:
            r6 = -1
            if (r5 == 0) goto L98
            r2.getClass()
            android.content.ContentResolver r7 = r2.c     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L83
            java.io.InputStream r4 = r7.openInputStream(r1)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L83
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r2.f30152d     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L83
            w3.b r2 = r2.f30151b     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L83
            int r0 = com.bumptech.glide.load.a.a(r2, r4, r7)     // Catch: java.lang.Throwable -> L81 java.lang.Throwable -> L83
            if (r4 == 0) goto L99
            r4.close()     // Catch: java.io.IOException -> L99
            goto L99
        L81:
            r0 = move-exception
            goto L92
        L83:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L8c
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L81
        L8c:
            if (r4 == 0) goto L98
            r4.close()     // Catch: java.io.IOException -> L98
            goto L98
        L92:
            if (r4 == 0) goto L97
            r4.close()     // Catch: java.io.IOException -> L97
        L97:
            throw r0
        L98:
            r0 = r6
        L99:
            if (r0 == r6) goto La1
            com.bumptech.glide.load.data.g r1 = new com.bumptech.glide.load.data.g
            r1.<init>(r5, r0)
            r5 = r1
        La1:
            return r5
        La2:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        Lc5:
            if (r4 == 0) goto Lca
            r4.close()
        Lca:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.a.f():java.io.InputStream");
    }

    @Override // com.bumptech.glide.load.data.d
    public final void cancel() {
    }
}
