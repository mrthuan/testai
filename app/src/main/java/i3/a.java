package i3;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import j3.h;
import java.util.HashMap;
import p3.c;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public final AssetManager f18431d;

    /* renamed from: a  reason: collision with root package name */
    public final h f18429a = new h();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f18430b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final String f18432e = ".ttf";

    public a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            c.b("LottieDrawable must be inside of a view for images to work.");
            this.f18431d = null;
            return;
        }
        this.f18431d = ((View) callback).getContext().getAssets();
    }
}
