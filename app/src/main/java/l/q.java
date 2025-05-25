package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f20359b = {Context.class, AttributeSet.class};
    public static final int[] c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f20360d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f20361e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f20362f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f20363g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final y.i<String, Constructor<? extends View>> f20364h = new y.i<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f20365a = new Object[2];

    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f20366a;

        /* renamed from: b  reason: collision with root package name */
        public final String f20367b;
        public Method c;

        /* renamed from: d  reason: collision with root package name */
        public Context f20368d;

        public a(View view, String str) {
            this.f20366a = view;
            this.f20367b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id2;
            String str;
            Method method;
            if (this.c == null) {
                View view2 = this.f20366a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f20367b;
                    if (context != null) {
                        try {
                            if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                                this.c = method;
                                this.f20368d = context;
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                        if (context instanceof ContextWrapper) {
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            context = null;
                        }
                    } else {
                        if (view2.getId() == -1) {
                            str = "";
                        } else {
                            str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + OperatorName.SHOW_TEXT_LINE;
                        }
                        StringBuilder g10 = b.a.g("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                        g10.append(view2.getClass());
                        g10.append(str);
                        throw new IllegalStateException(g10.toString());
                    }
                }
            }
            try {
                this.c.invoke(this.f20368d, view);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException("Could not execute method for android:onClick", e11);
            }
        }
    }

    public AppCompatAutoCompleteTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public AppCompatCheckBox c(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton d(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String concat;
        y.i<String, Constructor<? extends View>> iVar = f20364h;
        Constructor<? extends View> orDefault = iVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    concat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                concat = str;
            }
            orDefault = Class.forName(concat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f20359b);
            iVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f20365a);
    }

    public final void g(TextView textView, String str) {
        if (textView != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
