package u0;

import android.app.Activity;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SplashScreen.kt */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f30118a;

    public c(Activity activity) {
        g.e(activity, "activity");
        this.f30118a = activity;
    }

    public void a() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.f30118a.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        b(theme, typedValue);
    }

    public final void b(Resources.Theme theme, TypedValue typedValue) {
        int i10;
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i10 = typedValue.resourceId) != 0) {
            this.f30118a.setTheme(i10);
        }
    }
}
