package cp;

import android.os.Build;
import android.text.TextUtils;
import kotlin.jvm.internal.g;
import kotlin.text.Regex;
import kotlin.text.j;

/* compiled from: MIUI.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f16005a;

    static {
        ea.a.p("K1s_dm4xbDNlOTtbBC1uXSo=", "smui37nL");
        ea.a.p("bVsddi4xOTJfOWlbXC1vXSo=", "XMmdJSnf");
        f16005a = new b();
    }

    public static boolean a(Regex regex) {
        String str;
        String p10 = ea.a.p("Om5abhZ3bg==", "bmKYuK1N");
        String str2 = Build.MANUFACTURER;
        if (g.a(p10, str2)) {
            str2 = Build.BRAND;
        }
        if (!j.G(str2, ea.a.p("S2kqbx5p", "iQbCiQCS"), true) && !j.G(str2, ea.a.p("Q28obw==", "a2pPEhjs"), true) && !j.G(str2, ea.a.p("LWxQYxJzX2Eoaw==", "MeruCX4I"), true)) {
            return false;
        }
        String p11 = ea.a.p("QW9lbRp1Cy4HaRp2DHIlaStuHG4nbWU=", "ULYOnesS");
        try {
            Class<?> cls = Class.forName(ea.a.p("Um4vchxpBi4dcxpTEHMiZSlQQG82ZTF0W2Vz", "20tOJlpK"));
            str = (String) cls.getDeclaredMethod(ea.a.p("VGV0", "T91Cb0AC"), String.class).invoke(cls, p11);
        } catch (Exception e10) {
            e10.printStackTrace();
            str = "";
        }
        if (str == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return regex.matches(str);
    }
}
