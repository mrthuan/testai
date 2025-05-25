package l8;

import android.content.res.TypedArray;
import android.view.View;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public final class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.b f20531a;

    public d(com.google.android.material.bottomsheet.b bVar) {
        this.f20531a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.material.bottomsheet.b bVar = this.f20531a;
        if (bVar.f12174j && bVar.isShowing()) {
            if (!bVar.f12176l) {
                TypedArray obtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{16843611});
                bVar.f12175k = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                bVar.f12176l = true;
            }
            if (bVar.f12175k) {
                bVar.cancel();
            }
        }
    }
}
