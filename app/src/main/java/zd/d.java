package zd;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import be.a;
import com.google.ads.ADRequestList;
import ge.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: NativeCardAD.java */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e  reason: collision with root package name */
    public be.d f32362e;

    /* renamed from: f  reason: collision with root package name */
    public ae.d f32363f;

    /* renamed from: g  reason: collision with root package name */
    public Activity f32364g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f32365h;

    /* renamed from: i  reason: collision with root package name */
    public final a f32366i;

    public d(int i10) {
        this.f32365h = true;
        this.f32366i = new a();
        this.f32365h = false;
    }

    public final void d(Activity activity) {
        be.d dVar = this.f32362e;
        if (dVar != null) {
            dVar.a(activity);
        }
        this.f32363f = null;
        this.f32364g = null;
    }

    public final yd.c e() {
        ADRequestList aDRequestList = this.f32354a;
        if (aDRequestList != null && aDRequestList.size() > 0 && this.f32355b < this.f32354a.size()) {
            yd.c cVar = this.f32354a.get(this.f32355b);
            this.f32355b++;
            return cVar;
        }
        return null;
    }

    public final void f(Activity activity, ADRequestList aDRequestList) {
        this.f32364g = activity;
        Context applicationContext = activity.getApplicationContext();
        this.c = false;
        this.f32356d = "";
        if (aDRequestList.getADListener() != null) {
            if (aDRequestList.getADListener() instanceof ae.d) {
                this.f32355b = 0;
                this.f32363f = (ae.d) aDRequestList.getADListener();
                this.f32354a = aDRequestList;
                if (g.d().f(applicationContext)) {
                    g(new yd.a("Free RAM Low, can't load ads.", 0));
                    return;
                } else {
                    h(e());
                    return;
                }
            }
            throw new IllegalArgumentException("NativeCardAD:requestList.getADListener() type error, please check.");
        }
        throw new IllegalArgumentException("NativeCardAD:requestList.getADListener() == null, please check.");
    }

    public final void g(yd.a aVar) {
        ae.d dVar = this.f32363f;
        if (dVar != null) {
            dVar.c(aVar);
        }
        this.f32363f = null;
        this.f32364g = null;
    }

    public final void h(yd.c cVar) {
        Activity activity = this.f32364g;
        if (activity == null) {
            g(new yd.a("Context/Activity == null", 0));
            return;
        }
        Context applicationContext = activity.getApplicationContext();
        if (cVar != null && !c(applicationContext)) {
            if (applicationContext.getPackageName().equals(applicationContext.getString(R.string.arg_res_0x7f1302f2))) {
                String str = cVar.f32117a;
                if (str != null) {
                    try {
                        be.d dVar = this.f32362e;
                        if (dVar != null) {
                            dVar.a(this.f32364g);
                        }
                        be.d dVar2 = (be.d) Class.forName(str).newInstance();
                        this.f32362e = dVar2;
                        dVar2.d(this.f32364g, cVar, this.f32366i);
                        be.d dVar3 = this.f32362e;
                        if (dVar3 != null) {
                            dVar3.i(applicationContext);
                            return;
                        }
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        g(new yd.a("ad type or ad request config set error, please check.", 0));
                        return;
                    }
                }
                return;
            }
            g(new yd.a("ad config error, please check.", 0));
            throw new RuntimeException("Ad config error, please check package name.");
        }
        g(new yd.a("load all request, but no ads return", 0));
    }

    public final boolean i(Activity activity, FrameLayout frameLayout, int i10, int i11) {
        View j10 = this.f32362e.j(activity, i10, i11);
        if (j10 != null) {
            ViewGroup viewGroup = (ViewGroup) j10.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            frameLayout.removeAllViews();
            frameLayout.addView(j10);
            return true;
        }
        return false;
    }

    public d() {
        this.f32365h = true;
        this.f32366i = new a();
    }

    /* compiled from: NativeCardAD.java */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0036a {
        public a() {
        }

        @Override // be.a.InterfaceC0036a
        public final void a(Context context, yd.a aVar) {
            fe.a.a().b(aVar.toString());
            d dVar = d.this;
            be.d dVar2 = dVar.f32362e;
            if (dVar2 != null) {
                dVar2.f(context, aVar.toString());
            }
            dVar.h(dVar.e());
        }

        @Override // be.a.InterfaceC0036a
        public final void b(Context context, yd.d dVar) {
            d dVar2 = d.this;
            be.d dVar3 = dVar2.f32362e;
            if (dVar3 != null) {
                dVar3.e(context);
            }
            if (dVar2.f32363f != null) {
                dVar.f32121d = dVar2.b();
                dVar2.f32363f.b(context, dVar);
            }
            dVar2.a(context);
        }

        @Override // be.a.InterfaceC0036a
        public final boolean d() {
            return d.this.f32365h;
        }

        @Override // be.a.InterfaceC0036a
        public final void e(Context context, View view, yd.d dVar) {
            d dVar2 = d.this;
            be.d dVar3 = dVar2.f32362e;
            if (dVar3 != null) {
                dVar3.h(context);
            }
            if (dVar2.f32363f != null) {
                dVar.f32121d = dVar2.b();
                dVar2.f32363f.a(context, view, dVar);
            }
        }

        @Override // be.a.InterfaceC0036a
        public final void g(Context context) {
            be.d dVar = d.this.f32362e;
            if (dVar != null) {
                dVar.g(context);
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
