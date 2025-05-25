package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Rm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1104Rm {
    public static String[] A00 = {"rQIl5N7VPfKdYPJpPoAtVMyZMy99P4x9", "PltMJoJUoNKUoiKU9g8E45vZ11YXhZ8c", "Dj15PNqThKzSJ5rgUYjkzYgIYwsmp7Zv", "a9uitInFNtOBWkculkeZqlUrDZJBx3st", "kUexiMbXZkBESUK3bD4l7MKYNSBSiv", "1n8Xv0E0fXzBNE5usuBA1Nf27I3K4LP8", "4DPNNdejLcG9vMJExCrSPytZ3gIlmbXA", "2XzQKkBGevJk3AOuOkjVAKczu2O9ZI"};

    public static boolean A00(View view) {
        if (view.getBackground() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                Drawable background = view.getBackground();
                String[] strArr = A00;
                if (strArr[5].charAt(16) == strArr[3].charAt(16)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[5] = "VvWjmMzUCUeRE9wUm3LNaHxJA9d87V8N";
                strArr2[3] = "PH96s8M7TksfMzMk3oUF4ojCQwFkmMAr";
                if (background.getAlpha() <= 0) {
                }
            }
            return false;
        }
        return true;
    }
}
