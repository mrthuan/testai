package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.processor.a;
import com.iab.omid.library.inmobi.utils.f;
import com.iab.omid.library.inmobi.utils.h;
import com.iab.omid.library.inmobi.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0183a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f14006i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f14007j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f14008k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f14009l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f14010m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f14012b;

    /* renamed from: h  reason: collision with root package name */
    private long f14017h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f14011a = new ArrayList();
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.inmobi.weakreference.a> f14013d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.a f14015f = new com.iab.omid.library.inmobi.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.inmobi.processor.b f14014e = new com.iab.omid.library.inmobi.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.inmobi.walking.b f14016g = new com.iab.omid.library.inmobi.walking.b(new com.iab.omid.library.inmobi.walking.async.c());

    /* loaded from: classes2.dex */
    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f14016g.b();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f14008k != null) {
                TreeWalker.f14008k.post(TreeWalker.f14009l);
                TreeWalker.f14008k.postDelayed(TreeWalker.f14010m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f14017h);
    }

    private void e() {
        this.f14012b = 0;
        this.f14013d.clear();
        this.c = false;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = com.iab.omid.library.inmobi.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.c = true;
                break;
            }
        }
        this.f14017h = f.b();
    }

    public static TreeWalker getInstance() {
        return f14006i;
    }

    private void i() {
        if (f14008k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f14008k = handler;
            handler.post(f14009l);
            f14008k.postDelayed(f14010m, 200L);
        }
    }

    private void k() {
        Handler handler = f14008k;
        if (handler != null) {
            handler.removeCallbacks(f14010m);
            f14008k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f14011a.contains(treeWalkerTimeLogger)) {
            this.f14011a.add(treeWalkerTimeLogger);
        }
    }

    public void f() {
        this.f14015f.e();
        long b10 = f.b();
        com.iab.omid.library.inmobi.processor.a a10 = this.f14014e.a();
        if (this.f14015f.b().size() > 0) {
            Iterator<String> it = this.f14015f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f14015f.a(next), a11);
                com.iab.omid.library.inmobi.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f14016g.a(a11, hashSet, b10);
            }
        }
        if (this.f14015f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.inmobi.utils.c.b(a12);
            this.f14016g.b(a12, this.f14015f.c(), b10);
            if (this.c) {
                for (com.iab.omid.library.inmobi.adsession.a aVar : com.iab.omid.library.inmobi.internal.c.c().a()) {
                    aVar.a(this.f14013d);
                }
            }
        } else {
            this.f14016g.b();
        }
        this.f14015f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f14011a.clear();
        f14007j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f14011a.contains(treeWalkerTimeLogger)) {
            this.f14011a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f14011a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f14011a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f14012b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f14012b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f14015f.d(view);
        if (d10 != null) {
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, d10);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, Boolean.valueOf(this.f14015f.f(view)));
            this.f14015f.d();
            return true;
        }
        return false;
    }

    private void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.inmobi.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.inmobi.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.inmobi.processor.a.InterfaceC0183a
    public void a(View view, com.iab.omid.library.inmobi.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.inmobi.walking.c e10;
        if (h.d(view) && (e10 = this.f14015f.e(view)) != com.iab.omid.library.inmobi.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.c && e10 == com.iab.omid.library.inmobi.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f14013d.add(new com.iab.omid.library.inmobi.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z11);
            }
            this.f14012b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.inmobi.processor.a b10 = this.f14014e.b();
        String b11 = this.f14015f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.inmobi.utils.c.a(a10, str);
            com.iab.omid.library.inmobi.utils.c.b(a10, b11);
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0185a c10 = this.f14015f.c(view);
        if (c10 != null) {
            com.iab.omid.library.inmobi.utils.c.a(jSONObject, c10);
            return true;
        }
        return false;
    }
}
