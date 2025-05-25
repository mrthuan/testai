package hp;

import android.content.Context;
import android.view.OrientationEventListener;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: CameraRotationObserver.java */
/* loaded from: classes3.dex */
public final class a extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f18390a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Context context) {
        super(context);
        this.f18390a = bVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        if (i10 < 0) {
            return;
        }
        b bVar = this.f18390a;
        if (i10 < 340 && i10 > 20) {
            if (i10 >= 70 && i10 <= 110) {
                bVar.f18394e = 90;
            } else if (i10 >= 160 && i10 <= 200) {
                bVar.f18394e = ShapeTypes.MATH_EQUAL;
            } else if (i10 >= 250 && i10 <= 290) {
                bVar.f18394e = 270;
            }
        } else {
            bVar.f18394e = 0;
        }
        int i11 = bVar.f18393d;
        int i12 = bVar.f18394e;
        if (i11 == i12) {
            return;
        }
        c cVar = bVar.c;
        if (cVar != null) {
            cVar.Z0(i12);
        }
        bVar.f18393d = bVar.f18394e;
    }
}
