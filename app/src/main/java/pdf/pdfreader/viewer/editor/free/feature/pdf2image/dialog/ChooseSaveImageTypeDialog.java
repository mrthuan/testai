package pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cg.l;
import ea.a;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity;
import tf.d;

/* compiled from: ChooseSaveImageTypeDialog.kt */
/* loaded from: classes3.dex */
public final class ChooseSaveImageTypeDialog extends g {

    /* renamed from: y  reason: collision with root package name */
    public l<? super String, d> f25475y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseSaveImageTypeDialog(BasePdf2ImageActivity basePdf2ImageActivity) {
        super(basePdf2ImageActivity, (Object) null);
        kotlin.jvm.internal.g.e(basePdf2ImageActivity, a.p("J28ZdFR4dA==", "HADw1W3F"));
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
        return R.layout.dialog_choose_save_image_type;
    }

    @Override // oo.g
    public final void z() {
        final CheckBox checkBox = (CheckBox) findViewById(R.id.check_jpg);
        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.check_png);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_jpg);
        if (linearLayout != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseSaveImageTypeDialog$initView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    CheckBox checkBox3 = checkBox;
                    if (checkBox3 != null) {
                        checkBox3.setChecked(true);
                    }
                    CheckBox checkBox4 = checkBox2;
                    if (checkBox4 == null) {
                        return;
                    }
                    checkBox4.setChecked(false);
                }
            });
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.layout_png);
        if (linearLayout2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseSaveImageTypeDialog$initView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    CheckBox checkBox3 = checkBox;
                    if (checkBox3 != null) {
                        checkBox3.setChecked(false);
                    }
                    CheckBox checkBox4 = checkBox2;
                    if (checkBox4 == null) {
                        return;
                    }
                    checkBox4.setChecked(true);
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.tvOk);
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseSaveImageTypeDialog$initView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    String str;
                    String str2;
                    kotlin.jvm.internal.g.e(it, "it");
                    l<? super String, d> lVar = ChooseSaveImageTypeDialog.this.f25475y;
                    if (lVar != null) {
                        CheckBox checkBox3 = checkBox2;
                        boolean z10 = false;
                        if (checkBox3 != null && checkBox3.isChecked()) {
                            z10 = true;
                        }
                        if (z10) {
                            str = "P25n";
                            str2 = "vQB1cUXP";
                        } else {
                            str = "LXBn";
                            str2 = "Z6GL7WZm";
                        }
                        lVar.invoke(a.p(str, str2));
                    }
                    ChooseSaveImageTypeDialog.this.cancel();
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.dialog.ChooseSaveImageTypeDialog$initView$4
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
                    ChooseSaveImageTypeDialog.this.cancel();
                }
            });
        }
    }
}
