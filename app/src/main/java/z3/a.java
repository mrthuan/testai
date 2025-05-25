package z3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import z3.o;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes.dex */
public final class a<Data> implements o<Uri, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f32221a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0425a<Data> f32222b;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: z3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0425a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class b implements p<Uri, ParcelFileDescriptor>, InterfaceC0425a<ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f32223a;

        public b(AssetManager assetManager) {
            this.f32223a = assetManager;
        }

        @Override // z3.a.InterfaceC0425a
        public final com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // z3.p
        public final o<Uri, ParcelFileDescriptor> b(s sVar) {
            return new a(this.f32223a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes.dex */
    public static class c implements p<Uri, InputStream>, InterfaceC0425a<InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final AssetManager f32224a;

        public c(AssetManager assetManager) {
            this.f32224a = assetManager;
        }

        @Override // z3.a.InterfaceC0425a
        public final com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // z3.p
        public final o<Uri, InputStream> b(s sVar) {
            return new a(this.f32224a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0425a<Data> interfaceC0425a) {
        this.f32221a = assetManager;
        this.f32222b = interfaceC0425a;
    }

    @Override // z3.o
    public final boolean a(Uri uri) {
        Uri uri2 = uri;
        if (!"file".equals(uri2.getScheme()) || uri2.getPathSegments().isEmpty() || !"android_asset".equals(uri2.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // z3.o
    public final o.a b(Uri uri, int i10, int i11, t3.e eVar) {
        Uri uri2 = uri;
        return new o.a(new o4.d(uri2), this.f32222b.a(this.f32221a, uri2.toString().substring(22)));
    }
}
