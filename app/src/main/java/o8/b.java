package o8;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: CarouselLayoutManager.java */
/* loaded from: classes2.dex */
public final class b extends v {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f22745p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f22745p = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x
    public final PointF a(int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f22745p;
        com.google.android.material.carousel.b bVar = carouselLayoutManager.f12229u;
        if (bVar == null) {
            return null;
        }
        return new PointF(carouselLayoutManager.W0(bVar.f12261a, i10) - carouselLayoutManager.f12224p, 0.0f);
    }

    @Override // androidx.recyclerview.widget.v
    public final int h(View view, int i10) {
        CarouselLayoutManager carouselLayoutManager = this.f22745p;
        return (int) (carouselLayoutManager.f12224p - carouselLayoutManager.W0(carouselLayoutManager.f12229u.f12261a, RecyclerView.m.P(view)));
    }
}
