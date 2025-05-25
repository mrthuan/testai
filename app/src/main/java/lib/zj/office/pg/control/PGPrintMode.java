package lib.zj.office.pg.control;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.system.beans.pagelist.APageListItem;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.system.f;
import lib.zj.office.system.r;
import rh.e;
import ri.c;
import th.d;

/* loaded from: classes3.dex */
public class PGPrintMode extends FrameLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    public final a f20910a;

    /* renamed from: b  reason: collision with root package name */
    public long f20911b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public final f f20912d;

    /* renamed from: e  reason: collision with root package name */
    public final APageListView f20913e;

    /* renamed from: f  reason: collision with root package name */
    public final Paint f20914f;

    /* renamed from: g  reason: collision with root package name */
    public final th.c f20915g;

    /* renamed from: h  reason: collision with root package name */
    public final e f20916h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f20917i;

    /* renamed from: j  reason: collision with root package name */
    public gj.f f20918j;

    /* renamed from: k  reason: collision with root package name */
    public final b f20919k;

    /* loaded from: classes3.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Removed duplicated region for block: B:104:0x00f1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00eb A[SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r19) {
            /*
                Method dump skipped, instructions count: 423
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.pg.control.PGPrintMode.a.handleMessage(android.os.Message):void");
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PGPrintMode pGPrintMode = PGPrintMode.this;
            gj.f fVar = pGPrintMode.f20918j;
            if (fVar != null) {
                fVar.f17831t = false;
            }
            APageListItem currentPageView = pGPrintMode.f20913e.getCurrentPageView();
            if (currentPageView != null) {
                currentPageView.invalidate();
            }
        }
    }

    public PGPrintMode(Context context) {
        super(context);
        this.f20910a = new a(Looper.getMainLooper());
        this.f20911b = System.currentTimeMillis();
        this.c = -1;
        this.f20917i = new Rect();
        g.d(Pattern.compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?(((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})(:[0-9]{1,5})?)|((www\\.|[a-zA-Z0-9.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.(top|com.cn|com|net|cn|cc|gov|hk)(:[0-9]{1,5})?))((/[a-zA-Z0-9./,;?'+&%$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z./,;?'+&%$#=~_\\-]*))", 2), "compile(\"\"\"((https?|s?ft…Pattern.CASE_INSENSITIVE)");
        this.f20919k = new b();
    }

    @Override // ri.c
    public final APageListItem b(int i10) {
        Rect g10 = g(i10);
        return new PGPageListItem(this.f20913e, this.f20912d, this.f20916h, g10.width(), g10.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r11 < r12) goto L36;
     */
    @Override // ri.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9, android.view.MotionEvent r10, float r11, float r12, byte r13) {
        /*
            r7 = this;
            r8 = 0
            r10 = 3
            r11 = 150(0x96, double:7.4E-322)
            r0 = 2018(0x7e2, float:2.828E-42)
            lib.zj.office.pg.control.PGPrintMode$a r1 = r7.f20910a
            r2 = 1
            if (r13 != r10) goto L25
            if (r9 == 0) goto L25
            int r10 = r9.getAction()
            if (r10 != r2) goto L25
            r1.removeMessages(r0)
            long r2 = java.lang.System.currentTimeMillis()
            r7.f20911b = r2
            android.os.Message r9 = r1.obtainMessage(r0, r9)
            r1.sendMessageDelayed(r9, r11)
            goto L9a
        L25:
            r9 = 8
            if (r13 != r9) goto L9a
            long r9 = java.lang.System.currentTimeMillis()
            long r3 = r7.f20911b
            long r9 = r9 - r3
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L37
            r1.removeMessages(r0)
        L37:
            lib.zj.office.system.beans.pagelist.APageListView r9 = r7.f20913e
            ri.c r10 = r9.f21008g
            if (r10 != 0) goto L3e
            goto L46
        L3e:
            byte r10 = r10.getPageListViewMovingPosition()
            if (r10 != 0) goto L46
            r10 = r2
            goto L47
        L46:
            r10 = r8
        L47:
            if (r10 == 0) goto L4e
            float r10 = r9.d(r8)
            goto L52
        L4e:
            float r10 = r9.d(r2)
        L52:
            float r11 = r9.getZoom()
            r12 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 * r10
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r10
            float r1 = r10 - r11
            float r1 = java.lang.Math.abs(r1)
            double r3 = (double) r1
            r5 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L6d
            goto L92
        L6d:
            float r1 = r12 - r11
            float r1 = java.lang.Math.abs(r1)
            double r3 = (double) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L79
            goto L94
        L79:
            float r1 = r0 - r11
            float r1 = java.lang.Math.abs(r1)
            double r3 = (double) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L85
            goto L95
        L85:
            int r1 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r1 >= 0) goto L8a
            goto L95
        L8a:
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 <= 0) goto L94
            int r10 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r10 >= 0) goto L94
        L92:
            r10 = r12
            goto L95
        L94:
            r10 = r0
        L95:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r9.o(r10, r11, r11, r2)
        L9a:
            lib.zj.office.system.f r9 = r7.f20912d
            lib.zj.office.system.i r9 = r9.s()
            r9.c1(r13)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.pg.control.PGPrintMode.d(android.view.View, android.view.MotionEvent, android.view.MotionEvent, float, float, byte):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        f fVar = this.f20912d;
        boolean P = fVar.s().P();
        APageListView aPageListView = this.f20913e;
        if (P) {
            String valueOf = String.valueOf(aPageListView.getCurrentPageNumber() + " / " + this.f20915g.f30031e);
            Paint paint = this.f20914f;
            int measureText = (int) paint.measureText(valueOf);
            int descent = (int) (paint.descent() - paint.ascent());
            int width = (getWidth() - measureText) / 2;
            int height = (getHeight() - descent) - 20;
            ShapeDrawable f10 = r.f();
            f10.setBounds(width - 10, height - 10, measureText + width + 10, descent + height + 10);
            f10.draw(canvas);
            canvas.drawText(valueOf, width, (int) (height - paint.ascent()), paint);
        }
        if (this.c != aPageListView.getCurrentPageNumber()) {
            fVar.s().S();
            this.c = aPageListView.getCurrentPageNumber();
        }
    }

    @Override // ri.c
    public final void e(APageListItem aPageListItem) {
        if (getParent() instanceof Presentation) {
            Presentation presentation = (Presentation) getParent();
            if (presentation.getFind().f29572f != aPageListItem.getPageIndex()) {
                xh.b bVar = presentation.getEditor().f29562b;
                bVar.f31655b = -1;
                bVar.f31654a.clear();
            }
        }
    }

    @Override // ri.c
    public final void f() {
        this.f20912d.r(20, null);
    }

    @Override // ri.c
    public final Rect g(int i10) {
        Dimension dimension = this.f20915g.c;
        Rect rect = this.f20917i;
        if (dimension == null) {
            rect.set(0, 0, getWidth(), getHeight());
        } else {
            rect.set(0, 0, dimension.width, dimension.height);
        }
        return rect;
    }

    public f getControl() {
        return this.f20912d;
    }

    public d getCurrentPGSlide() {
        APageListItem currentPageView = this.f20913e.getCurrentPageView();
        th.c cVar = this.f20915g;
        if (currentPageView != null) {
            return cVar.d(currentPageView.getPageIndex());
        }
        return cVar.d(0);
    }

    public int getCurrentPageNumber() {
        return this.f20913e.getCurrentPageNumber();
    }

    public int getFitSizeState() {
        return this.f20913e.getFitSizeState();
    }

    public float getFitZoom() {
        return this.f20913e.getFitZoom();
    }

    public APageListView getListView() {
        return this.f20913e;
    }

    @Override // ri.c
    public Object getModel() {
        return this.f20915g;
    }

    @Override // ri.c
    public int getPageCount() {
        return Math.max(this.f20915g.c(), 1);
    }

    @Override // ri.c
    public byte getPageListViewMovingPosition() {
        f fVar = this.f20912d;
        if (fVar.s() == null) {
            return (byte) 1;
        }
        return fVar.s().getPageListViewMovingPosition();
    }

    public APageListView getView() {
        return this.f20913e;
    }

    public float getZoom() {
        return this.f20913e.getZoom();
    }

    @Override // ri.c
    public final void i() {
        this.f20912d.s().i();
    }

    @Override // ri.c
    public final boolean j() {
        this.f20912d.s().j();
        return true;
    }

    @Override // ri.c
    public final boolean l() {
        this.f20912d.s().l();
        return false;
    }

    @Override // ri.c
    public final boolean o() {
        this.f20912d.s().o();
        return true;
    }

    @Override // ri.c
    public final boolean q() {
        return this.f20912d.s().q();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        APageListView aPageListView = this.f20913e;
        if (aPageListView != null) {
            aPageListView.setBackgroundColor(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        APageListView aPageListView = this.f20913e;
        if (aPageListView != null) {
            aPageListView.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        APageListView aPageListView = this.f20913e;
        if (aPageListView != null) {
            aPageListView.setBackgroundResource(i10);
        }
    }

    @Override // ri.c
    public void setDrawPictrue(boolean z10) {
        jh.c.f19238d.c = z10;
    }

    public void setFitSize(int i10) {
        this.f20913e.setFitSize(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        this.f20913e.getCurrentPageView();
    }

    public void setVisible(boolean z10) {
        APageListView aPageListView = this.f20913e;
        if (z10) {
            aPageListView.setVisibility(0);
        } else {
            aPageListView.setVisibility(8);
        }
    }

    public PGPrintMode(Context context, f fVar, th.c cVar, e eVar) {
        super(context);
        this.f20910a = new a(Looper.getMainLooper());
        this.f20911b = System.currentTimeMillis();
        this.c = -1;
        this.f20917i = new Rect();
        g.d(Pattern.compile("((https?|s?ftp|irc[6s]?|git|afp|telnet|smb)://)?(((\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3})(:[0-9]{1,5})?)|((www\\.|[a-zA-Z0-9.\\-]+\\.)?[a-zA-Z0-9\\-]+\\.(top|com.cn|com|net|cn|cc|gov|hk)(:[0-9]{1,5})?))((/[a-zA-Z0-9./,;?'+&%$#=~_\\-]*)|([^\\u4e00-\\u9fa5\\s0-9a-zA-Z./,;?'+&%$#=~_\\-]*))", 2), "compile(\"\"\"((https?|s?ft…Pattern.CASE_INSENSITIVE)");
        this.f20919k = new b();
        this.f20912d = fVar;
        this.f20915g = cVar;
        this.f20916h = eVar;
        APageListView aPageListView = new APageListView(context, this);
        this.f20913e = aPageListView;
        addView(aPageListView, new FrameLayout.LayoutParams(-1, -1));
        Paint paint = new Paint();
        this.f20914f = paint;
        paint.setAntiAlias(true);
        paint.setTypeface(Typeface.SANS_SERIF);
        paint.setTextSize(24.0f);
    }

    @Override // ri.c
    public final void a() {
    }

    @Override // ri.c
    public final void c() {
    }
}
