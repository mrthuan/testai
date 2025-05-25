package lib.zj.pdfeditor.scroll;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Api;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import f2.j;
import f2.k;
import f2.o;
import f2.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderView;
import lib.zj.pdfeditor.k0;
import pdf.pdfreader.viewer.editor.free.R;
import v0.f;

/* loaded from: classes3.dex */
public class PDFScrollHandle extends FrameLayout implements jj.b {

    /* renamed from: a  reason: collision with root package name */
    public float f21577a;

    /* renamed from: b  reason: collision with root package name */
    public PDFReaderView f21578b;
    public float c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f21579d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f21580e;

    /* renamed from: f  reason: collision with root package name */
    public int f21581f;

    /* renamed from: g  reason: collision with root package name */
    public int f21582g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21583h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f21584i;

    /* renamed from: j  reason: collision with root package name */
    public String f21585j;

    /* renamed from: k  reason: collision with root package name */
    public float f21586k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f21587l;

    /* renamed from: m  reason: collision with root package name */
    public final a f21588m;

    /* renamed from: n  reason: collision with root package name */
    public jj.a f21589n;

    /* renamed from: o  reason: collision with root package name */
    public final HashMap<Integer, Integer> f21590o;

    /* renamed from: p  reason: collision with root package name */
    public int f21591p;

    /* renamed from: q  reason: collision with root package name */
    public int f21592q;

    /* renamed from: r  reason: collision with root package name */
    public Boolean f21593r;

    /* renamed from: s  reason: collision with root package name */
    public int f21594s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f21595t;

    /* renamed from: u  reason: collision with root package name */
    public int f21596u;

    /* renamed from: v  reason: collision with root package name */
    public int f21597v;

    /* renamed from: w  reason: collision with root package name */
    public float f21598w;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFScrollHandle pDFScrollHandle = PDFScrollHandle.this;
            pDFScrollHandle.getClass();
            p pVar = new p();
            if (pDFScrollHandle.f21578b != null) {
                if (ReaderView.f21378z0) {
                    pVar.J(new j(8388613));
                } else {
                    pVar.J(new j(80));
                }
            }
            pVar.B(450L);
            o.a(pDFScrollHandle, pVar);
            pDFScrollHandle.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            PDFScrollHandle pDFScrollHandle = PDFScrollHandle.this;
            PDFReaderView pDFReaderView = pDFScrollHandle.f21578b;
            if (pDFReaderView == null) {
                return;
            }
            pDFReaderView.getClass();
            if (ReaderView.f21378z0) {
                if (pDFScrollHandle.f21597v != pDFScrollHandle.getParentHeight()) {
                    float f10 = pDFScrollHandle.f21598w;
                    if (f10 > 0.0f && f10 < 1.0f) {
                        pDFScrollHandle.f21597v = pDFScrollHandle.getParentHeight();
                        pDFScrollHandle.setY(pDFScrollHandle.getParentHeight() * pDFScrollHandle.f21598w);
                    }
                }
            } else if (pDFScrollHandle.f21596u != pDFScrollHandle.getParentWidth()) {
                float f11 = pDFScrollHandle.f21598w;
                if (f11 > 0.0f && f11 < 1.0f) {
                    pDFScrollHandle.f21596u = pDFScrollHandle.getParentWidth();
                    pDFScrollHandle.setX(pDFScrollHandle.getParentWidth() * pDFScrollHandle.f21598w);
                }
            }
        }
    }

    public PDFScrollHandle(Context context) {
        super(context);
        this.f21577a = 0.0f;
        this.f21579d = new RectF();
        this.f21580e = new RectF();
        this.f21581f = 5;
        this.f21582g = 20;
        this.f21583h = false;
        this.f21584i = false;
        this.f21585j = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        this.f21586k = -1.0f;
        this.f21587l = new Handler();
        this.f21588m = new a();
        this.f21590o = new HashMap<>();
        this.f21594s = 0;
        this.f21595t = false;
        this.f21596u = 0;
        this.f21597v = 0;
        this.f21598w = 0.0f;
    }

    private int getCurrentPage() {
        PDFReaderView pDFReaderView = this.f21578b;
        if (pDFReaderView != null) {
            return pDFReaderView.getDisplayedViewIndex();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentHeight() {
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            return (viewGroup.getHeight() - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentWidth() {
        if (getParent() != null && (getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            return (viewGroup.getWidth() - viewGroup.getPaddingStart()) - viewGroup.getPaddingEnd();
        }
        return 0;
    }

    private void setPosition(float f10) {
        float width;
        int parentWidth;
        boolean z10;
        if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
            float c = c(f10);
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                width = getHeight();
                parentWidth = getParentHeight();
            } else {
                width = getWidth();
                parentWidth = getParentWidth();
            }
            float f11 = (c / parentWidth) * width;
            this.f21577a = f11;
            float f12 = c - f11;
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                if (getTranslationX() < 0.0f || getTranslationX() > getWidth()) {
                    setTranslationX(0.0f);
                }
                this.f21598w = f12 / getParentHeight();
                setY(f12);
            } else {
                this.f21598w = f12 / getParentWidth();
                setX(f12);
                if (getTranslationY() < 0.0f || getTranslationY() > getHeight()) {
                    setTranslationY(0.0f);
                }
            }
            this.f21586k = f12;
            invalidate();
            if (getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && !this.f21584i) {
                i();
            }
            Handler handler = this.f21587l;
            a aVar = this.f21588m;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, 2000L);
        }
    }

    private void setSelfScroll(MotionEvent motionEvent) {
        int parentWidth;
        int width;
        float rawX;
        float f10;
        PDFReaderView pDFReaderView = this.f21578b;
        if (pDFReaderView != null) {
            pDFReaderView.getClass();
            if (ReaderView.f21378z0) {
                parentWidth = getParentHeight();
                width = getHeight();
                rawX = motionEvent.getRawY();
                f10 = this.c;
            } else {
                parentWidth = getParentWidth();
                width = getWidth();
                rawX = motionEvent.getRawX();
                f10 = this.c;
            }
            float f11 = rawX - f10;
            this.f21578b.getClass();
            if (!ReaderView.B0) {
                int pageCount = this.f21578b.getPageCount();
                float f12 = parentWidth;
                float f13 = pageCount;
                float c = (c(f11 + this.f21577a) / f12) * f13;
                int floor = (int) Math.floor(c);
                int currentPage = getCurrentPage();
                if (floor >= 0 && floor <= pageCount && floor != currentPage) {
                    if (floor == 0 && c - 0.0f < 0.2f) {
                        setPosition(0.0f);
                        this.f21578b.n0(floor, false);
                        return;
                    }
                    int i10 = pageCount - 1;
                    if ((floor == i10 && f13 - c < 0.2f) || floor == pageCount) {
                        setPosition(f12);
                        this.f21578b.n0(floor, false);
                        return;
                    } else if (floor > 0 && floor < i10) {
                        float f14 = floor;
                        float f15 = c - f14;
                        if (f15 > 0.4f && f15 < 0.6f) {
                            setPosition((f14 / i10) * f12);
                            this.f21578b.n0(f14, false);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            setPosition(f11 + this.f21577a);
            float pageCount2 = (this.f21577a / width) * this.f21578b.getPageCount();
            this.f21578b.n0(pageCount2, false);
            if (((int) Math.floor(pageCount2)) != getCurrentPage()) {
                this.f21583h = true;
            }
        }
    }

    public final float c(float f10) {
        int parentWidth;
        this.f21578b.getClass();
        if (ReaderView.f21378z0) {
            parentWidth = getParentHeight();
        } else {
            parentWidth = getParentWidth();
        }
        float f11 = parentWidth;
        if (f10 < 0.0f) {
            return 0.0f;
        }
        if (f10 > f11) {
            return f11;
        }
        return f10;
    }

    public final void d(Context context, AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, k0.f21513a, i10, 0);
        try {
            this.f21591p = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f21592q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
        obtainStyledAttributes.recycle();
        int i11 = (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.f21581f = i11;
        this.f21582g = i11 * 4;
        setVisibility(4);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof ImageView) {
            return super.drawChild(canvas, view, j10);
        }
        PDFReaderView pDFReaderView = this.f21578b;
        if (pDFReaderView != null) {
            pDFReaderView.getClass();
            if (ReaderView.f21378z0) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            canvas.translate((getMeasuredHeight() - getMeasuredWidth()) / (-2.0f), (getMeasuredWidth() + getMeasuredHeight()) / 2.0f);
            canvas.rotate(-90.0f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final boolean e() {
        PDFReaderView pDFReaderView = this.f21578b;
        if (pDFReaderView != null && pDFReaderView.getPageCount() > 1 && getParentWidth() > 0 && getParentHeight() > 0 && getWidth() > 0 && getHeight() > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (getChildAt(0) instanceof TextView) {
            Integer valueOf = Integer.valueOf(this.f21585j.length());
            HashMap<Integer, Integer> hashMap = this.f21590o;
            if (hashMap.get(valueOf) == null) {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < this.f21585j.length(); i10++) {
                    sb2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
                }
                hashMap.put(Integer.valueOf(this.f21585j.length()), Integer.valueOf((int) ((TextView) getChildAt(0)).getPaint().measureText(sb2.toString())));
            }
        }
    }

    public final void g() {
        int i10;
        int i11;
        Boolean bool;
        Locale locale;
        LocaleList locales;
        Boolean bool2;
        if (this.f21578b == null) {
            return;
        }
        try {
            o.c.remove(this);
            ArrayList<k> orDefault = o.b().getOrDefault(this, null);
            if (orDefault != null && !orDefault.isEmpty()) {
                ArrayList arrayList = new ArrayList(orDefault);
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((k) arrayList.get(size)).o(this);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f21578b.getClass();
        if (ReaderView.f21378z0) {
            if (e() && (bool2 = this.f21593r) != null && !bool2.booleanValue()) {
                setX(0.0f);
            }
            i11 = 8388661;
            i10 = R.drawable.ic_preview_drag;
        } else {
            if (e() && (bool = this.f21593r) != null && bool.booleanValue()) {
                setY(0.0f);
            }
            i10 = R.drawable.ic_preview_drag_bottom;
            i11 = 80;
        }
        this.f21578b.getClass();
        this.f21593r = Boolean.valueOf(ReaderView.f21378z0);
        boolean z10 = false;
        if (getChildAt(0) instanceof ImageView) {
            ImageView imageView = (ImageView) getChildAt(0);
            imageView.setImageResource(i10);
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                if (Build.VERSION.SDK_INT >= 24) {
                    locales = getContext().getResources().getConfiguration().getLocales();
                    locale = locales.get(0);
                } else {
                    locale = getContext().getResources().getConfiguration().locale;
                }
                int i12 = f.f30479a;
                if (f.a.a(locale) == 1) {
                    z10 = true;
                }
                if (z10) {
                    imageView.setRotation(180.0f);
                }
            }
            imageView.setRotation(0.0f);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height, i11));
    }

    @Override // jj.b
    public float getCurrentPos() {
        return this.f21586k;
    }

    public final void h(int i10) {
        int parentWidth;
        int i11;
        if (e() && this.f21578b != null) {
            setVisibility(this.f21594s);
            int pageCount = this.f21578b.getPageCount();
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                parentWidth = getParentHeight();
            } else {
                parentWidth = getParentWidth();
            }
            if (i10 == 0) {
                setPosition(0.0f);
            } else if (i10 > 0 && i10 < pageCount - 1) {
                setPosition((i10 / i11) * parentWidth);
            } else if (i10 == pageCount - 1 || i10 == pageCount) {
                setPosition(parentWidth);
            }
        }
    }

    public final void i() {
        p pVar = new p();
        if (this.f21578b != null) {
            if (ReaderView.f21378z0) {
                pVar.J(new j(8388613));
            } else {
                pVar.J(new j(80));
            }
        }
        pVar.B(450L);
        o.a(this, pVar);
        setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof View) {
            ((View) parent).getViewTreeObserver().addOnGlobalLayoutListener(new b());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21595t = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        PDFReaderView pDFReaderView;
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f21595t && (pDFReaderView = this.f21578b) != null) {
            this.f21595t = false;
            pDFReaderView.getClass();
            if (ReaderView.f21378z0) {
                int i14 = i13 - i11;
                if (i14 != 0) {
                    setPosition((this.f21577a / i14) * getParentHeight());
                    return;
                }
                return;
            }
            int i15 = i12 - i10;
            if (i15 != 0) {
                setPosition((this.f21577a / i15) * getParentWidth());
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int minimumWidth;
        int i12;
        View childAt = getChildAt(0);
        if ((childAt instanceof TextView) && this.f21578b != null) {
            f();
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(Api.BaseClientBuilder.API_PRIORITY_OTHER), SlideAtom.USES_MASTER_SLIDE_ID);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(Api.BaseClientBuilder.API_PRIORITY_OTHER), SlideAtom.USES_MASTER_SLIDE_ID);
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            Integer num = this.f21590o.get(Integer.valueOf(this.f21585j.length()));
            if (num != null) {
                measuredWidth = num.intValue();
            } else {
                measuredWidth = childAt.getMeasuredWidth();
            }
            Integer valueOf = Integer.valueOf(measuredWidth);
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                if (this.f21585j.length() > 3) {
                    i12 = valueOf.intValue() + this.f21592q;
                } else {
                    i12 = getMinimumWidth();
                }
                minimumWidth = childAt.getMeasuredHeight() + this.f21591p;
            } else {
                int measuredHeight = this.f21591p + childAt.getMeasuredHeight();
                if (this.f21585j.length() > 3) {
                    minimumWidth = this.f21592q + valueOf.intValue();
                } else {
                    minimumWidth = getMinimumWidth();
                }
                i12 = measuredHeight;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(minimumWidth), 1073741824));
            this.f21578b.getClass();
            if (!ReaderView.f21378z0) {
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        } else if (childAt instanceof ImageView) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.scroll.PDFScrollHandle.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setForceDismiss(boolean z10) {
        this.f21584i = z10;
        if (z10) {
            setVisibility(4);
        } else {
            setVisibility(0);
        }
    }

    public void setOnTouchListener(jj.a aVar) {
        this.f21589n = aVar;
    }

    public void setPageNum(int i10) {
        this.f21585j = String.valueOf(i10);
        f();
    }

    @Override // jj.b
    public void setScroll(float f10) {
        int parentWidth;
        int measuredWidth;
        if (!e()) {
            PDFReaderView pDFReaderView = this.f21578b;
            if (pDFReaderView != null) {
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pDFReaderView.getClass();
                if (ReaderView.f21378z0) {
                    measuredWidth = getMeasuredHeight();
                } else {
                    measuredWidth = getMeasuredWidth();
                }
                this.f21577a = f10 * measuredWidth;
            }
        } else if (this.f21578b != null) {
            setVisibility(this.f21594s);
            this.f21578b.getClass();
            if (ReaderView.f21378z0) {
                parentWidth = getParentHeight();
            } else {
                parentWidth = getParentWidth();
            }
            setPosition(parentWidth * f10);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        PDFReaderView pDFReaderView;
        if (i10 == 8) {
            i10 = 4;
        }
        this.f21594s = i10;
        if (e() && (((pDFReaderView = this.f21578b) == null || pDFReaderView.N()) && !this.f21584i)) {
            super.setVisibility(i10);
        } else {
            super.setVisibility(4);
        }
    }

    @Override // jj.b
    public void setupLayout(PDFReaderView pDFReaderView) {
        this.f21578b = pDFReaderView;
        post(new androidx.activity.k(this, 16));
    }

    public PDFScrollHandle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21577a = 0.0f;
        this.f21579d = new RectF();
        this.f21580e = new RectF();
        this.f21581f = 5;
        this.f21582g = 20;
        this.f21583h = false;
        this.f21584i = false;
        this.f21585j = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        this.f21586k = -1.0f;
        this.f21587l = new Handler();
        this.f21588m = new a();
        this.f21590o = new HashMap<>();
        this.f21594s = 0;
        this.f21595t = false;
        this.f21596u = 0;
        this.f21597v = 0;
        this.f21598w = 0.0f;
        d(context, attributeSet, 0);
    }

    public PDFScrollHandle(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21577a = 0.0f;
        this.f21579d = new RectF();
        this.f21580e = new RectF();
        this.f21581f = 5;
        this.f21582g = 20;
        this.f21583h = false;
        this.f21584i = false;
        this.f21585j = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        this.f21586k = -1.0f;
        this.f21587l = new Handler();
        this.f21588m = new a();
        this.f21590o = new HashMap<>();
        this.f21594s = 0;
        this.f21595t = false;
        this.f21596u = 0;
        this.f21597v = 0;
        this.f21598w = 0.0f;
        d(context, attributeSet, i10);
    }
}
