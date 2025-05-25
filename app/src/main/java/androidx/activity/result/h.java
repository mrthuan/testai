package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IntentSenderRequest.kt */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final IntentSender f1845a;

    /* renamed from: b  reason: collision with root package name */
    public final Intent f1846b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1847d;

    /* compiled from: IntentSenderRequest.kt */
    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel inParcel) {
            kotlin.jvm.internal.g.e(inParcel, "inParcel");
            Parcelable readParcelable = inParcel.readParcelable(IntentSender.class.getClassLoader());
            kotlin.jvm.internal.g.b(readParcelable);
            return new h((IntentSender) readParcelable, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        kotlin.jvm.internal.g.e(intentSender, "intentSender");
        this.f1845a = intentSender;
        this.f1846b = intent;
        this.c = i10;
        this.f1847d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        kotlin.jvm.internal.g.e(dest, "dest");
        dest.writeParcelable(this.f1845a, i10);
        dest.writeParcelable(this.f1846b, i10);
        dest.writeInt(this.c);
        dest.writeInt(this.f1847d);
    }
}
