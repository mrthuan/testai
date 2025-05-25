package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: ShareFileOpenAds.java */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static j f23960g;

    /* renamed from: a  reason: collision with root package name */
    public zd.e f23961a;

    /* renamed from: b  reason: collision with root package name */
    public a.d f23962b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public long f23963d;

    /* renamed from: e  reason: collision with root package name */
    public long f23964e;

    /* renamed from: f  reason: collision with root package name */
    public InterstitialAdState f23965f = InterstitialAdState.DEFAULT;

    public static void a(String str) {
        int i10 = zk.a.f32399a;
        t1.b(ea.a.p("AWgQcldGBGwtTxZlWkEzIA==", "uHrq2mpM") + str);
    }

    public static synchronized j c() {
        j jVar;
        synchronized (j.class) {
            if (f23960g == null) {
                f23960g = new j();
            }
            jVar = f23960g;
        }
        return jVar;
    }

    public static void i(boolean z10) {
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(ea.a.p("QHAnYQBoPWkcdFFyGnQ_dC1hXl8tZXk=", "TbzT0vz0"), z10, new yk.c());
        }
    }

    public final void b(Activity activity) {
        if (this.f23961a != null) {
            a(ea.a.p("V2U4dAFvGyATZA==", "r31iwo0n"));
            zd.e eVar = this.f23961a;
            be.c cVar = eVar.f32357e;
            if (cVar != null) {
                cVar.a(activity);
            }
            eVar.f32358f = null;
            eVar.f32359g = null;
            this.f23961a = null;
        }
        this.c = false;
    }

    public final boolean d(Activity context) {
        boolean z10;
        zd.e eVar = this.f23961a;
        if (eVar != null) {
            be.c cVar = eVar.f32357e;
            if (cVar != null) {
                z10 = cVar.k();
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f23964e != 0) {
                    c1 c1Var = c1.f28564a;
                    kotlin.jvm.internal.g.e(context, "context");
                    if (System.currentTimeMillis() - this.f23964e > de.e.d(context, null, ea.a.p("J3AIbjdhLV8teBZpRmUzX0xpP2U=", "UmHmhIgH"), 240) * 60 * 1000) {
                        a(ea.a.p("D2QXZQJwBHItZA==", "rdn7zmnp"));
                        b(context);
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.f23965f == InterstitialAdState.LOADING) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f23965f == InterstitialAdState.SHOWING) {
            return true;
        }
        return false;
    }

    public final synchronized void g(Activity activity, boolean z10) {
        if (BillingConfigImpl.c.w() && !z10) {
            String p10 = ea.a.p("PXI8bR91WiA9cwNyGCAka1FwcnMhYURlMmkdZR5wJ24MZHlsGWFk", "wOMYv781");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            i(false);
        } else if (h(activity)) {
        } else {
            ADRequestList aDRequestList = new ADRequestList(new h(this, activity));
            boolean z11 = wn.b.f31389e;
            if (z11) {
                a(ea.a.p("XWU8IAZzB3I=", "87gWWm0S"));
            } else {
                a(ea.a.p("WGweIBxzKXI=", "cx7ziLVu"));
            }
            aDRequestList.addAll(he.a.j(activity, z11));
            this.f23965f = InterstitialAdState.LOADING;
            this.f23961a = new zd.e();
            a(ea.a.p("X28qZFNhZA==", "F5FD5FQJ"));
            this.f23961a.e(activity, aDRequestList, true);
            this.f23963d = System.currentTimeMillis();
        }
    }

    public final boolean h(Activity activity) {
        if (this.c) {
            b(activity);
            return false;
        } else if (d(activity)) {
            a(ea.a.p("OWElIChkYCA7aw9wFGw4YWQ=", "27QVILMW"));
            i(true);
            return true;
        } else {
            if (this.f23963d != 0) {
                c1 c1Var = c1.f28564a;
                if (System.currentTimeMillis() - this.f23963d > de.e.d(activity, null, ea.a.p("LmRuchxxQmUpdBVlDXABclBkMXQsbWU=", "uUwv2bPu"), 30) * 60 * 1000) {
                    a(ea.a.p("LmQRchxxQmUpdGp0HG0Nb0B0", "h6mLwsFs"));
                    b(activity);
                    return false;
                }
            }
            if (this.f23961a == null) {
                return false;
            }
            a(ea.a.p("LmQRchxxQmUpdCNuEixIc15pHiApbwRk", "tLFXd1QI"));
            return true;
        }
    }
}
