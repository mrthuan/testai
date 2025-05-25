package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cg.l;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import tf.d;

/* compiled from: ChooseInsertTypeDialog.kt */
/* loaded from: classes3.dex */
public final class ChooseInsertTypeDialog extends g {

    /* renamed from: y  reason: collision with root package name */
    public cg.a<d> f25360y;

    /* renamed from: z  reason: collision with root package name */
    public cg.a<d> f25361z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseInsertTypeDialog(PDFPageManagerActivity pDFPageManagerActivity) {
        super(pDFPageManagerActivity, (Object) null);
        ea.a.p("UG8ldBZ4dA==", "mPAhEg57");
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
        return R.layout.dialog_choose_insert_type;
    }

    @Override // oo.g
    public final void z() {
        TextView textView = (TextView) findViewById(R.id.insertBlankPagesTv);
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.ChooseInsertTypeDialog$initView$1
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
                    cg.a<d> aVar = ChooseInsertTypeDialog.this.f25360y;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    ChooseInsertTypeDialog.this.cancel();
                }
            });
        }
        TextView textView2 = (TextView) findViewById(R.id.insertImagesTv);
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.ChooseInsertTypeDialog$initView$2
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
                    cg.a<d> aVar = ChooseInsertTypeDialog.this.f25361z;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    ChooseInsertTypeDialog.this.cancel();
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.ChooseInsertTypeDialog$initView$3
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
                    ChooseInsertTypeDialog.this.cancel();
                }
            });
        }
    }
}
