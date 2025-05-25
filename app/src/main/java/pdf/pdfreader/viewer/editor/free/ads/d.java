package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import be.c;
import com.google.ads.ADRequestList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: ConvertFullAds.java */
/* loaded from: classes3.dex */
public final class d extends pdf.pdfreader.viewer.editor.free.ads.a {

    /* renamed from: i  reason: collision with root package name */
    public static d f23941i;

    /* compiled from: ConvertFullAds.java */
    /* loaded from: classes3.dex */
    public class a implements ae.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23942a;

        public a(Activity activity) {
            this.f23942a = activity;
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            String p10 = ea.a.p("JG4HZCRsOWNr", "8oKFgP98");
            d dVar2 = d.this;
            dVar2.a(p10);
            dVar2.f23924h = InterstitialAdState.CLOSE;
            a.d dVar3 = dVar2.f23921e;
            if (dVar3 != null) {
                dVar3.d();
            }
            AppOpenManager.c().f23907g = false;
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            d dVar = d.this;
            dVar.a(ea.a.p("XG4KZD9vA2Q0YV1sDGQg", "dAC0yWSx") + aVar);
            dVar.f23924h = InterstitialAdState.FAIL;
            a.d dVar2 = dVar.f23921e;
            if (dVar2 != null) {
                dVar2.a0();
            }
            dVar.b(this.f23942a);
        }

        @Override // ae.b
        public final void e(yd.d dVar) {
            String p10 = ea.a.p("LW52ZCZvDGQ=", "NoB7jmAV");
            d dVar2 = d.this;
            dVar2.a(p10);
            dVar2.f23920d = System.currentTimeMillis();
            dVar2.f23924h = InterstitialAdState.SUCCESS;
            a.d dVar3 = dVar2.f23921e;
            if (dVar3 != null) {
                dVar3.J();
            }
        }

        @Override // ae.b
        public final void onAdClosed() {
            String p10 = ea.a.p("IG5wZDpsWHM_ZA==", "4PECKFp4");
            d dVar = d.this;
            dVar.a(p10);
            dVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar2 = dVar.f23921e;
            if (dVar2 != null) {
                dVar2.close();
            }
            dVar.b(this.f23942a);
        }
    }

    /* compiled from: ConvertFullAds.java */
    /* loaded from: classes3.dex */
    public class b implements c.a {
        public b() {
        }

        @Override // be.c.a
        public final void a(boolean z10) {
            a.d dVar = d.this.f23921e;
            if (dVar != null) {
                dVar.w(z10);
            }
            if (z10) {
                wn.b.d();
            }
        }
    }

    public d() {
        this.f23922f = 3;
    }

    public static synchronized d m() {
        d dVar;
        synchronized (d.class) {
            if (f23941i == null) {
                f23941i = new d();
            }
            dVar = f23941i;
        }
        return dVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a
    public final ADRequestList c(Activity activity) {
        ADRequestList aDRequestList = new ADRequestList(new a(activity));
        aDRequestList.addAll(he.a.b(activity, new yd.a(he.a.f18147a0, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.W5), new ie.e(he.a.X5), new ie.e(he.a.Y5), new ie.b(he.a.f18207i3), new w4.c(he.a.f18162c0, he.a.f18170d1), new a2.a(he.a.f18184f1, he.a.f18192g2)));
        return aDRequestList;
    }

    public final void n(Activity activity, a.d dVar) {
        this.f23921e = dVar;
        if (activity == null) {
            return;
        }
        if (d(activity)) {
            j(activity, new b());
        } else if (e.m().d(activity)) {
            a(ea.a.p("B3U-cF1lHGUmdEZzXG8gIF91O2QsRkNsGEFk", "lutN1qmt"));
            e.m().n(activity, dVar);
        } else if (f.m().d(activity)) {
            a(ea.a.p("CnUlcCRlNGUmdEZzXG8gIFF0N20KbF9jH0YEbD1BZA==", "vLyUHYXU"));
            f.m().n(activity, dVar);
        } else if (g.m().d(activity)) {
            a(ea.a.p("PHVBcBVlWmU0dGpzHW8fIEVyC3YsZRJGAGwDQWQ=", "4tcwuoXD"));
            g.m().n(activity, dVar);
        }
    }
}
