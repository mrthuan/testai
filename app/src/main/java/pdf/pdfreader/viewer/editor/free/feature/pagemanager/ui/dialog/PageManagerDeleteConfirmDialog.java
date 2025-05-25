package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog;

import am.f0;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.play.core.assetpacks.c;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import oo.l;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: PageManagerDeleteConfirmDialog.kt */
/* loaded from: classes3.dex */
public final class PageManagerDeleteConfirmDialog extends l<f0> {
    public static final /* synthetic */ int A = 0;

    /* renamed from: z  reason: collision with root package name */
    public final int f25362z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageManagerDeleteConfirmDialog(Context context, int i10) {
        super(context);
        ea.a.p("UG8ldBZ4dA==", "1SwET1Eo");
        this.f25362z = i10;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final boolean B() {
        return false;
    }

    @Override // oo.l
    public final f0 H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.dialog_page_manager_delete_confirm, viewGroup, false);
        int i10 = R.id.cancel_tv;
        TextView textView = (TextView) c.u(inflate, R.id.cancel_tv);
        if (textView != null) {
            i10 = R.id.dec_tv;
            TextView textView2 = (TextView) c.u(inflate, R.id.dec_tv);
            if (textView2 != null) {
                i10 = R.id.delete_tv;
                TextView textView3 = (TextView) c.u(inflate, R.id.delete_tv);
                if (textView3 != null) {
                    i10 = R.id.iv_icon;
                    if (((ImageView) c.u(inflate, R.id.iv_icon)) != null) {
                        i10 = R.id.title;
                        TextView textView4 = (TextView) c.u(inflate, R.id.title);
                        if (textView4 != null) {
                            f0 f0Var = new f0(textView, textView2, textView3, textView4, (ConstraintLayout) inflate);
                            ea.a.p("J24MbFN0ISghbgBsVXQychQgMW8ndFdpGmUDLHFmI2w9ZSk=", "OdNj2D9b");
                            return f0Var;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("e2kUc15uLSA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "6J6g7JPF").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // oo.g
    public final void z() {
        String string;
        String string2;
        int i10 = this.f25362z;
        if (i10 == 1) {
            string = getContext().getString(R.string.arg_res_0x7f130464, String.valueOf(i10));
        } else {
            string = getContext().getString(R.string.arg_res_0x7f130466, String.valueOf(i10));
        }
        g.d(string, ea.a.p("IWZEcyFsCWM8UAdnUU4ibRg9byB4KRZ7loDXTiRtbHQnUxhyLW4LKGEpbCAUIHcgGCByfQ==", "66HlDlwx"));
        VB vb2 = this.f23550y;
        g.b(vb2);
        f0 f0Var = (f0) vb2;
        if (i10 == 1) {
            string2 = getContext().getString(R.string.arg_res_0x7f1300e9);
        } else {
            string2 = getContext().getString(R.string.arg_res_0x7f1300e7);
        }
        f0Var.c.setText(string2);
        int V = k.V(string, String.valueOf(i10), 0, false, 6);
        int length = String.valueOf(i10).length() + V;
        SpannableString spannableString = new SpannableString(string);
        if (V >= 0 && length >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.color_100_DD202A)), V, length, 17);
        }
        VB vb3 = this.f23550y;
        g.b(vb3);
        ((f0) vb3).f892e.setText(spannableString);
        VB vb4 = this.f23550y;
        g.b(vb4);
        String p10 = ea.a.p("W2kXZF9uPS4sZQplQGUDdg==", "8i9y6ZZ4");
        TextView textView = ((f0) vb4).f891d;
        g.d(textView, p10);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerDeleteConfirmDialog$initView$1
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
                PageManagerDeleteConfirmDialog pageManagerDeleteConfirmDialog = PageManagerDeleteConfirmDialog.this;
                int i11 = PageManagerDeleteConfirmDialog.A;
                pageManagerDeleteConfirmDialog.getClass();
                oo.a aVar = PageManagerDeleteConfirmDialog.this.f23542t;
                if (aVar != null) {
                    aVar.a();
                }
                PageManagerDeleteConfirmDialog.this.dismiss();
            }
        });
        VB vb5 = this.f23550y;
        g.b(vb5);
        String p11 = ea.a.p("UWklZBpuBS4RYVpjDGwCdg==", "KVnMawIe");
        TextView textView2 = ((f0) vb5).f890b;
        g.d(textView2, p11);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerDeleteConfirmDialog$initView$2
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
                PageManagerDeleteConfirmDialog.this.dismiss();
            }
        });
    }
}
