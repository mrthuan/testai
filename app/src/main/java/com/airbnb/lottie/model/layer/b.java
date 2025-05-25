package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.activity.s;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.model.layer.a;
import e3.e;
import e3.k;
import e3.o;
import h3.p;
import java.util.ArrayList;
import java.util.List;
import m3.c;
import m3.d;
import p3.g;
import y.f;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public final class b extends com.airbnb.lottie.model.layer.a {
    public final Paint A;

    /* renamed from: w  reason: collision with root package name */
    public h3.a<Float, Float> f6147w;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList f6148x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f6149y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f6150z;

    /* compiled from: CompositionLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6151a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f6151a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6151a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(k kVar, Layer layer, List<Layer> list, e eVar) {
        super(kVar, layer);
        com.airbnb.lottie.model.layer.a aVar;
        com.airbnb.lottie.model.layer.a dVar;
        this.f6148x = new ArrayList();
        this.f6149y = new RectF();
        this.f6150z = new RectF();
        this.A = new Paint();
        k3.b bVar = layer.f6118s;
        if (bVar != null) {
            h3.a<Float, Float> a10 = bVar.a();
            this.f6147w = a10;
            e(a10);
            this.f6147w.a(this);
        } else {
            this.f6147w = null;
        }
        f fVar = new f(eVar.f16348i.size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size >= 0) {
                Layer layer2 = list.get(size);
                switch (a.C0047a.f6145a[layer2.f6104e.ordinal()]) {
                    case 1:
                        dVar = new d(kVar, layer2);
                        break;
                    case 2:
                        dVar = new b(kVar, layer2, eVar.c.get(layer2.f6106g), eVar);
                        break;
                    case 3:
                        dVar = new m3.e(kVar, layer2);
                        break;
                    case 4:
                        dVar = new m3.b(kVar, layer2);
                        break;
                    case 5:
                        dVar = new c(kVar, layer2);
                        break;
                    case 6:
                        dVar = new m3.f(kVar, layer2);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown layer type ");
                        sb2.append(layer2.f6104e);
                        p3.c.b(sb2.toString());
                        dVar = null;
                        break;
                }
                if (dVar != null) {
                    fVar.h(dVar.f6136n.f6103d, dVar);
                    if (aVar2 != null) {
                        aVar2.f6139q = dVar;
                        aVar2 = null;
                    } else {
                        this.f6148x.add(0, dVar);
                        int i10 = a.f6151a[layer2.f6120u.ordinal()];
                        if (i10 == 1 || i10 == 2) {
                            aVar2 = dVar;
                        }
                    }
                }
                size--;
            } else {
                for (int i11 = 0; i11 < fVar.j(); i11++) {
                    com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) fVar.f(fVar.g(i11), null);
                    if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) fVar.f(aVar3.f6136n.f6105f, null)) != null) {
                        aVar3.f6140r = aVar;
                    }
                }
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        if (obj == o.A) {
            if (aVar == null) {
                h3.a<Float, Float> aVar2 = this.f6147w;
                if (aVar2 != null) {
                    aVar2.j(null);
                    return;
                }
                return;
            }
            p pVar = new p(aVar, null);
            this.f6147w = pVar;
            pVar.a(this);
            e(this.f6147w);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        ArrayList arrayList = this.f6148x;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.f6149y;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).d(rectF2, this.f6134l, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void j(Canvas canvas, Matrix matrix, int i10) {
        boolean z10;
        boolean z11;
        RectF rectF = this.f6150z;
        Layer layer = this.f6136n;
        rectF.set(0.0f, 0.0f, layer.f6114o, layer.f6115p);
        matrix.mapRect(rectF);
        boolean z12 = this.f6135m.f16382p;
        ArrayList arrayList = this.f6148x;
        if (z12 && arrayList.size() > 1 && i10 != 255) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Paint paint = this.A;
            paint.setAlpha(i10);
            g.a aVar = g.f23679a;
            canvas.saveLayer(rectF, paint);
            s.y();
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (!rectF.isEmpty()) {
                z11 = canvas.clipRect(rectF);
            } else {
                z11 = true;
            }
            if (z11) {
                ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).f(canvas, matrix, i10);
            }
        }
        canvas.restore();
        s.y();
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void n(j3.d dVar, int i10, ArrayList arrayList, j3.d dVar2) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList2 = this.f6148x;
            if (i11 < arrayList2.size()) {
                ((com.airbnb.lottie.model.layer.a) arrayList2.get(i11)).g(dVar, i10, arrayList, dVar2);
                i11++;
            } else {
                return;
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public final void o(float f10) {
        super.o(f10);
        h3.a<Float, Float> aVar = this.f6147w;
        Layer layer = this.f6136n;
        if (aVar != null) {
            e eVar = this.f6135m.f16369b;
            f10 = ((aVar.f().floatValue() * layer.f6102b.f16352m) - layer.f6102b.f16350k) / ((eVar.f16351l - eVar.f16350k) + 0.01f);
        }
        if (this.f6147w == null) {
            e eVar2 = layer.f6102b;
            f10 -= layer.f6113n / (eVar2.f16351l - eVar2.f16350k);
        }
        float f11 = layer.f6112m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        ArrayList arrayList = this.f6148x;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((com.airbnb.lottie.model.layer.a) arrayList.get(size)).o(f10);
            } else {
                return;
            }
        }
    }
}
