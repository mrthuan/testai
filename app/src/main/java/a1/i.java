package a1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final c f21a;

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public i(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f21a = new a(uri, clipDescription, uri2);
        } else {
            this.f21a = new b(uri, clipDescription, uri2);
        }
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f22a;

        public a(Object obj) {
            this.f22a = (InputContentInfo) obj;
        }

        @Override // a1.i.c
        public final Uri a() {
            return this.f22a.getContentUri();
        }

        @Override // a1.i.c
        public final void b() {
            this.f22a.requestPermission();
        }

        @Override // a1.i.c
        public final Uri c() {
            return this.f22a.getLinkUri();
        }

        @Override // a1.i.c
        public final Object d() {
            return this.f22a;
        }

        @Override // a1.i.c
        public final ClipDescription getDescription() {
            return this.f22a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f22a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public i(a aVar) {
        this.f21a = aVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f23a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f24b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f23a = uri;
            this.f24b = clipDescription;
            this.c = uri2;
        }

        @Override // a1.i.c
        public final Uri a() {
            return this.f23a;
        }

        @Override // a1.i.c
        public final Uri c() {
            return this.c;
        }

        @Override // a1.i.c
        public final Object d() {
            return null;
        }

        @Override // a1.i.c
        public final ClipDescription getDescription() {
            return this.f24b;
        }

        @Override // a1.i.c
        public final void b() {
        }
    }
}
