package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* loaded from: classes.dex */
public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final f f6760b = new f() { // from class: com.apm.insight.runtime.f.1

        /* renamed from: a  reason: collision with root package name */
        Header f6762a = null;

        @Override // com.apm.insight.runtime.f
        public Object b(String str) {
            if (this.f6762a == null) {
                this.f6762a = Header.b(com.apm.insight.i.g());
            }
            return this.f6762a.f().opt(str);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private f f6761a;

    public f() {
        this(f6760b);
    }

    public Object a(String str) {
        f fVar = this.f6761a;
        if (fVar != null) {
            return fVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        f fVar = this.f6761a;
        if (fVar != null) {
            return fVar.b(str);
        }
        return null;
    }

    public f(f fVar) {
        this.f6761a = fVar;
    }
}
