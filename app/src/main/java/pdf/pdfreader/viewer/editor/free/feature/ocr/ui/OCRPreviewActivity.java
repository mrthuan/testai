package pdf.pdfreader.viewer.editor.free.feature.ocr.ui;

import am.t;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.g0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import cg.l;
import com.google.android.play.core.assetpacks.b1;
import h5.e;
import java.util.Collection;
import java.util.WeakHashMap;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRPreviewFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.CameraActivity;
import pdf.pdfreader.viewer.editor.free.repo.convert.ImageConvertDataRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.h3;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.c;
import tf.d;
import x0.f0;
import x0.n0;

/* compiled from: OCRPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class OCRPreviewActivity extends jl.a {

    /* renamed from: t  reason: collision with root package name */
    public final c f25094t = kotlin.a.a(new cg.a<t>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final t invoke() {
            return t.a(OCRPreviewActivity.this.getLayoutInflater());
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final k0 f25095u = new k0(i.a(OCRPreviewViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = ComponentActivity.this.getViewModelStore();
            g.d(viewModelStore, ea.a.p("RWkudz5vBmUeU0BvG2U=", "qn0ks7YZ"));
            return viewModelStore;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = ComponentActivity.this.getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("K2ULYQRsPVYhZRFNW2QybGhyPXYgZFNyMmESdD5yeQ==", "BROmqIY4"));
            return defaultViewModelProviderFactory;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$special$$inlined$viewModels$default$3
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
                g.d(defaultViewModelCreationExtras, ea.a.p("Fmgcc0pkCGYpdQp0Ymkyd3VvNmUlQ0RlFXQYbz9FOnQQYXM=", "D7budmLZ"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    });

    /* renamed from: v  reason: collision with root package name */
    public h3 f25096v;

    /* renamed from: w  reason: collision with root package name */
    public OCRWorkFlow f25097w;

    /* renamed from: y  reason: collision with root package name */
    public static final String f25093y = ea.a.p("WGUyXxxjEF8CclF2AGUhXyJyXW0=", "o5OO56UH");

    /* renamed from: x  reason: collision with root package name */
    public static final a f25092x = new a();

    /* compiled from: OCRPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(jl.a context, OCRWorkFlow workflow) {
            g.e(context, "context");
            g.e(workflow, "workflow");
            Intent intent = new Intent(context, OCRPreviewActivity.class);
            intent.putExtra(ea.a.p("JGVIXxZjRV8qci92HGUfX1NyAW0=", "c8nXGvUu"), workflow.name());
            context.startActivity(intent);
        }
    }

    /* compiled from: OCRPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25098a;

        static {
            int[] iArr = new int[OCRWorkFlow.values().length];
            try {
                iArr[OCRWorkFlow.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25098a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a2(pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity r5) {
        /*
            pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow r0 = r5.f25097w
            pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow r1 = pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow.PREVIEW
            if (r0 != r1) goto L42
            androidx.lifecycle.k0 r0 = r5.f25095u
            java.lang.Object r0 = r0.getValue()
            pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel r0 = (pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRPreviewViewModel) r0
            androidx.lifecycle.w r0 = pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b
            java.lang.Object r0 = r0.d()
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L3a
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            um.a r1 = (um.a) r1
            ul.c r1 = r1.f30437f
            int r2 = r1.f30425a
            if (r2 != 0) goto L38
            boolean r2 = r1.f30428e
            if (r2 == 0) goto L38
            boolean r1 = r1.f30427d
            if (r1 == 0) goto L1e
        L38:
            r0 = 1
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L3e
            goto L42
        L3e:
            r5.b2()
            goto L97
        L42:
            pdf.pdfreader.viewer.editor.free.ui.dialog.h3 r0 = r5.f25096v
            if (r0 == 0) goto L4c
            r0.show()
            tf.d r0 = tf.d.f30009a
            goto L4d
        L4c:
            r0 = 0
        L4d:
            if (r0 != 0) goto L97
            pdf.pdfreader.viewer.editor.free.ui.dialog.h3 r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.h3
            android.content.res.Resources r1 = r5.getResources()
            r2 = 2131952860(0x7f1304dc, float:1.9542175E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r2 = "A2UnbxFyVGU7LgFlQFMjclFuNSgbLkV0loDXbyRjKl8DZTlvEmVocT1pEl9VczxfX3AmKQ=="
            java.lang.String r3 = "s1qTd7nN"
            java.lang.String r2 = ea.a.p(r2, r3)
            kotlin.jvm.internal.g.d(r1, r2)
            android.content.res.Resources r2 = r5.getResources()
            r3 = 2131952475(0x7f13035b, float:1.9541394E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.String r3 = "PWVCbwxyVGUpLi1lAVMcclxuCSgXLhZ0joD-Xz5lQHQQZUl0C2FUdDNvJF8UcwNfUnAaKQ=="
            java.lang.String r4 = "A4OYlXJ8"
            java.lang.String r3 = ea.a.p(r3, r4)
            kotlin.jvm.internal.g.d(r2, r3)
            android.content.res.Resources r3 = r5.getResources()
            r4 = 2131952473(0x7f130359, float:1.954139E38)
            java.lang.String r3 = r3.getString(r4)
            r0.<init>(r5, r1, r2, r3)
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.a r1 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.a
            r1.<init>(r5)
            r0.f23542t = r1
            r0.show()
            r5.f25096v = r0
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity.a2(pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity):void");
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = ((t) this.f25094t.getValue()).f1460a;
        g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "SF14iwjk"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
        OCRWorkFlow oCRWorkFlow;
        int i10;
        String stringExtra;
        Intent intent = getIntent();
        if (intent != null && (stringExtra = intent.getStringExtra(f25093y)) != null) {
            oCRWorkFlow = OCRWorkFlow.valueOf(stringExtra);
        } else {
            oCRWorkFlow = null;
        }
        this.f25097w = oCRWorkFlow;
        if (oCRWorkFlow == null) {
            i10 = -1;
        } else {
            i10 = b.f25098a[oCRWorkFlow.ordinal()];
        }
        if (i10 == 1) {
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.h(ea.a.p("VmMLX0dhMmUXYQp0UXIIdlFldw==", "ii9y7UFJ"));
            return;
        }
        AppOpenSource appOpenSource2 = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.h(ea.a.p("XGM5XxJkCF8EaVF3", "KChakO7V"));
    }

    @Override // jl.a
    public final void K1() {
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        g.d(onBackPressedDispatcher, ea.a.p("IG5zYRprZ3I_czllEUQBc0VhGmMtZXI=", "I181wtMo"));
        b1.m(onBackPressedDispatcher, this, new l<n, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.OCRPreviewActivity$initView$1
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
                OCRPreviewActivity.a2(OCRPreviewActivity.this);
            }
        }, 2);
        c cVar = this.f25094t;
        ConstraintLayout constraintLayout = ((t) cVar.getValue()).f1461b;
        e eVar = new e(this, 12);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(constraintLayout, eVar);
        if (getSupportFragmentManager().H().isEmpty()) {
            OCRPreviewFragment.a aVar = OCRPreviewFragment.f25168p0;
            g0 supportFragmentManager = getSupportFragmentManager();
            g.d(supportFragmentManager, ea.a.p("QHU7cBxyFkYAYVNtDG4iTSVuU2cjcg==", "kuOSScLI"));
            int id2 = ((t) cVar.getValue()).f1461b.getId();
            OCRWorkFlow oCRWorkFlow = this.f25097w;
            aVar.getClass();
            OCRPreviewFragment oCRPreviewFragment = new OCRPreviewFragment();
            if (oCRWorkFlow != null) {
                Bundle bundle = new Bundle();
                bundle.putString(ea.a.p("JGVIXxZjRV8qci92HGUfX1NyAW0=", "LxI4jzJG"), oCRWorkFlow.name());
                oCRPreviewFragment.j0(bundle);
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            aVar2.d(id2, oCRPreviewFragment, ea.a.p("fEMZUAFlFGkXd3JyCGc7ZSp0", "78bnas5w"));
            aVar2.i();
        }
    }

    @Override // jl.a
    public final void L1() {
        boolean z10;
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
                intent.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfAG8xaAxuZw==", "CwhuNQnd"), true);
                startActivity(intent);
                finish();
                ImageConvertDataRepository.f26536a.getClass();
                ImageConvertDataRepository.f();
            }
        }
        t0.d0(b.b.x(this), null, null, new OCRPreviewActivity$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new OCRPreviewActivity$initViewModel$3(this, null), 3);
    }

    public final void b2() {
        OCRWorkFlow oCRWorkFlow = this.f25097w;
        if (oCRWorkFlow == OCRWorkFlow.TOOLS_CAMERA) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.k();
        } else if (oCRWorkFlow != OCRWorkFlow.PREVIEW) {
            ImageConvertDataRepository.f26536a.getClass();
            ImageConvertDataRepository.k();
            int i10 = CameraActivity.H0;
            CameraActivity.a.a(this, ea.a.p("IGNy", "KiNGFkul"), ea.a.p("IGNy", "2XCPZZAW"), false, true);
        }
        finish();
    }

    @Override // jl.a
    public final void C1() {
    }
}
