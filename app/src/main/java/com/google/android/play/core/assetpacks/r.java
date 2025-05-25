package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class r extends o {
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(y yVar, TaskCompletionSource taskCompletionSource) {
        super(yVar, taskCompletionSource);
        this.c = yVar;
    }

    @Override // com.google.android.play.core.assetpacks.o, q9.t
    public final void N(ArrayList arrayList) {
        super.N(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            y yVar = this.c;
            boolean z10 = false;
            AssetPackState assetPackState = (AssetPackState) d.a((Bundle) it.next(), yVar.f13443b, yVar.c, new kotlinx.coroutines.y(0)).f13273b.values().iterator().next();
            if (assetPackState == null) {
                y.f13440g.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int h10 = assetPackState.h();
            if (h10 == 1 || h10 == 7 || h10 == 2 || h10 == 9 || h10 == 3) {
                z10 = true;
            }
            if (z10) {
                arrayList2.add(assetPackState.g());
            }
        }
        this.f13341a.d(arrayList2);
    }
}
