package bi;

import lib.zj.office.ss.control.Spreadsheet;

/* compiled from: SSControl.java */
/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f5432a;

    public b(a aVar) {
        this.f5432a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar = this.f5432a;
        if (!aVar.f5420b) {
            Spreadsheet spreadsheet = aVar.c;
            sg.c n10 = spreadsheet.f20956i.n();
            if (n10 != null) {
                n10.c();
                try {
                    spreadsheet.j(n10);
                } catch (Exception unused) {
                }
            }
        }
    }
}
