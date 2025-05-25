package h5;

import com.google.android.play.core.install.InstallState;

/* compiled from: UpgradeHelper.kt */
/* loaded from: classes.dex */
public final class g implements com.google.android.play.core.install.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f18026a;

    public g(m mVar) {
        this.f18026a = mVar;
    }

    @Override // t9.a
    public final void a(InstallState installState) {
        InstallState installState2 = installState;
        kotlin.jvm.internal.g.e(installState2, "installState");
        if (installState2.c() == 5 || installState2.c() == 6 || installState2.c() == 4) {
            m mVar = this.f18026a;
            mVar.getClass();
            try {
                o9.b bVar = mVar.f18036a;
                if (bVar != null) {
                    bVar.e(this);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
