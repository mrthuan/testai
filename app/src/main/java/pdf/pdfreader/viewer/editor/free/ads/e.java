package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import be.c;
import com.google.ads.ADRequestList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: GuideFullAds.java */
/* loaded from: classes3.dex */
public final class e extends pdf.pdfreader.viewer.editor.free.ads.a {

    /* renamed from: i  reason: collision with root package name */
    public static e f23945i;

    /* compiled from: GuideFullAds.java */
    /* loaded from: classes3.dex */
    public class a implements ae.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23946a;

        public a(Activity activity) {
            this.f23946a = activity;
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            String p10 = ea.a.p("IG5wZDpsXmNr", "6YVJpGdZ");
            e eVar = e.this;
            eVar.a(p10);
            eVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar2 = eVar.f23921e;
            if (dVar2 != null) {
                dVar2.d();
            }
            AppOpenManager.c().f23907g = false;
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            e eVar = e.this;
            eVar.a(ea.a.p("XG4KZD9vA2Q0YV1sDGQg", "4yStpBLP") + aVar);
            eVar.f23924h = InterstitialAdState.FAIL;
            a.d dVar = eVar.f23921e;
            if (dVar != null) {
                dVar.a0();
            }
            eVar.b(this.f23946a);
        }

        @Override // ae.b
        public final void e(yd.d dVar) {
            String p10 = ea.a.p("IG5wZDVvVmQ=", "ufAKK2I4");
            e eVar = e.this;
            eVar.a(p10);
            eVar.f23920d = System.currentTimeMillis();
            eVar.f23924h = InterstitialAdState.SUCCESS;
            a.d dVar2 = eVar.f23921e;
            if (dVar2 != null) {
                dVar2.J();
            }
        }

        @Override // ae.b
        public final void onAdClosed() {
            String p10 = ea.a.p("XG4KZDBsDXMXZA==", "DyanUfmJ");
            e eVar = e.this;
            eVar.a(p10);
            eVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar = eVar.f23921e;
            if (dVar != null) {
                dVar.close();
            }
            eVar.b(this.f23946a);
        }
    }

    /* compiled from: GuideFullAds.java */
    /* loaded from: classes3.dex */
    public class b implements c.a {
        public b() {
        }

        @Override // be.c.a
        public final void a(boolean z10) {
            a.d dVar = e.this.f23921e;
            if (dVar != null) {
                dVar.w(z10);
            }
            if (z10) {
                wn.b.d();
            }
        }
    }

    public e() {
        this.f23922f = 4;
    }

    public static synchronized e m() {
        e eVar;
        synchronized (e.class) {
            if (f23945i == null) {
                f23945i = new e();
            }
            eVar = f23945i;
        }
        return eVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a
    public final ADRequestList c(Activity activity) {
        ADRequestList aDRequestList = new ADRequestList(new a(activity));
        aDRequestList.addAll(he.a.b(activity, new yd.a(he.a.f18155b0, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.Z5), new ie.e(he.a.f18153a6), new ie.e(he.a.f18161b6), new ie.b(he.a.f18214j3), new w4.c(he.a.f18162c0, he.a.f18177e1), new a2.a(he.a.f18184f1, he.a.f18199h2)));
        return aDRequestList;
    }

    public final void n(Activity activity, a.d dVar) {
        this.f23921e = dVar;
        if (activity == null) {
            return;
        }
        if (d(activity)) {
            j(activity, new b());
        } else if (f.m().d(activity)) {
            a(ea.a.p("QHU7cB9lD2UcdBRzAW8hIC10V20FbCpjLUZCbC1BZA==", "F7Aiasm6"));
            f.m().n(activity, dVar);
        } else if (g.m().d(activity)) {
            a(ea.a.p("PHVBcBVlWmU0dGpzHW8fIEVyC3YsZRJGBWwHQWQ=", "ytoipkv1"));
            g.m().n(activity, dVar);
        } else if (d.m().d(activity)) {
            a(ea.a.p("PHVBcBVlWmU0dGpzHW8fIFZvAHYgchFGOGw5QWQ=", "ubOoMU8I"));
            d.m().n(activity, dVar);
        }
    }
}
