package xk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.bean.ColorType;
import pdf.pdfreader.viewer.editor.free.ui.widget.AddTextColorView;

/* compiled from: SignColorAdapter.java */
/* loaded from: classes3.dex */
public final class g extends RecyclerView.Adapter<c> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f31877d;

    /* renamed from: e  reason: collision with root package name */
    public int f31878e;

    /* renamed from: f  reason: collision with root package name */
    public b f31879f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f31880g = new ArrayList();

    /* compiled from: SignColorAdapter.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31881a;

        static {
            int[] iArr = new int[ColorType.values().length];
            f31881a = iArr;
            try {
                iArr[ColorType.Black.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31881a[ColorType.White.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SignColorAdapter.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(nl.f fVar);
    }

    /* compiled from: SignColorAdapter.java */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final AddTextColorView f31882b;

        public c(View view) {
            super(view);
            this.f31882b = (AddTextColorView) view.findViewById(R.id.sign_color_view);
        }
    }

    public g(Context context) {
        this.f31877d = context;
        zl.b.c.getClass();
        this.f31878e = zl.b.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f31880g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c cVar, int i10) {
        nl.f fVar;
        boolean z10;
        c cVar2 = cVar;
        ArrayList arrayList = this.f31880g;
        if (i10 < arrayList.size()) {
            fVar = (nl.f) arrayList.get(i10);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AddTextColorView addTextColorView = cVar2.f31882b;
            int i11 = this.f31878e;
            int i12 = fVar.f22603a;
            if (i12 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            addTextColorView.setColorChecked(z10);
            AddTextColorView addTextColorView2 = cVar2.f31882b;
            addTextColorView2.setCenterColor(i12);
            int i13 = a.f31881a[fVar.f22604b.ordinal()];
            Context context = this.f31877d;
            if (i13 != 1) {
                if (i13 != 2) {
                    addTextColorView2.setCenterStrokeColor(0);
                    addTextColorView2.setColorFilter(androidx.core.content.a.getColor(context, R.color.white));
                } else {
                    addTextColorView2.setCenterStrokeColor(androidx.core.content.a.getColor(context, R.color.edit_color_2_stroke));
                    addTextColorView2.setColorFilter(androidx.core.content.a.getColor(context, R.color.black));
                }
            } else {
                addTextColorView2.setCenterStrokeColor(androidx.core.content.a.getColor(context, R.color.edit_color_1_stroke));
                addTextColorView2.setColorFilter(androidx.core.content.a.getColor(context, R.color.white));
            }
            cVar2.itemView.setOnClickListener(new f(this, fVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new c(LayoutInflater.from(this.f31877d).inflate(R.layout.list_item_sign_color, viewGroup, false));
    }
}
