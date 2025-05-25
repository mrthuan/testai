package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: FragmentAnim.java */
/* loaded from: classes.dex */
public final class v {
    public static int a(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f3942a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f3943b;

        public a(Animation animation) {
            this.f3942a = animation;
            this.f3943b = null;
        }

        public a(Animator animator) {
            this.f3942a = null;
            this.f3943b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final ViewGroup f3944a;

        /* renamed from: b  reason: collision with root package name */
        public final View f3945b;
        public boolean c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3946d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3947e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3947e = true;
            this.f3944a = viewGroup;
            this.f3945b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f3947e = true;
            if (this.c) {
                return !this.f3946d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.c = true;
                x0.x.a(this.f3944a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.c;
            ViewGroup viewGroup = this.f3944a;
            if (!z10 && this.f3947e) {
                this.f3947e = false;
                viewGroup.post(this);
                return;
            }
            viewGroup.endViewTransition(this.f3945b);
            this.f3946d = true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f3947e = true;
            if (this.c) {
                return !this.f3946d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.c = true;
                x0.x.a(this.f3944a, this);
            }
            return true;
        }
    }
}
