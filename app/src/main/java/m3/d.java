package m3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import e3.k;
import java.util.ArrayList;
import java.util.Collections;
import l3.i;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public final class d extends com.airbnb.lottie.model.layer.a {

    /* renamed from: w  reason: collision with root package name */
    public final g3.d f21801w;

    public d(k kVar, Layer layer) {
        super(kVar, layer);
        g3.d dVar = new g3.d(kVar, this, new i("__container", layer.f6101a, false));
        this.f21801w = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.airbnb.lottie.model.layer.a, g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        this.f21801w.d(rectF, this.f6134l, z10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        this.f21801w.f(canvas, matrix, i10);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void n(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        this.f21801w.g(dVar, i10, arrayList, dVar2);
    }
}
