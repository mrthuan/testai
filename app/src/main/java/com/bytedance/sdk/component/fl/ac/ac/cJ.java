package com.bytedance.sdk.component.fl.ac.ac;

import java.io.Closeable;

/* compiled from: IOUtils.java */
/* loaded from: classes.dex */
public class cJ {
    public static void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }
}
