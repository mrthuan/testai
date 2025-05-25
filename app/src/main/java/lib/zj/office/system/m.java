package lib.zj.office.system;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* compiled from: MainControl.java */
/* loaded from: classes3.dex */
public final class m implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f21039a;

    public m(p pVar) {
        this.f21039a = pVar;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            dialogInterface.dismiss();
            p pVar = this.f21039a;
            pVar.f21050b = true;
            j jVar = pVar.f21056i;
            if (jVar != null) {
                jVar.abortReader();
                pVar.f21056i.dispose();
            }
            pVar.m().onBackPressed();
            return true;
        }
        return false;
    }
}
