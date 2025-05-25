package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIDataBase;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;

/* compiled from: AIHistoryDetailActivity.kt */
/* loaded from: classes3.dex */
public final class AIHistoryDetailActivity extends jl.a {

    /* renamed from: v  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a f24405v;

    /* renamed from: w  reason: collision with root package name */
    public long f24406w;

    /* renamed from: x  reason: collision with root package name */
    public long f24407x;
    public static final String B = ea.a.p("LUkuRgpMBl8BRA==", "MUlqCCyW");
    public static final a A = new a();

    /* renamed from: t  reason: collision with root package name */
    public final Handler f24403t = new Handler(Looper.getMainLooper());

    /* renamed from: u  reason: collision with root package name */
    public final tf.c f24404u = kotlin.a.a(new cg.a<am.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.d invoke() {
            View inflate = AIHistoryDetailActivity.this.getLayoutInflater().inflate(R.layout.activity_ai_history_detail, (ViewGroup) null, false);
            int i10 = R.id.ai_chat_cl_title_bar;
            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_chat_cl_title_bar)) != null) {
                i10 = R.id.ai_history_fl_rv_container;
                if (((InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_history_fl_rv_container)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i10 = R.id.ai_history_rv;
                    RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_history_rv);
                    if (recyclerView != null) {
                        i10 = R.id.group_empty;
                        Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.group_empty);
                        if (group != null) {
                            i10 = R.id.iv_back;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_back);
                            if (appCompatImageView != null) {
                                i10 = R.id.iv_empty;
                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_empty)) != null) {
                                    i10 = R.id.iv_top_round_bg;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_top_round_bg);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.ll_refresh_no_data;
                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_refresh_no_data);
                                        if (u7 != null) {
                                            am.z a10 = am.z.a(u7);
                                            i10 = R.id.top_space;
                                            Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                            if (space != null) {
                                                i10 = R.id.tv_empty_button;
                                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_empty_button);
                                                if (textView != null) {
                                                    i10 = R.id.tv_empty_title;
                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_empty_title)) != null) {
                                                        i10 = R.id.tv_title;
                                                        if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title)) != null) {
                                                            return new am.d(constraintLayout, constraintLayout, recyclerView, group, appCompatImageView, appCompatImageView2, a10, space, textView);
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
            throw new NullPointerException(ea.a.p("HWkXcxpuJCA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "c7PdsCVK").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: y  reason: collision with root package name */
    public final g0 f24408y = new g0(this, 0);

    /* renamed from: z  reason: collision with root package name */
    public final o0 f24409z = new o0(this, 3);

    /* compiled from: AIHistoryDetailActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    @Override // jl.a
    public final void C1() {
        this.f24406w = getIntent().getLongExtra(B, 0L);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = a2().f801b;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC47aQJpBnQHckxSAW90", "TGyTDpsf"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        androidx.recyclerview.widget.h hVar;
        ((AppCompatTextView) a2().f805g.f1684d).setText(R.string.arg_res_0x7f1303a6);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            a2().f804f.setVisibility(0);
        } else {
            a2().f804f.setVisibility(8);
        }
        TextView textView = a2().f807i;
        String string = getString(R.string.arg_res_0x7f1300a5);
        textView.setText(string + " ✨");
        AppCompatImageView appCompatImageView = a2().f803e;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4zdghhFms=", "uCuV16fd"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity$initView$1
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
                AIHistoryDetailActivity.this.onBackPressed();
            }
        });
        TextView textView2 = a2().f807i;
        kotlin.jvm.internal.g.d(textView2, ea.a.p("JmlXZB9uLC48diNtRHQuQk10Jm9u", "E6D9vKXc"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity$initView$2
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
                AIHistoryDetailActivity.this.finish();
            }
        });
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a();
        this.f24405v = aVar;
        aVar.f24688q = true;
        a2().c.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView.j itemAnimator = a2().c.getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.h) {
            hVar = (androidx.recyclerview.widget.h) itemAnimator;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.f4455g = false;
        }
        a2().c.setAdapter(this.f24405v);
        this.f24403t.postDelayed(this.f24408y, 500L);
        AIDataBase aIDataBase = km.e.f19907a;
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new pdf.pdfreader.viewer.editor.free.data.b(1, this.f24406w, new cg.l<List<km.a>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity$getData$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(List<km.a> list) {
                invoke2(list);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<km.a> list) {
                AIHistoryDetailActivity aIHistoryDetailActivity = AIHistoryDetailActivity.this;
                Handler handler = aIHistoryDetailActivity.f24403t;
                handler.removeCallbacks(aIHistoryDetailActivity.f24408y);
                if (aIHistoryDetailActivity.a2().f805g.c.getVisibility() == 0) {
                    long currentTimeMillis = System.currentTimeMillis() - aIHistoryDetailActivity.f24407x;
                    if (currentTimeMillis >= 300) {
                        aIHistoryDetailActivity.a2().f805g.c.setVisibility(8);
                    } else {
                        handler.postDelayed(aIHistoryDetailActivity.f24409z, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) - currentTimeMillis);
                    }
                } else {
                    aIHistoryDetailActivity.a2().f805g.c.setVisibility(8);
                }
                AIHistoryDetailActivity aIHistoryDetailActivity2 = AIHistoryDetailActivity.this;
                aIHistoryDetailActivity2.getClass();
                List<km.a> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    aIHistoryDetailActivity2.a2().f802d.setVisibility(0);
                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar2 = aIHistoryDetailActivity2.f24405v;
                    if (aVar2 != null) {
                        aVar2.n(new ArrayList());
                        return;
                    }
                    return;
                }
                aIHistoryDetailActivity2.a2().f802d.setVisibility(8);
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.a aVar3 = aIHistoryDetailActivity2.f24405v;
                if (aVar3 != null) {
                    aVar3.n(list);
                }
            }
        }));
    }

    public final am.d a2() {
        return (am.d) this.f24404u.getValue();
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(a2().f806h);
        r4.f13799k.f13757d = false;
        r4.o(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.color_100_white_black);
        r4.h();
        r4.f();
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f24403t;
        handler.removeCallbacks(this.f24408y);
        handler.removeCallbacks(this.f24409z);
    }
}
