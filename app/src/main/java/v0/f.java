package v0;

import android.text.TextUtils;
import java.util.Locale;

/* compiled from: TextUtilsCompat.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f30479a = 0;

    /* compiled from: TextUtilsCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static int a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    static {
        new Locale("", "");
    }
}
