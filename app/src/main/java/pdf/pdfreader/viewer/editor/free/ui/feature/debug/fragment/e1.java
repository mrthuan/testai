package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: DebugToastFragment.kt */
/* loaded from: classes3.dex */
public final class e1 extends b<am.s0> {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f27886d0 = 0;

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_toast, viewGroup, false);
        int i10 = R.id.all_page_display_btn;
        Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.all_page_display_btn);
        if (button != null) {
            i10 = R.id.allplayer_server_error_retry_gpt;
            Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.allplayer_server_error_retry_gpt);
            if (button2 != null) {
                i10 = R.id.already_copy;
                Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.already_copy);
                if (button3 != null) {
                    i10 = R.id.already_sbuscribed_btn;
                    Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.already_sbuscribed_btn);
                    if (button4 != null) {
                        i10 = R.id.btn_page_set_max_select;
                        Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_page_set_max_select);
                        if (button5 != null) {
                            i10 = R.id.camera_error_btn;
                            Button button6 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.camera_error_btn);
                            if (button6 != null) {
                                i10 = R.id.deleted_file_cannot_open_gpt;
                                Button button7 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.deleted_file_cannot_open_gpt);
                                if (button7 != null) {
                                    i10 = R.id.downloading_needed_resources;
                                    Button button8 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.downloading_needed_resources);
                                    if (button8 != null) {
                                        i10 = R.id.extracting_page_gpt;
                                        Button button9 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.extracting_page_gpt);
                                        if (button9 != null) {
                                            i10 = R.id.file_not_support_btn;
                                            Button button10 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.file_not_support_btn);
                                            if (button10 != null) {
                                                i10 = R.id.gallery2_file_damaged;
                                                Button button11 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.gallery2_file_damaged);
                                                if (button11 != null) {
                                                    i10 = R.id.image_unavailable_gpt_btn;
                                                    Button button12 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.image_unavailable_gpt_btn);
                                                    if (button12 != null) {
                                                        i10 = R.id.img_not_available_btn;
                                                        Button button13 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.img_not_available_btn);
                                                        if (button13 != null) {
                                                            i10 = R.id.merge_not_support_btn;
                                                            Button button14 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.merge_not_support_btn);
                                                            if (button14 != null) {
                                                                i10 = R.id.no_network_check_toast_gpt;
                                                                Button button15 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.no_network_check_toast_gpt);
                                                                if (button15 != null) {
                                                                    i10 = R.id.parse_file_btn;
                                                                    Button button16 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.parse_file_btn);
                                                                    if (button16 != null) {
                                                                        i10 = R.id.pdf_lock_fail_btn;
                                                                        Button button17 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_lock_fail_btn);
                                                                        if (button17 != null) {
                                                                            i10 = R.id.pdf_unlock_fail_btn;
                                                                            Button button18 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_unlock_fail_btn);
                                                                            if (button18 != null) {
                                                                                i10 = R.id.reader_x_btn;
                                                                                Button button19 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.reader_x_btn);
                                                                                if (button19 != null) {
                                                                                    i10 = R.id.restored_successfully_btn;
                                                                                    Button button20 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.restored_successfully_btn);
                                                                                    if (button20 != null) {
                                                                                        i10 = R.id.saveFiled;
                                                                                        Button button21 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.saveFiled);
                                                                                        if (button21 != null) {
                                                                                            i10 = R.id.save_successfully;
                                                                                            Button button22 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.save_successfully);
                                                                                            if (button22 != null) {
                                                                                                i10 = R.id.saving;
                                                                                                Button button23 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.saving);
                                                                                                if (button23 != null) {
                                                                                                    i10 = R.id.subscribe_fail_btn;
                                                                                                    Button button24 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_fail_btn);
                                                                                                    if (button24 != null) {
                                                                                                        i10 = R.id.subscribe_network_error_btn;
                                                                                                        Button button25 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_network_error_btn);
                                                                                                        if (button25 != null) {
                                                                                                            i10 = R.id.subscribe_no_valid_btn;
                                                                                                            Button button26 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_no_valid_btn);
                                                                                                            if (button26 != null) {
                                                                                                                i10 = R.id.subscribe_success_btn;
                                                                                                                Button button27 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscribe_success_btn);
                                                                                                                if (button27 != null) {
                                                                                                                    i10 = R.id.unable_to_share_gpt;
                                                                                                                    Button button28 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.unable_to_share_gpt);
                                                                                                                    if (button28 != null) {
                                                                                                                        i10 = R.id.unrecognized_image_skipped_gpt_btn;
                                                                                                                        Button button29 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.unrecognized_image_skipped_gpt_btn);
                                                                                                                        if (button29 != null) {
                                                                                                                            i10 = R.id.widgets_permission_needed_gpt;
                                                                                                                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.widgets_permission_needed_gpt);
                                                                                                                            if (textView != null) {
                                                                                                                                am.s0 s0Var = new am.s0((NestedScrollView) inflate, button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, textView);
                                                                                                                                ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpIWUTLGxmLWxAZSk=", "OaLL5CX8");
                                                                                                                                return s0Var;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("dGkacytuVCA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "Wo9iB3y1").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        final Context g02 = g0();
        ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "F0cIoGIt");
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((am.s0) vb2).D.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                e1 e1Var = this;
                Context context = g02;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "9dMaxJMF"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("AGgYcxcw", "fJtq3PgN"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f130569), false, null, -1);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("aGM6bi1lHnQ=", "yeLUYfDH"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("I2gGc0ow", "1iWon4Hk"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f130324), true, null, -1);
                        return;
                }
            }
        });
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((am.s0) vb3).f1441m.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                e1 e1Var = this;
                Context context = g02;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("VWMmbi1lLnQ=", "8mqIYVgy"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "wiPiEWA0"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f13019f), false, null, -1);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "DTgtCTG8"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "UPBmlvFU"));
                        j1.c(R.drawable.ic_copy_success, e1Var.v().getDimensionPixelSize(R.dimen.dp_100), context, e1Var.x(R.string.arg_res_0x7f1303e5), false);
                        return;
                }
            }
        });
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((am.s0) vb4).f1438j.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.c1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27878b;

            {
                this.f27878b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27878b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "YsMfvhBT"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130584), view.getContext(), false, R.drawable.ic_subscription_positive);
                        return;
                    case 1:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "u0m39nnh"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13012f), false, null, 0);
                        return;
                    default:
                        int i13 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "a75y8pWv"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13044f), true, null, 0);
                        return;
                }
            }
        });
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((am.s0) vb5).f1434f.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.w0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27935b;

            {
                this.f27935b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27935b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "He2JMSbT"));
                        j1.c(R.drawable.ic_fail_warning, 0, view.getContext(), e1Var.x(R.string.arg_res_0x7f13044c), true);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("AGgFc2cw", "HytlCjjk"));
                        j1.e(view.getContext(), e1Var.y(R.string.arg_res_0x7f130460, ea.a.p("ADAw", "CdfSrioC")), false, null, 0);
                        return;
                }
            }
        });
        VB vb6 = this.Y;
        kotlin.jvm.internal.g.b(vb6);
        ((am.s0) vb6).C.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27939b;

            {
                this.f27939b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27939b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "BcrOUhvX"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130425), view.getContext(), false, R.drawable.ic_subscription_positive);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("N2ghc0Ew", "AmCHerps"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13055f), true, null, 0);
                        return;
                }
            }
        });
        VB vb7 = this.Y;
        kotlin.jvm.internal.g.b(vb7);
        ((am.s0) vb7).c.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.y0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27943b;

            {
                this.f27943b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27943b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("MmhQc0Yw", "NKF9bqXM"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130057), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("TWg5c1ww", "Lb9PxRim"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f130054), true, null, 0);
                        return;
                }
            }
        });
        VB vb8 = this.Y;
        kotlin.jvm.internal.g.b(vb8);
        ((am.s0) vb8).f1436h.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.z0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27945b;

            {
                this.f27945b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27945b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("M2ghc0cw", "XOGHcTqF"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130104), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "VoSQsdU8"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f1300ea), true, null, 0);
                        return;
                }
            }
        });
        VB vb9 = this.Y;
        kotlin.jvm.internal.g.b(vb9);
        ((am.s0) vb9).f1444p.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.a1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27867b;

            {
                this.f27867b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27867b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "IMzIr6aG"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f1302b0), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("GGglc0ww", "cylLh7xT"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f1302c9), true, null, 0);
                        return;
                }
            }
        });
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        ((am.s0) vb10).f1432d.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.b1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27872b;

            {
                this.f27872b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27872b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "eDYJZPFa"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f1304a1), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "9Rme0bSj"));
                        j1.c(R.drawable.ic_copy_success, 0, view.getContext(), e1Var.x(R.string.arg_res_0x7f130056), false);
                        return;
                }
            }
        });
        VB vb11 = this.Y;
        kotlin.jvm.internal.g.b(vb11);
        ((am.s0) vb11).f1452x.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.c1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27878b;

            {
                this.f27878b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27878b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "YsMfvhBT"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130584), view.getContext(), false, R.drawable.ic_subscription_positive);
                        return;
                    case 1:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "u0m39nnh"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13012f), false, null, 0);
                        return;
                    default:
                        int i13 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "a75y8pWv"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13044f), true, null, 0);
                        return;
                }
            }
        });
        VB vb12 = this.Y;
        kotlin.jvm.internal.g.b(vb12);
        ((am.s0) vb12).f1450v.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.w0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27935b;

            {
                this.f27935b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27935b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "He2JMSbT"));
                        j1.c(R.drawable.ic_fail_warning, 0, view.getContext(), e1Var.x(R.string.arg_res_0x7f13044c), true);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("AGgFc2cw", "HytlCjjk"));
                        j1.e(view.getContext(), e1Var.y(R.string.arg_res_0x7f130460, ea.a.p("ADAw", "CdfSrioC")), false, null, 0);
                        return;
                }
            }
        });
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        ((am.s0) vb13).f1449u.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27939b;

            {
                this.f27939b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27939b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "BcrOUhvX"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130425), view.getContext(), false, R.drawable.ic_subscription_positive);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("N2ghc0Ew", "AmCHerps"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13055f), true, null, 0);
                        return;
                }
            }
        });
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        ((am.s0) vb14).f1433e.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.y0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27943b;

            {
                this.f27943b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27943b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("MmhQc0Yw", "NKF9bqXM"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130057), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("TWg5c1ww", "Lb9PxRim"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f130054), true, null, 0);
                        return;
                }
            }
        });
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        ((am.s0) vb15).A.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.z0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27945b;

            {
                this.f27945b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27945b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("M2ghc0cw", "XOGHcTqF"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130104), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "VoSQsdU8"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f1300ea), true, null, 0);
                        return;
                }
            }
        });
        VB vb16 = this.Y;
        kotlin.jvm.internal.g.b(vb16);
        ((am.s0) vb16).f1454z.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.a1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27867b;

            {
                this.f27867b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27867b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "IMzIr6aG"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f1302b0), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("GGglc0ww", "cylLh7xT"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f1302c9), true, null, 0);
                        return;
                }
            }
        });
        VB vb17 = this.Y;
        kotlin.jvm.internal.g.b(vb17);
        ((am.s0) vb17).f1453y.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.b1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27872b;

            {
                this.f27872b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27872b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "eDYJZPFa"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f1304a1), view.getContext(), true, R.drawable.ic_subscription_negative);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "9Rme0bSj"));
                        j1.c(R.drawable.ic_copy_success, 0, view.getContext(), e1Var.x(R.string.arg_res_0x7f130056), false);
                        return;
                }
            }
        });
        VB vb18 = this.Y;
        kotlin.jvm.internal.g.b(vb18);
        ((am.s0) vb18).B.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.c1

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e1 f27878b;

            {
                this.f27878b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                e1 e1Var = this.f27878b;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "YsMfvhBT"));
                        j1.h(e1Var.x(R.string.arg_res_0x7f130584), view.getContext(), false, R.drawable.ic_subscription_positive);
                        return;
                    case 1:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "u0m39nnh"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13012f), false, null, 0);
                        return;
                    default:
                        int i13 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "a75y8pWv"));
                        j1.e(view.getContext(), e1Var.x(R.string.arg_res_0x7f13044f), true, null, 0);
                        return;
                }
            }
        });
        VB vb19 = this.Y;
        kotlin.jvm.internal.g.b(vb19);
        ((am.s0) vb19).f1443o.setOnClickListener(new w(g02, 7));
        VB vb20 = this.Y;
        kotlin.jvm.internal.g.b(vb20);
        ((am.s0) vb20).f1448t.setOnClickListener(new k0(g02, 8));
        VB vb21 = this.Y;
        kotlin.jvm.internal.g.b(vb21);
        ((am.s0) vb21).f1431b.setOnClickListener(new l0(g02, 3));
        VB vb22 = this.Y;
        kotlin.jvm.internal.g.b(vb22);
        ((am.s0) vb22).f1445q.setOnClickListener(new qb.j1(8, g02, this));
        VB vb23 = this.Y;
        kotlin.jvm.internal.g.b(vb23);
        ((am.s0) vb23).f1439k.setOnClickListener(new vm.g(6, g02, this));
        VB vb24 = this.Y;
        kotlin.jvm.internal.g.b(vb24);
        ((am.s0) vb24).f1446r.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                e1 e1Var = this;
                Context context = g02;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "9dMaxJMF"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("AGgYcxcw", "fJtq3PgN"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f130569), false, null, -1);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("aGM6bi1lHnQ=", "yeLUYfDH"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("I2gGc0ow", "1iWon4Hk"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f130324), true, null, -1);
                        return;
                }
            }
        });
        VB vb25 = this.Y;
        kotlin.jvm.internal.g.b(vb25);
        ((am.s0) vb25).f1447s.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.adapter.j(4, g02, this));
        VB vb26 = this.Y;
        kotlin.jvm.internal.g.b(vb26);
        ((am.s0) vb26).f1442n.setOnClickListener(new k0(g02, 9));
        VB vb27 = this.Y;
        kotlin.jvm.internal.g.b(vb27);
        ((am.s0) vb27).f1435g.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(5, g02, this));
        VB vb28 = this.Y;
        kotlin.jvm.internal.g.b(vb28);
        ((am.s0) vb28).f1451w.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r3;
                e1 e1Var = this;
                Context context = g02;
                switch (i10) {
                    case 0:
                        int i11 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("VWMmbi1lLnQ=", "8mqIYVgy"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("R2gic1cw", "wiPiEWA0"));
                        j1.e(context, e1Var.v().getString(R.string.arg_res_0x7f13019f), false, null, -1);
                        return;
                    default:
                        int i12 = e1.f27886d0;
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "DTgtCTG8"));
                        kotlin.jvm.internal.g.e(e1Var, ea.a.p("O2hYc10w", "UPBmlvFU"));
                        j1.c(R.drawable.ic_copy_success, e1Var.v().getDimensionPixelSize(R.dimen.dp_100), context, e1Var.x(R.string.arg_res_0x7f1303e5), false);
                        return;
                }
            }
        });
        VB vb29 = this.Y;
        kotlin.jvm.internal.g.b(vb29);
        String x4 = x(R.string.arg_res_0x7f130589);
        kotlin.jvm.internal.g.d(x4, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHcsZAJlNXM9cBxyCmk8c1hvF19ZZT9kL2QqZxh0KQ==", "3WNbAbyg"));
        ((am.s0) vb29).E.setText(kotlin.text.j.K(kotlin.text.j.K(x4, ea.a.p("W2I-", "WMgtsCqG"), ""), ea.a.p("Ri8kPg==", "7YzFqOXY"), ""));
        VB vb30 = this.Y;
        kotlin.jvm.internal.g.b(vb30);
        ((am.s0) vb30).f1437i.setOnClickListener(new b0(g02, 6));
        VB vb31 = this.Y;
        kotlin.jvm.internal.g.b(vb31);
        ((am.s0) vb31).f1440l.setOnClickListener(new c0(g02, 5));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
