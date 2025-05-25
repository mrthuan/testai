package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog;

import am.g0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.assetpacks.c;
import kotlin.jvm.internal.g;
import oo.l;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: PageManagerQuitDialog.kt */
/* loaded from: classes3.dex */
public final class PageManagerQuitDialog extends l<g0> {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f25363z = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageManagerQuitDialog(Context context) {
        super(context);
        g.e(context, ea.a.p("Cm8idFF4dA==", "w9iL4pjT"));
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.l
    public final g0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_page_manager_quit, viewGroup, false);
        int i10 = R.id.dec_tv;
        if (((TextView) c.u(inflate, R.id.dec_tv)) != null) {
            i10 = R.id.iv_icon;
            if (((ImageView) c.u(inflate, R.id.iv_icon)) != null) {
                i10 = R.id.operate_cancel;
                TextView textView = (TextView) c.u(inflate, R.id.operate_cancel);
                if (textView != null) {
                    i10 = R.id.operate_quit;
                    TextView textView2 = (TextView) c.u(inflate, R.id.operate_quit);
                    if (textView2 != null) {
                        i10 = R.id.title;
                        if (((TextView) c.u(inflate, R.id.title)) != null) {
                            g0 g0Var = new g0(textView, textView2, (ConstraintLayout) inflate);
                            ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpN2U_LBhmD2w8ZSk=", "R4EDYM8n");
                            return g0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpJmhNSTM6IA==", "czhORmwJ").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        VB vb2 = this.f23550y;
        g.b(vb2);
        String p10 = ea.a.p("UWklZBpuBS4dcFFyCHQzUTFpdA==", "lnYDaWog");
        TextView textView = ((g0) vb2).c;
        g.d(textView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerQuitDialog$initView$1
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
                PageManagerQuitDialog pageManagerQuitDialog = PageManagerQuitDialog.this;
                int i10 = PageManagerQuitDialog.f25363z;
                oo.a aVar = pageManagerQuitDialog.f23542t;
                if (aVar != null) {
                    aVar.a();
                }
                PageManagerQuitDialog.this.dismiss();
            }
        });
        VB vb3 = this.f23550y;
        g.b(vb3);
        String p11 = ea.a.p("LWlfZBBuUC41cC9yFHQNQ1RuDWVs", "C4N2hkl4");
        TextView textView2 = ((g0) vb3).f930b;
        g.d(textView2, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerQuitDialog$initView$2
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
                PageManagerQuitDialog.this.dismiss();
            }
        });
    }
}
