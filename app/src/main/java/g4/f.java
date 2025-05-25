package g4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import p4.j;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final s3.a f17641a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f17642b;
    public final ArrayList c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bumptech.glide.f f17643d;

    /* renamed from: e  reason: collision with root package name */
    public final w3.c f17644e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17645f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f17646g;

    /* renamed from: h  reason: collision with root package name */
    public com.bumptech.glide.e<Bitmap> f17647h;

    /* renamed from: i  reason: collision with root package name */
    public a f17648i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f17649j;

    /* renamed from: k  reason: collision with root package name */
    public a f17650k;

    /* renamed from: l  reason: collision with root package name */
    public Bitmap f17651l;

    /* renamed from: m  reason: collision with root package name */
    public t3.h<Bitmap> f17652m;

    /* renamed from: n  reason: collision with root package name */
    public a f17653n;

    /* renamed from: o  reason: collision with root package name */
    public int f17654o;

    /* renamed from: p  reason: collision with root package name */
    public int f17655p;

    /* renamed from: q  reason: collision with root package name */
    public int f17656q;

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public static class a extends m4.c<Bitmap> {

        /* renamed from: d  reason: collision with root package name */
        public final Handler f17657d;

        /* renamed from: e  reason: collision with root package name */
        public final int f17658e;

        /* renamed from: f  reason: collision with root package name */
        public final long f17659f;

        /* renamed from: g  reason: collision with root package name */
        public Bitmap f17660g;

        public a(Handler handler, int i10, long j10) {
            this.f17657d = handler;
            this.f17658e = i10;
            this.f17659f = j10;
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            this.f17660g = (Bitmap) obj;
            Handler handler = this.f17657d;
            handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f17659f);
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
            this.f17660g = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.what;
            f fVar = f.this;
            if (i10 == 1) {
                fVar.b((a) message.obj);
                return true;
            } else if (i10 == 2) {
                fVar.f17643d.k((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    public f(com.bumptech.glide.b bVar, s3.e eVar, int i10, int i11, b4.a aVar, Bitmap bitmap) {
        w3.c cVar = bVar.f6833a;
        com.bumptech.glide.d dVar = bVar.c;
        com.bumptech.glide.f f10 = com.bumptech.glide.b.f(dVar.getBaseContext());
        com.bumptech.glide.e<Bitmap> C = com.bumptech.glide.b.f(dVar.getBaseContext()).a().C(((l4.e) ((l4.e) new l4.e().g(v3.f.f30509a).B()).w()).n(i10, i11));
        this.c = new ArrayList();
        this.f17643d = f10;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f17644e = cVar;
        this.f17642b = handler;
        this.f17647h = C;
        this.f17641a = eVar;
        c(aVar, bitmap);
    }

    public final void a() {
        if (this.f17645f && !this.f17646g) {
            a aVar = this.f17653n;
            if (aVar != null) {
                this.f17653n = null;
                b(aVar);
                return;
            }
            this.f17646g = true;
            s3.a aVar2 = this.f17641a;
            long uptimeMillis = SystemClock.uptimeMillis() + aVar2.d();
            aVar2.b();
            this.f17650k = new a(this.f17642b, aVar2.e(), uptimeMillis);
            com.bumptech.glide.e<Bitmap> C = this.f17647h.C(new l4.e().u(new o4.d(Double.valueOf(Math.random()))));
            C.F = aVar2;
            C.I = true;
            C.F(this.f17650k);
        }
    }

    public final void b(a aVar) {
        this.f17646g = false;
        boolean z10 = this.f17649j;
        Handler handler = this.f17642b;
        if (z10) {
            handler.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f17645f) {
            this.f17653n = aVar;
        } else {
            if (aVar.f17660g != null) {
                Bitmap bitmap = this.f17651l;
                if (bitmap != null) {
                    this.f17644e.d(bitmap);
                    this.f17651l = null;
                }
                a aVar2 = this.f17648i;
                this.f17648i = aVar;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((b) arrayList.get(size)).a();
                }
                if (aVar2 != null) {
                    handler.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            a();
        }
    }

    public final void c(t3.h<Bitmap> hVar, Bitmap bitmap) {
        com.google.android.play.core.assetpacks.c.l(hVar);
        this.f17652m = hVar;
        com.google.android.play.core.assetpacks.c.l(bitmap);
        this.f17651l = bitmap;
        this.f17647h = this.f17647h.C(new l4.e().z(hVar, true));
        this.f17654o = j.c(bitmap);
        this.f17655p = bitmap.getWidth();
        this.f17656q = bitmap.getHeight();
    }
}
