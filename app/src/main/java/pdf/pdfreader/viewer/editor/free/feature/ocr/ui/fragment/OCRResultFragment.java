package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.w0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.r;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y0;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.lifecycle.x;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cg.l;
import cg.p;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import kotlin.text.k;
import kotlinx.coroutines.l1;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRWorkFlow;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OcrUploadResult;
import pdf.pdfreader.viewer.editor.free.feature.ocr.dialog.OCRLoadingDialog;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.utils.b0;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.j0;
import tf.d;
import u4.j;

/* compiled from: OCRResultFragment.kt */
/* loaded from: classes3.dex */
public final class OCRResultFragment extends BaseVMFragment<w0> {

    /* renamed from: r0  reason: collision with root package name */
    public static final a f25189r0;

    /* renamed from: d0  reason: collision with root package name */
    public int f25191d0;

    /* renamed from: g0  reason: collision with root package name */
    public OCRLoadingDialog f25194g0;

    /* renamed from: h0  reason: collision with root package name */
    public i3 f25195h0;

    /* renamed from: j0  reason: collision with root package name */
    public OCRWorkFlow f25197j0;

    /* renamed from: k0  reason: collision with root package name */
    public l1 f25198k0;

    /* renamed from: l0  reason: collision with root package name */
    public um.a f25199l0;

    /* renamed from: o0  reason: collision with root package name */
    public long f25202o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f25203p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f25204q0;

    /* renamed from: c0  reason: collision with root package name */
    public final tf.c f25190c0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$ocrPreviewAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c invoke() {
            LifecycleCoroutineScopeImpl x4 = b.b.x(OCRResultFragment.this);
            final OCRResultFragment oCRResultFragment = OCRResultFragment.this;
            return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c(x4, oCRResultFragment.f25191d0, new p<Integer, um.a, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$ocrPreviewAdapter$2.1
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ d invoke(Integer num, um.a aVar) {
                    invoke(num.intValue(), aVar);
                    return d.f30009a;
                }

                public final void invoke(int i10, um.a ocrImage) {
                    g.e(ocrImage, "ocrImage");
                    if (OCRResultFragment.t0(OCRResultFragment.this).f1587n.getCurrentItem() == i10) {
                        tf.c cVar = OCREventCenter.f28670a;
                        OCREventCenter.o(ea.a.p("X2E5Z2U=", "kkPLIaJ9"));
                        OCRResultFragment.t0(OCRResultFragment.this).f1585l.setVisibility(0);
                    } else if (OCRResultFragment.this.B0()) {
                        OCRResultFragment.t0(OCRResultFragment.this).f1587n.i(i10, false);
                    }
                }
            });
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public final tf.c f25192e0 = kotlin.a.a(new cg.a<List<um.a>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$pictures$2
        @Override // cg.a
        public final List<um.a> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: f0  reason: collision with root package name */
    public final k0 f25193f0 = y0.a(this, i.a(OCRResultViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuGGkgdyhvM2U2UyBvAGU=", "WNrrWZTr"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                g.d(defaultViewModelCreationExtras, ea.a.p("P2U7dTtyCEErdA92XXQuKBEuNmUvYUNsAFYYZSZNLWQobAlyN2EZaSduI3hAcjZz", "WqMJRmtX"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsPlYGZTRNOGQqbGFyFnZeZD9yDGEWdAdyeQ==", "bMegJoCW"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: i0  reason: collision with root package name */
    public final tf.c f25196i0 = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$ocrBigImagePreviewAdapter$2
        {
            super(0);
        }

        @Override // cg.a
        public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b invoke() {
            LifecycleCoroutineScopeImpl x4 = b.b.x(OCRResultFragment.this);
            OCRResultFragment oCRResultFragment = OCRResultFragment.this;
            OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
            return new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b(x4, oCRResultFragment.z0());
        }
    });

    /* renamed from: m0  reason: collision with root package name */
    public final Handler f25200m0 = new Handler(Looper.getMainLooper());

    /* renamed from: n0  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b f25201n0 = new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 0);

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f25205a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f25206b;

        static {
            int[] iArr = new int[OCRWorkFlow.values().length];
            try {
                iArr[OCRWorkFlow.SCAN2PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OCRWorkFlow.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OCRWorkFlow.IMG2PDF.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25205a = iArr;
            int[] iArr2 = new int[OcrUploadResult.values().length];
            try {
                iArr2[OcrUploadResult.IMAGE_UPLOAD_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OcrUploadResult.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f25206b = iArr2;
        }
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        public float f25208a;

        /* renamed from: b  reason: collision with root package name */
        public float f25209b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public long f25210d = -1;

        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view == null) {
                return false;
            }
            if (this.c <= 0) {
                int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
                this.c = scaledTouchSlop;
                if (scaledTouchSlop < 10) {
                    this.c = 10;
                }
            }
            if (motionEvent != null) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        float x4 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (Math.abs(x4 - this.f25208a) < this.c && Math.abs(y10 - this.f25209b) < this.c && motionEvent.getEventTime() - this.f25210d < ViewConfiguration.getTapTimeout()) {
                            OCRResultFragment.t0(OCRResultFragment.this).f1590q.setCursorVisible(true);
                            pdf.pdfreader.viewer.editor.free.utils.extension.g.g(view);
                        }
                    }
                } else {
                    this.f25208a = motionEvent.getX();
                    this.f25209b = motionEvent.getY();
                    this.f25210d = motionEvent.getEventTime();
                }
            }
            return false;
        }
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class f implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public int f25212a;

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (view != null && this.f25212a != view.getMeasuredHeight()) {
                this.f25212a = view.getMeasuredHeight();
                int measuredWidth = (int) ((view.getMeasuredWidth() / 2) - (((this.f25212a / 66.0f) * 52.0f) / 2));
                view.setPadding(measuredWidth, 0, measuredWidth, 0);
            }
        }
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class g extends ViewPager2.g {
        public g() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            OCRResultFragment oCRResultFragment = OCRResultFragment.this;
            if (oCRResultFragment.f25191d0 == i10) {
                VB vb2 = oCRResultFragment.Y;
                kotlin.jvm.internal.g.b(vb2);
                ((w0) vb2).f1585l.setVisibility(0);
            } else if (oCRResultFragment.B0()) {
                HashSet<String> hashSet = OCREventCenter.c;
                if (!hashSet.contains(ea.a.p("XGM5chZzF2wGX0RhDmUJYyhpUWs=", "CM4TBb5m"))) {
                    Context c = r.c("IGNDchxzQmwuXzphEmU3Y1lpDWs=", "Jhb2UGAb", hashSet);
                    OCREventCenter.b(c, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "62TsPpTA", c, "XGNy", "WnKgtVSP"), ea.a.p("XGM5chZzF2wGX0RhDmUJYyhpUWs=", "oMFveaHc"));
                }
                if (i10 != oCRResultFragment.f25191d0) {
                    if (((um.a) m.t0(i10, oCRResultFragment.z0())) != null) {
                        oCRResultFragment.y0().f25141e = i10;
                        oCRResultFragment.y0().notifyItemChanged(i10, 1);
                    }
                    if (((um.a) m.t0(oCRResultFragment.f25191d0, oCRResultFragment.z0())) != null) {
                        oCRResultFragment.y0().f25141e = i10;
                        oCRResultFragment.y0().notifyItemChanged(oCRResultFragment.f25191d0, 1);
                    }
                    VB vb3 = oCRResultFragment.Y;
                    kotlin.jvm.internal.g.b(vb3);
                    String p10 = ea.a.p("UWklZBpuBS4AZUd1BXQTZC10ZmU-dA==", "1c3SecR6");
                    AppCompatEditText appCompatEditText = ((w0) vb3).f1590q;
                    kotlin.jvm.internal.g.d(appCompatEditText, p10);
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.a(appCompatEditText);
                }
                oCRResultFragment.f25191d0 = i10;
                oCRResultFragment.D0(i10, oCRResultFragment.z0().size());
            }
        }
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class h implements x, kotlin.jvm.internal.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f25214a;

        public h(l lVar) {
            ea.a.p("KXVfYw1pWG4=", "mXdsUIiX");
            this.f25214a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f25214a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof x) && (obj instanceof kotlin.jvm.internal.e)) {
                return kotlin.jvm.internal.g.a(this.f25214a, ((kotlin.jvm.internal.e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25214a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25214a.invoke(obj);
        }
    }

    static {
        ea.a.p("fEMZUhZzF2wGRkZhDm0zbnQ=", "vPaXeIWL");
        f25189r0 = new a();
    }

    public static final w0 t0(OCRResultFragment oCRResultFragment) {
        VB vb2 = oCRResultFragment.Y;
        kotlin.jvm.internal.g.b(vb2);
        return (w0) vb2;
    }

    public static final void u0(OCRResultFragment oCRResultFragment, String str) {
        VB vb2 = oCRResultFragment.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((w0) vb2).f1590q.setText(str);
        VB vb3 = oCRResultFragment.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((w0) vb3).f1590q.setVisibility(0);
        VB vb4 = oCRResultFragment.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((w0) vb4).f1582i.setVisibility(8);
        VB vb5 = oCRResultFragment.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((w0) vb5).A.setVisibility(8);
    }

    public static String x0(int i10) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (1 <= i10 && i10 < 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return ea.a.p("MQ==", "mGRSeIJE");
        }
        if (6 <= i10 && i10 < 11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return ea.a.p("Mg==", "VpnTd9mE");
        }
        if (11 <= i10 && i10 < 16) {
            z12 = true;
        }
        if (z12) {
            return ea.a.p("Mw==", "Iq1HobcH");
        }
        return ea.a.p("NA==", "pHjUltSV");
    }

    public final OCRResultViewModel A0() {
        return (OCRResultViewModel) this.f25193f0.getValue();
    }

    public final boolean B0() {
        tf.d dVar;
        Context r4 = r();
        if (r4 == null) {
            return false;
        }
        if (ReaderDebugActivity.f27841t || cl.b.b(r4)) {
            return true;
        }
        if (!this.f25203p0) {
            tf.c cVar = OCREventCenter.f28670a;
            OCREventCenter.e(v0(OcrUploadResult.NETWORK_ERROR));
            this.f25203p0 = true;
        }
        i3 i3Var = this.f25195h0;
        if (i3Var != null) {
            i3Var.show();
            dVar = tf.d.f30009a;
        } else {
            dVar = null;
        }
        if (dVar == null) {
            String string = r4.getResources().getString(R.string.arg_res_0x7f1302af);
            kotlin.jvm.internal.g.d(string, ea.a.p("VG80YR1DFW48ZR50GnIyc1d1IGMscxhnloDXZ3lSbHNMcj5uFi4UZTx3CXJfXzJySm8gKQ==", "ID8WqzPk"));
            String string2 = r4.getResources().getString(R.string.arg_res_0x7f130109);
            kotlin.jvm.internal.g.d(string2, ea.a.p("PG8ZYRlDGm48ZR50GnIyc1d1IGMscxhnloDXUn9zNnI5bh0uEW8CbiRvB2RrZjZpVGU2KQ==", "k9PzuuuR"));
            i3 i3Var2 = new i3(r4, string, string2, null);
            this.f25195h0 = i3Var2;
            i3Var2.B = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$networkIsAvailable$1$1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    OCRResultFragment oCRResultFragment = OCRResultFragment.this;
                    if (oCRResultFragment.f25204q0) {
                        return;
                    }
                    tf.c cVar2 = OCREventCenter.f28670a;
                    OCREventCenter.d(oCRResultFragment.v0(OcrUploadResult.NETWORK_ERROR));
                    OCRResultFragment.this.f25204q0 = true;
                }
            };
            i3Var2.show();
        }
        return false;
    }

    public final void C0(um.a aVar) {
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        this.f25199l0 = null;
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((w0) vb2).f1590q.setText("");
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((w0) vb3).f1590q.setVisibility(8);
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((w0) vb4).f1582i.setVisibility(8);
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((w0) vb5).A.setVisibility(8);
        this.f25198k0 = t0.d0(b.b.x(this), null, null, new OCRResultFragment$ocrAndFillEditText$1(aVar, this, r4, null), 3);
    }

    public final void D0(int i10, int i11) {
        String valueOf;
        int i12;
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        w0 w0Var = (w0) vb2;
        if (i10 >= i11) {
            valueOf = String.valueOf(i11);
        } else {
            valueOf = String.valueOf(i10 + 1);
        }
        w0Var.f1580g.setText(valueOf);
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((w0) vb3).E.setText(String.valueOf(i11));
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        w0 w0Var2 = (w0) vb4;
        int i13 = 4;
        if (i10 == 0) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        w0Var2.f1589p.setVisibility(i12);
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        w0 w0Var3 = (w0) vb5;
        if (i10 < i11 - 1) {
            i13 = 0;
        }
        w0Var3.f1584k.setVisibility(i13);
        um.a aVar = (um.a) m.t0(i10, z0());
        if (aVar != null) {
            C0(aVar);
            VB vb6 = this.Y;
            kotlin.jvm.internal.g.b(vb6);
            ((w0) vb6).f1586m.u0(i10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void P() {
        this.f25200m0.removeCallbacksAndMessages(null);
        super.P();
    }

    @Override // androidx.fragment.app.Fragment
    public final void X(Bundle bundle) {
        bundle.putInt(ea.a.p("JGVIXxZjRV85dThyEG4cX0VhCWU=", "s4lP18xv"), this.f25191d0);
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment, androidx.fragment.app.Fragment
    public final void b0(View view, Bundle bundle) {
        int i10;
        int i11;
        String p10;
        kotlin.jvm.internal.g.e(view, "view");
        super.b0(view, bundle);
        List list = (List) pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b.d();
        if (list != null) {
            i10 = list.size();
        } else {
            i10 = 1;
        }
        tf.c cVar = OCREventCenter.f28670a;
        OCREventCenter.n("total_".concat(x0(i10)));
        OCRWorkFlow oCRWorkFlow = this.f25197j0;
        if (oCRWorkFlow == null) {
            i11 = -1;
        } else {
            i11 = b.f25205a[oCRWorkFlow.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    p10 = ea.a.p("KWNy", "6KFA9YRA");
                } else {
                    p10 = ea.a.p("A21n", "HpjAkQEh");
                }
            } else {
                p10 = ea.a.p("Q2Rm", "WyN5Cctb");
            }
        } else {
            p10 = ea.a.p("PGNQbg==", "cOu2DnZp");
        }
        OCREventCenter.n(p10 + "_" + x0(i10));
        if (i10 > 1) {
            HashSet<String> hashSet = OCREventCenter.c;
            if (!hashSet.contains(ea.a.p("GWM8ch1zDGw8XxZhU2UIc1Bvdw==", "pCvNxyH9"))) {
                Context c10 = r.c("XGM5chZzF2wGX0RhDmUJcyxvdw==", "HHC6KY5S", hashSet);
                OCREventCenter.b(c10, a0.a.i("A3A4bD5jVXQhbwhDW24jZUB0", "ZUbHW4PW", c10, "XGNy", "Z83HJqut"), ea.a.p("XGM5chZzF2wGX0RhDmUJcyxvdw==", "rc5WEOcu"));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final w0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_ocr_result, viewGroup, false);
        int i10 = R.id.backImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
        if (appCompatImageView != null) {
            i10 = R.id.bottomToolsLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottomToolsLayout);
            if (constraintLayout != null) {
                i10 = R.id.copy_all_iv;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_all_iv);
                if (appCompatImageView2 != null) {
                    i10 = R.id.copy_all_layout;
                    LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_all_layout);
                    if (linearLayout != null) {
                        i10 = R.id.copy_all_tv;
                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_all_tv);
                        if (textView != null) {
                            i10 = R.id.current_index_tv;
                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_index_tv);
                            if (textView2 != null) {
                                i10 = R.id.current_slash_tv;
                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.current_slash_tv)) != null) {
                                    i10 = R.id.doneLayout;
                                    LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.doneLayout);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.emptyGroup;
                                        Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.emptyGroup);
                                        if (group != null) {
                                            i10 = R.id.emptyImg;
                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.emptyImg)) != null) {
                                                i10 = R.id.emptyTv;
                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.emptyTv)) != null) {
                                                    i10 = R.id.index_layout;
                                                    LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.index_layout);
                                                    if (linearLayout3 != null) {
                                                        i10 = R.id.next_iv;
                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.next_iv);
                                                        if (appCompatImageView3 != null) {
                                                            i10 = R.id.previewLayout;
                                                            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewLayout);
                                                            if (frameLayout != null) {
                                                                i10 = R.id.previewRv;
                                                                RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewRv);
                                                                if (recyclerView != null) {
                                                                    i10 = R.id.previewVp;
                                                                    ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewVp);
                                                                    if (viewPager2 != null) {
                                                                        i10 = R.id.previewZoomOutImg;
                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewZoomOutImg);
                                                                        if (appCompatImageView4 != null) {
                                                                            i10 = R.id.previous_iv;
                                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previous_iv);
                                                                            if (appCompatImageView5 != null) {
                                                                                i10 = R.id.resultEditText;
                                                                                AppCompatEditText appCompatEditText = (AppCompatEditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.resultEditText);
                                                                                if (appCompatEditText != null) {
                                                                                    i10 = R.id.resultLayout;
                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.resultLayout);
                                                                                    if (constraintLayout2 != null) {
                                                                                        i10 = R.id.retryTv;
                                                                                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retryTv);
                                                                                        if (textView3 != null) {
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) inflate;
                                                                                            i10 = R.id.select_text_iv;
                                                                                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_iv);
                                                                                            if (appCompatImageView6 != null) {
                                                                                                i10 = R.id.select_text_layout;
                                                                                                LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_layout);
                                                                                                if (linearLayout4 != null) {
                                                                                                    i10 = R.id.select_text_tv;
                                                                                                    TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_tv);
                                                                                                    if (textView4 != null) {
                                                                                                        i10 = R.id.share_iv;
                                                                                                        AppCompatImageView appCompatImageView7 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_iv);
                                                                                                        if (appCompatImageView7 != null) {
                                                                                                            i10 = R.id.share_layout;
                                                                                                            LinearLayout linearLayout5 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_layout);
                                                                                                            if (linearLayout5 != null) {
                                                                                                                i10 = R.id.share_tv;
                                                                                                                TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_tv);
                                                                                                                if (textView5 != null) {
                                                                                                                    i10 = R.id.thumbLayout;
                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.thumbLayout);
                                                                                                                    if (frameLayout2 != null) {
                                                                                                                        i10 = R.id.tipsGroup;
                                                                                                                        Group group2 = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tipsGroup);
                                                                                                                        if (group2 != null) {
                                                                                                                            i10 = R.id.tipsImg;
                                                                                                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tipsImg)) != null) {
                                                                                                                                i10 = R.id.tipsTv;
                                                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tipsTv);
                                                                                                                                if (appCompatTextView != null) {
                                                                                                                                    i10 = R.id.titleTv;
                                                                                                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.titleTv)) != null) {
                                                                                                                                        i10 = R.id.tool_bar_view;
                                                                                                                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tool_bar_view);
                                                                                                                                        if (u7 != null) {
                                                                                                                                            i10 = R.id.tools_line;
                                                                                                                                            View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_line);
                                                                                                                                            if (u10 != null) {
                                                                                                                                                i10 = R.id.topBarrier;
                                                                                                                                                if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.topBarrier)) != null) {
                                                                                                                                                    i10 = R.id.total_index_tv;
                                                                                                                                                    TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.total_index_tv);
                                                                                                                                                    if (textView6 != null) {
                                                                                                                                                        w0 w0Var = new w0(constraintLayout3, appCompatImageView, constraintLayout, appCompatImageView2, linearLayout, textView, textView2, linearLayout2, group, linearLayout3, appCompatImageView3, frameLayout, recyclerView, viewPager2, appCompatImageView4, appCompatImageView5, appCompatEditText, constraintLayout2, textView3, appCompatImageView6, linearLayout4, textView4, appCompatImageView7, linearLayout5, textView5, frameLayout2, group2, appCompatTextView, u7, u10, textView6);
                                                                                                                                                        ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpCGUzLEZmC2xAZSk=", "fAfj1SwU");
                                                                                                                                                        return w0Var;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpEGhTST06IA==", "dsyazf4K").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
        Bundle bundle2;
        OCRWorkFlow oCRWorkFlow;
        String string;
        String str;
        int i10 = 0;
        if (bundle != null) {
            str = "eGyUMRzE";
        } else {
            bundle = this.f3674g;
            str = bundle != null ? "oIkRBVyw" : "oIkRBVyw";
            this.f25191d0 = i10;
            bundle2 = this.f3674g;
            if (bundle2 == null && (string = bundle2.getString(ea.a.p("WGUyXxxjEF8AZUd1BXQJZjZvbQ==", "Eicnbi0o"))) != null) {
                oCRWorkFlow = OCRWorkFlow.valueOf(string);
            } else {
                oCRWorkFlow = null;
            }
            this.f25197j0 = oCRWorkFlow;
        }
        i10 = bundle.getInt(ea.a.p("JGVIXxZjRV85dThyEG4cX0VhCWU=", str), 0);
        this.f25191d0 = i10;
        bundle2 = this.f3674g;
        if (bundle2 == null) {
        }
        oCRWorkFlow = null;
        this.f25197j0 = oCRWorkFlow;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"ClickableViewAccessibility"})
    public final void r0() {
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((w0) vb2).f1586m.addOnLayoutChangeListener(new f());
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        String p10 = ea.a.p("LWlfZBBuUC4oZTl1GXQkYUxvG3Q=", "tvl6jtWo");
        ConstraintLayout constraintLayout = ((w0) vb3).f1591r;
        kotlin.jvm.internal.g.d(constraintLayout, p10);
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = -((int) r4.getResources().getDimension(R.dimen.dp_10));
            constraintLayout.setLayoutParams(bVar);
            VB vb4 = this.Y;
            kotlin.jvm.internal.g.b(vb4);
            ((w0) vb4).f1589p.setOnClickListener(new j0(this, 9));
            VB vb5 = this.Y;
            kotlin.jvm.internal.g.b(vb5);
            ((w0) vb5).f1584k.setOnClickListener(new f5.d(this, 11));
            VB vb6 = this.Y;
            kotlin.jvm.internal.g.b(vb6);
            ((w0) vb6).f1576b.setOnClickListener(new f5.e(this, 9));
            VB vb7 = this.Y;
            kotlin.jvm.internal.g.b(vb7);
            ((w0) vb7).f1578e.setOnClickListener(new k9.c(this, 7));
            VB vb8 = this.Y;
            kotlin.jvm.internal.g.b(vb8);
            ((w0) vb8).f1594u.setOnClickListener(new u4.g(this, 9));
            VB vb9 = this.Y;
            kotlin.jvm.internal.g.b(vb9);
            ((w0) vb9).f1597x.setOnClickListener(new j(this, 11));
            VB vb10 = this.Y;
            kotlin.jvm.internal.g.b(vb10);
            ViewPager2 viewPager2 = ((w0) vb10).f1587n;
            viewPager2.setAdapter((pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b) this.f25196i0.getValue());
            ea.a.p("OWlUdylhUGUoMg==", "lFtYTxsR");
            View childAt = viewPager2.getChildAt(0);
            kotlin.jvm.internal.g.c(childAt, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuCm4UbkNsDiBHeTtlU2EMZABvXWQRLiRlJ3lRbCNyNWkAdxd3X2QFZUcuGWUQeQFsF3JiaQx3", "e96b0FqH"));
            RecyclerView recyclerView = (RecyclerView) childAt;
            try {
                Field declaredField = RecyclerView.class.getDeclaredField(ea.a.p("IlRedRpoZGw1cA==", "o2DQYhPk"));
                declaredField.setAccessible(true);
                Object obj = declaredField.get(recyclerView);
                kotlin.jvm.internal.g.c(obj, ea.a.p("JnU4bGhjU24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA8eSRlaGtddCRpCC59bnQ=", "7gHTH2e3"));
                declaredField.set(recyclerView, Integer.valueOf((int) (((Integer) obj).intValue() * 3.0f)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            viewPager2.f(new g());
            VB vb11 = this.Y;
            kotlin.jvm.internal.g.b(vb11);
            ((w0) vb11).f1588o.setOnClickListener(new d9.f(this, 9));
            VB vb12 = this.Y;
            kotlin.jvm.internal.g.b(vb12);
            pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c y02 = y0();
            RecyclerView recyclerView2 = ((w0) vb12).f1586m;
            recyclerView2.setAdapter(y02);
            recyclerView2.setLayoutManager(new LinearLayoutManager(0));
            recyclerView2.q(new b0((int) r4.getResources().getDimension(R.dimen.dp_6), 0));
            VB vb13 = this.Y;
            kotlin.jvm.internal.g.b(vb13);
            String p11 = ea.a.p("UWklZBpuBS4Wb1plJWEvbzF0", "NAb0dBM8");
            LinearLayout linearLayout = ((w0) vb13).f1581h;
            kotlin.jvm.internal.g.d(linearLayout, p11);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initView$12
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    tf.c cVar = OCREventCenter.f28670a;
                    OCREventCenter.i(ea.a.p("Vng_chJjdA==", "UHuJx5iN"));
                    AppCoreFilterEvent.c();
                    OCRResultFragment oCRResultFragment = OCRResultFragment.this;
                    OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
                    oCRResultFragment.A0().i();
                }
            });
            VB vb14 = this.Y;
            kotlin.jvm.internal.g.b(vb14);
            String p12 = ea.a.p("LWlfZBBuUC4oZTl1GXQtZFx0OmU9dA==", "dbTt6hGN");
            AppCompatEditText appCompatEditText = ((w0) vb14).f1590q;
            kotlin.jvm.internal.g.d(appCompatEditText, p12);
            appCompatEditText.addTextChangedListener(new c());
            VB vb15 = this.Y;
            kotlin.jvm.internal.g.b(vb15);
            ((w0) vb15).f1590q.setOnTouchListener(new d());
            VB vb16 = this.Y;
            kotlin.jvm.internal.g.b(vb16);
            ((w0) vb16).f1590q.setCursorVisible(false);
            VB vb17 = this.Y;
            kotlin.jvm.internal.g.b(vb17);
            ((w0) vb17).f1590q.setShowSoftInputOnFocus(false);
            VB vb18 = this.Y;
            kotlin.jvm.internal.g.b(vb18);
            ((w0) vb18).f1590q.setCustomSelectionActionModeCallback(new e());
            VB vb19 = this.Y;
            kotlin.jvm.internal.g.b(vb19);
            String p13 = ea.a.p("LWlfZBBuUC4oZT5yDFR2", "YBBCTucE");
            TextView textView = ((w0) vb19).f1592s;
            kotlin.jvm.internal.g.d(textView, p13);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initView$16
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    OCRResultFragment oCRResultFragment = OCRResultFragment.this;
                    OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
                    if (oCRResultFragment.B0()) {
                        if (g.a(OCRResultFragment.t0(OCRResultFragment.this).B.getText().toString(), OCRResultFragment.this.x(R.string.arg_res_0x7f130130))) {
                            tf.c cVar = OCREventCenter.f28670a;
                            OCREventCenter.k(ea.a.p("LGFfYxxs", "4uliQD1b"));
                        } else {
                            tf.c cVar2 = OCREventCenter.f28670a;
                            OCREventCenter.k(ea.a.p("VWEibA==", "fBs5owgd"));
                        }
                        um.a aVar2 = (um.a) m.t0(OCRResultFragment.this.f25191d0, OCRResultFragment.this.z0());
                        if (aVar2 != null) {
                            OCRResultFragment.this.C0(aVar2);
                        }
                    }
                }
            });
            return;
        }
        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuNm5JbiBsLSBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQ1YR1vIHRvd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTDh5C3UhUCByUm1z", "YdUA8V5R"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void s0() {
        pdf.pdfreader.viewer.editor.free.feature.ocr.helper.a.f25069b.e(this, new h(new l<List<um.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment$initViewModel$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(List<um.a> list) {
                invoke2(list);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<um.a> list) {
                if (list == null || list.isEmpty()) {
                    return;
                }
                w0 t02 = OCRResultFragment.t0(OCRResultFragment.this);
                t02.E.setText(String.valueOf(list.size()));
                OCRResultFragment.this.z0().clear();
                List<um.a> list2 = list;
                OCRResultFragment.this.z0().addAll(list2);
                um.a aVar = (um.a) m.t0(OCRResultFragment.this.f25191d0, OCRResultFragment.this.z0());
                pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c y02 = OCRResultFragment.this.y0();
                y02.getClass();
                ArrayList arrayList = y02.f25143g;
                arrayList.clear();
                arrayList.addAll(list2);
                y02.notifyDataSetChanged();
                ((pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.b) OCRResultFragment.this.f25196i0.getValue()).notifyDataSetChanged();
                w0 t03 = OCRResultFragment.t0(OCRResultFragment.this);
                t03.f1587n.i(OCRResultFragment.this.f25191d0, false);
                OCRResultFragment oCRResultFragment = OCRResultFragment.this;
                oCRResultFragment.D0(oCRResultFragment.f25191d0, list.size());
            }
        }));
        t0.d0(b.b.x(this), null, null, new OCRResultFragment$initViewModel$2(this, null), 3);
        t0.d0(b.b.x(this), null, null, new OCRResultFragment$initViewModel$3(this, null), 3);
    }

    public final String v0(OcrUploadResult ocrUploadResult) {
        int i10 = b.f25206b[ocrUploadResult.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return ea.a.p("emQubgdp", "v75odXNd");
            }
            return ea.a.p("XWU_dxxyaw==", "aYf8QEXl");
        }
        return ea.a.p("RnAnbxJk", "VS2ykbQT");
    }

    public final pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c y0() {
        return (pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.c) this.f25190c0.getValue();
    }

    public final List<um.a> z0() {
        return (List) this.f25192e0.getValue();
    }

    /* compiled from: OCRResultFragment.kt */
    /* loaded from: classes3.dex */
    public static final class e implements ActionMode.Callback {
        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            Integer num;
            boolean z10;
            boolean z11;
            if (menuItem != null) {
                num = Integer.valueOf(menuItem.getItemId());
            } else {
                num = null;
            }
            boolean z12 = true;
            if ((num != null && num.intValue() == 16908321) || (num != null && num.intValue() == 16908322)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || (num != null && num.intValue() == 16908320)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && (num == null || num.intValue() != 16908341)) {
                z12 = false;
            }
            if (z12) {
                OCREventCenter.j();
            }
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            HashSet<String> hashSet = OCREventCenter.c;
            if (!hashSet.contains(ea.a.p("IGNDchxzQmwuXy9kAV8baFp3", "RNBDlXON"))) {
                Context c = r.c("XGM5chZzF2wGX1FkHV8laCt3", "QVE4admk", hashSet);
                OCREventCenter.b(c, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "iQmvvIOe", c, "XGNy", "5XUlO05i"), ea.a.p("XGM5chZzF2wGX1FkHV8laCt3", "0rhc2cex"));
                return true;
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }
    }

    /* compiled from: TextView.kt */
    /* loaded from: classes3.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            String str;
            CharSequence n02;
            if (editable != null && (n02 = k.n0(editable)) != null && n02.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            OCRResultFragment oCRResultFragment = OCRResultFragment.this;
            OCRResultFragment.t0(oCRResultFragment).f1577d.setEnabled(z10);
            VB vb2 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb2);
            ((w0) vb2).f1579f.setEnabled(z10);
            VB vb3 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb3);
            ((w0) vb3).f1593t.setEnabled(z10);
            VB vb4 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb4);
            ((w0) vb4).f1595v.setEnabled(z10);
            VB vb5 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb5);
            ((w0) vb5).f1596w.setEnabled(z10);
            VB vb6 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb6);
            ((w0) vb6).f1598y.setEnabled(z10);
            VB vb7 = oCRResultFragment.Y;
            kotlin.jvm.internal.g.b(vb7);
            if (((w0) vb7).f1590q.hasFocus()) {
                OCREventCenter.j();
            }
            um.a aVar = oCRResultFragment.f25199l0;
            if (aVar != null) {
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                aVar.f30439h = str;
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
