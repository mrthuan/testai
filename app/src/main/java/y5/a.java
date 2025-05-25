package y5;

import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.q;
import com.facebook.d;
import com.facebook.n;
import kotlin.random.Random;
import kotlin.text.k;

/* compiled from: GpsDebugLogger.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32074b;

    /* renamed from: a  reason: collision with root package name */
    public final q f32075a;

    static {
        boolean z10;
        if (Random.Default.nextDouble() <= 1.0E-4d) {
            z10 = true;
        } else {
            z10 = false;
        }
        f32074b = z10;
    }

    public a(Context context) {
        this.f32075a = new q(context);
    }

    public final void a(Bundle bundle, String str) {
        if (f32074b && k.O(str, "gps", false)) {
            q qVar = this.f32075a;
            qVar.getClass();
            d dVar = d.f9685a;
            if (n.c()) {
                qVar.f9656a.h(str, bundle);
            }
        }
    }
}
