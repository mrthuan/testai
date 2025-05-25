package vm;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import eightbitlab.com.blurview.BlurView;
import vm.i;

/* compiled from: PdfPageManagerAdapter.kt */
/* loaded from: classes3.dex */
public final class k implements l4.d<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f30898a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ bn.a f30899b;
    public final /* synthetic */ i.a c;

    public k(i iVar, bn.a aVar, i.a aVar2) {
        this.f30898a = iVar;
        this.f30899b = aVar;
        this.c = aVar2;
    }

    @Override // l4.d
    public final void a(GlideException glideException) {
        i iVar = this.f30898a;
        bn.a aVar = this.f30899b;
        i.a aVar2 = this.c;
        iVar.k(aVar, aVar2);
        if (kotlin.jvm.internal.g.a(aVar2.itemView.getTag(), Integer.valueOf(aVar2.getBindingAdapterPosition()))) {
            BlurView blurView = aVar2.f30891j;
            blurView.setVisibility(0);
            blurView.b(aVar2.f30884b, new qe.g(aVar2.itemView.getContext())).f29293a = 8.0f;
        }
    }

    @Override // l4.d
    public final void b(Object obj, DataSource dataSource) {
        Drawable drawable = (Drawable) obj;
        i iVar = this.f30898a;
        bn.a aVar = this.f30899b;
        i.a aVar2 = this.c;
        iVar.k(aVar, aVar2);
        if (kotlin.jvm.internal.g.a(aVar2.itemView.getTag(), Integer.valueOf(aVar2.getBindingAdapterPosition()))) {
            BlurView blurView = aVar2.f30891j;
            blurView.setVisibility(0);
            blurView.b(aVar2.f30884b, new qe.g(aVar2.itemView.getContext())).f29293a = 8.0f;
        }
    }
}
