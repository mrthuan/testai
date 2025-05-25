package mp;

import android.graphics.drawable.Drawable;
import android.view.View;
import c4.s;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GlideRoundUtils.java */
/* loaded from: classes3.dex */
public final class d implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f22193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f22194b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f22195d;

    public d(View view, Drawable drawable, float f10, String str) {
        this.f22193a = view;
        this.f22194b = drawable;
        this.c = f10;
        this.f22195d = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f22193a;
        view2.removeOnLayoutChangeListener(this);
        com.bumptech.glide.b.g(view2).m(this.f22194b).A(new c4.f(), new s((int) this.c)).n(view2.getMeasuredWidth(), view2.getMeasuredHeight()).F(new a());
    }

    /* compiled from: GlideRoundUtils.java */
    /* loaded from: classes3.dex */
    public class a extends m4.c<Drawable> {
        public a() {
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            Drawable drawable = (Drawable) obj;
            d dVar2 = d.this;
            if (((String) dVar2.f22193a.getTag(R.id.action_container)).equals(dVar2.f22195d)) {
                dVar2.f22193a.setBackground(drawable);
            }
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
        }
    }
}
