package w8;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import w8.f;

/* compiled from: CheckableGroup.java */
/* loaded from: classes2.dex */
public final class b<T extends f<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f30991a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f30992b = new HashSet();
    public a c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f30993d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f30994e;

    /* compiled from: CheckableGroup.java */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public final boolean a(f<T> fVar) {
        int id2 = fVar.getId();
        HashSet hashSet = this.f30992b;
        if (hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        f<T> fVar2 = (f) this.f30991a.get(Integer.valueOf(c()));
        if (fVar2 != null) {
            e(fVar2, false);
        }
        boolean add = hashSet.add(Integer.valueOf(id2));
        if (!fVar.isChecked()) {
            fVar.setChecked(true);
        }
        return add;
    }

    public final ArrayList b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f30992b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof f) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (this.f30993d) {
            HashSet hashSet = this.f30992b;
            if (!hashSet.isEmpty()) {
                return ((Integer) hashSet.iterator().next()).intValue();
            }
        }
        return -1;
    }

    public final void d() {
        a aVar = this.c;
        if (aVar != null) {
            new HashSet(this.f30992b);
            ChipGroup chipGroup = ChipGroup.this;
            ChipGroup.e eVar = chipGroup.f12326g;
            if (eVar != null) {
                chipGroup.f12327h.b(chipGroup);
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f12327h.f30993d) {
                    chipGroup2.getCheckedChipId();
                    throw null;
                }
            }
        }
    }

    public final boolean e(f<T> fVar, boolean z10) {
        int id2 = fVar.getId();
        HashSet hashSet = this.f30992b;
        if (!hashSet.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            fVar.setChecked(true);
            return false;
        }
        boolean remove = hashSet.remove(Integer.valueOf(id2));
        if (fVar.isChecked()) {
            fVar.setChecked(false);
        }
        return remove;
    }
}
