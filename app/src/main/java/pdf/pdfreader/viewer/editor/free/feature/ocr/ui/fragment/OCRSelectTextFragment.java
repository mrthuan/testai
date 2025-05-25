package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.x0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.r;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import com.google.android.flexbox.FlexboxLayoutManager;
import f5.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.m;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.i;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.data.OCRBlockFlatten;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.h;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment;
import pdf.pdfreader.viewer.editor.free.feature.ocr.vm.OCRResultViewModel;
import pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor;
import pdf.pdfreader.viewer.editor.free.utils.event.OCREventCenter;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: OCRSelectTextFragment.kt */
/* loaded from: classes3.dex */
public final class OCRSelectTextFragment extends BaseVMFragment<x0> {

    /* renamed from: g0  reason: collision with root package name */
    public static final a f25218g0;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f25219c0 = y0.a(this, i.a(OCRResultViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            g.d(viewModelStore, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uRGkjdw5vI2UiUzNvM2U=", "GNGAks0j"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$special$$inlined$activityViewModels$default$2
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
                g.d(defaultViewModelCreationExtras, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsQlZdZTlNXGQqbHJyHGFDaTVuD3gBcglz", "P6sb64N3"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            g.d(defaultViewModelProviderFactory, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsQFYFZRFNW2RWbBtyHHYLZBdycmEKdDlyeQ==", "4lf4Sqak"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public final tf.c f25220d0 = kotlin.a.a(new cg.a<List<OCRBlockFlatten>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$texts$2
        @Override // cg.a
        public final List<OCRBlockFlatten> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.utils.drag.a f25221e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f25222f0;

    /* compiled from: OCRSelectTextFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        ea.a.p("fEMZUxZsB2MGVFF4HUYkYSNtV250", "Hl9QWR90");
        f25218g0 = new a();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final x0 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_ocr_select_text, viewGroup, false);
        int i10 = R.id.backImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
        if (appCompatImageView != null) {
            i10 = R.id.copy_iv;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_iv);
            if (appCompatImageView2 != null) {
                i10 = R.id.copy_layout;
                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_layout);
                if (linearLayout != null) {
                    i10 = R.id.copy_tv;
                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.copy_tv);
                    if (textView != null) {
                        i10 = R.id.doneLayout;
                        LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.doneLayout);
                        if (linearLayout2 != null) {
                            i10 = R.id.recyclerView;
                            RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.recyclerView);
                            if (recyclerView != null) {
                                i10 = R.id.select_text_iv;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_iv);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.select_text_layout;
                                    LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_layout);
                                    if (linearLayout3 != null) {
                                        i10 = R.id.select_text_tv;
                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_text_tv);
                                        if (textView2 != null) {
                                            i10 = R.id.share_iv;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_iv);
                                            if (appCompatImageView4 != null) {
                                                i10 = R.id.share_layout;
                                                LinearLayout linearLayout4 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_layout);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.share_tv;
                                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.share_tv);
                                                    if (textView3 != null) {
                                                        i10 = R.id.titleTv;
                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.titleTv)) != null) {
                                                            i10 = R.id.tool_bar_view;
                                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tool_bar_view);
                                                            if (u7 != null) {
                                                                i10 = R.id.tools_line;
                                                                View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_line);
                                                                if (u10 != null) {
                                                                    x0 x0Var = new x0((ConstraintLayout) inflate, appCompatImageView, appCompatImageView2, linearLayout, textView, linearLayout2, recyclerView, appCompatImageView3, linearLayout3, textView2, appCompatImageView4, linearLayout4, textView3, u7, u10);
                                                                    ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpImVBLBlmEmxAZSk=", "L39sd95h");
                                                                    return x0Var;
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpDmhzSTE6IA==", "zSuGNNEr").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void r0() {
        HashSet<String> hashSet = OCREventCenter.c;
        if (!hashSet.contains(ea.a.p("IGNDdBx4Q18paCV3", "sRsNVZnh"))) {
            Context c = r.c("JWMedA14JF87aAl3", "mLJlhPeH", hashSet);
            OCREventCenter.b(c, a0.a.i("LnBBbBBjVnQzbyRDGm4cZU10", "LToBTOj4", c, "XGNy", "Voe40RxB"), ea.a.p("IGNDdBx4Q18paCV3", "Fo4bRmmN"));
        }
        Context r4 = r();
        if (r4 == null) {
            return;
        }
        VB vb2 = this.Y;
        g.b(vb2);
        h hVar = new h(u0(), new l<Integer, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$1$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Integer num) {
                invoke(num.intValue());
                return d.f30009a;
            }

            public final void invoke(int i10) {
                pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = OCRSelectTextFragment.this.f25221e0;
                if (aVar != null) {
                    aVar.d(i10);
                }
            }
        }, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$1$2
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
                OCRSelectTextFragment oCRSelectTextFragment = OCRSelectTextFragment.this;
                OCRSelectTextFragment.a aVar = OCRSelectTextFragment.f25218g0;
                oCRSelectTextFragment.v0();
            }
        });
        final RecyclerView recyclerView = ((x0) vb2).f1635g;
        recyclerView.setAdapter(hVar);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(r4);
        flexboxLayoutManager.e1(0);
        if (flexboxLayoutManager.f9959r != 0) {
            flexboxLayoutManager.f9959r = 0;
            flexboxLayoutManager.z0();
        }
        recyclerView.setLayoutManager(flexboxLayoutManager);
        DragSelectionProcessor dragSelectionProcessor = new DragSelectionProcessor(new DragSelectionProcessor.b() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$1$dragSelectionProcessor$1

            /* renamed from: a  reason: collision with root package name */
            public boolean f25223a;

            /* renamed from: b  reason: collision with root package name */
            public final tf.c f25224b = kotlin.a.a(new cg.a<List<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$1$dragSelectionProcessor$1$payload$2
                @Override // cg.a
                public final List<Integer> invoke() {
                    return ge.a.J(1);
                }
            });

            @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
            public final void a(int i10, int i11, boolean z10, boolean z11) {
                boolean z12;
                OCRSelectTextFragment oCRSelectTextFragment = OCRSelectTextFragment.this;
                if (z11) {
                    OCRSelectTextFragment.a aVar = OCRSelectTextFragment.f25218g0;
                    OCRBlockFlatten oCRBlockFlatten = (OCRBlockFlatten) m.t0(i10, oCRSelectTextFragment.u0());
                    if (oCRBlockFlatten != null) {
                        z12 = oCRBlockFlatten.isSelected();
                    } else {
                        z12 = false;
                    }
                    this.f25223a = !z12;
                }
                if (i10 > i11) {
                    return;
                }
                while (true) {
                    OCRSelectTextFragment.a aVar2 = OCRSelectTextFragment.f25218g0;
                    OCRBlockFlatten oCRBlockFlatten2 = (OCRBlockFlatten) m.t0(i10, oCRSelectTextFragment.u0());
                    if (oCRBlockFlatten2 != null) {
                        boolean z13 = this.f25223a;
                        tf.c cVar = this.f25224b;
                        RecyclerView recyclerView2 = recyclerView;
                        if (z13) {
                            if (!oCRBlockFlatten2.isSelected()) {
                                oCRBlockFlatten2.setSelected(true);
                                RecyclerView.Adapter adapter = recyclerView2.getAdapter();
                                if (adapter != null) {
                                    adapter.notifyItemChanged(i10, (List) cVar.getValue());
                                }
                                oCRSelectTextFragment.v0();
                            }
                        } else if (oCRBlockFlatten2.isSelected()) {
                            oCRBlockFlatten2.setSelected(false);
                            RecyclerView.Adapter adapter2 = recyclerView2.getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyItemChanged(i10, (List) cVar.getValue());
                            }
                            oCRSelectTextFragment.v0();
                        }
                    }
                    if (i10 != i11) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }

            @Override // pdf.pdfreader.viewer.editor.free.utils.drag.DragSelectionProcessor.b
            public final Set<Integer> q() {
                return null;
            }
        });
        dragSelectionProcessor.f28620a = DragSelectionProcessor.Mode.Simple;
        pdf.pdfreader.viewer.editor.free.utils.drag.a aVar = new pdf.pdfreader.viewer.editor.free.utils.drag.a();
        aVar.f28634k = dragSelectionProcessor;
        VB vb3 = this.Y;
        g.b(vb3);
        ((x0) vb3).f1635g.r(aVar);
        this.f25221e0 = aVar;
        VB vb4 = this.Y;
        g.b(vb4);
        String p10 = ea.a.p("UWklZBpuBS4QYVdrIG1n", "e8Xr0IWD");
        AppCompatImageView appCompatImageView = ((x0) vb4).f1631b;
        g.d(appCompatImageView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$2
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
                ((OCRResultViewModel) OCRSelectTextFragment.this.f25219c0.getValue()).j();
            }
        });
        VB vb5 = this.Y;
        g.b(vb5);
        String p11 = ea.a.p("LWkfZCNuIS4sbwhleGEub010", "wKOqJFQF");
        LinearLayout linearLayout = ((x0) vb5).f1634f;
        g.d(linearLayout, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRSelectTextFragment$initView$3
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
                OCREventCenter.i(ea.a.p("PGVdZRp0", "QWIoUeV1"));
                ((OCRResultViewModel) OCRSelectTextFragment.this.f25219c0.getValue()).i();
            }
        });
        VB vb6 = this.Y;
        g.b(vb6);
        ((x0) vb6).f1632d.setOnClickListener(new f5.d(this, 12));
        VB vb7 = this.Y;
        g.b(vb7);
        ((x0) vb7).f1637i.setOnClickListener(new e(this, 10));
        VB vb8 = this.Y;
        g.b(vb8);
        ((x0) vb8).f1640l.setOnClickListener(new k9.c(this, 8));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"NotifyDataSetChanged"})
    public final void s0() {
        t0.d0(b.b.x(this), null, null, new OCRSelectTextFragment$initViewModel$1(this, null), 3);
    }

    public final String t0() {
        boolean a10;
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        for (Object obj : u0()) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                OCRBlockFlatten oCRBlockFlatten = (OCRBlockFlatten) obj;
                if (oCRBlockFlatten.isSelected()) {
                    if (i10 != 0) {
                        if (oCRBlockFlatten.isFirstWordOfBlock()) {
                            sb2.append("\n");
                        }
                        a10 = kl.e.a(oCRBlockFlatten.getText());
                        if (!a10 && !z10 && !oCRBlockFlatten.isFirstWordOfBlock()) {
                            sb2.append(" ");
                        }
                    } else {
                        a10 = kl.e.a(oCRBlockFlatten.getText());
                    }
                    sb2.append(oCRBlockFlatten.getText());
                    z10 = a10;
                }
                i10 = i11;
            } else {
                ge.a.c0();
                throw null;
            }
        }
        String sb3 = sb2.toString();
        g.d(sb3, ea.a.p("PHRDaRdndXUzbC5lBy4cb2Z0HGkrZ00p", "nyOdERuK"));
        return sb3;
    }

    public final List<OCRBlockFlatten> u0() {
        return (List) this.f25220d0.getValue();
    }

    public final void v0() {
        boolean z10 = false;
        boolean z11 = false;
        for (OCRBlockFlatten oCRBlockFlatten : u0()) {
            if (!z10 || !z11) {
                if (oCRBlockFlatten.isSelected()) {
                    z10 = true;
                } else {
                    z11 = true;
                }
            }
        }
        VB vb2 = this.Y;
        g.b(vb2);
        ((x0) vb2).c.setEnabled(z10);
        VB vb3 = this.Y;
        g.b(vb3);
        ((x0) vb3).f1633e.setEnabled(z10);
        VB vb4 = this.Y;
        g.b(vb4);
        ((x0) vb4).f1639k.setEnabled(z10);
        VB vb5 = this.Y;
        g.b(vb5);
        ((x0) vb5).f1641m.setEnabled(z10);
        if (z11) {
            VB vb6 = this.Y;
            g.b(vb6);
            ((x0) vb6).f1636h.setImageResource(R.drawable.ic_home_check);
            VB vb7 = this.Y;
            g.b(vb7);
            ((x0) vb7).f1638j.setText(v().getString(R.string.arg_res_0x7f1303e9));
        } else {
            VB vb8 = this.Y;
            g.b(vb8);
            ((x0) vb8).f1636h.setImageResource(R.drawable.ic_home_unselect);
            VB vb9 = this.Y;
            g.b(vb9);
            ((x0) vb9).f1638j.setText(v().getString(R.string.arg_res_0x7f130381));
        }
        this.f25222f0 = z11;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
