package fp;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.InterstitialAdState;
import pdf.pdfreader.viewer.editor.free.ads.j;
import pdf.pdfreader.viewer.editor.free.ads.l;
import wn.b;

/* compiled from: SplashEventUtils.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17318a;

    /* renamed from: b  reason: collision with root package name */
    public static long f17319b;
    public static long c;

    /* renamed from: d  reason: collision with root package name */
    public static long f17320d;

    /* renamed from: e  reason: collision with root package name */
    public static long f17321e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f17322f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f17323g;

    /* compiled from: SplashEventUtils.kt */
    /* renamed from: fp.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0223a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17324a;

        static {
            int[] iArr = new int[InterstitialAdState.values().length];
            try {
                iArr[InterstitialAdState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InterstitialAdState.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InterstitialAdState.CLOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InterstitialAdState.SHOWING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InterstitialAdState.FAIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InterstitialAdState.DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f17324a = iArr;
        }
    }

    static {
        ea.a.p("HHBdYQpocnY_bj5VAWkEcw==", "6cmmFXJo");
        f17318a = new a();
    }

    public static void a(Context context, String str) {
        g.e(context, "context");
        if (b.f31389e && !f17323g) {
            f17323g = true;
            String p10 = ea.a.p("XWU8Zh9vdw==", "aZr5MuRb");
            String p11 = ea.a.p("X2ElZwZhBWUtc1xvdw==", "b5stDqLh");
            f.b(context).getClass();
            tn.a.d(context, p10, p11, androidx.activity.f.m(f.c(), "_", str), false);
        }
    }

    public static void b() {
        if (f17321e != 0 && c == 0) {
            f17320d += System.nanoTime() - f17321e;
            f17321e = 0L;
        }
    }

    public static void c(boolean z10) {
        InterstitialAdState interstitialAdState;
        String p10;
        String str;
        String str2;
        String str3;
        String str4;
        if (c == 0) {
            c = System.nanoTime();
        }
        long j10 = c - f17319b;
        long j11 = f17320d;
        float f10 = ((float) (j10 - j11)) / 1.0E9f;
        if (j11 > 0) {
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("PHBdYQpo", "yFDoPbJA"), ea.a.p("JHAnYTtoKmIpY2s=", "vkWKHuZU"), String.valueOf(j11 / 1000000000), false);
        }
        if (z10) {
            interstitialAdState = j.c().f23965f;
        } else {
            interstitialAdState = l.m().f23924h;
        }
        switch (C0223a.f17324a[interstitialAdState.ordinal()]) {
            case 1:
                p10 = ea.a.p("X28qZBpuZw==", "n4uQwJJa");
                break;
            case 2:
            case 3:
            case 4:
                p10 = ea.a.p("QHUoYxZzcw==", "KEo8m80U");
                break;
            case 5:
                p10 = ea.a.p("VWEibA==", "wZhKZeSS");
                break;
            case 6:
                p10 = ea.a.p("FGwLc2U=", "ObwdtyfH");
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (f17320d > 0) {
            str = "WQ==";
            str2 = "mLlFIibL";
        } else {
            str = "Tg==";
            str2 = "3Pyr6rlV";
        }
        String p11 = ea.a.p(str, str2);
        if (z10) {
            str3 = "QQ==";
            str4 = "sIq1rDPi";
        } else {
            str3 = "Qg==";
            str4 = "k3iqF3o7";
        }
        String p12 = ea.a.p(str3, str4);
        if (f10 <= 5.0f) {
            Context m10 = ReaderPdfApplication.m();
            String p13 = ea.a.p("QHAnYQBo", "Z1BufUaQ");
            String p14 = ea.a.p("QHAnYQBoPWFk", "5mPrXrEU");
            tn.a.d(m10, p13, p14, p12 + "_" + p11 + "_" + p10 + "_A", false);
        } else if (f10 <= 10.0f) {
            Context m11 = ReaderPdfApplication.m();
            String p15 = ea.a.p("QHAnYQBo", "5T5jVdI6");
            String p16 = ea.a.p("JXAdYSRoLGFk", "nXVqWsBF");
            tn.a.d(m11, p15, p16, p12 + "_" + p11 + "_" + p10 + "_B", false);
        } else if (f10 <= 15.0f) {
            Context m12 = ReaderPdfApplication.m();
            String p17 = ea.a.p("MnAqYUpo", "AGAF9m2E");
            String p18 = ea.a.p("PHBdYQpoaGFk", "i3AeA1bo");
            tn.a.d(m12, p17, p18, p12 + "_" + p11 + "_" + p10 + "_C", false);
        } else if (f10 <= 20.0f) {
            Context m13 = ReaderPdfApplication.m();
            String p19 = ea.a.p("QHAnYQBo", "Cbqu7CS9");
            String p20 = ea.a.p("QHAnYQBoPWFk", "60RT2WTK");
            tn.a.d(m13, p19, p20, p12 + "_" + p11 + "_" + p10 + "_D", false);
        } else if (f10 <= 30.0f) {
            Context m14 = ReaderPdfApplication.m();
            String p21 = ea.a.p("GXAiYRBo", "FxjNcE7e");
            String p22 = ea.a.p("QHAnYQBoPWFk", "EZHky5Lx");
            tn.a.d(m14, p21, p22, p12 + "_" + p11 + "_" + p10 + "_E", false);
        } else if (f10 <= 60.0f) {
            Context m15 = ReaderPdfApplication.m();
            String p23 = ea.a.p("A3AoYRho", "rqpDkX3N");
            String p24 = ea.a.p("PHBdYQpoaGFk", "GyRgB21r");
            tn.a.d(m15, p23, p24, p12 + "_" + p11 + "_" + p10 + "_F", false);
        } else {
            Context m16 = ReaderPdfApplication.m();
            String p25 = ea.a.p("QHAnYQBo", "UYLnFSsv");
            String p26 = ea.a.p("QHAnYQBoPWFk", "Bnptqp0o");
            tn.a.d(m16, p25, p26, p12 + "_" + p11 + "_" + p10 + "_G", false);
        }
    }

    public static final void d(boolean z10) {
        String str;
        String str2;
        Context m10 = ReaderPdfApplication.m();
        String p10 = ea.a.p("QHAnYQBo", "oLOZ0OGH");
        String p11 = ea.a.p("PHBdYQpoaGE-XzloGnc=", "pc6TfNUG");
        f17318a.getClass();
        if (z10) {
            str = "QQ==";
            str2 = "5kvLCJkI";
        } else {
            str = "Qg==";
            str2 = "47jEFlKb";
        }
        tn.a.d(m10, p10, p11, ea.a.p(str, str2), false);
    }

    public static void e(Context context, boolean z10) {
        String str;
        String str2;
        g.e(context, "context");
        String str3 = "5kvLCJkI";
        String str4 = "QQ==";
        if (b.f31389e && !f17322f) {
            f17322f = true;
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("XWU8Zh9vdw==", "qarv5bVs");
            String p11 = ea.a.p("QHAnYQBoPXMab0NfD2kkc3Q=", "vOpNeuNa");
            if (z10) {
                str = "5kvLCJkI";
                str2 = "QQ==";
            } else {
                str = "47jEFlKb";
                str2 = "Qg==";
            }
            tn.a.d(m10, p10, p11, ea.a.p(str2, str), false);
        }
        Context m11 = ReaderPdfApplication.m();
        String p12 = ea.a.p("QHAnYQBo", "kMfFzabR");
        String p13 = ea.a.p("PHBdYQpoaHMyb3c=", "QBYyyBFG");
        String e10 = b.e();
        if (!z10) {
            str3 = "47jEFlKb";
            str4 = "Qg==";
        }
        tn.a.d(m11, p12, p13, androidx.activity.f.m(e10, "_", ea.a.p(str4, str3)), false);
    }
}
