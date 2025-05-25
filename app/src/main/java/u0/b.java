package u0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import androidx.appcompat.widget.u;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.k;
import com.google.android.gms.internal.ads.l;
import kotlin.jvm.internal.g;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: SplashScreen.kt */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: b  reason: collision with root package name */
    public final a f30115b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(activity);
        g.e(activity, "activity");
        this.f30115b = new a(activity);
    }

    @Override // u0.c
    public final void a() {
        Activity activity = this.f30118a;
        Resources.Theme theme = activity.getTheme();
        g.d(theme, "activity.theme");
        b(theme, new TypedValue());
        ((ViewGroup) activity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.f30115b);
    }

    /* compiled from: SplashScreen.kt */
    /* loaded from: classes.dex */
    public static final class a implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Activity f30117b;

        public a(Activity activity) {
            this.f30117b = activity;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            WindowInsets build;
            View rootView;
            if (k.i(view2)) {
                SplashScreenView child = l.f(view2);
                b bVar = b.this;
                bVar.getClass();
                g.e(child, "child");
                build = u.d().build();
                g.d(build, "Builder().build()");
                Rect rect = new Rect(SlideAtom.USES_MASTER_SLIDE_ID, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
                rootView = child.getRootView();
                if (build == rootView.computeSystemWindowInsets(build, rect)) {
                    rect.isEmpty();
                }
                bVar.getClass();
                ((ViewGroup) this.f30117b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
