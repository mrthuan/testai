package pdf.pdfreader.viewer.editor.free.utils.event;

import a6.h;
import android.content.Context;
import androidx.activity.r;
import java.util.HashSet;
import kotlin.a;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import tf.c;

/* compiled from: OCREventCenter.kt */
/* loaded from: classes3.dex */
public final class OCREventCenter {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28670a = a.a(new cg.a<Context>() { // from class: pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter$applicationContext$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Context invoke() {
            return ReaderPdfApplication.m();
        }
    });

    /* renamed from: b  reason: collision with root package name */
    public static final HashSet<String> f28671b = new HashSet<>();
    public static final HashSet<String> c = new HashSet<>();

    public static Context a() {
        return (Context) f28670a.getValue();
    }

    public static void b(Context context, String str, String str2) {
        tn.a.d(context, str, str2, "", false);
    }

    public static void c(int i10, String str) {
        boolean z10;
        boolean z11;
        String p10;
        Context a10 = a();
        String p11 = ea.a.p("PGVdZRp0aGk3YS1l", "GdQPjg1M");
        String p12 = ea.a.p("Jm1Bbwt0aGM2aSlr", "FkYWBAss");
        boolean z12 = true;
        if (i10 == 1) {
            p10 = ea.a.p("bDE=", "V0IhqZSj");
        } else {
            if (2 <= i10 && i10 < 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p10 = ea.a.p("OTI=", "KqfbzXLV");
            } else {
                if (6 <= i10 && i10 < 11) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    p10 = ea.a.p("aDM=", "cB7Qpzfk");
                } else {
                    if (11 > i10 || i10 >= 16) {
                        z12 = false;
                    }
                    if (z12) {
                        p10 = ea.a.p("EDQ=", "TETMkMyA");
                    } else {
                        p10 = ea.a.p("EDU=", "rclOLgs8");
                    }
                }
            }
        }
        tn.a.d(a10, p11, p12, h.d("ocr_", str, p10), false);
    }

    public static void d(String str) {
        Context a10 = a();
        tn.a.d(a10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "anFO2HZc", a10, "IGNy", "wjJezNuv"), ea.a.p("KnJDbwtfWGs=", "xVNMDKjO"), str, false);
    }

    public static void e(String str) {
        Context a10 = a();
        tn.a.d(a10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "UswQmg8z", a10, "LGNy", "QtC37ssr"), ea.a.p("KnJDbwtfRGg1dw==", "UkrrlPlz"), str, false);
    }

    public static void f() {
        Context a10 = a();
        b(a10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "slsVCiOx", a10, "XGNy", "iz3qjHxU"), ea.a.p("XGM5XxVhC2wXZA==", "SzXWN8Ig"));
    }

    public static void g() {
        Context a10 = a();
        b(a10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "gsjO4A61", a10, "VmNy", "TX9M8RgL"), ea.a.p("XGM5Xx9vA2QbblNfCmw_Y2s=", "T0sDGunG"));
    }

    public static void h(long j10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String p10;
        boolean z13 = true;
        if (0 <= j10 && j10 < 5001) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            p10 = ea.a.p("QQ==", "ypE85pCO");
        } else {
            if (5001 <= j10 && j10 < 10001) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                p10 = ea.a.p("Qg==", "gAD40HJk");
            } else {
                if (10001 <= j10 && j10 < 15001) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    p10 = ea.a.p("Qw==", "DlX7Fmmb");
                } else {
                    if (15001 > j10 || j10 >= 20001) {
                        z13 = false;
                    }
                    if (z13) {
                        p10 = ea.a.p("RA==", "j13Tmp3P");
                    } else {
                        p10 = ea.a.p("RQ==", "ft9oYpe8");
                    }
                }
            }
        }
        Context a10 = a();
        tn.a.d(a10, a0.a.i("LXAibChjEHQhbwhDW24jZUB0", "4cLRAqbh", a10, "XGNy", "88ryjkS8"), ea.a.p("XGM5Xx9vA2QbblNfDXUkYTBpXW4=", "uS5sbz4N"), p10, false);
    }

    public static void i(String str) {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("XGM5chZzF2wGX1BvB2UJYyhpUWs=", "a8HvuQrt"))) {
            return;
        }
        Context c10 = r.c("XGM5chZzF2wGX1BvB2UJYyhpUWs=", "OqAOCday", hashSet);
        tn.a.d(c10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "wtXJRZBY", c10, "XGNy", "2JNY7SKf"), ea.a.p("XGM5chZzF2wGX1BvB2UJYyhpUWs=", "eDYSkmGk"), str, false);
    }

    public static void j() {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("XGM5chZzF2wGX1FkHV8ybypl", "IPFQO04H"))) {
            return;
        }
        Context c10 = r.c("XGM5chZzF2wGX1FkHV8ybypl", "fZ5u6hit", hashSet);
        b(c10, a0.a.i("FnAxbDFjNnQhbwhDW24jZUB0", "V9wAXWDB", c10, "XGNy", "6acyFao4"), ea.a.p("XGM5chZzF2wGX1FkHV8ybypl", "rSv3nFMg"));
    }

    public static void k(String str) {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("XGM5chZzF2wGX0ZlHXIvXydsW2Nr", "gvSPBdEN"))) {
            return;
        }
        Context c10 = r.c("XGM5chZzF2wGX0ZlHXIvXydsW2Nr", "3P90C3IM", hashSet);
        tn.a.d(c10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "mafR05hW", c10, "IGNy", "NOrCeurb"), ea.a.p("XGM5chZzF2wGX0ZlHXIvXydsW2Nr", "ipAsaKKa"), str, false);
    }

    public static void l(String str) {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("FmMzcjNzHGw8XxRlQHIuX0toPXc=", "4qyAViXg"))) {
            return;
        }
        Context c10 = r.c("IGNDchxzQmwuXzhlAXIRX0ZoAXc=", "6kev6Vd2", hashSet);
        tn.a.d(c10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "9jz30Ke5", c10, "XGNy", "tmtLch0e"), ea.a.p("IGNDchxzQmwuXzhlAXIRX0ZoAXc=", "Gd2KY8AY"), str, false);
    }

    public static void m(String str) {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("IGNDchxzQmwuXzloFHINX1ZsB2Nr", "wxNNQ4Wx"))) {
            return;
        }
        Context c10 = r.c("XGM5chZzF2wGX0doCHIzXydsW2Nr", "xoASyNmh", hashSet);
        tn.a.d(c10, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "pFsULXes", c10, "HmNy", "6lq2kznJ"), ea.a.p("XGM5chZzF2wGX0doCHIzXydsW2Nr", "C5YOPwEF"), str, false);
    }

    public static void n(String value) {
        g.e(value, "value");
        Context a10 = a();
        tn.a.d(a10, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "5AQLiMR3", a10, "WGNy", "LN7ivhsX"), ea.a.p("IGNDchxzQmwuXzloGnc=", "4thbfOGL"), value, false);
    }

    public static void o(String str) {
        HashSet<String> hashSet = c;
        if (hashSet.contains(ea.a.p("J2NEcgNzImw8XxxvW20IY1RpMWs=", "UvH6fWkZ"))) {
            return;
        }
        Context c10 = r.c("IGNDchxzQmwuXzBvGm03Y1lpDWs=", "VsAAtrgi", hashSet);
        tn.a.d(c10, a0.a.i("IHAxbFtjO3QhbwhDW24jZUB0", "fJAA2Zuq", c10, "IGNy", "hpQMJRCX"), ea.a.p("IGNDchxzQmwuXzBvGm03Y1lpDWs=", "dl1KWAUY"), str, false);
    }
}
