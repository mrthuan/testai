package pdf.pdfreader.viewer.editor.free.feature.guide.ui;

import am.y;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.n;
import androidx.activity.s;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import com.google.android.tools.InstallReferrerUtil;
import ea.a;
import ig.h;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import kotlin.text.k;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.FullScreenManage;
import pdf.pdfreader.viewer.editor.free.ads.e;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.inquiry.InquiryAfterGuideFragment;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel;
import pdf.pdfreader.viewer.editor.free.feature.guide.vm.UserGuideViewModel;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.c;
import x0.f0;
import x0.n0;

/* compiled from: UserGuideActivity.kt */
/* loaded from: classes3.dex */
public final class UserGuideActivity extends jl.a {

    /* renamed from: y  reason: collision with root package name */
    public static final a f24980y;

    /* renamed from: z  reason: collision with root package name */
    public static final String f24981z;

    /* renamed from: t  reason: collision with root package name */
    public final k0 f24982t = new k0(i.a(UserGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            g.d(viewModelStore, a.p("GWkgdwxvXGUkUxJvRmU=", "TfoEA8qR"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, a.p("K2VXYQxsQ1YzZT1NGmQNbGVyAXYsZAByE2EpdCZyeQ==", "Zkw2UJIO"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$3
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
                g.d(defaultViewModelCreationExtras, a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlBHQcbwBFSnQ9YXM=", "uDZreun2"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final k0 f24983u = new k0(i.a(InquiryAfterGuideViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            g.d(viewModelStore, a.p("OWlUdzRvU2U2Uz5vB2U=", "RtpD8p8f"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, a.p("K2VXYQxsQ1YzZT1NGmQNbGVyAXYsZAByLGE1dAJyeQ==", "W1zXjVmx"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$special$$inlined$viewModels$default$6
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
                g.d(defaultViewModelCreationExtras, a.p("O2hYc1dkUmY7dSZ0I2kNd3hvCmUpQxdlNnQqbwhFNXQ9YXM=", "TZisWCfM"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: v  reason: collision with root package name */
    public final c f24984v = kotlin.a.a(new cg.a<y>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final y invoke() {
            View inflate = UserGuideActivity.this.getLayoutInflater().inflate(R.layout.activity_user_guide, (ViewGroup) null, false);
            if (inflate != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                return new y(constraintLayout, constraintLayout);
            }
            throw new NullPointerException(a.p("QW8kdCVpB3c=", "0nExg8bi"));
        }
    });

    /* renamed from: w  reason: collision with root package name */
    public boolean f24985w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f24986x;

    /* compiled from: UserGuideActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, Intent intent, boolean z10) {
            g.e(context, "context");
            zl.c.c.getClass();
            zl.c.k(true);
            zl.c.f32419f.c(zl.c.f32417d[1], Boolean.FALSE);
            ea.a.p("PXMNciJ1WGQtQQV0XXY-dHk=", "H3hhe1up");
            zl.c.j();
            zl.c.i();
            if (!z10) {
                intent.setClass(context, UserGuideActivity.class);
            }
        }
    }

    /* compiled from: UserGuideActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends n {
        public b() {
            super(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
        /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        @Override // androidx.activity.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r5 = this;
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity r0 = pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity.this
                androidx.fragment.app.g0 r1 = r0.getSupportFragmentManager()
                java.util.List r1 = r1.H()
                java.lang.String r2 = "QHU7cBxyFkYAYVNtDG4iTSVuU2cjcm1mR2ExbRZuRHM="
                java.lang.String r3 = "5Vs0kKAK"
                java.lang.String r2 = ea.a.p(r2, r3)
                kotlin.jvm.internal.g.d(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L1b:
                boolean r2 = r1.hasNext()
                r3 = 0
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()
                r4 = r2
                androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
                boolean r4 = r4 instanceof pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
                if (r4 == 0) goto L1b
                goto L2f
            L2e:
                r2 = r3
            L2f:
                boolean r1 = r2 instanceof pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment
                if (r1 == 0) goto L36
                r3 = r2
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment r3 = (pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.BaseUserGuideTestFragment) r3
            L36:
                if (r3 == 0) goto L5a
                boolean r1 = r3.Z
                if (r1 != 0) goto L3d
                goto L47
            L3d:
                androidx.viewpager2.widget.ViewPager2 r1 = r3.B0()
                int r2 = r1.getCurrentItem()
                if (r2 != 0) goto L49
            L47:
                r1 = 0
                goto L53
            L49:
                int r2 = r1.getCurrentItem()
                r3 = 1
                int r2 = r2 - r3
                r1.setCurrentItem(r2)
                r1 = r3
            L53:
                if (r1 == 0) goto L56
                return
            L56:
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity.a2(r0)
                goto L75
            L5a:
                androidx.lifecycle.k0 r1 = r0.f24983u
                java.lang.Object r2 = r1.getValue()
                pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel r2 = (pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel) r2
                boolean r2 = r2.d()
                if (r2 == 0) goto L72
                java.lang.Object r0 = r1.getValue()
                pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel r0 = (pdf.pdfreader.viewer.editor.free.feature.guide.vm.InquiryAfterGuideViewModel) r0
                r0.f()
                goto L75
            L72:
                r0.c2()
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.guide.ui.UserGuideActivity.b.a():void");
        }
    }

    static {
        ea.a.p("ZnMucjR1C2QXQVd0AHY_dHk=", "EKSaaGOS");
        f24981z = ea.a.p("WGUyXxVyDW0tdUdlG18xdS1kZQ==", "Nqw2865I");
        f24980y = new a();
    }

    public static final void a2(UserGuideActivity userGuideActivity) {
        Object obj;
        userGuideActivity.getClass();
        ea.a.p("JXVccDdlT3QKYS1lOnI7aFp3J240dQxyeQ==", "XDoZNLnm");
        String r4 = c1.r(userGuideActivity);
        f.b(userGuideActivity).getClass();
        c cVar = InstallReferrerUtil.f13468a;
        if (k.O(r4, String.valueOf(InstallReferrerUtil.d()), false)) {
            userGuideActivity.c2();
            return;
        }
        List<Fragment> H = userGuideActivity.getSupportFragmentManager().H();
        g.d(H, ea.a.p("O3U8cFxyDEY6YQFtUW4jTVluM2cschhmBmEWbTRuNnM=", "8VHL3xUO"));
        Iterator<T> it = H.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Fragment) obj) instanceof InquiryAfterGuideFragment) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            zl.c.c.getClass();
            zl.c.k(false);
            h<Object>[] hVarArr = zl.c.f32417d;
            zl.c.f32419f.c(hVarArr[1], Boolean.TRUE);
            zl.c.f32420g.c(hVarArr[2], 0);
            zl.c.f32421h.c(hVarArr[3], 0);
            InquiryAfterGuideFragment.a aVar = InquiryAfterGuideFragment.f25030e0;
            g0 supportFragmentManager = userGuideActivity.getSupportFragmentManager();
            g.d(supportFragmentManager, ea.a.p("QHU7cBxyFkYAYVNtDG4iTSVuU2cjcg==", "0Cp3teL5"));
            int id2 = userGuideActivity.b2().f1659b.getId();
            aVar.getClass();
            InquiryAfterGuideFragment.a.a(supportFragmentManager, id2, true);
            return;
        }
        userGuideActivity.c2();
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = b2().f1658a;
        g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "05MRvqro"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final int G1() {
        return 0;
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
        int i10;
        if (!this.f19294h) {
            Window window = getWindow();
            if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
                i10 = -16580088;
            } else {
                i10 = -1;
            }
            window.setNavigationBarColor(i10);
        }
        f.b(this).getClass();
        ((UserGuideViewModel) this.f24982t.getValue()).f25050d = f.f();
    }

    @Override // jl.a
    public final void K1() {
        ConstraintLayout constraintLayout = b2().f1659b;
        androidx.appcompat.libconvert.a aVar = new androidx.appcompat.libconvert.a(this, 15);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(constraintLayout, aVar);
        if (getSupportFragmentManager().H().isEmpty()) {
            if (((UserGuideViewModel) this.f24982t.getValue()).f25050d && !BillingConfigImpl.c.w() && !s.x(this) && c1.k(this)) {
                BaseUserGuideTestFragment.a aVar2 = BaseUserGuideTestFragment.f24996h0;
                g0 supportFragmentManager = getSupportFragmentManager();
                g.d(supportFragmentManager, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcg==", "8ZpxPock"));
                int id2 = b2().f1659b.getId();
                aVar2.getClass();
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.c.f25023j0.getClass();
                pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.c cVar = new pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.c();
                androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                aVar3.d(id2, cVar, pdf.pdfreader.viewer.editor.free.feature.guide.ui.fragment.c.f25024k0);
                aVar3.i();
                return;
            }
            zl.c.c.getClass();
            if (zl.c.j()) {
                BaseUserGuideTestFragment.a aVar4 = BaseUserGuideTestFragment.f24996h0;
                g0 supportFragmentManager2 = getSupportFragmentManager();
                g.d(supportFragmentManager2, ea.a.p("QHU7cBxyFkYAYVNtDG4iTSVuU2cjcg==", "MvDlaNQJ"));
                int id3 = b2().f1659b.getId();
                aVar4.getClass();
                d.f25027j0.getClass();
                d dVar = new d();
                androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager2);
                aVar5.d(id3, dVar, d.f25028k0);
                aVar5.i();
                return;
            }
            h<Object>[] hVarArr = zl.c.f32417d;
            int intValue = ((Number) zl.c.f32421h.b(hVarArr[3])).intValue();
            zl.c.f32420g.c(hVarArr[2], Integer.valueOf(intValue));
            InquiryAfterGuideFragment.a aVar6 = InquiryAfterGuideFragment.f25030e0;
            g0 supportFragmentManager3 = getSupportFragmentManager();
            g.d(supportFragmentManager3, ea.a.p("QHU7cBxyFkYAYVNtDG4iTSVuU2cjcg==", "H5G0JxHK"));
            int id4 = b2().f1659b.getId();
            aVar6.getClass();
            InquiryAfterGuideFragment.a.a(supportFragmentManager3, id4, false);
        }
    }

    @Override // jl.a
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new UserGuideActivity$initViewModel$1(this, null), 3);
        t0.d0(b.b.x(this), null, null, new UserGuideActivity$initViewModel$2(this, null), 3);
    }

    public final y b2() {
        return (y) this.f24984v.getValue();
    }

    public final void c2() {
        String p10;
        ea.a.p("DHVUcBxlAnQYYQFl", "jkf9RzXo");
        if (((UserGuideViewModel) this.f24982t.getValue()).f25050d && !this.f24986x) {
            if (BillingConfigImpl.c.w()) {
                String p11 = ea.a.p("Q3IubRp1DyAHc1FyRSAlay1wEmczaSdlIHVfbBdkc3Nbb3c=", "f3VS1V38");
                int i10 = zk.a.f32399a;
                t1.b(p11);
            } else if (FullScreenManage.c(5, this, false)) {
                this.f24986x = true;
                e.m().n(this, null);
                return;
            }
        }
        if (this.f24985w) {
            return;
        }
        this.f24985w = true;
        zl.c.c.getClass();
        zl.c.k(false);
        zl.c.f32419f.c(zl.c.f32417d[1], Boolean.FALSE);
        Intent intent = new Intent(this, ReaderHomeActivity.class);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            ge.a.s(intent2, intent, ea.a.p("JGE2ZS5mG28lMg==", "9UTQqi4V"));
            pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a.getClass();
            if (!i.a.a(this, intent2, intent)) {
                if (intent2.hasExtra(ea.a.p("K2VUcCZsXm4_XyJhBXARX1tlGV88ZQRyPDJ8MkNfCXIgbQ==", "gOOFcLvo")) && intent2.getBooleanExtra(ea.a.p("K2VUcCZsXm4_XyJhBXARX1tlGV88ZQRyHDJAMlhfFHIgbQ==", "LAu2Cpmr"), false)) {
                    p10 = ea.a.p("FnYnbnQ=", "96sByebU");
                } else {
                    p10 = ea.a.p("K2VCaw==", "mOCdtepQ");
                }
                i.a.b(this, intent, p10, SubscriptionDarkTestFActivity.class);
            }
        }
        ComponentName component = intent.getComponent();
        if (component != null && !g.a(component.getClassName(), ReaderHomeActivity.class.getName())) {
            intent.putExtra(f24981z, true);
        }
        startActivity(intent);
        finish();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            zl.c.c.getClass();
            if (!zl.c.j() && !zl.c.i()) {
                finish();
                return;
            }
        }
        boolean z10 = true;
        this.f19294h = true;
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
        }
        Intent intent = getIntent();
        if ((intent == null || !intent.hasExtra(ea.a.p("X2ElZwZhBWUtclFjCGw6XypvRmkgaSBhI2khbil0Jmc=", "WNvGm5nk"))) ? false : false) {
            ReaderPdfApplication.f();
            pdf.pdfreader.viewer.editor.free.service.b.d();
            EventCenter.f28658e = ea.a.p("Am9NaQ==", "9Fl9kLFO");
            if (bundle == null) {
                EventCenter.sendLanguageRecallClickEvent(this, getIntent());
            }
        }
        getOnBackPressedDispatcher().a(this, new b());
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f24986x) {
            c2();
        }
    }

    @Override // jl.a
    public final void C1() {
    }
}
