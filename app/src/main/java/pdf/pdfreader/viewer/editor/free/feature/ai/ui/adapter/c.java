package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import am.i1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.l;
import cg.p;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import kotlin.text.j;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIFileEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.c;
import pdf.pdfreader.viewer.editor.free.utils.v;

/* compiled from: AIHistoryAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends f<AIFileEntity, i1> {

    /* renamed from: f  reason: collision with root package name */
    public SimpleDateFormat f24692f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24693g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f24694h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public l<? super Integer, tf.d> f24695i;

    /* renamed from: j  reason: collision with root package name */
    public p<? super AIFileEntity, ? super Integer, tf.d> f24696j;

    /* compiled from: AIHistoryAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends g<AIFileEntity, i1> {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f24697d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, i1 i1Var) {
            super(i1Var);
            kotlin.jvm.internal.g.e(i1Var, ea.a.p("DWlYZC9uZw==", "iGo6F9JC"));
            this.f24697d = cVar;
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.g
        public final void l(final int i10, AIFileEntity aIFileEntity) {
            String str;
            final AIFileEntity aIFileEntity2 = aIFileEntity;
            int fileType = aIFileEntity2.getFileType();
            V v10 = this.f24704b;
            if (fileType == 701) {
                ((i1) v10).f979d.setImageResource(R.drawable.ic_home_pdf2);
            } else {
                if (aIFileEntity2.getFilePath() != null) {
                    String filePath = aIFileEntity2.getFilePath();
                    kotlin.jvm.internal.g.d(filePath, ea.a.p("WnQubV1mC2wXUFV0aA==", "vM8VfShq"));
                    if (j.F(filePath, ea.a.p("MXN2", "9ZRbZjYY"), false)) {
                        ((i1) v10).f979d.setImageResource(R.drawable.ic_home_csv2);
                    }
                }
                ((i1) v10).f979d.setImageResource(R.drawable.ic_home_doc2);
            }
            final c cVar = this.f24697d;
            SimpleDateFormat simpleDateFormat = cVar.f24692f;
            Context context = this.c;
            if (simpleDateFormat == null) {
                cVar.f24692f = new SimpleDateFormat(ea.a.p("PUgDbT8gA01nZAIvTXkueQ==", "uju9RNQB"), context.getResources().getConfiguration().locale);
            }
            SimpleDateFormat simpleDateFormat2 = cVar.f24692f;
            if (simpleDateFormat2 != null) {
                str = simpleDateFormat2.format(Long.valueOf(aIFileEntity2.getUploadTime()));
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            aIFileEntity2.getFilePath();
            String t4 = v.t(context, aIFileEntity2.getFileSize());
            i1 i1Var = (i1) v10;
            AppCompatTextView appCompatTextView = i1Var.c;
            appCompatTextView.setText(str + " · " + t4);
            i1Var.f980e.setText(aIFileEntity2.getFileName());
            boolean z10 = cVar.f24693g;
            View view = i1Var.f983h;
            ConstraintLayout constraintLayout = i1Var.f982g;
            AppCompatImageView appCompatImageView = i1Var.f981f;
            if (z10) {
                constraintLayout.setBackgroundResource(R.drawable.ripple_ai_history_normal_item);
                appCompatImageView.setVisibility(0);
                if (cVar.f24694h.contains(aIFileEntity2)) {
                    view.setVisibility(0);
                    appCompatImageView.setImageResource(R.drawable.ic_home_selected);
                } else {
                    view.setVisibility(8);
                    appCompatImageView.setImageResource(R.drawable.ic_split_unselected);
                }
            } else {
                constraintLayout.setBackgroundResource(R.drawable.ripple_ai_history_normal_item);
                view.setVisibility(8);
                appCompatImageView.setVisibility(8);
            }
            constraintLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean z11;
                    String p10 = ea.a.p("R2gic1cw", "sQt8LXba");
                    c cVar2 = c.this;
                    kotlin.jvm.internal.g.e(cVar2, p10);
                    String p11 = ea.a.p("R2gic1cx", "1PnYJeSu");
                    c.a aVar = this;
                    kotlin.jvm.internal.g.e(aVar, p11);
                    String p12 = ea.a.p("F2k_ZW0=", "5XHVIT1I");
                    AIFileEntity aIFileEntity3 = aIFileEntity2;
                    kotlin.jvm.internal.g.e(aIFileEntity3, p12);
                    int itemCount = cVar2.getItemCount();
                    int adapterPosition = aVar.getAdapterPosition();
                    if (adapterPosition >= 0 && adapterPosition < itemCount) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        ArrayList arrayList = cVar2.f24694h;
                        if (!arrayList.contains(aIFileEntity3)) {
                            arrayList.add(aIFileEntity3);
                            l<? super Integer, tf.d> lVar = cVar2.f24695i;
                            if (lVar != null) {
                                lVar.invoke(Integer.valueOf(arrayList.size()));
                            }
                        }
                        if (!cVar2.f24693g) {
                            cVar2.f24693g = true;
                            p<? super AIFileEntity, ? super Integer, tf.d> pVar = cVar2.f24696j;
                            if (pVar != null) {
                                pVar.invoke(aIFileEntity3, Integer.valueOf(aVar.getAdapterPosition()));
                            }
                        }
                        cVar2.notifyItemChanged(i10);
                    }
                    return true;
                }
            });
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final i1 h(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = layoutInflater.inflate(R.layout.item_ai_history, parent, false);
        int i10 = R.id.bottom_line;
        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_line);
        if (u7 != null) {
            i10 = R.id.item_date;
            AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_date);
            if (appCompatTextView != null) {
                i10 = R.id.item_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_icon);
                if (appCompatImageView != null) {
                    i10 = R.id.item_name;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_name);
                    if (appCompatTextView2 != null) {
                        i10 = R.id.item_pdf_ck;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_pdf_ck);
                        if (appCompatImageView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                            i10 = R.id.select_bg_view;
                            View u10 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.select_bg_view);
                            if (u10 != null) {
                                i1 i1Var = new i1(constraintLayout, u7, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatImageView2, constraintLayout, u10);
                                ea.a.p("Jm5XbBh0Uig2YTNvAHQhblNsD3QgckkgN2EcZTx0fiApYV1zHCk=", "AKGLGnRR");
                                return i1Var;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpEGhISTE6IA==", "dhuT2TMa").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter.f
    public final g<AIFileEntity, i1> i(i1 i1Var) {
        i1 binding = i1Var;
        kotlin.jvm.internal.g.e(binding, "binding");
        return new a(this, binding);
    }
}
