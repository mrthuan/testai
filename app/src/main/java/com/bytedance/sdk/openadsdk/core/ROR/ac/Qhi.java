package com.bytedance.sdk.openadsdk.core.ROR.ac;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.utils.zn;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;

/* compiled from: ResourceHelper.java */
/* loaded from: classes.dex */
public class Qhi {
    public static final Set<String> Qhi = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.1
        {
            add(ContentTypes.IMAGE_JPEG);
            add(ContentTypes.IMAGE_PNG);
            add("image/bmp");
            add(ContentTypes.IMAGE_GIF);
            add("image/jpg");
        }
    };
    public static Set<String> cJ = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: ResourceHelper.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0113Qhi {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: ResourceHelper.java */
    /* loaded from: classes.dex */
    public enum cJ {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point Qhi(Context context, int i10, int i11, cJ cJVar) {
        if (context == null) {
            context = HzH.Qhi();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int cJ2 = zn.cJ(context, i10);
        int cJ3 = zn.cJ(context, i11);
        if (cJ2 <= width && cJ3 <= height) {
            return point;
        }
        Point point2 = new Point();
        if (cJ.HTML_RESOURCE == cJVar) {
            point2.x = Math.min(width, cJ2);
            point2.y = Math.min(height, cJ3);
        } else {
            float f10 = cJ2;
            float f11 = f10 / width;
            float f12 = cJ3;
            float f13 = f12 / height;
            if (f11 >= f13) {
                point2.x = width;
                point2.y = (int) (f12 / f11);
            } else {
                point2.x = (int) (f10 / f13);
                point2.y = height;
            }
        }
        int i12 = point2.x;
        if (i12 >= 0 && point2.y >= 0) {
            point2.x = zn.ac(context, i12);
            point2.y = zn.ac(context, point2.y);
            return point2;
        }
        return point;
    }
}
