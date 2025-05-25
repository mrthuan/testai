package xo;

import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Group;
import java.util.ArrayList;
import java.util.List;
import pdf.pdfreader.viewer.editor.free.ui.widget.sign.SignCreateView;

/* compiled from: SignCreateView.java */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List f31898a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SignCreateView f31899b;

    public e(SignCreateView signCreateView, ArrayList arrayList) {
        this.f31899b = signCreateView;
        this.f31898a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SignCreateView signCreateView = this.f31899b;
        ((Group) signCreateView.f28438a.f768e).setVisibility(0);
        ((LinearLayout) signCreateView.f28438a.f769f).setVisibility(8);
        pdf.pdfreader.viewer.editor.free.ui.widget.adapter.f fVar = signCreateView.f28439b;
        ArrayList arrayList = fVar.f28371f;
        arrayList.clear();
        List list = this.f31898a;
        if (list != null) {
            arrayList.addAll(list);
        }
        fVar.notifyDataSetChanged();
    }
}
