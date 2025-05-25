package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import am.c3;
import am.d3;
import am.e3;
import am.f3;
import am.g3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import cg.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.m;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIChatRobotInfoView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIErrorRetryView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIQuickTagView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: AIChatAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<g<km.a, ?>> {

    /* renamed from: d  reason: collision with root package name */
    public boolean f24675d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f24676e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public l<? super Integer, tf.d> f24677f;

    /* renamed from: g  reason: collision with root package name */
    public p<? super Integer, ? super AIQuickTag, tf.d> f24678g;

    /* renamed from: h  reason: collision with root package name */
    public l<? super km.a, tf.d> f24679h;

    /* renamed from: i  reason: collision with root package name */
    public l<? super km.a, tf.d> f24680i;

    /* renamed from: j  reason: collision with root package name */
    public l<? super String, tf.d> f24681j;

    /* renamed from: k  reason: collision with root package name */
    public l<? super km.a, tf.d> f24682k;

    /* renamed from: l  reason: collision with root package name */
    public p<? super Integer, ? super km.a, tf.d> f24683l;

    /* renamed from: m  reason: collision with root package name */
    public p<? super Integer, ? super km.a, tf.d> f24684m;

    /* renamed from: n  reason: collision with root package name */
    public p<? super Integer, ? super List<AIQuickTag>, tf.d> f24685n;

    /* renamed from: o  reason: collision with root package name */
    public cg.a<tf.d> f24686o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f24687p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f24688q;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24676e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        km.a aVar = (km.a) m.t0(i10, this.f24676e);
        if (aVar != null) {
            return aVar.f19875e;
        }
        return -1;
    }

    public final int h(km.a sendInfo, km.a aVar) {
        kotlin.jvm.internal.g.e(sendInfo, "sendInfo");
        ArrayList arrayList = this.f24676e;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, sendInfo.c)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            int i11 = i10 + 1;
            arrayList.add(i11, aVar);
            notifyItemChanged(i10);
            notifyItemInserted(i11);
            return i11;
        }
        arrayList.add(aVar);
        notifyItemInserted(arrayList.size() - 1);
        return arrayList.size() - 1;
    }

    public final int i(km.a chatInfo) {
        kotlin.jvm.internal.g.e(chatInfo, "chatInfo");
        ArrayList arrayList = this.f24676e;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, chatInfo.c)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 != -1) {
            arrayList.set(i10, chatInfo);
            notifyItemChanged(i10);
            return i10;
        }
        arrayList.add(chatInfo);
        notifyItemInserted(arrayList.size() - 1);
        return arrayList.size() - 1;
    }

    public final km.a j() {
        Object obj;
        boolean z10;
        Iterator it = this.f24676e.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((km.a) obj).f19875e == 100) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (km.a) obj;
    }

    public final int k() {
        boolean z10;
        Iterator it = this.f24676e.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            km.a aVar = (km.a) it.next();
            if (aVar.f19875e == 102 && !aVar.f19895y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    public final void l(km.a item) {
        kotlin.jvm.internal.g.e(item, "item");
        Iterator it = this.f24676e.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, item.c)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0) {
            notifyItemChanged(i10);
        }
    }

    public final void m(km.a aVar) {
        ArrayList arrayList = this.f24676e;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (kotlin.jvm.internal.g.a(((km.a) it.next()).c, aVar.c)) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        arrayList.remove(aVar);
        notifyItemRemoved(i10);
    }

    public final void n(List<km.a> newData) {
        kotlin.jvm.internal.g.e(newData, "newData");
        ArrayList arrayList = this.f24676e;
        arrayList.clear();
        arrayList.addAll(newData);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(g<km.a, ?> gVar, final int i10) {
        g<km.a, ?> holder = gVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        final km.a aVar = (km.a) m.t0(i10, this.f24676e);
        if (aVar != null) {
            if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.d) {
                ((pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.d) holder).f24722d = this.f24675d;
                this.f24675d = true;
            } else if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.b) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.b bVar = (pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.b) holder;
                bVar.f24711f = new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.AIChatAdapter$onBindViewHolder$1
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
                        l<? super Integer, tf.d> lVar = a.this.f24677f;
                        if (lVar != null) {
                            lVar.invoke(Integer.valueOf(i10));
                        }
                    }
                };
                bVar.f24712g = new l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.AIChatAdapter$onBindViewHolder$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar2) {
                        invoke2(aVar2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(km.a it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        p<? super Integer, ? super km.a, tf.d> pVar = a.this.f24684m;
                        if (pVar != null) {
                            pVar.invoke(Integer.valueOf(i10), aVar);
                        }
                    }
                };
                bVar.f24713h = this.f24680i;
                bVar.f24715j = this.f24682k;
                bVar.f24714i = this.f24681j;
                bVar.f24716k = this.f24686o;
            } else if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.c) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.c cVar = (pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.c) holder;
                cVar.f24721f = this.f24679h;
                cVar.f24719d = this.f24687p;
                cVar.f24720e = new l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.AIChatAdapter$onBindViewHolder$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar2) {
                        invoke2(aVar2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(km.a it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        p<? super Integer, ? super km.a, tf.d> pVar = a.this.f24683l;
                        if (pVar != null) {
                            pVar.invoke(Integer.valueOf(i10), aVar);
                        }
                    }
                };
            } else if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.f) {
                ((pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.f) holder).f24725d = new l<km.a, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.AIChatAdapter$onBindViewHolder$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cg.l
                    public /* bridge */ /* synthetic */ tf.d invoke(km.a aVar2) {
                        invoke2(aVar2);
                        return tf.d.f30009a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(km.a it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        p<? super Integer, ? super km.a, tf.d> pVar = a.this.f24683l;
                        if (pVar != null) {
                            pVar.invoke(Integer.valueOf(i10), aVar);
                        }
                    }
                };
            } else if (holder instanceof pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.e) {
                pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.e eVar = (pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.e) holder;
                eVar.f24723d = this.f24678g;
                eVar.f24724e = this.f24685n;
            }
            holder.l(i10, aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final g<km.a, ?> onCreateViewHolder(ViewGroup parent, int i10) {
        g<km.a, ?> bVar;
        kotlin.jvm.internal.g.e(parent, "parent");
        switch (i10) {
            case 101:
                View i11 = androidx.activity.f.i(parent, R.layout.list_item_ai_chat_send, parent, false);
                int i12 = R.id.send_ai_err_view;
                AIErrorRetryView aIErrorRetryView = (AIErrorRetryView) com.google.android.play.core.assetpacks.c.u(i11, R.id.send_ai_err_view);
                if (aIErrorRetryView != null) {
                    i12 = R.id.send_failed;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i11, R.id.send_failed);
                    if (appCompatImageView != null) {
                        i12 = R.id.send_progress;
                        ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(i11, R.id.send_progress);
                        if (progressView != null) {
                            i12 = R.id.send_tv_msg;
                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.send_tv_msg);
                            if (textView != null) {
                                g3 g3Var = new g3((LinearLayout) i11, aIErrorRetryView, appCompatImageView, progressView, textView);
                                ea.a.p("Wm4tbBJ0Byh4IBQgSSB2IGQgEiBmIGMgoYDtIBFmN2xAZUEgUyBCIFIgFCBJIHYgZCASKQ==", "CK1VT5Rn");
                                return new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.f(g3Var);
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("D2kEczNuBSA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "Z1BwZb7e").concat(i11.getResources().getResourceName(i12)));
            case 102:
                View i13 = androidx.activity.f.i(parent, R.layout.list_item_ai_chat_answer, parent, false);
                int i14 = R.id.ai_answer_view;
                AIAnswerView aIAnswerView = (AIAnswerView) com.google.android.play.core.assetpacks.c.u(i13, R.id.ai_answer_view);
                if (aIAnswerView != null) {
                    i14 = R.id.ai_chat_limit;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(i13, R.id.ai_chat_limit);
                    if (textView2 != null) {
                        c3 c3Var = new c3((LinearLayout) i13, aIAnswerView, textView2);
                        ea.a.p("Jm5XbBh0UihQIGogVSBIIBUgTiBlIEUg0YDNbANlWyBvIBEgWSAXIHogaiBVIEggFSBOKQ==", "iijy3kpQ");
                        bVar = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.b(c3Var, this.f24688q);
                        break;
                    }
                }
                throw new NullPointerException(ea.a.p("BWkqc1BuKyA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "znHY9Lx8").concat(i13.getResources().getResourceName(i14)));
            case 103:
                View i15 = androidx.activity.f.i(parent, R.layout.list_item_ai_chat_introduction, parent, false);
                if (i15 != null) {
                    AIChatRobotInfoView aIChatRobotInfoView = (AIChatRobotInfoView) i15;
                    e3 e3Var = new e3(aIChatRobotInfoView, aIChatRobotInfoView);
                    ea.a.p("Jm5XbBh0UihQIGogVSBIIBUgTiBlIEUghICQIGpmVWw8ZTsgWSAXIHogaiBVIEggFSBOKQ==", "Yf3Of6J4");
                    return new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.d(e3Var, this.f24675d);
                }
                throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "Iula37Px"));
            case 104:
                View i16 = androidx.activity.f.i(parent, R.layout.list_item_ai_chat_quick_tag, parent, false);
                if (i16 != null) {
                    AIQuickTagView aIQuickTagView = (AIQuickTagView) i16;
                    f3 f3Var = new f3(aIQuickTagView, aIQuickTagView);
                    ea.a.p("Wm4tbBJ0Byh4IBQgSSB2IGQgEiBmIGMgsoD_IG5mC2xAZUEgUyBCIFIgFCBJIHYgZCASKQ==", "PYNjSpFQ");
                    return new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.e(f3Var);
                }
                throw new NullPointerException(ea.a.p("QW8kdCVpB3c=", "DlgTaBTv"));
            default:
                View i17 = androidx.activity.f.i(parent, R.layout.list_item_ai_chat_file, parent, false);
                int i18 = R.id.ai_error_retry_view;
                AIErrorRetryView aIErrorRetryView2 = (AIErrorRetryView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_error_retry_view);
                if (aIErrorRetryView2 != null) {
                    i18 = R.id.ai_file_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_container);
                    if (constraintLayout != null) {
                        i18 = R.id.ai_file_iv_icon;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_iv_icon);
                        if (appCompatImageView2 != null) {
                            i18 = R.id.ai_file_progress_upload_loading;
                            ProgressView progressView2 = (ProgressView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_progress_upload_loading);
                            if (progressView2 != null) {
                                i18 = R.id.ai_file_tv_name;
                                TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_tv_name);
                                if (textView3 != null) {
                                    i18 = R.id.ai_file_tv_upload_cancel_or_retry;
                                    TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_tv_upload_cancel_or_retry);
                                    if (textView4 != null) {
                                        i18 = R.id.ai_file_tv_upload_failed;
                                        TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_tv_upload_failed);
                                        if (textView5 != null) {
                                            i18 = R.id.ai_file_tv_upload_file_size;
                                            TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_tv_upload_file_size);
                                            if (textView6 != null) {
                                                i18 = R.id.ai_file_tv_upload_loading;
                                                TextView textView7 = (TextView) com.google.android.play.core.assetpacks.c.u(i17, R.id.ai_file_tv_upload_loading);
                                                if (textView7 != null) {
                                                    d3 d3Var = new d3((LinearLayout) i17, aIErrorRetryView2, constraintLayout, appCompatImageView2, progressView2, textView3, textView4, textView5, textView6, textView7);
                                                    ea.a.p("UW4gbAh0JihCIEYgFCB3IBggciBpIBYgloDXbCJlSCAYIGYgSSBjIGggRiAUIHcgGCByKQ==", "WB8FiC7I");
                                                    bVar = new pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.vh.c(d3Var);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpTGgTSTM6IA==", "83wHI5aq").concat(i17.getResources().getResourceName(i18)));
        }
        return bVar;
    }
}
