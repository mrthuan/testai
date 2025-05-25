package pdf.pdfreader.viewer.editor.free.ui.act;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.ViewPager;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.tabs.TabLayout;
import com.lib.flutter.encrypt.EngineHelper;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import dl.a;
import industries.deepthought.decode.Decoder;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeCastException;
import org.greenrobot.eventbus.ThreadMode;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.base.a;
import pdf.pdfreader.viewer.editor.free.broadcast.TimeReceiver;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetEdit2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetEdit2PDFSmall;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetImg2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetImg2PDFSmall;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetPDFTools1;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetPDFTools2;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetScan2PDFLarge;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.APPWidgetScan2PDFSmall;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.utils.WidgetUpdateException;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.fnbridge.impl.NativeItemClickApiImpl;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingsActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.CreatePDFDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.h1;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.u2;
import pdf.pdfreader.viewer.editor.free.ui.feature.tools.ToolsNewFragment;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderViewPager;
import pdf.pdfreader.viewer.editor.free.ui.myview.TouchMonitorRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.vm.HomeViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.CreatePDFToolsGuideView;
import pdf.pdfreader.viewer.editor.free.ui.widget.behavior.HideBottomViewOnScrollBehavior;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver;
import pdf.pdfreader.viewer.editor.free.utils.a1;
import pdf.pdfreader.viewer.editor.free.utils.b1;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.g1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import x0.f0;

/* loaded from: classes3.dex */
public class ReaderHomeActivity extends jl.a implements View.OnClickListener, h1.a, ro.c, g1.a, a.b, ReaderActBroadCastReceiver.a, a.d, pdf.pdfreader.viewer.editor.free.fnbridge.a {
    public static String Y1;
    public static boolean Z1;

    /* renamed from: a2 */
    public static final String f26637a2;

    /* renamed from: b2 */
    public static final String f26638b2;

    /* renamed from: c2 */
    public static final String f26639c2;

    /* renamed from: d2 */
    public static final String f26640d2;

    /* renamed from: e2 */
    public static final String f26641e2;

    /* renamed from: f2 */
    public static final String f26642f2;

    /* renamed from: g2 */
    public static final String f26643g2;

    /* renamed from: h2 */
    public static boolean f26644h2;

    /* renamed from: i2 */
    public static final String f26645i2;

    /* renamed from: j2 */
    public static final String f26646j2;

    /* renamed from: k2 */
    public static final String f26647k2;

    /* renamed from: l2 */
    public static final String f26648l2;

    /* renamed from: m2 */
    public static final String f26649m2;

    /* renamed from: n2 */
    public static boolean f26650n2;

    /* renamed from: o2 */
    public static boolean f26651o2;

    /* renamed from: p2 */
    public static qo.g f26652p2;

    /* renamed from: q2 */
    public static final j f26653q2;

    /* renamed from: r2 */
    public static boolean f26654r2;

    /* renamed from: s2 */
    public static boolean f26655s2;

    /* renamed from: t2 */
    public static boolean f26656t2;
    public CoordinatorLayout A;
    public CollapsingToolbarLayout B;
    public ViewGroup C;
    public ImageView D;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.h D1;
    public View E;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c E0;
    public boolean E1;
    public View F;
    public AppBarLayout G;
    public ReaderViewPager H;
    public long H1;
    public CheckBox I;
    public PdfPreviewEntity I1;
    public LinearLayout J;
    public TextView K;
    public ToolsNewFragment L;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c L1;
    public pdf.pdfreader.viewer.editor.free.ui.frag.a M;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.d M1;
    public pdf.pdfreader.viewer.editor.free.utils.g1<ReaderHomeActivity> N;
    public ArrayList<pdf.pdfreader.viewer.editor.free.base.a> P;
    public ArrayList<String> Q;
    public ArrayList<Integer> R;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.h1 T;
    public TextView X;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r X1;
    public TextView Y;
    public TextView Z;

    /* renamed from: a0 */
    public TextView f26657a0;

    /* renamed from: b0 */
    public TextView f26658b0;

    /* renamed from: c0 */
    public LinearLayout f26659c0;

    /* renamed from: c1 */
    public HomeViewModel f26660c1;

    /* renamed from: d0 */
    public LinearLayout f26661d0;

    /* renamed from: e0 */
    public View f26662e0;

    /* renamed from: f0 */
    public View f26663f0;

    /* renamed from: g0 */
    public LinearLayout f26664g0;

    /* renamed from: h0 */
    public ReaderActBroadCastReceiver<ReaderHomeActivity> f26665h0;

    /* renamed from: i0 */
    public ConstraintLayout f26666i0;

    /* renamed from: j0 */
    public ImageView f26668j0;

    /* renamed from: k0 */
    public ImageView f26670k0;

    /* renamed from: k1 */
    public HashSet<String> f26671k1;

    /* renamed from: l0 */
    public ImageView f26672l0;

    /* renamed from: m0 */
    public ImageView f26674m0;

    /* renamed from: n0 */
    public AppCompatImageView f26676n0;

    /* renamed from: o0 */
    public LinearLayout f26678o0;

    /* renamed from: p0 */
    public FrameLayout f26680p0;

    /* renamed from: q0 */
    public TabLayout f26682q0;

    /* renamed from: r0 */
    public View f26683r0;

    /* renamed from: s0 */
    public TabLayout f26685s0;

    /* renamed from: t0 */
    public TextView f26688t0;

    /* renamed from: t1 */
    public pdf.pdfreader.viewer.editor.free.utils.a1 f26689t1;

    /* renamed from: u0 */
    public LinearLayout f26691u0;

    /* renamed from: v */
    public LinearLayout f26693v;

    /* renamed from: v0 */
    public ViewGroup f26694v0;

    /* renamed from: w */
    public LinearLayout f26696w;

    /* renamed from: w0 */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.w f26697w0;

    /* renamed from: w1 */
    public nl.e f26698w1;

    /* renamed from: x */
    public ViewGroup f26699x;

    /* renamed from: x0 */
    public CreatePDFDialog f26700x0;

    /* renamed from: y */
    public int f26702y;

    /* renamed from: y0 */
    public CreatePDFToolsGuideView f26703y0;

    /* renamed from: z */
    public TextView f26705z;

    /* renamed from: z0 */
    public View f26706z0;

    /* renamed from: t */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f f26687t = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f();

    /* renamed from: u */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f26690u = new pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b(this);
    public final Handler O = new Handler(Looper.getMainLooper());
    public final int[] S = {R.raw.anim_all_file_tab, R.raw.anim_recent_tab, R.raw.anim_bookmark_tab, R.raw.anim_tools_tab};
    public ArrayList<PdfPreviewEntity> U = new ArrayList<>(50);
    public final ArrayList<PdfPreviewEntity> V = new ArrayList<>(50);
    public boolean W = false;
    public int A0 = 200;
    public long B0 = 0;
    public boolean C0 = false;
    public boolean D0 = false;
    public boolean F0 = false;
    public boolean G0 = false;
    public boolean H0 = false;
    public boolean I0 = false;
    public boolean J0 = false;
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public boolean N0 = false;
    public int O0 = 0;
    public boolean P0 = false;

    /* renamed from: i1 */
    public boolean f26667i1 = false;

    /* renamed from: j1 */
    public final u f26669j1 = new u();

    /* renamed from: l1 */
    public final d0 f26673l1 = new d0();

    /* renamed from: m1 */
    public boolean f26675m1 = false;

    /* renamed from: n1 */
    public final h0 f26677n1 = new h0();

    /* renamed from: o1 */
    public final i0 f26679o1 = new i0();

    /* renamed from: p1 */
    public final j0 f26681p1 = new j0();
    public final a q1 = new a();

    /* renamed from: r1 */
    public boolean f26684r1 = false;

    /* renamed from: s1 */
    public boolean f26686s1 = true;

    /* renamed from: u1 */
    public int f26692u1 = 0;

    /* renamed from: v1 */
    public final AtomicBoolean f26695v1 = new AtomicBoolean(false);

    /* renamed from: x1 */
    public boolean f26701x1 = false;

    /* renamed from: y1 */
    public int f26704y1 = 0;

    /* renamed from: z1 */
    public boolean f26707z1 = false;
    public int A1 = 0;
    public int B1 = 0;
    public final w C1 = new w();
    public long F1 = 0;
    public boolean G1 = false;
    public boolean J1 = false;
    public String K1 = ea.a.p("BG83bHM=", "nbpXrqDD");
    public boolean N1 = false;
    public boolean O1 = false;
    public boolean P1 = false;
    public final pdf.pdfreader.viewer.editor.free.ui.act.r Q1 = new pdf.pdfreader.viewer.editor.free.ui.act.r(this, 0);
    public int R1 = -1;
    public boolean S1 = false;
    public final androidx.activity.result.c<String[]> T1 = registerForActivityResult(new j.b(), new androidx.appcompat.libconvert.helper.b(this, 12));
    public final androidx.activity.result.c<String[]> U1 = registerForActivityResult(new j.b(), new com.google.android.tools.d(this, 17));
    public boolean V1 = false;
    public int W1 = 0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
            ReaderHomeActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity.this.z2();
        }
    }

    /* loaded from: classes3.dex */
    public class a0 implements Runnable {
        public a0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qo.g gVar;
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (!readerHomeActivity.f19289b && !readerHomeActivity.isFinishing() && readerHomeActivity.M != null && (gVar = ReaderHomeActivity.f26652p2) != null) {
                readerHomeActivity.C0 = true;
                readerHomeActivity.J2(gVar);
            }
            ReaderHomeActivity.f26652p2 = null;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* loaded from: classes3.dex */
        public class a extends ge.a {
            public a() {
                b.this = r1;
            }

            @Override // ge.a, pdf.pdfreader.viewer.editor.free.data.c
            public final void b(List<PdfPreviewEntity> list) {
                b bVar = b.this;
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(ReaderHomeActivity.this)) {
                    return;
                }
                if (list != null) {
                    ReaderHomeActivity.this.V.clear();
                    ReaderHomeActivity.this.V.addAll(list);
                }
                if (ReaderHomeActivity.this.N.hasMessages(2)) {
                    ReaderHomeActivity.this.N.removeMessages(2);
                }
                ReaderHomeActivity.this.N.sendEmptyMessage(2);
            }
        }

        public b() {
            ReaderHomeActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ea.a.p("K29UZRRzKWEmIBV0VXIjIFRvM2RpYVpsMmkdZXM=", "CdC94J9V");
            boolean z10 = ReaderPdfApplication.f23856h;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (!z10 && !pdf.pdfreader.viewer.editor.free.utils.q0.f(readerHomeActivity, "key_118_is_first_load_file", true)) {
                FileRepository.C(readerHomeActivity, new a());
                return;
            }
            ReaderPdfApplication.f23856h = false;
            if (pdf.pdfreader.viewer.editor.free.utils.q0.f(readerHomeActivity, "key_118_is_first_load_file", true)) {
                pdf.pdfreader.viewer.editor.free.utils.q0.w(readerHomeActivity, "key_118_is_first_load_file", false);
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("VWk5cwdfEWMTbmtyCHRl", "8C5HQlwo"), ea.a.p("QGMqbixzFmEAdA==", "uRlJTR5i"));
                t1.b(ea.a.p("J29cZVlmXnIpdGpsGmEMIFhlCmkkUxFvFGVVc1Jhbg==", "Q23wfu1y"));
                readerHomeActivity.f26695v1.set(true);
                FileRepository.B(readerHomeActivity, new pdf.pdfreader.viewer.editor.free.ui.act.a0(readerHomeActivity, true));
                return;
            }
            t1.b(ea.a.p("W28mZVNiA2MZIFJvG2Uxcit1XGRmbSZkBWEZdDxyUCBAYypu", "lJS5beCv"));
            String str = ReaderHomeActivity.Y1;
            readerHomeActivity.getClass();
            FileRepository.B(readerHomeActivity, new pdf.pdfreader.viewer.editor.free.ui.act.a0(readerHomeActivity, false));
        }
    }

    /* loaded from: classes3.dex */
    public class b0 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            if (ReaderPdfApplication.f23855g) {
                ReaderPdfApplication.f23855g = false;
                ea.a.p("HWVQZBxyf283ZQtjAWkeaUF5TmgqbQAgV2g1YywgBnM4IEJ0GHJ0", "LhWA4PGv");
                return;
            }
            ea.a.p("GGU2ZBRyEW8lZSdjQGkhaUx5IA==", "ONJWqYVo");
            ea.a.p("J29cZVljX2U5a2pwBndIc1xsC24xbHk=", "ug8RCDcn");
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
            ReaderHomeActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            new n3(readerHomeActivity, readerHomeActivity.findViewById(R.id.tab_layout)).show();
        }
    }

    /* loaded from: classes3.dex */
    public class c0 implements cg.l<Boolean, tf.d> {

        /* renamed from: a */
        public final /* synthetic */ int f26713a;

        public c0(int i10) {
            ReaderHomeActivity.this = r1;
            this.f26713a = i10;
        }

        @Override // cg.l
        public final tf.d invoke(Boolean bool) {
            if (bool.booleanValue()) {
                int i10 = this.f26713a;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                readerHomeActivity.W1 = i10;
                readerHomeActivity.K2(true, false);
                return null;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public int f26715a = -1;

        public d() {
            ReaderHomeActivity.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            boolean z10;
            pdf.pdfreader.viewer.editor.free.ui.frag.n nVar;
            if (this.f26715a != view.getMeasuredHeight()) {
                this.f26715a = view.getMeasuredHeight();
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                if (!readerHomeActivity.N0 && !readerHomeActivity.M0 && view.getMeasuredHeight() <= readerHomeActivity.f26702y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                readerHomeActivity.f2(z10);
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                if (aVar != null && (nVar = aVar.f28003i0) != null) {
                    nVar.y0();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class d0 implements zn.a {
        public d0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // zn.a
        public final void a(PdfPreviewEntity pdfPreviewEntity) {
            boolean z10;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (readerHomeActivity.U.size() > 0) {
                Iterator<PdfPreviewEntity> it = readerHomeActivity.U.iterator();
                while (it.hasNext()) {
                    PdfPreviewEntity next = it.next();
                    if (next != null && next.getId() == pdfPreviewEntity.getId()) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            if (!z10) {
                readerHomeActivity.U.add(pdfPreviewEntity);
                FileRepository.c(pdfPreviewEntity);
                if (!readerHomeActivity.f19289b) {
                    pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                    if (aVar != null) {
                        aVar.I0(pdfPreviewEntity.getOtherStrOne());
                    }
                    readerHomeActivity.E2();
                    readerHomeActivity.N.sendEmptyMessageDelayed(5, 100L);
                    readerHomeActivity.p2();
                    return;
                }
                if (readerHomeActivity.f26671k1 == null) {
                    readerHomeActivity.f26671k1 = new HashSet<>();
                }
                readerHomeActivity.f26671k1.add(pdfPreviewEntity.getOtherStrOne());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements AppBarLayout.g {

        /* renamed from: a */
        public int f26718a;

        public e() {
            ReaderHomeActivity.this = r1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void a(AppBarLayout appBarLayout, int i10) {
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar;
            ViewGroup viewGroup;
            char c;
            pdf.pdfreader.viewer.editor.free.ui.frag.n nVar;
            int i11;
            ViewGroup viewGroup2;
            HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior;
            pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (!readerHomeActivity.N0 && mo.c.A0 != null && (aVar = readerHomeActivity.M) != null && (viewGroup = readerHomeActivity.f26699x) != null) {
                int i12 = i10 - this.f26718a;
                this.f26718a = i10;
                if (i12 > 0 && i10 > -100) {
                    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior2 = (HideBottomViewOnScrollBehavior) ((CoordinatorLayout.f) viewGroup.getLayoutParams()).f3487a;
                    if (hideBottomViewOnScrollBehavior2 != null) {
                        hideBottomViewOnScrollBehavior2.u((LinearLayout) readerHomeActivity.f26699x);
                        return;
                    }
                    return;
                }
                String str = aVar.f28014t0;
                boolean z10 = false;
                switch (str.hashCode()) {
                    case 64897:
                        if (str.equals(ea.a.p("ckxM", "0CwGWuZt"))) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 79058:
                        if (str.equals(ea.a.p("H0RG", "TWA8UQDs"))) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 79444:
                        if (str.equals(ea.a.p("Y1BU", "J0Kz0GEj"))) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2670346:
                        if (str.equals(ea.a.p("GE9jRA==", "dCTLgpCJ"))) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66411159:
                        if (str.equals(ea.a.p("dlgIRUw=", "SywLtAdb"))) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c != 4) {
                                    nVar = null;
                                } else {
                                    nVar = aVar.f28007m0;
                                }
                            } else {
                                nVar = aVar.f28006l0;
                            }
                        } else {
                            nVar = aVar.f28005k0;
                        }
                    } else {
                        nVar = aVar.f28004j0;
                    }
                } else {
                    nVar = aVar.f28003i0;
                }
                if (nVar != null && (dVar = nVar.E0) != null) {
                    i11 = dVar.getItemCount();
                } else {
                    i11 = 0;
                }
                if (i11 < mo.c.A0.x) {
                    readerHomeActivity.e2(false);
                    return;
                }
                if (!readerHomeActivity.N0 && !readerHomeActivity.M0 && readerHomeActivity.f26699x.getMeasuredHeight() <= readerHomeActivity.f26702y) {
                    z10 = true;
                }
                readerHomeActivity.e2(z10);
                if (i11 <= mo.c.A0.y && i12 < 0 && appBarLayout.getMeasuredHeight() - Math.abs(i10) < 100 && (viewGroup2 = readerHomeActivity.f26699x) != null && (hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) ((CoordinatorLayout.f) viewGroup2.getLayoutParams()).f3487a) != null) {
                    hideBottomViewOnScrollBehavior.t((LinearLayout) readerHomeActivity.f26699x);
                    return;
                }
                return;
            }
            this.f26718a = i10;
        }
    }

    /* loaded from: classes3.dex */
    public class e0 implements DialogInterface.OnDismissListener {
        public e0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            ReaderHomeActivity.this.L1 = null;
        }
    }

    /* loaded from: classes3.dex */
    public class f implements TouchMonitorRecyclerView.a {
        public f() {
            ReaderHomeActivity.this = r1;
        }
    }

    /* loaded from: classes3.dex */
    public class f0 implements b1.a {

        /* renamed from: a */
        public final /* synthetic */ pdf.pdfreader.viewer.editor.free.ui.dialog.d f26722a;

        public f0(pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar) {
            ReaderHomeActivity.this = r1;
            this.f26722a = dVar;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.b1.a
        public final void a(String str, PdfPreviewEntity pdfPreviewEntity) {
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.f26722a;
            if (dVar != null && dVar.isShowing() && readerHomeActivity.M1()) {
                dVar.cancel();
            }
            if (pdfPreviewEntity != null) {
                com.google.android.play.core.assetpacks.b1.Y();
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxmC2wXX1BvB2U=", "0K3xQTfG"));
                t1.b(ea.a.p("HWVQZBxyf283ZQtjAWkeaUF5TmgqbQAgQS1KdANpEWRiLRwgFm5naTlrH3IcUg1zQGwaICpuMXINbhRmBHIOZSsgQWENaBc9IA==", "MsYLlgkc") + str + ea.a.p("FmUIdFp0OiB1IA==", "x16f3CqV") + pdfPreviewEntity.getPath());
                String str2 = ReaderHomeActivity.Y1;
                readerHomeActivity.m2(pdfPreviewEntity);
                readerHomeActivity.D2(pdfPreviewEntity);
            } else {
                j1.a(readerHomeActivity, readerHomeActivity.getString(R.string.arg_res_0x7f1303c0));
                readerHomeActivity.J1 = false;
                AppOpenManager.c().f23907g = false;
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerHomeActivity)) {
                    if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                        if (1 == readerHomeActivity.f26692u1) {
                            readerHomeActivity.f26692u1 = 0;
                            tn.a.d(readerHomeActivity, ea.a.p("P2VDbRBzRGk1bhUxMQ==", "n1E3mUId"), ea.a.p("P2VDbRBzRGk1bhUxRF8Mb1tl", "wTk68MOK"), "", false);
                        }
                        t1.b(ea.a.p("W28mZVNyB2RSIBRwG281ZTdzf3MhIHIxRyAHc3BhQ2VjZTltGnMRaR1uFE06RwlTEE9gQQFFHFAiUiNff1J0TmdFRA==", "gn85A8mT"));
                        readerHomeActivity.O2(102, 0L);
                    } else {
                        t1.b(ea.a.p("J29cZVlyUmR6IGpwB28LZUZzI3MiIFQwEyAfcyxhFWUfZUNtEHNEaTVuak0mRzdTYU88QQJFOlB2UjtfI1IiThtFRA==", "mmoK3vdc"));
                        readerHomeActivity.O2(102, 0L);
                    }
                } else if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                    readerHomeActivity.f26692u1 = 0;
                    int i10 = readerHomeActivity.A1 + 1;
                    readerHomeActivity.A1 = i10;
                    if (i10 == 3) {
                        pdf.pdfreader.viewer.editor.free.utils.q0.x(readerHomeActivity, 1, ea.a.p("OmUTXyJvG18pbApvQ18nZUptDTEx", "uUQjLoIH"));
                        t1.b(ea.a.p("W28mZVNyB2RSIERyBmckZTdzEnA0byBlQXN_c1AgeTETICJzO2EUZTxPZGUbbT9zN2ldbmYycTIAIH9TcF8bVHxSCkc2XzJFIE1rRztBGFQBRA==", "227Hua5f"));
                        readerHomeActivity.O2(102, 0L);
                    }
                }
            }
            readerHomeActivity.H0 = false;
        }
    }

    /* loaded from: classes3.dex */
    public class g0 implements cg.l<Boolean, tf.d> {

        /* renamed from: a */
        public final /* synthetic */ boolean f26725a;

        public g0(boolean z10) {
            ReaderHomeActivity.this = r1;
            this.f26725a = z10;
        }

        @Override // cg.l
        public final tf.d invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (booleanValue) {
                if (this.f26725a) {
                    readerHomeActivity.W1 = 2;
                    pdf.pdfreader.viewer.editor.free.utils.r0.b(readerHomeActivity);
                    if (readerHomeActivity.f26689t1 == null) {
                        readerHomeActivity.f26689t1 = new pdf.pdfreader.viewer.editor.free.utils.a1(readerHomeActivity, ReaderHomeActivity.class, null);
                    }
                    pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = readerHomeActivity.f26689t1;
                    Activity activity = a1Var.f28536a;
                    if (com.google.android.play.core.assetpacks.c.W(activity)) {
                        a1Var.f28540f = false;
                        a1Var.c.execute(new a1.d(activity));
                    }
                } else {
                    readerHomeActivity.W1 = 1;
                    readerHomeActivity.O.post(new pdf.pdfreader.viewer.editor.free.ui.act.e0(readerHomeActivity, readerHomeActivity.R1));
                }
            } else {
                readerHomeActivity.R1 = -1;
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public class h0 implements com.lib.flutter.encrypt.e {
        public h0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmgqbQBCJnQYbxVCOG4hZUMgCmhYdw==", "BKFEIlxY");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            boolean z10 = true;
            readerHomeActivity.f26675m1 = true;
            if (readerHomeActivity.f26659c0 != null) {
                if (o9.d.c.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("K2VTdR5fX184XyhhG24Ncg==", "KfiNkggG"), "action_flutter_show_".concat(o9.d.f22759b));
                    tn.a.b(ReaderPdfApplication.m(), ea.a.p("K2VTdR5fX184XyhhG24Ncg==", "DDOCrOTI"), ea.a.p("LmNFaRZuaGY2dT50EHI3c11vGV8xbxFhbA==", "QwnKoBwR"));
                }
                gl.b bVar = gl.b.f17914a;
                LinearLayout linearLayout = readerHomeActivity.f26659c0;
                bVar.getClass();
                gl.b.c(str, linearLayout);
                gl.c.f17916o.d();
                gl.d.f17917o.d();
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.f26675m1 = false;
            LinearLayout linearLayout = readerHomeActivity.f26659c0;
            if (linearLayout != null && linearLayout.getChildCount() > 0 && (readerHomeActivity.f26659c0.getChildAt(0) instanceof BannerLoadingAnimation)) {
                readerHomeActivity.f26659c0.removeAllViews();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ImageView f26729a;

        /* renamed from: b */
        public final /* synthetic */ LottieAnimationView f26730b;

        public i(ImageView imageView, LottieAnimationView lottieAnimationView) {
            this.f26729a = imageView;
            this.f26730b = lottieAnimationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f26729a.setVisibility(0);
            this.f26730b.setVisibility(4);
        }
    }

    /* loaded from: classes3.dex */
    public class i0 implements com.lib.flutter.encrypt.e {
        public i0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            LinearLayout linearLayout;
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmgpbSZTVmE0QjFuPWVBIDhoHHc=", "5ZPSCZPR");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.f26675m1 = true;
            no.f.b(ReaderPdfApplication.m()).getClass();
            if (no.f.f()) {
                String a10 = bp.a.a(ReaderPdfApplication.m());
                if (TextUtils.equals(a10, ea.a.p("Qg==", "2x2Qsypd"))) {
                    View view = readerHomeActivity.f26662e0;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    linearLayout = readerHomeActivity.f26661d0;
                } else if (TextUtils.equals(a10, ea.a.p("Qw==", "BiH3wPN5"))) {
                    linearLayout = readerHomeActivity.f26659c0;
                } else {
                    linearLayout = readerHomeActivity.f26664g0;
                }
            } else {
                linearLayout = readerHomeActivity.f26664g0;
            }
            if (linearLayout != null) {
                gl.h.f17923a.getClass();
                gl.h.c(str, linearLayout);
                gl.i.f17925o.d();
                gl.j.f17926o.d();
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            LinearLayout linearLayout;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.f26675m1 = false;
            no.f.b(ReaderPdfApplication.m()).getClass();
            if (no.f.f()) {
                String a10 = bp.a.a(ReaderPdfApplication.m());
                if (TextUtils.equals(a10, ea.a.p("Qg==", "8bHPnOBn"))) {
                    View view = readerHomeActivity.f26662e0;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    linearLayout = readerHomeActivity.f26661d0;
                } else if (TextUtils.equals(a10, ea.a.p("Qw==", "fJYft8xU"))) {
                    linearLayout = readerHomeActivity.f26659c0;
                } else {
                    linearLayout = readerHomeActivity.f26664g0;
                }
            } else {
                linearLayout = readerHomeActivity.f26664g0;
            }
            if (linearLayout != null && linearLayout.getChildCount() > 0 && (linearLayout.getChildAt(0) instanceof BannerLoadingAnimation)) {
                linearLayout.removeAllViews();
                gl.h.f17923a.getClass();
                gl.h.a(linearLayout, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j extends pdf.pdfreader.viewer.editor.free.ads.k {
        @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
        public final void close() {
            if (ReaderHomeActivity.f26651o2) {
                ReaderHomeActivity.f26651o2 = false;
                Activity b10 = ReaderPdfApplication.b();
                if (b10 != null && !b10.isFinishing()) {
                    if (b10 instanceof ReaderHomeActivity) {
                        ((ReaderHomeActivity) b10).C2();
                        return;
                    }
                    Activity l10 = ReaderPdfApplication.l();
                    if (l10 != null && ReaderHomeActivity.f26652p2 != null) {
                        ea.a.p("R2U4dA==", "aUArBR4e");
                        ea.a.p("UHU5chZuFkERdF12AHQvIA==", "1anStNyK");
                        qo.g gVar = ReaderHomeActivity.f26652p2;
                        pdf.pdfreader.viewer.editor.free.utils.k0.g(l10, gVar.f29401a, gVar.f29402b, "");
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements View.OnTouchListener {
        public k() {
            ReaderHomeActivity.this = r1;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity.this.z2();
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public class k0 extends com.google.android.play.core.assetpacks.c {
        public k0() {
            ReaderHomeActivity.this = r1;
        }

        public final void X() {
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = ReaderHomeActivity.this.E0;
            if (cVar != null) {
                Boolean bool = Boolean.FALSE;
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i iVar = cVar.f27673g;
                iVar.f28987b = bool;
                iVar.c = false;
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i iVar2 = new pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i();
                androidx.lifecycle.w<po.b> wVar = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m;
                c.a.a(iVar2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public l() {
            ReaderHomeActivity.this = r1;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = readerHomeActivity.E0;
            if (cVar != null) {
                cVar.f27678l.a();
                c.a.a(readerHomeActivity.E0.f27678l);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l0 implements x0.u {
        public l0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // x0.u
        public final x0.s0 m(View view, x0.s0 s0Var) {
            int i10;
            int i11;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (!readerHomeActivity.hasWindowFocus()) {
                return s0Var;
            }
            o0.b a10 = s0Var.a(7);
            int i12 = a10.f22639a;
            String str = ReaderHomeActivity.Y1;
            if (readerHomeActivity.f19294h) {
                i10 = 0;
            } else {
                i10 = a10.f22641d;
            }
            view.setPadding(i12, 0, a10.c, i10);
            View view2 = readerHomeActivity.F;
            if (view2 != null && (i11 = a10.f22640b) > 0) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = i11;
                    view2.setLayoutParams(layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            return s0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class m implements View.OnLayoutChangeListener {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
                m.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view;
                m mVar = m.this;
                if (!ReaderHomeActivity.this.isFinishing() && (view = ReaderHomeActivity.this.E) != null) {
                    view.requestLayout();
                }
            }
        }

        public m() {
            ReaderHomeActivity.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height >= 0 && view.getMeasuredHeight() != layoutParams.height) {
                view.post(new a());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m0 implements Runnable {
        public m0() {
            ReaderHomeActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(readerHomeActivity)) {
                String[] strArr = pdf.pdfreader.viewer.editor.free.utils.a0.f28530a;
                try {
                    Intent intent = new Intent(ea.a.p("Um4vchxpBi4TcER3AGQxZTAuU2MyaSxuY0FgUARJDUd2VBRVI0QjVEU=", "M0SI4nJu"));
                    ComponentName componentName = new ComponentName(readerHomeActivity, APPWidgetPDFTools1.class);
                    int[] appWidgetIds = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName);
                    intent.setComponent(componentName);
                    intent.putExtra(ea.a.p("KHBBVxhkUWU8SQJz", "NnI1q6WX"), appWidgetIds);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName2 = new ComponentName(readerHomeActivity, APPWidgetPDFTools2.class);
                    int[] appWidgetIds2 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName2);
                    intent.setComponent(componentName2);
                    intent.putExtra(ea.a.p("LnBBVxBkUGUuSS5z", "iucFwuod"), appWidgetIds2);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName3 = new ComponentName(readerHomeActivity, APPWidgetEdit2PDFLarge.class);
                    int[] appWidgetIds3 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName3);
                    intent.setComponent(componentName3);
                    intent.putExtra(ea.a.p("UnA7VxpkBWUGSVBz", "0lleyJKe"), appWidgetIds3);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName4 = new ComponentName(readerHomeActivity, APPWidgetEdit2PDFSmall.class);
                    int[] appWidgetIds4 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName4);
                    intent.setComponent(componentName4);
                    intent.putExtra(ea.a.p("UnA7VxpkBWUGSVBz", "LQblWa3K"), appWidgetIds4);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName5 = new ComponentName(readerHomeActivity, APPWidgetImg2PDFLarge.class);
                    int[] appWidgetIds5 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName5);
                    intent.setComponent(componentName5);
                    intent.putExtra(ea.a.p("LnBBVxBkUGUuSS5z", "bEPGRAk3"), appWidgetIds5);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName6 = new ComponentName(readerHomeActivity, APPWidgetImg2PDFSmall.class);
                    int[] appWidgetIds6 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName6);
                    intent.setComponent(componentName6);
                    intent.putExtra(ea.a.p("LnBBVxBkUGUuSS5z", "wkG8cdFU"), appWidgetIds6);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName7 = new ComponentName(readerHomeActivity, APPWidgetScan2PDFLarge.class);
                    int[] appWidgetIds7 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName7);
                    intent.setComponent(componentName7);
                    intent.putExtra(ea.a.p("LnBBVxBkUGUuSS5z", "kLRkVUVW"), appWidgetIds7);
                    readerHomeActivity.sendBroadcast(intent);
                    ComponentName componentName8 = new ComponentName(readerHomeActivity, APPWidgetScan2PDFSmall.class);
                    int[] appWidgetIds8 = AppWidgetManager.getInstance(readerHomeActivity).getAppWidgetIds(componentName8);
                    intent.setComponent(componentName8);
                    intent.putExtra(ea.a.p("LnBBVxBkUGUuSS5z", "fj2cm1rY"), appWidgetIds8);
                    readerHomeActivity.sendBroadcast(intent);
                } catch (Exception e10) {
                    dp.a a10 = dp.a.a();
                    WidgetUpdateException widgetUpdateException = new WidgetUpdateException(e10);
                    a10.getClass();
                    dp.a.e(widgetUpdateException);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n extends pdf.pdfreader.viewer.editor.free.utils.l0 {

        /* loaded from: classes3.dex */
        public class a implements DialogInterface.OnDismissListener {
            public a() {
                n.this = r1;
            }

            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.y2();
            }
        }

        public n() {
            ReaderHomeActivity.this = r1;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = readerHomeActivity.E0;
            if (cVar != null) {
                cVar.f27678l.a();
            }
            if (readerHomeActivity.f26700x0 == null) {
                readerHomeActivity.f26700x0 = new CreatePDFDialog(readerHomeActivity);
            }
            readerHomeActivity.f26700x0.setOnDismissListener(new a());
            tn.a.b(readerHomeActivity, ea.a.p("J29cZQ==", "Ae2tDWxj"), ea.a.p("J29cZSZ0WG82cxVjGWkLa2pjAXUrdA==", "gLQZpUDC"));
            readerHomeActivity.W1(readerHomeActivity.f26700x0);
        }
    }

    /* loaded from: classes3.dex */
    public class o implements androidx.lifecycle.x<nl.g> {
        @Override // androidx.lifecycle.x
        public final void m(nl.g gVar) {
            if (gVar != null) {
                ReaderPdfApplication.k().g(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p implements androidx.lifecycle.x<to.a> {
        public p() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(to.a aVar) {
            boolean z10;
            int i10;
            String str;
            to.a aVar2 = aVar;
            if (aVar2 != null) {
                boolean z11 = aVar2.f30068a;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                if (z11 && !readerHomeActivity.N0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = readerHomeActivity.f26691u0;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                linearLayout.setVisibility(i10);
                TextView textView = (TextView) readerHomeActivity.f26691u0.findViewById(R.id.tvRecentAddedNewNum);
                if (textView != null) {
                    TextView textView2 = (TextView) readerHomeActivity.f26691u0.findViewById(R.id.tvRecentAdd);
                    if (textView2 != null) {
                        textView2.setText(R.string.arg_res_0x7f130419);
                    }
                    int i11 = aVar2.f30069b;
                    if (i11 > 0) {
                        if (i11 > 99) {
                            str = ea.a.p("dzkr", "QDNNxHzv");
                        } else {
                            str = ea.a.p("Kw==", "pWScaxxA") + i11;
                        }
                        textView.setVisibility(0);
                        textView.setText(str);
                        return;
                    }
                    textView.setVisibility(8);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class q implements androidx.lifecycle.x<Boolean> {
        public q() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = ReaderHomeActivity.this.M;
                if (aVar != null) {
                    aVar.H0();
                }
                FileRepository.f24155a.getClass();
                ((androidx.lifecycle.w) FileRepository.f24168o.getValue()).k(Boolean.FALSE);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class r implements androidx.lifecycle.x<Boolean> {
        public r() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            ArrayList<PdfPreviewEntity> arrayList;
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                EngineHelper engineHelper = EngineHelper.f15726a;
                String p10 = ea.a.p("UW9fZSlvM3QnbSRhWm4ycnl8Om8kZXRvAHQebRNhLG5cckI=", "M392kGoj");
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                h0 h0Var = readerHomeActivity.f26677n1;
                engineHelper.getClass();
                EngineHelper.h(p10, h0Var);
                EngineHelper.h(ea.a.p("e28mZSBjA24wYVpuDHIXfAxvX2UVYyJuKWFfbhVyQg==", "k1p47Ro5"), readerHomeActivity.f26679o1);
                EngineHelper.h(ea.a.p("e28mZT9pEXQwYVpuDHIXfAxvX2UKaTB0D2EmbjRyQg==", "MHQVfDaD"), readerHomeActivity.f26681p1);
                gl.e eVar = gl.e.f17918a;
                gl.a aVar = new gl.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.b0
                    @Override // gl.a
                    public final int a() {
                        ArrayList<PdfPreviewEntity> arrayList2 = ReaderHomeActivity.this.U;
                        if (arrayList2 != null) {
                            return arrayList2.size();
                        }
                        return 0;
                    }
                };
                eVar.getClass();
                gl.e.f17920d = aVar;
                o9.d.f22759b = ea.a.p("Qg==", "xGxFor1h");
                a.C0199a.f16264a.b(readerHomeActivity, readerHomeActivity.u2());
                if (!dl.a.a(readerHomeActivity) && (arrayList = readerHomeActivity.U) != null && !arrayList.isEmpty()) {
                    gl.e.d();
                }
                ReaderPdfApplication.k().f28147d.j(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class s implements androidx.lifecycle.x<Boolean> {
        public s() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean booleanValue = bool2.booleanValue();
                int i10 = 8;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                if (booleanValue && readerHomeActivity.f26676n0.getVisibility() == 8) {
                    tn.a.b(readerHomeActivity, ea.a.p("W28mZQ==", "poA5aE57"), ea.a.p("W28mZSxwEG8tc1xvdw==", "y0OmJer1"));
                }
                AppCompatImageView appCompatImageView = readerHomeActivity.f26676n0;
                if (bool2.booleanValue()) {
                    i10 = 0;
                }
                appCompatImageView.setVisibility(i10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class t implements androidx.lifecycle.x<Boolean> {

        /* renamed from: a */
        public boolean f26745a = false;

        public t() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                boolean z10 = this.f26745a;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                if (z10 && !bool2.booleanValue()) {
                    String str = ReaderHomeActivity.Y1;
                    readerHomeActivity.u2();
                    readerHomeActivity.f26675m1 = false;
                    readerHomeActivity.R2();
                    readerHomeActivity.W = false;
                    readerHomeActivity.E2();
                }
                if (bool2.booleanValue()) {
                    ViewGroup viewGroup = readerHomeActivity.f26694v0;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                    LinearLayout linearLayout = readerHomeActivity.f26659c0;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                        readerHomeActivity.f26659c0.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = readerHomeActivity.f26661d0;
                    if (linearLayout2 != null) {
                        linearLayout2.removeAllViews();
                        readerHomeActivity.f26661d0.setVisibility(8);
                    }
                    View view = readerHomeActivity.f26662e0;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    LinearLayout linearLayout3 = readerHomeActivity.f26664g0;
                    if (linearLayout3 != null) {
                        linearLayout3.removeAllViews();
                        readerHomeActivity.f26664g0.setVisibility(8);
                    }
                    gl.h.f17923a.getClass();
                    gl.h.b(readerHomeActivity);
                    gl.b.f17914a.getClass();
                    gl.b.a(readerHomeActivity);
                    gl.e.f17918a.getClass();
                    gl.e.a(readerHomeActivity);
                }
                this.f26745a = bool2.booleanValue();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class u extends c5.d {
        public u() {
            ReaderHomeActivity.this = r1;
        }

        @Override // h5.b
        public final void f(i5.a aVar) {
            boolean z10;
            ReaderPdfApplication readerPdfApplication = (ReaderPdfApplication) ReaderPdfApplication.m();
            readerPdfApplication.getClass();
            String p10 = ea.a.p("QXADYQdl", "ZH4gsXFn");
            String p11 = ea.a.p("RnAvYQdlPW4ddF1fGmg5dw==", "2Qz5zCfL");
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            tn.a.b(readerHomeActivity, p10, p11);
            if (!pdf.pdfreader.viewer.editor.free.ads.f.m().g() && !pdf.pdfreader.viewer.editor.free.ads.l.m().g() && !pdf.pdfreader.viewer.editor.free.ads.g.m().g()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                readerPdfApplication.f23869d = aVar;
                return;
            }
            readerPdfApplication.f23869d = null;
            aVar.e(readerHomeActivity);
        }

        @Override // h5.b
        public final void g() {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.getClass();
            pdf.pdfreader.viewer.editor.free.utils.q0.B(readerHomeActivity, "");
        }

        @Override // h5.b
        public final void h() {
            ComponentActivity componentActivity = this.f18009a;
            if (componentActivity != null) {
                h5.c.f18014h.a(componentActivity).f(true);
            }
            int i10 = ReaderPdfApplication.f23863o;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (i10 > 0) {
                j1.e(readerHomeActivity, readerHomeActivity.getString(R.string.arg_res_0x7f13056b), true, null, -1);
            } else {
                ReaderPdfApplication.f23864p = readerHomeActivity.getString(R.string.arg_res_0x7f13056b);
            }
            String str = ReaderHomeActivity.Y1;
            readerHomeActivity.getClass();
            pdf.pdfreader.viewer.editor.free.utils.q0.B(readerHomeActivity, "");
        }

        @Override // h5.b
        public final void i() {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.getClass();
            pdf.pdfreader.viewer.editor.free.utils.q0.B(readerHomeActivity, "");
        }
    }

    /* loaded from: classes3.dex */
    public class v implements androidx.lifecycle.x<Boolean> {
        public v() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.lifecycle.x
        public final void m(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ea.a.p("PHBdYQpoF2M2bzllVXcJdFZoC3JlZApBGXQHbx1XD2UhU0FsGHNfQzZvOWU6", "BwI2znsg"));
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                sb2.append(readerHomeActivity.J0);
                t1.b(sb2.toString());
                if (readerHomeActivity.J0) {
                    readerHomeActivity.J0 = false;
                    if (readerHomeActivity.K0) {
                        readerHomeActivity.K0 = false;
                        readerHomeActivity.F2();
                    }
                    if (readerHomeActivity.L0) {
                        readerHomeActivity.L0 = false;
                        readerHomeActivity.s2();
                    }
                }
                ReaderPdfApplication.k().f28154k.j(null);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class w extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public w() {
            ReaderHomeActivity.this = r1;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            int id2 = view.getId();
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (id2 != R.id.img_setting) {
                if (id2 == R.id.img_subscription) {
                    tn.a.b(readerHomeActivity, ea.a.p("Gm8YZQ==", "qdruYtVv"), ea.a.p("W28mZSxwEG8tY1hpCms=", "wmP0VYWE"));
                    BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                    Context context = view.getContext();
                    String p10 = ea.a.p("IW8bZQ==", "m7Ivv31N");
                    aVar.getClass();
                    BaseSubscriptionActivity.a.a(context, p10);
                    return;
                }
                return;
            }
            if (readerHomeActivity.P0) {
                readerHomeActivity.P0 = false;
                pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "is_can_show_update_red_dot", false);
                pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "settings_tips_show_in_133", false);
                no.f.b(readerHomeActivity).getClass();
                if (no.f.k(readerHomeActivity)) {
                    no.f.b(readerHomeActivity).getClass();
                    pdf.pdfreader.viewer.editor.free.utils.d1.b(readerHomeActivity).c(ea.a.p("RnMucixzCm8FX0BoDG0zXzBpQl93NDU=", "DO0Y9F6Q"), false);
                }
                ReaderViewPager readerViewPager = readerHomeActivity.H;
                if (readerViewPager != null && readerHomeActivity.f26682q0 != null) {
                    if (readerViewPager.getCurrentItem() == 0) {
                        readerHomeActivity.g2(readerHomeActivity.f26682q0.getSelectedTabPosition());
                    } else {
                        readerHomeActivity.g2(0);
                    }
                }
            }
            tn.a.b(readerHomeActivity, ea.a.p("OGUzdBBuZw==", "7jKGysV1"), ea.a.p("R2U6dBFuL187aAl3", "tR4NxH1T"));
            SettingsActivity.a aVar2 = SettingsActivity.f26879v;
            boolean z10 = readerHomeActivity.f26667i1;
            aVar2.getClass();
            Intent intent = new Intent(readerHomeActivity, SettingsActivity.class);
            intent.putExtra(ea.a.p("JGVIXwplQ3Qzbi1fAHAPclRkC182dAR0ZQ==", "ffsn6rwM"), z10);
            readerHomeActivity.startActivity(intent);
        }
    }

    /* loaded from: classes3.dex */
    public class x extends androidx.fragment.app.w {

        /* renamed from: d */
        public final /* synthetic */ pdf.pdfreader.viewer.editor.free.ui.frag.n f26750d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f26751e;

        public x(pdf.pdfreader.viewer.editor.free.ui.frag.n nVar, ArrayList arrayList) {
            ReaderHomeActivity.this = r1;
            this.f26750d = nVar;
            this.f26751e = arrayList;
        }

        @Override // oo.a
        public final void a() {
            this.f26750d.A0(this.f26751e);
            ReaderHomeActivity.this.N.sendEmptyMessageDelayed(5, 100L);
        }
    }

    /* loaded from: classes3.dex */
    public class y implements a.e {

        /* renamed from: a */
        public final /* synthetic */ qo.g f26753a;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Dialog f26755a;

            public a(Dialog dialog) {
                y.this = r1;
                this.f26755a = dialog;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (ReaderHomeActivity.this.M1()) {
                    this.f26755a.dismiss();
                }
            }
        }

        public y(qo.g gVar) {
            ReaderHomeActivity.this = r1;
            this.f26753a = gVar;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ads.a.e
        public final void d(Dialog dialog) {
            String str = ReaderHomeActivity.Y1;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            readerHomeActivity.w2(this.f26753a);
            readerHomeActivity.N.postDelayed(new a(dialog), 800L);
        }
    }

    /* loaded from: classes3.dex */
    public class z extends r.d {

        /* renamed from: a */
        public final /* synthetic */ pdf.pdfreader.viewer.editor.free.ui.frag.a f26757a;

        /* renamed from: b */
        public final /* synthetic */ qo.g f26758b;

        public z(pdf.pdfreader.viewer.editor.free.ui.frag.a aVar, qo.g gVar) {
            ReaderHomeActivity.this = r1;
            this.f26757a = aVar;
            this.f26758b = gVar;
        }

        @Override // r.d, pdf.pdfreader.viewer.editor.free.utils.x
        public final void h() {
            ReaderHomeActivity.this.I1();
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.x
        public final void i(String str, boolean z10) {
            qo.g gVar = this.f26758b;
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.f26757a;
            if (z10) {
                aVar.D0(gVar.f29401a, gVar.f29402b, str);
            } else {
                aVar.D0(gVar.f29401a, gVar.f29402b, "");
            }
        }
    }

    static {
        ea.a.p("HWVQZBxyf283ZQtjAWkeaUF5IA==", "vrxkvPhm");
        f26637a2 = ea.a.p("UmU8XwVlKWUrdDl0VWIIaVZkN3g=", "F79EvEnc");
        f26638b2 = ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "6tnSdnim");
        f26639c2 = ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfHmRm", "eBvi11Nv");
        f26640d2 = ea.a.p("WGUyXx1lFV8bbkBlB3QJdCtvXnMZZSdpdA==", "98xhSBAo");
        f26641e2 = ea.a.p("NGw8Y1xfOWU5dQNzQF8nZUptO3M6aVluK3QIcGU=", "PrWU7KxH");
        f26642f2 = ea.a.p("JnNuZxZfQ28Fcy90", "W44YlBWA");
        f26643g2 = ea.a.p("JnNucxFvQF8qZThtHHMbaVpuMWQsYQlvZw==", "VdpnFyYN");
        f26645i2 = ea.a.p("JGVIXwlkUV81cC9yFHQNX0dlHXUpdA==", "tDn3CBFs");
        f26646j2 = ea.a.p("WmUNXx9lHWUrdDl0VWIIcFdzO3Qgb24=", "A61tlq9u");
        f26647k2 = ea.a.p("WGUyXwBlAW8cZGtzDGwzYzBfRmEkXzNvGWkaaQdu", "jnh0ETbM");
        ea.a.p("MWUQX1VpNWUXcAd0aA==", "L7Zi3Yjv");
        f26648l2 = ea.a.p("Q2EsZSx3C2QVZXQ=", "h4SOJGkl");
        ea.a.p("f1IDTTNINk0NXzVDZkUSTg==", "kn9Llyr3");
        f26649m2 = ea.a.p("KVIiTTtQK1IFQShFelQITndUG0YAQ3dUPU9O", "ipomdn7l");
        Y1 = ea.a.p("Qg==", "TnBQhoQ3");
        f26644h2 = false;
        f26650n2 = false;
        f26651o2 = false;
        f26653q2 = new j();
        f26654r2 = false;
        f26655s2 = false;
        f26656t2 = false;
    }

    public void X1(boolean z10) {
        this.S1 = z10;
        this.X1 = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(this, z10 ? 1 : 0, "", "", new g0(z10));
        if (z10) {
            Z2(3);
        } else {
            Z2(2);
        }
        this.X1.show();
    }

    public static void a2(ReaderHomeActivity readerHomeActivity, Map map) {
        readerHomeActivity.O.removeCallbacks(readerHomeActivity.Q1);
        boolean z10 = false;
        boolean z11 = false;
        for (Map.Entry entry : map.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.c(readerHomeActivity)) {
            readerHomeActivity.X1(!k0.b.b(readerHomeActivity, ea.a.p("Bm4BcgppUy44ZRRtXXMkaVdufFIMQXJfOUU1SRBfC00mRyBT", "NIgee7OK")));
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            z10 = true;
        }
        if (z10 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.d(readerHomeActivity)) {
            jn.a.c.getClass();
            if (jn.a.l() < 2) {
                jn.a.f19332m.c(jn.a.f19323d[8], Integer.valueOf(jn.a.l() + 1));
            }
        }
        readerHomeActivity.Y2();
        readerHomeActivity.W2();
    }

    public static void b2(ReaderHomeActivity readerHomeActivity) {
        readerHomeActivity.I1();
        if (!readerHomeActivity.f19289b) {
            String string = readerHomeActivity.getString(R.string.arg_res_0x7f130391);
            String string2 = readerHomeActivity.getString(R.string.arg_res_0x7f130390);
            ea.a.p("UG8ldBZ4dA==", "Ha2teGXX");
            kotlin.jvm.internal.g.e(string, ea.a.p("Bmk2bGU=", "I9rBPyHG"));
            kotlin.jvm.internal.g.e(string2, ea.a.p("K2Vj", "LNjzwYNs"));
            i3 i3Var = new i3(readerHomeActivity, string, string2, null);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.show();
        }
    }

    public static /* synthetic */ void c2(ReaderHomeActivity readerHomeActivity, Map map) {
        readerHomeActivity.O.removeCallbacks(readerHomeActivity.Q1);
        boolean z10 = true;
        boolean z11 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z11 = false;
            }
        }
        if (!z11 && !pdf.pdfreader.viewer.editor.free.utils.extension.c.c(readerHomeActivity)) {
            readerHomeActivity.X1((k0.b.b(readerHomeActivity, ea.a.p("UG4jcjdpNC44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0xuUxNPCkEXRQ==", "iQ1GXPsq")) || k0.b.b(readerHomeActivity, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFJkUcVDZSe0F_XxhUPFIjR0U=", "yDs5XlOb"))) ? false : false);
            return;
        }
        readerHomeActivity.Y2();
        readerHomeActivity.W2();
    }

    public static String v2(int i10) {
        switch (i10) {
            case 200:
                return ea.a.p("E2wpICVpHWU=", "OvrECqXe");
            case 201:
                return ea.a.p("QWU1ZR10", "KO3VsqGO");
            case 202:
                return ea.a.p("UW8kax5hEGs=", "0RE2Qdm7");
            default:
                return "";
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a.b
    public final void A(a.C0330a c0330a) {
        Object obj = c0330a.f24025b;
        int i10 = c0330a.f24024a;
        if (i10 != 257) {
            if (i10 != 258) {
                if (i10 != 261) {
                    if (i10 != 288) {
                        switch (i10) {
                            case 263:
                                this.f26692u1 = 3;
                                K2(true, true);
                                tn.a.b(this, ea.a.p("Q2U5bRpzEWkdbmsxMQ==", "0sAnGKxZ"), ea.a.p("J29cZUgxaG41dCNjEF8Pb2pjAmkmaw==", "ckKREgLY"));
                                return;
                            case 264:
                                if ((obj instanceof String) && TextUtils.equals((String) obj, ea.a.p("Im8ebHM=", "DfVqfYsu"))) {
                                    k2(ToolsType.WORD2PDF, 12);
                                    return;
                                } else {
                                    k2(ToolsType.WORD2PDF, 4);
                                    return;
                                }
                            case 265:
                                if ((obj instanceof String) && TextUtils.equals((String) obj, ea.a.p("W28mZQ==", "9dahoUPa"))) {
                                    this.K1 = ea.a.p("W28mZQ==", "7qyIaavk");
                                } else {
                                    this.K1 = ea.a.p("HG9YbHM=", "YCh7xCg6");
                                }
                                this.O.post(new pdf.pdfreader.viewer.editor.free.ui.act.e0(this, 1));
                                return;
                            default:
                                switch (i10) {
                                    case 272:
                                        k2(ToolsType.EDIT_PDF, 5);
                                        return;
                                    case 273:
                                        k2(ToolsType.MERGE_PDF, 6);
                                        return;
                                    case 274:
                                        k2(ToolsType.SPLIT_PDF, 7);
                                        return;
                                    case 275:
                                        k2(ToolsType.PRINT_PDF, 8);
                                        return;
                                    case 276:
                                        k2(ToolsType.LOCK_PDF, 9);
                                        return;
                                    case 277:
                                        k2(ToolsType.UNLOCK_PDF, 10);
                                        return;
                                    case 278:
                                        k2(ToolsType.PDF_ADD_TEXT, 3);
                                        return;
                                    case 279:
                                        k2(ToolsType.SIGN, 11);
                                        return;
                                    case 280:
                                        if ((obj instanceof String) && TextUtils.equals((String) obj, ea.a.p("Om8_bHM=", "9INP3x3b"))) {
                                            k2(ToolsType.PDF2WORD, 23);
                                            return;
                                        } else {
                                            k2(ToolsType.PDF2WORD, 19);
                                            return;
                                        }
                                    case 281:
                                        if ((obj instanceof String) && TextUtils.equals((String) obj, ea.a.p("O29ebHM=", "GAZDTmPB"))) {
                                            k2(ToolsType.PDF2IMG, 24);
                                            return;
                                        } else {
                                            k2(ToolsType.PDF2IMG, 20);
                                            return;
                                        }
                                    default:
                                        switch (i10) {
                                            case 290:
                                                k2(ToolsType.EDIT_TEXT, 28);
                                                return;
                                            case 291:
                                                k2(ToolsType.EDIT_PDF_DEFAULT, 27);
                                                return;
                                            case 292:
                                                k2(ToolsType.HOME_GUIDE_EDIT, 26);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                    } else if ((obj instanceof String) && TextUtils.equals((String) obj, ea.a.p("R28kbHM=", "zaWphDem"))) {
                        k2(ToolsType.PDF2LONG_IMG, 25);
                        return;
                    } else {
                        k2(ToolsType.PDF2LONG_IMG, 21);
                        return;
                    }
                }
                try {
                    t1.b(ea.a.p("YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgQC0UdDFpE2QeLWYgMkM2ST1Oa1AgQx1fAkl-RWZvLVAEY1JVK2kzZUB1J3Q=", "m9YaaTAg"));
                    G2((Uri) c0330a.f24025b);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            this.f26692u1 = 2;
            K2(true, true);
            tn.a.b(this, ea.a.p("P2VDbRBzRGk1bhUxMQ==", "Qj4r3Xpg"), ea.a.p("EW8jZV8xLmcncwN0a2M7aVtr", "MwyNnqeJ"));
            return;
        }
        V2();
    }

    public final void A2() {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
        if (aVar == null) {
            return;
        }
        String str = aVar.f28014t0;
        if (!TextUtils.isEmpty(str)) {
            String t4 = aj.b.t(str);
            int i10 = this.f26704y1;
            if (i10 == 0) {
                tn.a.d(this, ea.a.p("J29cZQ==", "Ek8Ae6Zp"), ea.a.p("W28mZSxzCm93", "XoldaLaC"), ea.a.p("UmwnXw==", "x5OmugpD").concat(t4), false);
            } else if (i10 == 1) {
                tn.a.d(this, ea.a.p("J29cZQ==", "F4XG6nod"), ea.a.p("W28mZSxzCm93", "E10oRaA2"), ea.a.p("PWVSZRd0Xw==", "ysWm4YGA").concat(t4), false);
            } else if (i10 == 2) {
                tn.a.d(this, ea.a.p("HW9bZQ==", "Dfu6VZH8"), ea.a.p("W28mZSxzCm93", "cY06hLeZ"), ea.a.p("XmE5a18=", "208pR6ee").concat(t4), false);
            }
        }
    }

    public final void B2() {
        TabLayout.g h10;
        if (getIntent().getBooleanExtra(f26639c2, false)) {
            pdf.pdfreader.viewer.editor.free.utils.q0.x(this, 1, "home_page_last_index");
        }
        ea.a.p("AG8uZXRpH2k8RhRhU20ybkxzPQ==", "vMhCTqTf");
        if (!this.f26707z1 && !ReaderPdfApplication.f23861m) {
            ea.a.p("W28mZVNpDGkGRkZhDm0zbjBzHiAzcyZyHWlYZT0=", "I5TGOReE");
            System.currentTimeMillis();
            this.f26707z1 = true;
            ViewGroup viewGroup = this.f26699x;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                this.f26699x.addOnLayoutChangeListener(new d());
            }
            ImageView imageView = this.f26670k0;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            AppBarLayout appBarLayout = this.G;
            if (appBarLayout != null) {
                appBarLayout.a(new e());
            }
            if (this.P == null) {
                this.P = new ArrayList<>();
            }
            t1.b(ea.a.p("W28mZVNpDGkGRkZhDm0zbjBzEmIjZypuOg==", "zdalfJTm") + System.currentTimeMillis());
            this.M = new pdf.pdfreader.viewer.editor.free.ui.frag.a();
            this.L = new ToolsNewFragment();
            this.P.add(this.M);
            this.P.add(this.L);
            this.M.f28016v0 = new f();
            ArrayList arrayList = new ArrayList();
            arrayList.add(getResources().getString(R.string.arg_res_0x7f130367));
            arrayList.add(getResources().getString(R.string.arg_res_0x7f1304d7));
            this.H.setAdapter(new xk.a(getSupportFragmentManager(), this.P, arrayList));
            this.H.setOffscreenPageLimit(arrayList.size());
            this.H.setEnableScroll(false);
            this.H.setCurrentItem(0);
            this.H.b(new g());
            TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
            this.f26685s0 = tabLayout;
            tabLayout.setTabMode(1);
            this.f26685s0.setTabGravity(0);
            TabLayout tabLayout2 = this.f26685s0;
            TabLayout.g i10 = tabLayout2.i();
            i10.a(getResources().getString(R.string.arg_res_0x7f130367));
            tabLayout2.b(i10, tabLayout2.f12937b.isEmpty());
            TabLayout tabLayout3 = this.f26685s0;
            TabLayout.g i11 = tabLayout3.i();
            i11.a(getResources().getString(R.string.arg_res_0x7f1303d8));
            tabLayout3.b(i11, tabLayout3.f12937b.isEmpty());
            TabLayout tabLayout4 = this.f26685s0;
            TabLayout.g i12 = tabLayout4.i();
            i12.a(getResources().getString(R.string.arg_res_0x7f130021));
            tabLayout4.b(i12, tabLayout4.f12937b.isEmpty());
            TabLayout tabLayout5 = this.f26685s0;
            TabLayout.g i13 = tabLayout5.i();
            i13.a(getResources().getString(R.string.arg_res_0x7f1304d7));
            tabLayout5.b(i13, tabLayout5.f12937b.isEmpty());
            for (int i14 = 0; i14 < this.f26685s0.getTabCount(); i14++) {
                if (i14 < this.Q.size() && i14 < this.R.size() && (h10 = this.f26685s0.h(i14)) != null) {
                    TabLayout tabLayout6 = this.f26685s0;
                    int intValue = this.R.get(i14).intValue();
                    View inflate = LayoutInflater.from(this).inflate(R.layout.pdf_layout_tab_item, (ViewGroup) tabLayout6, false);
                    TextView textView = (TextView) inflate.findViewById(R.id.tv_tab_text);
                    ((ImageView) inflate.findViewById(R.id.iv_tab_icon)).setImageResource(intValue);
                    textView.setText(this.Q.get(i14));
                    h10.f12981e = inflate;
                    h10.b();
                    if (TextUtils.equals(this.Q.get(i14), getString(R.string.arg_res_0x7f1304d7)) && pdf.pdfreader.viewer.editor.free.utils.q0.H(this)) {
                        inflate.findViewById(R.id.view_red_dot).setVisibility(0);
                    }
                    h10.f12984h.setLongClickable(false);
                    if (Build.VERSION.SDK_INT > 26) {
                        h10.f12984h.setTooltipText("");
                    }
                }
            }
            this.f26685s0.a(new h());
            h2(this.f26685s0, 0, false);
            if (this.D0) {
                this.O0 = 3;
                this.H.setCurrentItem(3);
                N2(this.O0);
                U2();
            } else {
                this.H.setCurrentItem(this.O0);
                N2(this.O0);
            }
            t1.b(ea.a.p("UW8bZWxpX2k8RhRhU20ybkxzcmUnZDo=", "zM9vL1ri") + System.currentTimeMillis());
        }
    }

    @Override // jl.a
    public final void C1() {
        this.D = (ImageView) findViewById(R.id.home_tools_iv);
        View findViewById = findViewById(R.id.home_guide_bg);
        this.f26706z0 = findViewById;
        findViewById.setOnTouchListener(new k());
        CreatePDFToolsGuideView createPDFToolsGuideView = (CreatePDFToolsGuideView) findViewById(R.id.home_tools_guide_view);
        this.f26703y0 = createPDFToolsGuideView;
        createPDFToolsGuideView.setOnCloseClickListener(new l());
        this.C = (ViewGroup) findViewById(R.id.homeRootView);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.tool_bar_layout);
        this.f26694v0 = (ViewGroup) findViewById(R.id.ll_bottom_container);
        this.A = (CoordinatorLayout) findViewById(R.id.coordinator_layout);
        this.G = (AppBarLayout) findViewById(R.id.app_bar_layout);
        this.B = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        View findViewById2 = findViewById(R.id.space_view);
        this.E = findViewById2;
        findViewById2.addOnLayoutChangeListener(new m());
        this.F = findViewById(R.id.statusBarView);
        this.f26678o0 = (LinearLayout) findViewById(R.id.normal_top_layout);
        this.f26680p0 = (FrameLayout) findViewById(R.id.top_tab_fl);
        this.f26682q0 = (TabLayout) findViewById(R.id.top_tab_layout);
        this.f26683r0 = findViewById(R.id.tab_line);
        this.K = (TextView) findViewById(R.id.ic_logo);
        this.H = (ReaderViewPager) findViewById(R.id.myViewPager);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_mul_select_top_wrapper);
        this.f26693v = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f26696w = (LinearLayout) findViewById(R.id.ll_mul_select_bottom_wrapper);
        this.f26699x = (ViewGroup) findViewById(R.id.bottom_layout);
        this.f26705z = (TextView) findViewById(R.id.tv_select_num);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById(R.id.cl_tip_browse_pdf);
        this.f26666i0 = constraintLayout2;
        constraintLayout2.setVisibility(8);
        findViewById(R.id.iv_close_browse_pdf).setOnClickListener(this);
        findViewById(R.id.tv_ok_browse_pdf).setOnClickListener(this);
        ((TextView) findViewById(R.id.tv_title_browse_pdf)).setText(getString(R.string.arg_res_0x7f130371, getString(R.string.arg_res_0x7f13014a)));
        this.J = (LinearLayout) findViewById(R.id.layout_all);
        this.f26668j0 = (ImageView) findViewById(R.id.img_select_all);
        ImageView imageView = (ImageView) findViewById(R.id.img_setting);
        this.f26670k0 = imageView;
        w wVar = this.C1;
        imageView.setOnClickListener(wVar);
        this.I = (CheckBox) findViewById(R.id.check_all);
        this.f26688t0 = (TextView) findViewById(R.id.top_select_all);
        this.J.setOnClickListener(this);
        this.f26672l0 = (ImageView) findViewById(R.id.img_sort);
        this.f26674m0 = (ImageView) findViewById(R.id.img_search);
        this.f26676n0 = (AppCompatImageView) findViewById(R.id.img_subscription);
        this.f26668j0.setOnClickListener(this);
        this.f26672l0.setOnClickListener(this);
        this.f26674m0.setOnClickListener(this);
        this.f26676n0.setOnClickListener(wVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.llRecentAdd);
        this.f26691u0 = linearLayout2;
        linearLayout2.setOnClickListener(this);
        if (pdf.pdfreader.viewer.editor.free.utils.a0.i(this)) {
            findViewById(R.id.ivRecentArrow).setRotation(180.0f);
        }
        this.D.setOnClickListener(new n());
    }

    public final void C2() {
        this.O.postDelayed(new a0(), 100L);
    }

    public final void D2(PdfPreviewEntity pdfPreviewEntity) {
        t1.b(ea.a.p("YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgbC1kdCRpIWQeLWYgGXUPcCJyUXYAZSFGNm9fVC5pMWRhaTpQLXUgZRM9IA==", "AILSUSpw") + this.f19289b);
        if (this.f19289b) {
            this.I1 = pdfPreviewEntity;
            this.J1 = true;
            return;
        }
        this.J1 = false;
        if (pdfPreviewEntity != null) {
            pdf.pdfreader.viewer.editor.free.utils.k0.g(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, ea.a.p("CVJ-TSZUf0kIRA==", "6CB6yRfV"));
        }
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_pdf_reader_home;
    }

    public final void E2() {
        if (!BillingConfigImpl.c.w() && !this.U.isEmpty() && !this.W && !dl.a.a(this)) {
            this.W = true;
            gl.e.f17918a.getClass();
            gl.e.d();
        }
    }

    public final void F2() {
        if (pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
            this.K0 = true;
        } else if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
            if (pdf.pdfreader.viewer.editor.free.utils.q0.l(this, -1, ea.a.p("HGUvXwxvOl8pbApvQ18nZUptDTEx", "UDwVbNHB")) == -1) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = this.E0;
                if (cVar != null) {
                    this.f26684r1 = true;
                    cVar.f27674h.f28987b = Boolean.TRUE;
                    if (!this.f19289b) {
                        cVar.g(this, pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f.class);
                        return;
                    }
                    return;
                }
                return;
            }
            O2(102, 50L);
        } else {
            this.f26684r1 = true;
            L2();
        }
    }

    @Override // jl.a
    public final int G1() {
        return 0;
    }

    public final void G2(Uri uri) {
        if (com.google.android.play.core.assetpacks.c.W(this) && uri != null) {
            this.H0 = true;
            y1(this);
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(this, false);
            dVar.show();
            dVar.a(R.string.arg_res_0x7f1303a8);
            pdf.pdfreader.viewer.editor.free.utils.b1 a10 = pdf.pdfreader.viewer.editor.free.utils.b1.a();
            Intent intent = getIntent();
            f0 f0Var = new f0(dVar);
            a10.getClass();
            String p10 = ea.a.p("lbi75vO5k4jO5Nyr", "zxq2evIA");
            ReaderSplashActivity.f23873s.getClass();
            ReaderSplashActivity.a.c(p10);
            Executors.newSingleThreadExecutor().execute(new b1.b(intent, uri, f0Var));
        }
    }

    public final void H2(boolean z10) {
        if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
            if (z10) {
                this.G0 = true;
                K2(false, true);
                this.f26692u1 = 1;
                return;
            }
            this.V1 = false;
            O2(102, 0L);
            this.f26692u1 = 0;
            R2();
        } else if (z10) {
            if (this.E0.f27674h.f27685e) {
                L2();
                return;
            }
            this.G0 = true;
            pdf.pdfreader.viewer.editor.free.utils.h1.i(this);
        } else {
            finish();
        }
    }

    public final void I2(ToolsType toolsType, int i10) {
        CreatePDFDialog createPDFDialog;
        l2(toolsType);
        if (toolsType != ToolsType.HOME_GUIDE_EDIT) {
            if (toolsType == ToolsType.MERGE_PDF) {
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(this);
                ReaderMergeChooserActivity.a aVar = ReaderMergeChooserActivity.f26759n0;
                String p10 = ea.a.p("O29ebHM=", "Jvk3PuOh");
                aVar.getClass();
                ReaderMergeChooserActivity.a.a(this, p10);
                return;
            }
            if (toolsType == ToolsType.WORD2PDF && (createPDFDialog = this.f26700x0) != null && createPDFDialog.isShowing()) {
                this.f26700x0.dismiss();
            }
            PDFChooseActivity.f27008u0.getClass();
            kotlin.jvm.internal.g.e(toolsType, "toolsType");
            PDFChooseActivity.a.a(this, toolsType, i10, null);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
        v2(this.A0);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J2(qo.g r11) {
        /*
            r10 = this;
            pdf.pdfreader.viewer.editor.free.ui.frag.a r0 = r10.M
            if (r0 == 0) goto L88
            if (r11 == 0) goto L88
            pdf.pdfreader.viewer.editor.free.ui.frag.n r1 = r0.F0()
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r2 = r11.f29402b
            java.lang.String r3 = r11.f29401a
            if (r1 == 0) goto L5d
            if (r2 != 0) goto L13
            goto L5d
        L13:
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L2b
            long r4 = r4.length()
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L29
            goto L2b
        L29:
            r1 = 1
            goto L5e
        L2b:
            java.util.ArrayList r4 = r1.E0()
            if (r4 != 0) goto L32
            goto L5d
        L32:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r2)
            pdf.pdfreader.viewer.editor.free.ui.dialog.i3 r5 = new pdf.pdfreader.viewer.editor.free.ui.dialog.i3
            android.content.Context r6 = r1.g0()
            r7 = 2131952529(0x7f130391, float:1.9541503E38)
            java.lang.String r7 = r1.x(r7)
            r8 = 2131952553(0x7f1303a9, float:1.9541552E38)
            java.lang.String r8 = r1.x(r8)
            r9 = 0
            r5.<init>(r6, r7, r8, r9)
            mo.a r6 = new mo.a
            r6.<init>()
            r5.setOnDismissListener(r6)
            r5.show()
        L5d:
            r1 = 0
        L5e:
            if (r1 == 0) goto L88
            java.lang.String r1 = "P0RG"
            java.lang.String r4 = "9FoNps1v"
            java.lang.String r1 = ea.a.p(r1, r4)
            java.lang.String r4 = r2.getOtherStrOne()
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L83
            r10.V1()
            pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess r1 = new pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess
            r1.<init>(r10)
            pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity$z r2 = new pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity$z
            r2.<init>(r0, r11)
            r1.b(r3, r2)
            goto L88
        L83:
            java.lang.String r11 = ""
            r0.D0(r3, r2, r11)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.J2(qo.g):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:
        if (r0 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
        if (no.f.k(r7) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
        r7.P0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
        return;
     */
    @Override // jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1() {
        /*
            r7 = this;
            wk.b r0 = wk.b.b()
            r0.i(r7)
            r0 = 2131362970(0x7f0a049a, float:1.8345736E38)
            android.view.View r0 = r7.findViewById(r0)
            r0.setOnClickListener(r7)
            r0 = 2131362778(0x7f0a03da, float:1.8345346E38)
            android.view.View r0 = r7.findViewById(r0)
            r0.setOnClickListener(r7)
            r0 = 2131361903(0x7f0a006f, float:1.8343571E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f26659c0 = r0
            r0 = 2131363056(0x7f0a04f0, float:1.834591E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f26661d0 = r0
            r0 = 2131363057(0x7f0a04f1, float:1.8345912E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f26662e0 = r0
            r0 = 2131363841(0x7f0a0801, float:1.8347502E38)
            android.view.View r0 = r7.findViewById(r0)
            r7.f26663f0 = r0
            r0 = 2131363036(0x7f0a04dc, float:1.834587E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f26664g0 = r0
            r0 = 2131364459(0x7f0a0a6b, float:1.8348756E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f26658b0 = r0
            r0.setOnClickListener(r7)
            r0 = 2131364462(0x7f0a0a6e, float:1.8348762E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.X = r0
            r0.setOnClickListener(r7)
            r0 = 2131364463(0x7f0a0a6f, float:1.8348764E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.Y = r0
            r0.setOnClickListener(r7)
            r0 = 2131364460(0x7f0a0a6c, float:1.8348758E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.Z = r0
            r0.setOnClickListener(r7)
            r0 = 2131364464(0x7f0a0a70, float:1.8348766E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f26657a0 = r0
            r0.setOnClickListener(r7)
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165877(0x7f0702b5, float:1.7945984E38)
            int r0 = r0.getDimensionPixelSize(r1)
            r7.f26702y = r0
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.a0.f28535g
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "settings_tips_show_in_133"
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.q0.f(r7, r0, r2)
            if (r0 == 0) goto Lbc
            long r3 = pdf.pdfreader.viewer.editor.free.utils.q0.j(r7)
            r5 = 33
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lbc
            r0 = r2
            goto Lbd
        Lbc:
            r0 = r1
        Lbd:
            if (r0 != 0) goto Lcc
        Lbf:
            no.f r0 = no.f.b(r7)
            r0.getClass()
            boolean r0 = no.f.k(r7)
            if (r0 == 0) goto Lcd
        Lcc:
            r1 = r2
        Lcd:
            r7.P0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.K1():void");
    }

    public final void K2(boolean z10, boolean z11) {
        boolean isExternalStorageManager;
        if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                AppOpenManager.c().f23907g = false;
                if (z10 && z11) {
                    this.A1++;
                }
                pdf.pdfreader.viewer.editor.free.utils.r0.c(this);
                if (this.f26689t1 == null) {
                    this.f26689t1 = new pdf.pdfreader.viewer.editor.free.utils.a1(this, ReaderHomeActivity.class, null);
                }
                this.f26689t1.c();
            }
        }
    }

    @Override // jl.a
    public final void L1() {
        this.f26660c1 = (HomeViewModel) new androidx.lifecycle.m0(this).a(HomeViewModel.class);
        ReaderPdfApplication.k().f28148e.e(this, new o());
        HomeViewModel homeViewModel = this.f26660c1;
        if (homeViewModel != null) {
            homeViewModel.f28158e.e(this, new p());
        }
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        d0 observer = this.f26673l1;
        kotlin.jvm.internal.g.e(observer, "observer");
        pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
        ((List) StorageFileObserver.f25905h.getValue()).add(observer);
        StorageFileObserver.f25904g.e(this, new androidx.lifecycle.x() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.t
            @Override // androidx.lifecycle.x
            public final void m(Object obj) {
                HashSet<String> hashSet;
                Boolean bool = (Boolean) obj;
                String str = ReaderHomeActivity.Y1;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                readerHomeActivity.getClass();
                if (bool != null && bool.booleanValue() && (hashSet = readerHomeActivity.f26671k1) != null && !hashSet.isEmpty()) {
                    Iterator<String> it = readerHomeActivity.f26671k1.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar3 = readerHomeActivity.M;
                        if (aVar3 != null) {
                            aVar3.I0(next);
                        }
                    }
                    readerHomeActivity.E2();
                    readerHomeActivity.N.sendEmptyMessageDelayed(5, 100L);
                    readerHomeActivity.p2();
                }
            }
        });
        ReaderPdfApplication.k().f28152i.e(this, new pdf.pdfreader.viewer.editor.free.ui.act.u(this, 0));
        FileRepository.f24170q.e(this, new q());
        ReaderPdfApplication.k().f28147d.e(this, new r());
        BillingConfigImpl.c.getClass();
        ((LiveData) BillingConfigImpl.f24870x.getValue()).e(this, new s());
        BillingConfigImpl.x().e(this, new t());
        FileRepository.f24155a.getClass();
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(this, FileRepository.f24177x, getLifecycle(), new a1.e(this, 12));
        ReaderPdfApplication.k().f28154k.e(this, new v());
        pdf.pdfreader.viewer.editor.free.utils.extension.d.b(this, ReaderPdfApplication.k().f28156m, getLifecycle(), new u0.a(9));
    }

    public final void L2() {
        if (androidx.core.content.a.checkSelfPermission(this, ea.a.p("E24vch5pFi44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEE-XxhUPlIzR0U=", "DIrKqryf")) != 0) {
            EventCenter.f(ea.a.p("JWVu", "Y3QhHLGk"));
            androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
            if (wn.b.f31388d) {
                EventCenter.c(this);
            }
            tn.a.b(this, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "iIJo0VCl"), ea.a.p("P2VDbRBzRGk1bnswKnMRc2pzBm93", "uEZwjYQw"));
            AppOpenManager.c().f23907g = false;
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f fVar = this.E0.f27674h;
            if (fVar != null && fVar.d()) {
                fVar.a();
            }
            k0.b.a(this, new String[]{ea.a.p("UG4JclZpPC44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEF9Xz5UdlIZR0U=", "l81m9XX7")}, 1);
        }
    }

    public final void M2() {
        t1.b(ea.a.p("QGMqbiBkAWEAZGRkD1A3dCxMW3Myc2NnCHQ9ZC1QUHRbTCJzB3M=", "mmK1caLy"));
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.f(this)) {
            if (this.N.hasMessages(10)) {
                this.N.removeMessages(10);
            }
            this.N.sendEmptyMessage(10);
            return;
        }
        pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new b());
    }

    public final void N2(int i10) {
        ViewGroup viewGroup;
        CoordinatorLayout.f fVar;
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        if (tabLayout == null) {
            return;
        }
        TabLayout.g h10 = tabLayout.h(i10);
        if (h10 == null) {
            t1.b(ea.a.p("a2UGZBdyMW8lZSdjQGkhaUx5cmgmbVMgEXIDbyMgMWVVZQR0UnAWcyF0D29aIA==", "Ak9gryzp"));
            return;
        }
        if (i10 == 3 && (viewGroup = this.f26699x) != null && this.A != null && (fVar = (CoordinatorLayout.f) viewGroup.getLayoutParams()) != null) {
            CoordinatorLayout.c cVar = fVar.f3487a;
            if (cVar instanceof HideBottomViewOnScrollBehavior) {
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) cVar;
                ViewGroup viewGroup2 = this.f26699x;
                ViewPropertyAnimator viewPropertyAnimator = hideBottomViewOnScrollBehavior.c;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    viewGroup2.clearAnimation();
                }
                hideBottomViewOnScrollBehavior.f28379b = 2;
                viewGroup2.setTranslationY(0.0f);
            }
        }
        tabLayout.l(h10, true);
    }

    public final void O2(int i10, long j10) {
        this.N.removeMessages(i10);
        if (j10 <= 0) {
            this.N.sendEmptyMessage(i10);
        } else {
            this.N.sendEmptyMessageDelayed(i10, j10);
        }
    }

    public final void P2(boolean z10) {
        int i10;
        int i11;
        int selectedTabPosition;
        if (!this.f26707z1) {
            return;
        }
        this.M0 = z10;
        boolean z11 = false;
        if (z10) {
            this.G.e(true, false, true);
            this.f26699x.setTranslationY(0.0f);
            ImageView imageView = this.D;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.D;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        LinearLayout linearLayout = this.f26693v;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
        LinearLayout linearLayout2 = this.f26696w;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout2.setVisibility(i11);
        if (!z10) {
            this.f26705z.setText("");
            ReaderViewPager readerViewPager = this.H;
            if (readerViewPager != null) {
                if (readerViewPager.getCurrentItem() == 0) {
                    this.N0 = false;
                    this.B.setMinimumHeight(0);
                    this.f26678o0.setVisibility(0);
                    this.f26680p0.setVisibility(0);
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                        selectedTabPosition = 0;
                    } else {
                        selectedTabPosition = this.f26682q0.getSelectedTabPosition();
                    }
                    j2(selectedTabPosition);
                } else {
                    this.N0 = true;
                    this.B.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.dp_56));
                    this.f26678o0.setVisibility(0);
                    this.f26680p0.setVisibility(8);
                    j2(0);
                }
            }
        } else {
            this.N0 = false;
            this.B.setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.actionBarSize));
            this.f26678o0.setVisibility(8);
        }
        if (!this.N0 && !z10 && this.f26699x.getMeasuredHeight() <= this.f26702y) {
            z11 = true;
        }
        f2(z11);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("W28mZVNzFWkCZWZlD3IzcyxMU3kpdTcgbnMAdBFoF3dgZSdlEHQ0aRd3Og==", "NeBxb031"));
        sb2.append(!z10);
        t1.b(sb2.toString());
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
        if (aVar != null) {
            aVar.C0(!z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:324:0x024a  */
    @Override // pdf.pdfreader.viewer.editor.free.utils.g1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(android.os.Message r15) {
        /*
            Method dump skipped, instructions count: 1391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.Q(android.os.Message):void");
    }

    public final void Q2(int i10) {
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c(this, 0, new c0(i10));
        this.L1 = cVar;
        cVar.setOnDismissListener(new e0());
        EventCenter.f(ea.a.p("R28kbHM=", "XyMv84ya"));
        EventCenter.c(this);
        if (i10 != 28) {
            switch (i10) {
                case 3:
                    EventCenter.f28660g = ea.a.p("O2VJdA==", "MI4T2rb6");
                    break;
                case 4:
                case 12:
                    EventCenter.f28660g = ea.a.p("OG9DZEtwU2Y=", "IQkijg4D");
                    break;
                case 5:
                    EventCenter.f28660g = ea.a.p("Lm5fbw1hQ2U=", "K88pxAsE");
                    break;
                case 6:
                    EventCenter.f28660g = ea.a.p("ImVDZ2U=", "Qi3WVsCO");
                    break;
                case 7:
                    EventCenter.f28660g = ea.a.p("QHAnaXQ=", "UzK08Gnc");
                    break;
                case 8:
                    EventCenter.f28660g = ea.a.p("IXIPbnQ=", "G1QfLi29");
                    break;
                case 9:
                    EventCenter.f28660g = ea.a.p("X28oaw==", "RaRRvkOy");
                    break;
                case 10:
                    EventCenter.f28660g = ea.a.p("Rm4nbxBr", "COaV43FF");
                    break;
                case 11:
                    EventCenter.f28660g = ea.a.p("JGlebg==", "elW92mc8");
                    break;
                default:
                    switch (i10) {
                        case 23:
                            EventCenter.f28660g = ea.a.p("Q2QtMgRvEGQ=", "jxTdA0gB");
                            break;
                        case 24:
                            EventCenter.f28660g = ea.a.p("P2RXMhBtZw==", "u2ExjTG8");
                            break;
                        case 25:
                            EventCenter.f28660g = ea.a.p("Q2QtMh9vDGcbbWc=", "0mzuZelT");
                            break;
                    }
            }
        } else {
            EventCenter.f28660g = ea.a.p("VmQidANkZg==", "5ot0dhxI");
        }
        EventCenter.f28661h = ea.a.p("P2VDMTE=", "tFjoQRhi");
        EventCenter.e(this);
        this.L1.show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0081, code lost:
        if (android.text.TextUtils.equals(bp.a.a(r7), ea.a.p("Qw==", "2co1kxRr")) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R2() {
        /*
            r7 = this;
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.h1.c()
            if (r0 == 0) goto L3a
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(r7)
            if (r0 != 0) goto L48
            java.lang.String r0 = "JGVIXxdvQ187bCZvAl8YZUdtMTEx"
            java.lang.String r1 = "LtWNRDwU"
            java.lang.String r0 = ea.a.p(r0, r1)
            r1 = -1
            int r0 = pdf.pdfreader.viewer.editor.free.utils.q0.l(r7, r1, r0)
            if (r0 == r1) goto L2e
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c r0 = r7.E0
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f r0 = r0.f27674h
            boolean r0 = r0.d()
            if (r0 == 0) goto L48
        L2e:
            boolean r0 = r7.G0
            if (r0 != 0) goto L48
            java.lang.String r0 = "YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgQ2UUbSdzIGlcbmtkGmEObxUgWmUMZHZ0KyBBaCl3Y29BIBVoIXc6bmc="
            java.lang.String r1 = "3fNSypON"
            ea.a.p(r0, r1)
            return
        L3a:
            boolean r0 = pdf.pdfreader.viewer.editor.free.utils.extension.c.g(r7)
            if (r0 != 0) goto L48
            java.lang.String r0 = "YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgFmVCbS1zCmlcbmtuHCASZQBtXXMaaTluaCBcbzIgN29Gc1hvdw=="
            java.lang.String r1 = "f0Dyb0qT"
            ea.a.p(r0, r1)
            return
        L48:
            boolean r0 = r7.f26675m1
            dl.a r1 = dl.a.C0199a.f16264a
            if (r0 == 0) goto L8f
            android.widget.LinearLayout r0 = r7.f26659c0
            if (r0 == 0) goto L8f
            int r0 = r0.getVisibility()
            r2 = 0
            if (r0 != 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = r2
        L5c:
            boolean r3 = dl.a.a(r7)
            if (r0 == 0) goto L84
            no.f r4 = no.f.b(r7)
            r4.getClass()
            boolean r4 = no.f.f()
            if (r4 == 0) goto L84
            if (r3 == 0) goto L84
            java.lang.String r4 = bp.a.a(r7)
            java.lang.String r5 = "Qw=="
            java.lang.String r6 = "2co1kxRr"
            java.lang.String r5 = ea.a.p(r5, r6)
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L84
            goto L85
        L84:
            r2 = r0
        L85:
            if (r2 == r3) goto L8f
            java.lang.String r0 = "HWVQZBxyf283ZQtjAWkeaUF5TmgqbQAgIWFfbihyZWEjclRhHXkXczJvPSxVbgcgVmgPbiJlLg=="
            java.lang.String r1 = "TpIjC1ME"
            ea.a.p(r0, r1)
            return
        L8f:
            java.lang.String r0 = "HWVQZBxyf283ZQtjAWkeaUF5TmgqbQAgVGEGbiRyY2EjclRhHXkXczJvPSxVbgcgVmgPbiJlLg=="
            java.lang.String r2 = "zsFB6hAC"
            ea.a.p(r0, r2)
            java.lang.String r0 = "QQ=="
            java.lang.String r2 = "mQg0a7FF"
            java.lang.String r0 = ea.a.p(r0, r2)
            o9.d.f22759b = r0
            android.widget.LinearLayout r0 = r7.u2()
            r1.b(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.R2():void");
    }

    public final void S2() {
        I1();
        if (!this.f19289b) {
            this.I0 = true;
            tf.c cVar = FullScreenManage.f23914a;
            FullScreenManage.h(this, ea.a.p("OWlUdw==", "Zr46oQ1D"), false);
            NativeItemClickApiImpl.f25884a.n();
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void ShowHideMenu(qo.o oVar) {
        if (oVar != null && !this.f19289b) {
            this.N.removeMessages(5);
            this.N.sendEmptyMessageDelayed(5, 100L);
            p2();
        }
    }

    public final void T2() {
        ReaderViewPager readerViewPager = this.H;
        if (readerViewPager != null && this.f26707z1) {
            try {
                if (readerViewPager.getCurrentItem() == 1) {
                    this.f26672l0.setVisibility(8);
                    this.f26674m0.setVisibility(8);
                    this.f26668j0.setVisibility(8);
                } else if (this.U.size() > 0) {
                    this.f26674m0.setVisibility(0);
                } else {
                    this.f26674m0.setVisibility(8);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void U2() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar;
        if (!this.f26684r1) {
            if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
                if (pdf.pdfreader.viewer.editor.free.utils.q0.l(this, -1, ea.a.p("WGUyXx1vFl8TbFhvHl8mZTZtbTEx", "5ygcWZLx")) != -1 && (cVar = this.E0) != null) {
                    cVar.f27674h.f28987b = Boolean.TRUE;
                    if (!this.f19289b) {
                        cVar.g(this, pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f.class);
                        return;
                    }
                    return;
                }
                return;
            }
            L2();
        }
    }

    public final void V2() {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar;
        if (this.H != null && (aVar = this.M) != null) {
            String t4 = aj.b.t(aVar.f28014t0);
            tn.a.d(this, ea.a.p("HG8wdA==", "rKoBzG7I"), ea.a.p("PG9DdCZzX293", "BZ14cJsu"), t4, false);
            int i10 = this.M.f27998d0;
            if (i10 == 200) {
                no.e eVar = no.f.b(this).f22632f;
                if (this.T == null) {
                    this.T = new pdf.pdfreader.viewer.editor.free.ui.dialog.h1(this, this, 0, eVar);
                }
                this.T.I(0, eVar);
                tn.a.d(this, ea.a.p("PW8YZQ==", "ObUuoqEE"), ea.a.p("W28mZSxzDXIGX1dsAGNr", "X0354swO"), ea.a.p("LmxdXw==", "Mxjns4GZ").concat(t4), false);
            } else if (i10 == 202) {
                no.e eVar2 = no.f.b(this).f22632f;
                if (this.T == null) {
                    this.T = new pdf.pdfreader.viewer.editor.free.ui.dialog.h1(this, this, 2, eVar2);
                }
                this.T.I(2, eVar2);
                tn.a.d(this, ea.a.p("UG8AZQ==", "H68mWBCT"), ea.a.p("C29cZRZzNXI8XwVsXWNr", "9nc1IZQj"), ea.a.p("ImFDa18=", "Jczrtx3K").concat(t4), false);
            }
            if (this.T != null && M1()) {
                this.T.show();
            }
        }
    }

    public final void W2() {
        CreatePDFDialog createPDFDialog = this.f26700x0;
        if (createPDFDialog != null && createPDFDialog.isShowing()) {
            this.f26700x0.dismiss();
        }
        int i10 = this.R1;
        if (i10 == 1) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
            ReaderImg2PDFChooseActivity.a aVar = ReaderImg2PDFChooseActivity.M0;
            String str = this.K1;
            String p10 = ea.a.p("Wm0sMgNkZg==", "z4X5497j");
            aVar.getClass();
            ReaderImg2PDFChooseActivity.a.b(this, str, p10);
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxpD2c=", "dmjEaBkY"));
            l2(ToolsType.IMG2PDF);
        } else if (i10 == 2) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.f();
            int i11 = CameraActivity.H0;
            CameraActivity.a.a(this, ea.a.p("O29ebHM=", "4eRBpERV"), ea.a.p("BmMgbghlHTI4ZGY=", "Y7uAfoyn"), false, true);
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZzVGFu", "pCMf3kXr"));
            l2(ToolsType.SCAN2PDF);
        }
        this.R1 = -1;
    }

    public final void X2() {
        String str;
        String str2;
        if (!this.f26701x1) {
            this.f26701x1 = true;
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(ea.a.p("Q2EsZSxmEG9t", "G0KciNGu"));
                if (TextUtils.equals(stringExtra, ea.a.p("Q2EsZSxzEmwTc2g=", "MNjWARFa")) || TextUtils.equals(stringExtra, ea.a.p("Q2EsZSx3B2wRb1ll", "RrYx4I07")) || (TextUtils.equals(stringExtra, f26648l2) && intent.getIntExtra(f26646j2, 0) == 0)) {
                    String p10 = ea.a.p("KWlDcw1fUWk2ZRVzHW93", "n8dinVoF");
                    String p11 = ea.a.p("W28mZSxhDmwUaVhlcw==", "C6KNklw5");
                    if (this.U.size() > 0) {
                        str = "WQ==";
                        str2 = "MR1m98nm";
                    } else {
                        str = "Tg==";
                        str2 = "58wW56LP";
                    }
                    tn.a.d(this, p10, p11, ea.a.p(str, str2), false);
                }
            }
        }
    }

    public final void Y2() {
        String p10;
        int i10 = this.W1;
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            if (i10 != 1) {
                if (i10 != 2) {
                    p10 = ea.a.p("Jm1WXwp5cw==", "ZzcI3hzD");
                } else {
                    p10 = ea.a.p("D20sXyRlQ20y", "7nfKT1Qp");
                }
            } else {
                p10 = ea.a.p("A20yXzplHm0x", "j7jUJlZJ");
            }
            jn.a.c.getClass();
            String k10 = jn.a.k();
            if (!k10.contains(ea.a.p("QHQkchJnB18Wb1plXw==", "HatOHC31").concat(p10))) {
                tn.a.d(this, ea.a.p("KmU4bVFzSmknbg==", "rAZJ89Yl"), ea.a.p("QHQkchJnB18Wb1pl", "emMz6eas"), ea.a.p("R28_YWw=", "04J5wKL9"), false);
                tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "GgHX6d5A"), ea.a.p("PHRechhnUl8-byRl", "pkAZKi6i"), p10, false);
                jn.a.p(k10 + ea.a.p("fA==", "eKtCAkro") + ea.a.p("N3Qecg5nCl8sbwhl", "w6DqooYO") + ea.a.p("Xw==", "V27lnag6") + p10);
            }
        }
        this.W1 = 0;
    }

    public final void Z2(int i10) {
        String p10;
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    p10 = ea.a.p("Jm1WXwp5cw==", "fx1ucivF");
                } else {
                    p10 = ea.a.p("Wm0sXx1vFmkRZQ==", "e30Sko9V");
                }
            } else {
                p10 = ea.a.p("Wm0sXwNlEG0y", "8WnClQ05");
            }
        } else {
            p10 = ea.a.p("Jm1WXwllRW0x", "nACZiVw4");
        }
        jn.a.c.getClass();
        String k10 = jn.a.k();
        if (!k10.contains(ea.a.p("QHQkchJnB18BaFt3Xw==", "T0RZ8FYH").concat(p10))) {
            tn.a.d(this, ea.a.p("NmUlbShzBmknbg==", "ONFWAuqV"), ea.a.p("QHQkchJnB18BaFt3", "cTl5ZzZB"), ea.a.p("G288YWw=", "LZoHXIpc"), false);
            tn.a.d(this, ea.a.p("Q2U5bRpzEWkdbg==", "vpfSSVIO"), ea.a.p("PHRechhnUl8paCV3", "y1mg2Jrf"), p10, false);
            jn.a.p(k10 + ea.a.p("fA==", "GWkB9W96") + ea.a.p("QHQkchJnB18BaFt3", "ppxJOnCS") + ea.a.p("Xw==", "NPanyI6f") + p10);
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void changeBottomMenu(qo.e eVar) {
        boolean z10;
        int i10;
        if (eVar != null && !this.f19289b) {
            boolean z11 = true;
            if (eVar.f29397a > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            TextView textView = this.f26658b0;
            if (textView != null) {
                textView.setEnabled(z10);
            }
            TextView textView2 = this.X;
            int i11 = 8;
            if (textView2 != null) {
                if (eVar.c) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                textView2.setVisibility(i10);
                this.X.setEnabled(z10);
            }
            TextView textView3 = this.Y;
            if (textView3 != null) {
                textView3.setEnabled(z10);
            }
            TextView textView4 = this.f26657a0;
            if (textView4 != null) {
                textView4.setEnabled(z10);
            }
            TextView textView5 = this.Z;
            if (textView5 != null) {
                if (eVar.f29398b) {
                    i11 = 0;
                }
                textView5.setVisibility(i11);
                TextView textView6 = this.Z;
                if (eVar.f29397a <= 1) {
                    z11 = false;
                }
                textView6.setEnabled(z11);
            }
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void changeSelectAllMenu(qo.c cVar) {
        ReaderViewPager readerViewPager;
        int i10;
        if (cVar != null && this.M != null && (readerViewPager = this.H) != null && readerViewPager.getCurrentItem() != 1) {
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
            if (aVar.f27998d0 == cVar.f29395d && TextUtils.equals(aVar.f28014t0, cVar.c)) {
                ImageView imageView = this.f26672l0;
                int i11 = 0;
                if (cVar.f29393a) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
                if (this.U.size() > 0) {
                    this.f26674m0.setVisibility(0);
                } else {
                    this.f26674m0.setVisibility(8);
                }
                ImageView imageView2 = this.f26668j0;
                if (!cVar.f29394b) {
                    i11 = 8;
                }
                imageView2.setVisibility(i11);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void close() {
        t1.b(v2(this.A0).concat(ea.a.p("Hi1mYRdzQmMeb0dlSWg5bSEg", "SIhUwsVA")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.ReaderActBroadCastReceiver.a
    public final void d0(String str, Intent intent) {
        if (intent != null && !str.equals(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpLm83LjxyH2VhQXJUME95XxZPCUE5XypSekEqQwRTMV8bQxFJDEkuWRBEdFMtUnhZH0Q=", "djViZEZz")) && !str.equals(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpOm8gLldyV2VhQXJUME95XxZPCUE5XypSekEqQwRTMV8aSBNOelNtRgpFdUI4Q0s=", "V8csNR12"))) {
            if (ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpNm8ILghyJ2VhQXJUME95XxZPCUE5XypSekEqQwRTMV8BTDVTK18PQQZO", "R68vBznB").equals(str)) {
                finish();
            } else if (ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpOW8FLghyBGUdQQhUOk8sXz5Pd0ElXxRSC0F2QwdTF18ARTpPPFk-THxXFEM_TzFF", "MwnahrNq").equals(str)) {
                finish();
            } else if (ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpDm8rLlJyC2VhQXJUME95XxZPCUE5XypSekEqQwRTMV85SBhOc0UxTA5OdlU4R0U=", "RwgIzY4n").equals(str)) {
                ap.e.f5166o.getClass();
                ap.e.f5168q = true;
                finish();
            } else if (ea.a.p("AGQVLhZkUXItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2VeQTBUL095XwRPJUF4XxVSd0EWQwhTYl82Uj5XAkUQXzZJP0U=", "LQpsf7KC").equals(str)) {
                Serializable serializableExtra = intent.getSerializableExtra(ea.a.p("UmUIXztyGHc7ZRRfUmk7ZWdlPHQgdHk=", "Ub9qYwNm"));
                if (serializableExtra instanceof PdfPreviewEntity) {
                    m2((PdfPreviewEntity) serializableExtra);
                }
            }
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void dismissDialogEvent(qo.a aVar) {
        if (aVar != null) {
            q2();
            ea.a.p("YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgI3gRdExmQ29eIBtyFnYLZQVQVWcMLHZjLGVRa2ZjIm5mcxBvGyBXdV9sGGMBZQdu", "Fxl1af88");
            t2();
            t1.b(ea.a.p("W28mZVNzFWkCZWZlD3IzcyxMU3kpdTcgQmQocwFpQXN3aSpsHGcndhduQDoPYTpzZQ==", "bAl2hSrN"));
            P2(false);
        }
        o9.d.f22759b = ea.a.p("Qw==", "oBFjo4JT");
        dl.a aVar2 = a.C0199a.f16264a;
        if (aVar2.f16263a) {
            View view = this.E;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = 0;
                this.E.setLayoutParams(layoutParams);
            }
            aVar2.b(this, u2());
            E2();
        } else if (!dl.a.a(this)) {
            this.E1 = true;
        }
    }

    public final void e2(boolean z10) {
        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior;
        ViewGroup viewGroup = this.f26699x;
        if (viewGroup != null && (hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) ((CoordinatorLayout.f) viewGroup.getLayoutParams()).f3487a) != null) {
            hideBottomViewOnScrollBehavior.f28380d = z10;
        }
    }

    public final void f2(boolean z10) {
        if (z10) {
            mo.c.f22154z0 = this.G.getMeasuredHeight();
        } else {
            mo.c.f22154z0 = -1;
        }
        e2(z10);
        View view = this.E;
        if (view != null && this.f26699x != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!z10) {
                layoutParams.height = this.f26699x.getMeasuredHeight();
            } else {
                layoutParams.height = 0;
            }
            this.E.setLayoutParams(layoutParams);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        Z1 = false;
    }

    public final void g2(int i10) {
        int i11;
        int i12;
        ImageView imageView = this.f26670k0;
        if (imageView != null) {
            if (i10 == 0) {
                if (this.P0) {
                    i12 = R.drawable.ic_home_settings_tip;
                } else {
                    i12 = R.drawable.ic_home_settings;
                }
                imageView.setImageResource(i12);
                return;
            }
            if (this.P0) {
                i11 = R.drawable.ic_home_settings_white_tip;
            } else {
                i11 = R.drawable.ic_home_settings_white;
            }
            imageView.setImageResource(i11);
        }
    }

    public final void h2(TabLayout tabLayout, int i10, boolean z10) {
        View view;
        for (int i11 = 0; i11 < tabLayout.getTabCount(); i11++) {
            TabLayout.g h10 = tabLayout.h(i11);
            if (h10 != null && (view = h10.f12981e) != null) {
                TextView textView = (TextView) view.findViewById(R.id.tv_tab_text);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) h10.f12981e.findViewById(R.id.tab_anim_view);
                ImageView imageView = (ImageView) h10.f12981e.findViewById(R.id.iv_tab_icon);
                if (lottieAnimationView != null && imageView != null && z10) {
                    if (i11 == i10) {
                        lottieAnimationView.c(new i(imageView, lottieAnimationView));
                        lottieAnimationView.setAnimation(this.S[i10]);
                        lottieAnimationView.setVisibility(0);
                        imageView.setVisibility(4);
                        lottieAnimationView.j();
                    } else {
                        imageView.setVisibility(0);
                        lottieAnimationView.setVisibility(4);
                    }
                }
                if (textView != null) {
                    if (i11 == i10) {
                        textView.setTextAppearance(textView.getContext(), R.style.TextViewFont_RobotoMedium);
                    } else {
                        textView.setTextAppearance(textView.getContext(), R.style.TextViewFont_RobotoRegular);
                    }
                }
            }
        }
    }

    public final void i2(ImageView imageView, int i10) {
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(this, R.color.colorSurface)));
            } else {
                imageView.setImageTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(this, R.color.white)));
            }
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void itemClickEvent(qo.g gVar) {
        if (SystemClock.elapsedRealtime() - this.F1 < 1000) {
            return;
        }
        this.F1 = SystemClock.elapsedRealtime();
        if (gVar != null && !this.f19289b) {
            try {
                String p10 = ea.a.p("Im8eZRdmImxl", "v9JsHKWo");
                String p11 = ea.a.p("BG9UZRVmLmwtXwVsXWNr", "3Ql9JGKi");
                tn.a.d(this, p10, p11, this.M.G0() + ea.a.p("Xw==", "cN15vlkc") + aj.b.t(this.M.f28014t0), false);
                PdfPreviewEntity pdfPreviewEntity = gVar.f29402b;
                if (pdfPreviewEntity != null && pdf.pdfreader.viewer.editor.free.utils.l.c(pdfPreviewEntity.getPath())) {
                    EventCenter.b(this, pdfPreviewEntity.getOtherStrOne().toLowerCase(Locale.ROOT));
                }
                if (AdUtils.b(this)) {
                    if (!pdf.pdfreader.viewer.editor.free.ads.f.m().e() && !pdf.pdfreader.viewer.editor.free.ads.g.m().e() && !pdf.pdfreader.viewer.editor.free.ads.l.m().e()) {
                        w2(gVar);
                        return;
                    }
                    pdf.pdfreader.viewer.editor.free.ads.f m10 = pdf.pdfreader.viewer.editor.free.ads.f.m();
                    y yVar = new y(gVar);
                    m10.getClass();
                    this.f26697w0 = pdf.pdfreader.viewer.editor.free.ads.a.l(this, yVar);
                    return;
                }
                t1.b(ea.a.p("J29cZVlpQ2U3QyZpFmtIblogDWEmaAAgM2Rz", "TkGDrMhi"));
                J2(gVar);
            } catch (Exception e10) {
                dp.a.a().getClass();
                dp.a.e(e10);
            }
        }
    }

    public final void j2(int i10) {
        if (this.K != null) {
            String p10 = ea.a.p("dWwAIDZEHyAaZQdkUXI=", "964lfY21");
            SpannableString spannableString = new SpannableString(p10);
            if (i10 == 0) {
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorAccent));
                spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.colorSurface)), 0, 8, 17);
                spannableString.setSpan(foregroundColorSpan, 8, p10.length(), 17);
                this.K.setText(spannableString);
                return;
            }
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(this, R.color.white)), 0, p10.length(), 17);
            this.K.setText(spannableString);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void k() {
        pdf.pdfreader.viewer.editor.free.ads.f m10 = pdf.pdfreader.viewer.editor.free.ads.f.m();
        m10.getClass();
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmkyZS5DOGk3awR1HWxyZGtsHGFk", "TTBqZaTI");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        m10.f23921e = this;
        m10.h(this);
    }

    public final void k2(ToolsType toolsType, int i10) {
        List m10;
        this.O.post(new pdf.pdfreader.viewer.editor.free.ui.act.s(this, 1));
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            I2(toolsType, i10);
        } else if (pdf.pdfreader.viewer.editor.free.utils.h1.c()) {
            if (ToolsType.WORD2PDF == toolsType) {
                FileRepository.f24155a.getClass();
                m10 = FileRepository.p();
            } else {
                FileRepository.f24155a.getClass();
                m10 = FileRepository.m();
            }
            if (m10 != null && !m10.isEmpty()) {
                ArrayList arrayList = new ArrayList(m10);
                Iterator it = arrayList.iterator();
                if (toolsType != ToolsType.HOME_GUIDE_EDIT) {
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (pdf.pdfreader.viewer.editor.free.utils.l.c(((PdfPreviewEntity) it.next()).getPath())) {
                            it.remove();
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (ToolsType.LOCK_PDF == toolsType) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (!((PdfPreviewEntity) next).isOtherBoolOne()) {
                                arrayList2.add(next);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            I2(toolsType, i10);
                            return;
                        } else {
                            Q2(i10);
                            return;
                        }
                    } else if (ToolsType.UNLOCK_PDF == toolsType) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if (((PdfPreviewEntity) next2).isOtherBoolOne()) {
                                arrayList3.add(next2);
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            I2(toolsType, i10);
                            return;
                        } else {
                            Q2(i10);
                            return;
                        }
                    } else {
                        I2(toolsType, i10);
                        return;
                    }
                }
                Q2(i10);
                return;
            }
            Q2(i10);
        } else {
            I2(toolsType, i10);
        }
    }

    public final void l2(ToolsType toolsType) {
        if (toolsType == ToolsType.MERGE_PDF || toolsType == ToolsType.SPLIT_PDF || toolsType == ToolsType.LOCK_PDF || toolsType == ToolsType.UNLOCK_PDF || toolsType == ToolsType.WORD2PDF || toolsType == ToolsType.SCAN2PDF || toolsType == ToolsType.IMG2PDF || toolsType == ToolsType.PDF2IMG || toolsType == ToolsType.PDF2LONG_IMG || toolsType == ToolsType.PDF2WORD) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(this);
        }
    }

    public final void m2(PdfPreviewEntity pdfPreviewEntity) {
        boolean z10;
        if (pdfPreviewEntity != null) {
            if (this.U.size() > 0) {
                Iterator<PdfPreviewEntity> it = this.U.iterator();
                while (it.hasNext()) {
                    PdfPreviewEntity next = it.next();
                    if (next != null && next.getPath().equals(pdfPreviewEntity.getPath())) {
                        next.setRecentDate(pdfPreviewEntity.getRecentDate());
                        z10 = true;
                        next.setRecent(1);
                        t1.b(ea.a.p("Mm8lZVYtZy08aA9yUC16LRhjOmUqa3duEFIUZiNlMWgWaTt0VmUyaTt0SiBGZSN1Sm4=", "7NZHvJ83"));
                        break;
                    }
                }
            }
            z10 = false;
            t1.b(ea.a.p("W28mZVMtTy0GaF1yDS17LWRjWmUlawJuN1IcZgZlQ2h_aTh0U3IHZgBlR2hJMWcxdTE=", "Syt0TRdB"));
            if (!z10) {
                this.U.add(pdfPreviewEntity);
                FileRepository.c(pdfPreviewEntity);
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
                if (aVar != null) {
                    aVar.H0();
                }
                t1.b(ea.a.p("A2UPZANyJW8lZSdjQGkhaUx5cmgmbVMgWS1cdDlpMGR8LUMgBWgIYyNBCGRmZTFyXXM6TCBzQiAGZRdyNHNo", "HgQnfmZh"));
                E2();
                this.N.sendEmptyMessageDelayed(5, 100L);
                p2();
                return;
            }
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2 = this.M;
            if (aVar2 != null) {
                aVar2.H0();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.a
    public final void n() {
        pdf.pdfreader.viewer.editor.free.ads.f.m().n(this, f26653q2);
    }

    public final void n2() {
        no.f.b(this).getClass();
        pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(this);
        String str = no.f.f22619j;
        boolean a10 = b10.a(str, false);
        if (a10) {
            pdf.pdfreader.viewer.editor.free.utils.d1.b(this).c(str, false);
        }
        if (a10) {
            String p10 = ea.a.p("LGUQZh1vdw==", "KCBgqhKA");
            String p11 = ea.a.p("J29cZSZvWWMoZSt0EF8OaUdzdA==", "FiXsDyTQ");
            StringBuilder sb2 = new StringBuilder();
            no.f.b(this).getClass();
            sb2.append(no.f.c());
            sb2.append(ea.a.p("Xw==", "tKcuBUIV"));
            sb2.append(Y1);
            tn.a.d(this, p10, p11, sb2.toString(), false);
        }
        ea.a.p("W28mZVNzA3YXT0RlB0EmcAdvR24yc2NpP1ItYyhlK3RWPQ==", "LHZJK50h");
        if (!this.O1 && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) && !this.F0) {
            this.O1 = true;
            pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
            String p12 = ea.a.p("WnMUZhpyEXQtc1V2DF8mZTZtW3M1aSxuGnQnbWU=", "EN5l4ObJ");
            SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
            if (sharedPreferences.getBoolean(p12, true)) {
                sharedPreferences.edit().putBoolean(ea.a.p("JnNuZhByRHQFcyt2EF8YZUdtB3M2aQpuMXQ-bWU=", "rAiFnWij"), false).apply();
                eo.e.q(this, 0);
                eo.e.n(this, 0);
                eo.e.s(this, 0);
                eo.e.r(this, 0);
            }
            int g10 = eo.e.g(this);
            if (g10 < 5) {
                eo.e.q(this, g10 + 1);
            }
            ea.a.p("AG8KZRlzC3YtTxZlWkEncHtvJ249cwwg", "Xghg9j2l");
            int f10 = eo.e.f(this);
            ea.a.p("J29cZVlvR2U0QTpwImkcaHRwHlcsZAJlB0MIdRh0biA=", "ONstsgvT");
            if (f10 < 2) {
                eo.e.p(this, f10 + 1);
            } else if (f10 == 2 && Math.max(pdf.pdfreader.viewer.editor.free.utils.q0.l(ReaderPdfApplication.m(), 0, "key_app_open_times"), 0) == 0) {
                eo.e.p(this, 3);
            }
        }
    }

    public final void o2(Intent intent, Bundle bundle) {
        int i10;
        int i11;
        String str;
        if (intent != null) {
            i10 = intent.getIntExtra(f26646j2, 0);
        } else {
            i10 = 0;
        }
        if (intent != null) {
            i11 = intent.getIntExtra(f26647k2, 0);
        } else {
            i11 = 0;
        }
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra(ea.a.p("Q2EsZSxmEG9t", "awssjgAy"));
        } else {
            str = null;
        }
        if (intent != null) {
            str2 = intent.getStringExtra(ea.a.p("VXIkbQ==", "0bjFC9VT"));
        }
        boolean equals = f26648l2.equals(str2);
        o9.d.s(ea.a.p("RGkvZxZ0PXQTZw==", "hd1aOyRC"), ea.a.p("VXIkbVMg", "OaOXxtFo") + str + ea.a.p("b2RUZhh1W3QOYShQGnMBdFxvACA=", "WdUTCvMv") + i10 + ea.a.p("EyAvZRVhF2wGU1FjDG4yVCViYm81aTdpIm4g", "M4S07k4s") + i11);
        boolean z10 = true;
        if (equals && bundle == null) {
            q2();
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
            if (aVar != null && aVar.F0() != null) {
                this.M.F0().V0();
            }
            LinearLayout linearLayout = this.f26693v;
            if (linearLayout == null || linearLayout.getVisibility() != 0) {
                z10 = false;
            }
            if (z10) {
                t2();
                P2(false);
            }
            r2(i10, intent);
            return;
        }
        boolean equals2 = f26649m2.equals(str);
        if (equals2) {
            if (i10 == 0) {
                tn.a.d(this, ea.a.p("IW9FaRpl", "ECYA4XWz"), ea.a.p("XW8_aRBlPXIXc11kDG4iXydsW2Nr", "3ZJwqeAa"), ea.a.p("Umxs", "dc5XfHp9"), false);
            } else if (i10 == 1) {
                tn.a.d(this, ea.a.p("IW9FaRpl", "Cco1nIEM"), ea.a.p("V28TaRZlLHItcw9kUW4jX1tsO2Nr", "h39gusIE"), ea.a.p("PWVSZRd0", "DtllWrYc"), false);
            } else if (i10 == 2) {
                tn.a.d(this, ea.a.p("IW9FaRpl", "nszJViQv"), ea.a.p("IW9FaRplaHI_cyNkEG4cX1ZsB2Nr", "V4Cgs2E8"), ea.a.p("ImFDaw==", "gOKzM3X8"), false);
            } else if (i10 == 3) {
                tn.a.d(this, ea.a.p("XW8_aRBl", "muK75fCi"), ea.a.p("IW9FaRplaHI_cyNkEG4cX1ZsB2Nr", "FyUBepor"), ea.a.p("O29ebHM=", "dwdIFPTy"), false);
            }
        }
        if (equals2) {
            this.O.post(new qb.g1(this, i10, 6));
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        t1.b(ea.a.p("J29cZVlvWUE5dCN2HHQRUlBzG2wxOiA=", "gMNPKfM1"));
        if (i11 == -1 && i10 == 100 && intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                ea.a.p("J29cZVlnUnQPciMg", "cE4VQNxU");
                data.toString();
                t1.b(ea.a.p("YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgTC0ddFppIWQeLWYgHG4jYwZpQmkdeQRlN3VedGZQCkMqX2BEdF8VSX9F", "a02SLfuM"));
                G2(data);
            } else {
                t1.b(ea.a.p("W28mZVNwC2MZX0RkD18waShlEnU0aX49JnU0bA==", "HX1T7SXI"));
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int size;
        pdf.pdfreader.viewer.editor.free.ui.frag.n F0;
        char c10;
        pdf.pdfreader.viewer.editor.free.ui.frag.n F02;
        int indexOf;
        int i10 = 3;
        boolean z10 = true;
        switch (view.getId()) {
            case R.id.go_to_permission /* 2131362652 */:
                this.f26692u1 = 3;
                K2(true, true);
                tn.a.b(this, ea.a.p("Q2U5bRpzEWkdbmsxMQ==", "2xGCmSTX"), ea.a.p("J29cZUgxaG41dCNjEF8Pb2pjAmkmaw==", "ZNXEsT8s"));
                return;
            case R.id.img_search /* 2131362777 */:
                tn.a.b(this, ea.a.p("W28mZQ==", "05vcBaXt"), ea.a.p("I28kZQpzD2E6Yw5fV2w-Y2s=", "KFKIUj9b"));
                pdf.pdfreader.viewer.editor.free.utils.h1.startActivity(this, new Intent(this, ReaderSearchActivity.class));
                return;
            case R.id.img_select_all /* 2131362778 */:
                try {
                    pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
                    if (aVar != null) {
                        try {
                            pdf.pdfreader.viewer.editor.free.ui.frag.n F03 = aVar.F0();
                            if (F03 != null) {
                                F03.Z0();
                                ArrayList<PdfPreviewEntity> E0 = F03.E0();
                                wk.b b10 = wk.b.b();
                                if (E0 == null) {
                                    size = 0;
                                } else {
                                    size = E0.size();
                                }
                                b10.e(new qo.q(0, size));
                            }
                            t1.b(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EiApcCZuA2UrZRN0HG9XZQ==", "PGpQ9Y0J"));
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                t1.b(ea.a.p("J29cZVlzQGkqZRhlE3INc11MD3kqdREgO24EbCxjDyAmbVZfCmVbZTl0FWEZbFJmVGwdZQ==", "ijlTTGEd"));
                wk.b.b().e(new qo.b(false));
                return;
            case R.id.img_sort /* 2131362780 */:
                V2();
                return;
            case R.id.iv_close_browse_pdf /* 2131362908 */:
                ConstraintLayout constraintLayout = this.f26666i0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                if (Boolean.TRUE == null) {
                    pdf.pdfreader.viewer.editor.free.utils.q0.f(this, "key_hide_browse_pdf", false);
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "key_hide_browse_pdf", true);
                }
                tn.a.b(this, ea.a.p("P2VDbRBzRGk1bhUxMQ==", "L2WEIjgW"), ea.a.p("W28mZUIxPWMeb0dlNmM6aSdr", "hPCc0AHK"));
                return;
            case R.id.iv_select_back /* 2131362970 */:
                t2();
                t1.b(ea.a.p("JW9aZXVzOWk4ZTRlUnIyc1BMM3kmdUIgVG8fQz1pIWttaUFfJmUiZSt0OWJVYzw6XmE-c2U=", "bxM7UNwT"));
                P2(false);
                return;
            case R.id.layout_all /* 2131363031 */:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2 = this.M;
                if (aVar2 != null && (F0 = aVar2.F0()) != null) {
                    F0.c1();
                    return;
                }
                return;
            case R.id.llRecentAdd /* 2131363067 */:
                if (this.M != null) {
                    RecentAddedActivity.a aVar3 = RecentAddedActivity.f26850l0;
                    String p10 = ea.a.p("IHIGbQ9oGm1l", "OgFiPuy7");
                    String str = this.M.f28014t0;
                    switch (str.hashCode()) {
                        case 79058:
                            if (str.equals(ea.a.p("H0RG", "XKZ8Ym3d"))) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 79444:
                            if (str.equals(ea.a.p("H1BU", "QigxZ3Gw"))) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 2670346:
                            if (str.equals(ea.a.p("GE9jRA==", "ztvLZgU6"))) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 66411159:
                            if (str.equals(ea.a.p("IVgnRUw=", "YUddiB9F"))) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 != 1) {
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    i10 = 0;
                                }
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                    } else {
                        i10 = 4;
                    }
                    aVar3.getClass();
                    startActivity(RecentAddedActivity.a.a(this, i10, p10));
                    tn.a.d(this, ea.a.p("W28mZQ==", "YESXHEd2"), ea.a.p("Wm8qZTdyKmMtbhJhUGQIY1RpMWs=", "bk2GhOL9"), this.M.f28014t0.toLowerCase(Locale.ROOT), false);
                    return;
                }
                return;
            case R.id.tv_ok_browse_pdf /* 2131364425 */:
                this.A1++;
                try {
                    dp.a a10 = dp.a.a();
                    String p11 = ea.a.p("J29cZVlSUmE-ZThIGm0NQVZ0B3YsdBwgHHAdbhJyLXc8ZWFkZg==", "LcJhsxPB");
                    a10.getClass();
                    dp.a.b(this, p11);
                    Intent intent = new Intent(ea.a.p("VW4DclZpAS4hbhJlWnR5YVt0O28nLnFFIF8yTx9UB05U", "e84g9eUD"));
                    intent.addCategory(ea.a.p("NG4pchlpVi4hbhJlWnR5Y1l0N2cmck8uO1A0ThBCDkU=", "Q9UMv2HG"));
                    intent.putExtra(ea.a.p("Lm5VchZpUy4zbj5lG3RGZU10HGFrTSxNP18OWWJFUw==", "sN8nzZ2z"), pdf.pdfreader.viewer.editor.free.utils.v.x());
                    intent.setType(ea.a.p("GS8q", "jjQ0ATMX"));
                    startActivityForResult(intent, 100);
                } catch (Exception e12) {
                    e12.printStackTrace();
                    dp.a.a().getClass();
                    dp.a.d(this, e12);
                    t1.c(ea.a.p("IHBUbjtyWHcpZRpkZg==", "4m8YjMKF"), e12);
                }
                AppOpenManager.c().f23907g = false;
                tn.a.b(this, ea.a.p("OGVKbV9zH2knbjkxMQ==", "GqH86lTA"), ea.a.p("WW85ZXYxHmcnXwVsXWNr", "cN1TGACq"));
                return;
            case R.id.tv_select_delete /* 2131364459 */:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar4 = this.M;
                if (aVar4 == null) {
                    return;
                }
                pdf.pdfreader.viewer.editor.free.ui.frag.n F04 = aVar4.F0();
                String t4 = aj.b.t(this.M.f28014t0);
                String G0 = this.M.G0();
                String p12 = ea.a.p("UGgkbwBl", "O5OnluKk");
                String p13 = ea.a.p("E2g7b0plJ2QtbAN0UV80bFFjaw==", "KZpT9xiw");
                StringBuilder k10 = a0.a.k(G0);
                k10.append(ea.a.p("Xw==", "q1l8fzWo"));
                k10.append(t4);
                tn.a.d(this, p12, p13, k10.toString(), false);
                if (F04 != null) {
                    ArrayList<PdfPreviewEntity> arrayList = F04.E0.f27213h;
                    if (arrayList.size() > 0) {
                        x xVar = new x(F04, arrayList);
                        y1(this);
                        if (this.D1 == null) {
                            this.D1 = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(this);
                        }
                        pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = this.D1;
                        hVar.getClass();
                        hVar.f23542t = xVar;
                        if (M1()) {
                            this.D1.show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case R.id.tv_select_merge /* 2131364460 */:
            case R.id.tv_select_share /* 2131364463 */:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar5 = this.M;
                if (aVar5 == null) {
                    return;
                }
                pdf.pdfreader.viewer.editor.free.ui.frag.n F05 = aVar5.F0();
                String t10 = aj.b.t(this.M.f28014t0);
                String G02 = this.M.G0();
                StringBuilder k11 = a0.a.k(G02);
                k11.append(ea.a.p("Xw==", "rJj1fsvr"));
                k11.append(t10);
                String sb2 = k11.toString();
                if (F05 != null) {
                    ArrayList<PdfPreviewEntity> arrayList2 = F05.E0.f27213h;
                    if (view.getId() == R.id.tv_select_share) {
                        pdf.pdfreader.viewer.editor.free.utils.e1.f(this, arrayList2);
                        tn.a.d(this, ea.a.p("LGhebwpl", "zT4kRtVc"), ea.a.p("UGgkbwBlPXMaYUZlNmM6aSdr", "qXemVija"), sb2, false);
                        return;
                    } else if (view.getId() == R.id.tv_select_merge) {
                        ArrayList arrayList3 = new ArrayList();
                        WeakReference weakReference = new WeakReference(this);
                        Handler handler = new Handler(Looper.getMainLooper());
                        tn.a.d(this, ea.a.p("LGhebwpl", "6JpZtsjV"), ea.a.p("EWgtbwllKG0tcgFla2M7aVtr", "qWrBzwZ8"), G02, false);
                        y1(this);
                        ea.a.p("KW8gZVNzJm8_IApvVWR3ZFFhPm9n", "9QAMsNMm");
                        if (this.M1 == null) {
                            this.M1 = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(this, false);
                        }
                        if (M1() && !this.M1.isShowing()) {
                            this.M1.show();
                            this.M1.a(R.string.arg_res_0x7f1303a8);
                        }
                        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new lm.b(this, arrayList2, weakReference, arrayList3, handler, 1));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case R.id.tv_select_remove /* 2131364462 */:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar6 = this.M;
                if (aVar6 != null && aVar6.f28000f0 != null && aVar6.i() != null && (F02 = aVar6.F0()) != null) {
                    int i11 = aVar6.f27998d0;
                    if (i11 == 201) {
                        tn.a.d(aVar6.i(), ea.a.p("LGhebwpl", "T3pjK8wC"), ea.a.p("LGhebwplaHI_bSV2EF8LbFxjaw==", "ZCKCwzLL"), ea.a.p("PWVSZRd0Xw==", "RwP8Mmyo").concat(aj.b.t(aVar6.f28014t0)), false);
                        ArrayList<PdfPreviewEntity> arrayList4 = F02.E0.f27213h;
                        if (arrayList4 != null && arrayList4.size() > 0) {
                            pdf.pdfreader.viewer.editor.free.ui.frag.e eVar = new pdf.pdfreader.viewer.editor.free.ui.frag.e(aVar6, F02, arrayList4);
                            if (aVar6.i() != null) {
                                aVar6.p0(aVar6.i());
                                if (aVar6.f28010p0 == null) {
                                    aVar6.f28010p0 = new u2(aVar6.i());
                                }
                                u2 u2Var = aVar6.f28010p0;
                                u2Var.getClass();
                                u2Var.f23542t = eVar;
                                aVar6.f28010p0.show();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (i11 == 202) {
                        tn.a.d(aVar6.i(), ea.a.p("EGgnbxhl", "7isHkYVf"), ea.a.p("K2gCbzZlLHItbQl2UV80bFFjaw==", "JZHmEs7I"), ea.a.p("XmE5a18=", "za4mn4Ve").concat(aj.b.t(aVar6.f28014t0)), false);
                        ArrayList<PdfPreviewEntity> arrayList5 = F02.E0.f27213h;
                        ArrayList<PdfPreviewEntity> arrayList6 = F02.F0;
                        if (arrayList5 != null && arrayList5.size() > 0 && arrayList6 != null && arrayList6.size() > 0) {
                            Iterator<PdfPreviewEntity> it = arrayList5.iterator();
                            while (it.hasNext()) {
                                PdfPreviewEntity next = it.next();
                                if (next != null && (indexOf = arrayList6.indexOf(next)) < arrayList6.size() && indexOf >= 0) {
                                    next.setFavorite(0);
                                    next.setFavoriteDate(System.currentTimeMillis());
                                    bm.c.b(F02.Y.get()).i(next);
                                    arrayList6.remove(indexOf);
                                    F02.E0.f27210e.remove(indexOf);
                                    F02.E0.notifyItemRemoved(indexOf);
                                }
                            }
                            if (F02.r() != null) {
                                j1.e(F02.r(), F02.r().getResources().getString(R.string.arg_res_0x7f1303df, F02.x(R.string.arg_res_0x7f13036f)), false, null, F02.H0());
                            }
                            wk.b.b().e(new qo.j());
                            F02.D0();
                        }
                        if (arrayList6.size() <= 0) {
                            z10 = false;
                        }
                        wk.b.b().e(new qo.c(z10, aVar6.f27998d0, aVar6.f28014t0, z10));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [pdf.pdfreader.viewer.editor.free.ui.act.i] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pdf.pdfreader.viewer.editor.free.ui.act.x] */
    /* JADX WARN: Type inference failed for: r9v0, types: [pdf.pdfreader.viewer.editor.free.ui.act.z] */
    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int a10;
        char c10;
        Intent intent;
        dp.a.a().getClass();
        dp.a.b(this, ea.a.p("YWE_ZTtlDnAXchRSDGEyZTZIXW0jQSB0JHYldEwgB25wci5hB2VYIA==", "ML5h4kDL") + this);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            this.C0 = intent2.hasExtra(ea.a.p("DGgOclNFG3QhdHk=", "hVxg7u3W"));
            this.D0 = intent2.getBooleanExtra(ea.a.p("WnMYaBJyB0kfYVNl", "ZrjnV0zl"), false);
            ea.a.p("J29cZVlvWUMoZSt0ECABbkFlAHQ9", "L44cZjyX");
            intent2.toString();
            ea.a.p("YyBXchZtPQ==", "4dmIilUp");
            intent2.getStringExtra(ea.a.p("Q2EsZSxmEG9t", "mm0j1vCJ"));
            z10 = intent2.getBooleanExtra(ea.a.p("HHMhZT50EHJ0", "YuusMqVR"), false);
            if (intent2.hasExtra(ea.a.p("X2ElZwZhBWUtclFjCGw6XypvRmkgaSBhQWknbi90V2c=", "5Hp6aFHX"))) {
                ReaderPdfApplication.f();
                pdf.pdfreader.viewer.editor.free.service.b.d();
                EventCenter.f28658e = ea.a.p("IW9FaQ==", "mNoMlmwZ");
                if (bundle == null) {
                    EventCenter.sendLanguageRecallClickEvent(this, intent2);
                }
            }
        } else {
            z10 = false;
        }
        boolean z15 = true;
        if (bundle == null && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.F0 = z11;
        ea.a.p("J29cZVlvWUMoZSt0ECABc2dlLXIgYRFlPQ==", "iXEofmyY");
        this.E0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c(new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.x
            @Override // cg.a
            public final Object invoke() {
                String str2 = ReaderHomeActivity.Y1;
                return ReaderHomeActivity.this.findViewById(R.id.tab_layout);
            }
        }, this.f26687t, this.f26690u, new pdf.pdfreader.viewer.editor.free.ui.act.y(this, 0), new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.z
            @Override // cg.a
            public final Object invoke() {
                String str2 = ReaderHomeActivity.Y1;
                ReaderHomeActivity.this.z2();
                return null;
            }
        }, new cg.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.i
            @Override // cg.a
            public final Object invoke() {
                boolean z16;
                if (ReaderHomeActivity.this.f26703y0.getVisibility() == 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                return Boolean.valueOf(z16);
            }
        });
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27669n.e(this, new androidx.lifecycle.x() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.j
            @Override // androidx.lifecycle.x
            public final void m(Object obj) {
                po.b bVar = (po.b) obj;
                String str2 = ReaderHomeActivity.Y1;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                readerHomeActivity.getClass();
                if (bVar != null && bVar.f28988a.b() && !readerHomeActivity.f19289b) {
                    readerHomeActivity.E0.f(readerHomeActivity);
                    pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c.f27668m.k(null);
                }
            }
        });
        this.E0.f27673g.f27693d = new ao.b(this, 1);
        if (!this.F0 && (intent = getIntent()) != null) {
            String stringExtra = intent.getStringExtra(ea.a.p("QmEMZSdmOm9t", "Pm2kxH3c"));
            if (TextUtils.equals(stringExtra, ea.a.p("P2FWZSZzR2w7c2g=", "EFUIWDKy"))) {
                tn.a.d(this, ea.a.p("PHBdYQpo", "RbsTZGmz"), ea.a.p("W28mZSxvDGMAZVV0ZQ==", "YeLSD8Ll"), wn.b.e(), false);
            }
            if (TextUtils.equals(stringExtra, ea.a.p("Q2EsZSxzEmwTc2g=", "1WT7yah2")) || TextUtils.equals(stringExtra, ea.a.p("Q2EsZSx3B2wRb1ll", "Sbyr8VGH")) || (TextUtils.equals(stringExtra, f26648l2) && intent.getIntExtra(f26646j2, 0) == 0)) {
                tn.a.b(this, ea.a.p("VWk5cwdfBGkeZWtzAW93", "0LGQ7KX3"), ea.a.p("W28mZSxvEmVu", "mhqWfx40"));
            }
        }
        if (this.N == null) {
            this.N = new pdf.pdfreader.viewer.editor.free.utils.g1<>(this);
        }
        wn.b.c();
        super.onCreate(bundle);
        if (Decoder.f18572a) {
            pd.a.c(this);
            try {
                String substring = rc.a.b(this).substring(462, 493);
                kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                Charset charset = kotlin.text.a.f19966b;
                byte[] bytes = substring.getBytes(charset);
                kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                byte[] bytes2 = "6c69666f726e6961311630140603550".getBytes(charset);
                kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                if (System.currentTimeMillis() % 2 == 0) {
                    int nextInt = rc.a.f29503a.nextInt(0, bytes.length / 2);
                    int i10 = 0;
                    while (true) {
                        if (i10 <= nextInt) {
                            if (bytes[i10] != bytes2[i10]) {
                                c10 = 16;
                                break;
                            }
                            i10++;
                        } else {
                            c10 = 0;
                            break;
                        }
                    }
                    if ((c10 ^ 0) != 0) {
                        rc.a.a();
                        throw null;
                    }
                } else if (!Arrays.equals(bytes2, bytes)) {
                    rc.a.a();
                    throw null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                rc.a.a();
                throw null;
            }
        } else {
            ReaderPdfApplication.o(this);
        }
        if (this.F != null && (a10 = pdf.pdfreader.viewer.editor.free.utils.extension.a.a(this)) > 0) {
            View view = this.F;
            kotlin.jvm.internal.g.e(view, "<this>");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = a10;
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
            ViewGroup viewGroup = this.C;
            l0 l0Var = new l0();
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(viewGroup, l0Var);
        }
        gl.b.f17914a.getClass();
        gl.b.a(this);
        EngineHelper engineHelper = EngineHelper.f15726a;
        String p10 = ea.a.p("W28mZTFvFnQdbXZhB24zcgV8Wm8rZQFvHnQjbQxhOW5WckI=", "jLNWo03v");
        engineHelper.getClass();
        EngineHelper.h(p10, this.f26677n1);
        EngineHelper.h(ea.a.p("eW8KZQljK24KYQhuUXIWfHBvP2UaY1duNmEfbjRyQg==", "Hl1gZJCp"), this.f26679o1);
        EngineHelper.h(ea.a.p("B29cZTVpRHQYYSRuEHIpfH1vA2UJaRZ0J2EcbgNyQg==", "VD2Kerfl"), this.f26681p1);
        gl.e eVar = gl.e.f17918a;
        gl.a aVar = new gl.a() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.k
            @Override // gl.a
            public final int a() {
                ArrayList<PdfPreviewEntity> arrayList = ReaderHomeActivity.this.U;
                if (arrayList != null) {
                    return arrayList.size();
                }
                return 0;
            }
        };
        eVar.getClass();
        gl.e.f17920d = aVar;
        this.f26669j1.a(this);
        NativeItemClickApiImpl nativeItemClickApiImpl = NativeItemClickApiImpl.f25884a;
        ((ArrayList) NativeItemClickApiImpl.f25885b.getValue()).add(this);
        if (!FileRepository.H && !FileRepository.J) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!z12) {
            ReaderPdfApplication.k().h(true);
        }
        if (!pdf.pdfreader.viewer.editor.free.utils.h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            ReaderPdfApplication.k().h(false);
        }
        System.currentTimeMillis();
        ReaderPdfApplication.f23865q = Process.myPid();
        mo.c.C0 = false;
        mo.c.D0 = false;
        String str2 = "";
        if (getIntent() == null) {
            str = "";
        } else {
            str = getIntent().getAction();
        }
        t1.b(ea.a.p("W28mZVNvDEMAZVV0DCA_bjBlXHRmYSB0DG89IHEg", "eSLmOxWr") + str);
        try {
            View currentFocus = getCurrentFocus();
            if (currentFocus != null) {
                Object systemService = getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "khMaqgTB"));
                if (systemService != null) {
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(currentFocus.getApplicationWindowToken(), 0);
                } else {
                    throw new TypeCastException(ea.a.p("NHUtbHZjKW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAueTFldmEmZDpvD2Qadj5lTy47bjl1Qm0RdBlvNS4Lbip1NU0zdCBvLE0HblVnMnI=", "ieZAVHOh"));
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (TextUtils.isEmpty(pdf.pdfreader.viewer.editor.free.utils.d.c)) {
            try {
                Properties properties = new Properties();
                try {
                    properties.load(getAssets().open(ea.a.p("UG8lZhpnTHAAb0RlG3Q_ZXM=", "gTFtSpp0")));
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
                if (properties.containsKey(ea.a.p("RWU5cxpvbg==", "zIotk0Pg"))) {
                    str2 = properties.getProperty(ea.a.p("QWUnczFvbg==", "zO7UXLrE"));
                }
                pdf.pdfreader.viewer.editor.free.utils.d.c = getPackageManager().getPackageInfo(getPackageName(), 0).versionName + str2;
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
        t1.b(pdf.pdfreader.viewer.editor.free.utils.d.c);
        U1();
        if (bundle != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        f26655s2 = z13;
        b.b.Z(this);
        ea.a.p("W28mZVNvDEMAZVV0DCAaYSpnR2EhZQ1hJWU9", "Heg0ZDPw");
        pdf.pdfreader.viewer.editor.free.utils.a0.c(this);
        pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new m0());
        HashSet hashSet = pdf.pdfreader.viewer.editor.free.utils.g0.f28699a;
        String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        pdf.pdfreader.viewer.editor.free.utils.i.a();
        new WeakReference(this);
        this.P = new ArrayList<>();
        this.Q = new ArrayList<>();
        this.R = new ArrayList<>();
        this.Q.add(getString(R.string.arg_res_0x7f130367));
        this.Q.add(getString(R.string.arg_res_0x7f1303d8));
        this.Q.add(getString(R.string.arg_res_0x7f130021));
        this.Q.add(getString(R.string.arg_res_0x7f1304d7));
        this.R.add(Integer.valueOf((int) R.drawable.pdf_ic_navigate_all_files_selector));
        this.R.add(Integer.valueOf((int) R.drawable.pdf_ic_navigate_recent_selector));
        this.R.add(Integer.valueOf((int) R.drawable.pdf_ic_navigate_bookmark_selector));
        this.R.add(Integer.valueOf((int) R.drawable.pdf_ic_navigate_tools_selector));
        this.f26665h0 = new ReaderActBroadCastReceiver<>(this);
        IntentFilter intentFilter = new IntentFilter(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpEm8TLg5yD2UdQQhUOk8sXz5Pd0ElXxRSC0F2QwdTF180QTVFN0MmT2BFRA==", "fahjlqwN"));
        intentFilter.addAction(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpHm85Lg1yF2VhQXJUME95XxZPCUE5XypSekEqQwRTMV8pTARTLl8_QQZO", "P3AujKkr"));
        intentFilter.addAction(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpP28KLldyN2VhQXJUME95XxZPCUE5XypSekEqQwRTMV8KQyxJZ0kGWRBEdFMtUnhZH0Q=", "43jpKx1R"));
        intentFilter.addAction(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpIm8lLh9yKGVhQXJUME95XxZPCUE5XypSekEqQwRTMV8CSBZOMlMSRgpFdUI4Q0s=", "dsWQVWyM"));
        intentFilter.addAction(ea.a.p("FWQwLgBkAHItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2VLQRVUOU8oXwRPJUF4XxVSd0EWQwhTYl85RTxPA1kdTCpXCUM8TzVF", "M3eVpfv7"));
        intentFilter.addAction(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpI28zLg1yPWUdQQhUOk8sXz5Pd0ElXxRSC0F2QwdTF18DTw5MOF8fVXpERQ==", "WAkXakc3"));
        intentFilter.addAction(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpBG8aLl9yJGUdQQhUOk8sXz5Pd0ElXxRSC0F2QwdTF18zSClOfkUeTHJODFUyR0U=", "ph9AElaS"));
        intentFilter.addAction(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpA29BLgFyIGVhQXJUME95XxZPCUE5XypSekEqQwRTMV81UnxXNEUXXwlJfUU=", "tdEbw3gE"));
        p1.a.a(this).b(this.f26665h0, intentFilter);
        n2();
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || (pdf.pdfreader.viewer.editor.free.utils.h1.c() && pdf.pdfreader.viewer.editor.free.utils.q0.l(this, -1, ea.a.p("WGUyXx1vFl8TbFhvHl8mZTZtbTEx", "iM12Bka8")) != -1)) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            B2();
        }
        ea.a.p("Om8nZVNvOkM6ZQd0USA7b1lkE2QLYVhuEXJRcyVhMHQ=", "9kRJsTA4");
        R2();
        o2(getIntent(), bundle);
        wn.b.f31386a.e(this, new pdf.pdfreader.viewer.editor.free.ui.act.u(this, 1));
        Boolean bool = Boolean.TRUE;
        androidx.lifecycle.w<Boolean> wVar = wn.b.f31394j;
        boolean equals = bool.equals(wVar.d());
        this.f26686s1 = equals;
        if (!equals && !this.F0) {
            tn.a.d(this, ea.a.p("IWVDbRlzRWknbjlyVXRl", "19Q1p6jv"), ea.a.p("P2VDbRBzRGk1bhVoGm0NX1puDXIgYRFl", "pImfuhed"), wn.b.e(), false);
        }
        wVar.e(this, new androidx.lifecycle.x() { // from class: pdf.pdfreader.viewer.editor.free.ui.act.l
            @Override // androidx.lifecycle.x
            public final void m(Object obj) {
                int i11;
                String str4 = ReaderHomeActivity.Y1;
                ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
                readerHomeActivity.getClass();
                if (((Boolean) obj).booleanValue()) {
                    ea.a.p("W28mZVNwB3IfaUdzAG84ICxhQVAjci5pJnM7b24=", "URYNBpBa");
                    readerHomeActivity.E0.f27674h.a();
                    pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                    String p11 = ea.a.p("WnMUZhpyEXQtc1V2DF8mZTZtW3M1aSxuGnQnbWU=", "EN5l4ObJ");
                    SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                    boolean z16 = false;
                    if (sharedPreferences.getBoolean(p11, true)) {
                        sharedPreferences.edit().putBoolean(ea.a.p("JnNuZhByRHQFcyt2EF8YZUdtB3M2aQpuMXQ-bWU=", "rAiFnWij"), false).apply();
                        eo.e.q(readerHomeActivity, 0);
                        eo.e.n(readerHomeActivity, 0);
                        eo.e.s(readerHomeActivity, 0);
                        eo.e.r(readerHomeActivity, 0);
                    }
                    if (!readerHomeActivity.f26686s1) {
                        if (readerHomeActivity.D0) {
                            ImageAdjustActivity.a aVar2 = ImageAdjustActivity.f25741u0;
                            String p12 = ea.a.p("PGhQcmU=", "nmZcEDvh");
                            String p13 = ea.a.p("QGgqcmU=", "8gbMwC0i");
                            aVar2.getClass();
                            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZpWmc=", "VFe1spkd"));
                            Intent intent3 = new Intent(readerHomeActivity, ImageAdjustActivity.class);
                            intent3.putExtra(ea.a.p("Q2EsZSxmEG8fMg==", "aYXEakWs"), ea.a.p("Q2EsZSxzCmEAZWtpBGExZQ==", "ir45ssAR"));
                            intent3.putExtra(ea.a.p("PG9Echpl", "TocjWzWV"), p12);
                            intent3.putExtra(ea.a.p("JnN3chZtY2gzcmQ=", "LRQcfx8P"), true);
                            intent3.putExtra(ea.a.p("VXIkbSx3DXIZZlhvdw==", "SF368ny7"), p13);
                            readerHomeActivity.startActivity(intent3);
                            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZpWmc=", "wAECDRAQ"));
                            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(readerHomeActivity);
                            readerHomeActivity.O0 = 3;
                            readerHomeActivity.D0 = false;
                            readerHomeActivity.getIntent().removeExtra(ea.a.p("XXMdaClyA0klYQFl", "674NHfD8"));
                        }
                        readerHomeActivity.f26686s1 = true;
                        tn.a.d(readerHomeActivity, ea.a.p("P2VDbRBzRGk1bhVyFHRl", "PCFuBLmV"), ea.a.p("Q2U5bRpzEWkdbmtkBm5l", "irXszT40"), wn.b.e(), false);
                        gl.e.f17918a.getClass();
                        if (gl.e.c() && dl.a.a(readerHomeActivity)) {
                            readerHomeActivity.W = false;
                            gl.e.a(readerHomeActivity);
                        }
                        readerHomeActivity.R2();
                    }
                    if (pdf.pdfreader.viewer.editor.free.utils.h1.c() && (i11 = readerHomeActivity.f26692u1) != 0) {
                        if (i11 == 1) {
                            tn.a.b(readerHomeActivity, ea.a.p("BGUibQBzGWknbjkxMQ==", "hWtPijK9"), ea.a.p("Q2U5bRpzEWkdbmsxWF8ybypl", "WCS7rjtd"));
                        } else if (i11 == 2) {
                            tn.a.b(readerHomeActivity, ea.a.p("M2VGbRtzG2knbjkxMQ==", "7fC4rhvO"), ea.a.p("J29cZUgxaGQ1bmU=", "1KxYytFb"));
                        } else if (i11 == 3) {
                            tn.a.b(readerHomeActivity, ea.a.p("P2VDbRBzRGk1bhUxMQ==", "WQ1DrQdI"), ea.a.p("UG8gZXYxZm4ndA9jUV8zb1Zl", "F18MG9Lr"));
                        }
                        readerHomeActivity.f26692u1 = 0;
                        readerHomeActivity.A2();
                    }
                    ConstraintLayout constraintLayout = readerHomeActivity.f26666i0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    if (FileRepository.H || FileRepository.J) {
                        z16 = true;
                    }
                    if (!z16) {
                        ReaderPdfApplication.k().h(true);
                    }
                    readerHomeActivity.O2(102, 0L);
                    readerHomeActivity.O.post(new n(readerHomeActivity, 1));
                    return;
                }
                ea.a.p("W28mZVNwB3IfaUdzAG84ICpvYmU0bSpzKmlXbg==", "Y8YteS1H");
                readerHomeActivity.F2();
            }
        });
        if (bundle != null) {
            N2(bundle.getInt(f26637a2));
            int i11 = bundle.getInt(f26641e2, -1);
            boolean z16 = bundle.getBoolean(f26642f2, false);
            this.R1 = i11;
            this.S1 = z16;
            boolean z17 = bundle.getBoolean(f26643g2, false);
            if (i11 != -1 && z17) {
                this.O.postDelayed(new pdf.pdfreader.viewer.editor.free.ui.act.f0(this), 500L);
            }
        } else {
            pp.a.b(this);
            pp.a.c(this);
            if (pdf.pdfreader.viewer.editor.free.utils.t0.f28778k == null) {
                try {
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction(ea.a.p("WG5dciNpNC4hbhJlWnR5YVt0O28nLnRBIFQ0UghfAUh4Tn5FRA==", "xq99LPx7"));
                    intentFilter2.addAction(ea.a.p("EG4IciZpPS4hbhJlWnR5YVt0O28nLmJJOUUuVBhDSw==", "dWqlIYN4"));
                    intentFilter2.addAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhdJHkVsT3tFKkN7QQVHNkQ=", "S65ujsTh"));
                    TimeReceiver timeReceiver = new TimeReceiver();
                    pdf.pdfreader.viewer.editor.free.utils.t0.f28778k = timeReceiver;
                    registerReceiver(timeReceiver, intentFilter2);
                } catch (Exception e14) {
                    e14.printStackTrace();
                    pdf.pdfreader.viewer.editor.free.utils.t0.f28778k = null;
                }
            }
        }
        if (!this.F0) {
            yn.d.d(this);
        }
        wn.b.a(true, false);
        StorageFileObserver.e(this);
        String str4 = NativeSoLoaderHelper.f1933a;
        Integer d10 = NativeSoLoaderHelper.f1942k.d();
        if (d10 == null || d10.intValue() != 0) {
            z15 = false;
        }
        if (z15) {
            NativeSoLoaderHelper.Companion.f(this, false, null);
        }
        if (wn.b.f31389e) {
            if (AppCoreFilterEvent.f28650a == AppOpenSource.Desk) {
                AppCoreFilterEvent.h(ea.a.p("W28mZSxvDGMAZVV0DF8waTZzRl8iZTBr", "JaHTsP8s"));
            } else if (AppCoreFilterEvent.f28650a == AppOpenSource.Share) {
                AppCoreFilterEvent.h(ea.a.p("J29cZSZvWWMoZSt0EF8OaUdzGl8xaAxyZA==", "K8ic1Lie"));
            }
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        t1.b(ea.a.p("EG8lZXRvCEQtcxJyW3k=", "3xxHTffC"));
        f26644h2 = false;
        wk.b.b().k(this);
        t1.b(ea.a.p("W28mZVNvDEQXc0ByBnl2bQhvVWcjZAZ2KG4dIAdhAnNWLGttP28FZxdkem8vaTplAXZXbjIgJWEhc2U=", "MianIkgn"));
        mo.c.C0 = false;
        mo.c.D0 = false;
        pdf.pdfreader.viewer.editor.free.utils.g1<ReaderHomeActivity> g1Var = this.N;
        if (g1Var != null) {
            g1Var.removeCallbacksAndMessages(null);
        }
        if (!this.f19297k) {
            pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new c6.b(7));
            EventCenter.a.f28669a = false;
        }
        FullScreenManage.g(2);
        pdf.pdfreader.viewer.editor.free.ui.dialog.w wVar = this.f26697w0;
        if (wVar != null && wVar.isShowing()) {
            this.f26697w0.dismiss();
            this.f26697w0 = null;
        }
        Handler handler = this.O;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (this.f26665h0 != null) {
            p1.a.a(this).d(this.f26665h0);
        }
        q2();
        no.f.b(this).getClass();
        try {
            if (no.f.f22625p != null) {
                no.f.f22625p = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (!f26654r2) {
            gl.b.f17914a.getClass();
            gl.b.a(this);
        }
        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = this.f26689t1;
        if (a1Var != null) {
            a1Var.b();
            this.f26689t1 = null;
        }
        super.onDestroy();
        aj.b.f572t = null;
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        d0 observer = this.f26673l1;
        kotlin.jvm.internal.g.e(observer, "observer");
        pdf.pdfreader.viewer.editor.free.observer.a aVar2 = StorageFileObserver.f25899a;
        ((List) StorageFileObserver.f25905h.getValue()).remove(observer);
        EngineHelper engineHelper = EngineHelper.f15726a;
        String p10 = ea.a.p("J29cZTtvQ3Q1bQhhG24NcnR8Bm8oZSdvTHRcbRhhBm4qckI=", "CRuF83Zh");
        engineHelper.getClass();
        LinkedHashMap linkedHashMap = EngineHelper.f15732h;
        linkedHashMap.remove(p10);
        linkedHashMap.remove(ea.a.p("PG8YZSNjWG4KYQhuUXIWfHBvP2UaY1duNmEfbjRyQg==", "TYtup98K"));
        linkedHashMap.remove(ea.a.p("Pm8rZT1pRXQKYQhuUXIWfHBvP2UFaUV0NmEfbjRyQg==", "bcvFq6m6"));
        gl.e.f17918a.getClass();
        gl.e.f17920d = null;
        this.f26669j1.l();
        NativeItemClickApiImpl nativeItemClickApiImpl = NativeItemClickApiImpl.f25884a;
        ((ArrayList) NativeItemClickApiImpl.f25885b.getValue()).remove(this);
        ((Set) EventCenter.f28665l.getValue()).clear();
        ((Set) EventCenter.f28666m.getValue()).clear();
        setIntent(null);
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onEventBottomButtons(qo.n nVar) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
        if (aVar != null && !this.f19289b) {
            aVar.A0();
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(qo.b bVar) {
        LinearLayout linearLayout;
        if (bVar == null || this.f19289b) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ea.a.p("W28mZVNzFWkCZWZlD3IzcyxMU3kpdTcgeW8DRRJlIHR-YSJuJ2gQZRNkOg==", "YmdNSUoN"));
        boolean z10 = bVar.f29392a;
        sb2.append(!z10);
        t1.b(sb2.toString());
        boolean z11 = !z10;
        P2(z11);
        if (z10) {
            p2();
        }
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
        if (aVar != null) {
            if (!z11) {
                aVar.K0(aVar.f28014t0);
            }
            if (z10 || (linearLayout = this.f26691u0) == null) {
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        t1.b(ea.a.p("J29cZVlwRW85ZTlzN2ELa35lFyAqbi5lMEQhd24=", "U4ytINR4"));
        if (keyEvent.getKeyCode() == 4) {
            t1.b(ea.a.p("W28mZVNwEG8RZUdzK2E1aw9lSyANRRpDI0QXX3JBEUs=", "lR0RxtOo"));
            if (this.f26693v.getVisibility() == 0) {
                t2();
                t1.b(ea.a.p("J29cZVlzQGkqZRhlE3INc11MD3kqdREgR3A4byllJHMNYVJrMmVOOjxhJnNl", "xuTMgJJW"));
                P2(false);
                return true;
            } else if (this.f26703y0.getVisibility() == 0) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = this.E0;
                if (cVar == null) {
                    return true;
                }
                cVar.f27678l.a();
                c.a.a(this.E0.f27678l);
                return true;
            } else {
                t1.b(ea.a.p("DG8LZW9wBW8rZRVzdmE0a3NlKyAqYVggEmkfaSJo", "qYdfOwuq"));
                ReaderPdfApplication.j();
                t1.b(ea.a.p("PW9VZUJwMW8rZRVzdmE0a3NlKyAvaVhpB2g=", "yuU8bCHT"));
                wn.b.f(true);
                wn.b.f31392h = false;
                wn.b.f31391g = false;
                wn.b.f31389e = false;
                wn.b.f31388d = false;
                PdfReaderOpenDefaultDialog.J.getClass();
                PdfReaderOpenDefaultDialog.K = false;
                gl.h.f17923a.getClass();
                gl.h.b(this);
                gl.e.f17918a.getClass();
                gl.e.a(this);
                finish();
                return super.onKeyDown(i10, keyEvent);
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017b  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNewIntent(android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        f26654r2 = false;
        ea.a.p("Km8eZRZvKVApdRVlLg==", "HXBs6Gel");
        super.onPause();
        if (1 == this.B1) {
            this.B1 = 2;
        }
        Boolean.TRUE.equals(wn.b.f31394j.d());
        gl.h.f17923a.getClass();
        gl.i.f17925o.l();
        gl.j.f17926o.l();
        gl.b.f17914a.getClass();
        gl.c.f17916o.l();
        gl.d.f17917o.l();
        gl.e.f17918a.getClass();
        gl.f.f17921p.h();
        gl.g.f17922p.h();
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onRefreshToolBarEvent(qo.f fVar) {
        if (fVar == null || this.f26704y1 == 3) {
            return;
        }
        boolean h10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this);
        int i10 = fVar.f29399a;
        Window window = getWindow();
        if (window != null) {
            if (i10 == R.color.colorPrimary) {
                pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, !h10);
            } else {
                pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
            }
        }
        int i11 = fVar.f29400b;
        if (h10) {
            j2(0);
        } else {
            j2(i11);
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_select_back);
        if (i10 != 0 && imageView != null) {
            imageView.setImageResource(R.drawable.ic_home_arrow);
            i2(imageView, i11);
        }
        TextView textView = this.f26705z;
        if (textView != null) {
            if (i11 == 0) {
                textView.setTextColor(getResources().getColor(R.color.colorSurface));
            } else {
                textView.setTextColor(getResources().getColor(R.color.white));
            }
        }
        TextView textView2 = this.f26688t0;
        if (textView2 != null) {
            if (i11 == 0) {
                textView2.setTextColor(getResources().getColor(R.color.colorSurface));
            } else {
                textView2.setTextColor(getResources().getColor(R.color.white));
            }
        }
        CheckBox checkBox = this.I;
        if (checkBox != null) {
            if (i11 == 0) {
                checkBox.setBackgroundResource(R.drawable.ic_checkbox_selector_red);
            } else {
                checkBox.setBackgroundResource(R.drawable.ic_checkbox_selector);
            }
        }
        View view = this.f26683r0;
        if (view != null) {
            if (i11 != 0 && !h10) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        i2(this.f26672l0, i11);
        i2(this.f26674m0, i11);
        i2(this.f26668j0, i11);
        g2(i11);
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        t1.b(ea.a.p("L28DZRdvLFItcRNlR3QHZUptO3M6aVluB1IUcyRsNiB2MV8x", "LfGn7B1X"));
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 1) {
            t1.b(ea.a.p("Gm8CZWdvL1ItcRNlR3QHZUptO3M6aVluB1IUcyRsNiBAMjI=", "HUroGAM1"));
            AppOpenManager.c().f23907g = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                if (!this.E0.f27674h.f27686f) {
                    tn.a.b(this, ea.a.p("PGUDbVtzMWknbjkxMA==", "1xLq2BCq"), ea.a.p("P2VDbRBzRGk1bnswKnMRc2pkAW5l", "upDNAxLI"));
                }
                t1.b(ea.a.p("J29cZVlvWVI_cT9lBnQ4ZUdtB3M2aQpuQlIpczdsBCAoclBuDWVk", "fC2i1LBp"));
                O2(102, 0L);
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f fVar = this.E0.f27674h;
                if (fVar.f27685e) {
                    if (fVar.f27686f) {
                        tn.a.b(this, ea.a.p("Q2U5bRpzEWkdbmsxMA==", "SX44yuuP"), ea.a.p("P2VDbRBzRGk1bntfRDA3ZFpuZQ==", "sFxVlVNu"));
                        return;
                    }
                    return;
                }
                tn.a.b(this, ea.a.p("P2VDbRBzRGk1bhUxMA==", "K8ymsvJC"), ea.a.p("Q2U5bRpzEWkdbgZfDW84ZQ==", "6B0ZtFs8"));
                return;
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = this.E0;
            cVar.f27674h.f28987b = Boolean.TRUE;
            cVar.g(this, pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f.class);
            t1.b(ea.a.p("W28mZVMgDW4gZUV1DHMiUCFyX2k1cypvPXM1ZQV1GnQTbiR0U2cQYRx0UWQ=", "SgvvMhIP"));
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (f26644h2) {
            f26644h2 = false;
            if (!dl.a.a(this)) {
                o9.d.f22759b = ea.a.p("RA==", "ZtX9BYq0");
                gl.b.f17914a.getClass();
                gl.b.b();
            }
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f19297k = false;
        androidx.activity.s.y0(this);
        gl.h.f17923a.getClass();
        gl.i.f17925o.m();
        gl.j.f17926o.m();
        gl.b bVar = gl.b.f17914a;
        bVar.getClass();
        gl.c.f17916o.m();
        gl.d.f17917o.m();
        gl.e.f17918a.getClass();
        gl.f.f17921p.i();
        gl.g.f17922p.i();
        if (pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
            this.L0 = true;
        } else if (this.L0) {
        } else {
            s2();
            if (this.E1) {
                bVar.getClass();
                gl.b.b();
                this.E1 = false;
            }
            y2();
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onSaveInstanceState(Bundle bundle) {
        boolean z10;
        this.f19297k = true;
        bundle.putInt(f26637a2, this.f26704y1);
        bundle.putInt(f26641e2, this.R1);
        bundle.putBoolean(f26642f2, this.S1);
        if (this.R1 != -1) {
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = this.X1;
            if (rVar != null && rVar.isShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bundle.putBoolean(f26643g2, true);
            }
        }
        ea.a.p("MG8JZUxzKGwtYxIgQGE1SVZkN3g9", "3FXdlMN9");
        if (this.I0) {
            this.I0 = false;
            f26651o2 = true;
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onStart() {
        super.onStart();
        t1.b(ea.a.p("J29cZVlvWVMuYTh0", "2rpAkTkM"));
        if (this.f26660c1 != null) {
            BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
            aVar.getClass();
            if (BaseSubscriptionActivity.M) {
                aVar.getClass();
                BaseSubscriptionActivity.M = false;
                return;
            }
            this.f26660c1.d();
        }
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
                this.J0 = true;
                return;
            }
            if (this.K0) {
                this.K0 = false;
                F2();
            }
            if (this.L0) {
                this.L0 = false;
                s2();
            }
        }
    }

    public final void p2() {
        if (this.H != null && pdf.pdfreader.viewer.editor.free.utils.h1.c() && this.U.isEmpty() && !pdf.pdfreader.viewer.editor.free.utils.q0.f(this, "key_hide_browse_pdf", false) && !f26650n2) {
            ConstraintLayout constraintLayout = this.f26666i0;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout2 = this.f26666i0;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        }
    }

    public final void q2() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar;
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar2;
        pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = this.D1;
        if (hVar != null && hVar.isShowing()) {
            this.D1.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.h1 h1Var = this.T;
        if (h1Var != null && h1Var.isShowing()) {
            this.T.cancel();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.M1;
        if (dVar != null && dVar.isShowing()) {
            this.M1.cancel();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar3 = this.L1;
        if (cVar3 != null && cVar3.isShowing()) {
            this.L1.cancel();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = this.X1;
        if (rVar != null && rVar.isShowing()) {
            this.X1.dismiss();
            this.X1 = null;
        }
        CreatePDFDialog createPDFDialog = this.f26700x0;
        if (createPDFDialog != null && createPDFDialog.isShowing()) {
            this.f26700x0.dismiss();
            this.f26700x0 = null;
        }
        if ((pdf.pdfreader.viewer.editor.free.utils.extension.c.f(this) || (cVar2 = this.E0) == null || !cVar2.f27674h.d()) && (cVar = this.E0) != null) {
            for (po.a aVar = cVar.f28986a; aVar != null; aVar = aVar.f28986a) {
                if (aVar.d()) {
                    aVar.a();
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void r2(int i10, Intent intent) {
        char c10;
        this.N1 = false;
        ea.a.p("RGkvZxZ0PXQTZw==", "eajV7yqG");
        ea.a.p("ImkecBl0DGgfaQJnUXRtIA==", "gwFmxo9y");
        pdf.pdfreader.viewer.editor.free.ads.l.m().g();
        if (pdf.pdfreader.viewer.editor.free.ads.l.m().g()) {
            this.N1 = true;
            return;
        }
        String stringExtra = intent.getStringExtra(ea.a.p("Q2EsZSx0bw==", "hvdBJo5L"));
        ea.a.p("OGlVZxx0aHQ7Zw==", "dg4TMZtr");
        ea.a.p("DWkecBJ0JmgfaQJnUXRtIEhhNWUdbw==", "YAimsEpq");
        a.C0330a c0330a = new a.C0330a();
        boolean isEmpty = TextUtils.isEmpty(stringExtra);
        Handler handler = this.O;
        int i11 = -1;
        if (!isEmpty) {
            switch (stringExtra.hashCode()) {
                case -2143336437:
                    if (stringExtra.equals(ea.a.p("Q2EsZSxoDW0XX0ZlCmU4dA==", "S8r1EtO1"))) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1960861064:
                    if (stringExtra.equals(ea.a.p("P2FWZSZ3XmQ9ZT5fHG0PMkVkZg==", "NLmggYrx"))) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1028927144:
                    if (stringExtra.equals(ea.a.p("AWFRZRdzMGE6Y2g=", "8Vq6HULH"))) {
                        c10 = '\f';
                        break;
                    }
                    c10 = 65535;
                    break;
                case -812218008:
                    if (stringExtra.equals(ea.a.p("Q2EsZSx3C2QVZUBfGmM3bnZwVmY=", "eFQ3ZQjS"))) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 149448458:
                    if (stringExtra.equals(ea.a.p("P2FWZSZoWG0_XytsGV8OaVll", "vKMedRcQ"))) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 356973286:
                    if (stringExtra.equals(ea.a.p("NmE2ZSpoWG0tXwRvW2s6YUpr", "ftFQu7YD"))) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 753235130:
                    if (stringExtra.equals(ea.a.p("Q2EsZSxoDW0XX0NvG2Q=", "Kxd95mWw"))) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1360097445:
                    if (stringExtra.equals(ea.a.p("P2FWZSZoWG0_XzljB2UNbmpwHGUzaQB3", "tp8zRAfB"))) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1505950069:
                    if (stringExtra.equals(ea.a.p("P2FWZSZ3XmQ9ZT5fEGQBdA==", "23hYMinW"))) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1859083015:
                    if (stringExtra.equals(ea.a.p("Q2EsZSxoDW0XX1F4CmVs", "9c8yfpSk"))) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1872679467:
                    if (stringExtra.equals(ea.a.p("Q2EsZSxoDW0XX0BvBmxz", "joSQVcMN"))) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1963953474:
                    if (stringExtra.equals(ea.a.p("P2FWZSZoWG0_XzpkZg==", "24X4fnE2"))) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1963953860:
                    if (stringExtra.equals(ea.a.p("AGEiZSxoB20tXxZwdA==", "q2pEsh3A"))) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i10 = 1;
                    break;
                case 1:
                    i10 = 2;
                    break;
                case 2:
                    i10 = 3;
                    break;
                case 3:
                    i10 = 0;
                    break;
                case 4:
                    i10 = 0;
                    i11 = 1;
                    break;
                case 5:
                    i10 = 0;
                    i11 = 2;
                    break;
                case 6:
                    i10 = 0;
                    i11 = 3;
                    break;
                case 7:
                    i10 = 0;
                    i11 = 4;
                    break;
                case '\b':
                    c0330a.f24024a = 291;
                    A(c0330a);
                    i10 = -1;
                    break;
                case '\t':
                    c0330a.f24024a = 265;
                    A(c0330a);
                    i10 = -1;
                    break;
                case '\n':
                    ImageConvertDataRepository.f26536a.getClass();
                    ImageConvertDataRepository.f();
                    int i12 = CameraActivity.H0;
                    CameraActivity.a.a(this, ea.a.p("RGkvZxZ0", "t01EUVnj"), ea.a.p("PGNQbhdlRTIqZGY=", "DgbGztfI"), false, true);
                    i10 = -1;
                    break;
                case 11:
                    handler.post(new pdf.pdfreader.viewer.editor.free.ui.act.o(this, 0));
                    AppOpenManager.c().f();
                    return;
                case '\f':
                    Intent intent2 = new Intent(this, ReaderSearchActivity.class);
                    intent2.putExtra(ea.a.p("WGUyXwBlA3IRaGtmG29t", "59ig9fBQ"), f26648l2);
                    startActivity(intent2);
                    AppOpenManager.c().f();
                    return;
            }
        }
        t1.b(ea.a.p("YWUqZBZyKm8fZXVjHWkgaTB5EmgpbSYgNmUrYURsM1BccyJ0Gm8MOg==", "RM1G5CDS") + i10 + ea.a.p("byBBYR5lY28g", "koIsDZTf") + stringExtra);
        handler.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.e(i10, this, i11, 1));
        handler.post(new u5.a(8));
    }

    @wk.i
    public void refreshPDFFiles(qo.d dVar) {
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar;
        boolean z10;
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2;
        boolean z11;
        t1.b(ea.a.p("Im8eZRdxR2U6eUZyUWR3cEpvIGU6cxZyEWYDZSJoEkQMRhpsUnMSIGgxVzEFMXdzU2kiUyBsU24AUxJhP1crdCJNFnJQZX1yG3AKaUA6", "9pJs72YM") + f26656t2);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) && this.f26686s1) {
            if (f26655s2) {
                f26655s2 = false;
                if (!this.G1 && (aVar2 = this.M) != null) {
                    SmartRefreshLayout smartRefreshLayout = aVar2.f28011q0;
                    if (smartRefreshLayout != null) {
                        if (smartRefreshLayout.f15945w0 == RefreshState.Refreshing) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            smartRefreshLayout.f15941u0.postDelayed(new xb.c(smartRefreshLayout, 0, Boolean.FALSE), 200);
                        }
                    }
                    aVar2.f28012r0 = true;
                }
            } else if (f26656t2) {
                if (!this.G1 && (aVar = this.M) != null) {
                    SmartRefreshLayout smartRefreshLayout2 = aVar.f28011q0;
                    if (smartRefreshLayout2 != null) {
                        if (smartRefreshLayout2.f15945w0 == RefreshState.Refreshing) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            smartRefreshLayout2.f15941u0.postDelayed(new xb.c(smartRefreshLayout2, 0, Boolean.FALSE), 200);
                        }
                    }
                    aVar.f28012r0 = true;
                }
            } else {
                t1.b(ea.a.p("W28mZVNxF2UAeRRyDGR2cDZvQGU1c2NyNmYUZTdoEUR1RiJsFnNCICA=", "SfDAqEsh"));
                if (dVar != null && TextUtils.equals(dVar.f29396a, ea.a.p("dVIETSxCI0M5X2BPNkYZUgFHYE8TTkQ=", "u0msQb95"))) {
                    ReaderPdfApplication.f23856h = true;
                }
                this.N.sendEmptyMessage(1);
            }
        }
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void refreshScanNB(al.a aVar) {
        ea.a.p("MGQiZRh0", "7CqvkKKn");
        ea.a.p("HWVSZRB2UnJ6Tg9UIk86SxVTO0MGRTZTRGIjZyZuamwgYVUgCmNWbnpOK3Qcdg0gd2EAbiBy", "NQtthFOJ");
        if (BillingConfigImpl.c.w()) {
            return;
        }
        dl.a aVar2 = a.C0199a.f16264a;
        if (dl.a.a(this)) {
            aVar2.b(this, u2());
        } else if (!this.U.isEmpty()) {
            gl.e.f17918a.getClass();
            gl.e.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s2() {
        /*
            Method dump skipped, instructions count: 940
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.s2():void");
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void savePdfChangeState(qo.l lVar) {
        q2();
    }

    public final void t2() {
        try {
            pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
            if (aVar != null) {
                aVar.getClass();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final LinearLayout u2() {
        ViewGroup viewGroup;
        pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = this.M;
        if (aVar != null && (viewGroup = aVar.f28013s0) != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.f26694v0;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        boolean a10 = dl.a.a(this);
        ea.a.p("Fk1U", "AXhsve6j");
        ea.a.p("AjJgNVw-UD52Plg-CmkkU1BvJVMqYVhBED0=", "MH3Qbni9");
        if (a10) {
            no.f.b(this).getClass();
            if (no.f.f()) {
                String a11 = bp.a.a(this);
                if (TextUtils.equals(a11, ea.a.p("Qg==", "gGtjZSzC"))) {
                    LinearLayout linearLayout = this.f26661d0;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    View view = this.f26662e0;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    LinearLayout linearLayout2 = this.f26659c0;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    LinearLayout linearLayout3 = this.f26664g0;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    View view2 = this.f26663f0;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    return this.f26661d0;
                } else if (TextUtils.equals(a11, ea.a.p("Qw==", "qDvTJa7V"))) {
                    LinearLayout linearLayout4 = this.f26661d0;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(8);
                    }
                    View view3 = this.f26662e0;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    LinearLayout linearLayout5 = this.f26659c0;
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(0);
                    }
                    LinearLayout linearLayout6 = this.f26664g0;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                    }
                    View view4 = this.f26663f0;
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                    return this.f26659c0;
                } else {
                    LinearLayout linearLayout7 = this.f26661d0;
                    if (linearLayout7 != null) {
                        linearLayout7.setVisibility(8);
                    }
                    View view5 = this.f26662e0;
                    if (view5 != null) {
                        view5.setVisibility(8);
                    }
                    LinearLayout linearLayout8 = this.f26659c0;
                    if (linearLayout8 != null) {
                        linearLayout8.setVisibility(8);
                    }
                    LinearLayout linearLayout9 = this.f26664g0;
                    if (linearLayout9 != null) {
                        linearLayout9.setVisibility(0);
                    }
                    View view6 = this.f26663f0;
                    if (view6 != null) {
                        view6.setVisibility(0);
                    }
                    return this.f26664g0;
                }
            }
            LinearLayout linearLayout10 = this.f26661d0;
            if (linearLayout10 != null) {
                linearLayout10.setVisibility(8);
            }
            View view7 = this.f26662e0;
            if (view7 != null) {
                view7.setVisibility(8);
            }
            LinearLayout linearLayout11 = this.f26659c0;
            if (linearLayout11 != null) {
                linearLayout11.setVisibility(8);
            }
            LinearLayout linearLayout12 = this.f26664g0;
            if (linearLayout12 != null) {
                linearLayout12.setVisibility(0);
            }
            View view8 = this.f26663f0;
            if (view8 != null) {
                view8.setVisibility(0);
            }
            return this.f26664g0;
        }
        LinearLayout linearLayout13 = this.f26661d0;
        if (linearLayout13 != null) {
            linearLayout13.setVisibility(8);
        }
        View view9 = this.f26662e0;
        if (view9 != null) {
            view9.setVisibility(8);
        }
        LinearLayout linearLayout14 = this.f26659c0;
        if (linearLayout14 != null) {
            linearLayout14.setVisibility(0);
        }
        LinearLayout linearLayout15 = this.f26664g0;
        if (linearLayout15 != null) {
            linearLayout15.setVisibility(8);
        }
        View view10 = this.f26663f0;
        if (view10 != null) {
            view10.setVisibility(8);
        }
        return this.f26659c0;
    }

    public final void w2(qo.g gVar) {
        tf.c cVar = FullScreenManage.f23914a;
        boolean c10 = FullScreenManage.c(2, this, false);
        if (gVar == null) {
            return;
        }
        f26652p2 = gVar;
        if (c10 && BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTmkxZQhDK2kpawd1FGwOZBFzEW93", "lyLZGJAx");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            C2();
        } else if (c10) {
            String p11 = ea.a.p("H0RG", "fVNeBfLV");
            PdfPreviewEntity pdfPreviewEntity = gVar.f29402b;
            if (TextUtils.equals(p11, pdfPreviewEntity.getOtherStrOne()) && !TextUtils.isEmpty(pdfPreviewEntity.getPath())) {
                V1();
                pdf.pdfreader.viewer.editor.free.utils.w0.a().c.execute(new com.facebook.appevents.g(20, this, gVar));
                return;
            }
            S2();
        } else {
            C2();
        }
    }

    public final void x2() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = this.M1;
        if (dVar != null && dVar.isShowing()) {
            this.M1.cancel();
        }
    }

    public final void y2() {
        TabLayout tabLayout;
        TabLayout.g h10;
        View view;
        try {
            if (!pdf.pdfreader.viewer.editor.free.utils.q0.H(this) && (tabLayout = this.f26685s0) != null && (h10 = tabLayout.h(3)) != null && (view = h10.f12981e) != null) {
                view.findViewById(R.id.view_red_dot).setVisibility(8);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void z2() {
        this.N.removeCallbacks(this.q1);
        this.f26706z0.setVisibility(8);
        this.f26703y0.u();
    }

    @wk.i(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(qo.q qVar) {
        if (this.f19289b) {
            return;
        }
        this.f26678o0.setVisibility(8);
        TextView textView = this.f26705z;
        textView.setText(getString(R.string.arg_res_0x7f130416, "" + qVar.f29411a));
        if (qVar.f29411a >= qVar.f29412b) {
            this.I.setChecked(true);
        } else {
            this.I.setChecked(false);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements TabLayout.d {
        public h() {
            ReaderHomeActivity.this = r1;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void b(TabLayout.g gVar) {
            pdf.pdfreader.viewer.editor.free.ui.frag.n nVar;
            int i10;
            pdf.pdfreader.viewer.editor.free.ui.adapter.b0 b0Var;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            androidx.activity.s.y0(readerHomeActivity);
            int i11 = gVar.f12980d;
            readerHomeActivity.f26704y1 = i11;
            boolean z10 = false;
            if (i11 == 3) {
                readerHomeActivity.D.setVisibility(8);
                tn.a.b(readerHomeActivity, ea.a.p("W28mZQ==", "EeQmatcr"), ea.a.p("W28mZSx0DW8ec2tjBWk1aw==", "GbVBQScU"));
                readerHomeActivity.H.setCurrentItem(1);
                Window window = readerHomeActivity.getWindow();
                if (window != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerHomeActivity));
                }
                View view = readerHomeActivity.F;
                if (view != null) {
                    view.setBackgroundColor(androidx.core.content.a.getColor(readerHomeActivity, R.color.colorPrimaryContainer));
                }
                AppBarLayout appBarLayout = readerHomeActivity.G;
                if (appBarLayout != null) {
                    appBarLayout.setBackgroundColor(androidx.core.content.a.getColor(readerHomeActivity, R.color.colorPrimaryContainer));
                }
                View view2 = gVar.f12981e;
                if (view2 != null) {
                    view2.findViewById(R.id.view_red_dot).setVisibility(8);
                }
                pdf.pdfreader.viewer.editor.free.utils.q0.w(readerHomeActivity, "tools_red_dot_show_in_version_95", false);
                ToolsNewFragment toolsNewFragment = readerHomeActivity.L;
                if (toolsNewFragment != null && (b0Var = toolsNewFragment.f27952i0) != null) {
                    b0Var.notifyDataSetChanged();
                }
            } else {
                readerHomeActivity.D.setVisibility(0);
                readerHomeActivity.H.setCurrentItem(0);
                TabLayout tabLayout = readerHomeActivity.f26682q0;
                if (tabLayout != null) {
                    int selectedTabPosition = tabLayout.getSelectedTabPosition();
                    boolean h10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerHomeActivity);
                    if (selectedTabPosition != 1) {
                        if (selectedTabPosition != 2) {
                            if (selectedTabPosition != 3) {
                                if (selectedTabPosition != 4) {
                                    i10 = R.color.colorPrimary;
                                } else {
                                    i10 = R.color.colorPPT;
                                }
                            } else {
                                i10 = R.color.colorExcel;
                            }
                        } else {
                            i10 = R.color.colorWord;
                        }
                    } else {
                        i10 = R.color.colorPDF;
                    }
                    Window window2 = readerHomeActivity.getWindow();
                    if (window2 != null) {
                        if (i10 == R.color.colorPrimary) {
                            pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window2, !h10);
                        } else {
                            pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window2, false);
                        }
                    }
                    View view3 = readerHomeActivity.F;
                    if (view3 != null) {
                        view3.setBackgroundColor(androidx.core.content.a.getColor(readerHomeActivity, i10));
                    }
                    AppBarLayout appBarLayout2 = readerHomeActivity.G;
                    if (appBarLayout2 != null) {
                        appBarLayout2.setBackgroundColor(androidx.core.content.a.getColor(readerHomeActivity, i10));
                    }
                }
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                if (aVar != null) {
                    int i12 = readerHomeActivity.f26704y1;
                    ReaderViewPager readerViewPager = aVar.f28000f0;
                    int i13 = 200;
                    if (readerViewPager != null) {
                        int currentItem = readerViewPager.getCurrentItem();
                        if (i12 != 1) {
                            if (i12 == 2) {
                                i13 = 202;
                            }
                        } else {
                            i13 = 201;
                        }
                        aVar.f27998d0 = i13;
                        aVar.K0(aVar.f28014t0);
                        String E0 = pdf.pdfreader.viewer.editor.free.ui.frag.a.E0(currentItem);
                        if (aVar.f28011q0 != null) {
                            t1.b(ea.a.p("QHcicBZSB2YAZUdoJWEvbzF0EiAkbzd0XG0-eUZlJWhSbixlIWUEchdzXEwAcyIgNG9BaTJpLG46", "3j6fan2u") + i12);
                            SmartRefreshLayout smartRefreshLayout = aVar.f28011q0;
                            if (i12 == 0 && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(aVar.g0())) {
                                z10 = true;
                            }
                            smartRefreshLayout.B = z10;
                        }
                        if (currentItem != 0) {
                            if (currentItem != 1) {
                                if (currentItem != 2) {
                                    if (currentItem != 3) {
                                        if (currentItem == 4 && (nVar = aVar.f28007m0) != null) {
                                            nVar.e1(i13, E0);
                                            aVar.f28007m0.b1();
                                        }
                                    } else {
                                        pdf.pdfreader.viewer.editor.free.ui.frag.n nVar2 = aVar.f28006l0;
                                        if (nVar2 != null) {
                                            nVar2.e1(i13, E0);
                                            aVar.f28006l0.b1();
                                        }
                                    }
                                } else {
                                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar3 = aVar.f28005k0;
                                    if (nVar3 != null) {
                                        nVar3.e1(i13, E0);
                                        aVar.f28005k0.b1();
                                    }
                                }
                            } else {
                                pdf.pdfreader.viewer.editor.free.ui.frag.n nVar4 = aVar.f28004j0;
                                if (nVar4 != null) {
                                    nVar4.e1(i13, E0);
                                    aVar.f28004j0.b1();
                                }
                            }
                        } else {
                            pdf.pdfreader.viewer.editor.free.ui.frag.n nVar5 = aVar.f28003i0;
                            if (nVar5 != null) {
                                nVar5.e1(i13, E0);
                                aVar.f28003i0.b1();
                            }
                        }
                    } else {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                i13 = 202;
                            }
                        } else {
                            i13 = 201;
                        }
                        aVar.f27998d0 = i13;
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2 = readerHomeActivity.M;
                    ReaderViewPager readerViewPager2 = aVar2.f28000f0;
                    if (readerViewPager2 != null) {
                        aVar2.B0(readerViewPager2.getCurrentItem());
                    }
                    if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerHomeActivity)) {
                        readerHomeActivity.A2();
                    }
                }
            }
            readerHomeActivity.N.sendEmptyMessage(5);
            o9.d.s(ea.a.p("DWFfbhxydmQZbyR0B29s", "Xj3EVhvz"), ea.a.p("J29cZVlUVmJ6YyJhG2dl", "OAROeeyR"));
            readerHomeActivity.R2();
            readerHomeActivity.h2(readerHomeActivity.f26685s0, readerHomeActivity.f26704y1, true);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void c() {
        }
    }

    /* loaded from: classes3.dex */
    public class j0 implements com.lib.flutter.encrypt.e {
        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            if (BillingConfigImpl.c.w()) {
                String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmgpbSZMBXMTQg9uKmVBIDhoHHc=", "lgnDl2D0");
                int i10 = zk.a.f32399a;
                t1.b(p10);
                return;
            }
            gl.e.f17918a.getClass();
            gl.e.f(str);
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void a0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void d() {
    }

    /* loaded from: classes3.dex */
    public class g implements ViewPager.j {
        public g() {
            ReaderHomeActivity.this = r1;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageSelected(int i10) {
            int selectedTabPosition;
            TabLayout.g h10;
            View view;
            boolean z10 = true;
            ReaderHomeActivity readerHomeActivity = ReaderHomeActivity.this;
            if (i10 == 0) {
                readerHomeActivity.N0 = false;
                if (readerHomeActivity.f26682q0.getTabCount() > 0 && (h10 = readerHomeActivity.f26682q0.h(0)) != null && (view = h10.f12981e) != null && view.getMeasuredWidth() == 0 && view.getMeasuredHeight() == 0) {
                    readerHomeActivity.f26682q0.requestLayout();
                }
                readerHomeActivity.B.setMinimumHeight(0);
                readerHomeActivity.f26678o0.setVisibility(0);
                readerHomeActivity.f26680p0.setVisibility(0);
                if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(readerHomeActivity.f26682q0.getContext())) {
                    selectedTabPosition = 0;
                } else {
                    selectedTabPosition = readerHomeActivity.f26682q0.getSelectedTabPosition();
                }
                readerHomeActivity.j2(selectedTabPosition);
                readerHomeActivity.g2(readerHomeActivity.f26682q0.getSelectedTabPosition());
            } else {
                tn.a.b(readerHomeActivity, ea.a.p("R28kbABfBHUcY0BpBm4=", "0GcaOQp8"), ea.a.p("O29ebApfRGg1dw==", "3edZG2jV"));
                readerHomeActivity.N0 = true;
                HomeViewModel homeViewModel = readerHomeActivity.f26660c1;
                if (homeViewModel != null) {
                    homeViewModel.f28157d.j(new to.a(false, 0));
                }
                readerHomeActivity.G.e(true, false, true);
                readerHomeActivity.B.setMinimumHeight(readerHomeActivity.getResources().getDimensionPixelSize(R.dimen.dp_56));
                readerHomeActivity.f26678o0.setVisibility(0);
                readerHomeActivity.f26680p0.setVisibility(8);
                readerHomeActivity.f26683r0.setVisibility(8);
                readerHomeActivity.j2(0);
                readerHomeActivity.g2(0);
            }
            if (readerHomeActivity.N0 || readerHomeActivity.M0 || readerHomeActivity.f26699x.getMeasuredHeight() > readerHomeActivity.f26702y) {
                z10 = false;
            }
            readerHomeActivity.f2(z10);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public final void onPageScrolled(int i10, float f10, int i11) {
        }
    }

    @Override // jl.a
    public final void T1(Bundle bundle) {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
    }
}
