package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.fnbridge.impl.NativeItemClickApiImpl;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: FullScreenManage.kt */
/* loaded from: classes3.dex */
public final class FullScreenManage {

    /* renamed from: a  reason: collision with root package name */
    public static final tf.c f23914a = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.utils.c>() { // from class: pdf.pdfreader.viewer.editor.free.ads.FullScreenManage$mConfig$2
        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.utils.c invoke() {
            return pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final tf.c f23915b = kotlin.a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.ads.FullScreenManage$mApplicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });
    public static final tf.c c = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ads.FullScreenManage$mHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: d  reason: collision with root package name */
    public static int f23916d;

    public static void a(String msg) {
        kotlin.jvm.internal.g.e(msg, "msg");
        int i10 = zk.a.f32399a;
        t1.b(msg);
    }

    public static String b(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        return ea.a.p("Om56bhZ3F3QjcGU=", "T3o1zxeK");
                    }
                    return ea.a.p("KHU8ZAZGG2wkQWQ=", "rqOUcnkm");
                }
                return ea.a.p("LG9fdhxyQ0YvbCZBZA==", "RbgfzlUK");
            }
            return ea.a.p("Q3IudhplFUYHbFhBZA==", "mDHepf5k");
        }
        return ea.a.p("WnQubTBsC2MZRkFsBUFk", "FfBgMh5W");
    }

    public static boolean c(int i10, Activity activity, boolean z10) {
        kotlin.jvm.internal.g.e(activity, "activity");
        if (!e(i10)) {
            return false;
        }
        String b10 = b(i10);
        if (f.m().d(activity)) {
            if (z10) {
                if (kotlin.jvm.internal.g.a(b10, ea.a.p("UXQnbQZsXmMjRhNsWEFk", "z68BE7Jr"))) {
                    a(ea.a.p("AXQPbXRsJWMjRhNsWEEzIFBhISAoZBogB2sYcHFsLWFk", "nZhj7Lzb"));
                } else {
                    a("reuse itemClickFullAd, skip " + b10 + " load");
                }
            }
            return true;
        } else if (g.m().d(activity)) {
            if (z10) {
                if (kotlin.jvm.internal.g.a(b10, ea.a.p("P3JUdhBlQEYvbCZBZA==", "QFeRfCRm"))) {
                    a(ea.a.p("Q3IudhplFUYHbFhBDSA-YTcgU2RqIDBrM3AUbDdhZA==", "Z4X0qD0a"));
                } else {
                    a("reuse previewFullAd, skip " + b10 + " load");
                }
            }
            return true;
        } else if (d.m().d(activity)) {
            if (z10) {
                if (kotlin.jvm.internal.g.a(b10, ea.a.p("Bm8FdhNyTUY9bApBZA==", "DKekv9yO"))) {
                    a(ea.a.p("LG9fdhxyQ0YvbCZBESAAYUYgD2RpIBZrL3BPbAlhZA==", "wWyVFofJ"));
                } else {
                    a("reuse convertFullAd, skip " + b10 + " load");
                }
            }
            return true;
        } else if (!e.m().d(activity)) {
            return false;
        } else {
            if (z10) {
                if (kotlin.jvm.internal.g.a(b10, ea.a.p("KHVYZBxGQmw2QWQ=", "kktMXR4N"))) {
                    a(ea.a.p("KHVYZBxGQmw2QS4gHWEbIFRkQiA2awxwEWw1YWQ=", "8bNf1ZfK"));
                } else {
                    a("reuse guideFullAd, skip " + b10 + " load");
                }
            }
            return true;
        }
    }

    public static boolean d(Activity activity, a.d dVar, int i10, boolean z10) {
        boolean z11;
        long currentTimeMillis;
        kotlin.jvm.internal.g.e(activity, "activity");
        if (BillingConfigImpl.c.w()) {
            a("premium user, skip " + b(i10) + " load");
            return false;
        } else if (!e(i10)) {
            return false;
        } else {
            String b10 = b(i10);
            if (f.m().e()) {
                if (f.m().f(activity)) {
                    a(ea.a.p("JnRUbTpsXmMxRj9sGUEMIFRkTnIgcRBlPnROdD5tAG86dA==", "QUgFMnWe"));
                    f.m().b(activity);
                    f m10 = f.m();
                    m10.getClass();
                    m10.f23924h = InterstitialAdState.DEFAULT;
                    z11 = false;
                } else {
                    if (kotlin.jvm.internal.g.a(b10, ea.a.p("JnRUbTpsXmMxRj9sGUFk", "eUweUGsp"))) {
                        a(ea.a.p("WnQubTBsC2MZRkFsBUEyICVkEnIjcTZlRXRdbjUsS3NYaTsgH28DZA==", "64Rk2J0u"));
                    } else {
                        a("itemClickFullAd ad requesting, skip " + b10 + " load");
                    }
                    z11 = true;
                }
            } else if (g.m().e()) {
                if (g.m().f(activity)) {
                    a(ea.a.p("P3JUdhBlQEYvbCZBESAJZBVyC3EwZRZ0EnQEbQxvOnQ=", "z4jt2miO"));
                    g.m().b(activity);
                    g m11 = g.m();
                    m11.getClass();
                    m11.f23924h = InterstitialAdState.DEFAULT;
                    z11 = false;
                } else {
                    if (kotlin.jvm.internal.g.a(b10, ea.a.p("Q3IudhplFUYHbFhBZA==", "oSW2jU86"))) {
                        a(ea.a.p("Q3IudhplFUYHbFhBDSA3ZGRyV3EzZTB0XW4KLGFzXmlDICdvEmQ=", "4mA5OfBY"));
                    } else {
                        a("previewFullAd ad requesting, skip " + b10 + " load");
                    }
                    z11 = true;
                }
            } else if (d.m().e()) {
                if (d.m().f(activity)) {
                    a(ea.a.p("Im8ddlFyGkY9bApBUCA2ZBhyN3E8ZUV0VHQYbTRvN3Q=", "byAs4nHw"));
                    d.m().b(activity);
                    d m12 = d.m();
                    m12.getClass();
                    m12.f23924h = InterstitialAdState.DEFAULT;
                    z11 = false;
                } else {
                    if (kotlin.jvm.internal.g.a(b10, ea.a.p("UG8ldhZyFkYHbFhBZA==", "yu2Qp5nw"))) {
                        a(ea.a.p("LG9fdhxyQ0YvbCZBESAJZBVyC3EwZRZ0K24FLGlzIGk_IF1vGGQ=", "XzVpBbIK"));
                    } else {
                        a("convertFullAd ad requesting, skip " + b10 + " load");
                    }
                    z11 = true;
                }
            } else {
                if (e.m().e()) {
                    if (e.m().f(activity)) {
                        a(ea.a.p("KHVYZBxGQmw2QS4gFGRIclBxG2U2dEV0Wm1UbyB0", "pY3u31UE"));
                        e.m().b(activity);
                        e m13 = e.m();
                        m13.getClass();
                        m13.f23924h = InterstitialAdState.DEFAULT;
                    } else {
                        if (kotlin.jvm.internal.g.a(b10, ea.a.p("KHVYZBxGQmw2QWQ=", "l4QXDxIT"))) {
                            a(ea.a.p("VXVQZC5GFmwkQQIgVWR3cl1xJ2U6dF9uEyxRczppMiBeb1hk", "TW29KcUT"));
                        } else {
                            a("guideFullAd ad requesting, skip " + b10 + " load");
                        }
                        z11 = true;
                    }
                }
                z11 = false;
            }
            if (z11) {
                return false;
            }
            if ((i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) && c(i10, activity, true)) {
                return false;
            }
            Context context = (Context) f23915b.getValue();
            kotlin.jvm.internal.g.d(context, ea.a.p("XkE7cB9pAWEGaVtuKm84dCF4dA==", "HfMCCxS0"));
            long w7 = c1.w(context);
            if (i10 == 5) {
                currentTimeMillis = 0;
            } else {
                tf.c cVar = f23914a;
                pdf.pdfreader.viewer.editor.free.utils.c cVar2 = (pdf.pdfreader.viewer.editor.free.utils.c) cVar.getValue();
                long c10 = pdf.pdfreader.viewer.editor.free.utils.c.c();
                pdf.pdfreader.viewer.editor.free.utils.c cVar3 = (pdf.pdfreader.viewer.editor.free.utils.c) cVar.getValue();
                currentTimeMillis = w7 - (System.currentTimeMillis() - Math.max(c10, pdf.pdfreader.viewer.editor.free.utils.c.f28559b.getLong(ea.a.p("I2FCdCZzR2w7cyJfBmgHd2pmG2wpXwRkCHQObWU=", "1XL2WgnU"), 0L)));
            }
            if (currentTimeMillis <= 0) {
                f(i10, activity, dVar);
                return true;
            } else if (z10) {
                a(b(i10) + " delay load " + (((float) currentTimeMillis) / 1000.0f) + "s");
                f23916d = i10;
                tf.c cVar4 = c;
                ((Handler) cVar4.getValue()).removeCallbacksAndMessages(null);
                ((Handler) cVar4.getValue()).postDelayed(new yk.d(i10, activity, dVar), currentTimeMillis);
                return false;
            } else {
                a(b(i10) + " must wait " + (((float) currentTimeMillis) / 1000.0f) + "s");
                return false;
            }
        }
    }

    public static boolean e(int i10) {
        String str;
        String str2;
        tf.c cVar = f23915b;
        boolean z10 = true;
        boolean z11 = false;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        a("nc config, " + b(i10) + " skip ad load");
                        return false;
                    }
                    Context context = (Context) cVar.getValue();
                    kotlin.jvm.internal.g.d(context, ea.a.p("IkFBcBVpVGEuaSVuNm8GdFB4dA==", "Fx4cUNRZ"));
                    boolean j10 = c1.j(context);
                    if (!j10) {
                        a(b(i10).concat(" skip ad load"));
                    }
                    return j10;
                }
                kotlin.jvm.internal.g.d((Context) cVar.getValue(), ea.a.p("VEEocCFpImE8aQlud285dF14dA==", "jd9XMAfN"));
                c1 c1Var = c1.f28564a;
                String p10 = ea.a.p("SmVz", "6ihawGo3");
                String h10 = de.e.h(c1.f28573f, "");
                if (android.support.v4.media.session.h.b("LG9fZhBn", "MYxcOhV3", h10) != 0) {
                    z10 = false;
                }
                if (z10) {
                    ea.a.p("LG9fdhxyQyAzbj5lB3McaUFpD2xlZABmUnUmdHBjBm4paVYgEHMXYzZvOWU=", "y2R43JPi");
                } else {
                    z11 = TextUtils.equals(h10, p10);
                    if (z11) {
                        str = "IHBUbg==";
                        str2 = "rTwDdALU";
                    } else {
                        str = "LGxec2U=";
                        str2 = "DUAXbjNv";
                    }
                    ea.a.p(str, str2);
                }
                if (!z11) {
                    a(b(i10).concat(" skip ad load"));
                }
                return z11;
            }
            kotlin.jvm.internal.g.d((Context) cVar.getValue(), ea.a.p("GUE0cD1pBmE8aQlud285dF14dA==", "2WtDQeE7"));
            c1 c1Var2 = c1.f28564a;
            String p11 = ea.a.p("SmVz", "nqhSSWpr");
            String h11 = de.e.h(c1.f28571e, p11);
            if (android.support.v4.media.session.h.b("UG8lZhpn", "RUPT2Cca", h11) != 0) {
                z10 = false;
            }
            if (z10) {
                h11 = p11;
            }
            boolean equals = TextUtils.equals(p11, h11);
            if (!equals) {
                a(b(i10).concat(" skip ad load"));
            }
            return equals;
        }
        kotlin.jvm.internal.g.d((Context) cVar.getValue(), ea.a.p("IkFBcBVpVGEuaSVuNm8GdFB4dA==", "upXvG1sp"));
        c1 c1Var3 = c1.f28564a;
        String p12 = ea.a.p("KGVz", "KvQghFP9");
        String h12 = de.e.h(c1.f28569d, p12);
        if (android.support.v4.media.session.h.b("UG8lZhpn", "V75Ik1VK", h12) != 0) {
            z10 = false;
        }
        if (z10) {
            h12 = p12;
        }
        boolean equals2 = TextUtils.equals(p12, h12);
        if (!equals2) {
            a(b(i10).concat(" skip ad load"));
        }
        return equals2;
    }

    public static void f(int i10, Activity activity, a.d dVar) {
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.w()) {
            String b10 = b(i10);
            a("premium user, skip " + b10 + " load");
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 == 5) {
                        e m10 = e.m();
                        m10.getClass();
                        if (billingConfigImpl.w()) {
                            String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmczaSdlCXUkbDlkc2xcYWQ=", "OHxSpMzG");
                            int i11 = zk.a.f32399a;
                            t1.b(p10);
                            return;
                        }
                        m10.f23921e = dVar;
                        m10.h(activity);
                        return;
                    }
                    return;
                }
                d m11 = d.m();
                m11.getClass();
                if (billingConfigImpl.w()) {
                    String p11 = ea.a.p("Q3IAbV51HCA9cwNyGCAka1FwcmMmbkBlBnQ3dT1sA2QTbAphZA==", "7g3e7q7b");
                    int i12 = zk.a.f32399a;
                    t1.b(p11);
                    return;
                }
                m11.f23921e = dVar;
                m11.h(activity);
                return;
            }
            pdf.pdfreader.viewer.editor.free.fnbridge.b bVar = ea.a.f16524i;
            if (bVar != null) {
                bVar.k();
                return;
            }
            return;
        }
        NativeItemClickApiImpl.f25884a.k();
    }

    public static void g(int i10) {
        if (i10 == f23916d) {
            String b10 = b(i10);
            a("onPageClose " + b10 + " delay load cancel");
            ((Handler) c.getValue()).removeCallbacksAndMessages(null);
            f23916d = 0;
        }
    }

    public static void h(Context context, String str, boolean z10) {
        kotlin.jvm.internal.g.e(context, "context");
        if (z10) {
            tn.a.b(context, ea.a.p("QnAkYUJo", "Cr1H1EeI"), ea.a.p("QHAnYQBoPW8CZVphDXMJcyxvdw==", "iCt5HkIv"));
        } else {
            tn.a.d(context, ea.a.p("LmRuZgxsbA==", "pLrhoDeJ"), ea.a.p("UmQUZgZsDl8BaFt3", "TQtiD5OO"), str, false);
        }
    }
}
