package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import fn.c;
import java.lang.ref.WeakReference;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: PdfUtils.java */
/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static WeakReference<SharedPreferences> f28744a = null;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<SharedPreferences> f28745b = null;
    public static long c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static long f28746d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f28747e = false;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f28748f = false;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f28749g = false;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f28750h = false;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f28751i = false;

    public static void A(Context context, String str, String str2) {
        try {
            h(context).edit().putString(str, str2).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void B(Context context, String str) {
        A(context, "update_done_event", str);
    }

    public static boolean C(Context context) {
        if (!g(context, 78, "ai_red_dot_show_in_162")) {
            return false;
        }
        return true;
    }

    public static boolean D(Context context) {
        if (f(context, "add_text_red_dot_show_in_158", true) && J(context)) {
            return true;
        }
        return false;
    }

    public static boolean E(Context context) {
        boolean z10;
        if (f(context, "img2pdf_red_dot_show_in_154", true)) {
            if (j(context) < 62) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean F(Context context) {
        if (!g(context, 80, "pdf2img_red_dot_show_in_167")) {
            return false;
        }
        return true;
    }

    public static boolean G(Context context) {
        if (!g(context, 80, "pdf2word_red_dot_show_in_167")) {
            return false;
        }
        return true;
    }

    public static boolean H(Context context) {
        boolean z10;
        if (!g(context, 95, "tools_red_dot_show_in_version_95")) {
            return false;
        }
        wm.a.c.getClass();
        if (!wm.a.h(context)) {
            fn.c.c.getClass();
            if (!c.a.c(context)) {
                if (!G(context) && !F(context)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10 && !r(context) && !s(context) && !E(context) && !D(context) && !C(context)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void I(Context context, int i10) {
        z(System.currentTimeMillis(), context, b.a.c("recent_add_start_time_new_", i10));
    }

    public static boolean J(Context context) {
        if (j(context) < 66) {
            return true;
        }
        return false;
    }

    public static int a(int i10, Context context, Integer num, String str) {
        SharedPreferences h10 = h(context);
        int i11 = h10.getInt(str, i10);
        if (num == null) {
            return i11;
        }
        if (num.intValue() != i11) {
            h10.edit().putInt(str, num.intValue()).apply();
        }
        return num.intValue();
    }

    public static long[] b(Context context, String str) {
        String c10 = c(context, "preview_page_idx", str, "");
        if (!TextUtils.isEmpty(c10) && c10.contains(",")) {
            String[] split = c10.split(",");
            long[] jArr = new long[3];
            for (int i10 = 0; i10 < split.length; i10++) {
                if (i10 <= 2) {
                    jArr[i10] = Long.parseLong(split[i10]);
                }
            }
            return jArr;
        }
        return null;
    }

    public static String c(Context context, String str, String str2, String str3) {
        SharedPreferences h10 = h(context);
        String string = h10.getString(str, str3);
        if (str2 == null) {
            return string;
        }
        if (!str2.equals(string)) {
            h10.edit().putString(str, str2).apply();
        }
        return str2;
    }

    public static int d(Context context) {
        int l10 = l(context, -1, "ai_chat_free_msg_num_config_162");
        if (l10 == -1) {
            c1 c1Var = c1.f28564a;
            kotlin.jvm.internal.g.e(context, "context");
            c1 c1Var2 = c1.f28564a;
            String str = c1.f28576g0;
            c1Var2.getClass();
            int l11 = c1.l(3, str);
            x(context, l11, "ai_chat_free_msg_num_config_162");
            return l11;
        }
        return l10;
    }

    public static boolean e(Context context) {
        if (TextUtils.equals(a0.b(context), "in_ID")) {
            return true;
        }
        return f(context, "home_ask_feed_flag", false);
    }

    public static boolean f(Context context, String str, boolean z10) {
        try {
            return h(context).getBoolean(str, z10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean g(Context context, int i10, String str) {
        boolean z10;
        boolean f10 = f(context, str, true);
        if (j(context) < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 && z10) {
            return true;
        }
        return false;
    }

    public static SharedPreferences h(Context context) {
        SharedPreferences sharedPreferences;
        WeakReference<SharedPreferences> weakReference = f28744a;
        if (weakReference != null) {
            sharedPreferences = weakReference.get();
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("config", 0);
            f28744a = new WeakReference<>(sharedPreferences2);
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    public static long i() {
        if (f28746d == -1) {
            f28746d = m(ReaderPdfApplication.m(), "first_scan_max_id_153");
        }
        return f28746d;
    }

    public static long j(Context context) {
        int l10 = l(context, -1, "first_used_ver_code");
        if (l10 <= 0) {
            x(context, 98, "first_used_ver_code");
            return 98L;
        }
        return l10;
    }

    public static int k(Context context) {
        return d(context) - l(context, 0, "ai_chat_deplete_num_162");
    }

    public static int l(Context context, int i10, String str) {
        try {
            return h(context).getInt(str, i10);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public static long m(Context context, String str) {
        try {
            return h(context).getLong(str, -1L);
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1L;
        }
    }

    public static long n(Context context, int i10) {
        return m(context, "recent_add_start_time_new_" + i10);
    }

    public static long o() {
        if (c <= 0) {
            Context m10 = ReaderPdfApplication.m();
            long m11 = m(m10, "recent_add_start_time");
            c = m11;
            if (m11 < 0) {
                long currentTimeMillis = System.currentTimeMillis();
                c = currentTimeMillis;
                z(currentTimeMillis, m10, "recent_add_start_time");
            }
        }
        return c;
    }

    public static SharedPreferences p(Context context) {
        SharedPreferences sharedPreferences;
        WeakReference<SharedPreferences> weakReference = f28745b;
        if (weakReference != null) {
            sharedPreferences = weakReference.get();
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("search_history", 0);
            f28745b = new WeakReference<>(sharedPreferences2);
            return sharedPreferences2;
        }
        return sharedPreferences;
    }

    public static boolean q(Locale locale) {
        if (locale != null) {
            try {
                String country = locale.getCountry();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(country) && country.equalsIgnoreCase(OperatorName.BEGIN_INLINE_IMAGE_DATA)) {
                    return true;
                }
                if (!TextUtils.isEmpty(language)) {
                    if (language.toLowerCase().startsWith("in")) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean r(Context context) {
        if (!g(context, 68, "docx2pdf_red_dot_show_in_159")) {
            return false;
        }
        return true;
    }

    public static boolean s(Context context) {
        if (!g(context, 68, "sign_update_red_dot_in_160")) {
            return false;
        }
        return true;
    }

    public static void t() {
        if (f(ReaderPdfApplication.m(), "key_opened_preview_page", false)) {
            return;
        }
        w(ReaderPdfApplication.m(), "key_opened_preview_page", true);
    }

    public static void u() {
        if (f(ReaderPdfApplication.m(), "has_permission_preview_pdf", false)) {
            return;
        }
        w(ReaderPdfApplication.m(), "has_permission_preview_pdf", true);
    }

    public static void v(Context context) {
        w(context, "ai_red_dot_show_in_162", false);
    }

    public static void w(Context context, String str, boolean z10) {
        try {
            h(context).edit().putBoolean(str, z10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void x(Context context, int i10, String str) {
        try {
            h(context).edit().putInt(str, i10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void y(boolean z10) {
        w(ReaderPdfApplication.m(), "key_app_show_lang_choose", !z10);
    }

    public static void z(long j10, Context context, String str) {
        try {
            h(context).edit().putLong(str, j10).apply();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
