package zd;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import be.a;
import com.google.ads.ADRequestList;
import ge.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BannerAD.java */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: e  reason: collision with root package name */
    public be.b f32347e;

    /* renamed from: f  reason: collision with root package name */
    public be.b f32348f;

    /* renamed from: g  reason: collision with root package name */
    public ae.a f32349g;

    /* renamed from: h  reason: collision with root package name */
    public View f32350h;

    /* renamed from: i  reason: collision with root package name */
    public Activity f32351i;

    /* renamed from: j  reason: collision with root package name */
    public final C0429a f32352j = new C0429a();

    public final yd.c d() {
        ADRequestList aDRequestList = this.f32354a;
        if (aDRequestList != null && aDRequestList.size() > 0 && this.f32355b < this.f32354a.size()) {
            yd.c cVar = this.f32354a.get(this.f32355b);
            this.f32355b++;
            return cVar;
        }
        return null;
    }

    public final void e(Activity activity, ADRequestList aDRequestList) {
        this.f32351i = activity;
        Context applicationContext = activity.getApplicationContext();
        this.c = false;
        this.f32356d = "";
        if (aDRequestList.getADListener() != null) {
            if (aDRequestList.getADListener() instanceof ae.a) {
                this.f32355b = 0;
                this.f32349g = (ae.a) aDRequestList.getADListener();
                this.f32354a = aDRequestList;
                if (g.d().f(applicationContext)) {
                    f(new yd.a("Free RAM Low, can't load ads.", 0));
                    return;
                } else {
                    g(d());
                    return;
                }
            }
            throw new IllegalArgumentException("BannerAD:requestList.getADListener() type error, please check.");
        }
        throw new IllegalArgumentException("BannerAD:requestList.getADListener() == null, please check.");
    }

    public final void f(yd.a aVar) {
        ae.a aVar2 = this.f32349g;
        if (aVar2 != null) {
            aVar2.c(aVar);
        }
        this.f32349g = null;
        this.f32351i = null;
    }

    public final void g(yd.c cVar) {
        Activity activity = this.f32351i;
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
                        be.b bVar = (be.b) Class.forName(str).newInstance();
                        this.f32348f = bVar;
                        bVar.d(this.f32351i, cVar, this.f32352j);
                        be.b bVar2 = this.f32348f;
                        if (bVar2 != null) {
                            bVar2.i(applicationContext);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        f(new yd.a("ad type or ad request config set error , please check.", 0));
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

    /* compiled from: BannerAD.java */
    /* renamed from: zd.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0429a implements a.InterfaceC0036a {
        public C0429a() {
        }

        @Override // be.a.InterfaceC0036a
        public final void a(Context context, yd.a aVar) {
            fe.a.a().b(aVar.toString());
            a aVar2 = a.this;
            be.b bVar = aVar2.f32348f;
            if (bVar != null) {
                bVar.f(context, aVar.toString());
            }
            aVar2.g(aVar2.d());
        }

        @Override // be.a.InterfaceC0036a
        public final void b(Context context, yd.d dVar) {
            a aVar = a.this;
            aVar.a(context);
            be.b bVar = aVar.f32347e;
            if (bVar != null) {
                bVar.e(context);
            }
            if (aVar.f32349g != null) {
                dVar.f32121d = aVar.b();
                aVar.f32349g.b(context, dVar);
            }
        }

        @Override // be.a.InterfaceC0036a
        public final boolean d() {
            return false;
        }

        @Override // be.a.InterfaceC0036a
        public final void e(Context context, View view, yd.d dVar) {
            ViewGroup viewGroup;
            a aVar = a.this;
            if (aVar.f32349g != null) {
                be.b bVar = aVar.f32347e;
                if (bVar != null && bVar != aVar.f32348f) {
                    View view2 = aVar.f32350h;
                    if (view2 != null && (viewGroup = (ViewGroup) view2.getParent()) != null) {
                        viewGroup.removeAllViews();
                    }
                    aVar.f32347e.a((Activity) context);
                }
                be.b bVar2 = aVar.f32348f;
                aVar.f32347e = bVar2;
                if (bVar2 != null) {
                    bVar2.h(context);
                }
                dVar.f32121d = aVar.b();
                try {
                    if (view instanceof ViewGroup) {
                        ((ViewGroup) view).setDescendantFocusability(393216);
                    }
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                aVar.f32349g.a(context, view, dVar);
                aVar.f32350h = view;
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void g(Context context) {
            a aVar = a.this;
            be.b bVar = aVar.f32347e;
            if (bVar != null) {
                bVar.g(context);
            }
            ae.a aVar2 = aVar.f32349g;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void c() {
        }

        @Override // be.a.InterfaceC0036a
        public final void f(Context context) {
        }
    }
}
