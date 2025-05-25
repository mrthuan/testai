package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.emoji2.text.g;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: classes.dex */
public final class m extends g.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f3649d = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig.java */
    /* loaded from: classes.dex */
    public static class b implements g.InterfaceC0016g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f3650a;

        /* renamed from: b  reason: collision with root package name */
        public final t0.f f3651b;
        public final a c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f3652d;

        /* renamed from: e  reason: collision with root package name */
        public Handler f3653e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f3654f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f3655g;

        /* renamed from: h  reason: collision with root package name */
        public g.h f3656h;

        public b(Context context, t0.f fVar) {
            a aVar = m.f3649d;
            this.f3652d = new Object();
            if (context != null) {
                this.f3650a = context.getApplicationContext();
                this.f3651b = fVar;
                this.c = aVar;
                return;
            }
            throw new NullPointerException("Context cannot be null");
        }

        @Override // androidx.emoji2.text.g.InterfaceC0016g
        public final void a(g.h hVar) {
            synchronized (this.f3652d) {
                this.f3656h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f3652d) {
                this.f3656h = null;
                Handler handler = this.f3653e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f3653e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3655g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3654f = null;
                this.f3655g = null;
            }
        }

        public final void c() {
            synchronized (this.f3652d) {
                if (this.f3656h == null) {
                    return;
                }
                if (this.f3654f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f3655g = threadPoolExecutor;
                    this.f3654f = threadPoolExecutor;
                }
                this.f3654f.execute(new b1.e(this, 1));
            }
        }

        public final t0.m d() {
            try {
                a aVar = this.c;
                Context context = this.f3650a;
                t0.f fVar = this.f3651b;
                aVar.getClass();
                t0.l a10 = t0.e.a(context, fVar);
                int i10 = a10.f29894a;
                if (i10 == 0) {
                    t0.m[] mVarArr = a10.f29895b;
                    if (mVarArr != null && mVarArr.length != 0) {
                        return mVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(a0.a.g("fetchFonts failed (", i10, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public m(Context context, t0.f fVar) {
        super(new b(context, fVar));
    }
}
