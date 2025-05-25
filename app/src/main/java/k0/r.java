package k0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public p f19517a;

    public void a(Bundle bundle) {
        String e10 = e();
        if (e10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e10);
        }
    }

    public abstract void b(s sVar);

    public final Bitmap c(IconCompat iconCompat, int i10, int i11) {
        int i12;
        Context context = this.f19517a.f19492a;
        iconCompat.a(context);
        Drawable e10 = IconCompat.a.e(IconCompat.a.f(iconCompat, context), context);
        if (i11 == 0) {
            i12 = e10.getIntrinsicWidth();
        } else {
            i12 = i11;
        }
        if (i11 == 0) {
            i11 = e10.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.ARGB_8888);
        e10.setBounds(0, 0, i12, i11);
        if (i10 != 0) {
            e10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        e10.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap d(int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            i13 = 0;
        }
        Context context = this.f19517a.f19492a;
        PorterDuff.Mode mode = IconCompat.f3530k;
        context.getClass();
        Bitmap c = c(IconCompat.c(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i13, i11);
        Canvas canvas = new Canvas(c);
        Drawable mutate = this.f19517a.f19492a.getResources().getDrawable(i10).mutate();
        mutate.setFilterBitmap(true);
        int i14 = (i11 - i12) / 2;
        int i15 = i12 + i14;
        mutate.setBounds(i14, i14, i15, i15);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return c;
    }

    public abstract String e();

    public RemoteViews f() {
        return null;
    }

    public RemoteViews g() {
        return null;
    }

    public RemoteViews h() {
        return null;
    }

    public final void i(p pVar) {
        if (this.f19517a != pVar) {
            this.f19517a = pVar;
            if (pVar != null) {
                pVar.q(this);
            }
        }
    }
}
