package p000do;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.activity.r;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: PhotoViewAttacher.java */
/* renamed from: do.k  reason: invalid package */
/* loaded from: classes3.dex */
public final class k implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f16282h;

    /* renamed from: i  reason: collision with root package name */
    public final GestureDetector f16283i;

    /* renamed from: j  reason: collision with root package name */
    public final p000do.b f16284j;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f16290p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnLongClickListener f16291q;

    /* renamed from: r  reason: collision with root package name */
    public f f16292r;

    /* renamed from: w  reason: collision with root package name */
    public final a f16297w;

    /* renamed from: a  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f16276a = new AccelerateDecelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public int f16277b = 200;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f16278d = 1.75f;

    /* renamed from: e  reason: collision with root package name */
    public float f16279e = 6.0f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f16280f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f16281g = false;

    /* renamed from: k  reason: collision with root package name */
    public final Matrix f16285k = new Matrix();

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f16286l = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f16287m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    public final RectF f16288n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    public final float[] f16289o = new float[9];

    /* renamed from: s  reason: collision with root package name */
    public int f16293s = 2;

    /* renamed from: t  reason: collision with root package name */
    public int f16294t = 2;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16295u = true;

    /* renamed from: v  reason: collision with root package name */
    public ImageView.ScaleType f16296v = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$a */
    /* loaded from: classes3.dex */
    public class a implements p000do.c {
        public a() {
        }

        public final void a(float f10, float f11, float f12) {
            k kVar = k.this;
            if (kVar.f() < kVar.f16279e || f10 < 1.0f) {
                kVar.getClass();
                kVar.f16287m.postScale(f10, f10, f11, f12);
                kVar.a();
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$b */
    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            k.this.getClass();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnLongClickListener onLongClickListener = kVar.f16291q;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(kVar.f16282h);
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$c */
    /* loaded from: classes3.dex */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            k kVar = k.this;
            try {
                float f10 = kVar.f();
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f11 = kVar.f16278d;
                if (f10 < f11) {
                    kVar.g(f11, x4, y10, true);
                } else {
                    if (f10 >= f11) {
                        float f12 = kVar.f16279e;
                        if (f10 < f12) {
                            kVar.g(f12, x4, y10, true);
                        }
                    }
                    kVar.g(kVar.c, x4, y10, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            k kVar = k.this;
            View.OnClickListener onClickListener = kVar.f16290p;
            if (onClickListener != null) {
                onClickListener.onClick(kVar.f16282h);
            }
            RectF c = kVar.c();
            float x4 = motionEvent.getX();
            float y10 = motionEvent.getY();
            kVar.getClass();
            if (c != null) {
                if (c.contains(x4, y10)) {
                    c.width();
                    c.height();
                    kVar.getClass();
                    return true;
                }
                kVar.getClass();
                return false;
            }
            return false;
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$d */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16301a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f16301a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16301a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16301a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16301a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$e */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final float f16302a;

        /* renamed from: b  reason: collision with root package name */
        public final float f16303b;
        public final long c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        public final float f16304d;

        /* renamed from: e  reason: collision with root package name */
        public final float f16305e;

        public e(float f10, float f11, float f12, float f13) {
            this.f16302a = f12;
            this.f16303b = f13;
            this.f16304d = f10;
            this.f16305e = f11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            float interpolation = kVar.f16276a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / kVar.f16277b));
            float f10 = this.f16305e;
            float f11 = this.f16304d;
            float l10 = r.l(f10, f11, interpolation, f11) / kVar.f();
            float f12 = this.f16303b;
            kVar.f16297w.a(l10, this.f16302a, f12);
            if (interpolation < 1.0f) {
                kVar.f16282h.postOnAnimation(this);
            }
        }
    }

    /* compiled from: PhotoViewAttacher.java */
    /* renamed from: do.k$f */
    /* loaded from: classes3.dex */
    public class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final OverScroller f16307a;

        /* renamed from: b  reason: collision with root package name */
        public int f16308b;
        public int c;

        public f(Context context) {
            this.f16307a = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f16307a;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                k kVar = k.this;
                kVar.f16287m.postTranslate(this.f16308b - currX, this.c - currY);
                kVar.a();
                this.f16308b = currX;
                this.c = currY;
                kVar.f16282h.postOnAnimation(this);
            }
        }
    }

    public k(ImageView imageView) {
        a aVar = new a();
        this.f16297w = aVar;
        this.f16282h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f16284j = new p000do.b(imageView.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.f16283i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public final void a() {
        if (b()) {
            this.f16282h.setImageMatrix(e());
        }
    }

    public final boolean b() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF d10 = d(e());
        if (d10 == null) {
            return false;
        }
        float height = d10.height();
        float width = d10.width();
        ImageView imageView = this.f16282h;
        float height2 = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        float f15 = 0.0f;
        if (height <= height2) {
            int i10 = d.f16301a[this.f16296v.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (height2 - height) / 2.0f;
                    f14 = d10.top;
                } else {
                    f13 = height2 - height;
                    f14 = d10.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -d10.top;
            }
            this.f16294t = 2;
        } else {
            float f16 = d10.top;
            if (f16 > 0.0f) {
                this.f16294t = 0;
                f10 = -f16;
            } else {
                float f17 = d10.bottom;
                if (f17 < height2) {
                    this.f16294t = 1;
                    f10 = height2 - f17;
                } else {
                    this.f16294t = -1;
                    f10 = 0.0f;
                }
            }
        }
        float width2 = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        if (width <= width2) {
            int i11 = d.f16301a[this.f16296v.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (width2 - width) / 2.0f;
                    f12 = d10.left;
                } else {
                    f11 = width2 - width;
                    f12 = d10.left;
                }
                f15 = f11 - f12;
            } else {
                f15 = -d10.left;
            }
            this.f16293s = 2;
        } else {
            float f18 = d10.left;
            if (f18 > 0.0f) {
                this.f16293s = 0;
                f15 = -f18;
            } else {
                float f19 = d10.right;
                if (f19 < width2) {
                    f15 = width2 - f19;
                    this.f16293s = 1;
                } else {
                    this.f16293s = -1;
                }
            }
        }
        this.f16287m.postTranslate(f15, f10);
        return true;
    }

    public final RectF c() {
        b();
        return d(e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.f16282h.getDrawable();
        if (drawable != null) {
            RectF rectF = this.f16288n;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
            return rectF;
        }
        return null;
    }

    public final Matrix e() {
        Matrix matrix = this.f16286l;
        matrix.set(this.f16285k);
        matrix.postConcat(this.f16287m);
        return matrix;
    }

    public final float f() {
        Matrix matrix = this.f16287m;
        float[] fArr = this.f16289o;
        matrix.getValues(fArr);
        matrix.getValues(fArr);
        return (float) Math.sqrt(((float) Math.pow(fArr[0], 2.0d)) + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void g(float f10, float f11, float f12, boolean z10) {
        if (f10 >= this.c && f10 <= this.f16279e) {
            if (z10) {
                this.f16282h.post(new e(f(), f10, f11, f12));
                return;
            }
            this.f16287m.setScale(f10, f10, f11, f12);
            a();
            return;
        }
        throw new IllegalArgumentException(ea.a.p("HGNQbBwgWnUpdGpiECAfaUFoB25ldA1lSnIobgxlR28pIFxpF1NUYTZlamEbZEhtVHg9YyRsZQ==", "GyrijIkg"));
    }

    public final void h() {
        boolean z10 = this.f16295u;
        ImageView imageView = this.f16282h;
        if (z10) {
            i(imageView.getDrawable());
            return;
        }
        Matrix matrix = this.f16287m;
        matrix.reset();
        matrix.postRotate(0.0f);
        a();
        imageView.setImageMatrix(e());
        b();
    }

    public final void i(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        ImageView imageView = this.f16282h;
        float width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        float height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.f16285k;
        matrix.reset();
        float f10 = intrinsicWidth;
        float f11 = width / f10;
        float f12 = intrinsicHeight;
        float f13 = height / f12;
        ImageView.ScaleType scaleType = this.f16296v;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f10) / 2.0f, (height - f12) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f11, f13);
            matrix.postScale(max, max);
            matrix.postTranslate((width - (f10 * max)) / 2.0f, (height - (f12 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f11, f13));
            matrix.postScale(min, min);
            matrix.postTranslate((width - (f10 * min)) / 2.0f, (height - (f12 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f10, f12);
            RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
            if (((int) 0.0f) % ShapeTypes.MATH_EQUAL != 0) {
                rectF = new RectF(0.0f, 0.0f, f12, f10);
            }
            int i10 = d.f16301a[this.f16296v.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    }
                } else {
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                }
            } else {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            }
        }
        Matrix matrix2 = this.f16287m;
        matrix2.reset();
        matrix2.postRotate(0.0f);
        a();
        imageView.setImageMatrix(e());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 != i14 || i11 != i15 || i12 != i16 || i13 != i17) {
            i(this.f16282h.getDrawable());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b8  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f16295u
            r1 = 0
            if (r0 == 0) goto Lc4
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            r2 = 1
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == 0) goto Lc4
            int r0 = r12.getAction()
            if (r0 == 0) goto L73
            if (r0 == r2) goto L20
            r3 = 3
            if (r0 == r3) goto L20
            goto L88
        L20:
            float r0 = r10.f()
            float r3 = r10.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L49
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L88
            do.k$e r9 = new do.k$e
            float r5 = r10.f()
            float r6 = r10.c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L71
        L49:
            float r0 = r10.f()
            float r3 = r10.f16279e
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L88
            android.graphics.RectF r0 = r10.c()
            if (r0 == 0) goto L88
            do.k$e r9 = new do.k$e
            float r5 = r10.f()
            float r6 = r10.f16279e
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L71:
            r11 = r2
            goto L89
        L73:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L7c
            r11.requestDisallowInterceptTouchEvent(r2)
        L7c:
            do.k$f r11 = r10.f16292r
            if (r11 == 0) goto L88
            android.widget.OverScroller r11 = r11.f16307a
            r11.forceFinished(r2)
            r11 = 0
            r10.f16292r = r11
        L88:
            r11 = r1
        L89:
            do.b r0 = r10.f16284j
            if (r0 == 0) goto Lb8
            android.view.ScaleGestureDetector r11 = r0.c
            boolean r3 = r11.isInProgress()
            boolean r4 = r0.f16270e
            r11.onTouchEvent(r12)     // Catch: java.lang.IllegalArgumentException -> L9b
            r0.a(r12)     // Catch: java.lang.IllegalArgumentException -> L9b
        L9b:
            if (r3 != 0) goto La5
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto La5
            r11 = r2
            goto La6
        La5:
            r11 = r1
        La6:
            if (r4 != 0) goto Lae
            boolean r0 = r0.f16270e
            if (r0 != 0) goto Lae
            r0 = r2
            goto Laf
        Lae:
            r0 = r1
        Laf:
            if (r11 == 0) goto Lb4
            if (r0 == 0) goto Lb4
            r1 = r2
        Lb4:
            r10.f16281g = r1
            r1 = r2
            goto Lb9
        Lb8:
            r1 = r11
        Lb9:
            android.view.GestureDetector r11 = r10.f16283i
            if (r11 == 0) goto Lc4
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Lc4
            r1 = r2
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000do.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
