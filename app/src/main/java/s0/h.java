package s0;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: LocaleListCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final h f29692b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    public final j f29693a;

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Locale[] f29694a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        public static boolean b(Locale locale, Locale locale2) {
            boolean z10;
            boolean z11;
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage())) {
                return false;
            }
            Locale[] localeArr = f29694a;
            int length = localeArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (localeArr[i10].equals(locale)) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                int length2 = localeArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 < length2) {
                        if (localeArr[i11].equals(locale2)) {
                            z11 = true;
                            break;
                        }
                        i11++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    String a10 = v0.b.a(locale);
                    if (a10.isEmpty()) {
                        String country = locale.getCountry();
                        if (country.isEmpty() || country.equals(locale2.getCountry())) {
                            return true;
                        }
                        return false;
                    }
                    return a10.equals(v0.b.a(locale2));
                }
            }
            return false;
        }
    }

    /* compiled from: LocaleListCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public h(j jVar) {
        this.f29693a = jVar;
    }

    public static h a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new h(new k(b.a(localeArr)));
        }
        return new h(new i(localeArr));
    }

    public static h b(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i10 = 0; i10 < length; i10++) {
                localeArr[i10] = a.a(split[i10]);
            }
            return a(localeArr);
        }
        return f29692b;
    }

    public final Locale c(int i10) {
        return this.f29693a.get(i10);
    }

    public final int d() {
        return this.f29693a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.f29693a.equals(((h) obj).f29693a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29693a.hashCode();
    }

    public final String toString() {
        return this.f29693a.toString();
    }
}
