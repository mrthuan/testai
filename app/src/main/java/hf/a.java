package hf;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import ff.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: LocalizationPlugin.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f18323a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f18324b;

    /* compiled from: LocalizationPlugin.java */
    /* renamed from: hf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0245a implements d.b {
        public C0245a() {
        }

        public final String a(String str, String str2) {
            String str3;
            a aVar = a.this;
            Context context = aVar.f18324b;
            if (str2 != null) {
                String[] split = str2.replace('_', '-').split("-", -1);
                String str4 = split[0];
                String str5 = "";
                int i10 = 1;
                if (split.length <= 1 || split[1].length() != 4) {
                    str3 = "";
                } else {
                    str3 = split[1];
                    i10 = 2;
                }
                if (split.length > i10 && split[i10].length() >= 2 && split[i10].length() <= 3) {
                    str5 = split[i10];
                }
                Locale locale = new Locale(str4, str5, str3);
                Configuration configuration = new Configuration(aVar.f18324b.getResources().getConfiguration());
                configuration.setLocale(locale);
                context = aVar.f18324b.createConfigurationContext(configuration);
            }
            int identifier = context.getResources().getIdentifier(str, "string", aVar.f18324b.getPackageName());
            if (identifier != 0) {
                return context.getResources().getString(identifier);
            }
            return null;
        }
    }

    public a(Context context, d dVar) {
        C0245a c0245a = new C0245a();
        this.f18324b = context;
        this.f18323a = dVar;
        dVar.f17277b = c0245a;
    }

    public final void a(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                locale = locales.get(i10);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        d dVar = this.f18323a;
        dVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            locale2.getLanguage();
            locale2.getCountry();
            locale2.getVariant();
            arrayList2.add(locale2.getLanguage());
            arrayList2.add(locale2.getCountry());
            arrayList2.add(locale2.getScript());
            arrayList2.add(locale2.getVariant());
        }
        dVar.f17276a.a(arrayList2, "setLocale");
    }
}
