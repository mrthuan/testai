package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.widget.NestedScrollView;
import fn.c;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.ui.dialog.CommonFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.WidgetEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: DebugAppConfigFragment.kt */
/* loaded from: classes3.dex */
public final class DebugAppConfigFragment extends b<am.o0> {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f27856d0 = 0;

    public static void u0(DebugAppConfigFragment debugAppConfigFragment) {
        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "EkhiAFkF"));
        androidx.fragment.app.u i10 = debugAppConfigFragment.i();
        if (i10 != null) {
            String string = i10.getString(R.string.arg_res_0x7f130429);
            kotlin.jvm.internal.g.d(string, ea.a.p("EWMSaUdpLXlmZwN0Z3QlaVZnelJnc0JyHW4WLiNlNnIJXwBvXWw2dyFuAV9TcCMp", "p9pf1Yym"));
            String string2 = i10.getString(R.string.arg_res_0x7f13042a);
            kotlin.jvm.internal.g.d(string2, ea.a.p("D2MMaSJpAnlmZwN0Z3QlaVZnelJnc0JyHW4WLiNlNnIXXw9pMGcTdBdnE2lQZWYp", "HinxTvNW"));
            String string3 = i10.getString(R.string.arg_res_0x7f13042b, i10.getString(R.string.arg_res_0x7f130585), i10.getString(R.string.arg_res_0x7f13036c));
            kotlin.jvm.internal.g.d(string3, ea.a.p("LmNFaQ9pQ3l0Zy90JnQaaVtnRgplIEUgtYDWZRhkFXIQYUFwJm5WbT8pQCBVIEggFSBOKQ==", "B28WWpyp"));
            String format = String.format(ea.a.p("anM7JQoKEnM=", "cDWibWnU"), Arrays.copyOf(new Object[]{string, string2, string3}, 3));
            kotlin.jvm.internal.g.d(format, ea.a.p("KW9DbRh0H2Y1cidhASxIKlRyCXMp", "byNk8jmK"));
            SpannableString b10 = kl.e.b(format, new ForegroundColorSpan(androidx.core.content.a.getColor(i10, R.color.color_100_DD202A)));
            CommonFailedDialog commonFailedDialog = new CommonFailedDialog(i10, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$showErrDialog$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ tf.d invoke() {
                    invoke2();
                    return tf.d.f30009a;
                }
            });
            String string4 = i10.getString(R.string.arg_res_0x7f130033);
            kotlin.jvm.internal.g.d(string4, ea.a.p("UmM_aQVpFnlcZ1F0OnQkaSpnGlJoczdyMG4LLgBkE19EaS9nFnQ9ZhNpWGUNXzFwMCk=", "YlawLDc6"));
            commonFailedDialog.H(string4, b10);
            commonFailedDialog.show();
            tn.a.d(i10, ea.a.p("P2VDbRBzRGk1bg==", "KkQWiX8O"), ea.a.p("LHVFcwllRW0FZitpGV8baFp3", "GOiWcgGm"), WidgetEventCenter.f28683b, false);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final i2.a p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_debug_app_config, viewGroup, false);
        int i10 = R.id.adjust_ad_switch;
        CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.adjust_ad_switch);
        if (checkBox != null) {
            i10 = R.id.alwaysOCRTaskErrorCheck;
            CheckBox checkBox2 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.alwaysOCRTaskErrorCheck);
            if (checkBox2 != null) {
                i10 = R.id.alwaysOCRUploadImageErrorCheck;
                CheckBox checkBox3 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.alwaysOCRUploadImageErrorCheck);
                if (checkBox3 != null) {
                    i10 = R.id.always_show_img_to_pdf_red_dot;
                    CheckBox checkBox4 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_img_to_pdf_red_dot);
                    if (checkBox4 != null) {
                        i10 = R.id.always_show_img_to_pdf_select_guide_switch;
                        CheckBox checkBox5 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_img_to_pdf_select_guide_switch);
                        if (checkBox5 != null) {
                            i10 = R.id.alwaysShowLanguageRecallSwitch;
                            CheckBox checkBox6 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.alwaysShowLanguageRecallSwitch);
                            if (checkBox6 != null) {
                                i10 = R.id.always_show_preview_add_text_guide;
                                CheckBox checkBox7 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_preview_add_text_guide);
                                if (checkBox7 != null) {
                                    i10 = R.id.always_show_preview_edit_guide;
                                    CheckBox checkBox8 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_preview_edit_guide);
                                    if (checkBox8 != null) {
                                        i10 = R.id.always_show_preview_use_edit_guide;
                                        CheckBox checkBox9 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.always_show_preview_use_edit_guide);
                                        if (checkBox9 != null) {
                                            i10 = R.id.btn_ai_query_result_time_out;
                                            Button button = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_ai_query_result_time_out);
                                            if (button != null) {
                                                i10 = R.id.btn_free_save_count_ok;
                                                Button button2 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_free_save_count_ok);
                                                if (button2 != null) {
                                                    i10 = R.id.btn_ocr_free_count_ok;
                                                    Button button3 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_ocr_free_count_ok);
                                                    if (button3 != null) {
                                                        i10 = R.id.btn_old_user_edit_save;
                                                        Button button4 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_old_user_edit_save);
                                                        if (button4 != null) {
                                                            i10 = R.id.btn_pdf2word_zip_psw;
                                                            Button button5 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_pdf2word_zip_psw);
                                                            if (button5 != null) {
                                                                i10 = R.id.btn_pdf_create_time_ok;
                                                                Button button6 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_pdf_create_time_ok);
                                                                if (button6 != null) {
                                                                    i10 = R.id.btn_reset_ai_event;
                                                                    Button button7 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_reset_ai_event);
                                                                    if (button7 != null) {
                                                                        i10 = R.id.btn_save_ai_free_total_count;
                                                                        Button button8 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_save_ai_free_total_count);
                                                                        if (button8 != null) {
                                                                            i10 = R.id.btn_widget_add_failed_dialog;
                                                                            Button button9 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.btn_widget_add_failed_dialog);
                                                                            if (button9 != null) {
                                                                                i10 = R.id.buy_user_switch;
                                                                                CheckBox checkBox10 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.buy_user_switch);
                                                                                if (checkBox10 != null) {
                                                                                    i10 = R.id.cb_ai_big_file_upload_check;
                                                                                    CheckBox checkBox11 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_ai_big_file_upload_check);
                                                                                    if (checkBox11 != null) {
                                                                                        i10 = R.id.cb_ai_empty_answer;
                                                                                        CheckBox checkBox12 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_ai_empty_answer);
                                                                                        if (checkBox12 != null) {
                                                                                            i10 = R.id.cb_always_show_add_desktop;
                                                                                            CheckBox checkBox13 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_add_desktop);
                                                                                            if (checkBox13 != null) {
                                                                                                i10 = R.id.cb_always_show_more_page_manage_red_dot;
                                                                                                CheckBox checkBox14 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_more_page_manage_red_dot);
                                                                                                if (checkBox14 != null) {
                                                                                                    i10 = R.id.cb_always_show_pdf2img;
                                                                                                    CheckBox checkBox15 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_pdf2img);
                                                                                                    if (checkBox15 != null) {
                                                                                                        i10 = R.id.cb_always_show_pdf2word;
                                                                                                        CheckBox checkBox16 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_pdf2word);
                                                                                                        if (checkBox16 != null) {
                                                                                                            i10 = R.id.cb_always_show_pdf2word_guide;
                                                                                                            CheckBox checkBox17 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_pdf2word_guide);
                                                                                                            if (checkBox17 != null) {
                                                                                                                i10 = R.id.cb_always_show_pdf_create_edit_guide;
                                                                                                                CheckBox checkBox18 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_always_show_pdf_create_edit_guide);
                                                                                                                if (checkBox18 != null) {
                                                                                                                    i10 = R.id.cb_page_manager_drag_sort;
                                                                                                                    CheckBox checkBox19 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_page_manager_drag_sort);
                                                                                                                    if (checkBox19 != null) {
                                                                                                                        i10 = R.id.cb_page_manager_tap_jump;
                                                                                                                        CheckBox checkBox20 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_page_manager_tap_jump);
                                                                                                                        if (checkBox20 != null) {
                                                                                                                            i10 = R.id.cb_pdf_editor_guide_open;
                                                                                                                            CheckBox checkBox21 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_pdf_editor_guide_open);
                                                                                                                            if (checkBox21 != null) {
                                                                                                                                i10 = R.id.cb_pdf_editor_red_dot_open;
                                                                                                                                CheckBox checkBox22 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_pdf_editor_red_dot_open);
                                                                                                                                if (checkBox22 != null) {
                                                                                                                                    i10 = R.id.cb_set_convert_un_subscribe_area;
                                                                                                                                    CheckBox checkBox23 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_set_convert_un_subscribe_area);
                                                                                                                                    if (checkBox23 != null) {
                                                                                                                                        i10 = R.id.cbShowBootCompletedNotification;
                                                                                                                                        CheckBox checkBox24 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cbShowBootCompletedNotification);
                                                                                                                                        if (checkBox24 != null) {
                                                                                                                                            i10 = R.id.cb_show_home_select_guide;
                                                                                                                                            CheckBox checkBox25 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cb_show_home_select_guide);
                                                                                                                                            if (checkBox25 != null) {
                                                                                                                                                i10 = R.id.edit_ai_free_total_count;
                                                                                                                                                EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.edit_ai_free_total_count);
                                                                                                                                                if (editText != null) {
                                                                                                                                                    i10 = R.id.edit_ai_query_result_time_out;
                                                                                                                                                    EditText editText2 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.edit_ai_query_result_time_out);
                                                                                                                                                    if (editText2 != null) {
                                                                                                                                                        i10 = R.id.edit_free_save_count;
                                                                                                                                                        EditText editText3 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.edit_free_save_count);
                                                                                                                                                        if (editText3 != null) {
                                                                                                                                                            i10 = R.id.edit_ocr_free_count;
                                                                                                                                                            EditText editText4 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.edit_ocr_free_count);
                                                                                                                                                            if (editText4 != null) {
                                                                                                                                                                i10 = R.id.edit_pdf_create_time;
                                                                                                                                                                EditText editText5 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.edit_pdf_create_time);
                                                                                                                                                                if (editText5 != null) {
                                                                                                                                                                    i10 = R.id.editorPDFUndoRedoMaxStepBtn;
                                                                                                                                                                    Button button10 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.editorPDFUndoRedoMaxStepBtn);
                                                                                                                                                                    if (button10 != null) {
                                                                                                                                                                        i10 = R.id.editorPDFUndoRedoMaxStepEt;
                                                                                                                                                                        EditText editText6 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.editorPDFUndoRedoMaxStepEt);
                                                                                                                                                                        if (editText6 != null) {
                                                                                                                                                                            i10 = R.id.file_type_new_icon_switch;
                                                                                                                                                                            CheckBox checkBox26 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.file_type_new_icon_switch);
                                                                                                                                                                            if (checkBox26 != null) {
                                                                                                                                                                                i10 = R.id.gpAppReviewSwitch;
                                                                                                                                                                                CheckBox checkBox27 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.gpAppReviewSwitch);
                                                                                                                                                                                if (checkBox27 != null) {
                                                                                                                                                                                    i10 = R.id.home_upgrade_switch;
                                                                                                                                                                                    CheckBox checkBox28 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.home_upgrade_switch);
                                                                                                                                                                                    if (checkBox28 != null) {
                                                                                                                                                                                        i10 = R.id.language_choose_switch;
                                                                                                                                                                                        CheckBox checkBox29 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_choose_switch);
                                                                                                                                                                                        if (checkBox29 != null) {
                                                                                                                                                                                            i10 = R.id.language_choose_time_et;
                                                                                                                                                                                            EditText editText7 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_choose_time_et);
                                                                                                                                                                                            if (editText7 != null) {
                                                                                                                                                                                                i10 = R.id.language_choose_time_ok_btn;
                                                                                                                                                                                                Button button11 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.language_choose_time_ok_btn);
                                                                                                                                                                                                if (button11 != null) {
                                                                                                                                                                                                    i10 = R.id.languageRecallCountTimeBtn;
                                                                                                                                                                                                    Button button12 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallCountTimeBtn);
                                                                                                                                                                                                    if (button12 != null) {
                                                                                                                                                                                                        i10 = R.id.languageRecallCountTimeEt;
                                                                                                                                                                                                        EditText editText8 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallCountTimeEt);
                                                                                                                                                                                                        if (editText8 != null) {
                                                                                                                                                                                                            i10 = R.id.languageRecallDelayTimeBtn;
                                                                                                                                                                                                            Button button13 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallDelayTimeBtn);
                                                                                                                                                                                                            if (button13 != null) {
                                                                                                                                                                                                                i10 = R.id.languageRecallDelayTimeEt;
                                                                                                                                                                                                                EditText editText9 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallDelayTimeEt);
                                                                                                                                                                                                                if (editText9 != null) {
                                                                                                                                                                                                                    i10 = R.id.languageRecallFCMIntervalTimeBtn;
                                                                                                                                                                                                                    Button button14 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallFCMIntervalTimeBtn);
                                                                                                                                                                                                                    if (button14 != null) {
                                                                                                                                                                                                                        i10 = R.id.languageRecallFCMIntervalTimeEt;
                                                                                                                                                                                                                        EditText editText10 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallFCMIntervalTimeEt);
                                                                                                                                                                                                                        if (editText10 != null) {
                                                                                                                                                                                                                            i10 = R.id.languageRecallTextA;
                                                                                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextA)) != null) {
                                                                                                                                                                                                                                i10 = R.id.languageRecallTextB;
                                                                                                                                                                                                                                if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextB)) != null) {
                                                                                                                                                                                                                                    i10 = R.id.languageRecallTextC;
                                                                                                                                                                                                                                    if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextC)) != null) {
                                                                                                                                                                                                                                        i10 = R.id.languageRecallTextChange;
                                                                                                                                                                                                                                        RadioGroup radioGroup = (RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextChange);
                                                                                                                                                                                                                                        if (radioGroup != null) {
                                                                                                                                                                                                                                            i10 = R.id.languageRecallTextD;
                                                                                                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextD)) != null) {
                                                                                                                                                                                                                                                i10 = R.id.languageRecallTextE;
                                                                                                                                                                                                                                                if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.languageRecallTextE)) != null) {
                                                                                                                                                                                                                                                    i10 = R.id.memory_low_et;
                                                                                                                                                                                                                                                    EditText editText11 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.memory_low_et);
                                                                                                                                                                                                                                                    if (editText11 != null) {
                                                                                                                                                                                                                                                        i10 = R.id.memory_low_ok_btn;
                                                                                                                                                                                                                                                        Button button15 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.memory_low_ok_btn);
                                                                                                                                                                                                                                                        if (button15 != null) {
                                                                                                                                                                                                                                                            i10 = R.id.ocrWordBtn1;
                                                                                                                                                                                                                                                            Button button16 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrWordBtn1);
                                                                                                                                                                                                                                                            if (button16 != null) {
                                                                                                                                                                                                                                                                i10 = R.id.ocrWordBtn2;
                                                                                                                                                                                                                                                                Button button17 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrWordBtn2);
                                                                                                                                                                                                                                                                if (button17 != null) {
                                                                                                                                                                                                                                                                    i10 = R.id.ocrWordBtn3;
                                                                                                                                                                                                                                                                    Button button18 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrWordBtn3);
                                                                                                                                                                                                                                                                    if (button18 != null) {
                                                                                                                                                                                                                                                                        i10 = R.id.ocrWordEt;
                                                                                                                                                                                                                                                                        EditText editText12 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ocrWordEt);
                                                                                                                                                                                                                                                                        if (editText12 != null) {
                                                                                                                                                                                                                                                                            i10 = R.id.open_with_black_list_et;
                                                                                                                                                                                                                                                                            EditText editText13 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_with_black_list_et);
                                                                                                                                                                                                                                                                            if (editText13 != null) {
                                                                                                                                                                                                                                                                                i10 = R.id.open_with_black_list_ok_btn;
                                                                                                                                                                                                                                                                                Button button19 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.open_with_black_list_ok_btn);
                                                                                                                                                                                                                                                                                if (button19 != null) {
                                                                                                                                                                                                                                                                                    i10 = R.id.pdf_reflow_config_ok;
                                                                                                                                                                                                                                                                                    Button button20 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_reflow_config_ok);
                                                                                                                                                                                                                                                                                    if (button20 != null) {
                                                                                                                                                                                                                                                                                        i10 = R.id.pre_install_switch;
                                                                                                                                                                                                                                                                                        CheckBox checkBox30 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pre_install_switch);
                                                                                                                                                                                                                                                                                        if (checkBox30 != null) {
                                                                                                                                                                                                                                                                                            i10 = R.id.previewReflowBitmapMax;
                                                                                                                                                                                                                                                                                            EditText editText14 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewReflowBitmapMax);
                                                                                                                                                                                                                                                                                            if (editText14 != null) {
                                                                                                                                                                                                                                                                                                i10 = R.id.previewTextReflowMemory;
                                                                                                                                                                                                                                                                                                EditText editText15 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewTextReflowMemory);
                                                                                                                                                                                                                                                                                                if (editText15 != null) {
                                                                                                                                                                                                                                                                                                    i10 = R.id.previewTextReflowVersion;
                                                                                                                                                                                                                                                                                                    EditText editText16 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.previewTextReflowVersion);
                                                                                                                                                                                                                                                                                                    if (editText16 != null) {
                                                                                                                                                                                                                                                                                                        i10 = R.id.radioGroupImg2Pdf;
                                                                                                                                                                                                                                                                                                        if (((RadioGroup) com.google.android.play.core.assetpacks.c.u(inflate, R.id.radioGroupImg2Pdf)) != null) {
                                                                                                                                                                                                                                                                                                            i10 = R.id.rb1;
                                                                                                                                                                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rb1)) != null) {
                                                                                                                                                                                                                                                                                                                i10 = R.id.rb2;
                                                                                                                                                                                                                                                                                                                if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rb2)) != null) {
                                                                                                                                                                                                                                                                                                                    i10 = R.id.rb3;
                                                                                                                                                                                                                                                                                                                    if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rb3)) != null) {
                                                                                                                                                                                                                                                                                                                        i10 = R.id.rb4;
                                                                                                                                                                                                                                                                                                                        if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rb4)) != null) {
                                                                                                                                                                                                                                                                                                                            i10 = R.id.rb5;
                                                                                                                                                                                                                                                                                                                            if (((RadioButton) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rb5)) != null) {
                                                                                                                                                                                                                                                                                                                                i10 = R.id.resetLanguageFCMRecallBtn;
                                                                                                                                                                                                                                                                                                                                Button button21 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.resetLanguageFCMRecallBtn);
                                                                                                                                                                                                                                                                                                                                if (button21 != null) {
                                                                                                                                                                                                                                                                                                                                    i10 = R.id.reset_old_version_btn;
                                                                                                                                                                                                                                                                                                                                    Button button22 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.reset_old_version_btn);
                                                                                                                                                                                                                                                                                                                                    if (button22 != null) {
                                                                                                                                                                                                                                                                                                                                        i10 = R.id.reset_version_btn;
                                                                                                                                                                                                                                                                                                                                        Button button23 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.reset_version_btn);
                                                                                                                                                                                                                                                                                                                                        if (button23 != null) {
                                                                                                                                                                                                                                                                                                                                            i10 = R.id.reset_word2pdf_update_hint;
                                                                                                                                                                                                                                                                                                                                            Button button24 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.reset_word2pdf_update_hint);
                                                                                                                                                                                                                                                                                                                                            if (button24 != null) {
                                                                                                                                                                                                                                                                                                                                                i10 = R.id.setting_notification_switch;
                                                                                                                                                                                                                                                                                                                                                CheckBox checkBox31 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.setting_notification_switch);
                                                                                                                                                                                                                                                                                                                                                if (checkBox31 != null) {
                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.setting_upgrade_switch;
                                                                                                                                                                                                                                                                                                                                                    CheckBox checkBox32 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.setting_upgrade_switch);
                                                                                                                                                                                                                                                                                                                                                    if (checkBox32 != null) {
                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.showFilterGuideSwitch;
                                                                                                                                                                                                                                                                                                                                                        CheckBox checkBox33 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.showFilterGuideSwitch);
                                                                                                                                                                                                                                                                                                                                                        if (checkBox33 != null) {
                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.showOcrUpdateRedDot;
                                                                                                                                                                                                                                                                                                                                                            CheckBox checkBox34 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.showOcrUpdateRedDot);
                                                                                                                                                                                                                                                                                                                                                            if (checkBox34 != null) {
                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.skipInquiryPageLocalUserTypeBtn;
                                                                                                                                                                                                                                                                                                                                                                Button button25 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.skipInquiryPageLocalUserTypeBtn);
                                                                                                                                                                                                                                                                                                                                                                if (button25 != null) {
                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.skipInquiryPageLocalUserTypeEt;
                                                                                                                                                                                                                                                                                                                                                                    EditText editText17 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.skipInquiryPageLocalUserTypeEt);
                                                                                                                                                                                                                                                                                                                                                                    if (editText17 != null) {
                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.skipInquiryPageUserTypeBtn;
                                                                                                                                                                                                                                                                                                                                                                        Button button26 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.skipInquiryPageUserTypeBtn);
                                                                                                                                                                                                                                                                                                                                                                        if (button26 != null) {
                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.skipInquiryPageUserTypeEt;
                                                                                                                                                                                                                                                                                                                                                                            EditText editText18 = (EditText) com.google.android.play.core.assetpacks.c.u(inflate, R.id.skipInquiryPageUserTypeEt);
                                                                                                                                                                                                                                                                                                                                                                            if (editText18 != null) {
                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.skipOCRNetworkCheck;
                                                                                                                                                                                                                                                                                                                                                                                CheckBox checkBox35 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.skipOCRNetworkCheck);
                                                                                                                                                                                                                                                                                                                                                                                if (checkBox35 != null) {
                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.so_load_fail_btn;
                                                                                                                                                                                                                                                                                                                                                                                    Button button27 = (Button) com.google.android.play.core.assetpacks.c.u(inflate, R.id.so_load_fail_btn);
                                                                                                                                                                                                                                                                                                                                                                                    if (button27 != null) {
                                                                                                                                                                                                                                                                                                                                                                                        i10 = R.id.storage_scan_delay_switch;
                                                                                                                                                                                                                                                                                                                                                                                        CheckBox checkBox36 = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.storage_scan_delay_switch);
                                                                                                                                                                                                                                                                                                                                                                                        if (checkBox36 != null) {
                                                                                                                                                                                                                                                                                                                                                                                            i10 = R.id.tv_167_end;
                                                                                                                                                                                                                                                                                                                                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_167_end)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                i10 = R.id.tv_167_start;
                                                                                                                                                                                                                                                                                                                                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_167_start)) != null) {
                                                                                                                                                                                                                                                                                                                                                                                                    i10 = R.id.tv_ai_title;
                                                                                                                                                                                                                                                                                                                                                                                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_title);
                                                                                                                                                                                                                                                                                                                                                                                                    if (textView != null) {
                                                                                                                                                                                                                                                                                                                                                                                                        am.o0 o0Var = new am.o0((NestedScrollView) inflate, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, button, button2, button3, button4, button5, button6, button7, button8, button9, checkBox10, checkBox11, checkBox12, checkBox13, checkBox14, checkBox15, checkBox16, checkBox17, checkBox18, checkBox19, checkBox20, checkBox21, checkBox22, checkBox23, checkBox24, checkBox25, editText, editText2, editText3, editText4, editText5, button10, editText6, checkBox26, checkBox27, checkBox28, checkBox29, editText7, button11, button12, editText8, button13, editText9, button14, editText10, radioGroup, editText11, button15, button16, button17, button18, editText12, editText13, button19, button20, checkBox30, editText14, editText15, editText16, button21, button22, button23, button24, checkBox31, checkBox32, checkBox33, checkBox34, button25, editText17, button26, editText18, checkBox35, button27, checkBox36, textView);
                                                                                                                                                                                                                                                                                                                                                                                                        ea.a.p("Jm5XbBh0UigzbixsFHQNchkgDW8rdARpL2UmLGNmVWw8ZSk=", "VYgPATC4");
                                                                                                                                                                                                                                                                                                                                                                                                        return o0Var;
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
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpIWhSSQA6IA==", "wmVDUrDi").concat(inflate.getResources().getResourceName(i10)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    @SuppressLint({"SetTextI18n"})
    public final void r0() {
        int i10;
        RadioGroup radioGroup;
        final Context g02 = g0();
        ea.a.p("PmUBdRxyDEMnbhJlTHR_KQ==", "A7LpuiZR");
        VB vb2 = this.Y;
        kotlin.jvm.internal.g.b(vb2);
        zl.c.c.getClass();
        ((am.o0) vb2).I.setChecked(zl.c.f32425l);
        VB vb3 = this.Y;
        kotlin.jvm.internal.g.b(vb3);
        ((am.o0) vb3).I.setOnCheckedChangeListener(new o());
        VB vb4 = this.Y;
        kotlin.jvm.internal.g.b(vb4);
        ((am.o0) vb4).f1210d.setChecked(ReaderDebugActivity.f27842u);
        VB vb5 = this.Y;
        kotlin.jvm.internal.g.b(vb5);
        ((am.o0) vb5).f1210d.setOnCheckedChangeListener(new a0());
        VB vb6 = this.Y;
        kotlin.jvm.internal.g.b(vb6);
        ((am.o0) vb6).c.setChecked(ReaderDebugActivity.f27843v);
        VB vb7 = this.Y;
        kotlin.jvm.internal.g.b(vb7);
        ((am.o0) vb7).c.setOnCheckedChangeListener(new q());
        VB vb8 = this.Y;
        kotlin.jvm.internal.g.b(vb8);
        ((am.o0) vb8).C0.setChecked(ReaderDebugActivity.f27841t);
        VB vb9 = this.Y;
        kotlin.jvm.internal.g.b(vb9);
        ((am.o0) vb9).C0.setOnCheckedChangeListener(new s());
        pdf.pdfreader.viewer.editor.free.utils.c cVar = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
        String p10 = ea.a.p("K2VTdR5TXGkqSSRxAGkaeWVhCWUQcwByO3lGZSpvIWYmZw==", "VbD4o6iO");
        SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        int i11 = sharedPreferences.getInt(p10, -1);
        VB vb10 = this.Y;
        kotlin.jvm.internal.g.b(vb10);
        ((am.o0) vb10).f1255z0.setText(String.valueOf(i11));
        VB vb11 = this.Y;
        kotlin.jvm.internal.g.b(vb11);
        ((am.o0) vb11).f1253y0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.ui.adapter.j(3, this, g02));
        String a10 = pdf.pdfreader.viewer.editor.free.utils.c.a();
        VB vb12 = this.Y;
        kotlin.jvm.internal.g.b(vb12);
        ((am.o0) vb12).B0.setText(a10);
        VB vb13 = this.Y;
        kotlin.jvm.internal.g.b(vb13);
        ((am.o0) vb13).A0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27937b;

            {
                this.f27937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27937b;
                switch (i12) {
                    case 0:
                        int i13 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "RQRzJGGj"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "gKUlwd0G"));
                        try {
                            VB vb14 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb14);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6"), Long.parseLong(((am.o0) vb14).f1208b0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "mbwSpdzd"), 0).show();
                            return;
                        } catch (Exception unused) {
                            androidx.appcompat.view.menu.d.h("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 86400000L);
                            return;
                        }
                    case 1:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "aAfbezip"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("E2MhbgxlPHQ=", "Zi7NxDqI"));
                        try {
                            VB vb15 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb15);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("BmUUdV5fFGEmZxNhU2UIZkpvKGUnX0JpGWU=", "8Nbv9xnj"), Integer.parseInt(((am.o0) vb15).U.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("g7_g5tK5gIjY5eyf", "svgNFfqq"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 2:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("BWgqc00w", "pUqCiXF6"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "PNhdXnWn"));
                        try {
                            VB vb16 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb16);
                            int parseInt = Integer.parseInt(((am.o0) vb16).f1231n0.getText().toString());
                            SharedPreferences sharedPreferences2 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                            sharedPreferences2.edit().putInt(ea.a.p("FGUmdSpfOnItdg9lQ18lZV5sPXcWYl90GWEBXzxheA==", "uKpDMJnq"), parseInt).apply();
                            VB vb17 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb17);
                            sharedPreferences2.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vJ19YZTlvCnk=", "P5TxMrf3"), Integer.parseInt(((am.o0) vb17).f1233o0.getText().toString())).apply();
                            VB vb18 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb18);
                            sharedPreferences2.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vA19FZQFzB29u", "t3snSSvs"), Integer.parseInt(((am.o0) vb18).f1235p0.getText().toString())).apply();
                            int i16 = sharedPreferences2.getInt(ea.a.p("CWUtdVBfQXItdg9lQ18jZUB0DXIsZlpvA18HZSNzK29u", "wVmO716F"), 28);
                            int i17 = sharedPreferences2.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8cZU10MXIgZglvQ19cZQpvF3k=", "hBdN41ge"), 2);
                            int i18 = sharedPreferences2.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8aZVNsAXcaYgx0O2FGXyxheA==", "se2cV6Al"), 100000000);
                            j1.a(context, "最低版本:" + i16 + " 最小内存:" + i17 + " 最大位图:" + i18);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    default:
                        int i19 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "3ByiYmjb"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("YmMXbjllIXQ=", "RwFxMYHW"));
                        VB vb19 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb19);
                        String value = ((am.o0) vb19).B0.getText().toString();
                        pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                        kotlin.jvm.internal.g.e(value, "value");
                        pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5TXGkqSSRxAGkaeWVhCWUGbwtmM2c=", "PvzMZDRu"), value).apply();
                        Toast.makeText(context, ea.a.p("s7_n5vu5gYjY5eyf", "7NWIogyh"), 0).show();
                        return;
                }
            }
        });
        int i12 = sharedPreferences.getInt(ea.a.p("V2UpdRRfB2QbdFtyNnU4ZCtfQGUibxxtAng5cxVlcA==", "cfapBObp"), 512);
        VB vb14 = this.Y;
        kotlin.jvm.internal.g.b(vb14);
        ((am.o0) vb14).P.setText(String.valueOf(i12));
        VB vb15 = this.Y;
        kotlin.jvm.internal.g.b(vb15);
        ((am.o0) vb15).O.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27941b;

            {
                this.f27941b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27941b;
                switch (i13) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "b2cMCbWk"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "OjbL03xg"));
                        try {
                            VB vb16 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb16);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), Integer.parseInt(((am.o0) vb16).X.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "w5ENIrSf"), 0).show();
                            return;
                        } catch (Exception unused) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), 2).apply();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "zaotVEKT"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "VDlz3IX8"));
                        VB vb17 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb17);
                        String contentStr = ((am.o0) vb17).f1223j0.getText().toString();
                        if (!TextUtils.isEmpty(contentStr)) {
                            try {
                                pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                                kotlin.jvm.internal.g.e(contentStr, "contentStr");
                                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5fWHA_bhV3HHQAX1dsD2MuXwlpFHQ=", "23tFge13"), contentStr).apply();
                                j1.a(context, ea.a.p("IHBUbi5pQ2h6cy90VXMdY1ZlHXMjdWw=", "XFtDtRTm"));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        return;
                    default:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("DmhQc08w", "hMz9k8s1"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "ZcRF4ysS"));
                        try {
                            VB vb18 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb18);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), Integer.parseInt(((am.o0) vb18).P.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("07__5v65nojY5eyf", "kH7Qjxzu"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), 512).apply();
                            return;
                        }
                }
            }
        });
        VB vb16 = this.Y;
        kotlin.jvm.internal.g.b(vb16);
        ((am.o0) vb16).f1232o.setOnClickListener(new t(g02, 0));
        int d10 = pdf.pdfreader.viewer.editor.free.utils.q0.d(g02);
        int l10 = pdf.pdfreader.viewer.editor.free.utils.q0.l(g02, 0, "ai_chat_deplete_num_162");
        try {
            VB vb17 = this.Y;
            kotlin.jvm.internal.g.b(vb17);
            TextView textView = ((am.o0) vb17).F0;
            textView.setText("AI免费次数设置 (当前已使用次数" + l10 + ")");
            VB vb18 = this.Y;
            kotlin.jvm.internal.g.b(vb18);
            ((am.o0) vb18).J.setText(String.valueOf(d10));
        } catch (Exception unused) {
        }
        VB vb19 = this.Y;
        kotlin.jvm.internal.g.b(vb19);
        ((am.o0) vb19).f1238r.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27929b;

            {
                this.f27929b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r3;
                final Context context = g02;
                final DebugAppConfigFragment debugAppConfigFragment = this.f27929b;
                switch (i13) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "5OgvScOr"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "E7q920O6"));
                        try {
                            VB vb20 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb20);
                            String obj = ((am.o0) vb20).M.getText().toString();
                            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                            int parseInt = Integer.parseInt(obj);
                            billingConfigImpl.getClass();
                            BillingConfigImpl.B(parseInt);
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "1vC0vYa0"), 0).show();
                            return;
                        } catch (Exception unused2) {
                            Toast.makeText(context, ea.a.p("17_l5ue5h6TD6ICl", "HvRaKhjO"), 0).show();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "Gu45yG66"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "gd1zJydE"));
                        try {
                            VB vb21 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb21);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae"), Long.parseLong(((am.o0) vb21).Z.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "1KfA4iQU"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60L);
                            return;
                        }
                    case 2:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "StS50zaJ"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "SHqrtugM"));
                        VB vb22 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb22);
                        Editable text = ((am.o0) vb22).f1221i0.getText();
                        if (!TextUtils.isEmpty(text)) {
                            kl.a.a(context, text.toString(), new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$65$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    j1.a(context, debugAppConfigFragment.x(R.string.arg_res_0x7f13036a));
                                }
                            });
                            return;
                        }
                        return;
                    default:
                        int i17 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("QmhQc3Ew", "XK69UYHo"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "lMRvfA0s"));
                        try {
                            VB vb23 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb23);
                            pdf.pdfreader.viewer.editor.free.utils.q0.x(debugAppConfigFragment.r(), Integer.parseInt(((am.o0) vb23).J.getText().toString()), "ai_chat_free_msg_num_config_162");
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "vXESdoru"), 0).show();
                            return;
                        } catch (Exception unused4) {
                            Toast.makeText(context, ea.a.p("tL_G5ve5n6T56NKl", "HjPhczD3"), 0).show();
                            return;
                        }
                }
            }
        });
        VB vb20 = this.Y;
        kotlin.jvm.internal.g.b(vb20);
        ((am.o0) vb20).f1230n.setOnClickListener(new c0(g02, 1));
        VB vb21 = this.Y;
        kotlin.jvm.internal.g.b(vb21);
        ((am.o0) vb21).f1240s.setOnClickListener(new f5.e(this, 24));
        try {
            VB vb22 = this.Y;
            kotlin.jvm.internal.g.b(vb22);
            EditText editText = ((am.o0) vb22).L;
            fn.c.c.getClass();
            editText.setText(String.valueOf(c.a.b()));
        } catch (Exception unused2) {
        }
        VB vb23 = this.Y;
        kotlin.jvm.internal.g.b(vb23);
        ((am.o0) vb23).f1226l.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.u

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27926b;

            {
                this.f27926b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27926b;
                switch (i13) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("F2g5cxMw", "UQcP766X"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("cmMebhplTnQ=", "FbVqn64A"));
                        try {
                            VB vb24 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb24);
                            String obj = ((am.o0) vb24).L.getText().toString();
                            c.a aVar = fn.c.c;
                            int parseInt = Integer.parseInt(obj);
                            aVar.getClass();
                            fn.c.f17310d.c(c.a.f17315a[0], Integer.valueOf(parseInt));
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "b08cSfkv"), 0).show();
                            return;
                        } catch (Exception unused3) {
                            Toast.makeText(context, ea.a.p("q7-f5u250qTr6P6l", "T3spnv1N"), 0).show();
                            return;
                        }
                    default:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "tJQkudBV"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "aDbYEk6E"));
                        try {
                            VB vb25 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb25);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("MWUpdQFfVGUlbxR5a3M-emU=", "wUUKf9IC"), Integer.parseInt(((am.o0) vb25).f1211d0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("p66P58Su0YjK5cCf", "zKQgsMyg"), 0).show();
                            return;
                        } catch (Exception unused4) {
                            return;
                        }
                }
            }
        });
        try {
            VB vb24 = this.Y;
            kotlin.jvm.internal.g.b(vb24);
            EditText editText2 = ((am.o0) vb24).M;
            BillingConfigImpl.c.getClass();
            editText2.setText(String.valueOf(BillingConfigImpl.j()));
        } catch (Exception unused3) {
        }
        VB vb25 = this.Y;
        kotlin.jvm.internal.g.b(vb25);
        ((am.o0) vb25).f1228m.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27929b;

            {
                this.f27929b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = r3;
                final Context context = g02;
                final DebugAppConfigFragment debugAppConfigFragment = this.f27929b;
                switch (i13) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "5OgvScOr"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "E7q920O6"));
                        try {
                            VB vb202 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb202);
                            String obj = ((am.o0) vb202).M.getText().toString();
                            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                            int parseInt = Integer.parseInt(obj);
                            billingConfigImpl.getClass();
                            BillingConfigImpl.B(parseInt);
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "1vC0vYa0"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            Toast.makeText(context, ea.a.p("17_l5ue5h6TD6ICl", "HvRaKhjO"), 0).show();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "Gu45yG66"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "gd1zJydE"));
                        try {
                            VB vb212 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb212);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae"), Long.parseLong(((am.o0) vb212).Z.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "1KfA4iQU"), 0).show();
                            return;
                        } catch (Exception unused32) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60L);
                            return;
                        }
                    case 2:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "StS50zaJ"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "SHqrtugM"));
                        VB vb222 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb222);
                        Editable text = ((am.o0) vb222).f1221i0.getText();
                        if (!TextUtils.isEmpty(text)) {
                            kl.a.a(context, text.toString(), new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$65$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    j1.a(context, debugAppConfigFragment.x(R.string.arg_res_0x7f13036a));
                                }
                            });
                            return;
                        }
                        return;
                    default:
                        int i17 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("QmhQc3Ew", "XK69UYHo"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "lMRvfA0s"));
                        try {
                            VB vb232 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb232);
                            pdf.pdfreader.viewer.editor.free.utils.q0.x(debugAppConfigFragment.r(), Integer.parseInt(((am.o0) vb232).J.getText().toString()), "ai_chat_free_msg_num_config_162");
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "vXESdoru"), 0).show();
                            return;
                        } catch (Exception unused4) {
                            Toast.makeText(context, ea.a.p("tL_G5ve5n6T56NKl", "HjPhczD3"), 0).show();
                            return;
                        }
                }
            }
        });
        try {
            VB vb26 = this.Y;
            kotlin.jvm.internal.g.b(vb26);
            EditText editText3 = ((am.o0) vb26).N;
            wm.a.c.getClass();
            editText3.setText(String.valueOf(((Number) wm.a.f31374f.b(wm.a.f31372d[1])).longValue()));
        } catch (Exception unused4) {
        }
        VB vb27 = this.Y;
        kotlin.jvm.internal.g.b(vb27);
        ((am.o0) vb27).f1234p.setOnClickListener(new vm.g(4, this, g02));
        VB vb28 = this.Y;
        kotlin.jvm.internal.g.b(vb28);
        ((am.o0) vb28).f1236q.setOnClickListener(new c(g02, 1));
        VB vb29 = this.Y;
        kotlin.jvm.internal.g.b(vb29);
        ((am.o0) vb29).f1237q0.setOnClickListener(new w(g02, 0));
        String p11 = ea.a.p("K2VTdR5fUHAFYTpwKnINdlxlGV8mbwtmHWc=", "PbdetsOs");
        SharedPreferences sharedPreferences2 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        boolean z10 = sharedPreferences2.getBoolean(p11, true);
        VB vb30 = this.Y;
        kotlin.jvm.internal.g.b(vb30);
        String p12 = ea.a.p("LWlfZBBuUC49cAtwBVINdlxlGVMyaRFjaA==", "InJiAovh");
        CheckBox checkBox = ((am.o0) vb30).R;
        kotlin.jvm.internal.g.d(checkBox, p12);
        b.t0(z10, checkBox, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$17
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z11) {
                a6.h.j("V2UpdRRfBXAtYURwNnIzdi1lRV8lby1mXmc=", "793q5pCy", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z11);
            }
        });
        boolean z11 = pdf.pdfreader.viewer.editor.free.utils.q0.f28749g;
        VB vb31 = this.Y;
        kotlin.jvm.internal.g.b(vb31);
        String p13 = ea.a.p("UWklZBpuBS4RYnVsHmEvcxdoXXcWZCUyQm84ZA==", "5JkJEwHi");
        CheckBox checkBox2 = ((am.o0) vb31).f1254z;
        kotlin.jvm.internal.g.d(checkBox2, p13);
        b.t0(z11, checkBox2, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$18
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z12) {
                pdf.pdfreader.viewer.editor.free.utils.q0.f28749g = z12;
            }
        });
        boolean z12 = pdf.pdfreader.viewer.editor.free.utils.q0.f28750h;
        VB vb32 = this.Y;
        kotlin.jvm.internal.g.b(vb32);
        String p14 = ea.a.p("UWklZBpuBS4RYnVsHmEvcxdoXXcWZCUyIm1n", "KMpfP5pl");
        CheckBox checkBox3 = ((am.o0) vb32).f1252y;
        kotlin.jvm.internal.g.d(checkBox3, p14);
        b.t0(z12, checkBox3, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$19
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z13) {
                pdf.pdfreader.viewer.editor.free.utils.q0.f28750h = z13;
            }
        });
        boolean z13 = pdf.pdfreader.viewer.editor.free.utils.q0.f28751i;
        VB vb33 = this.Y;
        kotlin.jvm.internal.g.b(vb33);
        String p15 = ea.a.p("UWklZBpuBS4RYnVsHmEvcxdoXXcHZCdEAHMKdCdw", "eaHHtgvz");
        CheckBox checkBox4 = ((am.o0) vb33).f1248w;
        kotlin.jvm.internal.g.d(checkBox4, p15);
        b.t0(z13, checkBox4, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$20
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z14) {
                pdf.pdfreader.viewer.editor.free.utils.q0.f28751i = z14;
            }
        });
        jn.a.c.getClass();
        boolean z14 = jn.a.f19336q;
        VB vb34 = this.Y;
        kotlin.jvm.internal.g.b(vb34);
        String p16 = ea.a.p("UWklZBpuBS4BaFt3L2k6dCFydXUvZCZTQmk8Y2g=", "5HddHNLI");
        CheckBox checkBox5 = ((am.o0) vb34).f1249w0;
        kotlin.jvm.internal.g.d(checkBox5, p16);
        b.t0(z14, checkBox5, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$21
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z15) {
                jn.a.c.getClass();
                jn.a.f19336q = z15;
            }
        });
        boolean z15 = ReaderDebugActivity.f27837p;
        VB vb35 = this.Y;
        kotlin.jvm.internal.g.b(vb35);
        String p17 = ea.a.p("UWklZBpuBS4BaFt3JmMkVTRkU3QjUiZkD290", "KxgO3aNr");
        CheckBox checkBox6 = ((am.o0) vb35).f1251x0;
        kotlin.jvm.internal.g.d(checkBox6, p17);
        b.t0(z15, checkBox6, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$22
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z16) {
                boolean z17 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27837p = z16;
            }
        });
        boolean z16 = pdf.pdfreader.viewer.editor.free.utils.c.c;
        VB vb36 = this.Y;
        kotlin.jvm.internal.g.b(vb36);
        String p18 = ea.a.p("LWlfZBBuUC45YgtpMG0YdExBAHMyZXI=", "1KjiIbp2");
        CheckBox checkBox7 = ((am.o0) vb36).f1246v;
        kotlin.jvm.internal.g.d(checkBox7, p18);
        b.t0(z16, checkBox7, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$23
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z17) {
                pdf.pdfreader.viewer.editor.free.utils.c.c = z17;
            }
        });
        long j10 = sharedPreferences2.getLong(ea.a.p("MWUkdV5fHmEmZxNhU2UIcl1jM2wlX1BjGV8YbiVlMHY0bBljVm4UaWc=", "AjUF9rbw"), 86400000L);
        VB vb37 = this.Y;
        kotlin.jvm.internal.g.b(vb37);
        ((am.o0) vb37).f1208b0.setText(String.valueOf(j10));
        VB vb38 = this.Y;
        kotlin.jvm.internal.g.b(vb38);
        ((am.o0) vb38).f1206a0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27937b;

            {
                this.f27937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27937b;
                switch (i122) {
                    case 0:
                        int i13 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "RQRzJGGj"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "gKUlwd0G"));
                        try {
                            VB vb142 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb142);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6"), Long.parseLong(((am.o0) vb142).f1208b0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "mbwSpdzd"), 0).show();
                            return;
                        } catch (Exception unused5) {
                            androidx.appcompat.view.menu.d.h("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 86400000L);
                            return;
                        }
                    case 1:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "aAfbezip"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("E2MhbgxlPHQ=", "Zi7NxDqI"));
                        try {
                            VB vb152 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb152);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("BmUUdV5fFGEmZxNhU2UIZkpvKGUnX0JpGWU=", "8Nbv9xnj"), Integer.parseInt(((am.o0) vb152).U.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("g7_g5tK5gIjY5eyf", "svgNFfqq"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 2:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("BWgqc00w", "pUqCiXF6"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "PNhdXnWn"));
                        try {
                            VB vb162 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            int parseInt = Integer.parseInt(((am.o0) vb162).f1231n0.getText().toString());
                            SharedPreferences sharedPreferences22 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                            sharedPreferences22.edit().putInt(ea.a.p("FGUmdSpfOnItdg9lQ18lZV5sPXcWYl90GWEBXzxheA==", "uKpDMJnq"), parseInt).apply();
                            VB vb172 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb172);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vJ19YZTlvCnk=", "P5TxMrf3"), Integer.parseInt(((am.o0) vb172).f1233o0.getText().toString())).apply();
                            VB vb182 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vA19FZQFzB29u", "t3snSSvs"), Integer.parseInt(((am.o0) vb182).f1235p0.getText().toString())).apply();
                            int i16 = sharedPreferences22.getInt(ea.a.p("CWUtdVBfQXItdg9lQ18jZUB0DXIsZlpvA18HZSNzK29u", "wVmO716F"), 28);
                            int i17 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8cZU10MXIgZglvQ19cZQpvF3k=", "hBdN41ge"), 2);
                            int i18 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8aZVNsAXcaYgx0O2FGXyxheA==", "se2cV6Al"), 100000000);
                            j1.a(context, "最低版本:" + i16 + " 最小内存:" + i17 + " 最大位图:" + i18);
                            return;
                        } catch (Exception unused32) {
                            return;
                        }
                    default:
                        int i19 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "3ByiYmjb"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("YmMXbjllIXQ=", "RwFxMYHW"));
                        VB vb192 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb192);
                        String value = ((am.o0) vb192).B0.getText().toString();
                        pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                        kotlin.jvm.internal.g.e(value, "value");
                        pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5TXGkqSSRxAGkaeWVhCWUGbwtmM2c=", "PvzMZDRu"), value).apply();
                        Toast.makeText(context, ea.a.p("s7_n5vu5gYjY5eyf", "7NWIogyh"), 0).show();
                        return;
                }
            }
        });
        int i13 = sharedPreferences2.getInt(ea.a.p("C2UTdVNfAWEmZxNhU2UIcl1jM2wlX1VvAW4FXzJvLGYGZw==", "iQoq4mh8"), 2);
        VB vb39 = this.Y;
        kotlin.jvm.internal.g.b(vb39);
        ((am.o0) vb39).X.setText(String.valueOf(i13));
        VB vb40 = this.Y;
        kotlin.jvm.internal.g.b(vb40);
        ((am.o0) vb40).W.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27941b;

            {
                this.f27941b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27941b;
                switch (i132) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "b2cMCbWk"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "OjbL03xg"));
                        try {
                            VB vb162 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), Integer.parseInt(((am.o0) vb162).X.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "w5ENIrSf"), 0).show();
                            return;
                        } catch (Exception unused5) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), 2).apply();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "zaotVEKT"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "VDlz3IX8"));
                        VB vb172 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb172);
                        String contentStr = ((am.o0) vb172).f1223j0.getText().toString();
                        if (!TextUtils.isEmpty(contentStr)) {
                            try {
                                pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                                kotlin.jvm.internal.g.e(contentStr, "contentStr");
                                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5fWHA_bhV3HHQAX1dsD2MuXwlpFHQ=", "23tFge13"), contentStr).apply();
                                j1.a(context, ea.a.p("IHBUbi5pQ2h6cy90VXMdY1ZlHXMjdWw=", "XFtDtRTm"));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        return;
                    default:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("DmhQc08w", "hMz9k8s1"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "ZcRF4ysS"));
                        try {
                            VB vb182 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), Integer.parseInt(((am.o0) vb182).P.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("07__5v65nojY5eyf", "kH7Qjxzu"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), 512).apply();
                            return;
                        }
                }
            }
        });
        String b10 = pdf.pdfreader.viewer.editor.free.utils.c.b();
        VB vb41 = this.Y;
        kotlin.jvm.internal.g.b(vb41);
        am.o0 o0Var = (am.o0) vb41;
        switch (b10.hashCode()) {
            case 65:
                if (b10.equals(ea.a.p("QQ==", "1bUEnrFl"))) {
                    i10 = R.id.languageRecallTextA;
                    break;
                }
                i10 = R.id.languageRecallTextE;
                break;
            case 66:
                if (b10.equals(ea.a.p("Qg==", "YPlxeS2r"))) {
                    i10 = R.id.languageRecallTextB;
                    break;
                }
                i10 = R.id.languageRecallTextE;
                break;
            case 67:
                if (b10.equals(ea.a.p("Qw==", "vd665PO8"))) {
                    i10 = R.id.languageRecallTextC;
                    break;
                }
                i10 = R.id.languageRecallTextE;
                break;
            case 68:
                if (b10.equals(ea.a.p("RA==", "a8r3JAeZ"))) {
                    i10 = R.id.languageRecallTextD;
                    break;
                }
                i10 = R.id.languageRecallTextE;
                break;
            default:
                i10 = R.id.languageRecallTextE;
                break;
        }
        o0Var.f1209c0.check(i10);
        VB vb42 = this.Y;
        kotlin.jvm.internal.g.b(vb42);
        ((am.o0) vb42).f1209c0.setOnCheckedChangeListener(new z());
        long j11 = sharedPreferences2.getLong(ea.a.p("VWUMdVVfHWEmZxNhU2UIcl1jM2wlX1BpBnMFXzVlLmFIXxppX2U=", "DM1n2qr9"), 60L);
        VB vb43 = this.Y;
        kotlin.jvm.internal.g.b(vb43);
        ((am.o0) vb43).Z.setText(String.valueOf(j11));
        VB vb44 = this.Y;
        kotlin.jvm.internal.g.b(vb44);
        ((am.o0) vb44).Y.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27929b;

            {
                this.f27929b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = r3;
                final Context context = g02;
                final DebugAppConfigFragment debugAppConfigFragment = this.f27929b;
                switch (i132) {
                    case 0:
                        int i14 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "5OgvScOr"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "E7q920O6"));
                        try {
                            VB vb202 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb202);
                            String obj = ((am.o0) vb202).M.getText().toString();
                            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                            int parseInt = Integer.parseInt(obj);
                            billingConfigImpl.getClass();
                            BillingConfigImpl.B(parseInt);
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "1vC0vYa0"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            Toast.makeText(context, ea.a.p("17_l5ue5h6TD6ICl", "HvRaKhjO"), 0).show();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "Gu45yG66"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "gd1zJydE"));
                        try {
                            VB vb212 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb212);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae"), Long.parseLong(((am.o0) vb212).Z.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "1KfA4iQU"), 0).show();
                            return;
                        } catch (Exception unused32) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60L);
                            return;
                        }
                    case 2:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "StS50zaJ"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "SHqrtugM"));
                        VB vb222 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb222);
                        Editable text = ((am.o0) vb222).f1221i0.getText();
                        if (!TextUtils.isEmpty(text)) {
                            kl.a.a(context, text.toString(), new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$65$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    j1.a(context, debugAppConfigFragment.x(R.string.arg_res_0x7f13036a));
                                }
                            });
                            return;
                        }
                        return;
                    default:
                        int i17 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("QmhQc3Ew", "XK69UYHo"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "lMRvfA0s"));
                        try {
                            VB vb232 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb232);
                            pdf.pdfreader.viewer.editor.free.utils.q0.x(debugAppConfigFragment.r(), Integer.parseInt(((am.o0) vb232).J.getText().toString()), "ai_chat_free_msg_num_config_162");
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "vXESdoru"), 0).show();
                            return;
                        } catch (Exception unused42) {
                            Toast.makeText(context, ea.a.p("tL_G5ve5n6T56NKl", "HjPhczD3"), 0).show();
                            return;
                        }
                }
            }
        });
        VB vb45 = this.Y;
        kotlin.jvm.internal.g.b(vb45);
        ((am.o0) vb45).K.setText(String.valueOf(sharedPreferences2.getLong(ea.a.p("EmUQdQlfMGkXcRNlRnkIcl1zJ2w9X0JpGWUedXQ=", "qwvrnQ4U"), 120L)));
        VB vb46 = this.Y;
        kotlin.jvm.internal.g.b(vb46);
        ((am.o0) vb46).f1224k.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.e(4, this, g02));
        boolean z17 = sharedPreferences2.getBoolean(ea.a.p("UGUqdS5fVGEmZxNhU2UIcl1jM2wlX1dsA2EIcw5zKm93", "ZN4HI8pL"), true);
        VB vb47 = this.Y;
        kotlin.jvm.internal.g.b(vb47);
        String p19 = ea.a.p("LWlfZBBuUC47bD1hDHM7aFp3ImErZxBhMmU3ZRphOGwcd1h0Gmg=", "VleEUeyT");
        CheckBox checkBox8 = ((am.o0) vb47).f1216g;
        kotlin.jvm.internal.g.d(checkBox8, p19);
        b.t0(z17, checkBox8, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$29
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z18) {
                a6.h.j("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyJsJGEscxJzLW93", "SUMENdhb", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z18);
            }
        });
        boolean z18 = sharedPreferences2.getBoolean(ea.a.p("UGUqdS5fVGEmZxNhU2UIcl1jM2wlX1dsA2EIcw5zKm93", "ZN4HI8pL"), true);
        VB vb48 = this.Y;
        kotlin.jvm.internal.g.b(vb48);
        String p20 = ea.a.p("JWlXZCduIC4pbBFhTXMEaFd3HmEnZ0NhE2UjZTJhLmwUd1B0LWg=", "GsG9NGhX");
        CheckBox checkBox9 = ((am.o0) vb48).f1216g;
        kotlin.jvm.internal.g.d(checkBox9, p20);
        b.t0(z18, checkBox9, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$30
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z19) {
                a6.h.j("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyJsJGEscxJzLW93", "SUMENdhb", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z19);
            }
        });
        boolean z19 = sharedPreferences2.getBoolean(ea.a.p("IWVGXw15R2UFZiNsEF8BY1puMTFxOA==", "FeoKWCQw"), true);
        VB vb49 = this.Y;
        kotlin.jvm.internal.g.b(vb49);
        String p21 = ea.a.p("LWlfZBBuUC48aSZlIXkYZXtlGUkmbwtTGGkOY2g=", "DBLoozVX");
        CheckBox checkBox10 = ((am.o0) vb49).Q;
        kotlin.jvm.internal.g.d(checkBox10, p21);
        b.t0(z19, checkBox10, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$31
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z20) {
                a6.h.j("IWVGXw15R2UFZiNsEF8BY1puMTFxOA==", "k6EeXjZY", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z20);
            }
        });
        boolean z20 = sharedPreferences2.getBoolean(ea.a.p("LWUEdRZfOWU8dA9uU185b0xpNGkqYUJpG24ucyZpNmNo", "ILIfqJCq"), true);
        VB vb50 = this.Y;
        kotlin.jvm.internal.g.b(vb50);
        String p22 = ea.a.p("UWklZBpuBS4BZUB0AG4xTit0W2YvYyJ0Pm8dUxxpRGNo", "Wsk0zJZi");
        CheckBox checkBox11 = ((am.o0) vb50).f1245u0;
        kotlin.jvm.internal.g.d(checkBox11, p22);
        b.t0(z20, checkBox11, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$32
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z21) {
                a6.h.j("K2VTdR5fRGUudCNuEl8Gb0FpCGkmYRFpK246cwBpMmNo", "AbnoDewF", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z21);
            }
        });
        boolean z21 = sharedPreferences2.getBoolean(ea.a.p("C2UgdSVfBW8lZTl1RGclYVxlDXM-aUJjHF9ANDE=", "KtoBBm9N"), true);
        VB vb51 = this.Y;
        kotlin.jvm.internal.g.b(vb51);
        String p23 = ea.a.p("VWkiZAVuLy4gbwtlYXAwcllkN1M-aUJjaA==", "Ai7LlHRI");
        CheckBox checkBox12 = ((am.o0) vb51).S;
        kotlin.jvm.internal.g.d(checkBox12, p23);
        b.t0(z21, checkBox12, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$33
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z22) {
                a6.h.j("K2VTdR5fX283ZRV1BWcaYVFlMXMyaRFjEV92NDE=", "e3lfyGAL", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z22);
            }
        });
        boolean z22 = sharedPreferences2.getBoolean(ea.a.p("K2VTdR5fRGUudCNuEl8dcFJyD2QgXxZ3BXQKaGsxBTE=", "VvKhli41"), true);
        VB vb52 = this.Y;
        kotlin.jvm.internal.g.b(vb52);
        String p24 = ea.a.p("IWkWZC5uLC47ZRJ0XW4wVUhnIGEtZWV3HXQSaA==", "69CxGK7D");
        CheckBox checkBox13 = ((am.o0) vb52).f1247v0;
        kotlin.jvm.internal.g.d(checkBox13, p24);
        b.t0(z22, checkBox13, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$34
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z23) {
                a6.h.j("U2UbdVRfHGU8dA9uU18icF9yM2QsX0V3HXQSaA4xdjE=", "kR7y3okK", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z23);
            }
        });
        no.f b11 = no.f.b(g0());
        Context g03 = g0();
        b11.getClass();
        boolean d11 = no.f.d(g03);
        VB vb53 = this.Y;
        kotlin.jvm.internal.g.b(vb53);
        String p25 = ea.a.p("UWklZBpuBS4QdU1VGmUkUzNpRmNo", "KVy2q0Iq");
        CheckBox checkBox14 = ((am.o0) vb53).f1242t;
        kotlin.jvm.internal.g.d(checkBox14, p25);
        b.t0(d11, checkBox14, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$35
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z23) {
                no.f b12 = no.f.b(DebugAppConfigFragment.this.g0());
                Context g04 = DebugAppConfigFragment.this.g0();
                b12.getClass();
                pdf.pdfreader.viewer.editor.free.utils.d1.b(g04).c(no.f.f22621l, z23);
            }
        });
        boolean z23 = sharedPreferences2.getBoolean(ea.a.p("HGUTdSZfFmQidRV0a2EzX0t3O3QqaA==", "9AxqAwxP"), true);
        VB vb54 = this.Y;
        kotlin.jvm.internal.g.b(vb54);
        String p26 = ea.a.p("UWklZBpuBS4TZF51GnQXZBd3W3QlaA==", "bGYsXoI5");
        CheckBox checkBox15 = ((am.o0) vb54).f1207b;
        kotlin.jvm.internal.g.d(checkBox15, p26);
        b.t0(z23, checkBox15, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$36
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z24) {
                a6.h.j("CWUNdRZfI2QidRV0a2EzX0t3O3QqaA==", "2MmoqBpf", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z24);
            }
        });
        boolean z24 = sharedPreferences2.getBoolean(ea.a.p("V2UpdRRfEnIXX11uGnQ3bChfR3Mjcg==", "YVLUs5vX"), true);
        VB vb55 = this.Y;
        kotlin.jvm.internal.g.b(vb55);
        String p27 = ea.a.p("LWkUZBhuES44cgNJWnMjYVRsAXcgdFVo", "eFOzqvBQ");
        CheckBox checkBox16 = ((am.o0) vb55).f1229m0;
        kotlin.jvm.internal.g.d(checkBox16, p27);
        b.t0(z24, checkBox16, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$37
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z25) {
                a6.h.j("IGUgdTVfA3ItXw9uR3Q2bFRfJ3Mscg==", "LkDBRscH", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z25);
            }
        });
        boolean z25 = sharedPreferences2.getBoolean(ea.a.p("JnNuZBxiQmcFYT1hDF8baFpfB20iXxFvGXATZh5zEGwqY0VfHnVeZGU=", "TiPtFwAu"), false);
        VB vb56 = this.Y;
        kotlin.jvm.internal.g.b(vb56);
        String p28 = ea.a.p("N2lfZFpuXi4pbBFhTXMEaFd3G20uVFlQEGYiZT1lIXQSdVhkVlNOaTxjaA==", "N7U139ln");
        CheckBox checkBox17 = ((am.o0) vb56).f1214f;
        kotlin.jvm.internal.g.d(checkBox17, p28);
        b.t0(z25, checkBox17, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$38
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z26) {
                a6.h.j("GHMcZCpiO2cXYRFhTV8kaFdfO20uX0JvK3AVZg5zJ2wUYzdfKHUnZGU=", "GTqCONkb", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z26);
            }
        });
        boolean f10 = pdf.pdfreader.viewer.editor.free.utils.q0.f(g0(), "is_always_show_img2pdf_red_dot", false);
        VB vb57 = this.Y;
        kotlin.jvm.internal.g.b(vb57);
        String p29 = ea.a.p("UWklZBpuBS4TbENhEHMFaCt3e20hVCxQB2YbZRBEX3Q=", "cIt0UzPB");
        CheckBox checkBox18 = ((am.o0) vb57).f1212e;
        kotlin.jvm.internal.g.d(checkBox18, p29);
        b.t0(f10, checkBox18, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$39
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z26) {
                pdf.pdfreader.viewer.editor.free.utils.q0.w(DebugAppConfigFragment.this.g0(), "is_always_show_img2pdf_red_dot", z26);
            }
        });
        wm.a.c.getClass();
        boolean z26 = wm.a.f31375g;
        VB vb58 = this.Y;
        kotlin.jvm.internal.g.b(vb58);
        String p30 = ea.a.p("UWklZBpuBS4RYnVsHmEvcxdoXXcWZCUyI28DZCZ1O2Rl", "TqaRbJ2i");
        CheckBox checkBox19 = ((am.o0) vb58).A;
        kotlin.jvm.internal.g.d(checkBox19, p30);
        b.t0(z26, checkBox19, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$40
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z27) {
                wm.a.c.getClass();
                wm.a.f31375g = z27;
            }
        });
        boolean z27 = wm.a.f31376h;
        VB vb59 = this.Y;
        kotlin.jvm.internal.g.b(vb59);
        String p31 = ea.a.p("UWklZBpuBS4RYnVsHmEvcxdoXXcWZCVDImU1dAhFNmlHRz5pF2U=", "PTmR4jQ0");
        CheckBox checkBox20 = ((am.o0) vb59).B;
        kotlin.jvm.internal.g.d(checkBox20, p31);
        b.t0(z27, checkBox20, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$41
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z28) {
                wm.a.c.getClass();
                wm.a.f31376h = z28;
            }
        });
        boolean z28 = wm.a.f31377i;
        VB vb60 = this.Y;
        kotlin.jvm.internal.g.b(vb60);
        String p32 = ea.a.p("LWlfZBBuUC45YgtsAmERc2ZoAXcIbxdlHGEfZSFhL2EoZWNlHURYdA==", "Cd3vLxlA");
        CheckBox checkBox21 = ((am.o0) vb60).f1250x;
        kotlin.jvm.internal.g.d(checkBox21, p32);
        b.t0(z28, checkBox21, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$42
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z29) {
                wm.a.c.getClass();
                wm.a.f31377i = z29;
            }
        });
        boolean z29 = lm.e.f21773a;
        VB vb61 = this.Y;
        kotlin.jvm.internal.g.b(vb61);
        String p33 = ea.a.p("UWklZBpuBS4RYnVpK2kxRi1sV1U2bCxhFEMYZTVr", "ppV5D2uB");
        CheckBox checkBox22 = ((am.o0) vb61).f1244u;
        kotlin.jvm.internal.g.d(checkBox22, p33);
        b.t0(z29, checkBox22, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$43
            public final void invoke(boolean z30) {
                lm.e.f21773a = z30;
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        VB vb62 = this.Y;
        kotlin.jvm.internal.g.b(vb62);
        String p34 = ea.a.p("LWlfZBBuUC45YhllAUMHbkNlHHQQbjZ1NnNVcj1iLEE9ZWE=", "2VghT6TI");
        CheckBox checkBox23 = ((am.o0) vb62).G;
        kotlin.jvm.internal.g.d(checkBox23, p34);
        b.t0(false, checkBox23, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$44
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z30) {
                if (z30) {
                    BillingConfigImpl.c.getClass();
                    Boolean bool = Boolean.FALSE;
                    BillingConfigImpl.H = bool;
                    BillingConfigImpl.L = bool;
                    BillingConfigImpl.J = bool;
                    BillingConfigImpl.R = bool;
                    BillingConfigImpl.f24867u = false;
                    return;
                }
                BillingConfigImpl.c.getClass();
                BillingConfigImpl.H = null;
                BillingConfigImpl.L = null;
                BillingConfigImpl.J = null;
                BillingConfigImpl.R = null;
                BillingConfigImpl.f24867u = true;
            }
        });
        fn.c.c.getClass();
        boolean z30 = fn.c.f17311e;
        VB vb63 = this.Y;
        kotlin.jvm.internal.g.b(vb63);
        String p35 = ea.a.p("LWlfZBBuUC45YhpkE0UMaUFvHEcwaQFld3A9bg==", "BQPE8XsB");
        CheckBox checkBox24 = ((am.o0) vb63).E;
        kotlin.jvm.internal.g.d(checkBox24, p35);
        b.t0(z30, checkBox24, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$45
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z31) {
                fn.c.c.getClass();
                fn.c.f17311e = z31;
            }
        });
        boolean z31 = fn.c.f17312f;
        VB vb64 = this.Y;
        kotlin.jvm.internal.g.b(vb64);
        String p36 = ea.a.p("UWklZBpuBS4RYmRkD0UyaTBvQFIjZAdvBk8RZW4=", "raa7KQGH");
        CheckBox checkBox25 = ((am.o0) vb64).F;
        kotlin.jvm.internal.g.d(checkBox25, p36);
        b.t0(z31, checkBox25, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$46
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z32) {
                fn.c.c.getClass();
                fn.c.f17312f = z32;
            }
        });
        boolean z32 = ReaderDebugActivity.f27835n;
        VB vb65 = this.Y;
        kotlin.jvm.internal.g.b(vb65);
        String p37 = ea.a.p("LWlfZBBuUC47bD1hDHM7aFp3PnIgdgxlGkUvaQ5HB2krZQ==", "EKxXmKzr");
        CheckBox checkBox26 = ((am.o0) vb65).f1220i;
        kotlin.jvm.internal.g.d(checkBox26, p37);
        b.t0(z32, checkBox26, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$47
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z33) {
                boolean z34 = ReaderDebugActivity.f27826e;
                ReaderDebugActivity.f27835n = z33;
            }
        });
        boolean z33 = fn.c.f17313g;
        VB vb66 = this.Y;
        kotlin.jvm.internal.g.b(vb66);
        String p38 = ea.a.p("UWklZBpuBS4TbENhEHMFaCt3YnIjdiplFFUmZRVkBnR0dSJkZQ==", "cUPoDvUa");
        CheckBox checkBox27 = ((am.o0) vb66).f1222j;
        kotlin.jvm.internal.g.d(checkBox27, p38);
        b.t0(z33, checkBox27, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$48
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z34) {
                fn.c.c.getClass();
                fn.c.f17313g = z34;
            }
        });
        boolean z34 = fn.c.f17314h;
        VB vb67 = this.Y;
        kotlin.jvm.internal.g.b(vb67);
        String p39 = ea.a.p("LWlfZBBuUC47bD1hDHM7aFp3PnIgdgxlBEEiZBJlQHQIdVhkZQ==", "b8OzsFF8");
        CheckBox checkBox28 = ((am.o0) vb67).f1218h;
        kotlin.jvm.internal.g.d(checkBox28, p39);
        b.t0(z34, checkBox28, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$49
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z35) {
                fn.c.c.getClass();
                fn.c.f17314h = z35;
            }
        });
        wm.b.c.getClass();
        boolean z35 = wm.b.f31381g;
        VB vb68 = this.Y;
        kotlin.jvm.internal.g.b(vb68);
        String p40 = ea.a.p("UWklZBpuBS4RYmRhDmUbYSphVWU0VCJwMHUvcA==", "zBVFea1G");
        CheckBox checkBox29 = ((am.o0) vb68).D;
        kotlin.jvm.internal.g.d(checkBox29, p40);
        b.t0(z35, checkBox29, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$50
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z36) {
                wm.b.c.getClass();
                wm.b.f31381g = z36;
            }
        });
        boolean z36 = wm.b.f31384j;
        VB vb69 = this.Y;
        kotlin.jvm.internal.g.b(vb69);
        String p41 = ea.a.p("LWlfZBBuUC45YhphEmUlYVthCWU3RBdhIlMHcnQ=", "C2lVEhiW");
        CheckBox checkBox30 = ((am.o0) vb69).C;
        kotlin.jvm.internal.g.d(checkBox30, p41);
        b.t0(z36, checkBox30, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$51
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z37) {
                wm.b.c.getClass();
                wm.b.f31384j = z37;
            }
        });
        boolean z37 = sharedPreferences2.getBoolean(ea.a.p("XWU4dRVTEW8_QglvQEM4bUhsN3QsZHhvAGkXaTJhNmlWbhlvHGYQZw==", "jn9Zryns"), true);
        VB vb70 = this.Y;
        kotlin.jvm.internal.g.b(vb70);
        String p42 = ea.a.p("LWlfZBBuUC45YhloGncqb1p0LW8ocAllBmUHTl50PmYmY1B0EG9u", "6Ggbrc1W");
        CheckBox checkBox31 = ((am.o0) vb70).H;
        kotlin.jvm.internal.g.d(checkBox31, p42);
        b.t0(z37, checkBox31, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$52
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z38) {
                a6.h.j("V2UpdRRTCm8FQltvHUM5bTRsV3QjZA1vFWkXaSphE2lcbghvHWYLZw==", "aqIgFkqB", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z38);
            }
        });
        VB vb71 = this.Y;
        kotlin.jvm.internal.g.b(vb71);
        ((am.o0) vb71).D0.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(4));
        boolean z38 = sharedPreferences2.getBoolean(ea.a.p("V2UpdRRfDmEcZ2tjAW85cyFfQWgpdw==", "IGF7z51K"), false);
        VB vb72 = this.Y;
        kotlin.jvm.internal.g.b(vb72);
        String p43 = ea.a.p("LWlfZBBuUC42YSRnAGEPZXZoAW82ZTZ3PHQtaA==", "DZDeUNR4");
        CheckBox checkBox32 = ((am.o0) vb72).T;
        kotlin.jvm.internal.g.d(checkBox32, p43);
        b.t0(z38, checkBox32, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$54
            public final void invoke(boolean z39) {
                a6.h.j("K2VTdR5fW2E0ZxVjHW8Hc1BfHWgqdw==", "z6oIG23Z", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z39);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }
        });
        int i14 = sharedPreferences2.getInt(ea.a.p("LGUIdRdfK2EmZxNhU2UIZkpvKGUnX0JpGWU=", "tTHjpGvf"), 72);
        VB vb73 = this.Y;
        kotlin.jvm.internal.g.b(vb73);
        ((am.o0) vb73).U.setText(String.valueOf(i14));
        VB vb74 = this.Y;
        kotlin.jvm.internal.g.b(vb74);
        ((am.o0) vb74).V.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27937b;

            {
                this.f27937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27937b;
                switch (i122) {
                    case 0:
                        int i132 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "RQRzJGGj"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "gKUlwd0G"));
                        try {
                            VB vb142 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb142);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6"), Long.parseLong(((am.o0) vb142).f1208b0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "mbwSpdzd"), 0).show();
                            return;
                        } catch (Exception unused5) {
                            androidx.appcompat.view.menu.d.h("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 86400000L);
                            return;
                        }
                    case 1:
                        int i142 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "aAfbezip"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("E2MhbgxlPHQ=", "Zi7NxDqI"));
                        try {
                            VB vb152 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb152);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("BmUUdV5fFGEmZxNhU2UIZkpvKGUnX0JpGWU=", "8Nbv9xnj"), Integer.parseInt(((am.o0) vb152).U.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("g7_g5tK5gIjY5eyf", "svgNFfqq"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 2:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("BWgqc00w", "pUqCiXF6"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "PNhdXnWn"));
                        try {
                            VB vb162 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            int parseInt = Integer.parseInt(((am.o0) vb162).f1231n0.getText().toString());
                            SharedPreferences sharedPreferences22 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                            sharedPreferences22.edit().putInt(ea.a.p("FGUmdSpfOnItdg9lQ18lZV5sPXcWYl90GWEBXzxheA==", "uKpDMJnq"), parseInt).apply();
                            VB vb172 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb172);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vJ19YZTlvCnk=", "P5TxMrf3"), Integer.parseInt(((am.o0) vb172).f1233o0.getText().toString())).apply();
                            VB vb182 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vA19FZQFzB29u", "t3snSSvs"), Integer.parseInt(((am.o0) vb182).f1235p0.getText().toString())).apply();
                            int i16 = sharedPreferences22.getInt(ea.a.p("CWUtdVBfQXItdg9lQ18jZUB0DXIsZlpvA18HZSNzK29u", "wVmO716F"), 28);
                            int i17 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8cZU10MXIgZglvQ19cZQpvF3k=", "hBdN41ge"), 2);
                            int i18 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8aZVNsAXcaYgx0O2FGXyxheA==", "se2cV6Al"), 100000000);
                            j1.a(context, "最低版本:" + i16 + " 最小内存:" + i17 + " 最大位图:" + i18);
                            return;
                        } catch (Exception unused32) {
                            return;
                        }
                    default:
                        int i19 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "3ByiYmjb"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("YmMXbjllIXQ=", "RwFxMYHW"));
                        VB vb192 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb192);
                        String value = ((am.o0) vb192).B0.getText().toString();
                        pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                        kotlin.jvm.internal.g.e(value, "value");
                        pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5TXGkqSSRxAGkaeWVhCWUGbwtmM2c=", "PvzMZDRu"), value).apply();
                        Toast.makeText(context, ea.a.p("s7_n5vu5gYjY5eyf", "7NWIogyh"), 0).show();
                        return;
                }
            }
        });
        String str = "";
        String string = sharedPreferences2.getString(ea.a.p("V2UpdRRfDXAXbmt3AHQ-XyZsU2MtXy9pIHQ=", "SFxYvkWC"), "");
        if (string != null) {
            str = string;
        }
        if (TextUtils.isEmpty(str)) {
            pdf.pdfreader.viewer.editor.free.utils.c1.f28564a.getClass();
            ArrayList<String> J = ge.a.J(ea.a.p("P2RXchxhU2UoLjpkE3YBZUJlHC4qZgNpGmVAbztsZHArZkJjGG5ZZXI=", "Z1YCy4TJ"), ea.a.p("Wm8nLixyMnM8ZQJhRHB5cFxmIGUoZFNyBGQXdjhlNWVy", "ij9JXGrU"), ea.a.p("UG8mLgNkBHIXYVBlGy4lYyVuXGU0LjNkMHYrZS1lcg==", "VBZokIbS"), ea.a.p("LG9cLhJtWC4qZCwuEGQBdFpy", "eg3wcv6G"), ea.a.p("P2RXLgtlVmQ_cmRwEWYaZVRkC3JrcAFmJ2kzdxVyHXArZkNlGGRScjxyL2U=", "zbefQVp3"), ea.a.p("UG8mLgdhG20TeRpwDWZ4ciFhVmVy", "8fRaKJ4q"), ea.a.p("UG8mLgNkBC4AZVVkDHJ4cCBmRGkjdyZya3AHZgRkW3RccmVmHHIDbhZyW2lk", "Eca2kR8s"), ea.a.p("LG9cLgx0XmwzdCNlBmEGZEFvAWxrcAFmBGUIZBdy", "OpbdvirO"));
            JSONArray jSONArray = new JSONArray();
            for (String str2 : J) {
                jSONArray.put(str2);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ea.a.p("X2k4dA==", "SMA2gNyo"), jSONArray);
            str = jSONObject.toString();
            kotlin.jvm.internal.g.d(str, ea.a.p("LnMfbgZiImUrdEh0W1MjclFuNSgp", "FlDpIHKN"));
        }
        VB vb75 = this.Y;
        kotlin.jvm.internal.g.b(vb75);
        ((am.o0) vb75).f1223j0.setText(str);
        VB vb76 = this.Y;
        kotlin.jvm.internal.g.b(vb76);
        ((am.o0) vb76).f1225k0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.y

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27941b;

            {
                this.f27941b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27941b;
                switch (i132) {
                    case 0:
                        int i142 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "b2cMCbWk"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "OjbL03xg"));
                        try {
                            VB vb162 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), Integer.parseInt(((am.o0) vb162).X.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "w5ENIrSf"), 0).show();
                            return;
                        } catch (Exception unused5) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwZvA24QXylvXGYmZw==", "bnP3vdJ2"), 2).apply();
                            return;
                        }
                    case 1:
                        int i15 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "zaotVEKT"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "VDlz3IX8"));
                        VB vb172 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb172);
                        String contentStr = ((am.o0) vb172).f1223j0.getText().toString();
                        if (!TextUtils.isEmpty(contentStr)) {
                            try {
                                pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                                kotlin.jvm.internal.g.e(contentStr, "contentStr");
                                pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5fWHA_bhV3HHQAX1dsD2MuXwlpFHQ=", "23tFge13"), contentStr).apply();
                                j1.a(context, ea.a.p("IHBUbi5pQ2h6cy90VXMdY1ZlHXMjdWw=", "XFtDtRTm"));
                                return;
                            } catch (Exception e10) {
                                e10.printStackTrace();
                                return;
                            }
                        }
                        return;
                    default:
                        int i16 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("DmhQc08w", "hMz9k8s1"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "ZcRF4ysS"));
                        try {
                            VB vb182 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), Integer.parseInt(((am.o0) vb182).P.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("07__5v65nojY5eyf", "kH7Qjxzu"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("NmUIdR9fE2QhdAlya3U5ZFdfIGUtb2ltFXgucyVlcA==", "fHRjxvyt"), 512).apply();
                            return;
                        }
                }
            }
        });
        String p44 = ea.a.p("K2VTdR5fRGM7bhVzGW8fX1ZoC2Nr", "xMDA1CxO");
        SharedPreferences sharedPreferences3 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
        boolean z39 = sharedPreferences3.getBoolean(p44, false);
        VB vb77 = this.Y;
        kotlin.jvm.internal.g.b(vb77);
        String p45 = ea.a.p("EWkWZCVuPS47dAlyVWcyU1thPEQsbFd5J3cYdDJo", "47sxLZlK");
        CheckBox checkBox33 = ((am.o0) vb77).E0;
        kotlin.jvm.internal.g.d(checkBox33, p45);
        b.t0(z39, checkBox33, new cg.l<Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$57
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(boolean z40) {
                a6.h.j("EmUQdRFfC2MpbjlzWG8gX1toN2Nr", "7bvrvx4l", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), z40);
            }
        });
        int i15 = sharedPreferences3.getInt(ea.a.p("K2VTdR5fWmU3bzh5KnMBemU=", "z3IATIht"), 50);
        VB vb78 = this.Y;
        kotlin.jvm.internal.g.b(vb78);
        ((am.o0) vb78).f1211d0.setText(String.valueOf(i15));
        VB vb79 = this.Y;
        kotlin.jvm.internal.g.b(vb79);
        ((am.o0) vb79).f1213e0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.u

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27926b;

            {
                this.f27926b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i132 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27926b;
                switch (i132) {
                    case 0:
                        int i142 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("F2g5cxMw", "UQcP766X"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("cmMebhplTnQ=", "FbVqn64A"));
                        try {
                            VB vb242 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb242);
                            String obj = ((am.o0) vb242).L.getText().toString();
                            c.a aVar = fn.c.c;
                            int parseInt = Integer.parseInt(obj);
                            aVar.getClass();
                            fn.c.f17310d.c(c.a.f17315a[0], Integer.valueOf(parseInt));
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "b08cSfkv"), 0).show();
                            return;
                        } catch (Exception unused32) {
                            Toast.makeText(context, ea.a.p("q7-f5u250qTr6P6l", "T3spnv1N"), 0).show();
                            return;
                        }
                    default:
                        int i152 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "tJQkudBV"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "aDbYEk6E"));
                        try {
                            VB vb252 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb252);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("MWUpdQFfVGUlbxR5a3M-emU=", "wUUKf9IC"), Integer.parseInt(((am.o0) vb252).f1211d0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("p66P58Su0YjK5cCf", "zKQgsMyg"), 0).show();
                            return;
                        } catch (Exception unused42) {
                            return;
                        }
                }
            }
        });
        VB vb80 = this.Y;
        kotlin.jvm.internal.g.b(vb80);
        ((am.o0) vb80).f1241s0.setOnClickListener(new b0(g02, 0));
        VB vb81 = this.Y;
        kotlin.jvm.internal.g.b(vb81);
        ((am.o0) vb81).f1239r0.setOnClickListener(new c0(g02, 0));
        VB vb82 = this.Y;
        kotlin.jvm.internal.g.b(vb82);
        ((am.o0) vb82).f1243t0.setOnClickListener(new c(g02, 2));
        View view = this.H;
        if (view != null) {
            radioGroup = (RadioGroup) view.findViewById(R.id.radioGroupImg2Pdf);
        } else {
            radioGroup = null;
        }
        pdf.pdfreader.viewer.editor.free.utils.c.f28558a.getClass();
        int i16 = pdf.pdfreader.viewer.editor.free.utils.c.f28560d;
        if (i16 != 0) {
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 != 3) {
                        if (i16 == 4 && radioGroup != null) {
                            radioGroup.check(R.id.rb5);
                        }
                    } else if (radioGroup != null) {
                        radioGroup.check(R.id.rb4);
                    }
                } else if (radioGroup != null) {
                    radioGroup.check(R.id.rb3);
                }
            } else if (radioGroup != null) {
                radioGroup.check(R.id.rb2);
            }
        } else if (radioGroup != null) {
            radioGroup.check(R.id.rb1);
        }
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new p(0));
        }
        VB vb83 = this.Y;
        kotlin.jvm.internal.g.b(vb83);
        ((am.o0) vb83).f1231n0.setText(String.valueOf(sharedPreferences3.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8aZVNsAXcaYgx0O2FGXyxheA==", "se2cV6Al"), 100000000)));
        VB vb84 = this.Y;
        kotlin.jvm.internal.g.b(vb84);
        ((am.o0) vb84).f1233o0.setText(String.valueOf(sharedPreferences3.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8cZU10MXIgZglvQ19cZQpvF3k=", "hBdN41ge"), 2)));
        VB vb85 = this.Y;
        kotlin.jvm.internal.g.b(vb85);
        ((am.o0) vb85).f1235p0.setText(String.valueOf(sharedPreferences3.getInt(ea.a.p("CWUtdVBfQXItdg9lQ18jZUB0DXIsZlpvA18HZSNzK29u", "wVmO716F"), 28)));
        VB vb86 = this.Y;
        kotlin.jvm.internal.g.b(vb86);
        ((am.o0) vb86).f1227l0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.x

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27937b;

            {
                this.f27937b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i122 = r3;
                Context context = g02;
                DebugAppConfigFragment debugAppConfigFragment = this.f27937b;
                switch (i122) {
                    case 0:
                        int i132 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "RQRzJGGj"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "gKUlwd0G"));
                        try {
                            VB vb142 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb142);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6"), Long.parseLong(((am.o0) vb142).f1208b0.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "mbwSpdzd"), 0).show();
                            return;
                        } catch (Exception unused5) {
                            androidx.appcompat.view.menu.d.h("K2VTdR5fW2E0Zz9hEmU3clBjD2wpXwNjKF8nbiJlRHYubG5jFm5RaWc=", "CCAJENV6", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 86400000L);
                            return;
                        }
                    case 1:
                        int i142 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "aAfbezip"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("E2MhbgxlPHQ=", "Zi7NxDqI"));
                        try {
                            VB vb152 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb152);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putInt(ea.a.p("BmUUdV5fFGEmZxNhU2UIZkpvKGUnX0JpGWU=", "8Nbv9xnj"), Integer.parseInt(((am.o0) vb152).U.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("g7_g5tK5gIjY5eyf", "svgNFfqq"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            pdf.pdfreader.viewer.editor.free.utils.c.d(60.0f);
                            return;
                        }
                    case 2:
                        int i152 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("BWgqc00w", "pUqCiXF6"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "PNhdXnWn"));
                        try {
                            VB vb162 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb162);
                            int parseInt = Integer.parseInt(((am.o0) vb162).f1231n0.getText().toString());
                            SharedPreferences sharedPreferences22 = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                            sharedPreferences22.edit().putInt(ea.a.p("FGUmdSpfOnItdg9lQ18lZV5sPXcWYl90GWEBXzxheA==", "uKpDMJnq"), parseInt).apply();
                            VB vb172 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb172);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vJ19YZTlvCnk=", "P5TxMrf3"), Integer.parseInt(((am.o0) vb172).f1233o0.getText().toString())).apply();
                            VB vb182 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb182);
                            sharedPreferences22.edit().putInt(ea.a.p("V2UpdRRfEnIXdl1lHl8iZTx0bXIjZi9vA19FZQFzB29u", "t3snSSvs"), Integer.parseInt(((am.o0) vb182).f1235p0.getText().toString())).apply();
                            int i162 = sharedPreferences22.getInt(ea.a.p("CWUtdVBfQXItdg9lQ18jZUB0DXIsZlpvA18HZSNzK29u", "wVmO716F"), 28);
                            int i17 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8cZU10MXIgZglvQ19cZQpvF3k=", "hBdN41ge"), 2);
                            int i18 = sharedPreferences22.getInt(ea.a.p("K2VTdR5fR3I_diNlAl8aZVNsAXcaYgx0O2FGXyxheA==", "se2cV6Al"), 100000000);
                            j1.a(context, "最低版本:" + i162 + " 最小内存:" + i17 + " 最大位图:" + i18);
                            return;
                        } catch (Exception unused32) {
                            return;
                        }
                    default:
                        int i19 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("O2hYc10w", "3ByiYmjb"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("YmMXbjllIXQ=", "RwFxMYHW"));
                        VB vb192 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb192);
                        String value = ((am.o0) vb192).B0.getText().toString();
                        pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                        kotlin.jvm.internal.g.e(value, "value");
                        pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putString(ea.a.p("K2VTdR5TXGkqSSRxAGkaeWVhCWUGbwtmM2c=", "PvzMZDRu"), value).apply();
                        Toast.makeText(context, ea.a.p("s7_n5vu5gYjY5eyf", "7NWIogyh"), 0).show();
                        return;
                }
            }
        });
        VB vb87 = this.Y;
        kotlin.jvm.internal.g.b(vb87);
        ((am.o0) vb87).f1215f0.setOnClickListener(new r(this, 0));
        VB vb88 = this.Y;
        kotlin.jvm.internal.g.b(vb88);
        ((am.o0) vb88).f1217g0.setOnClickListener(new View.OnClickListener(this) { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.v

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ DebugAppConfigFragment f27929b;

            {
                this.f27929b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i132 = r3;
                final Context context = g02;
                final DebugAppConfigFragment debugAppConfigFragment = this.f27929b;
                switch (i132) {
                    case 0:
                        int i142 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "5OgvScOr"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "E7q920O6"));
                        try {
                            VB vb202 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb202);
                            String obj = ((am.o0) vb202).M.getText().toString();
                            BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
                            int parseInt = Integer.parseInt(obj);
                            billingConfigImpl.getClass();
                            BillingConfigImpl.B(parseInt);
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "1vC0vYa0"), 0).show();
                            return;
                        } catch (Exception unused22) {
                            Toast.makeText(context, ea.a.p("17_l5ue5h6TD6ICl", "HvRaKhjO"), 0).show();
                            return;
                        }
                    case 1:
                        int i152 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "Gu45yG66"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "gd1zJydE"));
                        try {
                            VB vb212 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb212);
                            pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putLong(ea.a.p("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae"), Long.parseLong(((am.o0) vb212).Z.getText().toString())).apply();
                            Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "1KfA4iQU"), 0).show();
                            return;
                        } catch (Exception unused32) {
                            androidx.appcompat.view.menu.d.h("V2UpdRRfDmEcZ0FhDmUJciFjU2wqXyVpPXMFX11lKmFKXz9pHmU=", "Oq9FQmae", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), 60L);
                            return;
                        }
                    case 2:
                        int i162 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("R2gic1cw", "StS50zaJ"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "SHqrtugM"));
                        VB vb222 = debugAppConfigFragment.Y;
                        kotlin.jvm.internal.g.b(vb222);
                        Editable text = ((am.o0) vb222).f1221i0.getText();
                        if (!TextUtils.isEmpty(text)) {
                            kl.a.a(context, text.toString(), new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment$initView$65$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                    j1.a(context, debugAppConfigFragment.x(R.string.arg_res_0x7f13036a));
                                }
                            });
                            return;
                        }
                        return;
                    default:
                        int i17 = DebugAppConfigFragment.f27856d0;
                        kotlin.jvm.internal.g.e(debugAppConfigFragment, ea.a.p("QmhQc3Ew", "XK69UYHo"));
                        kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "lMRvfA0s"));
                        try {
                            VB vb232 = debugAppConfigFragment.Y;
                            kotlin.jvm.internal.g.b(vb232);
                            pdf.pdfreader.viewer.editor.free.utils.q0.x(debugAppConfigFragment.r(), Integer.parseInt(((am.o0) vb232).J.getText().toString()), "ai_chat_free_msg_num_config_162");
                            Toast.makeText(context, ea.a.p("17_l5ue5hIji5b6f", "vXESdoru"), 0).show();
                            return;
                        } catch (Exception unused42) {
                            Toast.makeText(context, ea.a.p("tL_G5ve5n6T56NKl", "HjPhczD3"), 0).show();
                            return;
                        }
                }
            }
        });
        VB vb89 = this.Y;
        kotlin.jvm.internal.g.b(vb89);
        ((am.o0) vb89).f1219h0.setOnClickListener(new u4.j(this, 24));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
