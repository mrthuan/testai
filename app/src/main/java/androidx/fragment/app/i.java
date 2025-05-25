package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.j;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.ref.WeakReference;
import s0.d;
import vm.i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements d.a, dn.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3815a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3816b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3817d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f3815a = obj;
        this.f3816b = obj2;
        this.c = obj3;
        this.f3817d = obj4;
    }

    @Override // dn.b
    public final void h(bn.a aVar, Bitmap bitmap, boolean z10) {
        int i10;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        i.a aVar2 = (i.a) this.f3815a;
        vm.i iVar = (vm.i) this.f3816b;
        bn.a aVar3 = (bn.a) this.c;
        Context context = (Context) this.f3817d;
        kotlin.jvm.internal.g.e(aVar2, ea.a.p("a2hebB1lcg==", "KYMjLJEh"));
        ShapeableImageView shapeableImageView = aVar2.f30886e;
        kotlin.jvm.internal.g.e(iVar, ea.a.p("IGgZc34w", "AXTpZKq2"));
        kotlin.jvm.internal.g.e(aVar3, ea.a.p("a2lcYR5l", "UZU6Ykev"));
        try {
            if (shapeableImageView.getContext() instanceof Activity) {
                Context context2 = shapeableImageView.getContext();
                kotlin.jvm.internal.g.c(context2, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuOW5fbgFsDiA7eUFlWWFZZChvI2RbYRhwG0ENdCx2DHR5", "iubGVrtb"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b((Activity) context2)) {
                    return;
                }
            }
            if (kotlin.jvm.internal.g.a("imageList_" + aVar.f5491e, shapeableImageView.getTag())) {
                if (bitmap != null) {
                    aVar.a(bitmap.getWidth() + ":" + bitmap.getHeight());
                }
                aVar.f5488a = new WeakReference<>(bitmap);
                WeakReference<Bitmap> weakReference = aVar3.f5488a;
                int i11 = 0;
                if (weakReference != null && (bitmap4 = weakReference.get()) != null) {
                    i10 = bitmap4.getWidth();
                } else {
                    i10 = 0;
                }
                WeakReference<Bitmap> weakReference2 = aVar3.f5488a;
                if (weakReference2 != null && (bitmap3 = weakReference2.get()) != null) {
                    i11 = bitmap3.getHeight();
                }
                iVar.m(i10, i11, aVar2);
                aVar2.f30885d.setVisibility(8);
                com.bumptech.glide.f f10 = com.bumptech.glide.b.c(context).f(context);
                WeakReference<Bitmap> weakReference3 = aVar.f5488a;
                if (weakReference3 != null) {
                    bitmap2 = weakReference3.get();
                } else {
                    bitmap2 = null;
                }
                com.bumptech.glide.e h10 = f10.l(bitmap2).h();
                h10.H(new vm.k(iVar, aVar3, aVar2));
                h10.E(shapeableImageView);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // s0.d.a
    public final void onCancel() {
        View view = (View) this.f3815a;
        j this$0 = (j) this.f3816b;
        j.a animationInfo = (j.a) this.c;
        SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.f3817d;
        kotlin.jvm.internal.g.e(this$0, "this$0");
        kotlin.jvm.internal.g.e(animationInfo, "$animationInfo");
        kotlin.jvm.internal.g.e(operation, "$operation");
        view.clearAnimation();
        this$0.f3717a.endViewTransition(view);
        animationInfo.a();
        if (g0.J(2)) {
            operation.toString();
        }
    }
}
