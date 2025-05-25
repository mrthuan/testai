package com.bykv.vk.openvk.preload.b;

import com.bykv.vk.openvk.preload.b.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Factory.java */
/* loaded from: classes.dex */
public final class c {
    public static <IN> b<IN> a(List<h> list, e eVar, d dVar) {
        if (list != null) {
            if (eVar == null) {
                eVar = new e.a();
            }
            return new i(Collections.unmodifiableList(new ArrayList(list)), 0, eVar, dVar);
        }
        throw new IllegalArgumentException("interceptors == null !");
    }
}
