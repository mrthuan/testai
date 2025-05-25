package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import am.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.activity.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import cg.l;
import com.google.android.play.core.assetpacks.b1;
import java.util.Collection;
import java.util.HashSet;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.h3;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.c;
import tf.d;
import x0.f0;
import x0.n0;

/* compiled from: OCRResultActivity.kt */
/* loaded from: classes3.dex */
public final class OCRResultActivity extends jl.a {

    /* renamed from: t  reason: collision with root package name */
    public final c f25104t = kotlin.a.a(new cg.a<t>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final t invoke() {
            return t.a(OCRResultActivity.this.getLayoutInflater());
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final k0 f25105u = new k0(i.a(OCRResultViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "3tn1SLaR"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("V2UtYQZsFlYbZUNNBmQzbBRyXXYvZCZydGE0dF1yeQ==", "2W23JtaT"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$special$$inlined$viewModels$default$3
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
                g.d(defaultViewModelCreationExtras, ea.a.p("R2gic11kB2YTdVh0P2kzdwlvVmUqQzFlVHRcbxpFL3RBYXM=", "55tW57tS"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: v  reason: collision with root package name */
    public h3 f25106v;

    /* renamed from: w  reason: collision with root package name */
    public OCRWorkFlow f25107w;

    /* renamed from: y  reason: collision with root package name */
    public static final String f25102y = ea.a.p("JGVIXxZjRV8oZTl1GXQ3ZkdvbQ==", "wvwfgOWN");

    /* renamed from: z  reason: collision with root package name */
    public static final String f25103z = ea.a.p("WGUyXxxjEF8RdUZyDG4iXzRhVWU=", "U5CW9QfC");

    /* renamed from: x  reason: collision with root package name */
    public static final a f25101x = new a();

    /* compiled from: OCRResultActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, OCRWorkFlow oCRWorkFlow, int i10) {
            g.e(context, "context");
            Intent intent = new Intent(context, OCRResultActivity.class);
            if (oCRWorkFlow != null) {
                intent.putExtra(ea.a.p("JGVIXxZjRV8oZTl1GXQ3ZkdvbQ==", "rRAPEl2L"), oCRWorkFlow.name());
                intent.putExtra(ea.a.p("WGUyXxxjEF8RdUZyDG4iXzRhVWU=", "YS8bG6T2"), i10);
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: OCRResultActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25108a;

        static {
            int[] iArr = new int[OCRWorkFlow.values().length];
            try {
                iArr[OCRWorkFlow.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OCRWorkFlow.IMG2PDF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OCRWorkFlow.SCAN2PDF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25108a = iArr;
        }
    }

    public static final void a2(OCRResultActivity oCRResultActivity) {
        Fragment D = oCRResultActivity.getSupportFragmentManager().D(ea.a.p("AENjUxxsUmMuVC94AUYaYVJtC250", "Qb3oWOIz"));
        if (D != null) {
            g0 supportFragmentManager = oCRResultActivity.getSupportFragmentManager();
            g.d(supportFragmentManager, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcg==", "QYx6Jgm2"));
            ge.a.R(supportFragmentManager, D);
            OCRResultViewModel b22 = oCRResultActivity.b2();
            String p10 = ea.a.p("XGM5Qh9vAWs0bFV0HWVu", "Y2m0DBie");
            b22.f25234d.c(EmptyList.INSTANCE, p10);
            return;
        }
        HashSet<String> hashSet = OCREventCenter.c;
        if (!hashSet.contains(ea.a.p("IGNDXx1pRGM7ci5fBmgHdw==", "dlEVEGQD"))) {
            Context c = r.c("XGM5XxdpEWMTclBfGmg5dw==", "S8i6BNxD", hashSet);
            OCREventCenter.b(c, a0.a.i("UnA7bBpjA3Qbb1pDBm4iZTx0", "SmX04PMB", c, "IGNy", "fTLxFLEF"), ea.a.p("IGNDXx1pRGM7ci5fBmgHdw==", "EfVICg3t"));
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        h3 h3Var = oCRResultActivity.f25106v;
        if (h3Var != null) {
            h3Var.show();
            return;
        }
        String string = oCRResultActivity.getResources().getString(R.string.arg_res_0x7f130100);
        g.d(string, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ02oDyZDFlFXQ9YVJ0HGRodD94Pl8UcwNfUnAaKQ==", "W2W38Tnm"));
        String string2 = oCRResultActivity.getResources().getString(R.string.arg_res_0x7f130101);
        g.d(string2, ea.a.p("PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ02oDeZBRlKXQ9YVJ0HGRodD94Pl8RZRtfUnAaKQ==", "PLcC8xKQ"));
        h3 h3Var2 = new h3(oCRResultActivity, string, string2, null);
        h3Var2.f23542t = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.b(ref$BooleanRef, oCRResultActivity);
        h3Var2.show();
        oCRResultActivity.f25106v = h3Var2;
        h3Var2.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.a(ref$BooleanRef, 1));
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = ((t) this.f25104t.getValue()).f1460a;
        g.d(constraintLayout, ea.a.p("AGk6ZBhuLi46bwl0", "eibTqIm3"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
        OCRWorkFlow oCRWorkFlow;
        boolean z10;
        int i10 = -1;
        if (this.c && ReaderPdfApplication.f23865q == -1) {
            Collection collection = (Collection) pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b.d();
            if (collection != null && !collection.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                ReaderPdfApplication.f23865q = Process.myPid();
                Intent intent = new Intent(this, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "jrgack22"), true);
                startActivity(intent);
                finish();
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f();
            }
        }
        String stringExtra = getIntent().getStringExtra(f25102y);
        if (stringExtra != null) {
            oCRWorkFlow = OCRWorkFlow.valueOf(stringExtra);
        } else {
            oCRWorkFlow = null;
        }
        this.f25107w = oCRWorkFlow;
        if (oCRWorkFlow != null) {
            i10 = b.f25108a[oCRWorkFlow.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
                AppCoreFilterEvent.h(ea.a.p("ImNFXzFlGHUkdDl2XWV3", "nVM7CkWl"));
                return;
            }
            AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("NWMiXyttUzI4ZABfRmUkdVR0DXYgZXc=", "r7ZPB47R"));
            return;
        }
        AppOpenSource appOpenSource3 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("XGM5XwNhBWUtclFzHGwiXzJpV3c=", "fSPWk7wc"));
    }

    @Override // jl.a
    public final void K1() {
        b1.Y();
        tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZvVHIFZCVuZQ==", "kIUtw3fG"));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        g.d(onBackPressedDispatcher, ea.a.p("XG4JYRBrMnIXc0dlDUQ_czRhRmMuZXI=", "DGgSDyby"));
        b1.m(onBackPressedDispatcher, this, new l<n, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRResultActivity$initView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(n nVar) {
                invoke2(nVar);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(n addCallback) {
                g.e(addCallback, "$this$addCallback");
                OCRResultActivity.a2(OCRResultActivity.this);
            }
        }, 2);
        c cVar = this.f25104t;
        ConstraintLayout constraintLayout = ((t) cVar.getValue()).f1461b;
        com.google.android.tools.d dVar = new com.google.android.tools.d(this, 14);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(constraintLayout, dVar);
        if (getSupportFragmentManager().H().isEmpty()) {
            OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
            g0 supportFragmentManager = getSupportFragmentManager();
            g.d(supportFragmentManager, ea.a.p("PHVBcBZyQ0YoYS1tEG4cTVRuD2cgcg==", "vLKe6fn2"));
            int id2 = ((t) cVar.getValue()).f1461b.getId();
            Intent intent = getIntent();
            int i10 = 0;
            if (intent != null) {
                i10 = intent.getIntExtra(f25103z, 0);
            }
            OCRWorkFlow oCRWorkFlow = this.f25107w;
            aVar.getClass();
            OCRResultFragment oCRResultFragment = new OCRResultFragment();
            Bundle bundle = new Bundle();
            bundle.putInt(ea.a.p("WGUyXxxjEF8RdUZyDG4iXzRhVWU=", "8mbBNb60"), i10);
            if (oCRWorkFlow != null) {
                bundle.putString(ea.a.p("A2U-XzdjJ186ZRV1WHQIZkpvbQ==", "dqhGXUxf"), oCRWorkFlow.name());
            }
            oCRResultFragment.j0(bundle);
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.d(id2, oCRResultFragment, ea.a.p("CUMjUglzJGw8RhRhU20ybnQ=", "uEFqlQdy"));
            aVar2.i();
        }
    }

    @Override // jl.a
    public final void L1() {
        t0.d0(b.b.x(this), null, null, new OCRResultActivity$initViewModel$1(this, null), 3);
        t0.d0(b.b.x(this), null, null, new OCRResultActivity$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new OCRResultActivity$initViewModel$3(this, null), 3);
    }

    @Override // jl.a
    public final void O1(boolean z10) {
        b2().k(z10);
    }

    public final OCRResultViewModel b2() {
        return (OCRResultViewModel) this.f25105u.getValue();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c cVar = OCREventCenter.f28670a;
        OCREventCenter.c.clear();
    }

    @Override // jl.a
    public final void C1() {
    }
}
