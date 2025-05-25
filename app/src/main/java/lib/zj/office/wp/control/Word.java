package lib.zj.office.wp.control;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.s;
import com.android.billingclient.api.a0;
import gj.h;
import gj.j;
import gj.k;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.system.r;
import pdf.pdfreader.viewer.editor.free.R;
import rh.k;

/* loaded from: classes3.dex */
public class Word extends LinearLayout implements xh.e, h.b {
    public static float U;
    public final int A;
    public final int B;
    public int C;
    public boolean D;
    public i E;
    public final boolean F;
    public boolean G;
    public float H;
    public final Handler I;
    public ValueAnimator J;
    public int K;
    public final b L;
    public boolean M;
    public h N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public final cj.a S;
    public boolean T;

    /* renamed from: a  reason: collision with root package name */
    public int f21094a;

    /* renamed from: b  reason: collision with root package name */
    public int f21095b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21096d;

    /* renamed from: e  reason: collision with root package name */
    public int f21097e;

    /* renamed from: f  reason: collision with root package name */
    public int f21098f;

    /* renamed from: g  reason: collision with root package name */
    public int f21099g;

    /* renamed from: h  reason: collision with root package name */
    public float f21100h;

    /* renamed from: i  reason: collision with root package name */
    public float f21101i;

    /* renamed from: j  reason: collision with root package name */
    public float f21102j;

    /* renamed from: k  reason: collision with root package name */
    public final lib.zj.office.system.f f21103k;

    /* renamed from: l  reason: collision with root package name */
    public final zh.g f21104l;

    /* renamed from: m  reason: collision with root package name */
    public dj.a f21105m;

    /* renamed from: n  reason: collision with root package name */
    public xh.b f21106n;

    /* renamed from: o  reason: collision with root package name */
    public dj.c f21107o;

    /* renamed from: p  reason: collision with root package name */
    public final a0 f21108p;

    /* renamed from: q  reason: collision with root package name */
    public j f21109q;

    /* renamed from: r  reason: collision with root package name */
    public gj.h f21110r;

    /* renamed from: s  reason: collision with root package name */
    public PrintWord f21111s;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f21112t;

    /* renamed from: u  reason: collision with root package name */
    public dj.d f21113u;

    /* renamed from: v  reason: collision with root package name */
    public final Rectangle f21114v;

    /* renamed from: w  reason: collision with root package name */
    public final Context f21115w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f21116x;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f21117y;

    /* renamed from: z  reason: collision with root package name */
    public final int f21118z;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Word word = Word.this;
            if (word.D) {
                word.M = false;
            }
            word.J.removeListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Word word = Word.this;
            if (word.M) {
                word.T = false;
                word.d(false, false);
                h hVar = word.N;
                if (hVar != null) {
                    hVar.a(false);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f21121a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21122b;
        public final /* synthetic */ int c;

        public c(boolean z10, int i10, int i11) {
            this.f21121a = z10;
            this.f21122b = i10;
            this.c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Word word = Word.this;
            if ((word.getContext() instanceof Activity) && (((Activity) word.getContext()).isFinishing() || ((Activity) word.getContext()).isDestroyed())) {
                return;
            }
            boolean z10 = this.f21121a;
            int i10 = this.c;
            int i11 = this.f21122b;
            if (z10) {
                if (word.R != i11) {
                    word.j(i10);
                }
            } else if (word.Q != i11) {
                word.j(i10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Word.this.f21103k.r(536870922, null);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Word word = Word.this;
            word.f21111s.getClass();
            word.f21111s.postInvalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Word word = Word.this;
            word.scrollTo(0, word.getScrollY());
            word.postInvalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class g implements ValueAnimator.AnimatorUpdateListener {
        public g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            Word word = Word.this;
            word.K = intValue;
            word.postInvalidate();
        }
    }

    /* loaded from: classes3.dex */
    public interface h {
        void a(boolean z10);

        void b(boolean z10);
    }

    /* loaded from: classes3.dex */
    public interface i {
        void F0();

        void r0();
    }

    public Word(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21094a = -1;
        this.f21095b = -1;
        this.f21100h = 1.0f;
        this.f21101i = 1.2f;
        this.f21102j = 1.2f;
        this.C = 0;
        this.D = true;
        this.F = true;
        this.G = true;
        this.H = 1.0f;
        this.I = new Handler(Looper.getMainLooper());
        this.K = 0;
        this.L = new b();
        this.M = false;
        this.P = true;
        this.S = new d9.g(this, 8);
        this.T = false;
    }

    private k getCurrentPageView() {
        return h(getScrollX(), getScrollY());
    }

    private Drawable getSliderDrawable() {
        if (this.f21117y == null) {
            this.f21117y = androidx.core.content.a.getDrawable(this.f21115w, R.drawable.ic_word_slider);
        }
        return this.f21117y;
    }

    @Override // xh.e
    public final /* bridge */ /* synthetic */ qh.d a(int i10) {
        return null;
    }

    public final void b(boolean z10) {
        int currentPageNumber = getCurrentPageNumber();
        this.P = z10;
        b.b.K(this.f21109q, this.f21100h);
        postDelayed(new c(z10, j(currentPageNumber), currentPageNumber), 100L);
    }

    @Override // xh.e
    public final Rectangle c(long j10, Rectangle rectangle) {
        if (getCurrentRootType() == 0) {
            this.f21109q.A(j10, rectangle, false);
            return rectangle;
        } else if (getCurrentRootType() == 1) {
            this.f21110r.A(j10, rectangle, false);
            return rectangle;
        } else {
            if (getCurrentRootType() == 2) {
                PrintWord printWord = this.f21111s;
                int currentPageNumber = printWord.f21087d.getCurrentPageNumber() - 1;
                if (currentPageNumber >= 0 && currentPageNumber < printWord.getPageCount()) {
                    printWord.f21089f.A(j10, rectangle, false);
                }
            }
            return rectangle;
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        dj.c cVar;
        if (getCurrentRootType() != 2 && (cVar = this.f21107o) != null) {
            cVar.b();
        }
    }

    public final void d(boolean z10, boolean z11) {
        j jVar;
        if (!k.a.f29581a.f29580b && ((jVar = this.f21109q) == null || jVar.H() <= 1 || this.D)) {
            return;
        }
        if (z10 && this.K == 0) {
            return;
        }
        if (this.J == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, this.f21118z + 0);
            this.J = ofInt;
            ofInt.addUpdateListener(new g());
            this.J.setDuration(450L);
        }
        if (z11) {
            if (z10) {
                this.M = true;
            } else {
                this.J.addListener(new a());
            }
        }
        if (z10) {
            this.J.reverse();
            Handler handler = this.I;
            b bVar = this.L;
            handler.removeCallbacks(bVar);
            handler.postDelayed(bVar, 2000L);
            return;
        }
        this.J.start();
    }

    public final void e(Canvas canvas) {
        int currentPageNumber = getCurrentPageNumber();
        lib.zj.office.system.f fVar = this.f21103k;
        if (fVar.s().P() && this.f21109q != null) {
            Rect clipBounds = canvas.getClipBounds();
            if (clipBounds.width() == getWidth() && clipBounds.height() == getHeight()) {
                String str = String.valueOf(currentPageNumber) + " / " + String.valueOf(this.f21109q.H());
                Paint paint = this.f21112t;
                int measureText = (int) paint.measureText(str);
                int descent = (int) (paint.descent() - paint.ascent());
                int scrollX = ((getScrollX() + clipBounds.right) - measureText) / 2;
                int i10 = (clipBounds.bottom - descent) - 20;
                ShapeDrawable f10 = r.f();
                f10.setBounds(scrollX - 10, i10 - 10, measureText + scrollX + 10, descent + i10 + 10);
                f10.draw(canvas);
                canvas.drawText(str, scrollX, (int) (i10 - paint.ascent()), paint);
            } else {
                return;
            }
        }
        if (this.f21094a != currentPageNumber || this.f21095b != getPageCount()) {
            fVar.s().S();
            this.f21094a = currentPageNumber;
            this.f21095b = getPageCount();
        }
    }

    public final void f(Canvas canvas, float f10) {
        int wordHeight = getWordHeight();
        this.f21099g = wordHeight;
        if (k.a.f29581a.f29580b && wordHeight * f10 <= getHeight()) {
            return;
        }
        Drawable sliderDrawable = getSliderDrawable();
        boolean z10 = this.P;
        int i10 = this.f21118z;
        int i11 = this.B;
        int i12 = this.A;
        Rect rect = this.f21116x;
        if (z10) {
            int scrollY = (int) (((getScrollY() / ((this.f21099g * f10) - getHeight())) * (((getHeight() - this.C) - i12) - (i11 * 2))) + getScrollY());
            if (s.f1864s) {
                sliderDrawable.setBounds((getScrollX() + (getLeft() + 0)) - this.K, scrollY + i11, (((getScrollX() + getLeft()) + 0) + i10) - this.K, scrollY + i12 + i11);
                rect.left = getLeft() + 0;
                rect.right = getLeft() + 0 + i10;
                rect.offset(-this.K, 0);
            } else {
                sliderDrawable.setBounds(getScrollX() + ((getRight() - 0) - i10) + this.K, scrollY + i11, ((getScrollX() + getRight()) - 0) + this.K, scrollY + i12 + i11);
                rect.left = (getRight() - i10) - 0;
                rect.right = getRight() - 0;
                rect.offset(this.K, 0);
            }
            rect.top = (int) ((getScrollY() / ((this.f21099g * f10) - getHeight())) * (getHeight() - this.C));
            rect.bottom = ((int) ((getScrollY() / ((this.f21099g * f10) - getHeight())) * (getHeight() - this.C))) + i12;
            if (s.f1864s) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, (sliderDrawable.getBounds().left + sliderDrawable.getBounds().right) / 2.0f, (sliderDrawable.getBounds().top + sliderDrawable.getBounds().bottom) / 2.0f);
                sliderDrawable.draw(canvas);
                canvas.restore();
                return;
            }
            sliderDrawable.draw(canvas);
            return;
        }
        int scrollX = (int) (((getScrollX() / ((this.f21098f * f10) - getWidth())) * ((getWidth() - i12) - (i11 * 2))) + getScrollX());
        sliderDrawable.setBounds(scrollX + i11, getScrollY() + ((getBottom() - 0) - i12) + this.K, scrollX + i10 + i11, getScrollY() + (getBottom() - 0) + this.K);
        rect.top = (getBottom() - 0) - i12;
        rect.bottom = getBottom() - 0;
        rect.offset(0, this.K);
        rect.left = (int) ((getScrollX() / ((this.f21098f * f10) - getWidth())) * getWidth());
        rect.right = ((int) ((getScrollX() / ((this.f21098f * f10) - getWidth())) * getWidth())) + i10;
        canvas.save();
        canvas.rotate(90.0f, ((sliderDrawable.getBounds().right - sliderDrawable.getBounds().left) / 2.0f) + sliderDrawable.getBounds().left, ((sliderDrawable.getBounds().bottom - sliderDrawable.getBounds().top) / 2.0f) + sliderDrawable.getBounds().top);
        sliderDrawable.draw(canvas);
        canvas.restore();
    }

    public final Rectangle g(int i10) {
        j jVar = this.f21109q;
        if (jVar != null && this.f21097e != 1) {
            if (i10 >= 0 && i10 <= jVar.H()) {
                gj.k currentPageView = getCurrentPageView();
                if (currentPageView == null) {
                    zh.f d10 = this.f21104l.i().d();
                    zh.b.f32374b.getClass();
                    return new Rectangle(0, 0, (int) (zh.b.p(d10) * 0.06666667f), (int) (zh.b.k(d10) * 0.06666667f));
                }
                return new Rectangle(0, 0, currentPageView.f481d, currentPageView.f482e);
            }
            return null;
        }
        return new Rectangle(0, 0, getWidth(), getHeight());
    }

    @Override // xh.e
    public lib.zj.office.system.f getControl() {
        return this.f21103k;
    }

    public int getCurrentPageNumber() {
        if (this.f21097e == 1 || this.f21109q == null) {
            return 1;
        }
        if (getCurrentRootType() == 2) {
            return this.f21111s.getCurrentPageNumber();
        }
        gj.k currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return 1;
        }
        return currentPageView.f17858q;
    }

    public int getCurrentRootType() {
        return this.f21097e;
    }

    public lib.zj.office.system.g getDialogAction() {
        return this.f21108p;
    }

    @Override // xh.e
    public zh.g getDocument() {
        return this.f21104l;
    }

    @Override // xh.e
    public byte getEditType() {
        return (byte) 2;
    }

    public dj.c getEventManage() {
        return this.f21107o;
    }

    public String getFilePath() {
        return null;
    }

    public dj.d getFind() {
        return this.f21113u;
    }

    public Rectangle getFirstPageSize() {
        if (getPageCount() > 0) {
            gj.k I = this.f21109q.I(0);
            return new Rectangle(I.f481d, I.f482e);
        }
        return null;
    }

    public int getFitSizeState() {
        if (this.f21097e == 2) {
            return this.f21111s.getFitSizeState();
        }
        return 0;
    }

    public float getFitZoom() {
        float f10;
        int width;
        int i10 = this.f21097e;
        if (i10 == 1) {
            return 0.5f;
        }
        j jVar = this.f21109q;
        if (jVar == null) {
            return 1.0f;
        }
        if (i10 == 2) {
            return this.f21111s.getFitZoom();
        }
        if (i10 == 0) {
            ai.e eVar = jVar.f490m;
            if (eVar == null) {
                width = 0;
            } else {
                width = eVar.getWidth();
            }
            if (width == 0) {
                zh.b bVar = zh.b.f32374b;
                zh.f d10 = this.f21104l.i().d();
                bVar.getClass();
                width = (int) (zh.b.p(d10) * 0.06666667f);
            }
            int width2 = getWidth();
            if (width2 == 0) {
                width2 = ((View) getParent()).getWidth();
            }
            f10 = (width2 - s.f1868w) / width;
        } else {
            f10 = 1.0f;
        }
        return Math.min(f10, 1.0f);
    }

    @Override // xh.e
    public xh.d getHighlight() {
        return this.f21106n;
    }

    public int getPageCount() {
        j jVar;
        if (this.f21097e == 1 || (jVar = this.f21109q) == null) {
            return 1;
        }
        return jVar.H();
    }

    public PrintWord getPrintWord() {
        return this.f21111s;
    }

    public int getSliderBottomMargin() {
        return this.C;
    }

    public dj.a getStatus() {
        return this.f21105m;
    }

    @Override // xh.e
    public lh.g getTextBox() {
        return null;
    }

    public Rectangle getVisibleRect() {
        int scrollX = getScrollX();
        Rectangle rectangle = this.f21114v;
        rectangle.f20688x = scrollX;
        rectangle.f20689y = getScrollY();
        rectangle.width = getWidth();
        rectangle.height = getHeight();
        return rectangle;
    }

    public int getWordHeight() {
        if (getCurrentRootType() == 0) {
            return this.f21099g;
        }
        if (getCurrentRootType() == 1) {
            return this.f21110r.f482e;
        }
        return getHeight();
    }

    public int getWordWidth() {
        if (getCurrentRootType() == 0) {
            return this.f21098f;
        }
        if (getCurrentRootType() == 1) {
            return this.f21110r.f481d;
        }
        return getWidth();
    }

    public float getZoom() {
        int i10 = this.f21097e;
        if (i10 == 1) {
            return this.f21102j;
        }
        if (i10 == 0) {
            return this.f21100h;
        }
        if (i10 == 2) {
            PrintWord printWord = this.f21111s;
            if (printWord != null) {
                return printWord.getZoom();
            }
            return this.f21100h;
        }
        return this.f21100h;
    }

    public final gj.k h(int i10, int i11) {
        float f10;
        int width;
        int i12;
        float f11;
        float f12;
        if (this.P) {
            width = (int) (i10 / this.f21100h);
            float f13 = this.f21100h;
            i12 = ((int) (i11 / f13)) + ((int) (((int) ((f12 / ((this.f21099g * f11) - getHeight())) * getHeight())) / f13));
            if (i12 > getWordHeight() - (s.f1868w / this.f21100h)) {
                i12 = getWordHeight() - ((int) (s.f1868w / this.f21100h));
            }
        } else {
            float f14 = this.f21100h;
            width = ((int) (i10 / f14)) + ((int) (((int) ((f10 / ((this.f21098f * this.f21100h) - getWidth())) * getWidth())) / f14));
            if (width > getWordWidth() - (s.f1868w / this.f21100h)) {
                width = getWordWidth() - ((int) (s.f1868w / this.f21100h));
            }
            i12 = (int) (i11 / this.f21100h);
        }
        j jVar = this.f21109q;
        boolean z10 = this.P;
        if (jVar == null) {
            return null;
        }
        ai.e w7 = jVar.w();
        while (w7 != null) {
            if (z10) {
                if (i12 > w7.getY()) {
                    if (i12 < w7.getHeight() + w7.getY() + s.f1868w) {
                        break;
                    }
                } else {
                    continue;
                }
                w7 = w7.o();
            } else {
                if (width > w7.getX()) {
                    if (width < w7.getWidth() + w7.getX() + s.f1868w) {
                        break;
                    }
                } else {
                    continue;
                }
                w7 = w7.o();
            }
        }
        if (w7 == null) {
            w7 = jVar.w();
        }
        if (w7 == null) {
            return null;
        }
        return (gj.k) w7;
    }

    public final Bitmap i(int i10) {
        Rectangle g10 = g(i10);
        if (g10 != null) {
            return k(i10, 0, 0, g10.width, g10.height, Math.round(g10.width * 0.3f), Math.round(g10.height * 0.3f));
        }
        return null;
    }

    public final int j(int i10) {
        dj.c cVar = this.f21107o;
        if (cVar != null) {
            cVar.e();
        }
        if (i10 > 0 && i10 <= getPageCount()) {
            gj.k I = this.f21109q.I(i10 - 1);
            if (I != null) {
                if (this.P) {
                    int i11 = (int) (I.c * this.f21100h);
                    gj.k h10 = h(getScrollX(), i11);
                    while (i11 >= 0 && h10 != null && h10.f17858q > i10) {
                        i11 -= ((int) (h10.f482e * this.f21100h)) / 2;
                        h10 = h(getScrollX(), i11);
                    }
                    scrollTo(0, i11);
                    return i11;
                }
                int i12 = (int) (I.f480b * this.f21100h);
                scrollTo(i12, 0);
                return i12;
            }
            scrollTo(0, 0);
            return 0;
        }
        scrollTo(0, 0);
        return 0;
    }

    public final Bitmap k(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        j jVar;
        gj.k I;
        boolean z10;
        if (i10 > 0 && i10 <= getPageCount() && (jVar = this.f21109q) != null && jVar.f490m != null && getCurrentRootType() != 1 && (I = this.f21109q.I(i10 - 1)) != null) {
            int i17 = I.f481d;
            int i18 = I.f482e;
            if (i11 >= 0 && i12 >= 0 && i11 < i17 && i12 < i18 && i13 >= 0 && i14 >= 0 && i11 + i13 <= i17 && i12 + i14 <= i18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                jh.c cVar = jh.c.f19238d;
                boolean h10 = cVar.h();
                cVar.c = true;
                float f10 = i13;
                float f11 = i14;
                float min = Math.min(i15 / f10, i16 / f11);
                try {
                    Bitmap createBitmap = Bitmap.createBitmap((int) (f10 * min), (int) (f11 * min), Bitmap.Config.ARGB_8888);
                    if (createBitmap == null) {
                        return null;
                    }
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.translate((-(I.f480b + i11)) * min, (-(I.c + i12)) * min);
                    canvas.drawColor(-1);
                    I.g(canvas, 0, 0, min);
                    cVar.c = h10;
                    return createBitmap;
                } catch (OutOfMemoryError unused) {
                }
            }
        }
        return null;
    }

    public final void l(int i10, int i11) {
        this.f21098f = i10;
        this.f21099g = i11;
        if (this.F && i10 != 0 && this.G) {
            this.G = false;
            float min = Math.min(getWidth(), getHeight()) / this.f21098f;
            this.H = min;
            m(min, getWidth() / 2, 0);
        }
    }

    public final void m(float f10, int i10, int i11) {
        float f11;
        float width;
        int height;
        float f12;
        int i12;
        j jVar;
        ai.e eVar;
        int i13 = this.f21097e;
        if (i13 == 0) {
            f11 = this.f21100h;
            this.f21100h = f10;
            b.b.K(this.f21109q, f10);
        } else if (i13 == 2) {
            this.f21111s.f21087d.o(f10, i10, i11, true);
            return;
        } else if (i13 == 1) {
            f11 = this.f21102j;
            this.f21101i = f11;
            this.f21102j = f10;
        } else {
            f11 = 1.0f;
        }
        if (i10 == Integer.MIN_VALUE && i11 == Integer.MIN_VALUE) {
            i10 = getWidth() / 2;
            i11 = getHeight() / 2;
        }
        if (getCurrentRootType() == 0 && (jVar = this.f21109q) != null && (eVar = jVar.f490m) != null) {
            width = eVar.getWidth();
            height = this.f21109q.f490m.getHeight();
        } else {
            width = getWidth();
            height = getHeight();
        }
        int i14 = (int) (height * f11);
        scrollBy((int) ((((int) (width * f10)) - i12) * (((getScrollX() + i10) * 1.0f) / ((int) (f11 * width)))), (int) ((((int) (f12 * f10)) - i14) * (((getScrollY() + i11) * 1.0f) / i14)));
    }

    public final void n(int i10, int i11) {
        if (i10 >= 0 && i10 < getPageCount() && getCurrentRootType() != 1) {
            if (getCurrentRootType() == 2) {
                if (i11 == 536870925) {
                    this.f21111s.f21087d.m();
                    return;
                } else if (i11 == 536870926) {
                    this.f21111s.f21087d.k();
                    return;
                } else {
                    this.f21111s.f21087d.p(i10);
                    return;
                }
            }
            gj.k I = this.f21109q.I(i10);
            if (I != null) {
                scrollTo(getScrollX(), (int) (I.c * this.f21100h));
            }
        }
    }

    public final void o(int i10) {
        if (i10 == getCurrentRootType()) {
            return;
        }
        this.f21107o.e();
        setCurrentRootType(i10);
        jh.c.f19238d.c = true;
        if (getCurrentRootType() == 1) {
            this.f21100h = this.H;
            k.a.f29581a.getClass();
            float f10 = rh.k.c[1];
            this.f21101i = f10;
            this.f21102j = f10;
            if (this.f21110r == null) {
                gj.h hVar = new gj.h(this);
                this.f21110r = hVar;
                hVar.G();
            }
            setOnTouchListener(this.f21107o);
            PrintWord printWord = this.f21111s;
            if (printWord != null) {
                printWord.setVisibility(4);
            }
        } else if (getCurrentRootType() == 0) {
            float f11 = this.H;
            this.f21100h = f11;
            j jVar = this.f21109q;
            if (jVar == null) {
                j jVar2 = new j(this);
                this.f21109q = jVar2;
                jVar2.G();
            } else {
                b.b.K(jVar, f11);
            }
            setOnTouchListener(this.f21107o);
            PrintWord printWord2 = this.f21111s;
            if (printWord2 != null) {
                printWord2.setVisibility(4);
            }
        } else if (getCurrentRootType() == 2) {
            if (this.f21109q == null) {
                j jVar3 = new j(this);
                this.f21109q = jVar3;
                jVar3.G();
            }
            PrintWord printWord3 = this.f21111s;
            if (printWord3 == null) {
                Context context = getContext();
                j jVar4 = this.f21109q;
                lib.zj.office.system.f fVar = this.f21103k;
                this.f21111s = new PrintWord(context, fVar, jVar4);
                Integer Y0 = fVar.s().Y0();
                if (Y0 != null) {
                    this.f21111s.setBackgroundColor(Y0.intValue());
                }
                addView(this.f21111s);
                post(new e());
            } else {
                printWord3.setVisibility(0);
            }
            scrollTo(0, 0);
            setOnClickListener(null);
            return;
        }
        post(new f());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        System.currentTimeMillis();
        if (this.f21096d && this.f21097e != 2) {
            try {
                if (getCurrentRootType() == 0) {
                    float f14 = this.f21100h;
                    j jVar = this.f21109q;
                    if (jVar != null) {
                        jVar.g(canvas, 0, 0, f14);
                        e(canvas);
                        if (this.f21109q.H() > 1 && this.M) {
                            f(canvas, this.f21100h);
                        }
                    }
                } else if (getCurrentRootType() == 1) {
                    gj.h hVar = this.f21110r;
                    float f15 = this.f21102j;
                    float f16 = this.f21101i;
                    hVar.getClass();
                    if (rg.c.c) {
                        canvas.drawColor(-16777216);
                    } else {
                        canvas.drawColor(-1);
                    }
                    float f17 = hVar.f480b;
                    ai.e eVar = hVar.f17835p;
                    if (eVar == null) {
                        f10 = f15;
                    } else {
                        f10 = f16;
                    }
                    int i10 = ((int) (f17 * f10)) + 0;
                    float f18 = hVar.c;
                    if (eVar == null) {
                        f11 = f15;
                    } else {
                        f11 = f16;
                    }
                    int i11 = ((int) (f18 * f11)) + 0;
                    if (eVar == null) {
                        eVar = hVar.f490m;
                    }
                    Rect clipBounds = canvas.getClipBounds();
                    boolean z10 = false;
                    while (eVar != null) {
                        if (hVar.f17835p == null) {
                            f12 = f15;
                        } else {
                            f12 = f16;
                        }
                        if (eVar.h(clipBounds, i10, i11, f12)) {
                            if (hVar.f17835p == null) {
                                f13 = f15;
                            } else {
                                f13 = f16;
                            }
                            eVar.g(canvas, i10, i11, f13);
                            z10 = true;
                        } else if (z10) {
                            break;
                        }
                        eVar = eVar.o();
                    }
                    if (this.O) {
                        f(canvas, this.f21102j);
                    }
                }
            } catch (Exception e10) {
                lib.zj.office.system.f fVar = this.f21103k;
                if (fVar != null) {
                    fVar.o().c().a(false, e10);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!this.f21096d) {
            return;
        }
        this.f21107o.e();
        b.b.K(this.f21109q, this.f21100h);
        if (this.f21097e == 0) {
            Rectangle visibleRect = getVisibleRect();
            int i14 = visibleRect.f20688x;
            int i15 = visibleRect.f20689y;
            int wordWidth = (int) (getWordWidth() * this.f21100h);
            int wordHeight = (int) (getWordHeight() * this.f21100h);
            int i16 = visibleRect.f20688x;
            int i17 = visibleRect.width;
            if (i16 + i17 > wordWidth) {
                i14 = wordWidth - i17;
            }
            int i18 = visibleRect.f20689y;
            int i19 = visibleRect.height;
            if (i18 + i19 > wordHeight) {
                i15 = wordHeight - i19;
            }
            if (i14 != i16 || i15 != i18) {
                scrollTo(Math.max(0, i14), Math.max(0, i15));
            }
        }
        if (i10 != i12) {
            this.f21103k.s().d1();
            gj.h hVar = this.f21110r;
            if (hVar != null) {
                hVar.B = false;
                hVar.f17836q = false;
                post(new dj.f(this, true));
            }
            setExportImageAfterZoom(true);
        }
        post(new d());
    }

    public final long p(int i10, int i11) {
        if (getCurrentRootType() == 0) {
            return this.f21109q.C(i10, i11, false);
        }
        if (getCurrentRootType() == 1) {
            return this.f21110r.C(i10, i11, false);
        }
        if (getCurrentRootType() == 2) {
            PrintWord printWord = this.f21111s;
            int currentPageNumber = printWord.f21087d.getCurrentPageNumber() - 1;
            if (currentPageNumber >= 0 && currentPageNumber < printWord.getPageCount()) {
                return printWord.f21089f.C(i10, i11, false);
            }
        }
        return 0L;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        h hVar;
        ValueAnimator valueAnimator;
        if (this.K != 0 && (valueAnimator = this.J) != null && !valueAnimator.isRunning() && this.M) {
            this.T = true;
            d(true, false);
            h hVar2 = this.N;
            if (hVar2 != null) {
                hVar2.a(true);
            }
        }
        dj.c cVar = this.f21107o;
        if (cVar != null && (hVar = this.N) != null) {
            hVar.b(cVar.f16231u);
        }
        int min = Math.min(Math.max(i10, 0), (int) ((getZoom() * getWordWidth()) - getWidth()));
        int min2 = Math.min(Math.max(i11, 0), (int) ((getZoom() * getWordHeight()) - getHeight()));
        this.Q = Math.max(min, 0);
        int max = Math.max(min2, 0);
        this.R = max;
        super.scrollTo(this.Q, max);
        this.T = true;
        Handler handler = this.I;
        b bVar = this.L;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 2000L);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        PrintWord printWord = this.f21111s;
        if (printWord != null) {
            printWord.setBackgroundColor(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        PrintWord printWord = this.f21111s;
        if (printWord != null) {
            printWord.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        PrintWord printWord = this.f21111s;
        if (printWord != null) {
            printWord.setBackgroundResource(i10);
        }
    }

    public void setCurrentRootType(int i10) {
        this.f21097e = i10;
    }

    public void setExportImageAfterZoom(boolean z10) {
        this.c = z10;
    }

    public void setFitSize(int i10) {
        if (this.f21097e == 2) {
            this.f21111s.setFitSize(i10);
        }
    }

    public void setIsInOneScreen(boolean z10) {
        this.D = z10;
        this.M = !z10;
    }

    public void setListener(h hVar) {
        this.N = hVar;
    }

    public void setOnReflowStateCallBack(i iVar) {
        this.E = iVar;
    }

    public void setSliderBottomMargin(int i10) {
        this.C = i10;
    }

    public void setWordHeight(int i10) {
        this.f21099g = i10;
    }

    public void setWordWidth(int i10) {
        this.f21098f = i10;
    }

    public Word(Activity activity, zh.g gVar, lib.zj.office.system.f fVar) {
        super(activity);
        this.f21094a = -1;
        this.f21095b = -1;
        this.f21100h = 1.0f;
        this.f21101i = 1.2f;
        this.f21102j = 1.2f;
        this.C = 0;
        this.D = true;
        this.F = true;
        this.G = true;
        this.H = 1.0f;
        this.I = new Handler(Looper.getMainLooper());
        this.K = 0;
        this.L = new b();
        this.M = false;
        this.P = true;
        this.S = new androidx.appcompat.libconvert.a(this, 12);
        this.T = false;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        U = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 793.0f;
        s.f1868w = (short) activity.getResources().getDimensionPixelSize(R.dimen.dp_5);
        this.f21118z = activity.getResources().getDimensionPixelSize(R.dimen.dp_39);
        this.A = activity.getResources().getDimensionPixelSize(R.dimen.dp_34);
        this.B = activity.getResources().getDimensionPixelSize(R.dimen.dp_6);
        this.f21103k = fVar;
        this.f21104l = gVar;
        this.f21115w = activity;
        this.f21116x = new Rect();
        int C0 = fVar.s().C0();
        setCurrentRootType(C0);
        if (C0 == 1) {
            gj.h hVar = new gj.h(this);
            this.f21110r = hVar;
            hVar.D = this;
        } else if (C0 == 0) {
            this.f21109q = new j(this);
        } else if (C0 == 2) {
            this.f21109q = new j(this);
            PrintWord printWord = new PrintWord(activity, fVar, this.f21109q);
            this.f21111s = printWord;
            addView(printWord);
        }
        this.f21108p = new a0(fVar, 10);
        Paint paint = new Paint();
        this.f21112t = paint;
        paint.setAntiAlias(true);
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setTextSize(24.0f);
        this.f21114v = new Rectangle();
        getWordWidth();
        getWidth();
        dj.c cVar = new dj.c(this, fVar);
        this.f21107o = cVar;
        setOnTouchListener(cVar);
        setLongClickable(true);
        this.f21113u = new dj.d(this);
        this.f21105m = new dj.a();
        this.f21106n = new xh.b(this);
        if (C0 == 2) {
            setOnClickListener(null);
        }
    }
}
