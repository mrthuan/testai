package j7;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzauo;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class b implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzt f19047a;

    public b(zzt zztVar) {
        this.f19047a = zztVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzauo zzauoVar = this.f19047a.f10550h;
        if (zzauoVar != null) {
            zzauoVar.zzd(motionEvent);
            return false;
        }
        return false;
    }
}
