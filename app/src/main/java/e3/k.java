package e3;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: LottieDrawable.java */
/* loaded from: classes.dex */
public final class k extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f16368a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    public e3.e f16369b;
    public final p3.d c;

    /* renamed from: d  reason: collision with root package name */
    public float f16370d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16371e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16372f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<o> f16373g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView.ScaleType f16374h;

    /* renamed from: i  reason: collision with root package name */
    public i3.b f16375i;

    /* renamed from: j  reason: collision with root package name */
    public String f16376j;

    /* renamed from: k  reason: collision with root package name */
    public i3.a f16377k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16378l;

    /* renamed from: m  reason: collision with root package name */
    public com.airbnb.lottie.model.layer.b f16379m;

    /* renamed from: n  reason: collision with root package name */
    public int f16380n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16381o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f16382p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f16383q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f16384r;

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16385a;

        public a(String str) {
            this.f16385a = str;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.l(this.f16385a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class b implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16387a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f16388b;

        public b(int i10, int i11) {
            this.f16387a = i10;
            this.f16388b = i11;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.k(this.f16387a, this.f16388b);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16389a;

        public c(int i10) {
            this.f16389a = i10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.g(this.f16389a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class d implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f16391a;

        public d(float f10) {
            this.f16391a = f10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.p(this.f16391a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class e implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j3.d f16393a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f16394b;
        public final /* synthetic */ n3.a c;

        public e(j3.d dVar, Object obj, n3.a aVar) {
            this.f16393a = dVar;
            this.f16394b = obj;
            this.c = aVar;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.a(this.f16393a, this.f16394b, this.c);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            k kVar = k.this;
            com.airbnb.lottie.model.layer.b bVar = kVar.f16379m;
            if (bVar != null) {
                p3.d dVar = kVar.c;
                e3.e eVar = dVar.f23675j;
                if (eVar == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar.f23671f;
                    float f12 = eVar.f16350k;
                    f10 = (f11 - f12) / (eVar.f16351l - f12);
                }
                bVar.o(f10);
            }
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class g implements o {
        public g() {
        }

        @Override // e3.k.o
        public final void run() {
            k.this.e();
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class h implements o {
        public h() {
        }

        @Override // e3.k.o
        public final void run() {
            k.this.f();
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class i implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16399a;

        public i(int i10) {
            this.f16399a = i10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.m(this.f16399a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class j implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f16401a;

        public j(float f10) {
            this.f16401a = f10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.o(this.f16401a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* renamed from: e3.k$k  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0208k implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f16403a;

        public C0208k(int i10) {
            this.f16403a = i10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.h(this.f16403a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class l implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f16405a;

        public l(float f10) {
            this.f16405a = f10;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.j(this.f16405a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class m implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16407a;

        public m(String str) {
            this.f16407a = str;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.n(this.f16407a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16409a;

        public n(String str) {
            this.f16409a = str;
        }

        @Override // e3.k.o
        public final void run() {
            k.this.i(this.f16409a);
        }
    }

    /* compiled from: LottieDrawable.java */
    /* loaded from: classes.dex */
    public interface o {
        void run();
    }

    public k() {
        p3.d dVar = new p3.d();
        this.c = dVar;
        this.f16370d = 1.0f;
        this.f16371e = true;
        this.f16372f = false;
        new HashSet();
        this.f16373g = new ArrayList<>();
        f fVar = new f();
        this.f16380n = FunctionEval.FunctionID.EXTERNAL_FUNC;
        this.f16383q = true;
        this.f16384r = false;
        dVar.addUpdateListener(fVar);
    }

    public final <T> void a(j3.d dVar, T t4, n3.a aVar) {
        float f10;
        com.airbnb.lottie.model.layer.b bVar = this.f16379m;
        if (bVar == null) {
            this.f16373g.add(new e(dVar, t4, aVar));
            return;
        }
        boolean z10 = true;
        if (dVar == j3.d.c) {
            bVar.c(aVar, t4);
        } else {
            j3.e eVar = dVar.f19033b;
            if (eVar != null) {
                eVar.c(aVar, t4);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f16379m.g(dVar, 0, arrayList, new j3.d(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((j3.d) arrayList.get(i10)).f19033b.c(aVar, t4);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t4 == e3.o.A) {
                p3.d dVar2 = this.c;
                e3.e eVar2 = dVar2.f23675j;
                if (eVar2 == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar2.f23671f;
                    float f12 = eVar2.f16350k;
                    f10 = (f11 - f12) / (eVar2.f16351l - f12);
                }
                p(f10);
            }
        }
    }

    public final void b() {
        e3.e eVar = this.f16369b;
        JsonReader.a aVar = o3.p.f22722a;
        Rect rect = eVar.f16349j;
        Layer layer = new Layer(Collections.emptyList(), eVar, "__container", -1L, Layer.LayerType.PRE_COMP, -1L, null, Collections.emptyList(), new k3.k(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.MatteType.NONE, null, false);
        e3.e eVar2 = this.f16369b;
        this.f16379m = new com.airbnb.lottie.model.layer.b(this, layer, eVar2.f16348i, eVar2);
    }

    public final void c() {
        p3.d dVar = this.c;
        if (dVar.f23676k) {
            dVar.cancel();
        }
        this.f16369b = null;
        this.f16379m = null;
        this.f16375i = null;
        dVar.f23675j = null;
        dVar.f23673h = -2.1474836E9f;
        dVar.f23674i = 2.1474836E9f;
        invalidateSelf();
    }

    public final void d(Canvas canvas) {
        float f10;
        float f11;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        ImageView.ScaleType scaleType2 = this.f16374h;
        Matrix matrix = this.f16368a;
        int i10 = -1;
        if (scaleType == scaleType2) {
            if (this.f16379m != null) {
                Rect bounds = getBounds();
                float width = bounds.width() / this.f16369b.f16349j.width();
                float height = bounds.height() / this.f16369b.f16349j.height();
                if (this.f16383q) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f11 = 1.0f / min;
                        width /= f11;
                        height /= f11;
                    } else {
                        f11 = 1.0f;
                    }
                    if (f11 > 1.0f) {
                        i10 = canvas.save();
                        float width2 = bounds.width() / 2.0f;
                        float height2 = bounds.height() / 2.0f;
                        float f12 = width2 * min;
                        float f13 = min * height2;
                        canvas.translate(width2 - f12, height2 - f13);
                        canvas.scale(f11, f11, f12, f13);
                    }
                }
                matrix.reset();
                matrix.preScale(width, height);
                this.f16379m.f(canvas, matrix, this.f16380n);
                if (i10 > 0) {
                    canvas.restoreToCount(i10);
                }
            }
        } else if (this.f16379m != null) {
            float f14 = this.f16370d;
            float min2 = Math.min(canvas.getWidth() / this.f16369b.f16349j.width(), canvas.getHeight() / this.f16369b.f16349j.height());
            if (f14 > min2) {
                f10 = this.f16370d / min2;
            } else {
                min2 = f14;
                f10 = 1.0f;
            }
            if (f10 > 1.0f) {
                i10 = canvas.save();
                float width3 = this.f16369b.f16349j.width() / 2.0f;
                float height3 = this.f16369b.f16349j.height() / 2.0f;
                float f15 = width3 * min2;
                float f16 = height3 * min2;
                float f17 = this.f16370d;
                canvas.translate((width3 * f17) - f15, (f17 * height3) - f16);
                canvas.scale(f10, f10, f15, f16);
            }
            matrix.reset();
            matrix.preScale(min2, min2);
            this.f16379m.f(canvas, matrix, this.f16380n);
            if (i10 > 0) {
                canvas.restoreToCount(i10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f16384r = false;
        if (this.f16372f) {
            try {
                d(canvas);
            } catch (Throwable unused) {
                p3.c.f23668a.getClass();
            }
        } else {
            d(canvas);
        }
        androidx.activity.s.y();
    }

    public final void e() {
        float e10;
        float d10;
        if (this.f16379m == null) {
            this.f16373g.add(new g());
            return;
        }
        boolean z10 = this.f16371e;
        p3.d dVar = this.c;
        if (z10 || dVar.getRepeatCount() == 0) {
            dVar.f23676k = true;
            boolean f10 = dVar.f();
            Iterator it = dVar.f23666b.iterator();
            while (it.hasNext()) {
                Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(dVar, f10);
                } else {
                    animatorListener.onAnimationStart(dVar);
                }
            }
            if (dVar.f()) {
                e10 = dVar.d();
            } else {
                e10 = dVar.e();
            }
            dVar.h((int) e10);
            dVar.f23670e = 0L;
            dVar.f23672g = 0;
            if (dVar.f23676k) {
                dVar.g(false);
                Choreographer.getInstance().postFrameCallback(dVar);
            }
        }
        if (!this.f16371e) {
            if (dVar.c < 0.0f) {
                d10 = dVar.e();
            } else {
                d10 = dVar.d();
            }
            g((int) d10);
            dVar.g(true);
            dVar.a(dVar.f());
        }
    }

    public final void f() {
        float d10;
        if (this.f16379m == null) {
            this.f16373g.add(new h());
            return;
        }
        boolean z10 = this.f16371e;
        p3.d dVar = this.c;
        if (z10 || dVar.getRepeatCount() == 0) {
            dVar.f23676k = true;
            dVar.g(false);
            Choreographer.getInstance().postFrameCallback(dVar);
            dVar.f23670e = 0L;
            if (dVar.f() && dVar.f23671f == dVar.e()) {
                dVar.f23671f = dVar.d();
            } else if (!dVar.f() && dVar.f23671f == dVar.d()) {
                dVar.f23671f = dVar.e();
            }
        }
        if (!this.f16371e) {
            if (dVar.c < 0.0f) {
                d10 = dVar.e();
            } else {
                d10 = dVar.d();
            }
            g((int) d10);
            dVar.g(true);
            dVar.a(dVar.f());
        }
    }

    public final void g(int i10) {
        if (this.f16369b == null) {
            this.f16373g.add(new c(i10));
        } else {
            this.c.h(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16380n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            return -1;
        }
        return (int) (eVar.f16349j.height() * this.f16370d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            return -1;
        }
        return (int) (eVar.f16349j.width() * this.f16370d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(int i10) {
        if (this.f16369b == null) {
            this.f16373g.add(new C0208k(i10));
            return;
        }
        p3.d dVar = this.c;
        dVar.i(dVar.f23673h, i10 + 0.99f);
    }

    public final void i(String str) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new n(str));
            return;
        }
        j3.g c10 = eVar.c(str);
        if (c10 != null) {
            h((int) (c10.f19037b + c10.c));
            return;
        }
        throw new IllegalArgumentException(a6.h.d("Cannot find marker with name ", str, "."));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f16384r) {
            return;
        }
        this.f16384r = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        p3.d dVar = this.c;
        if (dVar == null) {
            return false;
        }
        return dVar.f23676k;
    }

    public final void j(float f10) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new l(f10));
            return;
        }
        float f11 = eVar.f16350k;
        float f12 = eVar.f16351l;
        PointF pointF = p3.f.f23678a;
        h((int) androidx.activity.r.l(f12, f11, f10, f11));
    }

    public final void k(int i10, int i11) {
        if (this.f16369b == null) {
            this.f16373g.add(new b(i10, i11));
            return;
        }
        this.c.i(i10, i11 + 0.99f);
    }

    public final void l(String str) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new a(str));
            return;
        }
        j3.g c10 = eVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f19037b;
            k(i10, ((int) c10.c) + i10);
            return;
        }
        throw new IllegalArgumentException(a6.h.d("Cannot find marker with name ", str, "."));
    }

    public final void m(int i10) {
        if (this.f16369b == null) {
            this.f16373g.add(new i(i10));
            return;
        }
        p3.d dVar = this.c;
        dVar.i(i10, (int) dVar.f23674i);
    }

    public final void n(String str) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new m(str));
            return;
        }
        j3.g c10 = eVar.c(str);
        if (c10 != null) {
            m((int) c10.f19037b);
            return;
        }
        throw new IllegalArgumentException(a6.h.d("Cannot find marker with name ", str, "."));
    }

    public final void o(float f10) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new j(f10));
            return;
        }
        float f11 = eVar.f16350k;
        float f12 = eVar.f16351l;
        PointF pointF = p3.f.f23678a;
        m((int) androidx.activity.r.l(f12, f11, f10, f11));
    }

    public final void p(float f10) {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            this.f16373g.add(new d(f10));
            return;
        }
        float f11 = eVar.f16350k;
        float f12 = eVar.f16351l;
        PointF pointF = p3.f.f23678a;
        this.c.h(androidx.activity.r.l(f12, f11, f10, f11));
        androidx.activity.s.y();
    }

    public final void q() {
        e3.e eVar = this.f16369b;
        if (eVar == null) {
            return;
        }
        float f10 = this.f16370d;
        setBounds(0, 0, (int) (eVar.f16349j.width() * f10), (int) (this.f16369b.f16349j.height() * f10));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f16380n = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        p3.c.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && !((View) callback).isInEditMode()) {
            e();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f16373g.clear();
        p3.d dVar = this.c;
        dVar.g(true);
        dVar.a(dVar.f());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
