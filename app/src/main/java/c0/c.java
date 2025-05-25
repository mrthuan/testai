package c0;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: classes.dex */
public class c extends ConstraintWidget {

    /* renamed from: w0  reason: collision with root package name */
    public ArrayList<ConstraintWidget> f5504w0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void G() {
        this.f5504w0.clear();
        super.G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void J(a0.b bVar) {
        super.J(bVar);
        int size = this.f5504w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5504w0.get(i10).J(bVar);
        }
    }

    public void U() {
        ArrayList<ConstraintWidget> arrayList = this.f5504w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f5504w0.get(i10);
            if (constraintWidget instanceof c) {
                ((c) constraintWidget).U();
            }
        }
    }
}
