package l8;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public final class e extends x0.a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.b f20532d;

    public e(com.google.android.material.bottomsheet.b bVar) {
        this.f20532d = bVar;
    }

    @Override // x0.a
    public final void d(View view, y0.f fVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f31416a;
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f31951a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.f20532d.f12174j) {
            fVar.a(1048576);
            accessibilityNodeInfo.setDismissable(true);
            return;
        }
        accessibilityNodeInfo.setDismissable(false);
    }

    @Override // x0.a
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 1048576) {
            com.google.android.material.bottomsheet.b bVar = this.f20532d;
            if (bVar.f12174j) {
                bVar.cancel();
                return true;
            }
        }
        return super.g(view, i10, bundle);
    }
}
