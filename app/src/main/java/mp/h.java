package mp;

import android.graphics.drawable.Drawable;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: GlideRoundUtils.java */
/* loaded from: classes3.dex */
public final class h implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f22202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f22203b;
    public final /* synthetic */ mp.a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f22204d;

    public h(View view, Drawable drawable, mp.a aVar, String str) {
        this.f22202a = view;
        this.f22203b = drawable;
        this.c = aVar;
        this.f22204d = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        View view2 = this.f22202a;
        view2.removeOnLayoutChangeListener(this);
        com.bumptech.glide.b.g(view2).m(this.f22203b).z(this.c, true).n(view2.getMeasuredWidth(), view2.getMeasuredHeight()).F(new a());
    }

    /* compiled from: GlideRoundUtils.java */
    /* loaded from: classes3.dex */
    public class a extends m4.c<Drawable> {
        public a() {
        }

        @Override // m4.g
        public final void c(Object obj, n4.d dVar) {
            Drawable drawable = (Drawable) obj;
            h hVar = h.this;
            if (((String) hVar.f22202a.getTag(R.id.action_container)).equals(hVar.f22204d)) {
                hVar.f22202a.setBackground(drawable);
            }
        }

        @Override // m4.g
        public final void i(Drawable drawable) {
        }
    }
}
