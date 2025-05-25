package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PreviewViewSettingsDialog.kt */
/* loaded from: classes3.dex */
public final class PreviewViewSettingsDialog extends oo.g {
    public final int A;
    public final boolean B;
    public cg.p<? super Integer, ? super Boolean, tf.d> C;
    public cg.l<? super Boolean, tf.d> D;
    public cg.a<tf.d> E;
    public ImageView F;
    public ImageView G;
    public TextView H;

    /* renamed from: y  reason: collision with root package name */
    public final int f27468y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f27469z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewViewSettingsDialog(jl.a aVar, int i10, boolean z10, int i11, boolean z11) {
        super(aVar, (Object) null);
        ea.a.p("LG9fdBx4dA==", "yWRNJ38L");
        this.f27468y = i10;
        this.f27469z = z10;
        this.A = i11;
        this.B = z11;
    }

    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    public final void H(int i10, boolean z10, boolean z11) {
        int i11 = 0;
        int i12 = 3;
        if (i10 != 1) {
            if (i10 != 3) {
                Context context = getContext();
                String p10 = ea.a.p("OWlUdyZ3WHI-XydvEWU=", "dYf6QT2t");
                if (!z10) {
                    i11 = 2;
                }
                pdf.pdfreader.viewer.editor.free.utils.q0.x(context, i11, p10);
                return;
            }
            Context context2 = getContext();
            String p11 = ea.a.p("RWkudyxwEnQtbVtkZQ==", "rYaEYkZZ");
            if (z10) {
                i12 = 1;
            }
            pdf.pdfreader.viewer.editor.free.utils.q0.x(context2, i12, p11);
            return;
        }
        Context context3 = getContext();
        String p12 = ea.a.p("RWkudyxtDWRl", "DznDyb15");
        if (z10) {
            if (!z11) {
                i11 = 1;
            }
        } else if (z11) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.x(context3, i11, p12);
    }

    public final void I(boolean z10) {
        if (z10) {
            ImageView imageView = this.F;
            if (imageView != null) {
                imageView.setSelected(true);
            }
            ImageView imageView2 = this.G;
            if (imageView2 != null) {
                imageView2.setSelected(false);
            }
            ImageView imageView3 = this.F;
            if (imageView3 != null) {
                imageView3.setBackgroundResource(R.drawable.bg_view_setting_top_item_selected);
            }
            ImageView imageView4 = this.G;
            if (imageView4 != null) {
                imageView4.setBackgroundResource(R.drawable.bg_corner12_f4f7f9_2b2e32);
                return;
            }
            return;
        }
        ImageView imageView5 = this.F;
        if (imageView5 != null) {
            imageView5.setSelected(false);
        }
        ImageView imageView6 = this.G;
        if (imageView6 != null) {
            imageView6.setSelected(true);
        }
        ImageView imageView7 = this.F;
        if (imageView7 != null) {
            imageView7.setBackgroundResource(R.drawable.bg_corner12_f4f7f9_2b2e32);
        }
        ImageView imageView8 = this.G;
        if (imageView8 != null) {
            imageView8.setBackgroundResource(R.drawable.bg_view_setting_top_item_selected);
        }
    }

    public final void J(boolean z10) {
        if (z10) {
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(R.string.arg_res_0x7f1304ac);
                return;
            }
            return;
        }
        TextView textView2 = this.H;
        if (textView2 != null) {
            textView2.setText(R.string.arg_res_0x7f1304ad);
        }
    }

    @Override // oo.g, android.app.Dialog
    public final void show() {
        super.show();
    }

    @Override // oo.g
    public final int w() {
        return R.layout.layout_preview_pdf_setting_dialog;
    }

    @Override // oo.g
    public final void z() {
        int l10;
        int l11;
        boolean z10;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.show_setting_vertical);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.show_setting_horizontal);
        this.F = (ImageView) findViewById(R.id.iv_show_setting_vertical);
        this.G = (ImageView) findViewById(R.id.iv_show_setting_horizontal);
        final SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.show_pdf_setting_continuous);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.ll_pdf_setting_continuous);
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.show_pdf_settings_inversion_color);
        this.H = (TextView) findViewById(R.id.show_pdf_settings_switch_landscape);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.ll_top);
        View findViewById = findViewById(R.id.view_top_line);
        J(this.B);
        int i10 = this.f27468y;
        if (i10 != 1) {
            if (i10 != 3) {
                if (i10 != 4 && i10 != 5) {
                    l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, "word_inversion_type");
                } else {
                    l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, "excel_inversion_type");
                }
            } else {
                l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, "ppt_inversion_type");
            }
        } else {
            l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, "pdf_inversion_type");
        }
        if (switchCompat2 != null) {
            if (l10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            switchCompat2.setChecked(z10);
        }
        int i11 = this.A;
        boolean z11 = this.f27469z;
        if (i10 == 1 && !z11 && i11 > 1) {
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(0);
            }
        } else if (linearLayout3 != null) {
            linearLayout3.setVisibility(8);
        }
        if (i10 != 4) {
            if (!z11 && i11 > 1) {
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(0);
                }
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            } else {
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }
            if (i10 != 1) {
                if (i10 != 3) {
                    l11 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, ea.a.p("OWlUdyZ3WHI-XydvEWU=", "zNy2IREI"));
                } else {
                    l11 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 3, ea.a.p("OWlUdyZwR3QFbSVkZQ==", "g6sFRI6w"));
                }
            } else {
                l11 = pdf.pdfreader.viewer.editor.free.utils.q0.l(getContext(), 0, ea.a.p("B2lddwttPWRl", "ovq8TRRs"));
            }
            if (l11 != 0) {
                if (l11 != 1) {
                    if (l11 != 2) {
                        if (l11 != 3) {
                            I(true);
                            if (switchCompat != null) {
                                switchCompat.setChecked(true);
                            }
                        } else {
                            I(false);
                            if (switchCompat != null) {
                                switchCompat.setChecked(false);
                            }
                        }
                    } else {
                        I(false);
                        if (switchCompat != null) {
                            switchCompat.setChecked(true);
                        }
                    }
                } else {
                    I(true);
                    if (switchCompat != null) {
                        switchCompat.setChecked(false);
                    }
                }
            } else {
                I(true);
                if (switchCompat != null) {
                    switchCompat.setChecked(true);
                }
            }
        } else {
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        if (linearLayout != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewViewSettingsDialog$initView$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ImageView imageView = PreviewViewSettingsDialog.this.F;
                    int i12 = 0;
                    if (imageView != null && imageView.isSelected()) {
                        return;
                    }
                    PreviewViewSettingsDialog.this.I(true);
                    PreviewViewSettingsDialog previewViewSettingsDialog = PreviewViewSettingsDialog.this;
                    int i13 = previewViewSettingsDialog.f27468y;
                    SwitchCompat switchCompat3 = switchCompat;
                    previewViewSettingsDialog.H(i13, true, switchCompat3 != null ? switchCompat3.isChecked() : true);
                    cg.p<? super Integer, ? super Boolean, tf.d> pVar = PreviewViewSettingsDialog.this.C;
                    if (pVar != null) {
                        SwitchCompat switchCompat4 = switchCompat;
                        if (switchCompat4 != null && !switchCompat4.isChecked()) {
                            i12 = 1;
                        }
                        pVar.invoke(Integer.valueOf(i12), Boolean.TRUE);
                    }
                }
            });
        }
        if (linearLayout2 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewViewSettingsDialog$initView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    ImageView imageView = PreviewViewSettingsDialog.this.G;
                    boolean z12 = true;
                    if (imageView != null && imageView.isSelected()) {
                        return;
                    }
                    PreviewViewSettingsDialog.this.I(false);
                    PreviewViewSettingsDialog previewViewSettingsDialog = PreviewViewSettingsDialog.this;
                    int i12 = previewViewSettingsDialog.f27468y;
                    SwitchCompat switchCompat3 = switchCompat;
                    previewViewSettingsDialog.H(i12, false, switchCompat3 != null ? switchCompat3.isChecked() : true);
                    cg.p<? super Integer, ? super Boolean, tf.d> pVar = PreviewViewSettingsDialog.this.C;
                    if (pVar != null) {
                        SwitchCompat switchCompat4 = switchCompat;
                        if (switchCompat4 == null || switchCompat4.isChecked()) {
                            z12 = false;
                        }
                        pVar.invoke(Integer.valueOf(!z12 ? 2 : 3), Boolean.TRUE);
                    }
                }
            });
        }
        if (switchCompat2 != null) {
            switchCompat2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.n2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    String p10 = ea.a.p("O2hYc10w", "XWkdQKTr");
                    PreviewViewSettingsDialog previewViewSettingsDialog = PreviewViewSettingsDialog.this;
                    kotlin.jvm.internal.g.e(previewViewSettingsDialog, p10);
                    int i12 = 2;
                    int i13 = previewViewSettingsDialog.f27468y;
                    try {
                        if (i13 != 1) {
                            if (i13 != 2) {
                                if (i13 != 3) {
                                    if (i13 != 4 && i13 != 5) {
                                        Context context = previewViewSettingsDialog.getContext();
                                        if (!z12) {
                                            i12 = 1;
                                        }
                                        pdf.pdfreader.viewer.editor.free.utils.q0.h(context).edit().putInt("txt_inversion_type", i12).apply();
                                    } else {
                                        Context context2 = previewViewSettingsDialog.getContext();
                                        if (!z12) {
                                            i12 = 1;
                                        }
                                        pdf.pdfreader.viewer.editor.free.utils.q0.h(context2).edit().putInt("excel_inversion_type", i12).apply();
                                    }
                                } else {
                                    Context context3 = previewViewSettingsDialog.getContext();
                                    if (!z12) {
                                        i12 = 1;
                                    }
                                    pdf.pdfreader.viewer.editor.free.utils.q0.h(context3).edit().putInt("ppt_inversion_type", i12).apply();
                                }
                            } else {
                                Context context4 = previewViewSettingsDialog.getContext();
                                if (!z12) {
                                    i12 = 1;
                                }
                                pdf.pdfreader.viewer.editor.free.utils.q0.h(context4).edit().putInt("word_inversion_type", i12).apply();
                            }
                        } else {
                            Context context5 = previewViewSettingsDialog.getContext();
                            if (!z12) {
                                i12 = 1;
                            }
                            pdf.pdfreader.viewer.editor.free.utils.q0.h(context5).edit().putInt("pdf_inversion_type", i12).apply();
                        }
                    } catch (Exception unused) {
                    }
                    cg.l<? super Boolean, tf.d> lVar = previewViewSettingsDialog.D;
                    if (lVar != null) {
                        lVar.invoke(Boolean.valueOf(z12));
                    }
                }
            });
        }
        if (switchCompat != null) {
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.o2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
                    boolean z13;
                    boolean z14;
                    String p10 = ea.a.p("R2gic1cw", "bb0ZeOcD");
                    PreviewViewSettingsDialog previewViewSettingsDialog = PreviewViewSettingsDialog.this;
                    kotlin.jvm.internal.g.e(previewViewSettingsDialog, p10);
                    ImageView imageView = previewViewSettingsDialog.F;
                    if (imageView != null) {
                        z13 = imageView.isSelected();
                    } else {
                        z13 = true;
                    }
                    previewViewSettingsDialog.H(previewViewSettingsDialog.f27468y, z13, z12);
                    ImageView imageView2 = previewViewSettingsDialog.F;
                    if (imageView2 != null && !imageView2.isSelected()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!z14) {
                        if (z12) {
                            cg.p<? super Integer, ? super Boolean, tf.d> pVar = previewViewSettingsDialog.C;
                            if (pVar != null) {
                                pVar.invoke(0, Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        cg.p<? super Integer, ? super Boolean, tf.d> pVar2 = previewViewSettingsDialog.C;
                        if (pVar2 != null) {
                            pVar2.invoke(1, Boolean.FALSE);
                        }
                    } else if (z12) {
                        cg.p<? super Integer, ? super Boolean, tf.d> pVar3 = previewViewSettingsDialog.C;
                        if (pVar3 != null) {
                            pVar3.invoke(2, Boolean.FALSE);
                        }
                    } else {
                        cg.p<? super Integer, ? super Boolean, tf.d> pVar4 = previewViewSettingsDialog.C;
                        if (pVar4 != null) {
                            pVar4.invoke(3, Boolean.FALSE);
                        }
                    }
                }
            });
        }
        TextView textView = this.H;
        if (textView != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewViewSettingsDialog$initView$5
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
                    cg.a<tf.d> aVar = PreviewViewSettingsDialog.this.E;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                }
            });
        }
    }
}
