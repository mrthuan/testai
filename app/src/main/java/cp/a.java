package cp;

import android.os.Build;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;

/* compiled from: DeviceUtil.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f16003f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f16004g;

    /* renamed from: b  reason: collision with root package name */
    public static final String f16000b = ea.a.p("N2lQbxRp", "NzhsC8Uk");
    public static final String c = ea.a.p("FmFec0JuZw==", "KOe37Y1j");

    /* renamed from: d  reason: collision with root package name */
    public static final String f16001d = ea.a.p("KG9eZxVl", "YeDwwvUP");

    /* renamed from: e  reason: collision with root package name */
    public static final String f16002e = ea.a.p("Q2kzZWw=", "qZj5XmH2");

    /* renamed from: a  reason: collision with root package name */
    public static final a f15999a = new a();

    static {
        String p10 = ea.a.p("Om4Sbgx3bg==", "IUOycrqH");
        String str = Build.MANUFACTURER;
        if (g.a(p10, str)) {
            str = Build.BRAND;
        }
        f16003f = str;
        f16004g = Build.MODEL;
    }

    public static boolean a() {
        if (j.G(f16003f, f16001d, true)) {
            String p10 = ea.a.p("K2VHaRpl", "vlmdIZT3");
            String str = f16004g;
            g.d(str, p10);
            if (k.O(str, f16002e, true)) {
                ea.a.p("D2U4aRll", "HpkNzu4k");
                if (!k.O(str, ea.a.p("UW8kaw==", "E5FDNxDw"), true)) {
                    return true;
                }
            }
        }
        return false;
    }
}
