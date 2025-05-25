package tn;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.u;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.PolicyOverloadActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.TermsUseActivity;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;

/* compiled from: PromoterHelper.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30066a = ea.a.p("K2VUcA1oWHU9aD43WzUFQFJtD2kpLgZvbQ==", "JMkNnQRM");

    /* renamed from: b  reason: collision with root package name */
    public static final String f30067b = ea.a.p("W3Q_cAA6TS8CZFJyDGEyZTYuVmUjcDdoLXUyaBIuCm5XdTh0AWkHc110UXIEc3hoMG1s", "BUfcfSrU");
    public static final String c = ea.a.p("J3RFcAo6GC8qZCxyEGEMZUcuCmUgcBFoGnUkaBAuJW4rdUJ0C2lSc3VwOGkDYQt5RW8CaSZ5S2gBbWw=", "DOKduCdL");

    public static String a(Context context) {
        Locale locale = context.getResources().getConfiguration().locale;
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                String country = locale.getCountry();
                if (!TextUtils.isEmpty(country)) {
                    StringBuilder k10 = a0.a.k(language);
                    k10.append(ea.a.p("Xw==", "W0fmE3rD"));
                    k10.append(country);
                    language = k10.toString();
                }
                return ea.a.p("DGwqbhQ9", "I3ZVlX5S") + language;
            }
            return "";
        }
        return "";
    }

    public static void b(Context context) {
        Intent intent = new Intent(context, TermsUseActivity.class);
        String p10 = ea.a.p("RnJs", "Zi3KZViS");
        intent.putExtra(p10, f30067b + a(context));
        intent.putExtra(ea.a.p("G28kb3I=", "JHxHydHk"), androidx.core.content.a.getColor(context, R.color.colorSurface));
        intent.putExtra(ea.a.p("Vm0qaWw=", "aj7TlaMm"), f30066a);
        intent.putExtra(ea.a.p("MWkRbGU=", "noEeE49q"), context.getString(R.string.arg_res_0x7f1304cb));
        intent.putExtra(ea.a.p("V2E5aw==", "RoK0Fp0I"), c.h(context));
        context.startActivity(intent);
        fe.a.a().b(ea.a.p("AW9Xc1duTDpobxZlWiAjZUptISAIY0JpAmkFeQ==", "EhB928jB"));
    }

    public static void c(u uVar, String str) {
        boolean h10 = c.h(uVar);
        int color = androidx.core.content.a.getColor(uVar, R.color.colorSurface);
        Intent intent = new Intent(uVar, PolicyOverloadActivity.class);
        String p10 = ea.a.p("N3Js", "qBBiURk8");
        intent.putExtra(p10, c + a(uVar));
        intent.putExtra(ea.a.p("UG8nb3I=", "1B1dyyf5"), color);
        intent.putExtra(ea.a.p("Km1QaWw=", "LfL8OLct"), f30066a);
        intent.putExtra(ea.a.p("PWkXbGU=", "ykIcHMJq"), str);
        intent.putExtra(ea.a.p("V2E5aw==", "wqE0ykoD"), h10);
        uVar.startActivity(intent);
        fe.a.a().b(ea.a.p("cG8lcxZuFjpSb0RlByAGbyhpUXlmQSB0LnYddHk=", "Gt5fXxZD"));
    }
}
