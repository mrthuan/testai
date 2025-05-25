package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lib.flutter.encrypt.EngineHelper;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jl.a;
import lib.zj.office.fc.hslf.record.SlideAtom;
import lib.zj.pdfeditor.AsyncTask;
import lib.zj.pdfeditor.Hit;
import lib.zj.pdfeditor.PDFAlert;
import lib.zj.pdfeditor.PDFPageAdapter;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.ReaderPDFCore;
import lib.zj.pdfeditor.ReaderView;
import lib.zj.pdfeditor.i;
import lib.zj.pdfeditor.model.AnalyticsEvent;
import lib.zj.pdfeditor.scroll.PDFScrollHandle;
import oj.a;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.widget.MagnifierContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderViewContainer;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* loaded from: classes3.dex */
public class ReaderAIPreviewActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements lib.zj.pdfeditor.d, View.OnClickListener, qg.i, g1.a, ReaderActBroadCastReceiver.a, qg.a, a.d, a.d, pdf.pdfreader.viewer.editor.free.fnbridge.b, pdf.pdfreader.viewer.editor.free.thumb.adapter.a {

    /* renamed from: z1  reason: collision with root package name */
    public static final ExecutorService f24476z1;
    public ThumbnailAdapter B0;
    public String C0;
    public boolean D0;
    public MagnifierContainer E0;
    public FrameLayout F0;
    public FrameLayout G0;
    public pdf.pdfreader.viewer.editor.free.feature.bridge.c H0;
    public PdfReaderViewContainer I;
    public ConstraintLayout J;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.v K;
    public pdf.pdfreader.viewer.editor.free.utils.g1<ReaderAIPreviewActivity> L;
    public ValueAnimator M0;
    public ReaderActBroadCastReceiver<ReaderAIPreviewActivity> N;
    public ValueAnimator N0;
    public FrameLayout O;
    public int O0;
    public RelativeLayout P;
    public int P0;
    public Uri Q;
    public InterceptTouchFrameLayout R;
    public SparseIntArray U;
    public hp.e V;

    /* renamed from: a0  reason: collision with root package name */
    public PdfPreviewEntity f24477a0;

    /* renamed from: b0  reason: collision with root package name */
    public nl.b f24478b0;

    /* renamed from: c0  reason: collision with root package name */
    public ReaderPDFCore f24479c0;

    /* renamed from: c1  reason: collision with root package name */
    public Point f24480c1;

    /* renamed from: d0  reason: collision with root package name */
    public String f24481d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f24482e0;

    /* renamed from: f0  reason: collision with root package name */
    public b f24483f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f24484g0;

    /* renamed from: i1  reason: collision with root package name */
    public View f24487i1;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f24488j0;

    /* renamed from: j1  reason: collision with root package name */
    public ViewGroup f24489j1;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f24490k0;

    /* renamed from: k1  reason: collision with root package name */
    public ViewGroup f24491k1;

    /* renamed from: l0  reason: collision with root package name */
    public AlertDialog.Builder f24492l0;

    /* renamed from: l1  reason: collision with root package name */
    public PDFScrollHandle f24493l1;

    /* renamed from: m1  reason: collision with root package name */
    public ViewGroup f24495m1;

    /* renamed from: n0  reason: collision with root package name */
    public s f24496n0;

    /* renamed from: n1  reason: collision with root package name */
    public ViewGroup f24497n1;

    /* renamed from: o0  reason: collision with root package name */
    public AlertDialog f24498o0;

    /* renamed from: o1  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.s f24499o1;

    /* renamed from: p0  reason: collision with root package name */
    public ViewStub f24500p0;

    /* renamed from: p1  reason: collision with root package name */
    public InterceptRecyclerView f24501p1;

    /* renamed from: q0  reason: collision with root package name */
    public ConstraintLayout f24502q0;
    public View q1;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f24503r0;

    /* renamed from: r1  reason: collision with root package name */
    public View f24504r1;

    /* renamed from: u0  reason: collision with root package name */
    public ij.f f24509u0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f24513w0;

    /* renamed from: x0  reason: collision with root package name */
    public wn.c f24515x0;

    /* renamed from: z0  reason: collision with root package name */
    public int f24519z0;
    public final Handler M = new Handler(Looper.getMainLooper());
    public String S = "";
    public String T = "";
    public boolean W = false;
    public boolean X = false;
    public final j Y = new j();
    public boolean Z = true;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f24485h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public TopBarMode f24486i0 = TopBarMode.Main;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f24494m0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public String f24505s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    public int f24507t0 = -1;

    /* renamed from: v0  reason: collision with root package name */
    public final x f24511v0 = new x();

    /* renamed from: y0  reason: collision with root package name */
    public boolean f24517y0 = false;
    public final ThumbLoadCenter A0 = new ThumbLoadCenter();
    public int I0 = 1;
    public final a J0 = new a();
    public boolean K0 = false;
    public boolean L0 = false;

    /* renamed from: s1  reason: collision with root package name */
    public int f24506s1 = 0;

    /* renamed from: t1  reason: collision with root package name */
    public int f24508t1 = 0;

    /* renamed from: u1  reason: collision with root package name */
    public final r f24510u1 = new r();

    /* renamed from: v1  reason: collision with root package name */
    public boolean f24512v1 = false;

    /* renamed from: w1  reason: collision with root package name */
    public boolean f24514w1 = false;

    /* renamed from: x1  reason: collision with root package name */
    public final u f24516x1 = new u();

    /* renamed from: y1  reason: collision with root package name */
    public final v f24518y1 = new v();

    /* loaded from: classes3.dex */
    public enum TopBarMode {
        Main,
        Search,
        Annot,
        Delete,
        More,
        Accept
    }

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (!readerAIPreviewActivity.f24485h0 && com.google.android.play.core.assetpacks.c.W(readerAIPreviewActivity)) {
                readerAIPreviewActivity.I2(false);
                readerAIPreviewActivity.O.setVisibility(4);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class a0 implements a.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f24522a;

        public a0(Bundle bundle) {
            this.f24522a = bundle;
        }

        @Override // jl.a.d
        public final void B(boolean z10) {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (z10) {
                readerAIPreviewActivity.z2(this.f24522a);
            } else {
                readerAIPreviewActivity.t2();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends PDFReaderView {
        public b(Context context) {
            super(context);
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void L0() {
            ea.a.p("eC11LVwtHXItdg9lQyAzb1tWO2U-IFluMG8STT50K29u", "kiUXqmmF");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ea.a.p("KW4CbxJNNXQhb24=", "7xFFqZR4");
            ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
            ReaderAIPreviewActivity.this.getClass();
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void M0() {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuDG8SUzhuXmxWQydpEGs=", "HqQ9Lkb0");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (!readerAIPreviewActivity.f24485h0) {
                readerAIPreviewActivity.L2();
                ea.a.p("YWUqZBZyI0kiclF2AGUhQSd0W3YvdHk=", "SlNYues9");
                ea.a.p("IG51bxpTXm49bC9DGWkLaw8gHWgqdw==", "3OewhsX4");
            } else if (readerAIPreviewActivity.f24486i0 == TopBarMode.Main) {
                tn.a.d(ReaderPdfApplication.m(), ea.a.p("AWk1dw==", "6rwPrd7e"), ea.a.p("OWlUdyZmQmw2XzloGnc=", "uPouOBbb"), ea.a.p("Q2Rm", "QRA5ujcd"), false);
                readerAIPreviewActivity.x2();
                ea.a.p("YWUqZBZyI0kiclF2AGUhQSd0W3YvdHk=", "P20Wj1rv");
                ea.a.p("IG51bxpTXm49bC9DGWkLaw9oB2QgIA==", "EsKb2KNw");
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Q0(Hit hit) {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuL2lcdA==", "g2hXekj5");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            int[] iArr = w.c;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            int i10 = iArr[readerAIPreviewActivity.f24486i0.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    readerAIPreviewActivity.f24486i0 = TopBarMode.Annot;
                }
            } else if (hit == Hit.Annotation) {
                readerAIPreviewActivity.f24486i0 = TopBarMode.Delete;
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void R0(View view, float f10, float f11) {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuP28NZ2FyNXNAICZUHHAgYQBNW2QMPQ==", "sc1PWbSP");
            Objects.toString(ReaderAIPreviewActivity.this.f24486i0);
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            super.R0(view, f10, f11);
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void U0() {
            ea.a.p("Hi1mLV4tEnIXdl1lHiAybydWW2UxICxuCHIWdgdvTXN9ZTN0MGwLY2s=", "Xsn8SwxN");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }

        @Override // lib.zj.pdfeditor.PDFReaderView, lib.zj.pdfeditor.ReaderView
        public final void W(int i10) {
            ea.a.p("Yi0cLVQtR3I_diNlAiAMb1ZWB2UyIApuCW8aZQFvcWgmbFUgED0=", "zYNXDlU2");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (readerAIPreviewActivity.f24479c0 == null) {
                return;
            }
            if (readerAIPreviewActivity.f24519z0 != i10) {
                if (readerAIPreviewActivity.f24501p1 != null) {
                    qb.t0 t0Var = new qb.t0(this, i10, 1);
                    if (isInLayout()) {
                        readerAIPreviewActivity.f24501p1.post(t0Var);
                    } else {
                        t0Var.run();
                    }
                }
                readerAIPreviewActivity.f24519z0 = i10;
            }
            readerAIPreviewActivity.f24488j0.setText(String.valueOf(i10 + 1));
            TextView textView = readerAIPreviewActivity.f24503r0;
            if (textView != null) {
                textView.setText(String.format(Locale.ENGLISH, ea.a.p("FmQg", "0cm6Fwo0"), Integer.valueOf(readerAIPreviewActivity.f24519z0 + 1)));
            }
            super.W(i10);
            ea.a.p("XG4GbwVlNm8xaF1sDSAg", "ZZfS5WGY");
            ReaderAIPreviewActivity.m2(readerAIPreviewActivity, i10);
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void X0() {
            ea.a.p("Yi0cLVQtR3I_diNlAiAMb1ZWB2UyIApuDGFBTRFpBkQgY3ByHGE=", "b64AX1ph");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ea.a.p("HWVQZBxydkkKci92HGUfQVZ0B3YsdHk=", "DM1FxfYe");
            ea.a.p("IG5lYQlNVmk0RCVjNHINYQ8gUz14PVg9Sz0JPQ==", "o4Osv4Fe");
            PdfPreviewEntity pdfPreviewEntity = ReaderAIPreviewActivity.this.f24477a0;
            String str2 = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Y0() {
            ea.a.p("WS0eLVQtBXItdg9lQyAzb1tWO2U-IFluIG8EYzlGLmkaZw==", "L8t3yu7z");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            ea.a.p("YWUqZBZyI0kiclF2AGUhQSd0W3YvdHk=", "WBKbGW75");
            ea.a.p("XG4fbwZjCkYeaVpn", "7J02mSs6");
        }

        @Override // lib.zj.pdfeditor.PDFReaderView
        public final void Z0(String str) {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (!readerAIPreviewActivity.isFinishing() && !TextUtils.isEmpty(str)) {
                new pdf.pdfreader.viewer.editor.free.ui.dialog.b0(readerAIPreviewActivity, str, new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.e1
                    @Override // cg.a
                    public final Object invoke() {
                        ReaderAIPreviewActivity readerAIPreviewActivity2 = ReaderAIPreviewActivity.this;
                        String string = readerAIPreviewActivity2.getString(R.string.arg_res_0x7f1301b4);
                        ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
                        if (!readerAIPreviewActivity2.isFinishing()) {
                            pdf.pdfreader.viewer.editor.free.utils.j1.e(readerAIPreviewActivity2, string, true, null, readerAIPreviewActivity2.w2());
                        }
                        return null;
                    }
                }).show();
            }
        }

        @Override // lib.zj.pdfeditor.PDFReaderView, lib.zj.pdfeditor.ReaderView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }
    }

    /* loaded from: classes3.dex */
    public class b0 implements androidx.lifecycle.x<Boolean> {
        public b0() {
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                ViewGroup viewGroup = readerAIPreviewActivity.f24495m1;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    readerAIPreviewActivity.f24495m1.setVisibility(8);
                }
                gl.o.f17931a.getClass();
                gl.p.f17933p.e(readerAIPreviewActivity);
                gl.q.f17934p.e(readerAIPreviewActivity);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ReaderView.i {
        public c() {
        }

        @Override // lib.zj.pdfeditor.ReaderView.i
        public final void a() {
            ReaderAIPreviewActivity.this.x2();
        }

        @Override // lib.zj.pdfeditor.ReaderView.i
        public final void b() {
            ReaderAIPreviewActivity.this.L2();
        }
    }

    /* loaded from: classes3.dex */
    public class c0 implements androidx.lifecycle.x<Map<Uri, ip.c>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThirdOpenBean f24527a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Intent f24528b;
        public final /* synthetic */ Bundle c;

        public c0(ThirdOpenBean thirdOpenBean, Intent intent, Bundle bundle) {
            this.f24527a = thirdOpenBean;
            this.f24528b = intent;
            this.c = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Map<Uri, ip.c> map) {
            Map<Uri, ip.c> map2 = map;
            if (map2 != null) {
                ea.a.p("Z2gichdPEmUcUFVyGmUbYSphVWVy", "mJ8rheda");
                ea.a.p("IG5yaBhuUGU-IA==", "AXlYuKdd");
                map2.toString();
                ip.c cVar = map2.get(this.f24527a.getUri());
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                if (cVar != null) {
                    ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                    ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                    if (thirdOpenStatus2 != thirdOpenStatus) {
                        if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                            t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyN2UxcjBvQzE=", "VXV2DtB1"));
                            ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
                            readerAIPreviewActivity.M2();
                        } else {
                            ExecutorService executorService2 = ReaderAIPreviewActivity.f24476z1;
                            ViewGroup viewGroup = (ViewGroup) readerAIPreviewActivity.findViewById(16908290);
                            if (viewGroup != null) {
                                readerAIPreviewActivity.f24517y0 = false;
                                viewGroup.removeView(readerAIPreviewActivity.findViewById(R.id.loadingRoot));
                            }
                            PdfPreviewEntity pdfPreviewEntity = cVar.c;
                            if (pdfPreviewEntity != null) {
                                String p10 = ea.a.p("QGgkdyxwBmY=", "NEaGWAeG");
                                Intent intent = this.f24528b;
                                intent.putExtra(p10, pdfPreviewEntity);
                                intent.setData(Uri.fromFile(new File(pdfPreviewEntity.getPath())));
                                if (!readerAIPreviewActivity.p2(this.c)) {
                                    readerAIPreviewActivity.z2(null);
                                }
                            } else {
                                t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyN2U1chdvPTI=", "ZuohDpeO"));
                                readerAIPreviewActivity.M2();
                            }
                        }
                        ThirdOpenParseManager.f28764f.i(this);
                        return;
                    }
                }
                t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyJWU9cihvKDA=", "txs4VxZZ"));
                ExecutorService executorService3 = ReaderAIPreviewActivity.f24476z1;
                ViewGroup viewGroup2 = (ViewGroup) readerAIPreviewActivity.findViewById(16908290);
                if (viewGroup2 != null) {
                    readerAIPreviewActivity.f24517y0 = true;
                    View inflate = LayoutInflater.from(readerAIPreviewActivity).inflate(R.layout.layout_preview_loading, viewGroup2, false);
                    ((TextView) inflate.findViewById(R.id.loadingText)).setText(readerAIPreviewActivity.getString(R.string.arg_res_0x7f130338, ea.a.p("H0RG", "Xw4ThZc1")));
                    ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new f0(readerAIPreviewActivity, 3));
                    viewGroup2.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements ReaderView.h {
        public f() {
        }

        @Override // lib.zj.pdfeditor.ReaderView.h
        public final void a(boolean z10) {
            b bVar;
            boolean z11;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            FrameLayout frameLayout = readerAIPreviewActivity.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (!readerAIPreviewActivity.isFinishing() && (bVar = readerAIPreviewActivity.f24483f0) != null && readerAIPreviewActivity.f24484g0 != null) {
                boolean z12 = !bVar.N();
                readerAIPreviewActivity.K0 = z12;
                boolean z13 = readerAIPreviewActivity.f24485h0;
                Handler handler = readerAIPreviewActivity.M;
                if (!z13) {
                    readerAIPreviewActivity.I2(!z10);
                    a aVar = readerAIPreviewActivity.J0;
                    handler.removeCallbacks(aVar);
                    handler.postDelayed(aVar, 2000L);
                } else {
                    if (!z12 && !z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    readerAIPreviewActivity.I2(z11);
                }
                if (z10) {
                    if (readerAIPreviewActivity.f24502q0 == null) {
                        ViewGroup viewGroup = readerAIPreviewActivity.f24489j1;
                        if (viewGroup != null && viewGroup.getVisibility() == 0) {
                            readerAIPreviewActivity.f24489j1.setVisibility(4);
                            u uVar = readerAIPreviewActivity.f24516x1;
                            uVar.run();
                            handler.removeCallbacks(uVar);
                        }
                        try {
                            ConstraintLayout constraintLayout = (ConstraintLayout) readerAIPreviewActivity.f24500p0.inflate();
                            readerAIPreviewActivity.f24502q0 = constraintLayout;
                            TextView textView = (TextView) constraintLayout.findViewById(R.id.preview_current_page_number_tv);
                            readerAIPreviewActivity.f24503r0 = textView;
                            Locale locale = Locale.ENGLISH;
                            textView.setText(String.format(locale, ea.a.p("FmQg", "2cIUaq4R"), Integer.valueOf(readerAIPreviewActivity.f24519z0 + 1)));
                            TextView textView2 = (TextView) readerAIPreviewActivity.f24502q0.findViewById(R.id.preview_total_page_number_tv);
                            if (readerAIPreviewActivity.f24507t0 > 0) {
                                textView2.setText(String.format(locale, ea.a.p("amQg", "lhl2QDuI"), Integer.valueOf(readerAIPreviewActivity.f24507t0)));
                            }
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    ConstraintLayout constraintLayout2 = readerAIPreviewActivity.f24502q0;
                    if (constraintLayout2 != null && constraintLayout2.getVisibility() != 0) {
                        readerAIPreviewActivity.f24502q0.setAlpha(1.0f);
                        readerAIPreviewActivity.f24502q0.setVisibility(0);
                    }
                    v vVar = readerAIPreviewActivity.f24518y1;
                    handler.removeCallbacks(vVar);
                    handler.postDelayed(vVar, 200L);
                    return;
                }
                ReaderAIPreviewActivity.l2(readerAIPreviewActivity);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            ReaderAIPreviewActivity.m2(readerAIPreviewActivity, readerAIPreviewActivity.f24519z0);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String p10;
            ea.a.p("V2U4aw==", "hAtXQaVj");
            ExecutorService executorService = ReaderAIPreviewActivity.f24476z1;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            readerAIPreviewActivity.getClass();
            if (TextUtils.equals(ea.a.p("CVJ-TSZBSQ==", "ZI8rG34n"), readerAIPreviewActivity.S)) {
                p10 = ea.a.p("UmkoaBJ0", "KY7Sa0KP");
            } else if (readerAIPreviewActivity.D2()) {
                p10 = ea.a.p("O2hYcmQ=", "MzeKmXWb");
            } else {
                p10 = ea.a.p("K2VCaw==", "8IsdRtAy");
            }
            pdf.pdfreader.viewer.editor.free.utils.p.x(readerAIPreviewActivity, p10, readerAIPreviewActivity.f24477a0);
        }
    }

    /* loaded from: classes3.dex */
    public class j implements com.lib.flutter.encrypt.e {
        public j() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerAIPreviewActivity)) {
                if (BillingConfigImpl.c.w()) {
                    String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEnA0ZTVpL3cmbyV0PW1xYSVuFnJCcxpvdw==", "JdQRD3FS");
                    int i10 = zk.a.f32399a;
                    t1.b(p10);
                    return;
                }
                ViewGroup viewGroup = readerAIPreviewActivity.f24495m1;
                if (viewGroup != null) {
                    gl.o.f17931a.getClass();
                    gl.o.a(str, viewGroup);
                    gl.o.b();
                }
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            ViewGroup viewGroup;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerAIPreviewActivity) && (viewGroup = readerAIPreviewActivity.f24495m1) != null && viewGroup.getChildCount() > 0 && (readerAIPreviewActivity.f24495m1.getChildAt(0) instanceof BannerLoadingAnimation)) {
                readerAIPreviewActivity.f24495m1.removeAllViews();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            lo.d.b(ReaderAIPreviewActivity.this.C0);
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            ReaderPDFCore readerPDFCore = readerAIPreviewActivity.f24479c0;
            if (readerPDFCore != null) {
                readerPDFCore.onDestroy();
                readerAIPreviewActivity.f24479c0 = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m extends AnimatorListenerAdapter {
        public m() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            b bVar = readerAIPreviewActivity.f24483f0;
            if (bVar != null) {
                bVar.setSkipLoad(false);
                readerAIPreviewActivity.f24483f0.requestLayout();
            }
            if (!readerAIPreviewActivity.isFinishing()) {
                if (readerAIPreviewActivity.f24485h0) {
                    readerAIPreviewActivity.I2(true);
                    ReaderAIPreviewActivity.l2(readerAIPreviewActivity);
                    FrameLayout frameLayout = readerAIPreviewActivity.O;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                        return;
                    }
                    return;
                }
                Handler handler = readerAIPreviewActivity.M;
                a aVar = readerAIPreviewActivity.J0;
                handler.removeCallbacks(aVar);
                handler.postDelayed(aVar, 2000L);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (readerAIPreviewActivity.f24480c1 == null && (viewGroup = readerAIPreviewActivity.f24489j1) != null) {
                viewGroup.setPadding(0, 0, 0, 0);
            }
            b bVar = readerAIPreviewActivity.f24483f0;
            if (bVar != null) {
                bVar.setSkipLoad(true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements ValueAnimator.AnimatorUpdateListener {
        public n() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup viewGroup;
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) readerAIPreviewActivity.P.getLayoutParams();
            marginLayoutParams.topMargin = (int) (-(readerAIPreviewActivity.O0 * floatValue));
            readerAIPreviewActivity.P.setLayoutParams(marginLayoutParams);
            Point point = readerAIPreviewActivity.f24480c1;
            if (point != null && (viewGroup = readerAIPreviewActivity.f24489j1) != null) {
                viewGroup.setPadding((int) (point.x * floatValue), (int) (point.y * floatValue), 0, 0);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f24541a = -1;

        public o() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f10 = 1.0f - floatValue;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            InterceptRecyclerView interceptRecyclerView = readerAIPreviewActivity.f24501p1;
            if (interceptRecyclerView == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) interceptRecyclerView.getLayoutParams();
            marginLayoutParams.topMargin = (int) (floatValue * readerAIPreviewActivity.P0);
            readerAIPreviewActivity.f24501p1.setLayoutParams(marginLayoutParams);
            if (this.f24541a <= 0) {
                this.f24541a = readerAIPreviewActivity.f24508t1 - readerAIPreviewActivity.f24506s1;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) readerAIPreviewActivity.O.getLayoutParams();
            if (ReaderView.f21378z0) {
                marginLayoutParams2.bottomMargin = ((int) (f10 * this.f24541a)) + readerAIPreviewActivity.f24506s1;
            } else {
                marginLayoutParams2.setMarginEnd(((int) (f10 * this.f24541a)) + readerAIPreviewActivity.f24506s1);
            }
            readerAIPreviewActivity.O.setLayoutParams(marginLayoutParams2);
        }
    }

    /* loaded from: classes3.dex */
    public class q implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f24543a = 0;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f24544a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewGroup.MarginLayoutParams f24545b;

            public a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
                this.f24544a = view;
                this.f24545b = marginLayoutParams;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f24544a.setLayoutParams(this.f24545b);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int i18 = this.f24543a;
            if (i18 == 0) {
                this.f24543a = view.getMeasuredHeight();
            } else if (i18 == view.getMeasuredHeight()) {
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i19 = marginLayoutParams.topMargin;
                if (i19 < 0 && (-i19) == this.f24543a) {
                    marginLayoutParams.topMargin = -view.getMeasuredHeight();
                    view.post(new a(view, marginLayoutParams));
                }
                this.f24543a = view.getMeasuredHeight();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class r extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public r() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            String str;
            String str2;
            if (view.getId() == R.id.pageGotoLl) {
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                androidx.activity.s.x0(readerAIPreviewActivity);
                if (!readerAIPreviewActivity.K0 && readerAIPreviewActivity.f24507t0 > 1) {
                    b bVar = readerAIPreviewActivity.f24483f0;
                    if (bVar != null && !bVar.N()) {
                        pdf.pdfreader.viewer.editor.free.utils.j1.b(readerAIPreviewActivity, readerAIPreviewActivity.getString(R.string.arg_res_0x7f130049));
                        return;
                    }
                    if (readerAIPreviewActivity.f24499o1 == null && readerAIPreviewActivity.f24479c0 != null) {
                        readerAIPreviewActivity.f24499o1 = new pdf.pdfreader.viewer.editor.free.ui.dialog.s(readerAIPreviewActivity, readerAIPreviewActivity.f24479c0.countPages());
                    }
                    pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = readerAIPreviewActivity.f24499o1;
                    if (sVar != null) {
                        sVar.f27742t = new i1(readerAIPreviewActivity);
                        PdfPreviewEntity pdfPreviewEntity = readerAIPreviewActivity.f24477a0;
                        if (TextUtils.equals(ea.a.p("CVJ-TSZBSQ==", "ZI8rG34n"), readerAIPreviewActivity.S)) {
                            str = "Umk=";
                            str2 = "l9XZFbd0";
                        } else {
                            str = "IW9DbRhs";
                            str2 = "WkQDQjTP";
                        }
                        pdf.pdfreader.viewer.editor.free.utils.p.h(readerAIPreviewActivity, pdfPreviewEntity, false, ea.a.p(str, str2));
                        readerAIPreviewActivity.W1(readerAIPreviewActivity.f24499o1);
                        readerAIPreviewActivity.n2();
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class s extends AsyncTask<Void, Void, PDFAlert> {
        public s() {
        }

        @Override // lib.zj.pdfeditor.AsyncTask
        public final PDFAlert b(Void[] voidArr) {
            ReaderPDFCore readerPDFCore;
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (readerAIPreviewActivity.f24494m0 && (readerPDFCore = readerAIPreviewActivity.f24479c0) != null) {
                return readerPDFCore.waitForAlert();
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
            if (r5 != 4) goto L15;
         */
        @Override // lib.zj.pdfeditor.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void f(lib.zj.pdfeditor.PDFAlert r12) {
            /*
                r11 = this;
                lib.zj.pdfeditor.PDFAlert r12 = (lib.zj.pdfeditor.PDFAlert) r12
                if (r12 != 0) goto L6
                goto Laf
            L6:
                r0 = 3
                lib.zj.pdfeditor.PDFAlert$ButtonPressed[] r1 = new lib.zj.pdfeditor.PDFAlert.ButtonPressed[r0]
                r2 = 0
                r3 = r2
            Lb:
                if (r3 >= r0) goto L14
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r4 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.None
                r1[r3] = r4
                int r3 = r3 + 1
                goto Lb
            L14:
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.f1 r3 = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.f1
                r3.<init>(r11, r12, r1)
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity r4 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.this
                android.app.AlertDialog$Builder r5 = r4.f24492l0
                android.app.AlertDialog r5 = r5.create()
                r4.f24498o0 = r5
                java.lang.String r6 = r12.f21161d
                r5.setTitle(r6)
                android.app.AlertDialog r5 = r4.f24498o0
                java.lang.String r6 = r12.f21159a
                r5.setMessage(r6)
                int[] r5 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.w.f24552a
                lib.zj.pdfeditor.PDFAlert$IconType r6 = r12.f21160b
                int r6 = r6.ordinal()
                r5 = r5[r6]
                int[] r5 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.w.f24553b
                lib.zj.pdfeditor.PDFAlert$ButtonGroupType r6 = r12.c
                int r6 = r6.ordinal()
                r5 = r5[r6]
                r6 = 1
                r7 = 2131952500(0x7f130374, float:1.9541445E38)
                r8 = -2
                r9 = -1
                if (r5 == r6) goto L83
                r10 = 2
                if (r5 == r10) goto L90
                if (r5 == r0) goto L54
                r0 = 4
                if (r5 == r0) goto L62
                goto La0
            L54:
                android.app.AlertDialog r0 = r4.f24498o0
                r5 = -3
                java.lang.String r7 = r4.getString(r7)
                r0.setButton(r5, r7, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Cancel
                r1[r10] = r0
            L62:
                android.app.AlertDialog r0 = r4.f24498o0
                r5 = 2131953056(0x7f1305a0, float:1.9542572E38)
                java.lang.String r5 = r4.getString(r5)
                r0.setButton(r9, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Yes
                r1[r2] = r0
                android.app.AlertDialog r0 = r4.f24498o0
                r2 = 2131952320(0x7f1302c0, float:1.954108E38)
                java.lang.String r2 = r4.getString(r2)
                r0.setButton(r8, r2, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.No
                r1[r6] = r0
                goto La0
            L83:
                android.app.AlertDialog r0 = r4.f24498o0
                java.lang.String r5 = r4.getString(r7)
                r0.setButton(r8, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Cancel
                r1[r6] = r0
            L90:
                android.app.AlertDialog r0 = r4.f24498o0
                r5 = 2131952359(0x7f1302e7, float:1.9541159E38)
                java.lang.String r5 = r4.getString(r5)
                r0.setButton(r9, r5, r3)
                lib.zj.pdfeditor.PDFAlert$ButtonPressed r0 = lib.zj.pdfeditor.PDFAlert.ButtonPressed.Ok
                r1[r2] = r0
            La0:
                android.app.AlertDialog r0 = r4.f24498o0
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.g1 r1 = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.g1
                r1.<init>(r11, r12)
                r0.setOnCancelListener(r1)
                android.app.AlertDialog r12 = r4.f24498o0
                r4.W1(r12)
            Laf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.s.f(java.lang.Object):void");
        }
    }

    /* loaded from: classes3.dex */
    public class t extends AnimatorListenerAdapter {
        public t() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ReaderAIPreviewActivity.this.f24489j1.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    public class u implements Runnable {

        /* loaded from: classes3.dex */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ReaderAIPreviewActivity.this.f24489j1.setVisibility(4);
            }
        }

        public u() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
            if (readerAIPreviewActivity.f24488j0 != null && readerAIPreviewActivity.f24489j1.getVisibility() == 0) {
                if (readerAIPreviewActivity.f24488j0.getVisibility() == 0) {
                    readerAIPreviewActivity.I2(true);
                    return;
                }
                readerAIPreviewActivity.f24489j1.setAlpha(1.0f);
                readerAIPreviewActivity.f24489j1.animate().alpha(0.0f).setDuration(500L).setListener(new a()).start();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderAIPreviewActivity.l2(ReaderAIPreviewActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class w {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24552a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f24553b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[TopBarMode.values().length];
            c = iArr;
            try {
                iArr[TopBarMode.Annot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[TopBarMode.Delete.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PDFAlert.ButtonGroupType.values().length];
            f24553b = iArr2;
            try {
                iArr2[PDFAlert.ButtonGroupType.OkCancel.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24553b[PDFAlert.ButtonGroupType.Ok.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24553b[PDFAlert.ButtonGroupType.YesNoCancel.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24553b[PDFAlert.ButtonGroupType.YesNo.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PDFAlert.IconType.values().length];
            f24552a = iArr3;
            try {
                iArr3[PDFAlert.IconType.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24552a[PDFAlert.IconType.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24552a[PDFAlert.IconType.Question.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24552a[PDFAlert.IconType.Status.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class x implements androidx.lifecycle.x<nl.g> {
        public x() {
        }

        @Override // androidx.lifecycle.x
        public final void m(nl.g gVar) {
            nl.g gVar2 = gVar;
            if (gVar2 != null) {
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                if (!gVar2.f22606b.equals(readerAIPreviewActivity.f24505s0) && !readerAIPreviewActivity.D2()) {
                    readerAIPreviewActivity.t2();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class y implements x0.u {
        public y() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
            r8 = r8.getDisplayCutout();
         */
        @Override // x0.u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final x0.s0 m(android.view.View r8, x0.s0 r9) {
            /*
                r7 = this;
                r0 = 7
                o0.b r0 = r9.a(r0)
                r1 = 2
                r9.a(r1)
                int r1 = r0.f22639a
                java.util.concurrent.ExecutorService r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.f24476z1
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.this
                boolean r3 = r2.f19294h
                int r4 = r0.f22641d
                r5 = 0
                if (r3 == 0) goto L18
                r3 = r5
                goto L19
            L18:
                r3 = r4
            L19:
                int r6 = r0.c
                r8.setPadding(r1, r5, r6, r3)
                boolean r8 = r2.hasWindowFocus()
                int r0 = r0.f22640b
                if (r8 != 0) goto L29
                if (r0 != 0) goto L29
                return r9
            L29:
                android.widget.FrameLayout r8 = r2.F0
                if (r8 == 0) goto L37
                if (r0 <= 0) goto L30
                goto L34
            L30:
                int r0 = r8.getPaddingTop()
            L34:
                r8.setPadding(r5, r0, r5, r4)
            L37:
                android.view.View r8 = r2.f24484g0
                if (r8 == 0) goto L99
                int r8 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r8 < r0) goto L99
                android.view.Window r8 = r2.getWindow()
                if (r8 == 0) goto L99
                android.view.View r8 = r8.getDecorView()
                android.view.WindowInsets r8 = r8.getRootWindowInsets()
                if (r8 != 0) goto L52
                goto L99
            L52:
                android.view.DisplayCutout r8 = androidx.window.layout.e.f(r8)
                if (r8 != 0) goto L59
                goto L99
            L59:
                android.view.ViewGroup r0 = r2.f24489j1
                if (r0 == 0) goto L99
                int r0 = r2.getRequestedOrientation()
                r1 = 1
                if (r0 != r1) goto L94
                boolean r0 = r2.f24485h0
                if (r0 != 0) goto L94
                boolean r0 = pdf.pdfreader.viewer.editor.free.utils.a0.i(r2)
                if (r0 != 0) goto L94
                android.view.ViewGroup r0 = r2.f24489j1
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                int r1 = r0.getMarginStart()
                int r0 = r0.topMargin
                int r3 = androidx.window.layout.f.c(r8)
                int r8 = androidx.window.layout.e.b(r8)
                int r3 = r3 - r0
                int r8 = r8 - r1
                android.view.ViewGroup r0 = r2.f24489j1
                int r8 = java.lang.Math.max(r8, r5)
                int r1 = java.lang.Math.max(r3, r5)
                r0.setPadding(r8, r1, r5, r5)
                goto L99
            L94:
                android.view.ViewGroup r8 = r2.f24489j1
                r8.setPadding(r5, r5, r5, r5)
            L99:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.y.m(android.view.View, x0.s0):x0.s0");
        }
    }

    /* loaded from: classes3.dex */
    public class z implements androidx.lifecycle.x<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bundle f24556a;

        public z(Bundle bundle) {
            this.f24556a = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null) {
                ea.a.p("BHAdYTRoC28pZA9uU0YlYV9tN250", "1HWqGGOP");
                ea.a.p("QHAnYQBoN0khdFV0DCA4dShs", "9NHSsXDu");
                return;
            }
            ea.a.p("HHBdYQpoe287ZCNuEkYaYVJtC250", "RfWOplze");
            ea.a.p("QHAnYQBoN0khdFV0DCA=", "uOKJ0zHc");
            if (!bool2.booleanValue()) {
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                readerAIPreviewActivity.F0.setVisibility(8);
                Bundle bundle = this.f24556a;
                if (!readerAIPreviewActivity.q2(bundle) && !readerAIPreviewActivity.p2(bundle)) {
                    readerAIPreviewActivity.z2(bundle);
                }
                if (ea.a.p("CFJ2TQtUC0kaRA==", "qeN9TCGM").equals(readerAIPreviewActivity.S)) {
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerAIPreviewActivity);
                }
            }
        }
    }

    static {
        ea.a.p("HWVQZBxydkkKci92HGUfQVZ0B3YsdHk=", "JBO1VXhj");
        f24476z1 = Executors.newSingleThreadExecutor();
    }

    public static void l2(ReaderAIPreviewActivity readerAIPreviewActivity) {
        ConstraintLayout constraintLayout = readerAIPreviewActivity.f24502q0;
        if (constraintLayout != null && constraintLayout.getVisibility() != 8) {
            readerAIPreviewActivity.I2(true);
            readerAIPreviewActivity.f24502q0.setAlpha(1.0f);
            readerAIPreviewActivity.f24502q0.animate().alpha(0.0f).setDuration(100L).setListener(new l1(readerAIPreviewActivity)).start();
        }
    }

    public static void m2(ReaderAIPreviewActivity readerAIPreviewActivity, int i10) {
        PageView pageView;
        b bVar = readerAIPreviewActivity.f24483f0;
        if (bVar == null) {
            pageView = null;
        } else {
            pageView = (PageView) bVar.getDisplayedView();
        }
        if (pageView != null && i10 >= 0) {
            pageView.i1(readerAIPreviewActivity, i10);
            return;
        }
        ea.a.p("QHQqcgdFGnQAYVd0PXgiICp1Xmwg", "cAOt503F");
        readerAIPreviewActivity.L.postDelayed(new h1(readerAIPreviewActivity, i10), 150L);
    }

    public void A2() {
        boolean z10;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.f24501p1.setLayoutManager(linearLayoutManager);
        ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(this, this.A0, true, new pdf.pdfreader.viewer.editor.free.thumb.adapter.b(this.C0, this.f24507t0), false, this);
        this.B0 = thumbnailAdapter;
        if (pdf.pdfreader.viewer.editor.free.utils.q0.l(this, 0, "pdf_inversion_type") == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        thumbnailAdapter.f26593r = !z10;
        this.f24501p1.setAdapter(this.B0);
        linearLayoutManager.B0(this.f24519z0);
        this.B0.h(this.f24519z0 + 1);
        this.f24501p1.setVisibility(0);
        this.f24504r1.setVisibility(0);
        if (!this.D0) {
            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("P2Rm", "nr2IlsFs"));
        }
    }

    @Override // jl.a.d
    public final void B(boolean z10) {
        j2 j2Var;
        t1.b(ea.a.p("HmU5dRVzQkMpbApCVWM8Og==", "J8lHp6Je") + z10);
        if (z10) {
            if (!isFinishing() && (j2Var = this.f19291e) != null && j2Var.isShowing()) {
                this.f19291e.dismiss();
            }
        } else if (this.f24501p1 != null) {
            J2();
        }
    }

    public final void B2() {
        this.M0.addListener(new m());
        this.M0.addUpdateListener(new n());
        this.M0.setInterpolator(new LinearInterpolator());
        this.M0.setDuration(200L);
    }

    @Override // qg.a
    public final boolean C() {
        return false;
    }

    @Override // jl.a
    public void C1() {
        this.E0 = (MagnifierContainer) findViewById(R.id.rootView);
        this.f24484g0 = getLayoutInflater().inflate(v2(), (ViewGroup) null);
    }

    public Boolean C2() {
        return Boolean.FALSE;
    }

    public final boolean D2() {
        if (!ea.a.p("dVIETSxUKkkgRA==", "MQuSuqYH").equals(this.S) && !ea.a.p("Q2EsZSx3C2QVZXQ=", "jG5Kuv8d").equals(this.S)) {
            return false;
        }
        return true;
    }

    @Override // qg.a
    public final void E(ij.f fVar) {
        this.f24509u0 = fVar;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_pdf_ai_container;
    }

    public final void E2() {
        if (!this.f24514w1) {
            t1.b(ea.a.p("B2UEZAByL0kYcgN2XWUgQVt0O3YgdE8gWS1cdDlpMGR4LUggA2kAaTtoRmFXdD52UXQrLGlqQ20EIBlvPGU=", "zXUeenrq"));
            this.f24514w1 = true;
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("JGgQclNFVnQhdHk=", "6bPy78WC"), this.f24477a0);
            startActivity(intent);
            overridePendingTransition(0, 0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void F2() {
        this.J = (ConstraintLayout) this.f24484g0.findViewById(R.id.rootView);
        RelativeLayout relativeLayout = (RelativeLayout) this.f24484g0.findViewById(R.id.top_ll);
        this.P = relativeLayout;
        relativeLayout.addOnLayoutChangeListener(new q());
        PdfReaderViewContainer pdfReaderViewContainer = (PdfReaderViewContainer) this.f24484g0.findViewById(R.id.pdfView);
        this.I = pdfReaderViewContainer;
        pdfReaderViewContainer.setPageParam(this.f24509u0);
        ((ConstraintLayout) this.f24484g0.findViewById(R.id.actionBarView)).setOnClickListener(this);
        this.f24487i1 = this.f24484g0.findViewById(R.id.viewStatusBarSpace);
        this.f24489j1 = (ViewGroup) this.f24484g0.findViewById(R.id.bgPageToast);
        ViewGroup viewGroup = (ViewGroup) this.f24484g0.findViewById(R.id.pageGotoLl);
        this.f24491k1 = viewGroup;
        viewGroup.setOnClickListener(this.f24510u1);
        Group group = (Group) this.f24484g0.findViewById(R.id.emptyGroup);
        this.f24495m1 = (ViewGroup) this.f24484g0.findViewById(R.id.ad_layout);
        this.f24497n1 = (ViewGroup) this.f24484g0.findViewById(R.id.bottomAdContainer);
        this.f24501p1 = (InterceptRecyclerView) this.f24484g0.findViewById(R.id.thumb_rv);
        this.f24504r1 = this.f24484g0.findViewById(R.id.thumb_dividing_line);
        this.q1 = this.f24484g0.findViewById(R.id.pageSlash);
        ((TextView) this.f24484g0.findViewById(R.id.fileNameTv)).setText(this.f24482e0);
        this.f24489j1.setVisibility(0);
        this.O = (FrameLayout) this.f24484g0.findViewById(R.id.slideContainer);
        ((ImageView) this.f24484g0.findViewById(R.id.backIv)).setOnClickListener(this);
        if (!isDestroyed() && !isFinishing()) {
            FrameLayout frameLayout = this.O;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            PDFScrollHandle pDFScrollHandle = this.f24493l1;
            if (pDFScrollHandle != null) {
                pDFScrollHandle.i();
            }
            Handler handler = this.M;
            u uVar = this.f24516x1;
            handler.removeCallbacks(uVar);
            handler.postDelayed(uVar, 2000L);
        }
        PDFScrollHandle pDFScrollHandle2 = (PDFScrollHandle) this.f24484g0.findViewById(R.id.scrollHandle);
        this.f24493l1 = pDFScrollHandle2;
        pDFScrollHandle2.setVisibility(0);
        this.f24488j0 = (TextView) this.f24484g0.findViewById(R.id.currentPageTv);
        this.f24490k0 = (TextView) this.f24484g0.findViewById(R.id.totalPageTv);
        InterceptTouchFrameLayout interceptTouchFrameLayout = (InterceptTouchFrameLayout) this.f24484g0.findViewById(R.id.intercept_fl);
        this.R = interceptTouchFrameLayout;
        interceptTouchFrameLayout.setTopTouchListener(new t5.e(11));
        ViewStub viewStub = (ViewStub) this.f24484g0.findViewById(R.id.reflow_continue_tip_vs);
        this.f24500p0 = (ViewStub) this.f24484g0.findViewById(R.id.preview_page_number_vs);
        ViewStub viewStub2 = (ViewStub) this.f24484g0.findViewById(R.id.toast_vs);
        N2();
        K2();
    }

    public void G2(Bundle bundle) {
        ReaderPDFCore readerPDFCore;
        if (bundle == null && this.f24479c0 != null) {
            TextUtils.equals(this.S, ea.a.p("P2FWZSZ3XmQ9ZXQ=", "6jpxORY6"));
        }
        ReaderPDFCore readerPDFCore2 = this.f24479c0;
        if (readerPDFCore2 != null && readerPDFCore2.needsPassword()) {
            if (!TextUtils.isEmpty(this.T) && (readerPDFCore = this.f24479c0) != null && readerPDFCore.authenticatePassword(this.T)) {
                s2(bundle);
                return;
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.v(this);
            this.K = vVar;
            vVar.f23532h = new d1(this, bundle);
            W1(vVar);
            return;
        }
        ReaderPDFCore readerPDFCore3 = this.f24479c0;
        if (readerPDFCore3 != null && readerPDFCore3.countPages() == 0) {
            this.f24479c0 = null;
        }
        if (this.f24479c0 == null) {
            M2();
            if (D2()) {
                tn.a.d(this, ea.a.p("RWkudw==", "6DKR20nh"), ea.a.p("M2kKdxZlRXIncg==", "oDEoI7FO"), ea.a.p("R2gichdfEmRm", "T9v5sca9"), false);
                return;
            } else {
                tn.a.d(this, ea.a.p("OWlUdw==", "cJnmhRx6"), ea.a.p("OWlUdyZlRXI1cg==", "zCPzWuVg"), ea.a.p("V2U4ayxwBmY=", "YalOfi9J"), false);
                return;
            }
        }
        ea.a.p("XG4IchZhFmVIIFdyDGEiZRFJ", "mcXaBKtv");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        s2(bundle);
        Uri uri = this.Q;
        y1(this);
        if (uri != null) {
            String decode = Uri.decode(uri.getEncodedPath());
            if (decode == null) {
                decode = uri.toString();
            }
            File file = new File(decode);
            if (file.exists() && !file.canWrite()) {
                this.f24513w0 = true;
                if (this.L == null) {
                    this.L = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
                }
            }
        }
    }

    public final void I2(boolean z10) {
        boolean z11;
        ViewGroup viewGroup = this.f24489j1;
        if (viewGroup != null) {
            if (z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (this.K0 || this.f24507t0 <= 1) {
                z11 = true;
            }
            if (!z11) {
                if (viewGroup.getVisibility() != 0) {
                    this.f24489j1.setAlpha(0.0f);
                    this.f24489j1.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
                    this.f24491k1.setVisibility(0);
                    this.f24488j0.setVisibility(0);
                    this.q1.setVisibility(0);
                    this.f24490k0.setVisibility(0);
                    this.f24489j1.setVisibility(0);
                    if (this.f24489j1.getMeasuredWidth() > 0 && this.f24491k1.getMeasuredHeight() > 0) {
                        this.f24488j0.measure(View.MeasureSpec.makeMeasureSpec(this.f24489j1.getMeasuredWidth(), SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(this.f24491k1.getMeasuredHeight(), SlideAtom.USES_MASTER_SLIDE_ID));
                        this.f24491k1.measure(View.MeasureSpec.makeMeasureSpec(this.f24489j1.getMeasuredWidth(), SlideAtom.USES_MASTER_SLIDE_ID), View.MeasureSpec.makeMeasureSpec(this.f24491k1.getMeasuredHeight(), 1073741824));
                        this.f24489j1.invalidate();
                        this.f24489j1.requestLayout();
                    }
                }
            } else if (viewGroup.getVisibility() != 4) {
                this.f24491k1.setVisibility(8);
                this.f24489j1.setAlpha(1.0f);
                this.f24489j1.animate().alpha(0.0f).setDuration(500L).setListener(new t()).start();
            }
        }
    }

    public void J2() {
        int visibility = this.f24501p1.getVisibility();
        this.f24501p1.setVisibility(0);
        if (this.f24504r1 != null) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                this.f24504r1.setVisibility(8);
            } else {
                this.f24504r1.setVisibility(0);
            }
        }
        if (visibility != 0) {
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.f(this.J);
            if (ReaderView.f21378z0 && ReaderView.B0) {
                aVar.h(R.id.intercept_fl, 4, 0, 4);
            } else {
                aVar.h(R.id.intercept_fl, 4, R.id.thumb_rv, 3);
            }
            aVar.b(this.J);
        }
        ThumbnailAdapter thumbnailAdapter = this.B0;
        if (thumbnailAdapter != null) {
            thumbnailAdapter.notifyDataSetChanged();
        }
    }

    public void K2() {
        if (this.f24508t1 == 0 || this.f24506s1 == 0) {
            this.f24506s1 = getResources().getDimensionPixelSize(R.dimen.dp_6);
            this.f24508t1 = getResources().getDimensionPixelSize(R.dimen.dp_77);
        }
        if (this.O != null && this.J != null) {
            androidx.constraintlayout.widget.a aVar = new androidx.constraintlayout.widget.a();
            aVar.f(this.J);
            aVar.h(R.id.slideContainer, 4, R.id.thumb_rv, 3);
            if (ReaderView.f21378z0) {
                aVar.s(7, 0);
                if (this.f24485h0) {
                    aVar.s(4, this.f24508t1);
                } else {
                    aVar.s(4, this.f24506s1);
                }
            } else {
                aVar.s(4, 0);
                if (this.f24485h0) {
                    aVar.s(7, this.f24508t1);
                } else {
                    aVar.s(7, this.f24506s1);
                }
            }
            if (ReaderView.f21378z0 && ReaderView.B0) {
                aVar.h(R.id.intercept_fl, 4, 0, 4);
            } else {
                aVar.h(R.id.intercept_fl, 4, R.id.thumb_rv, 3);
            }
            aVar.b(this.J);
        }
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new b0());
    }

    public void L2() {
        if (this.P != null && this.f24501p1 != null && !this.f24485h0) {
            if (this.M0 == null) {
                this.M0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                B2();
            }
            if (this.N0 == null) {
                this.N0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                y2();
            }
            ValueAnimator valueAnimator = this.M0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.N0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                if (this.f24480c1 == null) {
                    this.f24480c1 = u2();
                }
            } else {
                this.f24480c1 = null;
            }
            this.O0 = this.P.getHeight();
            this.P0 = getResources().getDimensionPixelSize(R.dimen.dp_90);
            this.f24485h0 = true;
            this.M0.reverse();
            this.N0.reverse();
        }
    }

    public final void M2() {
        Resources resources = getResources();
        i3 i3Var = new i3(this, resources.getString(R.string.arg_res_0x7f130391), resources.getString(R.string.arg_res_0x7f130390), null);
        i3Var.setCanceledOnTouchOutside(false);
        i3Var.setCancelable(true);
        i3Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.c1
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ReaderAIPreviewActivity readerAIPreviewActivity = ReaderAIPreviewActivity.this;
                readerAIPreviewActivity.M.postDelayed(new g0(readerAIPreviewActivity, 2), 150L);
            }
        });
        W1(i3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:3:0x0003, B:5:0x000b, B:10:0x0013, B:12:0x001a), top: B:17:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N2() {
        /*
            r2 = this;
            r0 = 2131099813(0x7f0600a5, float:1.781199E38)
            int r0 = androidx.core.content.a.getColor(r2, r0)     // Catch: java.lang.Exception -> L2a
            boolean r1 = r2.X     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L12
            boolean r1 = r2.f19294h     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L10
            goto L12
        L10:
            r1 = 0
            goto L13
        L12:
            r1 = 1
        L13:
            pdf.pdfreader.viewer.editor.free.utils.h1.g(r2, r0, r1)     // Catch: java.lang.Exception -> L2a
            android.view.View r0 = r2.f24487i1     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L2e
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch: java.lang.Exception -> L2a
            int r1 = pdf.pdfreader.viewer.editor.free.utils.t0.U(r2)     // Catch: java.lang.Exception -> L2a
            r0.height = r1     // Catch: java.lang.Exception -> L2a
            android.view.View r1 = r2.f24487i1     // Catch: java.lang.Exception -> L2a
            r1.setLayoutParams(r0)     // Catch: java.lang.Exception -> L2a
            goto L2e
        L2a:
            r0 = move-exception
            r0.printStackTrace()
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.N2():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (str.equals(ea.a.p("ckMfSTxOPUUqVGZBKlQJVBxUbUUIRA==", "s6R5PKRx"))) {
            int intExtra = intent.getIntExtra(ea.a.p("R3g_Uxp6ZQ==", "zsxki5LX"), 0);
            ea.a.p("p6eS5ueQ0LvJ5tScIA==", "2ljm2lee");
            int intExtra2 = intent.getIntExtra(ea.a.p("P2FWZTd1bQ==", "tN3gZzlN"), 0);
            if (this.U == null) {
                this.U = new SparseIntArray();
            }
            this.U.put(intExtra2, intExtra);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public void finish() {
        b bVar = this.f24483f0;
        if (bVar != null) {
            bVar.f();
            this.f24483f0.setOnPageOperateListener(null);
            this.f24483f0.setOnPageScrollListener(null);
            this.f24483f0.setOnReflowStateChangeListener(null);
            this.f24483f0.setOnPageOrientationChangeListener(null);
        }
        ReaderPDFCore readerPDFCore = this.f24479c0;
        if (readerPDFCore != null) {
            readerPDFCore.abort();
        }
        if (TextUtils.equals(this.S, ea.a.p("dVIETSxULU8-Uw==", "b2RV85EP")) && this.W) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "ko8NXZu5"), true);
            startActivity(intent);
        }
        t1.b(ea.a.p("PWVVIAlyWGcoZTlzTyAYclB2B2UyIANpIWkyaA==", "scxVOAWh"));
        this.M.removeCallbacksAndMessages(null);
        super.finish();
    }

    @Override // qg.a
    public final void h(String str) {
        Drawable drawable;
        if (!TextUtils.equals(str, getString(R.string.arg_res_0x7f13036a)) && !TextUtils.equals(str, getString(R.string.arg_res_0x7f1303e5))) {
            drawable = null;
        } else {
            drawable = androidx.core.content.a.getDrawable(this, R.drawable.ic_copy_success);
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.e(this, str, false, drawable, w2());
    }

    public final void n2() {
        boolean z10;
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.f24499o1;
        if (sVar != null && sVar.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.X = z10;
        N2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.thumb.adapter.a
    public final void o1(int i10) {
        if (this.Z && !this.D0) {
            this.Z = false;
            pdf.pdfreader.viewer.editor.free.utils.p.v(this, ea.a.p("SWRm", "K19BXpLk"));
        }
        b bVar = this.f24483f0;
        if (bVar != null) {
            bVar.setDisplayedViewIndex(i10 - 1);
        }
        x2();
    }

    public final void o2() {
        if (this.f24495m1 != null && !this.L0 && getResources().getConfiguration().orientation == 1) {
            this.L0 = true;
            aj.b.I(this, this.f24495m1, ea.a.p("Q2Rm", "5LKEq7K6"));
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        b bVar;
        if (i10 != 0) {
            if (i10 == 1 && i11 == 0) {
                pdf.pdfreader.viewer.editor.free.utils.j1.e(this, getString(R.string.arg_res_0x7f130352), false, null, w2());
            }
        } else if (i11 >= 0 && (bVar = this.f24483f0) != null) {
            bVar.setDisplayedViewIndex(i11);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.H0;
        if (cVar != null && cVar.d()) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.b(this, "");
        t2();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y1(this);
        if (view.getId() == R.id.backIv) {
            onBackPressed();
        }
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != getResources().getConfiguration().orientation) {
            getResources().updateConfiguration(configuration, null);
        }
        pdf.pdfreader.viewer.editor.free.utils.a0.a(this, true);
        androidx.activity.f.q("GmUKZBJyOEkYcgN2XWUgQVt0O3YgdE9vGkMebjdpJXU6YR9pGG46aCluAWVk", "deHkwyuq", dp.a.a());
        int i10 = this.I0;
        int i11 = configuration.orientation;
        if (i10 != i11) {
            this.I0 = i11;
            View view = this.f24487i1;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
                this.f24487i1.setLayoutParams(layoutParams);
            }
            P1();
        }
        if (configuration.orientation == 1) {
            o2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e7, code lost:
        if (getSupportFragmentManager().D(ea.a.p("YHAnYQBoLm8TZF1uDkYkYSNtV250", "ddLZeS0F")) != null) goto L24;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    @android.annotation.SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.onCreate(android.os.Bundle):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onDestroy() {
        ThumbLoadCenter thumbLoadCenter = this.A0;
        thumbLoadCenter.e(null);
        thumbLoadCenter.f();
        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new k());
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.Y);
        t1.b(ea.a.p("MGUEZFFyJEkYcgN2XWUgQVt0O3YgdE8gG241ZSJ0MG95", "l9be4e1C"));
        s sVar = this.f24496n0;
        if (sVar != null) {
            sVar.a();
            this.f24496n0 = null;
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.v vVar = this.K;
        if (vVar != null && vVar.isShowing()) {
            this.K.cancel();
        }
        AlertDialog alertDialog = this.f24498o0;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f24498o0.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar2 = this.f24499o1;
        if (sVar2 != null && sVar2.isShowing()) {
            this.f24499o1.cancel();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.R;
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.setTopTouchListener(null);
        }
        pdf.pdfreader.viewer.editor.free.utils.g1<ReaderAIPreviewActivity> g1Var = this.L;
        if (g1Var != null) {
            g1Var.removeCallbacksAndMessages(null);
        }
        if (this.N != null) {
            p1.a.a(this).d(this.N);
        }
        ReaderPdfApplication.k().f28148e.i(this.f24511v0);
        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new l());
        lib.zj.pdfeditor.a.a();
        super.onDestroy();
        ea.a.p("XG4PZQB0EG8LOiA=", "qHt183GS");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        wn.c cVar = this.f24515x0;
        if (cVar != null && cVar.c) {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("RWkudw==", "hUX3awIG");
            String p11 = ea.a.p("RWkudyx0C21l", "YHnn66au");
            tn.a.d(m10, p10, p11, ea.a.p("Q2QtXw==", "C0UjCijX") + this.f24515x0.a(), false);
        }
        a.C0318a.f23099a.f23098a.clear();
        lib.zj.pdfeditor.i iVar = i.a.f21508a;
        iVar.f21505a.clear();
        iVar.f21506b.clear();
        iVar.f21507d = false;
        iVar.c = 1;
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onOperatePdfStart(qo.i iVar) {
        onBackPressed();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        hp.e eVar;
        t1.b(ea.a.p("ZWVTZA9ydUkYcgN2XWUgQVt0O3YgdE8gG24hYSRzZQ==", "Q472j4jn"));
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.H0;
        if (cVar != null && !cVar.d() && (eVar = this.V) != null) {
            eVar.d();
        }
        super.onPause();
        wn.c cVar2 = this.f24515x0;
        if (cVar2 != null) {
            cVar2.b();
        }
        gl.o.f17931a.getClass();
        gl.p.f17933p.l();
        gl.q.f17934p.l();
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f24477a0 = (PdfPreviewEntity) bundle.getSerializable(ea.a.p("Vm4_aQd5", "2MeaWpmg"));
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public void onResume() {
        hp.e eVar;
        t1.b(ea.a.p("YWUqZBZyI0kiclF2AGUhQSd0W3YvdDogIW5jZQl1CmU=", "N1zgMazM"));
        AppOpenManager.c().f23907g = true;
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.H0;
        if (cVar != null && !cVar.d() && (eVar = this.V) != null) {
            eVar.c();
        }
        super.onResume();
        androidx.activity.s.A0(this);
        aj.b.j(this, this.f24495m1, ea.a.p("P2Rm", "VmoIjkwX"), this.Y);
        aj.b.L();
        if (this.f24512v1) {
            this.f24512v1 = false;
            new Handler().postDelayed(new o0(this, 4), 10L);
            return;
        }
        wn.c cVar2 = this.f24515x0;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Handler handler;
        try {
            bundle.putSerializable(ea.a.p("Km5FaQ15", "APjzgcCi"), this.f24477a0);
            bundle.putString(ea.a.p("VXIkbQ==", "E7v7yR5n"), this.S);
            bundle.putParcelable(ea.a.p("RnJp", "bak87j8r"), this.Q);
            bundle.putString(ea.a.p("GGE0cwZvJWQ=", "iDhGqWNl"), this.T);
            bundle.putBoolean(ea.a.p("QWUqZApKF20CSFttDE84UiFzR21l", "5KenqvbR"), this.f24512v1);
            if (this.f24515x0 != null) {
                bundle.putLong(ea.a.p("BmUZZBZpOGU=", "sHtxBUYO"), this.f24515x0.f31395a);
                this.f24515x0.c = false;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (this.f24481d0 != null && this.f24483f0 != null) {
            bundle.putString(ea.a.p("dWknZT1hD2U=", "LEBc07Uu"), this.f24481d0);
        }
        if (this.f24486i0 == TopBarMode.Search) {
            bundle.putBoolean(ea.a.p("HGVQchpoem8-ZQ==", "F1OK4JAM"), true);
        }
        u uVar = this.f24516x1;
        if (uVar != null && (handler = this.M) != null) {
            handler.removeCallbacks(uVar);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        ReaderPDFCore readerPDFCore = this.f24479c0;
        if (readerPDFCore != null) {
            readerPDFCore.startAlerts();
            r2();
        }
        super.onStart();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStop() {
        if (this.f24479c0 != null) {
            this.f24494m0 = false;
            x1(this.f24498o0);
            this.f24498o0 = null;
            s sVar = this.f24496n0;
            if (sVar != null) {
                sVar.a();
                this.f24496n0 = null;
            }
            this.f24479c0.stopAlerts();
        }
        super.onStop();
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.H0;
        if (cVar != null) {
            cVar.e(z10);
            if (z10 && !this.H0.d()) {
                n2();
            }
        }
    }

    public final boolean p2(Bundle bundle) {
        Intent intent;
        Uri data;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || pdf.pdfreader.viewer.editor.free.utils.h1.c() || (intent = getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        }
        String decode = Uri.decode(data.getEncodedPath());
        ea.a.p("UGguYxhOB2UWUFFyBGklcy1vXCxmZipsLlArdAM9", "KJkI3106");
        if (!TextUtils.isEmpty(decode) && !decode.contains(getPackageName())) {
            ea.a.p("LGhUYxJOUmU-UC9yGGkbc1xvACxlbRBzNSALZR51EnM7UFRyFGlEczNvJCATaRpzdA==", "VmilAyow");
            R1(new a0(bundle));
            return true;
        }
        return false;
    }

    public final boolean q2(Bundle bundle) {
        ThirdOpenBean thirdOpenBean;
        Intent intent = getIntent();
        if (intent == null || (thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("WGUyXwdoC3IWX0doCHJl", "PEXPQB5e"))) == null) {
            return false;
        }
        ThirdOpenParseManager.f28764f.e(this, new c0(thirdOpenBean, intent, bundle));
        return true;
    }

    public final void r2() {
        this.f24494m0 = true;
        s sVar = this.f24496n0;
        if (sVar != null) {
            sVar.a();
            this.f24496n0 = null;
        }
        x1(this.f24498o0);
        this.f24498o0 = null;
        s sVar2 = new s();
        this.f24496n0 = sVar2;
        sVar2.d(new n1(0), new Void[0]);
    }

    public final void s2(Bundle bundle) {
        boolean z10;
        ReaderPDFCore readerPDFCore;
        PdfPreviewEntity pdfPreviewEntity;
        if (this.f24479c0 == null) {
            return;
        }
        if (pdf.pdfreader.viewer.editor.free.utils.q0.l(this, 0, "pdf_inversion_type") == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ReaderView.A0 = !z10;
        this.W = true;
        if (TextUtils.isEmpty(this.f24481d0)) {
            this.C0 = lo.d.e(this, String.valueOf(System.currentTimeMillis()));
        } else {
            this.C0 = lo.d.e(this, this.f24481d0);
        }
        this.A0.e(new k1(this));
        pdf.pdfreader.viewer.editor.free.utils.q0.t();
        wn.c cVar = this.f24515x0;
        if (cVar != null) {
            cVar.f31396b = true;
            cVar.c = true;
            cVar.c();
        }
        if (bundle == null) {
            wn.b.b();
        }
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        ig.h<Object> hVar = hVarArr[0];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32401e;
        if (!pdf.pdfreader.viewer.editor.free.utils.t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx2C2UFX0doBnc=", "OSOF39Cj"));
            aVar.c(hVarArr[0], Long.valueOf(System.currentTimeMillis()));
        }
        ea.a.p("O2VCdHQ=", "41wsZfNZ");
        ea.a.p("UHIuYQdlN0lIY1t1B3QGYSNlQSA=", "X0wasCby");
        this.f24479c0.countPages();
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        b bVar = new b(this);
        this.f24483f0 = bVar;
        bVar.setOnScrollListener(new c());
        this.f24483f0.setOnPageScrollListener(new d());
        this.f24483f0.setUnReDoStateListener(null);
        this.f24483f0.setUnReDoStateListener(this);
        this.f24483f0.setOnPageOperateListener(new e());
        this.f24483f0.setListener(new f());
        this.f24483f0.setAdapter(new PDFPageAdapter(this, this, this.f24479c0));
        F2();
        o9.d.s(ea.a.p("IGEAbgNydmQLbwh0Rm9s", "Ljbnf7yW"), ea.a.p("A2lscAtlTmktd0ZvWkMlZVl0NyAlb1dk", "qzbLy8qY"));
        o2();
        if (this.f24478b0 == null && (pdfPreviewEntity = this.f24477a0) != null) {
            this.f24478b0 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
        }
        if (this.f24477a0 != null && (readerPDFCore = this.f24479c0) != null && this.f24478b0 != null) {
            this.f24519z0 = 0;
            this.f24507t0 = readerPDFCore.countPages();
            this.f24483f0.setDisplayedViewIndex(this.f24519z0);
            this.f24478b0.f22594o = this.f24507t0;
        }
        ReaderPDFCore readerPDFCore2 = this.f24479c0;
        if (readerPDFCore2 != null) {
            int countPages = readerPDFCore2.countPages();
            this.f24507t0 = countPages;
            if (countPages <= 1) {
                I2(false);
                this.O.setVisibility(8);
            } else {
                this.f24490k0.setText(String.format(ea.a.p("anM=", "fBttm8lc"), Integer.valueOf(this.f24507t0)));
            }
        }
        this.f24493l1.setOnTouchListener(new g());
        b bVar2 = this.f24483f0;
        bVar2.f21418u = this.f24493l1;
        this.I.addView(bVar2, 0);
        this.G0.addView(this.f24484g0, -1, -1);
        this.F0.setVisibility(8);
        A2();
        if (this.f24479c0.fileFormat().equals(ea.a.p("dFAZTzxG", "0FrOvUi6"))) {
            this.f24483f0.setDisplayedViewIndex(getIntent().getIntExtra(ea.a.p("R3QPchxpK2cYYQFl", "Hy4nhETd"), 0));
        }
        this.L.postDelayed(new h(), 300L);
        this.L.postDelayed(new i(), 150L);
    }

    public void t2() {
        runOnUiThread(new androidx.appcompat.widget.y0(this, 27));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0 = r0.getDisplayCutout();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Point u2() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L46
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L46
            android.view.View r0 = r0.getDecorView()
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 != 0) goto L18
            return r2
        L18:
            android.view.DisplayCutout r0 = androidx.window.layout.e.f(r0)
            if (r0 != 0) goto L1f
            return r2
        L1f:
            android.view.ViewGroup r1 = r4.f24489j1
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.getMarginStart()
            int r1 = r1.topMargin
            int r3 = androidx.window.layout.f.c(r0)
            int r0 = androidx.window.layout.e.b(r0)
            int r3 = r3 - r1
            int r0 = r0 - r2
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            int r0 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r1.<init>(r0, r2)
            return r1
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity.u2():android.graphics.Point");
    }

    public int v2() {
        return R.layout.layout_pdf_view_editor2_ai;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (!z10) {
            t2();
        }
    }

    public final int w2() {
        PdfReaderViewContainer pdfReaderViewContainer = this.I;
        if (pdfReaderViewContainer == null) {
            return -1;
        }
        int[] iArr = new int[2];
        pdfReaderViewContainer.getLocationInWindow(iArr);
        int U = iArr[1] - pdf.pdfreader.viewer.editor.free.utils.t0.U(this);
        if (U < 0) {
            return -1;
        }
        return (int) (getResources().getDimension(R.dimen.dp_6) + U);
    }

    @Override // lib.zj.pdfeditor.d
    public final void x() {
        pdf.pdfreader.viewer.editor.free.utils.j1.e(this, ea.a.p("Hm85IEp1BnAncnQ=", "jYpM9vfJ"), false, null, w2());
    }

    public void x2() {
        if (this.P != null && this.f24501p1 != null && this.f24485h0) {
            if (this.M0 == null) {
                this.M0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                B2();
            }
            if (this.N0 == null) {
                this.N0 = ValueAnimator.ofFloat(0.0f, 1.0f);
                y2();
            }
            ValueAnimator valueAnimator = this.M0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                return;
            }
            ValueAnimator valueAnimator2 = this.N0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                return;
            }
            if (getRequestedOrientation() == 1 && !pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
                if (this.f24480c1 == null) {
                    this.f24480c1 = u2();
                }
            } else {
                this.f24480c1 = null;
            }
            this.O0 = this.P.getHeight();
            this.P0 = getResources().getDimensionPixelSize(R.dimen.dp_90);
            this.f24485h0 = false;
            this.M0.start();
            this.N0.start();
        }
    }

    public final void y2() {
        this.N0.addUpdateListener(new o());
        this.N0.addListener(new p());
        this.N0.setInterpolator(new LinearInterpolator());
        this.N0.setDuration(200L);
    }

    public final void z2(Bundle bundle) {
        long j10;
        int i10;
        PdfPreviewEntity pdfPreviewEntity;
        N2();
        this.L = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
        this.N = new ReaderActBroadCastReceiver<>(this);
        p1.a.a(this).b(this.N, new IntentFilter(ea.a.p("ckMfSTxOPUUqVGZBKlQJVBxUbUUIRA==", "FdUCF5EB")));
        this.f24492l0 = new AlertDialog.Builder(this);
        b.b.Z(this);
        ea.a.p("XG4IchZhFmUBYUJlDUk4czBhXGMjUzdhHWVYPV51BWwJIA==", "ie0ivFSN");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        String str2 = "";
        if (bundle != null) {
            this.f24477a0 = (PdfPreviewEntity) bundle.getSerializable(ea.a.p("Vm4_aQd5", "ftQHeyaG"));
            this.Q = (Uri) bundle.getParcelable(ea.a.p("RnJp", "NahWOmIZ"));
            this.T = bundle.getString(ea.a.p("M2EaczlvIGQ=", "l7CiNRfs"), "");
            j10 = bundle.getLong(ea.a.p("PWVQZC1pWmU=", "zs1FzwR6"));
            if (bundle.containsKey(ea.a.p("IWk9ZRxhBWU=", "nHgQRhmI"))) {
                this.f24481d0 = bundle.getString(ea.a.p("dWknZT1hD2U=", "SxX6mtnv"));
            }
        } else {
            j10 = 0;
        }
        this.f24515x0 = new wn.c(j10);
        wn.b.a(false, false);
        oj.e.f23109g = pdf.pdfreader.viewer.editor.free.utils.c1.B();
        ea.a.p("IG5ychxhQ2VgIA==", "8ulpzuNJ");
        if (this.f24479c0 == null) {
            Intent intent = getIntent();
            if (ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJHVc=", "Zdo8XZ6t").equals(intent.getAction())) {
                if (intent.getBooleanExtra(ea.a.p("WnMNchxtMmEGaA==", "ToS9DysV"), false)) {
                    U1();
                    String stringExtra = intent.getStringExtra(ea.a.p("KWldZSlhQ2g=", "uhwUlTJE"));
                    this.f24477a0 = new PdfPreviewEntity(new File(stringExtra));
                    if (!TextUtils.isEmpty(stringExtra)) {
                        pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.l(this, stringExtra, 2));
                    }
                } else {
                    this.f24477a0 = (PdfPreviewEntity) intent.getSerializableExtra(ea.a.p("QGgkdyxwBmY=", "5bCUynLh"));
                }
                if (this.f24478b0 == null && (pdfPreviewEntity = this.f24477a0) != null) {
                    this.f24478b0 = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
                }
                nl.b bVar = this.f24478b0;
                if (bVar != null && (i10 = bVar.f22593n) != -1) {
                    yn.a.h0(this, i10);
                    this.f24478b0.f22593n = -1;
                    this.f24477a0.setSize(new File(this.f24478b0.f22582b).length());
                    this.f24477a0.setRecent(1);
                    this.f24477a0.setRecentDate(System.currentTimeMillis());
                }
                ea.a.p("Vm4nclNhA2VyII-HuebBsN2-xeXBsFNuAGkFeQ==", "7n9d6wfr");
                String stringExtra2 = intent.getStringExtra(ea.a.p("Q2E4cwRvEGQ=", "SGIxoUo5"));
                this.T = stringExtra2;
                if (stringExtra2 == null) {
                    this.T = "";
                }
                if (this.Q == null) {
                    this.Q = intent.getData();
                }
                Uri uri = this.Q;
                if (uri != null && (str2 = Uri.decode(uri.getEncodedPath())) == null) {
                    t1.b(ea.a.p("IXICdiRlBCA4YRJoFHA2dFAgbz1pbkNsbA==", "q8QgMsyK"));
                    str2 = this.Q.toString();
                }
                lib.zj.pdfeditor.q0.f21567d = null;
                this.f24505s0 = str2;
                String p10 = pdf.pdfreader.viewer.editor.free.utils.v.p(str2);
                this.f24482e0 = p10;
                this.f24481d0 = pdf.pdfreader.viewer.editor.free.utils.v.r(p10);
                ReaderPdfApplication.k().f28148e.f(this.f24511v0);
                t1.b(ea.a.p("JEYYbAFOFG0tVw90XEUvdDo=", "2OIqdutf") + this.f24482e0 + ea.a.p("EyAmRhpsB04TbVE6", "adDSZJWF") + this.f24481d0);
                pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new m1(this, str2, bundle));
            } else {
                ea.a.p("XG4IchZhFmVIIFVjHWk5bqC4v-berzVpCXc=", "lj39ISOV");
            }
            ea.a.p("XG4IchZhFmVIIA==", "SxvuCoCf");
            return;
        }
        ea.a.p("XG4IchZhFmVSZVpkUyA=", "Sq9EK7SF");
        G2(bundle);
    }

    /* loaded from: classes3.dex */
    public class d implements qg.e {
        public d() {
        }

        @Override // qg.e
        public final void e() {
            b bVar = ReaderAIPreviewActivity.this.f24483f0;
            if (bVar != null) {
                bVar.W0();
            }
        }

        @Override // qg.e
        public final void a() {
        }

        @Override // qg.e
        public final void c() {
        }

        @Override // qg.e
        public final void d() {
        }

        @Override // qg.e
        public final void b(int i10) {
        }
    }

    /* loaded from: classes3.dex */
    public class e implements qg.c {
        public e() {
        }

        @Override // qg.c
        public final boolean isReadOnly() {
            return ReaderAIPreviewActivity.this.f24513w0;
        }

        @Override // qg.c
        public final void a() {
        }

        @Override // qg.c
        public final void b(int i10) {
        }
    }

    /* loaded from: classes3.dex */
    public class g implements jj.a {
        public g() {
        }

        @Override // jj.a
        public final void c() {
            b bVar = ReaderAIPreviewActivity.this.f24483f0;
            if (bVar != null) {
                for (Map.Entry<ij.d, View> entry : bVar.f21384d.entrySet()) {
                    if (entry.getKey().f18533a) {
                        ((lib.zj.pdfeditor.a0) entry.getValue()).m();
                    }
                }
            }
        }

        @Override // jj.a
        public final void a() {
        }

        @Override // jj.a
        public final void b() {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
    }

    @Override // jl.a
    public void K1() {
    }

    @Override // qg.a
    public final void Q0() {
    }

    @Override // qg.a
    public final void R() {
    }

    @Override // qg.i
    public final void U0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void k() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void n() {
    }

    /* loaded from: classes3.dex */
    public class p implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }
    }

    public void H2(Bundle bundle) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    public final void Q(Message message) {
    }

    @Override // qg.a
    public final void W(AnalyticsEvent analyticsEvent) {
    }

    @Override // qg.i
    public final void z0(boolean z10) {
    }

    @Override // qg.i
    public final void N0(int i10, boolean z10, boolean z11) {
    }

    @Override // qg.a
    public final void J0(lib.zj.pdfeditor.a0 a0Var, float f10, float f11, int i10) {
    }

    @Override // qg.a
    public final void j1(PageView pageView, int i10, PDFReaderView.Mode mode, MotionEvent motionEvent, boolean z10) {
    }
}
