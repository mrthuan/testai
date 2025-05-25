package pdf.pdfreader.viewer.editor.free.office;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.lib.flutter.encrypt.EngineHelper;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import industries.deepthought.decode.Decoder;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import lib.zj.office.officereader.AppFrame;
import lib.zj.office.officereader.beans.AToolsbar;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.wp.control.Word;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.bean.PreviewGuideType;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.thumb.ThumbLoadCenter;
import pdf.pdfreader.viewer.editor.free.thumb.adapter.ThumbnailAdapter;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewViewSettingsDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;
import pdf.pdfreader.viewer.editor.free.ui.dialog.t2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptRecyclerView;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.Pdf2WordProgress;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewAIGuideView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView;
import pdf.pdfreader.viewer.editor.free.ui.widget.Word2PDFGuideView;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.d1;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.i1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.p1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.r1;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdParseWrongMineTypeException;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import rh.k;
import sg.e;
import x0.f0;

/* compiled from: OfficeReaderActivity.kt */
/* loaded from: classes3.dex */
public final class OfficeReaderActivity extends jl.a implements lib.zj.office.system.i, a.d, pdf.pdfreader.viewer.editor.free.fnbridge.b, pdf.pdfreader.viewer.editor.free.thumb.adapter.a, Word.i, sp.b {
    public static final String D2 = ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnk=", "4ulFpi3f");
    public AppCompatTextView A;
    public View A0;
    public pdf.pdfreader.viewer.editor.free.thumb.adapter.b A1;
    public boolean A2;
    public AppCompatTextView B;
    public TextView B0;
    public long B2;
    public View C;
    public View C0;
    public OperateInterceptDialog C2;
    public AppCompatTextView D;
    public View D0;
    public boolean D1;
    public LinearLayout E;
    public FrameLayout E0;
    public boolean E1;
    public ViewGroup F;
    public Pdf2WordProgress F0;
    public ConstraintLayout F1;
    public EditText G;
    public boolean G1;
    public AppCompatImageView H;
    public ViewGroup H0;
    public AppCompatImageView I;
    public boolean I1;
    public AppCompatImageView J;
    public boolean J0;
    public sp.h J1;
    public Group K;
    public boolean K0;
    public ImageView K1;
    public Group L;
    public View L1;
    public LinearLayout M;
    public ViewGroup N;
    public PdfPreviewEntity N0;
    public final androidx.activity.result.c<String[]> N1;
    public ViewGroup O;
    public nl.b O0;
    public final wn.c O1;
    public View P;
    public lib.zj.office.system.p P0;
    public boolean P1;
    public AppCompatImageView Q;
    public boolean Q1;
    public AppCompatImageView R;
    public boolean R1;
    public AppCompatImageView S;
    public long S1;
    public AppCompatImageView T;
    public boolean T1;
    public Group U;
    public boolean U1;
    public FrameLayout V;
    public boolean V1;
    public FrameLayout W;
    public oo.g W1;
    public InterceptRecyclerView X;
    public boolean X1;
    public View Y;
    public final AtomicBoolean Y1;
    public ViewStub Z;
    public boolean Z1;

    /* renamed from: a0  reason: collision with root package name */
    public View f25915a0;

    /* renamed from: a2  reason: collision with root package name */
    public boolean f25916a2;

    /* renamed from: b0  reason: collision with root package name */
    public View f25917b0;

    /* renamed from: b2  reason: collision with root package name */
    public final PriorityQueue<PreviewGuideType> f25918b2;

    /* renamed from: c0  reason: collision with root package name */
    public ViewStub f25919c0;

    /* renamed from: c1  reason: collision with root package name */
    public AppFrame f25920c1;

    /* renamed from: c2  reason: collision with root package name */
    public boolean f25921c2;

    /* renamed from: d0  reason: collision with root package name */
    public ViewStub f25922d0;

    /* renamed from: d2  reason: collision with root package name */
    public final int f25923d2;

    /* renamed from: e0  reason: collision with root package name */
    public ConstraintLayout f25924e0;

    /* renamed from: e2  reason: collision with root package name */
    public c7.w f25925e2;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f25926f0;

    /* renamed from: f2  reason: collision with root package name */
    public boolean f25927f2;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f25928g0;

    /* renamed from: g2  reason: collision with root package name */
    public boolean f25929g2;

    /* renamed from: h0  reason: collision with root package name */
    public View f25930h0;

    /* renamed from: h2  reason: collision with root package name */
    public boolean f25931h2;

    /* renamed from: i0  reason: collision with root package name */
    public ValueAnimator f25932i0;

    /* renamed from: i2  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.office.i f25934i2;

    /* renamed from: j0  reason: collision with root package name */
    public View f25935j0;

    /* renamed from: j1  reason: collision with root package name */
    public boolean f25936j1;

    /* renamed from: j2  reason: collision with root package name */
    public boolean f25937j2;

    /* renamed from: k0  reason: collision with root package name */
    public View f25938k0;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f25939k1;

    /* renamed from: k2  reason: collision with root package name */
    public final b f25940k2;

    /* renamed from: l0  reason: collision with root package name */
    public ReflowOpenGuideView f25941l0;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f25942l1;

    /* renamed from: l2  reason: collision with root package name */
    public boolean f25943l2;

    /* renamed from: m0  reason: collision with root package name */
    public PreviewAIGuideView f25944m0;

    /* renamed from: m2  reason: collision with root package name */
    public final z f25946m2;

    /* renamed from: n0  reason: collision with root package name */
    public View f25947n0;

    /* renamed from: n1  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.s f25948n1;

    /* renamed from: n2  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c f25949n2;

    /* renamed from: o0  reason: collision with root package name */
    public View f25950o0;

    /* renamed from: o1  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.z f25951o1;

    /* renamed from: o2  reason: collision with root package name */
    public t2 f25952o2;

    /* renamed from: p0  reason: collision with root package name */
    public View f25953p0;

    /* renamed from: p1  reason: collision with root package name */
    public PreviewViewSettingsDialog f25954p1;

    /* renamed from: p2  reason: collision with root package name */
    public boolean f25955p2;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f25956q0;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.g0 q1;

    /* renamed from: q2  reason: collision with root package name */
    public final u4.g f25957q2;

    /* renamed from: r0  reason: collision with root package name */
    public View f25958r0;

    /* renamed from: r2  reason: collision with root package name */
    public int f25960r2;

    /* renamed from: s0  reason: collision with root package name */
    public ProgressView f25961s0;

    /* renamed from: s2  reason: collision with root package name */
    public AnimatorSet f25963s2;

    /* renamed from: t  reason: collision with root package name */
    public String f25964t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f25965t0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f25966t1;

    /* renamed from: t2  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.office.j f25967t2;

    /* renamed from: u  reason: collision with root package name */
    public boolean f25968u;

    /* renamed from: u0  reason: collision with root package name */
    public ReaderLoadingView f25969u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f25970u1;

    /* renamed from: u2  reason: collision with root package name */
    public j2 f25971u2;

    /* renamed from: v  reason: collision with root package name */
    public ViewGroup f25972v;

    /* renamed from: v0  reason: collision with root package name */
    public LottieAnimationView f25973v0;

    /* renamed from: v2  reason: collision with root package name */
    public ObjectAnimator f25975v2;

    /* renamed from: w  reason: collision with root package name */
    public ConstraintLayout f25976w;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView f25977w0;

    /* renamed from: w2  reason: collision with root package name */
    public boolean f25979w2;

    /* renamed from: x  reason: collision with root package name */
    public LottieAnimationView f25980x;

    /* renamed from: x0  reason: collision with root package name */
    public Group f25981x0;

    /* renamed from: x1  reason: collision with root package name */
    public ThumbnailAdapter f25982x1;

    /* renamed from: x2  reason: collision with root package name */
    public boolean f25983x2;

    /* renamed from: y  reason: collision with root package name */
    public InterceptTouchFrameLayout f25984y;

    /* renamed from: y0  reason: collision with root package name */
    public Word2PDFGuideView f25985y0;

    /* renamed from: y1  reason: collision with root package name */
    public int f25986y1;

    /* renamed from: y2  reason: collision with root package name */
    public OperatePdfFailedDialog f25987y2;

    /* renamed from: z  reason: collision with root package name */
    public AppCompatTextView f25988z;

    /* renamed from: z0  reason: collision with root package name */
    public View f25989z0;

    /* renamed from: z1  reason: collision with root package name */
    public int f25990z1;

    /* renamed from: z2  reason: collision with root package name */
    public PdfPreviewEntity f25991z2;
    public final tf.c G0 = kotlin.a.a(new cg.a<OperateExecuteTask>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$operateTask$2
        @Override // cg.a
        public final OperateExecuteTask invoke() {
            return new OperateExecuteTask();
        }
    });
    public final boolean I0 = true;
    public String L0 = "";
    public String M0 = "";

    /* renamed from: i1  reason: collision with root package name */
    public int f25933i1 = -1;

    /* renamed from: m1  reason: collision with root package name */
    public final tf.c f25945m1 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: r1  reason: collision with root package name */
    public final tf.c f25959r1 = kotlin.a.a(new cg.a<hp.e>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$rotateObservable$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final hp.e invoke() {
            return new hp.e(OfficeReaderActivity.this);
        }
    });

    /* renamed from: s1  reason: collision with root package name */
    public final tf.c f25962s1 = kotlin.a.a(new cg.a<c0>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$searchTask$2
        {
            super(0);
        }

        @Override // cg.a
        public final c0 invoke() {
            return new c0(OfficeReaderActivity.this);
        }
    });

    /* renamed from: v1  reason: collision with root package name */
    public int f25974v1 = 1;

    /* renamed from: w1  reason: collision with root package name */
    public final tf.c f25978w1 = kotlin.a.a(new cg.a<ThumbLoadCenter>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$thumbLoadCenter$2
        @Override // cg.a
        public final ThumbLoadCenter invoke() {
            return new ThumbLoadCenter();
        }
    });
    public String B1 = "";
    public boolean C1 = true;
    public final androidx.lifecycle.k0 H1 = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(pdf.pdfreader.viewer.editor.free.feature.bridge.c.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("R2kzdwtvXWUkUxJvRmU=", "Pd1VF9UA"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZyPGERdDVyeQ==", "zrZoN0E7"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("IWgRc2NkMWYpdQp0Ymkyd3VvNmUlQ0RlFXQYbz9FOnQnYXM=", "HbUxMTNF"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });
    public byte M1 = 1;

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25992a;

        static {
            int[] iArr = new int[PreviewGuideType.values().length];
            try {
                iArr[PreviewGuideType.Word2PDFGuide.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreviewGuideType.ReflowOpen.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreviewGuideType.ReflowInquiry.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreviewGuideType.AIGuide.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f25992a = iArr;
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.lib.flutter.encrypt.e {
        public b() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(officeReaderActivity)) {
                if (BillingConfigImpl.c.w()) {
                    String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpKXd0bzV0JW0NYV9uHHIXczJvdw==", "44u3L6AJ");
                    int i10 = zk.a.f32399a;
                    t1.b(p10);
                    return;
                }
                LinearLayout linearLayout = officeReaderActivity.M;
                if (linearLayout != null) {
                    gl.o.f17931a.getClass();
                    gl.o.a(str, linearLayout);
                    gl.o.b();
                }
            }
        }

        @Override // com.lib.flutter.encrypt.e
        public final void b() {
            LinearLayout linearLayout;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(officeReaderActivity)) {
                LinearLayout linearLayout2 = officeReaderActivity.M;
                Object obj = null;
                if (linearLayout2 != null) {
                    x0.j0 j0Var = new x0.j0(linearLayout2);
                    while (true) {
                        if (!j0Var.hasNext()) {
                            break;
                        }
                        Object next = j0Var.next();
                        if (((View) next) instanceof BannerLoadingAnimation) {
                            obj = next;
                            break;
                        }
                    }
                    obj = (View) obj;
                }
                if (obj != null && (linearLayout = officeReaderActivity.M) != null) {
                    linearLayout.removeAllViews();
                }
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements androidx.lifecycle.x<Map<Uri, ? extends ip.c>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThirdOpenBean f25994a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OfficeReaderActivity f25995b;
        public final /* synthetic */ Bundle c;

        public c(ThirdOpenBean thirdOpenBean, OfficeReaderActivity officeReaderActivity, Bundle bundle) {
            this.f25994a = thirdOpenBean;
            this.f25995b = officeReaderActivity;
            this.c = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Map<Uri, ? extends ip.c> map) {
            Map<Uri, ? extends ip.c> map2 = map;
            if (map2 != null) {
                ea.a.p("G2hYch1PR2U0UCtyBmUlYVthCWVy", "YBPl12oK");
                map2.toString();
                ip.c cVar = map2.get(this.f25994a.getUri());
                String str = null;
                final OfficeReaderActivity officeReaderActivity = this.f25995b;
                if (cVar != null) {
                    ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                    ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                    if (thirdOpenStatus2 != thirdOpenStatus) {
                        officeReaderActivity.Q1 = false;
                        ViewGroup viewGroup = officeReaderActivity.f25972v;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                            ViewGroup viewGroup2 = (ViewGroup) officeReaderActivity.findViewById(16908290);
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(officeReaderActivity.findViewById(R.id.loadingRoot));
                            }
                            if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                                t1.b(ea.a.p("JGQAUAdlPWktd0Z0XGklZHdwN25pcFdyB2U0ciNvMDE=", "ReTfuK9y"));
                                if (thirdOpenStatus2 == ThirdOpenStatus.NOT_SUPPORT) {
                                    String string = officeReaderActivity.getString(R.string.arg_res_0x7f13004c);
                                    kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGEqbBxyAGE8ZRsyBnRKcC5fHW8WXwF1RHAGciIp", "eXiYKj9a"));
                                    String string2 = officeReaderActivity.getString(R.string.arg_res_0x7f13004d);
                                    kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGEqbBxy0ID8Mm50TnBWXyVvB18RdQJwW3IdXzJlN18DKQ==", "2Z170Jjp"));
                                    officeReaderActivity.f3(string, string2, officeReaderActivity.getString(R.string.arg_res_0x7f13004e));
                                } else {
                                    String string3 = officeReaderActivity.getString(R.string.arg_res_0x7f130391);
                                    kotlin.jvm.internal.g.d(string3, ea.a.p("DGUDUwVyI24vKDQuR3QlaVZnfHIsYVJlBl8XaT1lHWUTYxJwBWklbik=", "GfkwqJCO"));
                                    String string4 = officeReaderActivity.getString(R.string.arg_res_0x7f130390);
                                    kotlin.jvm.internal.g.d(string4, ea.a.p("JGU6Uy5yXm4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ18gbzxyL3BDXythCG5bdAhvSGU8KQ==", "AiCNZ7gN"));
                                    officeReaderActivity.f3(string3, string4, null);
                                }
                            } else {
                                PdfPreviewEntity pdfPreviewEntity = cVar.c;
                                if (pdfPreviewEntity != null) {
                                    if (officeReaderActivity.k2(pdfPreviewEntity.getPath())) {
                                        Intent intent = officeReaderActivity.getIntent();
                                        if (intent != null) {
                                            intent.putExtra(ea.a.p("QGgkdyxwBmY=", "aKTZhe0D"), pdfPreviewEntity);
                                        }
                                        Intent intent2 = officeReaderActivity.getIntent();
                                        if (intent2 != null) {
                                            intent2.setData(Uri.fromFile(new File(pdfPreviewEntity.getPath())));
                                        }
                                        Bundle bundle = this.c;
                                        if (!officeReaderActivity.l2(bundle)) {
                                            officeReaderActivity.P2(bundle);
                                        }
                                    }
                                } else {
                                    t1.b(ea.a.p("Q2QtUAFlFGkXdxR0AWkkZAtwV25mcCJyMGUNciFvOzI=", "CHSIF3gw"));
                                    String string5 = officeReaderActivity.getString(R.string.arg_res_0x7f130391);
                                    kotlin.jvm.internal.g.d(string5, ea.a.p("AWUwUxJyJG4vKDQuR3QlaVZnfHIsYVJlBl8XaT1lHWUeYyFwEmkibik=", "zFfDfMYq"));
                                    String string6 = officeReaderActivity.getString(R.string.arg_res_0x7f130390);
                                    kotlin.jvm.internal.g.d(string6, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdliIDSZlxsKl9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "jt5O6YP0"));
                                    officeReaderActivity.f3(string5, string6, null);
                                }
                            }
                            ThirdOpenParseManager.f28764f.i(this);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "eGBD0Whe"));
                        throw null;
                    }
                }
                ViewGroup viewGroup3 = officeReaderActivity.f25972v;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                    ViewGroup viewGroup4 = (ViewGroup) officeReaderActivity.findViewById(16908290);
                    if (viewGroup4 != null) {
                        View inflate = LayoutInflater.from(officeReaderActivity).inflate(R.layout.layout_preview_loading, viewGroup4, false);
                        ((LottieAnimationView) inflate.findViewById(R.id.loadingLottie)).setAnimation(R.raw.loading);
                        TextView textView = (TextView) inflate.findViewById(R.id.loadingText);
                        Intent intent3 = officeReaderActivity.getIntent();
                        if (intent3 != null) {
                            str = intent3.getStringExtra(ea.a.p("R3k7ZTdlEWMmZUx0", "pUV6v9U0"));
                        }
                        textView.setText(str);
                        ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.office.e
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str2 = OfficeReaderActivity.D2;
                                String p10 = ea.a.p("R2gic1cw", "00fVzGbh");
                                OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                                kotlin.jvm.internal.g.e(officeReaderActivity2, p10);
                                officeReaderActivity2.s2();
                            }
                        });
                        viewGroup4.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "FfIZtUXF"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tn.a.d(OfficeReaderActivity.this, ea.a.p("QWUtbBx3", "KhaJQBrV"), ea.a.p("KmVSbBd3bGc9aQJlW2sIY1RpMWs=", "pRX4x39x"), ea.a.p("OG9DZA==", "FsQrdQnG"), false);
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e extends pdf.pdfreader.viewer.editor.free.utils.l0 {
        public e() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View view) {
            String str = OfficeReaderActivity.D2;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            Group group = officeReaderActivity.f25981x0;
            if (group != null) {
                group.setVisibility(8);
            }
            officeReaderActivity.j3();
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25998a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f25999b;

        public f(View view, boolean z10) {
            this.f25998a = z10;
            this.f25999b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            super.onAnimationEnd(animation);
            boolean z10 = this.f25998a;
            View view = this.f25999b;
            if (z10) {
                view.setVisibility(4);
            } else {
                view.setVisibility(8);
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConstraintLayout f26000a;

        public g(ConstraintLayout constraintLayout) {
            this.f26000a = constraintLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            this.f26000a.setVisibility(8);
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h implements sg.b {
        public h() {
        }

        @Override // sg.b
        public final void a() {
            tf.d dVar;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(officeReaderActivity)) {
                q0.u();
            }
            System.currentTimeMillis();
            o9.d.s(ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnk=", "lS72539X"), ea.a.p("V2k4bRpzEUQbYVhvZw==", "Of2dx180"));
            nl.b bVar = officeReaderActivity.O0;
            if (bVar != null) {
                int i10 = bVar.f22595p;
                if (i10 > officeReaderActivity.f25923d2 || ((byte) officeReaderActivity.f25933i1) == 1 || i10 <= 1) {
                    AppCompatImageView appCompatImageView = officeReaderActivity.Q;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(0);
                        officeReaderActivity.I2();
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("G2hScidJdg==", "rmh3B7g8"));
                        throw null;
                    }
                }
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                AppCompatImageView appCompatImageView2 = officeReaderActivity.Q;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                    officeReaderActivity.I2();
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGgqchZJdg==", "jP9ZWGQS"));
                throw null;
            }
        }

        @Override // sg.b
        public final void b() {
            o9.d.s(ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnk=", "SIqm4a9s"), ea.a.p("QGgkdzdpA2wdZw==", "UZt0VzTO"));
            long currentTimeMillis = System.currentTimeMillis();
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            officeReaderActivity.S1 = currentTimeMillis;
            officeReaderActivity.runOnUiThread(new pdf.pdfreader.viewer.editor.free.office.o(officeReaderActivity, 2));
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class k implements b0 {
        public k() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.office.b0
        public final void a(boolean z10) {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (z10) {
                officeReaderActivity.f25939k1 = false;
                officeReaderActivity.f25936j1 = false;
                Group group = officeReaderActivity.K;
                if (group != null) {
                    group.setVisibility(0);
                    officeReaderActivity.e2(false);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("PGVQchpofXU3cA1yGnVw", "T8TPzMZQ"));
                throw null;
            }
            Group group2 = officeReaderActivity.K;
            if (group2 != null) {
                group2.setVisibility(8);
                officeReaderActivity.e2(true);
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoKHUfcHNyBnVw", "9WafXpbk"));
            throw null;
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class l implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public ValueAnimator f26006a;

        public l() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.office.a0
        public final void onDismiss() {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            InterceptTouchFrameLayout interceptTouchFrameLayout = officeReaderActivity.f25984y;
            if (interceptTouchFrameLayout != null) {
                interceptTouchFrameLayout.setDispatchTouchEvent(true);
                AppCompatImageView appCompatImageView = officeReaderActivity.H;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(0);
                    ValueAnimator valueAnimator = this.f26006a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    ViewGroup viewGroup = officeReaderActivity.O;
                    if (viewGroup != null) {
                        if (viewGroup.getMeasuredHeight() == 0) {
                            return;
                        }
                        ViewGroup viewGroup2 = officeReaderActivity.O;
                        if (viewGroup2 != null) {
                            this.f26006a = p1.a(viewGroup2, viewGroup2.getMeasuredHeight(), 0);
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("PGVQchpoZ3I1ZzhlBnM=", "8VitPkEM"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoMnIdZ0ZlGnM=", "TKJPjXn5"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoIWwXYUZJdg==", "YveKS3DE"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("BWU2ZCtyNm8mdAdpWmVy", "k9wWNuug"));
            throw null;
        }

        @Override // pdf.pdfreader.viewer.editor.free.office.a0
        public final void onStart() {
            String p10 = ea.a.p("OWlUdw==", "BzhMLZXC");
            String p11 = ea.a.p("RWkudyxzB2EAY1xfBW83ZBtzWm93", "X5IUoNla");
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            String a10 = pdf.pdfreader.viewer.editor.free.utils.w.a(officeReaderActivity.L0);
            ea.a.p("C2UCRitsEVQxcAMoUmk7ZWhhJmgp", "UXlvBtK7");
            Locale locale = Locale.getDefault();
            String f10 = a6.h.f("VGU_RBZmA3UedBwp", "L5egNfXn", locale, a10, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("Q2gsc3hhECAiYRBhGmw2bl8uAXQ7aVhnXS4Fbx1vNWVFQyRzPSgPbythCmUp", "Gb7EXcVf"));
            tn.a.d(officeReaderActivity, p10, p11, f10, false);
            InterceptTouchFrameLayout interceptTouchFrameLayout = officeReaderActivity.f25984y;
            if (interceptTouchFrameLayout != null) {
                interceptTouchFrameLayout.setDispatchTouchEvent(false);
                AppCompatImageView appCompatImageView = officeReaderActivity.H;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(4);
                    ValueAnimator valueAnimator = this.f26006a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        valueAnimator.cancel();
                    }
                    ViewGroup viewGroup = officeReaderActivity.O;
                    if (viewGroup != null) {
                        this.f26006a = p1.a(viewGroup, 0, officeReaderActivity.getResources().getDimensionPixelSize(R.dimen.dp_48));
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoMnIdZ0ZlGnM=", "yGM0LpsJ"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("PGVQchpodGw_YThJdg==", "VUGEEsTF"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("H2UbZFxyem8mdAdpWmVy", "CNmz99XF"));
            throw null;
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class m implements ReflowOpenGuideView.a {
        public m() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView.a
        public final void a() {
            String str = OfficeReaderActivity.D2;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            officeReaderActivity.j3();
            tn.a.d(officeReaderActivity, ea.a.p("RWkudw==", "8Jo8JcSe"), ea.a.p("RWkudyxyB2Yeb0NnHGkyXydsXXMjXyBsIGNr", "I8DaiEhD"), ea.a.p("RG85ZA==", "e5YcZ7Fo"), false);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.ReflowOpenGuideView.a
        public final void b() {
            String str = OfficeReaderActivity.D2;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            officeReaderActivity.p2();
            officeReaderActivity.j3();
            tn.a.d(officeReaderActivity, ea.a.p("OWlUdw==", "3EF4bbTc"), ea.a.p("OWlUdyZyUmY2bz1nAGkMX1ZsAXMgXwZsX2Nr", "jeMJ6ws1"), ea.a.p("OG9DZA==", "vReiCZfP"), false);
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class n implements PreviewAIGuideView.a {
        public n() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.PreviewAIGuideView.a
        public final void a() {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            OfficeReaderActivity.d2(officeReaderActivity);
            officeReaderActivity.j3();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.PreviewAIGuideView.a
        public final void b() {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (OfficeReaderActivity.b2(officeReaderActivity)) {
                e.a.b(officeReaderActivity, officeReaderActivity.L0, OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 602, ea.a.p("DGlcdw==", "n4z92uoD"), ea.a.p("OWlUdw==", "ukJyzFzk"), false);
            }
            OfficeReaderActivity.d2(officeReaderActivity);
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class o implements ViewTreeObserver.OnGlobalLayoutListener {
        public o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            PreviewAIGuideView previewAIGuideView = officeReaderActivity.f25944m0;
            if (previewAIGuideView != null) {
                previewAIGuideView.r(officeReaderActivity.K1);
            }
            ImageView imageView = officeReaderActivity.K1;
            if (imageView != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class p implements Word.h {
        public p() {
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void a(boolean z10) {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (!officeReaderActivity.J0) {
                officeReaderActivity.a3(z10);
            }
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void b(boolean z10) {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (z10) {
                if (!officeReaderActivity.f25929g2) {
                    ConstraintLayout constraintLayout = officeReaderActivity.f25924e0;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    officeReaderActivity.f25931h2 = false;
                    return;
                }
                if (officeReaderActivity.f25924e0 == null) {
                    if (officeReaderActivity.f25927f2) {
                        officeReaderActivity.f25927f2 = false;
                        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                        officeReaderActivity.w2().removeCallbacks(officeReaderActivity.f25934i2);
                    }
                    try {
                        ViewStub viewStub = officeReaderActivity.f25922d0;
                        if (viewStub != null) {
                            View inflate = viewStub.inflate();
                            kotlin.jvm.internal.g.c(inflate, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuIG5_bjRsLiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQjYStvNHRsd1pkLGUHLiFvHHNAcghpOHQIYUtvM3Q=", "ORAB8zax"));
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                            officeReaderActivity.f25924e0 = constraintLayout2;
                            TextView textView = (TextView) constraintLayout2.findViewById(R.id.preview_current_page_number_tv);
                            officeReaderActivity.f25926f0 = textView;
                            if (textView != null) {
                                String format = String.format(Locale.ENGLISH, ea.a.p("amQg", "FZgp1KUM"), Arrays.copyOf(new Object[]{Integer.valueOf(officeReaderActivity.f25986y1)}, 1));
                                kotlin.jvm.internal.g.d(format, ea.a.p("KW9DbRh0H2w1YytsECxIZlpyA2ExLEUqNHIEcyk=", "yeQCUczY"));
                                textView.setText(format);
                            }
                            TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.preview_total_page_number_tv);
                            officeReaderActivity.f25928g0 = textView2;
                            if (officeReaderActivity.f25990z1 > 0 && textView2 != null) {
                                String format2 = String.format(Locale.ENGLISH, ea.a.p("amQg", "WUYi6ZCV"), Arrays.copyOf(new Object[]{Integer.valueOf(officeReaderActivity.f25990z1)}, 1));
                                kotlin.jvm.internal.g.d(format2, ea.a.p("V29FbSR0RWwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "oE17EmFk"));
                                textView2.setText(format2);
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UGUldBZyMmEVZXp1BGIzchJz", "ZhxLH29a"));
                            throw null;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                ConstraintLayout constraintLayout3 = officeReaderActivity.f25924e0;
                if (constraintLayout3 != null && constraintLayout3.getVisibility() != 0) {
                    constraintLayout3.setAlpha(1.0f);
                    constraintLayout3.setVisibility(0);
                }
                Handler w22 = officeReaderActivity.w2();
                pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c cVar = officeReaderActivity.f25949n2;
                w22.removeCallbacks(cVar);
                officeReaderActivity.w2().postDelayed(cVar, 200L);
                if (!officeReaderActivity.f25931h2) {
                    officeReaderActivity.f25931h2 = true;
                    officeReaderActivity.X2();
                    return;
                }
                return;
            }
            String str2 = OfficeReaderActivity.D2;
            officeReaderActivity.G2();
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class q implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26012a;

        public q(cg.l lVar) {
            ea.a.p("KXVfYw1pWG4=", "DYgp83lZ");
            this.f26012a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26012a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26012a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26012a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26012a.invoke(obj);
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class r extends AnimatorListenerAdapter {
        public r() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = OfficeReaderActivity.this.E;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "sgn3v4MR"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class s extends AnimatorListenerAdapter {
        public s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = OfficeReaderActivity.this.E;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "PYnPEtDj"));
                throw null;
            }
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class t implements s.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f26016b;
        public final /* synthetic */ int c;

        public t(boolean z10, int i10) {
            this.f26016b = z10;
            this.c = i10;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void a(int i10) {
            View view;
            View view2;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.f(officeReaderActivity, officeReaderActivity.N0, this.f26016b);
            Word word = null;
            Presentation presentation = null;
            int i11 = this.c;
            if (i11 != 0) {
                if (i11 == 1) {
                    lib.zj.office.system.p pVar = officeReaderActivity.P0;
                    if (pVar != null) {
                        view2 = pVar.getView();
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof Presentation) {
                        presentation = (Presentation) view2;
                    }
                    if (presentation != null) {
                        PGPrintMode pGPrintMode = presentation.f20940t;
                        try {
                            Object model = pGPrintMode.f20913e.getModel();
                            kotlin.jvm.internal.g.c(model, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuWm5FbgBsOSBHeTtlU2wLYlx6Xi4GZjBpJ2UccCEuLm9RZQQuJUcYb1dlbA==", "5huUTpHd"));
                            th.c cVar = (th.c) model;
                            if (i10 <= cVar.c() && i10 > 0) {
                                officeReaderActivity.N2();
                                APageListView aPageListView = pGPrintMode.f20913e;
                                aPageListView.setCurrentPageNumber(i10);
                                aPageListView.requestLayout();
                            } else {
                                pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = officeReaderActivity.f25948n1;
                                if (sVar != null) {
                                    cVar.c();
                                    sVar.B();
                                }
                                o9.d.r("OfficeReaderActivity page not enough, current page = " + cVar.c());
                                return;
                            }
                        } catch (Exception e10) {
                            t1.b(e10.toString());
                        }
                    }
                }
            } else {
                lib.zj.office.system.p pVar2 = officeReaderActivity.P0;
                if (pVar2 != null) {
                    view = pVar2.getView();
                } else {
                    view = null;
                }
                if (view instanceof Word) {
                    word = view;
                }
                if (word != null) {
                    officeReaderActivity.N2();
                    word.j(i10);
                }
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar2 = officeReaderActivity.f25948n1;
            if (sVar2 != null) {
                sVar2.cancel();
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void b() {
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.g(officeReaderActivity, officeReaderActivity.N0, this.f26016b);
        }
    }

    public OfficeReaderActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new pdf.pdfreader.viewer.editor.free.office.h(this));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBspYDTfUUgbCBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "ltVVGuOL"));
        this.N1 = registerForActivityResult;
        this.O1 = new wn.c(0L);
        this.Y1 = new AtomicBoolean(true);
        this.f25918b2 = new PriorityQueue<>(10, new pdf.pdfreader.viewer.editor.free.camera.camera.util.c(new cg.p<PreviewGuideType, PreviewGuideType, Integer>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$guideQueue$1
            @Override // cg.p
            public final Integer invoke(PreviewGuideType previewGuideType, PreviewGuideType previewGuideType2) {
                return Integer.valueOf(previewGuideType.getPriority() - previewGuideType2.getPriority());
            }
        }, 1));
        this.f25923d2 = 20;
        this.f25927f2 = true;
        this.f25934i2 = new pdf.pdfreader.viewer.editor.free.office.i(this, 0);
        this.f25940k2 = new b();
        this.f25946m2 = new z(this, 2);
        this.f25949n2 = new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(this, 2);
        this.f25957q2 = new u4.g(this, 15);
        this.f25960r2 = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        this.f25967t2 = new pdf.pdfreader.viewer.editor.free.office.j(this, 0);
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.f25971u2 = j2Var;
        if (z10) {
            j2Var.c(1);
        } else {
            j2Var.c(0);
        }
        j2Var.f27638i = new u(this, z10);
        j2 j2Var2 = this.f25971u2;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    public static void a2(OfficeReaderActivity officeReaderActivity, Map map) {
        kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "m8q4Z0qK"));
        officeReaderActivity.w2().removeCallbacks(officeReaderActivity.f25967t2);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(officeReaderActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfDFhnRQJOI0wQU2VPK0FwRQ==", "hyfnI3Pb")) && !k0.b.b(officeReaderActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFNUUXVABSFEEDX2JUNlJ2R0U=", "dcBxjOEZ"))) {
                officeReaderActivity.X1(true);
            } else {
                officeReaderActivity.X1(false);
            }
        }
    }

    public static final boolean b2(OfficeReaderActivity officeReaderActivity) {
        boolean z10;
        long j10;
        boolean z11;
        PdfPreviewEntity pdfPreviewEntity = officeReaderActivity.N0;
        if (pdfPreviewEntity != null && pdfPreviewEntity.isOtherBoolOne()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            tn.a.d(officeReaderActivity, ea.a.p("OWlUdw==", "gMbZJGAu"), ea.a.p("OWlUdyZhXmUociVfBmgHdw==", "d8Meomwl"), ea.a.p("X28oaw==", "WDcMVjaa"), false);
            String string = officeReaderActivity.getString(R.string.arg_res_0x7f130116);
            kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGUrYxd51oDRXyBpL2UQY1BuF29DXypyJWMQcxtfUnAaKQ==", "ufTf4wFC"));
            officeReaderActivity.i3(string);
        } else {
            PdfPreviewEntity pdfPreviewEntity2 = officeReaderActivity.N0;
            if (pdfPreviewEntity2 != null) {
                j10 = pdfPreviewEntity2.getSize();
            } else {
                j10 = 0;
            }
            if (lm.e.f21773a && j10 > 10485760) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return true;
            }
            tn.a.d(officeReaderActivity, ea.a.p("RWkudw==", "NS9ynhfr"), ea.a.p("OWlUdyZhXmUociVfBmgHdw==", "rDXZrfZP"), ea.a.p("PGlLZQ==", "1JLkfGTD"), false);
            String string2 = officeReaderActivity.getString(R.string.arg_res_0x7f13014f, "10MB");
            kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGYsbABfp4CUQS9IMGw_ZUMuFGFPRjNsL1Mceg19eEJMKQ==", "Bnh1E2fU"));
            officeReaderActivity.i3(string2);
        }
        return false;
    }

    public static final void c2(OfficeReaderActivity officeReaderActivity) {
        boolean z10;
        ObjectAnimator objectAnimator;
        officeReaderActivity.getClass();
        tn.a.b(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "r03nOFC9"), ea.a.p("RWkudyx3DXIWMkRkD181bC1jaw==", "VGG60i0C"));
        Group group = officeReaderActivity.f25981x0;
        if (group != null) {
            group.setVisibility(8);
        }
        boolean z11 = true;
        if (officeReaderActivity.A2) {
            View view = officeReaderActivity.A0;
            if (view != null && view.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                View view2 = officeReaderActivity.A0;
                if (view2 != null) {
                    ObjectAnimator objectAnimator2 = officeReaderActivity.f25975v2;
                    if (objectAnimator2 == null || !objectAnimator2.isRunning()) {
                        z11 = false;
                    }
                    if (z11 && (objectAnimator = officeReaderActivity.f25975v2) != null) {
                        objectAnimator.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, ea.a.p("R3IqbgBsA3Qbb1pY", "FPN7r3A5"), 0.0f, 10.0f, -10.0f, 10.0f, -10.0f, 5.0f, -5.0f, 0.0f);
                    officeReaderActivity.f25975v2 = ofFloat;
                    if (ofFloat != null) {
                        ofFloat.setDuration(300L);
                    }
                    ObjectAnimator objectAnimator3 = officeReaderActivity.f25975v2;
                    if (objectAnimator3 != null) {
                        objectAnimator3.start();
                        return;
                    }
                    return;
                }
                return;
            }
            TextView textView = officeReaderActivity.B0;
            if (textView != null) {
                textView.setText(R.string.arg_res_0x7f130055);
            }
            PdfPreviewEntity pdfPreviewEntity = officeReaderActivity.f25991z2;
            if (pdfPreviewEntity != null) {
                FileRepository.f24155a.getClass();
                PdfPreviewEntity E = t0.E(FileRepository.m(), pdfPreviewEntity);
                if (E != null) {
                    officeReaderActivity.f25991z2 = E;
                }
            }
            officeReaderActivity.b3(true);
        } else if (!officeReaderActivity.f25979w2) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("RDI7XxZuFmUAX1dsAGNr", "0CJVqPl2"));
            AppCoreFilterEvent.h(ea.a.p("MzJJXydpB3c=", "DFD9Qbf2"));
            if (!h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(officeReaderActivity)) {
                officeReaderActivity.w2().postDelayed(officeReaderActivity.f25967t2, 500L);
                officeReaderActivity.N1.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfKFghRRNON0wQU2VPK0FwRQ==", "DPiVmuAv"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFPEVrVCpSNkEDX2JUNlJ2R0U=", "z6b2c3ox")});
                return;
            }
            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
            if (billingConfigImpl.w()) {
                officeReaderActivity.r3();
            } else if (billingConfigImpl.z() && BillingConfigImpl.A()) {
                officeReaderActivity.f25970u1 = true;
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                String p10 = ea.a.p("RG85ZEFwBmY=", "qT3Pd65U");
                aVar.getClass();
                BaseSubscriptionActivity.a.a(officeReaderActivity, p10);
            } else {
                officeReaderActivity.r3();
            }
        }
    }

    public static final void d2(OfficeReaderActivity officeReaderActivity) {
        PreviewAIGuideView previewAIGuideView = officeReaderActivity.f25944m0;
        if (previewAIGuideView != null) {
            previewAIGuideView.setVisibility(8);
        }
        tn.a.d(officeReaderActivity, ea.a.p("VHUiZGU=", "If5QZl94"), ea.a.p("LmlWdRBkUl85bCNjaw==", "B1kNDCgJ"), "view_".concat(officeReaderActivity.u2()), false);
        View view = officeReaderActivity.L1;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // lib.zj.office.system.i
    public final void A0(String str) {
        boolean z10;
        if (!isFinishing()) {
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 || this.f25965t0) {
                return;
            }
            new pdf.pdfreader.viewer.editor.free.ui.dialog.b0(this, str, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$onTouchLink$1
                {
                    super(0);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                    String string = officeReaderActivity.getString(R.string.arg_res_0x7f1301b4);
                    kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGkrdgRsLWQwbANuEik=", "u6x8Dojy"));
                    officeReaderActivity.i3(string);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }
            }).show();
        }
    }

    public final ObjectAnimator A2(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("R3IqbgBsA3Qbb1pY", "ao5f4R0o"), view.getTranslationX(), 0.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("IGZ3bBZhQygsaS93WSBKdEdhAHMpYRFpoIDQIlwgBGkqdx90C2FZczZhPmkabjAsFTAIKQ==", "gXZeBvpr"));
        return ofFloat;
    }

    @Override // lib.zj.office.system.i
    public final boolean B0() {
        return this.I0;
    }

    public final c0 B2() {
        return (c0) this.f25962s1.getValue();
    }

    @Override // lib.zj.office.system.i
    public final byte C0() {
        if (this.f25965t0) {
            View view = this.f25935j0;
            if (view != null) {
                view.post(new pdf.pdfreader.viewer.editor.free.office.i(this, 3));
                return (byte) 1;
            }
            return (byte) 1;
        }
        return (byte) 0;
    }

    @Override // jl.a
    public final void C1() {
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("CWk4ZG9pCHcKeS9kHFJ5aVwuIG8mdGBpEXcp", "wwoV9mF2"));
        this.f25972v = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUW8odCJpCmURKQ==", "dcSi2wpP"));
        this.f25976w = (ConstraintLayout) findViewById2;
        this.F1 = (ConstraintLayout) findViewById(R.id.turn_page_container);
        View findViewById3 = findViewById(R.id.backIv);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDGEmayx2KQ==", "MBDlcjI2"));
        this.f25980x = (LottieAnimationView) findViewById3;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            LottieAnimationView lottieAnimationView = this.f25980x;
            if (lottieAnimationView != null) {
                lottieAnimationView.setRotation(-180.0f);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UWEoazp2", "ESAKoHXA"));
                throw null;
            }
        }
        View findViewById4 = findViewById(R.id.readerContainer);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQGUnZCZyG29edCZpW2VBKQ==", "X0G5Rv4T"));
        this.f25984y = (InterceptTouchFrameLayout) findViewById4;
        View findViewById5 = findViewById(R.id.currentPageTv);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("UGlYZGRpDncKeS9kHFJ5aVwuMXU7clNuAFAQZzRUNCk=", "91662keB"));
        this.f25988z = (AppCompatTextView) findViewById5;
        View findViewById6 = findViewById(R.id.pageSlash);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQmEhZRBsJ3MkKQ==", "FL6twSNv"));
        this.A = (AppCompatTextView) findViewById6;
        View findViewById7 = findViewById(R.id.totalPageTv);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGm8xYQlQNGcjVDMp", "Etf1UFEx"));
        this.B = (AppCompatTextView) findViewById7;
        View findViewById8 = findViewById(R.id.pageToastLine);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQmEhZRdvB3MBTDpuPSk=", "fuSXnWBH"));
        this.C = findViewById8;
        View findViewById9 = findViewById(R.id.fileNameTv);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("PGkmZCNpL3cKeS9kHFJ5aVwuNGklZXhhGWUldik=", "gvZHuJMz"));
        this.D = (AppCompatTextView) findViewById9;
        View findViewById10 = findViewById(R.id.bgPageToast);
        kotlin.jvm.internal.g.d(findViewById10, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUGcWYSRlZW8Acz0p", "1aI2wAyX"));
        this.E = (LinearLayout) findViewById10;
        View findViewById11 = findViewById(R.id.actionBarView);
        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("KGkdZDhpL3cKeS9kHFJ5aVwuM2M9aVluNmEDVjhlNSk=", "DqNsnJJv"));
        this.F = (ViewGroup) findViewById11;
        View findViewById12 = findViewById(R.id.searchEditText);
        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZoN2QcdCZlEnQp", "2Oh2rurj"));
        this.G = (EditText) findViewById12;
        View findViewById13 = findViewById(R.id.searchClearIv);
        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZoCGw_YUFJMyk=", "GBVfKZ3E"));
        this.H = (AppCompatImageView) findViewById13;
        View findViewById14 = findViewById(R.id.searchBackIv);
        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQWUnciBoB2Epayh2KQ==", "EJaHOsob"));
        this.I = (AppCompatImageView) findViewById14;
        View findViewById15 = findViewById(R.id.searchForwardIv);
        kotlin.jvm.internal.g.d(findViewById15, ea.a.p("IGk0ZAJpLXcKeS9kHFJ5aVwuIWUoclVoMm8DdzByJkkwKQ==", "k4FZTH71"));
        this.J = (AppCompatImageView) findViewById15;
        View findViewById16 = findViewById(R.id.searchJumpGroup);
        kotlin.jvm.internal.g.d(findViewById16, ea.a.p("Lmk6ZDhpDXcKeS9kHFJ5aVwuIWUoclVoPnUccBZyLXU4KQ==", "nCHTnhz9"));
        this.K = (Group) findViewById16;
        View findViewById17 = findViewById(R.id.emptyGroup);
        kotlin.jvm.internal.g.d(findViewById17, ea.a.p("DGlZZCdpVHcKeS9kHFJ5aVwuN205dE9HBm8EcCk=", "Isj7q1sQ"));
        this.L = (Group) findViewById17;
        this.M = (LinearLayout) findViewById(R.id.ad_layout);
        View findViewById18 = findViewById(R.id.bottomAdContainer);
        kotlin.jvm.internal.g.d(findViewById18, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuUG8ydCxtM2QAbx10E2ldZTkp", "rCsr09OB"));
        this.N = (ViewGroup) findViewById18;
        View findViewById19 = findViewById(R.id.searchProgress);
        kotlin.jvm.internal.g.d(findViewById19, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZoM3IIZxtlMnMp", "NJnzcgiA"));
        this.O = (ViewGroup) findViewById19;
        View findViewById20 = findViewById(R.id.searchCloseImg);
        kotlin.jvm.internal.g.d(findViewById20, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZodWw4cxZJX2cp", "bYMX6Ws2"));
        this.P = findViewById20;
        View findViewById21 = findViewById(R.id.shareIv);
        kotlin.jvm.internal.g.d(findViewById21, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWgkcgBJPSk=", "ADgWKIy6"));
        this.Q = (AppCompatImageView) findViewById21;
        View findViewById22 = findViewById(R.id.searchIv);
        kotlin.jvm.internal.g.d(findViewById22, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHWUkcgZoCHYp", "6mJOA3nF"));
        this.R = (AppCompatImageView) findViewById22;
        View findViewById23 = findViewById(R.id.viewSetting);
        kotlin.jvm.internal.g.d(findViewById23, ea.a.p("PGlWZBhpVHcKeS9kHFJ5aVwuJGksd2VlAHQYbjYp", "UHZ8N1mi"));
        this.S = (AppCompatImageView) findViewById23;
        View findViewById24 = findViewById(R.id.moreIv);
        kotlin.jvm.internal.g.d(findViewById24, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuX280ZQp2KQ==", "maPJZGGb"));
        this.T = (AppCompatImageView) findViewById24;
        View findViewById25 = findViewById(R.id.toolBarGroup);
        kotlin.jvm.internal.g.d(findViewById25, ea.a.p("I2kAZARpJ3cKeS9kHFJ5aVwuJm8mbHRhBkcDbyRwKQ==", "YLEnRBHv"));
        this.U = (Group) findViewById25;
        View findViewById26 = findViewById(R.id.thumb_rv);
        kotlin.jvm.internal.g.d(findViewById26, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmgwbQdfPXYp", "KCIZODbe"));
        this.X = (InterceptRecyclerView) findViewById26;
        View findViewById27 = findViewById(R.id.thumb_line);
        kotlin.jvm.internal.g.d(findViewById27, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuGmgwbQdfBmk7ZSk=", "BTrIjUmi"));
        this.Y = findViewById27;
        View findViewById28 = findViewById(R.id.splash_root);
        kotlin.jvm.internal.g.d(findViewById28, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHXApYRZoNnIGbwwp", "LFtwiixu"));
        this.V = (FrameLayout) findViewById28;
        View findViewById29 = findViewById(R.id.loadingContainer);
        kotlin.jvm.internal.g.d(findViewById29, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuXm8nZCpuE0MMbjhhC25Wcik=", "tcLb0gYR"));
        this.W = (FrameLayout) findViewById29;
        View findViewById30 = findViewById(R.id.reflow_continue_tip_vs);
        kotlin.jvm.internal.g.d(findViewById30, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHGUjbAp3HWMEbkVpGXUqX0VpCV9Bcyk=", "PUh8Bk1w"));
        this.Z = (ViewStub) findViewById30;
        View findViewById31 = findViewById(R.id.toast_vs);
        kotlin.jvm.internal.g.d(findViewById31, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRm8nczdfNXMp", "CfMUG51k"));
        this.f25919c0 = (ViewStub) findViewById31;
        View findViewById32 = findViewById(R.id.preview_page_number_vs);
        kotlin.jvm.internal.g.d(findViewById32, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHnIgdgxlDV85YT9lBm46bVNlC19Bcyk=", "mzRbzIXY"));
        this.f25922d0 = (ViewStub) findViewById32;
        this.f25935j0 = findViewById(R.id.iv_open_reflow);
        this.f25938k0 = findViewById(R.id.v_reflow_hint);
        this.f25941l0 = (ReflowOpenGuideView) findViewById(R.id.reflow_pop_guide_container);
        this.f25947n0 = findViewById(R.id.fl_bottom_reflow_edit_container);
        this.f25950o0 = findViewById(R.id.iv_reflow_edit_size_enlarge);
        this.f25953p0 = findViewById(R.id.iv_reflow_edit_size_reduce);
        this.f25961s0 = (ProgressView) findViewById(R.id.iv_reflow_edit_progress_view);
        this.f25956q0 = (TextView) findViewById(R.id.iv_reflow_edit_scale);
        this.f25958r0 = findViewById(R.id.reflow_load_v_loading_bg);
        this.f25944m0 = (PreviewAIGuideView) findViewById(R.id.ai_pop_guide_container);
        this.f25973v0 = (LottieAnimationView) findViewById(R.id.word2pdfLottie);
        this.f25977w0 = (ImageView) findViewById(R.id.word2pdfIv_vip);
        this.f25981x0 = (Group) findViewById(R.id.word2pdf_guide_group);
        this.f25985y0 = (Word2PDFGuideView) findViewById(R.id.word2pdf_guide_view);
        this.f25989z0 = findViewById(R.id.word2pdfIv_faker);
        this.A0 = findViewById(R.id.ll_preview_word2pdf_completed_container);
        BlurView blurView = (BlurView) findViewById(R.id.blur_extract_success_bg);
        ViewGroup viewGroup = this.f25972v;
        if (viewGroup != null) {
            blurView.b(viewGroup, new qe.g(this)).f29293a = 3.52f;
            this.B0 = (TextView) findViewById(R.id.tv_preview_word2pdf_completed_tips);
            this.C0 = findViewById(R.id.tv_preview_word2pdf_completed_view);
            this.D0 = findViewById(R.id.iv_preview_word2pdf_completed_close);
            this.E0 = (FrameLayout) findViewById(R.id.fl_word2pdf_progress);
            this.F0 = (Pdf2WordProgress) findViewById(R.id.word2pdf_progressbar);
            this.H0 = (ViewGroup) findViewById(R.id.full_holder);
            this.K1 = (ImageView) findViewById(R.id.iv_ai_assistant);
            this.L1 = findViewById(R.id.ai_assistant_guide_btn_bg);
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
                LottieAnimationView lottieAnimationView2 = this.f25973v0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setAnimation(R.raw.docxtopdf_loading_rtl);
                }
            } else {
                LottieAnimationView lottieAnimationView3 = this.f25973v0;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setAnimation(R.raw.docxtopdf_loading);
                }
            }
            LottieAnimationView lottieAnimationView4 = this.f25973v0;
            if (lottieAnimationView4 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(lottieAnimationView4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$findView$1
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                        invoke2(view);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        OfficeReaderActivity.c2(OfficeReaderActivity.this);
                    }
                });
            }
            View view = this.f25989z0;
            if (view != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$findView$2
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                        invoke2(view2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        OfficeReaderActivity.c2(OfficeReaderActivity.this);
                    }
                });
            }
            View view2 = this.C0;
            if (view2 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$findView$3
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view3) {
                        invoke2(view3);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        tn.a.d(OfficeReaderActivity.this, ea.a.p("IWkPdw==", "mtWjwqmw"), ea.a.p("RWkTdzZjJ24-ZRRiVW45ZUpfJGksdw==", "Vh3viHuR"), ConvertEventCenter.f28653a, false);
                        OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                        PdfPreviewEntity pdfPreviewEntity = officeReaderActivity.f25991z2;
                        if (pdfPreviewEntity != null) {
                            pdfPreviewEntity.setRecent(1);
                            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                            FileRepository.I(pdfPreviewEntity);
                            bm.c.b(officeReaderActivity).i(pdfPreviewEntity);
                            ReaderPdfApplication.k().g(null);
                            pdf.pdfreader.viewer.editor.free.utils.k0.c(officeReaderActivity, pdfPreviewEntity.getPath(), pdfPreviewEntity, "", ea.a.p("dVIETSxXLVI2MmRERg==", "4jhHcJ5F"));
                            officeReaderActivity.b3(false);
                        }
                    }
                });
            }
            View view3 = this.D0;
            if (view3 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$findView$4
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view4) {
                        invoke2(view4);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                        String p10 = ea.a.p("RWkudw==", "l15GX9t2");
                        String p11 = ea.a.p("OWlUdyZjWG4sZThiFG4GZUdfDWwqc2U=", "3jUQ4LhE");
                        String str = ConvertEventCenter.f28653a;
                        tn.a.d(officeReaderActivity, p10, p11, ConvertEventCenter.f28653a, false);
                        OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                        String str2 = OfficeReaderActivity.D2;
                        officeReaderActivity2.b3(false);
                    }
                });
            }
            Word2PDFGuideView word2PDFGuideView = this.f25985y0;
            if (word2PDFGuideView != null) {
                word2PDFGuideView.setOnCloseClickListener(new e());
            }
            ImageView imageView = this.K1;
            if (imageView != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$findView$6
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view4) {
                        invoke2(view4);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        AIEventCenter.f28648a.getClass();
                        AIEventCenter.b();
                        OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                        String p10 = ea.a.p("PWkgdw==", "plKEZ9DQ");
                        String p11 = ea.a.p("OWlUdyZhXl85bCNjaw==", "eMpw4Rr3");
                        OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                        String str = OfficeReaderActivity.D2;
                        tn.a.d(officeReaderActivity, p10, p11, officeReaderActivity2.u2(), false);
                        if (OfficeReaderActivity.b2(OfficeReaderActivity.this)) {
                            OfficeReaderActivity officeReaderActivity3 = OfficeReaderActivity.this;
                            e.a.b(officeReaderActivity3, officeReaderActivity3.L0, OS2WindowsMetricsTable.WEIGHT_CLASS_BOLD, 602, ea.a.p("RWkudw==", "Biwlmx5H"), ea.a.p("RWkudw==", "3fT2aesN"), false);
                        }
                        OfficeReaderActivity officeReaderActivity4 = OfficeReaderActivity.this;
                        officeReaderActivity4.getClass();
                        if (q0.C(officeReaderActivity4)) {
                            q0.v(officeReaderActivity4);
                        }
                        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                        AppCoreFilterEvent.g(ea.a.p("LmluZRd0UnIFYyZpFms=", "62o2IZ2D"));
                    }
                });
            }
            if (pdf.pdfreader.viewer.editor.free.utils.extension.f.a(23)) {
                View decorView = getWindow().getDecorView();
                pdf.pdfreader.viewer.editor.free.office.g gVar = new pdf.pdfreader.viewer.editor.free.office.g(this);
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                f0.i.u(decorView, gVar);
            }
            ViewGroup viewGroup2 = this.f25972v;
            if (viewGroup2 != null) {
                h5.e eVar = new h5.e(this, 13);
                WeakHashMap<View, x0.n0> weakHashMap2 = x0.f0.f31435a;
                f0.i.u(viewGroup2, eVar);
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "LEynUPZs"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PW9edC9pUnc=", "k1beQcWu"));
        throw null;
    }

    public final String C2() {
        ea.a.p("K2VCaw==", "YRAww2gm");
        if (TextUtils.equals(ea.a.p("dVIETSxBSQ==", "Op04dTgW"), this.f25964t)) {
            return ea.a.p("K2lUaFJ0", "7lJ73TCg");
        }
        if (S2()) {
            return ea.a.p("R2gicmQ=", "hlDDCzaY");
        }
        if (T2()) {
            return ea.a.p("PGhecg1jQnQ=", "eubRmDMp");
        }
        return ea.a.p("MWU3aw==", "7DUDtinB");
    }

    @Override // sp.b
    public final void D() {
        e3();
        J2(false, -1, true, "", 0, null);
    }

    public final pdf.pdfreader.viewer.editor.free.feature.bridge.c D2() {
        return (pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.H1.getValue();
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_office_reader;
    }

    public final ThumbLoadCenter E2() {
        return (ThumbLoadCenter) this.f25978w1.getValue();
    }

    @Override // lib.zj.office.wp.control.Word.i
    public final void F0() {
        String str;
        boolean z10;
        boolean z11;
        rh.k kVar = k.a.f29581a;
        boolean z12 = kVar.f29580b;
        if (z12) {
            if (z12) {
                View view = this.f25950o0;
                if (view != null) {
                    if (kVar.f29579a == 5) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    view.setEnabled(!z11);
                }
                View view2 = this.f25953p0;
                if (view2 != null) {
                    if (kVar.f29579a == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    view2.setEnabled(true ^ z10);
                }
            }
            ProgressView progressView = this.f25961s0;
            if (progressView != null) {
                progressView.setVisibility(8);
            }
            TextView textView = this.f25956q0;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f25956q0;
            if (textView2 != null) {
                textView2.setText(kVar.a());
            }
            String p10 = ea.a.p("QWUtbBx3", "aukZMuSx");
            String p11 = ea.a.p("PWVXbBZ3aHI_YS5fGHUEdA==", "Iys6YLkY");
            String d10 = pdf.pdfreader.viewer.editor.free.utils.p.d(this.N0);
            int i10 = kVar.f29579a;
            if (i10 >= 0 && i10 < 6) {
                str = rh.k.f29578e[i10];
            } else {
                str = "out of range";
            }
            tn.a.d(this, p10, p11, androidx.activity.f.m(d10, "_", str), false);
        }
    }

    public final int F2() {
        int[] iArr;
        InterceptTouchFrameLayout interceptTouchFrameLayout;
        try {
            iArr = new int[2];
            interceptTouchFrameLayout = this.f25984y;
        } catch (Exception unused) {
        }
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.getLocationInWindow(iArr);
            int U = iArr[1] - t0.U(this);
            if (U >= 0) {
                return (int) (U + getResources().getDimension(R.dimen.dp_6));
            }
            return -1;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "kbx6mRvi"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final File G0() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            File filesDir = getFilesDir();
            kotlin.jvm.internal.g.d(filesDir, ea.a.p("KWldZQpEXnI=", "GuRWwMNp"));
            return filesDir;
        }
        return externalFilesDir;
    }

    public final void G2() {
        if (this.f25931h2) {
            this.f25931h2 = false;
            X2();
        }
        ConstraintLayout constraintLayout = this.f25924e0;
        if (constraintLayout != null && constraintLayout.getVisibility() != 8) {
            constraintLayout.setAlpha(1.0f);
            constraintLayout.animate().alpha(0.0f).setDuration(100L).setListener(new g(constraintLayout)).start();
        }
    }

    public final void H2() {
        InputMethodManager inputMethodManager;
        Object systemService = getSystemService(ea.a.p("Hm4gdQVfW2U8aAlk", "GmwPq6X2"));
        if (systemService instanceof InputMethodManager) {
            inputMethodManager = (InputMethodManager) systemService;
        } else {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            EditText editText = this.G;
            if (editText != null) {
                inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoJ2QbdGBlEXQ=", "iVGIS6hx"));
                throw null;
            }
        }
    }

    public final void I2() {
        runOnUiThread(new pdf.pdfreader.viewer.editor.free.office.l(this, 1));
    }

    public final void J2(final boolean z10, final int i10, final boolean z11, final String str, final int i11, final Throwable th2) {
        w2().post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.office.d
            @Override // java.lang.Runnable
            public final void run() {
                final boolean z12 = z10;
                final int i12 = i10;
                final String str2 = str;
                final int i13 = i11;
                final Throwable th3 = th2;
                String str3 = OfficeReaderActivity.D2;
                String p10 = ea.a.p("R2g9c1Uw", "4k3TqPdH");
                final OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                kotlin.jvm.internal.g.e(officeReaderActivity, p10);
                long currentTimeMillis = System.currentTimeMillis() - officeReaderActivity.B2;
                officeReaderActivity.B2 = 0L;
                if (z11) {
                    FrameLayout frameLayout = officeReaderActivity.E0;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(8);
                    }
                } else if (currentTimeMillis > 500) {
                    officeReaderActivity.Z2(1.0f);
                    officeReaderActivity.w2().postDelayed(new Runnable(z12, str2, i13, i12, th3) { // from class: pdf.pdfreader.viewer.editor.free.office.f

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ boolean f26096b;
                        public final /* synthetic */ String c;

                        /* renamed from: d  reason: collision with root package name */
                        public final /* synthetic */ int f26097d;

                        /* renamed from: e  reason: collision with root package name */
                        public final /* synthetic */ Throwable f26098e;

                        {
                            this.f26098e = th3;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:25:0x0129, code lost:
                            if (r5 == false) goto L30;
                         */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 473
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.f.run():void");
                        }
                    }, 0L);
                } else {
                    officeReaderActivity.Z2(1.0f);
                    officeReaderActivity.w2().postDelayed(new Runnable(z12, str2, i13, i12, th3) { // from class: pdf.pdfreader.viewer.editor.free.office.f

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ boolean f26096b;
                        public final /* synthetic */ String c;

                        /* renamed from: d  reason: collision with root package name */
                        public final /* synthetic */ int f26097d;

                        /* renamed from: e  reason: collision with root package name */
                        public final /* synthetic */ Throwable f26098e;

                        {
                            this.f26098e = th3;
                        }

                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 473
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.f.run():void");
                        }
                    }, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM) - currentTimeMillis);
                }
            }
        });
    }

    @Override // lib.zj.office.system.i
    public final void K() {
        View view;
        o9.d.s(D2, ea.a.p("LG9ccBVlQ2UWYTNvAHQ=", "CFzLl3E2"));
        String name = Thread.currentThread().getName();
        o9.d.r("completeLayout Thread --- =" + name);
        t1.b(ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnlmYyxtEWwPdDxML3lcdXQ=", "ajYNLh2w"));
        androidx.activity.f.q("fGYtaRBlMGUTZFFyKGMiaTJpRnlmYyxtEmwwdC9MG3lcdXQ=", "bUJzaNUZ", dp.a.a());
        this.f25942l1 = true;
        l3();
        I2();
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null && (view = pVar.getView()) != null) {
            byte b10 = (byte) this.f25933i1;
            if (b10 == 0) {
                if (view instanceof Word) {
                    q3(((Word) view).getPageCount());
                    N2();
                }
            } else if (b10 == 2) {
                ea.a.p("Q3A_IBBvD3AeZUBlJWEvbzF0", "SUGD4prQ");
            }
        }
    }

    @Override // jl.a
    public final void K1() {
        View findViewById = findViewById(R.id.pageGotoLl);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("KWlfZC9pUncYeQNkSVYBZUI-RlJraQEuG2EOZSNvRm8DbCk=", "dyCVkid2"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                invoke2(view);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                kotlin.jvm.internal.g.e(it, "it");
                OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                String str = OfficeReaderActivity.D2;
                officeReaderActivity.K2();
                OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                lib.zj.office.system.p pVar = officeReaderActivity2.P0;
                View view = pVar != null ? pVar.getView() : null;
                if (view instanceof Word) {
                    officeReaderActivity2.h3(0, false);
                } else if (view instanceof Presentation) {
                    officeReaderActivity2.h3(1, false);
                }
            }
        });
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(2));
            LottieAnimationView lottieAnimationView = this.f25980x;
            if (lottieAnimationView != null) {
                lottieAnimationView.setOnClickListener(new f5.d(this, 18));
                TextView textView = (TextView) findViewById(R.id.turn_page_cancel);
                textView.setPaintFlags(textView.getPaintFlags() | 8);
                ea.a.p("O3VDbilhUGUZYSRjEGw=", "vjQmPhoT");
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$4
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                        invoke2(view);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(View it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        tn.a.b(OfficeReaderActivity.this, ea.a.p("OWlUdw==", "Phi4hyhA"), ea.a.p("RWkudyxwDXMbdF1vB181YSpjV2wZYy9pN2s=", "TT5TSOLV"));
                        OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                        String str = OfficeReaderActivity.D2;
                        officeReaderActivity.N2();
                    }
                });
                AppCompatImageView appCompatImageView = this.Q;
                if (appCompatImageView != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$5
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                            invoke2(view);
                            return tf.d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(View it) {
                            kotlin.jvm.internal.g.e(it, "it");
                            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                            String str = OfficeReaderActivity.D2;
                            officeReaderActivity.K2();
                            OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                            officeReaderActivity2.getClass();
                            androidx.activity.s.z0(officeReaderActivity2);
                            pdf.pdfreader.viewer.editor.free.utils.p.r(officeReaderActivity2, officeReaderActivity2.N0, officeReaderActivity2.f25965t0);
                            e1.d(officeReaderActivity2, new File(officeReaderActivity2.L0));
                        }
                    });
                    AppCompatImageView appCompatImageView2 = this.R;
                    if (appCompatImageView2 != null) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$6
                            {
                                super(1);
                            }

                            @Override // cg.l
                            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                invoke2(view);
                                return tf.d.f30009a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(View it) {
                                char c10;
                                char c11;
                                kotlin.jvm.internal.g.e(it, "it");
                                OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                String str = OfficeReaderActivity.D2;
                                officeReaderActivity.K2();
                                OfficeReaderActivity.this.N2();
                                OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                                officeReaderActivity2.getClass();
                                if (Decoder.f18572a) {
                                    try {
                                        String substring = hd.a.b(officeReaderActivity2).substring(467, 498);
                                        kotlin.jvm.internal.g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        Charset charset = kotlin.text.a.f19966b;
                                        byte[] bytes = substring.getBytes(charset);
                                        kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
                                        byte[] bytes2 = "66f726e696131163014060355040713".getBytes(charset);
                                        kotlin.jvm.internal.g.d(bytes2, "this as java.lang.String).getBytes(charset)");
                                        long j10 = 2;
                                        if (System.currentTimeMillis() % j10 == 0) {
                                            int nextInt = hd.a.f18145a.nextInt(0, bytes.length / 2);
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 > nextInt) {
                                                    c11 = 0;
                                                    break;
                                                } else if (bytes[i10] != bytes2[i10]) {
                                                    c11 = 16;
                                                    break;
                                                } else {
                                                    i10++;
                                                }
                                            }
                                            if ((c11 ^ 0) != 0) {
                                                hd.a.a();
                                                throw null;
                                            }
                                        } else if (!Arrays.equals(bytes2, bytes)) {
                                            hd.a.a();
                                            throw null;
                                        }
                                        try {
                                            String substring2 = ed.a.b(officeReaderActivity2).substring(2612, 2643);
                                            kotlin.jvm.internal.g.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                            Charset charset2 = kotlin.text.a.f19966b;
                                            byte[] bytes3 = substring2.getBytes(charset2);
                                            kotlin.jvm.internal.g.d(bytes3, "this as java.lang.String).getBytes(charset)");
                                            byte[] bytes4 = "34faa70a6b9a20f86fffd629d5e58c7".getBytes(charset2);
                                            kotlin.jvm.internal.g.d(bytes4, "this as java.lang.String).getBytes(charset)");
                                            if (System.currentTimeMillis() % j10 == 0) {
                                                int nextInt2 = ed.a.f16559a.nextInt(0, bytes3.length / 2);
                                                int i11 = 0;
                                                while (true) {
                                                    if (i11 > nextInt2) {
                                                        c10 = 0;
                                                        break;
                                                    } else if (bytes3[i11] != bytes4[i11]) {
                                                        c10 = 16;
                                                        break;
                                                    } else {
                                                        i11++;
                                                    }
                                                }
                                                if ((c10 ^ 0) != 0) {
                                                    ed.a.a();
                                                    throw null;
                                                }
                                            } else if (!Arrays.equals(bytes4, bytes3)) {
                                                ed.a.a();
                                                throw null;
                                            }
                                        } catch (Exception e10) {
                                            e10.printStackTrace();
                                            ed.a.a();
                                            throw null;
                                        }
                                    } catch (Exception e11) {
                                        e11.printStackTrace();
                                        hd.a.a();
                                        throw null;
                                    }
                                } else {
                                    ReaderPdfApplication.o(officeReaderActivity2);
                                }
                                PdfPreviewEntity pdfPreviewEntity = officeReaderActivity2.N0;
                                String str2 = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
                                pdf.pdfreader.viewer.editor.free.utils.p.b(officeReaderActivity2, ea.a.p("RWkudw==", "w25mw6ca"), ea.a.p("PmkSdw5zLWE6Yw5fV2w-Y2s=", "wRHwQHiC"), pdf.pdfreader.viewer.editor.free.utils.p.d(pdfPreviewEntity));
                                officeReaderActivity2.h2(true);
                            }
                        });
                        AppCompatImageView appCompatImageView3 = this.S;
                        if (appCompatImageView3 != null) {
                            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$7
                                {
                                    super(1);
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                    invoke2(view);
                                    return tf.d.f30009a;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:44:0x00a4  */
                                /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
                                /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
                                /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void invoke2(android.view.View r10) {
                                    /*
                                        Method dump skipped, instructions count: 236
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$7.invoke2(android.view.View):void");
                                }
                            });
                            AppCompatImageView appCompatImageView4 = this.T;
                            if (appCompatImageView4 != null) {
                                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$8
                                    {
                                        super(1);
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                        invoke2(view);
                                        return tf.d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(View it) {
                                        int slideCount;
                                        TextView textView2;
                                        tf.d dVar;
                                        kotlin.jvm.internal.g.e(it, "it");
                                        OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                        String str = OfficeReaderActivity.D2;
                                        officeReaderActivity.K2();
                                        OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                                        officeReaderActivity2.getClass();
                                        androidx.activity.s.z0(officeReaderActivity2);
                                        pdf.pdfreader.viewer.editor.free.utils.p.s(officeReaderActivity2, officeReaderActivity2.N0, officeReaderActivity2.f25965t0);
                                        PdfPreviewEntity pdfPreviewEntity = officeReaderActivity2.N0;
                                        if (pdfPreviewEntity != null) {
                                            pdf.pdfreader.viewer.editor.free.ui.dialog.z zVar = officeReaderActivity2.f25951o1;
                                            if (zVar != null) {
                                                zVar.show();
                                                dVar = tf.d.f30009a;
                                            } else {
                                                dVar = null;
                                            }
                                            if (dVar == null) {
                                                pdf.pdfreader.viewer.editor.free.ui.dialog.z zVar2 = new pdf.pdfreader.viewer.editor.free.ui.dialog.z(officeReaderActivity2, pdfPreviewEntity, officeReaderActivity2.f25933i1, new w(officeReaderActivity2, officeReaderActivity2));
                                                zVar2.R = new androidx.privacysandbox.ads.adservices.java.internal.a(officeReaderActivity2, officeReaderActivity2);
                                                zVar2.show();
                                                pdf.pdfreader.viewer.editor.free.utils.p.b(officeReaderActivity2, ea.a.p("OWlUdyZtWHJl", "xoXXsQh8"), ea.a.p("RWkudx5vEGUtc1xvdw==", "fE5uEVWY"), pdf.pdfreader.viewer.editor.free.utils.p.d(officeReaderActivity2.N0));
                                                officeReaderActivity2.f25951o1 = zVar2;
                                            }
                                        }
                                        lib.zj.office.system.p pVar = officeReaderActivity2.P0;
                                        View view = pVar != null ? pVar.getView() : null;
                                        if (view instanceof Word) {
                                            slideCount = officeReaderActivity2.n2() ? ((Word) view).getPageCount() : 1;
                                        } else {
                                            slideCount = view instanceof Presentation ? ((Presentation) view).getSlideCount() : 0;
                                        }
                                        pdf.pdfreader.viewer.editor.free.ui.dialog.z zVar3 = officeReaderActivity2.f25951o1;
                                        if (zVar3 == null || (textView2 = zVar3.E) == null) {
                                            return;
                                        }
                                        textView2.setVisibility(slideCount <= 1 ? 8 : 0);
                                        zVar3.I();
                                        if (slideCount > 1) {
                                            pdf.pdfreader.viewer.editor.free.utils.p.b(zVar3.getContext(), ea.a.p("OWlUdyZtWHJl", "L883c3ek"), ea.a.p("RWkudx5vEGUtcFVnDF8laCt3", "NCEAE2eS"), pdf.pdfreader.viewer.editor.free.utils.p.d(zVar3.f27812z));
                                        }
                                    }
                                });
                                AppCompatImageView appCompatImageView5 = this.H;
                                if (appCompatImageView5 != null) {
                                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$9
                                        {
                                            super(1);
                                        }

                                        @Override // cg.l
                                        public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                            invoke2(view);
                                            return tf.d.f30009a;
                                        }

                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                        public final void invoke2(View it) {
                                            lib.zj.office.system.h t4;
                                            kotlin.jvm.internal.g.e(it, "it");
                                            EditText editText = OfficeReaderActivity.this.G;
                                            if (editText != null) {
                                                editText.setText("");
                                                Group group = OfficeReaderActivity.this.K;
                                                if (group != null) {
                                                    group.setVisibility(8);
                                                    OfficeReaderActivity.this.e2(false);
                                                    lib.zj.office.system.p pVar = OfficeReaderActivity.this.P0;
                                                    if (pVar == null || (t4 = pVar.t()) == null) {
                                                        return;
                                                    }
                                                    t4.b();
                                                    return;
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("PGVQchpofXU3cA1yGnVw", "gnMUXxfo"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("RGUZcgxoJ2QhdDJlTHQ=", "h87xob4H"));
                                            throw null;
                                        }
                                    });
                                    EditText editText = this.G;
                                    if (editText != null) {
                                        String string = getString(R.string.arg_res_0x7f1303e8);
                                        editText.setHint(" " + string);
                                        EditText editText2 = this.G;
                                        if (editText2 != null) {
                                            editText2.setImeOptions(268435459);
                                            EditText editText3 = this.G;
                                            if (editText3 != null) {
                                                editText3.addTextChangedListener(new j());
                                                EditText editText4 = this.G;
                                                if (editText4 != null) {
                                                    editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: pdf.pdfreader.viewer.editor.free.office.k
                                                        @Override // android.widget.TextView.OnEditorActionListener
                                                        public final boolean onEditorAction(TextView textView2, int i10, KeyEvent keyEvent) {
                                                            boolean z10;
                                                            lib.zj.office.system.p pVar;
                                                            final lib.zj.office.system.h t4;
                                                            String str = OfficeReaderActivity.D2;
                                                            String p10 = ea.a.p("TWg9cxww", "Mm9T8gXq");
                                                            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                                            kotlin.jvm.internal.g.e(officeReaderActivity, p10);
                                                            final String obj = textView2.getText().toString();
                                                            if (i10 == 3) {
                                                                if (obj.length() > 0) {
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                if (z10 && (pVar = officeReaderActivity.P0) != null && (t4 = pVar.t()) != null) {
                                                                    c0 B2 = officeReaderActivity.B2();
                                                                    OfficeReaderActivity.k kVar = new OfficeReaderActivity.k();
                                                                    B2.getClass();
                                                                    if (!B2.f26075d) {
                                                                        ea.a.p("QGUqchBoIW8cdFFudA==", "5O16VhD1");
                                                                        B2.a(kVar, new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$searchContent$1
                                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                            {
                                                                                super(0);
                                                                            }

                                                                            /* JADX WARN: Can't rename method to resolve collision */
                                                                            @Override // cg.a
                                                                            public final Boolean invoke() {
                                                                                return Boolean.valueOf(lib.zj.office.system.h.this.d(obj));
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                                officeReaderActivity.H2();
                                                            }
                                                            return false;
                                                        }
                                                    });
                                                    AppCompatImageView appCompatImageView6 = this.I;
                                                    if (appCompatImageView6 != null) {
                                                        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView6, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$12

                                                            /* compiled from: OfficeReaderActivity.kt */
                                                            /* loaded from: classes3.dex */
                                                            public static final class a implements b0 {

                                                                /* renamed from: a  reason: collision with root package name */
                                                                public final /* synthetic */ OfficeReaderActivity f26002a;

                                                                public a(OfficeReaderActivity officeReaderActivity) {
                                                                    this.f26002a = officeReaderActivity;
                                                                }

                                                                @Override // pdf.pdfreader.viewer.editor.free.office.b0
                                                                public final void a(boolean z10) {
                                                                    OfficeReaderActivity officeReaderActivity = this.f26002a;
                                                                    if (!z10) {
                                                                        officeReaderActivity.f25939k1 = true;
                                                                        j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1303b7), false, null, officeReaderActivity.F2());
                                                                        return;
                                                                    }
                                                                    officeReaderActivity.f25936j1 = false;
                                                                }
                                                            }

                                                            {
                                                                super(1);
                                                            }

                                                            @Override // cg.l
                                                            public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                                                invoke2(view);
                                                                return tf.d.f30009a;
                                                            }

                                                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                            public final void invoke2(View it) {
                                                                final lib.zj.office.system.h t4;
                                                                kotlin.jvm.internal.g.e(it, "it");
                                                                OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                                                if (officeReaderActivity.f25939k1) {
                                                                    j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1303b7), false, null, OfficeReaderActivity.this.F2());
                                                                    return;
                                                                }
                                                                lib.zj.office.system.p pVar = officeReaderActivity.P0;
                                                                if (pVar == null || (t4 = pVar.t()) == null) {
                                                                    return;
                                                                }
                                                                OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                                                                c0 B2 = officeReaderActivity2.B2();
                                                                a aVar = new a(officeReaderActivity2);
                                                                B2.getClass();
                                                                if (B2.f26075d) {
                                                                    return;
                                                                }
                                                                ea.a.p("QGUqchBoIGERa0NhG2Q=", "ooNYXaoE");
                                                                B2.a(aVar, new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$searchBackward$1
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                                    @Override // cg.a
                                                                    public final Boolean invoke() {
                                                                        return Boolean.valueOf(lib.zj.office.system.h.this.e());
                                                                    }
                                                                });
                                                            }
                                                        });
                                                        AppCompatImageView appCompatImageView7 = this.J;
                                                        if (appCompatImageView7 != null) {
                                                            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView7, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$13

                                                                /* compiled from: OfficeReaderActivity.kt */
                                                                /* loaded from: classes3.dex */
                                                                public static final class a implements b0 {

                                                                    /* renamed from: a  reason: collision with root package name */
                                                                    public final /* synthetic */ OfficeReaderActivity f26003a;

                                                                    public a(OfficeReaderActivity officeReaderActivity) {
                                                                        this.f26003a = officeReaderActivity;
                                                                    }

                                                                    @Override // pdf.pdfreader.viewer.editor.free.office.b0
                                                                    public final void a(boolean z10) {
                                                                        OfficeReaderActivity officeReaderActivity = this.f26003a;
                                                                        if (!z10) {
                                                                            officeReaderActivity.f25936j1 = true;
                                                                            j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1303b7), false, null, officeReaderActivity.F2());
                                                                            return;
                                                                        }
                                                                        officeReaderActivity.f25939k1 = false;
                                                                    }
                                                                }

                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // cg.l
                                                                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                                                                    invoke2(view);
                                                                    return tf.d.f30009a;
                                                                }

                                                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                public final void invoke2(View it) {
                                                                    final lib.zj.office.system.h t4;
                                                                    kotlin.jvm.internal.g.e(it, "it");
                                                                    OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                                                    if (officeReaderActivity.f25936j1) {
                                                                        j1.e(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1303b7), false, null, OfficeReaderActivity.this.F2());
                                                                        return;
                                                                    }
                                                                    lib.zj.office.system.p pVar = officeReaderActivity.P0;
                                                                    if (pVar == null || (t4 = pVar.t()) == null) {
                                                                        return;
                                                                    }
                                                                    OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                                                                    c0 B2 = officeReaderActivity2.B2();
                                                                    a aVar = new a(officeReaderActivity2);
                                                                    B2.getClass();
                                                                    if (B2.f26075d) {
                                                                        return;
                                                                    }
                                                                    ea.a.p("QGUqchBoJG8Ad1VyZA==", "YAnXSGCU");
                                                                    B2.a(aVar, new cg.a<Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeSearchTask$searchForward$1
                                                                        {
                                                                            super(0);
                                                                        }

                                                                        /* JADX WARN: Can't rename method to resolve collision */
                                                                        @Override // cg.a
                                                                        public final Boolean invoke() {
                                                                            return Boolean.valueOf(lib.zj.office.system.h.this.f());
                                                                        }
                                                                    });
                                                                }
                                                            });
                                                            View view = this.P;
                                                            if (view != null) {
                                                                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$14
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // cg.l
                                                                    public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                                                                        invoke2(view2);
                                                                        return tf.d.f30009a;
                                                                    }

                                                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(View it) {
                                                                        kotlin.jvm.internal.g.e(it, "it");
                                                                        Context context = it.getContext();
                                                                        String p10 = ea.a.p("GmkOdw==", "nglkq6Mx");
                                                                        String p11 = ea.a.p("RWkudyxzB2EAY1xfBW83ZBtjXm81ZQ==", "02Nr2C8y");
                                                                        String a10 = pdf.pdfreader.viewer.editor.free.utils.w.a(OfficeReaderActivity.this.L0);
                                                                        ea.a.p("KGVFRhBsUlQjcC8oE2kEZWVhGmgp", "VUldTdQP");
                                                                        Locale locale = Locale.getDefault();
                                                                        String f10 = a6.h.f("VGU_RBZmA3UedBwp", "wa72OILM", locale, a10, locale);
                                                                        kotlin.jvm.internal.g.d(f10, ea.a.p("R2gic1NhESAYYUJhR2w3biMuYXQ0aS1nXi4lbyBvQGVBQypzFigObxFhWGUp", "wQl7hbr5"));
                                                                        tn.a.d(context, p10, p11, f10, false);
                                                                        c0 B2 = OfficeReaderActivity.this.B2();
                                                                        lib.zj.office.system.p pVar = OfficeReaderActivity.this.P0;
                                                                        lib.zj.office.system.h t4 = pVar != null ? pVar.t() : null;
                                                                        B2.getClass();
                                                                        ea.a.p("UGElYxZsQnMXYUZjaA==", "8XBqulaL");
                                                                        B2.f26080i = true;
                                                                        if (t4 != null) {
                                                                            t4.c();
                                                                        }
                                                                    }
                                                                });
                                                                c0 B2 = B2();
                                                                l lVar = new l();
                                                                B2.getClass();
                                                                B2.f26078g = lVar;
                                                                View view2 = this.f25935j0;
                                                                if (view2 != null) {
                                                                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$16
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // cg.l
                                                                        public /* bridge */ /* synthetic */ tf.d invoke(View view3) {
                                                                            invoke2(view3);
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(View it) {
                                                                            kotlin.jvm.internal.g.e(it, "it");
                                                                            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                                                                            String str = OfficeReaderActivity.D2;
                                                                            officeReaderActivity.K2();
                                                                            OfficeReaderActivity.this.p2();
                                                                            tn.a.d(OfficeReaderActivity.this, ea.a.p("RWkudw==", "m9A5IHEu"), ea.a.p("RWkudyxyB2Yeb0NfCmw_Y2s=", "JSqrCNFh"), OfficeReaderActivity.this.C2().concat("_word"), false);
                                                                        }
                                                                    });
                                                                }
                                                                ReflowOpenGuideView reflowOpenGuideView = this.f25941l0;
                                                                if (reflowOpenGuideView != null) {
                                                                    reflowOpenGuideView.setOnReflowClickListener(new m());
                                                                }
                                                                PreviewAIGuideView previewAIGuideView = this.f25944m0;
                                                                if (previewAIGuideView != null) {
                                                                    previewAIGuideView.setOnAIAssistantClickListener(new n());
                                                                }
                                                                View view3 = this.f25953p0;
                                                                if (view3 != null) {
                                                                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$19
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // cg.l
                                                                        public /* bridge */ /* synthetic */ tf.d invoke(View view4) {
                                                                            invoke2(view4);
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(View it) {
                                                                            kotlin.jvm.internal.g.e(it, "it");
                                                                            lib.zj.office.system.p pVar = OfficeReaderActivity.this.P0;
                                                                            if (pVar != null) {
                                                                                pVar.r(536870943, null);
                                                                            }
                                                                            tn.a.d(OfficeReaderActivity.this, ea.a.p("PWVXbBZ3", "zoEivroZ"), ea.a.p("PWVXbBZ3aGY1bj5fB2UMdUZlMWMpaQZr", "12kNbMJf"), ea.a.p("GW9BZA==", "9cn3oCds"), false);
                                                                        }
                                                                    });
                                                                }
                                                                View view4 = this.f25950o0;
                                                                if (view4 != null) {
                                                                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initView$20
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // cg.l
                                                                        public /* bridge */ /* synthetic */ tf.d invoke(View view5) {
                                                                            invoke2(view5);
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(View it) {
                                                                            kotlin.jvm.internal.g.e(it, "it");
                                                                            lib.zj.office.system.p pVar = OfficeReaderActivity.this.P0;
                                                                            if (pVar != null) {
                                                                                pVar.r(536870944, null);
                                                                            }
                                                                            tn.a.d(OfficeReaderActivity.this, ea.a.p("PWVXbBZ3", "ZuwhDioL"), ea.a.p("MWUybAp3HGYnbhJfXW40cl1hIWUWY1ppF2s=", "T7CTeCJ6"), ea.a.p("OW8gZA==", "bZNROYHn"), false);
                                                                        }
                                                                    });
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoIWwdc1FJBGc=", "Ujj0opWO"));
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoJG8Ad1VyDUl2", "leS3Srz1"));
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoIGERa312", "0rhXBf3p"));
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("MmURchtoJmQhdDJlTHQ=", "VnApxcAH"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoJ2QbdGBlEXQ=", "tYwDYc90"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("G2VQcgloMmQhdDJlTHQ=", "23h1jwqv"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoJ2QbdGBlEXQ=", "V1578YLY"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("PGVQchpodGw_YThJdg==", "fxtFvept"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("Xm85ZTp2", "NuaSfbYP"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("GGkddzFlTXQhbmc=", "9Xnxb9sW"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("PGVQchpofnY=", "GtvyT8G6"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGgqchZJdg==", "XavzGo2x"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UWEoazp2", "xSb0CcMJ"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PHBdYQpoZW81dA==", "vYQLDhQ8"));
        throw null;
    }

    public final void K2() {
        ValueAnimator valueAnimator = this.f25932i0;
        if (valueAnimator != null) {
            if (!valueAnimator.isRunning()) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        this.f25932i0 = null;
        L2();
    }

    @Override // lib.zj.office.system.i
    public final boolean L() {
        return true;
    }

    @Override // jl.a
    public final void L1() {
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new q(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke2(bool);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "qtQ1fK0R"));
                boolean z10 = false;
                if (bool.booleanValue()) {
                    LinearLayout linearLayout = OfficeReaderActivity.this.M;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                        linearLayout.setVisibility(8);
                    }
                    OfficeReaderActivity.this.o3(false);
                    OfficeReaderActivity activity = OfficeReaderActivity.this;
                    gl.o.f17931a.getClass();
                    kotlin.jvm.internal.g.e(activity, "activity");
                    gl.p.f17933p.e(activity);
                    gl.q.f17934p.e(activity);
                    return;
                }
                OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                String str = OfficeReaderActivity.D2;
                officeReaderActivity.getClass();
                BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                if (billingConfigImpl.z() && BillingConfigImpl.A() && !billingConfigImpl.w()) {
                    z10 = true;
                }
                if (z10) {
                    OfficeReaderActivity.this.o3(true);
                }
            }
        }));
    }

    public final void L2() {
        j3();
        ValueAnimator valueAnimator = this.f25932i0;
        if (valueAnimator != null) {
            if (!valueAnimator.isRunning()) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        this.f25932i0 = null;
        View view = this.f25915a0;
        if (view != null) {
            view.setVisibility(8);
            View findViewById = findViewById(R.id.reflow_continue_use_guide_btn_bg);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("KWkJZDxpP3cKeS9kCFY-ZU8-elJnaVIuloDXbz90K246ZTh1GWUFZz1pAmVrYiNuZ2I1KQ==", "bEOgjZ9n"));
            findViewById.setVisibility(8);
        }
        this.f25915a0 = null;
    }

    @Override // lib.zj.office.system.i
    public final void M0(boolean z10) {
        o9.d.s(D2, "setFindBackForwardState false");
    }

    public final void M2() {
        try {
            Window window = getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                kotlin.jvm.internal.g.d(decorView, ea.a.p("AWUWbzVWHmV3", "t8euGwHB"));
                pdf.pdfreader.viewer.editor.free.utils.extension.i.d(window, decorView, new Integer[0], new Integer[]{1, 2});
            }
            h1.a(this, false);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // lib.zj.office.system.i
    public final void N() {
        View view;
        Presentation presentation;
        tf.d dVar;
        View view2;
        Word word;
        tf.d dVar2;
        int i10 = this.f25933i1;
        int i11 = this.f25923d2;
        if (i10 == 0 && !this.f25942l1) {
            lib.zj.office.system.p pVar = this.P0;
            if (pVar != null) {
                view2 = pVar.getView();
            } else {
                view2 = null;
            }
            if (view2 instanceof Word) {
                word = (Word) view2;
            } else {
                word = null;
            }
            if (word != null) {
                nl.b bVar = this.O0;
                if (bVar != null) {
                    if (bVar.f22595p <= i11 && word.getPageCount() >= bVar.f22595p) {
                        l3();
                        I2();
                    }
                    dVar2 = tf.d.f30009a;
                } else {
                    dVar2 = null;
                }
                if (dVar2 == null) {
                    l3();
                    I2();
                }
                q3(word.getPageCount());
            }
        }
        if (this.f25933i1 == 2) {
            lib.zj.office.system.p pVar2 = this.P0;
            if (pVar2 != null) {
                view = pVar2.getView();
            } else {
                view = null;
            }
            if (view instanceof Presentation) {
                presentation = (Presentation) view;
            } else {
                presentation = null;
            }
            if (presentation != null) {
                presentation.getRealSlideCount();
                try {
                    Object model = presentation.f20940t.f20913e.getModel();
                    kotlin.jvm.internal.g.c(model, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuXm5YbhRsJyBHeTtlU2wLYlx6Xi4GZjBpJ2UccCEuLm9VZRkuMUcGb1dlbA==", "1uaKi74W"));
                    th.c cVar = (th.c) model;
                    nl.b bVar2 = this.O0;
                    if (bVar2 != null) {
                        if ((bVar2.f22595p <= i11 && cVar.c() >= bVar2.f22595p) || cVar.c() == cVar.f30031e) {
                            l3();
                            I2();
                        }
                        dVar = tf.d.f30009a;
                    } else {
                        dVar = null;
                    }
                    if (dVar == null) {
                        l3();
                        I2();
                    }
                    W2(cVar.c());
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        AppFrame appFrame = this.f25920c1;
        if (appFrame != null) {
            int childCount = appFrame.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                AppFrame appFrame2 = this.f25920c1;
                if (appFrame2 != null) {
                    View childAt = appFrame2.getChildAt(i12);
                    if (childAt instanceof AToolsbar) {
                        ((AToolsbar) childAt).g();
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "aAf0cjZP"));
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("LnBBRgthWmU=", "eeYVGYxX"));
        throw null;
    }

    public final void N2() {
        ConstraintLayout constraintLayout = this.F1;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
        this.G1 = true;
    }

    @Override // lib.zj.office.system.i
    public final boolean O() {
        return false;
    }

    @Override // sp.b
    public final void O0(Float f10) {
        float f11;
        if (f10 != null) {
            f11 = f10.floatValue();
        } else {
            f11 = 0.0f;
        }
        Z2(f11);
    }

    public final void O2() {
        PdfPreviewEntity pdfPreviewEntity;
        nl.b bVar;
        if (this.O0 == null && (pdfPreviewEntity = this.N0) != null) {
            if (pdfPreviewEntity != null) {
                bVar = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
            } else {
                bVar = null;
            }
            this.O0 = bVar;
            ea.a.p("PGFHZTp1RXI_bj5QFGdl", "njhy4Ftw");
            nl.b bVar2 = this.O0;
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean P() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P0() {
        return this.K0;
    }

    public final void P2(Bundle bundle) {
        e.a.f29807a.a();
        ConcurrentHashMap<String, Paint> concurrentHashMap = sg.d.f29801b.f29802a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        lib.zj.office.system.p pVar = new lib.zj.office.system.p(this);
        this.P0 = pVar;
        pVar.f21055h = new h();
        AppFrame appFrame = new AppFrame(this);
        this.f25920c1 = appFrame;
        appFrame.post(new pdf.pdfreader.viewer.editor.free.office.i(this, 2));
        lib.zj.office.system.p pVar2 = this.P0;
        if (pVar2 != null) {
            pVar2.f21054g = new i();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f25984y;
        if (interceptTouchFrameLayout != null) {
            AppFrame appFrame2 = this.f25920c1;
            if (appFrame2 != null) {
                interceptTouchFrameLayout.addView(appFrame2);
                i2();
                d3();
                if (bundle == null) {
                    tn.a.d(this, ea.a.p("QHAnYQBo", "J0rNRrgB"), ea.a.p("P3JUdhBlQF81bilyEGEcZQ==", "uJVpAivm"), wn.b.e(), false);
                } else {
                    this.O1.f31395a = bundle.getLong(ea.a.p("PWVQZC1pWmU=", "UhFtgNmA"));
                }
                InterceptTouchFrameLayout interceptTouchFrameLayout2 = this.f25984y;
                if (interceptTouchFrameLayout2 != null) {
                    interceptTouchFrameLayout2.setTopTouchListener(new ro.d() { // from class: pdf.pdfreader.viewer.editor.free.office.b
                        @Override // ro.d
                        public final void g(MotionEvent motionEvent) {
                            String str = OfficeReaderActivity.D2;
                            String p10 = ea.a.p("I2gGc1Mw", "zrWowGLq");
                            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                            kotlin.jvm.internal.g.e(officeReaderActivity, p10);
                            if (motionEvent != null && motionEvent.getActionMasked() == 0) {
                                officeReaderActivity.K2();
                            }
                        }
                    });
                    InterceptRecyclerView interceptRecyclerView = this.X;
                    if (interceptRecyclerView != null) {
                        interceptRecyclerView.setTopTouchListener(new pdf.pdfreader.viewer.editor.free.office.g(this));
                        androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
                        wn.b.a(false, S2());
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("DmgFbSdSdg==", "76zpEkHB"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("A2VSZFZyNG8mdAdpWmVy", "4Fq33wDY"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "bqi6Slua"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("A2UUZAxyC28mdAdpWmVy", "vbquiHPW"));
        throw null;
    }

    public final void Q2() {
        boolean z10;
        int dimensionPixelSize;
        InterceptRecyclerView interceptRecyclerView = this.X;
        if (interceptRecyclerView != null) {
            interceptRecyclerView.setLayoutManager(new LinearLayoutManager(0));
            pdf.pdfreader.viewer.editor.free.thumb.adapter.b bVar = new pdf.pdfreader.viewer.editor.free.thumb.adapter.b(this.B1, this.f25990z1);
            this.A1 = bVar;
            ThumbLoadCenter E2 = E2();
            if (this.f25933i1 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            ThumbnailAdapter thumbnailAdapter = new ThumbnailAdapter(this, E2, false, bVar, z10, this);
            this.f25982x1 = thumbnailAdapter;
            thumbnailAdapter.f26593r = !v2();
            InterceptRecyclerView interceptRecyclerView2 = this.X;
            if (interceptRecyclerView2 != null) {
                interceptRecyclerView2.setAdapter(this.f25982x1);
                InterceptRecyclerView interceptRecyclerView3 = this.X;
                if (interceptRecyclerView3 != null) {
                    ViewGroup.LayoutParams layoutParams = interceptRecyclerView3.getLayoutParams();
                    if (this.f25933i1 == 2) {
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_74);
                    } else {
                        dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_90);
                    }
                    layoutParams.height = dimensionPixelSize;
                    interceptRecyclerView3.setLayoutParams(layoutParams);
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "KjSByAOh"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "OfJKVmCw"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "28yBLldI"));
        throw null;
    }

    public final boolean R2() {
        float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
        long j10 = 1024;
        long length = ((new File(this.L0).length() / j10) / j10) + 10;
        t1.b("OfficeReaderActivityconvert needSpace: " + length + " freeSize: " + a10);
        if (a10 > ((float) (length * 2))) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.system.i
    public final void S() {
        View view;
        ea.a.p("UGgqbhRlMmEVZQ==", "KcHafi6t");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null && (view = pVar.getView()) != null) {
            byte b10 = (byte) this.f25933i1;
            boolean z10 = false;
            if (b10 == 0) {
                if (view instanceof Word) {
                    Word word = (Word) view;
                    this.f25986y1 = V2(word.getCurrentPageNumber());
                    TextView textView = this.f25926f0;
                    if (textView != null) {
                        String format = String.format(Locale.ENGLISH, ea.a.p("FmQg", "s39SFJWh"), Arrays.copyOf(new Object[]{Integer.valueOf(this.f25986y1)}, 1));
                        kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SmwdY1VsDCx2ZityX2EyLGMqLXIGcyk=", "LaCm54oF"));
                        textView.setText(format);
                    }
                    AppCompatTextView appCompatTextView = this.f25988z;
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(String.valueOf(V2(word.getCurrentPageNumber())));
                        ThumbnailAdapter thumbnailAdapter = this.f25982x1;
                        if (thumbnailAdapter != null && thumbnailAdapter.f26585j == word.getCurrentPageNumber()) {
                            z10 = true;
                        }
                        if (!z10) {
                            InterceptRecyclerView interceptRecyclerView = this.X;
                            if (interceptRecyclerView != null) {
                                RecyclerView.m layoutManager = interceptRecyclerView.getLayoutManager();
                                if (layoutManager != null) {
                                    layoutManager.B0(word.getCurrentPageNumber() - 1);
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "jmDfNBo1"));
                                throw null;
                            }
                        }
                        ThumbnailAdapter thumbnailAdapter2 = this.f25982x1;
                        if (thumbnailAdapter2 != null) {
                            thumbnailAdapter2.h(word.getCurrentPageNumber());
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LHVDchxuQ1A7Zy9Udg==", "ziMTuJpM"));
                    throw null;
                }
            } else if (b10 == 2 && (view instanceof Presentation)) {
                Presentation presentation = (Presentation) view;
                this.f25986y1 = V2(presentation.getCurrentIndex() + 1);
                AppCompatTextView appCompatTextView2 = this.f25988z;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setText(String.valueOf(V2(presentation.getCurrentIndex() + 1)));
                    ThumbnailAdapter thumbnailAdapter3 = this.f25982x1;
                    if (thumbnailAdapter3 != null && thumbnailAdapter3.f26585j == V2(presentation.getCurrentIndex() + 1)) {
                        z10 = true;
                    }
                    if (!z10) {
                        InterceptRecyclerView interceptRecyclerView2 = this.X;
                        if (interceptRecyclerView2 != null) {
                            RecyclerView.m layoutManager2 = interceptRecyclerView2.getLayoutManager();
                            if (layoutManager2 != null) {
                                layoutManager2.B0(presentation.getCurrentIndex());
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("OmgEbVRSdg==", "WuNq68lr"));
                            throw null;
                        }
                    }
                    ThumbnailAdapter thumbnailAdapter4 = this.f25982x1;
                    if (thumbnailAdapter4 != null) {
                        thumbnailAdapter4.h(V2(presentation.getCurrentIndex() + 1));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "jwiRZak3"));
                throw null;
            }
        }
    }

    public final boolean S2() {
        return kotlin.jvm.internal.g.a(ea.a.p("dVIETSxUKkkgRA==", "VDarXq6L"), this.f25964t);
    }

    @Override // lib.zj.office.system.i
    public final void T(boolean z10) {
        o9.d.s(D2, "fullScreen " + z10);
        t1.b("OfficeReaderActivity fullScreen " + z10);
    }

    public final boolean T2() {
        return kotlin.jvm.internal.g.a(ea.a.p("SWEdZQt3GWQvZXQ=", "uj9zTpsA"), this.f25964t);
    }

    public final boolean U2() {
        EditText editText = this.G;
        if (editText != null) {
            if (editText.getVisibility() == 0) {
                return true;
            }
            return false;
        }
        kotlin.jvm.internal.g.i(ea.a.p("ImVWciFoLGQhdDJlTHQ=", "y1Q7Biru"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final int V0() {
        return getResources().getDimensionPixelSize(R.dimen.dp_36);
    }

    public final int V2(int i10) {
        return Math.min(i10, this.f25990z1);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void W2(int i10) {
        ThumbnailAdapter thumbnailAdapter;
        nl.b bVar;
        byte b10;
        byte b11;
        View view;
        View view2;
        View view3;
        int i11;
        O2();
        boolean z10 = false;
        if (!this.G1 && (bVar = this.O0) != null) {
            ConstraintLayout constraintLayout = this.F1;
            if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
                b10 = 1;
            } else {
                b10 = 0;
            }
            if (b10 == 0 && (i11 = bVar.f22595p) > this.f25923d2 && i10 < i11) {
                ConstraintLayout constraintLayout2 = this.F1;
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(0);
                }
                tn.a.b(this, ea.a.p("OWlUdw==", "1dZf2wPC"), ea.a.p("OWlUdyZwWHMzdCNvG18baFp3", "eKel3A3c"));
            }
            int i12 = bVar.f22595p;
            if (2 <= i12 && i12 <= i10) {
                b11 = 1;
            } else {
                b11 = 0;
            }
            if (b11 != 0) {
                lib.zj.office.system.p pVar = this.P0;
                Presentation presentation = null;
                Word word = null;
                if (pVar != null) {
                    view = pVar.getView();
                } else {
                    view = null;
                }
                if (view instanceof Word) {
                    lib.zj.office.system.p pVar2 = this.P0;
                    if (pVar2 != null) {
                        view3 = pVar2.getView();
                    } else {
                        view3 = null;
                    }
                    if (view3 instanceof Word) {
                        word = (Word) view3;
                    }
                    if (word != null) {
                        N2();
                        word.j(i12);
                    }
                } else if (view instanceof Presentation) {
                    lib.zj.office.system.p pVar3 = this.P0;
                    if (pVar3 != null) {
                        view2 = pVar3.getView();
                    } else {
                        view2 = null;
                    }
                    if (view2 instanceof Presentation) {
                        presentation = view2;
                    }
                    if (presentation != null) {
                        PGPrintMode pGPrintMode = presentation.f20940t;
                        try {
                            Object model = pGPrintMode.f20913e.getModel();
                            kotlin.jvm.internal.g.c(model, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5vbg1sXSA7eUFlWWxeYnR6IC4aZg5pVmVAcCIuCG8KZS4uKEd8bytlbA==", "UjNmnBx1"));
                            if (i12 <= ((th.c) model).c() && i12 > 0) {
                                N2();
                                APageListView aPageListView = pGPrintMode.f20913e;
                                aPageListView.setCurrentPageNumber(i12);
                                aPageListView.requestLayout();
                            }
                        } catch (Exception e10) {
                            t1.b(e10.toString());
                        }
                    }
                }
            }
        }
        int i13 = this.f25990z1;
        if (i13 >= i10) {
            return;
        }
        if (i13 == 0) {
            z10 = true;
        }
        this.f25990z1 = i10;
        pdf.pdfreader.viewer.editor.free.thumb.adapter.b bVar2 = this.A1;
        if (bVar2 != null && (thumbnailAdapter = this.f25982x1) != null) {
            if (z10) {
                bVar2.f26598b = i10;
                thumbnailAdapter.notifyDataSetChanged();
                return;
            }
            int i14 = thumbnailAdapter.f26582g.f26598b;
            bVar2.f26598b = i10;
            thumbnailAdapter.notifyItemRangeInserted(i14, i10 - i14);
        }
    }

    public final void X2() {
        int i10;
        int i11;
        int i12;
        if (this.f25927f2 && this.f25929g2 && !this.f25931h2) {
            View view = this.C;
            if (view != null) {
                view.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("P2FWZS1vVnMuTCNuZQ==", "knK4fKYi"));
                throw null;
            }
        } else {
            View view2 = this.C;
            if (view2 != null) {
                view2.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("Q2EsZSdvA3MGTF1uZQ==", "l4tZP5iU"));
                throw null;
            }
        }
        AppCompatTextView appCompatTextView = this.f25988z;
        if (appCompatTextView != null) {
            if (this.f25929g2 && !this.f25931h2) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            appCompatTextView.setVisibility(i10);
            AppCompatTextView appCompatTextView2 = this.A;
            if (appCompatTextView2 != null) {
                if (this.f25929g2 && !this.f25931h2) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                appCompatTextView2.setVisibility(i11);
                AppCompatTextView appCompatTextView3 = this.B;
                if (appCompatTextView3 != null) {
                    if (this.f25929g2 && !this.f25931h2) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    appCompatTextView3.setVisibility(i12);
                    if (!this.f25927f2) {
                        AppCompatTextView appCompatTextView4 = this.D;
                        if (appCompatTextView4 != null) {
                            appCompatTextView4.setVisibility(8);
                            if (this.f25929g2 && !this.f25931h2) {
                                LinearLayout linearLayout = this.E;
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "53gLk0gf"));
                                    throw null;
                                }
                            }
                            LinearLayout linearLayout2 = this.E;
                            if (linearLayout2 != null) {
                                linearLayout2.setVisibility(8);
                                return;
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("OGccYV5lPm8pc3Q=", "yfZL9jBJ"));
                                throw null;
                            }
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("VWknZT1hD2Umdg==", "XJ6SMlEJ"));
                        throw null;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("R28_YR9QA2cXVHY=", "mGkEZL01"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("P2FWZSpsVnNo", "ip6P3iX1"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "mYL5JosE"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final Integer Y0() {
        return Integer.valueOf(androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
    }

    public final void Y2() {
        PdfPreviewEntity pdfPreviewEntity;
        View view;
        View view2;
        nl.b bVar;
        View view3;
        nl.b bVar2;
        O2();
        if (this.O0 != null && (pdfPreviewEntity = this.N0) != null) {
            lib.zj.office.system.p pVar = this.P0;
            Presentation presentation = null;
            Word word = null;
            if (pVar != null) {
                view = pVar.getView();
            } else {
                view = null;
            }
            if (view instanceof Word) {
                lib.zj.office.system.p pVar2 = this.P0;
                if (pVar2 != null) {
                    view3 = pVar2.getView();
                } else {
                    view3 = null;
                }
                if (view3 instanceof Word) {
                    word = (Word) view3;
                }
                if (word != null && (bVar2 = this.O0) != null) {
                    bVar2.f22595p = word.getCurrentPageNumber();
                }
            } else if (view instanceof Presentation) {
                lib.zj.office.system.p pVar3 = this.P0;
                if (pVar3 != null) {
                    view2 = pVar3.getView();
                } else {
                    view2 = null;
                }
                if (view2 instanceof Presentation) {
                    presentation = view2;
                }
                if (presentation != null && (bVar = this.O0) != null) {
                    bVar.f22595p = V2(presentation.getCurrentIndex() + 1);
                }
            }
            ea.a.p("PGFHZTp1RXI_bj5QFGdl", "4ZVvmiKm");
            nl.b bVar3 = this.O0;
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (bVar3 != null) {
                com.google.android.play.core.assetpacks.c.P(bVar3, pdfPreviewEntity);
            }
            long id2 = pdfPreviewEntity.getId();
            String otherStrOne = pdfPreviewEntity.getOtherStrOne();
            kotlin.jvm.internal.g.d(otherStrOne, ea.a.p("HHRUbwVoMnIbdBRPWmU=", "JDuzqWqu"));
            String otherStrTwo = pdfPreviewEntity.getOtherStrTwo();
            kotlin.jvm.internal.g.d(otherStrTwo, ea.a.p("HXRnbxZoDnIbdBRUQ28=", "w9tIbkAE"));
            fo.a.a(id2, otherStrOne, otherStrTwo);
            bm.c.b(this).i(pdfPreviewEntity);
        }
    }

    public final void Z2(float f10) {
        Pdf2WordProgress pdf2WordProgress = this.F0;
        if (pdf2WordProgress != null) {
            pdf2WordProgress.setCurrentProgress((int) (f10 * 100));
        }
    }

    @Override // lib.zj.office.system.i
    public final String a1() {
        return ea.a.p("GlR3LTg=", "eY64814f");
    }

    public final void a3(boolean z10) {
        boolean z11 = this.f25929g2;
        boolean z12 = this.f25927f2;
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (!z12 && !z11) {
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                if (linearLayout.getVisibility() != 8) {
                    LinearLayout linearLayout2 = this.E;
                    if (linearLayout2 != null) {
                        linearLayout2.setAlpha(1.0f);
                        LinearLayout linearLayout3 = this.E;
                        if (linearLayout3 != null) {
                            linearLayout3.animate().alpha(0.0f).setDuration(450L).setListener(new r());
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "JQLQgRIz"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("BmcEYSFlMW8pc3Q=", "LudTFev7"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "ywv5NMq6"));
            throw null;
        } else if (!z10) {
            LinearLayout linearLayout4 = this.E;
            if (linearLayout4 != null) {
                if (linearLayout4.getVisibility() != 8) {
                    LinearLayout linearLayout5 = this.E;
                    if (linearLayout5 != null) {
                        linearLayout5.setAlpha(1.0f);
                        LinearLayout linearLayout6 = this.E;
                        if (linearLayout6 != null) {
                            linearLayout6.animate().alpha(0.0f).setDuration(450L).setListener(new s()).start();
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "L0dI2JPy"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "kt48CPvX"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "2EXCJtwl"));
            throw null;
        } else {
            LinearLayout linearLayout7 = this.E;
            if (linearLayout7 != null) {
                if (linearLayout7.getVisibility() != 0) {
                    LinearLayout linearLayout8 = this.E;
                    if (linearLayout8 != null) {
                        linearLayout8.setAlpha(0.0f);
                        LinearLayout linearLayout9 = this.E;
                        if (linearLayout9 != null) {
                            linearLayout9.animate().alpha(1.0f).setDuration(450L).setListener(null).start();
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "6ApQLXKP"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "XVtaTCbl"));
                        throw null;
                    }
                }
                LinearLayout linearLayout10 = this.E;
                if (linearLayout10 != null) {
                    linearLayout10.setVisibility(0);
                    X2();
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "UZFSmQCf"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("EmchYT5lAG8pc3Q=", "1RpqYT3L"));
            throw null;
        }
    }

    public final void b3(boolean z10) {
        if (z10) {
            tn.a.d(this, ea.a.p("RWkudw==", "9Ca85vNe"), ea.a.p("GWkhdy5jNW4-ZRRiVW45ZUpfIWgmdw==", "6AoDqZRq"), ConvertEventCenter.f28653a, false);
            if (!this.f25983x2) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.g(ea.a.p("ODJBXx9pWWkpaA==", "mU8bZm6b"));
                this.f25983x2 = true;
            }
            View view = this.A0;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            return;
        }
        View view2 = this.A0;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // lib.zj.office.system.i
    public final void c1(byte b10) {
        if (b10 != 7 || U2()) {
            return;
        }
        String str = pdf.pdfreader.viewer.editor.free.utils.p.f28740a;
        if (!this.J0) {
            d3();
            return;
        }
        tn.a.d(ReaderPdfApplication.m(), ea.a.p("RWkudw==", "U3yrf0BH"), ea.a.p("IWkpd2xmF2wkXxVoW3c=", "HWWL3bMc"), u2(), false);
        androidx.activity.f.q("K2YgaVplOmUpZANydWMjaU5pJnlpaF9kEUIEdCVvLHM=", "ThdF9hUK", dp.a.a());
        if (this.J0) {
            if (this.E != null) {
                ViewGroup viewGroup = this.F;
                if (viewGroup != null) {
                    this.J0 = false;
                    viewGroup.setVisibility(8);
                    if (this.f25965t0) {
                        View view = this.f25947n0;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    } else {
                        InterceptRecyclerView interceptRecyclerView = this.X;
                        if (interceptRecyclerView != null) {
                            interceptRecyclerView.setVisibility(8);
                            View view2 = this.Y;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFMC25l", "ylSdmDnO"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "ZAWazLpb"));
                            throw null;
                        }
                    }
                    if (getResources().getConfiguration().orientation != 1) {
                        ViewGroup viewGroup2 = this.N;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(8);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LW9FdBZtdmQZbyR0FGkGZXI=", "EEo13Yyd"));
                            throw null;
                        }
                    }
                    H2();
                    g3();
                    w2().post(new pdf.pdfreader.viewer.editor.free.office.c(this, 0));
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("LmNFaRZudWEoViNldw==", "WlgzBhYO"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "8FEPcmBN"));
            throw null;
        }
    }

    public final void c3() {
        boolean z10;
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpFncudQ9sF2Rvc1lvdw==", "4RivshcV");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            s2();
            return;
        }
        dp.a a10 = dp.a.a();
        String p11 = ea.a.p("PGZRaRtlZmUpZANydWMjaU5pJnlpc15vA0EVcw==", "TFs7x4Di");
        a10.getClass();
        dp.a.c(p11);
        if (!eo.d.b(this) && !this.Q1) {
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) && !q0.e(this)) {
                long e10 = eo.e.e(this);
                if (!eo.e.l(this) && !i1.a(e10)) {
                    z10 = false;
                    if (z10 && AdUtils.b(this) && FullScreenManage.c(3, this, false)) {
                        pdf.pdfreader.viewer.editor.free.ads.g.m().k(this, new pdf.pdfreader.viewer.editor.free.office.h(this));
                        return;
                    }
                }
            }
            z10 = true;
            if (z10) {
                pdf.pdfreader.viewer.editor.free.ads.g.m().k(this, new pdf.pdfreader.viewer.editor.free.office.h(this));
                return;
            }
        }
        s2();
    }

    public final void d3() {
        androidx.activity.f.q("fGYtaRBlMGUTZFFyKGMiaTJpRnlmcytvTkI_dDNvWnM=", "9JG4TSrt", dp.a.a());
        if (!this.J0) {
            if (this.E != null) {
                if (this.F != null) {
                    this.J0 = true;
                    ea.a.p("Hi1mLV4tFW8AZBRzAW8hQjF0Rm8oc2N2CHMkYlxsLnRKPT1pAGkAbGU=", "aM5Ga1vS");
                    String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                    if (this.f25942l1) {
                        a3(true);
                        g3();
                    }
                    ViewGroup viewGroup = this.F;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(0);
                        if (this.f25965t0) {
                            View view = this.f25947n0;
                            if (view != null) {
                                view.setVisibility(0);
                            }
                        } else {
                            int i10 = this.f25933i1;
                            if (i10 == 0 || i10 == 2) {
                                InterceptRecyclerView interceptRecyclerView = this.X;
                                if (interceptRecyclerView != null) {
                                    interceptRecyclerView.setVisibility(0);
                                    View view2 = this.Y;
                                    if (view2 != null) {
                                        view2.setVisibility(0);
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("B2hDbQ1MI25l", "kRs6oJHd"));
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("JWgWbS1Sdg==", "7VQcOyJp"));
                                    throw null;
                                }
                            }
                        }
                        if (getResources().getConfiguration().orientation != 1) {
                            ViewGroup viewGroup2 = this.N;
                            if (viewGroup2 != null) {
                                viewGroup2.setVisibility(0);
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("UW8_dBxtI2Qxb1p0CGk4ZXI=", "MT0LQFos"));
                                throw null;
                            }
                        }
                        w2().post(new pdf.pdfreader.viewer.editor.free.office.i(this, 1));
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LmNFaRZudWEoViNldw==", "lnQXIBuK"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("F2MFaR9uOmE6Vg9ldw==", "6Lvqpxe2"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "sZeMBxG2"));
            throw null;
        }
    }

    public final void e2(boolean z10) {
        int i10;
        Group group = this.L;
        if (group != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            group.setVisibility(i10);
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("XG0CdE1HHm89cA==", "WY9r4l27"));
        throw null;
    }

    public final void e3() {
        w2().post(new pdf.pdfreader.viewer.editor.free.office.l(this, 0));
    }

    @Override // sp.b
    public final void f0(int i10, String str) {
        J2(true, -1, false, str, i10, null);
    }

    public final void f2(Integer num) {
        View view;
        View view2;
        Presentation presentation;
        PGPrintMode pGPrintMode;
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null && (view = pVar.getView()) != null) {
            byte b10 = (byte) this.f25933i1;
            if (b10 == 0) {
                if (view instanceof Word) {
                    if ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 3)) {
                        ((Word) view).b(true);
                    } else {
                        ((Word) view).b(false);
                    }
                }
            } else if (b10 == 2 && (view instanceof Presentation)) {
                lib.zj.office.system.p pVar2 = this.P0;
                APageListView aPageListView = null;
                if (pVar2 != null) {
                    view2 = pVar2.getView();
                } else {
                    view2 = null;
                }
                if (view2 instanceof Presentation) {
                    presentation = (Presentation) view2;
                } else {
                    presentation = null;
                }
                if (presentation != null && (pGPrintMode = presentation.f20940t) != null) {
                    aPageListView = pGPrintMode.getListView();
                }
                if (aPageListView != null) {
                    if ((num == null || num.intValue() != 2) && (num == null || num.intValue() != 3)) {
                        this.M1 = (byte) 1;
                        aPageListView.f21005d = true;
                        aPageListView.f21003a = true;
                        aPageListView.requestLayout();
                        return;
                    }
                    this.M1 = (byte) 0;
                    aPageListView.f21005d = true;
                    aPageListView.f21003a = true;
                    aPageListView.requestLayout();
                }
            }
        }
    }

    public final void f3(String str, String str2, String str3) {
        AppCompatImageView appCompatImageView;
        if (!this.D1) {
            this.f25925e2 = new c7.w(str, str2, str3);
            return;
        }
        try {
            appCompatImageView = this.Q;
        } catch (Throwable th2) {
            Result.m13constructorimpl(androidx.activity.s.v(th2));
        }
        if (appCompatImageView != null) {
            appCompatImageView.setVisibility(8);
            Result.m13constructorimpl(tf.d.f30009a);
            this.J0 = true;
            i3 i3Var = new i3(this, str, str2, str3);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.setOnCancelListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.a(this, 2));
            i3Var.show();
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PGhQchxJdg==", "VPhiw6oF"));
        throw null;
    }

    @Override // android.app.Activity
    public final void finish() {
        if (!this.f19298l) {
            qo.a aVar = new qo.a();
            aVar.f29391a = this.N0;
            wk.b.b().e(aVar);
            t1.b(ea.a.p("S2U9IDVyNmc6ZRVzDiA4Zl5pMWVpZl9uHXNo", "ni9YEYqK"));
            w2().removeCallbacksAndMessages(null);
        }
        super.finish();
        if (!this.f19298l && !this.G1) {
            Y2();
        }
    }

    public final void g2(boolean z10) {
        boolean z11;
        AnimatorSet animatorSet;
        boolean z12;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        InterceptRecyclerView interceptRecyclerView;
        AnimatorSet animatorSet2;
        TextView textView;
        rh.k kVar = k.a.f29581a;
        kVar.f29580b = z10;
        kVar.f29579a = 1;
        this.f25965t0 = z10;
        if (z10 && (textView = this.f25956q0) != null) {
            textView.setText(kVar.a());
        }
        if (z10) {
            if (this.f25935j0 != null && this.K1 != null && this.f25973v0 != null && this.f25977w0 != null && this.f25947n0 != null) {
                AnimatorSet animatorSet3 = this.f25963s2;
                if (animatorSet3 != null && animatorSet3.isRunning()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && (animatorSet2 = this.f25963s2) != null) {
                    animatorSet2.cancel();
                }
                LottieAnimationView lottieAnimationView = this.f25980x;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setAnimation(R.raw.closetoarrow);
                    LottieAnimationView lottieAnimationView2 = this.f25980x;
                    if (lottieAnimationView2 != null) {
                        lottieAnimationView2.j();
                        View view = this.f25935j0;
                        kotlin.jvm.internal.g.b(view);
                        ObjectAnimator x22 = x2(view, true);
                        AppCompatImageView appCompatImageView = this.R;
                        if (appCompatImageView != null) {
                            ObjectAnimator x23 = x2(appCompatImageView, true);
                            ImageView imageView = this.K1;
                            kotlin.jvm.internal.g.b(imageView);
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
                                ofFloat = ObjectAnimator.ofFloat(imageView, ea.a.p("O3JQbgpsVnQzbyRY", "E2lAwYKb"), imageView.getTranslationX(), (-imageView.getWidth()) * 2);
                                kotlin.jvm.internal.g.d(ofFloat, ea.a.p("NAoRIFkgFyB6IGogVSAnYl9lDXQEbgxtmoDhKXggbiBvIBEgWSAXIHopQCBVIEggFSBOfQ==", "T2AtxGrN"));
                            } else {
                                ofFloat = ObjectAnimator.ofFloat(imageView, ea.a.p("O3JQbgpsVnQzbyRY", "ZdFlAZfI"), imageView.getTranslationX(), imageView.getWidth() * 2);
                                kotlin.jvm.internal.g.d(ofFloat, ea.a.p("NAoRIFkgFyB6IGogVSAnYl9lDXQEbgxttoCeKT4gYyBvIBEgWSAXIHopQCBVIEggFSBOfQ==", "AhBwT84C"));
                            }
                            View view2 = this.f25935j0;
                            kotlin.jvm.internal.g.b(view2);
                            ObjectAnimator z22 = z2(view2);
                            LottieAnimationView lottieAnimationView3 = this.f25973v0;
                            kotlin.jvm.internal.g.b(lottieAnimationView3);
                            ObjectAnimator z23 = z2(lottieAnimationView3);
                            ImageView imageView2 = this.f25977w0;
                            kotlin.jvm.internal.g.b(imageView2);
                            LottieAnimationView lottieAnimationView4 = this.f25973v0;
                            kotlin.jvm.internal.g.b(lottieAnimationView4);
                            int width = lottieAnimationView4.getWidth();
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
                                ofFloat2 = ObjectAnimator.ofFloat(imageView2, ea.a.p("GnJYbglsJ3QhbwhY", "rpn9zF3U"), imageView2.getTranslationX(), -width);
                                kotlin.jvm.internal.g.d(ofFloat2, ea.a.p("SAprIFMgQiBSIBQgSSAZYi5lUXQHbiptpYDMKVkgESATIGsgUyBCIFIpPiBJIHYgZCASfQ==", "GjS1Gedh"));
                            } else {
                                ofFloat2 = ObjectAnimator.ofFloat(imageView2, ea.a.p("O3JQbgpsVnQzbyRY", "RCn4eNrE"), imageView2.getTranslationX(), width);
                                kotlin.jvm.internal.g.d(ofFloat2, ea.a.p("SAprIFMgQiBSIBQgSSAZYi5lUXQHbipt1IDwKXkgayATIGsgUyBCIFIpPiBJIHYgZCASfQ==", "6VsKaD36"));
                            }
                            InterceptRecyclerView interceptRecyclerView2 = this.X;
                            if (interceptRecyclerView2 != null) {
                                ObjectAnimator x24 = x2(interceptRecyclerView2, false);
                                InterceptRecyclerView interceptRecyclerView3 = this.X;
                                if (interceptRecyclerView3 != null) {
                                    String p10 = ea.a.p("R3IqbgBsA3Qbb1pZ", "LJgXC35U");
                                    float[] fArr = new float[2];
                                    InterceptRecyclerView interceptRecyclerView4 = this.X;
                                    if (interceptRecyclerView4 != null) {
                                        fArr[0] = interceptRecyclerView4.getTranslationY();
                                        if (this.X != null) {
                                            fArr[1] = interceptRecyclerView.getHeight();
                                            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(interceptRecyclerView3, p10, fArr);
                                            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_55);
                                            View view3 = this.f25947n0;
                                            kotlin.jvm.internal.g.b(view3);
                                            ObjectAnimator y22 = y2(view3);
                                            y22.addUpdateListener(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.o(this, dimensionPixelSize, 1));
                                            View view4 = this.Y;
                                            if (view4 != null) {
                                                view4.setVisibility(8);
                                                AnimatorSet animatorSet4 = new AnimatorSet();
                                                animatorSet4.playTogether(x22, x23, ofFloat, z22, z23, ofFloat2, x24, ofFloat3, y22);
                                                animatorSet4.addListener(new pdf.pdfreader.viewer.editor.free.office.t(this));
                                                animatorSet4.setDuration(this.f25960r2);
                                                animatorSet4.start();
                                                animatorSet4.setInterpolator(new LinearInterpolator());
                                                this.f25963s2 = animatorSet4;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("TWhGbQFMXm5l", "FU93c7zP"));
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "LBIfnFmd"));
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "yDXgPLAJ"));
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "EOiMyomV"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("PGg6bSBSdg==", "ybHOBZZd"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("ImUmclFoIHY=", "LqQG2i28"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWEoazp2", "1HapJl0M"));
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LWFSazB2", "IFvcls4C"));
                    throw null;
                }
            }
        } else if (this.f25935j0 != null && this.K1 != null && this.f25973v0 != null && this.f25977w0 != null && this.f25947n0 != null) {
            AnimatorSet animatorSet5 = this.f25963s2;
            if (animatorSet5 != null && animatorSet5.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (animatorSet = this.f25963s2) != null) {
                animatorSet.cancel();
            }
            if (!this.J0) {
                this.J0 = true;
                if (this.f25942l1) {
                    a3(true);
                    g3();
                }
                ViewGroup viewGroup = this.F;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    if (getResources().getConfiguration().orientation != 1) {
                        ViewGroup viewGroup2 = this.N;
                        if (viewGroup2 != null) {
                            viewGroup2.setVisibility(0);
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UW8_dBxtI2Qxb1p0CGk4ZXI=", "r7amrDQT"));
                            throw null;
                        }
                    }
                    w2().post(new z(this, 3));
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LmNFaRZudWEoViNldw==", "hnK3YNPt"));
                    throw null;
                }
            }
            LottieAnimationView lottieAnimationView5 = this.f25980x;
            if (lottieAnimationView5 != null) {
                lottieAnimationView5.setAnimation(R.raw.arrowtoclose);
                LottieAnimationView lottieAnimationView6 = this.f25980x;
                if (lottieAnimationView6 != null) {
                    lottieAnimationView6.j();
                    View view5 = this.f25935j0;
                    kotlin.jvm.internal.g.b(view5);
                    ObjectAnimator y23 = y2(view5);
                    AppCompatImageView appCompatImageView2 = this.R;
                    if (appCompatImageView2 != null) {
                        ObjectAnimator y24 = y2(appCompatImageView2);
                        ImageView imageView3 = this.K1;
                        kotlin.jvm.internal.g.b(imageView3);
                        ObjectAnimator A2 = A2(imageView3);
                        View view6 = this.f25935j0;
                        kotlin.jvm.internal.g.b(view6);
                        ObjectAnimator A22 = A2(view6);
                        LottieAnimationView lottieAnimationView7 = this.f25973v0;
                        kotlin.jvm.internal.g.b(lottieAnimationView7);
                        ObjectAnimator A23 = A2(lottieAnimationView7);
                        ImageView imageView4 = this.f25977w0;
                        kotlin.jvm.internal.g.b(imageView4);
                        ObjectAnimator A24 = A2(imageView4);
                        InterceptRecyclerView interceptRecyclerView5 = this.X;
                        if (interceptRecyclerView5 != null) {
                            ObjectAnimator y25 = y2(interceptRecyclerView5);
                            InterceptRecyclerView interceptRecyclerView6 = this.X;
                            if (interceptRecyclerView6 != null) {
                                String p11 = ea.a.p("LHIgbhxsBHQhbwhZ", "spXAoeHj");
                                float[] fArr2 = new float[2];
                                InterceptRecyclerView interceptRecyclerView7 = this.X;
                                if (interceptRecyclerView7 != null) {
                                    fArr2[0] = interceptRecyclerView7.getTranslationY();
                                    fArr2[1] = 0.0f;
                                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(interceptRecyclerView6, p11, fArr2);
                                    int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dp_55);
                                    View view7 = this.f25947n0;
                                    if (view7 != null) {
                                        view7.setVisibility(0);
                                    }
                                    View view8 = this.f25947n0;
                                    kotlin.jvm.internal.g.b(view8);
                                    ObjectAnimator x25 = x2(view8, false);
                                    x25.addUpdateListener(new pdf.pdfreader.viewer.editor.free.office.n(this, dimensionPixelSize2, 0));
                                    AnimatorSet animatorSet6 = new AnimatorSet();
                                    animatorSet6.playTogether(y23, y24, A2, A22, A23, A24, y25, ofFloat4, x25);
                                    animatorSet6.addListener(new pdf.pdfreader.viewer.editor.free.office.p(this));
                                    animatorSet6.setInterpolator(new LinearInterpolator());
                                    animatorSet6.setDuration(this.f25960r2);
                                    animatorSet6.start();
                                    this.f25963s2 = animatorSet6;
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "KpS9GMW9"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("FmgvbTJSdg==", "febZP694"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "nxadulY2"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoK3Y=", "Q7xQayT8"));
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UWEoazp2", "UxaJXrKO"));
                    throw null;
                }
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UWEoazp2", "vRPehKDa"));
                throw null;
            }
        }
        View view9 = this.f25938k0;
        if (view9 != null) {
            if (z10) {
                if (view9 != null) {
                    view9.setVisibility(8);
                    return;
                }
                return;
            }
            o2();
        }
    }

    public final void g3() {
        View view;
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
            Word word = (Word) view;
            word.T = false;
            word.d(true, false);
        }
    }

    @Override // lib.zj.office.system.i
    public final byte getPageListViewMovingPosition() {
        return this.M1;
    }

    @Override // lib.zj.office.system.i
    public final void h1(boolean z10) {
        this.K0 = z10;
    }

    public final void h2(boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int visibility;
        View view;
        Word word;
        InputMethodManager inputMethodManager;
        lib.zj.office.system.h t4;
        int i14;
        EditText editText = this.G;
        if (editText != null) {
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            editText.setVisibility(i10);
            Group group = this.U;
            if (group != null) {
                if (!z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                group.setVisibility(i11);
                n3(!z10);
                AppCompatImageView appCompatImageView = this.R;
                if (appCompatImageView != null) {
                    if (!this.E1 && !z10) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    appCompatImageView.setVisibility(i12);
                    if (!this.E1 && !z10) {
                        AtomicBoolean atomicBoolean = this.Y1;
                        if (atomicBoolean.get()) {
                            atomicBoolean.set(false);
                            pdf.pdfreader.viewer.editor.free.utils.p.u(this, this.N0);
                        }
                    }
                    InterceptRecyclerView interceptRecyclerView = this.X;
                    if (interceptRecyclerView != null) {
                        if (!this.f25965t0 && !z10 && ((i14 = this.f25933i1) == 0 || i14 == 2)) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        interceptRecyclerView.setVisibility(i13);
                        View view2 = this.Y;
                        if (view2 != null) {
                            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                                visibility = 8;
                            } else {
                                InterceptRecyclerView interceptRecyclerView2 = this.X;
                                if (interceptRecyclerView2 != null) {
                                    visibility = interceptRecyclerView2.getVisibility();
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "YzBO6wuA"));
                                    throw null;
                                }
                            }
                            view2.setVisibility(visibility);
                            AppCompatImageView appCompatImageView2 = this.H;
                            if (appCompatImageView2 != null) {
                                appCompatImageView2.setVisibility(8);
                                Group group2 = this.K;
                                if (group2 != null) {
                                    group2.setVisibility(8);
                                    EditText editText2 = this.G;
                                    if (editText2 != null) {
                                        editText2.setText("");
                                        lib.zj.office.system.p pVar = this.P0;
                                        if (pVar != null && (t4 = pVar.t()) != null) {
                                            t4.b();
                                        }
                                        lib.zj.office.system.p pVar2 = this.P0;
                                        if (pVar2 != null) {
                                            view = pVar2.getView();
                                        } else {
                                            view = null;
                                        }
                                        if (view instanceof Word) {
                                            word = (Word) view;
                                        } else {
                                            word = null;
                                        }
                                        if (word != null) {
                                            word.d(!z10, n2());
                                        }
                                        if (z10) {
                                            EditText editText3 = this.G;
                                            if (editText3 != null) {
                                                editText3.requestFocus();
                                                Object systemService = getSystemService(ea.a.p("Wm47dQdfD2UGaFtk", "rksSrpIJ"));
                                                if (systemService instanceof InputMethodManager) {
                                                    inputMethodManager = (InputMethodManager) systemService;
                                                } else {
                                                    inputMethodManager = null;
                                                }
                                                if (inputMethodManager != null) {
                                                    EditText editText4 = this.G;
                                                    if (editText4 != null) {
                                                        inputMethodManager.showSoftInput(editText4, 0);
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("I2UPci1ocWQhdDJlTHQ=", "pzPnN449"));
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("PGVQchpocmQzdB5lDXQ=", "iPCyFwoQ"));
                                                throw null;
                                            }
                                        } else {
                                            H2();
                                        }
                                        e2(false);
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("K2URcltocmQhdDJlTHQ=", "6UXp87Rr"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("FGVSciRoc3UlcCFyW3Vw", "Veg3G9eP"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("ImUCcgloE2wtYRRJdg==", "EiQcjPHc"));
                            throw null;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFMC25l", "LS3MnwfD"));
                        throw null;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "2iCRYzMd"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoK3Y=", "iAmsvu5C"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("O29ebDthRUcobz9w", "wCYuh8RG"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("MmUwchVoEWQhdDJlTHQ=", "HCAQvTJq"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
        if (r5.f25929g2 == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h3(int r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L21
            if (r6 == r1) goto L8
        L6:
            r2 = r1
            goto L3e
        L8:
            lib.zj.office.system.p r2 = r5.P0
            if (r2 == 0) goto L11
            android.view.View r2 = r2.getView()
            goto L12
        L11:
            r2 = r0
        L12:
            boolean r3 = r2 instanceof lib.zj.office.pg.control.Presentation
            if (r3 == 0) goto L19
            lib.zj.office.pg.control.Presentation r2 = (lib.zj.office.pg.control.Presentation) r2
            goto L1a
        L19:
            r2 = r0
        L1a:
            if (r2 == 0) goto L6
            int r2 = r2.getSlideCount()
            goto L3e
        L21:
            lib.zj.office.system.p r2 = r5.P0
            if (r2 == 0) goto L2a
            android.view.View r2 = r2.getView()
            goto L2b
        L2a:
            r2 = r0
        L2b:
            boolean r3 = r2 instanceof lib.zj.office.wp.control.Word
            if (r3 == 0) goto L32
            lib.zj.office.wp.control.Word r2 = (lib.zj.office.wp.control.Word) r2
            goto L33
        L32:
            r2 = r0
        L33:
            if (r2 == 0) goto L6
            int r2 = r2.getPageCount()
            boolean r3 = r5.f25929g2
            if (r3 != 0) goto L3e
            goto L6
        L3e:
            if (r2 > r1) goto L41
            return
        L41:
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r1 = r5.N0
            boolean r3 = r5.f25965t0
            if (r3 == 0) goto L4c
            java.lang.String r3 = "QWUtbBx3"
            java.lang.String r4 = "0mMap45B"
            goto L50
        L4c:
            java.lang.String r3 = "XW85bRJs"
            java.lang.String r4 = "1l51U3t1"
        L50:
            java.lang.String r3 = ea.a.p(r3, r4)
            pdf.pdfreader.viewer.editor.free.utils.p.h(r5, r1, r7, r3)
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r1 = r5.f25948n1
            if (r1 == 0) goto L60
            r1.show()
            tf.d r0 = tf.d.f30009a
        L60:
            if (r0 != 0) goto L73
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.s
            r0.<init>(r5, r2)
            pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$t r1 = new pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$t
            r1.<init>(r7, r6)
            r0.f27742t = r1
            r0.show()
            r5.f25948n1 = r0
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.h3(int, boolean):void");
    }

    @Override // lib.zj.office.system.i
    public final void i() {
        ea.a.p("UGgqbhRlOG8dbQ==", "wkRoxaCy");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        n2();
    }

    public final void i2() {
        if (this.M != null && !this.T1 && getResources().getConfiguration().orientation == 1) {
            this.T1 = true;
            aj.b.I(this, this.M, ea.a.p("XGYtaRBl", "lsVWM0fJ"));
        }
    }

    public final void i3(String str) {
        if (isFinishing()) {
            return;
        }
        j1.e(this, str, true, null, F2());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x029f, code lost:
        if (r0.equals(ea.a.p("V28_eA==", "W9g0BljP")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02af, code lost:
        if (r0.equals(ea.a.p("V28_bQ==", "Vr4w5aMW")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02bf, code lost:
        if (r0.equals(ea.a.p("K29SeA==", "QkK6XTZi")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02cf, code lost:
        if (r0.equals(ea.a.p("N2x0", "EIv2FzEN")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02df, code lost:
        if (r0.equals(ea.a.p("N2xz", "AkdPsOJ1")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e3, code lost:
        new lib.zj.office.officereader.beans.SSToolsbar(getApplicationContext(), r10.P0);
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02fd, code lost:
        if (r0.equals(ea.a.p("Q3B0", "faMyQ1Pb")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x030c, code lost:
        if (r0.equals(ea.a.p("P290", "p1VubmOy")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030f, code lost:
        new lib.zj.office.officereader.beans.PGToolsbar(getApplicationContext(), r10.P0);
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0345, code lost:
        if (r0.equals(ea.a.p("PW90", "7KYAlXuq")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0354, code lost:
        if (r0.equals(ea.a.p("K29j", "UfF2GVdp")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0357, code lost:
        r10.I1 = true;
        new lib.zj.office.officereader.beans.WPToolsbar(getApplicationContext(), r10.P0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
        if (r0.equals(ea.a.p("N2xFeA==", "gTspLeXX")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0230, code lost:
        if (r0.equals(ea.a.p("N2xFbQ==", "wLKeRELo")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0240, code lost:
        if (r0.equals(ea.a.p("S2w4eA==", "SD0ufdDN")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0250, code lost:
        if (r0.equals(ea.a.p("HGwjbQ==", "1BdPHCnH")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x025e, code lost:
        if (r0.equals(ea.a.p("Q3A_eA==", "cSGRuVot")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x026f, code lost:
        if (r0.equals(ea.a.p("P3BFbQ==", "xxsKKXjx")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027f, code lost:
        if (r0.equals(ea.a.p("Q28_eA==", "be3d2RXS")) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x028f, code lost:
        if (r0.equals(ea.a.p("P29FbQ==", "Abdxlg3m")) == false) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void init() {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.init():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
        if (r4 != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j2(boolean r7) {
        /*
            r6 = this;
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r0 = r6.N0
            if (r0 == 0) goto Lbc
            boolean r0 = r6.S2()
            if (r0 == 0) goto Lbc
            boolean r0 = r6.T2()
            if (r0 != 0) goto L12
            goto Lbc
        L12:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$a r0 = pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog.J
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r1 = r6.N0
            kotlin.jvm.internal.g.b(r1)
            java.lang.String r1 = r1.getPath()
            java.lang.String r2 = "XGYtaRBlJ24GaUB5SCF4cCV0aA=="
            java.lang.String r3 = "wDHa8bfC"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r1, r2)
            r0.getClass()
            int r0 = pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog.a.d(r1)
            if (r0 != 0) goto L36
            r6.c3()
            return
        L36:
            r1 = r7 ^ 1
            int r1 = pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog.a.a(r6, r0, r1)
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == r3) goto L97
            r7 = 3
            if (r1 == r7) goto L93
            oo.g r7 = r6.W1
            if (r7 == 0) goto L50
            boolean r7 = r7.isShowing()
            if (r7 != r2) goto L50
            r7 = r2
            goto L51
        L50:
            r7 = r4
        L51:
            if (r7 == 0) goto L7b
            oo.g r7 = r6.W1
            boolean r1 = r7 instanceof pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog
            if (r1 == 0) goto L72
            java.lang.String r1 = "VHUiZGU="
            java.lang.String r3 = "4CxD80WG"
            java.lang.String r1 = ea.a.p(r1, r3)
            java.lang.String r3 = "LGxUYQtfRWUpZT5fEW8GZQ=="
            java.lang.String r5 = "JWDkug1f"
            java.lang.String r3 = ea.a.p(r3, r5)
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog r7 = (pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog) r7
            java.lang.String r7 = r7.I()
            tn.a.d(r6, r1, r3, r7, r4)
        L72:
            r6.X1 = r2
            oo.g r7 = r6.W1
            if (r7 == 0) goto L7b
            r7.cancel()
        L7b:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog r7 = new pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog
            java.lang.String r1 = "RWkudw=="
            java.lang.String r2 = "C0csl5yL"
            java.lang.String r1 = ea.a.p(r1, r2)
            pdf.pdfreader.viewer.editor.free.office.m r2 = new pdf.pdfreader.viewer.editor.free.office.m
            r2.<init>()
            r7.<init>(r6, r0, r1, r2)
            r6.W1 = r7
            r7.show()
            return
        L93:
            r6.c3()
            return
        L97:
            if (r7 == 0) goto Lb9
            oo.g r7 = r6.W1
            if (r7 == 0) goto La6
            boolean r7 = r7.isShowing()
            if (r7 != 0) goto La4
            r4 = r2
        La4:
            if (r4 == 0) goto Lb9
        La6:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog r7 = new pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog
            r7.<init>(r6, r0)
            d9.g r0 = new d9.g
            r1 = 13
            r0.<init>(r6, r1)
            r7.K = r0
            r6.W1 = r7
            r7.show()
        Lb9:
            r6.V1 = r2
            return
        Lbc:
            r6.c3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.j2(boolean):void");
    }

    public final void j3() {
        int i10;
        ViewTreeObserver viewTreeObserver;
        ImageView imageView;
        ViewTreeObserver viewTreeObserver2;
        boolean z10;
        if (!this.I1) {
            return;
        }
        AnimatorSet animatorSet = this.f25963s2;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        if (this.f25965t0) {
            t2 t2Var = this.f25952o2;
            if (t2Var != null && t2Var.isShowing()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return;
            }
        }
        PreviewGuideType poll = this.f25918b2.poll();
        if (poll == null) {
            i10 = -1;
        } else {
            i10 = a.f25992a[poll.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4 && (imageView = this.K1) != null && (viewTreeObserver2 = imageView.getViewTreeObserver()) != null) {
                        viewTreeObserver2.addOnGlobalLayoutListener(new pdf.pdfreader.viewer.editor.free.office.u(this, imageView));
                        return;
                    }
                    return;
                } else if (this.f25965t0) {
                    j3();
                    return;
                } else if (this.f25915a0 == null) {
                    try {
                        ViewStub viewStub = this.Z;
                        View view = null;
                        if (viewStub != null) {
                            View inflate = viewStub.inflate();
                            if (inflate != null) {
                                View findViewById = findViewById(R.id.reflow_continue_use_guide_btn_bg);
                                kotlin.jvm.internal.g.d(findViewById, ea.a.p("P2lZZD9pUXcKeS9kCFY-ZU8-elJnaVIuloDXbz90K24sZWh1GmVrZz1pAmVrYiNuZ2I1KQ==", "OWY7i4Yt"));
                                findViewById.setVisibility(0);
                                this.f25917b0 = inflate.findViewById(R.id.reflow_continue_use_arrow);
                                View findViewById2 = inflate.findViewById(R.id.reflow_continue_use_yes);
                                u4.g gVar = this.f25957q2;
                                findViewById2.setOnClickListener(gVar);
                                inflate.findViewById(R.id.reflow_continue_use_no).setOnClickListener(gVar);
                                inflate.findViewById(R.id.reflow_continue_use_cancel).setOnClickListener(gVar);
                                View view2 = this.f25935j0;
                                if (view2 != null) {
                                    view2.post(new l1.a(20, this, view2));
                                }
                                tn.a.d(this, ea.a.p("OWlUdw==", "TnklNKdI"), ea.a.p("OWlUdyZyUmY2bz1fFHNr", "YjktniQQ"), C2().concat("_word"), false);
                                int dimensionPixelSize = inflate.getResources().getDimensionPixelSize(R.dimen.dp_5);
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, -1.0f, 0.0f, 1.0f, 0.0f);
                                ofFloat.addUpdateListener(new r1(inflate, dimensionPixelSize));
                                ofFloat.setInterpolator(new LinearInterpolator());
                                ofFloat.setDuration(1500L);
                                ofFloat.start();
                                this.f25932i0 = ofFloat;
                                view = inflate;
                            }
                            this.f25915a0 = view;
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("QWUtbBx3IW8cdF1uHGUDcyFUW3AQcw==", "7v7vX5JU"));
                        throw null;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                } else {
                    return;
                }
            }
            View view3 = this.f25935j0;
            if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new y(this, view3));
                return;
            }
            return;
        }
        q0.w(this, "preview_docx2pdf_guide_show_in_159", false);
        Group group = this.f25981x0;
        if (group != null) {
            group.setVisibility(0);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void k() {
        pdf.pdfreader.viewer.editor.free.ads.g m10 = pdf.pdfreader.viewer.editor.free.ads.g.m();
        m10.getClass();
        if (BillingConfigImpl.c.w()) {
            String p10 = ea.a.p("P3JUbRB1WiAvcy9yWSAba1xwTnA3ZRNpAXcjdThsKWRvbF5hZA==", "sNyPdeTh");
            int i10 = zk.a.f32399a;
            t1.b(p10);
            return;
        }
        m10.f23921e = null;
        m10.h(this);
    }

    public final boolean k2(String str) {
        String str2;
        if (str == null) {
            str2 = ea.a.p("IXVdbA==", "xylAgUFi");
        } else {
            str2 = str;
        }
        t1.b("pdfPreview thirdOpen entity= ".concat(str2));
        if (str != null && !TextUtils.isEmpty(str)) {
            if (!aj.b.H(str)) {
                Resources resources = getResources();
                tn.a.d(this, ea.a.p("RWkudw==", "117alLcp"), ea.a.p("RWkudyxuDXQBdURwNm8mZW4=", "47ylY5qG"), aj.b.M(str), false);
                String string = resources.getString(R.string.arg_res_0x7f13004c);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4LhRlFlMGcl1uDigELjd0QGkoZ21hsoDHcglhPmVBMhR0CnAHXxxvQF8adSZwK3JGKQ==", "PalZbkYu"));
                String string2 = resources.getString(R.string.arg_res_0x7f13004d);
                kotlin.jvm.internal.g.d(string2, ea.a.p("PWVCLh5lQ1MuciNuEig6LkZ0HGkrZ0thkIDWMhp0SnAqX19vDV9EdSpwJXIBXwxlRl9fKQ==", "dNKFrpE3"));
                f3(string, string2, resources.getString(R.string.arg_res_0x7f13004e));
            } else {
                return true;
            }
        } else {
            t1.b(ea.a.p("P2RXUAtlQWk_d2p0HWkaZHpwC25lcARyOmUHch5vcg==", "AyXIIBlT"));
            String string3 = getString(R.string.arg_res_0x7f130391);
            kotlin.jvm.internal.g.d(string3, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlQ18DaTtlB2U3Y1RwDWlYbik=", "rljT1eWX"));
            String string4 = getString(R.string.arg_res_0x7f130390);
            kotlin.jvm.internal.g.d(string4, ea.a.p("MWURUxNyAG4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ181bxdyEnAdXythCG5bdAhvSGU8KQ==", "ZlVegiqi"));
            f3(string3, string4, null);
        }
        return false;
    }

    public final void k3() {
        boolean z10;
        try {
            if (getResources().getConfiguration().orientation != 2 && !this.f19294h) {
                z10 = false;
                h1.f(androidx.core.content.a.getColor(this, R.color.colorPrimary), this, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this), z10);
            }
            z10 = true;
            h1.f(androidx.core.content.a.getColor(this, R.color.colorPrimary), this, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this), z10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final boolean l2(Bundle bundle) {
        Intent intent;
        Uri data;
        if (T2() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this)) {
            Intent intent2 = getIntent();
            if (intent2 == null) {
                return false;
            }
            String stringExtra = intent2.getStringExtra(ea.a.p("KWldZSZwVnRo", "GMp8h8dz"));
            if (TextUtils.isEmpty(stringExtra)) {
                return false;
            }
            File file = new File(stringExtra);
            if (file.exists() && file.canRead()) {
                return false;
            }
            R1(new androidx.fragment.app.h(7, this, bundle));
            return true;
        } else if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || h1.c() || (intent = getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        } else {
            String decode = Uri.decode(data.getEncodedPath());
            if (!TextUtils.isEmpty(decode)) {
                kotlin.jvm.internal.g.d(decode, ea.a.p("KWldZSlhQ2g=", "4BANJr8g"));
                String packageName = getPackageName();
                kotlin.jvm.internal.g.d(packageName, ea.a.p("Q2EoaxJnB04TbWU=", "S2WGD55A"));
                if (!kotlin.text.k.O(decode, packageName, false)) {
                    ea.a.p("EWgKYwFODGUsUANyWWkkc1FvPCxpbUNzACADZSB1J3MGUApyB2kacyFvCCBSaSVzdA==", "rHrojiN3");
                    R1(new androidx.privacysandbox.ads.adservices.java.internal.a(this, bundle));
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00df, code lost:
        if (r1 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l3() {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.l3():void");
    }

    public final boolean m2(Bundle bundle) {
        tf.d dVar;
        ea.a.p("XGYtaRBlMnIXdl1lHiAiaC1yVk82ZS0gMGEmdBguLg==", "GO6ajJ4F");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("WGUyXwdoC3IWX0doCHJl", "G5LcZCep"));
        if (thirdOpenBean != null) {
            ThirdOpenParseManager.f28764f.e(this, new c(thirdOpenBean, this, bundle));
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            String string = getString(R.string.arg_res_0x7f130391);
            kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlSl8taQBlaWU3Y1RwDWlYbik=", "PmA48Kl6"));
            String string2 = getString(R.string.arg_res_0x7f130390);
            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdltoCRZllsPV9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "T70XkQP2"));
            f3(string, string2, null);
            return true;
        }
        return true;
    }

    public final void m3(String str, boolean z10, Drawable drawable) {
        if (this.f25930h0 == null) {
            try {
                ViewStub viewStub = this.f25919c0;
                if (viewStub != null) {
                    this.f25930h0 = viewStub.inflate();
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("O29Qcw1Wcw==", "ORswDQ3g"));
                    throw null;
                }
            } catch (Exception unused) {
            }
        }
        if (this.f25930h0 != null) {
            Handler w22 = w2();
            z zVar = this.f25946m2;
            w22.removeCallbacks(zVar);
            j1.g(this.f25930h0, str, z10, drawable);
            w2().postDelayed(zVar, 2000L);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.fnbridge.b
    public final void n() {
        pdf.pdfreader.viewer.editor.free.ads.g.m().n(this, this);
    }

    @Override // lib.zj.office.system.i
    public final void n0(List<Integer> list) {
        Integer num;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        o9.d.s(D2, "updateViewImages " + num);
    }

    @Override // lib.zj.office.system.i
    public final void n1(int i10) {
        tf.d dVar;
        String e10;
        View view;
        View view2;
        View view3;
        View view4;
        byte b10;
        View view5;
        View view6;
        View view7;
        View view8;
        t1.b(ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbxVlHEYCbF1GJ24mc1kgRCBDci9l", "1z2srk8N"));
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        boolean z10 = false;
        ig.h<Object> hVar = hVarArr[0];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32401e;
        if (!t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx2C2UFX0doBnc=", "OSOF39Cj"));
            aVar.c(hVarArr[0], Long.valueOf(System.currentTimeMillis()));
        }
        q0.t();
        this.f25968u = true;
        wn.c cVar = this.O1;
        cVar.f31396b = true;
        cVar.c = true;
        cVar.c();
        if (!this.P1) {
            wn.b.b();
        }
        o9.d.s(D2, b.a.c("openFileFinish ", i10));
        t1.b("OfficeReaderActivity openFileFinish " + i10);
        dp.a.a().getClass();
        dp.a.c("OfficeReaderActivity openFileFinish " + i10);
        O2();
        nl.b bVar = this.O0;
        View view9 = null;
        if (bVar != null) {
            if (bVar.f22595p <= this.f25923d2 && (b10 = (byte) this.f25933i1) != 1) {
                if (b10 == 0) {
                    lib.zj.office.system.p pVar = this.P0;
                    if (pVar != null) {
                        view7 = pVar.getView();
                    } else {
                        view7 = null;
                    }
                    if (view7 instanceof Word) {
                        lib.zj.office.system.p pVar2 = this.P0;
                        if (pVar2 != null) {
                            view8 = pVar2.getView();
                        } else {
                            view8 = null;
                        }
                        kotlin.jvm.internal.g.c(view8, ea.a.p("XXVabFFjAm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBHeUZlUWwKYmZ6DC5bZjFpW2V8dzkuVW8adANvPS4Vb0Fk", "6s36qcH1"));
                        int pageCount = ((Word) view8).getPageCount();
                        int i11 = bVar.f22595p;
                        if (pageCount >= i11 || i11 <= 1) {
                            l3();
                            I2();
                        }
                    }
                }
                if (((byte) this.f25933i1) == 2) {
                    lib.zj.office.system.p pVar3 = this.P0;
                    if (pVar3 != null) {
                        view5 = pVar3.getView();
                    } else {
                        view5 = null;
                    }
                    if (view5 instanceof Presentation) {
                        try {
                            lib.zj.office.system.p pVar4 = this.P0;
                            if (pVar4 != null) {
                                view6 = pVar4.getView();
                            } else {
                                view6 = null;
                            }
                            kotlin.jvm.internal.g.c(view6, ea.a.p("H3UebHljJW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAFeQJleWwtYmZ6DC5bZjFpW2V8cC4uVW8adANvPS4SchRzF24tYTBpJ24=", "ODqrYD78"));
                            Object model = ((Presentation) view6).f20940t.f20913e.getModel();
                            kotlin.jvm.internal.g.c(model, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuN24VbhdsAiBHeTtlU2wLYlx6Xi4GZjBpJ2UccCEuLm88ZVQuMkcjb1dlbA==", "X8bnK5QY"));
                            int c10 = ((th.c) model).c();
                            int i12 = bVar.f22595p;
                            if (c10 >= i12 || i12 <= 1) {
                                l3();
                                I2();
                            }
                        } catch (Exception unused) {
                            l3();
                            I2();
                        }
                    }
                }
                l3();
                I2();
            } else {
                l3();
                I2();
            }
            if (bVar.f22595p <= 1) {
                N2();
            }
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            l3();
            I2();
            N2();
        }
        if (kotlin.jvm.internal.g.a(ea.a.p("KVIqTW1UAEkaRA==", "gEoe2Hlb"), this.f25964t)) {
            w2().postDelayed(new pdf.pdfreader.viewer.editor.free.office.j(this, 3), 2000L);
        } else {
            this.f25916a2 = !FullScreenManage.d(this, null, 3, true);
        }
        int k10 = eo.e.k(this);
        ea.a.p("CmEaZQBlPnAtcg==", "KOXnHR6n");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        eo.e.s(this, k10 + 1);
        if (TextUtils.isEmpty(this.M0)) {
            e10 = lo.d.e(this, String.valueOf(System.currentTimeMillis()));
        } else {
            e10 = lo.d.e(this, this.M0);
        }
        this.B1 = e10;
        E2().e(new pdf.pdfreader.viewer.editor.free.office.s(this));
        lib.zj.office.system.p pVar5 = this.P0;
        if (pVar5 != null && (view = pVar5.getView()) != null) {
            AppFrame appFrame = this.f25920c1;
            if (appFrame != null) {
                appFrame.addView(view, new LinearLayout.LayoutParams(-1, -1));
                byte b11 = (byte) this.f25933i1;
                if (b11 == 0) {
                    if (view instanceof Word) {
                        f2(Integer.valueOf(q0.l(this, 0, ea.a.p("OWlUdyZ3WHI-XydvEWU=", "uuceCkXT"))));
                        if (!this.P1) {
                            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("RG85ZA==", "Gt0z3CWV"));
                        }
                        Q2();
                        InterceptRecyclerView interceptRecyclerView = this.X;
                        if (interceptRecyclerView != null) {
                            interceptRecyclerView.setVisibility(0);
                            View view10 = this.Y;
                            if (view10 != null) {
                                view10.setVisibility(0);
                                AppCompatTextView appCompatTextView = this.D;
                                if (appCompatTextView != null) {
                                    appCompatTextView.setText(this.M0);
                                    r2();
                                    a3(true);
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("KWldZTdhWmUOdg==", "XU28AVno"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFMC25l", "iw08npuz"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtSdg==", "kVQOsPZf"));
                            throw null;
                        }
                    }
                } else if (b11 == 1) {
                    LinearLayout linearLayout = this.E;
                    if (linearLayout != null) {
                        linearLayout.setPadding(getResources().getDimensionPixelSize(R.dimen.dp_14), 0, getResources().getDimensionPixelSize(R.dimen.dp_14), 0);
                        androidx.constraintlayout.widget.a aVar2 = new androidx.constraintlayout.widget.a();
                        ConstraintLayout constraintLayout = this.f25976w;
                        if (constraintLayout != null) {
                            aVar2.f(constraintLayout);
                            aVar2.l(R.id.bgPageToast).f3373e.f3427x = 0.5f;
                            ConstraintLayout constraintLayout2 = this.f25976w;
                            if (constraintLayout2 != null) {
                                aVar2.b(constraintLayout2);
                                this.f25929g2 = false;
                                AppCompatTextView appCompatTextView2 = this.D;
                                if (appCompatTextView2 != null) {
                                    appCompatTextView2.setText(this.M0);
                                    r2();
                                    a3(true);
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("KWlbZSRhOmUcdg==", "2fO7jWcG"));
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("LG9fdBhpWWVy", "lzzGCntZ"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UG8ldBJpDGVy", "aD1rTtb4"));
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "S2zWTA9q"));
                        throw null;
                    }
                } else if (b11 == 2) {
                    if (view instanceof Presentation) {
                        f2(Integer.valueOf(q0.l(this, 3, ea.a.p("RWkudyxwEnQtbVtkZQ==", "1d4bBQd0"))));
                        if (!this.P1) {
                            pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("P3B0", "pGZ3GdlY"));
                        }
                        Q2();
                        InterceptRecyclerView interceptRecyclerView2 = this.X;
                        if (interceptRecyclerView2 != null) {
                            interceptRecyclerView2.setVisibility(0);
                            View view11 = this.Y;
                            if (view11 != null) {
                                view11.setVisibility(0);
                                try {
                                    lib.zj.office.system.p pVar6 = this.P0;
                                    if (pVar6 != null) {
                                        view2 = pVar6.getView();
                                    } else {
                                        view2 = null;
                                    }
                                    kotlin.jvm.internal.g.c(view2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuF25DbjBsXCBHeTtlU2wLYlx6Xi4GZjBpJ2UccCEuIG8WdBxvKS5gclZzLm4HYRZpHW4=", "xnE0H2wZ"));
                                    Object model2 = ((Presentation) view2).f20940t.f20913e.getModel();
                                    kotlin.jvm.internal.g.c(model2, ea.a.p("LHUubHpjVm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA2eTJlemxeYmZ6DC5bZjFpW2V8cC4uW28QZR0uAUcPbyZlbA==", "MYBBZ7vE"));
                                    th.c cVar2 = (th.c) model2;
                                    if (cVar2.f30031e <= 1) {
                                        W2(1);
                                    } else {
                                        AppCompatTextView appCompatTextView3 = this.f25988z;
                                        if (appCompatTextView3 != null) {
                                            appCompatTextView3.setText(String.valueOf(V2(((Presentation) view).getCurrentIndex() + 1)));
                                            ThumbnailAdapter thumbnailAdapter = this.f25982x1;
                                            if (thumbnailAdapter != null) {
                                                thumbnailAdapter.h(V2(((Presentation) view).getCurrentIndex() + 1));
                                            }
                                            W2(cVar2.c());
                                            AppCompatTextView appCompatTextView4 = this.B;
                                            if (appCompatTextView4 != null) {
                                                appCompatTextView4.setText(String.valueOf(cVar2.f30031e));
                                                z10 = true;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("PG9MYSBQMWctVHY=", "LbH8LPnU"));
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("M3VLcixuFlApZwNUdg==", "hHP9IblC"));
                                            throw null;
                                        }
                                    }
                                    this.f25929g2 = z10;
                                    AppCompatTextView appCompatTextView5 = this.D;
                                    if (appCompatTextView5 != null) {
                                        appCompatTextView5.setText(this.M0);
                                        r2();
                                        a3(true);
                                    } else {
                                        kotlin.jvm.internal.g.i(ea.a.p("VWknZT1hD2Umdg==", "dBSTGhuB"));
                                        throw null;
                                    }
                                } catch (Exception unused2) {
                                }
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("O2hEbRtMXm5l", "dg6ENydv"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("R2g-bRFSdg==", "WIViFS7q"));
                            throw null;
                        }
                    }
                } else {
                    a3(false);
                }
                lib.zj.office.system.p pVar7 = this.P0;
                if (pVar7 != null) {
                    view3 = pVar7.getView();
                } else {
                    view3 = null;
                }
                if (view3 instanceof Word) {
                    lib.zj.office.system.p pVar8 = this.P0;
                    if (pVar8 != null) {
                        view4 = pVar8.getView();
                    } else {
                        view4 = null;
                    }
                    kotlin.jvm.internal.g.c(view4, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAG4VbgJsVCA7eUFlWWxeYnR6IC4aZg5pVmVAdzUuBm8BdEpvGy5vbz1k", "E8I4o8w8"));
                    ((Word) view4).setOnReflowStateCallBack(this);
                    lib.zj.office.system.p pVar9 = this.P0;
                    if (pVar9 != null) {
                        view9 = pVar9.getView();
                    }
                    kotlin.jvm.internal.g.c(view9, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuNm5hbiVsXSBHeTtlU2wLYlx6Xi4GZjBpJ2UcdzYuIG83dD5vPC5mb0Fk", "YLP1g5lG"));
                    ((Word) view9).setListener(new p());
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "q0zEpBOs"));
            throw null;
        }
    }

    public final boolean n2() {
        lib.zj.office.system.p pVar;
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (((byte) this.f25933i1) != 0 || (pVar = this.P0) == null || (view = pVar.getView()) == null || !(view instanceof Word)) {
            return false;
        }
        Word word = (Word) view;
        if (word.P) {
            float zoom = word.getZoom() * word.f21099g;
            InterceptTouchFrameLayout interceptTouchFrameLayout = this.f25984y;
            if (interceptTouchFrameLayout != null) {
                int height = interceptTouchFrameLayout.getHeight();
                int pageCount = word.getPageCount();
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                if (zoom >= height && pageCount > 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!this.f25965t0 && z10) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                word.setIsInOneScreen(z13);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "QJbZZxlU"));
                throw null;
            }
        } else {
            float zoom2 = word.getZoom() * word.f21098f;
            InterceptTouchFrameLayout interceptTouchFrameLayout2 = this.f25984y;
            if (interceptTouchFrameLayout2 != null) {
                int width = interceptTouchFrameLayout2.getWidth();
                int pageCount2 = word.getPageCount();
                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                if (zoom2 >= width && pageCount2 > 1) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!this.f25965t0 && z10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                word.setIsInOneScreen(z11);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "LAectyVB"));
                throw null;
            }
        }
        if (!z10) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f25929g2 = z12;
        a3(true);
        if (z10) {
            return false;
        }
        return true;
    }

    public final void n3(boolean z10) {
        if (z10) {
            if (this.I1) {
                LottieAnimationView lottieAnimationView = this.f25973v0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.setVisibility(0);
                    return;
                }
                return;
            }
            LottieAnimationView lottieAnimationView2 = this.f25973v0;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.setVisibility(8);
                return;
            }
            return;
        }
        LottieAnimationView lottieAnimationView3 = this.f25973v0;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
        if (r5.f25929g2 == false) goto L68;
     */
    @Override // pdf.pdfreader.viewer.editor.free.thumb.adapter.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o1(int r6) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.o1(int):void");
    }

    public final void o2() {
        View view = this.f25938k0;
        if (view != null) {
            if (!q0.g(this, 65, ea.a.p("JGQAXxNyXHYhZRFfRmUxbFd3DXAmaVh0", "ynTfc9Tq")) && !ReaderDebugActivity.f27831j) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final void o3(boolean z10) {
        if (z10) {
            if (this.I1) {
                ImageView imageView = this.f25977w0;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.f25977w0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.f25977w0;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ?? r02;
        ?? r03;
        ?? r04;
        ?? r05;
        Object obj;
        lib.zj.office.system.j jVar;
        if (D2().d()) {
            return;
        }
        PreviewAIGuideView previewAIGuideView = this.f25944m0;
        boolean z10 = false;
        if (previewAIGuideView != null && previewAIGuideView.getVisibility() == 0) {
            r02 = true;
        } else {
            r02 = false;
        }
        if (r02 != false) {
            return;
        }
        ReflowOpenGuideView reflowOpenGuideView = this.f25941l0;
        if (reflowOpenGuideView != null && reflowOpenGuideView.getVisibility() == 0) {
            r03 = true;
        } else {
            r03 = false;
        }
        if (r03 != false) {
            return;
        }
        if (this.f25932i0 != null && this.f25915a0 != null) {
            r04 = true;
        } else {
            r04 = false;
        }
        if (r04 != false) {
            return;
        }
        if (this.f25965t0) {
            q2();
            return;
        }
        Group group = this.f25981x0;
        if (group != null && group.getVisibility() == 0) {
            r05 = true;
        } else {
            r05 = false;
        }
        if (r05 != false) {
            return;
        }
        if (this.f25979w2) {
            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity$onBackPressed$1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OfficeReaderActivity officeReaderActivity;
                    try {
                        OfficeReaderActivity officeReaderActivity2 = OfficeReaderActivity.this;
                        String str = OfficeReaderActivity.D2;
                        officeReaderActivity2.e3();
                        sp.h hVar = OfficeReaderActivity.this.J1;
                        if (hVar != null) {
                            hVar.e(true);
                        }
                        officeReaderActivity = OfficeReaderActivity.this;
                        officeReaderActivity.J1 = null;
                    } catch (Throwable th2) {
                        try {
                            th2.printStackTrace();
                            officeReaderActivity = OfficeReaderActivity.this;
                        } catch (Throwable th3) {
                            OfficeReaderActivity.this.f25979w2 = false;
                            throw th3;
                        }
                    }
                    officeReaderActivity.f25979w2 = false;
                }
            };
            if (this.C2 == null) {
                String string = getResources().getString(R.string.arg_res_0x7f13035a);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0FWlWZ3xxHmlHXyhvHXYHcgZpWmcp", "g8RkVaDM"));
                String string2 = getResources().getString(R.string.arg_res_0x7f1304a9);
                kotlin.jvm.internal.g.d(string2, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ01IDTbgMuCXU9ZW5xDGlDXzlvJHYQchxfUnAaKQ==", "htsX6udz"));
                this.C2 = new OperateInterceptDialog(this, string, string2);
            }
            OperateInterceptDialog operateInterceptDialog = this.C2;
            if (operateInterceptDialog != null && !operateInterceptDialog.isShowing()) {
                z10 = true;
            }
            if (z10) {
                OperateInterceptDialog operateInterceptDialog2 = this.C2;
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.A = new x(aVar);
                }
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.show();
                    return;
                }
                return;
            }
            return;
        }
        lib.zj.office.system.j jVar2 = null;
        lib.zj.office.system.h hVar = null;
        if (U2()) {
            if (B2().f26075d) {
                c0 B2 = B2();
                lib.zj.office.system.p pVar = this.P0;
                if (pVar != null) {
                    hVar = pVar.t();
                }
                B2.getClass();
                ea.a.p("UGElYxZsQnMXYUZjaA==", "8XBqulaL");
                B2.f26080i = true;
                if (hVar != null) {
                    hVar.c();
                    return;
                }
                return;
            }
            h2(false);
            N();
            return;
        }
        lib.zj.office.system.p pVar2 = this.P0;
        if (pVar2 != null) {
            obj = pVar2.w(1358954496);
        } else {
            obj = null;
        }
        if (obj != null && ((Boolean) obj).booleanValue()) {
            T(false);
            lib.zj.office.system.p pVar3 = this.P0;
            if (pVar3 != null) {
                pVar3.r(1358954498, null);
                return;
            }
            return;
        }
        lib.zj.office.system.p pVar4 = this.P0;
        if (pVar4 != null) {
            jVar2 = pVar4.f21056i;
        }
        if (jVar2 != null) {
            if (pVar4 != null && (jVar = pVar4.f21056i) != null) {
                jVar.abortReader();
            }
            this.U1 = true;
        }
        j2(true);
    }

    @Override // androidx.appcompat.app.c, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        int i10;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        t2 t2Var;
        ImageView imageView;
        ViewTreeObserver viewTreeObserver;
        View view;
        ViewTreeObserver viewTreeObserver2;
        boolean z13;
        PreviewViewSettingsDialog previewViewSettingsDialog;
        boolean z14;
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation != getResources().getConfiguration().orientation) {
            getResources().updateConfiguration(newConfig, null);
        }
        boolean z15 = true;
        pdf.pdfreader.viewer.editor.free.utils.a0.a(this, true);
        int i12 = this.f25974v1;
        int i13 = newConfig.orientation;
        if (i12 != i13) {
            this.f25974v1 = i13;
            P1();
            if (this.J0) {
                k3();
            }
        }
        PreviewViewSettingsDialog previewViewSettingsDialog2 = this.f25954p1;
        if (previewViewSettingsDialog2 != null) {
            if (newConfig.orientation == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            previewViewSettingsDialog2.J(z14);
        }
        if (this.f25943l2) {
            this.f25943l2 = false;
            PreviewViewSettingsDialog previewViewSettingsDialog3 = this.f25954p1;
            if (previewViewSettingsDialog3 != null && previewViewSettingsDialog3.isShowing()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && (previewViewSettingsDialog = this.f25954p1) != null) {
                previewViewSettingsDialog.dismiss();
            }
        }
        dp.a a10 = dp.a.a();
        a10.getClass();
        dp.a.c("OfficeReaderActivity onConfigurationChanged " + newConfig.orientation);
        androidx.activity.s.f1864s = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this);
        if (newConfig.orientation == 1) {
            i2();
            ViewGroup viewGroup = this.N;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("CW8NdCttBGQLbwh0VWk5ZXI=", "tgkyDEx9"));
                throw null;
            }
        } else {
            ViewGroup viewGroup2 = this.N;
            if (viewGroup2 != null) {
                if (this.J0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                viewGroup2.setVisibility(i10);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UW8_dBxtI2Qxb1p0CGk4ZXI=", "094WHiOz"));
                throw null;
            }
        }
        EditText editText = this.G;
        if (editText != null) {
            if (newConfig.orientation == 1) {
                i11 = 268435459;
            } else {
                i11 = 3;
            }
            editText.setImeOptions(i11);
            EditText editText2 = this.G;
            if (editText2 != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.b(editText2);
                oo.g gVar = this.W1;
                if (gVar != null && gVar.isShowing()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    oo.g gVar2 = this.W1;
                    if (gVar2 instanceof PdfReaderOpenClearDialog) {
                        kotlin.jvm.internal.g.c(gVar2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuO25-bkJsAyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUmLjZkXnQAch1mOWUWLhdpXGRdYQVvMS4UZFRSI2EnZSZPI2VZQwNlUnIPaRJsDWc=", "TS7oWwuR"));
                        ((PdfReaderOpenClearDialog) gVar2).H();
                    } else if (gVar2 instanceof PdfReaderOpenDefaultDialog) {
                        kotlin.jvm.internal.g.c(gVar2, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuXm5vbh9sWiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVDLidkA3RZch1mOWUWLhdpXGRdYQVvMS4UZFRSI2EnZUNPMmUERFNmUnUndDdpA2wdZw==", "1Bj6Bkah"));
                        ((PdfReaderOpenDefaultDialog) gVar2).H();
                    }
                }
                ReflowOpenGuideView reflowOpenGuideView = this.f25941l0;
                if (reflowOpenGuideView != null && reflowOpenGuideView.getVisibility() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (view = this.f25935j0) != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
                    viewTreeObserver2.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: pdf.pdfreader.viewer.editor.free.office.a
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            String str = OfficeReaderActivity.D2;
                            String p10 = ea.a.p("JWgnc0kw", "m7QNmC8F");
                            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
                            kotlin.jvm.internal.g.e(officeReaderActivity, p10);
                            ReflowOpenGuideView reflowOpenGuideView2 = officeReaderActivity.f25941l0;
                            if (reflowOpenGuideView2 != null) {
                                reflowOpenGuideView2.r(officeReaderActivity.f25935j0);
                            }
                        }
                    });
                }
                PreviewAIGuideView previewAIGuideView = this.f25944m0;
                if (previewAIGuideView != null && previewAIGuideView.getVisibility() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && (imageView = this.K1) != null && (viewTreeObserver = imageView.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener(new o());
                }
                t2 t2Var2 = this.f25952o2;
                if (t2Var2 == null || !t2Var2.isShowing()) {
                    z15 = false;
                }
                if (z15 && (t2Var = this.f25952o2) != null) {
                    t2Var.c();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoJ2QbdGBlEXQ=", "1wfR2bsS"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("NWVZchFodGQhdDJlTHQ=", "CAF8r1qs"));
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02d2, code lost:
        if (r1 == null) goto L108;
     */
    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(final android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.onCreate(android.os.Bundle):void");
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        ObjectAnimator objectAnimator;
        PreviewViewSettingsDialog previewViewSettingsDialog;
        j2 j2Var;
        OperatePdfFailedDialog operatePdfFailedDialog;
        E2().e(null);
        E2().f();
        boolean z13 = true;
        t0.V().execute(new z(this, 1));
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.f25940k2);
        ea.a.f16525j = ea.a.f16524i;
        ea.a.f16524i = null;
        FullScreenManage.g(3);
        try {
            sp.h hVar = this.J1;
            if (hVar != null) {
                hVar.e(true);
            }
            this.J1 = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ((OperateExecuteTask) this.G0.getValue()).k();
        super.onDestroy();
        t1.b(ea.a.p("CGYIaVFlGGUpZANydWMjaU5pJnlpb1hEEXMFcj55", "HeGn2JMz"));
        androidx.activity.f.q("AGZXaRplZWU7ZC9yNGMcaUNpGnllbwtELHM7chh5", "zlvnIOwB", dp.a.a());
        OperatePdfFailedDialog operatePdfFailedDialog2 = this.f25987y2;
        if (operatePdfFailedDialog2 != null && operatePdfFailedDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (operatePdfFailedDialog = this.f25987y2) != null) {
            operatePdfFailedDialog.dismiss();
        }
        j2 j2Var2 = this.f25971u2;
        if (j2Var2 != null && j2Var2.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (j2Var = this.f25971u2) != null) {
            j2Var.dismiss();
        }
        PreviewViewSettingsDialog previewViewSettingsDialog2 = this.f25954p1;
        if (previewViewSettingsDialog2 != null && previewViewSettingsDialog2.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (previewViewSettingsDialog = this.f25954p1) != null) {
            previewViewSettingsDialog.dismiss();
        }
        ObjectAnimator objectAnimator2 = this.f25975v2;
        if (objectAnimator2 == null || !objectAnimator2.isRunning()) {
            z13 = false;
        }
        if (z13 && (objectAnimator = this.f25975v2) != null) {
            objectAnimator.cancel();
        }
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null) {
            pVar.dispose();
        }
        wn.c cVar = this.O1;
        if (cVar.c) {
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("OWlUdw==", "g2j1tdwI"), ea.a.p("OWlUdyZ0Xm1l", "8jVOnnng"), t2() + "_" + cVar.a(), false);
        }
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        t1.b(ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnlmby1QU3U3ZQ==", "2DhyKdJ5"));
        if (!D2().d()) {
            ((hp.e) this.f25959r1.getValue()).d();
        }
        super.onPause();
        androidx.activity.f.q("H2Y0aSplYWUpZANydWMjaU5pJnlpb1hQFXUCZQ==", "3bPRI317", dp.a.a());
        if (this.f19298l) {
            return;
        }
        pdf.pdfreader.viewer.editor.free.office.i iVar = this.f25934i2;
        if (iVar != null) {
            t1.b(ea.a.p("DmYjaRBlEWUpZANydWMjaU5pJnlpb1hQFXUCZX0gMGUsbzNlU2QmbCl5RmdbbjIgSnU8bihiWmU=", "HhAEsCGw"));
            w2().removeCallbacks(iVar);
        }
        if (this.G1) {
            Y2();
        }
        this.O1.b();
        gl.o.f17931a.getClass();
        gl.p.f17933p.l();
        gl.q.f17934p.l();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        e1.f28647a = false;
        if (!D2().d()) {
            ((hp.e) this.f25959r1.getValue()).c();
        }
        AppOpenManager.c().f23907g = true;
        super.onResume();
        androidx.activity.s.w0(this);
        if (this.f19298l) {
            return;
        }
        ((OperateExecuteTask) this.G0.getValue()).l();
        aj.b.j(this, this.M, ea.a.p("XGYtaRBl", "Pqwhm4aF"), this.f25940k2);
        aj.b.L();
        if (this.f25966t1) {
            this.f25966t1 = false;
            w2().postDelayed(new pdf.pdfreader.viewer.editor.free.office.j(this, 1), 10L);
            return;
        }
        if (this.f25970u1) {
            this.f25970u1 = false;
            if (BillingConfigImpl.c.w()) {
                r3();
            }
        }
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbwtSV3MYbWU=", "frOT2mYB");
        a10.getClass();
        dp.a.c(p10);
        t1.b(ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnlmby1SNHNFbWU=", "Q0zriDz5"));
        r2();
        if (this.V1) {
            this.V1 = false;
            j2(false);
        }
        this.O1.c();
        if (this.f25916a2) {
            this.f25916a2 = !FullScreenManage.d(this, null, 3, true);
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        wn.c cVar = this.O1;
        cVar.c = false;
        outState.putLong(ea.a.p("PWVQZC1pWmU=", "Wn2EoyB3"), cVar.f31395a);
        outState.putBoolean(ea.a.p("QWUqZApKF20CSFttDE84UiFzR21l", "onK0KeoX"), this.f25966t1);
        outState.putBoolean(ea.a.p("JnN0bg1lRVI_ZiZvAk0HZGU=", "tui21sUl"), this.f25965t0);
        if (this.G1) {
            Y2();
        }
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        c7.w wVar;
        super.onWindowFocusChanged(z10);
        if (this.f19298l) {
            return;
        }
        if (z10) {
            e1.f28647a = false;
        }
        this.D1 = z10;
        D2().e(z10);
        if (!D2().d()) {
            if (this.J0) {
                k3();
            } else if (z10) {
                M2();
            }
        }
        if (z10 && (wVar = this.f25925e2) != null) {
            kotlin.jvm.internal.g.b(wVar);
            c7.w wVar2 = this.f25925e2;
            kotlin.jvm.internal.g.b(wVar2);
            c7.w wVar3 = this.f25925e2;
            kotlin.jvm.internal.g.b(wVar3);
            f3((String) wVar.f5664a, (String) wVar2.f5665b, (String) wVar3.c);
            this.f25925e2 = null;
        }
    }

    public final void p2() {
        boolean z10;
        boolean z11;
        if (q0.f(this, ea.a.p("P2RXXwlyUnYzZT1fB2UObFp3MXAqaQt0", "n4BzZh31"), true)) {
            q0.w(this, ea.a.p("Q2QtXwNyB3YbZUNfG2UwbCt3bXApaS10", "PGSTHUaw"), false);
        }
        View view = this.A0;
        if (view != null && view.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f25955p2 = z10;
        b3(false);
        View view2 = this.f25938k0;
        if (view2 != null && view2.getVisibility() == 0) {
            view2.setVisibility(8);
        }
        g2(true);
        no.f.b(this).getClass();
        d1 b10 = d1.b(this);
        String str = no.f.f22624o;
        if (!b10.a(str, true) && !ReaderDebugActivity.f27830i) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            no.f.b(this).getClass();
            d1.b(this).c(str, false);
            t2 t2Var = new t2(this, new d());
            this.f25952o2 = t2Var;
            t2Var.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.a(this, 2));
            t2 t2Var2 = this.f25952o2;
            if (t2Var2 != null) {
                t2Var2.show();
            }
            tn.a.d(this, ea.a.p("CGUtbFZ3", "oyzK9XNz"), ea.a.p("OmU_bCR3a2c9aQJla3M_b3c=", "3jHYK4IY"), ea.a.p("RG85ZA==", "5RgafYhZ"), false);
        }
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null) {
            pVar.r(805306369, 1);
        }
        p3(true);
        tn.a.d(this, ea.a.p("QWUpbCx3", "Uj3OCAfq"), ea.a.p("PWVXbBZ3aHMyb3c=", "PtyhIihy"), ea.a.p("RG85ZA==", "z0nAyqRw"), false);
    }

    public final void p3(boolean z10) {
        nl.b bVar = this.O0;
        if (bVar != null && bVar.f22596q != z10) {
            bVar.f22596q = z10;
            PdfPreviewEntity pdfPreviewEntity = this.N0;
            if (pdfPreviewEntity != null) {
                com.google.android.play.core.assetpacks.c.P(bVar, pdfPreviewEntity);
                long id2 = pdfPreviewEntity.getId();
                String otherStrOne = pdfPreviewEntity.getOtherStrOne();
                kotlin.jvm.internal.g.d(otherStrOne, ea.a.p("AW4gaSR5am88aANyZ3QlT1Zl", "NqdTPDhC"));
                String otherStrTwo = pdfPreviewEntity.getOtherStrTwo();
                kotlin.jvm.internal.g.d(otherStrTwo, ea.a.p("DW44aSR5Ym88aANyZ3QlVE9v", "r7hLPLqo"));
                fo.a.a(id2, otherStrOne, otherStrTwo);
                bm.c.b(this).i(pdfPreviewEntity);
            }
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean q() {
        return false;
    }

    public final void q2() {
        View view;
        lib.zj.office.system.p pVar = this.P0;
        if (pVar != null) {
            pVar.r(805306369, 0);
        }
        g2(false);
        p3(false);
        n2();
        if (this.f25955p2) {
            b3(true);
        }
        lib.zj.office.system.p pVar2 = this.P0;
        if (pVar2 != null && (view = pVar2.getView()) != null && ((byte) this.f25933i1) == 0 && (view instanceof Word)) {
            q3(((Word) view).getPageCount());
        }
    }

    public final void q3(int i10) {
        boolean z10;
        if (this.f25965t0) {
            N2();
            return;
        }
        W2(i10);
        if (i10 <= 1) {
            z10 = true;
        } else {
            AppCompatTextView appCompatTextView = this.B;
            if (appCompatTextView != null) {
                appCompatTextView.setText(String.valueOf(i10));
                TextView textView = this.f25928g0;
                if (textView != null) {
                    String format = String.format(Locale.ENGLISH, ea.a.p("fWQg", "zeX9VDB4"), Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                    kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SmwdY1VsDCx2ZityX2EyLGMqUnIjcyk=", "3DpS26GC"));
                    textView.setText(format);
                }
                z10 = false;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("O29FYRVQVmc_VHY=", "mLOcfcX3"));
                throw null;
            }
        }
        if (z10) {
            this.f25929g2 = false;
            a3(true);
        } else {
            n2();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.f25948n1;
        if (sVar != null) {
            sVar.C(i10);
        }
    }

    @Override // lib.zj.office.wp.control.Word.i
    public final void r0() {
        if (k.a.f29581a.f29580b) {
            ProgressView progressView = this.f25961s0;
            if (progressView != null) {
                progressView.setVisibility(0);
            }
            TextView textView = this.f25956q0;
            if (textView != null) {
                textView.setVisibility(4);
            }
        }
    }

    public final void r2() {
        if (!isDestroyed() && !isFinishing() && !this.f19289b) {
            t1.b(ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbwsgE2kAZQ1hJmUIb19l", "fRmTulCK"));
            Handler w22 = w2();
            pdf.pdfreader.viewer.editor.free.office.i iVar = this.f25934i2;
            w22.removeCallbacks(iVar);
            w2().postDelayed(iVar, 2000L);
            g3();
        }
    }

    public final void r3() {
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSx3Fm9w", "ne10BJnd"));
        t0.V().execute(new z(this, 4));
    }

    public final void s2() {
        w0.a().f28790a.execute(new c6.b(6));
        if ((S2() || T2()) && !this.f25937j2) {
            t1.b(ea.a.p("e2YxaVVlBmUpZANydWMjaU5pJnlpLRstAGgYcjUtby0UZj5uX3M8ICljEmlCaSN5FCA4dSRwFmgbbWU=", "724W6TsG"));
            this.f25937j2 = true;
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("R2gichdFDHQbdHk=", "eScKG1XR"), this.N0);
            startActivity(intent);
        }
        finish();
    }

    @Override // lib.zj.office.system.i
    public final boolean t(int i10, Object obj) {
        lib.zj.office.system.r rVar;
        lib.zj.office.system.d c10;
        try {
            if (i10 != 0) {
                if (i10 != 20) {
                    if (i10 != 1073741828) {
                        return false;
                    }
                    return true;
                }
                N();
            } else {
                onBackPressed();
            }
            return true;
        } catch (Exception e10) {
            lib.zj.office.system.p pVar = this.P0;
            if (pVar != null && (rVar = pVar.f21062o) != null && (c10 = rVar.c()) != null) {
                c10.a(false, e10);
                return true;
            }
            return true;
        }
    }

    public final String t2() {
        int i10 = this.f25933i1;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return ea.a.p("MW8xZA==", "q6FCHE3u");
                    }
                    return ea.a.p("P2Rm", "JxLYI4ZT");
                }
                return ea.a.p("P3B0", "QTvXvJsn");
            }
            return ea.a.p("KnhSZWw=", "ZbuCc8bu");
        } else if (kotlin.text.j.F(this.L0, ea.a.p("UHN2", "QO0FG4Ju"), false)) {
            return ea.a.p("A3hUZWw=", "gnf73DEt");
        } else {
            return ea.a.p("RG85ZA==", "IQ5OzH11");
        }
    }

    public final String u2() {
        byte b10 = (byte) this.f25933i1;
        if (b10 == 0) {
            return ea.a.p("E28oZA==", "eFdZ7uvJ");
        }
        if (b10 == 1) {
            return ea.a.p("IHg6ZWw=", "epEYOCHw");
        }
        if (b10 == 2) {
            return ea.a.p("Q3B0", "FF0Z3dCv");
        }
        return ea.a.p("RG85ZA==", "O555slSd");
    }

    @Override // lib.zj.office.system.i
    public final void v0(int i10, Throwable th2) {
        String string;
        String string2;
        int i11;
        String str;
        String str2;
        if (this.U1) {
            t1.b(ea.a.p("LWY8aS9lZmUpZANydWMjaU5pJnlpaUVJGmkFaTB0K3YHQThvPnRmZSlkA3IUPXd0SnU3LGlyU3QBcm4=", "VqbZL4ox"));
        } else if (this.f25968u) {
            t1.b(ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbxVlO0YlbDNTPGMsZUJzWT0XdCh1LyxVcg10QHJu", "FjMFULVI"));
        } else {
            dp.a.a().getClass();
            dp.a.c("OfficeReaderActivity errorCode " + i10 + " error " + th2);
            if (th2 != null && i10 != 11) {
                dp.a.a().getClass();
                dp.a.e(th2);
            }
            if (!kotlin.jvm.internal.g.a(Looper.myLooper(), Looper.getMainLooper())) {
                ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnlmcDFpAnQScgFvRyBdbz8gGm5CbRNpWiAdaCRlJWQeIDRlN3Uebg==", "lWs5v4Ih");
                String str3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                return;
            }
            t1.c("OfficeReaderActivity errorCode " + i10 + " error", th2);
            a3(false);
            if (i10 != 0) {
                if (i10 != 11) {
                    switch (i10) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            break;
                        case 6:
                        case 7:
                            string = getResources().getString(R.string.arg_res_0x7f13040a);
                            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0u4DFLhhlLmRWchR1HXMXcAJvRnQMZAlmLWxXKQ==", "YcjOVS89"));
                            string2 = getResources().getString(R.string.arg_res_0x7f13040b);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("TQpPIG0gZSBoIEYgFCB3IBggN3I7b0RUloDXZA5mK2xTXwtlPilPIGggRiAUIHcgGCByfQ==", "fx6oMEq3"));
                            i11 = 3;
                            break;
                        default:
                            string = getResources().getString(R.string.arg_res_0x7f1303be);
                            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0OGk3Z2ZyVWFXZTlfHG8Scyk=", "JYH0pOfs"));
                            string2 = getResources().getString(R.string.arg_res_0x7f1303a5);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgRmkybCZTpYDIcydlWF9WcjlvASloIFIgFCBJIHYgZCASfQ==", "GnS5bObl"));
                            i11 = 4;
                            break;
                    }
                }
                if (i10 == 11) {
                    dp.a a10 = dp.a.a();
                    ThirdParseWrongMineTypeException thirdParseWrongMineTypeException = new ThirdParseWrongMineTypeException(a0.a.h("third parse pdf error, filePath == ", this.L0));
                    a10.getClass();
                    dp.a.e(thirdParseWrongMineTypeException);
                }
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("AWULbwRyJ2U7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2EXZQpfHm80cyk=", "PmsxqDUc"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a4);
                kotlin.jvm.internal.g.d(string2, ea.a.p("TApxIEMgWCBoIEYgFCB3IBggO2ZpKFNyloDXYSNzJ19SciNvESlyIGggRiAUIHcgGCByfQ==", "wx7Qcx6e"));
                i11 = 1;
            } else {
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0PWkpZ11yBGFXZTlfHG8Scyk=", "OGsanzy2"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a3);
                kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV3I0bzFUuICTYVRrNm1WbSRyCiloIFIgFCBJIHYgZCASfQ==", "Z57ikPZP"));
                i11 = 2;
            }
            i3 i3Var = new i3(this, string, string2, null);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.setOnCancelListener(new f5.f(this, 1));
            i3Var.show();
            I2();
            String p10 = ea.a.p("RWkudw==", "LSaN1YpR");
            String p11 = ea.a.p("A2krd2hlF3Incg==", "YUuN7e4i");
            if (S2()) {
                str = "O2hYcmQ=";
                str2 = "JPOnJPit";
            } else {
                str = "NmUyaw==";
                str2 = "cmRAkHIP";
            }
            tn.a.d(this, p10, p11, ea.a.p(str, str2) + "_" + t2() + "_" + i11, false);
        }
    }

    public final boolean v2() {
        int l10;
        byte b10 = (byte) this.f25933i1;
        if (b10 == 0) {
            if (kotlin.text.j.F(this.L0, ea.a.p("UHN2", "nFqs00qn"), false)) {
                l10 = q0.l(this, 0, "excel_inversion_type");
            } else {
                l10 = q0.l(this, 0, "word_inversion_type");
            }
        } else if (b10 == 1) {
            l10 = q0.l(this, 0, "excel_inversion_type");
        } else if (b10 == 2) {
            l10 = q0.l(this, 0, "ppt_inversion_type");
        } else if (b10 == 3) {
            l10 = q0.l(this, 0, "pdf_inversion_type");
        } else {
            l10 = q0.l(this, 0, "txt_inversion_type");
        }
        if (l10 == 2) {
            return true;
        }
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (!z10) {
            s2();
        }
    }

    public final Handler w2() {
        return (Handler) this.f25945m1.getValue();
    }

    @Override // lib.zj.office.system.i
    public final String x0() {
        String string = getResources().getString(R.string.arg_res_0x7f13036c);
        kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0R2kWZ0ZyHGFXZTlfEnASXxxhWWUp", "5xhyMVKZ"));
        return string;
    }

    public final ObjectAnimator x2(View view, boolean z10) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("Umw7aGE=", "h5FlMIOL"), view.getAlpha(), 0.0f);
        ofFloat.addListener(new f(view, z10));
        ea.a.p("J2lVZThuXm07MQ==", "UCGsbgJg");
        return ofFloat;
    }

    @Override // sp.b
    public final void y0(int i10, Throwable e10) {
        kotlin.jvm.internal.g.e(e10, "e");
        w2().post(new lib.zj.office.system.l(this, i10, e10, 3));
    }

    public final ObjectAnimator y2(View view) {
        view.setVisibility(0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("LmxBaGE=", "RNCQDdDw"), view.getAlpha(), 1.0f);
        kotlin.jvm.internal.g.d(ofFloat, ea.a.p("XGYNbBxhFigEaVF3RSB0YShwWmFkLGN2LWUxLhBsOWhSLGsxFSk=", "DFqIHMxS"));
        return ofFloat;
    }

    public final ObjectAnimator z2(View view) {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, ea.a.p("O3JQbgpsVnQzbyRY", "sUUdPQFZ"), view.getTranslationX(), -view.getWidth());
            kotlin.jvm.internal.g.d(ofFloat, ea.a.p("NAoRIFkgFyB6IGogVSAnYl9lDXQEbgxtp4DRaQx0Hy47b3dsFmFDKHMpQCBVIEggFSBOfQ==", "21ezEwhw"));
            return ofFloat;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, ea.a.p("O3JQbgpsVnQzbyRY", "s1MuQJEr"), view.getTranslationX(), view.getWidth());
        kotlin.jvm.internal.g.d(ofFloat2, ea.a.p("SAprIFMgQiBSIBQgSSAZYi5lUXQHbiptu4DWKXkgRCATIGsgUyBCIFIpPiBJIHYgZCASfQ==", "YpsdvSVJ"));
        return ofFloat2;
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i implements sg.c {
        @Override // sg.c
        public final Bitmap a(int i10, int i11) {
            return null;
        }

        @Override // sg.c
        public final void b() {
        }

        @Override // sg.c
        public final void c() {
        }

        @Override // sg.c
        public final void d() {
        }

        @Override // sg.c
        public final void dispose() {
        }
    }

    /* compiled from: OfficeReaderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class u implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26017a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ OfficeReaderActivity f26018b;

        public u(OfficeReaderActivity officeReaderActivity, boolean z10) {
            this.f26017a = z10;
            this.f26018b = officeReaderActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26017a;
            OfficeReaderActivity officeReaderActivity = this.f26018b;
            if (z10) {
                h1.i(officeReaderActivity);
            } else {
                officeReaderActivity.N1.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfLVgARTFOOUwQU2VPK0FwRQ==", "IWZnhTcx"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFEkU-VHBSeUF_XxhUPFIjR0U=", "Mf57hhOy")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }

    @Override // lib.zj.office.system.i
    public final void H0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void J() {
    }

    @Override // lib.zj.office.system.i
    public final /* synthetic */ void X0() {
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

    @Override // lib.zj.office.system.i
    public final void d1() {
    }

    @Override // lib.zj.office.system.i
    public final void j() {
    }

    @Override // lib.zj.office.system.i
    public final void k0() {
    }

    @Override // lib.zj.office.system.i
    public final void l() {
    }

    @Override // lib.zj.office.system.i
    public final Activity m() {
        return this;
    }

    @Override // lib.zj.office.system.i
    public final void o() {
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            String str = OfficeReaderActivity.D2;
            OfficeReaderActivity officeReaderActivity = OfficeReaderActivity.this;
            if (!officeReaderActivity.f19289b) {
                officeReaderActivity.getClass();
                if (editable != null && editable.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    officeReaderActivity.e2(false);
                    AppCompatImageView appCompatImageView = officeReaderActivity.H;
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("QGUqchBoIWwXYUZJdg==", "xIBQosSV"));
                        throw null;
                    }
                }
                AppCompatImageView appCompatImageView2 = officeReaderActivity.H;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("O2UqcjVoe2wtYRRJdg==", "VdHKV8hv"));
                    throw null;
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }
}
