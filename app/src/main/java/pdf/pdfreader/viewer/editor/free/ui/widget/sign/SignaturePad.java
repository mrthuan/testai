package pdf.pdfreader.viewer.editor.free.ui.widget.sign;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.widget.DrawSignView;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignaturePad;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.db.SignPathActionInfo;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* loaded from: classes3.dex */
public class SignaturePad extends View {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f28470o = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f28471a;

    /* renamed from: b  reason: collision with root package name */
    public Context f28472b;
    public Paint c;

    /* renamed from: d  reason: collision with root package name */
    public int f28473d;

    /* renamed from: e  reason: collision with root package name */
    public e f28474e;

    /* renamed from: f  reason: collision with root package name */
    public xo.f f28475f;

    /* renamed from: g  reason: collision with root package name */
    public float f28476g;

    /* renamed from: h  reason: collision with root package name */
    public float f28477h;

    /* renamed from: i  reason: collision with root package name */
    public f f28478i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f28479j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f28480k;

    /* renamed from: l  reason: collision with root package name */
    public final int f28481l;

    /* renamed from: m  reason: collision with root package name */
    public SignPathActionInfo f28482m;

    /* renamed from: n  reason: collision with root package name */
    public f0 f28483n;

    /* loaded from: classes3.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), SignaturePad.this.getResources().getDimension(R.dimen.dp_12));
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), SignaturePad.this.getResources().getDimension(R.dimen.dp_12));
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
    }

    /* loaded from: classes3.dex */
    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public int f28486a;

        /* renamed from: b  reason: collision with root package name */
        public int f28487b;
    }

    /* loaded from: classes3.dex */
    public static class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public xo.f f28488a;

        /* renamed from: b  reason: collision with root package name */
        public int f28489b;
        public int c;
    }

    /* loaded from: classes3.dex */
    public interface f {
    }

    public SignaturePad(Context context) {
        super(context);
        ea.a.p("YGksbhJ0F3IXUFVkRD4=", "DsTniEST");
        this.f28479j = new ArrayList();
        this.f28480k = new ArrayList();
        this.f28481l = 1;
        b(context);
    }

    public final boolean a() {
        ArrayList arrayList = this.f28479j;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((c) it.next()) instanceof e) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final void b(Context context) {
        this.f28472b = context;
        zl.b.c.getClass();
        this.f28473d = zl.b.j();
        this.f28471a = zl.b.k();
        setClipToOutline(true);
        setOutlineProvider(new a());
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(this.f28473d);
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(this.f28471a);
        this.c.setStrokeCap(Paint.Cap.ROUND);
        this.c.setStrokeJoin(Paint.Join.ROUND);
    }

    public final void c(final int i10, final int i11) {
        this.c.setStrokeWidth(i11);
        this.c.setColor(i10);
        t0.V().execute(new Runnable() { // from class: xo.i
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = SignaturePad.f28470o;
                zl.b.c.getClass();
                ig.h<Object>[] hVarArr = zl.b.f32411d;
                zl.b.f32414g.c(hVarArr[2], Integer.valueOf(i11));
                zl.b.f32413f.c(hVarArr[1], Integer.valueOf(i10));
            }
        });
    }

    public final void d() {
        zl.b.c.getClass();
        this.f28473d = zl.b.j();
        int k10 = zl.b.k();
        this.f28471a = k10;
        Paint paint = this.c;
        if (paint != null) {
            paint.setStrokeWidth(k10);
            this.c.setColor(this.f28473d);
        }
        ArrayList arrayList = this.f28479j;
        if (arrayList != null) {
            arrayList.clear();
            this.f28480k.clear();
            invalidate();
        }
        f fVar = this.f28478i;
        if (fVar != null) {
            ((DrawSignView) fVar).g();
        }
    }

    public final void e() {
        if (this.f28475f != null) {
            if (new PathMeasure(this.f28475f, false).getLength() < 1.0f) {
                this.f28475f.lineTo(this.f28476g + 0.5f, this.f28477h + 0.5f);
                this.f28475f.lineTo(this.f28476g, this.f28477h);
            } else {
                this.f28475f.lineTo(this.f28476g, this.f28477h);
            }
            this.f28475f = null;
        }
    }

    public int getPaintColor() {
        return this.c.getColor();
    }

    public int getPaintSize() {
        return (int) this.c.getStrokeWidth();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        xo.f fVar;
        super.onDraw(canvas);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        ArrayList arrayList = this.f28479j;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if ((cVar instanceof e) && (fVar = ((e) cVar).f28488a) != null) {
                    canvas.drawPath(fVar, this.c);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        setClipToOutline(true);
        setOutlineProvider(new b());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            if (this.f28475f != null) {
                new PathMeasure(this.f28475f, false);
                e();
            }
            return super.onTouchEvent(motionEvent);
        }
        try {
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.f28475f != null) {
                            float abs = Math.abs(x4 - this.f28476g);
                            float abs2 = Math.abs(this.f28477h - y10);
                            if (abs >= 4.0f || abs2 >= 4.0f) {
                                xo.f fVar = this.f28475f;
                                float f10 = this.f28476g;
                                float f11 = this.f28477h;
                                fVar.quadTo(f10, f11, (x4 + f10) / 2.0f, (y10 + f11) / 2.0f);
                                this.f28476g = x4;
                                this.f28477h = y10;
                            }
                        }
                        invalidate();
                    }
                } else {
                    e();
                    invalidate();
                    f fVar2 = this.f28478i;
                    if (fVar2 != null) {
                        ((DrawSignView) fVar2).g();
                    }
                }
            } else {
                this.f28480k.clear();
                getWidth();
                getHeight();
                this.f28475f = new xo.f();
                e eVar = new e();
                this.f28474e = eVar;
                eVar.f28488a = this.f28475f;
                eVar.f28489b = this.c.getColor();
                this.f28474e.c = (int) this.c.getStrokeWidth();
                this.f28479j.add(this.f28474e);
                this.f28475f.moveTo(x4, y10);
                this.f28475f.lineTo(x4, y10);
                this.f28476g = x4;
                this.f28477h = y10;
                invalidate();
                f fVar3 = this.f28478i;
                if (fVar3 != null) {
                    ((DrawSignView) fVar3).f();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return true;
    }

    public void setSignatureListener(f fVar) {
        this.f28478i = fVar;
    }

    public void setSignaturePaintColor(final int i10) {
        t0.V().execute(new Runnable() { // from class: xo.h
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = SignaturePad.f28470o;
                zl.b.c.getClass();
                zl.b.f32413f.c(zl.b.f32411d[1], Integer.valueOf(i10));
            }
        });
        this.c.setColor(i10);
        if (a()) {
            d dVar = new d();
            dVar.f28487b = i10;
            dVar.f28486a = (int) this.c.getStrokeWidth();
            this.f28479j.add(dVar);
            this.f28480k.clear();
            invalidate();
            f fVar = this.f28478i;
            if (fVar != null) {
                ((DrawSignView) fVar).g();
            }
        }
    }

    public void setSignaturePaintSize(int i10) {
        this.c.setStrokeWidth(i10);
        invalidate();
    }

    public SignaturePad(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ea.a.p("HGlWbhh0QnI_UCtkWD4=", "X46hmUd6");
        this.f28479j = new ArrayList();
        this.f28480k = new ArrayList();
        this.f28481l = 1;
        b(context);
    }

    public SignaturePad(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ea.a.p("HGlWbhh0QnI_UCtkWD4=", "TwOBbDp3");
        this.f28479j = new ArrayList();
        this.f28480k = new ArrayList();
        this.f28481l = 1;
        b(context);
    }
}
