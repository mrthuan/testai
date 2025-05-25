package com.airbnb.lottie.model.content;

import e3.k;
import g3.c;
import g3.l;
import l3.b;

/* loaded from: classes.dex */
public final class MergePaths implements b {

    /* renamed from: a  reason: collision with root package name */
    public final MergePathsMode f6058a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6059b;

    /* loaded from: classes.dex */
    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode forId(int i10) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z10) {
        this.f6058a = mergePathsMode;
        this.f6059b = z10;
    }

    @Override // l3.b
    public final c a(k kVar, com.airbnb.lottie.model.layer.a aVar) {
        if (!kVar.f16378l) {
            p3.c.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new l(this);
    }

    public final String toString() {
        return "MergePaths{mode=" + this.f6058a + '}';
    }
}
