package lib.zj.pdfeditor.text.editor;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewParent;
import androidx.activity.i;
import androidx.activity.k;
import androidx.appcompat.widget.z0;
import androidx.fragment.app.a1;
import f0.s;
import java.util.ArrayList;
import java.util.Objects;
import l.r;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.PDFPageView;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.text.editor.EditorAlignCheck;
import mj.a0;
import mj.b0;
import mj.f;
import mj.l;
import mj.q;
import mj.x;
import mj.y;
import mj.z;
import pdf.pdfreader.viewer.editor.free.R;
import qb.e0;

/* compiled from: TextEditorHelper.java */
/* loaded from: classes3.dex */
public final class a {
    public final RectF A;
    public final RectF B;
    public final ArrayList<RectF> C;
    public final ArrayList<RectF> D;
    public int E;
    public volatile ReaderPDFCore.FontInfo F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public final Path L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public boolean T;
    public long U;
    public final ArrayList<RectF> V;
    public boolean W;
    public boolean X;
    public final RectF Y;
    public final RectF Z;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f21678a = new Handler(Looper.getMainLooper());

    /* renamed from: a0  reason: collision with root package name */
    public final RectF f21679a0;

    /* renamed from: b  reason: collision with root package name */
    public volatile TextEditorState f21680b;

    /* renamed from: b0  reason: collision with root package name */
    public final RectF f21681b0;
    public volatile TextEditorState c;

    /* renamed from: c0  reason: collision with root package name */
    public final RectF f21682c0;

    /* renamed from: d  reason: collision with root package name */
    public ReaderPDFCore f21683d;

    /* renamed from: d0  reason: collision with root package name */
    public final RectF f21684d0;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f21685e;

    /* renamed from: e0  reason: collision with root package name */
    public final RectF f21686e0;

    /* renamed from: f  reason: collision with root package name */
    public final PDFPageView f21687f;

    /* renamed from: f0  reason: collision with root package name */
    public final RectF f21688f0;

    /* renamed from: g  reason: collision with root package name */
    public final b0 f21689g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21690h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f21691i;

    /* renamed from: j  reason: collision with root package name */
    public int f21692j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f21693k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f21694l;

    /* renamed from: m  reason: collision with root package name */
    public volatile ArrayList<mj.a> f21695m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<mj.a> f21696n;

    /* renamed from: o  reason: collision with root package name */
    public volatile ArrayList<mj.e> f21697o;

    /* renamed from: p  reason: collision with root package name */
    public volatile mj.a f21698p;

    /* renamed from: q  reason: collision with root package name */
    public volatile mj.e f21699q;

    /* renamed from: r  reason: collision with root package name */
    public volatile ReaderPDFCore.SelectInfo f21700r;

    /* renamed from: s  reason: collision with root package name */
    public volatile ReaderPDFCore.SelectInfo f21701s;

    /* renamed from: t  reason: collision with root package name */
    public int f21702t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f21703u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f21704v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f21705w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f21706x;

    /* renamed from: y  reason: collision with root package name */
    public final RectF f21707y;

    /* renamed from: z  reason: collision with root package name */
    public final RectF f21708z;

    /* compiled from: TextEditorHelper.java */
    /* renamed from: lib.zj.pdfeditor.text.editor.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0287a extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21709b;
        public final /* synthetic */ mj.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ReaderPDFCore.SelectInfo f21710d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ PointF f21711e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ PointF f21712f;

        public C0287a(int i10, mj.a aVar, ReaderPDFCore.SelectInfo selectInfo, PointF pointF, PointF pointF2) {
            this.f21709b = i10;
            this.c = aVar;
            this.f21710d = selectInfo;
            this.f21711e = pointF;
            this.f21712f = pointF2;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 80;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mj.a aVar;
            a aVar2 = a.this;
            if (aVar2.f21683d != null && this.f21709b == aVar2.f21685e && a.this.f21680b == TextEditorState.SELECT_TEXT && (aVar = this.c) != null && aVar == a.this.f21698p && this.f21710d != null) {
                if (this.f21711e == null && this.f21712f == null) {
                    return;
                }
                RectF rectF = new RectF();
                if (this.f21711e != null) {
                    ReaderPDFCore readerPDFCore = a.this.f21683d;
                    int i10 = this.f21709b;
                    PointF pointF = this.f21711e;
                    rectF = readerPDFCore.locateCharFromPoint(i10, new PointF(pointF.x - (this.f21710d.minSize * 0.1f), pointF.y), this.c.f22044a);
                    if (rectF == null) {
                        rectF = a.this.f21683d.locateCharFromPoint(this.f21709b, this.f21711e, this.c.f22044a);
                    }
                }
                if (this.f21712f != null) {
                    ReaderPDFCore readerPDFCore2 = a.this.f21683d;
                    int i11 = this.f21709b;
                    PointF pointF2 = this.f21712f;
                    rectF = readerPDFCore2.locateCharFromPoint(i11, new PointF((this.f21710d.minSize * 0.1f) + pointF2.x, pointF2.y), this.c.f22044a);
                    if (rectF == null) {
                        rectF = a.this.f21683d.locateCharFromPoint(this.f21709b, this.f21712f, this.c.f22044a);
                    }
                }
                RectF rectF2 = rectF;
                if (rectF2 != null && !rectF2.isEmpty()) {
                    a.this.f21678a.post(new e0(3, this, this.f21711e, rectF2, this.f21712f));
                    return;
                } else {
                    a.this.f21678a.post(new k(this, 18));
                    return;
                }
            }
            int i12 = a.this.f21685e;
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class b extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21714b;
        public final /* synthetic */ mj.a c;

        public b(int i10, mj.a aVar) {
            this.f21714b = i10;
            this.c = aVar;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 80;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mj.a aVar;
            a aVar2 = a.this;
            if (aVar2.f21683d != null && this.f21714b == aVar2.f21685e && a.this.f21680b == TextEditorState.SELECT_TEXT && (aVar = this.c) != null) {
                a aVar3 = a.this;
                RectF[] editorSelect = aVar3.f21683d.editorSelect(this.f21714b, aVar.f22044a, aVar3.f21682c0.centerX(), a.this.f21682c0.centerY(), a.this.f21684d0.centerX(), a.this.f21684d0.centerY());
                ReaderPDFCore.SelectInfo editorGetSelectInfo = a.this.f21683d.editorGetSelectInfo();
                if (editorGetSelectInfo != null) {
                    a.this.f21678a.post(new a1(10, this, editorGetSelectInfo));
                }
                if (editorSelect != null && editorSelect.length > 0) {
                    a.this.f21678a.post(new s(18, this, editorSelect));
                    return;
                }
                return;
            }
            int i10 = a.this.f21685e;
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class c extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21716b;
        public final /* synthetic */ mj.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ReaderPDFCore.SelectInfo f21717d;

        public c(int i10, mj.a aVar, ReaderPDFCore.SelectInfo selectInfo) {
            this.f21716b = i10;
            this.c = aVar;
            this.f21717d = selectInfo;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 90;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f21683d != null && this.f21716b == aVar.f21685e && this.c == a.this.f21698p && this.f21717d == a.this.f21700r && a.this.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
                a.this.f21683d.editorSelectSetFontStyleAndSave(this.f21716b, this.f21717d);
                a.this.f21683d.recordEditorTextOrImageAction(this.f21716b);
                a.f(a.this);
                a.d(a.this, this.c.f22044a);
            }
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class d extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21719b;
        public final /* synthetic */ mj.a c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ReaderPDFCore.SelectInfo f21720d;

        public d(int i10, mj.a aVar, ReaderPDFCore.SelectInfo selectInfo) {
            this.f21719b = i10;
            this.c = aVar;
            this.f21720d = selectInfo;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 90;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f21683d != null && this.f21719b == aVar.f21685e && this.c == a.this.f21698p && this.f21720d == a.this.f21701s && a.this.f21680b == TextEditorState.SELECT_TEXT) {
                a.this.f21683d.editorSelectSetFontStyleAndSave(this.f21719b, this.f21720d);
                a.this.f21683d.recordEditorTextOrImageAction(this.f21719b);
                a.f(a.this);
                a.d(a.this, this.c.f22044a);
                a aVar2 = a.this;
                int i10 = this.f21719b;
                int i11 = this.c.f22044a;
                RectF[] editorGetSelectArea = aVar2.f21683d.editorGetSelectArea();
                ReaderPDFCore.SelectInfo editorGetSelectInfo = aVar2.f21683d.editorGetSelectInfo();
                Handler handler = aVar2.f21678a;
                if (editorGetSelectInfo != null) {
                    handler.post(new r(18, aVar2, editorGetSelectInfo));
                }
                if (editorGetSelectArea != null && editorGetSelectArea.length > 0) {
                    handler.post(new mj.k(0, aVar2, editorGetSelectArea, aVar2.f21683d.locateCharFromPoint(i10, new PointF((aVar2.f21682c0.width() / 2.0f) + editorGetSelectArea[0].left, editorGetSelectArea[0].centerY()), i11), aVar2.f21683d.locateCharFromPoint(i10, new PointF(editorGetSelectArea[editorGetSelectArea.length - 1].right - (aVar2.f21684d0.width() / 2.0f), editorGetSelectArea[editorGetSelectArea.length - 1].centerY()), i11)));
                }
            }
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class e extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21722b;
        public final /* synthetic */ ReaderPDFCore.FontInfo c;

        public e(int i10, ReaderPDFCore.FontInfo fontInfo) {
            this.f21722b = i10;
            this.c = fontInfo;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 80;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderPDFCore.FontInfo fontInfo;
            a aVar = a.this;
            if (aVar.f21683d != null && this.f21722b == aVar.f21685e && a.this.f21680b == TextEditorState.EDIT_TEXT && (fontInfo = this.c) != null && fontInfo == a.this.F) {
                a.this.f21683d.editorSetFont(this.c);
                a.this.f21678a.post(new b7.g(this, 14));
                return;
            }
            int i10 = a.this.f21685e;
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21724a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21725b;

        static {
            int[] iArr = new int[TextEditorState.values().length];
            f21725b = iArr;
            try {
                iArr[TextEditorState.EDIT_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21725b[TextEditorState.ADJUST_TEXT_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21725b[TextEditorState.SELECT_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21725b[TextEditorState.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[TextEditorAction.values().length];
            f21724a = iArr2;
            try {
                iArr2[TextEditorAction.BOLD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21724a[TextEditorAction.ITALIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21724a[TextEditorAction.UNDERLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21724a[TextEditorAction.REDUCE_SIZE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21724a[TextEditorAction.INCREASE_SIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21724a[TextEditorAction.CHANGE_COLOR.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21724a[TextEditorAction.INPUT_TEXT.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21724a[TextEditorAction.EXIT_INPUT_MODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21724a[TextEditorAction.RESTORE_INPUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class g extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f21726b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f21727d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f21728e;

        public g(int i10, int i11, float f10, float f11) {
            this.f21726b = i10;
            this.c = i11;
            this.f21727d = f10;
            this.f21728e = f11;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 90;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (aVar.f21683d != null && this.f21726b == aVar.f21685e && a.this.f21680b == TextEditorState.ADJUST_TEXT_BLOCK && a.this.f21698p != null) {
                int i10 = a.this.f21698p.f22044a;
                int i11 = this.c;
                if (i10 == i11) {
                    a.this.f21683d.editorTranslateBlockAndSave(this.f21726b, i11, this.f21727d, this.f21728e);
                    a.this.f21683d.recordEditorTextOrImageAction(this.f21726b);
                    a.f(a.this);
                    a.d(a.this, this.c);
                    b0 b0Var = a.this.f21689g;
                    if (b0Var != null) {
                        b0Var.B();
                        return;
                    }
                    return;
                }
            }
            Objects.toString(a.this.f21680b);
            Objects.toString(a.this.f21698p);
        }
    }

    /* compiled from: TextEditorHelper.java */
    /* loaded from: classes3.dex */
    public class h extends mj.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ mj.a f21730b;
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f21731d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f21732e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f21733f;

        public h(mj.a aVar, int i10, float f10, float f11, boolean z10) {
            this.f21730b = aVar;
            this.c = i10;
            this.f21731d = f10;
            this.f21732e = f11;
            this.f21733f = z10;
        }

        @Override // mj.d0
        public final int getPriority() {
            return 94;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mj.a aVar;
            boolean z10;
            b0 b0Var;
            a aVar2 = a.this;
            if (aVar2.f21683d != null && (aVar = this.f21730b) != null && aVar == aVar2.f21698p) {
                int i10 = a.this.f21685e;
                int i11 = this.c;
                if (i10 == i11) {
                    if (this.f21731d >= 0.0f && this.f21732e >= 0.0f && a.this.f21683d.locateCharFromPoint(i11, new PointF(this.f21731d, this.f21732e), this.f21730b.f22044a) != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        a.this.f21683d.editorFocusLastChar(this.c, this.f21730b.f22044a);
                    }
                    if (!this.f21733f && (b0Var = a.this.f21689g) != null) {
                        b0Var.q();
                    }
                    a.b(a.this);
                }
            }
        }
    }

    public a(PDFPageView pDFPageView, b0 b0Var) {
        TextEditorState textEditorState = TextEditorState.NONE;
        this.f21680b = textEditorState;
        this.c = textEditorState;
        this.f21685e = -1;
        this.f21693k = new RectF();
        this.f21694l = new RectF();
        this.f21695m = new ArrayList<>();
        this.f21696n = new ArrayList<>();
        this.f21697o = new ArrayList<>();
        this.f21707y = new RectF();
        this.f21708z = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new ArrayList<>();
        this.D = new ArrayList<>();
        this.L = new Path();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.V = new ArrayList<>();
        this.Y = new RectF();
        this.Z = new RectF();
        this.f21679a0 = new RectF();
        this.f21681b0 = new RectF();
        this.f21682c0 = new RectF();
        this.f21684d0 = new RectF();
        this.f21686e0 = new RectF();
        this.f21688f0 = new RectF();
        this.f21687f = pDFPageView;
        this.f21689g = b0Var;
        this.f21692j = pDFPageView.getContext().getResources().getConfiguration().orientation;
        Context context = pDFPageView.getContext();
        this.E = context.getResources().getDimensionPixelSize(R.dimen.dp_2);
        this.H = context.getResources().getDimensionPixelSize(R.dimen.dp_8);
        this.I = context.getResources().getDimensionPixelSize(R.dimen.dp_12);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_12);
        this.K = dimensionPixelSize;
        float f10 = this.H;
        this.J = (this.H * 2.0f) + ((dimensionPixelSize / 2.0f) - (f10 - ((float) Math.sqrt(Math.pow(f10, 2.0d) - Math.pow(this.K / 2.0f, 2.0d)))));
        this.G = context.getResources().getDimensionPixelSize(R.dimen.dp_1);
        this.f21702t = context.getResources().getDimensionPixelSize(R.dimen.dp_4);
        mj.e0.c = context.getResources().getDimensionPixelSize(R.dimen.dp_1);
    }

    public static boolean a(a aVar, int i10, int i11) {
        if (i11 > 1) {
            aVar.f21683d.editorDeleteNChars(i10, i11);
            return true;
        } else if (i11 == 1) {
            aVar.f21683d.editorDeleteChar(i10);
            return true;
        } else {
            aVar.getClass();
            return false;
        }
    }

    public static void b(a aVar) {
        ReaderPDFCore.DotInfo editorGetDotInfo = aVar.f21683d.editorGetDotInfo();
        Handler handler = aVar.f21678a;
        if (editorGetDotInfo != null && editorGetDotInfo.box != null) {
            float editorSourceScale = aVar.f21687f.getEditorSourceScale();
            int i10 = editorGetDotInfo.direction;
            RectF rectF = aVar.M;
            if (i10 == 0) {
                RectF rectF2 = editorGetDotInfo.box;
                float f10 = rectF2.right;
                float f11 = (aVar.E / 2.0f) / editorSourceScale;
                rectF.set(f10 - f11, rectF2.top, f11 + f10, rectF2.bottom);
            } else {
                RectF rectF3 = editorGetDotInfo.box;
                float f12 = rectF3.left;
                float f13 = (aVar.E / 2.0f) / editorSourceScale;
                rectF.set(f12 - f13, rectF3.top, f13 + f12, rectF3.bottom);
            }
            aVar.P.set(rectF.centerX() - aVar.H, (aVar.G / editorSourceScale) + rectF.bottom, rectF.centerX() + aVar.H, (aVar.G / editorSourceScale) + rectF.bottom + aVar.J);
            aVar.R.set(rectF.centerX() - ((aVar.H * 1.5f) / editorSourceScale), (aVar.G / editorSourceScale) + rectF.bottom, (((aVar.H / 2.0f) * 3.0f) / editorSourceScale) + rectF.centerX(), ((aVar.J * 1.5f) / editorSourceScale) + (aVar.G / editorSourceScale) + rectF.bottom);
            ReaderPDFCore.FontInfo editorGetFontInfo = aVar.f21683d.editorGetFontInfo();
            aVar.S.set(rectF);
            handler.post(new n0.g(21, aVar, editorGetFontInfo));
        }
        handler.post(new z0(aVar, 17));
    }

    public static void c(a aVar) {
        long j10;
        aVar.getClass();
        nj.b.a();
        aVar.j();
        aVar.g(TextEditorState.EDIT_TEXT);
        aVar.F();
        PDFPageView pDFPageView = aVar.f21687f;
        pDFPageView.f21188u1 = true;
        pDFPageView.f21187t1 = true;
        pDFPageView.G.removeCallbacks(pDFPageView.f21190w1);
        if (pDFPageView.f21187t1) {
            Handler handler = pDFPageView.G;
            PDFPageView.j jVar = pDFPageView.f21190w1;
            if (pDFPageView.f21188u1) {
                j10 = 650;
            } else {
                j10 = 500;
            }
            handler.postDelayed(jVar, j10);
        }
        pDFPageView.invalidate();
    }

    public static void d(a aVar, int i10) {
        mj.a aVar2;
        ArrayList<mj.a> arrayList = aVar.f21695m;
        if (arrayList != null && !arrayList.isEmpty() && i10 < arrayList.size() && (aVar2 = arrayList.get(i10)) != null) {
            RectF editorGetBlockBox = aVar.f21683d.editorGetBlockBox(aVar.f21685e, i10);
            if (editorGetBlockBox != null) {
                aVar2.f22045b.set(editorGetBlockBox);
            } else {
                aVar2.f22045b.setEmpty();
            }
            aVar.f21678a.post(new r(17, aVar, aVar2));
        }
    }

    public static void e(a aVar, int i10) {
        mj.a aVar2 = aVar.f21698p;
        if (aVar2 != null) {
            ReaderPDFCore.DotInfo editorGetDotInfo = aVar.f21683d.editorGetDotInfo();
            if (editorGetDotInfo != null && editorGetDotInfo.box != null) {
                float editorSourceScale = aVar.f21687f.getEditorSourceScale();
                if (editorGetDotInfo.direction == 0) {
                    RectF rectF = aVar.M;
                    RectF rectF2 = editorGetDotInfo.box;
                    float f10 = rectF2.right;
                    float f11 = (aVar.E / 2.0f) / editorSourceScale;
                    rectF.set(f10 - f11, rectF2.top, f11 + f10, rectF2.bottom);
                } else {
                    RectF rectF3 = aVar.M;
                    RectF rectF4 = editorGetDotInfo.box;
                    float f12 = rectF4.left;
                    float f13 = (aVar.E / 2.0f) / editorSourceScale;
                    rectF3.set(f12 - f13, rectF4.top, f13 + f12, rectF4.bottom);
                }
                RectF rectF5 = aVar.P;
                float centerX = aVar.M.centerX() - (aVar.H / editorSourceScale);
                RectF rectF6 = aVar.M;
                rectF5.set(centerX, (aVar.G / editorSourceScale) + rectF6.bottom, (aVar.H / editorSourceScale) + rectF6.centerX(), (aVar.J / editorSourceScale) + (aVar.G / editorSourceScale) + aVar.M.bottom);
                RectF rectF7 = aVar.R;
                float centerX2 = aVar.M.centerX() - ((aVar.H * 1.5f) / editorSourceScale);
                RectF rectF8 = aVar.M;
                rectF7.set(centerX2, (aVar.G / editorSourceScale) + rectF8.bottom, (((aVar.H / 2.0f) * 3.0f) / editorSourceScale) + rectF8.centerX(), ((aVar.J * 1.5f) / editorSourceScale) + (aVar.G / editorSourceScale) + aVar.M.bottom);
                aVar.f21678a.post(new com.facebook.appevents.g(10, aVar, aVar.f21683d.editorGetFontInfo()));
            }
            RectF editorGetBlockBox = aVar.f21683d.editorGetBlockBox(i10, aVar2.f22044a);
            aVar.f21678a.post(new l1.a(12, aVar, aVar.f21683d.editorSelectBlock(i10, aVar2.f22044a, true)));
            aVar.f21678a.post(new v4.a(3, aVar, editorGetBlockBox, aVar2));
        }
    }

    public static void f(a aVar) {
        Handler handler = aVar.f21678a;
        b0 b0Var = aVar.f21689g;
        Objects.requireNonNull(b0Var);
        handler.post(new b7.g(b0Var, 12));
    }

    public final void A() {
        this.M.setEmpty();
        this.N.setEmpty();
        this.O.setEmpty();
        this.P.setEmpty();
        this.R.setEmpty();
        this.Q.setEmpty();
        this.B.setEmpty();
        PDFPageView pDFPageView = this.f21687f;
        pDFPageView.f21188u1 = false;
        pDFPageView.f21187t1 = false;
    }

    public final void B() {
        Objects.toString(this.f21680b);
        this.f21685e = -1;
        this.f21680b = TextEditorState.NONE;
        C();
        this.f21678a.removeCallbacksAndMessages(null);
    }

    public final void C() {
        this.f21695m = null;
        D();
        this.f21697o = null;
        E();
        A();
        F();
    }

    public final void D() {
        if (this.f21698p != null) {
            this.f21698p.f22046d = false;
        }
        this.f21698p = null;
        this.f21707y.setEmpty();
        this.f21708z.setEmpty();
        this.A.setEmpty();
        A();
        F();
        j();
    }

    public final void E() {
        if (this.f21699q != null) {
            this.f21699q.c = false;
        }
        this.f21699q = null;
        this.f21687f.a1();
    }

    public final void F() {
        this.V.clear();
        this.Y.setEmpty();
        this.f21679a0.setEmpty();
        this.Z.setEmpty();
        this.f21681b0.setEmpty();
        this.f21682c0.setEmpty();
        this.f21684d0.setEmpty();
        this.f21686e0.setEmpty();
        this.f21688f0.setEmpty();
    }

    public final void G(float f10) {
        mj.e eVar = this.f21699q;
        if (eVar == null) {
            return;
        }
        Matrix matrix = new Matrix();
        eVar.f22052a.setMatrixValue(matrix);
        matrix.postRotate(f10, eVar.f22053b.centerX(), eVar.f22053b.centerY());
        u(new q(this, this.f21685e, matrix, eVar.f22052a));
        b0 b0Var = this.f21689g;
        if (b0Var != null) {
            b0Var.w();
        }
    }

    public final void H(mj.a aVar, boolean z10) {
        nj.b.a();
        E();
        A();
        F();
        this.f21698p = aVar;
        this.f21707y.setEmpty();
        float editorSourceScale = 3.0f / this.f21687f.getEditorSourceScale();
        RectF rectF = this.f21708z;
        RectF rectF2 = aVar.f22045b;
        float f10 = rectF2.left - (this.f21702t * editorSourceScale);
        float centerY = rectF2.centerY();
        float f11 = this.f21702t * editorSourceScale;
        RectF rectF3 = aVar.f22045b;
        rectF.set(f10, centerY - f11, f11 + rectF3.left, (this.f21702t * editorSourceScale) + rectF3.centerY());
        RectF rectF4 = this.A;
        RectF rectF5 = aVar.f22045b;
        float f12 = rectF5.right - (this.f21702t * editorSourceScale);
        float centerY2 = rectF5.centerY();
        float f13 = this.f21702t * editorSourceScale;
        RectF rectF6 = aVar.f22045b;
        rectF4.set(f12, centerY2 - f13, f13 + rectF6.right, (this.f21702t * editorSourceScale) + rectF6.centerY());
        u(new a0(this, this.f21685e, aVar, false));
        PDFPageView pDFPageView = this.f21687f;
        pDFPageView.invalidate();
        pDFPageView.q1();
        if (z10) {
            RectF rectF7 = aVar.f22045b;
            b0 b0Var = this.f21689g;
            if (b0Var != null) {
                float o10 = o();
                b0Var.a(new RectF(rectF7.left * o10, rectF7.top * o10, rectF7.right * o10, rectF7.bottom * o10));
            }
        }
    }

    public final void I(mj.e eVar) {
        nj.b.a();
        D();
        this.f21699q = eVar;
        PDFPageView pDFPageView = this.f21687f;
        pDFPageView.invalidate();
        pDFPageView.q1();
        RectF rectF = eVar.f22053b;
        b0 b0Var = this.f21689g;
        if (b0Var != null) {
            float o10 = o();
            b0Var.z(new RectF(rectF.left * o10, rectF.top * o10, rectF.right * o10, rectF.bottom * o10));
        }
    }

    public final void J() {
        if (this.f21698p != null && !this.V.isEmpty() && !this.f21682c0.isEmpty() && !this.f21684d0.isEmpty()) {
            PDFPageView pDFPageView = this.f21687f;
            RectF rectF = this.f21682c0;
            RectF rectF2 = this.f21684d0;
            pDFPageView.getClass();
            pDFPageView.j2(new c5.b(5, rectF, rectF2));
            u(new b(this.f21685e, this.f21698p));
        }
    }

    public final void K(int i10, mj.a aVar, ReaderPDFCore.SelectInfo selectInfo) {
        u(new d(i10, aVar, selectInfo));
    }

    public final void L(int i10) {
        if (this.f21685e == i10) {
            return;
        }
        this.f21685e = i10;
        C();
        u(new x(this, i10));
        u(new y(this, i10));
        this.f21687f.invalidate();
    }

    public final void M(int i10, mj.a aVar, ReaderPDFCore.SelectInfo selectInfo) {
        u(new c(i10, aVar, selectInfo));
    }

    public final void N(float f10, RectF rectF) {
        RectF rectF2 = this.Z;
        float f11 = rectF.right;
        float f12 = rectF.bottom;
        float f13 = this.I;
        rectF2.set(f11 * f10, f12 * f10, (f13 * 2.0f) + (f11 * f10), (f13 * 2.0f) + (f12 * f10));
        RectF rectF3 = this.f21681b0;
        float f14 = rectF.right;
        float f15 = this.I;
        float f16 = rectF.bottom;
        rectF3.set((f14 * f10) - f15, (f16 * f10) - f15, (f15 * 3.0f) + (f14 * f10), (f15 * 3.0f) + (f16 * f10));
    }

    public final void O(float f10, RectF rectF) {
        RectF rectF2 = this.Y;
        float f11 = rectF.left;
        float f12 = this.I;
        float f13 = rectF.top;
        rectF2.set((f11 * f10) - (f12 * 2.0f), (f13 * f10) - (f12 * 2.0f), f11 * f10, f13 * f10);
        RectF rectF3 = this.f21679a0;
        float f14 = rectF.left;
        float f15 = this.I;
        float f16 = rectF.top;
        rectF3.set((f14 * f10) - (f15 * 3.0f), (f16 * f10) - (3.0f * f15), (f14 * f10) + f15, (f16 * f10) + f15);
    }

    public final void P(int i10, float f10, float f11) {
        this.f21706x = false;
        u(new g(this.f21685e, i10, f10, f11));
    }

    public final void g(TextEditorState textEditorState) {
        b0 b0Var;
        this.c = this.f21680b;
        this.f21680b = textEditorState;
        if ((textEditorState == TextEditorState.ADJUST_TEXT_BLOCK || (this.c == TextEditorState.NONE && textEditorState == TextEditorState.EDIT_TEXT)) && this.f21698p != null && this.f21685e >= 0) {
            this.f21687f.y2(this.f21685e, this.f21698p.f22044a, -1);
        }
        if (textEditorState == TextEditorState.ADJUST_IMAGE && this.f21699q != null && this.f21685e >= 0) {
            this.f21687f.y2(this.f21685e, -1, this.f21699q.f22052a.getImgIndex());
        }
        if (textEditorState == TextEditorState.EDIT_TEXT) {
            PDFPageView pDFPageView = this.f21687f;
            RectF rectF = this.M;
            pDFPageView.getClass();
            pDFPageView.j2(new com.google.android.tools.d(rectF, 12));
        }
        TextEditorState textEditorState2 = this.c;
        TextEditorState textEditorState3 = TextEditorState.NONE;
        if ((textEditorState2 != textEditorState3 || textEditorState != textEditorState3) && (b0Var = this.f21689g) != null) {
            b0Var.s(textEditorState);
        }
    }

    public final void h() {
        RectF rectF = this.S;
        if (rectF.left < 0.0f) {
            rectF.left = 0.0f;
        }
        if (rectF.top < 0.0f) {
            rectF.top = 0.0f;
        }
        float f10 = rectF.right;
        PDFPageView pDFPageView = this.f21687f;
        if (f10 > pDFPageView.getMeasuredWidth() && pDFPageView.getMeasuredWidth() > 0) {
            rectF.right = pDFPageView.getMeasuredWidth();
            float f11 = rectF.left;
            float f12 = rectF.right;
            if (f11 > f12) {
                rectF.left = f12;
            }
        }
        if (rectF.bottom > pDFPageView.getMeasuredHeight() && pDFPageView.getMeasuredHeight() > 0) {
            rectF.bottom = pDFPageView.getMeasuredHeight();
            float f13 = rectF.top;
            float f14 = rectF.bottom;
            if (f13 > f14) {
                rectF.top = f14;
            }
        }
    }

    public final void i() {
        this.S.setEmpty();
        if (this.f21680b == TextEditorState.EDIT_TEXT && !this.M.isEmpty()) {
            this.S.set(this.M);
        } else if (this.f21680b == TextEditorState.SELECT_TEXT && !this.f21684d0.isEmpty()) {
            this.S.set(this.f21684d0);
        }
        if (!this.S.isEmpty()) {
            h();
            PDFPageView pDFPageView = this.f21687f;
            RectF rectF = this.S;
            ViewParent parent = pDFPageView.getParent();
            if (parent instanceof PDFReaderView) {
                PDFReaderView pDFReaderView = (PDFReaderView) parent;
                int i10 = pDFPageView.c;
                RectF rectF2 = pDFReaderView.f21419u0;
                rectF2.set(rectF);
                pDFReaderView.f21425x0 = i10;
                pDFReaderView.postDelayed(new i(rectF2, 19), 1000L);
            }
        }
    }

    public final void j() {
        this.f21687f.c1();
    }

    public final void k() {
        b0 b0Var;
        if (this.f21698p != null && this.f21701s != null && (b0Var = this.f21689g) != null) {
            b0Var.c(this.f21701s);
        }
    }

    public final void l() {
        b0 b0Var;
        if (this.f21698p != null && this.F != null && (b0Var = this.f21689g) != null) {
            b0Var.k(this.F);
        }
    }

    public final void m() {
        b0 b0Var;
        if (this.f21698p != null && this.f21700r != null && (b0Var = this.f21689g) != null) {
            b0Var.c(this.f21700r);
        }
    }

    public final void n() {
        if (this.f21698p != null && !this.f21698p.f22045b.isEmpty() && !this.V.isEmpty()) {
            RectF rectF = new RectF(this.f21698p.f22045b);
            b0 b0Var = this.f21689g;
            if (b0Var != null) {
                float o10 = o();
                rectF.left *= o10;
                rectF.top *= o10;
                rectF.right *= o10;
                rectF.bottom *= o10;
                b0Var.n(rectF);
            }
        }
    }

    public final float o() {
        return this.f21687f.getEditorScale();
    }

    public final void p(int i10, PointF pointF, PointF pointF2) {
        u(new C0287a(i10, this.f21698p, this.f21701s, pointF, pointF2));
    }

    public final boolean q() {
        if (this.f21687f.isAttachedToWindow()) {
            ViewParent parent = this.f21687f.getParent();
            if (parent instanceof PDFReaderView) {
                PDFReaderView pDFReaderView = (PDFReaderView) parent;
                this.f21693k.set(0.0f, 0.0f, pDFReaderView.getMeasuredWidth(), pDFReaderView.getMeasuredHeight());
                this.f21694l.set(this.f21687f.getLeft(), this.f21687f.getTop(), this.f21687f.getRight(), this.f21687f.getBottom());
                if (RectF.intersects(this.f21693k, this.f21694l)) {
                    this.f21694l.set(0.0f, 0.0f, this.f21687f.getMeasuredWidth(), this.f21687f.getMeasuredHeight());
                    if (this.f21687f.getLeft() < 0) {
                        this.f21694l.left -= this.f21687f.getLeft();
                    }
                    if (this.f21687f.getTop() < 0) {
                        this.f21694l.top -= this.f21687f.getTop();
                    }
                    if (this.f21687f.getRight() > pDFReaderView.getMeasuredWidth()) {
                        this.f21694l.right -= this.f21687f.getRight() - pDFReaderView.getMeasuredWidth();
                    }
                    if (this.f21687f.getBottom() > pDFReaderView.getMeasuredHeight()) {
                        this.f21694l.bottom -= this.f21687f.getBottom() - pDFReaderView.getMeasuredHeight();
                    }
                    float o10 = o();
                    this.S.setEmpty();
                    if (this.f21680b == TextEditorState.EDIT_TEXT && !this.M.isEmpty()) {
                        RectF rectF = this.S;
                        RectF rectF2 = this.M;
                        rectF.set(rectF2.left * o10, rectF2.top * o10, rectF2.right * o10, rectF2.bottom * o10);
                    } else if (this.f21680b == TextEditorState.SELECT_TEXT && !this.f21684d0.isEmpty()) {
                        RectF rectF3 = this.S;
                        RectF rectF4 = this.f21684d0;
                        rectF3.set(rectF4.left * o10, rectF4.top * o10, rectF4.right * o10, rectF4.bottom * o10);
                    }
                    if (!this.S.isEmpty()) {
                        h();
                        if ((this.f21694l.width() > this.S.width() && this.f21694l.height() > this.S.height() && !this.f21694l.contains(this.S)) || ((this.f21694l.width() < this.S.width() && !this.f21694l.contains(this.S.centerX(), this.S.centerY())) || (this.f21694l.height() < this.S.height() && !this.f21694l.contains(this.S.centerX(), this.S.centerY())))) {
                            i();
                            return false;
                        }
                        return true;
                    }
                    return true;
                }
            }
        }
        i();
        return false;
    }

    public final void r() {
        EditorView editorView = this.f21687f.getEditorView();
        if (editorView == null) {
            return;
        }
        if (this.f21680b == TextEditorState.ADJUST_TEXT_BLOCK) {
            j();
        }
        TextEditorState textEditorState = this.f21680b;
        TextEditorState textEditorState2 = TextEditorState.EDIT_TEXT;
        if (textEditorState != textEditorState2 && this.f21680b != TextEditorState.SELECT_TEXT) {
            s(this.f21685e, -1.0f, -1.0f, true);
            return;
        }
        this.S.setEmpty();
        if (this.f21680b == textEditorState2 && !this.M.isEmpty()) {
            this.S.set(this.M);
        } else if (this.f21680b == TextEditorState.SELECT_TEXT && !this.f21684d0.isEmpty()) {
            this.S.set(this.f21684d0);
        }
        if (!this.S.isEmpty()) {
            h();
            PDFPageView pDFPageView = this.f21687f;
            RectF rectF = this.S;
            ViewParent parent = pDFPageView.getParent();
            if (parent instanceof PDFReaderView) {
                PDFReaderView pDFReaderView = (PDFReaderView) parent;
                int i10 = pDFPageView.c;
                RectF rectF2 = pDFReaderView.f21419u0;
                rectF2.set(rectF);
                pDFReaderView.f21425x0 = i10;
                pDFReaderView.postDelayed(new i(rectF2, 19), 1000L);
            }
        }
        editorView.d();
        editorView.e();
        editorView.f21670i = true;
    }

    public final void s(int i10, float f10, float f11, boolean z10) {
        EditorView editorView = this.f21687f.getEditorView();
        if (editorView == null) {
            return;
        }
        editorView.d();
        u(new h(this.f21698p, i10, f10, f11, z10));
    }

    public final void t() {
        Objects.toString(this.f21680b);
        g(TextEditorState.NONE);
        ArrayList<mj.a> arrayList = this.f21695m;
        if (arrayList != null) {
            for (mj.a aVar : arrayList) {
                aVar.f22046d = false;
            }
        }
        ArrayList<mj.e> arrayList2 = this.f21697o;
        if (arrayList2 != null) {
            for (mj.e eVar : arrayList2) {
                eVar.c = false;
            }
        }
        D();
        E();
        A();
        F();
        j();
        this.f21687f.a1();
        EditorView editorView = this.f21687f.getEditorView();
        if (editorView != null) {
            editorView.d();
            editorView.c();
        }
        this.f21687f.invalidate();
    }

    public final void u(mj.b bVar) {
        ReaderPDFCore readerPDFCore = this.f21683d;
        if (readerPDFCore != null) {
            readerPDFCore.notifyTask(bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0585  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(float r23, float r24) {
        /*
            Method dump skipped, instructions count: 2115
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.text.editor.a.v(float, float):void");
    }

    public final void w(float f10) {
        ArrayList<RectF> arrayList;
        if (this.f21680b == TextEditorState.EDIT_TEXT && this.T) {
            this.T = false;
            u(new l(this, this.f21685e, this.f21698p, this.N.centerX(), this.N.centerY(), new RectF(this.M)));
            A();
            this.f21687f.invalidate();
        } else if (this.f21680b == TextEditorState.ADJUST_TEXT_BLOCK && this.f21703u && this.f21698p != null) {
            if (!this.f21704v && !this.f21705w) {
                float o10 = o();
                if (this.f21687f.getMeasuredHeight() > 0 && this.f21698p.f22045b.height() > this.f21687f.getMeasuredHeight() / o10) {
                    if (f10 > 0.0f) {
                        P(this.f21698p.f22044a, this.f21707y.left - this.f21698p.f22045b.left, (this.f21687f.getMeasuredHeight() / o10) - this.f21698p.f22045b.bottom);
                    } else if (f10 < 0.0f) {
                        P(this.f21698p.f22044a, this.f21707y.left - this.f21698p.f22045b.left, -this.f21698p.f22045b.top);
                    }
                } else {
                    P(this.f21698p.f22044a, this.f21707y.left - this.f21698p.f22045b.left, this.f21707y.top - this.f21698p.f22045b.top);
                }
            } else {
                int i10 = this.f21698p.f22044a;
                RectF rectF = this.f21707y;
                this.f21706x = false;
                u(new z(this, this.f21685e, i10, rectF));
            }
            this.f21705w = false;
            this.f21704v = false;
            this.f21703u = false;
        } else if (this.f21680b == TextEditorState.SELECT_TEXT && (this.W || this.X)) {
            RectF rectF2 = this.f21686e0;
            float f11 = rectF2.top;
            RectF rectF3 = this.f21688f0;
            float f12 = rectF3.top;
            if (f11 > f12) {
                rectF2.top = f12;
                rectF2.bottom = rectF3.bottom;
            }
            float f13 = rectF2.top;
            float f14 = rectF3.top;
            if (f13 == f14) {
                float f15 = rectF2.left;
                float f16 = rectF3.left;
                if (f15 > f16) {
                    rectF2.left = f16;
                    rectF2.right = rectF3.right;
                }
            }
            if (f14 < f13) {
                rectF3.top = f13;
                rectF3.bottom = rectF2.bottom;
            }
            if (rectF3.top == rectF2.top) {
                float f17 = rectF3.right;
                float f18 = rectF2.right;
                if (f17 < f18) {
                    rectF3.left = rectF2.left;
                    rectF3.right = f18;
                }
            }
            this.V.clear();
            for (int i11 = 0; i11 < this.C.size(); i11++) {
                RectF rectF4 = this.C.get(i11);
                if (rectF4.bottom >= this.f21686e0.centerY() && rectF4.top <= this.f21688f0.centerY()) {
                    RectF rectF5 = this.D.get(i11);
                    rectF5.set(rectF4);
                    this.V.add(rectF5);
                }
            }
            if (!this.V.isEmpty()) {
                RectF rectF6 = this.V.get(0);
                RectF rectF7 = this.V.get(arrayList.size() - 1);
                rectF6.left = Math.min(rectF6.right, Math.max(rectF6.left, this.f21686e0.left));
                rectF7.right = Math.max(rectF7.left, Math.min(rectF7.right, this.f21688f0.right));
                if (rectF6 == rectF7) {
                    if (this.W) {
                        float f19 = rectF6.left;
                        RectF rectF8 = this.f21684d0;
                        float f20 = rectF8.left;
                        if (f19 > f20) {
                            rectF6.left = f20;
                            rectF6.right = rectF8.right;
                        }
                    }
                    if (this.X) {
                        float f21 = rectF6.right;
                        RectF rectF9 = this.f21682c0;
                        float f22 = rectF9.right;
                        if (f21 < f22) {
                            rectF6.left = rectF9.left;
                            rectF6.right = f22;
                        }
                    }
                }
                RectF rectF10 = this.f21686e0;
                float f23 = rectF6.left;
                rectF10.set(f23, rectF6.top, f23, rectF6.bottom);
                RectF rectF11 = this.f21688f0;
                float f24 = rectF7.right;
                rectF11.set(f24, rectF7.top, f24, rectF7.bottom);
                float o11 = o();
                O(o11, this.f21686e0);
                N(o11, this.f21688f0);
            }
            if (this.W) {
                if (this.f21686e0.left == this.f21684d0.left) {
                    p(this.f21685e, new PointF(this.f21684d0.centerX(), this.f21684d0.centerY()), null);
                } else {
                    p(this.f21685e, new PointF(this.f21686e0.centerX(), this.f21686e0.centerY()), null);
                }
            } else if (this.X) {
                if (this.f21688f0.right == this.f21682c0.right) {
                    p(this.f21685e, null, new PointF(this.f21682c0.centerX(), this.f21682c0.centerY()));
                } else {
                    p(this.f21685e, null, new PointF(this.f21688f0.centerX(), this.f21688f0.centerY()));
                }
            }
            this.X = false;
            this.W = false;
        } else if (this.f21680b == TextEditorState.ADJUST_IMAGE) {
            mj.f fVar = f.a.f22077a;
            if (fVar.f22056a && this.f21699q != null) {
                RectF rectF12 = this.f21699q.f22053b;
                Annotation annotation = this.f21699q.f22052a;
                if (rectF12 != null && annotation != null) {
                    annotation.setMatrixValue(fVar.f22073s);
                    if (fVar.f22063i) {
                        Matrix matrix = fVar.f22073s;
                        float width = fVar.f22064j.width() / rectF12.width();
                        RectF rectF13 = fVar.f22064j;
                        matrix.postScale(width, 1.0f, rectF13.right, rectF13.top);
                        b0 b0Var = this.f21689g;
                        if (b0Var != null) {
                            b0Var.v();
                        }
                    } else if (fVar.c) {
                        Matrix matrix2 = fVar.f22073s;
                        float height = fVar.f22064j.height() / rectF12.height();
                        RectF rectF14 = fVar.f22064j;
                        matrix2.postScale(1.0f, height, rectF14.left, rectF14.bottom);
                        b0 b0Var2 = this.f21689g;
                        if (b0Var2 != null) {
                            b0Var2.v();
                        }
                    } else if (fVar.f22059e) {
                        Matrix matrix3 = fVar.f22073s;
                        float width2 = fVar.f22064j.width() / rectF12.width();
                        RectF rectF15 = fVar.f22064j;
                        matrix3.postScale(width2, 1.0f, rectF15.left, rectF15.top);
                        b0 b0Var3 = this.f21689g;
                        if (b0Var3 != null) {
                            b0Var3.v();
                        }
                    } else if (fVar.f22061g) {
                        Matrix matrix4 = fVar.f22073s;
                        float height2 = fVar.f22064j.height() / rectF12.height();
                        RectF rectF16 = fVar.f22064j;
                        matrix4.postScale(1.0f, height2, rectF16.left, rectF16.top);
                        b0 b0Var4 = this.f21689g;
                        if (b0Var4 != null) {
                            b0Var4.v();
                        }
                    } else if (fVar.f22057b) {
                        Matrix matrix5 = fVar.f22073s;
                        float width3 = fVar.f22064j.width() / rectF12.width();
                        float height3 = fVar.f22064j.height() / rectF12.height();
                        RectF rectF17 = fVar.f22064j;
                        matrix5.postScale(width3, height3, rectF17.right, rectF17.bottom);
                        b0 b0Var5 = this.f21689g;
                        if (b0Var5 != null) {
                            b0Var5.v();
                        }
                    } else if (fVar.f22058d) {
                        Matrix matrix6 = fVar.f22073s;
                        float width4 = fVar.f22064j.width() / rectF12.width();
                        float height4 = fVar.f22064j.height() / rectF12.height();
                        RectF rectF18 = fVar.f22064j;
                        matrix6.postScale(width4, height4, rectF18.left, rectF18.bottom);
                        b0 b0Var6 = this.f21689g;
                        if (b0Var6 != null) {
                            b0Var6.v();
                        }
                    } else if (fVar.f22060f) {
                        Matrix matrix7 = fVar.f22073s;
                        float width5 = fVar.f22064j.width() / rectF12.width();
                        float height5 = fVar.f22064j.height() / rectF12.height();
                        RectF rectF19 = fVar.f22064j;
                        matrix7.postScale(width5, height5, rectF19.left, rectF19.top);
                        b0 b0Var7 = this.f21689g;
                        if (b0Var7 != null) {
                            b0Var7.v();
                        }
                    } else if (fVar.f22062h) {
                        Matrix matrix8 = fVar.f22073s;
                        float width6 = fVar.f22064j.width() / rectF12.width();
                        float height6 = fVar.f22064j.height() / rectF12.height();
                        RectF rectF20 = fVar.f22064j;
                        matrix8.postScale(width6, height6, rectF20.right, rectF20.top);
                        b0 b0Var8 = this.f21689g;
                        if (b0Var8 != null) {
                            b0Var8.v();
                        }
                    } else {
                        Matrix matrix9 = fVar.f22073s;
                        RectF rectF21 = fVar.f22064j;
                        matrix9.postTranslate(rectF21.left - rectF12.left, rectF21.top - rectF12.top);
                        b0 b0Var9 = this.f21689g;
                        if (b0Var9 != null) {
                            b0Var9.B();
                        }
                    }
                    u(new q(this, this.f21685e, fVar.f22073s, annotation));
                    fVar.a();
                } else {
                    fVar.a();
                }
                this.f21687f.invalidate();
            }
        }
        EditorAlignCheck editorAlignCheck = EditorAlignCheck.b.f21666a;
        editorAlignCheck.f21659d = -1.0f;
        editorAlignCheck.c = -1.0f;
        editorAlignCheck.f21658b = -1.0f;
        editorAlignCheck.f21657a = -1.0f;
        this.f21690h = false;
    }

    public final void x(RectF rectF, RectF rectF2, RectF rectF3) {
        A();
        g(TextEditorState.SELECT_TEXT);
        ArrayList<RectF> arrayList = this.V;
        arrayList.clear();
        arrayList.add(rectF3);
        this.f21682c0.set(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f21684d0.set(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom);
        this.f21686e0.setEmpty();
        this.f21688f0.setEmpty();
        float o10 = o();
        O(o10, rectF);
        N(o10, rectF2);
        J();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.text.editor.a.y(android.view.MotionEvent):void");
    }

    public final void z(ReaderPDFCore.FontInfo fontInfo) {
        u(new e(this.f21685e, fontInfo));
    }
}
