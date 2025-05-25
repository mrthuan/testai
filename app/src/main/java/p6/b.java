package p6;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.activity.r;

/* compiled from: OCRPreviewAttacher.java */
/* loaded from: classes.dex */
public final class b implements View.OnTouchListener, p6.c, View.OnLayoutChangeListener {

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f23740h;

    /* renamed from: i  reason: collision with root package name */
    public final GestureDetector f23741i;

    /* renamed from: j  reason: collision with root package name */
    public final p6.a f23742j;

    /* renamed from: p  reason: collision with root package name */
    public View.OnClickListener f23748p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnLongClickListener f23749q;

    /* renamed from: r  reason: collision with root package name */
    public e f23750r;

    /* renamed from: a  reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f23734a = new AccelerateDecelerateInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public int f23735b = 200;
    public float c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f23736d = 1.75f;

    /* renamed from: e  reason: collision with root package name */
    public float f23737e = 3.0f;

    /* renamed from: f  reason: collision with root package name */
    public boolean f23738f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23739g = false;

    /* renamed from: k  reason: collision with root package name */
    public final Matrix f23743k = new Matrix();

    /* renamed from: l  reason: collision with root package name */
    public final Matrix f23744l = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f23745m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    public final RectF f23746n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    public final float[] f23747o = new float[9];

    /* renamed from: s  reason: collision with root package name */
    public int f23751s = 2;

    /* renamed from: t  reason: collision with root package name */
    public boolean f23752t = true;

    /* renamed from: u  reason: collision with root package name */
    public ImageView.ScaleType f23753u = ImageView.ScaleType.FIT_CENTER;

    /* compiled from: OCRPreviewAttacher.java */
    /* loaded from: classes.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            b.this.getClass();
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            b bVar = b.this;
            View.OnLongClickListener onLongClickListener = bVar.f23749q;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(bVar.f23740h);
            }
        }
    }

    /* compiled from: OCRPreviewAttacher.java */
    /* renamed from: p6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class GestureDetector$OnDoubleTapListenerC0327b implements GestureDetector.OnDoubleTapListener {
        public GestureDetector$OnDoubleTapListenerC0327b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            b bVar = b.this;
            try {
                float h10 = bVar.h();
                float x4 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = bVar.f23736d;
                if (h10 < f10) {
                    bVar.i(f10, x4, y10, true);
                } else {
                    if (h10 >= f10) {
                        float f11 = bVar.f23737e;
                        if (h10 < f11) {
                            bVar.i(f11, x4, y10, true);
                        }
                    }
                    bVar.i(bVar.c, x4, y10, true);
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
            b bVar = b.this;
            View.OnClickListener onClickListener = bVar.f23748p;
            if (onClickListener != null) {
                onClickListener.onClick(bVar.f23740h);
            }
            bVar.e();
            RectF f10 = bVar.f(bVar.g());
            if (f10 != null && f10.contains(motionEvent.getX(), motionEvent.getY())) {
                f10.width();
                f10.height();
                return true;
            }
            return false;
        }
    }

    /* compiled from: OCRPreviewAttacher.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23756a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f23756a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23756a[ImageView.ScaleType.FIT_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: OCRPreviewAttacher.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final float f23757a;

        /* renamed from: b  reason: collision with root package name */
        public final float f23758b;
        public final long c = System.currentTimeMillis();

        /* renamed from: d  reason: collision with root package name */
        public final float f23759d;

        /* renamed from: e  reason: collision with root package name */
        public final float f23760e;

        public d(float f10, float f11, float f12, float f13) {
            this.f23757a = f12;
            this.f23758b = f13;
            this.f23759d = f10;
            this.f23760e = f11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            float interpolation = bVar.f23734a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / bVar.f23735b));
            float f10 = this.f23760e;
            float f11 = this.f23759d;
            bVar.a(r.l(f10, f11, interpolation, f11) / bVar.h(), this.f23757a, this.f23758b);
            if (interpolation < 1.0f) {
                bVar.f23740h.postOnAnimation(this);
            }
        }
    }

    /* compiled from: OCRPreviewAttacher.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final OverScroller f23762a;

        /* renamed from: b  reason: collision with root package name */
        public int f23763b;
        public int c;

        public e(Context context) {
            this.f23762a = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller = this.f23762a;
            if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                b bVar = b.this;
                bVar.f23745m.postTranslate(this.f23763b - currX, this.c - currY);
                Matrix g10 = bVar.g();
                ImageView imageView = bVar.f23740h;
                imageView.setImageMatrix(g10);
                this.f23763b = currX;
                this.c = currY;
                imageView.postOnAnimation(this);
            }
        }
    }

    public b(ImageView imageView) {
        this.f23740h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (!imageView.isInEditMode()) {
            this.f23742j = new p6.a(imageView.getContext(), this);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new a());
            this.f23741i = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC0327b());
        }
    }

    @Override // p6.c
    public final void a(float f10, float f11, float f12) {
        if (h() < this.f23737e || f10 < 1.0f) {
            if (h() > this.c || f10 > 1.0f) {
                this.f23745m.postScale(f10, f10, f11, f12);
                d();
            }
        }
    }

    @Override // p6.c
    public final void b(float f10, float f11) {
        p6.a aVar = this.f23742j;
        if (!aVar.a()) {
            this.f23745m.postTranslate(f10, f11);
            d();
            ViewParent parent = this.f23740h.getParent();
            if (this.f23738f && !aVar.a() && !this.f23739g) {
                int i10 = this.f23751s;
                if ((i10 == 2 || ((i10 == 0 && f10 >= 1.0f) || (i10 == 1 && f10 <= -1.0f))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override // p6.c
    public final void c(float f10, float f11) {
        int i10;
        int i11;
        int i12;
        int i13;
        ImageView imageView = this.f23740h;
        e eVar = new e(imageView.getContext());
        this.f23750r = eVar;
        int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        int i14 = (int) f10;
        int i15 = (int) f11;
        e();
        RectF f12 = f(g());
        if (f12 != null) {
            int round = Math.round(-f12.left);
            float f13 = width;
            if (f13 < f12.width()) {
                i11 = Math.round(f12.width() - f13);
                i10 = 0;
            } else {
                i10 = round;
                i11 = i10;
            }
            int round2 = Math.round(-f12.top);
            float f14 = height;
            if (f14 < f12.height()) {
                i13 = Math.round(f12.height() - f14);
                i12 = 0;
            } else {
                i12 = round2;
                i13 = i12;
            }
            eVar.f23763b = round;
            eVar.c = round2;
            if (round != i11 || round2 != i13) {
                eVar.f23762a.fling(round, round2, i14, i15, i10, i11, i12, i13, 0, 0);
            }
        }
        imageView.post(this.f23750r);
    }

    public final void d() {
        if (e()) {
            this.f23740h.setImageMatrix(g());
        }
    }

    public final boolean e() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF f15 = f(g());
        if (f15 == null) {
            return false;
        }
        float height = f15.height();
        float width = f15.width();
        ImageView imageView = this.f23740h;
        float height2 = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        float f16 = 0.0f;
        if (height <= height2) {
            int i10 = c.f23756a[this.f23753u.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    height2 = (height2 - height) / 2.0f;
                    f11 = f15.top;
                } else {
                    height2 -= height;
                    f11 = f15.top;
                }
                f12 = height2 - f11;
            } else {
                f10 = f15.top;
                f12 = -f10;
            }
        } else {
            f10 = f15.top;
            if (f10 <= 0.0f) {
                f11 = f15.bottom;
                if (f11 >= height2) {
                    f12 = 0.0f;
                }
                f12 = height2 - f11;
            }
            f12 = -f10;
        }
        float width2 = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        if (width <= width2) {
            int i11 = c.f23756a[this.f23753u.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    f13 = (width2 - width) / 2.0f;
                    f14 = f15.left;
                } else {
                    f13 = width2 - width;
                    f14 = f15.left;
                }
                f16 = f13 - f14;
            } else {
                f16 = -f15.left;
            }
            this.f23751s = 2;
        } else {
            float f17 = f15.left;
            if (f17 > 0.0f) {
                this.f23751s = 0;
                f16 = -f17;
            } else {
                float f18 = f15.right;
                if (f18 < width2) {
                    f16 = width2 - f18;
                    this.f23751s = 1;
                } else {
                    this.f23751s = -1;
                }
            }
        }
        this.f23745m.postTranslate(f16, f12);
        return true;
    }

    public final RectF f(Matrix matrix) {
        Drawable drawable = this.f23740h.getDrawable();
        if (drawable != null) {
            RectF rectF = this.f23746n;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
            return rectF;
        }
        return null;
    }

    public final Matrix g() {
        Matrix matrix = this.f23744l;
        matrix.set(this.f23743k);
        matrix.postConcat(this.f23745m);
        return matrix;
    }

    public final float h() {
        Matrix matrix = this.f23745m;
        float[] fArr = this.f23747o;
        matrix.getValues(fArr);
        matrix.getValues(fArr);
        return (float) Math.sqrt(((float) Math.pow(fArr[0], 2.0d)) + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void i(float f10, float f11, float f12, boolean z10) {
        if (f10 >= this.c && f10 <= this.f23737e) {
            if (z10) {
                this.f23740h.post(new d(h(), f10, f11, f12));
                return;
            }
            this.f23745m.setScale(f10, f10, f11, f12);
            d();
            return;
        }
        throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
    }

    public final void j() {
        boolean z10 = this.f23752t;
        ImageView imageView = this.f23740h;
        if (z10) {
            k(imageView.getDrawable());
            return;
        }
        Matrix matrix = this.f23745m;
        matrix.reset();
        matrix.postRotate(0.0f);
        d();
        imageView.setImageMatrix(g());
        e();
    }

    public final void k(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.f23740h;
            imageView.getHeight();
            imageView.getPaddingTop();
            imageView.getPaddingBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            drawable.getIntrinsicHeight();
            Matrix matrix = this.f23743k;
            matrix.reset();
            float width = ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / intrinsicWidth;
            matrix.postScale(width, width);
            Matrix matrix2 = this.f23745m;
            matrix2.reset();
            matrix2.postRotate(0.0f);
            d();
            imageView.setImageMatrix(g());
            e();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        k(this.f23740h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f23752t
            r1 = 0
            if (r0 == 0) goto La2
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
            if (r0 == 0) goto La2
            int r0 = r12.getAction()
            if (r0 == 0) goto L51
            if (r0 == r2) goto L20
            r3 = 3
            if (r0 == r3) goto L20
            goto L66
        L20:
            float r0 = r10.h()
            float r3 = r10.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L66
            r10.e()
            android.graphics.Matrix r0 = r10.g()
            android.graphics.RectF r0 = r10.f(r0)
            if (r0 == 0) goto L66
            p6.b$d r9 = new p6.b$d
            float r5 = r10.h()
            float r6 = r10.c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            r11 = r2
            goto L67
        L51:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L5a
            r11.requestDisallowInterceptTouchEvent(r2)
        L5a:
            p6.b$e r11 = r10.f23750r
            if (r11 == 0) goto L66
            android.widget.OverScroller r11 = r11.f23762a
            r11.forceFinished(r2)
            r11 = 0
            r10.f23750r = r11
        L66:
            r11 = r1
        L67:
            p6.a r0 = r10.f23742j
            if (r0 == 0) goto L96
            boolean r11 = r0.a()
            boolean r3 = r0.f23727e
            android.view.ScaleGestureDetector r4 = r0.c     // Catch: java.lang.IllegalArgumentException -> L79
            r4.onTouchEvent(r12)     // Catch: java.lang.IllegalArgumentException -> L79
            r0.b(r12)     // Catch: java.lang.IllegalArgumentException -> L79
        L79:
            if (r11 != 0) goto L83
            boolean r11 = r0.a()
            if (r11 != 0) goto L83
            r11 = r2
            goto L84
        L83:
            r11 = r1
        L84:
            if (r3 != 0) goto L8c
            boolean r0 = r0.f23727e
            if (r0 != 0) goto L8c
            r0 = r2
            goto L8d
        L8c:
            r0 = r1
        L8d:
            if (r11 == 0) goto L92
            if (r0 == 0) goto L92
            r1 = r2
        L92:
            r10.f23739g = r1
            r1 = r2
            goto L97
        L96:
            r1 = r11
        L97:
            android.view.GestureDetector r11 = r10.f23741i
            if (r11 == 0) goto La2
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto La2
            r1 = r2
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
