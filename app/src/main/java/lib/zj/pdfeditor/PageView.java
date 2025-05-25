package lib.zj.pdfeditor;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import com.google.android.gms.common.api.Api;
import ij.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kj.b;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.i;
import lib.zj.pdfeditor.model.AnalyticsEvent;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import lib.zj.reflow.ReflowLoadingView;
import oj.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* loaded from: classes3.dex */
public abstract class PageView extends ViewGroup {
    public static Point E0 = new Point();
    public PDFFreeTextEditView A;
    public ArrayList<kj.b> A0;
    public volatile ArrayList B;
    public ArrayList<kj.b> B0;
    public volatile ArrayList<lj.a> C;
    public PDFReaderView.Mode C0;
    public j D;
    public int D0;
    public boolean E;
    public final ReflowLoadingView F;
    public final Handler G;
    public View H;
    public View I;
    public View J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public SelectPopMode T;
    public View U;
    public boolean V;
    public qg.c W;

    /* renamed from: a  reason: collision with root package name */
    public final int f21266a;

    /* renamed from: a0  reason: collision with root package name */
    public final WeakReference<Context> f21267a0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f21268b;

    /* renamed from: b0  reason: collision with root package name */
    public BitmapRegionDecoder f21269b0;
    public int c;

    /* renamed from: c0  reason: collision with root package name */
    public int f21270c0;

    /* renamed from: d  reason: collision with root package name */
    public Point f21271d;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f21272d0;

    /* renamed from: e  reason: collision with root package name */
    public Point f21273e;

    /* renamed from: e0  reason: collision with root package name */
    public final og.a f21274e0;

    /* renamed from: f  reason: collision with root package name */
    public float f21275f;

    /* renamed from: f0  reason: collision with root package name */
    public long f21276f0;

    /* renamed from: g  reason: collision with root package name */
    public float f21277g;

    /* renamed from: g0  reason: collision with root package name */
    public int f21278g0;

    /* renamed from: h  reason: collision with root package name */
    public lib.zj.pdfeditor.g f21279h;

    /* renamed from: h0  reason: collision with root package name */
    public int f21280h0;

    /* renamed from: i  reason: collision with root package name */
    public f0 f21281i;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f21282i0;

    /* renamed from: j  reason: collision with root package name */
    public c0 f21283j;

    /* renamed from: j0  reason: collision with root package name */
    public final Matrix f21284j0;

    /* renamed from: k  reason: collision with root package name */
    public lib.zj.pdfeditor.b<Void, Boolean> f21285k;

    /* renamed from: k0  reason: collision with root package name */
    public PopupWindow f21286k0;

    /* renamed from: l  reason: collision with root package name */
    public c f21287l;

    /* renamed from: l0  reason: collision with root package name */
    public PopupWindow f21288l0;

    /* renamed from: m  reason: collision with root package name */
    public b f21289m;

    /* renamed from: m0  reason: collision with root package name */
    public PopupWindow f21290m0;

    /* renamed from: n  reason: collision with root package name */
    public Bitmap f21291n;

    /* renamed from: n0  reason: collision with root package name */
    public PopupWindow f21292n0;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f21293o;

    /* renamed from: o0  reason: collision with root package name */
    public volatile boolean f21294o0;

    /* renamed from: p  reason: collision with root package name */
    public Bitmap f21295p;

    /* renamed from: p0  reason: collision with root package name */
    public Context f21296p0;

    /* renamed from: q  reason: collision with root package name */
    public Point f21297q;

    /* renamed from: q0  reason: collision with root package name */
    public ij.a f21298q0;

    /* renamed from: r  reason: collision with root package name */
    public Rect f21299r;

    /* renamed from: r0  reason: collision with root package name */
    public ij.a f21300r0;

    /* renamed from: s  reason: collision with root package name */
    public Rect f21301s;

    /* renamed from: s0  reason: collision with root package name */
    public final Handler f21302s0;

    /* renamed from: t  reason: collision with root package name */
    public lib.zj.pdfeditor.g f21303t;

    /* renamed from: t0  reason: collision with root package name */
    public PointF f21304t0;

    /* renamed from: u  reason: collision with root package name */
    public RectF[] f21305u;

    /* renamed from: u0  reason: collision with root package name */
    public PointF f21306u0;

    /* renamed from: v  reason: collision with root package name */
    public LinkInfo[] f21307v;

    /* renamed from: v0  reason: collision with root package name */
    public final HashMap<a.b, ArrayList<Integer>> f21308v0;

    /* renamed from: w  reason: collision with root package name */
    public RectF f21309w;

    /* renamed from: w0  reason: collision with root package name */
    public final HashMap<a.b, ArrayList<a.C0249a>> f21310w0;

    /* renamed from: x  reason: collision with root package name */
    public TextChar[][] f21311x;

    /* renamed from: x0  reason: collision with root package name */
    public int f21312x0;

    /* renamed from: y  reason: collision with root package name */
    public RectF f21313y;

    /* renamed from: y0  reason: collision with root package name */
    public final StringBuilder f21314y0;

    /* renamed from: z  reason: collision with root package name */
    public boolean f21315z;

    /* renamed from: z0  reason: collision with root package name */
    public StringBuilder f21316z0;

    /* loaded from: classes3.dex */
    public enum SelectPopMode {
        Copy,
        Annot_Before_Select,
        Annot_After_Select
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f21318a;

        /* renamed from: lib.zj.pdfeditor.PageView$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0285a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Intent f21320a;

            public RunnableC0285a(Intent intent) {
                this.f21320a = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                PageView pageView = PageView.this;
                if (pageView.f21296p0 != null) {
                    pageView.S1();
                    p1.a.a(PageView.this.f21296p0).c(this.f21320a);
                }
            }
        }

        public a(int i10) {
            this.f21318a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            PageView pageView = PageView.this;
            TextChar[][] text = pageView.getText();
            Intent intent = new Intent("ACTION_EXTRACT_TXT_END");
            intent.putExtra("pageNum", this.f21318a);
            int i10 = 0;
            if (text != null) {
                boolean z10 = false;
                for (TextChar[] textCharArr : text) {
                    if (textCharArr != null && textCharArr.length > 0) {
                        int length = textCharArr.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                break;
                            } else if (!TextUtils.isEmpty(String.valueOf(textCharArr[i11].c).trim())) {
                                z10 = true;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (z10) {
                    i10 = text.length;
                }
                pageView.S1();
                intent.putExtra("txtSize", i10);
            } else {
                intent.putExtra("txtSize", 0);
            }
            pageView.post(new RunnableC0285a(intent));
        }
    }

    /* loaded from: classes3.dex */
    public class b extends lib.zj.pdfeditor.b<Void, oj.b> {
        public final /* synthetic */ int c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f21322d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f21323e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f21324f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lib.zj.pdfeditor.c cVar, int i10, float f10, boolean z10, String str) {
            super(cVar, null);
            this.c = i10;
            this.f21322d = f10;
            this.f21323e = z10;
            this.f21324f = str;
        }

        @Override // lib.zj.pdfeditor.b
        public final void c(oj.b bVar) {
            ReaderView readerView;
            qg.f fVar;
            boolean z10;
            String str;
            oj.b bVar2 = bVar;
            nj.b.a();
            PageView pageView = PageView.this;
            pageView.S1();
            if (pageView.isAttachedToWindow() && bVar2 != null) {
                Bitmap bitmap = bVar2.f23101b;
                if (!bitmap.isRecycled()) {
                    pageView.setBackgroundColor(0);
                    pageView.F.setVisibility(8);
                    aj.b a10 = pg.a.c().a();
                    StringBuilder sb2 = new StringBuilder("renderReflow success pageNumber ");
                    int i10 = this.c;
                    sb2.append(i10);
                    sb2.append(" width_height_size ");
                    sb2.append(bitmap.getWidth());
                    sb2.append("_");
                    sb2.append(bitmap.getHeight());
                    sb2.append("_");
                    sb2.append(bitmap.getByteCount());
                    String sb3 = sb2.toString();
                    a10.getClass();
                    aj.b.K(sb3);
                    bitmap.getWidth();
                    bitmap.getHeight();
                    bitmap.getByteCount();
                    pageView.S1();
                    if (pageView.isAttachedToWindow()) {
                        lib.zj.pdfeditor.i iVar = i.a.f21508a;
                        if (iVar.f21507d && pageView.f21279h != null) {
                            pageView.f21270c0 = bVar2.c;
                            pageView.S1();
                            pageView.f21279h.setImageBitmap(bitmap);
                            pageView.f21279h.invalidate();
                            if (pageView.getSkipStamp() != -1) {
                                pageView.q1();
                            }
                            pageView.setBackgroundColor(0);
                            og.a aVar = pageView.f21274e0;
                            og.b bVar3 = aVar.f23056a;
                            oj.a aVar2 = a.C0318a.f23099a;
                            int a11 = aVar2.a(i10);
                            ReaderView readerView2 = (ReaderView) bVar3;
                            qg.f fVar2 = readerView2.f21411q0;
                            if (fVar2 != null && readerView2.f21381b == i10) {
                                if (a11 > 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                                readerPreviewActivity.f26204k0 = false;
                                if (iVar.f21507d && aVar2.a(readerPreviewActivity.B2) > 1) {
                                    readerPreviewActivity.K2();
                                } else {
                                    readerPreviewActivity.u4(false);
                                }
                                ReaderPreviewActivity.e2(readerPreviewActivity, readerPreviewActivity.B2);
                                if (!z10 && readerPreviewActivity.f26176e5) {
                                    readerPreviewActivity.F4();
                                }
                                if (z10) {
                                    if (readerPreviewActivity.f26176e5) {
                                        if (readerPreviewActivity.f26155a5) {
                                            readerPreviewActivity.s3();
                                        } else {
                                            readerPreviewActivity.M4();
                                            ProgressView progressView = readerPreviewActivity.f26222n0;
                                            if (progressView != null) {
                                                progressView.setVisibility(8);
                                            }
                                            TextView textView = readerPreviewActivity.f26228o0;
                                            if (textView != null) {
                                                textView.setVisibility(0);
                                                String str2 = this.f21324f;
                                                if (!TextUtils.isEmpty(str2)) {
                                                    readerPreviewActivity.f26228o0.setText(str2);
                                                }
                                            }
                                        }
                                        g1<ReaderPreviewActivity> g1Var = readerPreviewActivity.C;
                                        if (g1Var != null) {
                                            ReaderPreviewActivity.z zVar = readerPreviewActivity.T2;
                                            g1Var.removeCallbacks(zVar);
                                            readerPreviewActivity.C.postDelayed(zVar, 2000L);
                                        }
                                    } else {
                                        readerPreviewActivity.f26176e5 = true;
                                    }
                                }
                                if (readerPreviewActivity.f26155a5) {
                                    readerPreviewActivity.f26155a5 = false;
                                }
                                String p10 = ea.a.p("QWUtbBx3", "fev0nlAp");
                                String p11 = ea.a.p("QWUtbBx3PXIXYVBfBHU6dA==", "FLunbQda");
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(pdf.pdfreader.viewer.editor.free.utils.p.d(readerPreviewActivity.f26245r1));
                                sb4.append(ea.a.p("Xw==", "I32GUhOC"));
                                int i11 = iVar.c;
                                if (i11 >= 0 && i11 < 6) {
                                    str = lib.zj.pdfeditor.i.f21503g[i11];
                                } else {
                                    str = "out of range";
                                }
                                sb4.append(str);
                                tn.a.d(readerPreviewActivity, p10, p11, sb4.toString(), false);
                            }
                            int i12 = readerView2.f21381b;
                            if (i12 == i10) {
                                readerView2.S = true;
                            }
                            if (this.f21323e && i10 == i12) {
                                readerView2.c = true;
                                readerView2.requestLayout();
                            }
                            og.b bVar4 = aVar.f23056a;
                            qg.f fVar3 = ((ReaderView) bVar4).f21411q0;
                            if (bVar2.f23102d == 101 && (fVar = (readerView = (ReaderView) bVar4).f21411q0) != null && readerView.f21381b == i10) {
                                ExecutorService executorService = ReaderPreviewActivity.U5;
                                ReaderPreviewActivity readerPreviewActivity2 = ReaderPreviewActivity.this;
                                g1<ReaderPreviewActivity> g1Var2 = readerPreviewActivity2.C;
                                if (g1Var2 != null) {
                                    g1Var2.removeCallbacks(readerPreviewActivity2.T2);
                                }
                                FrameLayout frameLayout = readerPreviewActivity2.f26177f0;
                                if (frameLayout != null) {
                                    frameLayout.setVisibility(8);
                                }
                                String string = readerPreviewActivity2.getString(R.string.arg_res_0x7f130560);
                                if (!readerPreviewActivity2.isFinishing()) {
                                    j1.e(readerPreviewActivity2, string, true, null, -1);
                                }
                            }
                        }
                    }
                    Bitmap bitmap2 = pageView.f21295p;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        pageView.f21295p.recycle();
                        pageView.f21295p = null;
                    }
                    BitmapRegionDecoder bitmapRegionDecoder = pageView.f21269b0;
                    if (bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled()) {
                        pageView.f21269b0.recycle();
                    }
                    boolean z11 = i.a.f21508a.f21507d;
                    BitmapRegionDecoder bitmapRegionDecoder2 = bVar2.f23100a;
                    if (z11) {
                        pageView.f21295p = bitmap;
                        if (bitmapRegionDecoder2 != null && !bitmapRegionDecoder2.isRecycled()) {
                            pageView.f21269b0 = bitmapRegionDecoder2;
                        }
                    } else {
                        pg.a.c().a().getClass();
                        aj.b.K("renderReflow onPostExecute not reflow releaseBitmap " + i10);
                        bitmap.recycle();
                        if (bitmapRegionDecoder2 != null && !bitmapRegionDecoder2.isRecycled()) {
                            bitmapRegionDecoder2.recycle();
                        }
                    }
                    pageView.f21299r = null;
                    pageView.e();
                }
            }
        }

        @Override // lib.zj.pdfeditor.b
        public final void d() {
            PageView pageView = PageView.this;
            if (pageView.getSkipStamp() != -1) {
                pageView.q1();
            }
            boolean z10 = this.f21323e;
            if (z10) {
                PageView.J0(pageView);
            }
            ReaderView readerView = (ReaderView) pageView.f21274e0.f23056a;
            qg.f fVar = readerView.f21411q0;
            int i10 = this.c;
            if (fVar != null) {
                if (i10 == readerView.f21381b) {
                    boolean z11 = !z10;
                    ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                    boolean z12 = true;
                    readerPreviewActivity.f26204k0 = true;
                    if (z11 && a.C0318a.f23099a.a(readerPreviewActivity.B2) > 1) {
                        int i11 = i.a.f21508a.c;
                        if (i11 != 4 && i11 != 5) {
                            z12 = false;
                        }
                        if (z12) {
                            readerPreviewActivity.M4();
                            ProgressView progressView = readerPreviewActivity.f26222n0;
                            if (progressView != null) {
                                progressView.setVisibility(0);
                            }
                            TextView textView = readerPreviewActivity.f26228o0;
                            if (textView != null) {
                                textView.setVisibility(8);
                            }
                        }
                    }
                }
                if (i10 == readerView.f21381b && z10) {
                    readerView.f21411q0.getClass();
                }
            }
            pageView.w1("reflow start render page " + i10 + " fontValue " + this.f21322d + " showLoading " + z10);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends lib.zj.pdfeditor.b<Void, Boolean> {
        public final /* synthetic */ Bitmap c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Rect f21326d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Point f21327e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(lib.zj.pdfeditor.c cVar, Bitmap bitmap, Bitmap bitmap2, Rect rect, Point point) {
            super(cVar, bitmap);
            this.c = bitmap2;
            this.f21326d = rect;
            this.f21327e = point;
        }

        @Override // lib.zj.pdfeditor.b
        public final void c(Boolean bool) {
            Rect rect;
            Boolean bool2 = bool;
            nj.b.a();
            PageView pageView = PageView.this;
            if (pageView.isAttachedToWindow() && bool2 != null && bool2.booleanValue()) {
                Bitmap bitmap = this.c;
                if (!bitmap.isRecycled() && pageView.f21303t != null && (rect = pageView.f21301s) != null) {
                    Rect rect2 = this.f21326d;
                    if (rect.equals(rect2)) {
                        pageView.f21297q = this.f21327e;
                        pageView.f21299r = rect2;
                        pageView.f21303t.setImageBitmap(bitmap);
                        pageView.f21303t.invalidate();
                        lib.zj.pdfeditor.g gVar = pageView.f21303t;
                        Rect rect3 = pageView.f21299r;
                        gVar.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        Bitmap bitmap2 = pageView.f21293o;
                        if (bitmap2 != bitmap) {
                            if (bitmap2 != null && !bitmap2.isRecycled()) {
                                pageView.f21293o.recycle();
                            }
                            pageView.f21293o = bitmap;
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = PageView.this.f21287l;
            if (cVar != null) {
                cVar.b(new Void[0]);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e extends lib.zj.pdfeditor.b<Void, Boolean> {
        public final /* synthetic */ Bitmap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(lib.zj.pdfeditor.c cVar, Bitmap bitmap, Bitmap bitmap2) {
            super(cVar, bitmap);
            this.c = bitmap2;
        }

        @Override // lib.zj.pdfeditor.b
        public final void c(Boolean bool) {
            Boolean bool2 = bool;
            nj.b.a();
            PageView pageView = PageView.this;
            if (pageView.isAttachedToWindow() && bool2 != null && bool2.booleanValue()) {
                Bitmap bitmap = this.c;
                if (!bitmap.isRecycled() && pageView.f21279h != null) {
                    pageView.S1();
                    pageView.f21279h.setImageBitmap(bitmap);
                    pageView.f21279h.invalidate();
                    Bitmap bitmap2 = pageView.f21291n;
                    if (bitmap2 != bitmap) {
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            pageView.f21291n.recycle();
                        }
                        pageView.f21291n = bitmap;
                    }
                }
            }
            Point point = PageView.E0;
            pageView.setBackgroundColor(0);
            pageView.F.setVisibility(8);
        }

        @Override // lib.zj.pdfeditor.b
        public final void d() {
            PageView pageView = PageView.this;
            if (pageView.f21291n == null) {
                PageView.J0(pageView);
                return;
            }
            pageView.setBackgroundColor(0);
            pageView.F.setVisibility(8);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements s0 {
        public f() {
        }

        @Override // lib.zj.pdfeditor.s0
        public final void a() {
            PageView pageView = PageView.this;
            if (pageView.f21316z0.length() == 0) {
                return;
            }
            if (pageView.f21314y0.length() > 0) {
                pageView.f21314y0.append('\n');
            }
            pageView.f21314y0.append((CharSequence) pageView.f21316z0);
        }

        @Override // lib.zj.pdfeditor.s0
        public final void b(TextChar textChar) {
            PageView.this.f21316z0.append(textChar.c);
        }

        @Override // lib.zj.pdfeditor.s0
        public final void c() {
            PageView.this.f21316z0 = new StringBuilder();
        }
    }

    /* loaded from: classes3.dex */
    public class g extends lib.zj.pdfeditor.b<Void, Boolean> {
        public final /* synthetic */ Bitmap c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(lib.zj.pdfeditor.c cVar, Bitmap bitmap, Bitmap bitmap2) {
            super(cVar, bitmap);
            this.c = bitmap2;
        }

        @Override // lib.zj.pdfeditor.b
        public final void c(Boolean bool) {
            lib.zj.pdfeditor.g gVar;
            Boolean bool2 = bool;
            nj.b.a();
            PageView pageView = PageView.this;
            if (pageView.isAttachedToWindow() && bool2 != null && bool2.booleanValue()) {
                Bitmap bitmap = this.c;
                if (!bitmap.isRecycled() && (gVar = pageView.f21279h) != null) {
                    gVar.setImageBitmap(bitmap);
                    pageView.f21279h.invalidate();
                    pageView.setBackgroundColor(0);
                    Bitmap bitmap2 = pageView.f21291n;
                    if (bitmap2 != bitmap) {
                        if (bitmap2 != null && bitmap2.isRecycled()) {
                            pageView.f21291n.recycle();
                        }
                        pageView.f21291n = bitmap;
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class h {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21333a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f21334b;

        static {
            int[] iArr = new int[ReaderPDFCore.CX_Status.values().length];
            f21334b = iArr;
            try {
                iArr[ReaderPDFCore.CX_Status.CX_Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21334b[ReaderPDFCore.CX_Status.CX_End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21334b[ReaderPDFCore.CX_Status.CX_Middle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21334b[ReaderPDFCore.CX_Status.CX_All.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SelectPopMode.values().length];
            f21333a = iArr2;
            try {
                iArr2[SelectPopMode.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21333a[SelectPopMode.Annot_After_Select.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21333a[SelectPopMode.Annot_Before_Select.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i extends lib.zj.pdfeditor.b<Void, Boolean> {
        public final /* synthetic */ Bitmap c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ PageView f21335d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(PDFPageView pDFPageView, lib.zj.pdfeditor.c cVar, Bitmap bitmap, Bitmap bitmap2) {
            super(cVar, bitmap);
            this.f21335d = pDFPageView;
            this.c = bitmap2;
        }

        @Override // lib.zj.pdfeditor.b
        public final void c(Boolean bool) {
            Boolean bool2 = bool;
            nj.b.a();
            PageView pageView = this.f21335d;
            if (pageView.isAttachedToWindow() && bool2 != null && bool2.booleanValue()) {
                Bitmap bitmap = this.c;
                if (!bitmap.isRecycled() && pageView.f21279h != null) {
                    pageView.setBackgroundColor(0);
                    pageView.F.setVisibility(8);
                    pageView.f21279h.setImageBitmap(bitmap);
                    pageView.f21279h.invalidate();
                    Bitmap bitmap2 = pageView.f21291n;
                    if (bitmap2 != bitmap) {
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            pageView.f21291n.recycle();
                        }
                        pageView.f21291n = bitmap;
                    }
                }
            }
        }

        @Override // lib.zj.pdfeditor.b
        public final void d() {
            PageView.J0(this.f21335d);
        }
    }

    /* loaded from: classes3.dex */
    public class j extends View {

        /* renamed from: a  reason: collision with root package name */
        public final RectF f21336a;

        /* renamed from: b  reason: collision with root package name */
        public final RectF f21337b;
        public final int[] c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Paint f21338d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f21339e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ List f21340f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Paint f21341g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Paint f21342h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ int f21343i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ int f21344j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ int f21345k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ int f21346l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Paint f21347m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ Paint f21348n;

        /* loaded from: classes3.dex */
        public class a implements s0 {

            /* renamed from: a  reason: collision with root package name */
            public TextChar f21350a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ PDFReaderView f21351b;
            public final /* synthetic */ Canvas c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ float f21352d;

            public a(PDFReaderView pDFReaderView, Canvas canvas, float f10) {
                this.f21351b = pDFReaderView;
                this.c = canvas;
                this.f21352d = f10;
            }

            @Override // lib.zj.pdfeditor.s0
            public final void a() {
                j jVar = j.this;
                PageView pageView = PageView.this;
                RectF rectF = jVar.f21336a;
                Objects.toString(rectF);
                pageView.S1();
                if (!rectF.isEmpty()) {
                    jVar.f21337b.union(rectF);
                    SelectPopMode selectPopMode = PageView.this.T;
                    SelectPopMode selectPopMode2 = SelectPopMode.Annot_After_Select;
                    PDFReaderView pDFReaderView = this.f21351b;
                    float f10 = this.f21352d;
                    if (selectPopMode == selectPopMode2) {
                        if (pDFReaderView != null && !pDFReaderView.F1) {
                            float f11 = jVar.f21339e;
                            this.c.drawRect(new RectF(rectF.left * f10, (rectF.top * f10) - f11, rectF.right * f10, (rectF.bottom * f10) + f11), jVar.f21342h);
                        }
                    } else {
                        this.c.drawRect(rectF.left * f10, rectF.top * f10, rectF.right * f10, rectF.bottom * f10, jVar.f21338d);
                    }
                    if (pDFReaderView != null) {
                        if (pDFReaderView.f21238m1) {
                            TextChar textChar = this.f21350a;
                            if (textChar != null) {
                                pDFReaderView.h1(textChar);
                            }
                        } else if (pDFReaderView.f21239n1) {
                            pDFReaderView.h1(rectF);
                        }
                    }
                }
            }

            @Override // lib.zj.pdfeditor.s0
            public final void b(TextChar textChar) {
                if (this.f21350a == null) {
                    this.f21350a = textChar;
                }
                j.this.f21336a.union(textChar);
            }

            @Override // lib.zj.pdfeditor.s0
            public final void c() {
                j.this.f21336a.setEmpty();
            }
        }

        /* loaded from: classes3.dex */
        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.c1();
                PageView.this.g1();
            }
        }

        /* loaded from: classes3.dex */
        public class c implements View.OnClickListener {
            public c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.c1();
                PageView.this.U0();
            }
        }

        /* loaded from: classes3.dex */
        public class d implements View.OnClickListener {
            public d() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.c1();
                PageView.this.W0();
            }
        }

        /* loaded from: classes3.dex */
        public class e implements View.OnClickListener {
            public e() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.a1();
                PageView.this.J1();
            }
        }

        /* loaded from: classes3.dex */
        public class f implements View.OnClickListener {
            public f() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.a1();
                PageView.this.K1();
            }
        }

        /* loaded from: classes3.dex */
        public class g implements View.OnClickListener {
            public g() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                j jVar = j.this;
                PageView.this.a1();
                PageView.this.V0();
            }
        }

        /* loaded from: classes3.dex */
        public class h extends ng.c {
            public h() {
            }

            @Override // ng.c
            public final void a() {
                j jVar = j.this;
                PageView.this.d1();
                PageView.G0(PageView.this, AnalyticsEvent.DELETE_POP_CLICK);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context, Paint paint, int i10, ArrayList arrayList, Paint paint2, Paint paint3, int i11, int i12, int i13, int i14, Paint paint4, Paint paint5) {
            super(context);
            this.f21338d = paint;
            this.f21339e = i10;
            this.f21340f = arrayList;
            this.f21341g = paint2;
            this.f21342h = paint3;
            this.f21343i = i11;
            this.f21344j = i12;
            this.f21345k = i13;
            this.f21346l = i14;
            this.f21347m = paint4;
            this.f21348n = paint5;
            this.f21336a = new RectF();
            this.f21337b = new RectF();
            this.c = new int[2];
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            PDFReaderView pDFReaderView;
            float f10;
            float f11;
            int i10;
            boolean z10;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            boolean z11;
            int measuredWidth;
            Canvas canvas2;
            int i17;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            boolean z12;
            int measuredWidth2;
            boolean z13;
            int i23;
            int i24;
            int i25;
            int i26;
            int i27;
            int i28;
            boolean z14;
            int measuredWidth3;
            int i29;
            int i30;
            int i31;
            int i32;
            int i33;
            int i34;
            int i35;
            int i36;
            boolean z15;
            int measuredWidth4;
            SelectPopMode selectPopMode;
            int i37;
            int i38;
            LinkInfo[] linkInfoArr;
            super.onDraw(canvas);
            this.f21338d.setStrokeWidth(this.f21339e);
            float scale = PageView.this.getScale();
            float editorScale = PageView.this.getEditorScale();
            if (PageView.this.r1() && PageView.this.C != null && PageView.this.C.size() > 0) {
                this.f21340f.clear();
                this.f21340f.addAll(PageView.this.C);
                int i39 = 0;
                for (lj.a aVar : this.f21340f) {
                    if (aVar == null) {
                        i39++;
                    } else {
                        aVar.i(i39);
                        i39++;
                        if (!aVar.h() && aVar.f() != null && aVar.g() != null && aVar.c() != null && aVar.d() != null) {
                            if (aVar.b() != null && !aVar.b().isRecycled()) {
                                canvas.save();
                                PageView.this.f21284j0.reset();
                                PageView.this.f21284j0.postRotate(aVar.e() - aVar.a());
                                canvas.scale(scale, scale);
                                Bitmap b10 = aVar.b();
                                canvas.drawBitmap(Bitmap.createBitmap(b10, 0, 0, b10.getWidth(), b10.getHeight(), PageView.this.f21284j0, true), (Rect) null, aVar.f(), this.f21341g);
                                canvas.restore();
                            } else {
                                if (PageView.this.f21282i0 == null) {
                                    PageView.this.f21282i0 = new TextView(getContext());
                                    PageView.this.f21282i0.setLineSpacing(0.0f, 0.816f);
                                    PageView.this.f21282i0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                }
                                if (PageView.this.f21282i0 == null) {
                                    return;
                                }
                                if (aVar.g().floatValue() > 0.0f && aVar.g().floatValue() != PageView.this.f21282i0.getTextSize()) {
                                    PageView.this.f21282i0.setTextSize(0, aVar.g().floatValue());
                                }
                                if (aVar.d() != null && !aVar.d().equals(PageView.this.f21282i0.getText().toString())) {
                                    PageView.this.f21282i0.setText(aVar.d());
                                }
                                if (aVar.c().intValue() != 0 && aVar.c().intValue() != PageView.this.f21282i0.getCurrentTextColor()) {
                                    PageView.this.f21282i0.setTextColor(aVar.c().intValue());
                                }
                                int width = (int) aVar.f().width();
                                int height = (int) aVar.f().height();
                                if (width > 0 && height > 0 && (width != PageView.this.f21282i0.getMeasuredWidth() || height != PageView.this.f21282i0.getMeasuredHeight() || PageView.this.f21282i0.getLeft() != 0 || PageView.this.f21282i0.getTop() != 0 || width != PageView.this.f21282i0.getRight() || height != PageView.this.f21282i0.getBottom())) {
                                    PageView.this.f21282i0.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
                                    PageView.this.f21282i0.layout(0, 0, width, height);
                                }
                                canvas.save();
                                canvas.scale(scale, scale);
                                canvas.translate(aVar.f().left, aVar.f().top);
                                PageView.this.f21282i0.draw(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
            }
            if (!PageView.this.E && PageView.this.f21305u != null && PageView.this.f21305u.length > 0) {
                int length = PageView.this.f21305u.length;
                this.f21338d.setStyle(Paint.Style.FILL);
                for (int i40 = 0; i40 < length; i40++) {
                    RectF rectF = PageView.this.f21305u[i40];
                    if (PageView.this.f21276f0 == i40) {
                        this.f21338d.setColor(androidx.core.content.a.getColor(PageView.this.f21268b, R.color.search_txt_highlight_current));
                    } else {
                        this.f21338d.setColor(androidx.core.content.a.getColor(PageView.this.f21268b, R.color.search_txt_highlight_other));
                    }
                    canvas.drawRect(rectF.left * scale, rectF.top * scale, rectF.right * scale, rectF.bottom * scale, this.f21338d);
                }
            }
            if (!PageView.this.E && PageView.this.f21307v != null) {
                this.f21338d.setStyle(Paint.Style.FILL);
                this.f21338d.setColor(450699306);
                for (LinkInfo linkInfo : PageView.this.f21307v) {
                    if (linkInfo.isLinkHighlighting()) {
                        RectF rectF2 = linkInfo.rect;
                        canvas.drawRect(rectF2.left * scale, rectF2.top * scale, rectF2.right * scale, rectF2.bottom * scale, this.f21338d);
                    }
                }
            }
            ViewParent parent = PageView.this.getParent();
            if (parent instanceof PDFReaderView) {
                pDFReaderView = (PDFReaderView) parent;
            } else {
                pDFReaderView = null;
            }
            PageView pageView = PageView.this;
            if (pageView.f21309w != null && pageView.f21311x != null) {
                this.f21338d.setStyle(Paint.Style.FILL);
                this.f21338d.setColor(1306337322);
                this.f21337b.setEmpty();
                PageView.this.A1(new a(pDFReaderView, canvas, scale));
                PageView.this.setSelectRectF(pDFReaderView);
                boolean z16 = !PageView.F0(PageView.this, this.f21337b);
                if (pDFReaderView != null && !pDFReaderView.E0() && !pDFReaderView.G0()) {
                    PageView pageView2 = PageView.this;
                    if (pageView2.T != null && z16) {
                        int i41 = pageView2.K;
                        int i42 = PageView.this.L;
                        PageView pageView3 = PageView.this;
                        LayoutInflater from = LayoutInflater.from(pageView3.f21268b);
                        SelectPopMode selectPopMode2 = PageView.this.T;
                        SelectPopMode selectPopMode3 = SelectPopMode.Copy;
                        if (selectPopMode2 == selectPopMode3) {
                            i29 = R.layout.view_copy_txt;
                        } else if (selectPopMode2 == SelectPopMode.Annot_After_Select) {
                            i29 = R.layout.view_select_del_copy_pop;
                        } else {
                            i29 = R.layout.view_select_pop;
                        }
                        pageView3.H = from.inflate(i29, (ViewGroup) null);
                        PageView.this.H.measure(-2, -2);
                        PageView pageView4 = PageView.this;
                        if (pageView4.T != selectPopMode3) {
                            pageView4.setSelectAnnotModeClickListener(pageView4.H);
                        } else {
                            pageView4.H.setOnClickListener(new u4.j(this, 2));
                        }
                        getLocationInWindow(this.c);
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_24);
                        if (getParent() instanceof PageView) {
                            ((PageView) getParent()).getLocationInWindow(this.c);
                            int[] iArr = this.c;
                            int i43 = iArr[0];
                            int i44 = iArr[1];
                            pDFReaderView.getLocationInWindow(iArr);
                            int[] iArr2 = this.c;
                            int i45 = iArr2[0];
                            int i46 = iArr2[1];
                            i34 = pDFReaderView.getWidth() + i45;
                            i36 = pDFReaderView.getHeight() + i46;
                            i31 = i44;
                            i32 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            i35 = i43;
                            i33 = i46;
                            i30 = i45;
                        } else {
                            i30 = -1;
                            i31 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            i32 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            i33 = -1;
                            i34 = -1;
                            i35 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                            i36 = -1;
                        }
                        if (i35 != i32 && i31 != i32 && i30 >= 0 && i33 >= 0 && i34 >= 0 && i36 >= 0) {
                            RectF rectF3 = this.f21337b;
                            int i47 = (int) (rectF3.top * scale);
                            int i48 = (i31 - i33) + i47;
                            int i49 = i31 + i47;
                            int i50 = ((int) (rectF3.left * scale)) + i35;
                            int width2 = ((int) (this.f21337b.width() * scale)) + i50;
                            int height2 = ((int) (this.f21337b.height() * scale)) + i48;
                            f10 = editorScale;
                            PageView pageView5 = PageView.this;
                            pageView5.K = (((int) ((rectF3.width() * scale) / 2.0f)) + i50) - (pageView5.H.getMeasuredWidth() / 2);
                            if (i50 <= i34 && i48 <= i36 - i33 && height2 >= 0 && width2 >= i30) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (PageView.this.H != null && z15) {
                                int i51 = (int) ((PageView.this.f21280h0 * 2.0f) / 3.0f);
                                int height3 = (int) (this.f21337b.height() * scale);
                                int[] iArr3 = new int[2];
                                pDFReaderView.getLocationOnScreen(iArr3);
                                if (height3 < i51 && i48 < PageView.this.H.getMeasuredHeight() + this.f21343i) {
                                    PageView pageView6 = PageView.this;
                                    int i52 = i49 + height3;
                                    if (pageView6.T == SelectPopMode.Annot_Before_Select) {
                                        i38 = dimensionPixelSize + this.f21344j;
                                    } else {
                                        i38 = this.f21345k;
                                    }
                                    pageView6.L = i52 + i38;
                                    if (PageView.this.H.getMeasuredHeight() + PageView.this.L > pDFReaderView.getMeasuredHeight() + iArr3[1]) {
                                        PageView.this.L = (pDFReaderView.getMeasuredHeight() + iArr3[1]) - PageView.this.H.getMeasuredHeight();
                                    }
                                } else {
                                    PageView pageView7 = PageView.this;
                                    int measuredHeight = i49 - pageView7.H.getMeasuredHeight();
                                    if (PageView.this.T == SelectPopMode.Annot_Before_Select) {
                                        i37 = dimensionPixelSize + this.f21344j;
                                    } else {
                                        i37 = this.f21343i;
                                    }
                                    pageView7.L = measuredHeight - i37;
                                    int i53 = PageView.this.L;
                                    int i54 = iArr3[1];
                                    if (i53 < i54) {
                                        PageView.this.L = i54;
                                    }
                                }
                            }
                        } else {
                            f10 = editorScale;
                            if (PageView.this.H != null) {
                                PageView pageView8 = PageView.this;
                                RectF rectF4 = pageView8.f21309w;
                                pageView8.K = ((((int) ((rectF4.left * scale) + (rectF4.right * scale))) / 2) + this.c[0]) - (pageView8.H.getMeasuredWidth() / 2);
                                PageView pageView9 = PageView.this;
                                pageView9.L = ((((int) (pageView9.f21309w.top * scale)) + this.c[1]) - pageView9.H.getMeasuredHeight()) - PageView.e1(getContext(), 2.0f);
                            }
                            z15 = true;
                        }
                        if (z15) {
                            if (PageView.this.L < 0 || PageView.this.L > PageView.this.f21280h0) {
                                PageView.this.L = 0;
                            }
                            if (PageView.this.K <= 0) {
                                PageView.this.K = this.f21346l;
                            } else if (PageView.this.H != null && PageView.this.K >= (measuredWidth4 = PageView.this.f21278g0 - PageView.this.H.getMeasuredWidth())) {
                                PageView.this.K = measuredWidth4 - this.f21346l;
                            }
                            if (PageView.this.f21286k0 == null || !PageView.this.f21286k0.isShowing() || i41 != PageView.this.K || i42 != PageView.this.L) {
                                PageView.this.b();
                                PageView.this.f21286k0 = new PopupWindow(PageView.this.H, -2, -2);
                                PageView.this.f21286k0.setContentView(PageView.this.H);
                                PageView.this.f21286k0.setOutsideTouchable(false);
                                PageView.this.f21286k0.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: lib.zj.pdfeditor.e0
                                    @Override // android.widget.PopupWindow.OnDismissListener
                                    public final void onDismiss() {
                                        PageView.this.f21286k0 = null;
                                    }
                                });
                                PageView.this.f21286k0.setBackgroundDrawable(androidx.core.content.a.getDrawable(PageView.this.f21268b, R.color.no_color));
                                if (!(PageView.this.getParent() instanceof ReaderView)) {
                                    PopupWindow popupWindow = PageView.this.f21286k0;
                                    PageView pageView10 = PageView.this;
                                    popupWindow.showAtLocation(pageView10, 0, pageView10.K, PageView.this.L);
                                } else {
                                    PageView.this.f21286k0.showAtLocation((ReaderView) PageView.this.getParent(), 0, PageView.this.K, PageView.this.L);
                                }
                            }
                            if (pDFReaderView.H0(PageView.this.f21309w) && (selectPopMode = PageView.this.T) != null) {
                                int i55 = h.f21333a[selectPopMode.ordinal()];
                                if (i55 != 1) {
                                    if (i55 != 2) {
                                        if (i55 == 3) {
                                            PageView.G0(PageView.this, AnalyticsEvent.SELECT_POP_SHOW);
                                        }
                                    } else {
                                        PageView.G0(PageView.this, AnalyticsEvent.COPY_DELETE_SHOW);
                                    }
                                } else {
                                    PageView.G0(PageView.this, AnalyticsEvent.COPY_SHOW);
                                }
                            }
                        }
                    }
                }
                f10 = editorScale;
                PageView.this.b();
            } else {
                f10 = editorScale;
                PageView.this.b();
            }
            if (!PageView.this.u1() && !PageView.this.v1()) {
                PageView.this.c1();
                f11 = scale;
            } else {
                RectF selectTextBlockRectF = PageView.this.getSelectTextBlockRectF();
                if (pDFReaderView != null && !pDFReaderView.E0() && !pDFReaderView.G0() && pDFReaderView.v0() && selectTextBlockRectF != null) {
                    int i56 = PageView.this.O;
                    int i57 = PageView.this.P;
                    if (PageView.this.I == null) {
                        PageView pageView11 = PageView.this;
                        pageView11.I = LayoutInflater.from(pageView11.f21268b).inflate(R.layout.lib_pdf_text_editor_pop, (ViewGroup) null);
                        PageView.this.I.findViewById(R.id.editTv).setOnClickListener(new b());
                        PageView.this.I.findViewById(R.id.copyTv).setOnClickListener(new c());
                        PageView.this.I.findViewById(R.id.deleteTv).setOnClickListener(new d());
                        PageView.this.I.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    TextView textView = (TextView) PageView.this.I.findViewById(R.id.editTv);
                    int visibility = textView.getVisibility();
                    if (PageView.this.v1()) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    textView.setVisibility(i10);
                    if (visibility != textView.getVisibility()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        PageView.this.I.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    getLocationInWindow(this.c);
                    ViewParent parent2 = getParent();
                    if (parent2 instanceof PageView) {
                        ((PageView) parent2).getLocationInWindow(this.c);
                        int[] iArr4 = this.c;
                        i13 = iArr4[0];
                        i15 = iArr4[1];
                        pDFReaderView.getLocationInWindow(iArr4);
                        int[] iArr5 = this.c;
                        i16 = iArr5[0];
                        i11 = iArr5[1];
                        i12 = pDFReaderView.getWidth() + i16;
                        i14 = pDFReaderView.getHeight() + i11;
                    } else {
                        i11 = -1;
                        i12 = -1;
                        i13 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i14 = -1;
                        i15 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i16 = -1;
                    }
                    if (PageView.this.I != null && i13 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE && i16 >= 0 && i11 >= 0 && i12 >= 0 && i14 >= 0) {
                        int i58 = (int) (selectTextBlockRectF.top * f10);
                        int i59 = (i15 - i11) + i58;
                        int i60 = i15 + i58;
                        int i61 = ((int) (selectTextBlockRectF.left * f10)) + i13;
                        int width3 = ((int) (selectTextBlockRectF.width() * f10)) + i61;
                        int height4 = ((int) (selectTextBlockRectF.height() * f10)) + i59;
                        f11 = scale;
                        PageView pageView12 = PageView.this;
                        pageView12.O = (((int) ((selectTextBlockRectF.width() * f10) / 2.0f)) + i61) - (pageView12.I.getMeasuredWidth() / 2);
                        if (i61 <= i12 && i59 <= i14 - i11 && height4 >= 0 && width3 >= i16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            int i62 = (int) ((PageView.this.f21280h0 * 2.0f) / 3.0f);
                            int height5 = (int) (selectTextBlockRectF.height() * f10);
                            int[] iArr6 = new int[2];
                            pDFReaderView.getLocationOnScreen(iArr6);
                            if (height5 < i62 && i59 < PageView.this.I.getMeasuredHeight() + this.f21343i) {
                                PageView.this.P = i60 + height5 + this.f21345k;
                                if (PageView.this.I.getMeasuredHeight() + PageView.this.P > pDFReaderView.getMeasuredHeight() + iArr6[1]) {
                                    PageView.this.P = (pDFReaderView.getMeasuredHeight() + iArr6[1]) - PageView.this.I.getMeasuredHeight();
                                }
                            } else {
                                PageView pageView13 = PageView.this;
                                pageView13.P = (i60 - pageView13.I.getMeasuredHeight()) - this.f21343i;
                                int i63 = PageView.this.P;
                                int i64 = iArr6[1];
                                if (i63 < i64) {
                                    PageView.this.P = i64;
                                }
                            }
                        }
                    } else {
                        f11 = scale;
                        if (PageView.this.I != null) {
                            PageView pageView14 = PageView.this;
                            pageView14.O = ((((int) ((selectTextBlockRectF.left * f10) + (selectTextBlockRectF.right * f10))) / 2) + this.c[0]) - (pageView14.I.getMeasuredWidth() / 2);
                            PageView pageView15 = PageView.this;
                            pageView15.P = ((((int) (selectTextBlockRectF.top * f10)) + this.c[1]) - pageView15.I.getMeasuredHeight()) - PageView.e1(getContext(), 2.0f);
                        }
                        z11 = true;
                    }
                    if (z11) {
                        if (PageView.this.P < 0 || PageView.this.P > PageView.this.f21280h0) {
                            PageView.this.P = 0;
                        }
                        if (PageView.this.O <= 0) {
                            PageView.this.O = this.f21346l;
                        } else if (PageView.this.I != null && PageView.this.O >= (measuredWidth = PageView.this.f21278g0 - PageView.this.I.getMeasuredWidth())) {
                            PageView.this.O = measuredWidth - this.f21346l;
                        }
                        if (PageView.this.f21290m0 == null || !PageView.this.f21290m0.isShowing() || i56 != PageView.this.O || i57 != PageView.this.P) {
                            if (PageView.this.f21290m0 == null) {
                                PageView.this.f21290m0 = new PopupWindow(PageView.this.I, -2, -2);
                                PageView.this.f21290m0.setContentView(PageView.this.I);
                                PageView.this.f21290m0.setOutsideTouchable(false);
                                PageView.this.f21290m0.setBackgroundDrawable(androidx.core.content.a.getDrawable(PageView.this.f21268b, R.color.no_color));
                            }
                            if (PageView.this.f21290m0.isShowing()) {
                                PageView.this.f21290m0.update(PageView.this.O, PageView.this.P, -1, -1);
                            } else if (!(PageView.this.getParent() instanceof ReaderView)) {
                                PopupWindow popupWindow2 = PageView.this.f21290m0;
                                PageView pageView16 = PageView.this;
                                popupWindow2.showAtLocation(pageView16, 0, pageView16.O, PageView.this.P);
                            } else {
                                PageView.this.f21290m0.showAtLocation((ReaderView) PageView.this.getParent(), 0, PageView.this.O, PageView.this.P);
                            }
                        }
                    }
                } else {
                    f11 = scale;
                    PageView.this.c1();
                }
            }
            if (PageView.this.t1()) {
                RectF selectImageBlockRectF = PageView.this.getSelectImageBlockRectF();
                if (pDFReaderView != null && !pDFReaderView.E0() && !pDFReaderView.G0() && pDFReaderView.v0() && selectImageBlockRectF != null) {
                    int i65 = PageView.this.Q;
                    int i66 = PageView.this.R;
                    if (PageView.this.J == null) {
                        PageView pageView17 = PageView.this;
                        pageView17.J = LayoutInflater.from(pageView17.f21268b).inflate(R.layout.lib_pdf_image_editor_pop, (ViewGroup) null);
                        PageView.this.J.findViewById(R.id.rotateLeftTv).setOnClickListener(new e());
                        PageView.this.J.findViewById(R.id.rotateRightTv).setOnClickListener(new f());
                        PageView.this.J.findViewById(R.id.deleteTv).setOnClickListener(new g());
                        PageView.this.J.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    getLocationInWindow(this.c);
                    ViewParent parent3 = getParent();
                    if (parent3 instanceof PageView) {
                        ((PageView) parent3).getLocationInWindow(this.c);
                        int[] iArr7 = this.c;
                        int i67 = iArr7[0];
                        i26 = iArr7[1];
                        pDFReaderView.getLocationInWindow(iArr7);
                        int[] iArr8 = this.c;
                        i27 = iArr8[0];
                        i23 = iArr8[1];
                        i24 = pDFReaderView.getWidth() + i27;
                        i25 = pDFReaderView.getHeight() + i23;
                        i28 = i67;
                    } else {
                        i23 = -1;
                        i24 = -1;
                        i25 = -1;
                        i26 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i27 = -1;
                        i28 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    if (PageView.this.J != null && i28 != Integer.MAX_VALUE && i26 != Integer.MAX_VALUE && i27 >= 0 && i23 >= 0 && i24 >= 0 && i25 >= 0) {
                        int i68 = (int) (selectImageBlockRectF.top * f10);
                        int i69 = (i26 - i23) + i68;
                        int i70 = i26 + i68;
                        int i71 = ((int) (selectImageBlockRectF.left * f10)) + i28;
                        int width4 = ((int) (selectImageBlockRectF.width() * f10)) + i71;
                        int height6 = ((int) (selectImageBlockRectF.height() * f10)) + i69;
                        PageView pageView18 = PageView.this;
                        pageView18.Q = (((int) ((selectImageBlockRectF.width() * f10) / 2.0f)) + i71) - (pageView18.J.getMeasuredWidth() / 2);
                        if (i71 <= i24 && i69 <= i25 - i23 && height6 >= 0 && width4 >= i27) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            int i72 = (int) ((PageView.this.f21280h0 * 2.0f) / 3.0f);
                            int height7 = (int) (selectImageBlockRectF.height() * f10);
                            int[] iArr9 = new int[2];
                            pDFReaderView.getLocationOnScreen(iArr9);
                            if (height7 < i72 && i69 < PageView.this.J.getMeasuredHeight() + this.f21343i) {
                                PageView.this.R = i70 + height7 + this.f21345k;
                                if (PageView.this.J.getMeasuredHeight() + PageView.this.R > pDFReaderView.getMeasuredHeight() + iArr9[1]) {
                                    PageView.this.R = (pDFReaderView.getMeasuredHeight() + iArr9[1]) - PageView.this.J.getMeasuredHeight();
                                }
                            } else {
                                PageView pageView19 = PageView.this;
                                pageView19.R = (i70 - pageView19.J.getMeasuredHeight()) - this.f21343i;
                                int i73 = PageView.this.R;
                                int i74 = iArr9[1];
                                if (i73 < i74) {
                                    PageView.this.R = i74;
                                }
                            }
                        }
                    } else {
                        if (PageView.this.J != null) {
                            PageView pageView20 = PageView.this;
                            pageView20.Q = ((((int) ((selectImageBlockRectF.left * f10) + (selectImageBlockRectF.right * f10))) / 2) + this.c[0]) - (pageView20.J.getMeasuredWidth() / 2);
                            PageView pageView21 = PageView.this;
                            pageView21.R = ((((int) (selectImageBlockRectF.top * f10)) + this.c[1]) - pageView21.J.getMeasuredHeight()) - PageView.e1(getContext(), 2.0f);
                        }
                        z14 = true;
                    }
                    if (z14) {
                        if (PageView.this.R < 0 || PageView.this.R > PageView.this.f21280h0) {
                            PageView.this.R = 0;
                        }
                        if (PageView.this.Q <= 0) {
                            PageView.this.Q = this.f21346l;
                        } else if (PageView.this.J != null && PageView.this.Q >= (measuredWidth3 = PageView.this.f21278g0 - PageView.this.J.getMeasuredWidth())) {
                            PageView.this.Q = measuredWidth3 - this.f21346l;
                        }
                        if (PageView.this.f21292n0 == null || !PageView.this.f21292n0.isShowing() || i65 != PageView.this.Q || i66 != PageView.this.R) {
                            if (PageView.this.f21292n0 == null) {
                                PageView.this.f21292n0 = new PopupWindow(PageView.this.J, -2, -2);
                                PageView.this.f21292n0.setContentView(PageView.this.J);
                                PageView.this.f21292n0.setOutsideTouchable(false);
                                PageView.this.f21292n0.setBackgroundDrawable(androidx.core.content.a.getDrawable(PageView.this.f21268b, R.color.no_color));
                            }
                            if (PageView.this.f21292n0.isShowing()) {
                                PageView.this.f21292n0.update(PageView.this.Q, PageView.this.R, -1, -1);
                            } else if (!(PageView.this.getParent() instanceof ReaderView)) {
                                PopupWindow popupWindow3 = PageView.this.f21292n0;
                                PageView pageView22 = PageView.this;
                                popupWindow3.showAtLocation(pageView22, 0, pageView22.Q, PageView.this.R);
                            } else {
                                PageView.this.f21292n0.showAtLocation((ReaderView) PageView.this.getParent(), 0, PageView.this.Q, PageView.this.R);
                            }
                        }
                    }
                } else {
                    PageView.this.a1();
                }
            } else {
                PageView.this.a1();
            }
            PageView pageView23 = PageView.this;
            if (pageView23.f21313y != null) {
                this.f21338d.setStyle(Paint.Style.STROKE);
                this.f21338d.setStrokeWidth(this.f21339e);
                this.f21338d.setColor(androidx.core.content.a.getColor(PageView.this.f21268b, R.color.box_color));
                this.f21347m.setColor(androidx.core.content.a.getColor(PageView.this.f21268b, R.color.box_color));
                this.f21347m.setStyle(Paint.Style.STROKE);
                this.f21347m.setStrokeWidth(this.f21339e);
                RectF rectF5 = PageView.this.f21313y;
                canvas2 = canvas;
                canvas2.drawCircle(rectF5.left * f11, rectF5.top * f11, this.f21344j, this.f21347m);
                RectF rectF6 = PageView.this.f21313y;
                canvas2.drawCircle(rectF6.right * f11, rectF6.top * f11, this.f21344j, this.f21347m);
                RectF rectF7 = PageView.this.f21313y;
                canvas2.drawCircle(rectF7.left * f11, rectF7.bottom * f11, this.f21344j, this.f21347m);
                RectF rectF8 = PageView.this.f21313y;
                canvas2.drawCircle(rectF8.right * f11, rectF8.bottom * f11, this.f21344j, this.f21347m);
                this.f21347m.reset();
                this.f21347m.setStyle(Paint.Style.FILL_AND_STROKE);
                int i75 = -1;
                this.f21347m.setColor(-1);
                RectF rectF9 = PageView.this.f21313y;
                canvas2.drawCircle(rectF9.left * f11, rectF9.top * f11, this.f21344j - this.f21339e, this.f21347m);
                RectF rectF10 = PageView.this.f21313y;
                canvas2.drawCircle(rectF10.right * f11, rectF10.top * f11, this.f21344j - this.f21339e, this.f21347m);
                RectF rectF11 = PageView.this.f21313y;
                canvas2.drawCircle(rectF11.left * f11, rectF11.bottom * f11, this.f21344j - this.f21339e, this.f21347m);
                RectF rectF12 = PageView.this.f21313y;
                canvas2.drawCircle(rectF12.right * f11, rectF12.bottom * f11, this.f21344j - this.f21339e, this.f21347m);
                RectF rectF13 = PageView.this.f21313y;
                float f12 = rectF13.left * f11;
                float f13 = this.f21344j;
                float f14 = f12 + f13;
                float f15 = rectF13.top * f11;
                float f16 = rectF13.right * f11;
                float f17 = f16 - f13;
                float f18 = f15 + f13;
                float f19 = rectF13.bottom * f11;
                float f20 = f19 - f13;
                canvas2.drawLines(new float[]{f14, f15, f17, f15, f16, f18, f16, f20, f17, f19, f14, f19, f12, f20, f12, f18}, this.f21338d);
                if (pDFReaderView != null && !pDFReaderView.E0() && !pDFReaderView.G0()) {
                    int i76 = PageView.this.M;
                    int i77 = PageView.this.N;
                    PageView pageView24 = PageView.this;
                    pageView24.U = LayoutInflater.from(pageView24.f21268b).inflate(R.layout.view_copy_txt, (ViewGroup) null);
                    ((ImageView) PageView.this.U.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_select_delete);
                    ((TextView) PageView.this.U.findViewById(R.id.tv_action)).setText(PageView.this.f21268b.getResources().getString(R.string.arg_res_0x7f13037d));
                    PageView.this.U.measure(-2, -2);
                    PageView.this.U.setOnClickListener(new h());
                    getLocationInWindow(this.c);
                    if (getParent() instanceof PageView) {
                        ((PageView) getParent()).getLocationInWindow(this.c);
                        int[] iArr10 = this.c;
                        i22 = iArr10[0];
                        int i78 = iArr10[1];
                        pDFReaderView.getLocationInWindow(iArr10);
                        int[] iArr11 = this.c;
                        int i79 = iArr11[0];
                        int i80 = iArr11[1];
                        int width5 = pDFReaderView.getWidth() + i79;
                        int height8 = pDFReaderView.getHeight() + i80;
                        i21 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i17 = i80;
                        i75 = i79;
                        i20 = i78;
                        i19 = height8;
                        i18 = width5;
                    } else {
                        i17 = -1;
                        i18 = -1;
                        i19 = -1;
                        i20 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i21 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        i22 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    }
                    if (i22 != i21 && i20 != i21 && i75 >= 0 && i17 >= 0 && i18 >= 0 && i19 >= 0) {
                        RectF rectF14 = PageView.this.f21313y;
                        int i81 = (int) (rectF14.top * f11);
                        int i82 = (i20 - i17) + i81;
                        int i83 = i20 + i81;
                        int i84 = ((int) (rectF14.left * f11)) + i22;
                        PageView pageView25 = PageView.this;
                        pageView25.M = ((((int) ((rectF14.width() * f11) / 2.0f)) + i84) - (pageView25.U.getMeasuredWidth() / 2)) + this.f21339e;
                        int width6 = ((int) (PageView.this.f21313y.width() * f11)) + i84;
                        int height9 = ((int) (PageView.this.f21313y.height() * f11)) + i82;
                        if (i84 <= i18 && i82 <= i19 - i17 && height9 >= 0 && width6 >= i75) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (PageView.this.U != null && z13) {
                            int i85 = (int) ((PageView.this.f21280h0 * 2.0f) / 3.0f);
                            int height10 = (int) (PageView.this.f21313y.height() * f11);
                            int[] iArr12 = new int[2];
                            pDFReaderView.getLocationOnScreen(iArr12);
                            if (height10 < i85 && i82 < PageView.this.U.getMeasuredHeight() + this.f21343i) {
                                PageView.this.N = i83 + height10 + this.f21345k;
                                if (PageView.this.U.getMeasuredHeight() + PageView.this.N > pDFReaderView.getMeasuredHeight() + iArr12[1]) {
                                    PageView.this.N = (pDFReaderView.getMeasuredHeight() + iArr12[1]) - PageView.this.U.getMeasuredHeight();
                                }
                            } else {
                                PageView pageView26 = PageView.this;
                                pageView26.N = (i83 - pageView26.U.getMeasuredHeight()) - this.f21343i;
                                int i86 = PageView.this.N;
                                int i87 = iArr12[1];
                                if (i86 < i87) {
                                    PageView.this.N = i87;
                                }
                            }
                        }
                        z12 = z13;
                    } else {
                        if (PageView.this.U != null) {
                            PageView pageView27 = PageView.this;
                            RectF rectF15 = pageView27.f21313y;
                            pageView27.M = ((((int) ((rectF15.left * f11) + (rectF15.right * f11))) / 2) + this.c[0]) - (pageView27.U.getMeasuredWidth() / 2);
                            PageView pageView28 = PageView.this;
                            pageView28.N = ((((int) (pageView28.f21313y.top * f11)) + this.c[1]) - pageView28.U.getMeasuredHeight()) - PageView.e1(getContext(), 2.0f);
                        }
                        z12 = true;
                    }
                    if (z12) {
                        if (PageView.this.N < 0 || PageView.this.N > PageView.this.f21280h0) {
                            PageView.this.N = 0;
                        }
                        if (PageView.this.M <= 0) {
                            PageView.this.M = this.f21346l;
                        } else if (PageView.this.U != null && PageView.this.M >= (measuredWidth2 = PageView.this.f21278g0 - PageView.this.U.getMeasuredWidth())) {
                            PageView.this.M = measuredWidth2 - this.f21346l;
                        }
                        if (PageView.this.f21288l0 == null || !PageView.this.f21288l0.isShowing() || i76 != PageView.this.M || i77 != PageView.this.N) {
                            PageView.this.b1();
                            PageView.this.f21288l0 = new PopupWindow(PageView.this.U, -2, -2);
                            PageView.this.f21288l0.setContentView(PageView.this.U);
                            PageView.this.f21288l0.setOutsideTouchable(false);
                            PageView.this.f21288l0.setBackgroundDrawable(androidx.core.content.a.getDrawable(PageView.this.f21268b, R.color.no_color));
                            if (!(PageView.this.getParent() instanceof ReaderView)) {
                                PopupWindow popupWindow4 = PageView.this.f21288l0;
                                PageView pageView29 = PageView.this;
                                popupWindow4.showAtLocation(pageView29, 0, pageView29.M, PageView.this.N);
                            } else {
                                PageView.this.f21288l0.showAtLocation((ReaderView) PageView.this.getParent(), 0, PageView.this.M, PageView.this.N);
                            }
                        }
                        if (pDFReaderView.B0(PageView.this.f21313y, true) && !PageView.this.s1()) {
                            PageView.G0(PageView.this, AnalyticsEvent.DELETE_SHOW);
                        }
                    }
                }
            } else {
                canvas2 = canvas;
                if (pageView23.f21288l0 != null) {
                    PageView.this.f21288l0.dismiss();
                }
            }
            this.f21348n.setColorFilter(PageView.this.getColorFilter());
            List<ij.a> m12 = PageView.this.m1(false);
            if (m12 != null && !m12.isEmpty()) {
                for (ij.a aVar2 : m12) {
                    PageView.B0(PageView.this, aVar2, f11, this.f21348n, canvas2);
                }
            }
            float f21 = f11;
            PageView pageView30 = PageView.this;
            PageView.B0(pageView30, pageView30.f21298q0, f21, this.f21348n, canvas2);
            PageView pageView31 = PageView.this;
            PageView.B0(pageView31, pageView31.f21300r0, f21, this.f21348n, canvas2);
            if ((PageView.this.F == null || PageView.this.F.getVisibility() != 0) && PageView.this.r1()) {
                Iterator it = new ArrayList(PageView.this.A0).iterator();
                while (it.hasNext()) {
                    PageView pageView32 = PageView.this;
                    Paint paint = new Paint();
                    pageView32.getClass();
                    PageView.f1(canvas2, (kj.b) it.next(), paint, f21);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k extends ng.c {
        public k() {
        }

        @Override // ng.c
        public final void a() {
            PageView pageView = PageView.this;
            pageView.L0();
            if (pageView.T == SelectPopMode.Annot_After_Select) {
                PageView.A0(pageView, pageView.getSelectText());
                pageView.x1(-1, null);
                PageView.G0(pageView, AnalyticsEvent.COPY_DELETE_CLICK_COPY);
                return;
            }
            PageView.A0(pageView, pageView.getSelectText());
            pageView.b();
            ViewParent parent = pageView.getParent();
            if (parent instanceof PDFReaderView) {
                PDFReaderView pDFReaderView = (PDFReaderView) parent;
                pDFReaderView.O0 = false;
                pDFReaderView.M0.setEmpty();
            }
            PageView.G0(pageView, AnalyticsEvent.SELECT_POP_CLICK_COPY);
        }
    }

    /* loaded from: classes3.dex */
    public class l extends ng.c {
        public l() {
        }

        @Override // ng.c
        public final void a() {
            PageView pageView = PageView.this;
            pageView.d1();
            PageView.G0(pageView, AnalyticsEvent.COPY_DELETE_CLICK_DEL);
        }
    }

    /* loaded from: classes3.dex */
    public class m extends ng.c {
        public m() {
        }

        @Override // ng.c
        public final void a() {
            Annotation.Type type = Annotation.Type.HIGHLIGHT;
            PageView pageView = PageView.this;
            PageView.C0(pageView, type);
            PageView.G0(pageView, AnalyticsEvent.SELECT_POP_CLICK_HIGH_LIGHT);
        }
    }

    /* loaded from: classes3.dex */
    public class n extends ng.c {
        public n() {
        }

        @Override // ng.c
        public final void a() {
            Annotation.Type type = Annotation.Type.UNDERLINE;
            PageView pageView = PageView.this;
            PageView.C0(pageView, type);
            PageView.G0(pageView, AnalyticsEvent.SELECT_POP_CLICK_UNDER_LINE);
        }
    }

    /* loaded from: classes3.dex */
    public class o extends ng.c {
        public o() {
        }

        @Override // ng.c
        public final void a() {
            Annotation.Type type = Annotation.Type.STRIKEOUT;
            PageView pageView = PageView.this;
            PageView.C0(pageView, type);
            PageView.G0(pageView, AnalyticsEvent.SELECT_POP_CLICK_STRIKE_LINE);
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Comparator<RectF> {
        @Override // java.util.Comparator
        public final int compare(RectF rectF, RectF rectF2) {
            RectF rectF3 = rectF;
            RectF rectF4 = rectF2;
            float f10 = rectF4.bottom;
            float f11 = rectF3.bottom;
            if (f10 - f11 > 0.0f) {
                return -1;
            }
            if (f10 == f11 && rectF4.left - rectF3.left > 0.0f) {
                return -1;
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    public interface q {
    }

    public PageView(Context context, Point point, og.a aVar) {
        super(context);
        this.f21271d = E0;
        this.f21277g = 1.0f;
        this.f21315z = ReaderView.A0;
        this.B = new ArrayList();
        this.G = new Handler(Looper.getMainLooper());
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = -1;
        this.T = null;
        this.f21270c0 = 0;
        this.f21272d0 = false;
        this.f21276f0 = -1L;
        this.f21284j0 = new Matrix();
        this.f21294o0 = false;
        this.f21298q0 = null;
        this.f21300r0 = null;
        new RectF();
        new ArrayList();
        this.f21302s0 = new Handler(Looper.getMainLooper());
        this.f21308v0 = new HashMap<>();
        this.f21310w0 = new HashMap<>();
        this.f21312x0 = 0;
        this.f21314y0 = new StringBuilder();
        this.A0 = new ArrayList<>();
        this.B0 = new ArrayList<>();
        this.C0 = PDFReaderView.Mode.Viewing;
        this.D0 = -1;
        this.f21268b = context;
        this.f21267a0 = new WeakReference<>(context);
        this.f21274e0 = aVar;
        P1(context, point.x, point.y);
        int color = androidx.core.content.a.getColor(context, R.color.colorPageViewBackground);
        this.f21266a = color;
        setBackgroundColor(color);
        if (this.F == null) {
            ReflowLoadingView reflowLoadingView = new ReflowLoadingView(context);
            this.F = reflowLoadingView;
            reflowLoadingView.setBackgroundColor(0);
            addView(reflowLoadingView);
        }
    }

    public static void A0(PageView pageView, String str) {
        qg.a inkTouchListener;
        pageView.getClass();
        pageView.S1();
        Context context = pageView.f21268b;
        if (str != null && !str.trim().isEmpty()) {
            ViewParent parent = pageView.getParent();
            if ((parent instanceof PDFReaderView) && (inkTouchListener = ((PDFReaderView) parent).getInkTouchListener()) != null) {
                inkTouchListener.h(context.getResources().getString(R.string.arg_res_0x7f13036a));
            }
            pageView.postDelayed(new d0(pageView, str), 100L);
            return;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("MuPDF", ""));
    }

    public static void B0(PageView pageView, ij.a aVar, float f10, Paint paint, Canvas canvas) {
        pageView.getClass();
        if (aVar != null && !aVar.c.isEmpty()) {
            Path path = new Path();
            float f11 = aVar.f18510d * pageView.f21275f * pageView.f21277g;
            Iterator<a.b> it = aVar.c.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                if (next != null) {
                    ArrayList arrayList = next.f18517a;
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() >= 2) {
                            Iterator it2 = arrayList.iterator();
                            PointF pointF = (PointF) it2.next();
                            float f12 = pointF.x * f10;
                            float f13 = pointF.y * f10;
                            path.moveTo(f12, f13);
                            while (it2.hasNext()) {
                                PointF pointF2 = (PointF) it2.next();
                                float f14 = pointF2.x * f10;
                                float f15 = pointF2.y * f10;
                                path.quadTo(f12, f13, (f14 + f12) / 2.0f, (f15 + f13) / 2.0f);
                                f13 = f15;
                                f12 = f14;
                            }
                            path.lineTo(f12, f13);
                            paint.setStyle(Paint.Style.STROKE);
                            paint.setStrokeWidth(f11);
                            paint.setColor(aVar.f18511e);
                            canvas.drawPath(path, paint);
                        } else {
                            PointF pointF3 = (PointF) arrayList.get(0);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setStrokeWidth(f11);
                            paint.setColor(aVar.f18511e);
                            canvas.drawCircle(pointF3.x * f10, pointF3.y * f10, f11 / 2.0f, paint);
                        }
                    }
                }
            }
        }
    }

    public static void C0(PageView pageView, Annotation.Type type) {
        qg.c cVar = pageView.W;
        if (cVar != null && cVar.isReadOnly()) {
            pageView.W.a();
            return;
        }
        ViewParent parent = pageView.getParent();
        if (parent instanceof PDFReaderView) {
            PDFReaderView pDFReaderView = (PDFReaderView) parent;
            pDFReaderView.setSelectTextLocation(pDFReaderView.b1());
        }
        if (pageView instanceof a0) {
            ((a0) pageView).o(type);
        }
        pageView.b();
        pageView.f21309w = null;
        pageView.T = null;
        pageView.q1();
    }

    public static boolean F0(PageView pageView, RectF rectF) {
        if (rectF == null) {
            pageView.S1();
        } else {
            pageView.getClass();
            float f10 = rectF.left;
            if (f10 != rectF.right || f10 != 0.0f) {
                float f11 = rectF.top;
                if (f11 != rectF.bottom || f11 != 0.0f) {
                    pageView.S1();
                    return false;
                }
            }
            pageView.S1();
        }
        return true;
    }

    public static void G0(PageView pageView, AnalyticsEvent analyticsEvent) {
        qg.a inkTouchListener;
        if (analyticsEvent == null) {
            pageView.getClass();
            return;
        }
        ViewParent parent = pageView.getParent();
        if ((parent instanceof PDFReaderView) && (inkTouchListener = ((PDFReaderView) parent).getInkTouchListener()) != null) {
            inkTouchListener.W(analyticsEvent);
        }
    }

    public static void J0(PageView pageView) {
        pageView.setBackgroundColor(pageView.f21266a);
        lib.zj.pdfeditor.g gVar = pageView.f21279h;
        if (gVar != null) {
            gVar.setImageBitmap(null);
            pageView.f21279h.invalidate();
        }
        ReflowLoadingView reflowLoadingView = pageView.F;
        if (reflowLoadingView != null) {
            reflowLoadingView.setVisibility(0);
        }
    }

    public static Bitmap L1(int i10, int i11) {
        if (i10 <= 0) {
            i10 = 200;
        }
        if (i11 <= 0) {
            i11 = 200;
        }
        return Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
    }

    public static void P0(int i10, int i11, ArrayList arrayList, ArrayList arrayList2, PointF pointF, PointF pointF2) {
        List list;
        if (i10 < i11) {
            if (pointF == null && pointF2 == null) {
                list = arrayList2.subList(i10, i11);
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (pointF != null) {
                    arrayList3.add(pointF);
                }
                arrayList3.addAll(arrayList2.subList(i10, i11));
                if (pointF2 != null) {
                    arrayList3.add(pointF2);
                }
                list = arrayList3;
            }
            arrayList.add(new a.b(list));
        }
    }

    public static void P1(Context context, int i10, int i11) {
        if (i10 <= 0) {
            i10 = context.getResources().getDisplayMetrics().widthPixels;
        }
        if (i11 <= 0) {
            i11 = context.getResources().getDisplayMetrics().heightPixels;
        }
        E0 = new Point(i10, i11);
    }

    public static void Q0(HashMap hashMap, a.b bVar, Object obj) {
        ArrayList arrayList = (ArrayList) hashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(bVar, arrayList);
        }
        arrayList.add(obj);
    }

    public static int e1(Context context, float f10) {
        return (int) ((context.getResources().getDisplayMetrics().density * f10) + 0.5f);
    }

    public static void f1(Canvas canvas, kj.b bVar, Paint paint, float f10) {
        Bitmap bitmap;
        if (bVar != null && (bitmap = bVar.f19800b) != null && !bitmap.isRecycled()) {
            Matrix matrix = new Matrix();
            b.a aVar = bVar.f19806i;
            matrix.preTranslate(aVar.f19807a, aVar.f19808b);
            float f11 = aVar.c;
            matrix.preScale(f11, f11);
            Integer num = bVar.c;
            if (num != null) {
                matrix.preRotate(num.intValue());
            }
            matrix.preTranslate((-aVar.f19809d) / 2.0f, (-aVar.f19810e) / 2.0f);
            matrix.postScale(f10, f10);
            canvas.save();
            canvas.drawBitmap(bVar.f19800b, matrix, paint);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ColorFilter getColorFilter() {
        if (this.f21315z) {
            return null;
        }
        if (pdf.pdfreader.viewer.editor.free.utils.t0.f28776i == null) {
            pdf.pdfreader.viewer.editor.free.utils.t0.f28776i = new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f}));
        }
        return pdf.pdfreader.viewer.editor.free.utils.t0.f28776i;
    }

    public static Point getParentSize() {
        return E0;
    }

    private Rect getPatchArea() {
        int i10;
        int width = getWidth();
        int height = getHeight();
        int i11 = 0;
        if (getLeft() < 0) {
            i10 = -getLeft();
        } else {
            i10 = 0;
        }
        if (getTop() < 0) {
            i11 = -getTop();
        }
        if (getRight() > E0.x) {
            width -= getRight() - E0.x;
        }
        if (getBottom() > E0.y) {
            height -= getBottom() - E0.y;
        }
        return new Rect(i10, i11, width, height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PDFReaderView.Mode getReaderMode() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).getMode();
        }
        return PDFReaderView.Mode.Viewing;
    }

    private int getScreenHeight() {
        if (getContext() instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        return getContext().getResources().getDisplayMetrics().heightPixels;
    }

    private int getScreenWidth() {
        if (getContext() instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashMap<Integer, kj.b> j1(ArrayList<kj.b> arrayList, ArrayList<kj.b> arrayList2) {
        kj.b bVar;
        Integer num;
        String str;
        HashMap<Integer, kj.b> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            kj.b bVar2 = arrayList.get(i10);
            Bitmap bitmap = null;
            if (arrayList2.size() > i10) {
                bVar = arrayList2.get(i10);
            } else {
                bVar = null;
            }
            if (!bVar2.equals(bVar)) {
                Integer valueOf = Integer.valueOf(i10);
                if (bVar != null) {
                    kj.b bVar3 = new kj.b();
                    long j10 = bVar2.f19799a;
                    long j11 = bVar.f19799a;
                    if (j10 == j11) {
                        j11 = 0;
                    }
                    bVar3.f19799a = j11;
                    String str2 = bVar2.f19802e;
                    if (str2 != null) {
                        if (str2.equals(bVar.f19802e)) {
                            str = null;
                        } else {
                            str = bVar.f19802e;
                        }
                        bVar3.f19802e = str;
                    }
                    Integer num2 = bVar2.f19801d;
                    if (num2 != null) {
                        if (num2.equals(bVar.f19801d)) {
                            num = null;
                        } else {
                            num = bVar.f19801d;
                        }
                        bVar3.f19801d = num;
                    }
                    bVar3.c = bVar.c;
                    bVar3.f19803f = bVar.f19803f;
                    Bitmap bitmap2 = bVar2.f19800b;
                    Bitmap bitmap3 = bVar.f19800b;
                    if (bitmap2 != bitmap3) {
                        bitmap = bitmap3;
                    }
                    bVar3.f19800b = bitmap;
                    bitmap = bVar3;
                }
                hashMap.put(valueOf, bitmap);
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectAnnotModeClickListener(View view) {
        if (view == null) {
            return;
        }
        View findViewById = view.findViewById(R.id.iv_pop_copy);
        if (findViewById != null) {
            findViewById.setOnClickListener(new k());
        }
        if (this.T == SelectPopMode.Annot_After_Select) {
            View findViewById2 = view.findViewById(R.id.iv_pop_delete);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new l());
                return;
            }
            return;
        }
        View findViewById3 = view.findViewById(R.id.iv_pop_highlight);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new m());
        }
        View findViewById4 = view.findViewById(R.id.iv_pop_underline);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new n());
        }
        View findViewById5 = view.findViewById(R.id.iv_pop_delete_line);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectRectF(PDFReaderView pDFReaderView) {
        if (pDFReaderView != null && pDFReaderView.I0()) {
            pDFReaderView.setSelectTextLocation(pDFReaderView.z0(this));
        }
    }

    public final void A1(j.a aVar) {
        B1(aVar, false);
    }

    public final void B1(s0 s0Var, boolean z10) {
        RectF rectF;
        TextChar[][] textCharArr;
        TextChar[][] textCharArr2;
        t0 t0Var = new t0(this.f21311x, this.f21309w);
        TextChar[][] textCharArr3 = t0Var.f21601a;
        if (textCharArr3 != null && (rectF = t0Var.f21602b) != null) {
            if (rectF instanceof Annotation) {
                PointF[] quadPoints = ((Annotation) rectF).getQuadPoints();
                if (quadPoints != null && quadPoints.length != 0) {
                    int length = quadPoints.length / 4;
                    RectF[] rectFArr = new RectF[length];
                    int i10 = 0;
                    for (int i11 = 0; i11 < quadPoints.length; i11 += 4) {
                        RectF rectF2 = new RectF();
                        PointF pointF = quadPoints[i11];
                        float f10 = pointF.x;
                        PointF pointF2 = quadPoints[i11 + 2];
                        rectF2.set(f10, pointF2.y, pointF2.x, pointF.y);
                        rectFArr[i11 / 4] = rectF2;
                    }
                    HashMap<TextChar, Boolean> hashMap = t0Var.c;
                    hashMap.clear();
                    int i12 = 0;
                    while (i12 < length) {
                        RectF rectF3 = rectFArr[i12];
                        if (!rectF3.isEmpty() && !z10) {
                            s0Var.c();
                            s0Var.b(new TextChar(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, 't'));
                            s0Var.a();
                        } else {
                            int length2 = textCharArr3.length;
                            int i13 = i10;
                            while (i13 < length2) {
                                TextChar[] textCharArr4 = textCharArr3[i13];
                                if (t0.b(textCharArr4)) {
                                    TextChar textChar = textCharArr4[i10];
                                    if (((RectF) textChar).bottom > rectF3.top && ((RectF) textChar).top < rectF3.bottom) {
                                        float min = Math.min(rectF3.left, rectF3.right);
                                        float max = Math.max(rectF3.left, rectF3.right);
                                        s0Var.c();
                                        int length3 = textCharArr4.length;
                                        int i14 = i10;
                                        while (i14 < length3) {
                                            TextChar textChar2 = textCharArr4[i14];
                                            if (textChar2 != null && !textChar2.isInvalid && ((RectF) textChar2).right > min && ((RectF) textChar2).left < max) {
                                                if (z10) {
                                                    Boolean bool = Boolean.TRUE;
                                                    textCharArr2 = textCharArr3;
                                                    if (!bool.equals(hashMap.get(textChar2))) {
                                                        s0Var.b(textChar2);
                                                        hashMap.put(textChar2, bool);
                                                    }
                                                } else {
                                                    textCharArr2 = textCharArr3;
                                                    s0Var.b(textChar2);
                                                }
                                            } else {
                                                textCharArr2 = textCharArr3;
                                            }
                                            i14++;
                                            textCharArr3 = textCharArr2;
                                        }
                                        textCharArr = textCharArr3;
                                        s0Var.a();
                                        i13++;
                                        textCharArr3 = textCharArr;
                                        i10 = 0;
                                    }
                                }
                                textCharArr = textCharArr3;
                                i13++;
                                textCharArr3 = textCharArr;
                                i10 = 0;
                            }
                        }
                        i12++;
                        textCharArr3 = textCharArr3;
                        i10 = 0;
                    }
                    return;
                }
                t0Var.a(s0Var);
                return;
            }
            t0Var.a(s0Var);
        }
    }

    public final void C1(Point point, float f10, boolean z10) {
        Point point2 = this.f21273e;
        if (point2 == null) {
            return;
        }
        Q1(point, f10);
        if (i.a.f21508a.f21507d) {
            return;
        }
        Point point3 = this.f21273e;
        if ((point3.x > point2.x || point3.y > point2.y) && !z10) {
            pg.a.c().a().getClass();
            aj.b.K("reSize safeCreateBitmap " + this.c + " width " + this.f21273e.x + " height " + this.f21273e.y);
            Point point4 = this.f21273e;
            Bitmap L1 = L1(point4.x, point4.y);
            Point point5 = this.f21273e;
            int i10 = point5.x;
            int i11 = point5.y;
            new g(k1(L1, i10, i11, 0, 0, i10, i11), L1, L1).b(new Void[0]);
        }
        requestLayout();
        if ((this.f21277g != 1.0f || this.V) && !z10) {
            post(new z0(this, 16));
        }
    }

    public final void D() {
        Z0();
    }

    public final void D1(boolean z10) {
        nj.b.a();
        lib.zj.pdfeditor.b<Void, Boolean> bVar = this.f21285k;
        if (bVar != null) {
            bVar.a();
            this.f21285k = null;
        }
        if (z10) {
            lib.zj.pdfeditor.g gVar = this.f21279h;
            if (gVar != null) {
                gVar.setImageBitmap(null);
                this.f21279h.invalidate();
            }
            Bitmap bitmap = this.f21291n;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f21291n.recycle();
                this.f21291n = null;
            }
        }
    }

    public final void E1(boolean z10) {
        nj.b.a();
        this.f21302s0.removeCallbacksAndMessages(null);
        c cVar = this.f21287l;
        if (cVar != null) {
            cVar.a();
            this.f21287l = null;
        }
        if (z10) {
            lib.zj.pdfeditor.g gVar = this.f21303t;
            if (gVar != null) {
                gVar.setImageBitmap(null);
                this.f21303t.invalidate();
            }
            Bitmap bitmap = this.f21293o;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f21293o.recycle();
                this.f21293o = null;
            }
        }
    }

    public final void F1(boolean z10) {
        nj.b.a();
        b bVar = this.f21289m;
        if (bVar != null) {
            bVar.a();
            this.f21289m = null;
        }
        if (z10) {
            if (this.f21279h != null) {
                Bitmap bitmap = this.f21291n;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.f21279h.setImageBitmap(this.f21291n);
                } else {
                    this.f21279h.setImageBitmap(null);
                }
                this.f21279h.invalidate();
            }
            Bitmap bitmap2 = this.f21295p;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f21295p.recycle();
                this.f21295p = null;
            }
            BitmapRegionDecoder bitmapRegionDecoder = this.f21269b0;
            if (bitmapRegionDecoder != null && !bitmapRegionDecoder.isRecycled()) {
                this.f21269b0.recycle();
            }
        }
    }

    public final void G() {
        if (i.a.f21508a.f21507d) {
            return;
        }
        D1(false);
        F1(true);
        R1();
        W1(true, false);
    }

    public final void G1() {
        nj.b.a();
        D1(true);
        F1(true);
        E1(true);
        c0 c0Var = this.f21283j;
        if (c0Var != null) {
            c0Var.a();
            this.f21283j = null;
        }
        f0 f0Var = this.f21281i;
        if (f0Var != null) {
            f0Var.a();
            this.f21281i = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(lib.zj.pdfeditor.PDFReaderView.Mode r4) {
        /*
            r3 = this;
            lib.zj.pdfeditor.PDFReaderView$Mode r0 = lib.zj.pdfeditor.PDFReaderView.Mode.Drawing
            if (r4 != r0) goto L7
            ij.a r4 = r3.f21298q0
            goto L9
        L7:
            ij.a r4 = r3.f21300r0
        L9:
            r0 = 0
            if (r4 == 0) goto L34
            java.util.ArrayList<ij.a$b> r1 = r4.c
            boolean r1 = r1.isEmpty()
            r2 = 1
            if (r1 == 0) goto L16
            goto L2d
        L16:
            java.util.ArrayList<ij.a$b> r4 = r4.c
            java.lang.Object r4 = r4.get(r0)
            ij.a$b r4 = (ij.a.b) r4
            if (r4 == 0) goto L2d
            java.util.ArrayList r4 = r4.f18517a
            int r1 = r4.size()
            if (r1 != r2) goto L2d
            r4.clear()
            r4 = r2
            goto L2e
        L2d:
            r4 = r0
        L2e:
            if (r4 == 0) goto L34
            r3.q1()
            r0 = r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.pdfeditor.PageView.H(lib.zj.pdfeditor.PDFReaderView$Mode):boolean");
    }

    public final void H1(boolean z10) {
        float f10;
        this.f21307v = null;
        D1(false);
        F1(false);
        if (z10) {
            this.f21270c0 = 0;
        }
        int i10 = this.c;
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        int i11 = iVar.c;
        float[] fArr = lib.zj.pdfeditor.i.f21501e;
        if (i11 >= 0 && i11 < 6) {
            f10 = fArr[i11];
        } else {
            f10 = fArr[1];
        }
        float f11 = f10;
        String a10 = iVar.a();
        aj.b a11 = pg.a.c().a();
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("renderReflow ", i10, " x ");
        e10.append(E0.x);
        e10.append(" y ");
        e10.append(E0.y);
        String sb2 = e10.toString();
        a11.getClass();
        aj.b.K(sb2);
        Point point = E0;
        int i12 = point.x;
        int i13 = point.y;
        S1();
        Point point2 = E0;
        b bVar = new b(n1(point2.x, point2.y, ReaderView.C0, f11, lib.zj.pdfeditor.i.f21504h[1]), i10, f11, z10, a10);
        this.f21289m = bVar;
        bVar.b(new Void[0]);
    }

    public final RectF I1(RectF rectF) {
        float f10 = this.f21275f * this.f21277g;
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left * f10;
        rectF2.top = rectF.top * f10;
        rectF2.right = rectF.right * f10;
        rectF2.bottom = rectF.bottom * f10;
        return rectF2;
    }

    public abstract void J1();

    public final void K0() {
        this.f21302s0.removeCallbacksAndMessages(null);
        lib.zj.pdfeditor.b<Void, Boolean> bVar = this.f21285k;
        if (bVar != null) {
            bVar.a();
            this.f21285k = null;
        }
        b bVar2 = this.f21289m;
        if (bVar2 != null) {
            bVar2.a();
            this.f21289m = null;
        }
        c cVar = this.f21287l;
        if (cVar != null) {
            cVar.a();
            this.f21287l = null;
        }
        c0 c0Var = this.f21283j;
        if (c0Var != null) {
            c0Var.a();
            this.f21283j = null;
        }
        f0 f0Var = this.f21281i;
        if (f0Var != null) {
            f0Var.a();
            this.f21281i = null;
        }
    }

    public abstract void K1();

    public abstract void M0(ij.a aVar);

    public final void M1(b0 b0Var) {
        if (this.f21311x != null) {
            if (b0Var != null) {
                b0Var.a();
            }
        } else if (this.f21281i == null) {
            f0 f0Var = new f0(this, b0Var);
            this.f21281i = f0Var;
            f0Var.c(new Void[0]);
        }
    }

    public final void N0() {
        if (this.D == null) {
            Context context = this.f21268b;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.dp_1);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.dp_3);
            context.getResources().getDimensionPixelSize(R.dimen.dp_44);
            context.getResources().getDimensionPixelSize(R.dimen.dp_5);
            int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.dp_12);
            int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.dp_11);
            int dimensionPixelSize5 = context.getResources().getDimensionPixelSize(R.dimen.dp_14);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setDither(true);
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setDither(true);
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeCap(Paint.Cap.ROUND);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setStrokeWidth(dimensionPixelSize);
            paint4.setColor(androidx.core.content.a.getColor(context, R.color.txt_dash_box_color));
            paint4.setStyle(Paint.Style.STROKE);
            float f10 = dimensionPixelSize2;
            paint4.setPathEffect(new DashPathEffect(new float[]{f10, f10}, 0.0f));
            Paint paint5 = new Paint();
            this.f21278g0 = getScreenWidth();
            this.f21280h0 = getScreenHeight();
            S1();
            j jVar = new j(this.f21268b, paint, dimensionPixelSize, new ArrayList(), paint5, paint4, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize5, dimensionPixelSize3, paint2, paint3);
            this.D = jVar;
            addView(jVar);
        }
    }

    public final void N1(float f10, float f11, float f12, float f13) {
        this.T = null;
        if ((getParent() instanceof PDFReaderView) && !((PDFReaderView) getParent()).I0()) {
            f10 = (f10 + getLeft()) - ((PDFReaderView) getParent()).f21250z1;
            f11 = (f11 + getTop()) - ((PDFReaderView) getParent()).A1;
        }
        float width = (this.f21275f * getWidth()) / this.f21271d.x;
        float left = (f10 - getLeft()) / width;
        float top = (f11 - getTop()) / width;
        float left2 = (f12 - getLeft()) / width;
        float top2 = (f13 - getTop()) / width;
        if (top <= top2) {
            this.f21309w = new RectF(left, top, left2, top2);
        } else {
            this.f21309w = new RectF(left2, top2, left, top);
        }
        q1();
        S1();
        M1(null);
    }

    public final synchronized void O0(kj.b bVar) {
        this.A0.add(bVar);
        q1();
    }

    public void O1(int i10, PointF pointF, float f10, boolean z10) {
        this.E = false;
        q1();
        this.c = i10;
        if (this.f21279h == null) {
            lib.zj.pdfeditor.g gVar = new lib.zj.pdfeditor.g(this.f21268b);
            this.f21279h = gVar;
            gVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.f21279h.setColorFilter(getColorFilter());
            addView(this.f21279h, 0);
        }
        Q1(new Point((int) pointF.x, (int) pointF.y), f10);
        if (i.a.f21508a.f21507d) {
            H1(true);
            N0();
            requestLayout();
            return;
        }
        nj.b.a();
        this.f21279h.setImageBitmap(null);
        Bitmap bitmap = this.f21291n;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f21291n.recycle();
            this.f21291n = null;
        }
        Point point = this.f21273e;
        Bitmap L1 = L1(point.x, point.y);
        this.f21279h.invalidate();
        if (this.f21283j == null) {
            c0 c0Var = new c0(this);
            this.f21283j = c0Var;
            c0Var.c(new Void[0]);
        }
        Point point2 = this.f21273e;
        int i11 = point2.x;
        int i12 = point2.y;
        i iVar = new i((PDFPageView) this, k1(L1, i11, i12, 0, 0, i11, i12), L1, L1);
        this.f21285k = iVar;
        iVar.b(new Void[0]);
        N0();
        requestLayout();
        if (this.f21277g != 1.0f && z10) {
            post(new y0(this, 17));
        }
    }

    public final void Q1(Point point, float f10) {
        this.f21275f = f10;
        Point point2 = new Point(point.x, point.y);
        this.f21271d = point2;
        float f11 = point.x;
        float f12 = point.y;
        Point point3 = E0;
        float f13 = point3.x * point3.y * 2;
        float f14 = f11 * f12;
        if (f14 > f13 && f14 != 0.0f) {
            float f15 = f13 / f14;
            this.V = true;
            this.f21273e = new Point((int) (f11 * f15), (int) (f15 * f12));
            return;
        }
        this.V = false;
        this.f21273e = point2;
    }

    public final void R0(int i10) {
        G1();
        this.E = true;
        this.c = 0;
        this.f21276f0 = -1L;
        if (this.f21271d == null) {
            this.f21271d = E0;
        }
        this.f21273e = null;
        this.V = false;
        lib.zj.pdfeditor.g gVar = this.f21279h;
        if (gVar != null) {
            gVar.setImageBitmap(null);
            this.f21279h.invalidate();
        }
        lib.zj.pdfeditor.g gVar2 = this.f21303t;
        if (gVar2 != null) {
            gVar2.setImageBitmap(null);
            this.f21303t.invalidate();
        }
        this.f21297q = null;
        this.f21299r = null;
        this.f21301s = null;
        this.f21305u = null;
        this.f21307v = null;
        this.f21309w = null;
        this.f21311x = null;
        this.f21313y = null;
        this.W = null;
        this.f21270c0 = 0;
        this.T = null;
        z1();
        this.c = i10;
        setBackgroundColor(this.f21266a);
    }

    public final void R1() {
        Point point;
        if (!i.a.f21508a.f21507d && !this.E) {
            if (!this.V || (point = this.f21273e) == null) {
                point = this.f21271d;
            }
            pg.a.c().a().getClass();
            aj.b.K("simpleRenderPage safeCreateBitmap " + this.c + " width " + point.x + " height " + point.y);
            Bitmap L1 = L1(point.x, point.y);
            int i10 = point.x;
            int i11 = point.y;
            e eVar = new e(l1(L1, i10, i11, i10, i11), L1, L1);
            this.f21285k = eVar;
            eVar.b(new Void[0]);
        }
    }

    public final void S0(SelectPopMode selectPopMode) {
        if (selectPopMode != null) {
            selectPopMode.name();
        }
        S1();
        this.T = selectPopMode;
        q1();
    }

    public final void S1() {
        ViewParent parent = getParent();
        if (parent instanceof ReaderView) {
            ((ReaderView) parent).getClass();
        }
    }

    public final boolean T0(ij.a aVar) {
        ArrayList arrayList;
        PointF pointF;
        a.C0249a next;
        int i10;
        PointF pointF2 = this.f21306u0;
        int i11 = 0;
        if (pointF2 != null && !pointF2.equals(this.f21304t0)) {
            HashMap<a.b, ArrayList<a.C0249a>> hashMap = this.f21310w0;
            hashMap.clear();
            Iterator<a.b> it = aVar.c.iterator();
            while (it.hasNext()) {
                a.b next2 = it.next();
                float[] fArr = new float[8];
                PointF pointF3 = this.f21306u0;
                float f10 = pointF3.x;
                float f11 = pointF3.y;
                PointF pointF4 = this.f21304t0;
                ReaderPDFCore.getRectFromLineSegment(f10, f11, pointF4.x, pointF4.y, this.f21300r0.f18510d + (aVar.f18510d * 0.7f), true, fArr);
                int size = next2.f18517a.size();
                ArrayList arrayList2 = next2.f18517a;
                if (size == 1) {
                    PointF pointF5 = (PointF) arrayList2.get(i11);
                    if (ReaderPDFCore.isPointInRect(pointF5.x, pointF5.y, fArr[i11], fArr[1], fArr[2], fArr[3], fArr[6], fArr[7])) {
                        Q0(hashMap, next2, new a.C0249a(1, ReaderPDFCore.CX_Status.CX_All));
                    }
                } else {
                    float[] fArr2 = new float[4];
                    int i12 = 1;
                    while (i12 < size) {
                        PointF pointF6 = (PointF) arrayList2.get(i12 - 1);
                        PointF pointF7 = (PointF) arrayList2.get(i12);
                        int i13 = i12;
                        ReaderPDFCore.CX_Status lineCrossRectStatus = ReaderPDFCore.getLineCrossRectStatus(pointF6.x, pointF6.y, pointF7.x, pointF7.y, fArr, fArr2);
                        if (lineCrossRectStatus != ReaderPDFCore.CX_Status.CX_None) {
                            a.C0249a c0249a = new a.C0249a(i13, lineCrossRectStatus);
                            int i14 = h.f21334b[lineCrossRectStatus.ordinal()];
                            if (i14 != 1 && i14 != 2) {
                                if (i14 == 3) {
                                    c0249a.c = (float[]) fArr2.clone();
                                }
                            } else {
                                float[] fArr3 = new float[2];
                                c0249a.c = fArr3;
                                System.arraycopy(fArr2, 0, fArr3, 0, 2);
                            }
                            Q0(hashMap, next2, c0249a);
                        }
                        i12 = i13 + 1;
                    }
                }
                i11 = 0;
            }
            boolean z10 = false;
            for (Map.Entry<a.b, ArrayList<a.C0249a>> entry : hashMap.entrySet()) {
                a.b key = entry.getKey();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = key.f18517a;
                Iterator<a.C0249a> it2 = entry.getValue().iterator();
                int i15 = 0;
                while (true) {
                    pointF = null;
                    while (it2.hasNext()) {
                        next = it2.next();
                        int i16 = h.f21334b[next.f18516b.ordinal()];
                        i10 = next.f18515a;
                        if (i16 != 1) {
                            if (i16 != 2) {
                                if (i16 != 3) {
                                    if (i16 == 4) {
                                        i15 = i10 + 1;
                                    }
                                } else {
                                    float[] fArr4 = next.c;
                                    P0(i15, next.f18515a, arrayList3, arrayList4, pointF, new PointF(fArr4[0], fArr4[1]));
                                    float[] fArr5 = next.c;
                                    pointF = new PointF(fArr5[2], fArr5[3]);
                                }
                            }
                        } else {
                            float[] fArr6 = next.c;
                            pointF = new PointF(fArr6[0], fArr6[1]);
                        }
                        i15 = i10;
                    }
                    float[] fArr7 = next.c;
                    P0(i15, next.f18515a, arrayList3, arrayList4, pointF, new PointF(fArr7[0], fArr7[1]));
                    i15 = i10 + 1;
                }
                int size2 = arrayList4.size();
                if (i15 < size2) {
                    P0(i15, size2, arrayList3, arrayList4, pointF, null);
                }
                aVar.c.remove(key);
                aVar.c.addAll(arrayList3);
                z10 = true;
            }
            return z10;
        }
        HashMap<a.b, ArrayList<Integer>> hashMap2 = this.f21308v0;
        hashMap2.clear();
        Iterator<a.b> it3 = aVar.c.iterator();
        while (it3.hasNext()) {
            a.b next3 = it3.next();
            if (next3 != null) {
                ArrayList arrayList5 = next3.f18517a;
                if (!arrayList5.isEmpty()) {
                    float f12 = this.f21300r0.f18510d / 2.0f;
                    float f13 = f12 * f12;
                    for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                        PointF pointF8 = (PointF) arrayList5.get(i17);
                        float abs = Math.abs(pointF8.x - this.f21304t0.x);
                        float abs2 = Math.abs(pointF8.y - this.f21304t0.y);
                        if (abs <= f12 && abs2 <= f12) {
                            if (((int) ((abs2 * abs2) + (abs * abs))) < f13) {
                                Q0(hashMap2, next3, Integer.valueOf(i17));
                            }
                        }
                    }
                }
            }
        }
        boolean z11 = false;
        for (Map.Entry<a.b, ArrayList<Integer>> entry2 : hashMap2.entrySet()) {
            a.b key2 = entry2.getKey();
            ArrayList<Integer> value = entry2.getValue();
            if (key2 != null) {
                ArrayList arrayList6 = key2.f18517a;
                if (!arrayList6.isEmpty()) {
                    arrayList = new ArrayList();
                    Iterator<Integer> it4 = value.iterator();
                    int i18 = 0;
                    while (it4.hasNext()) {
                        int intValue = it4.next().intValue();
                        if (i18 < intValue) {
                            arrayList.add(new a.b(arrayList6.subList(i18, intValue)));
                        }
                        i18 = intValue + 1;
                    }
                    int size3 = arrayList6.size();
                    if (i18 < size3) {
                        arrayList.add(new a.b(arrayList6.subList(i18, size3)));
                    }
                    aVar.c.remove(key2);
                    aVar.c.addAll(arrayList);
                    z11 = true;
                }
            }
            arrayList = null;
            aVar.c.remove(key2);
            aVar.c.addAll(arrayList);
            z11 = true;
        }
        return z11;
    }

    public final void T1() {
        if (i.a.f21508a.f21507d) {
            return;
        }
        D1(false);
        F1(true);
        if (this.f21277g > 1.0f || this.V) {
            this.f21297q = null;
            this.f21299r = null;
            W1(true, false);
        }
        R1();
    }

    public abstract void U0();

    public final RectF U1(RectF rectF) {
        float f10 = this.f21275f * this.f21277g;
        RectF rectF2 = new RectF();
        rectF2.left = rectF.left / f10;
        rectF2.top = rectF.top / f10;
        rectF2.right = rectF.right / f10;
        rectF2.bottom = rectF.bottom / f10;
        return rectF2;
    }

    public abstract void V0();

    public final void V1(PDFReaderView.Mode mode) {
        ArrayList<PointF> arrayList;
        List<ij.a> m12;
        a.b bVar;
        if (!H(mode)) {
            if (mode == PDFReaderView.Mode.Drawing) {
                ij.a aVar = this.f21298q0;
                if (aVar != null && aVar.b()) {
                    M0(this.f21298q0);
                }
                this.f21298q0 = null;
                return;
            }
            ij.a aVar2 = this.f21300r0;
            if (aVar2 != null) {
                if (!aVar2.c.isEmpty() && (bVar = aVar2.c.get(0)) != null) {
                    arrayList = bVar.f18517a;
                } else {
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty() && (m12 = m1(true)) != null && !m12.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        for (PointF pointF : arrayList) {
                            this.f21304t0 = pointF;
                            for (ij.a aVar3 : m12) {
                                if (T0(aVar3)) {
                                    arrayList2.add(aVar3);
                                }
                            }
                            this.f21306u0 = this.f21304t0;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    X1(arrayList2);
                }
            }
            this.f21300r0 = null;
            this.f21304t0 = null;
            this.f21306u0 = null;
            this.f21308v0.clear();
            this.f21310w0.clear();
            q1();
        }
    }

    public abstract void W0();

    public final void W1(boolean z10, boolean z11) {
        boolean z12;
        lib.zj.pdfeditor.c k12;
        if (i.a.f21508a.f21507d) {
            return;
        }
        S1();
        pg.a.c().a().getClass();
        aj.b.K("进入局部刷新方法 page " + this.c);
        if (E0 != null && this.f21271d != null) {
            getLeft();
            getTop();
            getRight();
            getBottom();
            Point point = E0;
            int i10 = point.x;
            int i11 = point.y;
            S1();
            if (getRight() >= 0 && getLeft() <= E0.x && getTop() <= E0.y && getBottom() >= 0) {
                Rect rect = new Rect(getLeft(), getTop(), getRight(), getBottom());
                pg.a.c().a().getClass();
                aj.b.K("进入局部刷新方法  mParentSize 取值 成功");
                if ((rect.width() == this.f21271d.x || rect.height() == this.f21271d.y || this.f21277g <= 1.0f) && !this.V) {
                    pg.a.c().a().getClass();
                    aj.b.K("进入局部刷新方法  mSize 取值 成功");
                    S1();
                    lib.zj.pdfeditor.g gVar = this.f21303t;
                    if (gVar != null) {
                        gVar.setImageBitmap(null);
                        this.f21303t.invalidate();
                        return;
                    }
                    return;
                }
                Point point2 = new Point(rect.width(), rect.height());
                Rect patchArea = getPatchArea();
                if (patchArea.width() > 0 && patchArea.height() > 0) {
                    pg.a.c().a().getClass();
                    aj.b.K("updateHq new patchViewSize");
                    if (patchArea.equals(this.f21299r) && point2.equals(this.f21297q)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    pg.a.c().a().getClass();
                    aj.b.K("updateHq area_unchanged end");
                    if (z12 && !z10) {
                        return;
                    }
                    boolean z13 = !z12;
                    E1(false);
                    if (this.f21303t == null) {
                        lib.zj.pdfeditor.g gVar2 = new lib.zj.pdfeditor.g(this.f21268b);
                        this.f21303t = gVar2;
                        gVar2.setScaleType(ImageView.ScaleType.MATRIX);
                        this.f21303t.setColorFilter(getColorFilter());
                        addView(this.f21303t);
                        j jVar = this.D;
                        if (jVar != null) {
                            jVar.bringToFront();
                        }
                        Iterator it = this.B.iterator();
                        while (it.hasNext()) {
                            ((PDFFreeTextEditView) it.next()).bringToFront();
                        }
                    }
                    Bitmap L1 = L1(patchArea.width(), patchArea.height());
                    S1();
                    if (!z13 && !z11) {
                        k12 = o1(L1, point2.x, point2.y, patchArea.left, patchArea.top, patchArea.width(), patchArea.height());
                    } else {
                        k12 = k1(L1, point2.x, point2.y, patchArea.left, patchArea.top, patchArea.width(), patchArea.height());
                    }
                    this.f21301s = patchArea;
                    c cVar = new c(k12, L1, L1, patchArea, point2);
                    this.f21287l = cVar;
                    if (z10) {
                        this.f21302s0.removeCallbacksAndMessages(null);
                        this.f21302s0.postDelayed(new d(), 50L);
                        return;
                    }
                    cVar.b(new Void[0]);
                }
            }
        }
    }

    public abstract void X0();

    public abstract void X1(ArrayList arrayList);

    public abstract void Y0();

    public final void Z0() {
        boolean z10;
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            z10 = ((PDFReaderView) parent).a1();
        } else {
            z10 = false;
        }
        if (!z10) {
            q1();
        }
    }

    public final void a1() {
        PopupWindow popupWindow = this.f21292n0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public void b() {
        PopupWindow popupWindow = this.f21286k0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void b1() {
        PopupWindow popupWindow = this.f21288l0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void c1() {
        PopupWindow popupWindow = this.f21290m0;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d1() {
        qg.c cVar = this.W;
        if (cVar != null && cVar.isReadOnly()) {
            this.W.b(this.c);
            Y0();
        } else {
            X0();
        }
        Z0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f21272d0) {
            canvas.drawColor(1711276032);
        }
    }

    public final void e() {
        BitmapRegionDecoder bitmapRegionDecoder;
        if (this.f21277g == 1.0f && (bitmapRegionDecoder = this.f21269b0) != null && !bitmapRegionDecoder.isRecycled()) {
            Rect patchArea = getPatchArea();
            if (patchArea.bottom <= this.f21269b0.getHeight() && patchArea.width() > 0 && patchArea.height() > 0) {
                if (this.f21303t == null) {
                    lib.zj.pdfeditor.g gVar = new lib.zj.pdfeditor.g(this.f21268b);
                    this.f21303t = gVar;
                    gVar.setScaleType(ImageView.ScaleType.MATRIX);
                    this.f21303t.setColorFilter(getColorFilter());
                    addView(this.f21303t);
                }
                if (!patchArea.equals(this.f21299r)) {
                    this.f21303t.setImageBitmap(this.f21269b0.decodeRegion(patchArea, new BitmapFactory.Options()));
                    this.f21299r = patchArea;
                    this.f21297q = new Point(patchArea.width(), this.f21270c0);
                    requestLayout();
                }
            }
        }
    }

    public final void g() {
        this.f21297q = null;
        this.f21299r = null;
        lib.zj.pdfeditor.g gVar = this.f21303t;
        if (gVar != null) {
            gVar.setImageBitmap(null);
            this.f21303t.invalidate();
        }
    }

    public abstract void g1();

    public int getAcceptModeToPageView() {
        return this.S;
    }

    public float getEditorScale() {
        return ((this.f21275f * getWidth()) / this.f21271d.x) * 2.0f;
    }

    public float getEditorSourceScale() {
        return this.f21275f * 2.0f;
    }

    public abstract LinkInfo[] getLinkInfo();

    public int getMode_paint() {
        return this.f21312x0;
    }

    public abstract ReaderPDFCore getPDFCore();

    public int getPage() {
        return this.c;
    }

    public ArrayList<kj.b> getPageStampData() {
        return this.A0;
    }

    public int getReflowHeight() {
        return this.f21270c0;
    }

    public ArrayList<kj.b> getSavedStampData() {
        return this.B0;
    }

    public float getScale() {
        return (this.f21275f * getWidth()) / this.f21271d.x;
    }

    public abstract RectF getSelectImageBlockRectF();

    public SelectPopMode getSelectPopMode() {
        return this.T;
    }

    public String getSelectText() {
        Objects.toString(this.f21309w);
        S1();
        StringBuilder sb2 = this.f21314y0;
        sb2.setLength(0);
        B1(new f(), true);
        return sb2.toString();
    }

    public abstract RectF getSelectTextBlockRectF();

    public int getSkipStamp() {
        return this.D0;
    }

    public float getSourceScale() {
        return this.f21275f;
    }

    public abstract TextChar[][] getText();

    public final void h1() {
        D1(false);
        F1(true);
        E1(true);
        this.f21297q = null;
        this.f21299r = null;
        R1();
        this.f21270c0 = 0;
    }

    public final void i1(Context context, int i10) {
        if (context == null) {
            return;
        }
        this.f21296p0 = context.getApplicationContext();
        ng.d.f22480a.execute(new a(i10));
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        return true;
    }

    public abstract lib.zj.pdfeditor.l k1(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15);

    public abstract lib.zj.pdfeditor.m l1(Bitmap bitmap, int i10, int i11, int i12, int i13);

    public final void m() {
        W1(false, false);
    }

    public abstract List<ij.a> m1(boolean z10);

    public abstract lib.zj.pdfeditor.o n1(int i10, int i11, int i12, float f10, float f11);

    public abstract lib.zj.pdfeditor.n o1(Bitmap bitmap, int i10, int i11, int i12, int i13, int i14, int i15);

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f21278g0 = getScreenWidth();
        this.f21280h0 = getScreenHeight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.W = null;
        y1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((PDFFreeTextEditView) it.next()).layout(0, 0, i14, i15);
        }
        lib.zj.pdfeditor.g gVar = this.f21279h;
        if (gVar != null) {
            gVar.layout(0, 0, i14, i15);
        }
        j jVar = this.D;
        if (jVar != null) {
            jVar.layout(0, 0, i14, i15);
        }
        Point point = this.f21297q;
        if (point != null) {
            if (point.x == i14 && point.y == i15) {
                Rect rect = this.f21299r;
                if (rect != null) {
                    this.f21303t.layout(rect.left, rect.top, rect.right, rect.bottom);
                }
            } else {
                this.f21297q = null;
                this.f21299r = null;
                this.f21301s = null;
                lib.zj.pdfeditor.g gVar2 = this.f21303t;
                if (gVar2 != null) {
                    gVar2.setImageBitmap(null);
                    this.f21303t.invalidate();
                }
            }
        }
        ReflowLoadingView reflowLoadingView = this.F;
        if (reflowLoadingView != null) {
            int measuredWidth = reflowLoadingView.getMeasuredWidth();
            int measuredHeight = this.F.getMeasuredHeight();
            this.F.layout((i14 - measuredWidth) / 2, (i15 - measuredHeight) / 2, (i14 + measuredWidth) / 2, (i15 + measuredHeight) / 2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (View.MeasureSpec.getMode(i10) != 0) {
            i12 = View.MeasureSpec.getSize(i10);
        } else if (i.a.f21508a.f21507d) {
            i12 = E0.x;
        } else {
            i12 = this.f21271d.x;
        }
        if (View.MeasureSpec.getMode(i11) != 0) {
            i13 = View.MeasureSpec.getSize(i11);
        } else if (i.a.f21508a.f21507d) {
            i13 = this.f21270c0;
            if (i13 <= 0) {
                i13 = E0.y;
            }
        } else {
            i13 = this.f21271d.y;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((PDFFreeTextEditView) it.next()).measure(i10, i11);
        }
        setMeasuredDimension(i12, i13);
        if (this.F != null) {
            Point point = E0;
            ReflowLoadingView reflowLoadingView = this.F;
            int min = (Math.min(point.x, point.y) / 2) | SlideAtom.USES_MASTER_SLIDE_ID;
            reflowLoadingView.measure(min, min);
        }
    }

    public final boolean p1() {
        Bitmap bitmap = this.f21295p;
        if (bitmap != null && !bitmap.isRecycled()) {
            return true;
        }
        return false;
    }

    public final void q1() {
        j jVar = this.D;
        if (jVar != null) {
            jVar.postInvalidate();
        }
    }

    public final boolean r1() {
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            return ((PDFReaderView) parent).f21245u1;
        }
        return false;
    }

    public abstract boolean s1();

    public void setAcceptModeToPageView(int i10) {
        this.S = i10;
    }

    public void setCurrentSearchBoxIdx(long j10) {
        this.f21276f0 = j10;
        q1();
    }

    public void setDisplayMode(boolean z10) {
        this.f21315z = z10;
        lib.zj.pdfeditor.g gVar = this.f21279h;
        if (gVar != null) {
            gVar.setColorFilter(getColorFilter());
        }
        lib.zj.pdfeditor.g gVar2 = this.f21303t;
        if (gVar2 != null) {
            gVar2.setColorFilter(getColorFilter());
        }
    }

    public void setItemSelectBox(RectF rectF) {
        this.f21313y = rectF;
        b1();
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            PDFReaderView pDFReaderView = (PDFReaderView) parent;
            pDFReaderView.g1(this, false);
            RectF rectF2 = this.f21313y;
            pDFReaderView.P0 = rectF2;
            pDFReaderView.K0 = null;
            pDFReaderView.L0 = -1;
            pDFReaderView.M0.setEmpty();
            if (rectF2 == null) {
                pDFReaderView.N0.setEmpty();
            }
        }
        this.T = null;
        this.f21309w = null;
        b();
        q1();
        M1(null);
    }

    public void setLinkHighlighting(boolean z10) {
        q1();
    }

    public void setMask(boolean z10) {
        this.f21272d0 = z10;
        if (isAttachedToWindow()) {
            invalidate();
        }
    }

    public void setMode_paint(int i10) {
        this.f21312x0 = i10;
    }

    public void setOnPageOperateListener(qg.c cVar) {
        this.W = cVar;
    }

    public void setPageStampData(ArrayList<kj.b> arrayList) {
        this.A0 = arrayList;
    }

    public void setSavedStampData(ArrayList<kj.b> arrayList) {
        this.B0 = arrayList;
    }

    public void setSearchBoxes(RectF[] rectFArr) {
        if (rectFArr != null && rectFArr.length > 0) {
            Arrays.sort(rectFArr, new p());
        }
        this.f21305u = rectFArr;
        q1();
    }

    public void setSkipStamp(int i10) {
        this.D0 = i10;
    }

    public void t() {
        T1();
    }

    public abstract boolean t1();

    public abstract boolean u1();

    public abstract boolean v1();

    public final void w1(String str) {
        S1();
    }

    public final void x1(int i10, Annotation annotation) {
        Objects.toString(annotation);
        S1();
        if (annotation != null) {
            this.T = SelectPopMode.Annot_After_Select;
            this.f21309w = annotation;
        } else {
            this.T = null;
            this.f21309w = null;
        }
        ViewParent parent = getParent();
        if (parent instanceof PDFReaderView) {
            PDFReaderView pDFReaderView = (PDFReaderView) parent;
            pDFReaderView.g1(this, false);
            pDFReaderView.K0 = annotation;
            pDFReaderView.L0 = i10;
            pDFReaderView.P0 = null;
            if (annotation == null) {
                pDFReaderView.M0.setEmpty();
            }
            pDFReaderView.N0.setEmpty();
        }
        this.f21313y = null;
        b1();
        q1();
        M1(null);
    }

    public abstract void y1();

    public abstract void z1();

    public void L0() {
    }
}
