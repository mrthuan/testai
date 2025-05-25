package h2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.activity.r;
import java.lang.reflect.Method;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f17952d;

    /* renamed from: e  reason: collision with root package name */
    public final Parcel f17953e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17954f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17955g;

    /* renamed from: h  reason: collision with root package name */
    public final String f17956h;

    /* renamed from: i  reason: collision with root package name */
    public int f17957i;

    /* renamed from: j  reason: collision with root package name */
    public int f17958j;

    /* renamed from: k  reason: collision with root package name */
    public int f17959k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new y.b(), new y.b(), new y.b());
    }

    @Override // h2.a
    public final b a() {
        Parcel parcel = this.f17953e;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f17958j;
        if (i10 == this.f17954f) {
            i10 = this.f17955g;
        }
        return new b(parcel, dataPosition, i10, r.g(new StringBuilder(), this.f17956h, "  "), this.f17950a, this.f17951b, this.c);
    }

    @Override // h2.a
    public final boolean e() {
        if (this.f17953e.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // h2.a
    public final byte[] f() {
        Parcel parcel = this.f17953e;
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // h2.a
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f17953e);
    }

    @Override // h2.a
    public final boolean h(int i10) {
        while (this.f17958j < this.f17955g) {
            int i11 = this.f17959k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f17958j;
            Parcel parcel = this.f17953e;
            parcel.setDataPosition(i12);
            int readInt = parcel.readInt();
            this.f17959k = parcel.readInt();
            this.f17958j += readInt;
        }
        if (this.f17959k == i10) {
            return true;
        }
        return false;
    }

    @Override // h2.a
    public final int i() {
        return this.f17953e.readInt();
    }

    @Override // h2.a
    public final <T extends Parcelable> T k() {
        return (T) this.f17953e.readParcelable(b.class.getClassLoader());
    }

    @Override // h2.a
    public final String l() {
        return this.f17953e.readString();
    }

    @Override // h2.a
    public final void n(int i10) {
        w();
        this.f17957i = i10;
        this.f17952d.put(i10, this.f17953e.dataPosition());
        r(0);
        r(i10);
    }

    @Override // h2.a
    public final void o(boolean z10) {
        this.f17953e.writeInt(z10 ? 1 : 0);
    }

    @Override // h2.a
    public final void p(byte[] bArr) {
        Parcel parcel = this.f17953e;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            return;
        }
        parcel.writeInt(-1);
    }

    @Override // h2.a
    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f17953e, 0);
    }

    @Override // h2.a
    public final void r(int i10) {
        this.f17953e.writeInt(i10);
    }

    @Override // h2.a
    public final void t(Parcelable parcelable) {
        this.f17953e.writeParcelable(parcelable, 0);
    }

    @Override // h2.a
    public final void u(String str) {
        this.f17953e.writeString(str);
    }

    public final void w() {
        int i10 = this.f17957i;
        if (i10 >= 0) {
            int i11 = this.f17952d.get(i10);
            Parcel parcel = this.f17953e;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(dataPosition - i11);
            parcel.setDataPosition(dataPosition);
        }
    }

    public b(Parcel parcel, int i10, int i11, String str, y.b<String, Method> bVar, y.b<String, Method> bVar2, y.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f17952d = new SparseIntArray();
        this.f17957i = -1;
        this.f17959k = -1;
        this.f17953e = parcel;
        this.f17954f = i10;
        this.f17955g = i11;
        this.f17958j = i10;
        this.f17956h = str;
    }
}
