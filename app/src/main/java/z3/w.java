package z3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z3.o;

/* compiled from: UriLoader.java */
/* loaded from: classes.dex */
public final class w<Data> implements o<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f32288b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a  reason: collision with root package name */
    public final c<Data> f32289a;

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f32290a;

        public a(ContentResolver contentResolver) {
            this.f32290a = contentResolver;
        }

        @Override // z3.w.c
        public final com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f32290a, uri);
        }

        @Override // z3.p
        public final o<Uri, AssetFileDescriptor> b(s sVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f32291a;

        public b(ContentResolver contentResolver) {
            this.f32291a = contentResolver;
        }

        @Override // z3.w.c
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f32291a, uri);
        }

        @Override // z3.p
        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes.dex */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final ContentResolver f32292a;

        public d(ContentResolver contentResolver) {
            this.f32292a = contentResolver;
        }

        @Override // z3.w.c
        public final com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f32292a, uri);
        }

        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f32289a = cVar;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        return f32288b.contains(uri.getScheme());
    }

    @Override // z3.o
    public final o.a b(Uri uri, int i10, int i11, t3.e eVar) {
        Uri uri2 = uri;
        return new o.a(new o4.d(uri2), this.f32289a.a(uri2));
    }
}
