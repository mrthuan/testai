package pdf.pdfreader.viewer.editor.free.utils;

import android.os.SystemClock;
import android.view.View;

/* compiled from: NoDoubleClickListener.java */
/* loaded from: classes3.dex */
public abstract class l0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public long f28723a = 0;

    public abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f28723a > 1000) {
            this.f28723a = elapsedRealtime;
            a(view);
        }
    }
}
