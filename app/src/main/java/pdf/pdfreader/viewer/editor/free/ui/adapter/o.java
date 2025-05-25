package pdf.pdfreader.viewer.editor.free.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.adapter.o;

/* compiled from: ReasonTypeRCVAdapter.kt */
/* loaded from: classes3.dex */
public final class o extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final pn.a[] f27281d;

    /* renamed from: e  reason: collision with root package name */
    public final a f27282e;

    /* compiled from: ReasonTypeRCVAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* compiled from: ReasonTypeRCVAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final TextView f27283b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            ea.a.p("RWkudw==", "USqrVV6Z");
            View findViewById = view.findViewById(R.id.tv_type);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("RWkud11mC24WVl1lHkIvSSAoYC4vZG10HV8OeQVlKQ==", "kzuP4R75"));
            this.f27283b = (TextView) findViewById;
        }
    }

    public o(pn.a[] aVarArr, a aVar) {
        this.f27281d = aVarArr;
        this.f27282e = aVar;
    }

    public static void h(TextView textView, boolean z10) {
        if (textView != null) {
            if (z10) {
                textView.setBackgroundResource(R.drawable.feedback_shape_bg_button);
                textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), R.color.white));
                return;
            }
            textView.setBackgroundResource(R.drawable.feedback_shape_bg_button_gray);
            textView.setTextColor(androidx.core.content.a.getColor(textView.getContext(), R.color.feedbackDialogTextColor));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        pn.a[] aVarArr = this.f27281d;
        if (aVarArr != null) {
            return aVarArr.length;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, final int i10) {
        final b holder = bVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        pn.a[] aVarArr = this.f27281d;
        kotlin.jvm.internal.g.b(aVarArr);
        final pn.a aVar = aVarArr[i10];
        String str = aVar.f28984a;
        TextView textView = holder.f27283b;
        textView.setText(str);
        h(textView, aVar.f28985b);
        holder.itemView.setOnClickListener(new View.OnClickListener(this, holder, i10) { // from class: pdf.pdfreader.viewer.editor.free.ui.adapter.n

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ o f27280b;
            public final /* synthetic */ o.b c;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10 = ea.a.p("F2k_ZW0=", "6Kpc2B5L");
                pn.a aVar2 = pn.a.this;
                kotlin.jvm.internal.g.e(aVar2, p10);
                String p11 = ea.a.p("R2gic1cw", "PvzraMXp");
                o oVar = this.f27280b;
                kotlin.jvm.internal.g.e(oVar, p11);
                String p12 = ea.a.p("F2gkbBdlcg==", "e0EW2tp9");
                o.b bVar2 = this.c;
                kotlin.jvm.internal.g.e(bVar2, p12);
                boolean z10 = !aVar2.f28985b;
                aVar2.f28985b = z10;
                o.h(bVar2.f27283b, z10);
                o.a aVar3 = oVar.f27282e;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View i11 = androidx.activity.f.i(parent, R.layout.feedback_item_rcv_reason_type, parent, false);
        kotlin.jvm.internal.g.d(i11, ea.a.p("KXJebVFwVnI_bj4uFm8GdFB4GilraQtmlYDDYSlvO187eUFlVSBHYShlJHRZIA5hWXMLKQ==", "tcOoweZU"));
        return new b(i11);
    }
}
