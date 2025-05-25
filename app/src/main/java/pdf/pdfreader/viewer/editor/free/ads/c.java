package pdf.pdfreader.viewer.editor.free.ads;

import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ui.dialog.w;

/* compiled from: BaseFullAds.java */
/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a.e f23939a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f23940b;

    public c(a.e eVar, w wVar) {
        this.f23939a = eVar;
        this.f23940b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.e eVar = this.f23939a;
        if (eVar != null) {
            eVar.d(this.f23940b);
        }
    }
}
