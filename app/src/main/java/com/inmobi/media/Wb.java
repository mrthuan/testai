package com.inmobi.media;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class Wb {
    public static final Yb a(W7 videoAsset, W6 asset) {
        ArrayList arrayList;
        double d10;
        double d11;
        double d12;
        kotlin.jvm.internal.g.e(videoAsset, "videoAsset");
        kotlin.jvm.internal.g.e(asset, "asset");
        InterfaceC1673ic b10 = videoAsset.b();
        Point point = asset.f14788d.f14841a;
        Yb yb2 = null;
        if (b10 != null) {
            arrayList = ((C1659hc) b10).f15149f;
        } else {
            arrayList = null;
        }
        float f10 = AbstractC1692k3.d().c;
        double d13 = point.y / f10;
        double d14 = point.x / f10;
        double d15 = d14 / d13;
        double d16 = d14 * d13;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            double d17 = -1.0d;
            double d18 = 0.0d;
            while (it.hasNext()) {
                Yb yb3 = (Yb) it.next();
                int i10 = yb3.f14894b;
                Iterator it2 = it;
                double d19 = yb3.f14893a;
                Yb yb4 = yb2;
                double d20 = i10;
                if (d15 > d19 / d20) {
                    d11 = (d13 / d20) * d19;
                    d10 = d13;
                } else {
                    d10 = (d14 / d19) * d20;
                    d11 = d14;
                }
                if (d20 >= d10 * 0.33d && d19 >= 0.33d * d11) {
                    double d21 = d11 * d10;
                    if (d21 > 0.5d * d16) {
                        if (d21 > d17) {
                            d18 = d20 / d10;
                            yb2 = yb3;
                            d17 = d21;
                            it = it2;
                        } else if (d21 == d17) {
                            float f11 = AbstractC1692k3.d().c;
                            double d22 = d20 / d10;
                            d12 = d13;
                            if (d22 <= d18 || d18 >= f11) {
                                double d23 = f11;
                                if (d18 > d23 && d22 < d18 && d22 > d23) {
                                }
                                it = it2;
                                yb2 = yb4;
                                d13 = d12;
                            }
                            it = it2;
                            d18 = d22;
                            d13 = d12;
                            yb2 = yb3;
                        }
                    }
                }
                d12 = d13;
                it = it2;
                yb2 = yb4;
                d13 = d12;
            }
        }
        return yb2;
    }
}
