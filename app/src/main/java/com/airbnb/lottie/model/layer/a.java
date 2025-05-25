package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import androidx.activity.r;
import androidx.activity.s;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import e3.k;
import e3.s;
import g3.e;
import h3.a;
import h3.c;
import h3.g;
import h3.o;
import j3.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import y.h;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class a implements e, a.InterfaceC0242a, j3.e {

    /* renamed from: a  reason: collision with root package name */
    public final Path f6124a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f6125b = new Matrix();
    public final f3.a c = new f3.a(1);

    /* renamed from: d  reason: collision with root package name */
    public final f3.a f6126d = new f3.a(PorterDuff.Mode.DST_IN, 0);

    /* renamed from: e  reason: collision with root package name */
    public final f3.a f6127e = new f3.a(PorterDuff.Mode.DST_OUT, 0);

    /* renamed from: f  reason: collision with root package name */
    public final f3.a f6128f;

    /* renamed from: g  reason: collision with root package name */
    public final f3.a f6129g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f6130h;

    /* renamed from: i  reason: collision with root package name */
    public final RectF f6131i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f6132j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f6133k;

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f6134l;

    /* renamed from: m  reason: collision with root package name */
    public final k f6135m;

    /* renamed from: n  reason: collision with root package name */
    public final Layer f6136n;

    /* renamed from: o  reason: collision with root package name */
    public final g f6137o;

    /* renamed from: p  reason: collision with root package name */
    public c f6138p;

    /* renamed from: q  reason: collision with root package name */
    public a f6139q;

    /* renamed from: r  reason: collision with root package name */
    public a f6140r;

    /* renamed from: s  reason: collision with root package name */
    public List<a> f6141s;

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f6142t;

    /* renamed from: u  reason: collision with root package name */
    public final o f6143u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6144v;

    /* compiled from: BaseLayer.java */
    /* renamed from: com.airbnb.lottie.model.layer.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0047a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6145a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f6146b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f6146b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6146b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6146b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6146b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f6145a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6145a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6145a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6145a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6145a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6145a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6145a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(k kVar, Layer layer) {
        f3.a aVar = new f3.a(1);
        this.f6128f = aVar;
        this.f6129g = new f3.a(PorterDuff.Mode.CLEAR);
        this.f6130h = new RectF();
        this.f6131i = new RectF();
        this.f6132j = new RectF();
        this.f6133k = new RectF();
        this.f6134l = new Matrix();
        this.f6142t = new ArrayList();
        this.f6144v = true;
        this.f6135m = kVar;
        this.f6136n = layer;
        r.g(new StringBuilder(), layer.c, "#draw");
        if (layer.f6120u == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        k3.k kVar2 = layer.f6108i;
        kVar2.getClass();
        o oVar = new o(kVar2);
        this.f6143u = oVar;
        oVar.b(this);
        List<Mask> list = layer.f6107h;
        if (list != null && !list.isEmpty()) {
            g gVar = new g(list);
            this.f6137o = gVar;
            for (h3.a aVar2 : (List) gVar.f17973a) {
                aVar2.a(this);
            }
            for (h3.a<?, ?> aVar3 : (List) this.f6137o.f17974b) {
                e(aVar3);
                aVar3.a(this);
            }
        }
        Layer layer2 = this.f6136n;
        if (!layer2.f6119t.isEmpty()) {
            c cVar = new c(layer2.f6119t);
            this.f6138p = cVar;
            cVar.f17961b = true;
            cVar.a(new m3.a(this));
            boolean z10 = this.f6138p.f().floatValue() == 1.0f;
            if (z10 != this.f6144v) {
                this.f6144v = z10;
                this.f6135m.invalidateSelf();
            }
            e(this.f6138p);
        } else if (true != this.f6144v) {
            this.f6144v = true;
            this.f6135m.invalidateSelf();
        }
    }

    @Override // h3.a.InterfaceC0242a
    public final void a() {
        this.f6135m.invalidateSelf();
    }

    @Override // j3.e
    public void c(n3.a aVar, Object obj) {
        this.f6143u.c(aVar, obj);
    }

    @Override // g3.e
    public void d(RectF rectF, Matrix matrix, boolean z10) {
        this.f6130h.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        Matrix matrix2 = this.f6134l;
        matrix2.set(matrix);
        if (z10) {
            List<a> list = this.f6141s;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    matrix2.preConcat(this.f6141s.get(size).f6143u.d());
                }
            } else {
                a aVar = this.f6140r;
                if (aVar != null) {
                    matrix2.preConcat(aVar.f6143u.d());
                }
            }
        }
        matrix2.preConcat(this.f6143u.d());
    }

    public final void e(h3.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f6142t.add(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030d A[SYNTHETIC] */
    @Override // g3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.graphics.Canvas r18, android.graphics.Matrix r19, int r20) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.a.f(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // j3.e
    public final void g(d dVar, int i10, ArrayList arrayList, d dVar2) {
        Layer layer = this.f6136n;
        if (!dVar.c(i10, layer.c)) {
            return;
        }
        String str = layer.c;
        if (!"__container".equals(str)) {
            dVar2.getClass();
            d dVar3 = new d(dVar2);
            dVar3.f19032a.add(str);
            if (dVar.a(i10, str)) {
                d dVar4 = new d(dVar3);
                dVar4.f19033b = this;
                arrayList.add(dVar4);
            }
            dVar2 = dVar3;
        }
        if (dVar.d(i10, str)) {
            n(dVar, dVar.b(i10, str) + i10, arrayList, dVar2);
        }
    }

    @Override // g3.c
    public final String getName() {
        return this.f6136n.c;
    }

    public final void h() {
        if (this.f6141s != null) {
            return;
        }
        if (this.f6140r == null) {
            this.f6141s = Collections.emptyList();
            return;
        }
        this.f6141s = new ArrayList();
        for (a aVar = this.f6140r; aVar != null; aVar = aVar.f6140r) {
            this.f6141s.add(aVar);
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.f6130h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f6129g);
        s.y();
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i10);

    public final boolean k() {
        g gVar = this.f6137o;
        if (gVar != null && !((List) gVar.f17973a).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void l() {
        e3.s sVar = this.f6135m.f16369b.f16341a;
        String str = this.f6136n.c;
        if (sVar.f16447a) {
            HashMap hashMap = sVar.c;
            p3.e eVar = (p3.e) hashMap.get(str);
            if (eVar == null) {
                eVar = new p3.e();
                hashMap.put(str, eVar);
            }
            int i10 = eVar.f23677a + 1;
            eVar.f23677a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f23677a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = sVar.f16448b.iterator();
                while (true) {
                    h.a aVar = (h.a) it;
                    if (aVar.hasNext()) {
                        ((s.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void m(h3.a<?, ?> aVar) {
        this.f6142t.remove(aVar);
    }

    public void o(float f10) {
        o oVar = this.f6143u;
        h3.a<Integer, Integer> aVar = oVar.f17996j;
        if (aVar != null) {
            aVar.i(f10);
        }
        h3.a<?, Float> aVar2 = oVar.f17999m;
        if (aVar2 != null) {
            aVar2.i(f10);
        }
        h3.a<?, Float> aVar3 = oVar.f18000n;
        if (aVar3 != null) {
            aVar3.i(f10);
        }
        h3.a<PointF, PointF> aVar4 = oVar.f17992f;
        if (aVar4 != null) {
            aVar4.i(f10);
        }
        h3.a<?, PointF> aVar5 = oVar.f17993g;
        if (aVar5 != null) {
            aVar5.i(f10);
        }
        h3.a<q3.c, q3.c> aVar6 = oVar.f17994h;
        if (aVar6 != null) {
            aVar6.i(f10);
        }
        h3.a<Float, Float> aVar7 = oVar.f17995i;
        if (aVar7 != null) {
            aVar7.i(f10);
        }
        c cVar = oVar.f17997k;
        if (cVar != null) {
            cVar.i(f10);
        }
        c cVar2 = oVar.f17998l;
        if (cVar2 != null) {
            cVar2.i(f10);
        }
        int i10 = 0;
        g gVar = this.f6137o;
        if (gVar != null) {
            int i11 = 0;
            while (true) {
                Object obj = gVar.f17973a;
                if (i11 >= ((List) obj).size()) {
                    break;
                }
                ((h3.a) ((List) obj).get(i11)).i(f10);
                i11++;
            }
        }
        float f11 = this.f6136n.f6112m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        c cVar3 = this.f6138p;
        if (cVar3 != null) {
            cVar3.i(f10 / f11);
        }
        a aVar8 = this.f6139q;
        if (aVar8 != null) {
            aVar8.o(aVar8.f6136n.f6112m * f10);
        }
        while (true) {
            ArrayList arrayList = this.f6142t;
            if (i10 < arrayList.size()) {
                ((h3.a) arrayList.get(i10)).i(f10);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // g3.c
    public final void b(List<g3.c> list, List<g3.c> list2) {
    }

    public void n(d dVar, int i10, ArrayList arrayList, d dVar2) {
    }
}
