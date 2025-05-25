package sp;

import android.os.Message;
import pdf.pdfreader.viewer.editor.free.observer.StorageFileObserver;

/* compiled from: WPSExporter.java */
/* loaded from: classes3.dex */
public final class g implements sn.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f29851a;

    public g(h hVar) {
        this.f29851a = hVar;
    }

    @Override // sn.a
    public final void a(Exception exc) {
        ea.a.p("Hi1mLRBvEnk3ckZvGy17LWkt", "0Q0N3FF9");
        h hVar = this.f29851a;
        hVar.getClass();
        e eVar = hVar.f29856f;
        if (eVar != null) {
            Message obtainMessage = eVar.obtainMessage(4099);
            obtainMessage.arg1 = -2;
            obtainMessage.obj = exc;
            eVar.sendMessage(obtainMessage);
        }
    }

    @Override // sn.a
    public final void b(String str) {
        ea.a.p("fC1BLVdvAXkbdAdyQC16LRUt", "XEQl4qtD");
        h hVar = this.f29851a;
        hVar.getClass();
        hVar.f29863m = str;
        pdf.pdfreader.viewer.editor.free.observer.a aVar = StorageFileObserver.f25899a;
        if (str == null) {
            str = "";
        }
        StorageFileObserver.b(str);
    }

    @Override // sn.a
    public final void c(String str) {
        e eVar;
        h hVar = this.f29851a;
        hVar.f29863m = str;
        if (!hVar.f29858h && (eVar = hVar.f29856f) != null) {
            eVar.removeCallbacksAndMessages(null);
            eVar.sendEmptyMessage(4100);
        }
        ea.a.p("PGFHZSlEcSA8aSRpBmhEIEZoAXUpZCRiDHIjKGo6", "CcPNcWCu");
    }
}
