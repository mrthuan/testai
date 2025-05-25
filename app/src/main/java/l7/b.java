package l7;

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class b extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public final zzau f20522a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20523b;

    public b(Activity activity, String str, String str2, String str3) {
        super(activity);
        zzau zzauVar = new zzau(activity);
        zzauVar.c = str;
        this.f20522a = zzauVar;
        zzauVar.f10402e = str2;
        zzauVar.f10401d = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f20523b) {
            this.f20522a.a(motionEvent);
            return false;
        }
        return false;
    }
}
