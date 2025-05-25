package lib.zj.pdfeditor;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Scroller;
import java.lang.ref.SoftReference;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class ReaderViewBackUp extends AdapterView<Adapter> implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, Runnable, GestureDetector.OnDoubleTapListener {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f21438t = 0;

    /* renamed from: a  reason: collision with root package name */
    public Adapter f21439a;

    /* renamed from: b  reason: collision with root package name */
    public int f21440b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray<View> f21441d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<SoftReference<View>> f21442e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21443f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21444g;

    /* renamed from: h  reason: collision with root package name */
    public float f21445h;

    /* renamed from: i  reason: collision with root package name */
    public int f21446i;

    /* renamed from: j  reason: collision with root package name */
    public int f21447j;

    /* renamed from: k  reason: collision with root package name */
    public final GestureDetector f21448k;

    /* renamed from: l  reason: collision with root package name */
    public final ScaleGestureDetector f21449l;

    /* renamed from: m  reason: collision with root package name */
    public final Scroller f21450m;

    /* renamed from: n  reason: collision with root package name */
    public final r0 f21451n;

    /* renamed from: o  reason: collision with root package name */
    public int f21452o;

    /* renamed from: p  reason: collision with root package name */
    public int f21453p;

    /* renamed from: q  reason: collision with root package name */
    public float f21454q;

    /* renamed from: r  reason: collision with root package name */
    public float f21455r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f21456s;

    /* loaded from: classes3.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            ReaderViewBackUp.this.f21456s = false;
        }
    }

    public ReaderViewBackUp(Context context) {
        super(context);
        this.f21441d = new SparseArray<>();
        this.f21442e = new SparseArray<>();
        this.f21445h = 1.0f;
        this.f21456s = false;
        this.f21448k = new GestureDetector(this);
        this.f21449l = new ScaleGestureDetector(context, this);
        this.f21450m = new Scroller(context);
        this.f21451n = new r0(this, this);
        int i10 = context.getResources().getConfiguration().orientation;
    }

    public static Point a(Rect rect) {
        return new Point(Math.min(Math.max(0, rect.left), rect.right), Math.min(Math.max(0, rect.top), rect.bottom));
    }

    public final View b(int i10) {
        View view;
        SparseArray<View> sparseArray = this.f21441d;
        View view2 = sparseArray.get(i10);
        if (view2 != null) {
            return view2;
        }
        Adapter adapter = this.f21439a;
        SparseArray<SoftReference<View>> sparseArray2 = this.f21442e;
        if (sparseArray2.size() != 0 && sparseArray2.get(i10) != null) {
            view = sparseArray2.get(i10).get();
        } else {
            view = null;
        }
        View view3 = adapter.getView(i10, view, this);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        }
        addViewInLayout(view3, 0, layoutParams, true);
        sparseArray.append(i10, view3);
        e(view3);
        return view3;
    }

    public final Rect c(int i10, int i11, int i12, int i13) {
        if ((i12 - i10) / this.f21445h < getWidth()) {
            float f10 = (i10 + i12) / 2;
            int width = (int) (f10 - ((getWidth() / 2) * this.f21445h));
            i12 = (int) (((getWidth() / 2) * this.f21445h) + f10);
            i10 = width;
        }
        if ((i13 - i11) / this.f21445h < getHeight()) {
            float f11 = (i11 + i13) / 2;
            int height = (int) (f11 - ((getHeight() / 2) * this.f21445h));
            i13 = (int) (((getHeight() / 2) * this.f21445h) + f11);
            i11 = height;
        }
        int width2 = getWidth() - i12;
        int i14 = -i10;
        int height2 = getHeight() - i13;
        int i15 = -i11;
        if (width2 > i14) {
            width2 = (width2 + i14) / 2;
            i14 = width2;
        }
        if (height2 > i15) {
            height2 = (height2 + i15) / 2;
            i15 = height2;
        }
        return new Rect(width2, height2, i14, i15);
    }

    public final Rect d(View view) {
        if (view.getLeft() == 0 && view.getTop() == 0 && view.getTop() == 0 && view.getBottom() == 0) {
            return new Rect(0, 0, 0, 0);
        }
        return c(view.getLeft() + this.f21446i, view.getTop() + this.f21447j, view.getMeasuredWidth() + view.getLeft() + this.f21446i, view.getMeasuredHeight() + view.getTop() + this.f21447j);
    }

    public final void e(View view) {
        view.measure(0, 0);
        float min = Math.min(getWidth() / view.getMeasuredWidth(), getHeight() / view.getMeasuredHeight());
        view.measure(((int) (view.getMeasuredWidth() * min * this.f21445h)) | 1073741824, ((int) (view.getMeasuredHeight() * min * this.f21445h)) | 1073741824);
    }

    public final void f(View view) {
        Point a10 = a(d(view));
        this.f21453p = 0;
        this.f21452o = 0;
        int count = this.f21439a.getCount();
        Scroller scroller = this.f21450m;
        if (count > 2) {
            int i10 = a10.x;
            if (i10 != 0 || a10.y != 0) {
                scroller.startScroll(0, 0, i10, a10.y, 400);
            }
        } else {
            int i11 = a10.x;
            if (i11 != 0 || a10.y != 0) {
                scroller.startScroll(0, 0, i11, a10.y, 400);
            }
        }
        this.f21451n.a();
    }

    public final Point g(View view) {
        return new Point(Math.max((getWidth() - view.getMeasuredWidth()) / 2, 0), Math.max((getHeight() - view.getMeasuredHeight()) / 2, 0));
    }

    @Override // android.widget.AdapterView
    public Adapter getAdapter() {
        return this.f21439a;
    }

    public View getDisplayedView() {
        return this.f21441d.get(this.f21440b);
    }

    public int getDisplayedViewIndex() {
        return this.f21440b;
    }

    public int getPageCount() {
        Adapter adapter = this.f21439a;
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    @Override // android.widget.AdapterView
    public View getSelectedView() {
        return null;
    }

    public final Point h(View view) {
        return new Point((getWidth() - view.getMeasuredWidth()) / 2, (getHeight() - view.getMeasuredHeight()) / 2);
    }

    public final void i(View view) {
        new Point((int) Math.max((getWidth() - (view.getMeasuredWidth() / this.f21445h)) / 2.0f, 0.0f), (getHeight() - view.getMeasuredHeight()) / 2);
    }

    public final void j(View view) {
        new Point((getWidth() - view.getMeasuredWidth()) / 2, (int) Math.max((getHeight() - (view.getMeasuredHeight() / this.f21445h)) / 2.0f, 0.0f));
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r0 < 4.0f) goto L5;
     */
    @Override // android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onDoubleTap(android.view.MotionEvent r6) {
        /*
            r5 = this;
            float r0 = r5.f21445h
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r3 = 1072064102(0x3fe66666, float:1.8)
            if (r2 < 0) goto L10
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L10
            goto L1c
        L10:
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L1b
            r3 = 1082130432(0x40800000, float:4.0)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L1b
            goto L1c
        L1b:
            r3 = r1
        L1c:
            r2 = 2
            float[] r2 = new float[r2]
            r4 = 0
            r2[r4] = r0
            r0 = 1
            r2[r0] = r3
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r3.<init>()
            r2.setInterpolator(r3)
            lib.zj.pdfeditor.ReaderViewBackUp$b r3 = new lib.zj.pdfeditor.ReaderViewBackUp$b
            float r4 = r6.getX()
            float r6 = r6.getY()
            r3.<init>(r4, r6)
            float r6 = r5.f21445h
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L66
            int r6 = r5.getWidth()
            if (r6 <= 0) goto L66
            int r6 = r5.getHeight()
            if (r6 <= 0) goto L66
            lib.zj.pdfeditor.ReaderViewBackUp$b r3 = new lib.zj.pdfeditor.ReaderViewBackUp$b
            int r6 = r5.getWidth()
            float r6 = (float) r6
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r1
            r4 = 1103888384(0x41cc0000, float:25.5)
            float r6 = r6 + r4
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r1
            r3.<init>(r6, r4)
        L66:
            r2.addUpdateListener(r3)
            r2.addListener(r3)
            r3 = 350(0x15e, double:1.73E-321)
            r2.setDuration(r3)
            r2.start()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.ReaderViewBackUp.onDoubleTap(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f21450m.forceFinished(true);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View view;
        boolean z10;
        if (!this.f21444g && (view = this.f21441d.get(this.f21440b)) != null) {
            Rect d10 = d(view);
            if (f10 > 1500.0f) {
                z10 = true;
            } else if (f10 < -1500.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z10 || !z10) {
            }
            this.f21453p = 0;
            this.f21452o = 0;
            new Rect(d10).inset(-100, -100);
            View displayedView = getDisplayedView();
            int count = this.f21439a.getCount();
            Scroller scroller = this.f21450m;
            if (count <= 1) {
                scroller.fling(0, 0, (int) f10, (int) f11, -5000, 5000, d10.top, d10.bottom);
            } else if (getDisplayedViewIndex() == -1 && displayedView.getBottom() < getMeasuredHeight()) {
                f(displayedView);
            } else {
                scroller.fling(0, 0, (int) f10, (int) f11, -5000, 5000, d10.top, d10.bottom);
            }
            this.f21451n.a();
        }
        return true;
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int displayedViewIndex;
        boolean z11;
        int left;
        int top;
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        if (getWidth() > 0 && getHeight() > 0) {
            if (z10) {
                try {
                    PageView.E0 = new Point(getWidth(), getHeight());
                    if (getDisplayedView() != null && (displayedViewIndex = getDisplayedViewIndex()) >= 0 && displayedViewIndex < this.f21439a.getCount()) {
                        this.f21440b = displayedViewIndex;
                        Adapter adapter = this.f21439a;
                        if (adapter instanceof PDFPageAdapter) {
                            ((PDFPageAdapter) adapter).onMoveToChild(displayedViewIndex);
                        }
                        this.c = true;
                        requestLayout();
                    }
                } catch (OutOfMemoryError unused) {
                    if (!this.f21456s) {
                        this.f21456s = true;
                        AlertDialog create = new AlertDialog.Builder(getContext()).create();
                        create.setMessage("Out of memory during layout");
                        create.setButton(-3, "OK", new a());
                        create.show();
                        return;
                    }
                    return;
                }
            }
            if (!isInEditMode()) {
                SparseArray<View> sparseArray = this.f21441d;
                View view = sparseArray.get(this.f21440b);
                boolean z12 = this.c;
                SparseArray<SoftReference<View>> sparseArray2 = this.f21442e;
                r0 r0Var = this.f21451n;
                if (!z12) {
                    if (view != null && (this.f21446i != 0 || this.f21447j != 0)) {
                        g(view);
                        if (view.getLeft() + view.getMeasuredWidth() + 12.5d + this.f21446i < getWidth() / 2.0f && this.f21440b + 1 < this.f21439a.getCount()) {
                            post(new n0(this, view));
                            r0Var.a();
                            int i16 = this.f21440b + 1;
                            this.f21440b = i16;
                            Adapter adapter2 = this.f21439a;
                            if (adapter2 instanceof PDFPageAdapter) {
                                ((PDFPageAdapter) adapter2).onMoveToChild(i16);
                            }
                        }
                        if ((view.getLeft() - 12.5d) + this.f21446i >= getWidth() / 2.0f && this.f21440b > 0) {
                            post(new n0(this, view));
                            r0Var.a();
                            int i17 = this.f21440b - 1;
                            this.f21440b = i17;
                            Adapter adapter3 = this.f21439a;
                            if (adapter3 instanceof PDFPageAdapter) {
                                ((PDFPageAdapter) adapter3).onMoveToChild(i17);
                            }
                        }
                    }
                    int size = sparseArray.size();
                    int[] iArr = new int[size];
                    for (int i18 = 0; i18 < size; i18++) {
                        iArr[i18] = sparseArray.keyAt(i18);
                    }
                    for (int i19 = 0; i19 < size; i19++) {
                        int i20 = iArr[i19];
                        int i21 = this.f21440b;
                        if (i20 < i21 - 2 || i20 > i21 + 2) {
                            View view2 = sparseArray.get(i20);
                            sparseArray2.append(i20, new SoftReference<>(view2));
                            removeViewInLayout(view2);
                            sparseArray.remove(i20);
                        }
                    }
                } else {
                    this.c = false;
                    this.f21447j = 0;
                    this.f21446i = 0;
                    int size2 = sparseArray.size();
                    for (int i22 = 0; i22 < size2; i22++) {
                        View valueAt = sparseArray.valueAt(i22);
                        sparseArray2.append(sparseArray.keyAt(i22), new SoftReference<>(valueAt));
                        removeViewInLayout(valueAt);
                    }
                    sparseArray.clear();
                    r0Var.a();
                }
                if (sparseArray.get(this.f21440b) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                View b10 = b(this.f21440b);
                Point g10 = g(b10);
                if (z11) {
                    left = g10.x;
                    i15 = g10.y;
                } else {
                    if (b10.getLeft() == 0 && b10.getTop() == 0) {
                        left = g10.x + this.f21446i;
                        top = g10.y;
                        i14 = this.f21447j;
                    } else {
                        left = b10.getLeft() + this.f21446i;
                        top = b10.getTop();
                        i14 = this.f21447j;
                    }
                    i15 = top + i14;
                }
                this.f21447j = 0;
                this.f21446i = 0;
                int measuredWidth = b10.getMeasuredWidth() + left;
                int measuredHeight = b10.getMeasuredHeight() + i15;
                if (!this.f21450m.isFinished()) {
                    int i23 = a(c(left, i15, measuredWidth, measuredHeight)).y;
                    i15 += i23;
                    measuredHeight += i23;
                } else {
                    Point a10 = a(c(left, i15, measuredWidth, measuredHeight));
                    if (this.f21439a.getCount() != 1) {
                        int i24 = a10.y;
                        measuredHeight += i24;
                        left += 0;
                        i15 += i24;
                        measuredWidth += 0;
                    } else {
                        int i25 = a10.x;
                        measuredWidth += i25;
                        left += i25;
                    }
                }
                int i26 = this.f21440b;
                if (i26 == 0) {
                    View b11 = b(i26);
                    if (left > (getWidth() / 2) - ((b11.getMeasuredWidth() / 2) / this.f21445h)) {
                        left = (int) ((getWidth() / 2) - ((b11.getMeasuredWidth() / 2) / this.f21445h));
                        measuredWidth = b11.getMeasuredWidth() + left;
                    }
                } else if (i26 == this.f21439a.getCount() - 1) {
                    View b12 = b(this.f21440b);
                    if (measuredWidth < ((b12.getMeasuredWidth() / 2) / this.f21445h) + (getWidth() / 2)) {
                        measuredWidth = (int) (((b12.getMeasuredWidth() / 2) / this.f21445h) + (getWidth() / 2));
                        left = measuredWidth - b12.getMeasuredWidth();
                    }
                }
                b10.layout(left, i15, measuredWidth, measuredHeight);
                int i27 = this.f21440b;
                if (i27 > 0) {
                    View b13 = b(i27);
                    View b14 = b(this.f21440b - 1);
                    View b15 = b(this.f21440b - 2);
                    Point h10 = h(b13);
                    Point h11 = h(b14);
                    Point h12 = h(b15);
                    i(b13);
                    i(b14);
                    j(b13);
                    j(b14);
                    b13.getLeft();
                    int top2 = b13.getTop() - h10.y;
                    int i28 = left - 25;
                    int i29 = h11.y;
                    b14.layout(i28 - b14.getMeasuredWidth(), i29 + top2, i28, i29 + b14.getMeasuredHeight() + top2);
                    if (this.f21440b > 1) {
                        b15.layout(((i28 - b14.getMeasuredWidth()) - 25) - b15.getMeasuredWidth(), h12.y + top2, (i28 - b14.getMeasuredWidth()) - 25, h12.y + b15.getMeasuredHeight() + top2);
                    }
                }
                if (this.f21440b < this.f21439a.getCount() - 1) {
                    View b16 = b(this.f21440b);
                    View b17 = b(this.f21440b + 1);
                    View b18 = b(this.f21440b + 2);
                    Point h13 = h(b16);
                    Point h14 = h(b17);
                    Point h15 = h(b18);
                    i(b16);
                    i(b17);
                    j(b16);
                    j(b17);
                    b16.getLeft();
                    int top3 = b16.getTop() - h13.y;
                    int i30 = measuredWidth + 25;
                    b17.layout(i30, h14.y + top3, b17.getMeasuredWidth() + i30, h14.y + b17.getMeasuredHeight() + top3);
                    if (this.f21440b < this.f21439a.getCount() - 2) {
                        b18.layout(b17.getMeasuredWidth() + i30 + 25, h15.y + top3, i30 + b17.getMeasuredWidth() + 25 + b18.getMeasuredWidth(), h15.y + b18.getMeasuredHeight() + top3);
                    }
                }
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            e(getChildAt(i12));
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float f10 = this.f21445h;
        float min = Math.min(Math.max(scaleGestureDetector.getScaleFactor() * f10, 1.0f), 64.0f);
        this.f21445h = min;
        float f11 = min / f10;
        View view = this.f21441d.get(this.f21440b);
        if (view != null) {
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            int left = ((int) focusX) - (view.getLeft() + this.f21446i);
            int top = view.getTop();
            int i10 = this.f21447j;
            int i11 = ((int) focusY) - (top + i10);
            float f12 = left;
            int i12 = (int) ((f12 - (f12 * f11)) + this.f21446i);
            this.f21446i = i12;
            float f13 = i11;
            int i13 = (int) ((f13 - (f11 * f13)) + i10);
            this.f21447j = i13;
            float f14 = this.f21454q;
            if (f14 >= 0.0f) {
                this.f21446i = (int) ((focusX - f14) + i12);
            }
            float f15 = this.f21455r;
            if (f15 >= 0.0f) {
                this.f21447j = (int) ((focusY - f15) + i13);
            }
            this.f21454q = focusX;
            this.f21455r = focusY;
            requestLayout();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f21444g = true;
        this.f21447j = 0;
        this.f21446i = 0;
        this.f21455r = -1.0f;
        this.f21454q = -1.0f;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f21444g = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View view;
        if (this.f21444g || (view = this.f21441d.get(this.f21440b)) == null) {
            return true;
        }
        Math.max((getWidth() - view.getMeasuredWidth()) / 2, 0);
        Math.min((view.getMeasuredWidth() + getWidth()) / 2, getWidth());
        Math.max((getHeight() - view.getMeasuredHeight()) / 2, 0);
        Math.min((view.getMeasuredHeight() + getHeight()) / 2, getHeight());
        int i10 = this.f21440b;
        int count = this.f21439a.getCount() - 1;
        int i11 = this.f21440b;
        int count2 = this.f21439a.getCount() - 1;
        this.f21446i = (int) (this.f21446i - f10);
        this.f21447j = (int) (this.f21447j - f11);
        requestLayout();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f21449l.onTouchEvent(motionEvent);
        this.f21448k.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC) == 0) {
            this.f21443f = true;
        }
        if ((motionEvent.getAction() & FunctionEval.FunctionID.EXTERNAL_FUNC) == 1) {
            this.f21443f = false;
            View view = this.f21441d.get(this.f21440b);
            if (view != null) {
                Scroller scroller = this.f21450m;
                if (scroller.isFinished() && getDisplayedViewIndex() == 0) {
                    view.getLeft();
                }
                if (getDisplayedViewIndex() == this.f21439a.getCount() - 1) {
                    view.getRight();
                    getMeasuredWidth();
                }
                if (scroller.isFinished()) {
                    post(new m0(this, view));
                }
            }
        }
        requestLayout();
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        Scroller scroller = this.f21450m;
        if (!scroller.isFinished()) {
            scroller.computeScrollOffset();
            int currX = scroller.getCurrX();
            int currY = scroller.getCurrY();
            this.f21446i = (currX - this.f21452o) + this.f21446i;
            this.f21447j = (currY - this.f21453p) + this.f21447j;
            this.f21452o = currX;
            this.f21453p = currY;
            requestLayout();
            this.f21451n.a();
        } else if (!this.f21443f && (view = this.f21441d.get(this.f21440b)) != null) {
            post(new m0(this, view));
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(Adapter adapter) {
        this.f21439a = adapter;
        requestLayout();
    }

    public void setDisplayedViewIndex(int i10) {
        if (i10 >= 0 && i10 < this.f21439a.getCount()) {
            this.f21440b = i10;
            Adapter adapter = this.f21439a;
            if (adapter instanceof PDFPageAdapter) {
                ((PDFPageAdapter) adapter).onMoveToChild(i10);
            }
            this.c = true;
            requestLayout();
        }
    }

    @Override // android.widget.AdapterView
    public void setSelection(int i10) {
        throw new UnsupportedOperationException(getContext().getString(R.string.arg_res_0x7f1302d3));
    }

    public ReaderViewBackUp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21441d = new SparseArray<>();
        this.f21442e = new SparseArray<>();
        this.f21445h = 1.0f;
        this.f21456s = false;
        if (isInEditMode()) {
            this.f21448k = null;
            this.f21449l = null;
            this.f21450m = null;
            this.f21451n = null;
            return;
        }
        this.f21448k = new GestureDetector(this);
        this.f21449l = new ScaleGestureDetector(context, this);
        this.f21450m = new Scroller(context);
        this.f21451n = new r0(this, this);
        int i10 = context.getResources().getConfiguration().orientation;
    }

    public ReaderViewBackUp(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21441d = new SparseArray<>();
        this.f21442e = new SparseArray<>();
        this.f21445h = 1.0f;
        this.f21456s = false;
        this.f21448k = new GestureDetector(this);
        this.f21449l = new ScaleGestureDetector(context, this);
        this.f21450m = new Scroller(context);
        this.f21451n = new r0(this, this);
        int i11 = context.getResources().getConfiguration().orientation;
    }

    /* loaded from: classes3.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final float f21458a;

        /* renamed from: b  reason: collision with root package name */
        public final float f21459b;

        public b(float f10, float f11) {
            this.f21458a = f10;
            this.f21459b = f11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderViewBackUp readerViewBackUp = ReaderViewBackUp.this;
            View view = readerViewBackUp.f21441d.get(readerViewBackUp.f21440b);
            int i10 = (readerViewBackUp.f21445h > 1.0f ? 1 : (readerViewBackUp.f21445h == 1.0f ? 0 : -1));
            if (i10 == 0) {
                int i11 = ReaderViewBackUp.f21438t;
            }
            if (i10 != 0 && view != null) {
                readerViewBackUp.post(new m0(readerViewBackUp, view));
            }
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ReaderViewBackUp readerViewBackUp = ReaderViewBackUp.this;
            float f10 = readerViewBackUp.f21445h;
            readerViewBackUp.f21445h = floatValue;
            float f11 = floatValue / f10;
            View view = readerViewBackUp.f21441d.get(readerViewBackUp.f21440b);
            if (view != null) {
                int left = ((int) this.f21458a) - (view.getLeft() + readerViewBackUp.f21446i);
                int top = view.getTop();
                int i10 = readerViewBackUp.f21447j;
                int i11 = ((int) this.f21459b) - (top + i10);
                float f12 = left;
                readerViewBackUp.f21446i = (int) ((f12 - (f12 * f11)) + readerViewBackUp.f21446i);
                float f13 = i11;
                readerViewBackUp.f21447j = (int) ((f13 - (f11 * f13)) + i10);
                readerViewBackUp.requestLayout();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public void setOnPageOrientationChangeListener(qg.d dVar) {
    }
}
