package org.commonmark.internal;

import java.util.ArrayList;
import qk.o;

/* loaded from: classes3.dex */
public final class LinkReferenceDefinitionParser {

    /* renamed from: d  reason: collision with root package name */
    public StringBuilder f23558d;

    /* renamed from: e  reason: collision with root package name */
    public String f23559e;

    /* renamed from: f  reason: collision with root package name */
    public String f23560f;

    /* renamed from: g  reason: collision with root package name */
    public char f23561g;

    /* renamed from: h  reason: collision with root package name */
    public StringBuilder f23562h;

    /* renamed from: a  reason: collision with root package name */
    public State f23556a = State.START_DEFINITION;

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f23557b = new StringBuilder();
    public final ArrayList c = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f23563i = false;

    /* loaded from: classes3.dex */
    public enum State {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23565a;

        static {
            int[] iArr = new int[State.values().length];
            f23565a = iArr;
            try {
                iArr[State.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23565a[State.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23565a[State.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23565a[State.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23565a[State.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23565a[State.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final void a() {
        String str;
        if (!this.f23563i) {
            return;
        }
        String b10 = pk.a.b(this.f23560f);
        StringBuilder sb2 = this.f23562h;
        if (sb2 != null) {
            str = pk.a.b(sb2.toString());
        } else {
            str = null;
        }
        this.c.add(new o(this.f23559e, b10, str));
        this.f23558d = null;
        this.f23563i = false;
        this.f23559e = null;
        this.f23560f = null;
        this.f23562h = null;
    }
}
