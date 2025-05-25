package pdf.pdfreader.viewer.editor.free.office;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.play.core.assetpacks.b1;
import com.lib.flutter.encrypt.EngineHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import lib.zj.office.officereader.AppFrame;
import lib.zj.office.officereader.beans.AToolsbar;
import lib.zj.office.officereader.beans.WPToolsbar;
import lib.zj.office.pg.control.PGPrintMode;
import lib.zj.office.pg.control.Presentation;
import lib.zj.office.system.beans.pagelist.APageListView;
import lib.zj.office.wp.control.Word;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.anim.BannerLoadingAnimation;
import pdf.pdfreader.viewer.editor.free.bean.ThirdOpenBean;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.q0;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenStatus;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdParseWrongMineTypeException;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import sg.e;
import x0.f0;

/* compiled from: Word2PDFConvertActivity.kt */
/* loaded from: classes3.dex */
public final class Word2PDFConvertActivity extends pdf.pdfreader.viewer.editor.free.ui.act.a implements lib.zj.office.system.i, a.d, sp.b {
    public final b A0;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.s B0;
    public final e0 C0;
    public j2 D0;
    public final wn.c E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public long I0;
    public String J;
    public boolean J0;
    public boolean K;
    public boolean K0;
    public ViewGroup L;
    public final int L0;
    public LottieAnimationView M;
    public boolean M0;
    public View N;
    public boolean N0;
    public View O;
    public boolean O0;
    public ImageView P;
    public final g0 P0;
    public ProgressView Q;
    public ArrayList<PdfPreviewEntity> R;
    public AppCompatTextView S;
    public FrameLayout T;
    public FrameLayout U;
    public FrameLayout V;
    public ViewStub W;
    public ConstraintLayout X;
    public TextView Y;
    public TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public AppCompatTextView f26021a0;

    /* renamed from: b0  reason: collision with root package name */
    public AppCompatTextView f26022b0;

    /* renamed from: c0  reason: collision with root package name */
    public LinearLayout f26023c0;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f26024c1;

    /* renamed from: d0  reason: collision with root package name */
    public AppCompatTextView f26025d0;

    /* renamed from: e0  reason: collision with root package name */
    public LinearLayout f26026e0;

    /* renamed from: f0  reason: collision with root package name */
    public ReaderLoadingView f26027f0;

    /* renamed from: i1  reason: collision with root package name */
    public final i0 f26031i1;

    /* renamed from: j0  reason: collision with root package name */
    public PdfPreviewEntity f26032j0;

    /* renamed from: j1  reason: collision with root package name */
    public long f26033j1;

    /* renamed from: k0  reason: collision with root package name */
    public nl.b f26034k0;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f26035k1;

    /* renamed from: l0  reason: collision with root package name */
    public lib.zj.office.system.p f26036l0;

    /* renamed from: l1  reason: collision with root package name */
    public OperatePdfFailedDialog f26037l1;

    /* renamed from: m0  reason: collision with root package name */
    public AppFrame f26038m0;

    /* renamed from: m1  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.ui.dialog.x f26039m1;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f26040n0;

    /* renamed from: n1  reason: collision with root package name */
    public OperateInterceptDialog f26041n1;

    /* renamed from: o0  reason: collision with root package name */
    public InterceptTouchFrameLayout f26042o0;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f26043o1;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f26045q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f26046r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f26047s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f26048t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f26049u0;

    /* renamed from: w0  reason: collision with root package name */
    public sp.h f26051w0;

    /* renamed from: x0  reason: collision with root package name */
    public LinearLayout f26052x0;

    /* renamed from: y0  reason: collision with root package name */
    public ViewGroup f26053y0;

    /* renamed from: z0  reason: collision with root package name */
    public final androidx.activity.result.c<String[]> f26054z0;
    public static final String q1 = ea.a.p("GFBiMilEcVAoZTxpEHcpY0FpGGkxeQ==", "XQ4D3uOE");

    /* renamed from: p1  reason: collision with root package name */
    public static final a f26020p1 = new a();
    public final tf.c I = kotlin.a.a(new cg.a<OperateExecuteTask>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$operateTask$2
        @Override // cg.a
        public final OperateExecuteTask invoke() {
            return new OperateExecuteTask();
        }
    });

    /* renamed from: g0  reason: collision with root package name */
    public final boolean f26028g0 = true;

    /* renamed from: h0  reason: collision with root package name */
    public String f26029h0 = "";

    /* renamed from: i0  reason: collision with root package name */
    public String f26030i0 = "";

    /* renamed from: p0  reason: collision with root package name */
    public final tf.c f26044p0 = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$mainHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: v0  reason: collision with root package name */
    public final androidx.lifecycle.k0 f26050v0 = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(pdf.pdfreader.viewer.editor.free.feature.bridge.c.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("T2kvdzhvDWUkUxJvRmU=", "Ty9JuiTC"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZydmFadBdyeQ==", "09xN4IqC"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("R2gic11kB2YTdVh0P2kzdwlvVmUqQzFlMnQkb1pFFXRBYXM=", "SM4mos7J"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String filePath, PdfPreviewEntity pdf2, String str) {
            int i10;
            kotlin.jvm.internal.g.e(filePath, "filePath");
            kotlin.jvm.internal.g.e(pdf2, "pdf");
            if (context != null) {
                File file = new File(filePath);
                long length = file.length();
                if (file.exists() && length >= 0) {
                    if (i10 == 0) {
                        j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130148), true, null, -1);
                        return;
                    }
                    Intent intent = new Intent(context, Word2PDFConvertActivity.class);
                    intent.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJPVc=", "xUCpYhaM"));
                    intent.setData(Uri.fromFile(file));
                    intent.putExtra(ea.a.p("QGgkdyxwBmY=", "BFTDaDDu"), pdf2);
                    intent.putExtra(ea.a.p("UHI1bQ==", "mH6ZfKB7"), str);
                    intent.putExtra(ea.a.p("Q2EsZSx0bw==", "0JWEGJSC"), ea.a.p("Q2EsZSxwEGUEaVF3Nm8wZi1jZQ==", "HS0EqtFw"));
                    if (!(context instanceof Activity)) {
                        intent.addFlags(268435456);
                    }
                    try {
                        context.startActivity(intent);
                        tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZ3Q29w", "jIfhfFlD"));
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        return;
                    }
                }
                j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130393), true, null, -1);
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.lib.flutter.encrypt.e {
        public b() {
        }

        @Override // com.lib.flutter.encrypt.e
        public final void a(String str) {
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(word2PDFConvertActivity)) {
                if (BillingConfigImpl.c.w()) {
                    String p10 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEnA0ZTVpH3cKb0x0PG1xYSVuFnJCcxpvdw==", "zH8SabCU");
                    int i10 = zk.a.f32399a;
                    t1.b(p10);
                    return;
                }
                LinearLayout linearLayout = word2PDFConvertActivity.f26052x0;
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
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(word2PDFConvertActivity)) {
                LinearLayout linearLayout2 = word2PDFConvertActivity.f26052x0;
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
                if (obj != null && (linearLayout = word2PDFConvertActivity.f26052x0) != null) {
                    linearLayout.removeAllViews();
                }
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements androidx.lifecycle.x<Map<Uri, ? extends ip.c>> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThirdOpenBean f26056a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Word2PDFConvertActivity f26057b;
        public final /* synthetic */ Bundle c;

        public c(ThirdOpenBean thirdOpenBean, Word2PDFConvertActivity word2PDFConvertActivity, Bundle bundle) {
            this.f26056a = thirdOpenBean;
            this.f26057b = word2PDFConvertActivity;
            this.c = bundle;
        }

        @Override // androidx.lifecycle.x
        public final void m(Map<Uri, ? extends ip.c> map) {
            Map<Uri, ? extends ip.c> map2 = map;
            if (map2 != null) {
                ea.a.p("Z2gichdPEmUcUFVyGmUbYSphVWVy", "BN265a8M");
                map2.toString();
                ip.c cVar = map2.get(this.f26056a.getUri());
                String str = null;
                Word2PDFConvertActivity word2PDFConvertActivity = this.f26057b;
                if (cVar != null) {
                    ThirdOpenStatus thirdOpenStatus = ThirdOpenStatus.PARSE;
                    ThirdOpenStatus thirdOpenStatus2 = cVar.f18970b;
                    if (thirdOpenStatus2 != thirdOpenStatus) {
                        word2PDFConvertActivity.G0 = false;
                        ViewGroup viewGroup = word2PDFConvertActivity.L;
                        if (viewGroup != null) {
                            viewGroup.setVisibility(0);
                            ViewGroup viewGroup2 = (ViewGroup) word2PDFConvertActivity.findViewById(16908290);
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(word2PDFConvertActivity.findViewById(R.id.loadingRoot));
                                try {
                                    h1.f(androidx.core.content.a.getColor(word2PDFConvertActivity, R.color.no_color), word2PDFConvertActivity, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(word2PDFConvertActivity), word2PDFConvertActivity.f19294h);
                                } catch (Exception e10) {
                                    e10.printStackTrace();
                                }
                            }
                            if (thirdOpenStatus2 != ThirdOpenStatus.DONE) {
                                t1.b(ea.a.p("Q2QtUAFlFGkXdxR0AWkkZAtwV25mcCJyHWUkchdvOTE=", "naeKaxks"));
                                if (thirdOpenStatus2 == ThirdOpenStatus.NOT_SUPPORT) {
                                    String string = word2PDFConvertActivity.getString(R.string.arg_res_0x7f13004c);
                                    kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGEqbBxyHGEKZUsyDHRKcC5fHW8WXwF1RHAGciIp", "yn9Sr88L"));
                                    String string2 = word2PDFConvertActivity.getString(R.string.arg_res_0x7f13004d);
                                    kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGEpbDpyoYDiMhh0CnAqX19vDV9EdSpwJXIBXwxlRl9fKQ==", "PNJwCDGs"));
                                    word2PDFConvertActivity.G2(string, string2, word2PDFConvertActivity.getString(R.string.arg_res_0x7f13004e));
                                } else {
                                    String string3 = word2PDFConvertActivity.getString(R.string.arg_res_0x7f130391);
                                    kotlin.jvm.internal.g.d(string3, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlJ19SaQhlB2VLYy5wB2kNbik=", "U4dXal06"));
                                    String string4 = word2PDFConvertActivity.getString(R.string.arg_res_0x7f130390);
                                    kotlin.jvm.internal.g.d(string4, ea.a.p("FmUEUxByAm4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ18SbwJyEXAfXythCG5bdAhvSGU8KQ==", "iUqpdkii"));
                                    word2PDFConvertActivity.G2(string3, string4, null);
                                }
                            } else {
                                PdfPreviewEntity pdfPreviewEntity = cVar.c;
                                if (pdfPreviewEntity != null) {
                                    if (word2PDFConvertActivity.m2(pdfPreviewEntity.getPath())) {
                                        Intent intent = word2PDFConvertActivity.getIntent();
                                        if (intent != null) {
                                            intent.putExtra(ea.a.p("PGhedyZwU2Y=", "6ghTIkF8"), pdfPreviewEntity);
                                        }
                                        Intent intent2 = word2PDFConvertActivity.getIntent();
                                        if (intent2 != null) {
                                            intent2.setData(Uri.fromFile(new File(pdfPreviewEntity.getPath())));
                                        }
                                        Bundle bundle = this.c;
                                        if (!word2PDFConvertActivity.n2(bundle)) {
                                            word2PDFConvertActivity.z2(bundle);
                                        }
                                    }
                                } else {
                                    t1.b(ea.a.p("O2QWUEZlMWktd0Z0XGklZHdwN25pcFdyB2U0ciNvMDI=", "RHKp4GuE"));
                                    String string5 = word2PDFConvertActivity.getString(R.string.arg_res_0x7f130391);
                                    kotlin.jvm.internal.g.d(string5, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHIgYQFlB18caV5lEWU3Y1RwDWlYbik=", "sgNpuz2N"));
                                    String string6 = word2PDFConvertActivity.getString(R.string.arg_res_0x7f130390);
                                    kotlin.jvm.internal.g.d(string6, ea.a.p("PWU1Ux5yUG4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ185bzNyH3BNXythCG5bdAhvSGU8KQ==", "kIZAj9xl"));
                                    word2PDFConvertActivity.G2(string5, string6, null);
                                }
                            }
                            ThirdOpenParseManager.f28764f.i(this);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("S29XdBtpIXc=", "2r98MD4I"));
                        throw null;
                    }
                }
                ViewGroup viewGroup3 = word2PDFConvertActivity.L;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                    ViewGroup viewGroup4 = (ViewGroup) word2PDFConvertActivity.findViewById(16908290);
                    if (viewGroup4 != null) {
                        View inflate = LayoutInflater.from(word2PDFConvertActivity).inflate(R.layout.layout_preview_loading, viewGroup4, false);
                        ((LottieAnimationView) inflate.findViewById(R.id.loadingLottie)).setAnimation(R.raw.loading);
                        TextView textView = (TextView) inflate.findViewById(R.id.loadingText);
                        Intent intent3 = word2PDFConvertActivity.getIntent();
                        if (intent3 != null) {
                            str = intent3.getStringExtra(ea.a.p("O3lBZT1lRGMOZTJ0", "s4pJ3kvs"));
                        }
                        textView.setText(str);
                        ((ImageView) inflate.findViewById(R.id.loadingBack)).setOnClickListener(new f5.d(word2PDFConvertActivity, 19));
                        viewGroup4.addView(inflate, new FrameLayout.LayoutParams(-1, -1));
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "c1USPpoU"));
                throw null;
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ConstraintLayout f26058a;

        public d(ConstraintLayout constraintLayout) {
            this.f26058a = constraintLayout;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            this.f26058a.setVisibility(8);
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements sg.b {
        public e() {
        }

        @Override // sg.b
        public final void a() {
            tf.d dVar;
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(word2PDFConvertActivity)) {
                q0.u();
            }
            System.currentTimeMillis();
            o9.d.s(ea.a.p("OlA2MhhEK1A6ZRBpUXcWY0xpJGk9eQ==", "vvmeHmhz"), ea.a.p("K2lCbRBzREQzYSZvZw==", "4OherBLC"));
            nl.b bVar = word2PDFConvertActivity.f26034k0;
            if (bVar != null) {
                int i10 = bVar.f22595p;
                if (i10 > word2PDFConvertActivity.L0 || i10 <= 1) {
                    word2PDFConvertActivity.x2();
                    word2PDFConvertActivity.E2();
                }
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                word2PDFConvertActivity.x2();
                word2PDFConvertActivity.E2();
            }
        }

        @Override // sg.b
        public final void b() {
            o9.d.s(ea.a.p("ZFAYMiNEJFAAZUJpDHcXYzBpRGkyeQ==", "7LFb75ob"), ea.a.p("PGhedz1pVmw1Zw==", "pNbtAP8j"));
            long currentTimeMillis = System.currentTimeMillis();
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            word2PDFConvertActivity.I0 = currentTimeMillis;
            word2PDFConvertActivity.runOnUiThread(new d0(word2PDFConvertActivity, 2));
            View view = word2PDFConvertActivity.O;
            if (view != null) {
                view.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("RG85ZEFQBmYxb1p0CGk4ZTZGbA==", "SnfI23Vj"));
                throw null;
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class h implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f26061a;

        public h(cg.l lVar) {
            ea.a.p("AXUmYz5pOG4=", "vcgHJWZr");
            this.f26061a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f26061a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f26061a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f26061a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f26061a.invoke(obj);
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = Word2PDFConvertActivity.this.f26026e0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "HXi5T7ov"));
                throw null;
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class j extends AnimatorListenerAdapter {
        public j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.g.e(animation, "animation");
            LinearLayout linearLayout = Word2PDFConvertActivity.this.f26026e0;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "zkPAN9ha"));
                throw null;
            }
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class k implements s.a {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f26065b = false;
        public final /* synthetic */ int c;

        public k(int i10) {
            this.c = i10;
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void a(int i10) {
            View view;
            gj.j jVar;
            gj.k I;
            View view2;
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.f(word2PDFConvertActivity, word2PDFConvertActivity.f26032j0, this.f26065b);
            Word word = null;
            Presentation presentation = null;
            int i11 = this.c;
            if (i11 != 0) {
                if (i11 == 1) {
                    lib.zj.office.system.p pVar = word2PDFConvertActivity.f26036l0;
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
                            APageListView aPageListView = pGPrintMode.f20913e;
                            APageListView aPageListView2 = pGPrintMode.f20913e;
                            Object model = aPageListView.getModel();
                            kotlin.jvm.internal.g.c(model, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuF25ibhxsASA7eUFlWWxeYnR6IC4aZg5pVmVAcCIuCG8cZSMuOUcgbytlbA==", "vTnCxOim"));
                            th.c cVar = (th.c) model;
                            if (i10 <= cVar.c() && i10 > 0) {
                                aPageListView2.setCurrentPageNumber(i10);
                                aPageListView2.requestLayout();
                            } else {
                                pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = word2PDFConvertActivity.B0;
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
                lib.zj.office.system.p pVar2 = word2PDFConvertActivity.f26036l0;
                if (pVar2 != null) {
                    view = pVar2.getView();
                } else {
                    view = null;
                }
                if (view instanceof Word) {
                    word = view;
                }
                if (word != null && (jVar = word.f21109q) != null && (I = jVar.I(i10 - 1)) != null) {
                    word.scrollTo(0, (int) (word.getZoom() * I.c));
                }
            }
            pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar2 = word2PDFConvertActivity.B0;
            if (sVar2 != null) {
                sVar2.cancel();
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.s.a
        public final void b() {
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            pdf.pdfreader.viewer.editor.free.utils.p.g(word2PDFConvertActivity, word2PDFConvertActivity.f26032j0, this.f26065b);
        }
    }

    public Word2PDFConvertActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new d9.g(this, 14));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBskoDsfUYgQyBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "F8nxpJLc"));
        this.f26054z0 = registerForActivityResult;
        this.A0 = new b();
        this.C0 = new e0(this, 1);
        this.E0 = new wn.c(0L);
        this.L0 = 20;
        this.M0 = true;
        this.P0 = new g0(this, 0);
        this.f26031i1 = new i0(this, 0);
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.D0 = j2Var;
        if (z10) {
            j2Var.c(1);
        } else {
            j2Var.c(0);
        }
        j2Var.f27638i = new m(this, z10);
        j2 j2Var2 = this.D0;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    public static void l2(Word2PDFConvertActivity word2PDFConvertActivity, Map map) {
        kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "78stmkS5"));
        word2PDFConvertActivity.u2().removeCallbacks(word2PDFConvertActivity.C0);
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(word2PDFConvertActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfcVgFRTpOJEwQU2VPK0FwRQ==", "PUh44Qhe")) && !k0.b.b(word2PDFConvertActivity, ea.a.p("Jm4qch1pXS44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEELXx1UPVJ4R0U=", "RnGNr94Z"))) {
                word2PDFConvertActivity.X1(true);
            } else {
                word2PDFConvertActivity.X1(false);
            }
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
            if (!z10) {
                new pdf.pdfreader.viewer.editor.free.ui.dialog.b0(this, str, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onTouchLink$1
                    {
                        super(0);
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        int i10;
                        int[] iArr;
                        InterceptTouchFrameLayout interceptTouchFrameLayout;
                        Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
                        String string = word2PDFConvertActivity.getString(R.string.arg_res_0x7f1301b4);
                        kotlin.jvm.internal.g.d(string, ea.a.p("EGUWUwZyDG4vKDQuR3QlaVZnfGkndldsHWQubDhuKSk=", "H8wbreVX"));
                        if (word2PDFConvertActivity.isFinishing()) {
                            return;
                        }
                        try {
                            iArr = new int[2];
                            interceptTouchFrameLayout = word2PDFConvertActivity.f26042o0;
                        } catch (Exception unused) {
                        }
                        if (interceptTouchFrameLayout != null) {
                            interceptTouchFrameLayout.getLocationInWindow(iArr);
                            int U = iArr[1] - t0.U(word2PDFConvertActivity);
                            if (U >= 0) {
                                i10 = (int) (U + word2PDFConvertActivity.getResources().getDimension(R.dimen.dp_6));
                                j1.e(word2PDFConvertActivity, string, true, null, i10);
                                return;
                            }
                            i10 = -1;
                            j1.e(word2PDFConvertActivity, string, true, null, i10);
                            return;
                        }
                        kotlin.jvm.internal.g.i(ea.a.p("NmU3ZFxyMG8mdAdpWmVy", "FUDV9sof"));
                        throw null;
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                }).show();
            }
        }
    }

    public final boolean A2() {
        float a10 = pdf.pdfreader.viewer.editor.free.utils.f0.a();
        float length = ((((float) new File(this.f26029h0).length()) / 1024.0f) / 1024.0f) + 10;
        t1.b("WPS2PDFPreviewActivityconvert needSpace: " + length + " freeSize: " + a10);
        if (a10 > length * 2) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean B0() {
        return this.f26028g0;
    }

    public final boolean B2() {
        if (!kotlin.jvm.internal.g.a(ea.a.p("dVIETSxUKkkgRA==", "baLtmP7C"), this.J) && !kotlin.jvm.internal.g.a(ea.a.p("Q2EsZSx3C2QVZXQ=", "dWs5wdqw"), this.J)) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.system.i
    public final byte C0() {
        return (byte) 0;
    }

    @Override // jl.a
    public final void C1() {
        EngineHelper engineHelper = EngineHelper.f15726a;
        String p10 = ea.a.p("P3JUdhBlQEI1dD5vGEIJbltlHEE5cBdlM2kXd3FvNnQgbXNhF25SckI=", "t2xoEr3B");
        engineHelper.getClass();
        EngineHelper.h(p10, this.A0);
        View findViewById = findViewById(R.id.rootView);
        kotlin.jvm.internal.g.d(findViewById, ea.a.p("IWlfZDRpU3cKeS9kHFJ5aVwuIG8mdGBpEXcp", "HVG1b6gZ"));
        this.L = (ViewGroup) findViewById;
        View findViewById2 = findViewById(R.id.container);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("F2kLZBNpC3cKeS9kHFJ5aVwuMW8ndFdpGmUDKQ==", "pqqeEnLN"));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById2;
        View findViewById3 = findViewById(R.id.backIv);
        kotlin.jvm.internal.g.d(findViewById3, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDGEmayx2KQ==", "tvrR8szL"));
        this.M = (LottieAnimationView) findViewById3;
        View findViewById4 = findViewById(R.id.preview_convert_to_pdf_ll);
        kotlin.jvm.internal.g.d(findViewById4, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQnIjdiplHV8Cbzp2UnJHXz9vLHAGZi1sWCk=", "jaT7esDw"));
        this.N = findViewById4;
        View findViewById5 = findViewById(R.id.preview_convert_to_pdf_fl);
        kotlin.jvm.internal.g.d(findViewById5, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHnIgdgxlPV8Ubxl2HXI7X0VvJnBTZgVmJik=", "UTwOJwwx"));
        this.O = findViewById5;
        View findViewById6 = findViewById(R.id.preview_convert_to_pdf_pro_iv);
        kotlin.jvm.internal.g.d(findViewById6, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQnIjdiplHl8bbxR2BHJHXz9vLHAGZi1wRm82aSAp", "ixza0JH5"));
        this.P = (ImageView) findViewById6;
        View findViewById7 = findViewById(R.id.preview_convert_to_pdf_progress);
        kotlin.jvm.internal.g.d(findViewById7, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHnIgdgxlHV8hbwR2VHI7X0VvJnBTZgVwOG8Scg1zRik=", "3wAyjBj1"));
        this.Q = (ProgressView) findViewById7;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            LottieAnimationView lottieAnimationView = this.M;
            if (lottieAnimationView != null) {
                lottieAnimationView.setRotation(-180.0f);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("DGEpawR2", "m9nJMDMR"));
                throw null;
            }
        }
        View findViewById8 = findViewById(R.id.fileNameTv);
        kotlin.jvm.internal.g.d(findViewById8, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVGkqZQ1hG2Umdik=", "vrAsaago"));
        this.S = (AppCompatTextView) findViewById8;
        View findViewById9 = findViewById(R.id.splash_root);
        kotlin.jvm.internal.g.d(findViewById9, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQXAqYTBoNXIqbxUp", "jEaLjjNk"));
        this.T = (FrameLayout) findViewById9;
        View findViewById10 = findViewById(R.id.loadingContainer);
        kotlin.jvm.internal.g.d(findViewById10, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuAm8kZAxuLUM3bhlhL24qcik=", "xErpJXmF"));
        this.U = (FrameLayout) findViewById10;
        View findViewById11 = findViewById(R.id.readerContainer);
        kotlin.jvm.internal.g.d(findViewById11, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQGUnZCZyem89dBdpN2VBKQ==", "9SvYbC56"));
        this.f26042o0 = (InterceptTouchFrameLayout) findViewById11;
        View findViewById12 = findViewById(R.id.toast_vs);
        kotlin.jvm.internal.g.d(findViewById12, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRm8nczdfT3Mp", "9bDyt5Lh"));
        ViewStub viewStub = (ViewStub) findViewById12;
        View findViewById13 = findViewById(R.id.full_holder);
        kotlin.jvm.internal.g.d(findViewById13, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuVHUqbBxoJWxcZRgp", "J8jf4Spn"));
        this.V = (FrameLayout) findViewById13;
        View findViewById14 = findViewById(R.id.preview_page_number_vs);
        kotlin.jvm.internal.g.d(findViewById14, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuQnIjdiplDV8FYV5lM25GbSllAV8Ucyk=", "zu9l06jl"));
        this.W = (ViewStub) findViewById14;
        View findViewById15 = findViewById(R.id.pageGotoLl);
        kotlin.jvm.internal.g.d(findViewById15, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHmEiZSJvTG8kbCk=", "zdpp8heJ"));
        this.f26023c0 = (LinearLayout) findViewById15;
        View findViewById16 = findViewById(R.id.pageSlash);
        kotlin.jvm.internal.g.d(findViewById16, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuHmEiZTZsNXMLKQ==", "Yxj4TcVx"));
        this.f26022b0 = (AppCompatTextView) findViewById16;
        View findViewById17 = findViewById(R.id.totalPageTv);
        kotlin.jvm.internal.g.d(findViewById17, ea.a.p("VWklZCVpB3cweX1kQVJ4aSAuRm8yYS9QLWdQVBQp", "L5b5P9Wx"));
        this.f26025d0 = (AppCompatTextView) findViewById17;
        View findViewById18 = findViewById(R.id.bgPageToast);
        kotlin.jvm.internal.g.d(findViewById18, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDGcVYQJlOm8tcz8p", "nwyQnLKQ"));
        this.f26026e0 = (LinearLayout) findViewById18;
        View findViewById19 = findViewById(R.id.currentPageTv);
        kotlin.jvm.internal.g.d(findViewById19, ea.a.p("KWlfZC9pUncYeQNkXVJGaVEuDXU3cgBuNVAOZwtUTik=", "rzMCAon8"));
        this.f26021a0 = (AppCompatTextView) findViewById19;
        this.f26052x0 = (LinearLayout) findViewById(R.id.ad_layout);
        View findViewById20 = findViewById(R.id.bottomAdContainer);
        kotlin.jvm.internal.g.d(findViewById20, ea.a.p("NmlXZDVpPXcKeS9kHFJ5aVwuMG89dFltNWQybz90I2k-ZUsp", "QWP9cXCN"));
        this.f26053y0 = (ViewGroup) findViewById20;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.f.a(23)) {
            View decorView = getWindow().getDecorView();
            com.google.android.tools.d dVar = new com.google.android.tools.d(this, 16);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(decorView, dVar);
        }
    }

    public final void C2() {
        int i10;
        int i11;
        int i12;
        int i13;
        LinearLayout linearLayout = this.f26023c0;
        if (linearLayout != null) {
            if (this.N0 && !this.O0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            linearLayout.setVisibility(i10);
            AppCompatTextView appCompatTextView = this.f26021a0;
            if (appCompatTextView != null) {
                if (this.N0 && !this.O0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                appCompatTextView.setVisibility(i11);
                AppCompatTextView appCompatTextView2 = this.f26022b0;
                if (appCompatTextView2 != null) {
                    if (this.N0 && !this.O0) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    appCompatTextView2.setVisibility(i12);
                    AppCompatTextView appCompatTextView3 = this.f26025d0;
                    if (appCompatTextView3 != null) {
                        if (this.N0 && !this.O0) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        appCompatTextView3.setVisibility(i13);
                        if (!this.M0) {
                            if (this.N0 && !this.O0) {
                                LinearLayout linearLayout2 = this.f26026e0;
                                if (linearLayout2 != null) {
                                    linearLayout2.setVisibility(0);
                                    return;
                                } else {
                                    kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "BAHBalNy"));
                                    throw null;
                                }
                            }
                            LinearLayout linearLayout3 = this.f26026e0;
                            if (linearLayout3 != null) {
                                linearLayout3.setVisibility(8);
                                return;
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("E2dkYTJlBW8pc3Q=", "tqq4UQ2t"));
                                throw null;
                            }
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("O29FYRVQVmc_VHY=", "lDViVUJZ"));
                    throw null;
                }
                kotlin.jvm.internal.g.i(ea.a.p("AWEtZTVsLHNo", "TXqJfMhM"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "3uRi9a9R"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("P2FWZT5vQ28WbA==", "rVpusRno"));
        throw null;
    }

    @Override // sp.b
    public final void D() {
        F2();
    }

    @Override // jl.a
    public final View D1() {
        ViewGroup viewGroup = this.L;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.g.i(ea.a.p("QW8kdCVpB3c=", "fdwkZA02"));
        throw null;
    }

    public final void D2(boolean z10) {
        boolean z11 = this.N0;
        boolean z12 = this.M0;
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (!z11) {
            LinearLayout linearLayout = this.f26026e0;
            if (linearLayout != null) {
                if (linearLayout.getVisibility() != 8) {
                    LinearLayout linearLayout2 = this.f26026e0;
                    if (linearLayout2 != null) {
                        linearLayout2.setAlpha(1.0f);
                        LinearLayout linearLayout3 = this.f26026e0;
                        if (linearLayout3 != null) {
                            linearLayout3.animate().alpha(0.0f).setDuration(450L).setListener(new i());
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "lNa1KpfV"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "hovoYnF5"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "ZRV8PPRB"));
            throw null;
        } else if (!z10) {
            LinearLayout linearLayout4 = this.f26026e0;
            if (linearLayout4 != null) {
                if (linearLayout4.getVisibility() != 8) {
                    LinearLayout linearLayout5 = this.f26026e0;
                    if (linearLayout5 != null) {
                        linearLayout5.setAlpha(1.0f);
                        LinearLayout linearLayout6 = this.f26026e0;
                        if (linearLayout6 != null) {
                            linearLayout6.animate().alpha(0.0f).setDuration(450L).setListener(new j()).start();
                            return;
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "NtOnfe90"));
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "gs1ielOb"));
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "cKlfSkp7"));
            throw null;
        } else {
            if (!this.O0 || z12) {
                LinearLayout linearLayout7 = this.f26026e0;
                if (linearLayout7 != null) {
                    if (linearLayout7.getVisibility() != 0) {
                        LinearLayout linearLayout8 = this.f26026e0;
                        if (linearLayout8 != null) {
                            linearLayout8.setAlpha(0.0f);
                            LinearLayout linearLayout9 = this.f26026e0;
                            if (linearLayout9 != null) {
                                linearLayout9.animate().alpha(1.0f).setDuration(450L).setListener(null).start();
                            } else {
                                kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "Nxdal9dF"));
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("VmcYYRVlbW8pc3Q=", "VK4Hr94r"));
                            throw null;
                        }
                    }
                    LinearLayout linearLayout10 = this.f26026e0;
                    if (linearLayout10 != null) {
                        linearLayout10.setVisibility(0);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("UWcbYRRlNm8Tc3Q=", "9WdD0L21"));
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("LWdhYR5lY287c3Q=", "wxwKyXdk"));
                    throw null;
                }
            }
            C2();
        }
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_wps_to_pdf_preview;
    }

    public final void E2() {
        View view = this.O;
        if (view != null) {
            view.setVisibility(0);
        } else {
            kotlin.jvm.internal.g.i(ea.a.p("Em8zZHdQU2YLbwh0VWk5ZUpGbA==", "nreAE7YI"));
            throw null;
        }
    }

    public final void F2() {
        this.f26035k1 = false;
        u2().post(new d0(this, 0));
    }

    @Override // lib.zj.office.system.i
    public final File G0() {
        File externalFilesDir = getExternalFilesDir(null);
        if (externalFilesDir == null) {
            File filesDir = getFilesDir();
            kotlin.jvm.internal.g.d(filesDir, ea.a.p("VWknZQBEC3I=", "dEaFWX7w"));
            return filesDir;
        }
        return externalFilesDir;
    }

    public final void G2(String str, String str2, String str3) {
        i3 i3Var = new i3(this, str, str2, str3);
        i3Var.setCanceledOnTouchOutside(false);
        i3Var.setCancelable(true);
        i3Var.setOnCancelListener(new f0(this, 1));
        i3Var.show();
        Window window = getWindow();
        if (window != null) {
            ea.a.p("OGlfZBZ3", "rmJxQenh");
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
        if (r4.N0 == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H2(int r5, boolean r6) {
        /*
            r4 = this;
            r6 = 0
            r0 = 1
            if (r5 == 0) goto L20
            if (r5 == r0) goto L7
            goto L3c
        L7:
            lib.zj.office.system.p r1 = r4.f26036l0
            if (r1 == 0) goto L10
            android.view.View r1 = r1.getView()
            goto L11
        L10:
            r1 = r6
        L11:
            boolean r2 = r1 instanceof lib.zj.office.pg.control.Presentation
            if (r2 == 0) goto L18
            lib.zj.office.pg.control.Presentation r1 = (lib.zj.office.pg.control.Presentation) r1
            goto L19
        L18:
            r1 = r6
        L19:
            if (r1 == 0) goto L3c
            int r1 = r1.getSlideCount()
            goto L3d
        L20:
            lib.zj.office.system.p r1 = r4.f26036l0
            if (r1 == 0) goto L29
            android.view.View r1 = r1.getView()
            goto L2a
        L29:
            r1 = r6
        L2a:
            boolean r2 = r1 instanceof lib.zj.office.wp.control.Word
            if (r2 == 0) goto L31
            lib.zj.office.wp.control.Word r1 = (lib.zj.office.wp.control.Word) r1
            goto L32
        L31:
            r1 = r6
        L32:
            if (r1 == 0) goto L3c
            int r1 = r1.getPageCount()
            boolean r2 = r4.N0
            if (r2 != 0) goto L3d
        L3c:
            r1 = r0
        L3d:
            if (r1 > r0) goto L40
            return
        L40:
            pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity r0 = r4.f26032j0
            java.lang.String r2 = "XW85bRJs"
            java.lang.String r3 = "9Z2uUT75"
            java.lang.String r2 = ea.a.p(r2, r3)
            r3 = 0
            pdf.pdfreader.viewer.editor.free.utils.p.h(r4, r0, r3, r2)
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r0 = r4.B0
            if (r0 == 0) goto L57
            r0.show()
            tf.d r6 = tf.d.f30009a
        L57:
            if (r6 != 0) goto L6a
            pdf.pdfreader.viewer.editor.free.ui.dialog.s r6 = new pdf.pdfreader.viewer.editor.free.ui.dialog.s
            r6.<init>(r4, r1)
            pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$k r0 = new pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$k
            r0.<init>(r5)
            r6.f27742t = r0
            r6.show()
            r4.B0 = r6
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity.H2(int, boolean):void");
    }

    public final void I2() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.x xVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.x(this, getString(R.string.arg_res_0x7f1302ad), getString(R.string.arg_res_0x7f1304da), getString(R.string.arg_res_0x7f130421));
        this.f26039m1 = xVar;
        xVar.H = new a1.e(this, 11);
        W1(xVar);
        pdf.pdfreader.viewer.editor.free.utils.p.k(this, s2().concat("_space"));
    }

    public final void J2(List<? extends PdfPreviewEntity> list, boolean z10) {
        String p10;
        FrameLayout frameLayout = this.V;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = this.V;
            if (frameLayout2 != null) {
                frameLayout2.removeAllViews();
                if (kotlin.jvm.internal.g.a(ea.a.p("dVIETSxUKkkgRA==", "j5aoIQHp"), this.J)) {
                    p10 = ea.a.p("QGgqchZfFTJw", "o20C1wdS");
                } else {
                    p10 = ea.a.p("ODJw", "TEOflMdE");
                }
                String str = p10;
                this.R = new ArrayList<>(list);
                OperateExecuteTask v22 = v2();
                FrameLayout frameLayout3 = this.V;
                if (frameLayout3 != null) {
                    String string = getString(R.string.arg_res_0x7f1300d2);
                    kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGMqbhNlAHQcZAlzBWMsZUJzH3VbbCNfeyk=", "nvmlryVp"));
                    v22.q(5, str, frameLayout3, string, list, z10, new l());
                    return;
                }
                kotlin.jvm.internal.g.i(ea.a.p("VXUnbDtvDmQXcnJs", "n62jz5kf"));
                throw null;
            }
            kotlin.jvm.internal.g.i(ea.a.p("KXVdbDFvW2Q_cgxs", "zsxkc8pX"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("VXUnbDtvDmQXcnJs", "QRur0Hj6"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final void K() {
        View view;
        o9.d.s(q1, ea.a.p("VG8ZcAllP2UEYR9vQXQ=", "cj7teKU3"));
        t1.b(ea.a.p("GFBiMilEcVAoZTxpEHcpY0FpGGkxeUVjWW0GbCx0B0wueV51dA==", "bje66vIb"));
        androidx.activity.f.q("GFBiMilEcVAoZTxpEHcpY0FpGGkxeUVjOW0_bCx0F0wueV51dA==", "Ng4bVOIr", dp.a.a());
        this.f26040n0 = true;
        x2();
        E2();
        lib.zj.office.system.p pVar = this.f26036l0;
        if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
            K2(((Word) view).getPageCount());
        }
    }

    @Override // jl.a
    public final void K1() {
        View findViewById = findViewById(R.id.view_status_bar);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        layoutParams.height = aj.b.B(this);
        findViewById.setLayoutParams(layoutParams);
        View findViewById2 = findViewById(R.id.pageGotoLl);
        kotlin.jvm.internal.g.d(findViewById2, ea.a.p("VWklZCVpB3cweX1kVVY_ZTM-GlJoaScuAWFRZQZvEW9_bCk=", "q6AewWn5"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(findViewById2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$initView$1
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
                Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
                lib.zj.office.system.p pVar = word2PDFConvertActivity.f26036l0;
                View view = pVar != null ? pVar.getView() : null;
                if (view instanceof Word) {
                    word2PDFConvertActivity.H2(0, false);
                } else if (view instanceof Presentation) {
                    word2PDFConvertActivity.H2(1, false);
                }
            }
        });
        FrameLayout frameLayout = this.T;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(1));
            LottieAnimationView lottieAnimationView = this.M;
            if (lottieAnimationView != null) {
                lottieAnimationView.setOnClickListener(new u4.g(this, 16));
                View view = this.N;
                if (view != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$initView$4
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
                            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
                            Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                            word2PDFConvertActivity.getClass();
                            tn.a.d(word2PDFConvertActivity, ea.a.p("LG9fdhxydA==", "Q24rPgju"), ea.a.p("Fnc0bxh2V3I8XwVvWnYyckxfMWwgY2s=", "7MfWv2Kf"), androidx.activity.f.m(word2PDFConvertActivity.t2(), "_", ConvertEventCenter.f28653a), false);
                            if (!h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(Word2PDFConvertActivity.this)) {
                                Word2PDFConvertActivity word2PDFConvertActivity2 = Word2PDFConvertActivity.this;
                                word2PDFConvertActivity2.u2().postDelayed(word2PDFConvertActivity2.C0, 500L);
                                Word2PDFConvertActivity.this.f26054z0.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfCVgjRSVOBkwQU2VPK0FwRQ==", "lUwCLwwG"), ea.a.p("MW4sci5pMi44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEEcXxtUDlIXR0U=", "kuPHAVh4")});
                                return;
                            }
                            Word2PDFConvertActivity word2PDFConvertActivity3 = Word2PDFConvertActivity.this;
                            if (word2PDFConvertActivity3.f26035k1) {
                                return;
                            }
                            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                            if (billingConfigImpl.w()) {
                                t0.V().execute(new e0(word2PDFConvertActivity3, 0));
                            } else if (billingConfigImpl.z() && BillingConfigImpl.A()) {
                                word2PDFConvertActivity3.f26046r0 = true;
                                BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
                                String p10 = ea.a.p("OG9DZEtwU2Y=", "zZYJAjAw");
                                aVar2.getClass();
                                BaseSubscriptionActivity.a.a(word2PDFConvertActivity3, p10);
                            } else {
                                t0.V().execute(new e0(word2PDFConvertActivity3, 0));
                                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.d(word2PDFConvertActivity3, null);
                            }
                        }
                    });
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("OG9DZEtQU2YZbyR0FGkGZXI=", "pMYQvni6"));
                    throw null;
                }
            }
            kotlin.jvm.internal.g.i(ea.a.p("LWFSazB2", "kDPITzyQ"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PHBdYQpoZW81dA==", "bUKwxfFE"));
        throw null;
    }

    public final void K2(int i10) {
        boolean z10;
        this.f26048t0 = i10;
        if (i10 <= 1) {
            z10 = true;
        } else {
            AppCompatTextView appCompatTextView = this.f26025d0;
            if (appCompatTextView != null) {
                appCompatTextView.setText(String.valueOf(i10));
                TextView textView = this.Z;
                if (textView != null) {
                    String format = String.format(Locale.ENGLISH, ea.a.p("FmQg", "W8d9SV3I"), Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
                    kotlin.jvm.internal.g.d(format, ea.a.p("CW9AbQx0GWwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "oxo2m19U"));
                    textView.setText(format);
                }
                z10 = false;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("R28_YR9QA2cXVHY=", "29jtSaSc"));
                throw null;
            }
        }
        if (z10) {
            this.N0 = false;
            D2(true);
        } else {
            p2();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar = this.B0;
        if (sVar != null) {
            sVar.C(i10);
        }
    }

    @Override // lib.zj.office.system.i
    public final boolean L() {
        return true;
    }

    @Override // jl.a
    public final void L1() {
        boolean z10;
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.z() && BillingConfigImpl.A() && !billingConfigImpl.w()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ImageView imageView = this.P;
            if (imageView != null) {
                imageView.setVisibility(0);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("OG9DZEtQU2YKciVJdg==", "ojTibRO1"));
                throw null;
            }
        } else {
            ImageView imageView2 = this.P;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("OG9DZEtQU2YKciVJdg==", "jjifJvpi"));
                throw null;
            }
        }
        BillingConfigImpl.x().e(this, new h(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$initViewModel$1
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
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "WEcAcSzh"));
                if (bool.booleanValue()) {
                    LinearLayout linearLayout = Word2PDFConvertActivity.this.f26052x0;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                        linearLayout.setVisibility(8);
                    }
                    ImageView imageView3 = Word2PDFConvertActivity.this.P;
                    if (imageView3 != null) {
                        imageView3.setVisibility(8);
                        Word2PDFConvertActivity activity = Word2PDFConvertActivity.this;
                        gl.o.f17931a.getClass();
                        kotlin.jvm.internal.g.e(activity, "activity");
                        gl.p.f17933p.e(activity);
                        gl.q.f17934p.e(activity);
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("RG85ZEFQBmYicltJdg==", "48vSQv04"));
                    throw null;
                }
            }
        }));
    }

    @Override // lib.zj.office.system.i
    public final void M0(boolean z10) {
        o9.d.s(q1, "setFindBackForwardState false");
    }

    @Override // lib.zj.office.system.i
    public final void N() {
        View view;
        Word word;
        tf.d dVar;
        o9.d.s(q1, ea.a.p("RnAvYQdlNm8dbEdiCHIFdCV0R3M=", "0QdQnjHH"));
        if (!this.f26040n0) {
            lib.zj.office.system.p pVar = this.f26036l0;
            if (pVar != null) {
                view = pVar.getView();
            } else {
                view = null;
            }
            if (view instanceof Word) {
                word = (Word) view;
            } else {
                word = null;
            }
            if (word != null) {
                nl.b bVar = this.f26034k0;
                if (bVar != null) {
                    if (bVar.f22595p <= this.L0 && word.getPageCount() >= bVar.f22595p) {
                        x2();
                        E2();
                    }
                    dVar = tf.d.f30009a;
                } else {
                    dVar = null;
                }
                if (dVar == null) {
                    x2();
                    E2();
                }
                K2(word.getPageCount());
            }
        }
        AppFrame appFrame = this.f26038m0;
        if (appFrame != null) {
            int childCount = appFrame.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                AppFrame appFrame2 = this.f26038m0;
                if (appFrame2 != null) {
                    View childAt = appFrame2.getChildAt(i10);
                    if (childAt instanceof AToolsbar) {
                        ((AToolsbar) childAt).g();
                    }
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("UHA_RkVhBWU=", "Ys1O7hck"));
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.g.i(ea.a.p("FnA-RkphL2U=", "HdwN8Bc9"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final boolean O() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final boolean P0() {
        return false;
    }

    @Override // lib.zj.office.system.i
    public final void S() {
        View view;
        ea.a.p("UGgqbhRlMmEVZQ==", "aUgJKq5l");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        lib.zj.office.system.p pVar = this.f26036l0;
        if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
            AppCompatTextView appCompatTextView = this.f26021a0;
            if (appCompatTextView != null) {
                Word word = (Word) view;
                appCompatTextView.setText(String.valueOf(word.getCurrentPageNumber()));
                this.f26047s0 = word.getCurrentPageNumber();
                TextView textView = this.Y;
                if (textView != null) {
                    String format = String.format(Locale.ENGLISH, ea.a.p("amQg", "yVLKRDy3"), Arrays.copyOf(new Object[]{Integer.valueOf(this.f26047s0)}, 1));
                    kotlin.jvm.internal.g.d(format, ea.a.p("UG87bSl0ZGwnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "1L6IHLKA"));
                    textView.setText(format);
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UHU5chZuFlATZ1FUdg==", "FaLGxAml"));
            throw null;
        }
    }

    @Override // lib.zj.office.system.i
    public final void T(boolean z10) {
        o9.d.s(q1, "fullScreen " + z10);
        t1.b("WPS2PDFPreviewActivity fullScreen " + z10);
    }

    @Override // lib.zj.office.system.i
    public final int V0() {
        return getResources().getDimensionPixelSize(R.dimen.dp_36);
    }

    @Override // lib.zj.office.system.i
    public final Integer Y0() {
        return Integer.valueOf(androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
    }

    @Override // lib.zj.office.system.i
    public final String a1() {
        return ea.a.p("Z1QCLTg=", "sO2D39om");
    }

    @Override // sp.b
    public final void f0(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            F2();
            j1.e(this, getResources().getString(R.string.arg_res_0x7f130136), true, null, -1);
            return;
        }
        kotlin.jvm.internal.g.b(str);
        File file = new File(str);
        dp.a a10 = dp.a.a();
        a10.getClass();
        dp.a.c("convert finish file is: " + str + " size is : " + file.length() + "----pageCount:" + i10);
        if (file.exists()) {
            String A0 = bg.b.A0(file);
            Locale locale = Locale.getDefault();
            String f10 = a6.h.f("VGU_RBZmA3UedBwp", "Facup9Tb", locale, A0, locale);
            kotlin.jvm.internal.g.d(f10, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnZi4Tby5vG2U9Q1BzHChbbzlhJmUp", "CxAlOgbl"));
            if (kotlin.jvm.internal.g.a(f10, ea.a.p("Q2Rm", "4letJCaq"))) {
                b1.Y();
                tn.a.a(ReaderPdfApplication.m(), ea.a.p("C29BZT13NW84XwJvWmU=", "H4h3bAg2"));
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                pdfPreviewEntity.setDate(file.lastModified());
                pdfPreviewEntity.setPath(file.getAbsolutePath());
                pdfPreviewEntity.setSize(file.length());
                pdfPreviewEntity.setName(bg.b.B0(file));
                pdfPreviewEntity.setOtherStrOne(ea.a.p("H0RG", "p2j3mVKi"));
                pdfPreviewEntity.setPage(i10);
                bm.c.b(this).f(ge.a.H(pdfPreviewEntity), new m0(str, this, i10));
                u2().post(new j0(this, 2));
            }
        }
        F2();
        j1.e(this, getResources().getString(R.string.arg_res_0x7f130136), true, null, -1);
        u2().post(new j0(this, 2));
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public final void finish() {
        qo.a aVar = new qo.a();
        aVar.f29391a = this.f26032j0;
        wk.b.b().e(aVar);
        t1.b(ea.a.p("PWVVIAlyWGcoZTlzTyAHZlNpDWVlZgxuOXNo", "4n4iPbeK"));
        u2().removeCallbacksAndMessages(null);
        super.finish();
    }

    @Override // lib.zj.office.system.i
    public final byte getPageListViewMovingPosition() {
        return (byte) 1;
    }

    @Override // lib.zj.office.system.i
    public final void h1(boolean z10) {
        h1(z10);
    }

    @Override // lib.zj.office.system.i
    public final void i() {
        ea.a.p("UGgqbhRlOG8dbQ==", "P50Uw1ym");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        p2();
    }

    public final void init() {
        boolean z10;
        nl.b bVar;
        int i10;
        String str;
        boolean z11 = false;
        rg.c.c = false;
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("AVBiMjtEAlA6ZRBpUXcWY0xpJGk9eRZpGml0", "qoV1kD8A");
        a10.getClass();
        dp.a.c(p10);
        androidx.activity.s.f1866u = getResources().getDisplayMetrics().widthPixels;
        int i11 = getResources().getDisplayMetrics().heightPixels;
        Intent intent = getIntent();
        if (intent != null) {
            String str2 = "";
            if (kotlin.jvm.internal.g.a(intent.getAction(), ea.a.p("Lm5VchZpUy4zbj5lG3RGYVZ0B28rLjNJBlc=", "QbAcCcWr"))) {
                if (getIntent().getBooleanExtra(ea.a.p("UHMEbzVpKWkrYRJpW24=", "Hf9JAO7z"), false)) {
                    String stringExtra = getIntent().getStringExtra(ea.a.p("VWknZSNhFmg=", "vuPc0WzD"));
                    if (stringExtra == null) {
                        stringExtra = "";
                    } else {
                        ea.a.p("H25FZQF0ZmctdDV0Rmk5Z314JnIoKBRmHWwUUDB0KiJfIA46TyIi", "Nmv1oHQB");
                    }
                    this.f26029h0 = stringExtra;
                    this.f26032j0 = new PdfPreviewEntity(new File(this.f26029h0));
                    String str3 = this.f26029h0;
                    if (!TextUtils.isEmpty(str3)) {
                        new Thread(new l.r(26, this, str3)).start();
                    }
                } else {
                    this.f26032j0 = (PdfPreviewEntity) getIntent().getSerializableExtra(ea.a.p("QGgkdyxwBmY=", "IydSYWMr"));
                }
                PdfPreviewEntity pdfPreviewEntity = this.f26032j0;
                if (pdfPreviewEntity != null) {
                    str = pdfPreviewEntity.getPath();
                } else {
                    str = null;
                }
                if (str != null) {
                    ea.a.p("XGYtaRBlJ24GaUB5Vi4mYTBoEj98IGEi", "osnFn0FL");
                    str2 = str;
                }
                this.f26029h0 = str2;
                dp.a a11 = dp.a.a();
                a11.getClass();
                dp.a.c("WPS2PDFPreviewActivity filePath " + this.f26029h0);
            } else {
                String stringExtra2 = intent.getStringExtra(ea.a.p("VWknZSNhFmg=", "yxBuuQaJ"));
                if (stringExtra2 != null) {
                    ea.a.p("WnRlZxZ0MXQAaVpnLHgiciUof2EvbgBvroDRTgBfNEl_RQ9fNUkuRS1QdVQhKXY_fiAQIg==", "LwTrewSL");
                    str2 = stringExtra2;
                }
                this.f26029h0 = str2;
            }
        }
        y2();
        PdfPreviewEntity pdfPreviewEntity2 = this.f26032j0;
        if (pdfPreviewEntity2 != null && (bVar = this.f26034k0) != null && (i10 = bVar.f22593n) != -1) {
            yn.a.h0(this, i10);
            pdfPreviewEntity2.setRecent(1);
            pdfPreviewEntity2.setRecentDate(System.currentTimeMillis());
            pdfPreviewEntity2.setSize(pdfPreviewEntity2.getFile().length());
            bm.c b10 = bm.c.b(this);
            com.google.android.play.core.assetpacks.c.P(bVar, pdfPreviewEntity2);
            b10.i(pdfPreviewEntity2);
        }
        String str4 = this.f26029h0;
        if (str4.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            str4 = null;
        }
        if (str4 != null) {
            File file = new File(this.f26029h0);
            if (file.exists() && file.length() >= 0) {
                z11 = true;
            }
            if (!z11) {
                file = null;
            }
            if (file != null) {
                String name = file.getName();
                kotlin.jvm.internal.g.d(name, ea.a.p("BnQcbhltZQ==", "uAo2xu69"));
                this.f26030i0 = name;
                AppCompatTextView appCompatTextView = this.S;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(name);
                    String str5 = this.f26030i0;
                    ea.a.p("PXRdUhxnUng=", "l8eTgYEn");
                    new Regex("[\\s\\S]*[\\u0600-\\u06ff\\u0750-\\u077f][\\s\\S]*").matches(str5);
                    new WPToolsbar(getApplicationContext(), this.f26036l0);
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("BWlbZRthJGUcdg==", "Tlc7UIl4"));
                    throw null;
                }
            }
            lib.zj.office.system.p pVar = this.f26036l0;
            if (pVar != null) {
                pVar.k(this.f26029h0);
            }
        }
        androidx.activity.s.f1864s = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this);
    }

    public final boolean m2(String str) {
        String str2;
        if (str == null) {
            str2 = ea.a.p("XXUnbA==", "o97nESbw");
        } else {
            str2 = str;
        }
        t1.b("pdfPreview thirdOpen entity= ".concat(str2));
        if (str != null && !TextUtils.isEmpty(str)) {
            if (!aj.b.H(str)) {
                Resources resources = getResources();
                String string = resources.getString(R.string.arg_res_0x7f13004c);
                kotlin.jvm.internal.g.d(string, ea.a.p("PWVCLh5lQ1MuciNuEig6LkZ0HGkrZ0thoYDtciFhEmU9Mm50AHBSXzRvPl8GdRhwWnIaKQ==", "tWdICKDv"));
                String string2 = resources.getString(R.string.arg_res_0x7f13004d);
                kotlin.jvm.internal.g.d(string2, ea.a.p("PWVCLh5lQ1MuciNuEig6LkZ0HGkrZ0thoIDUMhZ0DHAqX19vDV9EdSpwJXIBXwxlRl9fKQ==", "RhcKBrIu"));
                G2(string, string2, resources.getString(R.string.arg_res_0x7f13004e));
                return false;
            }
            return true;
        }
        t1.b(ea.a.p("MWQ-UDtlM2ktd0Z0XGklZHdwN25pcFdyB2U0ciNvcg==", "qCAXIEo4"));
        String string3 = getString(R.string.arg_res_0x7f130391);
        kotlin.jvm.internal.g.d(string3, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdlMV8faRllamVLYy5wB2kNbik=", "Cyu5Vxcq"));
        String string4 = getString(R.string.arg_res_0x7f130390);
        kotlin.jvm.internal.g.d(string4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHIjYSdl1YDeZlFsLF9QbzlyBnAWXxFhWm4GdAlvNGVcKQ==", "7x8IhpSR"));
        G2(string3, string4, null);
        return false;
    }

    @Override // lib.zj.office.system.i
    public final void n0(List<Integer> list) {
        Integer num;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        o9.d.s(q1, "updateViewImages " + num);
    }

    @Override // lib.zj.office.system.i
    public final void n1(int i10) {
        tf.d dVar;
        View view;
        View view2;
        View view3;
        View view4;
        t1.b(ea.a.p("AGZXaRplZWU7ZC9yNGMcaUNpGnllbxVlWkYMbFZGK24mc1kgRCBDci9l", "jkxk4e3B"));
        Context m10 = ReaderPdfApplication.m();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        ig.h<Object> hVar = hVarArr[0];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32401e;
        if (!t0.b0(((Number) aVar.b(hVar)).longValue(), System.currentTimeMillis())) {
            tn.a.a(m10, ea.a.p("UG85ZSx2C2UFX0doBnc=", "OSOF39Cj"));
            aVar.c(hVarArr[0], Long.valueOf(System.currentTimeMillis()));
        }
        q0.t();
        this.K = true;
        wn.c cVar = this.E0;
        cVar.f31396b = true;
        cVar.c = true;
        cVar.c();
        if (!this.F0) {
            wn.b.b();
        }
        o9.d.s(q1, b.a.c("openFileFinish ", i10));
        t1.b("WPS2PDFPreviewActivity openFileFinish " + i10);
        dp.a.a().getClass();
        dp.a.c("WPS2PDFPreviewActivity openFileFinish " + i10);
        y2();
        nl.b bVar = this.f26034k0;
        View view5 = null;
        if (bVar != null) {
            if (bVar.f22595p <= this.L0) {
                lib.zj.office.system.p pVar = this.f26036l0;
                if (pVar != null) {
                    view3 = pVar.getView();
                } else {
                    view3 = null;
                }
                if (view3 instanceof Word) {
                    lib.zj.office.system.p pVar2 = this.f26036l0;
                    if (pVar2 != null) {
                        view4 = pVar2.getView();
                    } else {
                        view4 = null;
                    }
                    kotlin.jvm.internal.g.c(view4, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuKG54bidsDiBHeTtlU2wLYlx6Xi4GZjBpJ2UcdzYuIG8pdCdvPi41b0Fk", "GURbWb5g"));
                    int pageCount = ((Word) view4).getPageCount();
                    int i11 = bVar.f22595p;
                    if (pageCount >= i11 || i11 <= 1) {
                        x2();
                        E2();
                    }
                } else {
                    x2();
                    E2();
                }
            } else {
                x2();
                E2();
            }
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            x2();
            E2();
        }
        if (kotlin.jvm.internal.g.a(ea.a.p("dVIETSxUKkkgRA==", "bBfUGSlQ"), this.J)) {
            u2().postDelayed(new g0(this, 1), 2000L);
        } else {
            this.K0 = !pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(this);
        }
        int k10 = eo.e.k(this);
        ea.a.p("YWE_ZTtlDnAXcg==", "0BtrHuZK");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        eo.e.s(this, k10 + 1);
        lib.zj.office.system.p pVar3 = this.f26036l0;
        if (pVar3 != null && (view = pVar3.getView()) != null) {
            AppFrame appFrame = this.f26038m0;
            if (appFrame != null) {
                appFrame.addView(view, new LinearLayout.LayoutParams(-1, -1));
                if (view instanceof Word) {
                    if (!this.F0) {
                        pdf.pdfreader.viewer.editor.free.utils.p.w(this, ea.a.p("I28DZA==", "quTqbpIs"));
                    }
                    AppCompatTextView appCompatTextView = this.S;
                    if (appCompatTextView != null) {
                        appCompatTextView.setText(this.f26030i0);
                        q2();
                        D2(true);
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("VWknZT1hD2Umdg==", "YsSkGmYx"));
                        throw null;
                    }
                }
                lib.zj.office.system.p pVar4 = this.f26036l0;
                if (pVar4 != null) {
                    view2 = pVar4.getView();
                } else {
                    view2 = null;
                }
                if (view2 instanceof Word) {
                    lib.zj.office.system.p pVar5 = this.f26036l0;
                    if (pVar5 != null) {
                        view5 = pVar5.getView();
                    }
                    kotlin.jvm.internal.g.c(view5, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuH25DbiFsXSBHeTtlU2wLYlx6Xi4GZjBpJ2UcdzYuIG8edBxvOC5mb0Fk", "pnT1RNta"));
                    ((Word) view5).setListener(new g());
                    return;
                }
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("UnA7RgFhD2U=", "ypfmJdES"));
            throw null;
        }
    }

    public final boolean n2(Bundle bundle) {
        Intent intent;
        Uri data;
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) || h1.c() || (intent = getIntent()) == null || (data = intent.getData()) == null) {
            return false;
        }
        String decode = Uri.decode(data.getEncodedPath());
        if (!TextUtils.isEmpty(decode)) {
            kotlin.jvm.internal.g.d(decode, ea.a.p("VWknZSNhFmg=", "JBM1bET5"));
            String packageName = getPackageName();
            kotlin.jvm.internal.g.d(packageName, ea.a.p("Q2EoaxJnB04TbWU=", "EDH0JkCw"));
            if (!kotlin.text.k.O(decode, packageName, false)) {
                ea.a.p("UGguYxhOB2UWUFFyBGklcy1vXCxmbTZzRCBFZTh1NnNHUC5yHmkRcxtvWiAPaSRzdA==", "07IShReT");
                R1(new h5.f(6, this, bundle));
                return true;
            }
        }
        return false;
    }

    public final boolean o2(Bundle bundle) {
        tf.d dVar;
        ea.a.p("XGYtaRBlMnIXdl1lHiAiaC1yVk82ZS0gEmEddF4uLg==", "etp5Psmq");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        ThirdOpenBean thirdOpenBean = (ThirdOpenBean) getIntent().getParcelableExtra(ea.a.p("JGVIXw1oXnI-XzloFHJl", "Ek6uk6Nl"));
        if (thirdOpenBean != null) {
            ThirdOpenParseManager.f28764f.e(this, new c(thirdOpenBean, this, bundle));
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            String string = getString(R.string.arg_res_0x7f130391);
            kotlin.jvm.internal.g.d(string, ea.a.p("I2UMUwVyD24vKDQuR3QlaVZnfHIsYVJlBl8XaT1lHWU8Yx1wBWkJbik=", "HtDxqfzL"));
            String string2 = getString(R.string.arg_res_0x7f130390);
            kotlin.jvm.internal.g.d(string2, ea.a.p("P2UdUzByUG4vKDQuR3QlaVZnfHIsYVJlloDXZjhsJ187bxtyMXBNXythCG5bdAhvSGU8KQ==", "DDXiD9iY"));
            G2(string, string2, null);
            return true;
        }
        return true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        Object obj;
        lib.zj.office.system.j jVar;
        if (((pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f26050v0.getValue()).d()) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            return;
        }
        boolean z10 = true;
        if (this.f26035k1) {
            cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onBackPressed$1
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
                    try {
                        sp.h hVar = Word2PDFConvertActivity.this.f26051w0;
                        if (hVar != null) {
                            hVar.e(true);
                        }
                        Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
                        word2PDFConvertActivity.f26051w0 = null;
                        word2PDFConvertActivity.F2();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            };
            if (this.f26041n1 == null) {
                String string = getResources().getString(R.string.arg_res_0x7f13035a);
                kotlin.jvm.internal.g.d(string, ea.a.p("BGUcbzNyUGU7LgFlQFMjclFuNSgbLkV0BmkfZ39xN2kCXwxvKHZWcjxpCGcp", "QIvoF372"));
                String string2 = getResources().getString(R.string.arg_res_0x7f1304a9);
                kotlin.jvm.internal.g.d(string2, ea.a.p("OWURbwJyEmU7LgFlQFMjclFuNSgbLkV0loDXbjYuMXU5ZT1xAmkFXytvCHZRciNfX3AmKQ==", "ADKbwqMZ"));
                this.f26041n1 = new OperateInterceptDialog(this, string, string2);
            }
            OperateInterceptDialog operateInterceptDialog = this.f26041n1;
            if (operateInterceptDialog == null || operateInterceptDialog.isShowing()) {
                z10 = false;
            }
            if (z10) {
                OperateInterceptDialog operateInterceptDialog2 = this.f26041n1;
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.A = new n0(this, aVar);
                }
                if (operateInterceptDialog2 != null) {
                    operateInterceptDialog2.show();
                }
                pdf.pdfreader.viewer.editor.free.utils.p.m(this, s2());
                return;
            }
            return;
        }
        lib.zj.office.system.p pVar = this.f26036l0;
        lib.zj.office.system.j jVar2 = null;
        if (pVar != null) {
            obj = pVar.w(1358954496);
        } else {
            obj = null;
        }
        if (obj != null && ((Boolean) obj).booleanValue()) {
            T(false);
            lib.zj.office.system.p pVar2 = this.f26036l0;
            if (pVar2 != null) {
                pVar2.r(1358954498, null);
                return;
            }
            return;
        }
        lib.zj.office.system.p pVar3 = this.f26036l0;
        if (pVar3 != null) {
            jVar2 = pVar3.f21056i;
        }
        if (jVar2 != null) {
            if (pVar3 != null && (jVar = pVar3.f21056i) != null) {
                jVar.abortReader();
            }
            this.J0 = true;
        }
        if (this.G0) {
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            r2();
            return;
        }
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.c(this, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onBackPressed$2
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
                Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                word2PDFConvertActivity.r2();
            }
        }, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onBackPressed$3
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
                Word2PDFConvertActivity.this.f26045q0 = true;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x020e, code lost:
        if (n2(r9) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0210, code lost:
        z2(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01db, code lost:
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0200, code lost:
        if (r0 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0202, code lost:
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0208, code lost:
        if (m2(r0) == false) goto L89;
     */
    @Override // pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(final android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity.onCreate(android.os.Bundle):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        pdf.pdfreader.viewer.editor.free.ui.dialog.x xVar;
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar;
        OperatePdfFailedDialog operatePdfFailedDialog;
        j2 j2Var;
        super.onDestroy();
        EngineHelper.f15726a.getClass();
        EngineHelper.e(this.A0);
        androidx.activity.f.q("Y1A4Mj5EdFA6ZRBpUXcWY0xpJGk9eRZvGkQUcyVyLXk=", "7R4kn2yI", dp.a.a());
        j2 j2Var2 = this.D0;
        boolean z13 = false;
        if (j2Var2 != null && j2Var2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (j2Var = this.D0) != null) {
            j2Var.dismiss();
        }
        OperatePdfFailedDialog operatePdfFailedDialog2 = this.f26037l1;
        if (operatePdfFailedDialog2 != null && operatePdfFailedDialog2.isShowing()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (operatePdfFailedDialog = this.f26037l1) != null) {
            operatePdfFailedDialog.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.s sVar2 = this.B0;
        if (sVar2 != null && sVar2.isShowing()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (sVar = this.B0) != null) {
            sVar.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.ui.dialog.x xVar2 = this.f26039m1;
        if (xVar2 != null && xVar2.isShowing()) {
            z13 = true;
        }
        if (z13 && (xVar = this.f26039m1) != null) {
            xVar.dismiss();
        }
        v2().k();
        lib.zj.office.system.p pVar = this.f26036l0;
        if (pVar != null) {
            pVar.dispose();
        }
        try {
            sp.h hVar = this.f26051w0;
            if (hVar != null) {
                hVar.e(true);
            }
            this.f26051w0 = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        t1.b(ea.a.p("ElAEMhhELVA6ZRBpUXcWY0xpJGk9eRZvGlAQdSJl", "CHEWHk4Q"));
        super.onPause();
        androidx.activity.f.q("ZFAYMiNEJFAAZUJpDHcXYzBpRGkyeWNvNFAydQZl", "ZSudE66P", dp.a.a());
        g0 g0Var = this.P0;
        if (g0Var != null) {
            t1.b(ea.a.p("GFBiMilEcVAoZTxpEHcpY0FpGGkxeUVvCFA4dT9lQyA9ZVxvD2UXZD9sK3lVZwduUCAcdStuBGIKZQ==", "cyKwfYLo"));
            u2().removeCallbacks(g0Var);
        }
        this.E0.b();
        gl.o.f17931a.getClass();
        gl.p.f17933p.l();
        gl.q.f17934p.l();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        AppOpenManager.c().f23907g = true;
        super.onResume();
        androidx.activity.s.w0(this);
        v2().l();
        aj.b.j(this, this.f26052x0, ea.a.p("IGZXaRpl", "osNAZxiu"), this.A0);
        aj.b.L();
        if (this.f26045q0) {
            this.f26045q0 = false;
            if (v2().f28242t) {
                Intent intent = new Intent(this, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("B2UcXwZlQF8hbhJlWnQIZFdfPG89aF9uZw==", "H7leh7rx"), true);
                startActivity(intent);
                if (v2().f28242t) {
                    ReaderPdfApplication.k().g(new nl.g(ToolsType.EDIT_PDF, ea.a.p("RG85MgNkZg==", "0iQmba1m")));
                }
                finish();
                return;
            }
            r2();
            return;
        }
        if (this.f26046r0) {
            this.f26046r0 = false;
            if (BillingConfigImpl.c.w()) {
                t0.V().execute(new e0(this, 0));
            }
        }
        dp.a a10 = dp.a.a();
        String p10 = ea.a.p("ZFAYMiNEJFAAZUJpDHcXYzBpRGkyeWNvD1IvcyBtZQ==", "aJU4dN6l");
        a10.getClass();
        dp.a.c(p10);
        q2();
        this.E0.c();
        if (this.K0) {
            this.K0 = !pdf.pdfreader.viewer.editor.free.ads.n.f23972a.b(this);
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        wn.c cVar = this.E0;
        cVar.c = false;
        outState.putLong(ea.a.p("PWVQZC1pWmU=", "JpBGeIAN"), cVar.f31395a);
        outState.putBoolean(ea.a.p("QWUqZApKF20CSFttDE84UiFzR21l", "x40PoYoP"), this.f26045q0);
        outState.putSerializable(ea.a.p("YWU4dR90LmkBdA==", "aIUZWWbC"), this.R);
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        this.f26049u0 = z10;
        ((pdf.pdfreader.viewer.editor.free.feature.bridge.c) this.f26050v0.getValue()).e(z10);
    }

    public final boolean p2() {
        View view;
        boolean z10;
        boolean z11;
        boolean z12;
        lib.zj.office.system.p pVar = this.f26036l0;
        if (pVar == null || (view = pVar.getView()) == null || !(view instanceof Word)) {
            return false;
        }
        Word word = (Word) view;
        float zoom = word.getZoom() * word.f21099g;
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f26042o0;
        if (interceptTouchFrameLayout != null) {
            int height = interceptTouchFrameLayout.getHeight();
            int pageCount = word.getPageCount();
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (zoom >= height && pageCount > 1) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            word.setIsInOneScreen(z11);
            if (!z10) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.N0 = z12;
            D2(true);
            if (z10) {
                return false;
            }
            return true;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "YNrPVETO"));
        throw null;
    }

    @Override // lib.zj.office.system.i
    public final boolean q() {
        return false;
    }

    public final void q2() {
        View view;
        if (!isDestroyed() && !isFinishing() && !this.f19289b) {
            t1.b(ea.a.p("GFBiMilEcVAoZTxpEHcpY0FpGGkxeUVvXyAnaTllO2EiZXZvF2U=", "hOvd1AUu"));
            Handler u22 = u2();
            g0 g0Var = this.P0;
            u22.removeCallbacks(g0Var);
            u2().postDelayed(g0Var, 2000L);
            lib.zj.office.system.p pVar = this.f26036l0;
            if (pVar != null && (view = pVar.getView()) != null && (view instanceof Word)) {
                Word word = (Word) view;
                word.T = false;
                word.d(true, false);
            }
        }
    }

    public final void r2() {
        w0.a().f28790a.execute(new u5.a(7));
        if (kotlin.jvm.internal.g.a(ea.a.p("CVJ-TSZUf0kIRA==", "tyFuEOvY"), this.J)) {
            if (!this.f26024c1) {
                t1.b(ea.a.p("JFArMj5EEVA6ZRBpUXcWY0xpJGk9eRYtWS0FaDhyJi1eLVhmB24-cyAgB2NAaSFpTHl-ICN1W3BUaB5tZQ==", "28sxnWAq"));
                this.f26024c1 = true;
                Intent intent = new Intent(this, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("R2gichdFDHQbdHk=", "Om5H9cZf"), this.f26032j0);
                startActivity(intent);
            }
        } else if (v2().f28242t) {
            v2().n();
            pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2IMG, ea.a.p("OG9DZEtwU2Y=", "xJrLYOYt")));
        }
        finish();
    }

    public final String s2() {
        if (B2()) {
            return ea.a.p("QGgqchZfFTJw", "F1kT02Hm");
        }
        return ea.a.p("RDJw", "PQkjJsta");
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
            lib.zj.office.system.p pVar = this.f26036l0;
            if (pVar != null && (rVar = pVar.f21062o) != null && (c10 = rVar.c()) != null) {
                c10.a(false, e10);
                return true;
            }
            return true;
        }
    }

    public final String t2() {
        String str = this.J;
        if (str != null) {
            switch (str.hashCode()) {
                case -1271564784:
                    if (str.equals(ea.a.p("dVIETSxILU03X2BPJkxT", "i1if5niu"))) {
                        return ea.a.p("XG8uZQ==", "xH4CVgmI");
                    }
                    break;
                case -392488846:
                    if (str.equals(ea.a.p("MVImTStULEkaRA==", "Mowitdr9"))) {
                        return ea.a.p("PGhQcmU=", "Pw8pdmGI");
                    }
                    break;
                case -392274714:
                    if (str.equals(ea.a.p("M1J9TSpUBk8EUw==", "xXu2uIqd"))) {
                        return ea.a.p("R28kbHM=", "U5Cq2wcz");
                    }
                    break;
                case 1465644033:
                    if (str.equals(ea.a.p("dVIETSxMK1MmX3lPO0U=", "wjAXw58C"))) {
                        return ea.a.p("VWknZQ==", "Y8Nol4SD");
                    }
                    break;
            }
        }
        return ea.a.p("J29cZQ==", "OgibDdLp");
    }

    public final Handler u2() {
        return (Handler) this.f26044p0.getValue();
    }

    @Override // lib.zj.office.system.i
    public final void v0(int i10, Throwable th2) {
        String string;
        String string2;
        if (this.J0) {
            t1.b(ea.a.p("ImYlaVplEGUpZANydWMjaU5pJnlpaUVJGmkFaTB0K3YIQSFvS3QQZSlkA3IUPXd0SnU3LGlyU3QBcm4=", "XWmC9Ber"));
        } else if (this.K) {
            t1.b(ea.a.p("AmYcaQxlHWUpZANydWMjaU5pJnlpb0ZlGkYYbDRTN2MuZQlzTz1vdDp1AywUcjJ0TXJu", "geMzoOqv"));
        } else {
            dp.a.a().getClass();
            dp.a.c("WPS2PDFPreviewActivity errorCode " + i10 + " error " + th2);
            if (th2 != null && i10 != 11) {
                dp.a.a().getClass();
                dp.a.e(th2);
            }
            if (!kotlin.jvm.internal.g.a(Looper.myLooper(), Looper.getMainLooper())) {
                ea.a.p("fGYtaRBlMGUTZFFyKGMiaTJpRnlmcDFpFHQnckdvGiBdbz8gGm5CbRNpWiAdaCRlJWQeIDRlN3UIbg==", "zb5hjexc");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                return;
            }
            D2(false);
            t1.c("WPS2PDFPreviewActivity errorCode " + i10 + " error", th2);
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
                            kotlin.jvm.internal.g.d(string, ea.a.p("NmUlbz1yF2U7LgFlQFMjclFuNSgbLkV0loDXLiNlI2Qhcgl1JnMBcDhvFHRRZAhmUWw3KQ==", "srDVHtFZ"));
                            string2 = getResources().getString(R.string.arg_res_0x7f13040b);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("SAprIFMgQiBSIBQgSSB2IGQgV3I0bzFUu4DDZBRmBGxWXy9lACloIFIgFCBJIHYgZCASfQ==", "YeKmpOEa"));
                            break;
                        default:
                            string = getResources().getString(R.string.arg_res_0x7f1303be);
                            kotlin.jvm.internal.g.d(string, ea.a.p("OGUfbxdyLGU7LgFlQFMjclFuNSgbLkV0BmkfZ39yJ2EuZR5fDW8_cyk=", "73JlbONR"));
                            string2 = getResources().getString(R.string.arg_res_0x7f1303a5);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("FQpDIGggcSBoIEYgFCB3IBggJmk9bFNTloDXcyVlL18LchFvOilbIGggRiAUIHcgGCByfQ==", "CxncHQJp"));
                            break;
                    }
                }
                if (i10 == 11) {
                    dp.a a10 = dp.a.a();
                    ThirdParseWrongMineTypeException thirdParseWrongMineTypeException = new ThirdParseWrongMineTypeException(a0.a.h("third parse pdf error, filePath == ", this.f26029h0));
                    a10.getClass();
                    dp.a.e(thirdParseWrongMineTypeException);
                }
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0NmkoZ21yDmFXZTlfHG8Scyk=", "DFCkBaVV"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a4);
                kotlin.jvm.internal.g.d(string2, ea.a.p("NAoRIFkgFyB6IGogVSBIIBUgB2ZlKAByoYD0YT9zCF8qckNvCyk9IHogaiBVIEggFSBOfQ==", "NNEfCRMm"));
            } else {
                string = getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0ImkKZ0JyEWFXZTlfHG8Scyk=", "PdltCaw8"));
                string2 = getResources().getString(R.string.arg_res_0x7f1303a3);
                kotlin.jvm.internal.g.d(string2, ea.a.p("NAoRIFkgFyB6IGogVSBIIBUgC3I3bxdUhYDfYS5rDm0qbV5yACk9IHogaiBVIEggFSBOfQ==", "sB6igyMQ"));
            }
            i3 i3Var = new i3(this, string, string2, null);
            i3Var.setCanceledOnTouchOutside(false);
            i3Var.setCancelable(true);
            i3Var.setOnCancelListener(new f0(this, 0));
            i3Var.show();
            Window window = getWindow();
            if (window != null) {
                ea.a.p("OGlfZBZ3", "MGipGOEj");
                pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
            }
            x2();
        }
    }

    public final OperateExecuteTask v2() {
        return (OperateExecuteTask) this.I.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a.d
    public final void w(boolean z10) {
        if (!z10) {
            r2();
        }
    }

    public final void w2() {
        if (this.O0) {
            this.O0 = false;
            C2();
        }
        ConstraintLayout constraintLayout = this.X;
        if (constraintLayout != null && constraintLayout.getVisibility() != 8) {
            constraintLayout.setAlpha(1.0f);
            constraintLayout.animate().alpha(0.0f).setDuration(100L).setListener(new d(constraintLayout)).start();
        }
    }

    @Override // lib.zj.office.system.i
    public final String x0() {
        String string = getResources().getString(R.string.arg_res_0x7f13036c);
        kotlin.jvm.internal.g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0C2kjZ2VyFWErZUNfGHBHXzRhJ2Up", "AmjtyMKp"));
        return string;
    }

    public final void x2() {
        runOnUiThread(new j0(this, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r5 == false) goto L13;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12, types: [T, java.lang.String] */
    @Override // sp.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(int r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.lang.String r5 = "e"
            kotlin.jvm.internal.g.e(r6, r5)
            r4.F2()
            boolean r5 = r6 instanceof java.io.IOException
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            java.lang.String r5 = r6.getMessage()
            if (r5 == 0) goto L24
            java.lang.String r2 = "fW9rcwNhAWVSbFFmHSA5bmRkV3YvY2U="
            java.lang.String r3 = "aSfGVIwd"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r5 = kotlin.text.k.O(r5, r2, r1)
            if (r5 != r0) goto L24
            r5 = r0
            goto L25
        L24:
            r5 = r1
        L25:
            if (r5 != 0) goto L2d
        L27:
            boolean r5 = r4.A2()
            if (r5 != 0) goto L43
        L2d:
            dp.a r5 = dp.a.a()
            java.lang.String r6 = "RG85ZEFwBmZfLRktRC17LXpvXEMpbjVlOHQockZvIC0eLWYtXi0sb1JzRGEKZXZsIWZGICluY2QvdgRjZQ=="
            java.lang.String r0 = "Jm4Rb5sN"
            java.lang.String r6 = ea.a.p(r6, r0)
            r5.getClass()
            dp.a.c(r6)
            r4.I2()
            return
        L43:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            java.lang.String r2 = "VnI5b3I="
            java.lang.String r3 = "8p2BaNK0"
            java.lang.String r3 = ea.a.p(r2, r3)
            r5.element = r3
            boolean r3 = r6 instanceof java.lang.OutOfMemoryError
            if (r3 == 0) goto L6d
            java.lang.String r6 = "ImVcbwt5"
            java.lang.String r0 = "x3wllLTl"
            java.lang.String r6 = ea.a.p(r6, r0)
            r5.element = r6
            android.content.res.Resources r6 = r4.getResources()
            r0 = 2131952323(0x7f1302c3, float:1.9541086E38)
            java.lang.String r6 = r6.getString(r0)
            goto La4
        L6d:
            java.lang.String r3 = "MJdk7Si0"
            java.lang.String r2 = ea.a.p(r2, r3)
            r5.element = r2
            java.lang.String r6 = r6.getMessage()
            if (r6 == 0) goto L8a
            java.lang.String r2 = "dWknZVNuA20XIEBvBiA6bypn"
            java.lang.String r3 = "geP6SYe1"
            java.lang.String r2 = ea.a.p(r2, r3)
            boolean r6 = kotlin.text.k.O(r6, r2, r1)
            if (r6 != r0) goto L8a
            goto L8b
        L8a:
            r0 = r1
        L8b:
            if (r0 == 0) goto L99
            android.content.res.Resources r6 = r4.getResources()
            r0 = 2131951698(0x7f130052, float:1.9539818E38)
            java.lang.String r6 = r6.getString(r0)
            goto La4
        L99:
            android.content.res.Resources r6 = r4.getResources()
            r0 = 2131952993(0x7f130561, float:1.9542444E38)
            java.lang.String r6 = r6.getString(r0)
        La4:
            java.lang.String r0 = "WmZrKBYgC3NST0F0JmYbZSlvQHkDcjFvsYDuKU0gYiATIGsgUyBCIFJ9PiBJIHYgZCASfQ=="
            java.lang.String r1 = "SHGBIOAY"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.d(r6, r0)
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = r4.f26037l1
            if (r0 != 0) goto Ld8
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog
            pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onConvertFailed$1 r1 = new pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity$onConvertFailed$1
            r1.<init>()
            r0.<init>(r4, r1)
            android.content.res.Resources r1 = r4.getResources()
            r2 = 2131951926(0x7f130136, float:1.954028E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "QWU4bwZyAWUBLlNlHVMici1uVSgULjB0rYDXblIuPGFabC5kLHQNXxFvWnYMciJfI3BGKQ=="
            java.lang.String r3 = "Oq5ZrMDX"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r1, r2)
            r0.H(r1, r6)
            r4.f26037l1 = r0
        Ld8:
            pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog r6 = r4.f26037l1
            if (r6 == 0) goto Ldf
            r6.show()
        Ldf:
            java.lang.String r6 = r4.s2()
            T r5 = r5.element
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "_"
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            pdf.pdfreader.viewer.editor.free.utils.p.k(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity.y0(int, java.lang.Throwable):void");
    }

    public final void y2() {
        PdfPreviewEntity pdfPreviewEntity;
        nl.b bVar;
        if (this.f26034k0 == null && (pdfPreviewEntity = this.f26032j0) != null) {
            if (pdfPreviewEntity != null) {
                bVar = com.google.android.play.core.assetpacks.c.w(pdfPreviewEntity);
            } else {
                bVar = null;
            }
            this.f26034k0 = bVar;
            ea.a.p("PGFHZTp1RXI_bj5QFGdl", "uGNcfscN");
            nl.b bVar2 = this.f26034k0;
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    public final void z2(Bundle bundle) {
        View view;
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
        }
        e.a.f29807a.a();
        ConcurrentHashMap<String, Paint> concurrentHashMap = sg.d.f29801b.f29802a;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        lib.zj.office.system.p pVar = new lib.zj.office.system.p(this);
        this.f26036l0 = pVar;
        pVar.f21055h = new e();
        AppFrame appFrame = new AppFrame(this);
        this.f26038m0 = appFrame;
        appFrame.post(new k0(this, 0));
        lib.zj.office.system.p pVar2 = this.f26036l0;
        if (pVar2 != null) {
            pVar2.f21054g = new f();
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.f26042o0;
        if (interceptTouchFrameLayout != null) {
            AppFrame appFrame2 = this.f26038m0;
            if (appFrame2 != null) {
                interceptTouchFrameLayout.addView(appFrame2);
                if (this.f26052x0 != null && !this.f26043o1 && getResources().getConfiguration().orientation == 1) {
                    this.f26043o1 = true;
                    aj.b.I(this, this.f26052x0, ea.a.p("XGYtaRBl", "NfZrtaxx"));
                }
                if (this.f26040n0) {
                    D2(true);
                    lib.zj.office.system.p pVar3 = this.f26036l0;
                    if (pVar3 != null && (view = pVar3.getView()) != null && (view instanceof Word)) {
                        Word word = (Word) view;
                        word.T = false;
                        word.d(true, false);
                    }
                }
                if (bundle != null) {
                    this.E0.f31395a = bundle.getLong(ea.a.p("AWUlZGBpHWU=", "7ksD4pIQ"));
                }
                androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
                wn.b.a(false, B2());
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("LnBBRgthWmU=", "npRK12EI"));
            throw null;
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVQZBxydG80dCtpG2Vy", "RD6rLMIn"));
        throw null;
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class f implements sg.c {
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

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class l implements OperateExecuteTask.a {
        public l() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void a() {
            lib.zj.office.system.j jVar;
            lib.zj.office.system.j jVar2;
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            lib.zj.office.system.p pVar = word2PDFConvertActivity.f26036l0;
            if (pVar != null) {
                jVar = pVar.f21056i;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                if (pVar != null && (jVar2 = pVar.f21056i) != null) {
                    jVar2.abortReader();
                }
                word2PDFConvertActivity.J0 = true;
            }
            if (word2PDFConvertActivity.G0) {
                pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
            }
            if (!word2PDFConvertActivity.f26024c1) {
                word2PDFConvertActivity.f26024c1 = true;
                Intent intent = new Intent(word2PDFConvertActivity, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfQmRm", "mVL5RWQO"), true);
                if (kotlin.jvm.internal.g.a(ea.a.p("CVJ-TSZUf0kIRA==", "1Egbw31N"), word2PDFConvertActivity.J)) {
                    intent.putExtra(ea.a.p("O2hYch1FWXQzdHk=", "sxVKDVuB"), word2PDFConvertActivity.f26032j0);
                } else if (word2PDFConvertActivity.v2().f28242t) {
                    pdf.pdfreader.viewer.editor.free.ads.n.f23972a.a();
                    ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2IMG, ea.a.p("RG85ZEFwBmY=", "AWM54HLe")));
                }
                word2PDFConvertActivity.startActivity(intent);
                word2PDFConvertActivity.finish();
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void b(PdfPreviewEntity pdfPreviewEntity) {
            String str;
            String str2;
            pdfPreviewEntity.setRecent(1);
            pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
            FileRepository.I(pdfPreviewEntity);
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            bm.c.b(word2PDFConvertActivity).i(pdfPreviewEntity);
            AppViewModel k10 = ReaderPdfApplication.k();
            ToolsType toolsType = ToolsType.EDIT_PDF;
            String path = pdfPreviewEntity.getPath();
            kotlin.jvm.internal.g.d(path, ea.a.p("Vm4_aQd5THATdGg=", "16AfX05q"));
            k10.g(new nl.g(toolsType, path));
            String path2 = pdfPreviewEntity.getPath();
            if (TextUtils.equals(ea.a.p("QGgqcmU=", "dgMYiLaH"), word2PDFConvertActivity.f27001t)) {
                str = "dVIETSxUKkkgRA==";
                str2 = "wOVsI0P9";
            } else {
                str = "dVIETSxBLkw=";
                str2 = "cYbSBoAN";
            }
            pdf.pdfreader.viewer.editor.free.utils.k0.c(word2PDFConvertActivity, path2, pdfPreviewEntity, "", ea.a.p(str, str2));
            word2PDFConvertActivity.finish();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void c() {
            Word2PDFConvertActivity.this.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void d() {
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(word2PDFConvertActivity)) {
                Window window = word2PDFConvertActivity.getWindow();
                if (window != null) {
                    word2PDFConvertActivity.getClass();
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.g(window, 0, word2PDFConvertActivity.F1());
                }
                Window window2 = word2PDFConvertActivity.getWindow();
                if (window2 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.a(window2, !pdf.pdfreader.viewer.editor.free.utils.extension.c.h(word2PDFConvertActivity));
                }
                Window window3 = word2PDFConvertActivity.getWindow();
                if (window3 != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window3, 1280);
                }
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void f(PdfPreviewEntity pdfPreviewEntity) {
            e1.e(Word2PDFConvertActivity.this, pdfPreviewEntity);
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void g() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask.a
        public final void e(PdfPreviewEntity pdfPreviewEntity) {
        }
    }

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class m implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f26067a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Word2PDFConvertActivity f26068b;

        public m(Word2PDFConvertActivity word2PDFConvertActivity, boolean z10) {
            this.f26067a = z10;
            this.f26068b = word2PDFConvertActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f26067a;
            Word2PDFConvertActivity word2PDFConvertActivity = this.f26068b;
            if (z10) {
                h1.i(word2PDFConvertActivity);
            } else {
                word2PDFConvertActivity.f26054z0.a(new String[]{ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfDFg7RTBOckwQU2VPK0FwRQ==", "CYJrIob3"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFJUU0VCdSFEEDX2JUNlJ2R0U=", "jrb8zlbZ")});
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

    /* compiled from: Word2PDFConvertActivity.kt */
    /* loaded from: classes3.dex */
    public static final class g implements Word.h {
        public g() {
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void b(boolean z10) {
            ea.a.p("PmVXZCxyMg==", "QWL6I7OA");
            ea.a.p("XG4YbBpkB3IhY0ZvBWw=", "SGSTYB9y");
            Word2PDFConvertActivity word2PDFConvertActivity = Word2PDFConvertActivity.this;
            if (z10) {
                if (!word2PDFConvertActivity.N0) {
                    ConstraintLayout constraintLayout = word2PDFConvertActivity.X;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    word2PDFConvertActivity.O0 = false;
                    return;
                }
                if (word2PDFConvertActivity.X == null) {
                    try {
                        ViewStub viewStub = word2PDFConvertActivity.W;
                        if (viewStub != null) {
                            View inflate = viewStub.inflate();
                            kotlin.jvm.internal.g.c(inflate, ea.a.p("L3UVbBljC24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA1eQllGWEEZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdyhkHmVNLilvJnMSclVpOXR0YStvPHQ=", "4DAy9jc1"));
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate;
                            word2PDFConvertActivity.X = constraintLayout2;
                            TextView textView = (TextView) constraintLayout2.findViewById(R.id.preview_current_page_number_tv);
                            word2PDFConvertActivity.Y = textView;
                            if (textView != null) {
                                String format = String.format(Locale.ENGLISH, ea.a.p("amQg", "QmieFsXm"), Arrays.copyOf(new Object[]{Integer.valueOf(word2PDFConvertActivity.f26047s0)}, 1));
                                kotlin.jvm.internal.g.d(format, ea.a.p("VW85bRJ0SmwdY1VsDCx2ZityX2EyLGMqIHIrcyk=", "ALaMlQ4j"));
                                textView.setText(format);
                            }
                            TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.preview_total_page_number_tv);
                            word2PDFConvertActivity.Z = textView2;
                            if (word2PDFConvertActivity.f26048t0 > 0 && textView2 != null) {
                                String format2 = String.format(Locale.ENGLISH, ea.a.p("FmQg", "0FPNjQTG"), Arrays.copyOf(new Object[]{Integer.valueOf(word2PDFConvertActivity.f26048t0)}, 1));
                                kotlin.jvm.internal.g.d(format2, ea.a.p("KW8IbSV0Q2wnYwdsUSx3ZldyP2E9LBYqFXIWcyk=", "lKOzDkIq"));
                                textView2.setText(format2);
                            }
                        } else {
                            kotlin.jvm.internal.g.i(ea.a.p("LGVfdBxyZ2E9ZQR1GGINcmNz", "eiVEfUCM"));
                            throw null;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                ConstraintLayout constraintLayout3 = word2PDFConvertActivity.X;
                if (constraintLayout3 != null && constraintLayout3.getVisibility() != 0) {
                    constraintLayout3.setAlpha(1.0f);
                    constraintLayout3.setVisibility(0);
                }
                Handler u22 = word2PDFConvertActivity.u2();
                i0 i0Var = word2PDFConvertActivity.f26031i1;
                u22.removeCallbacks(i0Var);
                word2PDFConvertActivity.u2().postDelayed(i0Var, 200L);
                if (!word2PDFConvertActivity.O0) {
                    word2PDFConvertActivity.O0 = true;
                    word2PDFConvertActivity.C2();
                    return;
                }
                return;
            }
            a aVar = Word2PDFConvertActivity.f26020p1;
            word2PDFConvertActivity.w2();
        }

        @Override // lib.zj.office.wp.control.Word.h
        public final void a(boolean z10) {
        }
    }

    @Override // sp.b
    public final void O0(Float f10) {
    }

    @Override // lib.zj.office.system.i
    public final void c1(byte b10) {
    }
}
