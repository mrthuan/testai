package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Space;
import androidx.activity.ComponentActivity;
import androidx.activity.r;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.u;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.g0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.f0;
import x0.n0;

/* compiled from: BaseSubscriptionActivity.kt */
/* loaded from: classes3.dex */
public abstract class BaseSubscriptionActivity extends jl.a {
    public static boolean M;
    public boolean A;
    public boolean B;
    public final boolean C;
    public boolean D;
    public String E;
    public final tf.c F;
    public l1 G;
    public final d H;
    public l1 I;
    public SubscriptionType J;
    public l1 K;

    /* renamed from: u */
    public boolean f24887u;

    /* renamed from: z */
    public boolean f24892z;
    public static final String N = ea.a.p("WGUyXxdlAHVn", "Mj1SukFw");
    public static final String O = ea.a.p("JGVIXx9yWG0FcCtnZQ==", "2T4PzVh2");
    public static final String P = ea.a.p("JGVIXx9yWG0FcCtnEF8JaWplAHQ3YQtjZQ==", "1LRktLTZ");
    public static final String Q = ea.a.p("JGVIXwp1VXM5ciNiEF8YbFRu", "xw3UnQer");
    public static final a L = new a();
    public static final ol.d R = new ol.d(ea.a.p("P2RXXwtlVmQ_chVwB2UFaUBt", "MyGfUZiM"), ea.a.p("ejcl", "zwZAJxs8"), ge.a.I(new ol.i(SubscriptionType.MONTH, "", ea.a.p("QDlkOTk=", "RHdJc9ny"), ea.a.p("MA==", "MqkQLnDh"), 0), new ol.i(SubscriptionType.YEAR, "", ea.a.p("aTV5Lnw5", "GLMHELhO"), ea.a.p("MA==", "thNPMLNL"), 51990000), new ol.i(SubscriptionType.YEAR_TRIAL_3D, "", ea.a.p("QzVTLmA5", "nEgbYqQ6"), ea.a.p("Mw==", "wldIy0hz"), 51990000)));

    /* renamed from: t */
    public final k0 f24886t = new k0(kotlin.jvm.internal.i.a(SubscriptionViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "0qEhCfUW"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZyc2EkdFlyeQ==", "5G6LmZSf"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlL3QTbxZFInQ9YXM=", "CJItNzxZ"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: v */
    public String f24888v = "";

    /* renamed from: w */
    public String f24889w = "";

    /* renamed from: x */
    public String f24890x = "";

    /* renamed from: y */
    public String f24891y = "";

    /* compiled from: BaseSubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String from) {
            boolean z10;
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(from, "from");
            String f10 = c1.f(context);
            SubscriptionDarkTestJActivity.a aVar = SubscriptionDarkTestJActivity.f24905b0;
            if (f10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                f10 = null;
            }
            if (f10 == null) {
                f10 = ea.a.p("XW8=", "LwY0bNmC");
            }
            aVar.getClass();
            Intent intent = new Intent(context, SubscriptionDarkTestJActivity.class);
            intent.putExtra(ea.a.p("JGVIXx9yWG0FcCtnZQ==", "ukiZKvzL"), from);
            intent.putExtra(ea.a.p("WGUyXwB1AHMRcl1iDF8mbCVu", "bqs5ANPN"), f10);
            context.startActivity(intent);
        }

        public static void b(Context context, String str, String fromAIEntrance, AIJumpTarget aIJumpTarget) {
            boolean z10;
            kotlin.jvm.internal.g.e(context, "context");
            kotlin.jvm.internal.g.e(fromAIEntrance, "fromAIEntrance");
            String f10 = c1.f(context);
            SubscriptionAIJ1Activity.a aVar = SubscriptionAIJ1Activity.Z;
            if (f10.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                f10 = null;
            }
            if (f10 == null) {
                f10 = ea.a.p("XW8=", "nnZp0QVS");
            }
            aVar.getClass();
            Intent intent = new Intent(context, SubscriptionAIJ1Activity.class);
            intent.putExtra(ea.a.p("PGUNXy9yVm0XcAdnZQ==", "1pWtI9t1"), str);
            intent.putExtra(ea.a.p("JGVIXwp1VXM5ciNiEF8YbFRu", "MwDBMv6n"), f10);
            intent.putExtra(ea.a.p("JGVIXx9yWG0FcCtnEF8JaWplAHQ3YQtjZQ==", "cXTXx8uB"), fromAIEntrance);
            if (aIJumpTarget != null) {
                intent.putExtra(ea.a.p("UmVAX1JpCGo9bRZfQGElZ110", "R1993WAU"), aIJumpTarget);
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: BaseSubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24893a;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_3D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_7D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_14D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24893a = iArr;
        }
    }

    /* compiled from: BaseSubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c extends androidx.activity.n {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(true);
            BaseSubscriptionActivity.this = r1;
        }

        @Override // androidx.activity.n
        public final void a() {
            Object obj;
            BaseSubscriptionActivity baseSubscriptionActivity = BaseSubscriptionActivity.this;
            List<Fragment> H = baseSubscriptionActivity.getSupportFragmentManager().H();
            kotlin.jvm.internal.g.d(H, ea.a.p("AXUAcDpyPEY6YQFtUW4jTVluM2cschhmBmEWbTRuNnM=", "vgrpUHYO"));
            Iterator<T> it = H.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Fragment) obj) instanceof SubscriptionRetainFragment) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (((Fragment) obj) != null) {
                return;
            }
            baseSubscriptionActivity.p2();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.coroutines.a implements u {

        /* renamed from: b */
        public final /* synthetic */ BaseSubscriptionActivity f24895b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity r2) {
            /*
                r1 = this;
                kotlinx.coroutines.u$a r0 = kotlinx.coroutines.u.a.f20269a
                r1.f24895b = r2
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.d.<init>(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity):void");
        }

        @Override // kotlinx.coroutines.u
        public final void R(CoroutineContext coroutineContext, Throwable th2) {
            th2.printStackTrace();
            BaseSubscriptionActivity baseSubscriptionActivity = this.f24895b;
            if (!baseSubscriptionActivity.isFinishing() && (th2 instanceof BillingException)) {
                BaseSubscriptionActivity.a2(baseSubscriptionActivity, (BillingException) th2);
            }
        }
    }

    public BaseSubscriptionActivity() {
        kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.C = BillingConfigImpl.c.q();
        this.E = "";
        this.F = kotlin.a.a(new cg.a<List<String>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$functionParams$2
            @Override // cg.a
            public final List<String> invoke() {
                return new ArrayList();
            }
        });
        this.H = new d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity r14, pdf.pdfreader.viewer.editor.free.billing.exception.BillingException r15) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.a2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, pdf.pdfreader.viewer.editor.free.billing.exception.BillingException):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:441:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v48, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity r18, pdf.pdfreader.viewer.editor.free.billing.SubscriptionType r19, java.lang.String r20, kotlin.coroutines.c r21) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.b2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, pdf.pdfreader.viewer.editor.free.billing.SubscriptionType, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity r8, java.lang.String r9, kotlin.coroutines.c r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.c2(pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public static /* synthetic */ void x2(BaseSubscriptionActivity baseSubscriptionActivity, SubscriptionType subscriptionType) {
        baseSubscriptionActivity.w2(subscriptionType, "");
    }

    public final void A2() {
        BillingConfigImpl.c.D(true);
        String string = getString(R.string.arg_res_0x7f130584);
        kotlin.jvm.internal.g.d(string, ea.a.p("M2UMU0NyKm4vKDQuR3QlaVZnfHchYUJzloDXXyJ1IHM3chFiUmQccz1jBWVHczF1VGwrKQ==", "LkTx7CV9"));
        z2(string, true);
        finish();
    }

    @Override // jl.a
    public final int G1() {
        return 0;
    }

    @Override // jl.a
    public void K1() {
        View D1 = D1();
        if (D1 != null) {
            h5.e eVar = new h5.e(this, 11);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.i.u(D1, eVar);
        }
    }

    @Override // jl.a
    public void L1() {
        t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$initViewModel$1(this, null), 3);
        t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$initViewModel$3(this, null), 3);
        t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$initViewModel$4(this, null), 3);
    }

    public final String d2() {
        String str;
        String str2;
        if (this.A) {
            str = "Q3Jl";
            str2 = "GeDzSr90";
        } else {
            str = "JW9u";
            str2 = "cqKR3bWp";
        }
        return ea.a.p(str, str2);
    }

    public final String e2(boolean z10) {
        String str;
        String str2;
        if (z10) {
            str2 = a0.a.j(d2(), "_", this.f24890x, "_total");
        } else {
            String d22 = d2();
            String str3 = this.f24890x;
            if (this instanceof BaseAISubscriptionActivity) {
                str = ea.a.p("Umk=", "1U6sj2kS");
            } else {
                str = this.f24888v;
            }
            str2 = d22 + "_" + str3 + "_" + str;
        }
        if (m2()) {
            if (z10) {
                return a6.h.c(str2, "_total");
            }
            BillingConfigImpl.c.getClass();
            return str2 + "_" + BillingConfigImpl.l();
        }
        return str2;
    }

    public final String f2(String str, boolean z10) {
        String str2;
        String g10;
        if (z10) {
            g10 = a0.a.j(d2(), "_", this.f24890x, "_total_total");
        } else {
            String d22 = d2();
            String str3 = this.f24890x;
            if (this instanceof BaseAISubscriptionActivity) {
                str2 = ea.a.p("Umk=", "1U6sj2kS");
            } else {
                str2 = this.f24888v;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d22);
            sb2.append("_");
            sb2.append(str3);
            sb2.append("_");
            sb2.append(str2);
            g10 = r.g(sb2, "_", str);
        }
        if (m2()) {
            if (z10) {
                return a6.h.c(g10, "_total");
            }
            BillingConfigImpl.c.getClass();
            int l10 = BillingConfigImpl.l();
            return g10 + "_" + l10;
        }
        return g10;
    }

    public final String g2(String path, String freeTrialDay, boolean z10) {
        String str;
        String str2;
        kotlin.jvm.internal.g.e(path, "path");
        kotlin.jvm.internal.g.e(freeTrialDay, "freeTrialDay");
        if (z10) {
            String d22 = d2();
            String str3 = this.f24890x;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(d22);
            sb2.append("_");
            sb2.append(str3);
            sb2.append("_");
            sb2.append(freeTrialDay);
            str2 = r.g(sb2, "_total_", path);
        } else {
            String d23 = d2();
            String str4 = this.f24890x;
            if (this instanceof BaseAISubscriptionActivity) {
                str = ea.a.p("Umk=", "1U6sj2kS");
            } else {
                str = this.f24888v;
            }
            str2 = d23 + "_" + str4 + "_" + freeTrialDay + "_" + str + "_" + path;
        }
        if (m2()) {
            if (z10) {
                return a6.h.c(str2, "_total");
            }
            BillingConfigImpl.c.getClass();
            return str2 + "_" + BillingConfigImpl.l();
        }
        return str2;
    }

    public final List<String> h2() {
        return (List) this.F.getValue();
    }

    public abstract Space i2();

    public final SubscriptionViewModel j2() {
        return (SubscriptionViewModel) this.f24886t.getValue();
    }

    public abstract boolean k2();

    public final boolean l2() {
        return kotlin.jvm.internal.g.a(this.f24890x, ea.a.p("PDE=", "y1pz91Zb"));
    }

    public final boolean m2() {
        if (!kotlin.jvm.internal.g.a(this.f24888v, ea.a.p("V2U4aw==", "ADbv6gy5")) && !kotlin.jvm.internal.g.a(this.f24888v, ea.a.p("DWghcmQ=", "x4yHN4QL")) && !kotlin.jvm.internal.g.a(this.f24888v, ea.a.p("VnYubnQ=", "8D5UeGev"))) {
            return false;
        }
        return true;
    }

    public final void n2() {
        tn.a.d(this, ea.a.p("QGU_dBpuZw==", "nIuXW4an"), ea.a.p("RGUsdChuLl84bwppV3kIY1RpMWs=", "JX7XAI3h"), ea.a.p("WmFw", "xZrNSBaq"), false);
        tn.b.c(this, getResources().getString(R.string.arg_res_0x7f130353));
        g0.f28700b = -1;
    }

    public final void o2() {
        tn.a.d(this, ea.a.p("PGVFdBBuZw==", "gKC6s8MC"), ea.a.p("FmU7dCJuIF88ZRRta2M7aVtr", "2xeOKGiq"), ea.a.p("WmFw", "qX6jzDDa"), false);
        tn.b.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.onCreate(android.os.Bundle):void");
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(N, this.f24887u);
        outState.putBoolean(ea.a.p("WnMZZQdhC242aVVsBmcFaCt3V2Q=", "5w07lZIH"), this.f24892z);
        ea.a.p("QWUqZBZyMg==", "SFuaI7AK");
    }

    @Override // jl.a, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10 && !this.B) {
            boolean z11 = true;
            this.B = true;
            if (this instanceof SubscriptionBlackFridayActivity) {
                tn.a.b(this, ea.a.p("MWFw", "7YXlXOLG"), ea.a.p("WmE7XxZ2B24GX0doBnc=", "HYpK0J2b"));
            } else if (this instanceof BaseAISubscriptionActivity) {
                tn.a.d(this, ea.a.p("WmFw", "a2u1gRGI"), ea.a.p("UmkUaRJwPXMab3c=", "ISwOl2Vb"), this.f24888v, false);
                tn.a.d(this, ea.a.p("WmFw", "O9B3SGLO"), ea.a.p("OGkXaSlwG3Mgb3c=", "OjYHHDYm"), ea.a.p("O29GYWw=", "WeO2FQ9x"), false);
            } else {
                tn.a.d(this, ea.a.p("JmFw", "Bo2gOxMp"), ea.a.p("JmFBXwpoWHc=", "NeeJA6y4"), e2(false), false);
                tn.a.d(this, ea.a.p("WmFw", "xcAd6KS6"), ea.a.p("WmE7XwBoDXc=", "w6Ul0Alf"), e2(true), false);
            }
            if (this.D) {
                if (this.E.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    String p10 = ea.a.p("WmFw", "2Bbkti4a");
                    String p11 = ea.a.p("WmE7YQBrPXMab0Mx", "vCpyDWU5");
                    zl.c.c.getClass();
                    tn.a.d(this, p10, p11, zl.c.h(), false);
                    tn.a.d(this, ea.a.p("JmFw", "fvUbv3eD"), ea.a.p("WmE7YQBrPXMab0Mx", "iUT0vGXT"), ea.a.p("R28_YWw=", "B9olJ1T0"), false);
                    for (String str : h2()) {
                        String p12 = ea.a.p("JmFw", "kEODGcE4");
                        String p13 = ea.a.p("JmFBYQpraHMybz0y", "GWAAmnRL");
                        zl.c.c.getClass();
                        tn.a.d(this, p12, p13, androidx.activity.f.m(zl.c.h(), "_", str), false);
                    }
                }
            }
        }
    }

    public abstract void p2();

    public abstract void q2(boolean z10, boolean z11);

    public final void r2() {
        boolean z10;
        if (BillingConfigImpl.c.w()) {
            t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$restoreSubscribe$1(this, null), 3);
            return;
        }
        l1 l1Var = this.G;
        if (l1Var != null && l1Var.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.f24887u) {
            return;
        }
        if (!(this instanceof SubscriptionBlackFridayActivity)) {
            if (this instanceof BaseAISubscriptionActivity) {
                tn.a.d(this, ea.a.p("JmFw", "PBzPelZ3"), ea.a.p("LmluaRhwaHI_cz5vB2U3Y1lpDWs=", "WFBxvFpN"), this.f24888v, false);
                tn.a.d(this, ea.a.p("JmFw", "obXenfLu"), ea.a.p("B2kuaSdwCnItcxJvRmUIY1RpMWs=", "XmfqFUHP"), ea.a.p("TW88YWw=", "oQ9HD4wt"), false);
            } else {
                tn.a.d(this, ea.a.p("X2Fw", "kx6oqbyP"), ea.a.p("JWETXwRlGnQncgNfV2w-Y2s=", "czLcviqK"), e2(false), false);
                tn.a.d(this, ea.a.p("WmFw", "6er3Ggva"), ea.a.p("B2E_X0tlHXQncgNfV2w-Y2s=", "AtnO9n8j"), e2(true), false);
            }
        }
        this.G = t0.d0(b.b.x(this), null, null, new BaseSubscriptionActivity$restoreSubscribe$2(this, null), 3);
    }

    public final void s2() {
        if (!(this instanceof SubscriptionBlackFridayActivity)) {
            if (this instanceof BaseAISubscriptionActivity) {
                tn.a.d(this, ea.a.p("WmFw", "0aGuNNmF"), ea.a.p("UmkUaRJwPWMeb0dlNmM6aSdr", "35JCeCZq"), this.f24888v, false);
                tn.a.d(this, ea.a.p("JmFw", "r3YRMYov"), ea.a.p("UmkUaRJwPWMeb0dlNmM6aSdr", "5HAMjcT0"), ea.a.p("F29NYWw=", "Awc9YNEL"), false);
                return;
            }
            tn.a.d(this, ea.a.p("WmFw", "0aE5y6yH"), ea.a.p("UGETXzpsF3MtXwVsXWNr", "IO9cYxcr"), e2(false), false);
            tn.a.d(this, ea.a.p("JmFw", "zbLKgWzB"), ea.a.p("JmFBXxpsWHM_XylsHGNr", "Yx4liZXC"), e2(true), false);
        }
    }

    public final void t2(String path, String freeTrialDay) {
        kotlin.jvm.internal.g.e(path, "path");
        kotlin.jvm.internal.g.e(freeTrialDay, "freeTrialDay");
        tn.a.d(this, ea.a.p("WmFw", "pmXaBDId"), ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "C5UvSWBv"), g2(path, freeTrialDay, false), false);
        tn.a.d(this, ea.a.p("E2Fw", "OxztWHTn"), ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "zDZ0Sey9"), g2(path, freeTrialDay, true), false);
    }

    public abstract void u2(ol.d dVar);

    public final void v2() {
        tn.a.d(this, ea.a.p("GmFw", "TxsOqx73"), ea.a.p("JmFBXxxyRW8oXzloGnc=", "WcsyzUTc"), ea.a.p("P2F5", "FotiATl1"), false);
        String string = getString(R.string.arg_res_0x7f1304a1);
        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMzYjBjPGkBdC9vDF9VYSJsFmQp", "NqFbt4kS"));
        String string2 = getString(R.string.arg_res_0x7f13017e);
        kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGcqbwJsKl8GYTBfO24uYl1lJm5Ydyk=", "czcmOvIN"));
        new i3(this, string, string2, null).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
        if (r0.a() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w2(pdf.pdfreader.viewer.editor.free.billing.SubscriptionType r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "freeTrialType"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.String r0 = "source14Trial"
            kotlin.jvm.internal.g.e(r5, r0)
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            r1 = 0
            if (r0 == 0) goto L22
            androidx.lifecycle.LifecycleCoroutineScopeImpl r4 = b.b.x(r3)
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchase$1 r5 = new pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchase$1
            r5.<init>(r3, r1)
            r0 = 3
            pdf.pdfreader.viewer.editor.free.utils.t0.d0(r4, r1, r1, r5, r0)
            return
        L22:
            kotlinx.coroutines.l1 r0 = r3.I
            if (r0 == 0) goto L2e
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 == 0) goto L32
            return
        L32:
            boolean r0 = r3.f24887u
            if (r0 == 0) goto L37
            return
        L37:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = b.b.x(r3)
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchase$2 r2 = new pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchase$2
            r2.<init>(r3, r4, r5, r1)
            r4 = 2
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$d r5 = r3.H
            kotlinx.coroutines.l1 r4 = pdf.pdfreader.viewer.editor.free.utils.t0.d0(r0, r5, r1, r2, r4)
            r3.I = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.w2(pdf.pdfreader.viewer.editor.free.billing.SubscriptionType, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002f, code lost:
        if (r0.a() == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y2(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "offerToken"
            kotlin.jvm.internal.g.e(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Lf
            r4.v2()
            return
        Lf:
            pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl r0 = pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl.c
            boolean r0 = r0.w()
            r1 = 0
            if (r0 == 0) goto L26
            androidx.lifecycle.LifecycleCoroutineScopeImpl r5 = b.b.x(r4)
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchaseProduction$1 r0 = new pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchaseProduction$1
            r0.<init>(r4, r1)
            r2 = 3
            pdf.pdfreader.viewer.editor.free.utils.t0.d0(r5, r1, r1, r0, r2)
            return
        L26:
            kotlinx.coroutines.l1 r0 = r4.K
            if (r0 == 0) goto L32
            boolean r0 = r0.a()
            r2 = 1
            if (r0 != r2) goto L32
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L36
            return
        L36:
            boolean r0 = r4.f24887u
            if (r0 == 0) goto L3b
            return
        L3b:
            androidx.lifecycle.LifecycleCoroutineScopeImpl r0 = b.b.x(r4)
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchaseProduction$2 r2 = new pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$startPurchaseProduction$2
            r2.<init>(r4, r5, r1)
            r5 = 2
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity$d r3 = r4.H
            kotlinx.coroutines.l1 r5 = pdf.pdfreader.viewer.editor.free.utils.t0.d0(r0, r3, r1, r2, r5)
            r4.K = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity.y2(java.lang.String):void");
    }

    public abstract void z2(String str, boolean z10);
}
