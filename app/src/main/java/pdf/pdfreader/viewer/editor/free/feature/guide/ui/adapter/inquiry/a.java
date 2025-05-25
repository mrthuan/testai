package pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry;

import am.k1;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.f;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.l;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import qm.b;
import tf.c;
import tf.d;

/* compiled from: InquiryAfterGuideListAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<C0340a> {

    /* renamed from: d  reason: collision with root package name */
    public final List<b> f24990d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24991e;

    /* renamed from: f  reason: collision with root package name */
    public final l<Set<Integer>, d> f24992f;

    /* renamed from: g  reason: collision with root package name */
    public final c f24993g;

    /* renamed from: h  reason: collision with root package name */
    public final c f24994h;

    /* compiled from: InquiryAfterGuideListAdapter.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0340a extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final k1 f24995b;
        public final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0340a(a aVar, k1 k1Var) {
            super(k1Var.f1031b);
            ea.a.p("UWklZBpuZw==", "3tid3KaX");
            this.c = aVar;
            this.f24995b = k1Var;
        }

        public final void l(int i10) {
            k1 k1Var = this.f24995b;
            ConstraintLayout a10 = k1Var.a();
            a aVar = this.c;
            a10.setSelected(aVar.h().contains(Integer.valueOf(i10)));
            k1Var.f1032d.setSelected(aVar.h().contains(Integer.valueOf(i10)));
            ((TextView) k1Var.c).setSelected(aVar.h().contains(Integer.valueOf(i10)));
        }
    }

    public a(List list, l lVar, boolean z10) {
        g.e(list, ea.a.p("WnQubXM=", "4hAq3ars"));
        ea.a.p("XG4CdBZtMWUeZVd0", "obep58YS");
        this.f24990d = list;
        this.f24991e = z10;
        this.f24992f = lVar;
        this.f24993g = kotlin.a.a(new cg.a<HashSet<Integer>>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.InquiryAfterGuideListAdapter$selectIndexSet$2
            @Override // cg.a
            public final HashSet<Integer> invoke() {
                return new HashSet<>();
            }
        });
        this.f24994h = kotlin.a.a(new cg.a<Object>() { // from class: pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.InquiryAfterGuideListAdapter$refreshSelectPayloads$2
            @Override // cg.a
            public final Object invoke() {
                return new Object();
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f24990d.size();
    }

    public final HashSet<Integer> h() {
        return (HashSet) this.f24993g.getValue();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void i(Set<Integer> recordIndex) {
        g.e(recordIndex, "recordIndex");
        boolean isEmpty = recordIndex.isEmpty();
        l<Set<Integer>, d> lVar = this.f24992f;
        if (isEmpty) {
            lVar.invoke(EmptySet.INSTANCE);
            return;
        }
        h().clear();
        h().addAll(recordIndex);
        lVar.invoke(h());
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0340a c0340a, final int i10) {
        final C0340a holder = c0340a;
        g.e(holder, "holder");
        b entity = this.f24990d.get(i10);
        g.e(entity, "entity");
        holder.l(i10);
        k1 k1Var = holder.f24995b;
        ((TextView) k1Var.c).setText(entity.f29387b);
        k1Var.f1032d.setImageResource(entity.f29386a);
        ConstraintLayout a10 = k1Var.a();
        final a aVar = holder.c;
        a10.setOnClickListener(new View.OnClickListener() { // from class: sm.a
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    java.lang.String r8 = "R2gic1cw"
                    java.lang.String r0 = "d0dafdLA"
                    java.lang.String r8 = ea.a.p(r8, r0)
                    pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a r0 = pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a.this
                    kotlin.jvm.internal.g.e(r0, r8)
                    java.lang.String r8 = "O2hYc10x"
                    java.lang.String r1 = "O6NdEKCU"
                    java.lang.String r8 = ea.a.p(r8, r1)
                    pdf.pdfreader.viewer.editor.free.feature.guide.ui.adapter.inquiry.a$a r1 = r3
                    kotlin.jvm.internal.g.e(r1, r8)
                    boolean r8 = r0.f24991e
                    int r2 = r2
                    if (r8 == 0) goto La0
                    java.util.HashSet r8 = r0.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    boolean r8 = r8.contains(r3)
                    tf.c r3 = r0.f24994h
                    if (r8 == 0) goto L40
                    java.util.HashSet r8 = r0.h()
                    r8.clear()
                    java.lang.Object r8 = r3.getValue()
                    r0.notifyItemChanged(r2, r8)
                    goto Lc8
                L40:
                    java.util.HashSet r8 = r0.h()
                    java.lang.String r4 = "<this>"
                    kotlin.jvm.internal.g.e(r8, r4)
                    boolean r4 = r8 instanceof java.util.List
                    r5 = 0
                    if (r4 == 0) goto L5c
                    java.util.List r8 = (java.util.List) r8
                    boolean r4 = r8.isEmpty()
                    if (r4 == 0) goto L57
                    goto L66
                L57:
                    java.lang.Object r8 = r8.get(r5)
                    goto L6c
                L5c:
                    java.util.Iterator r8 = r8.iterator()
                    boolean r4 = r8.hasNext()
                    if (r4 != 0) goto L68
                L66:
                    r8 = 0
                    goto L6c
                L68:
                    java.lang.Object r8 = r8.next()
                L6c:
                    java.lang.Integer r8 = (java.lang.Integer) r8
                    if (r8 == 0) goto L75
                    int r8 = r8.intValue()
                    goto L76
                L75:
                    r8 = -1
                L76:
                    java.util.HashSet r4 = r0.h()
                    r4.clear()
                    java.util.HashSet r4 = r0.h()
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                    r4.add(r6)
                    r1.l(r2)
                    if (r8 < 0) goto L96
                    java.util.List<qm.b> r1 = r0.f24990d
                    int r1 = r1.size()
                    if (r8 >= r1) goto L96
                    r5 = 1
                L96:
                    if (r5 == 0) goto Lc8
                    java.lang.Object r1 = r3.getValue()
                    r0.notifyItemChanged(r8, r1)
                    goto Lc8
                La0:
                    java.util.HashSet r8 = r0.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    boolean r8 = r8.contains(r3)
                    if (r8 == 0) goto Lba
                    java.util.HashSet r8 = r0.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r8.remove(r3)
                    goto Lc5
                Lba:
                    java.util.HashSet r8 = r0.h()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                    r8.add(r3)
                Lc5:
                    r1.l(r2)
                Lc8:
                    java.util.HashSet r8 = r0.h()
                    cg.l<java.util.Set<java.lang.Integer>, tf.d> r0 = r0.f24992f
                    r0.invoke(r8)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: sm.a.onClick(android.view.View):void");
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0340a onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        View i11 = f.i(parent, R.layout.item_inquiry_after_guide, parent, false);
        int i12 = R.id.contentTv;
        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(i11, R.id.contentTv);
        if (textView != null) {
            i12 = R.id.logoIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(i11, R.id.logoIv);
            if (appCompatImageView != null) {
                k1 k1Var = new k1((ConstraintLayout) i11, textView, appCompatImageView, 1);
                ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1mtYDcLlZvPnRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "Wz5PtFqt");
                return new C0340a(this, k1Var);
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpPWhxSTE6IA==", "LjGKIQuJ").concat(i11.getResources().getResourceName(i12)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0340a c0340a, int i10, List payloads) {
        C0340a holder = c0340a;
        g.e(holder, "holder");
        g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
        } else {
            holder.l(i10);
        }
    }
}
