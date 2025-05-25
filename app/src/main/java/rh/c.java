package rh;

import android.app.ProgressDialog;

/* compiled from: PGControl.java */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f29558a;

    public c(a aVar) {
        this.f29558a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f29558a;
        if (aVar.s().O()) {
            ProgressDialog progressDialog = aVar.f29547e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                aVar.f29547e = null;
                return;
            }
            return;
        }
        sg.b u7 = aVar.c.u();
        if (u7 != null) {
            u7.a();
        }
    }
}
