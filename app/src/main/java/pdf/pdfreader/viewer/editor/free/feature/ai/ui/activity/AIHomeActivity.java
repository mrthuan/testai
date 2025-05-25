package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import am.e2;
import am.p1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.flexbox.FlexboxLayout;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import lm.e;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.dialog.AIStatementDialog;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRobotInfoView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIChooseFileParams;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIJumpTarget;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.utils.event.AIEventCenter;

/* compiled from: AIHomeActivity.kt */
/* loaded from: classes3.dex */
public final class AIHomeActivity extends AISimpleSubscriptionActivity {
    public AIStatementDialog A;
    public pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c F;
    public pdf.pdfreader.viewer.editor.free.utils.a1 G;
    public boolean H;
    public static final String K = ea.a.p("DkluSzxZaEYITwdfJUEvRQ==", "CPX8v2ON");
    public static final a J = new a();

    /* renamed from: z  reason: collision with root package name */
    public final tf.c f24410z = kotlin.a.a(new cg.a<am.e>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.e invoke() {
            View inflate = AIHomeActivity.this.getLayoutInflater().inflate(R.layout.activity_ai_home, (ViewGroup) null, false);
            int i10 = R.id.ai_abstract_des;
            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_abstract_des);
            if (appCompatTextView != null) {
                i10 = R.id.ai_abstract_title;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_abstract_title);
                if (appCompatTextView2 != null) {
                    i10 = R.id.ai_chat_cl_title_bar;
                    View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_chat_cl_title_bar);
                    if (u7 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) u7;
                        int i11 = R.id.ai_chat_iv_back;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_iv_back);
                        if (appCompatImageView != null) {
                            i11 = R.id.ai_chat_iv_history;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_iv_history);
                            if (appCompatImageView2 != null) {
                                i11 = R.id.ai_chat_iv_tips;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_iv_tips);
                                if (appCompatImageView3 != null) {
                                    i11 = R.id.ai_chat_tv_online;
                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_tv_online);
                                    if (textView != null) {
                                        i11 = R.id.ai_chat_tv_title;
                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_tv_title);
                                        if (appCompatTextView3 != null) {
                                            i11 = R.id.ai_chat_v_history_bg;
                                            View u10 = com.google.android.play.core.assetpacks.c.u(u7, R.id.ai_chat_v_history_bg);
                                            if (u10 != null) {
                                                e2 e2Var = new e2(constraintLayout, constraintLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, textView, appCompatTextView3, u10);
                                                int i12 = R.id.ai_chat_fbl_free_msg_container;
                                                View u11 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_chat_fbl_free_msg_container);
                                                if (u11 != null) {
                                                    FlexboxLayout flexboxLayout = (FlexboxLayout) u11;
                                                    int i13 = R.id.ai_chat_tv_free_msg;
                                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u11, R.id.ai_chat_tv_free_msg);
                                                    if (appCompatTextView4 != null) {
                                                        i13 = R.id.ai_chat_tv_get_vip;
                                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(u11, R.id.ai_chat_tv_get_vip);
                                                        if (appCompatTextView5 != null) {
                                                            p1 p1Var = new p1(flexboxLayout, flexboxLayout, appCompatTextView4, appCompatTextView5);
                                                            i12 = R.id.ai_outline_des;
                                                            AppCompatTextView appCompatTextView6 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_outline_des);
                                                            if (appCompatTextView6 != null) {
                                                                i12 = R.id.ai_outline_title;
                                                                AppCompatTextView appCompatTextView7 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_outline_title);
                                                                if (appCompatTextView7 != null) {
                                                                    i12 = R.id.ai_summarize_des;
                                                                    AppCompatTextView appCompatTextView8 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_summarize_des);
                                                                    if (appCompatTextView8 != null) {
                                                                        i12 = R.id.ai_summarize_title;
                                                                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_summarize_title);
                                                                        if (appCompatTextView9 != null) {
                                                                            i12 = R.id.ai_translate_des;
                                                                            AppCompatTextView appCompatTextView10 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_translate_des);
                                                                            if (appCompatTextView10 != null) {
                                                                                i12 = R.id.ai_translate_title;
                                                                                AppCompatTextView appCompatTextView11 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_translate_title);
                                                                                if (appCompatTextView11 != null) {
                                                                                    i12 = R.id.ai_unlock_free_bg;
                                                                                    LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_unlock_free_bg);
                                                                                    if (lottieAnimationView != null) {
                                                                                        i12 = R.id.ai_upload_file_bg;
                                                                                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_upload_file_bg);
                                                                                        if (lottieAnimationView2 != null) {
                                                                                            i12 = R.id.con_ai_free;
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_ai_free);
                                                                                            if (constraintLayout2 != null) {
                                                                                                i12 = R.id.con_ai_upload_file;
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_ai_upload_file);
                                                                                                if (constraintLayout3 != null) {
                                                                                                    i12 = R.id.con_bottom;
                                                                                                    if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_bottom)) != null) {
                                                                                                        i12 = R.id.con_content;
                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.con_content);
                                                                                                        if (constraintLayout4 != null) {
                                                                                                            i12 = R.id.guideline1;
                                                                                                            if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideline1)) != null) {
                                                                                                                i12 = R.id.iv_abstract;
                                                                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_abstract)) != null) {
                                                                                                                    i12 = R.id.iv_grammar_check;
                                                                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_grammar_check)) != null) {
                                                                                                                        i12 = R.id.iv_summarize;
                                                                                                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_summarize)) != null) {
                                                                                                                            i12 = R.id.iv_top_round_bg;
                                                                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_top_round_bg);
                                                                                                                            if (appCompatImageView4 != null) {
                                                                                                                                i12 = R.id.iv_translate;
                                                                                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_translate)) != null) {
                                                                                                                                    i12 = R.id.ll_ai_unlock_free;
                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_ai_unlock_free);
                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                        i12 = R.id.ly_abstract;
                                                                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ly_abstract);
                                                                                                                                        if (constraintLayout6 != null) {
                                                                                                                                            i12 = R.id.ly_grammar_check;
                                                                                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ly_grammar_check);
                                                                                                                                            if (constraintLayout7 != null) {
                                                                                                                                                i12 = R.id.ly_history;
                                                                                                                                                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ly_history);
                                                                                                                                                if (linearLayout != null) {
                                                                                                                                                    i12 = R.id.ly_summarize;
                                                                                                                                                    ConstraintLayout constraintLayout8 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ly_summarize);
                                                                                                                                                    if (constraintLayout8 != null) {
                                                                                                                                                        i12 = R.id.ly_translate;
                                                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ly_translate);
                                                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                                                            ConstraintLayout constraintLayout10 = (ConstraintLayout) inflate;
                                                                                                                                                            int i14 = R.id.tv_ai_free_des;
                                                                                                                                                            TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_free_des);
                                                                                                                                                            if (textView2 != null) {
                                                                                                                                                                i14 = R.id.tv_ai_free_title;
                                                                                                                                                                TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_free_title);
                                                                                                                                                                if (textView3 != null) {
                                                                                                                                                                    i14 = R.id.tv_ai_unlock_free;
                                                                                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_unlock_free)) != null) {
                                                                                                                                                                        i14 = R.id.tv_ai_upload_file;
                                                                                                                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_upload_file)) != null) {
                                                                                                                                                                            i14 = R.id.tv_history_tips;
                                                                                                                                                                            AppCompatTextView appCompatTextView12 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_history_tips);
                                                                                                                                                                            if (appCompatTextView12 != null) {
                                                                                                                                                                                i14 = R.id.view_robot_info;
                                                                                                                                                                                AIChatRobotInfoView aIChatRobotInfoView = (AIChatRobotInfoView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_robot_info);
                                                                                                                                                                                if (aIChatRobotInfoView != null) {
                                                                                                                                                                                    i14 = R.id.view_status_bar;
                                                                                                                                                                                    View u12 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                                                                                                                    if (u12 != null) {
                                                                                                                                                                                        return new am.e(constraintLayout10, appCompatTextView, appCompatTextView2, e2Var, p1Var, appCompatTextView6, appCompatTextView7, appCompatTextView8, appCompatTextView9, appCompatTextView10, appCompatTextView11, lottieAnimationView, lottieAnimationView2, constraintLayout2, constraintLayout3, constraintLayout4, appCompatImageView4, constraintLayout5, constraintLayout6, constraintLayout7, linearLayout, constraintLayout8, constraintLayout9, constraintLayout10, textView2, textView3, appCompatTextView12, aIChatRobotInfoView, u12);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            i10 = i14;
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
                                                    throw new NullPointerException(ea.a.p("OGlHcwJuESA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "rHu4kvnG").concat(u11.getResources().getResourceName(i13)));
                                                }
                                                i10 = i12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpR2hSSTI6IA==", "Zyjy3rvd").concat(u7.getResources().getResourceName(i11)));
                    }
                }
            }
            throw new NullPointerException(ea.a.p("KGlEcypuAyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "8Ke7Cdnj").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public final String B = ea.a.p("L28YZQ==", "VYGuUX7c");
    public final LinkedHashSet C = new LinkedHashSet();
    public String D = ea.a.p("O29ebHM=", "Jsfmc6tz");
    public int E = 17;
    public int I = 1;

    /* compiled from: AIHomeActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String fromAIEntrance) {
            kotlin.jvm.internal.g.e(fromAIEntrance, "fromAIEntrance");
            if (context != null) {
                Intent intent = new Intent(context, AIHomeActivity.class);
                intent.putExtra(ea.a.p("ckkUSzZZPUYgT3lfOUERRQ==", "GU8pp5i7"), fromAIEntrance);
                context.startActivity(intent);
            }
        }
    }

    /* compiled from: AIHomeActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = AIHomeActivity.J;
            AIHomeActivity aIHomeActivity = AIHomeActivity.this;
            if (aIHomeActivity.k2().f831i.getWidth() > 0 && aIHomeActivity.k2().f833k.getWidth() > 0 && aIHomeActivity.k2().c.getWidth() > 0 && aIHomeActivity.k2().f829g.getWidth() > 0) {
                int dimensionPixelSize = aIHomeActivity.getResources().getDimensionPixelSize(R.dimen.dp_28);
                float dimensionPixelSize2 = aIHomeActivity.getResources().getDimensionPixelSize(R.dimen.sp_15);
                float dimensionPixelSize3 = aIHomeActivity.getResources().getDimensionPixelSize(R.dimen.sp_13);
                float dimensionPixelSize4 = aIHomeActivity.getResources().getDimensionPixelSize(R.dimen.sp_12);
                AppCompatTextView appCompatTextView = aIHomeActivity.k2().f831i;
                kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("LWlfZBBuUC47aRl1GG0Jclx6C1QsdAll", "LdNOb3zW"));
                String string = aIHomeActivity.getString(R.string.arg_res_0x7f1304a3);
                kotlin.jvm.internal.g.d(string, ea.a.p("JGVNUyxyGG4vKDQuR3QlaVZnfHM8bVthBmkLZQ5nMnQp", "FJC9XqwR"));
                float i22 = AIHomeActivity.i2(aIHomeActivity, appCompatTextView, dimensionPixelSize2, string);
                float f10 = 3;
                if (i22 + f10 <= aIHomeActivity.k2().f831i.getWidth() - dimensionPixelSize) {
                    AppCompatTextView appCompatTextView2 = aIHomeActivity.k2().f833k;
                    kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("FGlXZBhuAi4paTJyVW4kbFl0N1QgdFpl", "4Bv9qeVA"));
                    String string2 = aIHomeActivity.getString(R.string.arg_res_0x7f13018c);
                    kotlin.jvm.internal.g.d(string2, ea.a.p("D2UiUxhyIW4vKDQuR3QlaVZnfGcwbWl0BmEfcz1hNmUp", "L3hVlHIi"));
                    if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView2, dimensionPixelSize2, string2) + f10 <= aIHomeActivity.k2().f833k.getWidth() - dimensionPixelSize) {
                        AppCompatTextView appCompatTextView3 = aIHomeActivity.k2().c;
                        kotlin.jvm.internal.g.d(appCompatTextView3, ea.a.p("UWklZBpuBS4TaXViGnQkYSd0ZmkybGU=", "EPIgPST1"));
                        String string3 = aIHomeActivity.getString(R.string.arg_res_0x7f13001d);
                        kotlin.jvm.internal.g.d(string3, ea.a.p("X2UGU0NyDW4vKDQuR3QlaVZnfGErc0JyFWMFXzZwNik=", "WB8r7dwD"));
                        if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView3, dimensionPixelSize2, string3) + f10 <= aIHomeActivity.k2().c.getWidth() - dimensionPixelSize) {
                            AppCompatTextView appCompatTextView4 = aIHomeActivity.k2().f829g;
                            kotlin.jvm.internal.g.d(appCompatTextView4, ea.a.p("UWklZBpuBS4TaXt1HWw_biFUW3QqZQ==", "qBfN0qkx"));
                            String string4 = aIHomeActivity.getString(R.string.arg_res_0x7f130186);
                            kotlin.jvm.internal.g.d(string4, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGc3YQhtWXIRYyJlUGsQdUFwHHIp", "Zf6A8NJ3"));
                            if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView4, dimensionPixelSize2, string4) + f10 <= aIHomeActivity.k2().f829g.getWidth() - dimensionPixelSize) {
                                aIHomeActivity.k2().f831i.setTextSize(0, dimensionPixelSize2);
                                aIHomeActivity.k2().f830h.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f833k.setTextSize(0, dimensionPixelSize2);
                                aIHomeActivity.k2().f832j.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().c.setTextSize(0, dimensionPixelSize2);
                                aIHomeActivity.k2().f825b.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f829g.setTextSize(0, dimensionPixelSize2);
                                aIHomeActivity.k2().f828f.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f831i.setText(R.string.arg_res_0x7f1304a3);
                                aIHomeActivity.k2().f830h.setText(R.string.arg_res_0x7f1304a2);
                                aIHomeActivity.k2().f833k.setText(R.string.arg_res_0x7f13018c);
                                aIHomeActivity.k2().f832j.setText(R.string.arg_res_0x7f1304de);
                                aIHomeActivity.k2().c.setText(R.string.arg_res_0x7f13001d);
                                aIHomeActivity.k2().f825b.setText(R.string.arg_res_0x7f13001c);
                                aIHomeActivity.k2().f829g.setText(R.string.arg_res_0x7f130186);
                                aIHomeActivity.k2().f828f.setText(R.string.arg_res_0x7f130184);
                                aIHomeActivity.k2().f838p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        }
                    }
                }
                AppCompatTextView appCompatTextView5 = aIHomeActivity.k2().f831i;
                kotlin.jvm.internal.g.d(appCompatTextView5, ea.a.p("KmlWZABuJC4paTV1WW02clF6N1QgdFpl", "lzH8iCZX"));
                String string5 = aIHomeActivity.getString(R.string.arg_res_0x7f1304a3);
                kotlin.jvm.internal.g.d(string5, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQHMwbQhhBmktZQhnNXQp", "ICkitWWE"));
                if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView5, dimensionPixelSize3, string5) + f10 <= aIHomeActivity.k2().f831i.getWidth() - dimensionPixelSize) {
                    AppCompatTextView appCompatTextView6 = aIHomeActivity.k2().f833k;
                    kotlin.jvm.internal.g.d(appCompatTextView6, ea.a.p("UWklZBpuBS4TaWByCG4lbCV0V1QvdC9l", "Wv46W0RS"));
                    String string6 = aIHomeActivity.getString(R.string.arg_res_0x7f13018c);
                    kotlin.jvm.internal.g.d(string6, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGc_bRx0FWErcy5hO2Up", "gEBOX5M6"));
                    if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView6, dimensionPixelSize3, string6) + f10 <= aIHomeActivity.k2().f833k.getWidth() - dimensionPixelSize) {
                        AppCompatTextView appCompatTextView7 = aIHomeActivity.k2().c;
                        kotlin.jvm.internal.g.d(appCompatTextView7, ea.a.p("D2lZZF5uIi4paSdiR3QlYVt0Bmk9bGU=", "rDm77EcP"));
                        String string7 = aIHomeActivity.getString(R.string.arg_res_0x7f13001d);
                        kotlin.jvm.internal.g.d(string7, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGEkczdyCWMTXzRwGik=", "hgSnZsYo"));
                        if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView7, dimensionPixelSize3, string7) + f10 <= aIHomeActivity.k2().c.getWidth() - dimensionPixelSize) {
                            AppCompatTextView appCompatTextView8 = aIHomeActivity.k2().f829g;
                            kotlin.jvm.internal.g.d(appCompatTextView8, ea.a.p("UWklZBpuBS4TaXt1HWw_biFUW3QqZQ==", "syctqfJ5"));
                            String string8 = aIHomeActivity.getString(R.string.arg_res_0x7f130186);
                            kotlin.jvm.internal.g.d(string8, ea.a.p("KGVFUw1yXm49KBguBnQaaVtnQGc3YQhtBHILYyJlFmsQdUFwHHIp", "n3WheTJu"));
                            if (AIHomeActivity.i2(aIHomeActivity, appCompatTextView8, dimensionPixelSize3, string8) + f10 <= aIHomeActivity.k2().f829g.getWidth() - dimensionPixelSize) {
                                aIHomeActivity.k2().f831i.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f830h.setTextSize(0, dimensionPixelSize4);
                                aIHomeActivity.k2().f833k.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f832j.setTextSize(0, dimensionPixelSize4);
                                aIHomeActivity.k2().c.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f825b.setTextSize(0, dimensionPixelSize4);
                                aIHomeActivity.k2().f829g.setTextSize(0, dimensionPixelSize3);
                                aIHomeActivity.k2().f828f.setTextSize(0, dimensionPixelSize4);
                                aIHomeActivity.k2().f831i.setText(R.string.arg_res_0x7f1304a3);
                                aIHomeActivity.k2().f830h.setText(R.string.arg_res_0x7f1304a2);
                                aIHomeActivity.k2().f833k.setText(R.string.arg_res_0x7f13018c);
                                aIHomeActivity.k2().f832j.setText(R.string.arg_res_0x7f1304de);
                                aIHomeActivity.k2().c.setText(R.string.arg_res_0x7f13001d);
                                aIHomeActivity.k2().f825b.setText(R.string.arg_res_0x7f13001c);
                                aIHomeActivity.k2().f829g.setText(R.string.arg_res_0x7f130186);
                                aIHomeActivity.k2().f828f.setText(R.string.arg_res_0x7f130184);
                                aIHomeActivity.k2().f838p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                            }
                        }
                    }
                }
                aIHomeActivity.k2().f831i.setTextSize(0, dimensionPixelSize2);
                aIHomeActivity.k2().f830h.setTextSize(0, dimensionPixelSize3);
                aIHomeActivity.k2().f833k.setTextSize(0, dimensionPixelSize2);
                aIHomeActivity.k2().f832j.setTextSize(0, dimensionPixelSize3);
                aIHomeActivity.k2().c.setTextSize(0, dimensionPixelSize2);
                aIHomeActivity.k2().f825b.setTextSize(0, dimensionPixelSize3);
                aIHomeActivity.k2().f829g.setTextSize(0, dimensionPixelSize2);
                aIHomeActivity.k2().f828f.setTextSize(0, dimensionPixelSize3);
                aIHomeActivity.k2().f831i.setText(R.string.arg_res_0x7f1304a3);
                aIHomeActivity.k2().f830h.setText(R.string.arg_res_0x7f1304a2);
                aIHomeActivity.k2().f833k.setText(R.string.arg_res_0x7f13018c);
                aIHomeActivity.k2().f832j.setText(R.string.arg_res_0x7f1304de);
                aIHomeActivity.k2().c.setText(R.string.arg_res_0x7f13001d);
                aIHomeActivity.k2().f825b.setText(R.string.arg_res_0x7f13001c);
                aIHomeActivity.k2().f829g.setText(R.string.arg_res_0x7f130186);
                aIHomeActivity.k2().f828f.setText(R.string.arg_res_0x7f130184);
                aIHomeActivity.k2().f838p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h2(final pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity r9, int r10) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity.h2(pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity, int):void");
    }

    public static final float i2(AIHomeActivity aIHomeActivity, AppCompatTextView appCompatTextView, float f10, String str) {
        aIHomeActivity.getClass();
        TextPaint paint = appCompatTextView.getPaint();
        paint.setTextSize(f10);
        return paint.measureText(str);
    }

    public static final void j2(AIHomeActivity aIHomeActivity) {
        aIHomeActivity.getClass();
        tn.a.b(aIHomeActivity, ea.a.p("Lmk=", "G26W1iRt"), ea.a.p("G2ksb1xlGmY9bgV0XW85c2djPmkqaw==", "7OzD1E8v"));
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = k2().f846x;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0P2kzdw==", "O7XbkSlz"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        k2().f838p.getViewTreeObserver().addOnGlobalLayoutListener(new b());
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            k2().f839q.setImageResource(R.drawable.bg_dark_subscription);
        } else {
            k2().f839q.setImageResource(R.drawable.bg_ai_page);
        }
        AppCompatImageView appCompatImageView = k2().f826d.c;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC47aQloFHQrbGFpGmwgQgRyY2E8QxJhF0k5QlBjaw==", "rFJfMUzc"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$2
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
                AIHomeActivity.this.onBackPressed();
            }
        });
        AppCompatImageView appCompatImageView2 = k2().f826d.f864d;
        kotlin.jvm.internal.g.d(appCompatImageView2, ea.a.p("UWklZBpuBS4TaXdoCHQVbBBpRmwjQiJybGE-QwphBElFSCJzB28QeQ==", "BWbpFv65"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$3
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
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("J29cZQ1vcA==", "frmLuPUA");
                aIEventCenter.getClass();
                AIEventCenter.f(p10);
                int i10 = AIHistoryActivity.A;
                AIHomeActivity aIHomeActivity = AIHomeActivity.this;
                if (aIHomeActivity != null) {
                    aIHomeActivity.startActivity(new Intent(aIHomeActivity, AIHistoryActivity.class));
                }
            }
        });
        AppCompatImageView appCompatImageView3 = k2().f826d.f865e;
        kotlin.jvm.internal.g.d(appCompatImageView3, ea.a.p("LWlfZBBuUC47aQloFHQrbGFpGmwgQgRyHGFYQyNhFkk5VFhwcw==", "Po2C21Kb"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$4
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
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("LmlSbBhpWl85bCNjaw==", "pKwYOdK2");
                String str = AIHomeActivity.this.B;
                aIEventCenter.getClass();
                AIEventCenter.i(p10, str);
                AIHomeActivity.this.A = new AIStatementDialog(AIHomeActivity.this);
                AIStatementDialog aIStatementDialog = AIHomeActivity.this.A;
                if (aIStatementDialog != null) {
                    aIStatementDialog.show();
                }
            }
        });
        ConstraintLayout constraintLayout = k2().f844v;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC42eRl1GG0Jclx6ZQ==", "1vEZwYjT"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$5
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
                AIHomeActivity.j2(AIHomeActivity.this);
                AIHomeActivity.h2(AIHomeActivity.this, 13);
            }
        });
        ConstraintLayout constraintLayout2 = k2().f845w;
        kotlin.jvm.internal.g.d(constraintLayout2, ea.a.p("LWlfZBBuUC42eR5yFG4bbFR0ZQ==", "Nxf4Dtbu"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$6
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
                AIHomeActivity.j2(AIHomeActivity.this);
                AIHomeActivity.h2(AIHomeActivity.this, 14);
            }
        });
        ConstraintLayout constraintLayout3 = k2().f841s;
        kotlin.jvm.internal.g.d(constraintLayout3, ea.a.p("W2k6ZDluCS4keSdiR3QlYVt0", "Oo9TPn4L"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$7
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
                AIHomeActivity.j2(AIHomeActivity.this);
                AIHomeActivity.h2(AIHomeActivity.this, 15);
            }
        });
        ConstraintLayout constraintLayout4 = k2().f842t;
        kotlin.jvm.internal.g.d(constraintLayout4, ea.a.p("UWklZBpuBS4eeXNyCG07YTZDWmUlaw==", "KNuQaNe2"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout4, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$8
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
                AIHomeActivity.j2(AIHomeActivity.this);
                AIHomeActivity.h2(AIHomeActivity.this, 16);
            }
        });
        k2().B.setFrom(OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        ConstraintLayout constraintLayout5 = k2().f837o;
        kotlin.jvm.internal.g.d(constraintLayout5, ea.a.p("LWlfZBBuUC45byRBHFUYbFphCkYsbGU=", "ieEmpBrQ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout5, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$initView$9
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
                tn.a.b(AIHomeActivity.this, ea.a.p("Umk=", "KZ9eIA45"), ea.a.p("LmlZbxRlaHUqbCVhEV8LbFxjaw==", "UjdXbBtb"));
                AIHomeActivity.h2(AIHomeActivity.this, 17);
            }
        });
        l2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        pdf.pdfreader.viewer.editor.free.utils.t0.d0(b.b.x(this), null, null, new AIHomeActivity$initViewModel$1(this, null), 3);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void c2() {
        if (this.I == 2) {
            AIEventCenter aIEventCenter = AIEventCenter.f28648a;
            String p10 = ea.a.p("Umkjbx5lPXUcbFtjAl8ybypl", "Zk2NISs4");
            String p11 = ea.a.p("UGE5ZA==", "Mv7gX0qg");
            aIEventCenter.getClass();
            AIEventCenter.i(p10, p11);
        }
        l2();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void d2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity
    public final void g2(String str, boolean z10) {
        int i10;
        boolean z11 = !z10;
        if (z10) {
            i10 = R.drawable.ic_subscription_positive;
        } else {
            i10 = R.drawable.ic_subscription_negative;
        }
        pdf.pdfreader.viewer.editor.free.utils.j1.i(this, str, z11, i10);
    }

    public final am.e k2() {
        return (am.e) this.f24410z.getValue();
    }

    public final void l2() {
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.w()) {
            ((FlexboxLayout) k2().f827e.f1302d).setVisibility(8);
            k2().f837o.setVisibility(0);
            k2().f836n.setVisibility(8);
            k2().f843u.setVisibility(8);
            k2().f835m.j();
            return;
        }
        int k10 = pdf.pdfreader.viewer.editor.free.utils.q0.k(this);
        if (k10 > 0) {
            if (k10 == 1) {
                k2().f827e.f1301b.setText(getString(R.string.arg_res_0x7f1300a6, String.valueOf(k10)));
            } else {
                k2().f827e.f1301b.setText(getString(R.string.arg_res_0x7f1300a9, String.valueOf(k10)));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) k2().f827e.f1303e;
            kotlin.jvm.internal.g.d(appCompatTextView, ea.a.p("LWlfZBBuUC47aQloFHQuYllGHGUgTRZnJ28EdFlpVmU9LlBpOmhWdA52DWUBVgFw", "rQXedj88"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$refreshBottomLayout$1
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
                    AIHomeActivity.this.I = 1;
                    BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                    Context context = it.getContext();
                    String i10 = a0.a.i("PHQaYy5uLWUwdA==", "V7U4AYNc", context, "W28mZQVpcA==", "c5LphVSE");
                    String p10 = ea.a.p("R28kbHM=", "C0P7vleH");
                    aVar.getClass();
                    BaseSubscriptionActivity.a.b(context, i10, p10, null);
                }
            });
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) k2().f827e.f1303e;
            kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("LWlfZBBuUC47aQloFHQuYllGHGUgTRZnNW9cdAxpCGU9LlBpOmhWdA52DWUBVgFw", "AoFnv2mf"));
            ((AppCompatTextView) k2().f827e.f1303e).setText(e.a.a(this, appCompatTextView2));
            ((FlexboxLayout) k2().f827e.f1302d).setVisibility(0);
            k2().f837o.setVisibility(0);
            k2().f836n.setVisibility(8);
            k2().f843u.setVisibility(8);
            k2().f835m.j();
            return;
        }
        ((FlexboxLayout) k2().f827e.f1302d).setVisibility(8);
        k2().f837o.setVisibility(8);
        if (k2().f836n.getVisibility() != 0) {
            tn.a.d(this, ea.a.p("WmFw", "1qb7iw0c"), ea.a.p("JmFBXwxuW285axVzHW93", "TLCG2tX6"), ea.a.p("J2klbyFl", "6ZFMLHQu"), false);
            tn.a.d(this, ea.a.p("E2k=", "I7rl4mFF"), ea.a.p("LmlZbxRlaHU0bCVjHl8baFp3", "vdWfAChr"), ea.a.p("LGFDZA==", "xTNhnhis"), false);
        }
        k2().f836n.setVisibility(0);
        k2().f843u.setVisibility(0);
        k2().f834l.j();
        AppCompatTextView appCompatTextView3 = k2().A;
        Context context = k2().A.getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("UWklZBpuBS4GdnxpGnQ5cj1UW3A1LiBvA3QjeHQ=", "mFd06Chw"));
        String string = getString(R.string.arg_res_0x7f1300a3, "");
        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHGMuYTdfKmkgdDZyGF9HaTtfFHAWLFIiFik=", "BSYaeLOb"));
        SpannableString spannableString = new SpannableString(string.concat(" "));
        spannableString.setSpan(new so.b(context, R.drawable.ic_emoji_smile), spannableString.length() - 1, spannableString.length(), 33);
        appCompatTextView3.setText(spannableString);
        k2().f848z.setText(getString(R.string.arg_res_0x7f130043));
        if (billingConfigImpl.o(this)) {
            k2().f847y.setText(getString(R.string.arg_res_0x7f130044, ea.a.p("Nw==", "v5CxKA56")));
        } else {
            k2().f847y.setText(getString(R.string.arg_res_0x7f130042));
        }
        ConstraintLayout constraintLayout = k2().f840r;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4ebHVpPG46bydrdHIjZQ==", "8UEENs04"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$refreshBottomLayout$2
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
                AIHomeActivity aIHomeActivity = AIHomeActivity.this;
                aIHomeActivity.I = 2;
                tn.a.d(aIHomeActivity, ea.a.p("Umk=", "w0HavQNT"), ea.a.p("LmlZbxRlaHU0bCVjHl8LbFxjaw==", "n8O2T2AJ"), ea.a.p("LGFDZA==", "O21MbTMF"), false);
                BillingConfigImpl billingConfigImpl2 = BillingConfigImpl.c;
                Context context2 = it.getContext();
                kotlin.jvm.internal.g.d(context2, ea.a.p("JnQfYxZuQ2UidA==", "Ycr6nmKR"));
                if (billingConfigImpl2.o(context2)) {
                    AISimpleSubscriptionActivity.f2(AIHomeActivity.this, ea.a.p("Umkjbx5l", "c7kgkSCx"));
                    return;
                }
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                Context context3 = it.getContext();
                String i10 = a0.a.i("JnQfYxZuQ2UidA==", "gKKweWEP", context3, "I2kebyVl", "MnBvH64k");
                String p10 = ea.a.p("O29ebHM=", "c3YXJNBd");
                aVar.getClass();
                BaseSubscriptionActivity.a.b(context3, i10, p10, null);
            }
        });
        LinearLayout linearLayout = k2().f843u;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("FWk0ZF5uIS4keS5pR3Q4cnk=", "4swZ7FTf"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity$refreshBottomLayout$3
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
                AIEventCenter aIEventCenter = AIEventCenter.f28648a;
                String p10 = ea.a.p("J29cZRVvWWc=", "r8yXAvyN");
                aIEventCenter.getClass();
                AIEventCenter.f(p10);
                int i10 = AIHistoryActivity.A;
                AIHomeActivity aIHomeActivity = AIHomeActivity.this;
                if (aIHomeActivity != null) {
                    aIHomeActivity.startActivity(new Intent(aIHomeActivity, AIHistoryActivity.class));
                }
            }
        });
    }

    public final void m2(int i10) {
        int k10 = pdf.pdfreader.viewer.editor.free.utils.q0.k(this);
        im.b.f18555a.getClass();
        AIQuickTag c = im.b.c(this, i10);
        if (!BillingConfigImpl.c.w() && k10 <= 0) {
            BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
            String p10 = ea.a.p("CXVaYw==", "z9o4Rl71");
            String p11 = ea.a.p("O29ebHM=", "FE3JJJIw");
            AIJumpTarget aIJumpTarget = new AIJumpTarget(PDFChooseActivity.class, null, new AIChooseFileParams(ToolsType.AI_UPLOAD, i10, c), 2, null);
            aVar.getClass();
            BaseSubscriptionActivity.a.b(this, p10, p11, aIJumpTarget);
            return;
        }
        PDFChooseActivity.a aVar2 = PDFChooseActivity.f27008u0;
        ToolsType toolsType = ToolsType.AI_UPLOAD;
        aVar2.getClass();
        PDFChooseActivity.a.a(this, toolsType, i10, c);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISimpleSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra(K);
        if (stringExtra == null) {
            stringExtra = ea.a.p("R28kbHM=", "IT8UQ5XK");
        }
        this.D = stringExtra;
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(k2().C);
        r4.f13799k.f13757d = false;
        r4.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.color_100_white_black);
        r4.h();
        r4.f();
        tn.a.d(this, ea.a.p("Lmk=", "cvKV1f3x"), ea.a.p("LmlZbxRlaHMyb3c=", "MNL4ni4g"), ea.a.p("N28RYWw=", "HhCehfbL"), false);
        tn.a.d(this, ea.a.p("E2k=", "3XrjpHFy"), ea.a.p("LmlZbxRlaHMyb3c=", "2P6z3nyT"), this.D, false);
        for (int i10 = 13; i10 < 17; i10++) {
            im.b.f18555a.getClass();
            AIQuickTag c = im.b.c(this, i10);
            if (c != null) {
                AIEventCenter.f28648a.getClass();
                String from = this.B;
                kotlin.jvm.internal.g.e(from, "from");
                AIEventCenter.d(ea.a.p("LmlXdRdjaHMyb3c=", "woRboBxb"), c, from);
            }
        }
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar;
        AIStatementDialog aIStatementDialog;
        super.onDestroy();
        AIStatementDialog aIStatementDialog2 = this.A;
        boolean z11 = true;
        if (aIStatementDialog2 != null && aIStatementDialog2.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (aIStatementDialog = this.A) != null) {
            aIStatementDialog.dismiss();
        }
        if (k2().f834l.h()) {
            k2().f834l.d();
        }
        if (k2().f835m.h()) {
            k2().f835m.d();
        }
        pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c cVar2 = this.F;
        if (cVar2 == null || !cVar2.isShowing()) {
            z11 = false;
        }
        if (z11 && (cVar = this.F) != null) {
            cVar.dismiss();
        }
        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = this.G;
        if (a1Var != null) {
            a1Var.b();
        }
        this.G = null;
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        l2();
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.g(this) && this.H) {
            m2(this.E);
        }
        androidx.lifecycle.w<ArrayList<PdfPreviewEntity>> wVar = wn.b.f31386a;
        if (wn.b.f31393i) {
            wn.b.f31393i = false;
            try {
                new pdf.pdfreader.viewer.editor.free.ui.dialog.i(this).show();
            } catch (Exception unused) {
            }
        }
        this.H = false;
        pdf.pdfreader.viewer.editor.free.utils.a1 a1Var = this.G;
        if (a1Var != null) {
            a1Var.b();
        }
        this.G = null;
    }

    @Override // jl.a
    public final void C1() {
    }
}
