package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import am.i2;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.flexbox.FlexboxLayout;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import jm.c;
import kotlin.Pair;
import kotlin.random.Random;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.pdfeditor.ReaderPDFCore;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.feature.ai.net.AINetManager;
import pdf.pdfreader.viewer.editor.free.feature.ai.typing.c;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$smoothScroller$2;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRecyclerView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIHistoryGuideView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: AIChatActivity.kt */
/* loaded from: classes3.dex */
public final class AIChatActivity extends AISimpleSubscriptionActivity implements AskQuestionView.a, c.a.InterfaceC0260a {
    public TextView A;
    public AIChatRecyclerView B;
    public pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a C;
    public AskQuestionView D;
    public AskQuestionView.c E;
    public AskQuestionView.b F;
    public InterceptTouchFrameLayout G;
    public ImageView H;
    public ImageView I;
    public View J;
    public TextView K;
    public TextView L;
    public FlexboxLayout M;
    public ImageView N;
    public ImageView O;
    public AIHistoryGuideView P;
    public AIStatementDialog R;
    public View S;
    public boolean T;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f24362b0;

    /* renamed from: c0  reason: collision with root package name */
    public AIQuickTag f24363c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f24364d0;

    /* renamed from: h0  reason: collision with root package name */
    public int f24368h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f24369i0;

    /* renamed from: n0  reason: collision with root package name */
    public PopupWindow f24374n0;

    /* renamed from: o0  reason: collision with root package name */
    public ObjectAnimator f24375o0;

    /* renamed from: p0  reason: collision with root package name */
    public sp.h f24376p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f24377q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f24378r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f24379s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f24380t0;

    /* renamed from: u0  reason: collision with root package name */
    public km.a f24381u0;

    /* renamed from: z  reason: collision with root package name */
    public ConstraintLayout f24382z;

    /* renamed from: w0  reason: collision with root package name */
    public static final String f24357w0 = ea.a.p("ckkUUSZJIUstVHVHNksTWQ==", "aInn6MwN");

    /* renamed from: x0  reason: collision with root package name */
    public static final String f24358x0 = ea.a.p("DkluRjBMcl8KQR5IKkstWQ==", "TzQkBxdO");

    /* renamed from: y0  reason: collision with root package name */
    public static final String f24359y0 = ea.a.p("eEkdRnFMA18cWTZFa0sSWQ==", "vY9B8Fzi");

    /* renamed from: z0  reason: collision with root package name */
    public static final String f24360z0 = ea.a.p("DkluRitPel8JTx9SNkU3S3BZ", "UxG1p3OO");

    /* renamed from: v0  reason: collision with root package name */
    public static final a f24356v0 = new a();
    public final String Q = ea.a.p("V2hWdA==", "p247BboZ");
    public final int U = TTAdConstant.MATE_IS_NULL_CODE;
    public final int V = TTAdConstant.AD_ID_IS_NULL_CODE;
    public String W = "";
    public final Handler X = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.b
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            AIChatActivity.a aVar = AIChatActivity.f24356v0;
            String p10 = ea.a.p("R2gic1cw", "V7Tesaq3");
            AIChatActivity aIChatActivity = AIChatActivity.this;
            kotlin.jvm.internal.g.e(aIChatActivity, p10);
            kotlin.jvm.internal.g.e(message, ea.a.p("K3Nn", "RNF91zXN"));
            int i10 = message.what;
            if (i10 == aIChatActivity.U) {
                Object obj = message.obj;
                if (obj instanceof km.a) {
                    kotlin.jvm.internal.g.c(obj, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDm5dbiVsKSBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUTLhVkOXQqch1mOWUWLgRlE3RBcgwuN2lqZFAuB0kAaAB0OW42bw==", "apPEwa8h"));
                    AIChatActivity.E2((km.a) obj, false);
                    return true;
                }
                return true;
            } else if (i10 == aIChatActivity.V && aIChatActivity.f24368h0 == 0) {
                aIChatActivity.z2();
                return true;
            } else {
                return true;
            }
        }
    });
    public String Y = "";

    /* renamed from: a0  reason: collision with root package name */
    public long f24361a0 = -1;

    /* renamed from: e0  reason: collision with root package name */
    public int f24365e0 = 701;

    /* renamed from: f0  reason: collision with root package name */
    public int f24366f0 = OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD;

    /* renamed from: g0  reason: collision with root package name */
    public final p0 f24367g0 = new p0(this, 1);

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashSet f24370j0 = new LinkedHashSet();

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet f24371k0 = new LinkedHashSet();

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet f24372l0 = new LinkedHashSet();

    /* renamed from: m0  reason: collision with root package name */
    public int f24373m0 = -1;

    /* compiled from: AIChatActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, AIQuickTag aIQuickTag, String filePath, int i10, int i11) {
            kotlin.jvm.internal.g.e(filePath, "filePath");
            if (context != null) {
                Intent intent = new Intent(context, AIChatActivity.class);
                intent.putExtra(ea.a.p("ckkUUSZJIUstVHVHNksTWQ==", "5Whxjoan"), aIQuickTag);
                intent.putExtra(ea.a.p("ckkURjpMJ18iQWBINksTWQ==", "5PsRa2qD"), filePath);
                intent.putExtra(ea.a.p("DkluRjBMcl8OWRpFKkstWQ==", "4RXiOQPZ"), i10);
                intent.putExtra(ea.a.p("ckkURiFPL18hT2FSKkUJSwFZ", "194Y3S2y"), i11);
                context.startActivity(intent);
            }
        }
    }

    /* compiled from: AIChatActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements sp.b {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ km.a f24384b;

        public b(km.a aVar) {
            this.f24384b = aVar;
        }

        @Override // sp.b
        public final void D() {
            AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.X.post(new q(aIChatActivity, this.f24384b, 1));
        }

        @Override // sp.b
        public final void O0(Float f10) {
            ea.a.p("YVAhRUFwOnI8ZXI=", "Rg6r9UE1");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }

        @Override // sp.b
        public final void f0(int i10, String str) {
            tf.d dVar;
            ea.a.p("ZFAYRQtwDXIGZXI=", "sRKcamNc");
            String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
            if (str != null) {
                km.a aVar = this.f24384b;
                aVar.f19883m = str;
                File file = new File(str);
                a aVar2 = AIChatActivity.f24356v0;
                AIChatActivity.this.G2(file, aVar);
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                im.a.b(false);
            }
        }

        @Override // sp.b
        public final void y0(int i10, Throwable th2) {
            AIChatActivity.p2(AIChatActivity.this, this.f24384b);
            ea.a.p("HFAGRTpwDXI8ZXI=", "kLKUBbqO");
            ea.a.p("XG4Ibx12B3IGRlVpBWUyOiA=", "Jh0NsfQt");
            String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        }
    }

    /* compiled from: AIChatActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends RecyclerView.r {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void a(int i10, RecyclerView recyclerView) {
            kotlin.jvm.internal.g.e(recyclerView, "recyclerView");
            AIChatActivity aIChatActivity = AIChatActivity.this;
            aIChatActivity.f24368h0 = i10;
            aIChatActivity.X.removeMessages(aIChatActivity.V);
            if (i10 == 0) {
                aIChatActivity.X.sendEmptyMessageDelayed(aIChatActivity.V, 100L);
            }
        }
    }

    /* compiled from: AIChatActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements pdf.pdfreader.viewer.editor.free.feature.ai.widget.g {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.g
        public final void a(boolean z10) {
            int i10;
            ImageView imageView = AIChatActivity.this.N;
            if (imageView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
        }
    }

    /* compiled from: AIChatActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements androidx.lifecycle.x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cg.l f24387a;

        public e(cg.l lVar) {
            ea.a.p("VXUlYwdpDW4=", "Ehg57PIs");
            this.f24387a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final cg.l a() {
            return this.f24387a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f24387a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f24387a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f24387a.invoke(obj);
        }
    }

    public AIChatActivity() {
        kotlin.a.a(new cg.a<AIChatActivity$smoothScroller$2.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$smoothScroller$2

            /* compiled from: AIChatActivity.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.recyclerview.widget.v {
                public a(AIChatActivity aIChatActivity) {
                    super(aIChatActivity);
                }

                @Override // androidx.recyclerview.widget.v
                public final float i(DisplayMetrics displayMetrics) {
                    kotlin.jvm.internal.g.e(displayMetrics, "displayMetrics");
                    return 10.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.v
                public final int k() {
                    return 1;
                }
            }

            {
                super(0);
            }

            @Override // cg.a
            public final a invoke() {
                return new a(AIChatActivity.this);
            }
        });
        this.f24377q0 = true;
        this.f24379s0 = true;
    }

    public static void D2(final AIChatActivity aIChatActivity, km.a info) {
        final km.a aVar;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = aIChatActivity.C;
        if (aVar2 != null) {
            aVar = aVar2.j();
        } else {
            aVar = null;
        }
        lm.f.c.getClass();
        if (lm.f.h() == 0) {
            lm.f.f21775e.c(lm.f.f21774d[0], Integer.valueOf(lm.f.h() + 1));
        }
        AIDataBase aIDataBase = km.e.f19907a;
        cg.l<Long, tf.d> lVar = new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$uploadDb$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                invoke(l10.longValue());
                return tf.d.f30009a;
            }

            public final void invoke(long j10) {
                AIChatActivity.this.f24361a0 = j10;
                km.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.f19874d = j10;
                }
                cg.l<Long, tf.d> lVar2 = r3;
                if (lVar2 != null) {
                    lVar2.invoke(Long.valueOf(j10));
                }
            }
        };
        kotlin.jvm.internal.g.e(info, "info");
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new qb.c1(3, aVar, info, lVar));
    }

    public static void E2(km.a aVar, boolean z10) {
        im.a.b(false);
        ea.a.p("DklwYw1pQWkueR5hZw==", "DIPOR1on");
        ea.a.p("RnAnbxJkJGkeZXJhAGwzZH4gVGEqc2U=", "FcTuVGOS");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        ArrayList arrayList = jm.c.f19315a;
        Boolean bool = Boolean.FALSE;
        c.a.b(bool, bool);
        if (z10) {
            String str2 = aVar.c;
            kotlin.jvm.internal.g.d(str2, ea.a.p("UGgqdDpuBG9caWQ=", "e620BQyd"));
            c.a.d(PglCryptUtils.BASE64_FAILED, str2);
        } else {
            String str3 = aVar.c;
            kotlin.jvm.internal.g.d(str3, ea.a.p("UGgqdDpuBG9caWQ=", "l5g5fMB9"));
            c.a.d(PglCryptUtils.INPUT_INVALID, str3);
            AIEventCenter aIEventCenter = AIEventCenter.f28648a;
            String p10 = ea.a.p("UmkoaBJ0PXUCbFthDV8wYS1s", "sSvKvZ83");
            String p11 = ea.a.p("OnBdbxhk", "U4hftPZv");
            aIEventCenter.getClass();
            AIEventCenter.i(p10, p11);
        }
        km.a aVar2 = aVar.f19886p;
        if (aVar2 != null) {
            aVar2.f19889s = 203;
            c.a.e(aVar2);
        }
        c.a.e(aVar);
    }

    public static void F2(km.a aVar) {
        im.a.b(true);
        im.a.f18554b.j(Boolean.TRUE);
        ea.a.p("DklwYw1pQWkueR5hZw==", "p2R4vbcf");
        ea.a.p("BXAVb1hkBWkkZSpvVWQ-bl86cnQ7dWU=", "8Ipy9C1H");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        ArrayList arrayList = jm.c.f19315a;
        Boolean bool = Boolean.FALSE;
        c.a.b(bool, bool);
        aVar.f19881k = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        c.a.e(aVar);
        km.a aVar2 = aVar.f19886p;
        if (aVar2 != null) {
            aVar2.f19889s = 200;
            c.a.e(aVar2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r4 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0090, code lost:
        if (r4 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        r4.onDestroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
        androidx.activity.s.f1863r = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h2(java.lang.String r4, final km.a r5, final pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity r6) {
        /*
            java.lang.String r0 = "O2hYc10w"
            java.lang.String r1 = "ZswUoiks"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.e(r6, r0)
            java.lang.String r0 = "S2l0"
            java.lang.String r1 = "HZoOu9Ov"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.String r0 = "F2MjYQdJDGZv"
            java.lang.String r1 = "oaKjLVwU"
            java.lang.String r0 = ea.a.p(r0, r1)
            kotlin.jvm.internal.g.e(r5, r0)
            int r0 = r6.f24365e0
            pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$convertAndUploadFile$1$2$1 r1 = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$convertAndUploadFile$1$2$1
            r1.<init>()
            r5 = 701(0x2bd, float:9.82E-43)
            if (r0 != r5) goto L97
            r5 = 0
            androidx.activity.s.f1863r = r5
            r0 = 1
            r2 = 0
            lib.zj.pdfeditor.ReaderPDFCore r3 = new lib.zj.pdfeditor.ReaderPDFCore     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6f java.lang.OutOfMemoryError -> L81
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6f java.lang.OutOfMemoryError -> L81
            androidx.activity.s.f1863r = r3     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6f java.lang.OutOfMemoryError -> L81
            int r4 = r3.countPages()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6f java.lang.OutOfMemoryError -> L81
            if (r4 != 0) goto L40
            r4 = r0
            goto L41
        L40:
            r4 = r2
        L41:
            if (r4 == 0) goto L45
            androidx.activity.s.f1863r = r5     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L6f java.lang.OutOfMemoryError -> L81
        L45:
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L4a
            goto L4b
        L4a:
            r0 = r2
        L4b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r4)
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L95
            goto L92
        L57:
            r4 = move-exception
            lib.zj.pdfeditor.ReaderPDFCore r6 = androidx.activity.s.f1863r
            if (r6 == 0) goto L5d
            goto L5e
        L5d:
            r0 = r2
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r6)
            lib.zj.pdfeditor.ReaderPDFCore r6 = androidx.activity.s.f1863r
            if (r6 == 0) goto L6c
            r6.onDestroy()
        L6c:
            androidx.activity.s.f1863r = r5
            throw r4
        L6f:
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L74
            goto L75
        L74:
            r0 = r2
        L75:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r4)
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L95
            goto L92
        L81:
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L86
            goto L87
        L86:
            r0 = r2
        L87:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r4)
            lib.zj.pdfeditor.ReaderPDFCore r4 = androidx.activity.s.f1863r
            if (r4 == 0) goto L95
        L92:
            r4.onDestroy()
        L95:
            androidx.activity.s.f1863r = r5
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.h2(java.lang.String, km.a, pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i2(final pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.i2(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity, int, int):void");
    }

    public static final void j2(AIChatActivity aIChatActivity, km.a aVar, int i10, CharSequence charSequence) {
        aIChatActivity.getClass();
        im.a.b(false);
        ArrayList arrayList = jm.c.f19315a;
        c.a.b(Boolean.FALSE, Boolean.TRUE);
        ArrayList arrayList2 = aVar.f19893w;
        if (!arrayList2.isEmpty()) {
            ((AIAnswerContent) arrayList2.get(arrayList2.size() - 1)).setEndIndex(i10);
        }
        aIChatActivity.X.postDelayed(new androidx.fragment.app.g(16, aIChatActivity, aVar), 200L);
        aVar.f19894x = TTAdConstant.AD_ID_IS_NULL_CODE;
        ArrayList arrayList3 = aVar.f19893w;
        if (charSequence != null) {
            aVar.b(charSequence);
            if (arrayList3.size() == 2) {
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("LmlSaBh0aHA7Zy9fBmgHdw==", "AlmbJAUg");
                aIEventCenter.getClass();
                AIEventCenter.i(p10, null);
            }
        }
        aVar.f19892v = arrayList3.size();
        c.a.e(aVar);
        s2();
        AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
        String p11 = ea.a.p("LmlSaBh0aHI_cz9sdA==", "PUjspU84");
        aIEventCenter2.getClass();
        AIEventCenter.i(p11, null);
    }

    public static final void k2(AIChatActivity aIChatActivity, km.a aVar) {
        Integer num;
        im.a.b(false);
        ArrayList arrayList = jm.c.f19315a;
        c.a.b(Boolean.FALSE, Boolean.TRUE);
        aVar.f19894x = TTAdConstant.AD_ID_IS_NULL_CODE;
        aVar.f19895y = true;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = aIChatActivity.C;
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.i(aVar));
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
            if (aIChatRecyclerView != null) {
                aIChatRecyclerView.post(new qb.g1(aIChatRecyclerView, intValue, 3));
            }
        }
    }

    public static final void l2(final AIChatActivity aIChatActivity, final km.a aVar, final int i10) {
        boolean z10;
        boolean z11;
        aIChatActivity.getClass();
        boolean z12 = false;
        if (!BillingConfigImpl.c.w() && pdf.pdfreader.viewer.editor.free.utils.q0.k(aIChatActivity) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity, aIChatActivity.getString(R.string.arg_res_0x7f1304e2), true, null, -1);
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && !aIChatActivity.u2()) {
            if (!cl.b.b(aIChatActivity)) {
                pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity, aIChatActivity.getString(R.string.arg_res_0x7f1302c9), true, null, -1);
                return;
            }
            aVar.f19894x = 400;
            aVar.f19895y = false;
            ArrayList arrayList = jm.c.f19315a;
            c.a.b(Boolean.TRUE, Boolean.FALSE);
            pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = aIChatActivity.C;
            if (aVar2 != null) {
                aVar2.i(aVar);
            }
            if (i10 > 0) {
                AIChatRecyclerView aIChatRecyclerView = aIChatActivity.B;
                if (aIChatRecyclerView != null && !aIChatRecyclerView.A0(i10 - 1)) {
                    z12 = true;
                }
                if (z12) {
                    AIChatRecyclerView aIChatRecyclerView2 = aIChatActivity.B;
                    if (aIChatRecyclerView2 != null) {
                        aIChatRecyclerView2.r0(i10 - 1);
                    }
                } else {
                    AIChatRecyclerView aIChatRecyclerView3 = aIChatActivity.B;
                    if (aIChatRecyclerView3 != null) {
                        aIChatRecyclerView3.C0(i10);
                    }
                }
            }
            AINetManager.Companion companion = AINetManager.f24348a;
            String str = aIChatActivity.Y;
            String str2 = aIChatActivity.W;
            String str3 = aVar.f19888r;
            kotlin.jvm.internal.g.d(str3, ea.a.p("PXRcbRZxQ2U7dA9vWkM4bkxlPHQ=", "zeT986hy"));
            int i11 = aVar.f19887q;
            cg.l<jm.d, tf.d> lVar = new cg.l<jm.d, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$answerReload$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(jm.d dVar) {
                    invoke2(dVar);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(final jm.d aiResult) {
                    kotlin.jvm.internal.g.e(aiResult, "aiResult");
                    final AIChatActivity aIChatActivity2 = AIChatActivity.this;
                    Handler handler = aIChatActivity2.X;
                    final km.a aVar3 = aVar;
                    final int i12 = i10;
                    handler.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            tf.d dVar;
                            final int i13 = i12;
                            String p10 = ea.a.p("O2hYc10w", "bRpyONGx");
                            final AIChatActivity aIChatActivity3 = AIChatActivity.this;
                            kotlin.jvm.internal.g.e(aIChatActivity3, p10);
                            String p11 = ea.a.p("F2EiUhZzF2x0", "XnvSpBPC");
                            final jm.d dVar2 = aiResult;
                            kotlin.jvm.internal.g.e(dVar2, p11);
                            String p12 = ea.a.p("F2k_ZW0=", "c5JL2Gdc");
                            final km.a aVar4 = aVar3;
                            kotlin.jvm.internal.g.e(aVar4, p12);
                            ea.a.p("DklwYw1pQWkueR5hZw==", "jLrUKeoj");
                            Objects.toString(im.a.f18554b.d());
                            String str4 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                            if (!AIChatActivity.t2() && !aIChatActivity3.isFinishing()) {
                                if (dVar2.f19317a) {
                                    AIChatActivity.k2(aIChatActivity3, aVar4);
                                    return;
                                }
                                final String str5 = dVar2.f19318b;
                                if (str5 != null) {
                                    AIChatActivity.m2(aIChatActivity3, aVar4.f19890t, aVar4.f19887q);
                                    aIChatActivity3.q2(aVar4, dVar2, null);
                                    ArrayList arrayList2 = jm.c.f19315a;
                                    c.a.a(true, dVar2.f19321f, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$answerReload$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // cg.l
                                        public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                            invoke(bool.booleanValue());
                                            return tf.d.f30009a;
                                        }

                                        public final void invoke(boolean z13) {
                                            ArrayList arrayList3;
                                            km.a aVar5 = km.a.this;
                                            aVar5.B = z13;
                                            AIChatActivity aIChatActivity4 = aIChatActivity3;
                                            aIChatActivity4.X.post(new k(aIChatActivity4, aVar5, 0));
                                            Integer num = dVar2.c;
                                            km.a aVar6 = null;
                                            if (num == null || num.intValue() != 2) {
                                                jf.f fVar = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
                                                String str6 = str5;
                                                final AIChatActivity aIChatActivity5 = aIChatActivity3;
                                                final km.a aVar7 = km.a.this;
                                                final int i14 = i13;
                                                c.b.a(str6, z13, null, new cg.p<Integer, CharSequence, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$answerReload$1$1$1$1.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // cg.p
                                                    public /* bridge */ /* synthetic */ tf.d invoke(Integer num2, CharSequence charSequence) {
                                                        invoke(num2.intValue(), charSequence);
                                                        return tf.d.f30009a;
                                                    }

                                                    public final void invoke(int i15, CharSequence charSequence) {
                                                        ArrayList arrayList4;
                                                        AIChatActivity.j2(AIChatActivity.this, aVar7, i15, charSequence);
                                                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar8 = AIChatActivity.this.C;
                                                        km.a aVar9 = (aVar8 == null || (arrayList4 = aVar8.f24676e) == null) ? null : (km.a) kotlin.collections.m.t0(i14 - 1, arrayList4);
                                                        final AIChatActivity aIChatActivity6 = AIChatActivity.this;
                                                        final km.a aVar10 = aVar7;
                                                        AIChatActivity.o2(aIChatActivity6, aVar9, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.answerReload.1.1.1.1.2.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // cg.l
                                                            public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                                                                invoke(l10.longValue());
                                                                return tf.d.f30009a;
                                                            }

                                                            public final void invoke(long j10) {
                                                                AIChatActivity.D2(AIChatActivity.this, aVar10);
                                                            }
                                                        });
                                                    }
                                                }, 12);
                                            } else {
                                                aIChatActivity3.r2(km.a.this, false);
                                                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar8 = aIChatActivity3.C;
                                                if (aVar8 != null && (arrayList3 = aVar8.f24676e) != null) {
                                                    aVar6 = (km.a) kotlin.collections.m.t0(i13 - 1, arrayList3);
                                                }
                                                final AIChatActivity aIChatActivity6 = aIChatActivity3;
                                                final km.a aVar9 = km.a.this;
                                                AIChatActivity.o2(aIChatActivity6, aVar6, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$answerReload$1$1$1$1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // cg.l
                                                    public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                                                        invoke(l10.longValue());
                                                        return tf.d.f30009a;
                                                    }

                                                    public final void invoke(long j10) {
                                                        AIChatActivity.D2(AIChatActivity.this, aVar9);
                                                    }
                                                });
                                            }
                                            AIChatActivity aIChatActivity7 = aIChatActivity3;
                                            aIChatActivity7.X.post(new l(aIChatActivity7, km.a.this, 0));
                                        }
                                    }, 2);
                                    dVar = tf.d.f30009a;
                                } else {
                                    dVar = null;
                                }
                                if (dVar == null) {
                                    AIChatActivity.k2(aIChatActivity3, aVar4);
                                    if (cl.b.b(aIChatActivity3)) {
                                        pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity3, aIChatActivity3.getString(R.string.arg_res_0x7f130054), true, null, -1);
                                    } else {
                                        pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity3, aIChatActivity3.getString(R.string.arg_res_0x7f1302c9), true, null, -1);
                                    }
                                }
                            }
                        }
                    });
                }
            };
            AIChatActivity$answerReload$2 aIChatActivity$answerReload$2 = new cg.p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$answerReload$2
                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool, String str4) {
                    invoke(bool.booleanValue(), str4);
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z13, String str4) {
                    if (str4 != null) {
                        AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                        String p10 = ea.a.p("LmlSaBh0aHAobydvAWU3ZFpuZQ==", "Pc2DIbJc");
                        aIEventCenter.getClass();
                        AIEventCenter.i(p10, null);
                    }
                }
            };
            companion.getClass();
            AINetManager.Companion.c(aIChatActivity, str, str2, str3, i11, lVar, aIChatActivity$answerReload$2);
        }
    }

    public static final void m2(AIChatActivity aIChatActivity, boolean z10, int i10) {
        String str;
        String str2;
        com.google.android.play.core.assetpacks.b1.Y();
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZhaQ==", "YPZExwDl"));
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("UG85ZSxhC18Wb1pl", "czSAWjzl"));
        AIEventCenter.f28648a.getClass();
        zl.a.c.getClass();
        ig.h<Object>[] hVarArr = zl.a.f32400d;
        ig.h<Object> hVar = hVarArr[5];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar = zl.a.f32406j;
        if (((Number) aVar.b(hVar)).longValue() == 0) {
            aVar.c(hVarArr[5], Long.valueOf(System.currentTimeMillis()));
        }
        ig.h<Object> hVar2 = hVarArr[2];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar2 = zl.a.f32403g;
        if (!pdf.pdfreader.viewer.editor.free.utils.t0.b0(((Number) aVar2.b(hVar2)).longValue(), System.currentTimeMillis())) {
            Pair g10 = AIEventCenter.g(((Number) aVar.b(hVarArr[5])).longValue());
            long longValue = ((Number) g10.component1()).longValue();
            long longValue2 = ((Number) g10.component2()).longValue();
            if (((Boolean) AIEventCenter.c.getValue()).booleanValue()) {
                str = "FWlpdSJlcg==";
                str2 = "mUt6Q7AX";
            } else {
                str = "UmkUdQBlEF8dbGQ=";
                str2 = "Db6U0FGm";
            }
            String p10 = ea.a.p(str, str2);
            AIEventCenter.i(p10, longValue + "_" + longValue2);
            aVar2.c(hVarArr[2], Long.valueOf(System.currentTimeMillis()));
        }
        if (z10) {
            if (i10 != 0) {
                im.b.f18555a.getClass();
                AIQuickTag f10 = im.b.f(aIChatActivity, i10);
                if (f10 != null) {
                    AIEventCenter.d(ea.a.p("NGkFdVdja2QnbmU=", "dXUc94jk"), f10, ea.a.p("J29cZQ==", "1bKb2k6u"));
                    ig.h<Object> hVar3 = hVarArr[7];
                    pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar3 = zl.a.f32408l;
                    if (!((Boolean) aVar3.b(hVar3)).booleanValue()) {
                        AIEventCenter.d(ea.a.p("AmkgdSxjE3U7ZXI=", "wQcFBLqh"), f10, ea.a.p("J29cZQ==", "ERZf1P1Y"));
                        aVar3.c(hVarArr[7], Boolean.TRUE);
                    }
                }
            }
        } else if (i10 != 0) {
            im.b.f18555a.getClass();
            AIQuickTag f11 = im.b.f(aIChatActivity, i10);
            if (f11 != null) {
                String from = aIChatActivity.Q;
                kotlin.jvm.internal.g.e(from, "from");
                AIEventCenter.d(ea.a.p("NGkFdVdja2QnbmU=", "dXUc94jk"), f11, from);
                ig.h<Object> hVar4 = hVarArr[8];
                pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar4 = zl.a.f32409m;
                if (!((Boolean) aVar4.b(hVar4)).booleanValue()) {
                    AIEventCenter.d(ea.a.p("AmkgdSxjE3U7ZXI=", "wQcFBLqh"), f11, from);
                    aVar4.c(hVarArr[8], Boolean.TRUE);
                }
            }
        }
        ig.h<Object> hVar5 = hVarArr[9];
        pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar5 = zl.a.f32410n;
        if (!((Boolean) aVar5.b(hVar5)).booleanValue()) {
            AIEventCenter.i(ea.a.p("LmluYxZuQWUoXz9zEHI=", "kbVBv4Ig"), AIEventCenter.h());
            aVar5.c(hVarArr[9], Boolean.TRUE);
        }
        AIEventCenter.i(ea.a.p("UmkUYxxuFGUAX1BvB2U=", "VG0VXqWX"), AIEventCenter.h());
    }

    public static final km.a n2(AIChatActivity aIChatActivity, km.a aVar) {
        aIChatActivity.getClass();
        km.a aVar2 = new km.a();
        aVar2.f19873b = aIChatActivity.W;
        aVar2.f19885o = aVar.f19885o;
        aVar2.f19887q = aVar.f19887q;
        aVar2.f19884n = aVar.f19884n;
        aVar2.f19888r = aVar.f19888r;
        aVar2.f19875e = 102;
        aVar2.f19891u = 1;
        aVar2.f19894x = 400;
        aVar2.f19895y = false;
        return aVar2;
    }

    public static final void o2(final AIChatActivity aIChatActivity, km.a aVar, final cg.l lVar) {
        final km.a aVar2;
        if (aVar != null) {
            long j10 = aIChatActivity.f24361a0;
            if (j10 == -1) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar3 = aIChatActivity.C;
                if (aVar3 != null) {
                    aVar2 = aVar3.j();
                    AIDataBase aIDataBase = km.e.f19907a;
                    pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new a6.e(5, aVar2, aVar, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$updateOrAddItem2Db$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // cg.l
                        public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                            invoke(l10.longValue());
                            return tf.d.f30009a;
                        }

                        public final void invoke(long j11) {
                            AIChatActivity.this.f24361a0 = j11;
                            km.a aVar4 = aVar2;
                            if (aVar4 != null) {
                                aVar4.f19874d = j11;
                            }
                            cg.l<Long, tf.d> lVar2 = lVar;
                            if (lVar2 != null) {
                                lVar2.invoke(Long.valueOf(j11));
                            }
                        }
                    }));
                    return;
                }
            } else {
                aVar.f19874d = j10;
            }
            aVar2 = null;
            AIDataBase aIDataBase2 = km.e.f19907a;
            pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new a6.e(5, aVar2, aVar, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$updateOrAddItem2Db$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                    invoke(l10.longValue());
                    return tf.d.f30009a;
                }

                public final void invoke(long j11) {
                    AIChatActivity.this.f24361a0 = j11;
                    km.a aVar4 = aVar2;
                    if (aVar4 != null) {
                        aVar4.f19874d = j11;
                    }
                    cg.l<Long, tf.d> lVar2 = lVar;
                    if (lVar2 != null) {
                        lVar2.invoke(Long.valueOf(j11));
                    }
                }
            }));
            return;
        }
        lVar.invoke(Long.valueOf(aIChatActivity.f24361a0));
    }

    public static final void p2(AIChatActivity aIChatActivity, km.a aVar) {
        aIChatActivity.getClass();
        aVar.f19881k = PglCryptUtils.COMPRESS_FAILED;
        ArrayList arrayList = jm.c.f19315a;
        c.a.e(aVar);
        AIEventCenter aIEventCenter = AIEventCenter.f28648a;
        String p10 = ea.a.p("LmlSaBh0aHUqbCVhEV8OYVxs", "bUzjOxbK");
        String p11 = ea.a.p("P2FDcxBuZw==", "UdQyRDep");
        aIEventCenter.getClass();
        AIEventCenter.i(p10, p11);
        km.a aVar2 = aVar.f19886p;
        if (aVar2 != null) {
            aVar2.f19889s = 203;
            c.a.e(aVar2);
        }
        im.a.b(false);
        ea.a.p("BkklYwFpN2k8eTJhZw==", "99GduADj");
        ea.a.p("A3AKbxBkI2kkZTZhRnMycn1yIG87OhZmFWwCZQ==", "FKvfqewt");
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
    }

    public static void s2() {
        c.a.InterfaceC0260a interfaceC0260a;
        ea.a.p("ckkKYwdpFGkGeWBhZw==", "XP8VDPya");
        Objects.toString(im.a.f18554b.d());
        String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
        if (!t2() && (interfaceC0260a = jm.c.f19316b) != null) {
            interfaceC0260a.t0();
        }
    }

    public static boolean t2() {
        return kotlin.jvm.internal.g.a(im.a.f18554b.d(), Boolean.TRUE);
    }

    public final void A2(final km.a aVar) {
        ArrayList arrayList = jm.c.f19315a;
        Boolean bool = Boolean.FALSE;
        c.a.b(bool, bool);
        AINetManager.Companion companion = AINetManager.f24348a;
        String str = this.Y;
        String str2 = this.W;
        String str3 = aVar.f19888r;
        kotlin.jvm.internal.g.d(str3, ea.a.p("GmU3ZCFoI3QBbgBvGnEiZUt0O28nQ1luAGUfdA==", "R7iYbBEY"));
        int i10 = aVar.f19887q;
        cg.p<Boolean, String, tf.d> pVar = new cg.p<Boolean, String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool2, String str4) {
                invoke(bool2.booleanValue(), str4);
                return tf.d.f30009a;
            }

            public final void invoke(boolean z10, final String str4) {
                if (z10) {
                    return;
                }
                if (!TextUtils.isEmpty(str4)) {
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("UmkoaBJ0PXAAb1lvHWUJZCtuZQ==", "vnqOuzSO");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, null);
                    final AIChatActivity aIChatActivity = AIChatActivity.this;
                    Handler handler = aIChatActivity.X;
                    final km.a aVar2 = aVar;
                    handler.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            String p11 = ea.a.p("R2gic1cw", "937cLFaA");
                            final AIChatActivity aIChatActivity2 = aIChatActivity;
                            kotlin.jvm.internal.g.e(aIChatActivity2, p11);
                            String p12 = ea.a.p("a3NUbh1DX2EuSSRmbw==", "6XZguiTi");
                            final km.a aVar3 = aVar2;
                            kotlin.jvm.internal.g.e(aVar3, p12);
                            if (!aIChatActivity2.isFinishing()) {
                                ArrayList arrayList2 = jm.c.f19315a;
                                c.a.b(Boolean.TRUE, Boolean.FALSE);
                                final km.a n22 = AIChatActivity.n2(aIChatActivity2, aVar3);
                                aVar3.f19889s = 202;
                                c.a.c(aVar3);
                                c.a.c(n22);
                                c.a.InterfaceC0260a interfaceC0260a = jm.c.f19316b;
                                if (interfaceC0260a != null) {
                                    interfaceC0260a.X(aVar3, n22);
                                }
                                AINetManager.Companion companion2 = AINetManager.f24348a;
                                String str5 = str4;
                                kotlin.jvm.internal.g.b(str5);
                                cg.l<jm.d, tf.d> lVar = new cg.l<jm.d, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(jm.d dVar) {
                                        invoke2(dVar);
                                        return tf.d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2(final jm.d aiResult) {
                                        kotlin.jvm.internal.g.e(aiResult, "aiResult");
                                        final AIChatActivity aIChatActivity3 = AIChatActivity.this;
                                        Handler handler2 = aIChatActivity3.X;
                                        final km.a aVar4 = n22;
                                        final km.a aVar5 = aVar3;
                                        handler2.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.s
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                tf.d dVar;
                                                String p13 = ea.a.p("O2hYc10w", "VkeyyCIN");
                                                final AIChatActivity aIChatActivity4 = AIChatActivity.this;
                                                kotlin.jvm.internal.g.e(aIChatActivity4, p13);
                                                String p14 = ea.a.p("F2EiUhZzF2x0", "ENH5llBp");
                                                final jm.d dVar2 = aiResult;
                                                kotlin.jvm.internal.g.e(dVar2, p14);
                                                String p15 = ea.a.p("a2Ffcw5lRUMyYT5JG2Zv", "1wbomobP");
                                                final km.a aVar6 = aVar4;
                                                kotlin.jvm.internal.g.e(aVar6, p15);
                                                String p16 = ea.a.p("a3NUbh1DX2EuSSRmbw==", "stRmdLx4");
                                                final km.a aVar7 = aVar5;
                                                kotlin.jvm.internal.g.e(aVar7, p16);
                                                ea.a.p("ckkKYwdpFGkGeWBhZw==", "i5eAsfea");
                                                Objects.toString(im.a.f18554b.d());
                                                String str6 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                                                if (!AIChatActivity.t2() && !aIChatActivity4.isFinishing()) {
                                                    if (dVar2.f19317a) {
                                                        im.a.b(false);
                                                        AIChatActivity.s2();
                                                        ArrayList arrayList3 = jm.c.f19315a;
                                                        c.a.b(Boolean.FALSE, Boolean.TRUE);
                                                        jm.c.f19315a.remove(aVar6);
                                                        c.a.InterfaceC0260a interfaceC0260a2 = jm.c.f19316b;
                                                        if (interfaceC0260a2 != null) {
                                                            interfaceC0260a2.W0(aVar6);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    final String str7 = dVar2.f19318b;
                                                    if (str7 != null) {
                                                        AIChatActivity.m2(aIChatActivity4, aVar7.f19890t, aVar7.f19887q);
                                                        aIChatActivity4.q2(aVar6, dVar2, null);
                                                        ArrayList arrayList4 = jm.c.f19315a;
                                                        c.a.a(true, dVar2.f19321f, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$1$1$1$1$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // cg.l
                                                            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool2) {
                                                                invoke(bool2.booleanValue());
                                                                return tf.d.f30009a;
                                                            }

                                                            public final void invoke(boolean z11) {
                                                                final km.a aVar8 = km.a.this;
                                                                aVar8.B = z11;
                                                                final km.a aVar9 = aVar7;
                                                                aVar9.B = z11;
                                                                aVar8.f19895y = false;
                                                                final AIChatActivity aIChatActivity5 = aIChatActivity4;
                                                                aIChatActivity5.X.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.t
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        String p17 = ea.a.p("O2hYc10w", "JXO2P8X8");
                                                                        AIChatActivity aIChatActivity6 = AIChatActivity.this;
                                                                        kotlin.jvm.internal.g.e(aIChatActivity6, p17);
                                                                        String p18 = ea.a.p("F2ElcwRlEEMaYUBJB2Zv", "jhv0YZgX");
                                                                        km.a aVar10 = aVar8;
                                                                        kotlin.jvm.internal.g.e(aVar10, p18);
                                                                        String p19 = ea.a.p("F3MubhdDCmEGSVpmbw==", "GXg1Sont");
                                                                        km.a aVar11 = aVar9;
                                                                        kotlin.jvm.internal.g.e(aVar11, p19);
                                                                        if (!aIChatActivity6.isFinishing()) {
                                                                            ArrayList arrayList5 = jm.c.f19315a;
                                                                            Boolean bool2 = Boolean.TRUE;
                                                                            c.a.b(bool2, bool2);
                                                                            c.a.c(aVar10);
                                                                            c.a.c(aVar11);
                                                                            c.a.InterfaceC0260a interfaceC0260a3 = jm.c.f19316b;
                                                                            if (interfaceC0260a3 != null) {
                                                                                interfaceC0260a3.I();
                                                                            }
                                                                            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                                                                            AppCoreFilterEvent.g(ea.a.p("UmkUZBxuZQ==", "aLLehgBj"));
                                                                        }
                                                                    }
                                                                });
                                                                Integer num = dVar2.c;
                                                                if (num == null || num.intValue() != 2) {
                                                                    jf.f fVar = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
                                                                    String str8 = str7;
                                                                    final AIChatActivity aIChatActivity6 = aIChatActivity4;
                                                                    final km.a aVar10 = aVar7;
                                                                    final km.a aVar11 = km.a.this;
                                                                    c.b.a(str8, z11, null, new cg.p<Integer, CharSequence, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$1$1$1$1$1.2
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(2);
                                                                        }

                                                                        @Override // cg.p
                                                                        public /* bridge */ /* synthetic */ tf.d invoke(Integer num2, CharSequence charSequence) {
                                                                            invoke(num2.intValue(), charSequence);
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        public final void invoke(int i11, CharSequence charSequence) {
                                                                            final AIChatActivity aIChatActivity7 = AIChatActivity.this;
                                                                            km.a aVar12 = aVar10;
                                                                            final km.a aVar13 = aVar11;
                                                                            AIChatActivity.o2(aIChatActivity7, aVar12, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.requestSendMsg.1.1.1.1.1.1.2.1
                                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                                {
                                                                                    super(1);
                                                                                }

                                                                                @Override // cg.l
                                                                                public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                                                                                    invoke(l10.longValue());
                                                                                    return tf.d.f30009a;
                                                                                }

                                                                                public final void invoke(long j10) {
                                                                                    AIChatActivity.D2(AIChatActivity.this, aVar13);
                                                                                }
                                                                            });
                                                                            AIChatActivity.j2(AIChatActivity.this, aVar11, i11, charSequence);
                                                                        }
                                                                    }, 12);
                                                                } else {
                                                                    aIChatActivity4.r2(km.a.this, false);
                                                                    final AIChatActivity aIChatActivity7 = aIChatActivity4;
                                                                    km.a aVar12 = aVar7;
                                                                    final km.a aVar13 = km.a.this;
                                                                    AIChatActivity.o2(aIChatActivity7, aVar12, new cg.l<Long, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$1$1$1$1$1.3
                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        {
                                                                            super(1);
                                                                        }

                                                                        @Override // cg.l
                                                                        public /* bridge */ /* synthetic */ tf.d invoke(Long l10) {
                                                                            invoke(l10.longValue());
                                                                            return tf.d.f30009a;
                                                                        }

                                                                        public final void invoke(long j10) {
                                                                            AIChatActivity.D2(AIChatActivity.this, aVar13);
                                                                        }
                                                                    });
                                                                }
                                                                AIChatActivity aIChatActivity8 = aIChatActivity4;
                                                                aIChatActivity8.X.post(new n(aIChatActivity8, km.a.this, 1));
                                                            }
                                                        }, 2);
                                                        dVar = tf.d.f30009a;
                                                    } else {
                                                        dVar = null;
                                                    }
                                                    if (dVar == null) {
                                                        im.a.b(false);
                                                        ArrayList arrayList5 = jm.c.f19315a;
                                                        c.a.a(false, null, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$requestSendMsg$1$1$1$1$2$1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // cg.l
                                                            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool2) {
                                                                invoke(bool2.booleanValue());
                                                                return tf.d.f30009a;
                                                            }

                                                            public final void invoke(boolean z11) {
                                                                km.a aVar8 = km.a.this;
                                                                aVar8.B = z11;
                                                                AIChatActivity aIChatActivity5 = aIChatActivity4;
                                                                aIChatActivity5.X.post(new k(aIChatActivity5, aVar8, 1));
                                                                AIChatActivity.D2(aIChatActivity4, km.a.this);
                                                            }
                                                        }, 5);
                                                        c.a.b(Boolean.FALSE, Boolean.TRUE);
                                                        jm.c.f19315a.remove(aVar6);
                                                        c.a.InterfaceC0260a interfaceC0260a3 = jm.c.f19316b;
                                                        if (interfaceC0260a3 != null) {
                                                            interfaceC0260a3.W0(aVar6);
                                                        }
                                                        aVar7.f19889s = 201;
                                                        c.a.c(aVar7);
                                                        c.a.InterfaceC0260a interfaceC0260a4 = jm.c.f19316b;
                                                        if (interfaceC0260a4 != null) {
                                                            interfaceC0260a4.g1(aVar7);
                                                        }
                                                    }
                                                }
                                            }
                                        });
                                    }
                                };
                                companion2.getClass();
                                AINetManager.Companion.b(aIChatActivity2, str5, false, lVar);
                            }
                        }
                    });
                    return;
                }
                im.a.b(true);
                AIChatActivity aIChatActivity2 = AIChatActivity.this;
                aIChatActivity2.X.postDelayed(new q(aIChatActivity2, aVar, 0), 200L);
            }
        };
        companion.getClass();
        AINetManager.Companion.d(this, str, str2, str3, i10, pVar);
    }

    public final void B2() {
        EditText editContentView;
        this.f24370j0.clear();
        this.f24371k0.clear();
        this.f24372l0.clear();
        this.f24377q0 = true;
        this.f24361a0 = -1L;
        this.X.removeCallbacksAndMessages(null);
        AINetManager.f24348a.getClass();
        AtomicReference<okhttp3.e> atomicReference = sb.d.f29778a;
        okhttp3.e andSet = sb.d.f29778a.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        im.a.b(false);
        AINetManager.f24349b.removeCallbacksAndMessages(null);
        ArrayList arrayList = jm.c.f19315a;
        Boolean bool = Boolean.FALSE;
        c.a.b(bool, bool);
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null && (editContentView = askQuestionView.getEditContentView()) != null) {
            editContentView.setText("");
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24355e = null;
        kotlinx.coroutines.y0 y0Var = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24353b;
        if (y0Var != null) {
            y0Var.b(null);
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.c = null;
        im.a.b(false);
        im.a.f18554b.j(bool);
        im.a.c = false;
        try {
            sp.h hVar = this.f24376p0;
            if (hVar != null) {
                hVar.e(false);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.f24376p0 = null;
        this.Y = "";
        this.Z = 0;
    }

    @Override // jl.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void C1() {
        EditText editContentView;
        this.S = findViewById(R.id.view_overlay);
        this.f24382z = (ConstraintLayout) findViewById(R.id.ai_chat_cl_root);
        this.A = (TextView) findViewById(R.id.ai_chat_tv_online);
        this.B = (AIChatRecyclerView) findViewById(R.id.ai_chat_rv);
        Space space = (Space) findViewById(R.id.top_space);
        this.D = (AskQuestionView) findViewById(R.id.ai_chat_ask_question_view);
        this.G = (InterceptTouchFrameLayout) findViewById(R.id.ai_chat_fl_rv_container);
        this.H = (ImageView) findViewById(R.id.ai_chat_iv_tips);
        this.I = (ImageView) findViewById(R.id.ai_chat_iv_history);
        this.J = findViewById(R.id.ai_chat_v_history_bg);
        this.K = (TextView) findViewById(R.id.ai_chat_tv_free_msg);
        this.L = (TextView) findViewById(R.id.ai_chat_tv_get_vip);
        this.M = (FlexboxLayout) findViewById(R.id.ai_chat_fbl_free_msg_container);
        this.N = (ImageView) findViewById(R.id.ai_chat_iv_down_bottom);
        this.O = (ImageView) findViewById(R.id.iv_top_round_bg);
        AIHistoryGuideView aIHistoryGuideView = (AIHistoryGuideView) findViewById(R.id.ai_history_guide_view);
        this.P = aIHistoryGuideView;
        if (aIHistoryGuideView != null) {
            aIHistoryGuideView.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.c(this, 0));
        }
        ((ImageView) findViewById(R.id.ai_chat_iv_back)).setOnClickListener(new qb.j0(this, 1));
        View view = this.S;
        if (view != null) {
            view.setOnClickListener(new f5.d(this, 2));
        }
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            ImageView imageView = this.O;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.bg_dark_subscription);
            }
        } else {
            ImageView imageView2 = this.O;
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.bg_ai_page);
            }
        }
        AIChatRecyclerView aIChatRecyclerView = this.B;
        if (aIChatRecyclerView != null) {
            aIChatRecyclerView.s(new c());
        }
        TextView textView = this.L;
        if (textView != null) {
            textView.setText(e.a.a(this, textView));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$findView$5$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view2) {
                    invoke2(view2);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View view2) {
                    kotlin.jvm.internal.g.e(view2, "view");
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    aIChatActivity.T = true;
                    aIChatActivity.f24380t0 = 1;
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("LmlSaBh0aGc_dDxpBV8LbFxjaw==", "ptXOCYy3");
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, null);
                    BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                    Context context = view2.getContext();
                    String i10 = a0.a.i("OWlUd1djWG4uZTJ0", "xFmxsIYN", context, "Fmg7dDE=", "jGuZXUc9");
                    String p11 = ea.a.p("UGgqdA==", "QySDudAM");
                    aVar.getClass();
                    BaseSubscriptionActivity.a.b(context, i10, p11, null);
                }
            });
        }
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null) {
            askQuestionView.setOnAskQuestionClickListener(this);
        }
        InterceptTouchFrameLayout interceptTouchFrameLayout = this.G;
        if (interceptTouchFrameLayout != null) {
            interceptTouchFrameLayout.setTopTouchListener(new ro.d() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.d
                @Override // ro.d
                public final void g(MotionEvent motionEvent) {
                    AIChatActivity.a aVar = AIChatActivity.f24356v0;
                    String p10 = ea.a.p("AWgic2kw", "v7uKMdtB");
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    kotlin.jvm.internal.g.e(aIChatActivity, p10);
                    aIChatActivity.X.postDelayed(aIChatActivity.f24367g0, 200L);
                }
            });
        }
        ImageView imageView3 = this.N;
        if (imageView3 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$findView$7
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
                    AIChatRecyclerView aIChatRecyclerView2 = AIChatActivity.this.B;
                    if (aIChatRecyclerView2 != null) {
                        aIChatRecyclerView2.D0();
                    }
                }
            });
        }
        ImageView imageView4 = this.H;
        if (imageView4 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$findView$8
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
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("LmlSbBhpWl85bCNjaw==", "gslUzW8A");
                    String str = AIChatActivity.this.Q;
                    aIEventCenter.getClass();
                    AIEventCenter.i(p10, str);
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    AIChatActivity aIChatActivity2 = AIChatActivity.this;
                    int i10 = aIChatActivity2.f24366f0;
                    aIChatActivity.R = new AIStatementDialog(aIChatActivity2);
                    AIStatementDialog aIStatementDialog = AIChatActivity.this.R;
                    if (aIStatementDialog != null) {
                        aIStatementDialog.show();
                    }
                }
            });
        }
        ImageView imageView5 = this.I;
        if (imageView5 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$findView$9
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
                    AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                    String p10 = ea.a.p("UGgqdAdvcA==", "IEeDbZ25");
                    aIEventCenter.getClass();
                    AIEventCenter.f(p10);
                    int i10 = AIHistoryActivity.A;
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    if (aIChatActivity != null) {
                        aIChatActivity.startActivity(new Intent(aIChatActivity, AIHistoryActivity.class));
                    }
                }
            });
        }
        AskQuestionView askQuestionView2 = this.D;
        if (askQuestionView2 != null && (editContentView = askQuestionView2.getEditContentView()) != null) {
            editContentView.setOnTouchListener(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.e(this, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
        if (r7.f24377q0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
        if (r7.f24377q0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        r2 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C2(java.lang.String r8, int r9, java.lang.Boolean r10) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.C2(java.lang.String, int, java.lang.Boolean):void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.a
    public final void D0(AskQuestionView.e eVar) {
        this.F = eVar;
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_ai_chat;
    }

    public final void G2(File file, final km.a aVar) {
        im.a.b(true);
        AINetManager.Companion companion = AINetManager.f24348a;
        String str = this.Y;
        cg.p<Boolean, Boolean, tf.d> pVar = new cg.p<Boolean, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$uploadPdfFile$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void invoke(final boolean z10, final boolean z11) {
                im.a.b(false);
                final AIChatActivity aIChatActivity = AIChatActivity.this;
                Handler handler = aIChatActivity.X;
                final km.a aVar2 = aVar;
                handler.post(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        String p10 = ea.a.p("N2hac2Aw", "6mC3Dxx9");
                        AIChatActivity aIChatActivity2 = AIChatActivity.this;
                        kotlin.jvm.internal.g.e(aIChatActivity2, p10);
                        String p11 = ea.a.p("F2MjYQdJDGZv", "o5Hbe2y0");
                        km.a aVar3 = aVar2;
                        kotlin.jvm.internal.g.e(aVar3, p11);
                        if (!aIChatActivity2.isFinishing()) {
                            if (z10) {
                                ea.a.p("KEktYwNpPmk8eTJhZw==", "ziilwHXM");
                                ea.a.p("OnBdbxhkcWk2ZRl1FmMNc0Y6TmYkbBZl", "UyOMzMzb");
                                String str2 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                                androidx.lifecycle.w<Boolean> wVar = im.a.f18554b;
                                Boolean bool = Boolean.FALSE;
                                wVar.j(bool);
                                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                                String p12 = ea.a.p("LmlSaBh0aHUqbCVhEV8bdVZjC3Nz", "iNcO1LEk");
                                aIEventCenter.getClass();
                                tf.d dVar = null;
                                AIEventCenter.i(p12, null);
                                aVar3.f19881k = PglCryptUtils.LOAD_SO_FAILED;
                                aVar3.f19884n = System.currentTimeMillis();
                                ArrayList arrayList = jm.c.f19315a;
                                c.a.e(aVar3);
                                km.a aVar4 = aVar3.f19886p;
                                if (aVar4 != null) {
                                    aIChatActivity2.A2(aVar4);
                                    dVar = tf.d.f30009a;
                                }
                                if (dVar == null) {
                                    AIChatActivity.s2();
                                    c.a.b(bool, Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                            AIChatActivity.E2(aVar3, z11);
                        }
                    }
                });
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool, Boolean bool2) {
                invoke(bool.booleanValue(), bool2.booleanValue());
                return tf.d.f30009a;
            }
        };
        companion.getClass();
        AINetManager.Companion.e(this, file, str, pVar);
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void H() {
        FlexboxLayout flexboxLayout = this.M;
        if (flexboxLayout != null) {
            flexboxLayout.setVisibility(8);
        }
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null) {
            askQuestionView.setVisibility(0);
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void I() {
        AIChatRecyclerView aIChatRecyclerView = this.B;
        if (aIChatRecyclerView != null) {
            aIChatRecyclerView.B0();
        }
    }

    @Override // jl.a
    public final void K1() {
        AIQuickTag aIQuickTag;
        String p10;
        boolean z10;
        int i10;
        km.a j10;
        boolean z11;
        EditText editContentView;
        String str;
        boolean z12;
        ImageView imageView;
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null) {
            askQuestionView.setEditTextChangedListener(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$1
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
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    AIChatActivity.a aVar = AIChatActivity.f24356v0;
                    aIChatActivity.x2();
                }
            });
        }
        jm.c.f19316b = this;
        Object obj = null;
        if (jm.c.f19315a.isEmpty()) {
            String E = com.google.android.play.core.assetpacks.c.E(UUID.randomUUID().toString() + System.currentTimeMillis());
            kotlin.jvm.internal.g.d(E, ea.a.p("AkQEVQ1pW3NyKWRnEHQlRAAoAm8ibyk=", "NkXnjZ2N"));
            this.W = E;
            if (ReaderDebugActivity.f27838q) {
                lm.f.c.getClass();
                Boolean bool = Boolean.TRUE;
                lm.f.f21776f = bool;
                lm.f.f21777g.c(lm.f.f21774d[1], bool);
            }
            if (ReaderDebugActivity.f27839r) {
                lm.f.c.getClass();
                lm.f.f21775e.c(lm.f.f21774d[0], 1);
            }
            B2();
            lm.f.c.getClass();
            if (lm.f.h() == 1 && (imageView = this.I) != null) {
                imageView.post(new i(this, 1));
            }
            c.a.a(false, null, null, 14);
        } else if (BillingConfigImpl.c.w()) {
            H();
        } else if (jm.c.c) {
            u0();
        } else {
            int k10 = pdf.pdfreader.viewer.editor.free.utils.q0.k(this);
            if (k10 < 0) {
                k10 = 0;
            }
            m1(k10);
        }
        im.a.f18554b.e(this, new e(new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$2
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool2) {
                invoke2(bool2);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool2) {
                AskQuestionView askQuestionView2 = AIChatActivity.this.D;
                View ivUploadView = askQuestionView2 != null ? askQuestionView2.getIvUploadView() : null;
                if (ivUploadView == null) {
                    return;
                }
                ivUploadView.setEnabled(!bool2.booleanValue());
            }
        }));
        Serializable serializableExtra = getIntent().getSerializableExtra(f24357w0);
        if (serializableExtra instanceof AIQuickTag) {
            aIQuickTag = (AIQuickTag) serializableExtra;
        } else {
            aIQuickTag = null;
        }
        this.f24363c0 = aIQuickTag;
        this.f24364d0 = getIntent().getStringExtra(f24358x0);
        this.f24365e0 = getIntent().getIntExtra(f24359y0, 701);
        int intExtra = getIntent().getIntExtra(f24360z0, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        this.f24366f0 = intExtra;
        switch (intExtra) {
            case OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD /* 600 */:
                p10 = ea.a.p("J29cZQ==", "fV8FTxy6");
                break;
            case 601:
                p10 = ea.a.p("RWkudx5vEGU=", "5Z8em0t3");
                break;
            case 602:
                p10 = ea.a.p("H2kvdw==", "VPiJxdHJ");
                break;
            case 603:
                p10 = ea.a.p("I2lCdBRvRWU=", "kB1kCOA2");
                break;
            default:
                p10 = null;
                break;
        }
        AIEventCenter aIEventCenter = AIEventCenter.f28648a;
        String p11 = ea.a.p("UmkoaBJ0PXMab3c=", "ahGFQx1a");
        String p12 = ea.a.p("O29FYWw=", "Fb6ll3uu");
        aIEventCenter.getClass();
        AIEventCenter.i(p11, p12);
        if (p10 != null) {
            AIEventCenter.i(ea.a.p("CGkMaBN0CXMgb3c=", "76iorV17"), p10);
        }
        if (TextUtils.isEmpty(this.Y) && this.f24364d0 != null) {
            if (!TextUtils.isEmpty(com.google.android.play.core.assetpacks.b1.f13192p)) {
                str = com.google.android.play.core.assetpacks.b1.f13192p;
            } else {
                sb.c.c.getClass();
                String str2 = (String) sb.c.f29777e.b(sb.c.f29776d[0]);
                com.google.android.play.core.assetpacks.b1.f13192p = str2;
                if (TextUtils.isEmpty(str2)) {
                    String uuid = UUID.randomUUID().toString();
                    kotlin.jvm.internal.g.d(uuid, "randomUUID().toString()");
                    com.google.android.play.core.assetpacks.b1.f13192p = uuid;
                }
                str = com.google.android.play.core.assetpacks.b1.f13192p;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String p13 = ea.a.p("DkImRHNGC0gBSi1MeU4YUGlSAVQcVmFYLVoQYjJkJ2YoaAxqXWwhbidwF3JHdCJ2T3grenkxBDNANUc3aTk=", "4mOe6Lf9");
            ArrayList arrayList = new ArrayList(6);
            for (int i11 = 0; i11 < 6; i11++) {
                Random.Default random = Random.Default;
                kotlin.jvm.internal.g.e(random, "random");
                if (p13.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    arrayList.add(Character.valueOf(p13.charAt(random.nextInt(p13.length()))));
                } else {
                    throw new NoSuchElementException("Char sequence is empty.");
                }
            }
            this.Y = "upload/" + str + PackagingURIHelper.FORWARD_SLASH_STRING + currentTimeMillis + "_" + kotlin.collections.m.w0(arrayList, "", null, null, null, 62) + "_" + com.google.android.play.core.assetpacks.c.E(pdf.pdfreader.viewer.editor.free.utils.v.p(this.f24364d0));
        }
        this.C = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a();
        androidx.recyclerview.widget.h hVar = new androidx.recyclerview.widget.h();
        hVar.f4281f = 0L;
        AIChatRecyclerView aIChatRecyclerView = this.B;
        if (aIChatRecyclerView != null) {
            aIChatRecyclerView.setStateListener(new d());
            aIChatRecyclerView.setLayoutManager(new LinearLayoutManager(1));
            aIChatRecyclerView.setAdapter(this.C);
            aIChatRecyclerView.h0(0);
            aIChatRecyclerView.setItemAnimator(hVar);
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar = this.C;
        if (aVar != null) {
            aVar.f24677f = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$6
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                    invoke(num.intValue());
                    return tf.d.f30009a;
                }

                public final void invoke(int i12) {
                    AIChatRecyclerView aIChatRecyclerView2 = AIChatActivity.this.B;
                    if (aIChatRecyclerView2 != null) {
                        aIChatRecyclerView2.J0 = i12;
                        if (aIChatRecyclerView2.E0) {
                            if (aIChatRecyclerView2.A0(i12) && !aIChatRecyclerView2.D0) {
                                aIChatRecyclerView2.post(new g9.e(i12, aIChatRecyclerView2));
                            }
                        }
                    }
                }
            };
        }
        int i12 = this.f24366f0;
        if (i12 != 600 && i12 != 604) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f24369i0 = z10;
        final pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.f24687p = z10;
            aVar2.f24680i = new cg.l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar3) {
                    invoke2(aVar3);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(km.a item) {
                    kotlin.jvm.internal.g.e(item, "item");
                    AIChatActivity.this.f24380t0 = 2;
                    AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                    String p14 = ea.a.p("Umkjbx5lPXUcbFtjAl81bC1jaw==", "JqaRB9qC");
                    String str3 = AIChatActivity.this.Q;
                    aIEventCenter2.getClass();
                    AIEventCenter.i(p14, str3);
                    if (BillingConfigImpl.c.o(AIChatActivity.this)) {
                        AISimpleSubscriptionActivity.f2(AIChatActivity.this, ea.a.p("LGhQdA==", "XzA1QtMJ"));
                        return;
                    }
                    BaseSubscriptionActivity.a aVar3 = BaseSubscriptionActivity.L;
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    String p15 = ea.a.p("LGhQdDI=", "3GDV4T1J");
                    String p16 = ea.a.p("LGhQdA==", "Rl2rnPym");
                    aVar3.getClass();
                    BaseSubscriptionActivity.a.b(aIChatActivity, p15, p16, null);
                }
            };
            aVar2.f24682k = new cg.l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar3) {
                    invoke2(aVar3);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(km.a item) {
                    kotlin.jvm.internal.g.e(item, "item");
                    if (AIChatActivity.this.f24372l0.contains(item.c)) {
                        return;
                    }
                    LinkedHashSet linkedHashSet = AIChatActivity.this.f24372l0;
                    String str3 = item.c;
                    kotlin.jvm.internal.g.d(str3, ea.a.p("WnQubV1pZA==", "FUu0I0oA"));
                    linkedHashSet.add(str3);
                    AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                    String p14 = ea.a.p("LmlSaBh0aHA7Zy9fFmwBY2s=", "vZ8w1BKU");
                    aIEventCenter2.getClass();
                    AIEventCenter.i(p14, null);
                }
            };
            aVar2.f24686o = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$3
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
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    aIChatActivity.X.postDelayed(new h(aIChatActivity, 1), 20L);
                }
            };
            aVar2.f24681j = new cg.l<String, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$4
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(String str3) {
                    invoke2(str3);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String str3) {
                    if (str3 != null) {
                        AIChatActivity aIChatActivity = AIChatActivity.this;
                        pdf.pdfreader.viewer.editor.free.utils.j1.d(aIChatActivity, aIChatActivity.getString(R.string.arg_res_0x7f13036a), androidx.core.content.a.getDrawable(aIChatActivity, R.drawable.ic_copy_success));
                        aIChatActivity.X.postDelayed(new m(aIChatActivity, str3, 0), 100L);
                    }
                }
            };
            aVar2.f24678g = new cg.p<Integer, AIQuickTag, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$5
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, AIQuickTag aIQuickTag2) {
                    invoke(num.intValue(), aIQuickTag2);
                    return tf.d.f30009a;
                }

                public final void invoke(int i13, AIQuickTag aiQuickTag) {
                    boolean z13;
                    kotlin.jvm.internal.g.e(aiQuickTag, "aiQuickTag");
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                    aIChatActivity.getClass();
                    if (jm.c.c) {
                        pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity, aIChatActivity.getString(R.string.arg_res_0x7f1304e2), true, null, -1);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 || AIChatActivity.this.u2()) {
                        return;
                    }
                    if (!AIChatActivity.this.f24371k0.contains(Integer.valueOf(aiQuickTag.getHType()))) {
                        AIChatActivity.this.f24371k0.add(Integer.valueOf(aiQuickTag.getHType()));
                        AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                        String from = AIChatActivity.this.Q;
                        aIEventCenter2.getClass();
                        kotlin.jvm.internal.g.e(from, "from");
                        AIEventCenter.d(ea.a.p("UmktdR1jPWMeaVdr", "MMcWStK5"), aiQuickTag, from);
                    }
                    if (aiQuickTag.isTranslate()) {
                        AIChatActivity aIChatActivity2 = AIChatActivity.this;
                        Object[] objArr = new Object[1];
                        String str3 = "";
                        try {
                            str3 = pdf.pdfreader.viewer.editor.free.utils.q0.h(aIChatActivity2).getString("get_ai_chat_translate_lang", "");
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (TextUtils.isEmpty(str3)) {
                            Locale d10 = pdf.pdfreader.viewer.editor.free.utils.a0.d(aIChatActivity2);
                            str3 = d10.getDisplayLanguage(d10);
                            pdf.pdfreader.viewer.editor.free.utils.q0.A(aIChatActivity2, "get_ai_chat_translate_lang", str3);
                        }
                        objArr[0] = str3;
                        String string = aIChatActivity2.getString(R.string.arg_res_0x7f1304df, objArr);
                        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KEAgVSBIIBUgTiBlIEUg0IDVdCwpOCBvIBEgWSAXIHogaiBVIEggFSBOKQ==", "WR2T2sU2"));
                        AIChatActivity aIChatActivity3 = AIChatActivity.this;
                        aIChatActivity3.X.post(new n(aIChatActivity3, string, 0));
                        return;
                    }
                    AIChatActivity.this.C2(aiQuickTag.getDes(), aiQuickTag.getHType(), Boolean.FALSE);
                }
            };
            aVar2.f24679h = new cg.l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(km.a item) {
                    kotlin.jvm.internal.g.e(item, "item");
                    int i13 = item.f19881k;
                    if (i13 == 500) {
                        AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                        String p14 = ea.a.p("UmkoaBJ0PWMTbldlBV81bC1jaw==", "3RB0QbHC");
                        aIEventCenter2.getClass();
                        AIEventCenter.i(p14, null);
                        AIChatActivity aIChatActivity = AIChatActivity.this;
                        if (aIChatActivity.X.hasMessages(aIChatActivity.U)) {
                            AIChatActivity aIChatActivity2 = AIChatActivity.this;
                            aIChatActivity2.X.removeMessages(aIChatActivity2.U);
                            if (AIChatActivity.this.isFinishing()) {
                                return;
                            }
                            AIChatActivity.this.getClass();
                            AIChatActivity.E2(item, true);
                        }
                        try {
                            AIChatActivity aIChatActivity3 = AIChatActivity.this;
                            if (aIChatActivity3.f24365e0 == 700) {
                                sp.h hVar2 = aIChatActivity3.f24376p0;
                                if (hVar2 != null) {
                                    hVar2.e(false);
                                }
                                AIChatActivity.this.f24376p0 = null;
                            }
                        } catch (Exception unused) {
                        }
                        AIChatActivity.this.L0();
                    } else if (i13 != 501) {
                        if (aVar2.f24687p) {
                            PDFChooseActivity.a aVar3 = PDFChooseActivity.f27008u0;
                            AIChatActivity aIChatActivity4 = AIChatActivity.this;
                            ToolsType toolsType = ToolsType.AI_UPLOAD;
                            AIQuickTag aIQuickTag2 = aIChatActivity4.f24363c0;
                            aVar3.getClass();
                            PDFChooseActivity.a.a(aIChatActivity4, toolsType, 18, aIQuickTag2);
                            AIEventCenter aIEventCenter3 = AIEventCenter.f28648a;
                            String p15 = ea.a.p("KmkFaCJ0LXItdRZsW2EzX1tsO2Nr", "Y7KfCrMn");
                            aIEventCenter3.getClass();
                            AIEventCenter.i(p15, null);
                            return;
                        }
                        if (!cl.b.b(AIChatActivity.this)) {
                            AIChatActivity aIChatActivity5 = AIChatActivity.this;
                            AIChatActivity.a aVar4 = AIChatActivity.f24356v0;
                            aIChatActivity5.getClass();
                            AIChatActivity.F2(item);
                            Message obtainMessage = AIChatActivity.this.X.obtainMessage();
                            kotlin.jvm.internal.g.d(obtainMessage, ea.a.p("W2ElbBdlEC4dYkBhAG4bZTdzU2cjKCk=", "yCMSimBQ"));
                            AIChatActivity aIChatActivity6 = AIChatActivity.this;
                            obtainMessage.what = aIChatActivity6.U;
                            obtainMessage.obj = item;
                            aIChatActivity6.X.sendMessageDelayed(obtainMessage, 500L);
                        } else {
                            AIChatActivity aIChatActivity7 = AIChatActivity.this;
                            String str3 = aIChatActivity7.f24364d0;
                            if (str3 != null) {
                                if (lm.e.f21773a && new File(str3).length() > ((long) 10485760)) {
                                    pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity7, aIChatActivity7.getString(R.string.arg_res_0x7f13014f, "10MB"), true, null, -1);
                                    return;
                                }
                            }
                            AIChatActivity.this.v2(item);
                        }
                        AIEventCenter aIEventCenter4 = AIEventCenter.f28648a;
                        String p16 = ea.a.p("X2kZZQ==", "8A9uzdlH");
                        aIEventCenter4.getClass();
                        AIEventCenter.a(p16);
                    }
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar3) {
                    invoke2(aVar3);
                    return tf.d.f30009a;
                }
            };
            aVar2.f24683l = new cg.p<Integer, km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$7
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, km.a aVar3) {
                    invoke(num.intValue(), aVar3);
                    return tf.d.f30009a;
                }

                public final void invoke(final int i13, final km.a item) {
                    boolean z13;
                    kotlin.jvm.internal.g.e(item, "item");
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    AIChatActivity.a aVar3 = AIChatActivity.f24356v0;
                    aIChatActivity.getClass();
                    if (jm.c.c) {
                        pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity, aIChatActivity.getString(R.string.arg_res_0x7f1304e2), true, null, -1);
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 || AIChatActivity.this.u2()) {
                        return;
                    }
                    AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                    String p14 = ea.a.p("OG4Rdwty", "Z9YbnMBd");
                    aIEventCenter2.getClass();
                    AIEventCenter.a(p14);
                    int i14 = item.f19875e;
                    if (i14 == 100) {
                        if (!cl.b.b(AIChatActivity.this)) {
                            AIChatActivity.this.getClass();
                            AIChatActivity.F2(item);
                            Message obtainMessage = AIChatActivity.this.X.obtainMessage();
                            kotlin.jvm.internal.g.d(obtainMessage, ea.a.p("W2ElbBdlEC4dYkBhAG4bZTdzU2cjKCk=", "Swe4kSPf"));
                            AIChatActivity aIChatActivity2 = AIChatActivity.this;
                            obtainMessage.what = aIChatActivity2.U;
                            obtainMessage.obj = item;
                            aIChatActivity2.X.sendMessageDelayed(obtainMessage, 500L);
                            return;
                        }
                        AIChatActivity aIChatActivity3 = AIChatActivity.this;
                        String str3 = aIChatActivity3.f24364d0;
                        if (str3 != null) {
                            if (lm.e.f21773a && new File(str3).length() > ((long) 10485760)) {
                                pdf.pdfreader.viewer.editor.free.utils.j1.e(aIChatActivity3, aIChatActivity3.getString(R.string.arg_res_0x7f13014f, "10MB"), true, null, -1);
                                return;
                            }
                        }
                        AIChatActivity.this.v2(item);
                    } else if (i14 == 101) {
                        im.a.b(true);
                        if (cl.b.b(AIChatActivity.this)) {
                            item.f19889s = 200;
                            pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar4 = AIChatActivity.this.C;
                            if (aVar4 != null) {
                                aVar4.l(item);
                            }
                            AIChatActivity.this.A2(item);
                            return;
                        }
                        item.f19889s = 200;
                        final km.a n22 = AIChatActivity.n2(AIChatActivity.this, item);
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar5 = AIChatActivity.this.C;
                        if (aVar5 != null) {
                            aVar5.h(item, n22);
                        }
                        final AIChatActivity aIChatActivity4 = AIChatActivity.this;
                        aIChatActivity4.X.postDelayed(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                String p15 = ea.a.p("R2gic1cw", "MUbSpeDg");
                                AIChatActivity aIChatActivity5 = AIChatActivity.this;
                                kotlin.jvm.internal.g.e(aIChatActivity5, p15);
                                String p16 = ea.a.p("F2k_ZW0=", "gwRnXDSa");
                                km.a aVar6 = item;
                                kotlin.jvm.internal.g.e(aVar6, p16);
                                String p17 = ea.a.p("F2M5ZRJ0B0Ecc0NlG0M-YTBJXGZv", "PlfSvXaF");
                                km.a aVar7 = n22;
                                kotlin.jvm.internal.g.e(aVar7, p17);
                                if (!aIChatActivity5.isFinishing()) {
                                    aVar6.f19889s = 201;
                                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar8 = aIChatActivity5.C;
                                    if (aVar8 != null) {
                                        aVar8.l(aVar6);
                                    }
                                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar9 = aIChatActivity5.C;
                                    if (aVar9 != null) {
                                        aVar9.m(aVar7);
                                    }
                                    im.a.b(false);
                                    AIChatRecyclerView aIChatRecyclerView2 = aIChatActivity5.B;
                                    if (aIChatRecyclerView2 != null) {
                                        aIChatRecyclerView2.C0(i13);
                                    }
                                }
                            }
                        }, 500L);
                    }
                }
            };
            aVar2.f24685n = new cg.p<Integer, List<? extends AIQuickTag>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$8
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, List<? extends AIQuickTag> list) {
                    invoke(num.intValue(), (List<AIQuickTag>) list);
                    return tf.d.f30009a;
                }

                public final void invoke(int i13, List<AIQuickTag> tags) {
                    kotlin.jvm.internal.g.e(tags, "tags");
                    if (AIChatActivity.this.f24370j0.contains(Integer.valueOf(i13))) {
                        return;
                    }
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    for (AIQuickTag aiQuickTag : tags) {
                        AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
                        String from = aIChatActivity.Q;
                        aIEventCenter2.getClass();
                        kotlin.jvm.internal.g.e(aiQuickTag, "aiQuickTag");
                        kotlin.jvm.internal.g.e(from, "from");
                        AIEventCenter.d(ea.a.p("LmlXdRdjaHMyb3c=", "woRboBxb"), aiQuickTag, from);
                    }
                    AIChatActivity.this.f24370j0.add(Integer.valueOf(i13));
                }
            };
            aVar2.f24684m = new cg.p<Integer, km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$initView$7$9
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, km.a aVar3) {
                    invoke(num.intValue(), aVar3);
                    return tf.d.f30009a;
                }

                public final void invoke(int i13, km.a item) {
                    kotlin.jvm.internal.g.e(item, "item");
                    AIChatActivity.l2(AIChatActivity.this, item, i13);
                }
            };
        }
        ArrayList arrayList2 = jm.c.f19315a;
        if (arrayList2.isEmpty()) {
            String str3 = this.f24364d0;
            if (str3 != null) {
                File file = new File(str3);
                km.a aVar3 = new km.a();
                aVar3.f19873b = this.W;
                aVar3.f19875e = 100;
                aVar3.f19877g = str3;
                aVar3.f19876f = this.Y;
                aVar3.f19878h = pdf.pdfreader.viewer.editor.free.utils.v.p(str3);
                aVar3.f19880j = file.length();
                aVar3.f19879i = this.f24365e0;
                AIQuickTag aIQuickTag2 = this.f24363c0;
                if (aIQuickTag2 != null) {
                    if (aIQuickTag2.isTranslate()) {
                        Object[] objArr = new Object[1];
                        String str4 = "";
                        try {
                            str4 = pdf.pdfreader.viewer.editor.free.utils.q0.h(this).getString("get_ai_chat_translate_lang", "");
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                        if (TextUtils.isEmpty(str4)) {
                            Locale d10 = pdf.pdfreader.viewer.editor.free.utils.a0.d(this);
                            str4 = d10.getDisplayLanguage(d10);
                            pdf.pdfreader.viewer.editor.free.utils.q0.A(this, "get_ai_chat_translate_lang", str4);
                        }
                        objArr[0] = str4;
                        String string = getString(R.string.arg_res_0x7f1304df, objArr);
                        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KEAgVSBIIBUgTiBlIEUgqYDWIFQgUyBvIBEgWSAXIHogaiBVIEggFSBOKQ==", "vwCfKpts"));
                        AskQuestionView askQuestionView2 = this.D;
                        if (askQuestionView2 != null && (editContentView = askQuestionView2.getEditContentView()) != null) {
                            editContentView.post(new n(editContentView, string, 2));
                            this.X.postDelayed(new k(this, editContentView, 2), 300L);
                        }
                    } else {
                        km.a w22 = w2(aIQuickTag2.getHType(), aIQuickTag2.getDes());
                        aVar3.f19886p = w22;
                        if (w22 != null) {
                            w22.f19890t = true;
                        }
                    }
                }
                if (this.f24369i0) {
                    AskQuestionView askQuestionView3 = this.D;
                    if (askQuestionView3 != null) {
                        askQuestionView3.setHideUploadFile(false);
                    }
                    v2(aVar3);
                    return;
                }
                km.a aVar4 = new km.a();
                aVar4.f19873b = this.W;
                aVar4.f19875e = 103;
                aVar4.f19896z = this.f24366f0;
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar5 = this.C;
                if (aVar5 != null) {
                    aVar5.i(aVar4);
                }
                AskQuestionView askQuestionView4 = this.D;
                if (askQuestionView4 != null) {
                    askQuestionView4.setHideUploadFile(true);
                }
                v2(aVar3);
                return;
            }
            return;
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((km.a) next).f19875e == 102) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    obj = next;
                }
            }
        }
        km.a aVar6 = (km.a) obj;
        if (aVar6 != null) {
            this.Z = aVar6.A;
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar7 = this.C;
        if (aVar7 != null) {
            aVar7.n(arrayList2);
        }
        ArrayList arrayList3 = jm.c.f19315a;
        jm.c.f19315a.clear();
        if (BillingConfigImpl.c.w()) {
            c2();
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar8 = this.C;
        int i13 = -1;
        if (aVar8 != null) {
            i10 = aVar8.k();
        } else {
            i10 = -1;
        }
        if (i10 > 0) {
            Boolean bool2 = Boolean.TRUE;
            c.a.b(bool2, bool2);
            return;
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar9 = this.C;
        if (aVar9 != null && (j10 = aVar9.j()) != null) {
            i13 = j10.f19881k;
        }
        if (i13 != 501) {
            c.a.b(Boolean.TRUE, Boolean.FALSE);
        } else {
            c.a.b(Boolean.FALSE, Boolean.TRUE);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.a
    public final void L0() {
        ArrayList arrayList = jm.c.f19315a;
        c.a.b(Boolean.FALSE, Boolean.TRUE);
        AINetManager.f24348a.getClass();
        AtomicReference<okhttp3.e> atomicReference = sb.d.f29778a;
        okhttp3.e andSet = sb.d.f29778a.getAndSet(null);
        if (andSet != null) {
            andSet.cancel();
        }
        kotlinx.coroutines.y0 y0Var = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24353b;
        if (y0Var != null && y0Var.a() && !y0Var.u()) {
            pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24354d = true;
        }
        ReaderPDFCore readerPDFCore = androidx.activity.s.f1863r;
        if (readerPDFCore != null) {
            readerPDFCore.onDestroy();
        }
        androidx.activity.s.f1863r = null;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AIChatActivity$initViewModel$1(this, null), 3);
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void W0(km.a aVar) {
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.m(aVar);
        }
        AIChatRecyclerView aIChatRecyclerView = this.B;
        if (aIChatRecyclerView != null) {
            aIChatRecyclerView.h0(0);
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void X(km.a aVar, km.a aVar2) {
        Integer num;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar3 = this.C;
        if (aVar3 != null) {
            num = Integer.valueOf(aVar3.h(aVar, aVar2));
        } else {
            num = null;
        }
        ArrayList arrayList = jm.c.f19315a;
        c.a.e(aVar);
        c.a.e(aVar2);
        if (num != null) {
            num.intValue();
            AIChatRecyclerView aIChatRecyclerView = this.B;
            if (aIChatRecyclerView != null) {
                int intValue = num.intValue();
                ea.a.p("UnVDb2BjP28kbDJhZw==", "eQ373MwP");
                String str = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a;
                if (intValue > 0 && !aIChatRecyclerView.D0) {
                    aIChatRecyclerView.post(new vl.a(aIChatRecyclerView, intValue, 1));
                }
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void c2() {
        final km.a aVar;
        Object obj;
        boolean z10;
        int i10 = this.f24380t0;
        String str = null;
        if (i10 == 1) {
            AIEventCenter aIEventCenter = AIEventCenter.f28648a;
            String p10 = ea.a.p("UmkoaBJ0PWcXdEJpGV8ybypl", "yg8y8e5M");
            aIEventCenter.getClass();
            AIEventCenter.i(p10, null);
        } else if (i10 == 2) {
            AIEventCenter aIEventCenter2 = AIEventCenter.f28648a;
            String p11 = ea.a.p("LmlZbxRlaHU0bCVjHl8Mb1tl", "wjchXb1b");
            aIEventCenter2.getClass();
            AIEventCenter.i(p11, this.Q);
        }
        ArrayList arrayList = jm.c.f19315a;
        c.a.a(false, null, null, 14);
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
        if (aVar2 != null) {
            Iterator it = aVar2.f24676e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    km.a aVar3 = (km.a) obj;
                    if (aVar3.f19875e == 102 && aVar3.B) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            aVar = (km.a) obj;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            ArrayList arrayList2 = jm.c.f19315a;
            c.a.InterfaceC0260a interfaceC0260a = jm.c.f19316b;
            if (interfaceC0260a != null) {
                interfaceC0260a.I();
            }
            q2(aVar, null, Boolean.FALSE);
            ArrayList arrayList3 = aVar.f19893w;
            kotlin.jvm.internal.g.d(arrayList3, ea.a.p("WnQubV1hDHMFZUZDBm4iZSp0", "Sa75itWU"));
            AIAnswerContent aIAnswerContent = (AIAnswerContent) kotlin.collections.m.t0(arrayList3.size() - 1, arrayList3);
            if (aIAnswerContent != null) {
                if (aIAnswerContent.getType() != 2) {
                    jf.f fVar = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24352a;
                    ea.a.p("WnQubV1hDHMFZUZDBm4iZSp0", "rmSbpnAw");
                    AIAnswerContent aIAnswerContent2 = (AIAnswerContent) kotlin.collections.m.y0(arrayList3);
                    if (aIAnswerContent2 != null) {
                        str = aIAnswerContent2.getContent();
                    }
                    if (str == null) {
                        str = "";
                    } else {
                        ea.a.p("WnQubV1hDHMFZUZDBm4iZSp0HGwnczdPGU4FbCQoTD8dYyRuB2UMdFI_DiBLIg==", "kpHedg15");
                    }
                    c.b.a(str, false, aIAnswerContent.getSpanStr(), new cg.p<Integer, CharSequence, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$unlockItem$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // cg.p
                        public /* bridge */ /* synthetic */ tf.d invoke(Integer num, CharSequence charSequence) {
                            invoke(num.intValue(), charSequence);
                            return tf.d.f30009a;
                        }

                        public final void invoke(int i11, CharSequence charSequence) {
                            km.a.this.b(charSequence);
                            AIChatActivity.j2(this, km.a.this, i11, null);
                            AIDataBase aIDataBase = km.e.f19907a;
                            ArrayList arrayList4 = km.a.this.f19893w;
                            kotlin.jvm.internal.g.d(arrayList4, ea.a.p("UHQ_bW9hNnM_ZRRDW24jZVZ0", "689ZAXz2"));
                            km.e.a((AIAnswerContent) kotlin.collections.m.x0(arrayList4));
                        }
                    }, 8);
                    return;
                }
                r2(aVar, true);
                km.e.a(null);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void d2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.a
    public final void e0() {
        boolean z10;
        boolean z11 = true;
        if (!BillingConfigImpl.c.w() && pdf.pdfreader.viewer.editor.free.utils.q0.k(this) <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            pdf.pdfreader.viewer.editor.free.utils.j1.e(this, getString(R.string.arg_res_0x7f1304e2), true, null, -1);
        } else {
            z11 = false;
        }
        if (z11) {
            return;
        }
        PDFChooseActivity.a aVar = PDFChooseActivity.f27008u0;
        ToolsType toolsType = ToolsType.AI_UPLOAD;
        aVar.getClass();
        kotlin.jvm.internal.g.e(toolsType, "toolsType");
        PDFChooseActivity.a.a(this, toolsType, 18, null);
    }

    @Override // android.app.Activity
    public final void finish() {
        i2 i2Var;
        EditText editText;
        super.finish();
        B2();
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null && (i2Var = askQuestionView.f24748a) != null && (editText = i2Var.c) != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void g1(km.a aVar) {
        Integer num;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
        if (aVar2 != null) {
            num = Integer.valueOf(aVar2.i(aVar));
        } else {
            num = null;
        }
        if (num != null) {
            int intValue = num.intValue();
            AIChatRecyclerView aIChatRecyclerView = this.B;
            if (aIChatRecyclerView != null) {
                aIChatRecyclerView.C0(intValue);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void g2(String str, boolean z10) {
        int i10;
        boolean z11 = !z10;
        if (z10) {
            i10 = R.drawable.ic_subscription_positive;
        } else {
            i10 = R.drawable.ic_subscription_negative;
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.i(this, str, z11, i10);
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void h0(int i10, String str) {
        km.a aVar;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
        if (aVar2 != null) {
            ArrayList arrayList = aVar2.f24676e;
            Iterator it = arrayList.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, str)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 >= 0 && (aVar = (km.a) kotlin.collections.m.t0(i11, arrayList)) != null) {
                aVar.f19881k = i10;
                aVar2.notifyItemChanged(i11);
            }
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void m1(int i10) {
        FlexboxLayout flexboxLayout = this.M;
        if (flexboxLayout != null) {
            flexboxLayout.setVisibility(0);
        }
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null) {
            askQuestionView.setVisibility(0);
        }
        if (this.f24379s0) {
            AIEventCenter aIEventCenter = AIEventCenter.f28648a;
            String p10 = ea.a.p("UmkoaBJ0PWcXdEJpGV8laCt3", "ha2Ts6Dr");
            aIEventCenter.getClass();
            AIEventCenter.i(p10, null);
            this.f24379s0 = false;
        }
        if (i10 == 1) {
            TextView textView = this.K;
            if (textView != null) {
                textView.setText(getString(R.string.arg_res_0x7f1300a6, String.valueOf(i10)));
                return;
            }
            return;
        }
        TextView textView2 = this.K;
        if (textView2 != null) {
            textView2.setText(getString(R.string.arg_res_0x7f1300a9, String.valueOf(i10)));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z10;
        PopupWindow popupWindow = this.f24374n0;
        boolean z11 = true;
        if (popupWindow != null && popupWindow.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            x2();
        } else if (im.a.a()) {
        } else {
            AIHistoryGuideView aIHistoryGuideView = this.P;
            if (aIHistoryGuideView == null || aIHistoryGuideView.getVisibility() != 0) {
                z11 = false;
            }
            if (z11) {
                y2();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle == null) {
            ArrayList arrayList = jm.c.f19315a;
            jm.c.f19315a.clear();
        }
        if (bundle != null) {
            String string = bundle.getString(ea.a.p("FWUAbzBlK2kkZTZhQGg=", "dXgmDm9R"), this.Y);
            kotlin.jvm.internal.g.d(string, ea.a.p("WnRlZxZ0MXQAaVpnQSIkZSlvRmUAaS9lMWFMaG8sS3JWbSR0FkYLbBdQVXQBKQ==", "a8MkceK2"));
            this.Y = string;
            this.f24377q0 = bundle.getBoolean(ea.a.p("JnN3aQtzQ0M2aSlrJmUGZA==", "JmFDO2Es"), this.f24377q0);
            this.f24380t0 = bundle.getInt(ea.a.p("K2ECdCtsP2MjUxNiR2MlaVplBnk5ZQ==", "j4GqhVqY"), this.f24380t0);
            String string2 = bundle.getString(ea.a.p("QWUobyBlAmgpdC9k", "kk3ETA9F"), this.W);
            kotlin.jvm.internal.g.d(string2, ea.a.p("C3RFZyp0G3Q6aQhnHCIlZVVvJmUKaFd0PWRTLHFyJ20NdA5DJ2E8SSwp", "AdbkOHQd"));
            this.W = string2;
        }
        super.onCreate(bundle);
        getResources().getDimensionPixelSize(R.dimen.dp_20);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(r4.f13790a.findViewById(R.id.top_space));
        r4.f13799k.f13757d = true;
        r4.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.color_100_white_black);
        r4.h();
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.a aVar = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.a(this);
        com.gyf.immersionbar.b bVar = r4.f13799k;
        if (bVar.f13775v == null) {
            bVar.f13775v = aVar;
        }
        r4.f();
        if (BillingConfigImpl.c.w()) {
            km.e.a(null);
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("WWkRYzphdA==", "9D8NRKyW"));
        AppCoreFilterEvent.a(ea.a.p("LmlucAtvWnB0", "4uev6wTb"));
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        ValueAnimator valueAnimator;
        i2 i2Var;
        EditText editText;
        ObjectAnimator objectAnimator;
        AIStatementDialog aIStatementDialog;
        super.onDestroy();
        AIStatementDialog aIStatementDialog2 = this.R;
        boolean z12 = true;
        if (aIStatementDialog2 != null && aIStatementDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aIStatementDialog = this.R) != null) {
            aIStatementDialog.dismiss();
        }
        ObjectAnimator objectAnimator2 = this.f24375o0;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (objectAnimator = this.f24375o0) != null) {
            objectAnimator.cancel();
        }
        AskQuestionView askQuestionView = this.D;
        if (askQuestionView != null && (i2Var = askQuestionView.f24748a) != null && (editText = i2Var.c) != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.a(editText);
        }
        AskQuestionView askQuestionView2 = this.D;
        if (askQuestionView2 != null) {
            ValueAnimator valueAnimator2 = askQuestionView2.f24756j;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                z12 = false;
            }
            if (z12 && (valueAnimator = askQuestionView2.f24756j) != null) {
                valueAnimator.cancel();
            }
        }
        this.X.removeCallbacksAndMessages(null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ArrayList arrayList = jm.c.f19315a;
        jm.c.f19315a.clear();
        setIntent(intent);
        K1();
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.T) {
            this.T = false;
            if (BillingConfigImpl.c.w()) {
                c2();
            }
        }
        if (wn.b.f31393i) {
            wn.b.f31393i = false;
            try {
                new pdf.pdfreader.viewer.editor.free.ui.dialog.i(this).show();
            } catch (Exception unused) {
            }
        }
        AIChatRecyclerView aIChatRecyclerView = this.B;
        if (aIChatRecyclerView != null) {
            aIChatRecyclerView.h0(0);
        }
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        ArrayList arrayList;
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putString(ea.a.p("QWUcbzhlPGkkZTZhQGg=", "KD3qLzqZ"), this.Y);
        outState.putBoolean(ea.a.p("BXMFaUZzDkMkaQVrZ2U5ZA==", "telC4zqQ"), this.f24377q0);
        outState.putInt(ea.a.p("X2E4dDBsC2MZU0FiGmMkaSZlZnk2ZQ==", "ZPa5WhXP"), this.f24380t0);
        outState.putString(ea.a.p("PWVcbw1ldGg7dANk", "kelXsQfW"), this.W);
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar = this.C;
        tf.d dVar = null;
        if (aVar != null) {
            arrayList = aVar.f24676e;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = jm.c.f19315a;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            dVar = tf.d.f30009a;
        }
        if (dVar == null) {
            ArrayList arrayList3 = jm.c.f19315a;
            jm.c.f19315a.clear();
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void p0(km.a data) {
        kotlin.jvm.internal.g.e(data, "data");
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar = this.C;
        if (aVar != null) {
            aVar.i(data);
        }
    }

    public final void q2(km.a aVar, jm.d dVar, Boolean bool) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        boolean z10;
        int i10 = 1;
        im.a.b(true);
        aVar.f19895y = false;
        if (dVar != null) {
            if (this.Z == 0 && (num4 = dVar.f19322g) != null) {
                int intValue = num4.intValue();
                if (1 <= intValue && intValue < 100) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.Z = intValue;
                    aVar.A = intValue;
                }
            }
            Integer num5 = dVar.c;
            if (num5 != null) {
                aVar.f19891u = num5.intValue();
            }
            String str = dVar.f19318b;
            if (str != null) {
                if (num5 != null && num5.intValue() == 2 && (num2 = dVar.f19319d) != null && (num3 = dVar.f19320e) != null) {
                    aVar.a(num2.intValue(), num3.intValue(), num5.intValue(), str);
                } else {
                    if (num5 != null) {
                        i10 = num5.intValue();
                    }
                    aVar.a(0, 0, i10, str);
                }
            }
        }
        aVar.f19894x = TTAdConstant.MATE_IS_NULL_CODE;
        if (bool != null) {
            aVar.B = bool.booleanValue();
        }
        if (aVar.f19891u == 2) {
            ArrayList arrayList = jm.c.f19315a;
            c.a.b(Boolean.FALSE, Boolean.TRUE);
            AIChatRecyclerView aIChatRecyclerView = this.B;
            if (aIChatRecyclerView != null) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
                if (aVar2 != null) {
                    num = Integer.valueOf(aVar2.k());
                } else {
                    num = null;
                }
                if (num != null) {
                    aIChatRecyclerView.J0 = num.intValue();
                    aIChatRecyclerView.B0();
                }
            }
        } else {
            ArrayList arrayList2 = jm.c.f19315a;
            c.a.b(Boolean.TRUE, Boolean.FALSE);
        }
        if (aVar.f19884n != 0) {
            aVar.f19884n = System.currentTimeMillis();
        }
        ArrayList arrayList3 = jm.c.f19315a;
        c.a.e(aVar);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.a
    public final void r(String str) {
        AIEventCenter aIEventCenter = AIEventCenter.f28648a;
        String p10 = ea.a.p("LmlSaBh0aHM_bi5fFmwBY2s=", "WvPGZLCc");
        aIEventCenter.getClass();
        AIEventCenter.i(p10, null);
        C2(str, 0, Boolean.TRUE);
        this.f24377q0 = false;
    }

    public final void r2(km.a aVar, boolean z10) {
        im.a.b(false);
        aVar.f19894x = TTAdConstant.AD_ID_IS_NULL_CODE;
        this.X.postDelayed(new androidx.fragment.app.g(16, this, aVar), 200L);
        s2();
        if (!z10 && aVar.f19893w.size() == 2) {
            AIEventCenter aIEventCenter = AIEventCenter.f28648a;
            String p10 = ea.a.p("LmlSaBh0aHA7Zy9fBmgHdw==", "4ivucszm");
            aIEventCenter.getClass();
            AIEventCenter.i(p10, null);
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void t0() {
        tf.d dVar;
        boolean z10;
        Object obj;
        boolean z11;
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar = this.C;
        Object obj2 = null;
        if (aVar != null) {
            cg.l<Integer, tf.d> lVar = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$addQuickTag$1$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                    invoke2(num);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Integer num) {
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    aIChatActivity.X.postDelayed(new g(aIChatActivity, num, 0), 200L);
                }
            };
            cg.a<tf.d> aVar2 = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity$addQuickTag$1$2
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
                    AIChatActivity aIChatActivity = AIChatActivity.this;
                    aIChatActivity.X.postDelayed(new i(aIChatActivity, 0), 200L);
                }
            };
            Iterator it = aVar.f24676e.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((km.a) obj).f19875e == 104) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (z11) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((km.a) obj) == null) {
                km.a aVar3 = new km.a();
                aVar3.f19875e = 104;
                lVar.invoke(Integer.valueOf(aVar.i(aVar3)));
            } else {
                aVar2.invoke();
            }
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            ArrayList arrayList = jm.c.f19315a;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((km.a) next).f19875e == 104) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        obj2 = next;
                        break;
                    }
                }
                if (((km.a) obj2) == null) {
                    new km.a().f19875e = 104;
                }
            }
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void u(Boolean bool, Boolean bool2) {
        AskQuestionView.c cVar = this.E;
        if (cVar != null) {
            cVar.a(bool, bool2);
        }
    }

    @Override // jm.c.a.InterfaceC0260a
    public final void u0() {
        ArrayList arrayList = jm.c.f19315a;
        Boolean bool = Boolean.FALSE;
        c.a.b(bool, bool);
        this.X.postDelayed(new q0(this, 1), 500L);
    }

    public final boolean u2() {
        if (im.a.a()) {
            this.X.post(new h(this, 2));
            return true;
        }
        return false;
    }

    public final void v2(km.a aVar) {
        String str = this.f24364d0;
        if (str != null) {
            F2(aVar);
            if (this.f24365e0 == 700) {
                if (!TextUtils.isEmpty(aVar.f19883m) && new File(aVar.f19883m).exists()) {
                    G2(new File(aVar.f19883m), aVar);
                    return;
                }
                try {
                    sp.h hVar = this.f24376p0;
                    if (hVar != null) {
                        hVar.e(false);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                sp.h hVar2 = new sp.h(this, pdf.pdfreader.viewer.editor.free.utils.v.E(), true, new b(aVar));
                this.f24376p0 = hVar2;
                hVar2.h(this.f24364d0);
                return;
            }
            pdf.pdfreader.viewer.editor.free.utils.t0.V().execute(new qb.c1(4, this, str, aVar));
        }
    }

    public final km.a w2(int i10, String str) {
        if (str != null) {
            km.a aVar = new km.a();
            aVar.f19873b = this.W;
            aVar.f19887q = i10;
            aVar.f19885o = System.currentTimeMillis();
            aVar.f19875e = 101;
            aVar.f19888r = str;
            aVar.f19889s = 200;
            return aVar;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r0.isShowing() == true) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x2() {
        /*
            r3 = this;
            android.widget.PopupWindow r0 = r3.f24374n0
            r1 = 0
            if (r0 == 0) goto Ld
            boolean r0 = r0.isShowing()
            r2 = 1
            if (r0 != r2) goto Ld
            goto Le
        Ld:
            r2 = r1
        Le:
            if (r2 == 0) goto L1f
            android.view.View r0 = r3.S
            if (r0 != 0) goto L15
            goto L18
        L15:
            r0.setVisibility(r1)
        L18:
            android.widget.PopupWindow r0 = r3.f24374n0
            if (r0 == 0) goto L1f
            r0.dismiss()
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity.x2():void");
    }

    public final void y2() {
        AIHistoryGuideView aIHistoryGuideView = this.P;
        if (aIHistoryGuideView != null) {
            aIHistoryGuideView.setVisibility(8);
        }
        View view = this.J;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.a
    public final void z(AskQuestionView.d dVar) {
        this.E = dVar;
    }

    public final void z2() {
        View view;
        AIChatRecyclerView aIChatRecyclerView;
        RecyclerView.b0 b0Var;
        View view2;
        RecyclerView.m layoutManager;
        int i10;
        if (!im.a.a() && lm.f.c.i()) {
            km.a aVar = this.f24381u0;
            boolean z10 = false;
            if (aVar != null) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = this.C;
                if (aVar2 != null) {
                    Iterator it = aVar2.f24676e.iterator();
                    i10 = 0;
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, aVar.c)) {
                            break;
                        }
                        i10++;
                    }
                }
                i10 = -1;
                this.f24373m0 = i10;
            }
            if (this.f24373m0 >= 0) {
                km.a aVar3 = this.f24381u0;
                if (aVar3 != null && aVar3.B) {
                    z10 = true;
                }
                if (!z10) {
                    AIChatRecyclerView aIChatRecyclerView2 = this.B;
                    View view3 = null;
                    if (aIChatRecyclerView2 != null && (layoutManager = aIChatRecyclerView2.getLayoutManager()) != null) {
                        view = layoutManager.C(this.f24373m0);
                    } else {
                        view = null;
                    }
                    if (view != null && (aIChatRecyclerView = this.B) != null && this.f24382z != null) {
                        int[] iArr = new int[2];
                        aIChatRecyclerView.getLocationOnScreen(iArr);
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_6);
                        AIChatRecyclerView aIChatRecyclerView3 = this.B;
                        if (aIChatRecyclerView3 != null) {
                            b0Var = aIChatRecyclerView3.R(this.f24373m0);
                        } else {
                            b0Var = null;
                        }
                        if (b0Var != null && (view2 = b0Var.itemView) != null) {
                            view3 = view2.findViewById(R.id.answer_iv_reload);
                        }
                        if (view3 != null) {
                            int[] iArr3 = new int[2];
                            view3.getLocationOnScreen(iArr3);
                            int height = (view3.getHeight() + iArr3[1]) - dimensionPixelSize;
                            int i11 = iArr[1];
                            AIChatRecyclerView aIChatRecyclerView4 = this.B;
                            kotlin.jvm.internal.g.b(aIChatRecyclerView4);
                            if (height < aIChatRecyclerView4.getHeight() + i11 && iArr3[1] + dimensionPixelSize > iArr[1]) {
                                int i12 = iArr2[1];
                                int height2 = view.getHeight();
                                x2();
                                if (!im.a.a() && lm.f.c.i()) {
                                    AIChatRecyclerView aIChatRecyclerView5 = this.B;
                                    if (aIChatRecyclerView5 != null) {
                                        aIChatRecyclerView5.post(new wl.c(i12, this, height2, 1));
                                    }
                                    Boolean bool = Boolean.FALSE;
                                    lm.f.f21776f = bool;
                                    lm.f.f21777g.c(lm.f.f21774d[1], bool);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // jl.a
    public final void Q1() {
    }
}
