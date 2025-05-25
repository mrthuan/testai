package m3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.Layer;
import e3.k;
import e3.o;
import h3.p;

/* compiled from: SolidLayer.java */
/* loaded from: classes.dex */
public final class e extends com.airbnb.lottie.model.layer.a {
    public final Layer A;
    public p B;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f21802w;

    /* renamed from: x  reason: collision with root package name */
    public final f3.a f21803x;

    /* renamed from: y  reason: collision with root package name */
    public final float[] f21804y;

    /* renamed from: z  reason: collision with root package name */
    public final Path f21805z;

    public e(k kVar, Layer layer) {
        super(kVar, layer);
        this.f21802w = new RectF();
        f3.a aVar = new f3.a();
        this.f21803x = aVar;
        this.f21804y = new float[8];
        this.f21805z = new Path();
        this.A = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.f6111l);
    }

    @Override // com.airbnb.lottie.model.layer.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        if (obj == o.C) {
            if (aVar == null) {
                this.B = null;
            } else {
                this.B = new p(aVar, null);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        RectF rectF2 = this.f21802w;
        Layer layer = this.A;
        rectF2.set(0.0f, 0.0f, layer.f6109j, layer.f6110k);
        this.f6134l.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        int intValue;
        Layer layer = this.A;
        int alpha = Color.alpha(layer.f6111l);
        if (alpha == 0) {
            return;
        }
        h3.a<Integer, Integer> aVar = this.f6143u.f17996j;
        if (aVar == null) {
            intValue = 100;
        } else {
            intValue = aVar.f().intValue();
        }
        int i11 = (int) ((((alpha / 255.0f) * intValue) / 100.0f) * (i10 / 255.0f) * 255.0f);
        f3.a aVar2 = this.f21803x;
        aVar2.setAlpha(i11);
        p pVar = this.B;
        if (pVar != null) {
            aVar2.setColorFilter((ColorFilter) pVar.f());
        }
        if (i11 > 0) {
            float[] fArr = this.f21804y;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f10 = layer.f6109j;
            fArr[2] = f10;
            fArr[3] = 0.0f;
            fArr[4] = f10;
            float f11 = layer.f6110k;
            fArr[5] = f11;
            fArr[6] = 0.0f;
            fArr[7] = f11;
            matrix.mapPoints(fArr);
            Path path = this.f21805z;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, aVar2);
        }
    }
}
