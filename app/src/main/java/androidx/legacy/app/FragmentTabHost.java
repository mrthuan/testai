package androidx.legacy.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import androidx.activity.r;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f3966a;

    /* renamed from: b  reason: collision with root package name */
    public TabHost.OnTabChangeListener f3967b;
    public boolean c;

    /* loaded from: classes.dex */
    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0018a();

        /* renamed from: a  reason: collision with root package name */
        public String f3968a;

        /* renamed from: androidx.legacy.app.FragmentTabHost$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0018a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f3968a = parcel.readString();
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FragmentTabHost.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" curTab=");
            return r.g(sb2, this.f3968a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f3968a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, null);
        this.f3966a = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    public final void a(String str) {
        ArrayList<b> arrayList = this.f3966a;
        if (arrayList.size() <= 0) {
            throw new IllegalStateException(a0.a.h("No tab known for tag ", str));
        }
        arrayList.get(0).getClass();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        ArrayList<b> arrayList = this.f3966a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw null;
        }
        this.c = true;
        a(currentTabTag);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = false;
    }

    @Override // android.view.View
    @Deprecated
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.f3968a);
    }

    @Override // android.view.View
    @Deprecated
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3968a = getCurrentTabTag();
        return aVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public final void onTabChanged(String str) {
        if (!this.c) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f3967b;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
                return;
            }
            return;
        }
        a(str);
        throw null;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3967b = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3966a = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }
}
