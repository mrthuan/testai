package pdf.pdfreader.viewer.editor.free.feature.scan.adapter;

import am.u1;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.p;
import pdf.pdfreader.viewer.editor.free.scan.group.enumerate.GroupAiFilterType;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: PopFilterTypeAdapter.kt */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final List<GroupAiFilterType> f25670d;

    /* renamed from: e  reason: collision with root package name */
    public final a f25671e;

    /* compiled from: PopFilterTypeAdapter.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a(GroupAiFilterType groupAiFilterType);
    }

    /* compiled from: PopFilterTypeAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final u1 f25672b;
        public final /* synthetic */ c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, u1 u1Var) {
            super(u1Var.f1507a);
            ea.a.p("JnRUbTtpWWQzbmc=", "rvpk6nKe");
            this.c = cVar;
            this.f25672b = u1Var;
        }
    }

    public c(List list, p pVar) {
        g.e(list, ea.a.p("KWlddBxycw==", "jFT1cfNR"));
        ea.a.p("I2lCdBxuUnI=", "Nv3eOAbG");
        this.f25670d = list;
        this.f25671e = pVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25670d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i10) {
        final boolean z10;
        b holder = bVar;
        g.e(holder, "holder");
        final GroupAiFilterType groupAiFilterType = this.f25670d.get(i10);
        g.e(groupAiFilterType, "groupAiFilterType");
        u1 u1Var = holder.f25672b;
        Context context = u1Var.f1507a.getContext();
        jn.a.c.getClass();
        int j10 = jn.a.j();
        GroupAiFilterType groupAiFilterType2 = GroupAiFilterType.RAW;
        if (j10 != 0) {
            switch (j10) {
                case 2:
                    groupAiFilterType2 = GroupAiFilterType.SUPER_DOCS;
                    break;
                case 3:
                    groupAiFilterType2 = GroupAiFilterType.CUSTOM2;
                    break;
                case 4:
                    groupAiFilterType2 = GroupAiFilterType.SUPER_IMAGE;
                    break;
                case 5:
                    groupAiFilterType2 = GroupAiFilterType.BLEND_ALPHA;
                    break;
                case 6:
                    groupAiFilterType2 = GroupAiFilterType.CONTRAST;
                    break;
                case 7:
                    groupAiFilterType2 = GroupAiFilterType.CUSTOM_BW1;
                    break;
                case 8:
                    groupAiFilterType2 = GroupAiFilterType.CUSTOM_BW2;
                    break;
                case 9:
                    groupAiFilterType2 = GroupAiFilterType.GRAYSCALE;
                    break;
                case 10:
                    groupAiFilterType2 = GroupAiFilterType.REVERSE_COLOR;
                    break;
            }
        } else {
            groupAiFilterType2 = GroupAiFilterType.AUTO;
        }
        if (groupAiFilterType2 == groupAiFilterType) {
            z10 = true;
        } else {
            z10 = false;
        }
        View view = holder.itemView;
        final c cVar = holder.c;
        view.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                String p10 = ea.a.p("F2c5bwZwI2k0aVh0DHICeTRl", "vt8U8aep");
                GroupAiFilterType groupAiFilterType3 = groupAiFilterType;
                g.e(groupAiFilterType3, p10);
                String p11 = ea.a.p("O2hYc10w", "kjMiKgRD");
                c cVar2 = cVar;
                g.e(cVar2, p11);
                if (!z10) {
                    tn.a.d(ScanEventCenter.a(), ea.a.p("QGMqbixzB3QGaVpn", "qhG0nRp1"), ea.a.p("QGMqbgBlFl8UaVh0DHIJZCtuZQ==", "jD5N6877"), ScanEventCenter.b(groupAiFilterType3), false);
                }
                cVar2.f25671e.a(groupAiFilterType3);
            }
        });
        g.d(context, ea.a.p("GW82dC54dA==", "ETzXKqIJ"));
        String a10 = nn.b.a(context, groupAiFilterType);
        TextView textView = u1Var.f1508b;
        textView.setText(a10);
        FrameLayout frameLayout = u1Var.f1507a;
        if (z10) {
            textView.setTextColor(androidx.core.content.a.getColor(context, R.color.colorScanSettingContent));
            frameLayout.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.colorScanSettingSelectItemBackground));
            return;
        }
        textView.setTextColor(androidx.core.content.a.getColor(context, R.color.colorSurface));
        frameLayout.setBackgroundColor(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup parent, int i10) {
        g.e(parent, "parent");
        u1 a10 = u1.a(LayoutInflater.from(parent.getContext()), parent);
        ea.a.p("Wm4tbBJ0Byg-YU1vHHQfbiJsU3Qjcm1miYDqLjBvLHRWeD8pXyASYQBlWnRFIDBhKHNXKQ==", "kLSBdW1a");
        return new b(this, a10);
    }
}
