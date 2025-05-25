package mp;

import android.graphics.drawable.Drawable;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GlideRoundUtils.java */
/* loaded from: classes3.dex */
public final class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f22189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f22190b;
    public final /* synthetic */ String c;

    public b(View view, Drawable drawable, String str) {
        this.f22189a = view;
        this.f22190b = drawable;
        this.c = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f22189a;
        view2.removeOnLayoutChangeListener(this);
        com.bumptech.glide.e<Drawable> b10 = com.bumptech.glide.b.g(view2).b();
        b10.F = this.f22190b;
        b10.I = true;
        b10.C(new l4.e().g(v3.f.f30509a)).z(new c4.f(), true).n(view2.getMeasuredWidth(), view2.getMeasuredHeight()).F(new a());
    }

    /* compiled from: GlideRoundUtils.java */
    /* loaded from: classes3.dex */
    public class a extends m4.c<Drawable> {
        public a() {
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            Drawable drawable = (Drawable) obj;
            b bVar = b.this;
            if (((String) bVar.f22189a.getTag(R.id.action_container)).equals(bVar.c)) {
                bVar.f22189a.setBackground(drawable);
            }
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
        }
    }
}
