package le;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* compiled from: ZJAdCard.java */
/* loaded from: classes.dex */
public final class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f20567a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f20568b;

    public e(f fVar, Context context) {
        this.f20568b = fVar;
        this.f20567a = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.f20567a;
        f fVar = this.f20568b;
        if (fVar.f20573g != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(fVar.f20575i.f20579e));
                intent.setFlags(268435456);
                intent.setPackage("com.android.vending");
                context.startActivity(intent);
            } catch (Exception e10) {
                e10.printStackTrace();
                try {
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(fVar.f20575i.f20579e));
                    intent2.setFlags(268435456);
                    context.startActivity(intent2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            fVar.f20573g.b(context, new yd.d("Z", "NC", fVar.f20574h));
            de.e.a(context, 3, fVar.f20575i.f20580f);
        }
    }
}
