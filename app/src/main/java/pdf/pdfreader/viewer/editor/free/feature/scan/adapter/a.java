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
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.n;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: PopCropTypeAdapter.kt */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.Adapter<b> {

    /* renamed from: d  reason: collision with root package name */
    public final int f25635d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f25636e;

    /* renamed from: f  reason: collision with root package name */
    public final InterfaceC0346a f25637f;

    /* compiled from: PopCropTypeAdapter.kt */
    /* renamed from: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0346a {
        void a(int i10);
    }

    /* compiled from: PopCropTypeAdapter.kt */
    /* loaded from: classes3.dex */
    public final class b extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final u1 f25638b;
        public final /* synthetic */ a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar, u1 u1Var) {
            super(u1Var.f1507a);
            ea.a.p("WnQubTFpDGQbbmc=", "xuKQXGGa");
            this.c = aVar;
            this.f25638b = u1Var;
        }
    }

    public a(int i10, List list, n nVar) {
        g.e(list, ea.a.p("UG8ldBZudA==", "Jtw0Nvm0"));
        ea.a.p("X2k4dBZuB3I=", "UnZSUhNL");
        this.f25635d = i10;
        this.f25636e = list;
        this.f25637f = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f25636e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, final int i10) {
        final boolean z10;
        b holder = bVar;
        g.e(holder, "holder");
        u1 u1Var = holder.f25638b;
        Context context = u1Var.f1507a.getContext();
        final a aVar = holder.c;
        if (aVar.f25635d == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.adapter.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String p10;
                String p11 = ea.a.p("Hmghc3Qw", "AijHPFdG");
                a aVar2 = aVar;
                g.e(aVar2, p11);
                boolean z11 = z10;
                int i11 = i10;
                if (!z11) {
                    Context a10 = ScanEventCenter.a();
                    String p12 = ea.a.p("PGNQbiZzUnQuaSRn", "zwrbsecd");
                    String p13 = ea.a.p("QGMqbgBlFl8RcltwNmQ5bmU=", "lACIJfsS");
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                p10 = ea.a.p("VnYucnk=", "oUBuT5ez");
                            } else {
                                p10 = ea.a.p("XmEldRJs", "FA75fNW6");
                            }
                        } else {
                            p10 = ea.a.p("LnVFbw==", "icIuWh4n");
                        }
                    } else {
                        p10 = ea.a.p("VnYucnk=", "Hq5TI2is");
                    }
                    tn.a.d(a10, p12, p13, p10, false);
                }
                aVar2.f25637f.a(i11);
            }
        });
        TextView textView = u1Var.f1508b;
        textView.setText(aVar.f25636e.get(i10));
        int i11 = aVar.f25635d;
        FrameLayout frameLayout = u1Var.f1507a;
        if (i11 == i10) {
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
        ea.a.p("Jm5XbBh0UigWYTNvAHQhblNsD3QgcktmjYCSLldvOXQqeEUpVSBHYShlJHRZIA5hWXMLKQ==", "cMtWo44W");
        return new b(this, a10);
    }
}
