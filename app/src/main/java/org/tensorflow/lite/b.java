package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Interpreter.java */
/* loaded from: classes3.dex */
public final class b implements AutoCloseable {

    /* renamed from: a  reason: collision with root package name */
    public NativeInterpreterWrapper f23583a;

    /* compiled from: Interpreter.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f23584a = new ArrayList();
    }

    public b(ByteBuffer byteBuffer, a aVar) {
        this.f23583a = new NativeInterpreterWrapper(byteBuffer, aVar);
    }

    public final void a() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f23583a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.a();
            return;
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    public final void b(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        Object[] objArr = {floatBuffer};
        HashMap hashMap = new HashMap();
        hashMap.put(0, floatBuffer2);
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f23583a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.c(objArr, hashMap);
            return;
        }
        throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f23583a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f23583a = null;
        }
    }

    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
