package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.z;

/* compiled from: OfficeShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class a0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f27489a;

    public a0(z zVar) {
        this.f27489a = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        z zVar = this.f27489a;
        z.i iVar = zVar.f27811y;
        if (iVar != null) {
            iVar.a(zVar.f27812z, zVar.M);
        }
        boolean z10 = !zVar.M;
        zVar.M = z10;
        if (z10) {
            zVar.C.setImageResource(R.drawable.ic_more_bookmark_selected);
        } else {
            zVar.C.setImageResource(R.drawable.ic_more_bookmark);
        }
    }
}
