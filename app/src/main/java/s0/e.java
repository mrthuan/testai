package s0;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* compiled from: ConfigurationCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: ConfigurationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static h a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new h(new k(a.a(configuration)));
        }
        return h.a(configuration.locale);
    }
}
