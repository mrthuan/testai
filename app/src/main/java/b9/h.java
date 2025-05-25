package b9;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* compiled from: TypefaceUtils.java */
/* loaded from: classes2.dex */
public final class h {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i10;
        int i11;
        int weight;
        int i12;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i10 = configuration.fontWeightAdjustment;
            if (i10 != Integer.MAX_VALUE) {
                i11 = configuration.fontWeightAdjustment;
                if (i11 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i12 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, com.google.android.play.core.assetpacks.c.n(i12 + weight, 1, 1000), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
