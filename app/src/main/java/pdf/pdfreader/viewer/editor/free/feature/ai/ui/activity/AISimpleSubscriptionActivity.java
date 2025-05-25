package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.m0;
import com.facebook.ads.AdError;
import kotlin.coroutines.CoroutineContext;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.billing.exception.BillingException;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;

/* compiled from: AISimpleSubscriptionActivity.kt */
/* loaded from: classes3.dex */
public abstract class AISimpleSubscriptionActivity extends jl.a {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f24420y = 0;

    /* renamed from: t  reason: collision with root package name */
    public final androidx.lifecycle.k0 f24421t = new androidx.lifecycle.k0(kotlin.jvm.internal.i.a(SubscriptionViewModel.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("OWlUdzRvU2U2Uz5vB2U=", "QWI6ggDJ"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("K2VXYQxsQ1YzZT1NGmQNbGVyAXYsZAByfmE0dAdyeQ==", "2t1F8Why"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity$special$$inlined$viewModels$default$3
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
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlInRdb19FO3Q9YXM=", "DYdXC41C"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public String f24422u = "";

    /* renamed from: v  reason: collision with root package name */
    public boolean f24423v = BillingConfigImpl.c.w();

    /* renamed from: w  reason: collision with root package name */
    public final b f24424w = new b(this);

    /* renamed from: x  reason: collision with root package name */
    public kotlinx.coroutines.l1 f24425x;

    /* compiled from: AISimpleSubscriptionActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24426a;

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
            f24426a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements kotlinx.coroutines.u {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AISimpleSubscriptionActivity f24427b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity r2) {
            /*
                r1 = this;
                kotlinx.coroutines.u$a r0 = kotlinx.coroutines.u.a.f20269a
                r1.f24427b = r2
                r1.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity.b.<init>(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity):void");
        }

        @Override // kotlinx.coroutines.u
        public final void R(CoroutineContext coroutineContext, Throwable th2) {
            th2.printStackTrace();
            AISimpleSubscriptionActivity aISimpleSubscriptionActivity = this.f24427b;
            if (!aISimpleSubscriptionActivity.isFinishing() && (th2 instanceof BillingException)) {
                AISimpleSubscriptionActivity.a2(aISimpleSubscriptionActivity, (BillingException) th2);
            }
        }
    }

    public static final void a2(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, BillingException billingException) {
        if (!aISimpleSubscriptionActivity.isFinishing()) {
            switch (billingException.getErrorCode()) {
                case AdError.CACHE_ERROR_CODE /* 2002 */:
                    String string = aISimpleSubscriptionActivity.getString(R.string.arg_res_0x7f1304a1);
                    kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMwYhZjCGkZdANvAV8pYVhsHGQp", "r6Yzzijo"));
                    aISimpleSubscriptionActivity.g2(string, false);
                    return;
                case AdError.INTERNAL_ERROR_2003 /* 2003 */:
                    pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(aISimpleSubscriptionActivity), null, null, new AISimpleSubscriptionActivity$checkBillingException$1(aISimpleSubscriptionActivity, null), 3);
                    return;
                case AdError.INTERNAL_ERROR_2004 /* 2004 */:
                case 2005:
                case AdError.INTERNAL_ERROR_2006 /* 2006 */:
                    String string2 = aISimpleSubscriptionActivity.getString(R.string.arg_res_0x7f1302b0);
                    kotlin.jvm.internal.g.d(string2, ea.a.p("D2VNUzNyDG4vKDQuR3QlaVZnfG4sdEFvBmsuZSNyLXI3cFVzGHQXeSk=", "W4h9Geug"));
                    aISimpleSubscriptionActivity.g2(string2, false);
                    return;
                case 2007:
                case AdError.REMOTE_ADS_SERVICE_ERROR /* 2008 */:
                    if (billingException.getErrorCode() == 2007) {
                        BillingConfigImpl.c.D(false);
                    }
                    if (ge.h.a(aISimpleSubscriptionActivity)) {
                        aISimpleSubscriptionActivity.e2();
                        return;
                    }
                    String string3 = aISimpleSubscriptionActivity.getString(R.string.arg_res_0x7f1302b0);
                    kotlin.jvm.internal.g.d(string3, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jdDRvFGsMZQRyGnJscCdzLHQQeSk=", "fSvuEQJH"));
                    aISimpleSubscriptionActivity.g2(string3, false);
                    return;
                default:
                    String string4 = aISimpleSubscriptionActivity.getString(R.string.arg_res_0x7f1304a1);
                    kotlin.jvm.internal.g.d(string4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMzYjBjG2k6dCFvP19VYSJsFmQp", "iJHQU8b0"));
                    aISimpleSubscriptionActivity.g2(string4, false);
                    return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ab  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b2(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity r17, pdf.pdfreader.viewer.editor.free.billing.SubscriptionType r18, java.lang.String r19, kotlin.coroutines.c r20) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity.b2(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity, pdf.pdfreader.viewer.editor.free.billing.SubscriptionType, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    public static void f2(AISimpleSubscriptionActivity aISimpleSubscriptionActivity, String str) {
        SubscriptionType freeTrialType = SubscriptionType.YEAR_TRIAL_7D;
        aISimpleSubscriptionActivity.getClass();
        kotlin.jvm.internal.g.e(freeTrialType, "freeTrialType");
        boolean z10 = false;
        tn.a.d(aISimpleSubscriptionActivity, ea.a.p("JmFw", "C4yhvUPm"), ea.a.p("WmE7XwZuDm8Ra2tjBWk1aw==", "IqiaBkrv"), str, false);
        if (BillingConfigImpl.c.w()) {
            pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(aISimpleSubscriptionActivity), null, null, new AISimpleSubscriptionActivity$startPurchase$1(aISimpleSubscriptionActivity, null), 3);
            return;
        }
        kotlinx.coroutines.l1 l1Var = aISimpleSubscriptionActivity.f24425x;
        if (l1Var != null && l1Var.a()) {
            z10 = true;
        }
        if (!z10) {
            aISimpleSubscriptionActivity.f24425x = pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(aISimpleSubscriptionActivity), aISimpleSubscriptionActivity.f24424w, null, new AISimpleSubscriptionActivity$startPurchase$2(aISimpleSubscriptionActivity, freeTrialType, str, null), 2);
        }
    }

    @Override // jl.a
    public void L1() {
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AISimpleSubscriptionActivity$initViewModel$1(this, null), 3);
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AISimpleSubscriptionActivity$initViewModel$2(this, null), 3);
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AISimpleSubscriptionActivity$initViewModel$3(this, null), 3);
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AISimpleSubscriptionActivity$initViewModel$4(this, null), 3);
    }

    public abstract void c2();

    public abstract void d2(ol.d dVar);

    public final void e2() {
        String string = getString(R.string.arg_res_0x7f1304a1);
        kotlin.jvm.internal.g.d(string, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMwYhZjFWkfdAJvCF8pYVhsHGQp", "2shQgokf"));
        String string2 = getString(R.string.arg_res_0x7f13017e);
        kotlin.jvm.internal.g.d(string2, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGcqbwJsLF8_YT9fJW4uYl1lJm5Ydyk=", "uuJkIOFP"));
        new i3(this, string, string2, null).show();
    }

    public abstract void g2(String str, boolean z10);

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f24422u = pdf.pdfreader.viewer.editor.free.utils.c1.e(this);
        super.onCreate(bundle);
    }
}
