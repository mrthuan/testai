package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog;

import am.h0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cg.p;
import com.google.android.play.core.assetpacks.c;
import java.util.List;
import kotlin.jvm.internal.g;
import oo.l;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.data.PageSize;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFCreatorActivity;
import tf.d;

/* compiled from: PageSizeSelectDialog.kt */
/* loaded from: classes3.dex */
public final class PageSizeSelectDialog extends l<h0> {
    public final boolean A;
    public final cg.l<? super PageSize, d> B;

    /* renamed from: z  reason: collision with root package name */
    public final PageSize f25364z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageSizeSelectDialog(PDFCreatorActivity pDFCreatorActivity, PageSize pageSize, boolean z10, cg.l lVar) {
        super(pDFCreatorActivity);
        g.e(pDFCreatorActivity, ea.a.p("UG8ldBZ4dA==", "0ZQ1Fokj"));
        g.e(pageSize, ea.a.p("LHVDchxuQ1A7Zy9THHpl", "UEBi2jXz"));
        this.f25364z = pageSize;
        this.A = z10;
        this.B = lVar;
    }

    @Override // oo.l
    public final h0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_page_size_setting, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) c.u(inflate, R.id.recyclerView);
        if (recyclerView != null) {
            h0 h0Var = new h0((LinearLayout) inflate, recyclerView);
            ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpPmU9LBRmAmw8ZSk=", "QWCVPO4c");
            return h0Var;
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpMWhjSS86IA==", "ECkNhSn7").concat(inflate.getResources().getResourceName(R.id.recyclerView)));
    }

    @Override // oo.g
    public final void z() {
        List I;
        VB vb2 = this.f23550y;
        g.b(vb2);
        getContext();
        ((h0) vb2).f952b.setLayoutManager(new LinearLayoutManager(1));
        final vm.d dVar = new vm.d();
        VB vb3 = this.f23550y;
        g.b(vb3);
        ((h0) vb3).f952b.setAdapter(dVar);
        if (this.A) {
            I = ge.a.I(PageSize.A3, PageSize.A4, PageSize.A5, PageSize.B4, PageSize.B5, PageSize.Letter, PageSize.Legal);
        } else {
            I = ge.a.I(PageSize.FollowPrevious, PageSize.A3, PageSize.A4, PageSize.A5, PageSize.B4, PageSize.B5, PageSize.Letter, PageSize.Legal);
        }
        PageSize pageSize = this.f25364z;
        g.e(pageSize, "<set-?>");
        dVar.f30856f = pageSize;
        dVar.j(I);
        dVar.f24703e = new p<Integer, PageSize, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageSizeSelectDialog$initView$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ d invoke(Integer num, PageSize pageSize2) {
                invoke(num.intValue(), pageSize2);
                return d.f30009a;
            }

            public final void invoke(int i10, PageSize pageSize2) {
                g.e(pageSize2, "pageSize");
                vm.d dVar2 = vm.d.this;
                dVar2.getClass();
                dVar2.f30856f = pageSize2;
                cg.l<? super PageSize, d> lVar = this.B;
                if (lVar != null) {
                    lVar.invoke(pageSize2);
                }
                vm.d.this.notifyDataSetChanged();
                this.dismiss();
            }
        };
    }
}
