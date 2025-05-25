package ee;

/* compiled from: FullScreenDialog.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f16566a;

    public c(b bVar) {
        this.f16566a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b bVar = this.f16566a;
        if (bVar.isShowing()) {
            bVar.dismiss();
        }
    }
}
