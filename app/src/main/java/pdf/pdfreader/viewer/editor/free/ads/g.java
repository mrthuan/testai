package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import be.c;
import com.google.ads.ADRequestList;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: PreviewFullAds.java */
/* loaded from: classes3.dex */
public final class g extends pdf.pdfreader.viewer.editor.free.ads.a {

    /* renamed from: i  reason: collision with root package name */
    public static g f23953i;

    /* compiled from: PreviewFullAds.java */
    /* loaded from: classes3.dex */
    public class a implements ae.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23954a;

        public a(Activity activity) {
            this.f23954a = activity;
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            String p10 = ea.a.p("XG4KZDBsC2Nr", "4U5Wluf7");
            g gVar = g.this;
            gVar.a(p10);
            gVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar2 = gVar.f23921e;
            if (dVar2 != null) {
                dVar2.d();
            }
            AppOpenManager.c().f23907g = false;
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            g gVar = g.this;
            gVar.a(ea.a.p("XG4KZD9vA2Q0YV1sDGQg", "aBPgV3wF") + aVar);
            gVar.f23924h = InterstitialAdState.FAIL;
            a.d dVar = gVar.f23921e;
            if (dVar != null) {
                dVar.a0();
            }
            gVar.b(this.f23954a);
        }

        @Override // ae.b
        public final void e(yd.d dVar) {
            String p10 = ea.a.p("G252ZBlvOGQ=", "7Ct7UYWI");
            g gVar = g.this;
            gVar.a(p10);
            gVar.f23920d = System.currentTimeMillis();
            gVar.f23924h = InterstitialAdState.SUCCESS;
            a.d dVar2 = gVar.f23921e;
            if (dVar2 != null) {
                dVar2.J();
            }
        }

        @Override // ae.b
        public final void onAdClosed() {
            String p10 = ea.a.p("W242ZA1sVnMtZA==", "LB4wN9Zg");
            g gVar = g.this;
            gVar.a(p10);
            gVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar = gVar.f23921e;
            if (dVar != null) {
                dVar.close();
            }
            gVar.b(this.f23954a);
        }
    }

    /* compiled from: PreviewFullAds.java */
    /* loaded from: classes3.dex */
    public class b implements c.a {
        public b() {
        }

        @Override // be.c.a
        public final void a(boolean z10) {
            a.d dVar = g.this.f23921e;
            if (dVar != null) {
                dVar.w(z10);
            }
            if (z10) {
                wn.b.d();
            }
        }
    }

    public g() {
        this.f23922f = 2;
    }

    public static synchronized g m() {
        g gVar;
        synchronized (g.class) {
            if (f23953i == null) {
                f23953i = new g();
            }
            gVar = f23953i;
        }
        return gVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a
    public final ADRequestList c(Activity activity) {
        char c;
        ArrayList b10;
        ADRequestList aDRequestList = new ADRequestList(new a(activity));
        boolean z10 = wn.b.f31389e;
        if (z10) {
            a(ea.a.p("IWVGIAxzUnI=", "6FwrFNrs"));
        } else {
            a(ea.a.p("HWwsIB1zFXI=", "q2rHhpFz"));
        }
        String str = he.a.f18146a;
        String x4 = com.google.android.play.core.assetpacks.c.x(activity);
        int hashCode = x4.hashCode();
        if (hashCode != 2097) {
            if (hashCode != 2128) {
                if (hashCode != 2156) {
                    if (hashCode != 2341) {
                        if (hashCode != 2475) {
                            if (hashCode != 2549) {
                                if (hashCode != 2686) {
                                    if (hashCode == 2718 && x4.equals(ea.a.p("GlM=", "swedJbd3"))) {
                                        c = 3;
                                    }
                                    c = 65535;
                                } else {
                                    if (x4.equals(ea.a.p("Z1I=", "TSCEkODD"))) {
                                        c = 5;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (x4.equals(ea.a.p("Y0U=", "rr34q1v1"))) {
                                    c = 6;
                                }
                                c = 65535;
                            }
                        } else {
                            if (x4.equals(ea.a.p("Llg=", "BLcR9VUP"))) {
                                c = 2;
                            }
                            c = 65535;
                        }
                    } else {
                        if (x4.equals(ea.a.p("Bk4=", "TM1QYMMD"))) {
                            c = 0;
                        }
                        c = 65535;
                    }
                } else {
                    if (x4.equals(ea.a.p("cE8=", "TDfICrgS"))) {
                        c = 4;
                    }
                    c = 65535;
                }
            } else {
                if (x4.equals(ea.a.p("cVI=", "0aBPJHed"))) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (x4.equals(ea.a.p("AlI=", "fzCrqgbu"))) {
                c = 7;
            }
            c = 65535;
        }
        String str2 = he.a.f18184f1;
        String str3 = he.a.f18162c0;
        switch (c) {
            case 0:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18289v, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.e(he.a.r4), new ie.b(he.a.F2), new w4.c(str3, he.a.A0), new a2.a(str2, he.a.D1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18252p, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.e(he.a.f18159b4), new ie.b(he.a.f18319z2), new w4.c(str3, he.a.f18283u0), new a2.a(str2, he.a.f18305x1));
                    break;
                }
            case 1:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18296w, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.s4), new ie.e(he.a.t4), new ie.e(he.a.f18287u4), new ie.b(he.a.G2), new w4.c(str3, he.a.B0), new a2.a(str2, he.a.E1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18259q, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18166c4), new ie.e(he.a.f18173d4), new ie.e(he.a.f18180e4), new ie.b(he.a.A2), new w4.c(str3, he.a.f18290v0), new a2.a(str2, he.a.f18311y1));
                    break;
                }
            case 2:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18303x, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18294v4), new ie.e(he.a.f18301w4), new ie.e(he.a.x4), new ie.b(he.a.H2), new w4.c(str3, he.a.C0), new a2.a(str2, he.a.F1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18264r, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18187f4), new ie.e(he.a.f18194g4), new ie.e(he.a.f18201h4), new ie.b(he.a.B2), new w4.c(str3, he.a.f18297w0), new a2.a(str2, he.a.f18318z1));
                    break;
                }
            case 3:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18309y, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18314y4), new ie.e(he.a.f18321z4), new ie.e(he.a.A4), new ie.b(he.a.I2), new w4.c(str3, he.a.D0), new a2.a(str2, he.a.G1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18270s, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18208i4), new ie.e(he.a.f18215j4), new ie.e(he.a.f18222k4), new ie.b(he.a.C2), new w4.c(str3, he.a.f18304x0), new a2.a(str2, he.a.A1));
                    break;
                }
            case 4:
            case 5:
            case 6:
            case 7:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18316z, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.B4), new ie.e(he.a.C4), new ie.e(he.a.D4), new ie.b(he.a.J2), new w4.c(str3, he.a.E0), new a2.a(str2, he.a.H1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18276t, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18229l4), new ie.e(he.a.f18236m4), new ie.e(he.a.f18243n4), new ie.b(he.a.D2), new w4.c(str3, he.a.f18310y0), new a2.a(str2, he.a.B1));
                    break;
                }
            default:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.f18282u, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18250o4), new ie.e(he.a.f18257p4), new ie.e(he.a.f18263q4), new ie.b(he.a.E2), new w4.c(str3, he.a.f18317z0), new a2.a(str2, he.a.C1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.f18245o, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.Y3), new ie.e(he.a.Z3), new ie.e(he.a.f18151a4), new ie.b(he.a.f18312y2), new w4.c(str3, he.a.f18277t0), new a2.a(str2, he.a.f18298w1));
                    break;
                }
        }
        aDRequestList.addAll(b10);
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
            a(ea.a.p("QHU7cB9lD2UcdBRzAW8hICN1W2QjRjZsGEFk", "tb07RE7v"));
            e.m().n(activity, dVar);
        } else if (f.m().d(activity)) {
            a(ea.a.p("QHU7cB9lD2UcdBRzAW8hIC10V20FbCpjPUYjbFVBZA==", "VV9ayGnN"));
            f.m().n(activity, dVar);
        } else if (d.m().d(activity)) {
            a(ea.a.p("PHVBcBVlWmU0dGpzHW8fIFZvAHYgchFGOWwLQWQ=", "ANDELg3h"));
            d.m().n(activity, dVar);
        }
    }
}
