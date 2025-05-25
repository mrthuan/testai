package pdf.pdfreader.viewer.editor.free.ui.frag;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.DataBridge;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.split.SplitPdfData;
import pdf.pdfreader.viewer.editor.free.ui.adapter.a0;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.utils.n0;

/* compiled from: SplitResultFragment.kt */
/* loaded from: classes3.dex */
public final class SplitResultFragment extends pdf.pdfreader.viewer.editor.free.base.a implements EnterFileNameDialog.a, a0.a {

    /* renamed from: d0  reason: collision with root package name */
    public a0 f27991d0;

    /* renamed from: e0  reason: collision with root package name */
    public RecyclerView f27992e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f27993f0;

    /* renamed from: g0  reason: collision with root package name */
    public EnterFileNameDialog f27994g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f27995h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f27996i0;

    @Override // androidx.fragment.app.Fragment
    public final void S(boolean z10) {
        a0 a0Var;
        if (!z10 && (a0Var = this.f27991d0) != null) {
            List list = DataBridge.b();
            kotlin.jvm.internal.g.e(list, "list");
            ArrayList arrayList = a0Var.f27114e;
            arrayList.clear();
            arrayList.addAll(list);
            a0Var.notifyDataSetChanged();
            y0();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog.a
    public final void c(String str, boolean z10) {
        boolean z11;
        if (z10) {
            this.f27996i0 = z10;
        }
        a0 a0Var = this.f27991d0;
        if (a0Var != null) {
            Iterator it = a0Var.f27114e.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    SplitPdfData splitPdfData = (SplitPdfData) it.next();
                    if (splitPdfData.getId() == this.f27995h0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        splitPdfData.setFileName(str);
                    }
                    if (z11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                a0Var.notifyItemChanged(i10);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.a0.a
    public final void f(final SplitPdfData data, int i10) {
        kotlin.jvm.internal.g.e(data, "data");
        DataBridge.c = true;
        kotlin.collections.k.m0(DataBridge.b(), new cg.l<SplitPdfData, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SplitResultFragment$onRemove$1
            {
                super(1);
            }

            @Override // cg.l
            public final Boolean invoke(SplitPdfData it) {
                kotlin.jvm.internal.g.e(it, "it");
                return Boolean.valueOf(it.getId() == SplitPdfData.this.getId());
            }
        });
        a0 a0Var = this.f27991d0;
        if (a0Var != null) {
            ArrayList arrayList = a0Var.f27114e;
            arrayList.remove(i10);
            a0Var.notifyItemRemoved(i10);
            a0Var.notifyItemRangeChanged(i10, Math.max(arrayList.size() - i10, 0));
            y0();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.adapter.a0.a
    public final void j(final SplitPdfData data) {
        kotlin.jvm.internal.g.e(data, "data");
        if (this.f27994g0 == null) {
            Context g02 = g0();
            ea.a.p("K2UAdTtyMEMnbhJlTHR_KQ==", "I4YqRU8K");
            this.f27994g0 = new EnterFileNameDialog(g02, this, false);
        }
        this.f27995h0 = data.getId();
        EnterFileNameDialog enterFileNameDialog = this.f27994g0;
        if (enterFileNameDialog != null) {
            enterFileNameDialog.f27436v = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SplitResultFragment$onRename$1$1
                {
                    super(1);
                }

                @Override // cg.l
                public final Boolean invoke(String fileName) {
                    boolean z10;
                    Object obj;
                    boolean z11;
                    kotlin.jvm.internal.g.e(fileName, "fileName");
                    SplitPdfData splitPdfData = SplitPdfData.this;
                    Iterator it = DataBridge.b().iterator();
                    while (true) {
                        z10 = true;
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        SplitPdfData splitPdfData2 = (SplitPdfData) obj;
                        if (!kotlin.jvm.internal.g.a(splitPdfData2.getFileName(), fileName) || splitPdfData2.getId() == splitPdfData.getId()) {
                            z11 = false;
                            continue;
                        } else {
                            z11 = true;
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    }
                    if (obj == null) {
                        sn.d d10 = sn.d.d();
                        String concat = fileName.concat(".pdf");
                        String p10 = ea.a.p("EXBdaXQ=", "eIb1X4V9");
                        d10.getClass();
                        if (!sn.d.a(concat, p10)) {
                            z10 = false;
                        }
                    }
                    return Boolean.valueOf(z10);
                }
            };
            enterFileNameDialog.f27435u = new cg.a<String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SplitResultFragment$onRename$1$2
                {
                    super(0);
                }

                @Override // cg.a
                public final String invoke() {
                    return SplitPdfData.this.getFileName();
                }
            };
            enterFileNameDialog.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void s0() {
        View r02 = r0(R.id.split_recycler_view);
        kotlin.jvm.internal.g.c(r02, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuKW5JbgxsXyBHeTtlU2EMZABvXWQRLiRlJ3lRbCNyNWkjd0p3EGRUZUcuGWUQeQFsF3JiaQx3", "Fdy3BaVN"));
        this.f27992e0 = (RecyclerView) r02;
        View r03 = r0(R.id.tv_continue);
        kotlin.jvm.internal.g.c(r03, ea.a.p("XHVVbHhjEW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBGeUlleGEeZDpvD2Qadz5kX2UmLh1lTnQiaRR3", "Dz29XpE6"));
        this.f27993f0 = (TextView) r03;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final int u0() {
        return R.layout.fragment_split_result;
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.a
    public final void x0() {
        ea.a.p("Wm4idCVpB3dz", "5XeWoQDI");
        String str = n0.f28727a;
        tn.a.b(g0(), ea.a.p("QHAnaXQ=", "eoR1e0YY"), ea.a.p("PHBdaQ1fRGg1dw==", "PmvfrpLk"));
        RecyclerView recyclerView = this.f27992e0;
        if (recyclerView != null) {
            Context g02 = g0();
            ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "1D5zD2Id");
            a0 a0Var = new a0(g02);
            this.f27991d0 = a0Var;
            a0Var.f27115f = this;
            List list = DataBridge.b();
            kotlin.jvm.internal.g.e(list, "list");
            ArrayList arrayList = a0Var.f27114e;
            arrayList.clear();
            arrayList.addAll(list);
            a0Var.notifyDataSetChanged();
            y0();
            recyclerView.setAdapter(a0Var);
            TextView textView = this.f27993f0;
            if (textView != null) {
                pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.frag.SplitResultFragment$initViews$2
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
                        SplitResultFragment splitResultFragment = SplitResultFragment.this;
                        splitResultFragment.q0(2, Boolean.valueOf(splitResultFragment.f27996i0));
                    }
                });
                return;
            } else {
                kotlin.jvm.internal.g.i(ea.a.p("PnYtbwx0J249ZQ==", "s3JnbN39"));
                throw null;
            }
        }
        kotlin.jvm.internal.g.i(ea.a.p("PWVSeRpsUnIMaS93", "vMzyNkDI"));
        throw null;
    }

    public final void y0() {
        boolean z10;
        a0 a0Var = this.f27991d0;
        if (a0Var != null) {
            TextView textView = this.f27993f0;
            if (textView != null) {
                ArrayList arrayList = a0Var.f27114e;
                if (arrayList.size() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textView.setEnabled(z10);
                String string = textView.getResources().getString(R.string.arg_res_0x7f1303c7);
                kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0BmkgZ3tyXWFXZTlfA2QEXwFwWGkdXy4p", "tNU8Gqn5"));
                String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(arrayList.size())}, 1));
                kotlin.jvm.internal.g.d(format, ea.a.p("KW9DbRh0H3QyaTksVSoJclJzKQ==", "PJisBlcx"));
                BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                billingConfigImpl.getClass();
                if (BillingConfigImpl.s() && billingConfigImpl.z() && !billingConfigImpl.w()) {
                    String upperCase = format.toUpperCase(Locale.ROOT);
                    kotlin.jvm.internal.g.d(upperCase, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnXC5AbxBwBmU9Q1BzHCh7bzlhJmVbUidPYSk=", "t6NQu4Ev"));
                    SpannableString spannableString = new SpannableString(upperCase.concat("  "));
                    Context context = textView.getContext();
                    kotlin.jvm.internal.g.d(context, ea.a.p("R2gic11jDW4GZUx0", "W5avp1FF"));
                    spannableString.setSpan(new so.b(context, R.drawable.ic_home_subscription), spannableString.length() - 1, spannableString.length(), 33);
                    textView.setText(spannableString);
                    return;
                }
                textView.setText(format);
                return;
            }
            kotlin.jvm.internal.g.i(ea.a.p("O3Zybxd0Xm4vZQ==", "MIRZDwBo"));
            throw null;
        }
    }
}
