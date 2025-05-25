package r7;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaa;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import lib.zj.office.fc.codec.CharEncoding;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes.dex */
public abstract class f extends zzz {

    /* renamed from: b  reason: collision with root package name */
    public final int f29470b;

    public f(byte[] bArr) {
        boolean z10;
        if (bArr.length == 25) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.b(z10);
        this.f29470b = Arrays.hashCode(bArr);
    }

    public static byte[] K(String str) {
        try {
            return str.getBytes(CharEncoding.ISO_8859_1);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] L0();

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (obj != null && (obj instanceof zzaa)) {
            try {
                zzaa zzaaVar = (zzaa) obj;
                if (zzaaVar.zzc() != this.f29470b || (zzd = zzaaVar.zzd()) == null) {
                    return false;
                }
                return Arrays.equals(L0(), (byte[]) ObjectWrapper.L0(zzd));
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29470b;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.f29470b;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final IObjectWrapper zzd() {
        return new ObjectWrapper(L0());
    }
}
