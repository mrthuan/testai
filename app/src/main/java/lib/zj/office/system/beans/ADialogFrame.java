package lib.zj.office.system.beans;

import android.app.Activity;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import pi.a;

/* loaded from: classes3.dex */
public class ADialogFrame extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public a f20976a;

    public ADialogFrame(Activity activity, a aVar) {
        super(activity);
        setOrientation(1);
        this.f20976a = aVar;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f20976a.c();
    }
}
