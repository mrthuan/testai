package pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import cg.a;
import cg.l;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: ChooseConvertImageTypeDialog.kt */
/* loaded from: classes3.dex */
public final class ChooseConvertImageTypeDialog extends g {

    /* renamed from: y  reason: collision with root package name */
    public a<d> f25473y;

    /* renamed from: z  reason: collision with root package name */
    public a<d> f25474z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseConvertImageTypeDialog(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "VtLLPsId"));
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_choose_convert_image_type;
    }

    @Override // oo.g
    public final void z() {
        TextView textView = (TextView) findViewById(R.id.pdf2ImageTv);
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog$initView$1
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
                    kotlin.jvm.internal.g.e(it, "it");
                    a<d> aVar = ChooseConvertImageTypeDialog.this.f25473y;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    ChooseConvertImageTypeDialog.this.cancel();
                }
            });
        }
        TextView textView2 = (TextView) findViewById(R.id.pdf2LongImageTv);
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseConvertImageTypeDialog$initView$2
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
                    kotlin.jvm.internal.g.e(it, "it");
                    a<d> aVar = ChooseConvertImageTypeDialog.this.f25474z;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    ChooseConvertImageTypeDialog.this.cancel();
                }
            });
        }
    }
}
