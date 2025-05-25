package kn;

import androidx.recyclerview.widget.n;
import kotlin.jvm.internal.g;
import ul.b;

/* compiled from: AdjustImageDiffCallback.kt */
/* loaded from: classes3.dex */
public final class a extends n.e<b> {
    @Override // androidx.recyclerview.widget.n.e
    public final boolean a(b bVar, b bVar2) {
        return g.a(bVar, bVar2);
    }

    @Override // androidx.recyclerview.widget.n.e
    public final boolean b(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        if (bVar3.f30405b == bVar4.f30405b && g.a(bVar3.f30404a, bVar4.f30404a)) {
            return true;
        }
        return false;
    }
}
