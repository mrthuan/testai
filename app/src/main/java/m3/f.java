package m3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.layer.Layer;
import e3.k;
import e3.o;
import h3.n;
import h3.p;
import java.util.HashMap;
import java.util.List;
import k3.j;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public final class f extends com.airbnb.lottie.model.layer.a {
    public final b A;
    public final HashMap B;
    public final y.f<String> C;
    public final n D;
    public final k E;
    public final e3.e F;
    public final h3.f G;
    public p H;
    public final h3.f I;
    public p J;
    public final h3.c K;
    public p L;
    public final h3.c M;
    public p N;
    public p O;

    /* renamed from: w  reason: collision with root package name */
    public final StringBuilder f21806w;

    /* renamed from: x  reason: collision with root package name */
    public final RectF f21807x;

    /* renamed from: y  reason: collision with root package name */
    public final Matrix f21808y;

    /* renamed from: z  reason: collision with root package name */
    public final a f21809z;

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21810a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            f21810a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21810a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21810a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f(k kVar, Layer layer) {
        super(kVar, layer);
        k3.b bVar;
        k3.b bVar2;
        k3.a aVar;
        k3.a aVar2;
        this.f21806w = new StringBuilder(2);
        this.f21807x = new RectF();
        this.f21808y = new Matrix();
        this.f21809z = new a();
        this.A = new b();
        this.B = new HashMap();
        this.C = new y.f<>();
        this.E = kVar;
        this.F = layer.f6102b;
        n nVar = new n((List) layer.f6116q.f19572b);
        this.D = nVar;
        nVar.a(this);
        e(nVar);
        j jVar = layer.f6117r;
        if (jVar != null && (aVar2 = (k3.a) jVar.f19560a) != null) {
            h3.a<?, ?> a10 = aVar2.a();
            this.G = (h3.f) a10;
            a10.a(this);
            e(a10);
        }
        if (jVar != null && (aVar = (k3.a) jVar.f19561b) != null) {
            h3.a<?, ?> a11 = aVar.a();
            this.I = (h3.f) a11;
            a11.a(this);
            e(a11);
        }
        if (jVar != null && (bVar2 = (k3.b) jVar.c) != null) {
            h3.a<?, ?> a12 = bVar2.a();
            this.K = (h3.c) a12;
            a12.a(this);
            e(a12);
        }
        if (jVar != null && (bVar = (k3.b) jVar.f19562d) != null) {
            h3.a<?, ?> a13 = bVar.a();
            this.M = (h3.c) a13;
            a13.a(this);
            e(a13);
        }
    }

    public static void p(DocumentData.Justification justification, Canvas canvas, float f10) {
        int i10 = c.f21810a[justification.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                canvas.translate((-f10) / 2.0f, 0.0f);
                return;
            }
            return;
        }
        canvas.translate(-f10, 0.0f);
    }

    public static void q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.a, j3.e
    public final void c(n3.a aVar, Object obj) {
        super.c(aVar, obj);
        if (obj == o.f16414a) {
            p pVar = this.H;
            if (pVar != null) {
                m(pVar);
            }
            if (aVar == null) {
                this.H = null;
                return;
            }
            p pVar2 = new p(aVar, null);
            this.H = pVar2;
            pVar2.a(this);
            e(this.H);
        } else if (obj == o.f16415b) {
            p pVar3 = this.J;
            if (pVar3 != null) {
                m(pVar3);
            }
            if (aVar == null) {
                this.J = null;
                return;
            }
            p pVar4 = new p(aVar, null);
            this.J = pVar4;
            pVar4.a(this);
            e(this.J);
        } else if (obj == o.f16427o) {
            p pVar5 = this.L;
            if (pVar5 != null) {
                m(pVar5);
            }
            if (aVar == null) {
                this.L = null;
                return;
            }
            p pVar6 = new p(aVar, null);
            this.L = pVar6;
            pVar6.a(this);
            e(this.L);
        } else if (obj == o.f16428p) {
            p pVar7 = this.N;
            if (pVar7 != null) {
                m(pVar7);
            }
            if (aVar == null) {
                this.N = null;
                return;
            }
            p pVar8 = new p(aVar, null);
            this.N = pVar8;
            pVar8.a(this);
            e(this.N);
        } else if (obj == o.B) {
            p pVar9 = this.O;
            if (pVar9 != null) {
                m(pVar9);
            }
            if (aVar == null) {
                this.O = null;
                return;
            }
            p pVar10 = new p(aVar, null);
            this.O = pVar10;
            pVar10.a(this);
            e(this.O);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, g3.e
    public final void d(RectF rectF, Matrix matrix, boolean z10) {
        super.d(rectF, matrix, z10);
        e3.e eVar = this.F;
        rectF.set(0.0f, 0.0f, eVar.f16349j.width(), eVar.f16349j.height());
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0417  */
    @Override // com.airbnb.lottie.model.layer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r30, android.graphics.Matrix r31, int r32) {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.f.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
