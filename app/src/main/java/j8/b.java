package j8;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar.java */
/* loaded from: classes2.dex */
public final class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19056a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f19057b;

    /* compiled from: BottomAppBar.java */
    /* loaded from: classes2.dex */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
            BottomAppBar bottomAppBar = b.this.f19057b;
            int i10 = BottomAppBar.f12081v0;
            bottomAppBar.getClass();
        }
    }

    public b(BottomAppBar bottomAppBar, int i10) {
        this.f19057b = bottomAppBar;
        this.f19056a = i10;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(FloatingActionButton floatingActionButton) {
        int i10 = BottomAppBar.f12081v0;
        floatingActionButton.setTranslationX(this.f19057b.B(this.f19056a));
        floatingActionButton.m(new a(), true);
    }
}
