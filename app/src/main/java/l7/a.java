package l7;

import android.view.View;
import com.google.android.gms.ads.internal.overlay.zzm;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzm f20521a;

    public a(zzm zzmVar) {
        this.f20521a = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzm zzmVar = this.f20521a;
        zzmVar.f10328v = 2;
        zzmVar.f10308a.finish();
    }
}
