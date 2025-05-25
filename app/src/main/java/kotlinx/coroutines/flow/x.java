package kotlinx.coroutines.flow;

import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Share.kt */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final int f20150a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20151b;
    public final Object c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20152d;

    public x(String str) {
        this.c = str;
        this.f20152d = new ByteArrayOutputStream(4096);
        try {
            Mac mac = Mac.getInstance(str);
            this.f20151b = mac;
            this.f20150a = mac.getMacLength();
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final void a(int i10) {
        int i11;
        Object obj = this.f20152d;
        byte[] byteArray = ((ByteArrayOutputStream) obj).toByteArray();
        int length = byteArray.length - i10;
        int i12 = 0;
        while (i12 < length) {
            int i13 = i12 + 16;
            if (i13 <= length) {
                i11 = 16;
            } else {
                i11 = length - i12;
            }
            ((Mac) this.f20151b).update(byteArray, i12, i11);
            i12 = i13;
        }
        ((ByteArrayOutputStream) obj).reset();
    }

    public x(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, c cVar) {
        this.f20151b = cVar;
        this.f20150a = i10;
        this.c = bufferOverflow;
        this.f20152d = coroutineContext;
    }
}
