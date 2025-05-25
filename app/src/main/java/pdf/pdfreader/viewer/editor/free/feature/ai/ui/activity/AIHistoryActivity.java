package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
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
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryDetailActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.InterceptTouchFrameLayout;

/* compiled from: AIHistoryActivity.kt */
/* loaded from: classes3.dex */
public final class AIHistoryActivity extends jl.a {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c f24398v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f24399w;

    /* renamed from: x  reason: collision with root package name */
    public long f24400x;

    /* renamed from: t  reason: collision with root package name */
    public final Handler f24396t = new Handler(Looper.getMainLooper());

    /* renamed from: u  reason: collision with root package name */
    public final tf.c f24397u = kotlin.a.a(new cg.a<am.c>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.c invoke() {
            View inflate = AIHistoryActivity.this.getLayoutInflater().inflate(R.layout.activity_ai_history, (ViewGroup) null, false);
            int i10 = R.id.ai_chat_cl_title_bar;
            if (((ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_chat_cl_title_bar)) != null) {
                i10 = R.id.ai_history_fl_rv_container;
                if (((InterceptTouchFrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_history_fl_rv_container)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    i10 = R.id.ai_history_rv;
                    RecyclerView recyclerView = (RecyclerView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_history_rv);
                    if (recyclerView != null) {
                        i10 = R.id.check_all;
                        CheckBox checkBox = (CheckBox) com.google.android.play.core.assetpacks.c.u(inflate, R.id.check_all);
                        if (checkBox != null) {
                            i10 = R.id.group_empty;
                            Group group = (Group) com.google.android.play.core.assetpacks.c.u(inflate, R.id.group_empty);
                            if (group != null) {
                                i10 = R.id.iv_back;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_back);
                                if (appCompatImageView != null) {
                                    i10 = R.id.iv_check;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_check);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.iv_empty;
                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_empty)) != null) {
                                            i10 = R.id.iv_top_round_bg;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_top_round_bg);
                                            if (appCompatImageView3 != null) {
                                                i10 = R.id.layout_all;
                                                LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.layout_all);
                                                if (linearLayout != null) {
                                                    i10 = R.id.ll_empty_button;
                                                    LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_empty_button);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.ll_refresh_no_data;
                                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.ll_refresh_no_data);
                                                        if (u7 != null) {
                                                            am.z a10 = am.z.a(u7);
                                                            i10 = R.id.top_select_all;
                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_select_all)) != null) {
                                                                i10 = R.id.top_space;
                                                                Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                if (space != null) {
                                                                    i10 = R.id.tv_ai_history_delete;
                                                                    TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_history_delete);
                                                                    if (textView != null) {
                                                                        i10 = R.id.tv_empty_button;
                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_empty_button)) != null) {
                                                                            i10 = R.id.tv_empty_title;
                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_empty_title)) != null) {
                                                                                i10 = R.id.tv_title;
                                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title)) != null) {
                                                                                    return new am.c(constraintLayout, constraintLayout, recyclerView, checkBox, group, appCompatImageView, appCompatImageView2, appCompatImageView3, linearLayout, linearLayout2, a10, space, textView);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpEWhtSTM6IA==", "eMw0cQmQ").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: y  reason: collision with root package name */
    public final q0 f24401y = new q0(this, 3);

    /* renamed from: z  reason: collision with root package name */
    public final b7.g f24402z = new b7.g(this, 19);

    public static final void a2(AIHistoryActivity aIHistoryActivity) {
        aIHistoryActivity.f24399w = true;
        tn.a.b(aIHistoryActivity, ea.a.p("Umk=", "harmi2uu"), ea.a.p("DWkaaTt0WXIxXwBpWGUkZVRlDXMhb3c=", "1xlrH64B"));
        aIHistoryActivity.c2().f776g.setVisibility(8);
        aIHistoryActivity.c2().f778i.setVisibility(0);
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar = aIHistoryActivity.f24398v;
        if (cVar != null) {
            cVar.f24693g = true;
        }
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = c2().f772b;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("VmlaZBpuPy4paS5pR3Q4ckFSPW90", "vH44sX7N"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        androidx.recyclerview.widget.h hVar;
        ((AppCompatTextView) c2().f780k.f1684d).setText(R.string.arg_res_0x7f1303a6);
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this)) {
            c2().f777h.setVisibility(0);
        } else {
            c2().f777h.setVisibility(8);
        }
        c2().f775f.setOnClickListener(new f5.d(this, 3));
        LinearLayout linearLayout = c2().f779j;
        kotlin.jvm.internal.g.d(linearLayout, ea.a.p("UWklZBpuBS4ebHFtGXQvQjF0Rm9u", "Nvn86X08"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(linearLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$2
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
                tn.a.b(AIHistoryActivity.this, ea.a.p("NWk=", "H8TfiiLF"), ea.a.p("NGkNaT90IHIxXwVoVXQIY1RpMWs=", "LGUeLOjH"));
                AIHistoryActivity.this.finish();
            }
        });
        AppCompatImageView appCompatImageView = c2().f776g;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4zdgloEGNr", "plflTJG8"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$3
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
                tn.a.b(AIHistoryActivity.this, ea.a.p("Umk=", "Za88J3vn"), ea.a.p("LmlZaQp0WHIjXyd1GXMNbFBfDWwsY2s=", "uzX1MFBy"));
                AIHistoryActivity.a2(AIHistoryActivity.this);
            }
        });
        c2().f778i.setOnClickListener(new f0(this, 0));
        TextView textView = c2().f782m;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4GdnVpIWkldCtyS0QjbCZ0ZQ==", "SgtFP0Lo"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$5
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
                final AIHistoryActivity aIHistoryActivity = AIHistoryActivity.this;
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar = aIHistoryActivity.f24398v;
                ArrayList list = cVar != null ? cVar.f24694h : null;
                if (!(list == null || list.isEmpty())) {
                    AIDataBase aIDataBase = km.e.f19907a;
                    cg.a<tf.d> aVar = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$deleteSelect$1
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
                            pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar2 = AIHistoryActivity.this.f24398v;
                            if (cVar2 != null) {
                                ArrayList arrayList = cVar2.f24702d;
                                ArrayList arrayList2 = cVar2.f24694h;
                                arrayList.removeAll(arrayList2);
                                arrayList2.clear();
                                cg.l<? super Integer, tf.d> lVar = cVar2.f24695i;
                                if (lVar != null) {
                                    lVar.invoke(0);
                                }
                                cVar2.notifyDataSetChanged();
                            }
                        }
                    };
                    kotlin.jvm.internal.g.e(list, "list");
                    pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new l.r(21, list, aVar));
                }
                tn.a.b(AIHistoryActivity.this, ea.a.p("Lmk=", "BdbtOzLg"), ea.a.p("LmlZaQp0WHIjXyxpGWUbZVllMWQgbABfNmwvY2s=", "82cAUFMh"));
            }
        });
        this.f24398v = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c();
        c2().c.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView.j itemAnimator = c2().c.getItemAnimator();
        if (itemAnimator instanceof androidx.recyclerview.widget.h) {
            hVar = (androidx.recyclerview.widget.h) itemAnimator;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.f4455g = false;
        }
        c2().c.setAdapter(this.f24398v);
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar = this.f24398v;
        if (cVar != null) {
            cVar.f24695i = new cg.l<Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$6
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num) {
                    invoke(num.intValue());
                    return tf.d.f30009a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
                    if ((r3 != null && r7 == r3.getItemCount()) != false) goto L15;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void invoke(int r7) {
                    /*
                        r6 = this;
                        r0 = 8
                        r1 = 0
                        if (r7 <= 0) goto L36
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        int r3 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.A
                        am.c r2 = r2.c2()
                        android.widget.TextView r2 = r2.f782m
                        int r2 = r2.getVisibility()
                        if (r2 == 0) goto L2a
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        java.lang.String r3 = "Umk="
                        java.lang.String r4 = "HB0CWwP3"
                        java.lang.String r3 = ea.a.p(r3, r4)
                        java.lang.String r4 = "MWkHaQl0CHIxXwBpWGUkZVRlDWQsbFNfB2gedw=="
                        java.lang.String r5 = "9cPozgdX"
                        java.lang.String r4 = ea.a.p(r4, r5)
                        tn.a.b(r2, r3, r4)
                    L2a:
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        am.c r2 = r2.c2()
                        android.widget.TextView r2 = r2.f782m
                        r2.setVisibility(r1)
                        goto L43
                    L36:
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        int r3 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.A
                        am.c r2 = r2.c2()
                        android.widget.TextView r2 = r2.f782m
                        r2.setVisibility(r0)
                    L43:
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r2 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        am.c r2 = r2.c2()
                        android.widget.CheckBox r2 = r2.f773d
                        if (r7 <= 0) goto L60
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r3 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c r3 = r3.f24398v
                        r4 = 1
                        if (r3 == 0) goto L5c
                        int r3 = r3.getItemCount()
                        if (r7 != r3) goto L5c
                        r7 = r4
                        goto L5d
                    L5c:
                        r7 = r1
                    L5d:
                        if (r7 == 0) goto L60
                        goto L61
                    L60:
                        r4 = r1
                    L61:
                        r2.setChecked(r4)
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r7 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        boolean r2 = r7.f24399w
                        if (r2 == 0) goto L9c
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c r7 = r7.f24398v
                        if (r7 == 0) goto L73
                        int r7 = r7.getItemCount()
                        goto L74
                    L73:
                        r7 = r1
                    L74:
                        if (r7 > 0) goto L9c
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r7 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        r7.b2()
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r7 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        am.c r7 = r7.c2()
                        androidx.appcompat.widget.AppCompatImageView r7 = r7.f776g
                        r7.setVisibility(r0)
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r7 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        am.c r7 = r7.c2()
                        android.widget.LinearLayout r7 = r7.f778i
                        r7.setVisibility(r0)
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity r7 = pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity.this
                        am.c r7 = r7.c2()
                        androidx.constraintlayout.widget.Group r7 = r7.f774e
                        r7.setVisibility(r1)
                    L9c:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$6.invoke(int):void");
                }
            };
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar2 = this.f24398v;
        if (cVar2 != null) {
            cVar2.f24703e = new cg.p<Integer, AIFileEntity, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$7
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(Integer num, AIFileEntity aIFileEntity) {
                    invoke(num.intValue(), aIFileEntity);
                    return tf.d.f30009a;
                }

                public final void invoke(int i10, AIFileEntity item) {
                    kotlin.jvm.internal.g.e(item, "item");
                    AIHistoryActivity aIHistoryActivity = AIHistoryActivity.this;
                    if (aIHistoryActivity.f24399w) {
                        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar3 = aIHistoryActivity.f24398v;
                        if (cVar3 != null) {
                            ArrayList arrayList = cVar3.f24694h;
                            if (arrayList.contains(item)) {
                                arrayList.remove(item);
                            } else {
                                arrayList.add(item);
                            }
                            cg.l<? super Integer, tf.d> lVar = cVar3.f24695i;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(arrayList.size()));
                            }
                            cVar3.notifyItemChanged(i10);
                            return;
                        }
                        return;
                    }
                    tn.a.b(aIHistoryActivity, ea.a.p("KWk=", "LiH7VdnB"), ea.a.p("LmlZaQp0WHIjXyxpGWU3Y1lpDWs=", "D2GA1QXt"));
                    tn.a.b(AIHistoryActivity.this, ea.a.p("Umk=", "6isA3SZS"), ea.a.p("UmkjaQB0DXILX1doCHQJcyxvdw==", "p6c0l9lL"));
                    AIHistoryDetailActivity.a aVar = AIHistoryDetailActivity.A;
                    AIHistoryActivity aIHistoryActivity2 = AIHistoryActivity.this;
                    long id2 = item.getId();
                    aVar.getClass();
                    if (aIHistoryActivity2 != null) {
                        Intent intent = new Intent(aIHistoryActivity2, AIHistoryDetailActivity.class);
                        intent.putExtra(ea.a.p("F0kVRg5MNF8BRA==", "prVJGqeg"), id2);
                        aIHistoryActivity2.startActivity(intent);
                    }
                }
            };
        }
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar3 = this.f24398v;
        if (cVar3 != null) {
            cVar3.f24696j = new cg.p<AIFileEntity, Integer, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$initView$8
                {
                    super(2);
                }

                @Override // cg.p
                public /* bridge */ /* synthetic */ tf.d invoke(AIFileEntity aIFileEntity, Integer num) {
                    invoke(aIFileEntity, num.intValue());
                    return tf.d.f30009a;
                }

                public final void invoke(AIFileEntity item, int i10) {
                    kotlin.jvm.internal.g.e(item, "item");
                    AIHistoryActivity.a2(AIHistoryActivity.this);
                }
            };
        }
        this.f24396t.postDelayed(this.f24401y, 500L);
        AIDataBase aIDataBase = km.e.f19907a;
        pdf.pdfreader.viewer.editor.free.utils.w0.a().f28790a.execute(new androidx.activity.i(new cg.l<List<? extends AIFileEntity>, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHistoryActivity$getData$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(List<? extends AIFileEntity> list) {
                invoke2(list);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends AIFileEntity> list) {
                AIHistoryActivity aIHistoryActivity = AIHistoryActivity.this;
                Handler handler = aIHistoryActivity.f24396t;
                handler.removeCallbacks(aIHistoryActivity.f24401y);
                if (aIHistoryActivity.c2().f780k.c.getVisibility() == 0) {
                    long currentTimeMillis = System.currentTimeMillis() - aIHistoryActivity.f24400x;
                    if (currentTimeMillis >= 300) {
                        aIHistoryActivity.c2().f780k.c.setVisibility(8);
                    } else {
                        handler.postDelayed(aIHistoryActivity.f24402z, ((long) OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT) - currentTimeMillis);
                    }
                } else {
                    aIHistoryActivity.c2().f780k.c.setVisibility(8);
                }
                AIHistoryActivity aIHistoryActivity2 = AIHistoryActivity.this;
                aIHistoryActivity2.getClass();
                List<? extends AIFileEntity> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    tn.a.d(aIHistoryActivity2, ea.a.p("KWk=", "kMHgqHss"), ea.a.p("LmlZaQp0WHIjXzloGnc=", "LhhjpkwZ"), ea.a.p("IW8=", "CEkRElr2"), false);
                    aIHistoryActivity2.c2().f776g.setVisibility(8);
                    aIHistoryActivity2.c2().f778i.setVisibility(8);
                    aIHistoryActivity2.c2().f774e.setVisibility(0);
                    pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar4 = aIHistoryActivity2.f24398v;
                    if (cVar4 != null) {
                        cVar4.j(new ArrayList());
                        return;
                    }
                    return;
                }
                tn.a.d(aIHistoryActivity2, ea.a.p("Umk=", "Amn6l1zS"), ea.a.p("LmlZaQp0WHIjXzloGnc=", "XVv34lQU"), ea.a.p("SmVz", "WG1y0ikL"), false);
                aIHistoryActivity2.c2().f776g.setVisibility(0);
                aIHistoryActivity2.c2().f778i.setVisibility(8);
                aIHistoryActivity2.c2().f774e.setVisibility(8);
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar5 = aIHistoryActivity2.f24398v;
                if (cVar5 != null) {
                    cVar5.j(list);
                }
            }
        }, 28));
    }

    public final void b2() {
        this.f24399w = false;
        c2().f776g.setVisibility(0);
        c2().f778i.setVisibility(8);
        c2().f782m.setVisibility(8);
        pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c cVar = this.f24398v;
        if (cVar != null) {
            cVar.f24694h.clear();
            cVar.f24693g = false;
            cg.l<? super Integer, tf.d> lVar = cVar.f24695i;
            if (lVar != null) {
                lVar.invoke(0);
            }
            cVar.notifyDataSetChanged();
        }
    }

    public final am.c c2() {
        return (am.c) this.f24397u.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f24399w) {
            b2();
        } else {
            super.onBackPressed();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (this.f19294h && new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(c2().f781l);
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
        Handler handler = this.f24396t;
        handler.removeCallbacks(this.f24401y);
        handler.removeCallbacks(this.f24402z);
    }

    @Override // jl.a
    public final void C1() {
    }
}
