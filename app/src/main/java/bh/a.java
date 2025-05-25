package bh;

import android.graphics.Path;
import sg.e;

/* compiled from: SmartArtPathBuilder.java */
/* loaded from: classes.dex */
public final class a {
    public static double a(double d10, double d11) {
        double acos = (Math.acos(d10 / Math.sqrt((d11 * d11) + (d10 * d10))) * 180.0d) / 3.141592653589793d;
        if (d11 < 0.0d) {
            return 360.0d - acos;
        }
        return acos;
    }

    public static Path b() {
        return e.a.f29807a.d("SmartArtPathBuilder");
    }
}
