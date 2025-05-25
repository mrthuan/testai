package eb;

import android.text.TextUtils;
import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils.java */
/* loaded from: classes2.dex */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final long f16548b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static k f16549d;

    /* renamed from: a  reason: collision with root package name */
    public final b1 f16550a;

    public k(b1 b1Var) {
        this.f16550a = b1Var;
    }

    public final boolean a(com.google.firebase.installations.local.a aVar) {
        if (TextUtils.isEmpty(aVar.f13606d)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f16550a.getClass();
        if (aVar.f13608f + aVar.f13609g < timeUnit.toSeconds(System.currentTimeMillis()) + f16548b) {
            return true;
        }
        return false;
    }
}
