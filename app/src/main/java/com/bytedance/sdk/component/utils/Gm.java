package com.bytedance.sdk.component.utils;

import java.util.List;

/* compiled from: ListUtils.java */
/* loaded from: classes.dex */
public class Gm {
    public static boolean Qhi(List<?> list) {
        if (list != null && list.size() != 0) {
            return false;
        }
        return true;
    }

    public static boolean cJ(List<?> list) {
        if (!Qhi(list)) {
            return true;
        }
        return false;
    }
}
