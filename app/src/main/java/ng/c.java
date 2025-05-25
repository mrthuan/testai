package ng;

import android.os.SystemClock;
import android.view.View;

/* compiled from: ReClickListener.java */
/* loaded from: classes.dex */
public abstract class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public long f22479a = 0;

    public abstract void a();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f22479a > 1000) {
            this.f22479a = elapsedRealtime;
            a();
        }
    }
}
