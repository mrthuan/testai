package com.bytedance.adsdk.lottie.cJ;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.lottie.Tgh.ROR;
import com.bytedance.adsdk.lottie.WAv;
import com.bytedance.adsdk.lottie.fl;
import java.io.IOException;
import java.util.Map;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class cJ {
    private static final Object Qhi = new Object();
    private fl CJ;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7852ac;
    private final Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Map<String, WAv> f7853fl;

    public cJ(Drawable.Callback callback, String str, fl flVar, Map<String, WAv> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f7852ac = str.concat(PackagingURIHelper.FORWARD_SLASH_STRING);
        } else {
            this.f7852ac = str;
        }
        this.f7853fl = map;
        Qhi(flVar);
        if (!(callback instanceof View)) {
            this.cJ = null;
        } else {
            this.cJ = ((View) callback).getContext().getApplicationContext();
        }
    }

    private Bitmap cJ(String str, Bitmap bitmap) {
        synchronized (Qhi) {
            this.f7853fl.get(str).Qhi(bitmap);
        }
        return bitmap;
    }

    public void Qhi(fl flVar) {
        this.CJ = flVar;
    }

    public Bitmap Qhi(String str, Bitmap bitmap) {
        if (bitmap == null) {
            WAv wAv = this.f7853fl.get(str);
            Bitmap Tgh = wAv.Tgh();
            wAv.Qhi(null);
            return Tgh;
        }
        Bitmap Tgh2 = this.f7853fl.get(str).Tgh();
        cJ(str, bitmap);
        return Tgh2;
    }

    public Bitmap Qhi(String str) {
        WAv wAv = this.f7853fl.get(str);
        if (wAv == null) {
            return null;
        }
        Bitmap Tgh = wAv.Tgh();
        if (Tgh != null) {
            return Tgh;
        }
        fl flVar = this.CJ;
        if (flVar != null) {
            return flVar.Qhi(wAv);
        }
        Context context = this.cJ;
        if (context == null) {
            return null;
        }
        String CJ = wAv.CJ();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (CJ.startsWith("data:") && CJ.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(CJ.substring(CJ.indexOf(44) + 1), 0);
                return cJ(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f7852ac)) {
                AssetManager assets = context.getAssets();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(assets.open(this.f7852ac + CJ), null, options);
                    if (decodeStream == null) {
                        return null;
                    }
                    return cJ(str, ROR.Qhi(decodeStream, wAv.Qhi(), wAv.cJ()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean Qhi(Context context) {
        return (context == null && this.cJ == null) || this.cJ.equals(context);
    }
}
