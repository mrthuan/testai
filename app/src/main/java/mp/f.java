package mp;

import android.graphics.drawable.Drawable;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GlideRoundUtils.java */
/* loaded from: classes3.dex */
public final class f implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f22198a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f22199b;
    public final /* synthetic */ String c;

    public f(View view, Drawable drawable, String str) {
        this.f22198a = view;
        this.f22199b = drawable;
        this.c = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f22198a;
        view2.removeOnLayoutChangeListener(this);
        com.bumptech.glide.b.g(view2).m(this.f22199b).n(view2.getMeasuredWidth(), view2.getMeasuredHeight()).F(new a());
    }

    /* compiled from: GlideRoundUtils.java */
    /* loaded from: classes3.dex */
    public class a extends m4.c<Drawable> {
        public a() {
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            Drawable drawable = (Drawable) obj;
            f fVar = f.this;
            if (((String) fVar.f22198a.getTag(R.id.action_container)).equals(fVar.c)) {
                fVar.f22198a.setBackground(drawable);
            }
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
        }
    }
}
