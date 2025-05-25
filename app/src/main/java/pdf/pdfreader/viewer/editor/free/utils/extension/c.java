package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import v0.f;

/* compiled from: Context.kt */
/* loaded from: classes3.dex */
public final class c {
    public static final boolean a(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if (androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHEMHTQZSQQ==", "iO8Qwun5")) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean b(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if (androidx.core.content.a.checkSelfPermission(context, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfE1gjRSVOLEwQU2VPK0FwRQ==", "AXPyVwwm")) == 0 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Fm4WcjppDC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEE7XyFUGlIpR0U=", "HWwrUhGV")) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean c(Context context) {
        int i10;
        kotlin.jvm.internal.g.e(context, "<this>");
        if (!f(context) && (((i10 = Build.VERSION.SDK_INT) >= 33 || !b(context)) && ((i10 < 33 || !d(context)) && (i10 < 34 || !e(context))))) {
            return false;
        }
        return true;
    }

    public static final boolean d(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if (Build.VERSION.SDK_INT < 33 || androidx.core.content.a.checkSelfPermission(context, ea.a.p("VW4hcjhpAy44ZRRtXXMkaVdufFIMQXJfOUU1SRBfC011RwBT", "wt4EWgiH")) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean e(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if (Build.VERSION.SDK_INT < 34 || androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfCEUuSQ9fGUlgVQpMLFUxRSBfZ0UlRRVUAUQ=", "EjNOP3D5")) != 0) {
            return false;
        }
        return true;
    }

    public static final boolean f(Context context) {
        boolean isExternalStorageManager;
        kotlin.jvm.internal.g.e(context, "<this>");
        if (h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                return true;
            }
            return false;
        } else if (androidx.core.content.a.checkSelfPermission(context, ea.a.p("Bm5VcidpLi44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEErX2JUB1ILR0U=", "Hmg1HJRM")) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean g(Context context) {
        boolean isExternalStorageManager;
        kotlin.jvm.internal.g.e(context, "<this>");
        if (h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (isExternalStorageManager) {
                return true;
            }
            return false;
        } else if (androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFJ0UqVAtSFEF_XxhUPFIjR0U=", "xrNZuaNc")) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static final boolean h(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final boolean i(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
            return true;
        }
        return false;
    }

    public static final boolean j(Context context) {
        Locale locale;
        LocaleList locales;
        kotlin.jvm.internal.g.e(context, "<this>");
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locales = context.getResources().getConfiguration().getLocales();
                locale = locales.get(0);
                kotlin.jvm.internal.g.d(locale, ea.a.p("SAprIFMgQiBSIBQgSSAiaC1zHHIjcyx1pICTLjtvUWFfZTguFGUWKEIpPiBJIHYgZCASfQ==", "F5W2LpDQ"));
            } else {
                locale = context.getResources().getConfiguration().locale;
                kotlin.jvm.internal.g.d(locale, ea.a.p("AQpqIGggTSBoIEYgFCAjaFFzfHIsc1l1loDXZyRyI3QTbyQuJG8OYSRlbCAUIHcgGCByfQ==", "d6zJHm7Z"));
            }
            int i10 = v0.f.f30479a;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (f.a.a(locale) == 1) {
            return true;
        }
        return false;
    }

    public static final int k(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final Activity l(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.g.d(baseContext, ea.a.p("LWFCZTpvWXQ_eHQ=", "y6DQuNgv"));
            return l(baseContext);
        }
        return null;
    }

    public static final Context m(Context context) {
        kotlin.jvm.internal.g.e(context, "<this>");
        try {
            Locale g10 = a0.g();
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            configuration.setLocale(g10);
            configuration.setLayoutDirection(g10);
            Context createConfigurationContext = context.createConfigurationContext(configuration);
            kotlin.jvm.internal.g.d(createConfigurationContext, ea.a.p("LHJUYQ1ldG80ZiNnAHIJdFxvAEMqbhFlO3RGYx9uXmkoKQ==", "jTfVCnp8"));
            return createConfigurationContext;
        } catch (Exception e10) {
            e10.printStackTrace();
            return context;
        }
    }
}
