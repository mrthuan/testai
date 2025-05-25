package d6;

import android.app.ActivityManager;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.e;
import com.inmobi.media.C1566b3;
import com.inmobi.media.E4;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16120a;

    public /* synthetic */ b(int i10) {
        this.f16120a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16120a) {
            case 0:
                if (!k6.a.b(ModelManager.class)) {
                    try {
                        b6.c cVar = b6.c.f5330a;
                        if (!k6.a.b(b6.c.class)) {
                            b6.c.f5331b = true;
                            b6.c.c = e.b("FBSDKFeatureIntegritySample", com.facebook.d.b(), false);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        k6.a.a(ModelManager.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                int i10 = i6.a.f18467a;
                if (!k6.a.b(i6.a.class)) {
                    try {
                        Object systemService = com.facebook.d.a().getSystemService("activity");
                        g.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                        i6.a.a((ActivityManager) systemService);
                        return;
                    } catch (Exception unused) {
                        return;
                    } catch (Throwable th3) {
                        k6.a.a(i6.a.class, th3);
                        return;
                    }
                }
                return;
            case 2:
                E4.c();
                return;
            case 3:
                C1566b3.O();
                return;
            default:
                FileRepository.f24155a.getClass();
                FileRepository.H();
                return;
        }
    }
}
