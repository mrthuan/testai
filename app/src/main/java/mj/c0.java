package mj;

import java.util.Comparator;

/* compiled from: TextEditorPriorityComparator.java */
/* loaded from: classes3.dex */
public final class c0 implements Comparator<d0> {
    @Override // java.util.Comparator
    public final int compare(d0 d0Var, d0 d0Var2) {
        d0 d0Var3 = d0Var;
        d0 d0Var4 = d0Var2;
        if (d0Var3.getPriority() == d0Var4.getPriority()) {
            return Long.compare(d0Var3.l(), d0Var4.l());
        }
        return Integer.compare(d0Var4.getPriority(), d0Var3.getPriority());
    }
}
