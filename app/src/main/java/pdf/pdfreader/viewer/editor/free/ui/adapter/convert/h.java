package pdf.pdfreader.viewer.editor.free.ui.adapter.convert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PdfOperateFinishAdapter.kt */
/* loaded from: classes3.dex */
public final class h extends RecyclerView.Adapter<a> {

    /* renamed from: d  reason: collision with root package name */
    public final Context f27199d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27200e;

    /* renamed from: f  reason: collision with root package name */
    public final String f27201f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f27202g;

    /* renamed from: h  reason: collision with root package name */
    public int f27203h;

    /* compiled from: PdfOperateFinishAdapter.kt */
    /* loaded from: classes3.dex */
    public final class a extends RecyclerView.b0 {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int f27204g = 0;

        /* renamed from: b  reason: collision with root package name */
        public final ImageView f27205b;
        public final TextView c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f27206d;

        /* renamed from: e  reason: collision with root package name */
        public final TextView f27207e;

        /* renamed from: f  reason: collision with root package name */
        public final View f27208f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, View view) {
            super(view);
            ea.a.p("WnQubSVpB3c=", "SY7UVmCn");
            View findViewById = view.findViewById(R.id.pdf_cover);
            kotlin.jvm.internal.g.d(findViewById, ea.a.p("EXQAbSNpLndmZg9uUFY-ZU9CK0ktKGQuHWRfcDVmHWMXdgByKQ==", "f7xeuKW7"));
            this.f27205b = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.pdf_name);
            kotlin.jvm.internal.g.d(findViewById2, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuB2RccCtmBW5SbS4p", "nrOZSSOw"));
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.check_iv);
            kotlin.jvm.internal.g.d(findViewById3, ea.a.p("JnRUbS9pUnd0ZiNuEVYBZUJCF0khKDcuM2QWYx5lCGsQaUcp", "jPvmZ8vk"));
            this.f27206d = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.pageIndex);
            kotlin.jvm.internal.g.d(findViewById4, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuOGRHcABnAUldZC54KQ==", "QiadW848"));
            this.f27207e = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.viewFrame);
            kotlin.jvm.internal.g.d(findViewById5, ea.a.p("WnQubSVpB3dcZl1uDVY_ZTNCS0kiKBEuDWRMdg5lOEZBYSZlKQ==", "dbgO6gZa"));
            this.f27208f = findViewById5;
            view.findViewById(R.id.root).setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.adapter.vh.b(1, this, hVar));
        }
    }

    public h(Context context, int i10) {
        ea.a.p("XkMkbgdlGnQ=", "3GdvHA5x");
        this.f27199d = context;
        this.f27200e = i10;
        this.f27201f = h.class.getSimpleName();
        this.f27202g = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f27202g.size();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:3|(1:5)(1:50)|6|(1:49)(1:10)|11|(2:13|(13:15|16|(1:47)(1:20)|21|(1:23)(1:46)|24|25|26|(2:28|29)(3:39|(1:41)(1:43)|42)|30|(1:32)(2:36|(1:38))|33|34))|48|16|(1:18)|47|21|(0)(0)|24|25|26|(0)(0)|30|(0)(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0108, code lost:
        r0.printStackTrace();
        r1 = dp.a.a();
        r1.getClass();
        dp.a.c(r10.f27201f + "-------load cover error: " + r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: Exception -> 0x0107, TryCatch #0 {Exception -> 0x0107, blocks: (B:33:0x00a3, B:37:0x00ae, B:38:0x00b3, B:40:0x00b9, B:42:0x00c0), top: B:55:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0137  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h.a r11, int r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.adapter.convert.h.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup parent, int i10) {
        kotlin.jvm.internal.g.e(parent, "parent");
        View inflate = LayoutInflater.from(this.f27199d).inflate(R.layout.item_operate_finish_r3, parent, false);
        kotlin.jvm.internal.g.d(inflate, ea.a.p("VXIkbVttIW8cdFF4HSl4aSpmXmEyZWtS0oDwZj9uLnNbXzkzXyASYQBlWnRFIDBhKHNXKQ==", "0VVG4BZg"));
        return new a(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i10, List payloads) {
        int i11;
        a holder = aVar;
        kotlin.jvm.internal.g.e(holder, "holder");
        kotlin.jvm.internal.g.e(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        if (getItemCount() == 1) {
            i11 = 8;
        } else {
            i11 = this.f27203h == i10 ? 0 : 4;
        }
        holder.f27206d.setVisibility(i11);
    }
}
