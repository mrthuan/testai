package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import v0.f;

/* compiled from: LanguageUtils.java */
/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f28530a = {ea.a.p("MW4=", "E9TEHFgZ"), ea.a.p("Q3QUQlI=", "StxoK7iQ"), ea.a.p("E3M=", "fIvYDFH7"), ea.a.p("K2U=", "RNP44BYN"), ea.a.p("LXI=", "liKokNB9"), ea.a.p("Wm4USUQ=", "2yjaruZb"), ea.a.p("LnI=", "LzElAlNF"), ea.a.p("P3Q=", "lqVXLObI"), ea.a.p("O3I=", "dc1Vygvs"), ea.a.p("JWs=", "ZOPkkH4Y"), ea.a.p("XWw=", "0qbMl3lL"), ea.a.p("PXU=", "BY4RQpsh"), ea.a.p("WWE=", "D4JSsA4a"), ea.a.p("KWE=", "KTyRzG6T"), ea.a.p("EWgXVFc=", "tKkHzp3n"), ea.a.p("NWhuQ04=", "vPjkYDCw"), ea.a.p("HG8=", "h7wc6c8c")};

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f28531b = {ea.a.p("I2E=", "WqEGnQbJ"), ea.a.p("Vm4=", "SYGNxbp2"), ea.a.p("Q3QUQlI=", "HJ6T5k9T"), ea.a.p("KnM=", "EXxAcPUJ"), ea.a.p("PGU=", "upXqhkwF"), ea.a.p("JHI=", "AqBK93T2"), ea.a.p("Wm4USUQ=", "wyY1FRb0"), ea.a.p("UnI=", "LkqfipSR"), ea.a.p("GHQ=", "YdqvXkWf"), ea.a.p("BnI=", "9Drm6CYm"), ea.a.p("Oms=", "FmI2Dl8j"), ea.a.p("IWw=", "Rr6srjRA"), ea.a.p("EHU=", "qzbKXjcB"), ea.a.p("WWE=", "5FxGNDQF"), ea.a.p("AmhoVFc=", "Amx7ZQND"), ea.a.p("SWgUQ04=", "UXCp2078"), ea.a.p("Bm8=", "3ymy9ti7")};
    public static final String[] c = {ea.a.p("GGw=", "PNvH6lL6"), ea.a.p("Um4=", "nx7X2pAV"), ea.a.p("Q3QUQlI=", "Zq2STAo5"), ea.a.p("KnM=", "82DgwTQ6"), ea.a.p("V2U=", "8xvLGa00"), ea.a.p("D3I=", "QHi8F9l4"), ea.a.p("Wm4USUQ=", "6k0e6bvG"), ea.a.p("K3I=", "KWJBx9xB"), ea.a.p("WnQ=", "CgSvEYj1"), ea.a.p("O3I=", "drrFiRRA"), ea.a.p("LGs=", "rbY91c4U"), ea.a.p("QXU=", "LnvjA7RS"), ea.a.p("WWE=", "MtailOTF"), ea.a.p("VWE=", "3xrA0Lws"), ea.a.p("SWgUVFc=", "CMBOdd85"), ea.a.p("EWg6Q04=", "KgkecMMH"), ea.a.p("WG8=", "JtDy45o9")};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f28532d = {ea.a.p("Rms=", "M2mPYH5L"), ea.a.p("Km4=", "RpxIXdLI"), ea.a.p("R3QPQlI=", "nq7Psme2"), ea.a.p("L3M=", "qWJrXQ6Z"), ea.a.p("V2U=", "DpSwHjP0"), ea.a.p("KXI=", "De2CToy1"), ea.a.p("Jm5uSUQ=", "o6MV16NK"), ea.a.p("UnI=", "x7AmsP5O"), ea.a.p("WnQ=", "Y0Ucc284"), ea.a.p("R3I=", "ctX417la"), ea.a.p("J2w=", "bxIVQqdZ"), ea.a.p("PXU=", "E3Uc4FsX"), ea.a.p("XGE=", "uH6ujkjO"), ea.a.p("VWE=", "WE5xk34b"), ea.a.p("SWgUVFc=", "90bsl1WB"), ea.a.p("NWhuQ04=", "8AuuXRGB"), ea.a.p("WG8=", "T1fSMgg6")};

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap<String, String> f28533e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f28534f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f28535g;

    static {
        HashMap<String, String> hashMap = new HashMap<>(17);
        f28533e = hashMap;
        f28534f = true;
        f28535g = false;
        hashMap.put(ea.a.p("IW4=", "btDu9xgj"), ea.a.p("Cm5WbBBzaA==", "jTNNjDLM"));
        hashMap.put(ea.a.p("GXRtQlI=", "M9i2jXio"), ea.a.p("Y285dAZnF8PYcw==", "UHrpSl3W"));
        hashMap.put(ea.a.p("MHM=", "i9UM8hYD"), ea.a.p("dnM7YbCxDWw=", "SZ7NQfoY"));
        hashMap.put(ea.a.p("K2U=", "cbRCBAvC"), ea.a.p("C2VEdApjaA==", "uR4bZjF6"));
        hashMap.put(ea.a.p("VXI=", "JooXEtp0"), ea.a.p("CXJQbrqnVmlz", "EgjhhF4j"));
        hashMap.put(ea.a.p("Wm4USUQ=", "4OX0UMu0"), ea.a.p("M24zbyBlMmlh", "AZzWNAnH"));
        hashMap.put(ea.a.p("OHI=", "7tYMhvQG"), ea.a.p("l6fohKG577GCqJOKrak=", "VylKnZiF"));
        hashMap.put(ea.a.p("WnQ=", "i0C2M5jv"), ea.a.p("BnRQbBBhWW8=", "nb4JhkBp"));
        hashMap.put(ea.a.p("R3I=", "B6a55GMN"), ea.a.p("Z8P3chjDxWU=", "5Ws9eGNM"));
        hashMap.put(ea.a.p("Oms=", "rJVwWv2Z"), ea.a.p("46ObuqKAsrCjl-S9uIGHjJS64rA=", "VW40jdlO"));
        hashMap.put(ea.a.p("IWw=", "8yoyBWZ2"), ea.a.p("fWUvZQFsA24Wcw==", "dBax5xdw"));
        hashMap.put(ea.a.p("GnU=", "Kqhe4CAh"), ea.a.p("n6Dgg6iB5oGKupq4pbk=", "vAs6KwBr"));
        hashMap.put(ea.a.p("BmE=", "zsl7Uve2"), ea.a.p("15fM5tisoaqe", "6d1iDII9"));
        hashMap.put(ea.a.p("KWE=", "zxoj3B6K"), ea.a.p("6oGTp6uxurOpjA==", "tX36Ua4N"));
        hashMap.put(ea.a.p("TWgaVFc=", "Of7E7MoA"), ea.a.p("1LnK6diUhrjf5qKH", "S3tjHFId"));
        hashMap.put(ea.a.p("SWgUQ04=", "ZQ35Lq4x"), ea.a.p("1K7L5M6Thrjf5qKH", "n2fS4FKy"));
        hashMap.put(ea.a.p("JG8=", "Lp4nOVtp"), ea.a.p("3pXX6satjpa0", "SeAgM7PN"));
    }

    public static Context a(Context context, boolean z10) {
        Locale e10 = e(context);
        Configuration configuration = context.getResources().getConfiguration();
        try {
            configuration.setLocale(e10);
            configuration.setLayoutDirection(e10);
            context.getResources().updateConfiguration(configuration, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (z10) {
            return context;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return context.createConfigurationContext(configuration);
            } catch (Exception e12) {
                e12.printStackTrace();
                return context;
            }
        }
        return context;
    }

    public static String b(Context context) {
        String f10 = f(context);
        if (TextUtils.isEmpty(f10)) {
            if (h(context)) {
                if (f28535g) {
                    return ea.a.p("L24=", "2tJAcqnZ");
                }
                return ea.a.p("V2UtYQZsdA==", "oRriGZ5P");
            }
            return ea.a.p("Vm4=", "6sNa2hMQ");
        }
        return f10;
    }

    public static String c(Context context) {
        String b10 = b(context);
        if (!TextUtils.isEmpty(b10)) {
            String str = f28533e.get(b10);
            if (TextUtils.isEmpty(str)) {
                return context.getResources().getString(R.string.arg_res_0x7f1300e4);
            }
            return str;
        }
        return context.getResources().getString(R.string.arg_res_0x7f1300e4);
    }

    public static Locale d(Context context) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02e6 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Locale e(android.content.Context r17) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.utils.a0.e(android.content.Context):java.util.Locale");
    }

    public static String f(Context context) {
        return q0.h(context).getString(ea.a.p("JGVIXxVhWWcvYS1l", "J1njR6gx"), "");
    }

    public static Locale g() {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = Resources.getSystem().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return Resources.getSystem().getConfiguration().locale;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static boolean h(Context context) {
        Locale locale;
        char c10;
        LocaleList locales;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
        } else {
            locale = context.getResources().getConfiguration().locale;
        }
        String language = locale.getLanguage();
        switch (language.hashCode()) {
            case 3121:
                if (language.equals(ea.a.p("UnI=", "23MvzcSZ"))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3201:
                if (language.equals(ea.a.p("K2U=", "sbWAzOku"))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3241:
                if (language.equals(ea.a.p("DG4=", "uhiRHcH8"))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 3246:
                if (language.equals(ea.a.p("HHM=", "OLy9Tyl4"))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3259:
                if (language.equals(ea.a.p("KWE=", "t1Eseizn"))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 3276:
                if (language.equals(ea.a.p("VHI=", "872VELgo"))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3365:
                if (language.equals(ea.a.p("Wm4=", "x9kTzirS"))) {
                    c10 = 15;
                    break;
                }
                c10 = 65535;
                break;
            case 3371:
                if (language.equals(ea.a.p("JnQ=", "MrnREYYV"))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3383:
                if (language.equals(ea.a.p("WWE=", "npBvX3as"))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 3428:
                if (language.equals(ea.a.p("JG8=", "bGjVrMVv"))) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 3518:
                if (language.equals(ea.a.p("V2w=", "lI9jrPO8"))) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 3588:
                if (language.equals(ea.a.p("P3Q=", "LdcYytKk"))) {
                    c10 = 14;
                    break;
                }
                c10 = 65535;
                break;
            case 3651:
                if (language.equals(ea.a.p("BHU=", "nqv62mu4"))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3710:
                if (language.equals(ea.a.p("JXI=", "IMQHO3Dd"))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3734:
                if (language.equals(ea.a.p("EGs=", "vYelPH3A"))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 3886:
                if (language.equals(ea.a.p("SWg=", "aNhAheMX"))) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
                return true;
            default:
                return false;
        }
    }

    public static boolean i(Context context) {
        Locale d10 = d(context);
        int i10 = v0.f.f30479a;
        if (f.a.a(d10) == 1) {
            return true;
        }
        return false;
    }
}
