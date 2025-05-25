package zd;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import be.a;
import com.google.ads.ADRequestList;
import ge.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: InterstitialAD.java */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: e  reason: collision with root package name */
    public be.c f32357e;

    /* renamed from: f  reason: collision with root package name */
    public ae.b f32358f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f32359g;

    /* renamed from: h  reason: collision with root package name */
    public final a f32360h = new a();

    public final yd.c d() {
        ADRequestList aDRequestList = this.f32354a;
        if (aDRequestList != null && aDRequestList.size() > 0 && this.f32355b < this.f32354a.size()) {
            yd.c cVar = this.f32354a.get(this.f32355b);
            this.f32355b++;
            return cVar;
        }
        return null;
    }

    public final void e(Activity activity, ADRequestList aDRequestList, boolean z10) {
        this.f32359g = activity;
        Context applicationContext = activity.getApplicationContext();
        this.c = z10;
        this.f32356d = "";
        if (aDRequestList != null) {
            if (aDRequestList.getADListener() != null) {
                if (aDRequestList.getADListener() instanceof ae.b) {
                    this.f32355b = 0;
                    this.f32358f = (ae.b) aDRequestList.getADListener();
                    this.f32354a = aDRequestList;
                    if (g.d().f(applicationContext)) {
                        f(new yd.a("Free RAM Low, can't load ads.", 0));
                        return;
                    } else {
                        g(d());
                        return;
                    }
                }
                throw new IllegalArgumentException("InterstitialAD:requestList.getADListener() type error, please check.");
            }
            throw new IllegalArgumentException("InterstitialAD:requestList.getADListener() == null, please check.");
        }
        throw new IllegalArgumentException("InterstitialAD:ADRequestList == null, please check.");
    }

    public final void f(yd.a aVar) {
        ae.b bVar = this.f32358f;
        if (bVar != null) {
            bVar.c(aVar);
        }
        this.f32358f = null;
        this.f32359g = null;
    }

    public final void g(yd.c cVar) {
        Activity activity = this.f32359g;
        if (activity == null) {
            f(new yd.a("Context/Activity == null", 0));
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        if (cVar != null && !c(applicationContext)) {
            if (applicationContext.getPackageName().equals(applicationContext.getString(R.string.arg_res_0x7f1302f2))) {
                String str = cVar.f32117a;
                if (str != null) {
                    try {
                        be.c cVar2 = this.f32357e;
                        if (cVar2 != null) {
                            cVar2.a(this.f32359g);
                        }
                        be.c cVar3 = (be.c) Class.forName(str).newInstance();
                        this.f32357e = cVar3;
                        cVar3.d(this.f32359g, cVar, this.f32360h);
                        be.c cVar4 = this.f32357e;
                        if (cVar4 != null) {
                            cVar4.i(applicationContext);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        f(new yd.a("ad type or ad request config set error, please check.", 0));
                        return;
                    }
                }
                return;
            }
            f(new yd.a("ad config error, please check.", 0));
            throw new RuntimeException("Ad config error, please check package name.");
        }
        f(new yd.a("load all request, but no ads return", 0));
    }

    /* compiled from: InterstitialAD.java */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0036a {
        public a() {
        }

        @Override // be.a.InterfaceC0036a
        public final void a(Context context, yd.a aVar) {
            fe.a.a().b(aVar.toString());
            c cVar = c.this;
            be.c cVar2 = cVar.f32357e;
            if (cVar2 != null) {
                cVar2.f(context, aVar.toString());
            }
            cVar.g(cVar.d());
        }

        @Override // be.a.InterfaceC0036a
        public final void b(Context context, yd.d dVar) {
            c cVar = c.this;
            be.c cVar2 = cVar.f32357e;
            if (cVar2 != null) {
                cVar2.e(context);
            }
            if (cVar.f32358f != null) {
                dVar.f32121d = cVar.b();
                cVar.f32358f.b(context, dVar);
            }
            cVar.a(context);
        }

        @Override // be.a.InterfaceC0036a
        public final boolean d() {
            return false;
        }

        @Override // be.a.InterfaceC0036a
        public final void e(Context context, View view, yd.d dVar) {
            c cVar = c.this;
            be.c cVar2 = cVar.f32357e;
            if (cVar2 != null) {
                cVar2.h(context);
            }
            if (cVar.f32358f != null) {
                dVar.f32121d = cVar.b();
                cVar.f32358f.e(dVar);
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void f(Context context) {
            ae.b bVar = c.this.f32358f;
            if (bVar != null) {
                bVar.onAdClosed();
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void g(Context context) {
            be.c cVar = c.this.f32357e;
            if (cVar != null) {
                cVar.g(context);
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void c() {
        }
    }
}
