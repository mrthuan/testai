package pdf.pdfreader.viewer.editor.free.feature.ai.ui.adapter;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import i2.a;

/* compiled from: BaseBindingViewHolder.kt */
/* loaded from: classes3.dex */
public abstract class g<T, V extends i2.a> extends RecyclerView.b0 {

    /* renamed from: b  reason: collision with root package name */
    public final V f24704b;
    public final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(V v10) {
        super(v10.b());
        kotlin.jvm.internal.g.e(v10, ea.a.p("UWklZBpuZw==", "KW8ViIay"));
        this.f24704b = v10;
        Context context = v10.b().getContext();
        kotlin.jvm.internal.g.d(context, ea.a.p("JGkqZDNuEy46bwl0GmM4bkxlKnQ=", "R7FDZtMs"));
        this.c = context;
    }

    public abstract void l(int i10, T t4);
}
