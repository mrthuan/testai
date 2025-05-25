package k0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f19479a;

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f19480b;
    public final z[] c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19481d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19482e;

    /* renamed from: f  reason: collision with root package name */
    public final int f19483f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f19484g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public final int f19485h;

    /* renamed from: i  reason: collision with root package name */
    public final CharSequence f19486i;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f19487j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f19488k;

    public m(String str, PendingIntent pendingIntent) {
        IconCompat c = IconCompat.c(null, "", R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.f19482e = true;
        this.f19480b = c;
        int i10 = c.f3531a;
        if ((i10 == -1 ? IconCompat.a.c(c.f3532b) : i10) == 2) {
            this.f19485h = c.d();
        }
        this.f19486i = p.b(str);
        this.f19487j = pendingIntent;
        this.f19479a = bundle;
        this.c = null;
        this.f19481d = true;
        this.f19483f = 0;
        this.f19482e = true;
        this.f19484g = false;
        this.f19488k = false;
    }

    public final IconCompat a() {
        int i10;
        if (this.f19480b == null && (i10 = this.f19485h) != 0) {
            this.f19480b = IconCompat.c(null, "", i10);
        }
        return this.f19480b;
    }
}
