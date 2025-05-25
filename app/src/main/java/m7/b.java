package m7;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f21825a;

    public b(c cVar) {
        this.f21825a = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        zzt zztVar = zzu.B.c;
        zzt.p(this.f21825a.f21826a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
