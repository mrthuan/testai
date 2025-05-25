package rh;

import android.app.Activity;
import android.app.ProgressDialog;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PGControl.java */
/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f29559a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f29560b;

    public d(a aVar, a aVar2) {
        this.f29560b = aVar;
        this.f29559a = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f29560b;
        if (aVar.f29546d) {
            Activity m10 = aVar.m();
            aVar.f29547e = ProgressDialog.show(m10, this.f29559a.s().x0(), m10.getString(R.string.arg_res_0x7f1303a8), false, false, null);
            aVar.f29547e.show();
        }
    }
}
