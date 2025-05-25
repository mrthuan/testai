package com.facebook.ads.internal.checkerframework.checker.nullness.qual;

import com.facebook.ads.internal.checkerframework.framework.qual.DefaultFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import com.facebook.ads.internal.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import com.facebook.ads.internal.checkerframework.framework.qual.QualifierForLiterals;
import com.facebook.ads.internal.checkerframework.framework.qual.SubtypeOf;
import com.facebook.ads.internal.checkerframework.framework.qual.UpperBoundFor;
import com.facebook.ads.redexgen.X.C7M;
import com.facebook.ads.redexgen.X.EnumC06067a;
import com.facebook.ads.redexgen.X.EnumC06077b;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@SubtypeOf({MonotonicNonNull.class})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@UpperBoundFor(typeKinds = {EnumC06067a.A0H, EnumC06067a.A0B, EnumC06067a.A03, EnumC06067a.A05, EnumC06067a.A07, EnumC06067a.A0A, EnumC06067a.A0D, EnumC06067a.A0I, EnumC06067a.A04})
@Retention(RetentionPolicy.RUNTIME)
@QualifierForLiterals({C7M.A0C})
@DefaultFor({EnumC06077b.A05})
@DefaultQualifierInHierarchy
@DefaultInUncheckedCodeFor({EnumC06077b.A0E, EnumC06077b.A0C})
@Documented
/* loaded from: assets/audience_network.dex */
public @interface NonNull {
}
