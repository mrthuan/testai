package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.g;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s0.l;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements c2.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends g.c {
        public a(Context context) {
            super(new b(context));
            this.f3629b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements g.InterfaceC0016g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f3612a;

        public b(Context context) {
            this.f3612a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.g.InterfaceC0016g
        public final void a(g.h hVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new h(0, this, hVar, threadPoolExecutor));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                int i10 = s0.l.f29698a;
                l.a.a("EmojiCompat.EmojiCompatInitializer.run");
                if (g.f3618j != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    g.a().c();
                }
                l.a.b();
            } catch (Throwable th2) {
                int i11 = s0.l.f29698a;
                l.a.b();
                throw th2;
            }
        }
    }

    @Override // c2.b
    public final List<Class<? extends c2.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // c2.b
    /* renamed from: b */
    public final Boolean create(Context context) {
        a aVar = new a(context);
        if (g.f3618j == null) {
            synchronized (g.f3617i) {
                if (g.f3618j == null) {
                    g.f3618j = new g(aVar);
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object obj;
        c2.a c10 = c2.a.c(context);
        c10.getClass();
        synchronized (c2.a.f5508e) {
            try {
                obj = c10.f5509a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final Lifecycle lifecycle = ((androidx.lifecycle.p) obj).getLifecycle();
        lifecycle.a(new androidx.lifecycle.e() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public final void a(androidx.lifecycle.p pVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = androidx.emoji2.text.c.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new c(), 500L);
                lifecycle.c(this);
            }

            @Override // androidx.lifecycle.e
            public final void b(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.e
            public final void e(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.e
            public final void h(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.e
            public final void i(androidx.lifecycle.p pVar) {
            }

            @Override // androidx.lifecycle.e
            public final void k(androidx.lifecycle.p pVar) {
            }
        });
    }
}
