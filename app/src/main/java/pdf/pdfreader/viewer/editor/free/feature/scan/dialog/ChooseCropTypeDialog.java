package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;
import qb.j1;

/* compiled from: ChooseCropTypeDialog.kt */
/* loaded from: classes3.dex */
public final class ChooseCropTypeDialog extends oo.g {
    public static final /* synthetic */ int E = 0;
    public TextView A;
    public int B;
    public boolean C;
    public boolean D;

    /* renamed from: y  reason: collision with root package name */
    public final String f25677y;

    /* renamed from: z  reason: collision with root package name */
    public final cg.l<? super Boolean, tf.d> f25678z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseCropTypeDialog(cg.l lVar, Context context, String str) {
        super(context, (Object) null);
        ea.a.p("LG9fdBx4dA==", "VsYZwjcC");
        ea.a.p("VnYubgdXDXIZZlhvdw==", "F5RTQqEE");
        this.f25677y = str;
        this.f25678z = lVar;
        this.B = 1;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_crop_type;
    }

    @Override // oo.g
    public final void z() {
        this.A = (TextView) x().findViewById(R.id.tv_ok);
        LinearLayout linearLayout = (LinearLayout) x().findViewById(R.id.ll_no_crop);
        final ImageView imageView = (ImageView) x().findViewById(R.id.iv_no_crop_check);
        LinearLayout linearLayout2 = (LinearLayout) x().findViewById(R.id.ll_auto_crop);
        final ImageView imageView2 = (ImageView) x().findViewById(R.id.iv_auto_crop_check);
        ImageView imageView3 = (ImageView) x().findViewById(R.id.iv_not_ask_check);
        TextView textView = (TextView) x().findViewById(R.id.tv_not_ask_check);
        jn.a.c.getClass();
        if (jn.a.i() == 2) {
            this.B = 0;
            imageView.setImageResource(R.drawable.ic_home_selected_red);
            imageView2.setImageResource(R.drawable.ic_home_unselected_gray);
        } else {
            this.B = 1;
            imageView.setImageResource(R.drawable.ic_home_unselected_gray);
            imageView2.setImageResource(R.drawable.ic_home_selected_red);
        }
        x().findViewById(R.id.iv_no_crop).setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("H2gtc2ww", "RwkDHbBk");
                ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, p10);
                chooseCropTypeDialog.B = 0;
                imageView.setImageResource(R.drawable.ic_home_selected_red);
                imageView2.setImageResource(R.drawable.ic_home_unselected_gray);
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("R2gic1cw", "ALkOYRQ0");
                ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, p10);
                chooseCropTypeDialog.B = 0;
                imageView.setImageResource(R.drawable.ic_home_selected_red);
                imageView2.setImageResource(R.drawable.ic_home_unselected_gray);
            }
        });
        x().findViewById(R.id.iv_auto_crop).setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("O2hYc10w", "eJv38eUb");
                ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, p10);
                chooseCropTypeDialog.B = 1;
                imageView.setImageResource(R.drawable.ic_home_unselected_gray);
                imageView2.setImageResource(R.drawable.ic_home_selected_red);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("R2gic1cw", "aEzIkHnh");
                ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, p10);
                chooseCropTypeDialog.B = 1;
                imageView.setImageResource(R.drawable.ic_home_unselected_gray);
                imageView2.setImageResource(R.drawable.ic_home_selected_red);
            }
        });
        imageView3.setOnClickListener(new j1(2, this, imageView3));
        textView.setOnClickListener(new u4.j(imageView3, 16));
        TextView textView2 = this.A;
        if (textView2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog$initView$7
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
                    ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                    chooseCropTypeDialog.D = true;
                    if (chooseCropTypeDialog.B == 0) {
                        jn.a.c.getClass();
                        if (jn.a.i() != 2) {
                            jn.a.o(2);
                        }
                    } else {
                        jn.a.c.getClass();
                        if (jn.a.i() != 1) {
                            jn.a.o(1);
                        }
                    }
                    if (ChooseCropTypeDialog.this.C) {
                        jn.a.c.getClass();
                        jn.a.n(1);
                    }
                    ChooseCropTypeDialog.this.cancel();
                }
            });
        }
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.dialog.k
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                String p10 = ea.a.p("R2gic1cw", "aQldhW7m");
                ChooseCropTypeDialog chooseCropTypeDialog = ChooseCropTypeDialog.this;
                kotlin.jvm.internal.g.e(chooseCropTypeDialog, p10);
                String p11 = ea.a.p("K2VTdWc=", "nLs2bcsM");
                String str = chooseCropTypeDialog.f25677y;
                if (!TextUtils.equals(p11, str)) {
                    tn.a.d(chooseCropTypeDialog.getContext(), ea.a.p("Q2EsZSxhBmoHc3Q=", "0p13ZtUM"), ea.a.p("LHJecBhzXF8paCV3", "Lj3wWGFB"), str, false);
                }
            }
        });
        setOnDismissListener(new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.a(this, 1));
    }
}
