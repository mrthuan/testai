package k0;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class n extends r {

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f19489b;
    public IconCompat c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19490d;

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    @Override // k0.r
    public final void b(s sVar) {
        Bitmap b10;
        int i10 = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(sVar.f19519b).setBigContentTitle(null);
        IconCompat iconCompat = this.f19489b;
        Context context = sVar.f19518a;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.a(bigContentTitle, IconCompat.a.f(iconCompat, context));
            } else {
                int i11 = iconCompat.f3531a;
                if (i11 == -1) {
                    i11 = IconCompat.a.c(iconCompat.f3532b);
                }
                if (i11 == 1) {
                    IconCompat iconCompat2 = this.f19489b;
                    int i12 = iconCompat2.f3531a;
                    if (i12 == -1) {
                        Object obj = iconCompat2.f3532b;
                        if (obj instanceof Bitmap) {
                            b10 = (Bitmap) obj;
                        } else {
                            b10 = null;
                        }
                    } else if (i12 == 1) {
                        b10 = (Bitmap) iconCompat2.f3532b;
                    } else if (i12 == 5) {
                        b10 = IconCompat.b((Bitmap) iconCompat2.f3532b, true);
                    } else {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bigContentTitle = bigContentTitle.bigPicture(b10);
                }
            }
        }
        if (this.f19490d) {
            IconCompat iconCompat3 = this.c;
            if (iconCompat3 == null) {
                a.a(bigContentTitle, null);
            } else {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat3, context));
            }
        }
        if (i10 >= 31) {
            c.c(bigContentTitle, false);
            c.b(bigContentTitle, null);
        }
    }

    @Override // k0.r
    public final String e() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
