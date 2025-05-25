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

/* compiled from: GraffitiColorAdapter.java */
/* loaded from: classes3.dex */
public final class c extends RecyclerView.Adapter<C0410c> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f31860d;

    /* renamed from: e  reason: collision with root package name */
    public int f31861e;

    /* renamed from: f  reason: collision with root package name */
    public b f31862f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f31863g = new ArrayList();

    /* compiled from: GraffitiColorAdapter.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31864a;

        static {
            int[] iArr = new int[ColorType.values().length];
            f31864a = iArr;
            try {
                iArr[ColorType.Black.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31864a[ColorType.White.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GraffitiColorAdapter.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(nl.f fVar, int i10);
    }

    /* compiled from: GraffitiColorAdapter.java */
    /* renamed from: xk.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0410c extends RecyclerView.b0 {

        /* renamed from: b  reason: collision with root package name */
        public final AddTextColorView f31865b;

        public C0410c(View view) {
            super(view);
            this.f31865b = (AddTextColorView) view.findViewById(R.id.sign_color_view);
        }
    }

    public c(Context context) {
        this.f31860d = context;
        zl.b.c.getClass();
        this.f31861e = zl.b.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f31863g.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(C0410c c0410c, int i10) {
        nl.f fVar;
        boolean z10;
        C0410c c0410c2 = c0410c;
        ArrayList arrayList = this.f31863g;
        if (i10 < arrayList.size()) {
            fVar = (nl.f) arrayList.get(i10);
        } else {
            fVar = null;
        }
        if (fVar != null) {
            AddTextColorView addTextColorView = c0410c2.f31865b;
            int i11 = this.f31861e;
            int i12 = fVar.f22603a;
            if (i12 == i11) {
                z10 = true;
            } else {
                z10 = false;
            }
            addTextColorView.setColorChecked(z10);
            AddTextColorView addTextColorView2 = c0410c2.f31865b;
            addTextColorView2.setCenterColor(i12);
            int i13 = a.f31864a[fVar.f22604b.ordinal()];
            Context context = this.f31860d;
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
            c0410c2.itemView.setOnClickListener(new xk.b(this, fVar, c0410c2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final C0410c onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new C0410c(LayoutInflater.from(this.f31860d).inflate(R.layout.list_item_sign_color, viewGroup, false));
    }
}
