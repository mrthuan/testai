package i3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import e3.l;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import p3.c;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Object f18433d = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f18434a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18435b;
    public final Map<String, l> c;

    public b(Drawable.Callback callback, String str, Map map) {
        this.f18435b = str;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f18435b = str.concat(PackagingURIHelper.FORWARD_SLASH_STRING);
        }
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.f18434a = null;
            return;
        }
        this.f18434a = ((View) callback).getContext();
        this.c = map;
    }

    public final void a(Bitmap bitmap, String str) {
        synchronized (f18433d) {
            this.c.get(str).f16413d = bitmap;
        }
    }
}
