package hp;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: RotationObserver.java */
/* loaded from: classes3.dex */
public final class d extends OrientationEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f18395a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Context context) {
        super(context);
        this.f18395a = eVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i10) {
        Context a10;
        e eVar = this.f18395a;
        if (i10 == -1) {
            eVar.c = -1;
            return;
        }
        if (i10 <= 350 && i10 >= 10) {
            if (i10 > 80 && i10 < 100) {
                eVar.f18398d = 90;
            } else if (i10 > 170 && i10 < 190) {
                eVar.f18398d = ShapeTypes.MATH_EQUAL;
            } else if (i10 > 260 && i10 < 280) {
                eVar.f18398d = 270;
            }
        } else {
            eVar.f18398d = 0;
        }
        if (eVar.c == eVar.f18398d) {
            return;
        }
        try {
            a10 = eVar.a();
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
        }
        if (a10 == null) {
            return;
        }
        if (Settings.System.getInt(a10.getContentResolver(), ea.a.p("UmMoZR9lEG8fZUBlG18kbzBhRmkpbg==", "5QnrlJF2")) == 0) {
            return;
        }
        int i11 = eVar.f18398d;
        eVar.c = i11;
        if (eVar.f18399e) {
            return;
        }
        if (i11 != 0) {
            if (i11 != 90) {
                if (i11 != 180) {
                    if (i11 != 270) {
                        return;
                    }
                }
            }
            eVar.b(4);
            return;
        }
        eVar.b(1);
    }
}
