package pdf.pdfreader.viewer.editor.free.utils;

import android.content.SharedPreferences;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: BaseConfig.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28558a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final SharedPreferences f28559b = ReaderPdfApplication.m().getSharedPreferences(ea.a.p("H3JUZhxyUm45ZXM=", "eEU1XJjK"), 0);
    public static boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static int f28560d;

    public static final String a() {
        String string = f28559b.getString(ea.a.p("PWUWdQBTPGk4SQhxQWkleWhhNWUKb1hmHWc=", "v7YtgWYK"), ea.a.p("Mg==", "iVC9jjJJ"));
        if (string == null) {
            return ea.a.p("Mg==", "gcVJuLvH");
        }
        return string;
    }

    public static final String b() {
        String string = f28559b.getString(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXzdlK3QFYwZuXmlUX3o2Mg==", "SZi859L0"), ea.a.p("QQ==", "TSXN4Fn9"));
        if (string == null) {
            return ea.a.p("QQ==", "82gF2sbF");
        }
        return string;
    }

    public static final long c() {
        return f28559b.getLong(ea.a.p("X2E4dCxzCm8FX1J1BWwJYSBfRmkrZQ==", "Yf0HL3s6"), 0L);
    }

    public static final void d(float f10) {
        f28559b.edit().putFloat(ea.a.p("K2VTdR5fUXU2bBVhEXM3ZEByD3Qsb24=", "2OLy8ZwC"), f10).apply();
    }

    public static final void e() {
        a6.h.j("G3Mlbh13LnU7ZXI=", "7hrzxqZx", f28559b.edit(), false);
    }

    public static final void f(String str) {
        bp.b.f5499a = str;
        f28559b.edit().putString(ea.a.p("QHAnYQBoPWYHbFhfCGQJYSZfAzQ4", "9aiqCQK4"), str).apply();
    }
}
