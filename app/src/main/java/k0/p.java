package k0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19492a;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f19495e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f19496f;

    /* renamed from: g  reason: collision with root package name */
    public PendingIntent f19497g;

    /* renamed from: h  reason: collision with root package name */
    public PendingIntent f19498h;

    /* renamed from: i  reason: collision with root package name */
    public Bitmap f19499i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f19500j;

    /* renamed from: k  reason: collision with root package name */
    public int f19501k;

    /* renamed from: l  reason: collision with root package name */
    public int f19502l;

    /* renamed from: n  reason: collision with root package name */
    public r f19504n;

    /* renamed from: o  reason: collision with root package name */
    public String f19505o;

    /* renamed from: q  reason: collision with root package name */
    public Bundle f19507q;

    /* renamed from: t  reason: collision with root package name */
    public RemoteViews f19510t;

    /* renamed from: u  reason: collision with root package name */
    public RemoteViews f19511u;

    /* renamed from: v  reason: collision with root package name */
    public RemoteViews f19512v;

    /* renamed from: w  reason: collision with root package name */
    public String f19513w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f19514x;

    /* renamed from: y  reason: collision with root package name */
    public final Notification f19515y;
    @Deprecated

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<String> f19516z;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<m> f19493b = new ArrayList<>();
    public final ArrayList<x> c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<m> f19494d = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public boolean f19503m = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f19506p = false;

    /* renamed from: r  reason: collision with root package name */
    public int f19508r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f19509s = 0;

    public p(Context context, String str) {
        Notification notification = new Notification();
        this.f19515y = notification;
        this.f19492a = context;
        this.f19513w = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f19502l = 0;
        this.f19516z = new ArrayList<>();
        this.f19514x = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final Notification a() {
        RemoteViews remoteViews;
        Notification notification;
        Bundle bundle;
        RemoteViews h10;
        RemoteViews f10;
        s sVar = new s(this);
        p pVar = sVar.c;
        r rVar = pVar.f19504n;
        if (rVar != null) {
            rVar.b(sVar);
        }
        if (rVar != null) {
            remoteViews = rVar.g();
        } else {
            remoteViews = null;
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder = sVar.f19519b;
        if (i10 >= 26) {
            notification = builder.build();
        } else if (i10 >= 24) {
            notification = builder.build();
        } else {
            builder.setExtras(sVar.f19522f);
            Notification build = builder.build();
            RemoteViews remoteViews2 = sVar.f19520d;
            if (remoteViews2 != null) {
                build.contentView = remoteViews2;
            }
            RemoteViews remoteViews3 = sVar.f19521e;
            if (remoteViews3 != null) {
                build.bigContentView = remoteViews3;
            }
            RemoteViews remoteViews4 = sVar.f19523g;
            if (remoteViews4 != null) {
                build.headsUpContentView = remoteViews4;
            }
            notification = build;
        }
        if (remoteViews != null) {
            notification.contentView = remoteViews;
        } else {
            RemoteViews remoteViews5 = pVar.f19510t;
            if (remoteViews5 != null) {
                notification.contentView = remoteViews5;
            }
        }
        if (rVar != null && (f10 = rVar.f()) != null) {
            notification.bigContentView = f10;
        }
        if (rVar != null && (h10 = pVar.f19504n.h()) != null) {
            notification.headsUpContentView = h10;
        }
        if (rVar != null && (bundle = notification.extras) != null) {
            rVar.a(bundle);
        }
        return notification;
    }

    public final void c(boolean z10) {
        l(16, z10);
    }

    public final void d(int i10) {
        this.f19508r = i10;
    }

    public final void e() {
        this.f19500j = null;
    }

    public final void f(PendingIntent pendingIntent) {
        this.f19497g = pendingIntent;
    }

    public final void g(String str) {
        this.f19495e = b(str);
    }

    public final void h(RemoteViews remoteViews) {
        this.f19511u = remoteViews;
    }

    public final void i(RemoteViews remoteViews) {
        this.f19510t = remoteViews;
    }

    public final void j(RemoteViews remoteViews) {
        this.f19512v = remoteViews;
    }

    public final void k(int i10) {
        Notification notification = this.f19515y;
        notification.defaults = i10;
        if ((i10 & 4) != 0) {
            notification.flags |= 1;
        }
    }

    public final void l(int i10, boolean z10) {
        Notification notification = this.f19515y;
        if (z10) {
            notification.flags = i10 | notification.flags;
            return;
        }
        notification.flags = (~i10) & notification.flags;
    }

    public final void m() {
        this.f19498h = null;
        l(128, true);
    }

    public final void n(String str) {
        this.f19505o = str;
    }

    public final void o(Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = this.f19492a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        this.f19499i = bitmap;
    }

    public final void p() {
        this.f19502l = 0;
    }

    public final void q(r rVar) {
        if (this.f19504n != rVar) {
            this.f19504n = rVar;
            if (rVar != null) {
                rVar.i(this);
            }
        }
    }

    public final void r() {
        this.f19509s = 1;
    }
}
