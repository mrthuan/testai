package androidx.fragment.app;

import androidx.fragment.app.g0;
import androidx.fragment.app.p0;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends p0 implements g0.m {

    /* renamed from: p  reason: collision with root package name */
    public final g0 f3733p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3734q;

    /* renamed from: r  reason: collision with root package name */
    public int f3735r;

    public a(g0 g0Var) {
        g0Var.G();
        z<?> zVar = g0Var.f3794t;
        if (zVar != null) {
            zVar.f3962e.getClassLoader();
        }
        this.f3735r = -1;
        this.f3733p = g0Var;
    }

    @Override // androidx.fragment.app.g0.m
    public final boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (g0.J(2)) {
            toString();
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f3903g) {
            g0 g0Var = this.f3733p;
            if (g0Var.f3778d == null) {
                g0Var.f3778d = new ArrayList<>();
            }
            g0Var.f3778d.add(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.p0
    public final void c(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.N;
        if (str2 != null) {
            FragmentStrictMode.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = fragment.f3692y;
                if (str3 != null && !str.equals(str3)) {
                    StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                    sb2.append(fragment);
                    sb2.append(": was ");
                    throw new IllegalStateException(androidx.activity.f.o(sb2, fragment.f3692y, " now ", str));
                }
                fragment.f3692y = str;
            }
            if (i10 != 0) {
                if (i10 != -1) {
                    int i12 = fragment.f3690w;
                    if (i12 != 0 && i12 != i10) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3690w + " now " + i10);
                    }
                    fragment.f3690w = i10;
                    fragment.f3691x = i10;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            b(new p0.a(i11, fragment));
            fragment.f3686s = this.f3733p;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    public final void f(int i10) {
        if (!this.f3903g) {
            return;
        }
        if (g0.J(2)) {
            toString();
        }
        ArrayList<p0.a> arrayList = this.f3898a;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            p0.a aVar = arrayList.get(i11);
            Fragment fragment = aVar.f3913b;
            if (fragment != null) {
                fragment.f3685r += i10;
                if (g0.J(2)) {
                    Objects.toString(aVar.f3913b);
                    int i12 = aVar.f3913b.f3685r;
                }
            }
        }
    }

    public final int g() {
        return h(true);
    }

    public final int h(boolean z10) {
        if (!this.f3734q) {
            if (g0.J(2)) {
                toString();
                PrintWriter printWriter = new PrintWriter(new z0());
                k("  ", printWriter, true);
                printWriter.close();
            }
            this.f3734q = true;
            boolean z11 = this.f3903g;
            g0 g0Var = this.f3733p;
            if (z11) {
                this.f3735r = g0Var.f3783i.getAndIncrement();
            } else {
                this.f3735r = -1;
            }
            g0Var.w(this, z10);
            return this.f3735r;
        }
        throw new IllegalStateException("commit already called");
    }

    public final void i() {
        if (!this.f3903g) {
            this.f3733p.z(this, false);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final a j(Fragment fragment) {
        g0 g0Var = fragment.f3686s;
        if (g0Var != null && g0Var != this.f3733p) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new p0.a(6, fragment));
        return this;
    }

    public final void k(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3904h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3735r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3734q);
            if (this.f3902f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3902f));
            }
            if (this.f3899b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3899b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.f3900d != 0 || this.f3901e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3900d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3901e));
            }
            if (this.f3905i != 0 || this.f3906j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3905i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3906j);
            }
            if (this.f3907k != 0 || this.f3908l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3907k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3908l);
            }
        }
        ArrayList<p0.a> arrayList = this.f3898a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                p0.a aVar = arrayList.get(i10);
                switch (aVar.f3912a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f3912a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f3913b);
                if (z10) {
                    if (aVar.f3914d != 0 || aVar.f3915e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3914d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3915e));
                    }
                    if (aVar.f3916f != 0 || aVar.f3917g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f3916f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f3917g));
                    }
                }
            }
        }
    }

    public final a l(pdf.pdfreader.viewer.editor.free.base.a aVar) {
        g0 g0Var = aVar.f3686s;
        if (g0Var != null && g0Var != this.f3733p) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + aVar.toString() + " is already attached to a FragmentManager.");
        }
        b(new p0.a(4, aVar));
        return this;
    }

    public final a m(Fragment fragment) {
        g0 g0Var = fragment.f3686s;
        if (g0Var != null && g0Var != this.f3733p) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new p0.a(3, fragment));
        return this;
    }

    public final a n(Fragment fragment, Lifecycle.State state) {
        g0 g0Var = fragment.f3686s;
        g0 g0Var2 = this.f3733p;
        if (g0Var == g0Var2) {
            if (state == Lifecycle.State.INITIALIZED && fragment.f3669a > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
            } else if (state != Lifecycle.State.DESTROYED) {
                b(new p0.a(fragment, state));
                return this;
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + g0Var2);
    }

    public final a o(Fragment fragment) {
        g0 g0Var = fragment.f3686s;
        if (g0Var != null && g0Var != this.f3733p) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        b(new p0.a(5, fragment));
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3735r >= 0) {
            sb2.append(" #");
            sb2.append(this.f3735r);
        }
        if (this.f3904h != null) {
            sb2.append(" ");
            sb2.append(this.f3904h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
