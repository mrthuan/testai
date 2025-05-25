package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import be.c;
import com.google.ads.ADRequestList;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.a;

/* compiled from: ItemClickFullAds.java */
/* loaded from: classes3.dex */
public final class f extends pdf.pdfreader.viewer.editor.free.ads.a {

    /* renamed from: i  reason: collision with root package name */
    public static f f23949i;

    /* compiled from: ItemClickFullAds.java */
    /* loaded from: classes3.dex */
    public class a implements ae.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23950a;

        public a(Activity activity) {
            this.f23950a = activity;
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            String p10 = ea.a.p("DW4mZDJsIGNr", "jPbgqIAH");
            f fVar = f.this;
            fVar.a(p10);
            fVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar2 = fVar.f23921e;
            if (dVar2 != null) {
                dVar2.d();
            }
            AppOpenManager.c().f23907g = false;
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            f fVar = f.this;
            fVar.a(ea.a.p("XG4KZD9vA2Q0YV1sDGQg", "eOAN0Of0") + aVar);
            fVar.f23924h = InterstitialAdState.FAIL;
            a.d dVar = fVar.f23921e;
            if (dVar != null) {
                dVar.a0();
            }
            fVar.b(this.f23950a);
        }

        @Override // ae.b
        public final void e(yd.d dVar) {
            long currentTimeMillis = System.currentTimeMillis();
            f fVar = f.this;
            fVar.f23920d = currentTimeMillis;
            fVar.f23924h = InterstitialAdState.SUCCESS;
            a.d dVar2 = fVar.f23921e;
            if (dVar2 != null) {
                dVar2.J();
            }
            fVar.a(ea.a.p("Cm4RZBhvKWQ=", "CvePTHBG"));
        }

        @Override // ae.b
        public final void onAdClosed() {
            String p10 = ea.a.p("XG4KZDBsDXMXZA==", "AkH5GvuX");
            f fVar = f.this;
            fVar.a(p10);
            fVar.f23924h = InterstitialAdState.CLOSE;
            a.d dVar = fVar.f23921e;
            if (dVar != null) {
                dVar.close();
            }
            fVar.b(this.f23950a);
        }
    }

    /* compiled from: ItemClickFullAds.java */
    /* loaded from: classes3.dex */
    public class b implements c.a {
        public b() {
        }

        @Override // be.c.a
        public final void a(boolean z10) {
            a.d dVar = f.this.f23921e;
            if (dVar != null) {
                dVar.w(z10);
            }
            if (z10) {
                wn.b.d();
            }
        }
    }

    public f() {
        this.f23922f = 1;
    }

    public static synchronized f m() {
        f fVar;
        synchronized (f.class) {
            if (f23949i == null) {
                f23949i = new f();
            }
            fVar = f23949i;
        }
        return fVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a
    public final ADRequestList c(Activity activity) {
        char c;
        ArrayList b10;
        ADRequestList aDRequestList = new ADRequestList(new a(activity));
        boolean z10 = wn.b.f31389e;
        if (z10) {
            a(ea.a.p("IWVGIAxzUnI=", "JyereMTj"));
        } else {
            a(ea.a.p("C2xTIDlzVnI=", "UGd7L3so"));
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
                                    if (hashCode == 2718 && x4.equals(ea.a.p("GlM=", "blQekIBr"))) {
                                        c = 3;
                                    }
                                    c = 65535;
                                } else {
                                    if (x4.equals(ea.a.p("G1I=", "v4ZiUkVn"))) {
                                        c = 5;
                                    }
                                    c = 65535;
                                }
                            } else {
                                if (x4.equals(ea.a.p("BEU=", "XZTD37eX"))) {
                                    c = 6;
                                }
                                c = 65535;
                            }
                        } else {
                            if (x4.equals(ea.a.p("Alg=", "ogf3p3zW"))) {
                                c = 2;
                            }
                            c = 65535;
                        }
                    } else {
                        if (x4.equals(ea.a.p("Bk4=", "YLmYALxu"))) {
                            c = 0;
                        }
                        c = 65535;
                    }
                } else {
                    if (x4.equals(ea.a.p("ek8=", "Z19sQ86g"))) {
                        c = 4;
                    }
                    c = 65535;
                }
            } else {
                if (x4.equals(ea.a.p("DVI=", "6kNdv6AZ"))) {
                    c = 1;
                }
                c = 65535;
            }
        } else {
            if (x4.equals(ea.a.p("F1I=", "iHV1MsuH"))) {
                c = 7;
            }
            c = 65535;
        }
        String str2 = he.a.f18184f1;
        String str3 = he.a.f18162c0;
        switch (c) {
            case 0:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.H, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.e(he.a.X4), new ie.b(he.a.R2), new w4.c(str3, he.a.M0), new a2.a(str2, he.a.P1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.B, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.e(he.a.H4), new ie.b(he.a.L2), new w4.c(str3, he.a.G0), new a2.a(str2, he.a.J1));
                    break;
                }
            case 1:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.I, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.Y4), new ie.e(he.a.Z4), new ie.e(he.a.f18152a5), new ie.b(he.a.S2), new w4.c(str3, he.a.N0), new a2.a(str2, he.a.Q1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.C, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.I4), new ie.e(he.a.J4), new ie.e(he.a.K4), new ie.b(he.a.M2), new w4.c(str3, he.a.H0), new a2.a(str2, he.a.K1));
                    break;
                }
            case 2:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.J, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18160b5), new ie.e(he.a.f18167c5), new ie.e(he.a.f18174d5), new ie.b(he.a.T2), new w4.c(str3, he.a.O0), new a2.a(str2, he.a.R1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.D, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.L4), new ie.e(he.a.M4), new ie.e(he.a.N4), new ie.b(he.a.N2), new w4.c(str3, he.a.I0), new a2.a(str2, he.a.L1));
                    break;
                }
            case 3:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.K, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18181e5), new ie.e(he.a.f18188f5), new ie.e(he.a.f18195g5), new ie.b(he.a.U2), new w4.c(str3, he.a.P0), new a2.a(str2, he.a.S1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.E, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.O4), new ie.e(he.a.P4), new ie.e(he.a.Q4), new ie.b(he.a.O2), new w4.c(str3, he.a.J0), new a2.a(str2, he.a.M1));
                    break;
                }
            case 4:
            case 5:
            case 6:
            case 7:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.L, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.f18202h5), new ie.e(he.a.f18209i5), new ie.e(he.a.f18216j5), new ie.b(he.a.V2), new w4.c(str3, he.a.Q0), new a2.a(str2, he.a.T1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.F, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.R4), new ie.e(he.a.S4), new ie.e(he.a.T4), new ie.b(he.a.P2), new w4.c(str3, he.a.K0), new a2.a(str2, he.a.N1));
                    break;
                }
            default:
                if (z10) {
                    b10 = he.a.b(activity, new yd.a(he.a.G, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.U4), new ie.e(he.a.V4), new ie.e(he.a.W4), new ie.b(he.a.Q2), new w4.c(str3, he.a.L0), new a2.a(str2, he.a.O1));
                    break;
                } else {
                    b10 = he.a.b(activity, new yd.a(he.a.A, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.E4), new ie.e(he.a.F4), new ie.e(he.a.G4), new ie.b(he.a.K2), new w4.c(str3, he.a.F0), new a2.a(str2, he.a.I1));
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
        }
        if (e.m().d(activity)) {
            a(ea.a.p("AXUBcB5lD2UmdEZzXG8gIF91O2QsRkNsGEFk", "sjrqrbFJ"));
            e.m().n(activity, dVar);
        } else if (g.m().d(activity)) {
            a(ea.a.p("QHU7cB9lD2UcdBRzAW8hIDRyV3YvZTRGPmwvQWQ=", "KCHQMf03"));
            g.m().n(activity, dVar);
        } else if (d.m().d(activity)) {
            a(ea.a.p("QHU7cB9lD2UcdBRzAW8hICdvXHYjcjdGFGxfQWQ=", "a3pkRqu8"));
            d.m().n(activity, dVar);
        }
    }
}
