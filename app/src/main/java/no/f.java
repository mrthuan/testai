package no;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.tools.InstallReferrerUtil;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: User.java */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    public static final String f22617h = ea.a.p("RnMucixrB3k=", "RUgTeS1P");

    /* renamed from: i  reason: collision with root package name */
    public static final String f22618i = ea.a.p("RnMucixmC3IBdGtpB3MiYShs", "wc5Pkx4k");

    /* renamed from: j  reason: collision with root package name */
    public static final String f22619j = ea.a.p("RnMucixtA2kcX0RhDmUJZi1yQXQ=", "AEIpWRSy");

    /* renamed from: k  reason: collision with root package name */
    public static final String f22620k;

    /* renamed from: l  reason: collision with root package name */
    public static final String f22621l;

    /* renamed from: m  reason: collision with root package name */
    public static final String f22622m;

    /* renamed from: n  reason: collision with root package name */
    public static final String f22623n;

    /* renamed from: o  reason: collision with root package name */
    public static final String f22624o;

    /* renamed from: p  reason: collision with root package name */
    public static f f22625p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f22626q;

    /* renamed from: r  reason: collision with root package name */
    public static final int f22627r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f22628a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22629b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f22630d;

    /* renamed from: e  reason: collision with root package name */
    public int f22631e;

    /* renamed from: f  reason: collision with root package name */
    public final e f22632f;

    /* renamed from: g  reason: collision with root package name */
    public final e f22633g;

    static {
        ea.a.p("CHA8XyNpHHM8Xw9ua2w2bl91M2csX0ZhE2U=", "7XiLEnqv");
        f22620k = ea.a.p("UnA7XxVpEHMGX11uNmw3biN1U2cjXy5hLWNo", "YvZHgeSb");
        f22621l = ea.a.p("UnA7XwBwPWkBX1Z1EF8gbyh1X2UZdTBlcg==", "YTR0siRC");
        f22622m = ea.a.p("GXAVXyNwDWk7XwVoUWM8ZVxfIGUvZURyEXI=", "dwxePR9J");
        f22623n = ea.a.p("KHApX0BwLzF9NjlyUWY7b09fJGksd2ltG2QUXyVpcA==", "iHIY3pzG");
        f22624o = ea.a.p("UnA7XwBwPTFHNmtyDGY6bzNfX28iZRxnD2k1ZT50WHA=", "zQa18M6W");
        f22625p = null;
        f22626q = 1;
        f22627r = 2;
    }

    public f(Context context) {
        String string;
        this.f22628a = false;
        this.f22629b = true;
        this.f22630d = 7;
        this.f22631e = 7;
        e eVar = new e();
        this.f22632f = eVar;
        e eVar2 = new e();
        this.f22633g = eVar2;
        SharedPreferences sharedPreferences = d1.b(context).f28619a;
        if (sharedPreferences == null) {
            string = "";
        } else {
            string = sharedPreferences.getString(f22617h, "");
        }
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                this.f22628a = jSONObject.optBoolean(ea.a.p("X2UncDdvbg==", "9X4BhVZx"), false);
                eVar.f22616a = aj.b.u(jSONObject.optString(ea.a.p("LmxdXwpvRXQ=", "fVngzmLu"), "")).a();
                eVar2.f22616a = aj.b.u(jSONObject.optString(ea.a.p("X2EYbx9pNWUXcwlydA==", "w19nmAJC"), "")).a();
                this.f22630d = jSONObject.optInt(ea.a.p("P2FYbg1fQ2g=", "g3jjOidn"), 7);
                this.f22631e = jSONObject.optInt(ea.a.p("S3AUdGg=", "2FiS5kGW"), 7);
                this.c = jSONObject.optInt(ea.a.p("Q2EjbgNfGW8kb3I=", "xJ3JwzvH"), androidx.core.content.a.getColor(context, R.color.color_pdf_preview_edit4));
                this.f22629b = jSONObject.optBoolean(ea.a.p("XW8_aRVpAWEGaVtuNm9u", "q4hASSgY"), true);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        this.c = androidx.core.content.a.getColor(context, R.color.color_pdf_preview_edit4);
    }

    public static int a(Context context) {
        d1 b10 = d1.b(context);
        String p10 = ea.a.p("OnNUciZzX28tXz5oEG0NX0F5HmUaMVE1", "4ef2ghNy");
        SharedPreferences sharedPreferences = b10.f28619a;
        if (sharedPreferences == null) {
            return 0;
        }
        return sharedPreferences.getInt(p10, 0);
    }

    public static f b(Context context) {
        if (f22625p == null) {
            f22625p = new f(context.getApplicationContext());
        }
        return f22625p;
    }

    public static String c() {
        String str;
        String str2;
        if (f()) {
            str = "Q3Jl";
            str2 = "9B3TcdDb";
        } else {
            str = "IW9u";
            str2 = "34jtzNMw";
        }
        return ea.a.p(str, str2);
    }

    public static boolean d(Context context) {
        boolean z10;
        String str;
        String str2;
        tf.c cVar = InstallReferrerUtil.f13468a;
        int d10 = InstallReferrerUtil.d();
        ea.a.p("Bm5CdBhsW1I_Zi9yB2UaVUFpbA==", "vfFiQd6m");
        ea.a.p("UXUyRh9hBTo=", "1lrSkGHv");
        if (d10 < 0) {
            ea.a.p("M242dBRsCVItZgNyRmUlVUxpbA==", "chzEueZH");
            ea.a.p("UXUrRh5hHiBlMUZkUWY2dVR0cm4mdBZiAXkkczRy", "gp3Rry7D");
            return false;
        }
        if (d10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        d1 b10 = d1.b(context);
        String str3 = f22622m;
        if (!b10.a(str3, false)) {
            d1.b(context).c(str3, true);
            ea.a.p("em44dBJsDlIXZlFyG2UkVTBpbA==", "m1N5psUC");
            ea.a.p("JnNzdQBVRGUoIA==", "VORfDYmA");
            String p10 = ea.a.p("RnMucg==", "yioEYSs4");
            String p11 = ea.a.p("OnNUciZhR3A=", "4j6jDZfg");
            if (z10) {
                str = "BnV5";
                str2 = "Cvdu47g1";
            } else {
                str = "V283bRls";
                str2 = "Lf9ExXn4";
            }
            tn.a.d(context, p10, p11, ea.a.p(str, str2), false);
        }
        return z10;
    }

    public static boolean e(Context context) {
        d1 b10 = d1.b(context);
        String str = f22620k;
        boolean a10 = b10.a(str, true);
        if (a10) {
            d1.b(context).c(str, false);
        }
        return a10;
    }

    public static boolean f() {
        tf.c cVar = InstallReferrerUtil.f13468a;
        if (InstallReferrerUtil.d() == 2) {
            return true;
        }
        return false;
    }

    public static boolean g() {
        return d1.b(ReaderPdfApplication.m()).a(ea.a.p("PGhQchxkaHcyZSRfE2MFX0dlH3UgcxFfADY1", "J4fd1bgA"), false);
    }

    public static boolean h(Context context) {
        boolean a10 = d1.b(context).a(ea.a.p("RnMucixwEGUEaVF3NnA3ZyFfVGk0c3Q=", "gVkRFdhS"), false);
        if (a10) {
            d1.b(context).c(ea.a.p("BHNXcmlwAWU-aQN3a3A2Z11fNGk7c3Q=", "Pbq26sdn"), false);
        }
        return a10;
    }

    public static void j(long j10) {
        d1 b10 = d1.b(ReaderPdfApplication.m());
        String p10 = ea.a.p("CWECdA9mJW0XdwlyX18jaVVlDTF_NQ==", "dQeqPF71");
        SharedPreferences sharedPreferences = b10.f28619a;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong(p10, j10).apply();
        }
    }

    public static boolean k(Context context) {
        if (d1.b(context).a(ea.a.p("OnNUciZzX28tXz5oEG0NX0FpHl90NDU=", "8TeOxZDn"), true) && q0.j(context) < 51) {
            return true;
        }
        return false;
    }

    public final void i(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ea.a.p("WGUucCxvbg==", "IDu5NYiM"), this.f22628a);
            jSONObject.put(ea.a.p("LmxdXwpvRXQ=", "cZV6Ztb2"), aj.b.y(this.f22632f));
            jSONObject.put(ea.a.p("VWE9bwFpFmUtc1tydA==", "D93O1L0Q"), aj.b.y(this.f22633g));
            jSONObject.put(ea.a.p("MmEYbkNfH2g=", "TvBq7kwM"), this.f22630d);
            jSONObject.put(ea.a.p("HnAbdGg=", "7pfDvrrK"), this.f22631e);
            jSONObject.put(ea.a.p("Q2EibgdfAW8eb3I=", "ueCiatN5"), this.c);
            jSONObject.put(ea.a.p("Jm9AaVdpAGE8aQlua29u", "MdH41cP7"), this.f22629b);
            d1 b10 = d1.b(context);
            String str = f22617h;
            String jSONObject2 = jSONObject.toString();
            SharedPreferences sharedPreferences = b10.f28619a;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(str, jSONObject2).apply();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
