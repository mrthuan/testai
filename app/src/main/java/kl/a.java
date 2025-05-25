package kl;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: Context.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f19861a;

    public static final void a(Context context, String text, cg.a<tf.d> aVar) {
        kotlin.jvm.internal.g.e(text, "text");
        Object systemService = context.getSystemService(ea.a.p("UGwicBFvA3Jk", "A75UiuAE"));
        kotlin.jvm.internal.g.c(systemService, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDm53bj9sNSBHeTtlU2EMZABvXWRHYzluMGVcdGhDL2kRYjVhOGQUYV1hLGVy", "aZJYVIQd"));
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(ea.a.p("J2ELZWw=", "JJKiyG9D"), text));
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public static final Locale b(Context context) {
        LocaleList locales;
        Locale locale;
        kotlin.jvm.internal.g.e(context, "<this>");
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            kotlin.jvm.internal.g.d(locale, ea.a.p("NAoRIFkgFyB6IDhlBm8dclZlHS4mbwtmlYDxdB9vDC4jb1JhFWVELj1lPihFKWIgFSBOfQ==", "Kgd3wWvb"));
            return locale;
        }
        Locale locale2 = context.getResources().getConfiguration().locale;
        kotlin.jvm.internal.g.d(locale2, ea.a.p("NAoRIFkgFyB6IDhlBm8dclZlHS4mbwtmImcWcg90Wm8hLl1vGmFbZVAgaiBVfQ==", "FK1TKcn3"));
        return locale2;
    }

    public static final Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            kotlin.jvm.internal.g.d(baseContext, ea.a.p("UWE4ZTBvDHQXeHQ=", "q7sd0Shk"));
            return c(baseContext);
        }
        return null;
    }
}
