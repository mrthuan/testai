package c5;

import android.app.Activity;
import androidx.activity.ComponentActivity;
import h5.c;
import h5.l;
import h5.m;

/* compiled from: MainUpgradeChecker.kt */
/* loaded from: classes.dex */
public class d extends h5.b {
    public static boolean k(Activity activity) {
        c.a aVar = h5.c.f18014h;
        if (aVar.a(activity).b() < 4) {
            if (!aVar.a(activity).e()) {
                h5.c a10 = aVar.a(activity);
                int i10 = -2;
                if (a10.f18021g == null) {
                    a10.f18021g = Integer.valueOf(j5.a.f19040b.a(a10.f18016a).f19041a.getInt("pi_lmdsooat", -2));
                }
                Integer num = a10.f18021g;
                if (num != null) {
                    i10 = num.intValue();
                }
                if (aVar.a(activity).c() <= aVar.a(activity).a() + i10) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // h5.b
    public final m b() {
        return new m();
    }

    @Override // h5.b
    public final void e(Activity activity) {
        kotlin.jvm.internal.g.e(activity, "activity");
        a b10 = a.b();
        b10.a();
        Object obj = b10.c.f5583e.i().first;
        kotlin.jvm.internal.g.d(obj, "getInstance().upgradeCon….upgradeOpenSetting.first");
        ((Boolean) obj).booleanValue();
        d().d(activity, new b(0, this, activity));
    }

    public final void l() {
        i5.a aVar;
        l lVar;
        this.f18011d.removeCallbacksAndMessages(null);
        m mVar = this.f18010b;
        if (mVar != null && (lVar = mVar.c) != null) {
            try {
                o9.b bVar = mVar.f18036a;
                if (bVar != null) {
                    bVar.e(lVar);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ComponentActivity componentActivity = this.f18009a;
        if (componentActivity != null && (aVar = this.c) != null) {
            aVar.g(componentActivity);
        }
    }
}
