package pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cg.l;
import ea.a;
import fn.c;
import kl.e;
import oo.g;
import pdf.pdfreader.viewer.editor.free.R;
import tf.d;

/* compiled from: EditorFreeSaveDialog.kt */
/* loaded from: classes3.dex */
public final class EditorFreeSaveDialog extends g {
    public boolean A;

    /* renamed from: y  reason: collision with root package name */
    public l<? super Boolean, d> f25616y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f25617z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorFreeSaveDialog(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, a.p("UG8ldBZ4dA==", "Y0CrhayX"));
        this.A = true;
    }

    @Override // oo.g
    public final void G() {
        H();
    }

    public final void H() {
        Context context = getContext();
        c.c.getClass();
        String string = context.getString(R.string.arg_res_0x7f13059c, a0.a.g("<b>", c.a.b(), "</b>"));
        kotlin.jvm.internal.g.d(string, a.p("Mm9XdFx4Gi4vZRJTQHI-bl8oAC46dERploDXZ39lJmklRktlXFUdZQtvE25AfWsvWj5wKQ==", "mWQ99n9I"));
        TextView textView = (TextView) findViewById(R.id.dialog_tv_warning);
        if (textView != null) {
            textView.setText(e.b(string, new ForegroundColorSpan(androidx.core.content.a.getColor(getContext(), R.color.color_100_DD202A))));
        }
        TextView textView2 = (TextView) findViewById(R.id.dialog_tv_save);
        if (textView2 != null) {
            textView2.setText(getContext().getString(R.string.arg_res_0x7f13044e, String.valueOf(c.a.b())));
        }
    }

    public final void I(boolean z10) {
        String string;
        this.A = z10;
        TextView textView = this.f25617z;
        if (textView != null) {
            if (z10) {
                string = getContext().getString(R.string.arg_res_0x7f1302d2);
            } else {
                string = getContext().getString(R.string.arg_res_0x7f1300ff);
            }
            textView.setText(string);
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
        tn.a.d(getContext(), a.p("VmQidCxzA3Zl", "5HzQd5jy"), a.p("VmQidABhFGUtc1xvdw==", "WM0vNr6X"), a.p("DmQbdClkX188bxJhbA==", "8lkrY9ED"), false);
        tn.a.d(getContext(), a.p("VmQidCxzA3Zl", "SjgftBVn"), a.p("KmRYdAphQWUFcyJvdw==", "y3tlC4Xs"), a.p("KmRYdAlkUV88ci9l", "LkXtROMx"), false);
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_editor_free_save;
    }

    @Override // oo.g
    public final void z() {
        String string;
        TextView textView = (TextView) findViewById(R.id.dialog_tv_save);
        this.f25617z = (TextView) findViewById(R.id.dialog_tv_not_now);
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        TextView textView2 = this.f25617z;
        if (textView2 != null) {
            if (this.A) {
                string = getContext().getString(R.string.arg_res_0x7f1302d2);
            } else {
                string = getContext().getString(R.string.arg_res_0x7f1300ff);
            }
            textView2.setText(string);
        }
        H();
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog$initView$1
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
                    EditorFreeSaveDialog.this.dismiss();
                    l<? super Boolean, d> lVar = EditorFreeSaveDialog.this.f25616y;
                    if (lVar != null) {
                        lVar.invoke(Boolean.TRUE);
                    }
                    Context context = EditorFreeSaveDialog.this.getContext();
                    String p10 = a.p("VmQidCxzA3Zl", "1hXK30kg");
                    String p11 = a.p("VmQidABhFGUtc1V2DF81bC1jaw==", "0mCgOnle");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context, p10, p11, a.p("DmQbdClkX188bxJhbA==", "8lkrY9ED"), false);
                    Context context2 = EditorFreeSaveDialog.this.getContext();
                    String p12 = a.p("KmRYdCZzVnZl", "yPyxrvn2");
                    String p13 = a.p("KmRYdAphQWUFcyt2EF8LbFxjaw==", "wxxCvz3M");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context2, p12, p13, a.p("KmRYdAlkUV88ci9l", "LkXtROMx"), false);
                }
            });
        }
        TextView textView3 = this.f25617z;
        if (textView3 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView3, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog$initView$2
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
                    l<? super Boolean, d> lVar = EditorFreeSaveDialog.this.f25616y;
                    if (lVar != null) {
                        lVar.invoke(Boolean.FALSE);
                    }
                    EditorFreeSaveDialog.this.dismiss();
                    Context context = EditorFreeSaveDialog.this.getContext();
                    String p10 = a.p("VmQidCxzA3Zl", "eSqFd8Rg");
                    String p11 = a.p("FGQNdAlhI2UXZA9hV2ElZGdjPmkqaw==", "PIqdzU3U");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context, p10, p11, a.p("DmQbdClkX188bxJhbA==", "8lkrY9ED"), false);
                    Context context2 = EditorFreeSaveDialog.this.getContext();
                    String p12 = a.p("MGQvdBpzCHZl", "khUFEiiH");
                    String p13 = a.p("LWQrdDBhHWUXZA9hV2ElZGdjPmkqaw==", "nUHBCktk");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context2, p12, p13, a.p("KmRYdAlkUV88ci9l", "LkXtROMx"), false);
                }
            });
        }
        if (imageView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog$initView$3
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
                    EditorFreeSaveDialog.this.dismiss();
                    Context context = EditorFreeSaveDialog.this.getContext();
                    String p10 = a.p("VmQidCxzA3Zl", "S7Zr9v3e");
                    String p11 = a.p("MmQCdDhhRGUXYwpvR2UIY1RpMWs=", "7TWkK21P");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context, p10, p11, a.p("DmQbdClkX188bxJhbA==", "8lkrY9ED"), false);
                    Context context2 = EditorFreeSaveDialog.this.getContext();
                    String p12 = a.p("E2QtdCxzKHZl", "bHvDsI7b");
                    String p13 = a.p("FGQRdBphGGUXYwpvR2UIY1RpMWs=", "XKqxinAn");
                    EditorFreeSaveDialog.this.getClass();
                    tn.a.d(context2, p12, p13, a.p("KmRYdAlkUV88ci9l", "LkXtROMx"), false);
                }
            });
        }
    }
}
