package k0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import java.lang.reflect.Method;
import k0.f;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f19454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f19455b;

    public /* synthetic */ a(Activity activity, int i10) {
        this.f19454a = i10;
        this.f19455b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        Object obj;
        boolean z11;
        int i10 = this.f19454a;
        Activity activity = this.f19455b;
        switch (i10) {
            case 0:
                if (!activity.isFinishing()) {
                    int i11 = Build.VERSION.SDK_INT;
                    boolean z12 = true;
                    if (i11 >= 28) {
                        Class<?> cls = f.f19467a;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = f.f19467a;
                        if (i11 != 26 && i11 != 27) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        Method method = f.f19471f;
                        if ((!z10 || method != null) && (f.f19470e != null || f.f19469d != null)) {
                            try {
                                Object obj2 = f.c.get(activity);
                                if (obj2 != null && (obj = f.f19468b.get(activity)) != null) {
                                    Application application = activity.getApplication();
                                    f.a aVar = new f.a(activity);
                                    application.registerActivityLifecycleCallbacks(aVar);
                                    Handler handler = f.f19472g;
                                    handler.post(new c(aVar, obj2));
                                    if (i11 != 26 && i11 != 27) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new d(application, aVar));
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        z12 = false;
                    }
                    if (!z12) {
                        activity.recreate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.g.a(activity);
                return;
            default:
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                kotlin.jvm.internal.g.e(activity, ea.a.p("E2EMdAV2HnR5", "Yy7olwHk"));
                ThirdOpenParseManager.f28760a.getClass();
                ((Handler) ThirdOpenParseManager.f28762d.getValue()).post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(activity, 16));
                return;
        }
    }
}
