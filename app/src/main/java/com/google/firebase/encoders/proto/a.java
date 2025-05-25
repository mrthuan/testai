package com.google.firebase.encoders.proto;

import com.google.firebase.encoders.proto.Protobuf;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* loaded from: classes2.dex */
public final class a implements Protobuf {

    /* renamed from: b  reason: collision with root package name */
    public final int f13572b;
    public final Protobuf.IntEncoding c;

    public a(int i10, Protobuf.IntEncoding intEncoding) {
        this.f13572b = i10;
        this.c = intEncoding;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        Protobuf protobuf = (Protobuf) obj;
        if (this.f13572b == ((a) protobuf).f13572b && this.c.equals(((a) protobuf).c)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f13572b) + (this.c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f13572b + "intEncoding=" + this.c + ')';
    }
}
