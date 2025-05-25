package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class GlideException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public static final StackTraceElement[] f6928a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private Exception exception;
    private t3.b key;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void a(Throwable th2, ArrayList arrayList) {
        if (th2 instanceof GlideException) {
            for (Throwable th3 : ((GlideException) th2).getCauses()) {
                a(th3, arrayList);
            }
            return;
        }
        arrayList.add(th2);
    }

    public static void b(List list, a aVar) {
        try {
            c(list, aVar);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void c(List list, a aVar) {
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            aVar.append("Cause (");
            int i11 = i10 + 1;
            aVar.append(String.valueOf(i11));
            aVar.append(" of ");
            aVar.append(String.valueOf(size));
            aVar.append("): ");
            Throwable th2 = (Throwable) list.get(i10);
            if (th2 instanceof GlideException) {
                GlideException glideException = (GlideException) th2;
                glideException.getClass();
                d(glideException, aVar);
                b(glideException.getCauses(), new a(aVar));
            } else {
                d(th2, aVar);
            }
            i10 = i11;
        }
    }

    public static void d(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder(71);
        sb2.append(this.detailMessage);
        String str3 = "";
        if (this.dataClass == null) {
            str = "";
        } else {
            str = ", " + this.dataClass;
        }
        sb2.append(str);
        if (this.dataSource == null) {
            str2 = "";
        } else {
            str2 = ", " + this.dataSource;
        }
        sb2.append(str2);
        if (this.key != null) {
            str3 = ", " + this.key;
        }
        sb2.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb2.toString();
        }
        if (rootCauses.size() == 1) {
            sb2.append("\nThere was 1 cause:");
        } else {
            sb2.append("\nThere were ");
            sb2.append(rootCauses.size());
            sb2.append(" causes:");
        }
        for (Throwable th2 : rootCauses) {
            sb2.append('\n');
            sb2.append(th2.getClass().getName());
            sb2.append('(');
            sb2.append(th2.getMessage());
            sb2.append(')');
        }
        sb2.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb2.toString();
    }

    public Exception getOrigin() {
        return this.exception;
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List<Throwable> rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            rootCauses.get(i10);
            i10 = i11;
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void setLoggingDetails(t3.b bVar, DataSource dataSource) {
        setLoggingDetails(bVar, dataSource, null);
    }

    public void setOrigin(Exception exc) {
        this.exception = exc;
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        d(this, printStream);
        b(getCauses(), new a(printStream));
    }

    public void setLoggingDetails(t3.b bVar, DataSource dataSource, Class<?> cls) {
        this.key = bVar;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f6928a);
        this.causes = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        d(this, printWriter);
        b(getCauses(), new a(printWriter));
    }

    /* loaded from: classes.dex */
    public static final class a implements Appendable {

        /* renamed from: a  reason: collision with root package name */
        public final Appendable f6929a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6930b = true;

        public a(Appendable appendable) {
            this.f6929a = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) {
            boolean z10 = this.f6930b;
            Appendable appendable = this.f6929a;
            if (z10) {
                this.f6930b = false;
                appendable.append("  ");
            }
            this.f6930b = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i10, int i11) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z10 = this.f6930b;
            Appendable appendable = this.f6929a;
            boolean z11 = false;
            if (z10) {
                this.f6930b = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
                z11 = true;
            }
            this.f6930b = z11;
            appendable.append(charSequence, i10, i11);
            return this;
        }
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
