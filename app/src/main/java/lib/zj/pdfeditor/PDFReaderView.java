package lib.zj.pdfeditor;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import ao.i2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.i;
import lib.zj.pdfeditor.text.editor.EditorView;
import lib.zj.pdfeditor.text.editor.TextEditorAction;
import lib.zj.pdfeditor.text.editor.TextEditorState;
import lj.b;
import mj.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pj.a;

/* loaded from: classes3.dex */
public class PDFReaderView extends ReaderView implements mj.b0, mj.c {

    /* renamed from: m2  reason: collision with root package name */
    public static final /* synthetic */ int f21220m2 = 0;
    public float A1;
    public float B1;
    public float C1;
    public final Context D0;
    public boolean D1;
    public boolean E0;
    public boolean E1;
    public Mode F0;
    public boolean F1;
    public boolean G0;
    public boolean G1;
    public int H0;
    public boolean H1;
    public long I0;
    public boolean I1;
    public PageView J0;
    public final d J1;
    public Annotation K0;
    public PDFPageView K1;
    public int L0;
    public mj.h L1;
    public final RectF M0;
    public lib.zj.pdfeditor.text.editor.a M1;
    public final RectF N0;
    public Boolean N1;
    public boolean O0;
    public Boolean O1;
    public RectF P0;
    public Boolean P1;
    public boolean Q1;
    public boolean R1;
    public MotionEvent S1;
    public MotionEvent T1;
    public MotionEvent U1;
    public boolean V1;
    public boolean W1;
    public final ij.f X1;
    public final RectF Y1;
    public RectF Z1;

    /* renamed from: a2  reason: collision with root package name */
    public final RectF f21221a2;

    /* renamed from: b2  reason: collision with root package name */
    public final RectF f21222b2;

    /* renamed from: c1  reason: collision with root package name */
    public int f21223c1;

    /* renamed from: c2  reason: collision with root package name */
    public RectF f21224c2;

    /* renamed from: d2  reason: collision with root package name */
    public RectF f21225d2;

    /* renamed from: e2  reason: collision with root package name */
    public float f21226e2;

    /* renamed from: f2  reason: collision with root package name */
    public float f21227f2;

    /* renamed from: g2  reason: collision with root package name */
    public float f21228g2;

    /* renamed from: h2  reason: collision with root package name */
    public float f21229h2;

    /* renamed from: i1  reason: collision with root package name */
    public int f21230i1;

    /* renamed from: i2  reason: collision with root package name */
    public float f21231i2;

    /* renamed from: j1  reason: collision with root package name */
    public int f21232j1;

    /* renamed from: j2  reason: collision with root package name */
    public float f21233j2;

    /* renamed from: k1  reason: collision with root package name */
    public final Rect f21234k1;

    /* renamed from: k2  reason: collision with root package name */
    public mj.b0 f21235k2;

    /* renamed from: l1  reason: collision with root package name */
    public final Rect f21236l1;

    /* renamed from: l2  reason: collision with root package name */
    public EditorView f21237l2;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f21238m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f21239n1;

    /* renamed from: o1  reason: collision with root package name */
    public float f21240o1;

    /* renamed from: p1  reason: collision with root package name */
    public float f21241p1;
    public lj.b q1;

    /* renamed from: r1  reason: collision with root package name */
    public f f21242r1;

    /* renamed from: s1  reason: collision with root package name */
    public volatile boolean f21243s1;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f21244t1;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f21245u1;

    /* renamed from: v1  reason: collision with root package name */
    public boolean f21246v1;

    /* renamed from: w1  reason: collision with root package name */
    public final qg.a f21247w1;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f21248x1;

    /* renamed from: y1  reason: collision with root package name */
    public MotionEvent f21249y1;

    /* renamed from: z1  reason: collision with root package name */
    public float f21250z1;

    /* loaded from: classes3.dex */
    public enum Mode {
        Viewing,
        COPY,
        UNDERLINE,
        STRIKEOUTLINE,
        HIGHLINE,
        Drawing,
        ERASE,
        AddText,
        AdjustText,
        Stamp,
        Editor
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21252a;

        static {
            int[] iArr = new int[Mode.values().length];
            f21252a = iArr;
            try {
                iArr[Mode.Editor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21252a[Mode.Viewing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21252a[Mode.Stamp.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21252a[Mode.AdjustText.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21252a[Mode.Drawing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21252a[Mode.ERASE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21252a[Mode.COPY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21252a[Mode.STRIKEOUTLINE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21252a[Mode.HIGHLINE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21252a[Mode.UNDERLINE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21252a[Mode.AddText.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends lib.zj.pdfeditor.f {
        public b() {
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LinkInfo f21254a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a0 f21255b;

        public c(LinkInfo linkInfo, a0 a0Var) {
            this.f21254a = linkInfo;
            this.f21255b = a0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21254a.setLinkHighlighting(false);
            this.f21255b.D();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lib.zj.pdfeditor.text.editor.a aVar;
            PDFReaderView pDFReaderView = PDFReaderView.this;
            pDFReaderView.I1 = true;
            if (pDFReaderView.F0 == Mode.Editor && (aVar = pDFReaderView.M1) != null) {
                PDFPageView pDFPageView = aVar.f21687f;
                if (pDFPageView.isAttachedToWindow()) {
                    pDFPageView.invalidate();
                    pDFPageView.q1();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements s0 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RectF f21257a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ PDFReaderView f21258b;

        public e(RectF rectF, PDFReaderView pDFReaderView) {
            this.f21258b = pDFReaderView;
            this.f21257a = rectF;
        }

        @Override // lib.zj.pdfeditor.s0
        public final void a() {
            RectF rectF = this.f21257a;
            if (!rectF.isEmpty()) {
                this.f21258b.h1(rectF);
            }
        }

        @Override // lib.zj.pdfeditor.s0
        public final void b(TextChar textChar) {
            this.f21257a.union(textChar);
        }

        @Override // lib.zj.pdfeditor.s0
        public final void c() {
            this.f21257a.setEmpty();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PDFReaderView pDFReaderView = PDFReaderView.this;
            float f10 = pDFReaderView.B1;
            if (f10 != -1.0f) {
                float f11 = pDFReaderView.C1;
                if (f11 != -1.0f) {
                    pDFReaderView.R0(pDFReaderView.K(f10, f11), pDFReaderView.B1, pDFReaderView.C1);
                }
            }
        }
    }

    public PDFReaderView(Context context) {
        super(context);
        this.E0 = false;
        this.F0 = Mode.Viewing;
        this.G0 = false;
        this.I0 = -1L;
        this.M0 = new RectF();
        this.N0 = new RectF();
        this.O0 = false;
        this.f21223c1 = -1;
        this.f21234k1 = new Rect();
        this.f21236l1 = new Rect();
        this.f21238m1 = false;
        this.f21239n1 = false;
        this.f21240o1 = 0.0f;
        this.f21241p1 = 0.0f;
        this.f21243s1 = false;
        this.f21244t1 = false;
        this.f21245u1 = false;
        this.f21248x1 = false;
        this.f21249y1 = null;
        this.f21250z1 = 0.0f;
        this.A1 = 0.0f;
        this.B1 = -1.0f;
        this.C1 = -1.0f;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.H1 = false;
        this.I1 = true;
        this.J1 = new d();
        Boolean bool = Boolean.FALSE;
        this.N1 = bool;
        this.O1 = bool;
        this.P1 = bool;
        this.Q1 = false;
        this.R1 = true;
        ij.f fVar = new ij.f();
        this.X1 = fVar;
        RectF rectF = new RectF();
        this.Y1 = rectF;
        this.f21221a2 = new RectF();
        this.f21222b2 = new RectF();
        this.f21228g2 = -1.0f;
        this.f21229h2 = -1.0f;
        this.f21231i2 = -1.0f;
        this.f21233j2 = -1.0f;
        if (context instanceof qg.a) {
            qg.a aVar = (qg.a) context;
            this.f21247w1 = aVar;
            fVar.f18540a = rectF;
            aVar.E(fVar);
        }
        this.D0 = context;
        f1();
    }

    public static float x0(float f10, PageView pageView) {
        if (pageView != null) {
            return pageView.getX() + (pageView.getScale() * f10);
        }
        return f10;
    }

    public static float y0(float f10, PageView pageView) {
        if (pageView != null) {
            return pageView.getY() + (pageView.getScale() * f10);
        }
        return f10;
    }

    public final void A0(int[] iArr) {
        mj.h hVar;
        lib.zj.pdfeditor.text.editor.a aVar;
        if (iArr.length != 0 && this.F0 == Mode.Editor && (hVar = this.L1) != null && (aVar = this.M1) != null) {
            if (hVar.f22083a == aVar.f21685e) {
                lib.zj.pdfeditor.text.editor.a aVar2 = this.M1;
                aVar2.u(new mj.v(aVar2, aVar2.f21685e, iArr));
                if (!this.M1.q()) {
                    this.f21421v0 = true;
                    setDisplayedViewIndex(this.L1.f22083a);
                    return;
                }
                return;
            }
            mj.h hVar2 = this.L1;
            hVar2.f22087f = TextEditorAction.RESTORE_INPUT;
            setDisplayedViewIndex(hVar2.f22083a);
        }
    }

    @Override // mj.b0
    public final void B() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.B();
        }
    }

    public final boolean B0(RectF rectF, boolean z10) {
        RectF rectF2 = this.N0;
        if (rectF != null) {
            if (rectF2.left == rectF.left && rectF2.top == rectF.top && rectF2.right == rectF.right && rectF2.bottom == rectF.bottom) {
                return false;
            }
            if (z10) {
                rectF2.set(rectF);
                return true;
            }
            return true;
        }
        rectF2.setEmpty();
        return true;
    }

    @Override // mj.b0
    public final void C() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.C();
        }
    }

    public boolean C0() {
        return false;
    }

    public boolean D0() {
        return false;
    }

    public final boolean E0() {
        return this.E1;
    }

    @Override // mj.b0
    public final void F() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.F();
        }
    }

    public final boolean F0(RectF rectF) {
        if (rectF == null) {
            return true;
        }
        float f10 = rectF.left;
        if (f10 != rectF.right || f10 != 0.0f) {
            float f11 = rectF.top;
            if (f11 != rectF.bottom || f11 != 0.0f) {
                return false;
            }
        }
        return true;
    }

    public final boolean G0() {
        return this.F1;
    }

    public final boolean H0(RectF rectF) {
        RectF rectF2 = this.M0;
        if (rectF != null) {
            if (rectF2.left == rectF.left && rectF2.top == rectF.top && rectF2.right == rectF.right && rectF2.bottom == rectF.bottom) {
                return false;
            }
            rectF2.set(rectF);
            if (this.O0) {
                return false;
            }
            return true;
        }
        rectF2.setEmpty();
        return true;
    }

    public final boolean I0() {
        if (!this.f21238m1 && !this.f21239n1) {
            return false;
        }
        return true;
    }

    public final boolean J0() {
        PDFPageView pDFPageView = this.K1;
        if (pDFPageView == null) {
            return false;
        }
        lib.zj.pdfeditor.text.editor.a aVar = pDFPageView.f21180l1;
        if ((!aVar.X || aVar.Z.isEmpty()) && (!aVar.T || aVar.Q.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void K0() {
        Mode mode = this.F0;
        if (mode == Mode.Editor || mode == Mode.AddText || mode == Mode.AdjustText) {
            for (Map.Entry<ij.d, View> entry : this.f21384d.entrySet()) {
                if (entry.getKey().f18533a) {
                    ((PDFPageView) entry.getValue()).s2();
                }
            }
        }
    }

    public final void N0(boolean z10) {
        lib.zj.pdfeditor.text.editor.a aVar = this.M1;
        if (aVar != null) {
            aVar.t();
        }
        this.M1 = null;
        if (z10) {
            this.K1 = null;
        }
        this.L1 = null;
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final boolean Q() {
        Mode mode;
        if (this.D1 || (mode = this.F0) == Mode.Drawing || mode == Mode.AddText || mode == Mode.AdjustText || mode == Mode.Stamp || mode == Mode.Editor) {
            return false;
        }
        if (mode != Mode.Viewing) {
            return true;
        }
        if (!this.f21248x1 && !I0()) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final boolean R() {
        PDFPageView pDFPageView;
        if (this.D1 || this.F0 != Mode.Editor || (pDFPageView = this.K1) == null || !pDFPageView.f21180l1.f21690h) {
            return false;
        }
        return true;
    }

    public void R0(View view, float f10, float f11) {
        this.f21248x1 = true;
        if (D0() && !this.D1 && (view instanceof PageView)) {
            PageView pageView = (PageView) view;
            g1(pageView, true);
            pageView.f21294o0 = false;
            float width = (pageView.f21275f * pageView.getWidth()) / pageView.f21271d.x;
            pageView.M1(new b0(pageView, (f10 - pageView.getLeft()) / width, (f11 - pageView.getTop()) / width));
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void S(View view, int i10) {
        q0 q0Var = q0.f21567d;
        if (q0Var != null && q0Var.f21569b == i10) {
            ((a0) view).setSearchBoxes(q0Var.c);
        } else {
            ((a0) view).setSearchBoxes(null);
        }
        a0 a0Var = (a0) view;
        a0Var.setLinkHighlighting(this.E0);
        a0Var.setChangeReporter(new w(this));
    }

    public final void S0(MotionEvent motionEvent) {
        a0 a0Var;
        this.D1 = true;
        this.f21223c1 = -1;
        this.f21228g2 = -1.0f;
        this.f21229h2 = -1.0f;
        this.f21231i2 = -1.0f;
        this.f21233j2 = -1.0f;
        if (this.f21249y1 != null) {
            Mode mode = this.F0;
            if ((mode == Mode.Drawing || mode == Mode.ERASE) && (a0Var = (a0) K(motionEvent.getX(0), motionEvent.getY(0))) != null) {
                a0Var.H(this.F0);
            }
            this.f21249y1 = null;
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void T() {
        lj.b bVar;
        PageView pageView;
        if (F0(this.Y1) && (pageView = this.J0) != null && !F0(pageView.f21309w)) {
            e1();
        }
        if ((this.f21244t1 || this.f21245u1) && (bVar = this.q1) != null) {
            o9.d.s(ea.a.p("EGQiVC14HVAncDJhZw==", "44qFHizk"), ea.a.p("E28lUBJnB1MRYVhlLG4yICA=", "9O4jPLn5"));
            ReaderPreviewActivity readerPreviewActivity = ((i2) bVar).f5074a;
            readerPreviewActivity.Q2 = true;
            b.InterfaceC0288b interfaceC0288b = readerPreviewActivity.M4;
            if (interfaceC0288b != null) {
                ((p) interfaceC0288b).a();
            }
        }
    }

    public final void T0() {
        if (!i.a.f21508a.f21507d) {
            this.E1 = true;
            this.I1 = false;
            a.C0362a.f28967a.f28966b.removeCallbacks(this.J1);
            PageView pageView = this.J0;
            if (pageView != null) {
                pageView.b1();
                pageView.b();
                pageView.c1();
                pageView.a1();
                return;
            }
            lib.zj.pdfeditor.text.editor.a aVar = this.M1;
            if (aVar != null) {
                aVar.j();
                this.M1.f21687f.a1();
            }
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void U() {
        lj.b bVar;
        if ((this.f21244t1 || this.f21245u1) && (bVar = this.q1) != null) {
            ((i2) bVar).b();
            i2 i2Var = (i2) this.q1;
            i2Var.getClass();
            o9.d.s(ea.a.p("EGQ-VDN4OVAncDJhZw==", "DIqZVMP1"), ea.a.p("aG8IUA1nClMrYQplZ3Q2ckwgciBpICA=", "LwHflox2"));
            i2Var.f5074a.Q2 = false;
        }
    }

    public final void V0() {
        if (!i.a.f21508a.f21507d) {
            this.F1 = true;
            this.I1 = false;
            a.C0362a.f28967a.f28966b.removeCallbacks(this.J1);
            PageView pageView = this.J0;
            if (pageView != null) {
                pageView.b1();
                pageView.b();
                pageView.c1();
                pageView.a1();
                return;
            }
            lib.zj.pdfeditor.text.editor.a aVar = this.M1;
            if (aVar != null) {
                aVar.j();
                this.M1.f21687f.a1();
            }
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public void W(int i10) {
        q0 q0Var = q0.f21567d;
        if (q0Var != null && q0Var.f21569b != i10) {
            q0.f21567d = null;
            g0();
        }
        super.W(i10);
    }

    public final void W0() {
        PageView pageView;
        boolean z10 = this.F1;
        boolean z11 = this.E1;
        if (z10) {
            X();
            return;
        }
        if (z11 && (pageView = this.J0) != null) {
            Annotation annotation = this.K0;
            if (annotation != null) {
                pageView.x1(this.L0, annotation);
            } else {
                RectF rectF = this.P0;
                if (rectF != null) {
                    pageView.setItemSelectBox(rectF);
                } else if (pageView.f21309w != null || pageView.f21313y != null) {
                    pageView.q1();
                }
            }
        }
        this.E1 = false;
        a.C0362a.f28967a.f28966b.postDelayed(this.J1, 100L);
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void Y(View view, Float f10) {
        ((a0) view).setScale(f10.floatValue());
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void Z(View view) {
        if (i.a.f21508a.f21507d) {
            ((a0) view).e();
        } else {
            ((a0) view).m();
        }
    }

    @Override // mj.b0
    public final void a(RectF rectF) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.a(rectF);
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void a0(View view) {
        ((a0) view).g();
    }

    public final boolean a1() {
        PageView pageView;
        PageView pageView2;
        if (F0(this.Y1) && this.K0 == null && this.P0 == null && (((pageView = this.J0) == null || F0(pageView.f21309w)) && ((pageView2 = this.J0) == null || F0(pageView2.f21313y)))) {
            return false;
        }
        this.K0 = null;
        this.L0 = -1;
        this.P0 = null;
        this.O0 = false;
        this.M0.setEmpty();
        this.N0.setEmpty();
        setSelectTextLocation(b1());
        PageView pageView3 = this.J0;
        if (pageView3 != null) {
            if (pageView3 instanceof PDFPageView) {
                ((PDFPageView) pageView3).setSelectedAnnotationIndex(-1);
            }
            PageView pageView4 = this.J0;
            pageView4.S1();
            pageView4.f21309w = null;
            pageView4.T = null;
            pageView4.f21313y = null;
            pageView4.b1();
            pageView4.b();
            pageView4.q1();
        }
        return true;
    }

    @Override // lib.zj.pdfeditor.ReaderView, ng.b.a
    public final void b(ng.b bVar) {
        this.G0 = false;
        super.b(bVar);
    }

    public final RectF b1() {
        RectF rectF = this.Y1;
        rectF.setEmpty();
        this.f21221a2.setEmpty();
        this.f21222b2.setEmpty();
        return rectF;
    }

    @Override // mj.b0
    public final void c(ReaderPDFCore.SelectInfo selectInfo) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.c(selectInfo);
        }
    }

    public final void c1(MotionEvent motionEvent, MotionEvent motionEvent2) {
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        MotionEvent motionEvent5;
        if (this.U1 != null && (motionEvent3 = this.T1) != null) {
            if (motionEvent3.getY() <= this.U1.getY()) {
                motionEvent4 = this.T1;
                motionEvent5 = this.U1;
            } else {
                motionEvent4 = this.U1;
                motionEvent5 = this.T1;
            }
            if ((motionEvent.getY() < motionEvent5.getY() && motionEvent.getY() > motionEvent4.getY()) || ((motionEvent4.getY() != motionEvent5.getY() && motionEvent.getY() == motionEvent4.getY() && motionEvent.getX() >= motionEvent4.getX()) || ((motionEvent4.getY() != motionEvent5.getY() && motionEvent.getY() == motionEvent5.getY() && motionEvent.getX() < motionEvent5.getX()) || (motionEvent4.getY() == motionEvent5.getY() && motionEvent.getY() == motionEvent4.getY() && motionEvent.getX() >= motionEvent4.getX() && motionEvent.getX() < motionEvent5.getX())))) {
                if (this.J0 != null) {
                    if (motionEvent.getY() <= motionEvent2.getY()) {
                        this.J0.N1(motionEvent4.getX(), motionEvent4.getY(), motionEvent2.getX(), motionEvent2.getY());
                        this.V1 = false;
                        this.W1 = true;
                        return;
                    }
                    this.J0.N1(motionEvent5.getX(), motionEvent5.getY(), motionEvent2.getX(), motionEvent2.getY());
                    this.V1 = true;
                    this.W1 = false;
                    return;
                }
                return;
            }
            PageView pageView = this.J0;
            if (pageView != null) {
                pageView.N1(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
                this.V1 = true;
                this.W1 = true;
                return;
            }
            return;
        }
        PageView pageView2 = this.J0;
        if (pageView2 != null) {
            pageView2.N1(motionEvent.getX(), motionEvent.getY(), motionEvent2.getX(), motionEvent2.getY());
            this.W1 = true;
            this.V1 = true;
        }
    }

    @Override // mj.b0
    public final void d() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.d();
        }
    }

    public final void d1() {
        PageView pageView;
        if (this.I0 >= 0 && q0.f21567d != null && getDisplayedViewIndex() == q0.f21567d.f21569b && (pageView = (PageView) getDisplayedView()) != null) {
            pageView.setCurrentSearchBoxIdx(this.I0);
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView, ng.b.a
    public final void e(ng.b bVar) {
        this.G0 = true;
        V0();
        super.e(bVar);
    }

    public final void e1() {
        PageView.SelectPopMode selectPopMode;
        PageView pageView = this.J0;
        if (pageView != null) {
            PageView.SelectPopMode selectPopMode2 = pageView.getSelectPopMode();
            if (D0()) {
                if (!I0() && selectPopMode2 != PageView.SelectPopMode.Annot_After_Select) {
                    pageView.B1(new e(new RectF(), this), false);
                    postDelayed(new l.r(16, this, pageView), 5L);
                }
                if (!F0(this.Y1) && selectPopMode2 != PageView.SelectPopMode.Annot_After_Select && selectPopMode2 != (selectPopMode = PageView.SelectPopMode.Annot_Before_Select)) {
                    pageView.S0(selectPopMode);
                }
            }
        }
    }

    public final void f1() {
        this.f21230i1 = getResources().getDimensionPixelSize(R.dimen.dp_24);
        this.f21232j1 = getResources().getDimensionPixelSize(R.dimen.dp_30);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_12);
        int i10 = this.f21230i1;
        ij.f fVar = this.X1;
        fVar.f18541b = i10;
        fVar.c = dimensionPixelSize;
        this.f21242r1 = new f();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.D0.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i11 = (int) displayMetrics.xdpi;
        this.H0 = i11;
        if (i11 < 100) {
            this.H0 = 100;
        }
        int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 5;
        if (this.H0 > min) {
            this.H0 = min;
        }
    }

    public final void g1(PageView pageView, boolean z10) {
        PageView pageView2 = this.J0;
        if (pageView2 != null && (z10 || pageView != pageView2)) {
            pageView2.Z0();
        }
        this.J0 = pageView;
        this.X1.f18542d = pageView;
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public View getCurEditPage() {
        PageView pageView = this.J0;
        if (pageView != null) {
            return pageView;
        }
        return getDisplayedView();
    }

    public PDFPageView getEditFocusPageView() {
        return this.K1;
    }

    public EditorView getEditorView() {
        return this.f21237l2;
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public View getFocusView() {
        int i10 = this.f21223c1;
        if (i10 == -1) {
            return super.getFocusView();
        }
        return E(i10);
    }

    public qg.a getInkTouchListener() {
        return this.f21247w1;
    }

    public Mode getMode() {
        return this.F0;
    }

    public lj.b getOnTextParamChangedListener() {
        return this.q1;
    }

    public mj.h getTextEditorFocusInfo() {
        return this.L1;
    }

    @Override // mj.b0
    public final void h() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.h();
        }
    }

    public final void h1(RectF rectF) {
        RectF rectF2 = this.Y1;
        if (rectF2 != null) {
            boolean F0 = F0(rectF2);
            RectF rectF3 = this.f21222b2;
            RectF rectF4 = this.f21221a2;
            if (F0) {
                rectF2.set(rectF);
                rectF4.set(rectF);
                rectF3.set(rectF);
                return;
            }
            Objects.toString(rectF);
            Objects.toString(rectF2);
            if (!I0()) {
                float f10 = rectF.left;
                if ((f10 < rectF2.left && rectF.top <= rectF2.top) || rectF.top < rectF2.top) {
                    rectF2.left = f10;
                    rectF2.top = rectF.top;
                    rectF4.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                float f11 = rectF.right;
                if ((f11 > rectF2.right && rectF.bottom >= rectF2.bottom) || rectF.bottom > rectF2.bottom) {
                    rectF2.right = f11;
                    rectF2.bottom = rectF.bottom;
                    rectF3.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                return;
            }
            if (this.f21238m1) {
                rectF2.left = rectF.left;
                rectF2.top = rectF.top;
                rectF4.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            if (this.f21239n1) {
                rectF2.right = rectF.right;
                rectF2.bottom = rectF.bottom;
                rectF3.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
        }
    }

    @Override // mj.b0
    public final void i() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.i();
        }
    }

    @Override // mj.b0
    public final void k(ReaderPDFCore.FontInfo fontInfo) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.k(fontInfo);
        }
    }

    @Override // mj.b0
    public final void n(RectF rectF) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.n(rectF);
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        PageView pageView = this.J0;
        if (pageView != null) {
            pageView.b1();
            pageView.b();
            pageView.c1();
            pageView.a1();
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        PDFPageView pDFPageView;
        if (this.F0 == Mode.Editor && (pDFPageView = this.K1) != null) {
            lib.zj.pdfeditor.text.editor.a aVar = pDFPageView.f21180l1;
            aVar.getClass();
            aVar.U = SystemClock.elapsedRealtime();
            boolean z10 = false;
            aVar.f21690h = false;
            f.a.f22077a.a();
            ArrayList<mj.a> arrayList = aVar.f21695m;
            if (arrayList != null) {
                float o10 = aVar.o();
                float x4 = (motionEvent.getX() - aVar.f21687f.getLeft()) / o10;
                float y10 = (motionEvent.getY() - aVar.f21687f.getTop()) / o10;
                if (aVar.f21698p != null && aVar.f21698p.f22045b.contains(x4, y10)) {
                    if (aVar.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
                        int i10 = aVar.f21685e;
                        aVar.f21706x = false;
                        aVar.s(i10, x4, y10, false);
                    } else if (aVar.f21680b == TextEditorState.EDIT_TEXT || aVar.f21680b == TextEditorState.SELECT_TEXT) {
                        aVar.u(new mj.m(aVar, aVar.f21685e, aVar.f21698p, new PointF(x4, y10)));
                    }
                } else {
                    aVar.f21696n.clear();
                    for (mj.a aVar2 : arrayList) {
                        if (aVar2.f22045b.contains(x4, y10)) {
                            aVar.f21696n.add(aVar2);
                        }
                    }
                    Iterator<mj.a> it = aVar.f21696n.iterator();
                    mj.a aVar3 = null;
                    while (it.hasNext()) {
                        mj.a next = it.next();
                        if (aVar3 != null) {
                            if (next.f22045b.height() * next.f22045b.width() < aVar3.f22045b.height() * aVar3.f22045b.width()) {
                            }
                        }
                        aVar3 = next;
                    }
                    if (aVar3 != null) {
                        if (aVar.f21691i && !aVar3.c) {
                            aVar3.f22046d = true;
                            if (aVar.f21698p != null) {
                                aVar.f21698p.f22046d = false;
                                aVar.H(aVar3, false);
                                aVar.g(TextEditorState.ADJUST_TEXT_BLOCK);
                                int i11 = aVar.f21685e;
                                aVar.f21706x = false;
                                aVar.s(i11, x4, y10, false);
                            } else {
                                aVar.H(aVar3, false);
                                aVar.g(TextEditorState.ADJUST_TEXT_BLOCK);
                                int i12 = aVar.f21685e;
                                aVar.f21706x = false;
                                aVar.s(i12, x4, y10, false);
                            }
                        } else {
                            mj.b0 b0Var = aVar.f21689g;
                            if (b0Var != null) {
                                b0Var.u();
                            }
                        }
                    }
                }
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        V0();
        super.onDoubleTap(motionEvent);
        return true;
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        super.onDown(motionEvent);
        return true;
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        int i10 = a.f21252a[this.F0.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3 && i10 != 4) {
                return true;
            }
            Y0();
            super.onFling(motionEvent, motionEvent2, f10, f11);
            return true;
        } else if (this.P1.booleanValue()) {
            return true;
        } else {
            Y0();
            super.onFling(motionEvent, motionEvent2, f10, f11);
            return true;
        }
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d1();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        boolean z10;
        boolean z11 = false;
        this.f21422w = false;
        switch (a.f21252a[this.F0.ordinal()]) {
            case 1:
            case 3:
            case 4:
            case 11:
                if (!this.G0) {
                    L0();
                }
                super.onScroll(motionEvent, motionEvent2, f10, f11);
                return true;
            case 2:
                boolean D0 = D0();
                if (!this.D1 && D0) {
                    if (I0()) {
                        PageView pageView = this.J0;
                        if (pageView != null) {
                            RectF rectF = this.f21221a2;
                            if (F0(rectF)) {
                                rectF.setEmpty();
                            } else {
                                if (this.f21224c2 == null) {
                                    this.f21224c2 = new RectF();
                                }
                                this.f21224c2.set(x0(rectF.left, pageView), y0(rectF.top, pageView), x0(rectF.right, pageView), y0(rectF.bottom, pageView));
                            }
                            PageView pageView2 = this.J0;
                            RectF rectF2 = this.f21222b2;
                            if (F0(rectF2)) {
                                rectF2.setEmpty();
                            } else {
                                if (this.f21225d2 == null) {
                                    this.f21225d2 = new RectF();
                                }
                                this.f21225d2.set(x0(rectF2.left, pageView2), y0(rectF2.top, pageView2), x0(rectF2.right, pageView2), y0(rectF2.bottom, pageView2));
                            }
                            RectF rectF3 = this.f21224c2;
                            if (rectF3 != null && !rectF3.isEmpty()) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            RectF rectF4 = this.f21225d2;
                            if (rectF4 != null && !rectF4.isEmpty()) {
                                z11 = true;
                            }
                            if (z10 && z11) {
                                if (this.f21238m1) {
                                    float x4 = motionEvent2.getX() + this.f21240o1;
                                    float y10 = motionEvent2.getY() + this.f21241p1;
                                    RectF rectF5 = this.f21225d2;
                                    float f12 = rectF5.right;
                                    if (x4 >= f12 && y10 >= rectF5.top) {
                                        x4 = f12 - 0.1f;
                                    }
                                    float f13 = rectF5.bottom;
                                    float f14 = f13 - 0.1f;
                                    if (y10 >= f14) {
                                        y10 = f13 - 0.2f;
                                    }
                                    this.J0.N1(x4, y10, f12, f14);
                                } else {
                                    float x10 = motionEvent2.getX() - this.f21240o1;
                                    float y11 = motionEvent2.getY() - this.f21241p1;
                                    RectF rectF6 = this.f21224c2;
                                    float f15 = rectF6.left;
                                    if (x10 <= f15 && y11 <= rectF6.bottom) {
                                        x10 = f15 + 0.1f;
                                    }
                                    float f16 = rectF6.top;
                                    float f17 = f16 + 0.1f;
                                    if (y11 <= f17) {
                                        y11 = f16 + 0.2f;
                                    }
                                    this.J0.N1(f15 + 0.1f, f17, x10, y11);
                                }
                            }
                            this.W1 = true;
                            this.V1 = true;
                        }
                    } else if (this.f21248x1) {
                        c1(motionEvent, motionEvent2);
                    }
                    super.onScroll(motionEvent, motionEvent2, f10, f11);
                    return true;
                }
                if (!this.G0) {
                    L0();
                }
                super.onScroll(motionEvent, motionEvent2, f10, f11);
                return true;
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                if (this.D1 && !this.G0) {
                    L0();
                    super.onScroll(motionEvent, motionEvent2, f10, f11);
                    return true;
                } else if (motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1) {
                    c1(motionEvent, motionEvent2);
                    super.onScroll(motionEvent, motionEvent2, f10, f11);
                    break;
                } else {
                    super.onScroll(motionEvent, motionEvent2, f10, f11);
                    return true;
                }
                break;
            default:
                return true;
        }
        if (this.D1 && !this.G0) {
            L0();
            super.onScroll(motionEvent, motionEvent2, f10, f11);
            return true;
        } else if (motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1) {
            return true;
        } else {
            super.onScroll(motionEvent, motionEvent2, f10, f11);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02af  */
    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onSingleTapConfirmed(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PDFReaderView.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        jj.b bVar = this.f21418u;
        if (bVar != null) {
            bVar.setupLayout(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02a9, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0624  */
    @Override // lib.zj.pdfeditor.ReaderView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 1854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PDFReaderView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // mj.b0
    public final void q() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.q();
        }
    }

    @Override // mj.b0
    public final void r(String str) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.r(str);
        }
    }

    @Override // mj.b0
    public final void s(TextEditorState textEditorState) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.s(textEditorState);
        }
    }

    public void setAddTextMode(boolean z10) {
        this.f21245u1 = z10;
    }

    public void setCanSelectDelete(boolean z10) {
        this.f21246v1 = z10;
    }

    public void setCurrentSearchBoxIdx(long j10) {
        this.I0 = j10;
        d1();
    }

    public void setDelRectFChange(RectF rectF) {
        this.N0.set(rectF);
    }

    public void setEditorMode(boolean z10) {
        this.f21244t1 = z10;
    }

    public void setLinksEnabled(boolean z10) {
        this.E0 = z10;
        g0();
    }

    public void setMode(Mode mode) {
        Mode mode2 = this.F0;
        Mode mode3 = Mode.Viewing;
        if (mode2 == mode3 && mode != mode3) {
            this.f21246v1 = false;
        }
        Mode mode4 = Mode.Editor;
        HashMap<ij.d, View> hashMap = this.f21384d;
        if (mode2 == mode4 && mode != mode4) {
            N0(true);
            for (Map.Entry<ij.d, View> entry : hashMap.entrySet()) {
                if (entry.getKey().f18533a) {
                    View value = entry.getValue();
                    if (value instanceof PDFPageView) {
                        PDFPageView pDFPageView = (PDFPageView) value;
                        pDFPageView.f21180l1.B();
                        pDFPageView.invalidate();
                        pDFPageView.u2();
                    }
                }
            }
        }
        Mode mode5 = this.F0;
        Mode mode6 = Mode.AdjustText;
        if (mode5 == mode6 && mode != mode6) {
            for (Map.Entry<ij.d, View> entry2 : hashMap.entrySet()) {
                if (entry2.getKey().f18533a) {
                    View value2 = entry2.getValue();
                    if (value2 instanceof PDFPageView) {
                        ((PDFPageView) value2).u2();
                    }
                }
            }
        }
        a1();
        this.F0 = mode;
        if (mode != Mode.Drawing) {
            this.f21223c1 = -1;
        }
        if (mode == mode4) {
            for (Map.Entry<ij.d, View> entry3 : hashMap.entrySet()) {
                if (entry3.getKey().f18533a) {
                    View value3 = entry3.getValue();
                    if (value3 instanceof PDFPageView) {
                        PDFPageView pDFPageView2 = (PDFPageView) value3;
                        pDFPageView2.f21180l1.L(pDFPageView2.c);
                    }
                }
            }
        }
    }

    public void setOnTextParamChangedListener(lj.b bVar) {
        this.q1 = bVar;
    }

    public void setSavingPdf(boolean z10) {
        this.f21243s1 = z10;
    }

    public void setSelectTextLocation(RectF rectF) {
        qg.a aVar = this.f21247w1;
        if (aVar != null) {
            aVar.R();
        }
        Rect rect = this.f21236l1;
        Rect rect2 = this.f21234k1;
        if (rectF != null) {
            if (F0(rectF)) {
                rect2.set(0, 0, 0, 0);
                rect.set(0, 0, 0, 0);
                return;
            }
            float f10 = rectF.left;
            int i10 = this.f21232j1;
            float f11 = rectF.top;
            rect2.set(((int) f10) - i10, ((int) f11) - i10, (int) f10, (int) f11);
            float f12 = rectF.right;
            float f13 = rectF.bottom;
            int i11 = this.f21232j1;
            rect.set((int) f12, (int) f13, ((int) f12) + i11, ((int) f13) + i11);
            return;
        }
        rect2.set(0, 0, 0, 0);
        rect.set(0, 0, 0, 0);
    }

    public void setTextEditorOperateCallback(mj.b0 b0Var) {
        this.f21235k2 = b0Var;
    }

    @Override // mj.b0
    public final void t() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.t();
        }
    }

    @Override // mj.b0
    public final void u() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.u();
        }
    }

    @Override // mj.b0
    public final void v() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.v();
        }
    }

    public final boolean v0() {
        return this.I1;
    }

    @Override // mj.b0
    public final void w() {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.w();
        }
    }

    public final void w0() {
        mj.h hVar;
        lib.zj.pdfeditor.text.editor.a aVar;
        if (this.F0 == Mode.Editor && (hVar = this.L1) != null && (aVar = this.M1) != null) {
            if (hVar.f22083a == aVar.f21685e) {
                lib.zj.pdfeditor.text.editor.a aVar2 = this.M1;
                aVar2.u(new mj.w(aVar2, aVar2.f21685e));
                if (!this.M1.q()) {
                    this.f21421v0 = true;
                    setDisplayedViewIndex(this.L1.f22083a);
                    return;
                }
                return;
            }
            mj.h hVar2 = this.L1;
            hVar2.f22087f = TextEditorAction.RESTORE_INPUT;
            setDisplayedViewIndex(hVar2.f22083a);
        }
    }

    @Override // mj.b0
    public final void x(String str) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.x(str);
        }
    }

    @Override // mj.b0
    public final void z(RectF rectF) {
        mj.b0 b0Var;
        if (this.F0 == Mode.Editor && (b0Var = this.f21235k2) != null) {
            b0Var.z(rectF);
        }
    }

    public final RectF z0(PageView pageView) {
        RectF rectF = this.Y1;
        if (F0(rectF)) {
            rectF.setEmpty();
            this.f21221a2.setEmpty();
            this.f21222b2.setEmpty();
            return rectF;
        }
        if (this.Z1 == null) {
            this.Z1 = new RectF();
        }
        this.Z1.set(x0(rectF.left, pageView), y0(rectF.top, pageView), x0(rectF.right, pageView), y0(rectF.bottom, pageView));
        return this.Z1;
    }

    public void L0() {
    }

    public void M0() {
    }

    public void O0() {
    }

    public void P0() {
    }

    public void U0() {
    }

    @Override // lib.zj.pdfeditor.ReaderView
    public final void V() {
    }

    public void X0() {
    }

    public void Y0() {
    }

    public void Q0(Hit hit) {
    }

    public void Z0(String str) {
    }

    @Override // lib.zj.pdfeditor.ReaderView, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    public void setUnReDoStateListener(qg.i iVar) {
    }

    public PDFReaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = false;
        this.F0 = Mode.Viewing;
        this.G0 = false;
        this.I0 = -1L;
        this.M0 = new RectF();
        this.N0 = new RectF();
        this.O0 = false;
        this.f21223c1 = -1;
        this.f21234k1 = new Rect();
        this.f21236l1 = new Rect();
        this.f21238m1 = false;
        this.f21239n1 = false;
        this.f21240o1 = 0.0f;
        this.f21241p1 = 0.0f;
        this.f21243s1 = false;
        this.f21244t1 = false;
        this.f21245u1 = false;
        this.f21248x1 = false;
        this.f21249y1 = null;
        this.f21250z1 = 0.0f;
        this.A1 = 0.0f;
        this.B1 = -1.0f;
        this.C1 = -1.0f;
        this.D1 = false;
        this.E1 = false;
        this.F1 = false;
        this.G1 = false;
        this.H1 = false;
        this.I1 = true;
        this.J1 = new d();
        Boolean bool = Boolean.FALSE;
        this.N1 = bool;
        this.O1 = bool;
        this.P1 = bool;
        this.Q1 = false;
        this.R1 = true;
        this.X1 = new ij.f();
        this.Y1 = new RectF();
        this.f21221a2 = new RectF();
        this.f21222b2 = new RectF();
        this.f21228g2 = -1.0f;
        this.f21229h2 = -1.0f;
        this.f21231i2 = -1.0f;
        this.f21233j2 = -1.0f;
        this.D0 = context;
        f1();
    }
}
