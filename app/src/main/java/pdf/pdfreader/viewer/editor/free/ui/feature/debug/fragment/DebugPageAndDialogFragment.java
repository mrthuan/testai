package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import am.x2;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m0;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import eightbitlab.com.blurview.BlurView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity.HomeScreenPermissionGuideActivity;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingOpenWithGuideABActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingOpenWithGuideActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.SettingStoragePermissionGuideActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.m2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.r2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.s2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugViewModel;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.h1;

/* compiled from: DebugPageAndDialogFragment.kt */
/* loaded from: classes3.dex */
public final class DebugPageAndDialogFragment extends b<am.r0> {

    /* renamed from: g0  reason: collision with root package name */
    public static final /* synthetic */ int f27860g0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.lifecycle.k0 f27861d0 = androidx.fragment.app.y0.a(this, kotlin.jvm.internal.i.a(ReaderDebugViewModel.class), new cg.a<androidx.lifecycle.o0>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final androidx.lifecycle.o0 invoke() {
            androidx.lifecycle.o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("RmU9dVByDUErdA92XXQuKBEuJGksd3tvEGUdUyVvMGU=", "Py4L9hRk"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsM1YZZSVNNmQqbHJyHGFDaTVuD3gBcglz", "dNvMGpRY"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("PWVAdRByUkE5dCN2HHQRKBwuCmUjYRBsM1ZRZTlNCWQqbGFyFnZeZD9yDGEWdAdyeQ==", "gTvJG8Nf"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: e0  reason: collision with root package name */
    public final a f27862e0 = new a();

    /* renamed from: f0  reason: collision with root package name */
    public j2 f27863f0;

    /* compiled from: DebugPageAndDialogFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a implements oo.a {
        public a() {
        }

        @Override // oo.a
        public final void a() {
            Toast.makeText(DebugPageAndDialogFragment.this.r(), ea.a.p("IGs=", "gYppMVZd"), 0).show();
        }

        @Override // oo.a
        public final void cancel() {
            Toast.makeText(DebugPageAndDialogFragment.this.r(), ea.a.p("AGEjYzFs", "AtcMT9Dl"), 0).show();
        }
    }

    public static void u0(Context context, DebugPageAndDialogFragment debugPageAndDialogFragment) {
        kotlin.jvm.internal.g.e(context, ea.a.p("Y2MdbkBlM3Q=", "2qGr4Koq"));
        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("I2gZcxIw", "mhWp6oqR"));
        OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$2$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }
        });
        String x4 = debugPageAndDialogFragment.x(R.string.arg_res_0x7f130128);
        kotlin.jvm.internal.g.d(x4, ea.a.p("LmUkUwVyEG4vKDQuR3QlaVZnfGUxdERhF3QuZjBpLmUtXzdwBSk=", "6MIPqycU"));
        operatePdfFailedDialog.H(x4, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1301a4));
        operatePdfFailedDialog.show();
    }

    public static void v0(Context context, DebugPageAndDialogFragment debugPageAndDialogFragment) {
        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "5At156QY"));
        kotlin.jvm.internal.g.e(context, ea.a.p("bWMbbi5lQXQ=", "8HItZ9gG"));
        debugPageAndDialogFragment.x(R.string.arg_res_0x7f1301a4);
        OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$1$1
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }
        });
        String x4 = debugPageAndDialogFragment.x(R.string.arg_res_0x7f130128);
        kotlin.jvm.internal.g.d(x4, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGU-dDFhMHQRZgdpFGVXXyxwByk=", "SNfxCbE7"));
        operatePdfFailedDialog.H(x4, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130129));
        operatePdfFailedDialog.show();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.g.e(newConfig, "newConfig");
        this.F = true;
        j2 j2Var = this.f27863f0;
        if (j2Var != null && j2Var.isShowing()) {
            j2Var.b();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_page_dialog, viewGroup, false);
        int i10 = R.id.always_show_add_text_guide;
        CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_add_text_guide);
        if (checkBox != null) {
            i10 = R.id.always_show_add_text_red_dot;
            CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_add_text_red_dot);
            if (checkBox2 != null) {
                i10 = R.id.always_show_clear_default_switch;
                CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_clear_default_switch);
                if (checkBox3 != null) {
                    i10 = R.id.always_show_sign_red_dot;
                    CheckBox checkBox4 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_sign_red_dot);
                    if (checkBox4 != null) {
                        i10 = R.id.ask_btn;
                        Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ask_btn);
                        if (button != null) {
                            i10 = R.id.btn_choose_file_top_permission;
                            Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_choose_file_top_permission);
                            if (button2 != null) {
                                i10 = R.id.btn_clear_take_pic;
                                Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_clear_take_pic);
                                if (button3 != null) {
                                    i10 = R.id.btn_extract_err_oom;
                                    Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_extract_err_oom);
                                    if (button4 != null) {
                                        i10 = R.id.btn_extract_err_other;
                                        Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_extract_err_other);
                                        if (button5 != null) {
                                            i10 = R.id.btn_first_pdf_create_guide;
                                            Button button6 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_first_pdf_create_guide);
                                            if (button6 != null) {
                                                i10 = R.id.btn_home_screen_permission_guide;
                                                Button button7 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_home_screen_permission_guide);
                                                if (button7 != null) {
                                                    i10 = R.id.btn_home_widget_permission_guide;
                                                    Button button8 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_home_widget_permission_guide);
                                                    if (button8 != null) {
                                                        i10 = R.id.btn_inserting;
                                                        Button button9 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_inserting);
                                                        if (button9 != null) {
                                                            i10 = R.id.btn_intent_ai_chat;
                                                            Button button10 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_intent_ai_chat);
                                                            if (button10 != null) {
                                                                i10 = R.id.btn_item_click_loading;
                                                                Button button11 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_item_click_loading);
                                                                if (button11 != null) {
                                                                    i10 = R.id.btn_page_manager_delete;
                                                                    Button button12 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_page_manager_delete);
                                                                    if (button12 != null) {
                                                                        i10 = R.id.btn_page_manager_quit;
                                                                        Button button13 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_page_manager_quit);
                                                                        if (button13 != null) {
                                                                            i10 = R.id.btn_page_manager_save;
                                                                            Button button14 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_page_manager_save);
                                                                            if (button14 != null) {
                                                                                i10 = R.id.btn_pdf2img_loading;
                                                                                Button button15 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_pdf2img_loading);
                                                                                if (button15 != null) {
                                                                                    i10 = R.id.btn_sign_back_save_dialog;
                                                                                    Button button16 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_sign_back_save_dialog);
                                                                                    if (button16 != null) {
                                                                                        i10 = R.id.btn_sign_switch_tab_dialog;
                                                                                        Button button17 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_sign_switch_tab_dialog);
                                                                                        if (button17 != null) {
                                                                                            i10 = R.id.btn_word2pdf_convert_loading;
                                                                                            Button button18 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_word2pdf_convert_loading);
                                                                                            if (button18 != null) {
                                                                                                i10 = R.id.btn_word2pdf_top_tips;
                                                                                                Button button19 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_word2pdf_top_tips);
                                                                                                if (button19 != null) {
                                                                                                    i10 = R.id.clear_default_btn;
                                                                                                    Button button20 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.clear_default_btn);
                                                                                                    if (button20 != null) {
                                                                                                        i10 = R.id.delete_btn;
                                                                                                        Button button21 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.delete_btn);
                                                                                                        if (button21 != null) {
                                                                                                            i10 = R.id.download_failed_des;
                                                                                                            Button button22 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.download_failed_des);
                                                                                                            if (button22 != null) {
                                                                                                                i10 = R.id.download_failed_network;
                                                                                                                Button button23 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.download_failed_network);
                                                                                                                if (button23 != null) {
                                                                                                                    i10 = R.id.file_oom_error_btn;
                                                                                                                    Button button24 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.file_oom_error_btn);
                                                                                                                    if (button24 != null) {
                                                                                                                        i10 = R.id.file_parse_fail_btn;
                                                                                                                        Button button25 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.file_parse_fail_btn);
                                                                                                                        if (button25 != null) {
                                                                                                                            i10 = R.id.file_system_error_btn;
                                                                                                                            Button button26 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.file_system_error_btn);
                                                                                                                            if (button26 != null) {
                                                                                                                                i10 = R.id.image_adjust_confirm_btn;
                                                                                                                                Button button27 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.image_adjust_confirm_btn);
                                                                                                                                if (button27 != null) {
                                                                                                                                    i10 = R.id.image_adjust_delete_btn;
                                                                                                                                    Button button28 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.image_adjust_delete_btn);
                                                                                                                                    if (button28 != null) {
                                                                                                                                        i10 = R.id.local_file_change_btn;
                                                                                                                                        Button button29 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.local_file_change_btn);
                                                                                                                                        if (button29 != null) {
                                                                                                                                            i10 = R.id.memory_low1_btn;
                                                                                                                                            Button button30 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.memory_low1_btn);
                                                                                                                                            if (button30 != null) {
                                                                                                                                                i10 = R.id.memory_low2_btn;
                                                                                                                                                Button button31 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.memory_low2_btn);
                                                                                                                                                if (button31 != null) {
                                                                                                                                                    i10 = R.id.merge_oom_error_btn;
                                                                                                                                                    Button button32 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.merge_oom_error_btn);
                                                                                                                                                    if (button32 != null) {
                                                                                                                                                        i10 = R.id.merge_split_rename_btn;
                                                                                                                                                        Button button33 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.merge_split_rename_btn);
                                                                                                                                                        if (button33 != null) {
                                                                                                                                                            i10 = R.id.merge_unKnow_error_btn;
                                                                                                                                                            Button button34 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.merge_unKnow_error_btn);
                                                                                                                                                            if (button34 != null) {
                                                                                                                                                                i10 = R.id.open_with_guide_a_btn;
                                                                                                                                                                Button button35 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_with_guide_a_btn);
                                                                                                                                                                if (button35 != null) {
                                                                                                                                                                    i10 = R.id.open_with_guide_b_btn;
                                                                                                                                                                    Button button36 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_with_guide_b_btn);
                                                                                                                                                                    if (button36 != null) {
                                                                                                                                                                        i10 = R.id.open_with_guide_c_btn;
                                                                                                                                                                        Button button37 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_with_guide_c_btn);
                                                                                                                                                                        if (button37 != null) {
                                                                                                                                                                            i10 = R.id.pdf2image_permission_dialog1;
                                                                                                                                                                            Button button38 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf2image_permission_dialog1);
                                                                                                                                                                            if (button38 != null) {
                                                                                                                                                                                i10 = R.id.pdf2image_permission_dialog2;
                                                                                                                                                                                Button button39 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf2image_permission_dialog2);
                                                                                                                                                                                if (button39 != null) {
                                                                                                                                                                                    i10 = R.id.permission_access_btn;
                                                                                                                                                                                    Button button40 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.permission_access_btn);
                                                                                                                                                                                    if (button40 != null) {
                                                                                                                                                                                        i10 = R.id.permission_goToSet_btn;
                                                                                                                                                                                        Button button41 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.permission_goToSet_btn);
                                                                                                                                                                                        if (button41 != null) {
                                                                                                                                                                                            i10 = R.id.permission_guide_btn;
                                                                                                                                                                                            Button button42 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.permission_guide_btn);
                                                                                                                                                                                            if (button42 != null) {
                                                                                                                                                                                                i10 = R.id.permission_rationale_btn;
                                                                                                                                                                                                Button button43 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.permission_rationale_btn);
                                                                                                                                                                                                if (button43 != null) {
                                                                                                                                                                                                    i10 = R.id.pixel_clear_default_dialog_btn;
                                                                                                                                                                                                    Button button44 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pixel_clear_default_dialog_btn);
                                                                                                                                                                                                    if (button44 != null) {
                                                                                                                                                                                                        i10 = R.id.preview_no_pdf_lock_btn;
                                                                                                                                                                                                        Button button45 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.preview_no_pdf_lock_btn);
                                                                                                                                                                                                        if (button45 != null) {
                                                                                                                                                                                                            i10 = R.id.quit_merge_btn;
                                                                                                                                                                                                            Button button46 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.quit_merge_btn);
                                                                                                                                                                                                            if (button46 != null) {
                                                                                                                                                                                                                i10 = R.id.quit_split_btn;
                                                                                                                                                                                                                Button button47 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.quit_split_btn);
                                                                                                                                                                                                                if (button47 != null) {
                                                                                                                                                                                                                    i10 = R.id.read_only_btn;
                                                                                                                                                                                                                    Button button48 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.read_only_btn);
                                                                                                                                                                                                                    if (button48 != null) {
                                                                                                                                                                                                                        i10 = R.id.samsung_clear_default_dialog_btn;
                                                                                                                                                                                                                        Button button49 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.samsung_clear_default_dialog_btn);
                                                                                                                                                                                                                        if (button49 != null) {
                                                                                                                                                                                                                            i10 = R.id.set_default_btn;
                                                                                                                                                                                                                            Button button50 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.set_default_btn);
                                                                                                                                                                                                                            if (button50 != null) {
                                                                                                                                                                                                                                i10 = R.id.showAdjustCropGuideSwitch;
                                                                                                                                                                                                                                CheckBox checkBox5 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.showAdjustCropGuideSwitch);
                                                                                                                                                                                                                                if (checkBox5 != null) {
                                                                                                                                                                                                                                    i10 = R.id.show_home_tools_guide;
                                                                                                                                                                                                                                    CheckBox checkBox6 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_home_tools_guide);
                                                                                                                                                                                                                                    if (checkBox6 != null) {
                                                                                                                                                                                                                                        i10 = R.id.show_inversion_tip_switch;
                                                                                                                                                                                                                                        CheckBox checkBox7 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_inversion_tip_switch);
                                                                                                                                                                                                                                        if (checkBox7 != null) {
                                                                                                                                                                                                                                            i10 = R.id.show_language_tip_switch;
                                                                                                                                                                                                                                            CheckBox checkBox8 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_language_tip_switch);
                                                                                                                                                                                                                                            if (checkBox8 != null) {
                                                                                                                                                                                                                                                i10 = R.id.show_ocr_dialog_btn;
                                                                                                                                                                                                                                                Button button51 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_ocr_dialog_btn);
                                                                                                                                                                                                                                                if (button51 != null) {
                                                                                                                                                                                                                                                    i10 = R.id.show_page_adjust_guide_switch;
                                                                                                                                                                                                                                                    CheckBox checkBox9 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_page_adjust_guide_switch);
                                                                                                                                                                                                                                                    if (checkBox9 != null) {
                                                                                                                                                                                                                                                        i10 = R.id.show_preview_ai_guide;
                                                                                                                                                                                                                                                        CheckBox checkBox10 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_preview_ai_guide);
                                                                                                                                                                                                                                                        if (checkBox10 != null) {
                                                                                                                                                                                                                                                            i10 = R.id.show_reflow_tip_switch;
                                                                                                                                                                                                                                                            CheckBox checkBox11 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_reflow_tip_switch);
                                                                                                                                                                                                                                                            if (checkBox11 != null) {
                                                                                                                                                                                                                                                                i10 = R.id.show_reflow_update_red_dot;
                                                                                                                                                                                                                                                                CheckBox checkBox12 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_reflow_update_red_dot);
                                                                                                                                                                                                                                                                if (checkBox12 != null) {
                                                                                                                                                                                                                                                                    i10 = R.id.show_reflow_update_tip_switch;
                                                                                                                                                                                                                                                                    CheckBox checkBox13 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_reflow_update_tip_switch);
                                                                                                                                                                                                                                                                    if (checkBox13 != null) {
                                                                                                                                                                                                                                                                        i10 = R.id.show_reflow_use_tip_switch;
                                                                                                                                                                                                                                                                        CheckBox checkBox14 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_reflow_use_tip_switch);
                                                                                                                                                                                                                                                                        if (checkBox14 != null) {
                                                                                                                                                                                                                                                                            i10 = R.id.show_scanner_dialog_btn;
                                                                                                                                                                                                                                                                            Button button52 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_scanner_dialog_btn);
                                                                                                                                                                                                                                                                            if (button52 != null) {
                                                                                                                                                                                                                                                                                i10 = R.id.show_tools_ai_answer_change_guide;
                                                                                                                                                                                                                                                                                CheckBox checkBox15 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_tools_ai_answer_change_guide);
                                                                                                                                                                                                                                                                                if (checkBox15 != null) {
                                                                                                                                                                                                                                                                                    i10 = R.id.show_tools_ai_historty_guide;
                                                                                                                                                                                                                                                                                    CheckBox checkBox16 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_tools_ai_historty_guide);
                                                                                                                                                                                                                                                                                    if (checkBox16 != null) {
                                                                                                                                                                                                                                                                                        i10 = R.id.show_tools_ai_new;
                                                                                                                                                                                                                                                                                        CheckBox checkBox17 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_tools_ai_new);
                                                                                                                                                                                                                                                                                        if (checkBox17 != null) {
                                                                                                                                                                                                                                                                                            i10 = R.id.show_word2pdf_guide;
                                                                                                                                                                                                                                                                                            CheckBox checkBox18 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_word2pdf_guide);
                                                                                                                                                                                                                                                                                            if (checkBox18 != null) {
                                                                                                                                                                                                                                                                                                i10 = R.id.show_word2pdf_new;
                                                                                                                                                                                                                                                                                                CheckBox checkBox19 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.show_word2pdf_new);
                                                                                                                                                                                                                                                                                                if (checkBox19 != null) {
                                                                                                                                                                                                                                                                                                    i10 = R.id.split_oom_error_btn;
                                                                                                                                                                                                                                                                                                    Button button53 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.split_oom_error_btn);
                                                                                                                                                                                                                                                                                                    if (button53 != null) {
                                                                                                                                                                                                                                                                                                        i10 = R.id.split_unKnow_error_btn;
                                                                                                                                                                                                                                                                                                        Button button54 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.split_unKnow_error_btn);
                                                                                                                                                                                                                                                                                                        if (button54 != null) {
                                                                                                                                                                                                                                                                                                            i10 = R.id.subscription_14_loading_dialog_btn;
                                                                                                                                                                                                                                                                                                            Button button55 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_14_loading_dialog_btn);
                                                                                                                                                                                                                                                                                                            if (button55 != null) {
                                                                                                                                                                                                                                                                                                                i10 = R.id.subscription_3_loading_dialog_btn;
                                                                                                                                                                                                                                                                                                                Button button56 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_3_loading_dialog_btn);
                                                                                                                                                                                                                                                                                                                if (button56 != null) {
                                                                                                                                                                                                                                                                                                                    i10 = R.id.subscription_fail_dialog_btn;
                                                                                                                                                                                                                                                                                                                    Button button57 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_fail_dialog_btn);
                                                                                                                                                                                                                                                                                                                    if (button57 != null) {
                                                                                                                                                                                                                                                                                                                        i10 = R.id.subscription_retain_dialog_btn_14;
                                                                                                                                                                                                                                                                                                                        Button button58 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_retain_dialog_btn_14);
                                                                                                                                                                                                                                                                                                                        if (button58 != null) {
                                                                                                                                                                                                                                                                                                                            i10 = R.id.subscription_retain_dialog_btn_7;
                                                                                                                                                                                                                                                                                                                            Button button59 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_retain_dialog_btn_7);
                                                                                                                                                                                                                                                                                                                            if (button59 != null) {
                                                                                                                                                                                                                                                                                                                                i10 = R.id.subscription_retain_dialog_btn_coffee;
                                                                                                                                                                                                                                                                                                                                Button button60 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_retain_dialog_btn_coffee);
                                                                                                                                                                                                                                                                                                                                if (button60 != null) {
                                                                                                                                                                                                                                                                                                                                    i10 = R.id.test_self_btn;
                                                                                                                                                                                                                                                                                                                                    Button button61 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.test_self_btn);
                                                                                                                                                                                                                                                                                                                                    if (button61 != null) {
                                                                                                                                                                                                                                                                                                                                        i10 = R.id.thank_feedback_btn;
                                                                                                                                                                                                                                                                                                                                        Button button62 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.thank_feedback_btn);
                                                                                                                                                                                                                                                                                                                                        if (button62 != null) {
                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tools_empty_page_btn;
                                                                                                                                                                                                                                                                                                                                            Button button63 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_empty_page_btn);
                                                                                                                                                                                                                                                                                                                                            if (button63 != null) {
                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tools_guide_btn;
                                                                                                                                                                                                                                                                                                                                                Button button64 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_guide_btn);
                                                                                                                                                                                                                                                                                                                                                if (button64 != null) {
                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tools_red_dot_btn;
                                                                                                                                                                                                                                                                                                                                                    Button button65 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tools_red_dot_btn);
                                                                                                                                                                                                                                                                                                                                                    if (button65 != null) {
                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_ai_all_file_permission;
                                                                                                                                                                                                                                                                                                                                                        Button button66 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_all_file_permission);
                                                                                                                                                                                                                                                                                                                                                        if (button66 != null) {
                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_all_file_permission;
                                                                                                                                                                                                                                                                                                                                                            Button button67 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_all_file_permission);
                                                                                                                                                                                                                                                                                                                                                            if (button67 != null) {
                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_camera_permission1;
                                                                                                                                                                                                                                                                                                                                                                Button button68 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_camera_permission1);
                                                                                                                                                                                                                                                                                                                                                                if (button68 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_camera_permission2;
                                                                                                                                                                                                                                                                                                                                                                    Button button69 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_camera_permission2);
                                                                                                                                                                                                                                                                                                                                                                    if (button69 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_choose_pdf_loading;
                                                                                                                                                                                                                                                                                                                                                                        Button button70 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_choose_pdf_loading);
                                                                                                                                                                                                                                                                                                                                                                        if (button70 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_choose_pdf_top_loading;
                                                                                                                                                                                                                                                                                                                                                                            Button button71 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_choose_pdf_top_loading);
                                                                                                                                                                                                                                                                                                                                                                            if (button71 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_conver_failed;
                                                                                                                                                                                                                                                                                                                                                                                Button button72 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_conver_failed);
                                                                                                                                                                                                                                                                                                                                                                                if (button72 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_conver_failed_long_name;
                                                                                                                                                                                                                                                                                                                                                                                    Button button73 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_conver_failed_long_name);
                                                                                                                                                                                                                                                                                                                                                                                    if (button73 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_conver_failed_no_space;
                                                                                                                                                                                                                                                                                                                                                                                        Button button74 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_conver_failed_no_space);
                                                                                                                                                                                                                                                                                                                                                                                        if (button74 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_conver_failed_other;
                                                                                                                                                                                                                                                                                                                                                                                            Button button75 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_conver_failed_other);
                                                                                                                                                                                                                                                                                                                                                                                            if (button75 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_conver_loading;
                                                                                                                                                                                                                                                                                                                                                                                                Button button76 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_conver_loading);
                                                                                                                                                                                                                                                                                                                                                                                                if (button76 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_crop_type;
                                                                                                                                                                                                                                                                                                                                                                                                    Button button77 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_crop_type);
                                                                                                                                                                                                                                                                                                                                                                                                    if (button77 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_img_convert_result;
                                                                                                                                                                                                                                                                                                                                                                                                        Button button78 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_img_convert_result);
                                                                                                                                                                                                                                                                                                                                                                                                        if (button78 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_img_scan_pdf;
                                                                                                                                                                                                                                                                                                                                                                                                            Button button79 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_img_scan_pdf);
                                                                                                                                                                                                                                                                                                                                                                                                            if (button79 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_import_crop_loading;
                                                                                                                                                                                                                                                                                                                                                                                                                Button button80 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_import_crop_loading);
                                                                                                                                                                                                                                                                                                                                                                                                                if (button80 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_importing_loading;
                                                                                                                                                                                                                                                                                                                                                                                                                    Button button81 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_importing_loading);
                                                                                                                                                                                                                                                                                                                                                                                                                    if (button81 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_pdf2image_convert_result;
                                                                                                                                                                                                                                                                                                                                                                                                                        Button button82 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_pdf2image_convert_result);
                                                                                                                                                                                                                                                                                                                                                                                                                        if (button82 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_pdf2image_quit_convert;
                                                                                                                                                                                                                                                                                                                                                                                                                            Button button83 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_pdf2image_quit_convert);
                                                                                                                                                                                                                                                                                                                                                                                                                            if (button83 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_pdf2longimage_convert_result;
                                                                                                                                                                                                                                                                                                                                                                                                                                Button button84 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_pdf2longimage_convert_result);
                                                                                                                                                                                                                                                                                                                                                                                                                                if (button84 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_pdf2word_convert_result;
                                                                                                                                                                                                                                                                                                                                                                                                                                    Button button85 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_pdf2word_convert_result);
                                                                                                                                                                                                                                                                                                                                                                                                                                    if (button85 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_quit_camera;
                                                                                                                                                                                                                                                                                                                                                                                                                                        Button button86 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_quit_camera);
                                                                                                                                                                                                                                                                                                                                                                                                                                        if (button86 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_quit_conver;
                                                                                                                                                                                                                                                                                                                                                                                                                                            Button button87 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_quit_conver);
                                                                                                                                                                                                                                                                                                                                                                                                                                            if (button87 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_save_change;
                                                                                                                                                                                                                                                                                                                                                                                                                                                Button button88 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_save_change);
                                                                                                                                                                                                                                                                                                                                                                                                                                                if (button88 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_storage_permission1;
                                                                                                                                                                                                                                                                                                                                                                                                                                                    Button button89 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_storage_permission1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (button89 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.tv_storage_permission2;
                                                                                                                                                                                                                                                                                                                                                                                                                                                        Button button90 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_storage_permission2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (button90 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_storage_permission3;
                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button button91 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_storage_permission3);
                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (button91 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_storage_permission4;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                Button button92 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_storage_permission4);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (button92 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.update_change;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    RadioGroup radioGroup = (RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.update_change);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (radioGroup != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.upgrade_dialog_btn;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Button button93 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.upgrade_dialog_btn);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (button93 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.upgrade_planA;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.upgrade_planA)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.upgrade_planB;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.upgrade_planB)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.widget_btn;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    Button button94 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.widget_btn);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if (button94 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.widgets_home_screen_shorcuts;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        Button button95 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.widgets_home_screen_shorcuts);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if (button95 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.xiaomi_clear_default_dialog_btn;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Button button96 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.xiaomi_clear_default_dialog_btn);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (button96 != null) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                am.r0 r0Var = new am.r0((NestedScrollView) inflate, checkBox, checkBox2, checkBox3, checkBox4, button, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42, button43, button44, button45, button46, button47, button48, button49, button50, checkBox5, checkBox6, checkBox7, checkBox8, button51, checkBox9, checkBox10, checkBox11, checkBox12, checkBox13, checkBox14, button52, checkBox15, checkBox16, checkBox17, checkBox18, checkBox19, button53, button54, button55, button56, button57, button58, button59, button60, button61, button62, button63, button64, button65, button66, button67, button68, button69, button70, button71, button72, button73, button74, button75, button76, button77, button78, button79, button80, button81, button82, button83, button84, button85, button86, button87, button88, button89, button90, button91, button92, radioGroup, button93, button94, button95, button96);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ea.a.p("LG4XbDZ0DCghbgBsVXQychQgMW8ndFdpGmUDLHFmI2w2ZSk=", "iuEqWiF4");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                return r0Var;
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpN2h0SQ86IA==", "CTKkScpu").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        ((am.r0) vb2).E0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(10));
        boolean z10 = ReaderDebugActivity.f27826e;
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        String p10 = ea.a.p("UWklZBpuBS4BaFt3JWE4ZzFhVWUSaTNTI2kWY2g=", "TbT5my0d");
        CheckBox checkBox = ((am.r0) vb3).f1370g0;
        kotlin.jvm.internal.g.d(checkBox, p10);
        b.t0(z10, checkBox, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$2
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                boolean z12 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27826e = z11;
            }
        });
        boolean z11 = ReaderDebugActivity.f27827f;
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        String p11 = ea.a.p("WmkCZD1uCS47aAl3fW4hZUpzO28nVF9wJ3cYdDJo", "Gf8lTnHZ");
        CheckBox checkBox2 = ((am.r0) vb4).f1367f0;
        kotlin.jvm.internal.g.d(checkBox2, p11);
        b.t0(z11, checkBox2, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$3
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z12) {
                boolean z13 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27827f = z12;
            }
        });
        boolean z12 = ReaderDebugActivity.f27828g;
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        String p12 = ea.a.p("UWklZBpuBS4BaFt3O2UwbCt3Zmk2UzRpJWNo", "QoCc5Oup");
        CheckBox checkBox3 = ((am.r0) vb5).f1382k0;
        kotlin.jvm.internal.g.d(checkBox3, p12);
        b.t0(z12, checkBox3, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$4
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z13) {
                boolean z14 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27828g = z13;
            }
        });
        boolean z13 = ReaderDebugActivity.f27829h;
        VB vb6 = this.Y;
        kotlin.jvm.internal.g.b(vb6);
        String p13 = ea.a.p("MGkvZA5uJS47aAl3ZmUxbFd3B3AtYUJlIGkBUyZpNmNo", "cTRAgBHy");
        CheckBox checkBox4 = ((am.r0) vb6).f1388m0;
        kotlin.jvm.internal.g.d(checkBox4, p13);
        b.t0(z13, checkBox4, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$5
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                boolean z15 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27829h = z14;
            }
        });
        boolean z14 = ReaderDebugActivity.f27830i;
        VB vb7 = this.Y;
        kotlin.jvm.internal.g.b(vb7);
        String p14 = ea.a.p("LWlfZBBuUC4paCV3J2UObFp3O3MgVAxwB3cCdDlo", "UgmbTkZ3");
        CheckBox checkBox5 = ((am.r0) vb7).f1391n0;
        kotlin.jvm.internal.g.d(checkBox5, p14);
        b.t0(z14, checkBox5, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$6
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z15) {
                boolean z16 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27830i = z15;
            }
        });
        boolean z15 = ReaderDebugActivity.f27831j;
        VB vb8 = this.Y;
        kotlin.jvm.internal.g.b(vb8);
        String p15 = ea.a.p("L2kZZAZuLC47aAl3ZmUxbFd3B3AtYUJlJmUVRD50", "dvMwoK9R");
        CheckBox checkBox6 = ((am.r0) vb8).f1385l0;
        kotlin.jvm.internal.g.d(checkBox6, p15);
        b.t0(z15, checkBox6, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$7
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                boolean z17 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27831j = z16;
            }
        });
        boolean f10 = pdf.pdfreader.viewer.editor.free.utils.q0.f(g0(), "is_always_show_add_text_red_dot", false);
        VB vb9 = this.Y;
        kotlin.jvm.internal.g.b(vb9);
        String p16 = ea.a.p("UWklZBpuBS4TbENhEHMFaCt3c2QiVCZ4IlIEZCBvdA==", "VadyPlwl");
        CheckBox checkBox7 = ((am.r0) vb9).c;
        kotlin.jvm.internal.g.d(checkBox7, p16);
        b.t0(f10, checkBox7, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$8
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                pdf.pdfreader.viewer.editor.free.utils.q0.w(DebugPageAndDialogFragment.this.g0(), "is_always_show_add_text_red_dot", z16);
            }
        });
        boolean f11 = pdf.pdfreader.viewer.editor.free.utils.q0.f(g0(), "is_always_show_add_text_guide_debug", false);
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        String p17 = ea.a.p("LWlfZBBuUC47bD1hDHM7aFp3L2QhVAB4MkckaQhl", "VyUvFQlJ");
        CheckBox checkBox8 = ((am.r0) vb10).f1355b;
        kotlin.jvm.internal.g.d(checkBox8, p17);
        b.t0(f11, checkBox8, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$9
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                pdf.pdfreader.viewer.editor.free.utils.q0.w(DebugPageAndDialogFragment.this.g0(), "is_always_show_add_text_guide_debug", z16);
            }
        });
        boolean z16 = ReaderDebugActivity.f27832k;
        VB vb11 = this.Y;
        kotlin.jvm.internal.g.b(vb11);
        String p18 = ea.a.p("UWklZBpuBS4BaFt3IW87ZRBvXWw1RzZpFWU=", "qBjcPEt0");
        CheckBox checkBox9 = ((am.r0) vb11).f1364e0;
        kotlin.jvm.internal.g.d(checkBox9, p18);
        b.t0(z16, checkBox9, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$10
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z17) {
                boolean z18 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27832k = z17;
            }
        });
        boolean z17 = ReaderDebugActivity.f27834m;
        VB vb12 = this.Y;
        kotlin.jvm.internal.g.b(vb12);
        String p19 = ea.a.p("UWklZBpuBS4BaFt3Pm8kZHZwVmYBdSpkZQ==", "C8vVASCc");
        CheckBox checkBox10 = ((am.r0) vb12).f1401s0;
        kotlin.jvm.internal.g.d(checkBox10, p19);
        b.t0(z17, checkBox10, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$11
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z18) {
                boolean z19 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27834m = z18;
            }
        });
        boolean z18 = ReaderDebugActivity.f27833l;
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        String p20 = ea.a.p("UWklZBpuBS4BaFt3Pm8kZHZwVmYIZXc=", "9RYr4aJY");
        CheckBox checkBox11 = ((am.r0) vb13).f1403t0;
        kotlin.jvm.internal.g.d(checkBox11, p20);
        b.t0(z18, checkBox11, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$12
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z19) {
                boolean z20 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27833l = z19;
            }
        });
        boolean z19 = ReaderDebugActivity.f27836o;
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        String p21 = ea.a.p("UWklZBpuBS4TbENhEHMFaCt3YWkhbhFlA0Q6dA==", "gUBdf3Xa");
        CheckBox checkBox12 = ((am.r0) vb14).f1363e;
        kotlin.jvm.internal.g.d(checkBox12, p21);
        b.t0(z19, checkBox12, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$13
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z20) {
                boolean z21 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27836o = z20;
            }
        });
        boolean z20 = pdf.pdfreader.viewer.editor.free.utils.q0.f28747e;
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        String p22 = ea.a.p("LWlfZBBuUC4paCV3IW8HbEZBB04gdw==", "cG2gzFbe");
        CheckBox checkBox13 = ((am.r0) vb15).f1399r0;
        kotlin.jvm.internal.g.d(checkBox13, p22);
        b.t0(z20, checkBox13, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$14
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z21) {
                pdf.pdfreader.viewer.editor.free.utils.q0.f28747e = z21;
            }
        });
        boolean z21 = pdf.pdfreader.viewer.editor.free.utils.q0.f28748f;
        VB vb16 = this.Y;
        kotlin.jvm.internal.g.b(vb16);
        String p23 = ea.a.p("LWlfZBBuUC4paCV3JXINdlxlGUEsRxBpLmU=", "4TlrJklz");
        CheckBox checkBox14 = ((am.r0) vb16).f1379j0;
        kotlin.jvm.internal.g.d(checkBox14, p23);
        b.t0(z21, checkBox14, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$15
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z22) {
                pdf.pdfreader.viewer.editor.free.utils.q0.f28748f = z22;
            }
        });
        boolean z22 = ReaderDebugActivity.f27838q;
        VB vb17 = this.Y;
        kotlin.jvm.internal.g.b(vb17);
        String p24 = ea.a.p("JWkqZCRuIC47aAl3YG84bEtBO0Enc0FlBkMZYT9nJ0cyaSBl", "QdGDMGq6");
        CheckBox checkBox15 = ((am.r0) vb17).f1395p0;
        kotlin.jvm.internal.g.d(checkBox15, p24);
        b.t0(z22, checkBox15, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$16
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z23) {
                boolean z24 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27838q = z23;
            }
        });
        boolean z23 = ReaderDebugActivity.f27839r;
        VB vb18 = this.Y;
        kotlin.jvm.internal.g.b(vb18);
        String p25 = ea.a.p("UWklZBpuBS4BaFt3PW85bDdBW0gvczdvR3QyR0JpKGU=", "5K7LP94U");
        CheckBox checkBox16 = ((am.r0) vb18).f1397q0;
        kotlin.jvm.internal.g.d(checkBox16, p25);
        b.t0(z23, checkBox16, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPageDebug$17
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z24) {
                boolean z25 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27839r = z24;
            }
        });
        Context r4 = r();
        if (r4 != null) {
            VB vb19 = this.Y;
            kotlin.jvm.internal.g.b(vb19);
            ((am.r0) vb19).f1375i.setOnClickListener(new vm.g(5, this, r4));
            VB vb20 = this.Y;
            kotlin.jvm.internal.g.b(vb20);
            ((am.r0) vb20).f1378j.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.adjust.a(4, r4, this));
            VB vb21 = this.Y;
            kotlin.jvm.internal.g.b(vb21);
            ((am.r0) vb21).f1402t.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27881b;

                {
                    this.f27881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                            debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                            r2 r2Var = new r2(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            r2Var.f23542t = listener;
                            r2Var.show();
                            return;
                        case 2:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                            BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.setBackgroundColor(-16777216);
                                                    am.i iVar6 = readerDebugActivity.f27845a;
                                                    if (iVar6 != null) {
                                                        iVar6.f965d.addView(inflate);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                        throw null;
                                                    }
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.setVisibility(0);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        iVar8.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.setBackgroundColor(-1);
                                                am.i iVar11 = readerDebugActivity2.f27845a;
                                                if (iVar11 != null) {
                                                    iVar11.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                                throw null;
                            }
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                            Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                            intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                                am.i iVar12 = readerDebugActivity3.f27845a;
                                if (iVar12 != null) {
                                    iVar12.f965d.setVisibility(0);
                                    am.i iVar13 = readerDebugActivity3.f27845a;
                                    if (iVar13 != null) {
                                        iVar13.f965d.removeAllViews();
                                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                        am.i iVar14 = readerDebugActivity3.f27845a;
                                        if (iVar14 != null) {
                                            iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                            pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                            pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                            pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                            pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                                throw null;
                            }
                            return;
                    }
                }
            });
            VB vb22 = this.Y;
            kotlin.jvm.internal.g.b(vb22);
            ((am.r0) vb22).f1381k.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27901b;

                {
                    this.f27901b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27901b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4QDhfFki"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 0, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$4$1$1
                                    public final void invoke(boolean z24) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "NTbtxCUY"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW4Vbj9sKiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUkLl1kI3QpcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUjNhXGU4RCNiOmdwYw1pQWkueQ==", "vUAGV8JF"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_no_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_no_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1ZGWOoih"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "aoP5ST3T"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("NGkeZCduZw==", "9hVpNGrV"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "I61FWUhX"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("BWg_c0ow", "xIqVnVvi"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("BHUabGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeQZlZXACZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckRmBGUgLhNpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiH2c3YzFpEGk8eQ==", "pLjvEfg7"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar5 = readerDebugActivity2.f27845a;
                                if (iVar5 != null) {
                                    iVar5.f965d.setVisibility(0);
                                    am.i iVar6 = readerDebugActivity2.f27845a;
                                    if (iVar6 != null) {
                                        iVar6.f965d.removeAllViews();
                                        ArrayList arrayList = new ArrayList();
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "1XWuN4p0"));
                                        pdfPreviewEntity.setName(ea.a.p("V2UpdRRfFmUBdGtuCG1l", "UwrEC63S"));
                                        arrayList.add(pdfPreviewEntity);
                                        OperateExecuteTask operateExecuteTask = (OperateExecuteTask) readerDebugActivity2.f27847d.getValue();
                                        am.i iVar7 = readerDebugActivity2.f27845a;
                                        if (iVar7 != null) {
                                            String p26 = ea.a.p("UWklZBpuBS4UclVtDEYjbChTUXIjZW4=", "eC6saGxT");
                                            FrameLayout frameLayout = iVar7.f965d;
                                            kotlin.jvm.internal.g.d(frameLayout, p26);
                                            String string = readerDebugActivity2.getString(R.string.arg_res_0x7f1300d2);
                                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMpbjVlHnQIZBVzHWNQZThzFXUObAtfBSk=", "lmJhUMax"));
                                            operateExecuteTask.q(0, "", frameLayout, string, arrayList, true, new pdf.pdfreader.viewer.editor.free.ui.feature.debug.b(readerDebugActivity2));
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Weo4Gymx"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2knZB5uZw==", "xM9Iwtzc"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmkiZFpuZw==", "zwHL3ETE"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "AYFuj8R2"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i18 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i18, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25sbhlsAyA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUaLiRkBXQAcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUg1hJWUeRApiOmdwYw1pQWkueQ==", "GG6YhAlo"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i18;
                                am.i iVar8 = readerDebugActivity3.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.setVisibility(0);
                                    am.i iVar9 = readerDebugActivity3.f27845a;
                                    if (iVar9 != null) {
                                        iVar9.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity3);
                                        am.i iVar10 = readerDebugActivity3.f27845a;
                                        if (iVar10 != null) {
                                            View inflate2 = from2.inflate(R.layout.include_preview_create_edit_guide, (ViewGroup) iVar10.f965d, false);
                                            PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) inflate2.findViewById(R.id.con_sign_guide);
                                            x2 x2Var = previewCreateEditGuideView.f25426q;
                                            if (x2Var != null) {
                                                previewCreateEditGuideView.post(new qb.f0(true, previewCreateEditGuideView, x2Var));
                                            }
                                            am.i iVar11 = readerDebugActivity3.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.setBackgroundColor(-1);
                                                am.i iVar12 = readerDebugActivity3.f27845a;
                                                if (iVar12 != null) {
                                                    iVar12.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "yFX8KOna"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "YxvpJ21T"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("J2ldZFFuZw==", "cCE38qqz"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "ZhtR85Z7"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("WmkcZBFuZw==", "fz8rxNHi"));
                                throw null;
                            }
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "UiEMt2Z0"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(2);
                            j2Var.f27638i = new s0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                    }
                }
            });
            VB vb23 = this.Y;
            kotlin.jvm.internal.g.b(vb23);
            ((am.r0) vb23).f1390n.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27890b;

                {
                    this.f27890b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27890b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "IcypxEDM"));
                            Context r10 = debugPageAndDialogFragment.r();
                            if (r10 != null) {
                                int i12 = HomeScreenPermissionGuideActivity.f24827v;
                                HomeScreenPermissionGuideActivity.a.a(r10, ShortcutType.ICON);
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "BQ5CuyNu"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5nbhxsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU8Li9kAHQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUithLmUbRBxiOmdwYw1pQWkueQ==", "D8BTNJiy"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_convert_btn_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.preview_convert_to_pdf_ll)).setVisibility(0);
                                            ((ImageView) inflate.findViewById(R.id.preview_convert_to_pdf_pro_iv)).setVisibility(8);
                                            ((ProgressView) inflate.findViewById(R.id.preview_convert_to_pdf_progress)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "GgXAd6E2"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "pX6ttOvg"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("FWkoZC5uZw==", "E2wFGx87"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("CWkcZCFuZw==", "YykrHDiG"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "N8sxoYNI"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "3Vkl2jdA"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5DbkFsNCA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUFLgtkXXQ3cmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhJhCmVGRD1iOmdwYw1pQWkueQ==", "euAywn4X"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar6 = readerDebugActivity2.f27845a;
                                if (iVar6 != null) {
                                    iVar6.f965d.setVisibility(0);
                                    am.i iVar7 = readerDebugActivity2.f27845a;
                                    if (iVar7 != null) {
                                        iVar7.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar8 = readerDebugActivity2.f27845a;
                                        if (iVar8 != null) {
                                            View inflate2 = from2.inflate(R.layout.layout_pdf_page_manager_insert_loading, (ViewGroup) iVar8.f965d, false);
                                            inflate2.setVisibility(0);
                                            am.i iVar9 = readerDebugActivity2.f27845a;
                                            if (iVar9 != null) {
                                                iVar9.f965d.setBackgroundColor(-1);
                                                am.i iVar10 = readerDebugActivity2.f27845a;
                                                if (iVar10 != null) {
                                                    iVar10.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HgTO1HXS"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5EkQcgDm"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "GiqZByaS"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "nNQgsTro"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "oJddtgQt"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("Q2gMc3Aw", "TD7eTB77"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("WGUyXxJiPXMGcg==", "65uHsz3F"), ea.a.p("QQ==", "7MqwWsq9"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        default:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("AGgQc24w", "Z6tyJqvA"));
                            Context context = view.getContext();
                            kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "Jv3uDc0W"));
                            String string = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f13035a);
                            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2kfZxdxIWlHXyhvHXYHcgZpWmcp", "aq9TiYnn"));
                            String string2 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f1304a9);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0pYDrbh0uSnVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "GMz9SF0S"));
                            new OperateInterceptDialog(context, string, string2).show();
                            return;
                    }
                }
            });
            VB vb24 = this.Y;
            kotlin.jvm.internal.g.b(vb24);
            ((am.r0) vb24).f1394p.setOnClickListener(new b0(r4, 5));
            VB vb25 = this.Y;
            kotlin.jvm.internal.g.b(vb25);
            ((am.r0) vb25).f1384l.setOnClickListener(new k0(r4, 6));
            VB vb26 = this.Y;
            kotlin.jvm.internal.g.b(vb26);
            ((am.r0) vb26).f1387m.setOnClickListener(new c(r4, 5));
            VB vb27 = this.Y;
            kotlin.jvm.internal.g.b(vb27);
            ((am.r0) vb27).f1359c1.setOnClickListener(new w(r4, 6));
            VB vb28 = this.Y;
            kotlin.jvm.internal.g.b(vb28);
            ((am.r0) vb28).N0.setOnClickListener(new k0(r4, 7));
            VB vb29 = this.Y;
            kotlin.jvm.internal.g.b(vb29);
            ((am.r0) vb29).P0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(5, r4, this));
            VB vb30 = this.Y;
            kotlin.jvm.internal.g.b(vb30);
            ((am.r0) vb30).O0.setOnClickListener(new w(r4, 3));
            VB vb31 = this.Y;
            kotlin.jvm.internal.g.b(vb31);
            ((am.r0) vb31).Q0.setOnClickListener(new k0(r4, 2));
            VB vb32 = this.Y;
            kotlin.jvm.internal.g.b(vb32);
            ((am.r0) vb32).R0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27898b;

                {
                    this.f27898b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27898b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("GGg_cxIw", "VClV6lHc"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$3$1$operatePdfFailedDialog$1
                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ tf.d invoke() {
                                        invoke2();
                                        return tf.d.f30009a;
                                    }
                                });
                                String string = i12.getString(R.string.arg_res_0x7f1302af);
                                kotlin.jvm.internal.g.d(string, ea.a.p("KGMDLgNlLFM8cg9uUygFLkt0IGknZxhuEXQGbyNrHWU7chhyKQ==", "DuIwdXVH"));
                                operatePdfFailedDialog.H(string, i12.getString(R.string.arg_res_0x7f130575));
                                operatePdfFailedDialog.show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "Y68a98i8"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuG24ebjFsGiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUGLlZkLXQZcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhFhV2U2RBNiOmdwYw1pQWkueQ==", "Qkbxt3Dv"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.layout_tools_operate_r3_01, (ViewGroup) iVar3.f965d, false);
                                            ((TextView) inflate.findViewById(R.id.tv_desc)).setText(readerDebugActivity.getString(R.string.arg_res_0x7f1300d3));
                                            ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) inflate.findViewById(R.id.progressbar);
                                            readerRoundProgressBar.setMax(100);
                                            readerRoundProgressBar.setProgress(50);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("EmkcZBtuZw==", "kHprr4qo"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "kCXWFdIJ"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5gONdife"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8tzH0Lxk"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "WvlWhCYG"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingOpenWithGuideActivity.class));
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "XwgXZ5n8"));
                            pdf.pdfreader.viewer.editor.free.ui.dialog.x2 x2Var = new pdf.pdfreader.viewer.editor.free.ui.dialog.x2(view.getContext(), "", "", debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d4), true);
                            x2Var.C = true;
                            x2Var.show();
                            return;
                    }
                }
            });
            VB vb33 = this.Y;
            kotlin.jvm.internal.g.b(vb33);
            ((am.r0) vb33).L0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27901b;

                {
                    this.f27901b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27901b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4QDhfFki"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 0, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$4$1$1
                                    public final void invoke(boolean z24) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "NTbtxCUY"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW4Vbj9sKiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUkLl1kI3QpcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUjNhXGU4RCNiOmdwYw1pQWkueQ==", "vUAGV8JF"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_no_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_no_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1ZGWOoih"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "aoP5ST3T"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("NGkeZCduZw==", "9hVpNGrV"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "I61FWUhX"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("BWg_c0ow", "xIqVnVvi"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("BHUabGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeQZlZXACZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckRmBGUgLhNpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiH2c3YzFpEGk8eQ==", "pLjvEfg7"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar5 = readerDebugActivity2.f27845a;
                                if (iVar5 != null) {
                                    iVar5.f965d.setVisibility(0);
                                    am.i iVar6 = readerDebugActivity2.f27845a;
                                    if (iVar6 != null) {
                                        iVar6.f965d.removeAllViews();
                                        ArrayList arrayList = new ArrayList();
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "1XWuN4p0"));
                                        pdfPreviewEntity.setName(ea.a.p("V2UpdRRfFmUBdGtuCG1l", "UwrEC63S"));
                                        arrayList.add(pdfPreviewEntity);
                                        OperateExecuteTask operateExecuteTask = (OperateExecuteTask) readerDebugActivity2.f27847d.getValue();
                                        am.i iVar7 = readerDebugActivity2.f27845a;
                                        if (iVar7 != null) {
                                            String p26 = ea.a.p("UWklZBpuBS4UclVtDEYjbChTUXIjZW4=", "eC6saGxT");
                                            FrameLayout frameLayout = iVar7.f965d;
                                            kotlin.jvm.internal.g.d(frameLayout, p26);
                                            String string = readerDebugActivity2.getString(R.string.arg_res_0x7f1300d2);
                                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMpbjVlHnQIZBVzHWNQZThzFXUObAtfBSk=", "lmJhUMax"));
                                            operateExecuteTask.q(0, "", frameLayout, string, arrayList, true, new pdf.pdfreader.viewer.editor.free.ui.feature.debug.b(readerDebugActivity2));
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Weo4Gymx"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2knZB5uZw==", "xM9Iwtzc"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmkiZFpuZw==", "zwHL3ETE"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "AYFuj8R2"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i18 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i18, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25sbhlsAyA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUaLiRkBXQAcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUg1hJWUeRApiOmdwYw1pQWkueQ==", "GG6YhAlo"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i18;
                                am.i iVar8 = readerDebugActivity3.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.setVisibility(0);
                                    am.i iVar9 = readerDebugActivity3.f27845a;
                                    if (iVar9 != null) {
                                        iVar9.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity3);
                                        am.i iVar10 = readerDebugActivity3.f27845a;
                                        if (iVar10 != null) {
                                            View inflate2 = from2.inflate(R.layout.include_preview_create_edit_guide, (ViewGroup) iVar10.f965d, false);
                                            PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) inflate2.findViewById(R.id.con_sign_guide);
                                            x2 x2Var = previewCreateEditGuideView.f25426q;
                                            if (x2Var != null) {
                                                previewCreateEditGuideView.post(new qb.f0(true, previewCreateEditGuideView, x2Var));
                                            }
                                            am.i iVar11 = readerDebugActivity3.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.setBackgroundColor(-1);
                                                am.i iVar12 = readerDebugActivity3.f27845a;
                                                if (iVar12 != null) {
                                                    iVar12.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "yFX8KOna"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "YxvpJ21T"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("J2ldZFFuZw==", "cCE38qqz"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "ZhtR85Z7"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("WmkcZBFuZw==", "fz8rxNHi"));
                                throw null;
                            }
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "UiEMt2Z0"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(2);
                            j2Var.f27638i = new s0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                    }
                }
            });
            VB vb34 = this.Y;
            kotlin.jvm.internal.g.b(vb34);
            ((am.r0) vb34).M0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.j0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27904b;

                {
                    this.f27904b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27904b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "o9SuZi5F"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 1, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$5$1$1
                                    public final void invoke(boolean z24) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "zi45t67J"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuG25fbhJsOSBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUGLhdkDnQ6ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUhFhFmUVRDBiRmcKYwdpFGkGeQ==", "trgU5m8x"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_has_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_has_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("L2kJZANuZw==", "HxMgjCTl"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "dLtUQDJs"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "PKaJvxIq"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "KbKat3rg"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("W2kLZAJuZw==", "VC9ekpLm"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "ioLV8GT2"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(0);
                            j2Var.f27638i = new t0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "lUMjyN6I"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i17 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i17, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5bbiFsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUcLhNkPXQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUgthEmUmRBxiOmdwYw1pQWkueQ==", "pYxUnvTy"));
                                ((ReaderDebugActivity) i17).x1(false);
                                return;
                            }
                            return;
                    }
                }
            });
            VB vb35 = this.Y;
            kotlin.jvm.internal.g.b(vb35);
            ((am.r0) vb35).f1369g.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p26 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p26, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
            VB vb36 = this.Y;
            kotlin.jvm.internal.g.b(vb36);
            ((am.r0) vb36).f1410x.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27881b;

                {
                    this.f27881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                            debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                            r2 r2Var = new r2(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            r2Var.f23542t = listener;
                            r2Var.show();
                            return;
                        case 2:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                            BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.setBackgroundColor(-16777216);
                                                    am.i iVar6 = readerDebugActivity.f27845a;
                                                    if (iVar6 != null) {
                                                        iVar6.f965d.addView(inflate);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                        throw null;
                                                    }
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.setVisibility(0);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        iVar8.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.setBackgroundColor(-1);
                                                am.i iVar11 = readerDebugActivity2.f27845a;
                                                if (iVar11 != null) {
                                                    iVar11.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                                throw null;
                            }
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                            Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                            intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                                am.i iVar12 = readerDebugActivity3.f27845a;
                                if (iVar12 != null) {
                                    iVar12.f965d.setVisibility(0);
                                    am.i iVar13 = readerDebugActivity3.f27845a;
                                    if (iVar13 != null) {
                                        iVar13.f965d.removeAllViews();
                                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                        am.i iVar14 = readerDebugActivity3.f27845a;
                                        if (iVar14 != null) {
                                            iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                            pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                            pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                            pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                            pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                                throw null;
                            }
                            return;
                    }
                }
            });
            VB vb37 = this.Y;
            kotlin.jvm.internal.g.b(vb37);
            ((am.r0) vb37).f1408w.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27890b;

                {
                    this.f27890b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27890b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "IcypxEDM"));
                            Context r10 = debugPageAndDialogFragment.r();
                            if (r10 != null) {
                                int i12 = HomeScreenPermissionGuideActivity.f24827v;
                                HomeScreenPermissionGuideActivity.a.a(r10, ShortcutType.ICON);
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "BQ5CuyNu"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5nbhxsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU8Li9kAHQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUithLmUbRBxiOmdwYw1pQWkueQ==", "D8BTNJiy"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_convert_btn_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.preview_convert_to_pdf_ll)).setVisibility(0);
                                            ((ImageView) inflate.findViewById(R.id.preview_convert_to_pdf_pro_iv)).setVisibility(8);
                                            ((ProgressView) inflate.findViewById(R.id.preview_convert_to_pdf_progress)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "GgXAd6E2"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "pX6ttOvg"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("FWkoZC5uZw==", "E2wFGx87"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("CWkcZCFuZw==", "YykrHDiG"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "N8sxoYNI"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "3Vkl2jdA"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5DbkFsNCA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUFLgtkXXQ3cmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhJhCmVGRD1iOmdwYw1pQWkueQ==", "euAywn4X"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar6 = readerDebugActivity2.f27845a;
                                if (iVar6 != null) {
                                    iVar6.f965d.setVisibility(0);
                                    am.i iVar7 = readerDebugActivity2.f27845a;
                                    if (iVar7 != null) {
                                        iVar7.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar8 = readerDebugActivity2.f27845a;
                                        if (iVar8 != null) {
                                            View inflate2 = from2.inflate(R.layout.layout_pdf_page_manager_insert_loading, (ViewGroup) iVar8.f965d, false);
                                            inflate2.setVisibility(0);
                                            am.i iVar9 = readerDebugActivity2.f27845a;
                                            if (iVar9 != null) {
                                                iVar9.f965d.setBackgroundColor(-1);
                                                am.i iVar10 = readerDebugActivity2.f27845a;
                                                if (iVar10 != null) {
                                                    iVar10.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HgTO1HXS"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5EkQcgDm"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "GiqZByaS"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "nNQgsTro"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "oJddtgQt"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("Q2gMc3Aw", "TD7eTB77"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("WGUyXxJiPXMGcg==", "65uHsz3F"), ea.a.p("QQ==", "7MqwWsq9"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        default:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("AGgQc24w", "Z6tyJqvA"));
                            Context context = view.getContext();
                            kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "Jv3uDc0W"));
                            String string = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f13035a);
                            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2kfZxdxIWlHXyhvHXYHcgZpWmcp", "aq9TiYnn"));
                            String string2 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f1304a9);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0pYDrbh0uSnVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "GMz9SF0S"));
                            new OperateInterceptDialog(context, string, string2).show();
                            return;
                    }
                }
            });
            VB vb38 = this.Y;
            kotlin.jvm.internal.g.b(vb38);
            ((am.r0) vb38).W0.setOnClickListener(new k0(r4, 3));
            VB vb39 = this.Y;
            kotlin.jvm.internal.g.b(vb39);
            ((am.r0) vb39).T0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27901b;

                {
                    this.f27901b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27901b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4QDhfFki"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 0, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$4$1$1
                                    public final void invoke(boolean z24) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "NTbtxCUY"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW4Vbj9sKiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUkLl1kI3QpcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUjNhXGU4RCNiOmdwYw1pQWkueQ==", "vUAGV8JF"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_no_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_no_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1ZGWOoih"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "aoP5ST3T"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("NGkeZCduZw==", "9hVpNGrV"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "I61FWUhX"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("BWg_c0ow", "xIqVnVvi"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("BHUabGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeQZlZXACZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckRmBGUgLhNpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiH2c3YzFpEGk8eQ==", "pLjvEfg7"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar5 = readerDebugActivity2.f27845a;
                                if (iVar5 != null) {
                                    iVar5.f965d.setVisibility(0);
                                    am.i iVar6 = readerDebugActivity2.f27845a;
                                    if (iVar6 != null) {
                                        iVar6.f965d.removeAllViews();
                                        ArrayList arrayList = new ArrayList();
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "1XWuN4p0"));
                                        pdfPreviewEntity.setName(ea.a.p("V2UpdRRfFmUBdGtuCG1l", "UwrEC63S"));
                                        arrayList.add(pdfPreviewEntity);
                                        OperateExecuteTask operateExecuteTask = (OperateExecuteTask) readerDebugActivity2.f27847d.getValue();
                                        am.i iVar7 = readerDebugActivity2.f27845a;
                                        if (iVar7 != null) {
                                            String p26 = ea.a.p("UWklZBpuBS4UclVtDEYjbChTUXIjZW4=", "eC6saGxT");
                                            FrameLayout frameLayout = iVar7.f965d;
                                            kotlin.jvm.internal.g.d(frameLayout, p26);
                                            String string = readerDebugActivity2.getString(R.string.arg_res_0x7f1300d2);
                                            kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMpbjVlHnQIZBVzHWNQZThzFXUObAtfBSk=", "lmJhUMax"));
                                            operateExecuteTask.q(0, "", frameLayout, string, arrayList, true, new pdf.pdfreader.viewer.editor.free.ui.feature.debug.b(readerDebugActivity2));
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Weo4Gymx"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2knZB5uZw==", "xM9Iwtzc"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmkiZFpuZw==", "zwHL3ETE"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "AYFuj8R2"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i18 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i18, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25sbhlsAyA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUaLiRkBXQAcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUg1hJWUeRApiOmdwYw1pQWkueQ==", "GG6YhAlo"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i18;
                                am.i iVar8 = readerDebugActivity3.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.setVisibility(0);
                                    am.i iVar9 = readerDebugActivity3.f27845a;
                                    if (iVar9 != null) {
                                        iVar9.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity3);
                                        am.i iVar10 = readerDebugActivity3.f27845a;
                                        if (iVar10 != null) {
                                            View inflate2 = from2.inflate(R.layout.include_preview_create_edit_guide, (ViewGroup) iVar10.f965d, false);
                                            PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) inflate2.findViewById(R.id.con_sign_guide);
                                            x2 x2Var = previewCreateEditGuideView.f25426q;
                                            if (x2Var != null) {
                                                previewCreateEditGuideView.post(new qb.f0(true, previewCreateEditGuideView, x2Var));
                                            }
                                            am.i iVar11 = readerDebugActivity3.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.setBackgroundColor(-1);
                                                am.i iVar12 = readerDebugActivity3.f27845a;
                                                if (iVar12 != null) {
                                                    iVar12.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "yFX8KOna"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "YxvpJ21T"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("J2ldZFFuZw==", "cCE38qqz"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "ZhtR85Z7"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("WmkcZBFuZw==", "fz8rxNHi"));
                                throw null;
                            }
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "UiEMt2Z0"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(2);
                            j2Var.f27638i = new s0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                    }
                }
            });
            VB vb40 = this.Y;
            kotlin.jvm.internal.g.b(vb40);
            ((am.r0) vb40).J0.setOnClickListener(new b0(r4, 3));
            VB vb41 = this.Y;
            kotlin.jvm.internal.g.b(vb41);
            ((am.r0) vb41).K0.setOnClickListener(new c0(r4, 3));
            VB vb42 = this.Y;
            kotlin.jvm.internal.g.b(vb42);
            ((am.r0) vb42).f1357b1.setOnClickListener(new c(r4, 4));
            VB vb43 = this.Y;
            kotlin.jvm.internal.g.b(vb43);
            ((am.r0) vb43).S0.setOnClickListener(new w(r4, 4));
            VB vb44 = this.Y;
            kotlin.jvm.internal.g.b(vb44);
            ((am.r0) vb44).f1365e1.setOnClickListener(new k0(r4, 4));
            VB vb45 = this.Y;
            kotlin.jvm.internal.g.b(vb45);
            ((am.r0) vb45).f1368f1.setOnClickListener(new l0(r4, 2));
            VB vb46 = this.Y;
            kotlin.jvm.internal.g.b(vb46);
            ((am.r0) vb46).f1371g1.setOnClickListener(new t(r4, 3));
            VB vb47 = this.Y;
            kotlin.jvm.internal.g.b(vb47);
            ((am.r0) vb47).f1374h1.setOnClickListener(new b0(r4, 4));
            VB vb48 = this.Y;
            kotlin.jvm.internal.g.b(vb48);
            ((am.r0) vb48).I0.setOnClickListener(new c0(r4, 4));
            VB vb49 = this.Y;
            kotlin.jvm.internal.g.b(vb49);
            ((am.r0) vb49).H0.setOnClickListener(new w(r4, 5));
            VB vb50 = this.Y;
            kotlin.jvm.internal.g.b(vb50);
            ((am.r0) vb50).V0.setOnClickListener(new k0(r4, 5));
            VB vb51 = this.Y;
            kotlin.jvm.internal.g.b(vb51);
            ((am.r0) vb51).F.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(5));
            VB vb52 = this.Y;
            kotlin.jvm.internal.g.b(vb52);
            ((am.r0) vb52).G.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(4));
            pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
            String p26 = ea.a.p("DWURdTJfB2w_YR9za3M_b09fO20oZ1NfFWQbdSJ0HWccaRdl", "HqisUfB6");
            SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
            boolean z24 = sharedPreferences.getBoolean(p26, false);
            VB vb53 = this.Y;
            kotlin.jvm.internal.g.b(vb53);
            String p27 = ea.a.p("NWk6ZDxuFi47aAl3ZGEwZXlkOHU6dHF1HWQUUyZpNmNo", "kRWTUqiV");
            CheckBox checkBox17 = ((am.r0) vb53).f1376i0;
            kotlin.jvm.internal.g.d(checkBox17, p27);
            b.t0(z24, checkBox17, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$35
                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z25) {
                    a6.h.j("V2UpdRRfA2wFYU1zNnM-bzNfW20nZyZfAmQOdTd0CmdGaS9l", "cdDU3Y80", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z25);
                }
            });
            boolean z25 = sharedPreferences.getBoolean(ea.a.p("V2UpdRRfA2wFYU1zNnM-bzNfW20nZyZfB2QcdQp0OGNBbztfFHULZGU=", "fvygAR0W"), false);
            VB vb54 = this.Y;
            kotlin.jvm.internal.g.b(vb54);
            String p28 = ea.a.p("UWklZBpuBS4BaFt3KGQ8dTd0cXIpcAR1M2QCUyRpB2No", "ZgSsxAjk");
            CheckBox checkBox18 = ((am.r0) vb54).f1361d0;
            kotlin.jvm.internal.g.d(checkBox18, p28);
            b.t0(z25, checkBox18, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$36
                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z26) {
                    a6.h.j("K2VTdR5fVmwtYTNzKnMAb0JfB20kZwBfBGQBdRh0CmM9b0FfHnVeZGU=", "RF6tekkU", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z26);
                }
            });
            VB vb55 = this.Y;
            kotlin.jvm.internal.g.b(vb55);
            ((am.r0) vb55).f1411x0.setOnClickListener(new m2(3));
            VB vb56 = this.Y;
            kotlin.jvm.internal.g.b(vb56);
            ((am.r0) vb56).f1409w0.setOnClickListener(new oo.e(3));
            VB vb57 = this.Y;
            kotlin.jvm.internal.g.b(vb57);
            ((am.r0) vb57).A0.setOnClickListener(new s2(2));
            VB vb58 = this.Y;
            kotlin.jvm.internal.g.b(vb58);
            ((am.r0) vb58).f1415z0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(6));
            VB vb59 = this.Y;
            kotlin.jvm.internal.g.b(vb59);
            ((am.r0) vb59).B0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.q(4));
            VB vb60 = this.Y;
            kotlin.jvm.internal.g.b(vb60);
            ((am.r0) vb60).f1413y0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(6));
            boolean z26 = sharedPreferences.getBoolean(ea.a.p("OGwPYTtzOHMgbxFfV2wyYUpfNmUvYUNsAF9ANDg=", "B9YxBgzW"), false);
            VB vb61 = this.Y;
            kotlin.jvm.internal.g.b(vb61);
            String p29 = ea.a.p("UWklZBpuBS4TbENhEHMFaCt3cWwjYTFEEWZUdQN0NndadCho", "t5oeerIA");
            CheckBox checkBox19 = ((am.r0) vb61).f1360d;
            kotlin.jvm.internal.g.d(checkBox19, p29);
            b.t0(z26, checkBox19, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$43
                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return tf.d.f30009a;
                }

                public final void invoke(boolean z27) {
                    a6.h.j("Umw8YQpzPXMab0NfCmwzYTZfVmUgYTZsFV9aNDg=", "akLtQ5xO", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z27);
                }
            });
            String string = sharedPreferences.getString(ea.a.p("OnBWchhkUl8qbCtuKjFcMQ==", "zFEmouoz"), ea.a.p("QQ==", "7Y75V2Y8"));
            if (string == null) {
                string = ea.a.p("QQ==", "h6bGDelG");
            }
            if (kotlin.jvm.internal.g.a(ea.a.p("QQ==", "i8Urjeph"), string)) {
                VB vb62 = this.Y;
                kotlin.jvm.internal.g.b(vb62);
                ((am.r0) vb62).f1377i1.check(R.id.upgrade_planA);
            } else {
                VB vb63 = this.Y;
                kotlin.jvm.internal.g.b(vb63);
                ((am.r0) vb63).f1377i1.check(R.id.upgrade_planB);
            }
            VB vb64 = this.Y;
            kotlin.jvm.internal.g.b(vb64);
            ((am.r0) vb64).f1377i1.setOnCheckedChangeListener(new n0());
            VB vb65 = this.Y;
            kotlin.jvm.internal.g.b(vb65);
            ((am.r0) vb65).f1380j1.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
            VB vb66 = this.Y;
            kotlin.jvm.internal.g.b(vb66);
            ((am.r0) vb66).F0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27881b;

                {
                    this.f27881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                            debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                            r2 r2Var = new r2(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            r2Var.f23542t = listener;
                            r2Var.show();
                            return;
                        case 2:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                            BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.setBackgroundColor(-16777216);
                                                    am.i iVar6 = readerDebugActivity.f27845a;
                                                    if (iVar6 != null) {
                                                        iVar6.f965d.addView(inflate);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                        throw null;
                                                    }
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.setVisibility(0);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        iVar8.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.setBackgroundColor(-1);
                                                am.i iVar11 = readerDebugActivity2.f27845a;
                                                if (iVar11 != null) {
                                                    iVar11.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                                throw null;
                            }
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                            Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                            intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                                am.i iVar12 = readerDebugActivity3.f27845a;
                                if (iVar12 != null) {
                                    iVar12.f965d.setVisibility(0);
                                    am.i iVar13 = readerDebugActivity3.f27845a;
                                    if (iVar13 != null) {
                                        iVar13.f965d.removeAllViews();
                                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                        am.i iVar14 = readerDebugActivity3.f27845a;
                                        if (iVar14 != null) {
                                            iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                            pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                            pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                            pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                            pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                                throw null;
                            }
                            return;
                    }
                }
            });
            VB vb67 = this.Y;
            kotlin.jvm.internal.g.b(vb67);
            ((am.r0) vb67).f1366f.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(7));
            VB vb68 = this.Y;
            kotlin.jvm.internal.g.b(vb68);
            ((am.r0) vb68).f1383k1.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.adapter.e(3, r4, this));
            VB vb69 = this.Y;
            kotlin.jvm.internal.g.b(vb69);
            ((am.r0) vb69).f1356b0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(7));
            VB vb70 = this.Y;
            kotlin.jvm.internal.g.b(vb70);
            ((am.r0) vb70).f1389m1.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(5));
            VB vb71 = this.Y;
            kotlin.jvm.internal.g.b(vb71);
            ((am.r0) vb71).W.setOnClickListener(new m2(4));
            VB vb72 = this.Y;
            kotlin.jvm.internal.g.b(vb72);
            ((am.r0) vb72).f1412y.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
            VB vb73 = this.Y;
            kotlin.jvm.internal.g.b(vb73);
            ((am.r0) vb73).f1358c0.setOnClickListener(new s2(3));
            VB vb74 = this.Y;
            kotlin.jvm.internal.g.b(vb74);
            ((am.r0) vb74).f1414z.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.g0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27894b;

                {
                    this.f27894b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    final DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27894b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "1T56tIhQ"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$2$1$operatePdfFailedDialog$1
                                    {
                                        super(0);
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ tf.d invoke() {
                                        invoke2();
                                        return tf.d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        h1.h(DebugPageAndDialogFragment.this.r());
                                    }
                                });
                                String string2 = i12.getString(R.string.arg_res_0x7f1302ce);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("L2MkLi9lBFM8cg9uUygFLkt0IGknZxhuG3QuZT9vN2cmXyNwKWMVKQ==", "I9NPHpvy"));
                                operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f13010a));
                                operatePdfFailedDialog.show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "QHD8fRac"));
                            pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            hVar.f23542t = listener;
                            hVar.show();
                            return;
                        default:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "EtTMwngB"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("B2UNXy5iHnM8cg==", "7GltOA2W"), ea.a.p("Qg==", "tokhYxdY"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                    }
                }
            });
            VB vb75 = this.Y;
            kotlin.jvm.internal.g.b(vb75);
            ((am.r0) vb75).D0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(8));
            VB vb76 = this.Y;
            kotlin.jvm.internal.g.b(vb76);
            ((am.r0) vb76).S.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27901b;

                {
                    this.f27901b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27901b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4QDhfFki"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 0, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$4$1$1
                                    public final void invoke(boolean z242) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "NTbtxCUY"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW4Vbj9sKiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUkLl1kI3QpcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUjNhXGU4RCNiOmdwYw1pQWkueQ==", "vUAGV8JF"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_no_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_no_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1ZGWOoih"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "aoP5ST3T"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("NGkeZCduZw==", "9hVpNGrV"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "I61FWUhX"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("BWg_c0ow", "xIqVnVvi"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("BHUabGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeQZlZXACZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckRmBGUgLhNpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiH2c3YzFpEGk8eQ==", "pLjvEfg7"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar5 = readerDebugActivity2.f27845a;
                                if (iVar5 != null) {
                                    iVar5.f965d.setVisibility(0);
                                    am.i iVar6 = readerDebugActivity2.f27845a;
                                    if (iVar6 != null) {
                                        iVar6.f965d.removeAllViews();
                                        ArrayList arrayList = new ArrayList();
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "1XWuN4p0"));
                                        pdfPreviewEntity.setName(ea.a.p("V2UpdRRfFmUBdGtuCG1l", "UwrEC63S"));
                                        arrayList.add(pdfPreviewEntity);
                                        OperateExecuteTask operateExecuteTask = (OperateExecuteTask) readerDebugActivity2.f27847d.getValue();
                                        am.i iVar7 = readerDebugActivity2.f27845a;
                                        if (iVar7 != null) {
                                            String p262 = ea.a.p("UWklZBpuBS4UclVtDEYjbChTUXIjZW4=", "eC6saGxT");
                                            FrameLayout frameLayout = iVar7.f965d;
                                            kotlin.jvm.internal.g.d(frameLayout, p262);
                                            String string2 = readerDebugActivity2.getString(R.string.arg_res_0x7f1300d2);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMpbjVlHnQIZBVzHWNQZThzFXUObAtfBSk=", "lmJhUMax"));
                                            operateExecuteTask.q(0, "", frameLayout, string2, arrayList, true, new pdf.pdfreader.viewer.editor.free.ui.feature.debug.b(readerDebugActivity2));
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Weo4Gymx"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2knZB5uZw==", "xM9Iwtzc"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("KmkiZFpuZw==", "zwHL3ETE"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "AYFuj8R2"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i18 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i18, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25sbhlsAyA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUaLiRkBXQAcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUg1hJWUeRApiOmdwYw1pQWkueQ==", "GG6YhAlo"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i18;
                                am.i iVar8 = readerDebugActivity3.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.setVisibility(0);
                                    am.i iVar9 = readerDebugActivity3.f27845a;
                                    if (iVar9 != null) {
                                        iVar9.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity3);
                                        am.i iVar10 = readerDebugActivity3.f27845a;
                                        if (iVar10 != null) {
                                            View inflate2 = from2.inflate(R.layout.include_preview_create_edit_guide, (ViewGroup) iVar10.f965d, false);
                                            PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) inflate2.findViewById(R.id.con_sign_guide);
                                            x2 x2Var = previewCreateEditGuideView.f25426q;
                                            if (x2Var != null) {
                                                previewCreateEditGuideView.post(new qb.f0(true, previewCreateEditGuideView, x2Var));
                                            }
                                            am.i iVar11 = readerDebugActivity3.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.setBackgroundColor(-1);
                                                am.i iVar12 = readerDebugActivity3.f27845a;
                                                if (iVar12 != null) {
                                                    iVar12.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "yFX8KOna"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "YxvpJ21T"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("J2ldZFFuZw==", "cCE38qqz"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "ZhtR85Z7"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("WmkcZBFuZw==", "fz8rxNHi"));
                                throw null;
                            }
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "UiEMt2Z0"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(2);
                            j2Var.f27638i = new s0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                    }
                }
            });
            VB vb77 = this.Y;
            kotlin.jvm.internal.g.b(vb77);
            ((am.r0) vb77).V.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.j0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27904b;

                {
                    this.f27904b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27904b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "o9SuZi5F"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 1, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$5$1$1
                                    public final void invoke(boolean z242) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "zi45t67J"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuG25fbhJsOSBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUGLhdkDnQ6ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUhFhFmUVRDBiRmcKYwdpFGkGeQ==", "trgU5m8x"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_has_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_has_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("L2kJZANuZw==", "HxMgjCTl"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "dLtUQDJs"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "PKaJvxIq"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "KbKat3rg"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("W2kLZAJuZw==", "VC9ekpLm"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "ioLV8GT2"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(0);
                            j2Var.f27638i = new t0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "lUMjyN6I"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i17 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i17, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5bbiFsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUcLhNkPXQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUgthEmUmRBxiOmdwYw1pQWkueQ==", "pYxUnvTy"));
                                ((ReaderDebugActivity) i17).x1(false);
                                return;
                            }
                            return;
                    }
                }
            });
            VB vb78 = this.Y;
            kotlin.jvm.internal.g.b(vb78);
            ((am.r0) vb78).T.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
            VB vb79 = this.Y;
            kotlin.jvm.internal.g.b(vb79);
            ((am.r0) vb79).U.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27881b;

                {
                    this.f27881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                            debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                            r2 r2Var = new r2(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            r2Var.f23542t = listener;
                            r2Var.show();
                            return;
                        case 2:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                            BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.setBackgroundColor(-16777216);
                                                    am.i iVar6 = readerDebugActivity.f27845a;
                                                    if (iVar6 != null) {
                                                        iVar6.f965d.addView(inflate);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                        throw null;
                                                    }
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.setVisibility(0);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        iVar8.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.setBackgroundColor(-1);
                                                am.i iVar11 = readerDebugActivity2.f27845a;
                                                if (iVar11 != null) {
                                                    iVar11.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                                throw null;
                            }
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                            Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                            intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                                am.i iVar12 = readerDebugActivity3.f27845a;
                                if (iVar12 != null) {
                                    iVar12.f965d.setVisibility(0);
                                    am.i iVar13 = readerDebugActivity3.f27845a;
                                    if (iVar13 != null) {
                                        iVar13.f965d.removeAllViews();
                                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                        am.i iVar14 = readerDebugActivity3.f27845a;
                                        if (iVar14 != null) {
                                            iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                            pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                            pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                            pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                            pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                                throw null;
                            }
                            return;
                    }
                }
            });
            VB vb80 = this.Y;
            kotlin.jvm.internal.g.b(vb80);
            ((am.r0) vb80).N.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27890b;

                {
                    this.f27890b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27890b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "IcypxEDM"));
                            Context r10 = debugPageAndDialogFragment.r();
                            if (r10 != null) {
                                int i12 = HomeScreenPermissionGuideActivity.f24827v;
                                HomeScreenPermissionGuideActivity.a.a(r10, ShortcutType.ICON);
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "BQ5CuyNu"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5nbhxsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU8Li9kAHQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUithLmUbRBxiOmdwYw1pQWkueQ==", "D8BTNJiy"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_convert_btn_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.preview_convert_to_pdf_ll)).setVisibility(0);
                                            ((ImageView) inflate.findViewById(R.id.preview_convert_to_pdf_pro_iv)).setVisibility(8);
                                            ((ProgressView) inflate.findViewById(R.id.preview_convert_to_pdf_progress)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "GgXAd6E2"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "pX6ttOvg"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("FWkoZC5uZw==", "E2wFGx87"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("CWkcZCFuZw==", "YykrHDiG"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "N8sxoYNI"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "3Vkl2jdA"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5DbkFsNCA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUFLgtkXXQ3cmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhJhCmVGRD1iOmdwYw1pQWkueQ==", "euAywn4X"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar6 = readerDebugActivity2.f27845a;
                                if (iVar6 != null) {
                                    iVar6.f965d.setVisibility(0);
                                    am.i iVar7 = readerDebugActivity2.f27845a;
                                    if (iVar7 != null) {
                                        iVar7.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar8 = readerDebugActivity2.f27845a;
                                        if (iVar8 != null) {
                                            View inflate2 = from2.inflate(R.layout.layout_pdf_page_manager_insert_loading, (ViewGroup) iVar8.f965d, false);
                                            inflate2.setVisibility(0);
                                            am.i iVar9 = readerDebugActivity2.f27845a;
                                            if (iVar9 != null) {
                                                iVar9.f965d.setBackgroundColor(-1);
                                                am.i iVar10 = readerDebugActivity2.f27845a;
                                                if (iVar10 != null) {
                                                    iVar10.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HgTO1HXS"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5EkQcgDm"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "GiqZByaS"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "nNQgsTro"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "oJddtgQt"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("Q2gMc3Aw", "TD7eTB77"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("WGUyXxJiPXMGcg==", "65uHsz3F"), ea.a.p("QQ==", "7MqwWsq9"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        default:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("AGgQc24w", "Z6tyJqvA"));
                            Context context = view.getContext();
                            kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "Jv3uDc0W"));
                            String string2 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f13035a);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2kfZxdxIWlHXyhvHXYHcgZpWmcp", "aq9TiYnn"));
                            String string22 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f1304a9);
                            kotlin.jvm.internal.g.d(string22, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0pYDrbh0uSnVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "GMz9SF0S"));
                            new OperateInterceptDialog(context, string2, string22).show();
                            return;
                    }
                }
            });
            VB vb81 = this.Y;
            kotlin.jvm.internal.g.b(vb81);
            ((am.r0) vb81).O.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.g0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27894b;

                {
                    this.f27894b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    final DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27894b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "1T56tIhQ"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$2$1$operatePdfFailedDialog$1
                                    {
                                        super(0);
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ tf.d invoke() {
                                        invoke2();
                                        return tf.d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        h1.h(DebugPageAndDialogFragment.this.r());
                                    }
                                });
                                String string2 = i12.getString(R.string.arg_res_0x7f1302ce);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("L2MkLi9lBFM8cg9uUygFLkt0IGknZxhuG3QuZT9vN2cmXyNwKWMVKQ==", "I9NPHpvy"));
                                operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f13010a));
                                operatePdfFailedDialog.show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "QHD8fRac"));
                            pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            hVar.f23542t = listener;
                            hVar.show();
                            return;
                        default:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "EtTMwngB"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("B2UNXy5iHnM8cg==", "7GltOA2W"), ea.a.p("Qg==", "tokhYxdY"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                    }
                }
            });
            VB vb82 = this.Y;
            kotlin.jvm.internal.g.b(vb82);
            ((am.r0) vb82).P.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27898b;

                {
                    this.f27898b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27898b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("GGg_cxIw", "VClV6lHc"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$3$1$operatePdfFailedDialog$1
                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ tf.d invoke() {
                                        invoke2();
                                        return tf.d.f30009a;
                                    }
                                });
                                String string2 = i12.getString(R.string.arg_res_0x7f1302af);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("KGMDLgNlLFM8cg9uUygFLkt0IGknZxhuEXQGbyNrHWU7chhyKQ==", "DuIwdXVH"));
                                operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f130575));
                                operatePdfFailedDialog.show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "Y68a98i8"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuG24ebjFsGiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUGLlZkLXQZcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhFhV2U2RBNiOmdwYw1pQWkueQ==", "Qkbxt3Dv"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.layout_tools_operate_r3_01, (ViewGroup) iVar3.f965d, false);
                                            ((TextView) inflate.findViewById(R.id.tv_desc)).setText(readerDebugActivity.getString(R.string.arg_res_0x7f1300d3));
                                            ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) inflate.findViewById(R.id.progressbar);
                                            readerRoundProgressBar.setMax(100);
                                            readerRoundProgressBar.setProgress(50);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("EmkcZBtuZw==", "kHprr4qo"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "kCXWFdIJ"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5gONdife"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8tzH0Lxk"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "WvlWhCYG"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingOpenWithGuideActivity.class));
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "XwgXZ5n8"));
                            pdf.pdfreader.viewer.editor.free.ui.dialog.x2 x2Var = new pdf.pdfreader.viewer.editor.free.ui.dialog.x2(view.getContext(), "", "", debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d4), true);
                            x2Var.C = true;
                            x2Var.show();
                            return;
                    }
                }
            });
            VB vb83 = this.Y;
            kotlin.jvm.internal.g.b(vb83);
            ((am.r0) vb83).I.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(6));
            VB vb84 = this.Y;
            kotlin.jvm.internal.g.b(vb84);
            ((am.r0) vb84).J.setOnClickListener(new oo.e(4));
            VB vb85 = this.Y;
            kotlin.jvm.internal.g.b(vb85);
            ((am.r0) vb85).f1393o0.setOnClickListener(new s2(4));
            VB vb86 = this.Y;
            kotlin.jvm.internal.g.b(vb86);
            ((am.r0) vb86).f1373h0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(8));
            VB vb87 = this.Y;
            kotlin.jvm.internal.g.b(vb87);
            ((am.r0) vb87).U0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.q(5));
            VB vb88 = this.Y;
            kotlin.jvm.internal.g.b(vb88);
            ((am.r0) vb88).f1362d1.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(9));
            VB vb89 = this.Y;
            kotlin.jvm.internal.g.b(vb89);
            ((am.r0) vb89).G0.setOnClickListener(new t(r4, 4));
            VB vb90 = this.Y;
            kotlin.jvm.internal.g.b(vb90);
            ((am.r0) vb90).X0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.j0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27904b;

                {
                    this.f27904b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27904b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "o9SuZi5F"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 1, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$5$1$1
                                    public final void invoke(boolean z242) {
                                    }

                                    @Override // cg.l
                                    public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                        invoke(bool.booleanValue());
                                        return tf.d.f30009a;
                                    }
                                }).show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "zi45t67J"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuG25fbhJsOSBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUGLhdkDnQ6ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUhFhFmUVRDBiRmcKYwdpFGkGeQ==", "trgU5m8x"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_refresh_has_data, (ViewGroup) iVar3.f965d, false);
                                            ((LinearLayout) inflate.findViewById(R.id.ll_refresh_has_data)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("L2kJZANuZw==", "HxMgjCTl"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "dLtUQDJs"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "PKaJvxIq"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "KbKat3rg"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("W2kLZAJuZw==", "VC9ekpLm"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "ioLV8GT2"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(0);
                            j2Var.f27638i = new t0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "lUMjyN6I"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i17 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i17, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5bbiFsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUcLhNkPXQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUgthEmUmRBxiOmdwYw1pQWkueQ==", "pYxUnvTy"));
                                ((ReaderDebugActivity) i17).x1(false);
                                return;
                            }
                            return;
                    }
                }
            });
            VB vb91 = this.Y;
            kotlin.jvm.internal.g.b(vb91);
            ((am.r0) vb91).Z0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
            VB vb92 = this.Y;
            kotlin.jvm.internal.g.b(vb92);
            ((am.r0) vb92).f1354a1.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27881b;

                {
                    this.f27881b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                            debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                            r2 r2Var = new r2(view.getContext());
                            DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                            kotlin.jvm.internal.g.e(listener, "listener");
                            r2Var.f23542t = listener;
                            r2Var.show();
                            return;
                        case 2:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                            BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.setBackgroundColor(-16777216);
                                                    am.i iVar6 = readerDebugActivity.f27845a;
                                                    if (iVar6 != null) {
                                                        iVar6.f965d.addView(inflate);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                        throw null;
                                                    }
                                                }
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                                throw null;
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.setVisibility(0);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        iVar8.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.setBackgroundColor(-1);
                                                am.i iVar11 = readerDebugActivity2.f27845a;
                                                if (iVar11 != null) {
                                                    iVar11.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                                throw null;
                            }
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                            Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                            intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                            return;
                        default:
                            int i19 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                                ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                                am.i iVar12 = readerDebugActivity3.f27845a;
                                if (iVar12 != null) {
                                    iVar12.f965d.setVisibility(0);
                                    am.i iVar13 = readerDebugActivity3.f27845a;
                                    if (iVar13 != null) {
                                        iVar13.f965d.removeAllViews();
                                        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                        am.i iVar14 = readerDebugActivity3.f27845a;
                                        if (iVar14 != null) {
                                            iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                            pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                            PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                            pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                            pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                            pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                            return;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                                throw null;
                            }
                            return;
                    }
                }
            });
            VB vb93 = this.Y;
            kotlin.jvm.internal.g.b(vb93);
            ((am.r0) vb93).Y0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27890b;

                {
                    this.f27890b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27890b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "IcypxEDM"));
                            Context r10 = debugPageAndDialogFragment.r();
                            if (r10 != null) {
                                int i12 = HomeScreenPermissionGuideActivity.f24827v;
                                HomeScreenPermissionGuideActivity.a.a(r10, ShortcutType.ICON);
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "BQ5CuyNu"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5nbhxsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU8Li9kAHQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUithLmUbRBxiOmdwYw1pQWkueQ==", "D8BTNJiy"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.word2pdf_convert_btn_layout, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.preview_convert_to_pdf_ll)).setVisibility(0);
                                            ((ImageView) inflate.findViewById(R.id.preview_convert_to_pdf_pro_iv)).setVisibility(8);
                                            ((ProgressView) inflate.findViewById(R.id.preview_convert_to_pdf_progress)).setVisibility(0);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "GgXAd6E2"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "pX6ttOvg"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("FWkoZC5uZw==", "E2wFGx87"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("CWkcZCFuZw==", "YykrHDiG"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "N8sxoYNI"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "3Vkl2jdA"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i16, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5DbkFsNCA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUFLgtkXXQ3cmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhJhCmVGRD1iOmdwYw1pQWkueQ==", "euAywn4X"));
                                ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                                am.i iVar6 = readerDebugActivity2.f27845a;
                                if (iVar6 != null) {
                                    iVar6.f965d.setVisibility(0);
                                    am.i iVar7 = readerDebugActivity2.f27845a;
                                    if (iVar7 != null) {
                                        iVar7.f965d.removeAllViews();
                                        LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                        am.i iVar8 = readerDebugActivity2.f27845a;
                                        if (iVar8 != null) {
                                            View inflate2 = from2.inflate(R.layout.layout_pdf_page_manager_insert_loading, (ViewGroup) iVar8.f965d, false);
                                            inflate2.setVisibility(0);
                                            am.i iVar9 = readerDebugActivity2.f27845a;
                                            if (iVar9 != null) {
                                                iVar9.f965d.setBackgroundColor(-1);
                                                am.i iVar10 = readerDebugActivity2.f27845a;
                                                if (iVar10 != null) {
                                                    iVar10.f965d.addView(inflate2);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HgTO1HXS"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5EkQcgDm"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "GiqZByaS"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "nNQgsTro"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "oJddtgQt"));
                                throw null;
                            }
                            return;
                        case 3:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("Q2gMc3Aw", "TD7eTB77"));
                            Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                            intent.putExtra(ea.a.p("WGUyXxJiPXMGcg==", "65uHsz3F"), ea.a.p("QQ==", "7MqwWsq9"));
                            debugPageAndDialogFragment.n0(intent);
                            return;
                        default:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("AGgQc24w", "Z6tyJqvA"));
                            Context context = view.getContext();
                            kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "Jv3uDc0W"));
                            String string2 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f13035a);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2kfZxdxIWlHXyhvHXYHcgZpWmcp", "aq9TiYnn"));
                            String string22 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f1304a9);
                            kotlin.jvm.internal.g.d(string22, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0pYDrbh0uSnVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "GMz9SF0S"));
                            new OperateInterceptDialog(context, string2, string22).show();
                            return;
                    }
                }
            });
            VB vb94 = this.Y;
            kotlin.jvm.internal.g.b(vb94);
            ((am.r0) vb94).f1400s.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27898b;

                {
                    this.f27898b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27898b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("GGg_cxIw", "VClV6lHc"));
                            androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                            if (i12 != null) {
                                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$3$1$operatePdfFailedDialog$1
                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ tf.d invoke() {
                                        invoke2();
                                        return tf.d.f30009a;
                                    }
                                });
                                String string2 = i12.getString(R.string.arg_res_0x7f1302af);
                                kotlin.jvm.internal.g.d(string2, ea.a.p("KGMDLgNlLFM8cg9uUygFLkt0IGknZxhuEXQGbyNrHWU7chhyKQ==", "DuIwdXVH"));
                                operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f130575));
                                operatePdfFailedDialog.show();
                                return;
                            }
                            return;
                        case 1:
                            int i13 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "Y68a98i8"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuG24ebjFsGiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUGLlZkLXQZcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhFhV2U2RBNiOmdwYw1pQWkueQ==", "Qkbxt3Dv"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.layout_tools_operate_r3_01, (ViewGroup) iVar3.f965d, false);
                                            ((TextView) inflate.findViewById(R.id.tv_desc)).setText(readerDebugActivity.getString(R.string.arg_res_0x7f1300d3));
                                            ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) inflate.findViewById(R.id.progressbar);
                                            readerRoundProgressBar.setMax(100);
                                            readerRoundProgressBar.setProgress(50);
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("EmkcZBtuZw==", "kHprr4qo"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "kCXWFdIJ"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5gONdife"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8tzH0Lxk"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i15 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "WvlWhCYG"));
                            debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingOpenWithGuideActivity.class));
                            return;
                        default:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "XwgXZ5n8"));
                            pdf.pdfreader.viewer.editor.free.ui.dialog.x2 x2Var = new pdf.pdfreader.viewer.editor.free.ui.dialog.x2(view.getContext(), "", "", debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d4), true);
                            x2Var.C = true;
                            x2Var.show();
                            return;
                    }
                }
            });
            VB vb95 = this.Y;
            kotlin.jvm.internal.g.b(vb95);
            ((am.r0) vb95).f1396q.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.scan.ui.s(7));
            VB vb96 = this.Y;
            kotlin.jvm.internal.g.b(vb96);
            ((am.r0) vb96).f1398r.setOnClickListener(new m2(5));
            VB vb97 = this.Y;
            kotlin.jvm.internal.g.b(vb97);
            ((am.r0) vb97).f1372h.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ DebugPageAndDialogFragment f27915b;

                {
                    this.f27915b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i10 = r2;
                    DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                    switch (i10) {
                        case 0:
                            int i11 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                            AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                            Context r10 = debugPageAndDialogFragment.r();
                            String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                            aVar.getClass();
                            AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                            return;
                        case 1:
                            int i12 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                                am.i iVar = readerDebugActivity.f27845a;
                                if (iVar != null) {
                                    iVar.f965d.setVisibility(0);
                                    am.i iVar2 = readerDebugActivity.f27845a;
                                    if (iVar2 != null) {
                                        iVar2.f965d.removeAllViews();
                                        LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                        am.i iVar3 = readerDebugActivity.f27845a;
                                        if (iVar3 != null) {
                                            View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                            ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                            String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                            kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                            ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                            am.i iVar4 = readerDebugActivity.f27845a;
                                            if (iVar4 != null) {
                                                iVar4.f965d.setBackgroundColor(-16777216);
                                                am.i iVar5 = readerDebugActivity.f27845a;
                                                if (iVar5 != null) {
                                                    iVar5.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                                throw null;
                            }
                            return;
                        case 2:
                            int i14 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                            int i15 = ap.d.G;
                            androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                            ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                            ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                            dVar.y();
                            dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                            dVar.z();
                            dVar.show();
                            return;
                        case 3:
                            int i16 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                            Context g02 = debugPageAndDialogFragment.g0();
                            ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                            PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g02, 1);
                            pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                            pdfReaderOpenClearDialog.show();
                            return;
                        case 4:
                            int i17 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                            j2 j2Var = new j2(view.getContext());
                            j2Var.c(1);
                            j2Var.f27638i = new u0(j2Var);
                            j2Var.show();
                            debugPageAndDialogFragment.f27863f0 = j2Var;
                            return;
                        case 5:
                            int i18 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                            if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                                androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                                kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                                ((ReaderDebugActivity) i19).x1(true);
                                return;
                            }
                            return;
                        default:
                            int i20 = DebugPageAndDialogFragment.f27860g0;
                            kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                            return;
                    }
                }
            });
        }
        Context g02 = g0();
        ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "6YQw2FI0");
        VB vb98 = this.Y;
        kotlin.jvm.internal.g.b(vb98);
        ((am.r0) vb98).f1353a0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27881b;

            {
                this.f27881b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                        debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                        return;
                    case 1:
                        int i12 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                        r2 r2Var = new r2(view.getContext());
                        DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                        kotlin.jvm.internal.g.e(listener, "listener");
                        r2Var.f23542t = listener;
                        r2Var.show();
                        return;
                    case 2:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                        ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                        BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                            am.i iVar5 = readerDebugActivity.f27845a;
                                            if (iVar5 != null) {
                                                iVar5.f965d.setBackgroundColor(-16777216);
                                                am.i iVar6 = readerDebugActivity.f27845a;
                                                if (iVar6 != null) {
                                                    iVar6.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                            throw null;
                        }
                        return;
                    case 3:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                            ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                            am.i iVar7 = readerDebugActivity2.f27845a;
                            if (iVar7 != null) {
                                iVar7.f965d.setVisibility(0);
                                am.i iVar8 = readerDebugActivity2.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.removeAllViews();
                                    LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                    am.i iVar9 = readerDebugActivity2.f27845a;
                                    if (iVar9 != null) {
                                        View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                        am.i iVar10 = readerDebugActivity2.f27845a;
                                        if (iVar10 != null) {
                                            iVar10.f965d.setBackgroundColor(-1);
                                            am.i iVar11 = readerDebugActivity2.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.addView(inflate2);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                            throw null;
                        }
                        return;
                    case 4:
                        int i17 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                        Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                        intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                        debugPageAndDialogFragment.n0(intent);
                        return;
                    case 5:
                        int i18 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                        debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                        return;
                    default:
                        int i19 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                            ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                            am.i iVar12 = readerDebugActivity3.f27845a;
                            if (iVar12 != null) {
                                iVar12.f965d.setVisibility(0);
                                am.i iVar13 = readerDebugActivity3.f27845a;
                                if (iVar13 != null) {
                                    iVar13.f965d.removeAllViews();
                                    Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                    am.i iVar14 = readerDebugActivity3.f27845a;
                                    if (iVar14 != null) {
                                        iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                        pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                        pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                        pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                            throw null;
                        }
                        return;
                }
            }
        });
        VB vb99 = this.Y;
        kotlin.jvm.internal.g.b(vb99);
        ((am.r0) vb99).H.setOnClickListener(new w(g02, 2));
        VB vb100 = this.Y;
        kotlin.jvm.internal.g.b(vb100);
        ((am.r0) vb100).D.setOnClickListener(new k0(g02, 1));
        VB vb101 = this.Y;
        kotlin.jvm.internal.g.b(vb101);
        ((am.r0) vb101).E.setOnClickListener(new l0(g02, 1));
        VB vb102 = this.Y;
        kotlin.jvm.internal.g.b(vb102);
        ((am.r0) vb102).C.setOnClickListener(new t(g02, 2));
        VB vb103 = this.Y;
        kotlin.jvm.internal.g.b(vb103);
        ((am.r0) vb103).X.setOnClickListener(new b0(g02, 2));
        Context g03 = g0();
        ea.a.p("QWU6dRpyB0MdbkBlEXR-KQ==", "asaNnxmY");
        VB vb104 = this.Y;
        kotlin.jvm.internal.g.b(vb104);
        ((am.r0) vb104).f1407v0.setOnClickListener(new c0(g03, 2));
        VB vb105 = this.Y;
        kotlin.jvm.internal.g.b(vb105);
        ((am.r0) vb105).f1405u0.setOnClickListener(new c(g03, 3));
        VB vb106 = this.Y;
        kotlin.jvm.internal.g.b(vb106);
        ((am.r0) vb106).M.setOnClickListener(new w(g03, 1));
        VB vb107 = this.Y;
        kotlin.jvm.internal.g.b(vb107);
        ((am.r0) vb107).K.setOnClickListener(new k0(g03, 0));
        VB vb108 = this.Y;
        kotlin.jvm.internal.g.b(vb108);
        ((am.r0) vb108).L.setOnClickListener(new l0(g03, 0));
        VB vb109 = this.Y;
        kotlin.jvm.internal.g.b(vb109);
        ((am.r0) vb109).Y.setOnClickListener(new t(g03, 1));
        VB vb110 = this.Y;
        kotlin.jvm.internal.g.b(vb110);
        ((am.r0) vb110).Z.setOnClickListener(new b0(g03, 1));
        VB vb111 = this.Y;
        kotlin.jvm.internal.g.b(vb111);
        ((am.r0) vb111).C0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.m0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27915b;

            {
                this.f27915b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27915b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "hynrfsrv"));
                        AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                        Context r10 = debugPageAndDialogFragment.r();
                        String p262 = ea.a.p("R28kbHM=", "5y4TWlb7");
                        aVar.getClass();
                        AISelfInfoActivity.a.a(r10, "", -1, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD, p262, true);
                        return;
                    case 1:
                        int i12 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "EJSy53hU"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i13 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i13, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuOG5MbjhsCiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUlLgRkJHQJch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjJhBWU_RANiRmcKYwdpFGkGeQ==", "WaMfiRaf"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i13;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.choose_no_permission, (ViewGroup) iVar3.f965d, false);
                                        ((ViewGroup) inflate.findViewById(R.id.permissionTipsLayout)).setVisibility(0);
                                        String string2 = readerDebugActivity.getString(R.string.arg_res_0x7f1302ae);
                                        kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHG4jZSdfOHQHchJnUV9BZSpkLGYLbBdzazEp", "Khs4Aam4"));
                                        ((TextView) inflate.findViewById(R.id.tvPermissionTips)).setText(aj.b.T(androidx.core.content.a.getColor(readerDebugActivity, R.color.colorAccent), string2));
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            iVar4.f965d.setBackgroundColor(-16777216);
                                            am.i iVar5 = readerDebugActivity.f27845a;
                                            if (iVar5 != null) {
                                                iVar5.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("Gmk_ZDhuZw==", "CixQQikq"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1uomin6F"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8yBG0GQs"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "bsRpBD31"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("N2ldZB5uZw==", "G2U3w7MU"));
                            throw null;
                        }
                        return;
                    case 2:
                        int i14 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "w5pmsKOn"));
                        int i15 = ap.d.G;
                        androidx.fragment.app.u f02 = debugPageAndDialogFragment.f0();
                        ea.a.p("QWU6dRpyB0ERdF12AHQvKCk=", "Mzgm0ghA");
                        ap.d dVar = new ap.d(f02, null, new e5.d(0), 0, null, null);
                        dVar.y();
                        dVar.setContentView(R.layout.upgrade_bottom_dialog_upgrade_guide);
                        dVar.z();
                        dVar.show();
                        return;
                    case 3:
                        int i16 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "pKRa6CCk"));
                        Context g022 = debugPageAndDialogFragment.g0();
                        ea.a.p("PWVAdRByUkM1bj5lDXRAKQ==", "UWY3NAbo");
                        PdfReaderOpenClearDialog pdfReaderOpenClearDialog = new PdfReaderOpenClearDialog(g022, 1);
                        pdfReaderOpenClearDialog.K = new androidx.appcompat.libconvert.helper.b(debugPageAndDialogFragment, 17);
                        pdfReaderOpenClearDialog.show();
                        return;
                    case 4:
                        int i17 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4fpzh1WV"));
                        j2 j2Var = new j2(view.getContext());
                        j2Var.c(1);
                        j2Var.f27638i = new u0(j2Var);
                        j2Var.show();
                        debugPageAndDialogFragment.f27863f0 = j2Var;
                        return;
                    case 5:
                        int i18 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "LE8DW4rd"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i19 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i19, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25mbgBsPiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGVCLi5kHHQ9ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUlVhL2UHRDdiRmcKYwdpFGkGeQ==", "0KuRrIG3"));
                            ((ReaderDebugActivity) i19).x1(true);
                            return;
                        }
                        return;
                    default:
                        int i20 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "bEGXXzsE"));
                        new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(view.getContext(), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a7), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304a8), debugPageAndDialogFragment.x(R.string.arg_res_0x7f1300ff)).show();
                        return;
                }
            }
        });
        VB vb112 = this.Y;
        kotlin.jvm.internal.g.b(vb112);
        String p30 = ea.a.p("UWklZBpuBS4QdFpTAGc4QiVjWVMndiZEL2Egb2c=", "FLmaopyC");
        Button button = ((am.r0) vb112).f1404u;
        kotlin.jvm.internal.g.d(button, p30);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(button, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initSignDebug$2
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
                Context r10 = DebugPageAndDialogFragment.this.r();
                if (r10 != null) {
                    new pdf.pdfreader.viewer.editor.free.ui.dialog.x2(r10, "", true).show();
                }
            }
        });
        VB vb113 = this.Y;
        kotlin.jvm.internal.g.b(vb113);
        String p31 = ea.a.p("LWlfZBBuUC44dCRTHGcGU0JpGmMtVARid2lTbChn", "doMr32Gd");
        Button button2 = ((am.r0) vb113).f1406v;
        kotlin.jvm.internal.g.d(button2, p31);
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(button2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initSignDebug$3
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
                Context r10 = DebugPageAndDialogFragment.this.r();
                if (r10 != null) {
                    new g3(r10).show();
                }
            }
        });
        VB vb114 = this.Y;
        kotlin.jvm.internal.g.b(vb114);
        ((am.r0) vb114).f1386l1.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.f0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27890b;

            {
                this.f27890b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27890b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "IcypxEDM"));
                        Context r10 = debugPageAndDialogFragment.r();
                        if (r10 != null) {
                            int i12 = HomeScreenPermissionGuideActivity.f24827v;
                            HomeScreenPermissionGuideActivity.a.a(r10, ShortcutType.ICON);
                            return;
                        }
                        return;
                    case 1:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "BQ5CuyNu"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuIW5nbhxsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmU8Li9kAHQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUithLmUbRBxiOmdwYw1pQWkueQ==", "D8BTNJiy"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.word2pdf_convert_btn_layout, (ViewGroup) iVar3.f965d, false);
                                        ((ViewGroup) inflate.findViewById(R.id.preview_convert_to_pdf_ll)).setVisibility(0);
                                        ((ImageView) inflate.findViewById(R.id.preview_convert_to_pdf_pro_iv)).setVisibility(8);
                                        ((ProgressView) inflate.findViewById(R.id.preview_convert_to_pdf_progress)).setVisibility(0);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            iVar4.f965d.setBackgroundColor(-16777216);
                                            am.i iVar5 = readerDebugActivity.f27845a;
                                            if (iVar5 != null) {
                                                iVar5.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "GgXAd6E2"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "pX6ttOvg"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("FWkoZC5uZw==", "E2wFGx87"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("CWkcZCFuZw==", "YykrHDiG"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "N8sxoYNI"));
                            throw null;
                        }
                        return;
                    case 2:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "3Vkl2jdA"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i16, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuGG5DbkFsNCA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUFLgtkXXQ3cmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhJhCmVGRD1iOmdwYw1pQWkueQ==", "euAywn4X"));
                            ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                            am.i iVar6 = readerDebugActivity2.f27845a;
                            if (iVar6 != null) {
                                iVar6.f965d.setVisibility(0);
                                am.i iVar7 = readerDebugActivity2.f27845a;
                                if (iVar7 != null) {
                                    iVar7.f965d.removeAllViews();
                                    LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                    am.i iVar8 = readerDebugActivity2.f27845a;
                                    if (iVar8 != null) {
                                        View inflate2 = from2.inflate(R.layout.layout_pdf_page_manager_insert_loading, (ViewGroup) iVar8.f965d, false);
                                        inflate2.setVisibility(0);
                                        am.i iVar9 = readerDebugActivity2.f27845a;
                                        if (iVar9 != null) {
                                            iVar9.f965d.setBackgroundColor(-1);
                                            am.i iVar10 = readerDebugActivity2.f27845a;
                                            if (iVar10 != null) {
                                                iVar10.f965d.addView(inflate2);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HgTO1HXS"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5EkQcgDm"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "GiqZByaS"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "nNQgsTro"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "oJddtgQt"));
                            throw null;
                        }
                        return;
                    case 3:
                        int i17 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("Q2gMc3Aw", "TD7eTB77"));
                        Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                        intent.putExtra(ea.a.p("WGUyXxJiPXMGcg==", "65uHsz3F"), ea.a.p("QQ==", "7MqwWsq9"));
                        debugPageAndDialogFragment.n0(intent);
                        return;
                    default:
                        int i18 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("AGgQc24w", "Z6tyJqvA"));
                        Context context = view.getContext();
                        kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "Jv3uDc0W"));
                        String string2 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f13035a);
                        kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2kfZxdxIWlHXyhvHXYHcgZpWmcp", "aq9TiYnn"));
                        String string22 = debugPageAndDialogFragment.v().getString(R.string.arg_res_0x7f1304a9);
                        kotlin.jvm.internal.g.d(string22, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0pYDrbh0uSnVBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "GMz9SF0S"));
                        new OperateInterceptDialog(context, string2, string22).show();
                        return;
                }
            }
        });
        VB vb115 = this.Y;
        kotlin.jvm.internal.g.b(vb115);
        ((am.r0) vb115).A.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.g0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27894b;

            {
                this.f27894b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                final DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27894b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "1T56tIhQ"));
                        androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                        if (i12 != null) {
                            OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$2$1$operatePdfFailedDialog$1
                                {
                                    super(0);
                                }

                                @Override // cg.a
                                public /* bridge */ /* synthetic */ tf.d invoke() {
                                    invoke2();
                                    return tf.d.f30009a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    h1.h(DebugPageAndDialogFragment.this.r());
                                }
                            });
                            String string2 = i12.getString(R.string.arg_res_0x7f1302ce);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("L2MkLi9lBFM8cg9uUygFLkt0IGknZxhuG3QuZT9vN2cmXyNwKWMVKQ==", "I9NPHpvy"));
                            operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f13010a));
                            operatePdfFailedDialog.show();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "QHD8fRac"));
                        pdf.pdfreader.viewer.editor.free.ui.dialog.h hVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.h(view.getContext());
                        DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                        kotlin.jvm.internal.g.e(listener, "listener");
                        hVar.f23542t = listener;
                        hVar.show();
                        return;
                    default:
                        int i14 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "EtTMwngB"));
                        Intent intent = new Intent(view.getContext(), SettingOpenWithGuideABActivity.class);
                        intent.putExtra(ea.a.p("B2UNXy5iHnM8cg==", "7GltOA2W"), ea.a.p("Qg==", "tokhYxdY"));
                        debugPageAndDialogFragment.n0(intent);
                        return;
                }
            }
        });
        VB vb116 = this.Y;
        kotlin.jvm.internal.g.b(vb116);
        ((am.r0) vb116).B.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.h0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27898b;

            {
                this.f27898b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27898b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("GGg_cxIw", "VClV6lHc"));
                        androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                        if (i12 != null) {
                            OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(i12, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$3$1$operatePdfFailedDialog$1
                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // cg.a
                                public /* bridge */ /* synthetic */ tf.d invoke() {
                                    invoke2();
                                    return tf.d.f30009a;
                                }
                            });
                            String string2 = i12.getString(R.string.arg_res_0x7f1302af);
                            kotlin.jvm.internal.g.d(string2, ea.a.p("KGMDLgNlLFM8cg9uUygFLkt0IGknZxhuEXQGbyNrHWU7chhyKQ==", "DuIwdXVH"));
                            operatePdfFailedDialog.H(string2, i12.getString(R.string.arg_res_0x7f130575));
                            operatePdfFailedDialog.show();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "Y68a98i8"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuG24ebjFsGiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUGLlZkLXQZcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUhFhV2U2RBNiOmdwYw1pQWkueQ==", "Qkbxt3Dv"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.layout_tools_operate_r3_01, (ViewGroup) iVar3.f965d, false);
                                        ((TextView) inflate.findViewById(R.id.tv_desc)).setText(readerDebugActivity.getString(R.string.arg_res_0x7f1300d3));
                                        ReaderRoundProgressBar readerRoundProgressBar = (ReaderRoundProgressBar) inflate.findViewById(R.id.progressbar);
                                        readerRoundProgressBar.setMax(100);
                                        readerRoundProgressBar.setProgress(50);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            iVar4.f965d.addView(inflate);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("EmkcZBtuZw==", "kHprr4qo"));
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "kCXWFdIJ"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "5gONdife"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "8tzH0Lxk"));
                            throw null;
                        }
                        return;
                    case 2:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "WvlWhCYG"));
                        debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingOpenWithGuideActivity.class));
                        return;
                    default:
                        int i16 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "XwgXZ5n8"));
                        pdf.pdfreader.viewer.editor.free.ui.dialog.x2 x2Var = new pdf.pdfreader.viewer.editor.free.ui.dialog.x2(view.getContext(), "", "", debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d4), true);
                        x2Var.C = true;
                        x2Var.show();
                        return;
                }
            }
        });
        VB vb117 = this.Y;
        kotlin.jvm.internal.g.b(vb117);
        ((am.r0) vb117).Q.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.i0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27901b;

            {
                this.f27901b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27901b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "4QDhfFki"));
                        androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                        if (i12 != null) {
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 0, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$4$1$1
                                public final void invoke(boolean z242) {
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return tf.d.f30009a;
                                }
                            }).show();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "NTbtxCUY"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW4Vbj9sKiA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUkLl1kI3QpcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUjNhXGU4RCNiOmdwYw1pQWkueQ==", "vUAGV8JF"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.choose_refresh_no_data, (ViewGroup) iVar3.f965d, false);
                                        ((LinearLayout) inflate.findViewById(R.id.ll_refresh_no_data)).setVisibility(0);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            iVar4.f965d.addView(inflate);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1ZGWOoih"));
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "aoP5ST3T"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("NGkeZCduZw==", "9hVpNGrV"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "I61FWUhX"));
                            throw null;
                        }
                        return;
                    case 2:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("BWg_c0ow", "xIqVnVvi"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i16, ea.a.p("BHUabGVjB24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAeeQZlZXACZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtckRmBGUgLhNpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiH2c3YzFpEGk8eQ==", "pLjvEfg7"));
                            ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                            am.i iVar5 = readerDebugActivity2.f27845a;
                            if (iVar5 != null) {
                                iVar5.f965d.setVisibility(0);
                                am.i iVar6 = readerDebugActivity2.f27845a;
                                if (iVar6 != null) {
                                    iVar6.f965d.removeAllViews();
                                    ArrayList arrayList = new ArrayList();
                                    PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                    pdfPreviewEntity.setPath(ea.a.p("V2UpdRQvFmUBdBtwCHRo", "1XWuN4p0"));
                                    pdfPreviewEntity.setName(ea.a.p("V2UpdRRfFmUBdGtuCG1l", "UwrEC63S"));
                                    arrayList.add(pdfPreviewEntity);
                                    OperateExecuteTask operateExecuteTask = (OperateExecuteTask) readerDebugActivity2.f27847d.getValue();
                                    am.i iVar7 = readerDebugActivity2.f27845a;
                                    if (iVar7 != null) {
                                        String p262 = ea.a.p("UWklZBpuBS4UclVtDEYjbChTUXIjZW4=", "eC6saGxT");
                                        FrameLayout frameLayout = iVar7.f965d;
                                        kotlin.jvm.internal.g.d(frameLayout, p262);
                                        String string2 = readerDebugActivity2.getString(R.string.arg_res_0x7f1300d2);
                                        kotlin.jvm.internal.g.d(string2, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMpbjVlHnQIZBVzHWNQZThzFXUObAtfBSk=", "lmJhUMax"));
                                        operateExecuteTask.q(0, "", frameLayout, string2, arrayList, true, new pdf.pdfreader.viewer.editor.free.ui.feature.debug.b(readerDebugActivity2));
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Weo4Gymx"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("W2knZB5uZw==", "xM9Iwtzc"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("KmkiZFpuZw==", "zwHL3ETE"));
                            throw null;
                        }
                        return;
                    case 3:
                        int i17 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "AYFuj8R2"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i18 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i18, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuB25sbhlsAyA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUaLiRkBXQAcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUg1hJWUeRApiOmdwYw1pQWkueQ==", "GG6YhAlo"));
                            ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i18;
                            am.i iVar8 = readerDebugActivity3.f27845a;
                            if (iVar8 != null) {
                                iVar8.f965d.setVisibility(0);
                                am.i iVar9 = readerDebugActivity3.f27845a;
                                if (iVar9 != null) {
                                    iVar9.f965d.removeAllViews();
                                    LayoutInflater from2 = LayoutInflater.from(readerDebugActivity3);
                                    am.i iVar10 = readerDebugActivity3.f27845a;
                                    if (iVar10 != null) {
                                        View inflate2 = from2.inflate(R.layout.include_preview_create_edit_guide, (ViewGroup) iVar10.f965d, false);
                                        PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) inflate2.findViewById(R.id.con_sign_guide);
                                        x2 x2Var = previewCreateEditGuideView.f25426q;
                                        if (x2Var != null) {
                                            previewCreateEditGuideView.post(new qb.f0(true, previewCreateEditGuideView, x2Var));
                                        }
                                        am.i iVar11 = readerDebugActivity3.f27845a;
                                        if (iVar11 != null) {
                                            iVar11.f965d.setBackgroundColor(-1);
                                            am.i iVar12 = readerDebugActivity3.f27845a;
                                            if (iVar12 != null) {
                                                iVar12.f965d.addView(inflate2);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "yFX8KOna"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "YxvpJ21T"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("J2ldZFFuZw==", "cCE38qqz"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "ZhtR85Z7"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("WmkcZBFuZw==", "fz8rxNHi"));
                            throw null;
                        }
                        return;
                    default:
                        int i19 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "UiEMt2Z0"));
                        j2 j2Var = new j2(view.getContext());
                        j2Var.c(2);
                        j2Var.f27638i = new s0(j2Var);
                        j2Var.show();
                        debugPageAndDialogFragment.f27863f0 = j2Var;
                        return;
                }
            }
        });
        VB vb118 = this.Y;
        kotlin.jvm.internal.g.b(vb118);
        ((am.r0) vb118).R.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.j0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27904b;

            {
                this.f27904b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27904b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "o9SuZi5F"));
                        androidx.fragment.app.u i12 = debugPageAndDialogFragment.i();
                        if (i12 != null) {
                            new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(i12, 1, debugPageAndDialogFragment.x(R.string.arg_res_0x7f1304d6), debugPageAndDialogFragment.y(R.string.arg_res_0x7f1303c8, debugPageAndDialogFragment.x(R.string.arg_res_0x7f130179)), new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initPdfConvertDebug$5$1$1
                                public final void invoke(boolean z242) {
                                }

                                @Override // cg.l
                                public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                                    invoke(bool.booleanValue());
                                    return tf.d.f30009a;
                                }
                            }).show();
                            return;
                        }
                        return;
                    case 1:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "zi45t67J"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuG25fbhJsOSBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUGLhdkDnQ6ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUhFhFmUVRDBiRmcKYwdpFGkGeQ==", "trgU5m8x"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.choose_refresh_has_data, (ViewGroup) iVar3.f965d, false);
                                        ((LinearLayout) inflate.findViewById(R.id.ll_refresh_has_data)).setVisibility(0);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            iVar4.f965d.setBackgroundColor(-16777216);
                                            am.i iVar5 = readerDebugActivity.f27845a;
                                            if (iVar5 != null) {
                                                iVar5.f965d.addView(inflate);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("L2kJZANuZw==", "HxMgjCTl"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "dLtUQDJs"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "PKaJvxIq"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "KbKat3rg"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("W2kLZAJuZw==", "VC9ekpLm"));
                            throw null;
                        }
                        return;
                    case 2:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "ioLV8GT2"));
                        j2 j2Var = new j2(view.getContext());
                        j2Var.c(0);
                        j2Var.f27638i = new t0(j2Var);
                        j2Var.show();
                        debugPageAndDialogFragment.f27863f0 = j2Var;
                        return;
                    default:
                        int i16 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "lUMjyN6I"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i17 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i17, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuAW5bbiFsFSA7eUFlWXBTZnRwLmYHZQlkUHJAdixlEmUcLhNkPXQWcmFmQ2UcLkJpdGYvYQF1GmUbZAtiMGdLUgthEmUmRBxiOmdwYw1pQWkueQ==", "pYxUnvTy"));
                            ((ReaderDebugActivity) i17).x1(false);
                            return;
                        }
                        return;
                }
            }
        });
        VB vb119 = this.Y;
        kotlin.jvm.internal.g.b(vb119);
        ((am.r0) vb119).f1392o.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.d0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugPageAndDialogFragment f27881b;

            {
                this.f27881b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = r2;
                DebugPageAndDialogFragment debugPageAndDialogFragment = this.f27881b;
                switch (i10) {
                    case 0:
                        int i11 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("TWgwc0gw", "Q69YlmFN"));
                        debugPageAndDialogFragment.n0(new Intent(debugPageAndDialogFragment.r(), AIChatActivity.class));
                        return;
                    case 1:
                        int i12 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "csFVbY0Q"));
                        r2 r2Var = new r2(view.getContext());
                        DebugPageAndDialogFragment.a listener = debugPageAndDialogFragment.f27862e0;
                        kotlin.jvm.internal.g.e(listener, "listener");
                        r2Var.f23542t = listener;
                        r2Var.show();
                        return;
                    case 2:
                        int i13 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("RWgBc34w", "dM1hZJ17"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i14 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i14, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuAW5ebidsAiBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUcLhZkO3QBch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUgthF2UgRAtiRmcKYwdpFGkGeQ==", "nsRnH0uU"));
                            ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) i14;
                            am.i iVar = readerDebugActivity.f27845a;
                            if (iVar != null) {
                                iVar.f965d.setVisibility(0);
                                am.i iVar2 = readerDebugActivity.f27845a;
                                if (iVar2 != null) {
                                    iVar2.f965d.removeAllViews();
                                    LayoutInflater from = LayoutInflater.from(readerDebugActivity);
                                    am.i iVar3 = readerDebugActivity.f27845a;
                                    if (iVar3 != null) {
                                        View inflate = from.inflate(R.layout.word2pdf_completed_layout, (ViewGroup) iVar3.f965d, false);
                                        ((ViewGroup) inflate.findViewById(R.id.ll_preview_word2pdf_completed_container)).setVisibility(0);
                                        BlurView blurView = (BlurView) readerDebugActivity.findViewById(R.id.blur_extract_success_bg);
                                        am.i iVar4 = readerDebugActivity.f27845a;
                                        if (iVar4 != null) {
                                            blurView.b(iVar4.f963a, new qe.g(readerDebugActivity)).f29293a = 3.52f;
                                            am.i iVar5 = readerDebugActivity.f27845a;
                                            if (iVar5 != null) {
                                                iVar5.f965d.setBackgroundColor(-16777216);
                                                am.i iVar6 = readerDebugActivity.f27845a;
                                                if (iVar6 != null) {
                                                    iVar6.f965d.addView(inflate);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "ycsWjsWC"));
                                                    throw null;
                                                }
                                            }
                                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "sh2fCjWb"));
                                            throw null;
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "PybZu43d"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "HNdWSSPM"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "RcyNQnTZ"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "d7YUNIl0"));
                            throw null;
                        }
                        return;
                    case 3:
                        int i15 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "sMSwH46l"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i16 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i16, ea.a.p("DXU6bGhjMW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAXeSZlaHA0ZmZwAmZGZTZkXXJ8diBlQWUGLhRkOHQtck1mJGUtLiVpZmYDYUB1JWUWZDdiPGcYUhFhFWUjRCdiFmcXYzxpJmk8eQ==", "QqcVHPYq"));
                            ReaderDebugActivity readerDebugActivity2 = (ReaderDebugActivity) i16;
                            am.i iVar7 = readerDebugActivity2.f27845a;
                            if (iVar7 != null) {
                                iVar7.f965d.setVisibility(0);
                                am.i iVar8 = readerDebugActivity2.f27845a;
                                if (iVar8 != null) {
                                    iVar8.f965d.removeAllViews();
                                    LayoutInflater from2 = LayoutInflater.from(readerDebugActivity2);
                                    am.i iVar9 = readerDebugActivity2.f27845a;
                                    if (iVar9 != null) {
                                        View inflate2 = from2.inflate(R.layout.debug_pdf2img_loading, (ViewGroup) iVar9.f965d, false);
                                        am.i iVar10 = readerDebugActivity2.f27845a;
                                        if (iVar10 != null) {
                                            iVar10.f965d.setBackgroundColor(-1);
                                            am.i iVar11 = readerDebugActivity2.f27845a;
                                            if (iVar11 != null) {
                                                iVar11.f965d.addView(inflate2);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "1AWGZMy3"));
                                                throw null;
                                            }
                                        }
                                        kotlin.jvm.internal.g.i(ea.a.p("E2lfZDhuZw==", "IXq1QlKP"));
                                        throw null;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "p18svtVF"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "X7RmtHSR"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "Ir2AxzyY"));
                            throw null;
                        }
                        return;
                    case 4:
                        int i17 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("O2hYc10w", "XXw8YOjL"));
                        Intent intent = new Intent(view.getContext(), ReaderHomeActivity.class);
                        intent.putExtra(ea.a.p("R28kbABfBXUbZGU=", "x03KozzN"), true);
                        debugPageAndDialogFragment.n0(intent);
                        return;
                    case 5:
                        int i18 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("R2gic1cw", "uFuW3Sl9"));
                        debugPageAndDialogFragment.n0(new Intent(view.getContext(), SettingStoragePermissionGuideActivity.class));
                        return;
                    default:
                        int i19 = DebugPageAndDialogFragment.f27860g0;
                        kotlin.jvm.internal.g.e(debugPageAndDialogFragment, ea.a.p("LWhRc1Yw", "HpY8rmM6"));
                        if (debugPageAndDialogFragment.i() instanceof ReaderDebugActivity) {
                            androidx.fragment.app.u i20 = debugPageAndDialogFragment.i();
                            kotlin.jvm.internal.g.c(i20, ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuPm5sbhtsPyBHeTtlU3AGZlxwUGYbZTdkIXIcdi9lNGUjLiRkB3Q8ch1mOWUWLhdpXGZRYR11JGVqZFdiM2dtUjRhJWUcRDZiRmcKYwdpFGkGeQ==", "QAnSbCAq"));
                            ReaderDebugActivity readerDebugActivity3 = (ReaderDebugActivity) i20;
                            am.i iVar12 = readerDebugActivity3.f27845a;
                            if (iVar12 != null) {
                                iVar12.f965d.setVisibility(0);
                                am.i iVar13 = readerDebugActivity3.f27845a;
                                if (iVar13 != null) {
                                    iVar13.f965d.removeAllViews();
                                    Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = new Pdf2WordConvertCompletedView(readerDebugActivity3);
                                    am.i iVar14 = readerDebugActivity3.f27845a;
                                    if (iVar14 != null) {
                                        iVar14.f965d.addView(pdf2WordConvertCompletedView, -1, -1);
                                        pdf2WordConvertCompletedView.setChildListener(new pdf.pdfreader.viewer.editor.free.ui.feature.debug.c(readerDebugActivity3));
                                        PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity();
                                        pdfPreviewEntity.setPath(ea.a.p("K2VTdR4vQ2UpdGVwFHRo", "GEJvesTZ"));
                                        pdfPreviewEntity.setName(ea.a.p("V2U6dVBfQmU7dDluVW1l", "WQ3X76MV"));
                                        pdf2WordConvertCompletedView.f("", pdfPreviewEntity);
                                        return;
                                    }
                                    kotlin.jvm.internal.g.i(ea.a.p("W2kJZD1uZw==", "Qq9gT4vr"));
                                    throw null;
                                }
                                kotlin.jvm.internal.g.i(ea.a.p("UWklZBpuZw==", "a25iPzy2"));
                                throw null;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("LWlfZBBuZw==", "izgOX4Ue"));
                            throw null;
                        }
                        return;
                }
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
