package c6;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5592a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f5593b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, long j10, Object obj) {
        this.f5592a = i10;
        this.f5593b = j10;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5592a) {
            case 0:
                long j10 = this.f5593b;
                String activityName = (String) this.c;
                kotlin.jvm.internal.g.e(activityName, "$activityName");
                if (e.f5600h == null) {
                    e.f5600h = new k(Long.valueOf(j10), null);
                }
                if (e.f5599g.get() <= 0) {
                    l.c(activityName, e.f5600h, e.f5602j);
                    SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(com.facebook.d.a()).edit();
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit2.apply();
                    e.f5600h = null;
                }
                synchronized (e.f5598f) {
                    e.f5597e = null;
                    tf.d dVar = tf.d.f30009a;
                }
                return;
            default:
                ReaderSplashActivity readerSplashActivity = (ReaderSplashActivity) this.c;
                ReaderSplashActivity.a aVar = ReaderSplashActivity.f23873s;
                kotlin.jvm.internal.g.e(readerSplashActivity, ea.a.p("O2hYc10w", "YCnKVK4X"));
                int i10 = zk.a.f32399a;
                t1.b("splash show ad delay " + (SystemClock.elapsedRealtime() - this.f5593b) + "ms");
                if (readerSplashActivity.f23884l) {
                    readerSplashActivity.f23876d = true;
                    return;
                }
                readerSplashActivity.f23878f = true;
                readerSplashActivity.A1();
                return;
        }
    }
}
