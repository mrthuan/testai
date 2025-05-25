package im;

import android.os.Looper;
import androidx.lifecycle.w;
import kotlin.jvm.internal.g;

/* compiled from: AIConfig.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final w<Boolean> f18553a;

    /* renamed from: b  reason: collision with root package name */
    public static final w<Boolean> f18554b;
    public static boolean c;

    static {
        w<Boolean> wVar = new w<>();
        Boolean bool = Boolean.FALSE;
        wVar.j(bool);
        f18553a = wVar;
        w<Boolean> wVar2 = new w<>();
        wVar2.j(bool);
        f18554b = wVar2;
    }

    public static boolean a() {
        Boolean d10 = f18553a.d();
        if (d10 == null) {
            return false;
        }
        return d10.booleanValue();
    }

    public static void b(boolean z10) {
        boolean a10 = g.a(Thread.currentThread(), Looper.getMainLooper().getThread());
        w<Boolean> wVar = f18553a;
        if (a10) {
            wVar.j(Boolean.valueOf(z10));
        } else {
            wVar.k(Boolean.valueOf(z10));
        }
    }
}
