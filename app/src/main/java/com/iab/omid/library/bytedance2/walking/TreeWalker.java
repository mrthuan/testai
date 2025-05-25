package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.processor.a;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import com.iab.omid.library.bytedance2.walking.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class TreeWalker implements a.InterfaceC0180a {

    /* renamed from: i  reason: collision with root package name */
    private static TreeWalker f13895i = new TreeWalker();

    /* renamed from: j  reason: collision with root package name */
    private static Handler f13896j = new Handler(Looper.getMainLooper());

    /* renamed from: k  reason: collision with root package name */
    private static Handler f13897k = null;

    /* renamed from: l  reason: collision with root package name */
    private static final Runnable f13898l = new b();

    /* renamed from: m  reason: collision with root package name */
    private static final Runnable f13899m = new c();

    /* renamed from: b  reason: collision with root package name */
    private int f13901b;

    /* renamed from: h  reason: collision with root package name */
    private long f13906h;

    /* renamed from: a  reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f13900a = new ArrayList();
    private boolean c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f13902d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f13904f = new com.iab.omid.library.bytedance2.walking.a();

    /* renamed from: e  reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f13903e = new com.iab.omid.library.bytedance2.processor.b();

    /* renamed from: g  reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f13905g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

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
            TreeWalker.this.f13905g.b();
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
            if (TreeWalker.f13897k != null) {
                TreeWalker.f13897k.post(TreeWalker.f13898l);
                TreeWalker.f13897k.postDelayed(TreeWalker.f13899m, 200L);
            }
        }
    }

    private void d() {
        a(f.b() - this.f13906h);
    }

    private void e() {
        this.f13901b = 0;
        this.f13902d.clear();
        this.c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e()) {
                this.c = true;
                break;
            }
        }
        this.f13906h = f.b();
    }

    public static TreeWalker getInstance() {
        return f13895i;
    }

    private void i() {
        if (f13897k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f13897k = handler;
            handler.post(f13898l);
            f13897k.postDelayed(f13899m, 200L);
        }
    }

    private void k() {
        Handler handler = f13897k;
        if (handler != null) {
            handler.removeCallbacks(f13899m);
            f13897k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f13900a.contains(treeWalkerTimeLogger)) {
            this.f13900a.add(treeWalkerTimeLogger);
        }
    }

    public void f() {
        this.f13904f.e();
        long b10 = f.b();
        com.iab.omid.library.bytedance2.processor.a a10 = this.f13903e.a();
        if (this.f13904f.b().size() > 0) {
            Iterator<String> it = this.f13904f.b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a11 = a10.a(null);
                a(next, this.f13904f.a(next), a11);
                com.iab.omid.library.bytedance2.utils.c.b(a11);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(next);
                this.f13905g.a(a11, hashSet, b10);
            }
        }
        if (this.f13904f.c().size() > 0) {
            JSONObject a12 = a10.a(null);
            a(null, a10, a12, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(a12);
            this.f13905g.b(a12, this.f13904f.c(), b10);
            if (this.c) {
                for (com.iab.omid.library.bytedance2.adsession.a aVar : com.iab.omid.library.bytedance2.internal.c.c().a()) {
                    aVar.a(this.f13902d);
                }
            }
        } else {
            this.f13905g.b();
        }
        this.f13904f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f13900a.clear();
        f13896j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f13900a.contains(treeWalkerTimeLogger)) {
            this.f13900a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f13900a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f13900a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f13901b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f13901b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String d10 = this.f13904f.d(view);
        if (d10 != null) {
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, d10);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f13904f.f(view)));
            this.f13904f.d();
            return true;
        }
        return false;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z10) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z10);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0180a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z10) {
        com.iab.omid.library.bytedance2.walking.c e10;
        if (h.d(view) && (e10 = this.f13904f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject a10 = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a10);
            if (!b(view, a10)) {
                boolean z11 = z10 || a(view, a10);
                if (this.c && e10 == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z11) {
                    this.f13902d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                a(view, aVar, a10, e10, z11);
            }
            this.f13901b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a b10 = this.f13903e.b();
        String b11 = this.f13904f.b(str);
        if (b11 != null) {
            JSONObject a10 = b10.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(a10, str);
            com.iab.omid.library.bytedance2.utils.c.b(a10, b11);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, a10);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        a.C0181a c10 = this.f13904f.c(view);
        if (c10 != null) {
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c10);
            return true;
        }
        return false;
    }
}
